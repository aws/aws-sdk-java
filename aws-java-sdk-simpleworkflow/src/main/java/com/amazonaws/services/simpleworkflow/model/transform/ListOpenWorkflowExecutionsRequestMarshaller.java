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
package com.amazonaws.services.simpleworkflow.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ListOpenWorkflowExecutionsRequest Marshaller
 */
public class ListOpenWorkflowExecutionsRequestMarshaller implements Marshaller<Request<ListOpenWorkflowExecutionsRequest>, ListOpenWorkflowExecutionsRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public ListOpenWorkflowExecutionsRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListOpenWorkflowExecutionsRequest> marshall(ListOpenWorkflowExecutionsRequest listOpenWorkflowExecutionsRequest) {

        if (listOpenWorkflowExecutionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListOpenWorkflowExecutionsRequest> request = new DefaultRequest<ListOpenWorkflowExecutionsRequest>(listOpenWorkflowExecutionsRequest,
                "AmazonSimpleWorkflow");
        request.addHeader("X-Amz-Target", "SimpleWorkflowService.ListOpenWorkflowExecutions");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (listOpenWorkflowExecutionsRequest.getDomain() != null) {
                jsonGenerator.writeFieldName("domain").writeValue(listOpenWorkflowExecutionsRequest.getDomain());
            }
            if (listOpenWorkflowExecutionsRequest.getStartTimeFilter() != null) {
                jsonGenerator.writeFieldName("startTimeFilter");
                ExecutionTimeFilterJsonMarshaller.getInstance().marshall(listOpenWorkflowExecutionsRequest.getStartTimeFilter(), jsonGenerator);
            }
            if (listOpenWorkflowExecutionsRequest.getTypeFilter() != null) {
                jsonGenerator.writeFieldName("typeFilter");
                WorkflowTypeFilterJsonMarshaller.getInstance().marshall(listOpenWorkflowExecutionsRequest.getTypeFilter(), jsonGenerator);
            }
            if (listOpenWorkflowExecutionsRequest.getTagFilter() != null) {
                jsonGenerator.writeFieldName("tagFilter");
                TagFilterJsonMarshaller.getInstance().marshall(listOpenWorkflowExecutionsRequest.getTagFilter(), jsonGenerator);
            }
            if (listOpenWorkflowExecutionsRequest.getNextPageToken() != null) {
                jsonGenerator.writeFieldName("nextPageToken").writeValue(listOpenWorkflowExecutionsRequest.getNextPageToken());
            }
            if (listOpenWorkflowExecutionsRequest.getMaximumPageSize() != null) {
                jsonGenerator.writeFieldName("maximumPageSize").writeValue(listOpenWorkflowExecutionsRequest.getMaximumPageSize());
            }
            if (listOpenWorkflowExecutionsRequest.getReverseOrder() != null) {
                jsonGenerator.writeFieldName("reverseOrder").writeValue(listOpenWorkflowExecutionsRequest.getReverseOrder());
            }
            if (listOpenWorkflowExecutionsRequest.getExecutionFilter() != null) {
                jsonGenerator.writeFieldName("executionFilter");
                WorkflowExecutionFilterJsonMarshaller.getInstance().marshall(listOpenWorkflowExecutionsRequest.getExecutionFilter(), jsonGenerator);
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
