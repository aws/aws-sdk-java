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
package com.amazonaws.services.identitystore.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.identitystore.model.*;
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
                if (context.testExpression("UserName", targetDepth)) {
                    context.nextToken();
                    user.setUserName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserId", targetDepth)) {
                    context.nextToken();
                    user.setUserId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExternalIds", targetDepth)) {
                    context.nextToken();
                    user.setExternalIds(new ListUnmarshaller<ExternalId>(ExternalIdJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    user.setName(NameJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DisplayName", targetDepth)) {
                    context.nextToken();
                    user.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NickName", targetDepth)) {
                    context.nextToken();
                    user.setNickName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProfileUrl", targetDepth)) {
                    context.nextToken();
                    user.setProfileUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Emails", targetDepth)) {
                    context.nextToken();
                    user.setEmails(new ListUnmarshaller<Email>(EmailJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Addresses", targetDepth)) {
                    context.nextToken();
                    user.setAddresses(new ListUnmarshaller<Address>(AddressJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("PhoneNumbers", targetDepth)) {
                    context.nextToken();
                    user.setPhoneNumbers(new ListUnmarshaller<PhoneNumber>(PhoneNumberJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("UserType", targetDepth)) {
                    context.nextToken();
                    user.setUserType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    context.nextToken();
                    user.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreferredLanguage", targetDepth)) {
                    context.nextToken();
                    user.setPreferredLanguage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Locale", targetDepth)) {
                    context.nextToken();
                    user.setLocale(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Timezone", targetDepth)) {
                    context.nextToken();
                    user.setTimezone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IdentityStoreId", targetDepth)) {
                    context.nextToken();
                    user.setIdentityStoreId(context.getUnmarshaller(String.class).unmarshall(context));
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
