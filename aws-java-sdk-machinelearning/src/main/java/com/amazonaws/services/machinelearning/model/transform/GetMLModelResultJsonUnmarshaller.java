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
 * GetMLModelResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMLModelResultJsonUnmarshaller implements Unmarshaller<GetMLModelResult, JsonUnmarshallerContext> {

    public GetMLModelResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetMLModelResult getMLModelResult = new GetMLModelResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getMLModelResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("MLModelId", targetDepth)) {
                    context.nextToken();
                    getMLModelResult.setMLModelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TrainingDataSourceId", targetDepth)) {
                    context.nextToken();
                    getMLModelResult.setTrainingDataSourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedByIamUser", targetDepth)) {
                    context.nextToken();
                    getMLModelResult.setCreatedByIamUser(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    getMLModelResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    getMLModelResult.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    getMLModelResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    getMLModelResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SizeInBytes", targetDepth)) {
                    context.nextToken();
                    getMLModelResult.setSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("EndpointInfo", targetDepth)) {
                    context.nextToken();
                    getMLModelResult.setEndpointInfo(RealtimeEndpointInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TrainingParameters", targetDepth)) {
                    context.nextToken();
                    getMLModelResult.setTrainingParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("InputDataLocationS3", targetDepth)) {
                    context.nextToken();
                    getMLModelResult.setInputDataLocationS3(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MLModelType", targetDepth)) {
                    context.nextToken();
                    getMLModelResult.setMLModelType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScoreThreshold", targetDepth)) {
                    context.nextToken();
                    getMLModelResult.setScoreThreshold(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("ScoreThresholdLastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    getMLModelResult.setScoreThresholdLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LogUri", targetDepth)) {
                    context.nextToken();
                    getMLModelResult.setLogUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    context.nextToken();
                    getMLModelResult.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComputeTime", targetDepth)) {
                    context.nextToken();
                    getMLModelResult.setComputeTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("FinishedAt", targetDepth)) {
                    context.nextToken();
                    getMLModelResult.setFinishedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("StartedAt", targetDepth)) {
                    context.nextToken();
                    getMLModelResult.setStartedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Recipe", targetDepth)) {
                    context.nextToken();
                    getMLModelResult.setRecipe(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Schema", targetDepth)) {
                    context.nextToken();
                    getMLModelResult.setSchema(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getMLModelResult;
    }

    private static GetMLModelResultJsonUnmarshaller instance;

    public static GetMLModelResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMLModelResultJsonUnmarshaller();
        return instance;
    }
}
