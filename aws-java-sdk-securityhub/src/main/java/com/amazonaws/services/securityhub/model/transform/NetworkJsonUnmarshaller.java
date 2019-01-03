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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Network JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkJsonUnmarshaller implements Unmarshaller<Network, JsonUnmarshallerContext> {

    public Network unmarshall(JsonUnmarshallerContext context) throws Exception {
        Network network = new Network();

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
                if (context.testExpression("Direction", targetDepth)) {
                    context.nextToken();
                    network.setDirection(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Protocol", targetDepth)) {
                    context.nextToken();
                    network.setProtocol(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceIpV4", targetDepth)) {
                    context.nextToken();
                    network.setSourceIpV4(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceIpV6", targetDepth)) {
                    context.nextToken();
                    network.setSourceIpV6(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourcePort", targetDepth)) {
                    context.nextToken();
                    network.setSourcePort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SourceDomain", targetDepth)) {
                    context.nextToken();
                    network.setSourceDomain(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceMac", targetDepth)) {
                    context.nextToken();
                    network.setSourceMac(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationIpV4", targetDepth)) {
                    context.nextToken();
                    network.setDestinationIpV4(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationIpV6", targetDepth)) {
                    context.nextToken();
                    network.setDestinationIpV6(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationPort", targetDepth)) {
                    context.nextToken();
                    network.setDestinationPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DestinationDomain", targetDepth)) {
                    context.nextToken();
                    network.setDestinationDomain(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return network;
    }

    private static NetworkJsonUnmarshaller instance;

    public static NetworkJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkJsonUnmarshaller();
        return instance;
    }
}
