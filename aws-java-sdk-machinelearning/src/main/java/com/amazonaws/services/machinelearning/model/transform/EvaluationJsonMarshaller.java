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
package com.amazonaws.services.machinelearning.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * EvaluationMarshaller
 */
public class EvaluationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Evaluation evaluation, StructuredJsonGenerator jsonGenerator) {

        if (evaluation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (evaluation.getEvaluationId() != null) {
                jsonGenerator.writeFieldName("EvaluationId").writeValue(evaluation.getEvaluationId());
            }
            if (evaluation.getMLModelId() != null) {
                jsonGenerator.writeFieldName("MLModelId").writeValue(evaluation.getMLModelId());
            }
            if (evaluation.getEvaluationDataSourceId() != null) {
                jsonGenerator.writeFieldName("EvaluationDataSourceId").writeValue(evaluation.getEvaluationDataSourceId());
            }
            if (evaluation.getInputDataLocationS3() != null) {
                jsonGenerator.writeFieldName("InputDataLocationS3").writeValue(evaluation.getInputDataLocationS3());
            }
            if (evaluation.getCreatedByIamUser() != null) {
                jsonGenerator.writeFieldName("CreatedByIamUser").writeValue(evaluation.getCreatedByIamUser());
            }
            if (evaluation.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("CreatedAt").writeValue(evaluation.getCreatedAt());
            }
            if (evaluation.getLastUpdatedAt() != null) {
                jsonGenerator.writeFieldName("LastUpdatedAt").writeValue(evaluation.getLastUpdatedAt());
            }
            if (evaluation.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(evaluation.getName());
            }
            if (evaluation.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(evaluation.getStatus());
            }
            if (evaluation.getPerformanceMetrics() != null) {
                jsonGenerator.writeFieldName("PerformanceMetrics");
                PerformanceMetricsJsonMarshaller.getInstance().marshall(evaluation.getPerformanceMetrics(), jsonGenerator);
            }
            if (evaluation.getMessage() != null) {
                jsonGenerator.writeFieldName("Message").writeValue(evaluation.getMessage());
            }
            if (evaluation.getComputeTime() != null) {
                jsonGenerator.writeFieldName("ComputeTime").writeValue(evaluation.getComputeTime());
            }
            if (evaluation.getFinishedAt() != null) {
                jsonGenerator.writeFieldName("FinishedAt").writeValue(evaluation.getFinishedAt());
            }
            if (evaluation.getStartedAt() != null) {
                jsonGenerator.writeFieldName("StartedAt").writeValue(evaluation.getStartedAt());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EvaluationJsonMarshaller instance;

    public static EvaluationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationJsonMarshaller();
        return instance;
    }

}
