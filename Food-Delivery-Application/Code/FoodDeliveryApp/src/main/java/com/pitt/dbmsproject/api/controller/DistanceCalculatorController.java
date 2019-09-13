package com.pitt.dbmsproject.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.pitt.dbmsproject.api.model.DistanceVO;

@Controller
@RequestMapping("/")
public class DistanceCalculatorController implements DistanceCalculatorControllerInterface{
	
	@Bean
    public RestTemplate rest() {
		return new RestTemplate();
    }
	
	@Autowired
	RestTemplate restTemplate;
	
	//@Value("${operations.restURL}")
	private static String serviceURL;
	
	private static final String apiKey = "1nmmdzgwyVbPlIDoklrzJjcOMUGMHgLVpKGSVXfflWUkDHdI7ehd3nkNYzr2KpwU";
	
	@RequestMapping("/getDistance")
	public DistanceVO getDistanceBetweenTwoZipCodes(int zipCode1, int zipCode2) {
		serviceURL = "https://www.zipcodeapi.com/rest/"+apiKey+"/distance.json/"
					 	+zipCode1+"/"+zipCode2+"/mile";
		return restTemplate.getForObject(serviceURL, DistanceVO.class);
	}
}
