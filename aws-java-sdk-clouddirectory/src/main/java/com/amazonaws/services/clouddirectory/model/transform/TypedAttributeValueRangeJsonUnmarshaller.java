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
package com.amazonaws.services.clouddirectory.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.clouddirectory.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TypedAttributeValueRange JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TypedAttributeValueRangeJsonUnmarshaller implements Unmarshaller<TypedAttributeValueRange, JsonUnmarshallerContext> {

    public TypedAttributeValueRange unmarshall(JsonUnmarshallerContext context) throws Exception {
        TypedAttributeValueRange typedAttributeValueRange = new TypedAttributeValueRange();

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
                if (context.testExpression("StartMode", targetDepth)) {
                    context.nextToken();
                    typedAttributeValueRange.setStartMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartValue", targetDepth)) {
                    context.nextToken();
                    typedAttributeValueRange.setStartValue(TypedAttributeValueJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EndMode", targetDepth)) {
                    context.nextToken();
                    typedAttributeValueRange.setEndMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndValue", targetDepth)) {
                    context.nextToken();
                    typedAttributeValueRange.setEndValue(TypedAttributeValueJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return typedAttributeValueRange;
    }

    private static TypedAttributeValueRangeJsonUnmarshaller instance;

    public static TypedAttributeValueRangeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TypedAttributeValueRangeJsonUnmarshaller();
        return instance;
    }
}
