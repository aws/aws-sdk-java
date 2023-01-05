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
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MeasureField JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MeasureFieldJsonUnmarshaller implements Unmarshaller<MeasureField, JsonUnmarshallerContext> {

    public MeasureField unmarshall(JsonUnmarshallerContext context) throws Exception {
        MeasureField measureField = new MeasureField();

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
                if (context.testExpression("NumericalMeasureField", targetDepth)) {
                    context.nextToken();
                    measureField.setNumericalMeasureField(NumericalMeasureFieldJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CategoricalMeasureField", targetDepth)) {
                    context.nextToken();
                    measureField.setCategoricalMeasureField(CategoricalMeasureFieldJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DateMeasureField", targetDepth)) {
                    context.nextToken();
                    measureField.setDateMeasureField(DateMeasureFieldJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CalculatedMeasureField", targetDepth)) {
                    context.nextToken();
                    measureField.setCalculatedMeasureField(CalculatedMeasureFieldJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return measureField;
    }

    private static MeasureFieldJsonUnmarshaller instance;

    public static MeasureFieldJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MeasureFieldJsonUnmarshaller();
        return instance;
    }
}
