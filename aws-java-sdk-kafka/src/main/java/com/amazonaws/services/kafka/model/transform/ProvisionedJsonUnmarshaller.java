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
package com.amazonaws.services.kafka.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kafka.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Provisioned JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionedJsonUnmarshaller implements Unmarshaller<Provisioned, JsonUnmarshallerContext> {

    public Provisioned unmarshall(JsonUnmarshallerContext context) throws Exception {
        Provisioned provisioned = new Provisioned();

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
                    provisioned.setBrokerNodeGroupInfo(BrokerNodeGroupInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("currentBrokerSoftwareInfo", targetDepth)) {
                    context.nextToken();
                    provisioned.setCurrentBrokerSoftwareInfo(BrokerSoftwareInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("clientAuthentication", targetDepth)) {
                    context.nextToken();
                    provisioned.setClientAuthentication(ClientAuthenticationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("encryptionInfo", targetDepth)) {
                    context.nextToken();
                    provisioned.setEncryptionInfo(EncryptionInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("enhancedMonitoring", targetDepth)) {
                    context.nextToken();
                    provisioned.setEnhancedMonitoring(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("openMonitoring", targetDepth)) {
                    context.nextToken();
                    provisioned.setOpenMonitoring(OpenMonitoringInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("loggingInfo", targetDepth)) {
                    context.nextToken();
                    provisioned.setLoggingInfo(LoggingInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("numberOfBrokerNodes", targetDepth)) {
                    context.nextToken();
                    provisioned.setNumberOfBrokerNodes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("zookeeperConnectString", targetDepth)) {
                    context.nextToken();
                    provisioned.setZookeeperConnectString(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("zookeeperConnectStringTls", targetDepth)) {
                    context.nextToken();
                    provisioned.setZookeeperConnectStringTls(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("storageMode", targetDepth)) {
                    context.nextToken();
                    provisioned.setStorageMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return provisioned;
    }

    private static ProvisionedJsonUnmarshaller instance;

    public static ProvisionedJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProvisionedJsonUnmarshaller();
        return instance;
    }
}
