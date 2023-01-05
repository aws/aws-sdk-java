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
 * PivotTotalOptions JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PivotTotalOptionsJsonUnmarshaller implements Unmarshaller<PivotTotalOptions, JsonUnmarshallerContext> {

    public PivotTotalOptions unmarshall(JsonUnmarshallerContext context) throws Exception {
        PivotTotalOptions pivotTotalOptions = new PivotTotalOptions();

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
                if (context.testExpression("TotalsVisibility", targetDepth)) {
                    context.nextToken();
                    pivotTotalOptions.setTotalsVisibility(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Placement", targetDepth)) {
                    context.nextToken();
                    pivotTotalOptions.setPlacement(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScrollStatus", targetDepth)) {
                    context.nextToken();
                    pivotTotalOptions.setScrollStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomLabel", targetDepth)) {
                    context.nextToken();
                    pivotTotalOptions.setCustomLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TotalCellStyle", targetDepth)) {
                    context.nextToken();
                    pivotTotalOptions.setTotalCellStyle(TableCellStyleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ValueCellStyle", targetDepth)) {
                    context.nextToken();
                    pivotTotalOptions.setValueCellStyle(TableCellStyleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MetricHeaderCellStyle", targetDepth)) {
                    context.nextToken();
                    pivotTotalOptions.setMetricHeaderCellStyle(TableCellStyleJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return pivotTotalOptions;
    }

    private static PivotTotalOptionsJsonUnmarshaller instance;

    public static PivotTotalOptionsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PivotTotalOptionsJsonUnmarshaller();
        return instance;
    }
}
