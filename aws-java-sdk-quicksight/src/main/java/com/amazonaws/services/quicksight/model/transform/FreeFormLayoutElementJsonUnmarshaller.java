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
 * FreeFormLayoutElement JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FreeFormLayoutElementJsonUnmarshaller implements Unmarshaller<FreeFormLayoutElement, JsonUnmarshallerContext> {

    public FreeFormLayoutElement unmarshall(JsonUnmarshallerContext context) throws Exception {
        FreeFormLayoutElement freeFormLayoutElement = new FreeFormLayoutElement();

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
                if (context.testExpression("ElementId", targetDepth)) {
                    context.nextToken();
                    freeFormLayoutElement.setElementId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ElementType", targetDepth)) {
                    context.nextToken();
                    freeFormLayoutElement.setElementType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("XAxisLocation", targetDepth)) {
                    context.nextToken();
                    freeFormLayoutElement.setXAxisLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("YAxisLocation", targetDepth)) {
                    context.nextToken();
                    freeFormLayoutElement.setYAxisLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Width", targetDepth)) {
                    context.nextToken();
                    freeFormLayoutElement.setWidth(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Height", targetDepth)) {
                    context.nextToken();
                    freeFormLayoutElement.setHeight(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Visibility", targetDepth)) {
                    context.nextToken();
                    freeFormLayoutElement.setVisibility(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RenderingRules", targetDepth)) {
                    context.nextToken();
                    freeFormLayoutElement.setRenderingRules(new ListUnmarshaller<SheetElementRenderingRule>(SheetElementRenderingRuleJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("BorderStyle", targetDepth)) {
                    context.nextToken();
                    freeFormLayoutElement.setBorderStyle(FreeFormLayoutElementBorderStyleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SelectedBorderStyle", targetDepth)) {
                    context.nextToken();
                    freeFormLayoutElement.setSelectedBorderStyle(FreeFormLayoutElementBorderStyleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BackgroundStyle", targetDepth)) {
                    context.nextToken();
                    freeFormLayoutElement.setBackgroundStyle(FreeFormLayoutElementBackgroundStyleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LoadingAnimation", targetDepth)) {
                    context.nextToken();
                    freeFormLayoutElement.setLoadingAnimation(LoadingAnimationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return freeFormLayoutElement;
    }

    private static FreeFormLayoutElementJsonUnmarshaller instance;

    public static FreeFormLayoutElementJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FreeFormLayoutElementJsonUnmarshaller();
        return instance;
    }
}
