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
package com.amazonaws.services.gamelift.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * DescribeFleetEventsRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFleetEventsRequestMarshaller implements Marshaller<Request<DescribeFleetEventsRequest>, DescribeFleetEventsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DescribeFleetEventsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeFleetEventsRequest> marshall(DescribeFleetEventsRequest describeFleetEventsRequest) {

        if (describeFleetEventsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeFleetEventsRequest> request = new DefaultRequest<DescribeFleetEventsRequest>(describeFleetEventsRequest, "AmazonGameLift");
        request.addHeader("X-Amz-Target", "GameLift.DescribeFleetEvents");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (describeFleetEventsRequest.getFleetId() != null) {
                jsonGenerator.writeFieldName("FleetId").writeValue(describeFleetEventsRequest.getFleetId());
            }
            if (describeFleetEventsRequest.getStartTime() != null) {
                jsonGenerator.writeFieldName("StartTime").writeValue(describeFleetEventsRequest.getStartTime());
            }
            if (describeFleetEventsRequest.getEndTime() != null) {
                jsonGenerator.writeFieldName("EndTime").writeValue(describeFleetEventsRequest.getEndTime());
            }
            if (describeFleetEventsRequest.getLimit() != null) {
                jsonGenerator.writeFieldName("Limit").writeValue(describeFleetEventsRequest.getLimit());
            }
            if (describeFleetEventsRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("NextToken").writeValue(describeFleetEventsRequest.getNextToken());
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
