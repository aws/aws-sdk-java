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
package com.amazonaws.services.auditmanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.auditmanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AssessmentReport JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentReportJsonUnmarshaller implements Unmarshaller<AssessmentReport, JsonUnmarshallerContext> {

    public AssessmentReport unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssessmentReport assessmentReport = new AssessmentReport();

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
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    assessmentReport.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    assessmentReport.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    assessmentReport.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsAccountId", targetDepth)) {
                    context.nextToken();
                    assessmentReport.setAwsAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assessmentId", targetDepth)) {
                    context.nextToken();
                    assessmentReport.setAssessmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assessmentName", targetDepth)) {
                    context.nextToken();
                    assessmentReport.setAssessmentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("author", targetDepth)) {
                    context.nextToken();
                    assessmentReport.setAuthor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    assessmentReport.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    assessmentReport.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return assessmentReport;
    }

    private static AssessmentReportJsonUnmarshaller instance;

    public static AssessmentReportJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssessmentReportJsonUnmarshaller();
        return instance;
    }
}
