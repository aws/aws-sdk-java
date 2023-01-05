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
 * FieldConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldConfigJsonUnmarshaller implements Unmarshaller<FieldConfig, JsonUnmarshallerContext> {

    public FieldConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        FieldConfig fieldConfig = new FieldConfig();

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
                if (context.testExpression("excluded", targetDepth)) {
                    context.nextToken();
                    fieldConfig.setExcluded(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("inputType", targetDepth)) {
                    context.nextToken();
                    fieldConfig.setInputType(FieldInputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("label", targetDepth)) {
                    context.nextToken();
                    fieldConfig.setLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("position", targetDepth)) {
                    context.nextToken();
                    fieldConfig.setPosition(FieldPositionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("validations", targetDepth)) {
                    context.nextToken();
                    fieldConfig.setValidations(new ListUnmarshaller<FieldValidationConfiguration>(FieldValidationConfigurationJsonUnmarshaller.getInstance())

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

        return fieldConfig;
    }

    private static FieldConfigJsonUnmarshaller instance;

    public static FieldConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FieldConfigJsonUnmarshaller();
        return instance;
    }
}
