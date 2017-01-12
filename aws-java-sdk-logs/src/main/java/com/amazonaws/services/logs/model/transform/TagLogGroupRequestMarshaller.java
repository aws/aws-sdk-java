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
package com.amazonaws.services.logs.model.transform;

import java.io.ByteArrayInputStream;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.logs.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * TagLogGroupRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagLogGroupRequestMarshaller implements Marshaller<Request<TagLogGroupRequest>, TagLogGroupRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public TagLogGroupRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<TagLogGroupRequest> marshall(TagLogGroupRequest tagLogGroupRequest) {

        if (tagLogGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<TagLogGroupRequest> request = new DefaultRequest<TagLogGroupRequest>(tagLogGroupRequest, "AWSLogs");
        request.addHeader("X-Amz-Target", "Logs_20140328.TagLogGroup");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (tagLogGroupRequest.getLogGroupName() != null) {
                jsonGenerator.writeFieldName("logGroupName").writeValue(tagLogGroupRequest.getLogGroupName());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> tagsMap = (com.amazonaws.internal.SdkInternalMap<String, String>) tagLogGroupRequest
                    .getTags();
            if (!tagsMap.isEmpty() || !tagsMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("tags");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> tagsMapValue : tagsMap.entrySet()) {
                    if (tagsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(tagsMapValue.getKey());

                        jsonGenerator.writeValue(tagsMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
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
