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
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PivotTableCellConditionalFormatting JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PivotTableCellConditionalFormattingJsonUnmarshaller implements Unmarshaller<PivotTableCellConditionalFormatting, JsonUnmarshallerContext> {

    public PivotTableCellConditionalFormatting unmarshall(JsonUnmarshallerContext context) throws Exception {
        PivotTableCellConditionalFormatting pivotTableCellConditionalFormatting = new PivotTableCellConditionalFormatting();

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
                if (context.testExpression("FieldId", targetDepth)) {
                    context.nextToken();
                    pivotTableCellConditionalFormatting.setFieldId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TextFormat", targetDepth)) {
                    context.nextToken();
                    pivotTableCellConditionalFormatting.setTextFormat(TextConditionalFormatJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Scope", targetDepth)) {
                    context.nextToken();
                    pivotTableCellConditionalFormatting.setScope(PivotTableConditionalFormattingScopeJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return pivotTableCellConditionalFormatting;
    }

    private static PivotTableCellConditionalFormattingJsonUnmarshaller instance;

    public static PivotTableCellConditionalFormattingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PivotTableCellConditionalFormattingJsonUnmarshaller();
        return instance;
    }
}
