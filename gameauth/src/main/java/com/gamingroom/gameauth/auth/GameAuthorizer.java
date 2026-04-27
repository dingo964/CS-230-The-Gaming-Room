package com.gamingroom.gameauth.auth;

import io.dropwizard.auth.Authorizer;
import jakarta.ws.rs.container.ContainerRequestContext;

public class GameAuthorizer implements Authorizer<GameUser> 
{
    @Override
    public boolean authorize(GameUser user, String role, ContainerRequestContext containerRequestContext) {
    	
        // FIXME: Finish the authorize method based on BasicAuth Security Example
    	return user.getRoles() != null && user.getRoles().contains(role);
    }
}