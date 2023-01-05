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
package com.amazonaws.services.docdbelastic.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.docdbelastic.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ClusterSnapshot JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterSnapshotJsonUnmarshaller implements Unmarshaller<ClusterSnapshot, JsonUnmarshallerContext> {

    public ClusterSnapshot unmarshall(JsonUnmarshallerContext context) throws Exception {
        ClusterSnapshot clusterSnapshot = new ClusterSnapshot();

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
                if (context.testExpression("adminUserName", targetDepth)) {
                    context.nextToken();
                    clusterSnapshot.setAdminUserName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterArn", targetDepth)) {
                    context.nextToken();
                    clusterSnapshot.setClusterArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterCreationTime", targetDepth)) {
                    context.nextToken();
                    clusterSnapshot.setClusterCreationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("kmsKeyId", targetDepth)) {
                    context.nextToken();
                    clusterSnapshot.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("snapshotArn", targetDepth)) {
                    context.nextToken();
                    clusterSnapshot.setSnapshotArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("snapshotCreationTime", targetDepth)) {
                    context.nextToken();
                    clusterSnapshot.setSnapshotCreationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("snapshotName", targetDepth)) {
                    context.nextToken();
                    clusterSnapshot.setSnapshotName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    clusterSnapshot.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subnetIds", targetDepth)) {
                    context.nextToken();
                    clusterSnapshot.setSubnetIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("vpcSecurityGroupIds", targetDepth)) {
                    context.nextToken();
                    clusterSnapshot.setVpcSecurityGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return clusterSnapshot;
    }

    private static ClusterSnapshotJsonUnmarshaller instance;

    public static ClusterSnapshotJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClusterSnapshotJsonUnmarshaller();
        return instance;
    }
}
