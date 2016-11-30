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
package com.amazonaws.services.lightsail.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * GetInstanceMetricDataRequest Marshaller
 */
public class GetInstanceMetricDataRequestMarshaller implements Marshaller<Request<GetInstanceMetricDataRequest>, GetInstanceMetricDataRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public GetInstanceMetricDataRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetInstanceMetricDataRequest> marshall(GetInstanceMetricDataRequest getInstanceMetricDataRequest) {

        if (getInstanceMetricDataRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetInstanceMetricDataRequest> request = new DefaultRequest<GetInstanceMetricDataRequest>(getInstanceMetricDataRequest, "AmazonLightsail");
        request.addHeader("X-Amz-Target", "Lightsail_20161128.GetInstanceMetricData");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (getInstanceMetricDataRequest.getInstanceName() != null) {
                jsonGenerator.writeFieldName("instanceName").writeValue(getInstanceMetricDataRequest.getInstanceName());
            }
            if (getInstanceMetricDataRequest.getMetricName() != null) {
                jsonGenerator.writeFieldName("metricName").writeValue(getInstanceMetricDataRequest.getMetricName());
            }
            if (getInstanceMetricDataRequest.getPeriod() != null) {
                jsonGenerator.writeFieldName("period").writeValue(getInstanceMetricDataRequest.getPeriod());
            }
            if (getInstanceMetricDataRequest.getStartTime() != null) {
                jsonGenerator.writeFieldName("startTime").writeValue(getInstanceMetricDataRequest.getStartTime());
            }
            if (getInstanceMetricDataRequest.getEndTime() != null) {
                jsonGenerator.writeFieldName("endTime").writeValue(getInstanceMetricDataRequest.getEndTime());
            }
            if (getInstanceMetricDataRequest.getUnit() != null) {
                jsonGenerator.writeFieldName("unit").writeValue(getInstanceMetricDataRequest.getUnit());
            }

            java.util.List<String> statisticsList = getInstanceMetricDataRequest.getStatistics();
            if (statisticsList != null) {
                jsonGenerator.writeFieldName("statistics");
                jsonGenerator.writeStartArray();
                for (String statisticsListValue : statisticsList) {
                    if (statisticsListValue != null) {
                        jsonGenerator.writeValue(statisticsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
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
