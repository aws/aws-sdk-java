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
 * NumericEqualityFilter JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NumericEqualityFilterJsonUnmarshaller implements Unmarshaller<NumericEqualityFilter, JsonUnmarshallerContext> {

    public NumericEqualityFilter unmarshall(JsonUnmarshallerContext context) throws Exception {
        NumericEqualityFilter numericEqualityFilter = new NumericEqualityFilter();

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
                if (context.testExpression("FilterId", targetDepth)) {
                    context.nextToken();
                    numericEqualityFilter.setFilterId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Column", targetDepth)) {
                    context.nextToken();
                    numericEqualityFilter.setColumn(ColumnIdentifierJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Value", targetDepth)) {
                    context.nextToken();
                    numericEqualityFilter.setValue(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("SelectAllOptions", targetDepth)) {
                    context.nextToken();
                    numericEqualityFilter.setSelectAllOptions(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MatchOperator", targetDepth)) {
                    context.nextToken();
                    numericEqualityFilter.setMatchOperator(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AggregationFunction", targetDepth)) {
                    context.nextToken();
                    numericEqualityFilter.setAggregationFunction(AggregationFunctionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ParameterName", targetDepth)) {
                    context.nextToken();
                    numericEqualityFilter.setParameterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NullOption", targetDepth)) {
                    context.nextToken();
                    numericEqualityFilter.setNullOption(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return numericEqualityFilter;
    }

    private static NumericEqualityFilterJsonUnmarshaller instance;

    public static NumericEqualityFilterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NumericEqualityFilterJsonUnmarshaller();
        return instance;
    }
}
