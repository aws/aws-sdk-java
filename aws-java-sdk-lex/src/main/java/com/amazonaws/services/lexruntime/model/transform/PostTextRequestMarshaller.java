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
package com.amazonaws.services.lexruntime.model.transform;

import java.io.ByteArrayInputStream;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.lexruntime.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * PostTextRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostTextRequestMarshaller implements Marshaller<Request<PostTextRequest>, PostTextRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public PostTextRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<PostTextRequest> marshall(PostTextRequest postTextRequest) {

        if (postTextRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PostTextRequest> request = new DefaultRequest<PostTextRequest>(postTextRequest, "AmazonLexRuntime");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/bot/{botName}/alias/{botAlias}/user/{userId}/text";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "botName", postTextRequest.getBotName());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "botAlias", postTextRequest.getBotAlias());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "userId", postTextRequest.getUserId());
        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            java.util.Map<String, String> sessionAttributesMap = postTextRequest.getSessionAttributes();
            if (sessionAttributesMap != null) {
                jsonGenerator.writeFieldName("sessionAttributes");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> sessionAttributesMapValue : sessionAttributesMap.entrySet()) {
                    if (sessionAttributesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(sessionAttributesMapValue.getKey());

                        jsonGenerator.writeValue(sessionAttributesMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (postTextRequest.getInputText() != null) {
                jsonGenerator.writeFieldName("inputText").writeValue(postTextRequest.getInputText());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", protocolFactory.getContentType());
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
