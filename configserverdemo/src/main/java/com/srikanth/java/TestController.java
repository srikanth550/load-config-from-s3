package com.srikanth.java;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Value("${dynamo.series.table}")
	private String seriesTableName;

	@GetMapping("/greeting")
	public String greeting() {
		return seriesTableName;
	}
}
