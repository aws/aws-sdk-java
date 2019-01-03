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
package com.amazonaws.services.organizations.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.organizations.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Handshake JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HandshakeJsonUnmarshaller implements Unmarshaller<Handshake, JsonUnmarshallerContext> {

    public Handshake unmarshall(JsonUnmarshallerContext context) throws Exception {
        Handshake handshake = new Handshake();

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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    handshake.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    handshake.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Parties", targetDepth)) {
                    context.nextToken();
                    handshake.setParties(new ListUnmarshaller<HandshakeParty>(HandshakePartyJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    handshake.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequestedTimestamp", targetDepth)) {
                    context.nextToken();
                    handshake.setRequestedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ExpirationTimestamp", targetDepth)) {
                    context.nextToken();
                    handshake.setExpirationTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Action", targetDepth)) {
                    context.nextToken();
                    handshake.setAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Resources", targetDepth)) {
                    context.nextToken();
                    handshake.setResources(new ListUnmarshaller<HandshakeResource>(HandshakeResourceJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return handshake;
    }

    private static HandshakeJsonUnmarshaller instance;

    public static HandshakeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HandshakeJsonUnmarshaller();
        return instance;
    }
}
