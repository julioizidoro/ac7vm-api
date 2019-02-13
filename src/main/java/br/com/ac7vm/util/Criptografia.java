/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ac7vm.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author Wolverine
 */
public class Criptografia {
	
	private static final Logger log = LoggerFactory.getLogger(Criptografia.class);
 
    public String encript(String senha)  {
    	if (senha==null) {
    		return senha;
    	}
    	log.info("Gerando hash com o BCrypto");
    	BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    	return bCryptPasswordEncoder.encode(senha);
    }
}
