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
 * AgentVersionSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentVersionSummaryJsonUnmarshaller implements Unmarshaller<AgentVersionSummary, JsonUnmarshallerContext> {

    public AgentVersionSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AgentVersionSummary agentVersionSummary = new AgentVersionSummary();

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
                if (context.testExpression("agentName", targetDepth)) {
                    context.nextToken();
                    agentVersionSummary.setAgentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("agentStatus", targetDepth)) {
                    context.nextToken();
                    agentVersionSummary.setAgentStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("agentVersion", targetDepth)) {
                    context.nextToken();
                    agentVersionSummary.setAgentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    agentVersionSummary.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    agentVersionSummary.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("guardrailConfiguration", targetDepth)) {
                    context.nextToken();
                    agentVersionSummary.setGuardrailConfiguration(GuardrailConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    agentVersionSummary.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return agentVersionSummary;
    }

    private static AgentVersionSummaryJsonUnmarshaller instance;

    public static AgentVersionSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AgentVersionSummaryJsonUnmarshaller();
        return instance;
    }
}
