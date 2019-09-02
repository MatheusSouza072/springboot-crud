package com.matheus.springbootcrud.services;

import org.springframework.mail.SimpleMailMessage;

import com.matheus.springbootcrud.domain.Cliente;
import com.matheus.springbootcrud.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
