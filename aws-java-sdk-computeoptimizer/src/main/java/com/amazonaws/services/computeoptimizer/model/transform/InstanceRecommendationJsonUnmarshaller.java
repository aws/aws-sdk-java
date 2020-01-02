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
 * InstanceRecommendation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceRecommendationJsonUnmarshaller implements Unmarshaller<InstanceRecommendation, JsonUnmarshallerContext> {

    public InstanceRecommendation unmarshall(JsonUnmarshallerContext context) throws Exception {
        InstanceRecommendation instanceRecommendation = new InstanceRecommendation();

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
                if (context.testExpression("instanceArn", targetDepth)) {
                    context.nextToken();
                    instanceRecommendation.setInstanceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("accountId", targetDepth)) {
                    context.nextToken();
                    instanceRecommendation.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceName", targetDepth)) {
                    context.nextToken();
                    instanceRecommendation.setInstanceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("currentInstanceType", targetDepth)) {
                    context.nextToken();
                    instanceRecommendation.setCurrentInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("finding", targetDepth)) {
                    context.nextToken();
                    instanceRecommendation.setFinding(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("utilizationMetrics", targetDepth)) {
                    context.nextToken();
                    instanceRecommendation.setUtilizationMetrics(new ListUnmarshaller<UtilizationMetric>(UtilizationMetricJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("lookBackPeriodInDays", targetDepth)) {
                    context.nextToken();
                    instanceRecommendation.setLookBackPeriodInDays(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("recommendationOptions", targetDepth)) {
                    context.nextToken();
                    instanceRecommendation.setRecommendationOptions(new ListUnmarshaller<InstanceRecommendationOption>(
                            InstanceRecommendationOptionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("recommendationSources", targetDepth)) {
                    context.nextToken();
                    instanceRecommendation.setRecommendationSources(new ListUnmarshaller<RecommendationSource>(RecommendationSourceJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("lastRefreshTimestamp", targetDepth)) {
                    context.nextToken();
                    instanceRecommendation.setLastRefreshTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return instanceRecommendation;
    }

    private static InstanceRecommendationJsonUnmarshaller instance;

    public static InstanceRecommendationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceRecommendationJsonUnmarshaller();
        return instance;
    }
}
