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
 * SlotSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlotSummaryJsonUnmarshaller implements Unmarshaller<SlotSummary, JsonUnmarshallerContext> {

    public SlotSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        SlotSummary slotSummary = new SlotSummary();

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
                if (context.testExpression("slotId", targetDepth)) {
                    context.nextToken();
                    slotSummary.setSlotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slotName", targetDepth)) {
                    context.nextToken();
                    slotSummary.setSlotName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    slotSummary.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slotConstraint", targetDepth)) {
                    context.nextToken();
                    slotSummary.setSlotConstraint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slotTypeId", targetDepth)) {
                    context.nextToken();
                    slotSummary.setSlotTypeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("valueElicitationPromptSpecification", targetDepth)) {
                    context.nextToken();
                    slotSummary.setValueElicitationPromptSpecification(PromptSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    slotSummary.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return slotSummary;
    }

    private static SlotSummaryJsonUnmarshaller instance;

    public static SlotSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SlotSummaryJsonUnmarshaller();
        return instance;
    }
}
