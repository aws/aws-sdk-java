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
 * PeriodToDateComputation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PeriodToDateComputationJsonUnmarshaller implements Unmarshaller<PeriodToDateComputation, JsonUnmarshallerContext> {

    public PeriodToDateComputation unmarshall(JsonUnmarshallerContext context) throws Exception {
        PeriodToDateComputation periodToDateComputation = new PeriodToDateComputation();

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
                if (context.testExpression("ComputationId", targetDepth)) {
                    context.nextToken();
                    periodToDateComputation.setComputationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    periodToDateComputation.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Time", targetDepth)) {
                    context.nextToken();
                    periodToDateComputation.setTime(DimensionFieldJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Value", targetDepth)) {
                    context.nextToken();
                    periodToDateComputation.setValue(MeasureFieldJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PeriodTimeGranularity", targetDepth)) {
                    context.nextToken();
                    periodToDateComputation.setPeriodTimeGranularity(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return periodToDateComputation;
    }

    private static PeriodToDateComputationJsonUnmarshaller instance;

    public static PeriodToDateComputationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PeriodToDateComputationJsonUnmarshaller();
        return instance;
    }
}
