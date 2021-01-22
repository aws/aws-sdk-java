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
 * ListSlotsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSlotsResultJsonUnmarshaller implements Unmarshaller<ListSlotsResult, JsonUnmarshallerContext> {

    public ListSlotsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListSlotsResult listSlotsResult = new ListSlotsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return listSlotsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("botId", targetDepth)) {
                    context.nextToken();
                    listSlotsResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    context.nextToken();
                    listSlotsResult.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localeId", targetDepth)) {
                    context.nextToken();
                    listSlotsResult.setLocaleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("intentId", targetDepth)) {
                    context.nextToken();
                    listSlotsResult.setIntentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slotSummaries", targetDepth)) {
                    context.nextToken();
                    listSlotsResult.setSlotSummaries(new ListUnmarshaller<SlotSummary>(SlotSummaryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("nextToken", targetDepth)) {
                    context.nextToken();
                    listSlotsResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listSlotsResult;
    }

    private static ListSlotsResultJsonUnmarshaller instance;

    public static ListSlotsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListSlotsResultJsonUnmarshaller();
        return instance;
    }
}
