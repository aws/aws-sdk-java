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
 * BotSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotSummaryJsonUnmarshaller implements Unmarshaller<BotSummary, JsonUnmarshallerContext> {

    public BotSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        BotSummary botSummary = new BotSummary();

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
                if (context.testExpression("botId", targetDepth)) {
                    context.nextToken();
                    botSummary.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botName", targetDepth)) {
                    context.nextToken();
                    botSummary.setBotName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    botSummary.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botStatus", targetDepth)) {
                    context.nextToken();
                    botSummary.setBotStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("latestBotVersion", targetDepth)) {
                    context.nextToken();
                    botSummary.setLatestBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    botSummary.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return botSummary;
    }

    private static BotSummaryJsonUnmarshaller instance;

    public static BotSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BotSummaryJsonUnmarshaller();
        return instance;
    }
}
