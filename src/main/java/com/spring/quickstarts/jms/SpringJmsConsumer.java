package com.spring.quickstarts.jms;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class SpringJmsConsumer {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Autowired
	private Destination destination;
	
	public void readMessage() throws JmsException, JMSException {
		System.out.println(((TextMessage)jmsTemplate.receive(destination)).getText());
	}
}
