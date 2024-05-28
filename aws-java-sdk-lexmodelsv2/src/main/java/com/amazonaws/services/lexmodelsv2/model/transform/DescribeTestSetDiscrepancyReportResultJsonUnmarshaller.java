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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeTestSetDiscrepancyReportResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTestSetDiscrepancyReportResultJsonUnmarshaller implements Unmarshaller<DescribeTestSetDiscrepancyReportResult, JsonUnmarshallerContext> {

    public DescribeTestSetDiscrepancyReportResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeTestSetDiscrepancyReportResult describeTestSetDiscrepancyReportResult = new DescribeTestSetDiscrepancyReportResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeTestSetDiscrepancyReportResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("testSetDiscrepancyReportId", targetDepth)) {
                    context.nextToken();
                    describeTestSetDiscrepancyReportResult.setTestSetDiscrepancyReportId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("testSetId", targetDepth)) {
                    context.nextToken();
                    describeTestSetDiscrepancyReportResult.setTestSetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    describeTestSetDiscrepancyReportResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("target", targetDepth)) {
                    context.nextToken();
                    describeTestSetDiscrepancyReportResult.setTarget(TestSetDiscrepancyReportResourceTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("testSetDiscrepancyReportStatus", targetDepth)) {
                    context.nextToken();
                    describeTestSetDiscrepancyReportResult.setTestSetDiscrepancyReportStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDataTime", targetDepth)) {
                    context.nextToken();
                    describeTestSetDiscrepancyReportResult.setLastUpdatedDataTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("testSetDiscrepancyTopErrors", targetDepth)) {
                    context.nextToken();
                    describeTestSetDiscrepancyReportResult.setTestSetDiscrepancyTopErrors(TestSetDiscrepancyErrorsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("testSetDiscrepancyRawOutputUrl", targetDepth)) {
                    context.nextToken();
                    describeTestSetDiscrepancyReportResult.setTestSetDiscrepancyRawOutputUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReasons", targetDepth)) {
                    context.nextToken();
                    describeTestSetDiscrepancyReportResult.setFailureReasons(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return describeTestSetDiscrepancyReportResult;
    }

    private static DescribeTestSetDiscrepancyReportResultJsonUnmarshaller instance;

    public static DescribeTestSetDiscrepancyReportResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeTestSetDiscrepancyReportResultJsonUnmarshaller();
        return instance;
    }
}
