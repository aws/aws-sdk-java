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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * InstanceAggregatedAssociationOverviewMarshaller
 */
public class InstanceAggregatedAssociationOverviewJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InstanceAggregatedAssociationOverview instanceAggregatedAssociationOverview, StructuredJsonGenerator jsonGenerator) {

        if (instanceAggregatedAssociationOverview == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (instanceAggregatedAssociationOverview.getDetailedStatus() != null) {
                jsonGenerator.writeFieldName("DetailedStatus").writeValue(instanceAggregatedAssociationOverview.getDetailedStatus());
            }

            java.util.Map<String, Integer> instanceAssociationStatusAggregatedCountMap = instanceAggregatedAssociationOverview
                    .getInstanceAssociationStatusAggregatedCount();
            if (instanceAssociationStatusAggregatedCountMap != null) {
                jsonGenerator.writeFieldName("InstanceAssociationStatusAggregatedCount");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, Integer> instanceAssociationStatusAggregatedCountMapValue : instanceAssociationStatusAggregatedCountMap.entrySet()) {
                    if (instanceAssociationStatusAggregatedCountMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(instanceAssociationStatusAggregatedCountMapValue.getKey());

                        jsonGenerator.writeValue(instanceAssociationStatusAggregatedCountMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InstanceAggregatedAssociationOverviewJsonMarshaller instance;

    public static InstanceAggregatedAssociationOverviewJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceAggregatedAssociationOverviewJsonMarshaller();
        return instance;
    }

}
