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
package com.amazonaws.services.applicationautoscaling.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.applicationautoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DescribeScalingActivitiesRequest Marshaller
 */
public class DescribeScalingActivitiesRequestMarshaller implements Marshaller<Request<DescribeScalingActivitiesRequest>, DescribeScalingActivitiesRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public DescribeScalingActivitiesRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeScalingActivitiesRequest> marshall(DescribeScalingActivitiesRequest describeScalingActivitiesRequest) {

        if (describeScalingActivitiesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeScalingActivitiesRequest> request = new DefaultRequest<DescribeScalingActivitiesRequest>(describeScalingActivitiesRequest,
                "AWSApplicationAutoScaling");
        request.addHeader("X-Amz-Target", "AnyScaleFrontendService.DescribeScalingActivities");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (describeScalingActivitiesRequest.getServiceNamespace() != null) {
                jsonGenerator.writeFieldName("ServiceNamespace").writeValue(describeScalingActivitiesRequest.getServiceNamespace());
            }
            if (describeScalingActivitiesRequest.getResourceId() != null) {
                jsonGenerator.writeFieldName("ResourceId").writeValue(describeScalingActivitiesRequest.getResourceId());
            }
            if (describeScalingActivitiesRequest.getScalableDimension() != null) {
                jsonGenerator.writeFieldName("ScalableDimension").writeValue(describeScalingActivitiesRequest.getScalableDimension());
            }
            if (describeScalingActivitiesRequest.getMaxResults() != null) {
                jsonGenerator.writeFieldName("MaxResults").writeValue(describeScalingActivitiesRequest.getMaxResults());
            }
            if (describeScalingActivitiesRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("NextToken").writeValue(describeScalingActivitiesRequest.getNextToken());
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
