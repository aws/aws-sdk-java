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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AuthorizerDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthorizerDescriptionJsonUnmarshaller implements Unmarshaller<AuthorizerDescription, JsonUnmarshallerContext> {

    public AuthorizerDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        AuthorizerDescription authorizerDescription = new AuthorizerDescription();

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
                if (context.testExpression("authorizerName", targetDepth)) {
                    context.nextToken();
                    authorizerDescription.setAuthorizerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("authorizerArn", targetDepth)) {
                    context.nextToken();
                    authorizerDescription.setAuthorizerArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("authorizerFunctionArn", targetDepth)) {
                    context.nextToken();
                    authorizerDescription.setAuthorizerFunctionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tokenKeyName", targetDepth)) {
                    context.nextToken();
                    authorizerDescription.setTokenKeyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tokenSigningPublicKeys", targetDepth)) {
                    context.nextToken();
                    authorizerDescription.setTokenSigningPublicKeys(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    authorizerDescription.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDate", targetDepth)) {
                    context.nextToken();
                    authorizerDescription.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastModifiedDate", targetDepth)) {
                    context.nextToken();
                    authorizerDescription.setLastModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return authorizerDescription;
    }

    private static AuthorizerDescriptionJsonUnmarshaller instance;

    public static AuthorizerDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AuthorizerDescriptionJsonUnmarshaller();
        return instance;
    }
}
