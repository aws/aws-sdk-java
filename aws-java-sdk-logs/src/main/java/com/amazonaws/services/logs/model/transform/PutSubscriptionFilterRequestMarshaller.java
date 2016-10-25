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
package com.amazonaws.services.logs.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.logs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * PutSubscriptionFilterRequest Marshaller
 */
public class PutSubscriptionFilterRequestMarshaller implements Marshaller<Request<PutSubscriptionFilterRequest>, PutSubscriptionFilterRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public PutSubscriptionFilterRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<PutSubscriptionFilterRequest> marshall(PutSubscriptionFilterRequest putSubscriptionFilterRequest) {

        if (putSubscriptionFilterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutSubscriptionFilterRequest> request = new DefaultRequest<PutSubscriptionFilterRequest>(putSubscriptionFilterRequest, "AWSLogs");
        request.addHeader("X-Amz-Target", "Logs_20140328.PutSubscriptionFilter");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (putSubscriptionFilterRequest.getLogGroupName() != null) {
                jsonGenerator.writeFieldName("logGroupName").writeValue(putSubscriptionFilterRequest.getLogGroupName());
            }
            if (putSubscriptionFilterRequest.getFilterName() != null) {
                jsonGenerator.writeFieldName("filterName").writeValue(putSubscriptionFilterRequest.getFilterName());
            }
            if (putSubscriptionFilterRequest.getFilterPattern() != null) {
                jsonGenerator.writeFieldName("filterPattern").writeValue(putSubscriptionFilterRequest.getFilterPattern());
            }
            if (putSubscriptionFilterRequest.getDestinationArn() != null) {
                jsonGenerator.writeFieldName("destinationArn").writeValue(putSubscriptionFilterRequest.getDestinationArn());
            }
            if (putSubscriptionFilterRequest.getRoleArn() != null) {
                jsonGenerator.writeFieldName("roleArn").writeValue(putSubscriptionFilterRequest.getRoleArn());
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
