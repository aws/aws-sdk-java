/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costandusagereport.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.costandusagereport.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReportDefinition JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportDefinitionJsonUnmarshaller implements Unmarshaller<ReportDefinition, JsonUnmarshallerContext> {

    public ReportDefinition unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReportDefinition reportDefinition = new ReportDefinition();

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
                if (context.testExpression("ReportName", targetDepth)) {
                    context.nextToken();
                    reportDefinition.setReportName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TimeUnit", targetDepth)) {
                    context.nextToken();
                    reportDefinition.setTimeUnit(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Format", targetDepth)) {
                    context.nextToken();
                    reportDefinition.setFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Compression", targetDepth)) {
                    context.nextToken();
                    reportDefinition.setCompression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AdditionalSchemaElements", targetDepth)) {
                    context.nextToken();
                    reportDefinition.setAdditionalSchemaElements(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("S3Bucket", targetDepth)) {
                    context.nextToken();
                    reportDefinition.setS3Bucket(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3Prefix", targetDepth)) {
                    context.nextToken();
                    reportDefinition.setS3Prefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3Region", targetDepth)) {
                    context.nextToken();
                    reportDefinition.setS3Region(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AdditionalArtifacts", targetDepth)) {
                    context.nextToken();
                    reportDefinition.setAdditionalArtifacts(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("RefreshClosedReports", targetDepth)) {
                    context.nextToken();
                    reportDefinition.setRefreshClosedReports(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ReportVersioning", targetDepth)) {
                    context.nextToken();
                    reportDefinition.setReportVersioning(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return reportDefinition;
    }

    private static ReportDefinitionJsonUnmarshaller instance;

    public static ReportDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReportDefinitionJsonUnmarshaller();
        return instance;
    }
}
