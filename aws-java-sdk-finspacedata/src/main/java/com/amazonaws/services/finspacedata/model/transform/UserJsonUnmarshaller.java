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
package com.amazonaws.services.finspacedata.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.finspacedata.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * User JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserJsonUnmarshaller implements Unmarshaller<User, JsonUnmarshallerContext> {

    public User unmarshall(JsonUnmarshallerContext context) throws Exception {
        User user = new User();

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
                if (context.testExpression("userId", targetDepth)) {
                    context.nextToken();
                    user.setUserId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    user.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("firstName", targetDepth)) {
                    context.nextToken();
                    user.setFirstName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastName", targetDepth)) {
                    context.nextToken();
                    user.setLastName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("emailAddress", targetDepth)) {
                    context.nextToken();
                    user.setEmailAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    user.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("apiAccess", targetDepth)) {
                    context.nextToken();
                    user.setApiAccess(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("apiAccessPrincipalArn", targetDepth)) {
                    context.nextToken();
                    user.setApiAccessPrincipalArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    context.nextToken();
                    user.setCreateTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("lastEnabledTime", targetDepth)) {
                    context.nextToken();
                    user.setLastEnabledTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("lastDisabledTime", targetDepth)) {
                    context.nextToken();
                    user.setLastDisabledTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedTime", targetDepth)) {
                    context.nextToken();
                    user.setLastModifiedTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("lastLoginTime", targetDepth)) {
                    context.nextToken();
                    user.setLastLoginTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return user;
    }

    private static UserJsonUnmarshaller instance;

    public static UserJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserJsonUnmarshaller();
        return instance;
    }
}
