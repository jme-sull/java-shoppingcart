package com.lambdaschool.shoppingcart.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;


@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter
{

    //OAUTHCLIENTID=lambda-client
    //OAUTHCLIENTSECRET=lambda-secret


    static final String CLIENT_ID = System.getenv("OAUTHCLIENTID" );
    static final String CLIENT_SECRET = System.getenv("OAUTHCLIENTSECRET");
    static final String GRANT_TYPE_PASSWORD = "password";
    static final String AUTHORIZATION_CODE = "authorization_code";

    



}
