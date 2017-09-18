/*
 * File name:          MyAuthenticator.java
 * Copyright@Handkoo (China)
 * Editor:           JDK1.6.32
 */
package com.vem.tools;

/**
 * TODO: File comments
 * <p>
 * <p>
 * Author:               程自豪
 * <p>
 * <p>
 * Director:            程自豪
 * <p>
 * <p>
 */
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MyAuthenticator extends Authenticator {
    private String user;
    private String pwd;

    public MyAuthenticator(String user, String pwd) {
        this.user = user;
        this.pwd = pwd;
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(user, pwd);
    }
}