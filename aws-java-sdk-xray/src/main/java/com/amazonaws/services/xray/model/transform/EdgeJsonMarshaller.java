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
 * EdgeMarshaller
 */
public class EdgeJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Edge edge, StructuredJsonGenerator jsonGenerator) {

        if (edge == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (edge.getReferenceId() != null) {
                jsonGenerator.writeFieldName("ReferenceId").writeValue(edge.getReferenceId());
            }
            if (edge.getStartTime() != null) {
                jsonGenerator.writeFieldName("StartTime").writeValue(edge.getStartTime());
            }
            if (edge.getEndTime() != null) {
                jsonGenerator.writeFieldName("EndTime").writeValue(edge.getEndTime());
            }
            if (edge.getSummaryStatistics() != null) {
                jsonGenerator.writeFieldName("SummaryStatistics");
                EdgeStatisticsJsonMarshaller.getInstance().marshall(edge.getSummaryStatistics(), jsonGenerator);
            }

            java.util.List<HistogramEntry> responseTimeHistogramList = edge.getResponseTimeHistogram();
            if (responseTimeHistogramList != null) {
                jsonGenerator.writeFieldName("ResponseTimeHistogram");
                jsonGenerator.writeStartArray();
                for (HistogramEntry responseTimeHistogramListValue : responseTimeHistogramList) {
                    if (responseTimeHistogramListValue != null) {

                        HistogramEntryJsonMarshaller.getInstance().marshall(responseTimeHistogramListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<Alias> aliasesList = edge.getAliases();
            if (aliasesList != null) {
                jsonGenerator.writeFieldName("Aliases");
                jsonGenerator.writeStartArray();
                for (Alias aliasesListValue : aliasesList) {
                    if (aliasesListValue != null) {

                        AliasJsonMarshaller.getInstance().marshall(aliasesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EdgeJsonMarshaller instance;

    public static EdgeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EdgeJsonMarshaller();
        return instance;
    }

}
