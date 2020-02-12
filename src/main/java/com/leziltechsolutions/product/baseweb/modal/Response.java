package com.leziltechsolutions.product.baseweb.modal;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
	
	@JsonProperty("Message")
	private String message;
	
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	
	@JsonProperty("Results")
	private List<VinDetails> vinDetailsList;


	public List<VinDetails> getVinDetailsList() {
		return vinDetailsList;
	}

	public void setVinDetailsList(List<VinDetails> vinDetailsList) {
		this.vinDetailsList = vinDetailsList;
	}
	
	

	/*
	@JsonProperty("Results")
	private Results results;
	
	 
	public Results getResults() {
		return results;
	}

	public void setResults(Results results) {
		this.results = results;
	}

	/*

	@Override
	public String toString() {
		return "RestResponse [Message=" + Message + ", Results=" + Results + "]";
	}

	
	
	*/
	
}
