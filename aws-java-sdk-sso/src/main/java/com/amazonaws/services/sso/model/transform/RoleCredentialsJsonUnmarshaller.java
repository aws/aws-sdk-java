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
package com.amazonaws.services.sso.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sso.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RoleCredentials JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RoleCredentialsJsonUnmarshaller implements Unmarshaller<RoleCredentials, JsonUnmarshallerContext> {

    public RoleCredentials unmarshall(JsonUnmarshallerContext context) throws Exception {
        RoleCredentials roleCredentials = new RoleCredentials();

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
                if (context.testExpression("accessKeyId", targetDepth)) {
                    context.nextToken();
                    roleCredentials.setAccessKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("secretAccessKey", targetDepth)) {
                    context.nextToken();
                    roleCredentials.setSecretAccessKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sessionToken", targetDepth)) {
                    context.nextToken();
                    roleCredentials.setSessionToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("expiration", targetDepth)) {
                    context.nextToken();
                    roleCredentials.setExpiration(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return roleCredentials;
    }

    private static RoleCredentialsJsonUnmarshaller instance;

    public static RoleCredentialsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RoleCredentialsJsonUnmarshaller();
        return instance;
    }
}
