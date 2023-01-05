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
package com.amazonaws.services.supportapp.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.supportapp.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateSlackChannelConfigurationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSlackChannelConfigurationResultJsonUnmarshaller implements Unmarshaller<UpdateSlackChannelConfigurationResult, JsonUnmarshallerContext> {

    public UpdateSlackChannelConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateSlackChannelConfigurationResult updateSlackChannelConfigurationResult = new UpdateSlackChannelConfigurationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateSlackChannelConfigurationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("channelId", targetDepth)) {
                    context.nextToken();
                    updateSlackChannelConfigurationResult.setChannelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("channelName", targetDepth)) {
                    context.nextToken();
                    updateSlackChannelConfigurationResult.setChannelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("channelRoleArn", targetDepth)) {
                    context.nextToken();
                    updateSlackChannelConfigurationResult.setChannelRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("notifyOnAddCorrespondenceToCase", targetDepth)) {
                    context.nextToken();
                    updateSlackChannelConfigurationResult.setNotifyOnAddCorrespondenceToCase(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("notifyOnCaseSeverity", targetDepth)) {
                    context.nextToken();
                    updateSlackChannelConfigurationResult.setNotifyOnCaseSeverity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("notifyOnCreateOrReopenCase", targetDepth)) {
                    context.nextToken();
                    updateSlackChannelConfigurationResult.setNotifyOnCreateOrReopenCase(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("notifyOnResolveCase", targetDepth)) {
                    context.nextToken();
                    updateSlackChannelConfigurationResult.setNotifyOnResolveCase(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("teamId", targetDepth)) {
                    context.nextToken();
                    updateSlackChannelConfigurationResult.setTeamId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateSlackChannelConfigurationResult;
    }

    private static UpdateSlackChannelConfigurationResultJsonUnmarshaller instance;

    public static UpdateSlackChannelConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateSlackChannelConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
