@TypeDef(name = "encryptedString", typeClass = EncryptedStringType.class, parameters = {
    @Parameter(name = "encryptorRegisteredName", value = "strongHibernateStringEncryptor")
})

package com.example.dbencryptiondemo.domain;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.TypeDef;
import org.jasypt.hibernate5.type.EncryptedStringType;
