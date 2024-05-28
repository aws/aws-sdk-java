/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.bedrock.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.bedrock.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetCustomModelResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCustomModelResultJsonUnmarshaller implements Unmarshaller<GetCustomModelResult, JsonUnmarshallerContext> {

    public GetCustomModelResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetCustomModelResult getCustomModelResult = new GetCustomModelResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getCustomModelResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("modelArn", targetDepth)) {
                    context.nextToken();
                    getCustomModelResult.setModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("modelName", targetDepth)) {
                    context.nextToken();
                    getCustomModelResult.setModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobName", targetDepth)) {
                    context.nextToken();
                    getCustomModelResult.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobArn", targetDepth)) {
                    context.nextToken();
                    getCustomModelResult.setJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("baseModelArn", targetDepth)) {
                    context.nextToken();
                    getCustomModelResult.setBaseModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("customizationType", targetDepth)) {
                    context.nextToken();
                    getCustomModelResult.setCustomizationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("modelKmsKeyArn", targetDepth)) {
                    context.nextToken();
                    getCustomModelResult.setModelKmsKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hyperParameters", targetDepth)) {
                    context.nextToken();
                    getCustomModelResult.setHyperParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("trainingDataConfig", targetDepth)) {
                    context.nextToken();
                    getCustomModelResult.setTrainingDataConfig(TrainingDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("validationDataConfig", targetDepth)) {
                    context.nextToken();
                    getCustomModelResult.setValidationDataConfig(ValidationDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("outputDataConfig", targetDepth)) {
                    context.nextToken();
                    getCustomModelResult.setOutputDataConfig(OutputDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("trainingMetrics", targetDepth)) {
                    context.nextToken();
                    getCustomModelResult.setTrainingMetrics(TrainingMetricsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("validationMetrics", targetDepth)) {
                    context.nextToken();
                    getCustomModelResult.setValidationMetrics(new ListUnmarshaller<ValidatorMetric>(ValidatorMetricJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    getCustomModelResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getCustomModelResult;
    }

    private static GetCustomModelResultJsonUnmarshaller instance;

    public static GetCustomModelResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetCustomModelResultJsonUnmarshaller();
        return instance;
    }
}
