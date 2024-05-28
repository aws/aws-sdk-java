/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wellarchitected.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.wellarchitected.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ConsolidatedReportMetric JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConsolidatedReportMetricJsonUnmarshaller implements Unmarshaller<ConsolidatedReportMetric, JsonUnmarshallerContext> {

    public ConsolidatedReportMetric unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConsolidatedReportMetric consolidatedReportMetric = new ConsolidatedReportMetric();

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
                if (context.testExpression("MetricType", targetDepth)) {
                    context.nextToken();
                    consolidatedReportMetric.setMetricType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RiskCounts", targetDepth)) {
                    context.nextToken();
                    consolidatedReportMetric.setRiskCounts(new MapUnmarshaller<String, Integer>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(Integer.class)).unmarshall(context));
                }
                if (context.testExpression("WorkloadId", targetDepth)) {
                    context.nextToken();
                    consolidatedReportMetric.setWorkloadId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WorkloadName", targetDepth)) {
                    context.nextToken();
                    consolidatedReportMetric.setWorkloadName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WorkloadArn", targetDepth)) {
                    context.nextToken();
                    consolidatedReportMetric.setWorkloadArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    context.nextToken();
                    consolidatedReportMetric.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Lenses", targetDepth)) {
                    context.nextToken();
                    consolidatedReportMetric.setLenses(new ListUnmarshaller<LensMetric>(LensMetricJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("LensesAppliedCount", targetDepth)) {
                    context.nextToken();
                    consolidatedReportMetric.setLensesAppliedCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return consolidatedReportMetric;
    }

    private static ConsolidatedReportMetricJsonUnmarshaller instance;

    public static ConsolidatedReportMetricJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConsolidatedReportMetricJsonUnmarshaller();
        return instance;
    }
}
