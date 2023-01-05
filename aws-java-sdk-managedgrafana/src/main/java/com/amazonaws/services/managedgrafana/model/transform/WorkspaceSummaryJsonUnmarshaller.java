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
package com.amazonaws.services.managedgrafana.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.managedgrafana.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WorkspaceSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkspaceSummaryJsonUnmarshaller implements Unmarshaller<WorkspaceSummary, JsonUnmarshallerContext> {

    public WorkspaceSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        WorkspaceSummary workspaceSummary = new WorkspaceSummary();

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
                if (context.testExpression("authentication", targetDepth)) {
                    context.nextToken();
                    workspaceSummary.setAuthentication(AuthenticationSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("created", targetDepth)) {
                    context.nextToken();
                    workspaceSummary.setCreated(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    workspaceSummary.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endpoint", targetDepth)) {
                    context.nextToken();
                    workspaceSummary.setEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("grafanaVersion", targetDepth)) {
                    context.nextToken();
                    workspaceSummary.setGrafanaVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    workspaceSummary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("modified", targetDepth)) {
                    context.nextToken();
                    workspaceSummary.setModified(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    workspaceSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("notificationDestinations", targetDepth)) {
                    context.nextToken();
                    workspaceSummary.setNotificationDestinations(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    workspaceSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    workspaceSummary.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return workspaceSummary;
    }

    private static WorkspaceSummaryJsonUnmarshaller instance;

    public static WorkspaceSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkspaceSummaryJsonUnmarshaller();
        return instance;
    }
}
