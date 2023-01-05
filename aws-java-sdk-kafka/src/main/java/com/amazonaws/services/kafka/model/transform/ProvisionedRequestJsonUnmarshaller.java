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
 * ProvisionedRequest JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionedRequestJsonUnmarshaller implements Unmarshaller<ProvisionedRequest, JsonUnmarshallerContext> {

    public ProvisionedRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProvisionedRequest provisionedRequest = new ProvisionedRequest();

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
                    provisionedRequest.setBrokerNodeGroupInfo(BrokerNodeGroupInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("clientAuthentication", targetDepth)) {
                    context.nextToken();
                    provisionedRequest.setClientAuthentication(ClientAuthenticationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("configurationInfo", targetDepth)) {
                    context.nextToken();
                    provisionedRequest.setConfigurationInfo(ConfigurationInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("encryptionInfo", targetDepth)) {
                    context.nextToken();
                    provisionedRequest.setEncryptionInfo(EncryptionInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("enhancedMonitoring", targetDepth)) {
                    context.nextToken();
                    provisionedRequest.setEnhancedMonitoring(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("openMonitoring", targetDepth)) {
                    context.nextToken();
                    provisionedRequest.setOpenMonitoring(OpenMonitoringInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("kafkaVersion", targetDepth)) {
                    context.nextToken();
                    provisionedRequest.setKafkaVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("loggingInfo", targetDepth)) {
                    context.nextToken();
                    provisionedRequest.setLoggingInfo(LoggingInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("numberOfBrokerNodes", targetDepth)) {
                    context.nextToken();
                    provisionedRequest.setNumberOfBrokerNodes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("storageMode", targetDepth)) {
                    context.nextToken();
                    provisionedRequest.setStorageMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return provisionedRequest;
    }

    private static ProvisionedRequestJsonUnmarshaller instance;

    public static ProvisionedRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProvisionedRequestJsonUnmarshaller();
        return instance;
    }
}
