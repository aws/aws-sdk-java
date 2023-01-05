/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.backupgateway.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.backupgateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Gateway JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GatewayJsonUnmarshaller implements Unmarshaller<Gateway, JsonUnmarshallerContext> {

    public Gateway unmarshall(JsonUnmarshallerContext context) throws Exception {
        Gateway gateway = new Gateway();

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
                if (context.testExpression("GatewayArn", targetDepth)) {
                    context.nextToken();
                    gateway.setGatewayArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GatewayDisplayName", targetDepth)) {
                    context.nextToken();
                    gateway.setGatewayDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GatewayType", targetDepth)) {
                    context.nextToken();
                    gateway.setGatewayType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HypervisorId", targetDepth)) {
                    context.nextToken();
                    gateway.setHypervisorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastSeenTime", targetDepth)) {
                    context.nextToken();
                    gateway.setLastSeenTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return gateway;
    }

    private static GatewayJsonUnmarshaller instance;

    public static GatewayJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GatewayJsonUnmarshaller();
        return instance;
    }
}
