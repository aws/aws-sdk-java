/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.timestreamquery.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.timestreamquery.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Type JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TypeJsonUnmarshaller implements Unmarshaller<Type, JsonUnmarshallerContext> {

    public Type unmarshall(JsonUnmarshallerContext context) throws Exception {
        Type type = new Type();

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
                if (context.testExpression("ScalarType", targetDepth)) {
                    context.nextToken();
                    type.setScalarType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ArrayColumnInfo", targetDepth)) {
                    context.nextToken();
                    type.setArrayColumnInfo(ColumnInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TimeSeriesMeasureValueColumnInfo", targetDepth)) {
                    context.nextToken();
                    type.setTimeSeriesMeasureValueColumnInfo(ColumnInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RowColumnInfo", targetDepth)) {
                    context.nextToken();
                    type.setRowColumnInfo(new ListUnmarshaller<ColumnInfo>(ColumnInfoJsonUnmarshaller.getInstance())

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

        return type;
    }

    private static TypeJsonUnmarshaller instance;

    public static TypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TypeJsonUnmarshaller();
        return instance;
    }
}
