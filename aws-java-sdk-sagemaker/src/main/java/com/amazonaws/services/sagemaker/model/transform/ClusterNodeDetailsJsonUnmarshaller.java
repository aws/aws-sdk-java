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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ClusterNodeDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterNodeDetailsJsonUnmarshaller implements Unmarshaller<ClusterNodeDetails, JsonUnmarshallerContext> {

    public ClusterNodeDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        ClusterNodeDetails clusterNodeDetails = new ClusterNodeDetails();

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
                if (context.testExpression("InstanceGroupName", targetDepth)) {
                    context.nextToken();
                    clusterNodeDetails.setInstanceGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceId", targetDepth)) {
                    context.nextToken();
                    clusterNodeDetails.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceStatus", targetDepth)) {
                    context.nextToken();
                    clusterNodeDetails.setInstanceStatus(ClusterInstanceStatusDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    context.nextToken();
                    clusterNodeDetails.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LaunchTime", targetDepth)) {
                    context.nextToken();
                    clusterNodeDetails.setLaunchTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LifeCycleConfig", targetDepth)) {
                    context.nextToken();
                    clusterNodeDetails.setLifeCycleConfig(ClusterLifeCycleConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ThreadsPerCore", targetDepth)) {
                    context.nextToken();
                    clusterNodeDetails.setThreadsPerCore(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return clusterNodeDetails;
    }

    private static ClusterNodeDetailsJsonUnmarshaller instance;

    public static ClusterNodeDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClusterNodeDetailsJsonUnmarshaller();
        return instance;
    }
}
