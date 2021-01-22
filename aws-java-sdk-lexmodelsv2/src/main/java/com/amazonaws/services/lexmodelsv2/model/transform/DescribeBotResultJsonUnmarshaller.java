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
 * DescribeBotResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBotResultJsonUnmarshaller implements Unmarshaller<DescribeBotResult, JsonUnmarshallerContext> {

    public DescribeBotResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeBotResult describeBotResult = new DescribeBotResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeBotResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("botId", targetDepth)) {
                    context.nextToken();
                    describeBotResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botName", targetDepth)) {
                    context.nextToken();
                    describeBotResult.setBotName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    describeBotResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    describeBotResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataPrivacy", targetDepth)) {
                    context.nextToken();
                    describeBotResult.setDataPrivacy(DataPrivacyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("idleSessionTTLInSeconds", targetDepth)) {
                    context.nextToken();
                    describeBotResult.setIdleSessionTTLInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("botStatus", targetDepth)) {
                    context.nextToken();
                    describeBotResult.setBotStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    describeBotResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    describeBotResult.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeBotResult;
    }

    private static DescribeBotResultJsonUnmarshaller instance;

    public static DescribeBotResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeBotResultJsonUnmarshaller();
        return instance;
    }
}
