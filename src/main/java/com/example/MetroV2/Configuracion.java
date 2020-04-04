package com.example.MetroV2;

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
	public XsdSchema metrov2Schema() {
		return new SimpleXsdSchema(new ClassPathResource("MetroV2.xsd"));
	}

	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<MessageDispatcherServlet>(servlet, "/*");

	}

	@Bean(name = "MetroV2")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema metrov2Schema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("metrov2Port");
		wsdl11Definition.setLocationUri("/ws/MetroV2");
		wsdl11Definition.setTargetNamespace("http://www.example.org/MetroV2");
		wsdl11Definition.setSchema(metrov2Schema);
		return wsdl11Definition;
	}

}