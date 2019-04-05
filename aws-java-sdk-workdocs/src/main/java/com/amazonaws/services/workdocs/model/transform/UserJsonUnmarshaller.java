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
package com.amazonaws.services.workdocs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.workdocs.model.*;
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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    user.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Username", targetDepth)) {
                    context.nextToken();
                    user.setUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EmailAddress", targetDepth)) {
                    context.nextToken();
                    user.setEmailAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GivenName", targetDepth)) {
                    context.nextToken();
                    user.setGivenName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Surname", targetDepth)) {
                    context.nextToken();
                    user.setSurname(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OrganizationId", targetDepth)) {
                    context.nextToken();
                    user.setOrganizationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RootFolderId", targetDepth)) {
                    context.nextToken();
                    user.setRootFolderId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecycleBinFolderId", targetDepth)) {
                    context.nextToken();
                    user.setRecycleBinFolderId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    user.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    user.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    user.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ModifiedTimestamp", targetDepth)) {
                    context.nextToken();
                    user.setModifiedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TimeZoneId", targetDepth)) {
                    context.nextToken();
                    user.setTimeZoneId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Locale", targetDepth)) {
                    context.nextToken();
                    user.setLocale(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Storage", targetDepth)) {
                    context.nextToken();
                    user.setStorage(UserStorageMetadataJsonUnmarshaller.getInstance().unmarshall(context));
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
