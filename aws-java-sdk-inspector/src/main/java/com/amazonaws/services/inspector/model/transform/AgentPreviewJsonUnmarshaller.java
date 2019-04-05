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
package com.amazonaws.services.inspector.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.inspector.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AgentPreview JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentPreviewJsonUnmarshaller implements Unmarshaller<AgentPreview, JsonUnmarshallerContext> {

    public AgentPreview unmarshall(JsonUnmarshallerContext context) throws Exception {
        AgentPreview agentPreview = new AgentPreview();

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
                if (context.testExpression("hostname", targetDepth)) {
                    context.nextToken();
                    agentPreview.setHostname(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("agentId", targetDepth)) {
                    context.nextToken();
                    agentPreview.setAgentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("autoScalingGroup", targetDepth)) {
                    context.nextToken();
                    agentPreview.setAutoScalingGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("agentHealth", targetDepth)) {
                    context.nextToken();
                    agentPreview.setAgentHealth(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("agentVersion", targetDepth)) {
                    context.nextToken();
                    agentPreview.setAgentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("operatingSystem", targetDepth)) {
                    context.nextToken();
                    agentPreview.setOperatingSystem(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("kernelVersion", targetDepth)) {
                    context.nextToken();
                    agentPreview.setKernelVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ipv4Address", targetDepth)) {
                    context.nextToken();
                    agentPreview.setIpv4Address(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return agentPreview;
    }

    private static AgentPreviewJsonUnmarshaller instance;

    public static AgentPreviewJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AgentPreviewJsonUnmarshaller();
        return instance;
    }
}
