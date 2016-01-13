/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.inspector.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.inspector.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Agent JSON Unmarshaller
 */
public class AgentJsonUnmarshaller implements
        Unmarshaller<Agent, JsonUnmarshallerContext> {

    public Agent unmarshall(JsonUnmarshallerContext context) throws Exception {
        Agent agent = new Agent();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("agentId", targetDepth)) {
                    context.nextToken();
                    agent.setAgentId(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("assessmentArn", targetDepth)) {
                    context.nextToken();
                    agent.setAssessmentArn(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("agentHealth", targetDepth)) {
                    context.nextToken();
                    agent.setAgentHealth(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("agentHealthCode", targetDepth)) {
                    context.nextToken();
                    agent.setAgentHealthCode(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("agentHealthDetails", targetDepth)) {
                    context.nextToken();
                    agent.setAgentHealthDetails(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("autoScalingGroup", targetDepth)) {
                    context.nextToken();
                    agent.setAutoScalingGroup(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("accountId", targetDepth)) {
                    context.nextToken();
                    agent.setAccountId(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("telemetry", targetDepth)) {
                    context.nextToken();
                    agent.setTelemetry(new ListUnmarshaller<Telemetry>(
                            TelemetryJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
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
