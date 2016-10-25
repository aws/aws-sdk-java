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
 * PredictionMarshaller
 */
public class PredictionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Prediction prediction, StructuredJsonGenerator jsonGenerator) {

        if (prediction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (prediction.getPredictedLabel() != null) {
                jsonGenerator.writeFieldName("predictedLabel").writeValue(prediction.getPredictedLabel());
            }
            if (prediction.getPredictedValue() != null) {
                jsonGenerator.writeFieldName("predictedValue").writeValue(prediction.getPredictedValue());
            }

            com.amazonaws.internal.SdkInternalMap<String, Float> predictedScoresMap = (com.amazonaws.internal.SdkInternalMap<String, Float>) prediction
                    .getPredictedScores();
            if (!predictedScoresMap.isEmpty() || !predictedScoresMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("predictedScores");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, Float> predictedScoresMapValue : predictedScoresMap.entrySet()) {
                    if (predictedScoresMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(predictedScoresMapValue.getKey());

                        jsonGenerator.writeValue(predictedScoresMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            com.amazonaws.internal.SdkInternalMap<String, String> detailsMap = (com.amazonaws.internal.SdkInternalMap<String, String>) prediction.getDetails();
            if (!detailsMap.isEmpty() || !detailsMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("details");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> detailsMapValue : detailsMap.entrySet()) {
                    if (detailsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(detailsMapValue.getKey());

                        jsonGenerator.writeValue(detailsMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static PredictionJsonMarshaller instance;

    public static PredictionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PredictionJsonMarshaller();
        return instance;
    }

}
