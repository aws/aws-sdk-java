/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.computeoptimizer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.computeoptimizer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ECSServiceRecommendationOption JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ECSServiceRecommendationOptionJsonUnmarshaller implements Unmarshaller<ECSServiceRecommendationOption, JsonUnmarshallerContext> {

    public ECSServiceRecommendationOption unmarshall(JsonUnmarshallerContext context) throws Exception {
        ECSServiceRecommendationOption eCSServiceRecommendationOption = new ECSServiceRecommendationOption();

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
                if (context.testExpression("memory", targetDepth)) {
                    context.nextToken();
                    eCSServiceRecommendationOption.setMemory(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("cpu", targetDepth)) {
                    context.nextToken();
                    eCSServiceRecommendationOption.setCpu(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("savingsOpportunity", targetDepth)) {
                    context.nextToken();
                    eCSServiceRecommendationOption.setSavingsOpportunity(SavingsOpportunityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("projectedUtilizationMetrics", targetDepth)) {
                    context.nextToken();
                    eCSServiceRecommendationOption.setProjectedUtilizationMetrics(new ListUnmarshaller<ECSServiceProjectedUtilizationMetric>(
                            ECSServiceProjectedUtilizationMetricJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("containerRecommendations", targetDepth)) {
                    context.nextToken();
                    eCSServiceRecommendationOption.setContainerRecommendations(new ListUnmarshaller<ContainerRecommendation>(
                            ContainerRecommendationJsonUnmarshaller.getInstance())

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

        return eCSServiceRecommendationOption;
    }

    private static ECSServiceRecommendationOptionJsonUnmarshaller instance;

    public static ECSServiceRecommendationOptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ECSServiceRecommendationOptionJsonUnmarshaller();
        return instance;
    }
}
