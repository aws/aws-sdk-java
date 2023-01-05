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
 * Computation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComputationJsonUnmarshaller implements Unmarshaller<Computation, JsonUnmarshallerContext> {

    public Computation unmarshall(JsonUnmarshallerContext context) throws Exception {
        Computation computation = new Computation();

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
                if (context.testExpression("TopBottomRanked", targetDepth)) {
                    context.nextToken();
                    computation.setTopBottomRanked(TopBottomRankedComputationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TopBottomMovers", targetDepth)) {
                    context.nextToken();
                    computation.setTopBottomMovers(TopBottomMoversComputationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TotalAggregation", targetDepth)) {
                    context.nextToken();
                    computation.setTotalAggregation(TotalAggregationComputationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MaximumMinimum", targetDepth)) {
                    context.nextToken();
                    computation.setMaximumMinimum(MaximumMinimumComputationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MetricComparison", targetDepth)) {
                    context.nextToken();
                    computation.setMetricComparison(MetricComparisonComputationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PeriodOverPeriod", targetDepth)) {
                    context.nextToken();
                    computation.setPeriodOverPeriod(PeriodOverPeriodComputationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PeriodToDate", targetDepth)) {
                    context.nextToken();
                    computation.setPeriodToDate(PeriodToDateComputationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GrowthRate", targetDepth)) {
                    context.nextToken();
                    computation.setGrowthRate(GrowthRateComputationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("UniqueValues", targetDepth)) {
                    context.nextToken();
                    computation.setUniqueValues(UniqueValuesComputationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Forecast", targetDepth)) {
                    context.nextToken();
                    computation.setForecast(ForecastComputationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return computation;
    }

    private static ComputationJsonUnmarshaller instance;

    public static ComputationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ComputationJsonUnmarshaller();
        return instance;
    }
}
