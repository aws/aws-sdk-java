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
package com.amazonaws.services.servermigration.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.servermigration.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AppSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppSummaryJsonUnmarshaller implements Unmarshaller<AppSummary, JsonUnmarshallerContext> {

    public AppSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AppSummary appSummary = new AppSummary();

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
                if (context.testExpression("appId", targetDepth)) {
                    context.nextToken();
                    appSummary.setAppId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    appSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    appSummary.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    appSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    context.nextToken();
                    appSummary.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replicationStatus", targetDepth)) {
                    context.nextToken();
                    appSummary.setReplicationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replicationStatusMessage", targetDepth)) {
                    context.nextToken();
                    appSummary.setReplicationStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("latestReplicationTime", targetDepth)) {
                    context.nextToken();
                    appSummary.setLatestReplicationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("launchStatus", targetDepth)) {
                    context.nextToken();
                    appSummary.setLaunchStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("launchStatusMessage", targetDepth)) {
                    context.nextToken();
                    appSummary.setLaunchStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("launchDetails", targetDepth)) {
                    context.nextToken();
                    appSummary.setLaunchDetails(LaunchDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    appSummary.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastModified", targetDepth)) {
                    context.nextToken();
                    appSummary.setLastModified(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("roleName", targetDepth)) {
                    context.nextToken();
                    appSummary.setRoleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("totalServerGroups", targetDepth)) {
                    context.nextToken();
                    appSummary.setTotalServerGroups(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("totalServers", targetDepth)) {
                    context.nextToken();
                    appSummary.setTotalServers(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return appSummary;
    }

    private static AppSummaryJsonUnmarshaller instance;

    public static AppSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AppSummaryJsonUnmarshaller();
        return instance;
    }
}
