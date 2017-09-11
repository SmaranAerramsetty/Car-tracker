package com.smaranAerramsetty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
public class JPAConfig {

    @Bean
    public LocalContainerEntityManagerFactoryBean emf(){
        LocalContainerEntityManagerFactoryBean emfb = new LocalContainerEntityManagerFactoryBean();

        emfb.setDataSource(getDataSource());
        emfb.setPackagesToScan("com.smaranAerramsetty.entity");
        emfb.setJpaVendorAdapter(new HibernateJpaVendorAdapter());

        Properties property = new Properties();
        property.put("hibernate.hbm2ddl.auto","validate");
        property.put("hibernate.show_sql","true");
        //property.put("hibernate.format_sql","true");
        property.put("hibernate.dialect", "org.hibernate.dialect.MySQL57Dialect");
        emfb.setJpaProperties(property);

        return emfb;
    }

    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();

        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/car_tracker?autoReconnect=true&useSSL=false");
        ds.setUsername("root");
        ds.setPassword("smaran");

        return ds;
    }

    @Bean
    public PlatformTransactionManager platformTransactionManager(EntityManagerFactory emf) {
        JpaTransactionManager jpaTransactionManager = new JpaTransactionManager(emf);
        return jpaTransactionManager;
    }
}
