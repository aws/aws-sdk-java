/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitoidp.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SchemaAttributeType JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaAttributeTypeJsonUnmarshaller implements Unmarshaller<SchemaAttributeType, JsonUnmarshallerContext> {

    public SchemaAttributeType unmarshall(JsonUnmarshallerContext context) throws Exception {
        SchemaAttributeType schemaAttributeType = new SchemaAttributeType();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    schemaAttributeType.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AttributeDataType", targetDepth)) {
                    context.nextToken();
                    schemaAttributeType.setAttributeDataType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeveloperOnlyAttribute", targetDepth)) {
                    context.nextToken();
                    schemaAttributeType.setDeveloperOnlyAttribute(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Mutable", targetDepth)) {
                    context.nextToken();
                    schemaAttributeType.setMutable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Required", targetDepth)) {
                    context.nextToken();
                    schemaAttributeType.setRequired(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("NumberAttributeConstraints", targetDepth)) {
                    context.nextToken();
                    schemaAttributeType.setNumberAttributeConstraints(NumberAttributeConstraintsTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StringAttributeConstraints", targetDepth)) {
                    context.nextToken();
                    schemaAttributeType.setStringAttributeConstraints(StringAttributeConstraintsTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return schemaAttributeType;
    }

    private static SchemaAttributeTypeJsonUnmarshaller instance;

    public static SchemaAttributeTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SchemaAttributeTypeJsonUnmarshaller();
        return instance;
    }
}
