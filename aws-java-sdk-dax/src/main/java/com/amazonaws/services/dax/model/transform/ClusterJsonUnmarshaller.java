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
package com.amazonaws.services.dax.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.dax.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Cluster JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterJsonUnmarshaller implements Unmarshaller<Cluster, JsonUnmarshallerContext> {

    public Cluster unmarshall(JsonUnmarshallerContext context) throws Exception {
        Cluster cluster = new Cluster();

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
                if (context.testExpression("ClusterName", targetDepth)) {
                    context.nextToken();
                    cluster.setClusterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    cluster.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterArn", targetDepth)) {
                    context.nextToken();
                    cluster.setClusterArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TotalNodes", targetDepth)) {
                    context.nextToken();
                    cluster.setTotalNodes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ActiveNodes", targetDepth)) {
                    context.nextToken();
                    cluster.setActiveNodes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("NodeType", targetDepth)) {
                    context.nextToken();
                    cluster.setNodeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    cluster.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterDiscoveryEndpoint", targetDepth)) {
                    context.nextToken();
                    cluster.setClusterDiscoveryEndpoint(EndpointJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NodeIdsToRemove", targetDepth)) {
                    context.nextToken();
                    cluster.setNodeIdsToRemove(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Nodes", targetDepth)) {
                    context.nextToken();
                    cluster.setNodes(new ListUnmarshaller<Node>(NodeJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("PreferredMaintenanceWindow", targetDepth)) {
                    context.nextToken();
                    cluster.setPreferredMaintenanceWindow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotificationConfiguration", targetDepth)) {
                    context.nextToken();
                    cluster.setNotificationConfiguration(NotificationConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SubnetGroup", targetDepth)) {
                    context.nextToken();
                    cluster.setSubnetGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityGroups", targetDepth)) {
                    context.nextToken();
                    cluster.setSecurityGroups(new ListUnmarshaller<SecurityGroupMembership>(SecurityGroupMembershipJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("IamRoleArn", targetDepth)) {
                    context.nextToken();
                    cluster.setIamRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParameterGroup", targetDepth)) {
                    context.nextToken();
                    cluster.setParameterGroup(ParameterGroupStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SSEDescription", targetDepth)) {
                    context.nextToken();
                    cluster.setSSEDescription(SSEDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return cluster;
    }

    private static ClusterJsonUnmarshaller instance;

    public static ClusterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClusterJsonUnmarshaller();
        return instance;
    }
}
