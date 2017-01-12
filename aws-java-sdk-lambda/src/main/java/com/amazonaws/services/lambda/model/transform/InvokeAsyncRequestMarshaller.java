/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.lambda.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * InvokeAsyncRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvokeAsyncRequestMarshaller implements Marshaller<Request<InvokeAsyncRequest>, InvokeAsyncRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public InvokeAsyncRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<InvokeAsyncRequest> marshall(InvokeAsyncRequest invokeAsyncRequest) {

        if (invokeAsyncRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<InvokeAsyncRequest> request = new DefaultRequest<InvokeAsyncRequest>(invokeAsyncRequest, "AWSLambda");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2014-11-13/functions/{FunctionName}/invoke-async/";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "FunctionName", invokeAsyncRequest.getFunctionName());
        request.setResourcePath(uriResourcePath);

        request.setContent(invokeAsyncRequest.getInvokeArgs());
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
