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
package com.amazonaws.services.waf.model.waf.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.waf.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * CreateSqlInjectionMatchSetRequest Marshaller
 */
public class CreateSqlInjectionMatchSetRequestMarshaller implements Marshaller<Request<CreateSqlInjectionMatchSetRequest>, CreateSqlInjectionMatchSetRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public CreateSqlInjectionMatchSetRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateSqlInjectionMatchSetRequest> marshall(CreateSqlInjectionMatchSetRequest createSqlInjectionMatchSetRequest) {

        if (createSqlInjectionMatchSetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateSqlInjectionMatchSetRequest> request = new DefaultRequest<CreateSqlInjectionMatchSetRequest>(createSqlInjectionMatchSetRequest, "AWSWAF");
        request.addHeader("X-Amz-Target", "AWSWAF_20150824.CreateSqlInjectionMatchSet");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createSqlInjectionMatchSetRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(createSqlInjectionMatchSetRequest.getName());
            }
            if (createSqlInjectionMatchSetRequest.getChangeToken() != null) {
                jsonGenerator.writeFieldName("ChangeToken").writeValue(createSqlInjectionMatchSetRequest.getChangeToken());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
