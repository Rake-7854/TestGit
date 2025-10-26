package com.user.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.Demo;
import com.user.service.DemoUserService;

@RestController
@RequestMapping(path = "api/v1/demo/")
public class DemoUserController {

	@Autowired
	private DemoUserService service;
	
	private org.slf4j.Logger log = LoggerFactory.getLogger(DemoUserController.class);
	
	@PostMapping(path="save")
	public Demo save(@RequestBody Demo demo) {
        log.info("INFO: Running INFO service...");
        log.error("INFO: Running ERROR service...");
        log.warn("INFO: Running WARN service...");
        log.debug("INFO: Running DEBUG service...");
        log.trace("INFO: Running TRACE service...");
        log.warn("INFO: Running WARN service...");
        log.warn("WARN: Running WARN service...");

        return service.saveDemo(demo);
	}
	
	@GetMapping(value = "getSingleId/{id}")
	public Demo getSingleDemo(@PathVariable Integer id) {
		return service.getSingleDemo(id);
	}
	
	@GetMapping("getAll")
	public List<Demo> getDemoAll(){
		return service.getAllDemo();
	}
	
	@GetMapping("sortDemo")
	public Demo getDemoSort(){
		return service.getSortDemo();
	}
	
	@GetMapping("usingComparable")
	public List<Demo> getAllComparableDemo(){
		return service.getAllDemoUsingComparable();
	}
	
	@GetMapping("/usingComparator")
	public List<Demo> getByComparator(){
		return service.getByComparator();
	}
}
