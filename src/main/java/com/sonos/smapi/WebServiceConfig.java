package com.sonos.smapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import org.w3c.dom.Document;

import javax.xml.transform.dom.DOMSource;
import java.io.IOException;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/ws/*");
    }

    @Bean(name = "sonosSmapi")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema sonosSmapiSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("SonosSmapiPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://www.sonos.com/Services/1.1");
        wsdl11Definition.setSchema(sonosSmapiSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema sonosSmapiSchema() {
        XsdSchema schema = new SimpleXsdSchema(new ClassPathResource("SonosSchema.xsd"));
        System.err.println("Schema: " + schema.getSource().getSystemId());
        return new SimpleXsdSchema(new ClassPathResource("SonosSchema.xsd"));
    }
}