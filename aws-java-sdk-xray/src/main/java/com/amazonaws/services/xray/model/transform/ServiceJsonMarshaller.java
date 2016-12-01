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
package com.amazonaws.services.xray.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.xray.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ServiceMarshaller
 */
public class ServiceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Service service, StructuredJsonGenerator jsonGenerator) {

        if (service == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (service.getReferenceId() != null) {
                jsonGenerator.writeFieldName("ReferenceId").writeValue(service.getReferenceId());
            }
            if (service.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(service.getName());
            }

            java.util.List<String> namesList = service.getNames();
            if (namesList != null) {
                jsonGenerator.writeFieldName("Names");
                jsonGenerator.writeStartArray();
                for (String namesListValue : namesList) {
                    if (namesListValue != null) {
                        jsonGenerator.writeValue(namesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (service.getRoot() != null) {
                jsonGenerator.writeFieldName("Root").writeValue(service.getRoot());
            }
            if (service.getAccountId() != null) {
                jsonGenerator.writeFieldName("AccountId").writeValue(service.getAccountId());
            }
            if (service.getType() != null) {
                jsonGenerator.writeFieldName("Type").writeValue(service.getType());
            }
            if (service.getState() != null) {
                jsonGenerator.writeFieldName("State").writeValue(service.getState());
            }
            if (service.getStartTime() != null) {
                jsonGenerator.writeFieldName("StartTime").writeValue(service.getStartTime());
            }
            if (service.getEndTime() != null) {
                jsonGenerator.writeFieldName("EndTime").writeValue(service.getEndTime());
            }

            java.util.List<Edge> edgesList = service.getEdges();
            if (edgesList != null) {
                jsonGenerator.writeFieldName("Edges");
                jsonGenerator.writeStartArray();
                for (Edge edgesListValue : edgesList) {
                    if (edgesListValue != null) {

                        EdgeJsonMarshaller.getInstance().marshall(edgesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (service.getSummaryStatistics() != null) {
                jsonGenerator.writeFieldName("SummaryStatistics");
                ServiceStatisticsJsonMarshaller.getInstance().marshall(service.getSummaryStatistics(), jsonGenerator);
            }

            java.util.List<HistogramEntry> durationHistogramList = service.getDurationHistogram();
            if (durationHistogramList != null) {
                jsonGenerator.writeFieldName("DurationHistogram");
                jsonGenerator.writeStartArray();
                for (HistogramEntry durationHistogramListValue : durationHistogramList) {
                    if (durationHistogramListValue != null) {

                        HistogramEntryJsonMarshaller.getInstance().marshall(durationHistogramListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ServiceJsonMarshaller instance;

    public static ServiceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceJsonMarshaller();
        return instance;
    }

}
