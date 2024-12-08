package org.example.springpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class FluxTestController {

	@GetMapping("/getFlux")
	public Flux<Integer> getFlux(){
		
		return Flux.just(1,2,3)
				.log();
	}
	
	@GetMapping("/getStringFlux")
	public Flux<String> getStringFlux(){
		
		return Flux.just("Dallas","Houston","Austin")
				.log();
	}
	
	@GetMapping("/getMono")
	public Mono<String> getMono(){
		
		return Mono.just("Hello World!");
	}
	
//	@GetMapping("/stream", MediaType.)
}
