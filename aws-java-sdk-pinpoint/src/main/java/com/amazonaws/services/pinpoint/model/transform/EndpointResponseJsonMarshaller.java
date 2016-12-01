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
 * EndpointResponseMarshaller
 */
public class EndpointResponseJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(EndpointResponse endpointResponse, StructuredJsonGenerator jsonGenerator) {

        if (endpointResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (endpointResponse.getAddress() != null) {
                jsonGenerator.writeFieldName("Address").writeValue(endpointResponse.getAddress());
            }
            if (endpointResponse.getApplicationId() != null) {
                jsonGenerator.writeFieldName("ApplicationId").writeValue(endpointResponse.getApplicationId());
            }

            java.util.Map<String, java.util.List<String>> attributesMap = endpointResponse.getAttributes();
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
            if (endpointResponse.getChannelType() != null) {
                jsonGenerator.writeFieldName("ChannelType").writeValue(endpointResponse.getChannelType());
            }
            if (endpointResponse.getCohortId() != null) {
                jsonGenerator.writeFieldName("CohortId").writeValue(endpointResponse.getCohortId());
            }
            if (endpointResponse.getCreationDate() != null) {
                jsonGenerator.writeFieldName("CreationDate").writeValue(endpointResponse.getCreationDate());
            }
            if (endpointResponse.getDemographic() != null) {
                jsonGenerator.writeFieldName("Demographic");
                EndpointDemographicJsonMarshaller.getInstance().marshall(endpointResponse.getDemographic(), jsonGenerator);
            }
            if (endpointResponse.getEffectiveDate() != null) {
                jsonGenerator.writeFieldName("EffectiveDate").writeValue(endpointResponse.getEffectiveDate());
            }
            if (endpointResponse.getEndpointStatus() != null) {
                jsonGenerator.writeFieldName("EndpointStatus").writeValue(endpointResponse.getEndpointStatus());
            }
            if (endpointResponse.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(endpointResponse.getId());
            }
            if (endpointResponse.getLocation() != null) {
                jsonGenerator.writeFieldName("Location");
                EndpointLocationJsonMarshaller.getInstance().marshall(endpointResponse.getLocation(), jsonGenerator);
            }

            java.util.Map<String, Double> metricsMap = endpointResponse.getMetrics();
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
            if (endpointResponse.getOptOut() != null) {
                jsonGenerator.writeFieldName("OptOut").writeValue(endpointResponse.getOptOut());
            }
            if (endpointResponse.getRequestId() != null) {
                jsonGenerator.writeFieldName("RequestId").writeValue(endpointResponse.getRequestId());
            }
            if (endpointResponse.getShardId() != null) {
                jsonGenerator.writeFieldName("ShardId").writeValue(endpointResponse.getShardId());
            }
            if (endpointResponse.getUser() != null) {
                jsonGenerator.writeFieldName("User");
                EndpointUserJsonMarshaller.getInstance().marshall(endpointResponse.getUser(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EndpointResponseJsonMarshaller instance;

    public static EndpointResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EndpointResponseJsonMarshaller();
        return instance;
    }

}
