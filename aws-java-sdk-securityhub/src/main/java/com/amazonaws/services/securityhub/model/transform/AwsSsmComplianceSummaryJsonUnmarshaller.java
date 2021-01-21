/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsSsmComplianceSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsSsmComplianceSummaryJsonUnmarshaller implements Unmarshaller<AwsSsmComplianceSummary, JsonUnmarshallerContext> {

    public AwsSsmComplianceSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsSsmComplianceSummary awsSsmComplianceSummary = new AwsSsmComplianceSummary();

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
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    awsSsmComplianceSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CompliantCriticalCount", targetDepth)) {
                    context.nextToken();
                    awsSsmComplianceSummary.setCompliantCriticalCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CompliantHighCount", targetDepth)) {
                    context.nextToken();
                    awsSsmComplianceSummary.setCompliantHighCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CompliantMediumCount", targetDepth)) {
                    context.nextToken();
                    awsSsmComplianceSummary.setCompliantMediumCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionType", targetDepth)) {
                    context.nextToken();
                    awsSsmComplianceSummary.setExecutionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NonCompliantCriticalCount", targetDepth)) {
                    context.nextToken();
                    awsSsmComplianceSummary.setNonCompliantCriticalCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CompliantInformationalCount", targetDepth)) {
                    context.nextToken();
                    awsSsmComplianceSummary.setCompliantInformationalCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("NonCompliantInformationalCount", targetDepth)) {
                    context.nextToken();
                    awsSsmComplianceSummary.setNonCompliantInformationalCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CompliantUnspecifiedCount", targetDepth)) {
                    context.nextToken();
                    awsSsmComplianceSummary.setCompliantUnspecifiedCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("NonCompliantLowCount", targetDepth)) {
                    context.nextToken();
                    awsSsmComplianceSummary.setNonCompliantLowCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("NonCompliantHighCount", targetDepth)) {
                    context.nextToken();
                    awsSsmComplianceSummary.setNonCompliantHighCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CompliantLowCount", targetDepth)) {
                    context.nextToken();
                    awsSsmComplianceSummary.setCompliantLowCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ComplianceType", targetDepth)) {
                    context.nextToken();
                    awsSsmComplianceSummary.setComplianceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PatchBaselineId", targetDepth)) {
                    context.nextToken();
                    awsSsmComplianceSummary.setPatchBaselineId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OverallSeverity", targetDepth)) {
                    context.nextToken();
                    awsSsmComplianceSummary.setOverallSeverity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NonCompliantMediumCount", targetDepth)) {
                    context.nextToken();
                    awsSsmComplianceSummary.setNonCompliantMediumCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("NonCompliantUnspecifiedCount", targetDepth)) {
                    context.nextToken();
                    awsSsmComplianceSummary.setNonCompliantUnspecifiedCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PatchGroup", targetDepth)) {
                    context.nextToken();
                    awsSsmComplianceSummary.setPatchGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsSsmComplianceSummary;
    }

    private static AwsSsmComplianceSummaryJsonUnmarshaller instance;

    public static AwsSsmComplianceSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsSsmComplianceSummaryJsonUnmarshaller();
        return instance;
    }
}
