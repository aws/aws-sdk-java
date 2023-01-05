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
package com.amazonaws.services.kafkaconnect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kafkaconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeConnectorResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConnectorResultJsonUnmarshaller implements Unmarshaller<DescribeConnectorResult, JsonUnmarshallerContext> {

    public DescribeConnectorResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeConnectorResult describeConnectorResult = new DescribeConnectorResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeConnectorResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("capacity", targetDepth)) {
                    context.nextToken();
                    describeConnectorResult.setCapacity(CapacityDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("connectorArn", targetDepth)) {
                    context.nextToken();
                    describeConnectorResult.setConnectorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorConfiguration", targetDepth)) {
                    context.nextToken();
                    describeConnectorResult.setConnectorConfiguration(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("connectorDescription", targetDepth)) {
                    context.nextToken();
                    describeConnectorResult.setConnectorDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorName", targetDepth)) {
                    context.nextToken();
                    describeConnectorResult.setConnectorName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorState", targetDepth)) {
                    context.nextToken();
                    describeConnectorResult.setConnectorState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    describeConnectorResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("currentVersion", targetDepth)) {
                    context.nextToken();
                    describeConnectorResult.setCurrentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("kafkaCluster", targetDepth)) {
                    context.nextToken();
                    describeConnectorResult.setKafkaCluster(KafkaClusterDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("kafkaClusterClientAuthentication", targetDepth)) {
                    context.nextToken();
                    describeConnectorResult.setKafkaClusterClientAuthentication(KafkaClusterClientAuthenticationDescriptionJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("kafkaClusterEncryptionInTransit", targetDepth)) {
                    context.nextToken();
                    describeConnectorResult.setKafkaClusterEncryptionInTransit(KafkaClusterEncryptionInTransitDescriptionJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("kafkaConnectVersion", targetDepth)) {
                    context.nextToken();
                    describeConnectorResult.setKafkaConnectVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("logDelivery", targetDepth)) {
                    context.nextToken();
                    describeConnectorResult.setLogDelivery(LogDeliveryDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("plugins", targetDepth)) {
                    context.nextToken();
                    describeConnectorResult.setPlugins(new ListUnmarshaller<PluginDescription>(PluginDescriptionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("serviceExecutionRoleArn", targetDepth)) {
                    context.nextToken();
                    describeConnectorResult.setServiceExecutionRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stateDescription", targetDepth)) {
                    context.nextToken();
                    describeConnectorResult.setStateDescription(StateDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("workerConfiguration", targetDepth)) {
                    context.nextToken();
                    describeConnectorResult.setWorkerConfiguration(WorkerConfigurationDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeConnectorResult;
    }

    private static DescribeConnectorResultJsonUnmarshaller instance;

    public static DescribeConnectorResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeConnectorResultJsonUnmarshaller();
        return instance;
    }
}
