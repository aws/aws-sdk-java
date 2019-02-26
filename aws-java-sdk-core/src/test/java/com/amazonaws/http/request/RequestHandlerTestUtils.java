/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
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
