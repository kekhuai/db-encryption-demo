package com.example.dbencryptiondemo.configuration;

import org.jasypt.encryption.pbe.PBEStringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.hibernate5.encryptor.HibernatePBEStringEncryptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EncryptionConfiguration {

  @Bean
  public PBEStringEncryptor strongEncryptor() {
    PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
    encryptor.setAlgorithm("PBEWithMD5AndTripleDES");
    encryptor.setPassword("jasypt");
    encryptor.setPoolSize(4);
    return encryptor;
  }

  @Bean
  public HibernatePBEStringEncryptor hibernateStringEncryptor() {
    HibernatePBEStringEncryptor encryptor = new HibernatePBEStringEncryptor();
    encryptor.setRegisteredName("strongHibernateStringEncryptor");
    encryptor.setEncryptor(strongEncryptor());
    return encryptor;
  }

}
