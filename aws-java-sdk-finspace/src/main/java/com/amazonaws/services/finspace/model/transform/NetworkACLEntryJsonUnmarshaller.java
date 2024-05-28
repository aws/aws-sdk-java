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
package com.amazonaws.services.finspace.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.finspace.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * NetworkACLEntry JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkACLEntryJsonUnmarshaller implements Unmarshaller<NetworkACLEntry, JsonUnmarshallerContext> {

    public NetworkACLEntry unmarshall(JsonUnmarshallerContext context) throws Exception {
        NetworkACLEntry networkACLEntry = new NetworkACLEntry();

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
                if (context.testExpression("ruleNumber", targetDepth)) {
                    context.nextToken();
                    networkACLEntry.setRuleNumber(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("protocol", targetDepth)) {
                    context.nextToken();
                    networkACLEntry.setProtocol(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ruleAction", targetDepth)) {
                    context.nextToken();
                    networkACLEntry.setRuleAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("portRange", targetDepth)) {
                    context.nextToken();
                    networkACLEntry.setPortRange(PortRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("icmpTypeCode", targetDepth)) {
                    context.nextToken();
                    networkACLEntry.setIcmpTypeCode(IcmpTypeCodeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("cidrBlock", targetDepth)) {
                    context.nextToken();
                    networkACLEntry.setCidrBlock(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return networkACLEntry;
    }

    private static NetworkACLEntryJsonUnmarshaller instance;

    public static NetworkACLEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkACLEntryJsonUnmarshaller();
        return instance;
    }
}
