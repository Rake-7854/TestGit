package com.user;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.user.controller.DemoUserController;
import com.user.entity.Demo;

@SpringBootTest
class DemoUserApplicationTests {

	@Autowired
	private DemoUserController controller;
	
	@Test
	@Disabled
	public void testSaveDemo() {
		Demo demo = new Demo();demo.setName("Puja");
		Demo save = controller.save(demo);
		assertThat(save).isEqualTo(5);
	}

	@Test
	@Disabled
	public void getSingleDemo() {
		Demo demo = controller.getSingleDemo(5);
//		assertThat(demo.getId()).isEqualTo(5);
//		assertThat(demo.getName()).isEqualTo("Puja");
		//assertEquals(5, demo.getId());
		assertNotNull(demo);
	}
	
	@Test
	public void getAllDemo() {
		List<Demo> demo = controller.getDemoAll();

//		Demo d1 = new Demo();d1.setId(244); d1.setName("Puja");
//		Demo d2 = new Demo();d1.setName("Rakesh"); d2.setName("Puja");
//
//		ArrayList<Demo> al = new ArrayList<Demo>();
//		al.add(d1);
//		al.add(d2);
		
		assertThat(demo).isNull();
	}
}
