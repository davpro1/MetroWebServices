package com.example.ProyectoMetro;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.XsdSchema;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.core.io.ClassPathResource;

@EnableWs
@Configuration
@ComponentScan
public class Configuracion extends WsConfigurerAdapter {

	@Bean
	public XsdSchema proyectometroSchema() {
		return new SimpleXsdSchema(new ClassPathResource("ProyectoMetro.xsd"));
	}

	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<MessageDispatcherServlet>(servlet, "/*");

	}

	@Bean(name = "ProyectoMetro")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema proyectometro) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("proyectometroPort");
		wsdl11Definition.setLocationUri("/ws/ProyectoMetro");
		wsdl11Definition.setTargetNamespace("http://www.example.org/ProyectoMetro");
		wsdl11Definition.setSchema(proyectometro);
		return wsdl11Definition;
	}

}