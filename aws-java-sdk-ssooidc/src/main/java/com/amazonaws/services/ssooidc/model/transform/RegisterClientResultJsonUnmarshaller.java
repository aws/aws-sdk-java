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
package com.amazonaws.services.ssooidc.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ssooidc.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RegisterClientResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterClientResultJsonUnmarshaller implements Unmarshaller<RegisterClientResult, JsonUnmarshallerContext> {

    public RegisterClientResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        RegisterClientResult registerClientResult = new RegisterClientResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return registerClientResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("clientId", targetDepth)) {
                    context.nextToken();
                    registerClientResult.setClientId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clientSecret", targetDepth)) {
                    context.nextToken();
                    registerClientResult.setClientSecret(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clientIdIssuedAt", targetDepth)) {
                    context.nextToken();
                    registerClientResult.setClientIdIssuedAt(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("clientSecretExpiresAt", targetDepth)) {
                    context.nextToken();
                    registerClientResult.setClientSecretExpiresAt(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("authorizationEndpoint", targetDepth)) {
                    context.nextToken();
                    registerClientResult.setAuthorizationEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tokenEndpoint", targetDepth)) {
                    context.nextToken();
                    registerClientResult.setTokenEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return registerClientResult;
    }

    private static RegisterClientResultJsonUnmarshaller instance;

    public static RegisterClientResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RegisterClientResultJsonUnmarshaller();
        return instance;
    }
}
