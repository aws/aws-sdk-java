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
package com.amazonaws.services.pi.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pi.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Insight JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightJsonUnmarshaller implements Unmarshaller<Insight, JsonUnmarshallerContext> {

    public Insight unmarshall(JsonUnmarshallerContext context) throws Exception {
        Insight insight = new Insight();

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
                if (context.testExpression("InsightId", targetDepth)) {
                    context.nextToken();
                    insight.setInsightId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InsightType", targetDepth)) {
                    context.nextToken();
                    insight.setInsightType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Context", targetDepth)) {
                    context.nextToken();
                    insight.setContext(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    insight.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    insight.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Severity", targetDepth)) {
                    context.nextToken();
                    insight.setSeverity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SupportingInsights", targetDepth)) {
                    context.nextToken();
                    insight.setSupportingInsights(new ListUnmarshaller<Insight>(InsightJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    insight.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Recommendations", targetDepth)) {
                    context.nextToken();
                    insight.setRecommendations(new ListUnmarshaller<Recommendation>(RecommendationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("InsightData", targetDepth)) {
                    context.nextToken();
                    insight.setInsightData(new ListUnmarshaller<Data>(DataJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("BaselineData", targetDepth)) {
                    context.nextToken();
                    insight.setBaselineData(new ListUnmarshaller<Data>(DataJsonUnmarshaller.getInstance())

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

        return insight;
    }

    private static InsightJsonUnmarshaller instance;

    public static InsightJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InsightJsonUnmarshaller();
        return instance;
    }
}
