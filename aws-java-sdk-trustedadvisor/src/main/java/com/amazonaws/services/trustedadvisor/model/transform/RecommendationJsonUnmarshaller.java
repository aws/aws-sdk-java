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
 * Recommendation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationJsonUnmarshaller implements Unmarshaller<Recommendation, JsonUnmarshallerContext> {

    public Recommendation unmarshall(JsonUnmarshallerContext context) throws Exception {
        Recommendation recommendation = new Recommendation();

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
                    recommendation.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsServices", targetDepth)) {
                    context.nextToken();
                    recommendation.setAwsServices(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("checkArn", targetDepth)) {
                    context.nextToken();
                    recommendation.setCheckArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    recommendation.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    recommendation.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    recommendation.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    recommendation.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    recommendation.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("lifecycleStage", targetDepth)) {
                    context.nextToken();
                    recommendation.setLifecycleStage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    recommendation.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pillarSpecificAggregates", targetDepth)) {
                    context.nextToken();
                    recommendation.setPillarSpecificAggregates(RecommendationPillarSpecificAggregatesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("pillars", targetDepth)) {
                    context.nextToken();
                    recommendation.setPillars(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("resolvedAt", targetDepth)) {
                    context.nextToken();
                    recommendation.setResolvedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("resourcesAggregates", targetDepth)) {
                    context.nextToken();
                    recommendation.setResourcesAggregates(RecommendationResourcesAggregatesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("source", targetDepth)) {
                    context.nextToken();
                    recommendation.setSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    recommendation.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    recommendation.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updateReason", targetDepth)) {
                    context.nextToken();
                    recommendation.setUpdateReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updateReasonCode", targetDepth)) {
                    context.nextToken();
                    recommendation.setUpdateReasonCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedOnBehalfOf", targetDepth)) {
                    context.nextToken();
                    recommendation.setUpdatedOnBehalfOf(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedOnBehalfOfJobTitle", targetDepth)) {
                    context.nextToken();
                    recommendation.setUpdatedOnBehalfOfJobTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return recommendation;
    }

    private static RecommendationJsonUnmarshaller instance;

    public static RecommendationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecommendationJsonUnmarshaller();
        return instance;
    }
}
