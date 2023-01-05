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
package com.amazonaws.services.devopsguru.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.devopsguru.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ProactiveOrganizationInsightSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProactiveOrganizationInsightSummaryJsonUnmarshaller implements Unmarshaller<ProactiveOrganizationInsightSummary, JsonUnmarshallerContext> {

    public ProactiveOrganizationInsightSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProactiveOrganizationInsightSummary proactiveOrganizationInsightSummary = new ProactiveOrganizationInsightSummary();

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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    proactiveOrganizationInsightSummary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccountId", targetDepth)) {
                    context.nextToken();
                    proactiveOrganizationInsightSummary.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OrganizationalUnitId", targetDepth)) {
                    context.nextToken();
                    proactiveOrganizationInsightSummary.setOrganizationalUnitId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    proactiveOrganizationInsightSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Severity", targetDepth)) {
                    context.nextToken();
                    proactiveOrganizationInsightSummary.setSeverity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    proactiveOrganizationInsightSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InsightTimeRange", targetDepth)) {
                    context.nextToken();
                    proactiveOrganizationInsightSummary.setInsightTimeRange(InsightTimeRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PredictionTimeRange", targetDepth)) {
                    context.nextToken();
                    proactiveOrganizationInsightSummary.setPredictionTimeRange(PredictionTimeRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResourceCollection", targetDepth)) {
                    context.nextToken();
                    proactiveOrganizationInsightSummary.setResourceCollection(ResourceCollectionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ServiceCollection", targetDepth)) {
                    context.nextToken();
                    proactiveOrganizationInsightSummary.setServiceCollection(ServiceCollectionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return proactiveOrganizationInsightSummary;
    }

    private static ProactiveOrganizationInsightSummaryJsonUnmarshaller instance;

    public static ProactiveOrganizationInsightSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProactiveOrganizationInsightSummaryJsonUnmarshaller();
        return instance;
    }
}
