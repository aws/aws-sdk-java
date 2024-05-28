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
 * CodegenJobGenericDataSchema JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodegenJobGenericDataSchemaJsonUnmarshaller implements Unmarshaller<CodegenJobGenericDataSchema, JsonUnmarshallerContext> {

    public CodegenJobGenericDataSchema unmarshall(JsonUnmarshallerContext context) throws Exception {
        CodegenJobGenericDataSchema codegenJobGenericDataSchema = new CodegenJobGenericDataSchema();

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
                if (context.testExpression("dataSourceType", targetDepth)) {
                    context.nextToken();
                    codegenJobGenericDataSchema.setDataSourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("models", targetDepth)) {
                    context.nextToken();
                    codegenJobGenericDataSchema.setModels(new MapUnmarshaller<String, CodegenGenericDataModel>(context.getUnmarshaller(String.class),
                            CodegenGenericDataModelJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("enums", targetDepth)) {
                    context.nextToken();
                    codegenJobGenericDataSchema.setEnums(new MapUnmarshaller<String, CodegenGenericDataEnum>(context.getUnmarshaller(String.class),
                            CodegenGenericDataEnumJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("nonModels", targetDepth)) {
                    context.nextToken();
                    codegenJobGenericDataSchema.setNonModels(new MapUnmarshaller<String, CodegenGenericDataNonModel>(context.getUnmarshaller(String.class),
                            CodegenGenericDataNonModelJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return codegenJobGenericDataSchema;
    }

    private static CodegenJobGenericDataSchemaJsonUnmarshaller instance;

    public static CodegenJobGenericDataSchemaJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CodegenJobGenericDataSchemaJsonUnmarshaller();
        return instance;
    }
}
