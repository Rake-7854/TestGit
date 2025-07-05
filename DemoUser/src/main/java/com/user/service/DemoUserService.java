package com.user.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.user.entity.Demo;
import com.user.repo.DemoUserRepo;

@FunctionalInterface
interface DemoFuncForSort{
	Demo getSortDemo();
}

class UsingComparatorSortName implements Comparator<Demo>{
	
	@Override
	public int compare(Demo o1, Demo o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

public abstract class DemoUserService implements DemoFuncForSort {
	@Autowired
	private DemoUserRepo repo;
	
	public abstract Demo saveDemo(Demo demo);
	public abstract Demo getSingleDemo(Integer id);
	public abstract List<Demo> getAllDemoUsingComparable();
	public abstract List<Demo> getByComparator();
	
	public List<Demo> getAllDemo(){
		return repo.findAll();
	}
	
	@Override
	public Demo getSortDemo() {
		DemoFuncForSort d = ()->{
			List<Demo> all  = repo.findAll();
			return all.stream().sorted(Comparator.comparing(Demo::getName).reversed()).skip(1).findFirst().get();
		};
		
		return d.getSortDemo();
	}
	
}
