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
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DefaultFilterControlOptions JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultFilterControlOptionsJsonUnmarshaller implements Unmarshaller<DefaultFilterControlOptions, JsonUnmarshallerContext> {

    public DefaultFilterControlOptions unmarshall(JsonUnmarshallerContext context) throws Exception {
        DefaultFilterControlOptions defaultFilterControlOptions = new DefaultFilterControlOptions();

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
                if (context.testExpression("DefaultDateTimePickerOptions", targetDepth)) {
                    context.nextToken();
                    defaultFilterControlOptions.setDefaultDateTimePickerOptions(DefaultDateTimePickerControlOptionsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("DefaultListOptions", targetDepth)) {
                    context.nextToken();
                    defaultFilterControlOptions.setDefaultListOptions(DefaultFilterListControlOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DefaultDropdownOptions", targetDepth)) {
                    context.nextToken();
                    defaultFilterControlOptions
                            .setDefaultDropdownOptions(DefaultFilterDropDownControlOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DefaultTextFieldOptions", targetDepth)) {
                    context.nextToken();
                    defaultFilterControlOptions.setDefaultTextFieldOptions(DefaultTextFieldControlOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DefaultTextAreaOptions", targetDepth)) {
                    context.nextToken();
                    defaultFilterControlOptions.setDefaultTextAreaOptions(DefaultTextAreaControlOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DefaultSliderOptions", targetDepth)) {
                    context.nextToken();
                    defaultFilterControlOptions.setDefaultSliderOptions(DefaultSliderControlOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DefaultRelativeDateTimeOptions", targetDepth)) {
                    context.nextToken();
                    defaultFilterControlOptions.setDefaultRelativeDateTimeOptions(DefaultRelativeDateTimeControlOptionsJsonUnmarshaller.getInstance()
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

        return defaultFilterControlOptions;
    }

    private static DefaultFilterControlOptionsJsonUnmarshaller instance;

    public static DefaultFilterControlOptionsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DefaultFilterControlOptionsJsonUnmarshaller();
        return instance;
    }
}
