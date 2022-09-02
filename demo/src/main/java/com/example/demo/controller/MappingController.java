package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Mapping;
import com.example.demo.repository.MappingRepo;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class MappingController {
	
	@Autowired
	private MappingRepo mpRepo;
	
	
	
	 @GetMapping("/all")
	 public List<Mapping>  getAllmapping() {
		 return mpRepo.findAll();
	 }
	 
	 @PostMapping("/mapping")
	  public Long createTutorial(@RequestBody Mapping mapping)  {
	  
	     mpRepo.save(mapping);
	     System.out.println("mapping"+mapping);
	    	return mapping.getId();
	   
	  }
	 
	 @GetMapping(value="/getmapping/{id}", produces=MediaType.APPLICATION_XML_VALUE)
     public ResponseEntity<?> getPersonDetails(@PathVariable Long id, final HttpServletRequest request)throws Exception {
         Optional<Mapping> personResponse=mpRepo.findById(id);
         return ResponseEntity.ok(personResponse);
     }


}
