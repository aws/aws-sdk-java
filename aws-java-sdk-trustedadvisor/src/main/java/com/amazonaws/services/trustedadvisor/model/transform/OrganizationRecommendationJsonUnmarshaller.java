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
 * OrganizationRecommendation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationRecommendationJsonUnmarshaller implements Unmarshaller<OrganizationRecommendation, JsonUnmarshallerContext> {

    public OrganizationRecommendation unmarshall(JsonUnmarshallerContext context) throws Exception {
        OrganizationRecommendation organizationRecommendation = new OrganizationRecommendation();

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
                    organizationRecommendation.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsServices", targetDepth)) {
                    context.nextToken();
                    organizationRecommendation.setAwsServices(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("checkArn", targetDepth)) {
                    context.nextToken();
                    organizationRecommendation.setCheckArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    organizationRecommendation.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    organizationRecommendation.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    organizationRecommendation.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    organizationRecommendation.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    organizationRecommendation.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("lifecycleStage", targetDepth)) {
                    context.nextToken();
                    organizationRecommendation.setLifecycleStage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    organizationRecommendation.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pillarSpecificAggregates", targetDepth)) {
                    context.nextToken();
                    organizationRecommendation.setPillarSpecificAggregates(RecommendationPillarSpecificAggregatesJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("pillars", targetDepth)) {
                    context.nextToken();
                    organizationRecommendation.setPillars(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("resolvedAt", targetDepth)) {
                    context.nextToken();
                    organizationRecommendation.setResolvedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("resourcesAggregates", targetDepth)) {
                    context.nextToken();
                    organizationRecommendation.setResourcesAggregates(RecommendationResourcesAggregatesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("source", targetDepth)) {
                    context.nextToken();
                    organizationRecommendation.setSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    organizationRecommendation.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    organizationRecommendation.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updateReason", targetDepth)) {
                    context.nextToken();
                    organizationRecommendation.setUpdateReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updateReasonCode", targetDepth)) {
                    context.nextToken();
                    organizationRecommendation.setUpdateReasonCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedOnBehalfOf", targetDepth)) {
                    context.nextToken();
                    organizationRecommendation.setUpdatedOnBehalfOf(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedOnBehalfOfJobTitle", targetDepth)) {
                    context.nextToken();
                    organizationRecommendation.setUpdatedOnBehalfOfJobTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return organizationRecommendation;
    }

    private static OrganizationRecommendationJsonUnmarshaller instance;

    public static OrganizationRecommendationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OrganizationRecommendationJsonUnmarshaller();
        return instance;
    }
}
