package com.springrest.springrest.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Loads;
import com.springrest.springrest.services.LoadService;



@RestController 
public class MyController {
	
	@Autowired
private LoadService loadService;  
	
	
	@GetMapping("/home")
	public String home()
	{
		return "hello there world";
	}
	
	//get the loads
	@GetMapping("/load")
	public List<Loads> getLoads()
	{
		return this.loadService.getLoads();
		
	}
	@GetMapping("/load/{loadId}")
	public Optional<Loads> getLoad(@PathVariable int loadId)
	{
		return this.loadService.getLoad(loadId);
	}
	
	@PostMapping("/load")
	public ResponseEntity<String> addLoads(@RequestBody Loads load)
	{
		 this.loadService.addLoad(load);
		 return ResponseEntity.ok("Load details added successfully");
	}
	
	@PutMapping("/load/{loadId}")
	public Loads updateLoad(@PathVariable int loadId,@RequestBody Loads load)
	{
		return this.loadService.updateLoad(loadId, load);
	}
	
	@DeleteMapping("/load/{loadId}")
	public List<Loads>deleteLoads(@PathVariable int loadId)
	{
		return this.loadService.deleteLoad(loadId);
	}
}
