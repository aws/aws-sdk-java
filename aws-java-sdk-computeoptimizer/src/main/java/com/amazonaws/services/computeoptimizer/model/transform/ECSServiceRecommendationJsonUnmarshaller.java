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
 * ECSServiceRecommendation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ECSServiceRecommendationJsonUnmarshaller implements Unmarshaller<ECSServiceRecommendation, JsonUnmarshallerContext> {

    public ECSServiceRecommendation unmarshall(JsonUnmarshallerContext context) throws Exception {
        ECSServiceRecommendation eCSServiceRecommendation = new ECSServiceRecommendation();

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
                if (context.testExpression("serviceArn", targetDepth)) {
                    context.nextToken();
                    eCSServiceRecommendation.setServiceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("accountId", targetDepth)) {
                    context.nextToken();
                    eCSServiceRecommendation.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("currentServiceConfiguration", targetDepth)) {
                    context.nextToken();
                    eCSServiceRecommendation.setCurrentServiceConfiguration(ServiceConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("utilizationMetrics", targetDepth)) {
                    context.nextToken();
                    eCSServiceRecommendation.setUtilizationMetrics(new ListUnmarshaller<ECSServiceUtilizationMetric>(
                            ECSServiceUtilizationMetricJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("lookbackPeriodInDays", targetDepth)) {
                    context.nextToken();
                    eCSServiceRecommendation.setLookbackPeriodInDays(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("launchType", targetDepth)) {
                    context.nextToken();
                    eCSServiceRecommendation.setLaunchType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastRefreshTimestamp", targetDepth)) {
                    context.nextToken();
                    eCSServiceRecommendation.setLastRefreshTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("finding", targetDepth)) {
                    context.nextToken();
                    eCSServiceRecommendation.setFinding(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("findingReasonCodes", targetDepth)) {
                    context.nextToken();
                    eCSServiceRecommendation.setFindingReasonCodes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("serviceRecommendationOptions", targetDepth)) {
                    context.nextToken();
                    eCSServiceRecommendation.setServiceRecommendationOptions(new ListUnmarshaller<ECSServiceRecommendationOption>(
                            ECSServiceRecommendationOptionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("currentPerformanceRisk", targetDepth)) {
                    context.nextToken();
                    eCSServiceRecommendation.setCurrentPerformanceRisk(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return eCSServiceRecommendation;
    }

    private static ECSServiceRecommendationJsonUnmarshaller instance;

    public static ECSServiceRecommendationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ECSServiceRecommendationJsonUnmarshaller();
        return instance;
    }
}
