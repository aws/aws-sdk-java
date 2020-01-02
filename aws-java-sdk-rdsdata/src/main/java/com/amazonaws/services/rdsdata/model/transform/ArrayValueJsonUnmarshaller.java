/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rdsdata.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.rdsdata.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ArrayValue JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArrayValueJsonUnmarshaller implements Unmarshaller<ArrayValue, JsonUnmarshallerContext> {

    public ArrayValue unmarshall(JsonUnmarshallerContext context) throws Exception {
        ArrayValue arrayValue = new ArrayValue();

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
                if (context.testExpression("arrayValues", targetDepth)) {
                    context.nextToken();
                    arrayValue.setArrayValues(new ListUnmarshaller<ArrayValue>(ArrayValueJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("booleanValues", targetDepth)) {
                    context.nextToken();
                    arrayValue.setBooleanValues(new ListUnmarshaller<Boolean>(context.getUnmarshaller(Boolean.class)).unmarshall(context));
                }
                if (context.testExpression("doubleValues", targetDepth)) {
                    context.nextToken();
                    arrayValue.setDoubleValues(new ListUnmarshaller<Double>(context.getUnmarshaller(Double.class)).unmarshall(context));
                }
                if (context.testExpression("longValues", targetDepth)) {
                    context.nextToken();
                    arrayValue.setLongValues(new ListUnmarshaller<Long>(context.getUnmarshaller(Long.class)).unmarshall(context));
                }
                if (context.testExpression("stringValues", targetDepth)) {
                    context.nextToken();
                    arrayValue.setStringValues(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return arrayValue;
    }

    private static ArrayValueJsonUnmarshaller instance;

    public static ArrayValueJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ArrayValueJsonUnmarshaller();
        return instance;
    }
}
