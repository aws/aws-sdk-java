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
 * FilterControl JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterControlJsonUnmarshaller implements Unmarshaller<FilterControl, JsonUnmarshallerContext> {

    public FilterControl unmarshall(JsonUnmarshallerContext context) throws Exception {
        FilterControl filterControl = new FilterControl();

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
                if (context.testExpression("DateTimePicker", targetDepth)) {
                    context.nextToken();
                    filterControl.setDateTimePicker(FilterDateTimePickerControlJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("List", targetDepth)) {
                    context.nextToken();
                    filterControl.setList(FilterListControlJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Dropdown", targetDepth)) {
                    context.nextToken();
                    filterControl.setDropdown(FilterDropDownControlJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TextField", targetDepth)) {
                    context.nextToken();
                    filterControl.setTextField(FilterTextFieldControlJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TextArea", targetDepth)) {
                    context.nextToken();
                    filterControl.setTextArea(FilterTextAreaControlJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Slider", targetDepth)) {
                    context.nextToken();
                    filterControl.setSlider(FilterSliderControlJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RelativeDateTime", targetDepth)) {
                    context.nextToken();
                    filterControl.setRelativeDateTime(FilterRelativeDateTimeControlJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return filterControl;
    }

    private static FilterControlJsonUnmarshaller instance;

    public static FilterControlJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FilterControlJsonUnmarshaller();
        return instance;
    }
}
