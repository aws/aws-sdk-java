/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ResourceComplianceSummaryItem JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceComplianceSummaryItemJsonUnmarshaller implements Unmarshaller<ResourceComplianceSummaryItem, JsonUnmarshallerContext> {

    public ResourceComplianceSummaryItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        ResourceComplianceSummaryItem resourceComplianceSummaryItem = new ResourceComplianceSummaryItem();

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
                if (context.testExpression("ComplianceType", targetDepth)) {
                    context.nextToken();
                    resourceComplianceSummaryItem.setComplianceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceType", targetDepth)) {
                    context.nextToken();
                    resourceComplianceSummaryItem.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceId", targetDepth)) {
                    context.nextToken();
                    resourceComplianceSummaryItem.setResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    resourceComplianceSummaryItem.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OverallSeverity", targetDepth)) {
                    context.nextToken();
                    resourceComplianceSummaryItem.setOverallSeverity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionSummary", targetDepth)) {
                    context.nextToken();
                    resourceComplianceSummaryItem.setExecutionSummary(ComplianceExecutionSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CompliantSummary", targetDepth)) {
                    context.nextToken();
                    resourceComplianceSummaryItem.setCompliantSummary(CompliantSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NonCompliantSummary", targetDepth)) {
                    context.nextToken();
                    resourceComplianceSummaryItem.setNonCompliantSummary(NonCompliantSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return resourceComplianceSummaryItem;
    }

    private static ResourceComplianceSummaryItemJsonUnmarshaller instance;

    public static ResourceComplianceSummaryItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourceComplianceSummaryItemJsonUnmarshaller();
        return instance;
    }
}
