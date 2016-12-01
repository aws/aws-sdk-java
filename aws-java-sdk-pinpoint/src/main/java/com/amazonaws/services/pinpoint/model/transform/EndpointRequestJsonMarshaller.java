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
package com.amazonaws.services.pinpoint.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * EndpointRequestMarshaller
 */
public class EndpointRequestJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(EndpointRequest endpointRequest, StructuredJsonGenerator jsonGenerator) {

        if (endpointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (endpointRequest.getAddress() != null) {
                jsonGenerator.writeFieldName("Address").writeValue(endpointRequest.getAddress());
            }

            java.util.Map<String, java.util.List<String>> attributesMap = endpointRequest.getAttributes();
            if (attributesMap != null) {
                jsonGenerator.writeFieldName("Attributes");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, java.util.List<String>> attributesMapValue : attributesMap.entrySet()) {
                    if (attributesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(attributesMapValue.getKey());

                        jsonGenerator.writeStartArray();
                        for (String attributesMapValueList : attributesMapValue.getValue()) {
                            if (attributesMapValueList != null) {
                                jsonGenerator.writeValue(attributesMapValueList);
                            }
                        }
                        jsonGenerator.writeEndArray();
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (endpointRequest.getChannelType() != null) {
                jsonGenerator.writeFieldName("ChannelType").writeValue(endpointRequest.getChannelType());
            }
            if (endpointRequest.getDemographic() != null) {
                jsonGenerator.writeFieldName("Demographic");
                EndpointDemographicJsonMarshaller.getInstance().marshall(endpointRequest.getDemographic(), jsonGenerator);
            }
            if (endpointRequest.getEffectiveDate() != null) {
                jsonGenerator.writeFieldName("EffectiveDate").writeValue(endpointRequest.getEffectiveDate());
            }
            if (endpointRequest.getEndpointStatus() != null) {
                jsonGenerator.writeFieldName("EndpointStatus").writeValue(endpointRequest.getEndpointStatus());
            }
            if (endpointRequest.getLocation() != null) {
                jsonGenerator.writeFieldName("Location");
                EndpointLocationJsonMarshaller.getInstance().marshall(endpointRequest.getLocation(), jsonGenerator);
            }

            java.util.Map<String, Double> metricsMap = endpointRequest.getMetrics();
            if (metricsMap != null) {
                jsonGenerator.writeFieldName("Metrics");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, Double> metricsMapValue : metricsMap.entrySet()) {
                    if (metricsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(metricsMapValue.getKey());

                        jsonGenerator.writeValue(metricsMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (endpointRequest.getOptOut() != null) {
                jsonGenerator.writeFieldName("OptOut").writeValue(endpointRequest.getOptOut());
            }
            if (endpointRequest.getRequestId() != null) {
                jsonGenerator.writeFieldName("RequestId").writeValue(endpointRequest.getRequestId());
            }
            if (endpointRequest.getUser() != null) {
                jsonGenerator.writeFieldName("User");
                EndpointUserJsonMarshaller.getInstance().marshall(endpointRequest.getUser(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EndpointRequestJsonMarshaller instance;

    public static EndpointRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EndpointRequestJsonMarshaller();
        return instance;
    }

}
