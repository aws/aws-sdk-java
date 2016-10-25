/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gamelift.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CreateAliasRequest Marshaller
 */
public class CreateAliasRequestMarshaller implements Marshaller<Request<CreateAliasRequest>, CreateAliasRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateAliasRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateAliasRequest> marshall(CreateAliasRequest createAliasRequest) {

        if (createAliasRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateAliasRequest> request = new DefaultRequest<CreateAliasRequest>(createAliasRequest, "AmazonGameLift");
        request.addHeader("X-Amz-Target", "GameLift.CreateAlias");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createAliasRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(createAliasRequest.getName());
            }
            if (createAliasRequest.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(createAliasRequest.getDescription());
            }
            if (createAliasRequest.getRoutingStrategy() != null) {
                jsonGenerator.writeFieldName("RoutingStrategy");
                RoutingStrategyJsonMarshaller.getInstance().marshall(createAliasRequest.getRoutingStrategy(), jsonGenerator);
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
