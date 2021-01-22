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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateBotResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBotResultJsonUnmarshaller implements Unmarshaller<UpdateBotResult, JsonUnmarshallerContext> {

    public UpdateBotResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateBotResult updateBotResult = new UpdateBotResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateBotResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("botId", targetDepth)) {
                    context.nextToken();
                    updateBotResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botName", targetDepth)) {
                    context.nextToken();
                    updateBotResult.setBotName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    updateBotResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    updateBotResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataPrivacy", targetDepth)) {
                    context.nextToken();
                    updateBotResult.setDataPrivacy(DataPrivacyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("idleSessionTTLInSeconds", targetDepth)) {
                    context.nextToken();
                    updateBotResult.setIdleSessionTTLInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("botStatus", targetDepth)) {
                    context.nextToken();
                    updateBotResult.setBotStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    updateBotResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    updateBotResult.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateBotResult;
    }

    private static UpdateBotResultJsonUnmarshaller instance;

    public static UpdateBotResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateBotResultJsonUnmarshaller();
        return instance;
    }
}
