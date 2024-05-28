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
package com.amazonaws.services.eks.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.eks.model.*;
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
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    insight.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    insight.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("category", targetDepth)) {
                    context.nextToken();
                    insight.setCategory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("kubernetesVersion", targetDepth)) {
                    context.nextToken();
                    insight.setKubernetesVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastRefreshTime", targetDepth)) {
                    context.nextToken();
                    insight.setLastRefreshTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastTransitionTime", targetDepth)) {
                    context.nextToken();
                    insight.setLastTransitionTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    insight.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("insightStatus", targetDepth)) {
                    context.nextToken();
                    insight.setInsightStatus(InsightStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("recommendation", targetDepth)) {
                    context.nextToken();
                    insight.setRecommendation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("additionalInfo", targetDepth)) {
                    context.nextToken();
                    insight.setAdditionalInfo(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("resources", targetDepth)) {
                    context.nextToken();
                    insight.setResources(new ListUnmarshaller<InsightResourceDetail>(InsightResourceDetailJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("categorySpecificSummary", targetDepth)) {
                    context.nextToken();
                    insight.setCategorySpecificSummary(InsightCategorySpecificSummaryJsonUnmarshaller.getInstance().unmarshall(context));
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
