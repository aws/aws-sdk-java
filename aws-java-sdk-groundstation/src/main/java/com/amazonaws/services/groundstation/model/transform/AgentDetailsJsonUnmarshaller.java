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
package com.amazonaws.services.groundstation.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.groundstation.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AgentDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentDetailsJsonUnmarshaller implements Unmarshaller<AgentDetails, JsonUnmarshallerContext> {

    public AgentDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AgentDetails agentDetails = new AgentDetails();

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
                if (context.testExpression("agentCpuCores", targetDepth)) {
                    context.nextToken();
                    agentDetails.setAgentCpuCores(new ListUnmarshaller<Integer>(context.getUnmarshaller(Integer.class))

                    .unmarshall(context));
                }
                if (context.testExpression("agentVersion", targetDepth)) {
                    context.nextToken();
                    agentDetails.setAgentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("componentVersions", targetDepth)) {
                    context.nextToken();
                    agentDetails.setComponentVersions(new ListUnmarshaller<ComponentVersion>(ComponentVersionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("instanceId", targetDepth)) {
                    context.nextToken();
                    agentDetails.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceType", targetDepth)) {
                    context.nextToken();
                    agentDetails.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("reservedCpuCores", targetDepth)) {
                    context.nextToken();
                    agentDetails.setReservedCpuCores(new ListUnmarshaller<Integer>(context.getUnmarshaller(Integer.class))

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return agentDetails;
    }

    private static AgentDetailsJsonUnmarshaller instance;

    public static AgentDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AgentDetailsJsonUnmarshaller();
        return instance;
    }
}
