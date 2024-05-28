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
 * Probe JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProbeJsonUnmarshaller implements Unmarshaller<Probe, JsonUnmarshallerContext> {

    public Probe unmarshall(JsonUnmarshallerContext context) throws Exception {
        Probe probe = new Probe();

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
                if (context.testExpression("probeId", targetDepth)) {
                    context.nextToken();
                    probe.setProbeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("probeArn", targetDepth)) {
                    context.nextToken();
                    probe.setProbeArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceArn", targetDepth)) {
                    context.nextToken();
                    probe.setSourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("destination", targetDepth)) {
                    context.nextToken();
                    probe.setDestination(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("destinationPort", targetDepth)) {
                    context.nextToken();
                    probe.setDestinationPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("protocol", targetDepth)) {
                    context.nextToken();
                    probe.setProtocol(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("packetSize", targetDepth)) {
                    context.nextToken();
                    probe.setPacketSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("addressFamily", targetDepth)) {
                    context.nextToken();
                    probe.setAddressFamily(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vpcId", targetDepth)) {
                    context.nextToken();
                    probe.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    probe.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    probe.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("modifiedAt", targetDepth)) {
                    context.nextToken();
                    probe.setModifiedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    probe.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return probe;
    }

    private static ProbeJsonUnmarshaller instance;

    public static ProbeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProbeJsonUnmarshaller();
        return instance;
    }
}
