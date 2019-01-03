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
package com.amazonaws.services.kafka.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kafka.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ClusterInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterInfoJsonUnmarshaller implements Unmarshaller<ClusterInfo, JsonUnmarshallerContext> {

    public ClusterInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        ClusterInfo clusterInfo = new ClusterInfo();

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
                if (context.testExpression("brokerNodeGroupInfo", targetDepth)) {
                    context.nextToken();
                    clusterInfo.setBrokerNodeGroupInfo(BrokerNodeGroupInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("clusterArn", targetDepth)) {
                    context.nextToken();
                    clusterInfo.setClusterArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterName", targetDepth)) {
                    context.nextToken();
                    clusterInfo.setClusterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    clusterInfo.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("currentBrokerSoftwareInfo", targetDepth)) {
                    context.nextToken();
                    clusterInfo.setCurrentBrokerSoftwareInfo(BrokerSoftwareInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("currentVersion", targetDepth)) {
                    context.nextToken();
                    clusterInfo.setCurrentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("encryptionInfo", targetDepth)) {
                    context.nextToken();
                    clusterInfo.setEncryptionInfo(EncryptionInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("enhancedMonitoring", targetDepth)) {
                    context.nextToken();
                    clusterInfo.setEnhancedMonitoring(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("numberOfBrokerNodes", targetDepth)) {
                    context.nextToken();
                    clusterInfo.setNumberOfBrokerNodes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    clusterInfo.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("zookeeperConnectString", targetDepth)) {
                    context.nextToken();
                    clusterInfo.setZookeeperConnectString(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return clusterInfo;
    }

    private static ClusterInfoJsonUnmarshaller instance;

    public static ClusterInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClusterInfoJsonUnmarshaller();
        return instance;
    }
}
