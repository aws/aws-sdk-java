/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DescribeBotResourceGenerationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBotResourceGenerationResultJsonUnmarshaller implements Unmarshaller<DescribeBotResourceGenerationResult, JsonUnmarshallerContext> {

    public DescribeBotResourceGenerationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeBotResourceGenerationResult describeBotResourceGenerationResult = new DescribeBotResourceGenerationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeBotResourceGenerationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("botId", targetDepth)) {
                    context.nextToken();
                    describeBotResourceGenerationResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    context.nextToken();
                    describeBotResourceGenerationResult.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localeId", targetDepth)) {
                    context.nextToken();
                    describeBotResourceGenerationResult.setLocaleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("generationId", targetDepth)) {
                    context.nextToken();
                    describeBotResourceGenerationResult.setGenerationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReasons", targetDepth)) {
                    context.nextToken();
                    describeBotResourceGenerationResult.setFailureReasons(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("generationStatus", targetDepth)) {
                    context.nextToken();
                    describeBotResourceGenerationResult.setGenerationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("generationInputPrompt", targetDepth)) {
                    context.nextToken();
                    describeBotResourceGenerationResult.setGenerationInputPrompt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("generatedBotLocaleUrl", targetDepth)) {
                    context.nextToken();
                    describeBotResourceGenerationResult.setGeneratedBotLocaleUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    describeBotResourceGenerationResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("modelArn", targetDepth)) {
                    context.nextToken();
                    describeBotResourceGenerationResult.setModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    describeBotResourceGenerationResult.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeBotResourceGenerationResult;
    }

    private static DescribeBotResourceGenerationResultJsonUnmarshaller instance;

    public static DescribeBotResourceGenerationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeBotResourceGenerationResultJsonUnmarshaller();
        return instance;
    }
}
