package com.cgc.horizon0.account.errorhandle;

import java.time.LocalDateTime;
import java.util.HashMap;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import io.quarkus.runtime.util.ExceptionUtil;

@Provider
public class AccountExceptionHandler implements ExceptionMapper<RuntimeException> {

    @Override
    public Response toResponse(RuntimeException exception) {
        return Response.status(Status.OK).entity(
            new HashMap<String, String>() {{
                put("code", "500");
                put("msg", exception.getMessage());
                put("timestamp", LocalDateTime.now().toString());
                put("debugMessage", ExceptionUtil.generateStackTrace(exception));
        }}).build();
            
    }
    
}
