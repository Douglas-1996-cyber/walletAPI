package com.demo.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.demo.dto.UserDTO;
import com.demo.entity.User;
import com.demo.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class UserControllerTest {
	private static final String EMAIL ="DOUG@SEFAZ";
	private static final String NAME = "Douglas";		
	private static final String PASSWORD = "1234";
	private static final String URL = "/user";
	
	@MockBean
	UserService service;
	
	@Autowired
	MockMvc mvc;
	
	@Test
	public void testSave() throws Exception {
		BDDMockito.given(service.save(Mockito.any(User.class))).willReturn(getMockeUser());
		
		mvc.perform(MockMvcRequestBuilders.post(URL).content(getJsonPayload())
				.contentType(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().isCreated());
		
	}
	
	public User getMockeUser() {
		User u = new User();
		u.setEmail(EMAIL);
		u.setName(NAME);
		u.setPassword(PASSWORD);
	    
		return u;
	}
	
	public String getJsonPayload() throws JsonProcessingException {
		UserDTO dto = new UserDTO();
		dto.setEmail(EMAIL);
		dto.setName(NAME);
		dto.setPassword(PASSWORD);
		
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(dto);
	}

}
