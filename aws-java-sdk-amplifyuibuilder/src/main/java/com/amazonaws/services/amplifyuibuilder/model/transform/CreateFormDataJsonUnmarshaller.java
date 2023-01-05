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
 * CreateFormData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFormDataJsonUnmarshaller implements Unmarshaller<CreateFormData, JsonUnmarshallerContext> {

    public CreateFormData unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateFormData createFormData = new CreateFormData();

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
                if (context.testExpression("cta", targetDepth)) {
                    context.nextToken();
                    createFormData.setCta(FormCTAJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dataType", targetDepth)) {
                    context.nextToken();
                    createFormData.setDataType(FormDataTypeConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("fields", targetDepth)) {
                    context.nextToken();
                    createFormData.setFields(new MapUnmarshaller<String, FieldConfig>(context.getUnmarshaller(String.class), FieldConfigJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("formActionType", targetDepth)) {
                    context.nextToken();
                    createFormData.setFormActionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    createFormData.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("schemaVersion", targetDepth)) {
                    context.nextToken();
                    createFormData.setSchemaVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sectionalElements", targetDepth)) {
                    context.nextToken();
                    createFormData.setSectionalElements(new MapUnmarshaller<String, SectionalElement>(context.getUnmarshaller(String.class),
                            SectionalElementJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("style", targetDepth)) {
                    context.nextToken();
                    createFormData.setStyle(FormStyleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    createFormData.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return createFormData;
    }

    private static CreateFormDataJsonUnmarshaller instance;

    public static CreateFormDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateFormDataJsonUnmarshaller();
        return instance;
    }
}
