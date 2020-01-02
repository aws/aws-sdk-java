/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AutoScalingGroupRecommendation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoScalingGroupRecommendationJsonUnmarshaller implements Unmarshaller<AutoScalingGroupRecommendation, JsonUnmarshallerContext> {

    public AutoScalingGroupRecommendation unmarshall(JsonUnmarshallerContext context) throws Exception {
        AutoScalingGroupRecommendation autoScalingGroupRecommendation = new AutoScalingGroupRecommendation();

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
                if (context.testExpression("accountId", targetDepth)) {
                    context.nextToken();
                    autoScalingGroupRecommendation.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("autoScalingGroupArn", targetDepth)) {
                    context.nextToken();
                    autoScalingGroupRecommendation.setAutoScalingGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("autoScalingGroupName", targetDepth)) {
                    context.nextToken();
                    autoScalingGroupRecommendation.setAutoScalingGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("finding", targetDepth)) {
                    context.nextToken();
                    autoScalingGroupRecommendation.setFinding(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("utilizationMetrics", targetDepth)) {
                    context.nextToken();
                    autoScalingGroupRecommendation.setUtilizationMetrics(new ListUnmarshaller<UtilizationMetric>(UtilizationMetricJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("lookBackPeriodInDays", targetDepth)) {
                    context.nextToken();
                    autoScalingGroupRecommendation.setLookBackPeriodInDays(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("currentConfiguration", targetDepth)) {
                    context.nextToken();
                    autoScalingGroupRecommendation.setCurrentConfiguration(AutoScalingGroupConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("recommendationOptions", targetDepth)) {
                    context.nextToken();
                    autoScalingGroupRecommendation.setRecommendationOptions(new ListUnmarshaller<AutoScalingGroupRecommendationOption>(
                            AutoScalingGroupRecommendationOptionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("lastRefreshTimestamp", targetDepth)) {
                    context.nextToken();
                    autoScalingGroupRecommendation.setLastRefreshTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return autoScalingGroupRecommendation;
    }

    private static AutoScalingGroupRecommendationJsonUnmarshaller instance;

    public static AutoScalingGroupRecommendationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AutoScalingGroupRecommendationJsonUnmarshaller();
        return instance;
    }
}
