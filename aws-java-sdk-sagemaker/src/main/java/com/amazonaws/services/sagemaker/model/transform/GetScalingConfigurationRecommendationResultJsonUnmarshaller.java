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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetScalingConfigurationRecommendationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetScalingConfigurationRecommendationResultJsonUnmarshaller implements
        Unmarshaller<GetScalingConfigurationRecommendationResult, JsonUnmarshallerContext> {

    public GetScalingConfigurationRecommendationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetScalingConfigurationRecommendationResult getScalingConfigurationRecommendationResult = new GetScalingConfigurationRecommendationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getScalingConfigurationRecommendationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("InferenceRecommendationsJobName", targetDepth)) {
                    context.nextToken();
                    getScalingConfigurationRecommendationResult.setInferenceRecommendationsJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecommendationId", targetDepth)) {
                    context.nextToken();
                    getScalingConfigurationRecommendationResult.setRecommendationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointName", targetDepth)) {
                    context.nextToken();
                    getScalingConfigurationRecommendationResult.setEndpointName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetCpuUtilizationPerCore", targetDepth)) {
                    context.nextToken();
                    getScalingConfigurationRecommendationResult.setTargetCpuUtilizationPerCore(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ScalingPolicyObjective", targetDepth)) {
                    context.nextToken();
                    getScalingConfigurationRecommendationResult.setScalingPolicyObjective(ScalingPolicyObjectiveJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("Metric", targetDepth)) {
                    context.nextToken();
                    getScalingConfigurationRecommendationResult.setMetric(ScalingPolicyMetricJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DynamicScalingConfiguration", targetDepth)) {
                    context.nextToken();
                    getScalingConfigurationRecommendationResult.setDynamicScalingConfiguration(DynamicScalingConfigurationJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getScalingConfigurationRecommendationResult;
    }

    private static GetScalingConfigurationRecommendationResultJsonUnmarshaller instance;

    public static GetScalingConfigurationRecommendationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetScalingConfigurationRecommendationResultJsonUnmarshaller();
        return instance;
    }
}
