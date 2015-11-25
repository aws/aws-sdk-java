package com.amazonaws.http.request;

import java.util.List;
import java.util.ArrayList;

import com.amazonaws.handlers.RequestHandler2;

public class RequestHandlerTestUtils {

    public static List<RequestHandler2> buildRequestHandlerList(RequestHandler2... requestHandlers) {
       List<RequestHandler2> requestHandlerList = new ArrayList<RequestHandler2>(); 
       for(RequestHandler2 requestHandler : requestHandlers) {
           requestHandlerList.add(requestHandler);
       }
       return requestHandlerList;
    }
}
