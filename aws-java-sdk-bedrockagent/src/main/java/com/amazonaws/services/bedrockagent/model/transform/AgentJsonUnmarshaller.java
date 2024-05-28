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
 * Agent JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentJsonUnmarshaller implements Unmarshaller<Agent, JsonUnmarshallerContext> {

    public Agent unmarshall(JsonUnmarshallerContext context) throws Exception {
        Agent agent = new Agent();

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
                    agent.setAgentArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("agentId", targetDepth)) {
                    context.nextToken();
                    agent.setAgentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("agentName", targetDepth)) {
                    context.nextToken();
                    agent.setAgentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("agentResourceRoleArn", targetDepth)) {
                    context.nextToken();
                    agent.setAgentResourceRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("agentStatus", targetDepth)) {
                    context.nextToken();
                    agent.setAgentStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("agentVersion", targetDepth)) {
                    context.nextToken();
                    agent.setAgentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clientToken", targetDepth)) {
                    context.nextToken();
                    agent.setClientToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    agent.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("customerEncryptionKeyArn", targetDepth)) {
                    context.nextToken();
                    agent.setCustomerEncryptionKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    agent.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReasons", targetDepth)) {
                    context.nextToken();
                    agent.setFailureReasons(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("foundationModel", targetDepth)) {
                    context.nextToken();
                    agent.setFoundationModel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("guardrailConfiguration", targetDepth)) {
                    context.nextToken();
                    agent.setGuardrailConfiguration(GuardrailConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("idleSessionTTLInSeconds", targetDepth)) {
                    context.nextToken();
                    agent.setIdleSessionTTLInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("instruction", targetDepth)) {
                    context.nextToken();
                    agent.setInstruction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("preparedAt", targetDepth)) {
                    context.nextToken();
                    agent.setPreparedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("promptOverrideConfiguration", targetDepth)) {
                    context.nextToken();
                    agent.setPromptOverrideConfiguration(PromptOverrideConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("recommendedActions", targetDepth)) {
                    context.nextToken();
                    agent.setRecommendedActions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    agent.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return agent;
    }

    private static AgentJsonUnmarshaller instance;

    public static AgentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AgentJsonUnmarshaller();
        return instance;
    }
}
