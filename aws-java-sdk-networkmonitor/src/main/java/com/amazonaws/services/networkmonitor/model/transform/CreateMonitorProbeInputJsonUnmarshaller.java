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
package com.amazonaws.services.networkmonitor.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.networkmonitor.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateMonitorProbeInput JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMonitorProbeInputJsonUnmarshaller implements Unmarshaller<CreateMonitorProbeInput, JsonUnmarshallerContext> {

    public CreateMonitorProbeInput unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateMonitorProbeInput createMonitorProbeInput = new CreateMonitorProbeInput();

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
                if (context.testExpression("sourceArn", targetDepth)) {
                    context.nextToken();
                    createMonitorProbeInput.setSourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("destination", targetDepth)) {
                    context.nextToken();
                    createMonitorProbeInput.setDestination(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("destinationPort", targetDepth)) {
                    context.nextToken();
                    createMonitorProbeInput.setDestinationPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("protocol", targetDepth)) {
                    context.nextToken();
                    createMonitorProbeInput.setProtocol(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("packetSize", targetDepth)) {
                    context.nextToken();
                    createMonitorProbeInput.setPacketSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("probeTags", targetDepth)) {
                    context.nextToken();
                    createMonitorProbeInput.setProbeTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createMonitorProbeInput;
    }

    private static CreateMonitorProbeInputJsonUnmarshaller instance;

    public static CreateMonitorProbeInputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateMonitorProbeInputJsonUnmarshaller();
        return instance;
    }
}
