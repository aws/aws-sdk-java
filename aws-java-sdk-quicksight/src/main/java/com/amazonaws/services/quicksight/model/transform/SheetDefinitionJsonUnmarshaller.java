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
 * SheetDefinition JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SheetDefinitionJsonUnmarshaller implements Unmarshaller<SheetDefinition, JsonUnmarshallerContext> {

    public SheetDefinition unmarshall(JsonUnmarshallerContext context) throws Exception {
        SheetDefinition sheetDefinition = new SheetDefinition();

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
                if (context.testExpression("SheetId", targetDepth)) {
                    context.nextToken();
                    sheetDefinition.setSheetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    context.nextToken();
                    sheetDefinition.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    sheetDefinition.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    sheetDefinition.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParameterControls", targetDepth)) {
                    context.nextToken();
                    sheetDefinition.setParameterControls(new ListUnmarshaller<ParameterControl>(ParameterControlJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("FilterControls", targetDepth)) {
                    context.nextToken();
                    sheetDefinition.setFilterControls(new ListUnmarshaller<FilterControl>(FilterControlJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Visuals", targetDepth)) {
                    context.nextToken();
                    sheetDefinition.setVisuals(new ListUnmarshaller<Visual>(VisualJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("TextBoxes", targetDepth)) {
                    context.nextToken();
                    sheetDefinition.setTextBoxes(new ListUnmarshaller<SheetTextBox>(SheetTextBoxJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Layouts", targetDepth)) {
                    context.nextToken();
                    sheetDefinition.setLayouts(new ListUnmarshaller<Layout>(LayoutJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("SheetControlLayouts", targetDepth)) {
                    context.nextToken();
                    sheetDefinition.setSheetControlLayouts(new ListUnmarshaller<SheetControlLayout>(SheetControlLayoutJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ContentType", targetDepth)) {
                    context.nextToken();
                    sheetDefinition.setContentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return sheetDefinition;
    }

    private static SheetDefinitionJsonUnmarshaller instance;

    public static SheetDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SheetDefinitionJsonUnmarshaller();
        return instance;
    }
}
