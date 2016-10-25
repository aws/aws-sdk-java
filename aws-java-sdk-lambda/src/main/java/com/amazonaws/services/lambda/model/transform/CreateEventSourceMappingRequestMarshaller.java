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
package com.amazonaws.services.lambda.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * CreateEventSourceMappingRequest Marshaller
 */
public class CreateEventSourceMappingRequestMarshaller implements Marshaller<Request<CreateEventSourceMappingRequest>, CreateEventSourceMappingRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateEventSourceMappingRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateEventSourceMappingRequest> marshall(CreateEventSourceMappingRequest createEventSourceMappingRequest) {

        if (createEventSourceMappingRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateEventSourceMappingRequest> request = new DefaultRequest<CreateEventSourceMappingRequest>(createEventSourceMappingRequest, "AWSLambda");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2015-03-31/event-source-mappings/";

        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (createEventSourceMappingRequest.getEventSourceArn() != null) {
                jsonGenerator.writeFieldName("EventSourceArn").writeValue(createEventSourceMappingRequest.getEventSourceArn());
            }
            if (createEventSourceMappingRequest.getFunctionName() != null) {
                jsonGenerator.writeFieldName("FunctionName").writeValue(createEventSourceMappingRequest.getFunctionName());
            }
            if (createEventSourceMappingRequest.getEnabled() != null) {
                jsonGenerator.writeFieldName("Enabled").writeValue(createEventSourceMappingRequest.getEnabled());
            }
            if (createEventSourceMappingRequest.getBatchSize() != null) {
                jsonGenerator.writeFieldName("BatchSize").writeValue(createEventSourceMappingRequest.getBatchSize());
            }
            if (createEventSourceMappingRequest.getStartingPosition() != null) {
                jsonGenerator.writeFieldName("StartingPosition").writeValue(createEventSourceMappingRequest.getStartingPosition());
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
