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
 * FilterLogEventsRequest Marshaller
 */
public class FilterLogEventsRequestMarshaller implements Marshaller<Request<FilterLogEventsRequest>, FilterLogEventsRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public FilterLogEventsRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<FilterLogEventsRequest> marshall(FilterLogEventsRequest filterLogEventsRequest) {

        if (filterLogEventsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<FilterLogEventsRequest> request = new DefaultRequest<FilterLogEventsRequest>(filterLogEventsRequest, "AWSLogs");
        request.addHeader("X-Amz-Target", "Logs_20140328.FilterLogEvents");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (filterLogEventsRequest.getLogGroupName() != null) {
                jsonGenerator.writeFieldName("logGroupName").writeValue(filterLogEventsRequest.getLogGroupName());
            }

            com.amazonaws.internal.SdkInternalList<String> logStreamNamesList = (com.amazonaws.internal.SdkInternalList<String>) filterLogEventsRequest
                    .getLogStreamNames();
            if (!logStreamNamesList.isEmpty() || !logStreamNamesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("logStreamNames");
                jsonGenerator.writeStartArray();
                for (String logStreamNamesListValue : logStreamNamesList) {
                    if (logStreamNamesListValue != null) {
                        jsonGenerator.writeValue(logStreamNamesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (filterLogEventsRequest.getStartTime() != null) {
                jsonGenerator.writeFieldName("startTime").writeValue(filterLogEventsRequest.getStartTime());
            }
            if (filterLogEventsRequest.getEndTime() != null) {
                jsonGenerator.writeFieldName("endTime").writeValue(filterLogEventsRequest.getEndTime());
            }
            if (filterLogEventsRequest.getFilterPattern() != null) {
                jsonGenerator.writeFieldName("filterPattern").writeValue(filterLogEventsRequest.getFilterPattern());
            }
            if (filterLogEventsRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("nextToken").writeValue(filterLogEventsRequest.getNextToken());
            }
            if (filterLogEventsRequest.getLimit() != null) {
                jsonGenerator.writeFieldName("limit").writeValue(filterLogEventsRequest.getLimit());
            }
            if (filterLogEventsRequest.getInterleaved() != null) {
                jsonGenerator.writeFieldName("interleaved").writeValue(filterLogEventsRequest.getInterleaved());
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
