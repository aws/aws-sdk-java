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
package com.amazonaws.services.amplifyuibuilder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.amplifyuibuilder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CodegenGenericDataField JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodegenGenericDataFieldJsonUnmarshaller implements Unmarshaller<CodegenGenericDataField, JsonUnmarshallerContext> {

    public CodegenGenericDataField unmarshall(JsonUnmarshallerContext context) throws Exception {
        CodegenGenericDataField codegenGenericDataField = new CodegenGenericDataField();

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
                if (context.testExpression("dataType", targetDepth)) {
                    context.nextToken();
                    codegenGenericDataField.setDataType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataTypeValue", targetDepth)) {
                    context.nextToken();
                    codegenGenericDataField.setDataTypeValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("required", targetDepth)) {
                    context.nextToken();
                    codegenGenericDataField.setRequired(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("readOnly", targetDepth)) {
                    context.nextToken();
                    codegenGenericDataField.setReadOnly(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("isArray", targetDepth)) {
                    context.nextToken();
                    codegenGenericDataField.setIsArray(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("relationship", targetDepth)) {
                    context.nextToken();
                    codegenGenericDataField.setRelationship(CodegenGenericDataRelationshipTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return codegenGenericDataField;
    }

    private static CodegenGenericDataFieldJsonUnmarshaller instance;

    public static CodegenGenericDataFieldJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CodegenGenericDataFieldJsonUnmarshaller();
        return instance;
    }
}
