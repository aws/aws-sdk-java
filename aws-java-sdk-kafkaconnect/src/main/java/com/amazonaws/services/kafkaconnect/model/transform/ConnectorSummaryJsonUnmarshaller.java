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
 * ConnectorSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorSummaryJsonUnmarshaller implements Unmarshaller<ConnectorSummary, JsonUnmarshallerContext> {

    public ConnectorSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConnectorSummary connectorSummary = new ConnectorSummary();

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
                if (context.testExpression("capacity", targetDepth)) {
                    context.nextToken();
                    connectorSummary.setCapacity(CapacityDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("connectorArn", targetDepth)) {
                    context.nextToken();
                    connectorSummary.setConnectorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorDescription", targetDepth)) {
                    context.nextToken();
                    connectorSummary.setConnectorDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorName", targetDepth)) {
                    context.nextToken();
                    connectorSummary.setConnectorName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorState", targetDepth)) {
                    context.nextToken();
                    connectorSummary.setConnectorState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    connectorSummary.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("currentVersion", targetDepth)) {
                    context.nextToken();
                    connectorSummary.setCurrentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("kafkaCluster", targetDepth)) {
                    context.nextToken();
                    connectorSummary.setKafkaCluster(KafkaClusterDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("kafkaClusterClientAuthentication", targetDepth)) {
                    context.nextToken();
                    connectorSummary.setKafkaClusterClientAuthentication(KafkaClusterClientAuthenticationDescriptionJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("kafkaClusterEncryptionInTransit", targetDepth)) {
                    context.nextToken();
                    connectorSummary.setKafkaClusterEncryptionInTransit(KafkaClusterEncryptionInTransitDescriptionJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("kafkaConnectVersion", targetDepth)) {
                    context.nextToken();
                    connectorSummary.setKafkaConnectVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("logDelivery", targetDepth)) {
                    context.nextToken();
                    connectorSummary.setLogDelivery(LogDeliveryDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("plugins", targetDepth)) {
                    context.nextToken();
                    connectorSummary.setPlugins(new ListUnmarshaller<PluginDescription>(PluginDescriptionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("serviceExecutionRoleArn", targetDepth)) {
                    context.nextToken();
                    connectorSummary.setServiceExecutionRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workerConfiguration", targetDepth)) {
                    context.nextToken();
                    connectorSummary.setWorkerConfiguration(WorkerConfigurationDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return connectorSummary;
    }

    private static ConnectorSummaryJsonUnmarshaller instance;

    public static ConnectorSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConnectorSummaryJsonUnmarshaller();
        return instance;
    }
}
