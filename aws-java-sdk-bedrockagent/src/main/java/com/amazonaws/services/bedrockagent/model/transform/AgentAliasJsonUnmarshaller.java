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
 * AgentAlias JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentAliasJsonUnmarshaller implements Unmarshaller<AgentAlias, JsonUnmarshallerContext> {

    public AgentAlias unmarshall(JsonUnmarshallerContext context) throws Exception {
        AgentAlias agentAlias = new AgentAlias();

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
                if (context.testExpression("agentAliasArn", targetDepth)) {
                    context.nextToken();
                    agentAlias.setAgentAliasArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("agentAliasHistoryEvents", targetDepth)) {
                    context.nextToken();
                    agentAlias.setAgentAliasHistoryEvents(new ListUnmarshaller<AgentAliasHistoryEvent>(AgentAliasHistoryEventJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("agentAliasId", targetDepth)) {
                    context.nextToken();
                    agentAlias.setAgentAliasId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("agentAliasName", targetDepth)) {
                    context.nextToken();
                    agentAlias.setAgentAliasName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("agentAliasStatus", targetDepth)) {
                    context.nextToken();
                    agentAlias.setAgentAliasStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("agentId", targetDepth)) {
                    context.nextToken();
                    agentAlias.setAgentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clientToken", targetDepth)) {
                    context.nextToken();
                    agentAlias.setClientToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    agentAlias.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    agentAlias.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReasons", targetDepth)) {
                    context.nextToken();
                    agentAlias.setFailureReasons(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("routingConfiguration", targetDepth)) {
                    context.nextToken();
                    agentAlias.setRoutingConfiguration(new ListUnmarshaller<AgentAliasRoutingConfigurationListItem>(
                            AgentAliasRoutingConfigurationListItemJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    agentAlias.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return agentAlias;
    }

    private static AgentAliasJsonUnmarshaller instance;

    public static AgentAliasJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AgentAliasJsonUnmarshaller();
        return instance;
    }
}
