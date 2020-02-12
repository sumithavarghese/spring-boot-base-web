package com.leziltechsolutions.product.baseweb.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.leziltechsolutions.product.baseweb.modal.Response;


@RestController
public class MainController {
	
	private static final Logger log = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/vin/{id}")
    public Response read(@PathVariable String id) {
		//https://javarevisited.blogspot.com/2017/02/how-to-consume-json-from-restful-web-services-Spring-RESTTemplate-Example.html
		String url = "https://vpic.nhtsa.dot.gov/api/vehicles/DecodeVinExtended/" + id + "?format=json";
		Response response = restTemplate.getForObject(url,Response.class);
		log.info(response.toString());
		return response;
		
    }
	

}
