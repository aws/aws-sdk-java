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
package com.amazonaws.services.codebuild.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Report JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportJsonUnmarshaller implements Unmarshaller<Report, JsonUnmarshallerContext> {

    public Report unmarshall(JsonUnmarshallerContext context) throws Exception {
        Report report = new Report();

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
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    report.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    report.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    report.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("reportGroupArn", targetDepth)) {
                    context.nextToken();
                    report.setReportGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("executionId", targetDepth)) {
                    context.nextToken();
                    report.setExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    report.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("created", targetDepth)) {
                    context.nextToken();
                    report.setCreated(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("expired", targetDepth)) {
                    context.nextToken();
                    report.setExpired(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("exportConfig", targetDepth)) {
                    context.nextToken();
                    report.setExportConfig(ReportExportConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("truncated", targetDepth)) {
                    context.nextToken();
                    report.setTruncated(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("testSummary", targetDepth)) {
                    context.nextToken();
                    report.setTestSummary(TestReportSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return report;
    }

    private static ReportJsonUnmarshaller instance;

    public static ReportJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReportJsonUnmarshaller();
        return instance;
    }
}
