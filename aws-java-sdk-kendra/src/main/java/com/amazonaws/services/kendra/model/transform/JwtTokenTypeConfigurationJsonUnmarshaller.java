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
package com.amazonaws.services.kendra.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JwtTokenTypeConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JwtTokenTypeConfigurationJsonUnmarshaller implements Unmarshaller<JwtTokenTypeConfiguration, JsonUnmarshallerContext> {

    public JwtTokenTypeConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        JwtTokenTypeConfiguration jwtTokenTypeConfiguration = new JwtTokenTypeConfiguration();

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
                if (context.testExpression("KeyLocation", targetDepth)) {
                    context.nextToken();
                    jwtTokenTypeConfiguration.setKeyLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("URL", targetDepth)) {
                    context.nextToken();
                    jwtTokenTypeConfiguration.setURL(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretManagerArn", targetDepth)) {
                    context.nextToken();
                    jwtTokenTypeConfiguration.setSecretManagerArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserNameAttributeField", targetDepth)) {
                    context.nextToken();
                    jwtTokenTypeConfiguration.setUserNameAttributeField(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GroupAttributeField", targetDepth)) {
                    context.nextToken();
                    jwtTokenTypeConfiguration.setGroupAttributeField(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Issuer", targetDepth)) {
                    context.nextToken();
                    jwtTokenTypeConfiguration.setIssuer(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClaimRegex", targetDepth)) {
                    context.nextToken();
                    jwtTokenTypeConfiguration.setClaimRegex(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return jwtTokenTypeConfiguration;
    }

    private static JwtTokenTypeConfigurationJsonUnmarshaller instance;

    public static JwtTokenTypeConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JwtTokenTypeConfigurationJsonUnmarshaller();
        return instance;
    }
}
