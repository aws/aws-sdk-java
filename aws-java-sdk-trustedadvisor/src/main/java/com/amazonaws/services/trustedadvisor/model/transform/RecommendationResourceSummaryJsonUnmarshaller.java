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
package com.amazonaws.services.trustedadvisor.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.trustedadvisor.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RecommendationResourceSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationResourceSummaryJsonUnmarshaller implements Unmarshaller<RecommendationResourceSummary, JsonUnmarshallerContext> {

    public RecommendationResourceSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        RecommendationResourceSummary recommendationResourceSummary = new RecommendationResourceSummary();

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
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    recommendationResourceSummary.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsResourceId", targetDepth)) {
                    context.nextToken();
                    recommendationResourceSummary.setAwsResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("exclusionStatus", targetDepth)) {
                    context.nextToken();
                    recommendationResourceSummary.setExclusionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    recommendationResourceSummary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    recommendationResourceSummary.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("metadata", targetDepth)) {
                    context.nextToken();
                    recommendationResourceSummary.setMetadata(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("recommendationArn", targetDepth)) {
                    context.nextToken();
                    recommendationResourceSummary.setRecommendationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("regionCode", targetDepth)) {
                    context.nextToken();
                    recommendationResourceSummary.setRegionCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    recommendationResourceSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return recommendationResourceSummary;
    }

    private static RecommendationResourceSummaryJsonUnmarshaller instance;

    public static RecommendationResourceSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecommendationResourceSummaryJsonUnmarshaller();
        return instance;
    }
}
