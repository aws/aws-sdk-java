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
package com.amazonaws.services.appstream.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appstream.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Stack JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackJsonUnmarshaller implements Unmarshaller<Stack, JsonUnmarshallerContext> {

    public Stack unmarshall(JsonUnmarshallerContext context) throws Exception {
        Stack stack = new Stack();

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
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    stack.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    stack.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    stack.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayName", targetDepth)) {
                    context.nextToken();
                    stack.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    stack.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("StorageConnectors", targetDepth)) {
                    context.nextToken();
                    stack.setStorageConnectors(new ListUnmarshaller<StorageConnector>(StorageConnectorJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("RedirectURL", targetDepth)) {
                    context.nextToken();
                    stack.setRedirectURL(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FeedbackURL", targetDepth)) {
                    context.nextToken();
                    stack.setFeedbackURL(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StackErrors", targetDepth)) {
                    context.nextToken();
                    stack.setStackErrors(new ListUnmarshaller<StackError>(StackErrorJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("UserSettings", targetDepth)) {
                    context.nextToken();
                    stack.setUserSettings(new ListUnmarshaller<UserSetting>(UserSettingJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ApplicationSettings", targetDepth)) {
                    context.nextToken();
                    stack.setApplicationSettings(ApplicationSettingsResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return stack;
    }

    private static StackJsonUnmarshaller instance;

    public static StackJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StackJsonUnmarshaller();
        return instance;
    }
}
