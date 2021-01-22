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
 * DescribeBotAliasResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBotAliasResultJsonUnmarshaller implements Unmarshaller<DescribeBotAliasResult, JsonUnmarshallerContext> {

    public DescribeBotAliasResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeBotAliasResult describeBotAliasResult = new DescribeBotAliasResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeBotAliasResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("botAliasId", targetDepth)) {
                    context.nextToken();
                    describeBotAliasResult.setBotAliasId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botAliasName", targetDepth)) {
                    context.nextToken();
                    describeBotAliasResult.setBotAliasName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    describeBotAliasResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    context.nextToken();
                    describeBotAliasResult.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botAliasLocaleSettings", targetDepth)) {
                    context.nextToken();
                    describeBotAliasResult.setBotAliasLocaleSettings(new MapUnmarshaller<String, BotAliasLocaleSettings>(context.getUnmarshaller(String.class),
                            BotAliasLocaleSettingsJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("conversationLogSettings", targetDepth)) {
                    context.nextToken();
                    describeBotAliasResult.setConversationLogSettings(ConversationLogSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sentimentAnalysisSettings", targetDepth)) {
                    context.nextToken();
                    describeBotAliasResult.setSentimentAnalysisSettings(SentimentAnalysisSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("botAliasHistoryEvents", targetDepth)) {
                    context.nextToken();
                    describeBotAliasResult.setBotAliasHistoryEvents(new ListUnmarshaller<BotAliasHistoryEvent>(BotAliasHistoryEventJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("botAliasStatus", targetDepth)) {
                    context.nextToken();
                    describeBotAliasResult.setBotAliasStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botId", targetDepth)) {
                    context.nextToken();
                    describeBotAliasResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    describeBotAliasResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    describeBotAliasResult.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeBotAliasResult;
    }

    private static DescribeBotAliasResultJsonUnmarshaller instance;

    public static DescribeBotAliasResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeBotAliasResultJsonUnmarshaller();
        return instance;
    }
}
