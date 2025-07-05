package com.user.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.Demo;
import com.user.repo.DemoUserRepo;

@Service
public class DemoUserServiceImpl extends DemoUserService{

	private UsingComparatorSortName comparatorSortName = new UsingComparatorSortName();
	
	@Autowired
	private DemoUserRepo repo;

	@Override
	public Demo saveDemo(Demo demo) {
		return repo.save(demo);
	}

	@Override
	public Demo getSingleDemo(Integer id) {
		Optional<Demo> byId = repo.findById(id);
		if(byId.isPresent()) {
			return byId.get();
		}
		return null;
	}
	
	@Override
	public List<Demo> getAllDemoUsingComparable() {
		List<Demo> all = repo.findAll() ;
		Collections.sort(all);
		return all;
	}
	
	public List<Demo> getByComparator() {
	    List<Demo> all = repo.findAll();
	    Collections.sort(all, comparatorSortName);
	    return all;
	}
}
