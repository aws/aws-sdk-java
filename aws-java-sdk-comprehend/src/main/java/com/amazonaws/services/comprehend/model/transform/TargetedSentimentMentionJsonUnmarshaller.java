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
package com.amazonaws.services.comprehend.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TargetedSentimentMention JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetedSentimentMentionJsonUnmarshaller implements Unmarshaller<TargetedSentimentMention, JsonUnmarshallerContext> {

    public TargetedSentimentMention unmarshall(JsonUnmarshallerContext context) throws Exception {
        TargetedSentimentMention targetedSentimentMention = new TargetedSentimentMention();

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
                if (context.testExpression("Score", targetDepth)) {
                    context.nextToken();
                    targetedSentimentMention.setScore(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("GroupScore", targetDepth)) {
                    context.nextToken();
                    targetedSentimentMention.setGroupScore(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("Text", targetDepth)) {
                    context.nextToken();
                    targetedSentimentMention.setText(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    targetedSentimentMention.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MentionSentiment", targetDepth)) {
                    context.nextToken();
                    targetedSentimentMention.setMentionSentiment(MentionSentimentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BeginOffset", targetDepth)) {
                    context.nextToken();
                    targetedSentimentMention.setBeginOffset(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("EndOffset", targetDepth)) {
                    context.nextToken();
                    targetedSentimentMention.setEndOffset(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return targetedSentimentMention;
    }

    private static TargetedSentimentMentionJsonUnmarshaller instance;

    public static TargetedSentimentMentionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TargetedSentimentMentionJsonUnmarshaller();
        return instance;
    }
}
