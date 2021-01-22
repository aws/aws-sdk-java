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
 * DescribeBotVersionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBotVersionResultJsonUnmarshaller implements Unmarshaller<DescribeBotVersionResult, JsonUnmarshallerContext> {

    public DescribeBotVersionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeBotVersionResult describeBotVersionResult = new DescribeBotVersionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeBotVersionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("botId", targetDepth)) {
                    context.nextToken();
                    describeBotVersionResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botName", targetDepth)) {
                    context.nextToken();
                    describeBotVersionResult.setBotName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    context.nextToken();
                    describeBotVersionResult.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    describeBotVersionResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    describeBotVersionResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataPrivacy", targetDepth)) {
                    context.nextToken();
                    describeBotVersionResult.setDataPrivacy(DataPrivacyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("idleSessionTTLInSeconds", targetDepth)) {
                    context.nextToken();
                    describeBotVersionResult.setIdleSessionTTLInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("botStatus", targetDepth)) {
                    context.nextToken();
                    describeBotVersionResult.setBotStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReasons", targetDepth)) {
                    context.nextToken();
                    describeBotVersionResult.setFailureReasons(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    describeBotVersionResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeBotVersionResult;
    }

    private static DescribeBotVersionResultJsonUnmarshaller instance;

    public static DescribeBotVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeBotVersionResultJsonUnmarshaller();
        return instance;
    }
}
