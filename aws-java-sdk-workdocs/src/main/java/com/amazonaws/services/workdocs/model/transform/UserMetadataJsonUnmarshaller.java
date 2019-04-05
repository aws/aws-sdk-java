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
 * UserMetadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserMetadataJsonUnmarshaller implements Unmarshaller<UserMetadata, JsonUnmarshallerContext> {

    public UserMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        UserMetadata userMetadata = new UserMetadata();

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
                    userMetadata.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Username", targetDepth)) {
                    context.nextToken();
                    userMetadata.setUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GivenName", targetDepth)) {
                    context.nextToken();
                    userMetadata.setGivenName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Surname", targetDepth)) {
                    context.nextToken();
                    userMetadata.setSurname(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EmailAddress", targetDepth)) {
                    context.nextToken();
                    userMetadata.setEmailAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return userMetadata;
    }

    private static UserMetadataJsonUnmarshaller instance;

    public static UserMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserMetadataJsonUnmarshaller();
        return instance;
    }
}
