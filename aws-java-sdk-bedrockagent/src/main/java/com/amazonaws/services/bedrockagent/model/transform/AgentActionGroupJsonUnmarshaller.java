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
 * AgentActionGroup JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentActionGroupJsonUnmarshaller implements Unmarshaller<AgentActionGroup, JsonUnmarshallerContext> {

    public AgentActionGroup unmarshall(JsonUnmarshallerContext context) throws Exception {
        AgentActionGroup agentActionGroup = new AgentActionGroup();

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
                if (context.testExpression("actionGroupExecutor", targetDepth)) {
                    context.nextToken();
                    agentActionGroup.setActionGroupExecutor(ActionGroupExecutorJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("actionGroupId", targetDepth)) {
                    context.nextToken();
                    agentActionGroup.setActionGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("actionGroupName", targetDepth)) {
                    context.nextToken();
                    agentActionGroup.setActionGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("actionGroupState", targetDepth)) {
                    context.nextToken();
                    agentActionGroup.setActionGroupState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("agentId", targetDepth)) {
                    context.nextToken();
                    agentActionGroup.setAgentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("agentVersion", targetDepth)) {
                    context.nextToken();
                    agentActionGroup.setAgentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("apiSchema", targetDepth)) {
                    context.nextToken();
                    agentActionGroup.setApiSchema(APISchemaJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("clientToken", targetDepth)) {
                    context.nextToken();
                    agentActionGroup.setClientToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    agentActionGroup.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    agentActionGroup.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("functionSchema", targetDepth)) {
                    context.nextToken();
                    agentActionGroup.setFunctionSchema(FunctionSchemaJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("parentActionSignature", targetDepth)) {
                    context.nextToken();
                    agentActionGroup.setParentActionSignature(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    agentActionGroup.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return agentActionGroup;
    }

    private static AgentActionGroupJsonUnmarshaller instance;

    public static AgentActionGroupJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AgentActionGroupJsonUnmarshaller();
        return instance;
    }
}
