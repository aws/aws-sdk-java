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
package com.amazonaws.services.migrationhubstrategyrecommendations.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.migrationhubstrategyrecommendations.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AssessmentSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentSummaryJsonUnmarshaller implements Unmarshaller<AssessmentSummary, JsonUnmarshallerContext> {

    public AssessmentSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssessmentSummary assessmentSummary = new AssessmentSummary();

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
                if (context.testExpression("antipatternReportS3Object", targetDepth)) {
                    context.nextToken();
                    assessmentSummary.setAntipatternReportS3Object(S3ObjectJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("antipatternReportStatus", targetDepth)) {
                    context.nextToken();
                    assessmentSummary.setAntipatternReportStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("antipatternReportStatusMessage", targetDepth)) {
                    context.nextToken();
                    assessmentSummary.setAntipatternReportStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastAnalyzedTimestamp", targetDepth)) {
                    context.nextToken();
                    assessmentSummary.setLastAnalyzedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("listAntipatternSeveritySummary", targetDepth)) {
                    context.nextToken();
                    assessmentSummary.setListAntipatternSeveritySummary(new ListUnmarshaller<AntipatternSeveritySummary>(
                            AntipatternSeveritySummaryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("listApplicationComponentStatusSummary", targetDepth)) {
                    context.nextToken();
                    assessmentSummary.setListApplicationComponentStatusSummary(new ListUnmarshaller<ApplicationComponentStatusSummary>(
                            ApplicationComponentStatusSummaryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("listApplicationComponentStrategySummary", targetDepth)) {
                    context.nextToken();
                    assessmentSummary.setListApplicationComponentStrategySummary(new ListUnmarshaller<StrategySummary>(StrategySummaryJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("listApplicationComponentSummary", targetDepth)) {
                    context.nextToken();
                    assessmentSummary.setListApplicationComponentSummary(new ListUnmarshaller<ApplicationComponentSummary>(
                            ApplicationComponentSummaryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("listServerStatusSummary", targetDepth)) {
                    context.nextToken();
                    assessmentSummary.setListServerStatusSummary(new ListUnmarshaller<ServerStatusSummary>(ServerStatusSummaryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("listServerStrategySummary", targetDepth)) {
                    context.nextToken();
                    assessmentSummary.setListServerStrategySummary(new ListUnmarshaller<StrategySummary>(StrategySummaryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("listServerSummary", targetDepth)) {
                    context.nextToken();
                    assessmentSummary.setListServerSummary(new ListUnmarshaller<ServerSummary>(ServerSummaryJsonUnmarshaller.getInstance())

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

        return assessmentSummary;
    }

    private static AssessmentSummaryJsonUnmarshaller instance;

    public static AssessmentSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssessmentSummaryJsonUnmarshaller();
        return instance;
    }
}
