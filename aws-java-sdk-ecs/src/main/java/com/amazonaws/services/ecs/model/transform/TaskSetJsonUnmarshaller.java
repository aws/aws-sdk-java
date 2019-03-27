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
package com.amazonaws.services.ecs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TaskSet JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskSetJsonUnmarshaller implements Unmarshaller<TaskSet, JsonUnmarshallerContext> {

    public TaskSet unmarshall(JsonUnmarshallerContext context) throws Exception {
        TaskSet taskSet = new TaskSet();

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
                    taskSet.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskSetArn", targetDepth)) {
                    context.nextToken();
                    taskSet.setTaskSetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceArn", targetDepth)) {
                    context.nextToken();
                    taskSet.setServiceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterArn", targetDepth)) {
                    context.nextToken();
                    taskSet.setClusterArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startedBy", targetDepth)) {
                    context.nextToken();
                    taskSet.setStartedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("externalId", targetDepth)) {
                    context.nextToken();
                    taskSet.setExternalId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    taskSet.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskDefinition", targetDepth)) {
                    context.nextToken();
                    taskSet.setTaskDefinition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("computedDesiredCount", targetDepth)) {
                    context.nextToken();
                    taskSet.setComputedDesiredCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pendingCount", targetDepth)) {
                    context.nextToken();
                    taskSet.setPendingCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("runningCount", targetDepth)) {
                    context.nextToken();
                    taskSet.setRunningCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    taskSet.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    taskSet.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("launchType", targetDepth)) {
                    context.nextToken();
                    taskSet.setLaunchType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("platformVersion", targetDepth)) {
                    context.nextToken();
                    taskSet.setPlatformVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("networkConfiguration", targetDepth)) {
                    context.nextToken();
                    taskSet.setNetworkConfiguration(NetworkConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("loadBalancers", targetDepth)) {
                    context.nextToken();
                    taskSet.setLoadBalancers(new ListUnmarshaller<LoadBalancer>(LoadBalancerJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("serviceRegistries", targetDepth)) {
                    context.nextToken();
                    taskSet.setServiceRegistries(new ListUnmarshaller<ServiceRegistry>(ServiceRegistryJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("scale", targetDepth)) {
                    context.nextToken();
                    taskSet.setScale(ScaleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("stabilityStatus", targetDepth)) {
                    context.nextToken();
                    taskSet.setStabilityStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stabilityStatusAt", targetDepth)) {
                    context.nextToken();
                    taskSet.setStabilityStatusAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return taskSet;
    }

    private static TaskSetJsonUnmarshaller instance;

    public static TaskSetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TaskSetJsonUnmarshaller();
        return instance;
    }
}
