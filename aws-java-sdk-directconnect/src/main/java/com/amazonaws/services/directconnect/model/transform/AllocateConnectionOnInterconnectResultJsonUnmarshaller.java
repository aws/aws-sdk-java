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
package com.amazonaws.services.directconnect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AllocateConnectionOnInterconnectResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AllocateConnectionOnInterconnectResultJsonUnmarshaller implements Unmarshaller<AllocateConnectionOnInterconnectResult, JsonUnmarshallerContext> {

    public AllocateConnectionOnInterconnectResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        AllocateConnectionOnInterconnectResult allocateConnectionOnInterconnectResult = new AllocateConnectionOnInterconnectResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return allocateConnectionOnInterconnectResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ownerAccount", targetDepth)) {
                    context.nextToken();
                    allocateConnectionOnInterconnectResult.setOwnerAccount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionId", targetDepth)) {
                    context.nextToken();
                    allocateConnectionOnInterconnectResult.setConnectionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionName", targetDepth)) {
                    context.nextToken();
                    allocateConnectionOnInterconnectResult.setConnectionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionState", targetDepth)) {
                    context.nextToken();
                    allocateConnectionOnInterconnectResult.setConnectionState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("region", targetDepth)) {
                    context.nextToken();
                    allocateConnectionOnInterconnectResult.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    context.nextToken();
                    allocateConnectionOnInterconnectResult.setLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("bandwidth", targetDepth)) {
                    context.nextToken();
                    allocateConnectionOnInterconnectResult.setBandwidth(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vlan", targetDepth)) {
                    context.nextToken();
                    allocateConnectionOnInterconnectResult.setVlan(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("partnerName", targetDepth)) {
                    context.nextToken();
                    allocateConnectionOnInterconnectResult.setPartnerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("loaIssueTime", targetDepth)) {
                    context.nextToken();
                    allocateConnectionOnInterconnectResult.setLoaIssueTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lagId", targetDepth)) {
                    context.nextToken();
                    allocateConnectionOnInterconnectResult.setLagId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsDevice", targetDepth)) {
                    context.nextToken();
                    allocateConnectionOnInterconnectResult.setAwsDevice(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jumboFrameCapable", targetDepth)) {
                    context.nextToken();
                    allocateConnectionOnInterconnectResult.setJumboFrameCapable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("awsDeviceV2", targetDepth)) {
                    context.nextToken();
                    allocateConnectionOnInterconnectResult.setAwsDeviceV2(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hasLogicalRedundancy", targetDepth)) {
                    context.nextToken();
                    allocateConnectionOnInterconnectResult.setHasLogicalRedundancy(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return allocateConnectionOnInterconnectResult;
    }

    private static AllocateConnectionOnInterconnectResultJsonUnmarshaller instance;

    public static AllocateConnectionOnInterconnectResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AllocateConnectionOnInterconnectResultJsonUnmarshaller();
        return instance;
    }
}
