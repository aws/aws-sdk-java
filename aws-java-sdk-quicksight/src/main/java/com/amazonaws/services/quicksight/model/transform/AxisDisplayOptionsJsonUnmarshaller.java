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
 * AxisDisplayOptions JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AxisDisplayOptionsJsonUnmarshaller implements Unmarshaller<AxisDisplayOptions, JsonUnmarshallerContext> {

    public AxisDisplayOptions unmarshall(JsonUnmarshallerContext context) throws Exception {
        AxisDisplayOptions axisDisplayOptions = new AxisDisplayOptions();

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
                if (context.testExpression("TickLabelOptions", targetDepth)) {
                    context.nextToken();
                    axisDisplayOptions.setTickLabelOptions(AxisTickLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AxisLineVisibility", targetDepth)) {
                    context.nextToken();
                    axisDisplayOptions.setAxisLineVisibility(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GridLineVisibility", targetDepth)) {
                    context.nextToken();
                    axisDisplayOptions.setGridLineVisibility(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataOptions", targetDepth)) {
                    context.nextToken();
                    axisDisplayOptions.setDataOptions(AxisDataOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ScrollbarOptions", targetDepth)) {
                    context.nextToken();
                    axisDisplayOptions.setScrollbarOptions(ScrollBarOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AxisOffset", targetDepth)) {
                    context.nextToken();
                    axisDisplayOptions.setAxisOffset(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return axisDisplayOptions;
    }

    private static AxisDisplayOptionsJsonUnmarshaller instance;

    public static AxisDisplayOptionsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AxisDisplayOptionsJsonUnmarshaller();
        return instance;
    }
}
