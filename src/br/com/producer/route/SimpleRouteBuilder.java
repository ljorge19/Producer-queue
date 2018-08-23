package br.com.producer.route;

import org.apache.camel.builder.RouteBuilder;



public class SimpleRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:C:/inputFolder").to("jms:queue:ljorge");
		
	}
	
	

}
