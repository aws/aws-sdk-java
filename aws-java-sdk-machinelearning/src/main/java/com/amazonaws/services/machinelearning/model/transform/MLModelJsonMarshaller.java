/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.machinelearning.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * MLModelMarshaller
 */
public class MLModelJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(MLModel mLModel, JSONWriter jsonWriter) {
        if (mLModel == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (mLModel.getMLModelId() != null) {
                jsonWriter.key("MLModelId").value(mLModel.getMLModelId());
            }

            if (mLModel.getTrainingDataSourceId() != null) {
                jsonWriter.key("TrainingDataSourceId").value(
                        mLModel.getTrainingDataSourceId());
            }

            if (mLModel.getCreatedByIamUser() != null) {
                jsonWriter.key("CreatedByIamUser").value(
                        mLModel.getCreatedByIamUser());
            }

            if (mLModel.getCreatedAt() != null) {
                jsonWriter.key("CreatedAt").value(mLModel.getCreatedAt());
            }

            if (mLModel.getLastUpdatedAt() != null) {
                jsonWriter.key("LastUpdatedAt").value(
                        mLModel.getLastUpdatedAt());
            }

            if (mLModel.getName() != null) {
                jsonWriter.key("Name").value(mLModel.getName());
            }

            if (mLModel.getStatus() != null) {
                jsonWriter.key("Status").value(mLModel.getStatus());
            }

            if (mLModel.getSizeInBytes() != null) {
                jsonWriter.key("SizeInBytes").value(mLModel.getSizeInBytes());
            }

            if (mLModel.getEndpointInfo() != null) {
                jsonWriter.key("EndpointInfo");
                RealtimeEndpointInfoJsonMarshaller.getInstance().marshall(
                        mLModel.getEndpointInfo(), jsonWriter);
            }

            com.amazonaws.internal.SdkInternalMap<String, String> trainingParametersMap = (com.amazonaws.internal.SdkInternalMap<String, String>) mLModel
                    .getTrainingParameters();
            if (!trainingParametersMap.isEmpty()
                    || !trainingParametersMap.isAutoConstruct()) {
                jsonWriter.key("TrainingParameters");
                jsonWriter.object();

                for (Map.Entry<String, String> trainingParametersMapValue : trainingParametersMap
                        .entrySet()) {
                    if (trainingParametersMapValue.getValue() != null) {
                        jsonWriter.key(trainingParametersMapValue.getKey());

                        jsonWriter.value(trainingParametersMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            if (mLModel.getInputDataLocationS3() != null) {
                jsonWriter.key("InputDataLocationS3").value(
                        mLModel.getInputDataLocationS3());
            }

            if (mLModel.getAlgorithm() != null) {
                jsonWriter.key("Algorithm").value(mLModel.getAlgorithm());
            }

            if (mLModel.getMLModelType() != null) {
                jsonWriter.key("MLModelType").value(mLModel.getMLModelType());
            }

            if (mLModel.getScoreThreshold() != null) {
                jsonWriter.key("ScoreThreshold").value(
                        mLModel.getScoreThreshold());
            }

            if (mLModel.getScoreThresholdLastUpdatedAt() != null) {
                jsonWriter.key("ScoreThresholdLastUpdatedAt").value(
                        mLModel.getScoreThresholdLastUpdatedAt());
            }

            if (mLModel.getMessage() != null) {
                jsonWriter.key("Message").value(mLModel.getMessage());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static MLModelJsonMarshaller instance;

    public static MLModelJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MLModelJsonMarshaller();
        return instance;
    }

}
