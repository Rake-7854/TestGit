package com.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entity.Demo;

public interface DemoUserRepo extends JpaRepository<Demo, Integer>  {

}
