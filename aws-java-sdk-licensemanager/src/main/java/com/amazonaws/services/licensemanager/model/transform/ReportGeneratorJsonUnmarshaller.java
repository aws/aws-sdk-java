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
package com.amazonaws.services.licensemanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.licensemanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReportGenerator JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportGeneratorJsonUnmarshaller implements Unmarshaller<ReportGenerator, JsonUnmarshallerContext> {

    public ReportGenerator unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReportGenerator reportGenerator = new ReportGenerator();

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
                if (context.testExpression("ReportGeneratorName", targetDepth)) {
                    context.nextToken();
                    reportGenerator.setReportGeneratorName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReportType", targetDepth)) {
                    context.nextToken();
                    reportGenerator.setReportType(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ReportContext", targetDepth)) {
                    context.nextToken();
                    reportGenerator.setReportContext(ReportContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ReportFrequency", targetDepth)) {
                    context.nextToken();
                    reportGenerator.setReportFrequency(ReportFrequencyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LicenseManagerReportGeneratorArn", targetDepth)) {
                    context.nextToken();
                    reportGenerator.setLicenseManagerReportGeneratorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastRunStatus", targetDepth)) {
                    context.nextToken();
                    reportGenerator.setLastRunStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastRunFailureReason", targetDepth)) {
                    context.nextToken();
                    reportGenerator.setLastRunFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastReportGenerationTime", targetDepth)) {
                    context.nextToken();
                    reportGenerator.setLastReportGenerationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReportCreatorAccount", targetDepth)) {
                    context.nextToken();
                    reportGenerator.setReportCreatorAccount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    reportGenerator.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3Location", targetDepth)) {
                    context.nextToken();
                    reportGenerator.setS3Location(S3LocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreateTime", targetDepth)) {
                    context.nextToken();
                    reportGenerator.setCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    reportGenerator.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

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

        return reportGenerator;
    }

    private static ReportGeneratorJsonUnmarshaller instance;

    public static ReportGeneratorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReportGeneratorJsonUnmarshaller();
        return instance;
    }
}
