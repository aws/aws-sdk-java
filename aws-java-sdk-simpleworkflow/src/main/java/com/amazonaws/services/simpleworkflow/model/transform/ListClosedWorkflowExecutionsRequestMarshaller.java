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
 * ListClosedWorkflowExecutionsRequest Marshaller
 */
public class ListClosedWorkflowExecutionsRequestMarshaller implements
        Marshaller<Request<ListClosedWorkflowExecutionsRequest>, ListClosedWorkflowExecutionsRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public ListClosedWorkflowExecutionsRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListClosedWorkflowExecutionsRequest> marshall(ListClosedWorkflowExecutionsRequest listClosedWorkflowExecutionsRequest) {

        if (listClosedWorkflowExecutionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListClosedWorkflowExecutionsRequest> request = new DefaultRequest<ListClosedWorkflowExecutionsRequest>(listClosedWorkflowExecutionsRequest,
                "AmazonSimpleWorkflow");
        request.addHeader("X-Amz-Target", "SimpleWorkflowService.ListClosedWorkflowExecutions");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (listClosedWorkflowExecutionsRequest.getDomain() != null) {
                jsonGenerator.writeFieldName("domain").writeValue(listClosedWorkflowExecutionsRequest.getDomain());
            }
            if (listClosedWorkflowExecutionsRequest.getStartTimeFilter() != null) {
                jsonGenerator.writeFieldName("startTimeFilter");
                ExecutionTimeFilterJsonMarshaller.getInstance().marshall(listClosedWorkflowExecutionsRequest.getStartTimeFilter(), jsonGenerator);
            }
            if (listClosedWorkflowExecutionsRequest.getCloseTimeFilter() != null) {
                jsonGenerator.writeFieldName("closeTimeFilter");
                ExecutionTimeFilterJsonMarshaller.getInstance().marshall(listClosedWorkflowExecutionsRequest.getCloseTimeFilter(), jsonGenerator);
            }
            if (listClosedWorkflowExecutionsRequest.getExecutionFilter() != null) {
                jsonGenerator.writeFieldName("executionFilter");
                WorkflowExecutionFilterJsonMarshaller.getInstance().marshall(listClosedWorkflowExecutionsRequest.getExecutionFilter(), jsonGenerator);
            }
            if (listClosedWorkflowExecutionsRequest.getCloseStatusFilter() != null) {
                jsonGenerator.writeFieldName("closeStatusFilter");
                CloseStatusFilterJsonMarshaller.getInstance().marshall(listClosedWorkflowExecutionsRequest.getCloseStatusFilter(), jsonGenerator);
            }
            if (listClosedWorkflowExecutionsRequest.getTypeFilter() != null) {
                jsonGenerator.writeFieldName("typeFilter");
                WorkflowTypeFilterJsonMarshaller.getInstance().marshall(listClosedWorkflowExecutionsRequest.getTypeFilter(), jsonGenerator);
            }
            if (listClosedWorkflowExecutionsRequest.getTagFilter() != null) {
                jsonGenerator.writeFieldName("tagFilter");
                TagFilterJsonMarshaller.getInstance().marshall(listClosedWorkflowExecutionsRequest.getTagFilter(), jsonGenerator);
            }
            if (listClosedWorkflowExecutionsRequest.getNextPageToken() != null) {
                jsonGenerator.writeFieldName("nextPageToken").writeValue(listClosedWorkflowExecutionsRequest.getNextPageToken());
            }
            if (listClosedWorkflowExecutionsRequest.getMaximumPageSize() != null) {
                jsonGenerator.writeFieldName("maximumPageSize").writeValue(listClosedWorkflowExecutionsRequest.getMaximumPageSize());
            }
            if (listClosedWorkflowExecutionsRequest.getReverseOrder() != null) {
                jsonGenerator.writeFieldName("reverseOrder").writeValue(listClosedWorkflowExecutionsRequest.getReverseOrder());
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
