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
 * OrganizationRecommendationResourceSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationRecommendationResourceSummaryJsonUnmarshaller implements
        Unmarshaller<OrganizationRecommendationResourceSummary, JsonUnmarshallerContext> {

    public OrganizationRecommendationResourceSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        OrganizationRecommendationResourceSummary organizationRecommendationResourceSummary = new OrganizationRecommendationResourceSummary();

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
                    organizationRecommendationResourceSummary.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    organizationRecommendationResourceSummary.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsResourceId", targetDepth)) {
                    context.nextToken();
                    organizationRecommendationResourceSummary.setAwsResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("exclusionStatus", targetDepth)) {
                    context.nextToken();
                    organizationRecommendationResourceSummary.setExclusionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    organizationRecommendationResourceSummary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    organizationRecommendationResourceSummary.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("metadata", targetDepth)) {
                    context.nextToken();
                    organizationRecommendationResourceSummary.setMetadata(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("recommendationArn", targetDepth)) {
                    context.nextToken();
                    organizationRecommendationResourceSummary.setRecommendationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("regionCode", targetDepth)) {
                    context.nextToken();
                    organizationRecommendationResourceSummary.setRegionCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    organizationRecommendationResourceSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return organizationRecommendationResourceSummary;
    }

    private static OrganizationRecommendationResourceSummaryJsonUnmarshaller instance;

    public static OrganizationRecommendationResourceSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OrganizationRecommendationResourceSummaryJsonUnmarshaller();
        return instance;
    }
}
