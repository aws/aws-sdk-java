/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.apigatewaymanagementapi.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.apigatewaymanagementapi.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetConnectionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConnectionResultJsonUnmarshaller implements Unmarshaller<GetConnectionResult, JsonUnmarshallerContext> {

    public GetConnectionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetConnectionResult getConnectionResult = new GetConnectionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getConnectionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("connectedAt", targetDepth)) {
                    context.nextToken();
                    getConnectionResult.setConnectedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("identity", targetDepth)) {
                    context.nextToken();
                    getConnectionResult.setIdentity(IdentityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lastActiveAt", targetDepth)) {
                    context.nextToken();
                    getConnectionResult.setLastActiveAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getConnectionResult;
    }

    private static GetConnectionResultJsonUnmarshaller instance;

    public static GetConnectionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetConnectionResultJsonUnmarshaller();
        return instance;
    }
}
