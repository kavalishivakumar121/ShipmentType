package com.app.config;

import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.app.model.ShipmentType;
import com.app.model.Uom;

@Configuration
@ComponentScan("com.app")
@PropertySource("classpath:application.properties")
@EnableWebMvc
@EnableTransactionManagement
public class AppConfig {
	@Autowired
	private Environment env;
	@Bean
public InternalResourceViewResolver irv()
{
	InternalResourceViewResolver v=new InternalResourceViewResolver();
	v.setPrefix(env.getProperty("spring.prefix"));
	v.setSuffix(env.getProperty("spring.suffix"));
	return v;
}
//DataSource
	@Bean
	public BasicDataSource ds()
	{
	BasicDataSource b=new BasicDataSource();
	b.setDriverClassName(env.getProperty("spring.jdbc.dc"));
	b.setUrl(env.getProperty("spring.jdbc.url"));
	b.setUsername(env.getProperty("spring.jdbc.un"));
	b.setPassword(env.getProperty("spring.jdbc.pwd"));
		return b;
	}
	//SessionFactory
	@Bean
	public LocalSessionFactoryBean sf()
	{
		LocalSessionFactoryBean l=new LocalSessionFactoryBean();
		l.setDataSource(ds());
		l.setHibernateProperties(props());
		l.setAnnotatedClasses(ShipmentType.class,Uom.class);
		return l;
	}
	@Bean
	public Properties props()
	{
		Properties p=new Properties();
		p.put("hibernate.dialect",env.getProperty("spring.orm.dialect"));
		p.put("hibernate.show_sql",env.getProperty("spring.orm.show_sql"));
		p.put("hibernate.format_sql",env.getProperty("spring.orm.format_sql"));
		p.put("hibernate.hbm2ddl.auto",env.getProperty("spring.orm.ddlauto"));
		
		return p;
	}
	//hibernateTemplate
	//curd operations
	@Bean
	public HibernateTemplate ht()
	{
		
		HibernateTemplate h=new HibernateTemplate();
		h.setSessionFactory(sf().getObject());
		return h;
	}
	//commit and rollback operatioins
	@Bean
	public HibernateTransactionManager htm()
	{
		HibernateTransactionManager ht=new HibernateTransactionManager();
		ht.setSessionFactory(sf().getObject());
		return ht;
	}
}
