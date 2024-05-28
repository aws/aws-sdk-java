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
package com.amazonaws.services.fms.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.fms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EntryViolation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntryViolationJsonUnmarshaller implements Unmarshaller<EntryViolation, JsonUnmarshallerContext> {

    public EntryViolation unmarshall(JsonUnmarshallerContext context) throws Exception {
        EntryViolation entryViolation = new EntryViolation();

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
                if (context.testExpression("ExpectedEntry", targetDepth)) {
                    context.nextToken();
                    entryViolation.setExpectedEntry(EntryDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ExpectedEvaluationOrder", targetDepth)) {
                    context.nextToken();
                    entryViolation.setExpectedEvaluationOrder(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ActualEvaluationOrder", targetDepth)) {
                    context.nextToken();
                    entryViolation.setActualEvaluationOrder(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EntryAtExpectedEvaluationOrder", targetDepth)) {
                    context.nextToken();
                    entryViolation.setEntryAtExpectedEvaluationOrder(EntryDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EntriesWithConflicts", targetDepth)) {
                    context.nextToken();
                    entryViolation.setEntriesWithConflicts(new ListUnmarshaller<EntryDescription>(EntryDescriptionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("EntryViolationReasons", targetDepth)) {
                    context.nextToken();
                    entryViolation.setEntryViolationReasons(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return entryViolation;
    }

    private static EntryViolationJsonUnmarshaller instance;

    public static EntryViolationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EntryViolationJsonUnmarshaller();
        return instance;
    }
}
