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
package com.amazonaws.services.cloudwatchevidently.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudwatchevidently.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Launch JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchJsonUnmarshaller implements Unmarshaller<Launch, JsonUnmarshallerContext> {

    public Launch unmarshall(JsonUnmarshallerContext context) throws Exception {
        Launch launch = new Launch();

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
                    launch.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdTime", targetDepth)) {
                    context.nextToken();
                    launch.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    launch.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("execution", targetDepth)) {
                    context.nextToken();
                    launch.setExecution(LaunchExecutionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("groups", targetDepth)) {
                    context.nextToken();
                    launch.setGroups(new ListUnmarshaller<LaunchGroup>(LaunchGroupJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("lastUpdatedTime", targetDepth)) {
                    context.nextToken();
                    launch.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("metricMonitors", targetDepth)) {
                    context.nextToken();
                    launch.setMetricMonitors(new ListUnmarshaller<MetricMonitor>(MetricMonitorJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    launch.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("project", targetDepth)) {
                    context.nextToken();
                    launch.setProject(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("randomizationSalt", targetDepth)) {
                    context.nextToken();
                    launch.setRandomizationSalt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scheduledSplitsDefinition", targetDepth)) {
                    context.nextToken();
                    launch.setScheduledSplitsDefinition(ScheduledSplitsLaunchDefinitionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    launch.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusReason", targetDepth)) {
                    context.nextToken();
                    launch.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    launch.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    launch.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return launch;
    }

    private static LaunchJsonUnmarshaller instance;

    public static LaunchJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LaunchJsonUnmarshaller();
        return instance;
    }
}
