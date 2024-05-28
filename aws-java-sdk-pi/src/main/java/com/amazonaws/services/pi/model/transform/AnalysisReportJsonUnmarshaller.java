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
package com.amazonaws.services.pi.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pi.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AnalysisReport JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisReportJsonUnmarshaller implements Unmarshaller<AnalysisReport, JsonUnmarshallerContext> {

    public AnalysisReport unmarshall(JsonUnmarshallerContext context) throws Exception {
        AnalysisReport analysisReport = new AnalysisReport();

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
                if (context.testExpression("AnalysisReportId", targetDepth)) {
                    context.nextToken();
                    analysisReport.setAnalysisReportId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Identifier", targetDepth)) {
                    context.nextToken();
                    analysisReport.setIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceType", targetDepth)) {
                    context.nextToken();
                    analysisReport.setServiceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreateTime", targetDepth)) {
                    context.nextToken();
                    analysisReport.setCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    analysisReport.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    analysisReport.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    analysisReport.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Insights", targetDepth)) {
                    context.nextToken();
                    analysisReport.setInsights(new ListUnmarshaller<Insight>(InsightJsonUnmarshaller.getInstance())

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

        return analysisReport;
    }

    private static AnalysisReportJsonUnmarshaller instance;

    public static AnalysisReportJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AnalysisReportJsonUnmarshaller();
        return instance;
    }
}
