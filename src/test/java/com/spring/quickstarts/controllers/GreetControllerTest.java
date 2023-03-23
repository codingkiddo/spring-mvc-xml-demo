//package com.spring.quickstarts.controllers;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.ResultMatcher;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
//@ContextConfiguration(locations = {"classpath:spring-mvc-context-test.xml"})
//public class GreetControllerTest {
//
//	@Autowired
//	private WebApplicationContext context;
//	
//	
//	private MockMvc mockMvc;
//	
//	
//	@Before
//	public void setUp() {
//		DefaultMockMvcBuilder builder = MockMvcBuilders.webAppContextSetup(this.context);
//		this.mockMvc = builder.build();
//	}
//	
//	@Test
//	public void test_greet_controller_test() throws Exception {
//		
//		ResultMatcher greetView = MockMvcResultMatchers.view().name("greet");
//		
//		this.mockMvc.perform(get("/greet/")).andExpect(status().isOk()).andExpect(greetView);
//		
//	}
//}
