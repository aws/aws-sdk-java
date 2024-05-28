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
package com.amazonaws.services.pinpointsmsvoicev2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpointsmsvoicev2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RegistrationFieldDefinition JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegistrationFieldDefinitionJsonUnmarshaller implements Unmarshaller<RegistrationFieldDefinition, JsonUnmarshallerContext> {

    public RegistrationFieldDefinition unmarshall(JsonUnmarshallerContext context) throws Exception {
        RegistrationFieldDefinition registrationFieldDefinition = new RegistrationFieldDefinition();

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
                if (context.testExpression("SectionPath", targetDepth)) {
                    context.nextToken();
                    registrationFieldDefinition.setSectionPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FieldPath", targetDepth)) {
                    context.nextToken();
                    registrationFieldDefinition.setFieldPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FieldType", targetDepth)) {
                    context.nextToken();
                    registrationFieldDefinition.setFieldType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FieldRequirement", targetDepth)) {
                    context.nextToken();
                    registrationFieldDefinition.setFieldRequirement(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SelectValidation", targetDepth)) {
                    context.nextToken();
                    registrationFieldDefinition.setSelectValidation(SelectValidationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TextValidation", targetDepth)) {
                    context.nextToken();
                    registrationFieldDefinition.setTextValidation(TextValidationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DisplayHints", targetDepth)) {
                    context.nextToken();
                    registrationFieldDefinition.setDisplayHints(RegistrationFieldDisplayHintsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return registrationFieldDefinition;
    }

    private static RegistrationFieldDefinitionJsonUnmarshaller instance;

    public static RegistrationFieldDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RegistrationFieldDefinitionJsonUnmarshaller();
        return instance;
    }
}
