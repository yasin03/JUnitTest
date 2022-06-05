package com.app.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.app.repository.MessageRepository;

@ExtendWith(MockitoExtension.class)
class MessageServiceTest2 {

	@Mock
	MessageRepository repository;
	
	@InjectMocks
	MessageService service;
	
	@Test
	void testGetMessageWithLengthLessThanFive() {
		
		try {
			when(repository.getMessage()).thenReturn(Arrays.asList("Junit","Mockito","Mock","Test","Message"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		List<String> actualList = service.getMessageWithLengthLessThanFive();
		
		assertNotNull(actualList);
		
		assertEquals(2, actualList.size());
		
	}
	
	
	@Test
	void testExeption() {
		try {
			when(repository.getMessage()).thenThrow(new SQLException("Connection Exeption"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<String> messages = service.getMessage();
		
		assertNotNull(messages);
		
		assertEquals(1, messages.size());
	
	}

}






