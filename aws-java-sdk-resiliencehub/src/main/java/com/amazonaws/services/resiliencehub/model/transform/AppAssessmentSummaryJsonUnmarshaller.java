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
package com.amazonaws.services.resiliencehub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.resiliencehub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AppAssessmentSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppAssessmentSummaryJsonUnmarshaller implements Unmarshaller<AppAssessmentSummary, JsonUnmarshallerContext> {

    public AppAssessmentSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AppAssessmentSummary appAssessmentSummary = new AppAssessmentSummary();

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
                if (context.testExpression("appArn", targetDepth)) {
                    context.nextToken();
                    appAssessmentSummary.setAppArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("appVersion", targetDepth)) {
                    context.nextToken();
                    appAssessmentSummary.setAppVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assessmentArn", targetDepth)) {
                    context.nextToken();
                    appAssessmentSummary.setAssessmentArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assessmentName", targetDepth)) {
                    context.nextToken();
                    appAssessmentSummary.setAssessmentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assessmentStatus", targetDepth)) {
                    context.nextToken();
                    appAssessmentSummary.setAssessmentStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("complianceStatus", targetDepth)) {
                    context.nextToken();
                    appAssessmentSummary.setComplianceStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cost", targetDepth)) {
                    context.nextToken();
                    appAssessmentSummary.setCost(CostJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    appAssessmentSummary.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("invoker", targetDepth)) {
                    context.nextToken();
                    appAssessmentSummary.setInvoker(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    context.nextToken();
                    appAssessmentSummary.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resiliencyScore", targetDepth)) {
                    context.nextToken();
                    appAssessmentSummary.setResiliencyScore(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    appAssessmentSummary.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return appAssessmentSummary;
    }

    private static AppAssessmentSummaryJsonUnmarshaller instance;

    public static AppAssessmentSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AppAssessmentSummaryJsonUnmarshaller();
        return instance;
    }
}
