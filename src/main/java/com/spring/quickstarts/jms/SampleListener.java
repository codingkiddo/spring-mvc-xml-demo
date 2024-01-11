package com.spring.quickstarts.jms;

import javax.annotation.Resource;
import javax.ejb.MessageDriven;
import javax.ejb.MessageDrivenContext;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

//@Component
//@MessageDriven(mappedName="jms/spittle.alert.queue")
public class SampleListener implements MessageListener {
//	@Resource
	private MessageDrivenContext mdc;
	
//	@JmsListener(destination = "spittle.alert.queue")
	public void onMessage(Message message) {
		if (message instanceof TextMessage) {
			try {
				String msg = ((TextMessage) message).getText();
				System.out.println("Received message: " + msg);
				if (msg == null) {
					throw new IllegalArgumentException("Null value received...");
				}
			} catch (JMSException ex) {
				throw new RuntimeException(ex);
			}
		}
	}

}
