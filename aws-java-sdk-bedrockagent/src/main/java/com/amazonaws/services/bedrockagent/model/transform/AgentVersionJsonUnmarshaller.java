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
package com.amazonaws.services.bedrockagent.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.bedrockagent.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AgentVersion JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentVersionJsonUnmarshaller implements Unmarshaller<AgentVersion, JsonUnmarshallerContext> {

    public AgentVersion unmarshall(JsonUnmarshallerContext context) throws Exception {
        AgentVersion agentVersion = new AgentVersion();

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
                if (context.testExpression("agentArn", targetDepth)) {
                    context.nextToken();
                    agentVersion.setAgentArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("agentId", targetDepth)) {
                    context.nextToken();
                    agentVersion.setAgentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("agentName", targetDepth)) {
                    context.nextToken();
                    agentVersion.setAgentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("agentResourceRoleArn", targetDepth)) {
                    context.nextToken();
                    agentVersion.setAgentResourceRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("agentStatus", targetDepth)) {
                    context.nextToken();
                    agentVersion.setAgentStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    agentVersion.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("customerEncryptionKeyArn", targetDepth)) {
                    context.nextToken();
                    agentVersion.setCustomerEncryptionKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    agentVersion.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReasons", targetDepth)) {
                    context.nextToken();
                    agentVersion.setFailureReasons(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("foundationModel", targetDepth)) {
                    context.nextToken();
                    agentVersion.setFoundationModel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("guardrailConfiguration", targetDepth)) {
                    context.nextToken();
                    agentVersion.setGuardrailConfiguration(GuardrailConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("idleSessionTTLInSeconds", targetDepth)) {
                    context.nextToken();
                    agentVersion.setIdleSessionTTLInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("instruction", targetDepth)) {
                    context.nextToken();
                    agentVersion.setInstruction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("promptOverrideConfiguration", targetDepth)) {
                    context.nextToken();
                    agentVersion.setPromptOverrideConfiguration(PromptOverrideConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("recommendedActions", targetDepth)) {
                    context.nextToken();
                    agentVersion.setRecommendedActions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    agentVersion.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    agentVersion.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return agentVersion;
    }

    private static AgentVersionJsonUnmarshaller instance;

    public static AgentVersionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AgentVersionJsonUnmarshaller();
        return instance;
    }
}
