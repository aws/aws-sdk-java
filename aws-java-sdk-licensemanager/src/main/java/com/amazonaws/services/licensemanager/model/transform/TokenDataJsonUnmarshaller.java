/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.licensemanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.licensemanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TokenData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TokenDataJsonUnmarshaller implements Unmarshaller<TokenData, JsonUnmarshallerContext> {

    public TokenData unmarshall(JsonUnmarshallerContext context) throws Exception {
        TokenData tokenData = new TokenData();

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
                if (context.testExpression("TokenId", targetDepth)) {
                    context.nextToken();
                    tokenData.setTokenId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TokenType", targetDepth)) {
                    context.nextToken();
                    tokenData.setTokenType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LicenseArn", targetDepth)) {
                    context.nextToken();
                    tokenData.setLicenseArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExpirationTime", targetDepth)) {
                    context.nextToken();
                    tokenData.setExpirationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TokenProperties", targetDepth)) {
                    context.nextToken();
                    tokenData.setTokenProperties(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("RoleArns", targetDepth)) {
                    context.nextToken();
                    tokenData.setRoleArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    tokenData.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return tokenData;
    }

    private static TokenDataJsonUnmarshaller instance;

    public static TokenDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TokenDataJsonUnmarshaller();
        return instance;
    }
}
