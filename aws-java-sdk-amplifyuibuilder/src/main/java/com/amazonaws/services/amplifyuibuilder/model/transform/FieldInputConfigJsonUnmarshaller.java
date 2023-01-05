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
package com.amazonaws.services.amplifyuibuilder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.amplifyuibuilder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FieldInputConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldInputConfigJsonUnmarshaller implements Unmarshaller<FieldInputConfig, JsonUnmarshallerContext> {

    public FieldInputConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        FieldInputConfig fieldInputConfig = new FieldInputConfig();

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
                if (context.testExpression("defaultChecked", targetDepth)) {
                    context.nextToken();
                    fieldInputConfig.setDefaultChecked(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("defaultCountryCode", targetDepth)) {
                    context.nextToken();
                    fieldInputConfig.setDefaultCountryCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("defaultValue", targetDepth)) {
                    context.nextToken();
                    fieldInputConfig.setDefaultValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("descriptiveText", targetDepth)) {
                    context.nextToken();
                    fieldInputConfig.setDescriptiveText(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("isArray", targetDepth)) {
                    context.nextToken();
                    fieldInputConfig.setIsArray(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("maxValue", targetDepth)) {
                    context.nextToken();
                    fieldInputConfig.setMaxValue(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("minValue", targetDepth)) {
                    context.nextToken();
                    fieldInputConfig.setMinValue(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    fieldInputConfig.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("placeholder", targetDepth)) {
                    context.nextToken();
                    fieldInputConfig.setPlaceholder(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("readOnly", targetDepth)) {
                    context.nextToken();
                    fieldInputConfig.setReadOnly(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("required", targetDepth)) {
                    context.nextToken();
                    fieldInputConfig.setRequired(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("step", targetDepth)) {
                    context.nextToken();
                    fieldInputConfig.setStep(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    fieldInputConfig.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("value", targetDepth)) {
                    context.nextToken();
                    fieldInputConfig.setValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("valueMappings", targetDepth)) {
                    context.nextToken();
                    fieldInputConfig.setValueMappings(ValueMappingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return fieldInputConfig;
    }

    private static FieldInputConfigJsonUnmarshaller instance;

    public static FieldInputConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FieldInputConfigJsonUnmarshaller();
        return instance;
    }
}
