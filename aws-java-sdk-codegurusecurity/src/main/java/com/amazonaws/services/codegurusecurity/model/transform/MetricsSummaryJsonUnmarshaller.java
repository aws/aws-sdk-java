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
package com.amazonaws.services.codegurusecurity.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codegurusecurity.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MetricsSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricsSummaryJsonUnmarshaller implements Unmarshaller<MetricsSummary, JsonUnmarshallerContext> {

    public MetricsSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        MetricsSummary metricsSummary = new MetricsSummary();

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
                if (context.testExpression("categoriesWithMostFindings", targetDepth)) {
                    context.nextToken();
                    metricsSummary.setCategoriesWithMostFindings(new ListUnmarshaller<CategoryWithFindingNum>(CategoryWithFindingNumJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("date", targetDepth)) {
                    context.nextToken();
                    metricsSummary.setDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("openFindings", targetDepth)) {
                    context.nextToken();
                    metricsSummary.setOpenFindings(FindingMetricsValuePerSeverityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("scansWithMostOpenCriticalFindings", targetDepth)) {
                    context.nextToken();
                    metricsSummary.setScansWithMostOpenCriticalFindings(new ListUnmarshaller<ScanNameWithFindingNum>(ScanNameWithFindingNumJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("scansWithMostOpenFindings", targetDepth)) {
                    context.nextToken();
                    metricsSummary.setScansWithMostOpenFindings(new ListUnmarshaller<ScanNameWithFindingNum>(ScanNameWithFindingNumJsonUnmarshaller
                            .getInstance())

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

        return metricsSummary;
    }

    private static MetricsSummaryJsonUnmarshaller instance;

    public static MetricsSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MetricsSummaryJsonUnmarshaller();
        return instance;
    }
}
