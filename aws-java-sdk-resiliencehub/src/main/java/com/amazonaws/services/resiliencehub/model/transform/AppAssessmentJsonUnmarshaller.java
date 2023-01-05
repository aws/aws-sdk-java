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
 * AppAssessment JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppAssessmentJsonUnmarshaller implements Unmarshaller<AppAssessment, JsonUnmarshallerContext> {

    public AppAssessment unmarshall(JsonUnmarshallerContext context) throws Exception {
        AppAssessment appAssessment = new AppAssessment();

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
                    appAssessment.setAppArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("appVersion", targetDepth)) {
                    context.nextToken();
                    appAssessment.setAppVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assessmentArn", targetDepth)) {
                    context.nextToken();
                    appAssessment.setAssessmentArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assessmentName", targetDepth)) {
                    context.nextToken();
                    appAssessment.setAssessmentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assessmentStatus", targetDepth)) {
                    context.nextToken();
                    appAssessment.setAssessmentStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("compliance", targetDepth)) {
                    context.nextToken();
                    appAssessment.setCompliance(new MapUnmarshaller<String, DisruptionCompliance>(context.getUnmarshaller(String.class),
                            DisruptionComplianceJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("complianceStatus", targetDepth)) {
                    context.nextToken();
                    appAssessment.setComplianceStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cost", targetDepth)) {
                    context.nextToken();
                    appAssessment.setCost(CostJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    appAssessment.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("invoker", targetDepth)) {
                    context.nextToken();
                    appAssessment.setInvoker(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    context.nextToken();
                    appAssessment.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("policy", targetDepth)) {
                    context.nextToken();
                    appAssessment.setPolicy(ResiliencyPolicyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("resiliencyScore", targetDepth)) {
                    context.nextToken();
                    appAssessment.setResiliencyScore(ResiliencyScoreJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("resourceErrorsDetails", targetDepth)) {
                    context.nextToken();
                    appAssessment.setResourceErrorsDetails(ResourceErrorsDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    appAssessment.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    appAssessment.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return appAssessment;
    }

    private static AppAssessmentJsonUnmarshaller instance;

    public static AppAssessmentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AppAssessmentJsonUnmarshaller();
        return instance;
    }
}
