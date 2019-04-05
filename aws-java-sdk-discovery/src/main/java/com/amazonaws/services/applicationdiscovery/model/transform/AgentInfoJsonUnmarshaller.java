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
package com.amazonaws.services.applicationdiscovery.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.applicationdiscovery.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AgentInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentInfoJsonUnmarshaller implements Unmarshaller<AgentInfo, JsonUnmarshallerContext> {

    public AgentInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AgentInfo agentInfo = new AgentInfo();

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
                if (context.testExpression("agentId", targetDepth)) {
                    context.nextToken();
                    agentInfo.setAgentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hostName", targetDepth)) {
                    context.nextToken();
                    agentInfo.setHostName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("agentNetworkInfoList", targetDepth)) {
                    context.nextToken();
                    agentInfo.setAgentNetworkInfoList(new ListUnmarshaller<AgentNetworkInfo>(AgentNetworkInfoJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("connectorId", targetDepth)) {
                    context.nextToken();
                    agentInfo.setConnectorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    agentInfo.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("health", targetDepth)) {
                    context.nextToken();
                    agentInfo.setHealth(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastHealthPingTime", targetDepth)) {
                    context.nextToken();
                    agentInfo.setLastHealthPingTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collectionStatus", targetDepth)) {
                    context.nextToken();
                    agentInfo.setCollectionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("agentType", targetDepth)) {
                    context.nextToken();
                    agentInfo.setAgentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("registeredTime", targetDepth)) {
                    context.nextToken();
                    agentInfo.setRegisteredTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return agentInfo;
    }

    private static AgentInfoJsonUnmarshaller instance;

    public static AgentInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AgentInfoJsonUnmarshaller();
        return instance;
    }
}
