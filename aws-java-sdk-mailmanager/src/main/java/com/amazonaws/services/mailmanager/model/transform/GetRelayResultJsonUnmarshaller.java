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
package com.amazonaws.services.mailmanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mailmanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetRelayResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRelayResultJsonUnmarshaller implements Unmarshaller<GetRelayResult, JsonUnmarshallerContext> {

    public GetRelayResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetRelayResult getRelayResult = new GetRelayResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getRelayResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Authentication", targetDepth)) {
                    context.nextToken();
                    getRelayResult.setAuthentication(RelayAuthenticationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    getRelayResult.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTimestamp", targetDepth)) {
                    context.nextToken();
                    getRelayResult.setLastModifiedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("RelayArn", targetDepth)) {
                    context.nextToken();
                    getRelayResult.setRelayArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RelayId", targetDepth)) {
                    context.nextToken();
                    getRelayResult.setRelayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RelayName", targetDepth)) {
                    context.nextToken();
                    getRelayResult.setRelayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerName", targetDepth)) {
                    context.nextToken();
                    getRelayResult.setServerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerPort", targetDepth)) {
                    context.nextToken();
                    getRelayResult.setServerPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getRelayResult;
    }

    private static GetRelayResultJsonUnmarshaller instance;

    public static GetRelayResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetRelayResultJsonUnmarshaller();
        return instance;
    }
}
