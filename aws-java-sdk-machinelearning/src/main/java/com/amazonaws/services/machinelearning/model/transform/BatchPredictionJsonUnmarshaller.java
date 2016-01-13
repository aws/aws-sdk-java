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

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BatchPrediction JSON Unmarshaller
 */
public class BatchPredictionJsonUnmarshaller implements
        Unmarshaller<BatchPrediction, JsonUnmarshallerContext> {

    public BatchPrediction unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        BatchPrediction batchPrediction = new BatchPrediction();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("BatchPredictionId", targetDepth)) {
                    context.nextToken();
                    batchPrediction.setBatchPredictionId(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("MLModelId", targetDepth)) {
                    context.nextToken();
                    batchPrediction.setMLModelId(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("BatchPredictionDataSourceId",
                        targetDepth)) {
                    context.nextToken();
                    batchPrediction
                            .setBatchPredictionDataSourceId(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("InputDataLocationS3", targetDepth)) {
                    context.nextToken();
                    batchPrediction
                            .setInputDataLocationS3(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedByIamUser", targetDepth)) {
                    context.nextToken();
                    batchPrediction.setCreatedByIamUser(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    batchPrediction.setCreatedAt(DateJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("LastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    batchPrediction.setLastUpdatedAt(DateJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    batchPrediction.setName(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    batchPrediction.setStatus(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("OutputUri", targetDepth)) {
                    context.nextToken();
                    batchPrediction.setOutputUri(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    context.nextToken();
                    batchPrediction.setMessage(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return batchPrediction;
    }

    private static BatchPredictionJsonUnmarshaller instance;

    public static BatchPredictionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchPredictionJsonUnmarshaller();
        return instance;
    }
}
