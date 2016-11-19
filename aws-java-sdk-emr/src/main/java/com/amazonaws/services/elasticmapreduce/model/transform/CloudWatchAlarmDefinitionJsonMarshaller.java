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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CloudWatchAlarmDefinitionMarshaller
 */
public class CloudWatchAlarmDefinitionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(CloudWatchAlarmDefinition cloudWatchAlarmDefinition, StructuredJsonGenerator jsonGenerator) {

        if (cloudWatchAlarmDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (cloudWatchAlarmDefinition.getComparisonOperator() != null) {
                jsonGenerator.writeFieldName("ComparisonOperator").writeValue(cloudWatchAlarmDefinition.getComparisonOperator());
            }
            if (cloudWatchAlarmDefinition.getEvaluationPeriods() != null) {
                jsonGenerator.writeFieldName("EvaluationPeriods").writeValue(cloudWatchAlarmDefinition.getEvaluationPeriods());
            }
            if (cloudWatchAlarmDefinition.getMetricName() != null) {
                jsonGenerator.writeFieldName("MetricName").writeValue(cloudWatchAlarmDefinition.getMetricName());
            }
            if (cloudWatchAlarmDefinition.getNamespace() != null) {
                jsonGenerator.writeFieldName("Namespace").writeValue(cloudWatchAlarmDefinition.getNamespace());
            }
            if (cloudWatchAlarmDefinition.getPeriod() != null) {
                jsonGenerator.writeFieldName("Period").writeValue(cloudWatchAlarmDefinition.getPeriod());
            }
            if (cloudWatchAlarmDefinition.getStatistic() != null) {
                jsonGenerator.writeFieldName("Statistic").writeValue(cloudWatchAlarmDefinition.getStatistic());
            }
            if (cloudWatchAlarmDefinition.getThreshold() != null) {
                jsonGenerator.writeFieldName("Threshold").writeValue(cloudWatchAlarmDefinition.getThreshold());
            }
            if (cloudWatchAlarmDefinition.getUnit() != null) {
                jsonGenerator.writeFieldName("Unit").writeValue(cloudWatchAlarmDefinition.getUnit());
            }

            com.amazonaws.internal.SdkInternalList<MetricDimension> dimensionsList = (com.amazonaws.internal.SdkInternalList<MetricDimension>) cloudWatchAlarmDefinition
                    .getDimensions();
            if (!dimensionsList.isEmpty() || !dimensionsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Dimensions");
                jsonGenerator.writeStartArray();
                for (MetricDimension dimensionsListValue : dimensionsList) {
                    if (dimensionsListValue != null) {

                        MetricDimensionJsonMarshaller.getInstance().marshall(dimensionsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CloudWatchAlarmDefinitionJsonMarshaller instance;

    public static CloudWatchAlarmDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CloudWatchAlarmDefinitionJsonMarshaller();
        return instance;
    }

}
