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
 * MLModelMarshaller
 */
public class MLModelJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(MLModel mLModel, StructuredJsonGenerator jsonGenerator) {

        if (mLModel == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (mLModel.getMLModelId() != null) {
                jsonGenerator.writeFieldName("MLModelId").writeValue(mLModel.getMLModelId());
            }
            if (mLModel.getTrainingDataSourceId() != null) {
                jsonGenerator.writeFieldName("TrainingDataSourceId").writeValue(mLModel.getTrainingDataSourceId());
            }
            if (mLModel.getCreatedByIamUser() != null) {
                jsonGenerator.writeFieldName("CreatedByIamUser").writeValue(mLModel.getCreatedByIamUser());
            }
            if (mLModel.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("CreatedAt").writeValue(mLModel.getCreatedAt());
            }
            if (mLModel.getLastUpdatedAt() != null) {
                jsonGenerator.writeFieldName("LastUpdatedAt").writeValue(mLModel.getLastUpdatedAt());
            }
            if (mLModel.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(mLModel.getName());
            }
            if (mLModel.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(mLModel.getStatus());
            }
            if (mLModel.getSizeInBytes() != null) {
                jsonGenerator.writeFieldName("SizeInBytes").writeValue(mLModel.getSizeInBytes());
            }
            if (mLModel.getEndpointInfo() != null) {
                jsonGenerator.writeFieldName("EndpointInfo");
                RealtimeEndpointInfoJsonMarshaller.getInstance().marshall(mLModel.getEndpointInfo(), jsonGenerator);
            }

            com.amazonaws.internal.SdkInternalMap<String, String> trainingParametersMap = (com.amazonaws.internal.SdkInternalMap<String, String>) mLModel
                    .getTrainingParameters();
            if (!trainingParametersMap.isEmpty() || !trainingParametersMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("TrainingParameters");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> trainingParametersMapValue : trainingParametersMap.entrySet()) {
                    if (trainingParametersMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(trainingParametersMapValue.getKey());

                        jsonGenerator.writeValue(trainingParametersMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (mLModel.getInputDataLocationS3() != null) {
                jsonGenerator.writeFieldName("InputDataLocationS3").writeValue(mLModel.getInputDataLocationS3());
            }
            if (mLModel.getAlgorithm() != null) {
                jsonGenerator.writeFieldName("Algorithm").writeValue(mLModel.getAlgorithm());
            }
            if (mLModel.getMLModelType() != null) {
                jsonGenerator.writeFieldName("MLModelType").writeValue(mLModel.getMLModelType());
            }
            if (mLModel.getScoreThreshold() != null) {
                jsonGenerator.writeFieldName("ScoreThreshold").writeValue(mLModel.getScoreThreshold());
            }
            if (mLModel.getScoreThresholdLastUpdatedAt() != null) {
                jsonGenerator.writeFieldName("ScoreThresholdLastUpdatedAt").writeValue(mLModel.getScoreThresholdLastUpdatedAt());
            }
            if (mLModel.getMessage() != null) {
                jsonGenerator.writeFieldName("Message").writeValue(mLModel.getMessage());
            }
            if (mLModel.getComputeTime() != null) {
                jsonGenerator.writeFieldName("ComputeTime").writeValue(mLModel.getComputeTime());
            }
            if (mLModel.getFinishedAt() != null) {
                jsonGenerator.writeFieldName("FinishedAt").writeValue(mLModel.getFinishedAt());
            }
            if (mLModel.getStartedAt() != null) {
                jsonGenerator.writeFieldName("StartedAt").writeValue(mLModel.getStartedAt());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static MLModelJsonMarshaller instance;

    public static MLModelJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MLModelJsonMarshaller();
        return instance;
    }

}
