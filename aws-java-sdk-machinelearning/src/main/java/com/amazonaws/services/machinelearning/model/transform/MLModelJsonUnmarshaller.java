/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MLModel JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MLModelJsonUnmarshaller implements Unmarshaller<MLModel, JsonUnmarshallerContext> {

    public MLModel unmarshall(JsonUnmarshallerContext context) throws Exception {
        MLModel mLModel = new MLModel();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("MLModelId", targetDepth)) {
                    context.nextToken();
                    mLModel.setMLModelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TrainingDataSourceId", targetDepth)) {
                    context.nextToken();
                    mLModel.setTrainingDataSourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedByIamUser", targetDepth)) {
                    context.nextToken();
                    mLModel.setCreatedByIamUser(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    mLModel.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    mLModel.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    mLModel.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    mLModel.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SizeInBytes", targetDepth)) {
                    context.nextToken();
                    mLModel.setSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("EndpointInfo", targetDepth)) {
                    context.nextToken();
                    mLModel.setEndpointInfo(RealtimeEndpointInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TrainingParameters", targetDepth)) {
                    context.nextToken();
                    mLModel.setTrainingParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("InputDataLocationS3", targetDepth)) {
                    context.nextToken();
                    mLModel.setInputDataLocationS3(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Algorithm", targetDepth)) {
                    context.nextToken();
                    mLModel.setAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MLModelType", targetDepth)) {
                    context.nextToken();
                    mLModel.setMLModelType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScoreThreshold", targetDepth)) {
                    context.nextToken();
                    mLModel.setScoreThreshold(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("ScoreThresholdLastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    mLModel.setScoreThresholdLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    context.nextToken();
                    mLModel.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComputeTime", targetDepth)) {
                    context.nextToken();
                    mLModel.setComputeTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("FinishedAt", targetDepth)) {
                    context.nextToken();
                    mLModel.setFinishedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("StartedAt", targetDepth)) {
                    context.nextToken();
                    mLModel.setStartedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return mLModel;
    }

    private static MLModelJsonUnmarshaller instance;

    public static MLModelJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MLModelJsonUnmarshaller();
        return instance;
    }
}
