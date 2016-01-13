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
 * PredictionMarshaller
 */
public class PredictionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Prediction prediction, JSONWriter jsonWriter) {
        if (prediction == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (prediction.getPredictedLabel() != null) {
                jsonWriter.key("predictedLabel").value(
                        prediction.getPredictedLabel());
            }

            if (prediction.getPredictedValue() != null) {
                jsonWriter.key("predictedValue").value(
                        prediction.getPredictedValue());
            }

            com.amazonaws.internal.SdkInternalMap<String, Float> predictedScoresMap = (com.amazonaws.internal.SdkInternalMap<String, Float>) prediction
                    .getPredictedScores();
            if (!predictedScoresMap.isEmpty()
                    || !predictedScoresMap.isAutoConstruct()) {
                jsonWriter.key("predictedScores");
                jsonWriter.object();

                for (Map.Entry<String, Float> predictedScoresMapValue : predictedScoresMap
                        .entrySet()) {
                    if (predictedScoresMapValue.getValue() != null) {
                        jsonWriter.key(predictedScoresMapValue.getKey());

                        jsonWriter.value(predictedScoresMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.SdkInternalMap<String, String> detailsMap = (com.amazonaws.internal.SdkInternalMap<String, String>) prediction
                    .getDetails();
            if (!detailsMap.isEmpty() || !detailsMap.isAutoConstruct()) {
                jsonWriter.key("details");
                jsonWriter.object();

                for (Map.Entry<String, String> detailsMapValue : detailsMap
                        .entrySet()) {
                    if (detailsMapValue.getValue() != null) {
                        jsonWriter.key(detailsMapValue.getKey());

                        jsonWriter.value(detailsMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static PredictionJsonMarshaller instance;

    public static PredictionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PredictionJsonMarshaller();
        return instance;
    }

}
