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
package com.amazonaws.services.memorydb.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.memorydb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ClusterConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterConfigurationJsonUnmarshaller implements Unmarshaller<ClusterConfiguration, JsonUnmarshallerContext> {

    public ClusterConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        ClusterConfiguration clusterConfiguration = new ClusterConfiguration();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    clusterConfiguration.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    clusterConfiguration.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NodeType", targetDepth)) {
                    context.nextToken();
                    clusterConfiguration.setNodeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    context.nextToken();
                    clusterConfiguration.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaintenanceWindow", targetDepth)) {
                    context.nextToken();
                    clusterConfiguration.setMaintenanceWindow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TopicArn", targetDepth)) {
                    context.nextToken();
                    clusterConfiguration.setTopicArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Port", targetDepth)) {
                    context.nextToken();
                    clusterConfiguration.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ParameterGroupName", targetDepth)) {
                    context.nextToken();
                    clusterConfiguration.setParameterGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetGroupName", targetDepth)) {
                    context.nextToken();
                    clusterConfiguration.setSubnetGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    context.nextToken();
                    clusterConfiguration.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotRetentionLimit", targetDepth)) {
                    context.nextToken();
                    clusterConfiguration.setSnapshotRetentionLimit(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotWindow", targetDepth)) {
                    context.nextToken();
                    clusterConfiguration.setSnapshotWindow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumShards", targetDepth)) {
                    context.nextToken();
                    clusterConfiguration.setNumShards(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Shards", targetDepth)) {
                    context.nextToken();
                    clusterConfiguration.setShards(new ListUnmarshaller<ShardDetail>(ShardDetailJsonUnmarshaller.getInstance())

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

        return clusterConfiguration;
    }

    private static ClusterConfigurationJsonUnmarshaller instance;

    public static ClusterConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClusterConfigurationJsonUnmarshaller();
        return instance;
    }
}
