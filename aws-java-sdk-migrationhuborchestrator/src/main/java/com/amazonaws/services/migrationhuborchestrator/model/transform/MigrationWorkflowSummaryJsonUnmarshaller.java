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
package com.amazonaws.services.migrationhuborchestrator.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.migrationhuborchestrator.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MigrationWorkflowSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MigrationWorkflowSummaryJsonUnmarshaller implements Unmarshaller<MigrationWorkflowSummary, JsonUnmarshallerContext> {

    public MigrationWorkflowSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        MigrationWorkflowSummary migrationWorkflowSummary = new MigrationWorkflowSummary();

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
                    migrationWorkflowSummary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    migrationWorkflowSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("templateId", targetDepth)) {
                    context.nextToken();
                    migrationWorkflowSummary.setTemplateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("adsApplicationConfigurationName", targetDepth)) {
                    context.nextToken();
                    migrationWorkflowSummary.setAdsApplicationConfigurationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    migrationWorkflowSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    migrationWorkflowSummary.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    migrationWorkflowSummary.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    context.nextToken();
                    migrationWorkflowSummary.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("completedSteps", targetDepth)) {
                    context.nextToken();
                    migrationWorkflowSummary.setCompletedSteps(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("totalSteps", targetDepth)) {
                    context.nextToken();
                    migrationWorkflowSummary.setTotalSteps(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return migrationWorkflowSummary;
    }

    private static MigrationWorkflowSummaryJsonUnmarshaller instance;

    public static MigrationWorkflowSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MigrationWorkflowSummaryJsonUnmarshaller();
        return instance;
    }
}
