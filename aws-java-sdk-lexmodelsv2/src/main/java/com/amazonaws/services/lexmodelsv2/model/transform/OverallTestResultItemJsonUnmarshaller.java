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
 * OverallTestResultItem JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OverallTestResultItemJsonUnmarshaller implements Unmarshaller<OverallTestResultItem, JsonUnmarshallerContext> {

    public OverallTestResultItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        OverallTestResultItem overallTestResultItem = new OverallTestResultItem();

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
                if (context.testExpression("multiTurnConversation", targetDepth)) {
                    context.nextToken();
                    overallTestResultItem.setMultiTurnConversation(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("totalResultCount", targetDepth)) {
                    context.nextToken();
                    overallTestResultItem.setTotalResultCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("speechTranscriptionResultCounts", targetDepth)) {
                    context.nextToken();
                    overallTestResultItem.setSpeechTranscriptionResultCounts(new MapUnmarshaller<String, Integer>(context.getUnmarshaller(String.class),
                            context.getUnmarshaller(Integer.class)).unmarshall(context));
                }
                if (context.testExpression("endToEndResultCounts", targetDepth)) {
                    context.nextToken();
                    overallTestResultItem.setEndToEndResultCounts(new MapUnmarshaller<String, Integer>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(Integer.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return overallTestResultItem;
    }

    private static OverallTestResultItemJsonUnmarshaller instance;

    public static OverallTestResultItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OverallTestResultItemJsonUnmarshaller();
        return instance;
    }
}
