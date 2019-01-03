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
package com.amazonaws.services.apigatewayv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.apigatewayv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Authorizer JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthorizerJsonUnmarshaller implements Unmarshaller<Authorizer, JsonUnmarshallerContext> {

    public Authorizer unmarshall(JsonUnmarshallerContext context) throws Exception {
        Authorizer authorizer = new Authorizer();

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
                if (context.testExpression("authorizerCredentialsArn", targetDepth)) {
                    context.nextToken();
                    authorizer.setAuthorizerCredentialsArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("authorizerId", targetDepth)) {
                    context.nextToken();
                    authorizer.setAuthorizerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("authorizerResultTtlInSeconds", targetDepth)) {
                    context.nextToken();
                    authorizer.setAuthorizerResultTtlInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("authorizerType", targetDepth)) {
                    context.nextToken();
                    authorizer.setAuthorizerType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("authorizerUri", targetDepth)) {
                    context.nextToken();
                    authorizer.setAuthorizerUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("identitySource", targetDepth)) {
                    context.nextToken();
                    authorizer.setIdentitySource(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("identityValidationExpression", targetDepth)) {
                    context.nextToken();
                    authorizer.setIdentityValidationExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    authorizer.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("providerArns", targetDepth)) {
                    context.nextToken();
                    authorizer.setProviderArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return authorizer;
    }

    private static AuthorizerJsonUnmarshaller instance;

    public static AuthorizerJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AuthorizerJsonUnmarshaller();
        return instance;
    }
}
