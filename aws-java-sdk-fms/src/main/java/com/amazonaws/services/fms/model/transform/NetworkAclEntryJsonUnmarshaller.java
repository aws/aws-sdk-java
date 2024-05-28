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
package com.amazonaws.services.fms.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.fms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * NetworkAclEntry JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkAclEntryJsonUnmarshaller implements Unmarshaller<NetworkAclEntry, JsonUnmarshallerContext> {

    public NetworkAclEntry unmarshall(JsonUnmarshallerContext context) throws Exception {
        NetworkAclEntry networkAclEntry = new NetworkAclEntry();

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
                if (context.testExpression("IcmpTypeCode", targetDepth)) {
                    context.nextToken();
                    networkAclEntry.setIcmpTypeCode(NetworkAclIcmpTypeCodeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Protocol", targetDepth)) {
                    context.nextToken();
                    networkAclEntry.setProtocol(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PortRange", targetDepth)) {
                    context.nextToken();
                    networkAclEntry.setPortRange(NetworkAclPortRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CidrBlock", targetDepth)) {
                    context.nextToken();
                    networkAclEntry.setCidrBlock(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Ipv6CidrBlock", targetDepth)) {
                    context.nextToken();
                    networkAclEntry.setIpv6CidrBlock(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RuleAction", targetDepth)) {
                    context.nextToken();
                    networkAclEntry.setRuleAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Egress", targetDepth)) {
                    context.nextToken();
                    networkAclEntry.setEgress(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return networkAclEntry;
    }

    private static NetworkAclEntryJsonUnmarshaller instance;

    public static NetworkAclEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkAclEntryJsonUnmarshaller();
        return instance;
    }
}
