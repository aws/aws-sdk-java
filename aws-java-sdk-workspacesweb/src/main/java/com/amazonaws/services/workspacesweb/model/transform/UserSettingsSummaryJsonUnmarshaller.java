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
package com.amazonaws.services.workspacesweb.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.workspacesweb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UserSettingsSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserSettingsSummaryJsonUnmarshaller implements Unmarshaller<UserSettingsSummary, JsonUnmarshallerContext> {

    public UserSettingsSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        UserSettingsSummary userSettingsSummary = new UserSettingsSummary();

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
                if (context.testExpression("copyAllowed", targetDepth)) {
                    context.nextToken();
                    userSettingsSummary.setCopyAllowed(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("disconnectTimeoutInMinutes", targetDepth)) {
                    context.nextToken();
                    userSettingsSummary.setDisconnectTimeoutInMinutes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("downloadAllowed", targetDepth)) {
                    context.nextToken();
                    userSettingsSummary.setDownloadAllowed(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("idleDisconnectTimeoutInMinutes", targetDepth)) {
                    context.nextToken();
                    userSettingsSummary.setIdleDisconnectTimeoutInMinutes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pasteAllowed", targetDepth)) {
                    context.nextToken();
                    userSettingsSummary.setPasteAllowed(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("printAllowed", targetDepth)) {
                    context.nextToken();
                    userSettingsSummary.setPrintAllowed(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("uploadAllowed", targetDepth)) {
                    context.nextToken();
                    userSettingsSummary.setUploadAllowed(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("userSettingsArn", targetDepth)) {
                    context.nextToken();
                    userSettingsSummary.setUserSettingsArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return userSettingsSummary;
    }

    private static UserSettingsSummaryJsonUnmarshaller instance;

    public static UserSettingsSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserSettingsSummaryJsonUnmarshaller();
        return instance;
    }
}
