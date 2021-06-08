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
package com.amazonaws.services.codebuild.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CodeCoverageReportSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeCoverageReportSummaryJsonUnmarshaller implements Unmarshaller<CodeCoverageReportSummary, JsonUnmarshallerContext> {

    public CodeCoverageReportSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        CodeCoverageReportSummary codeCoverageReportSummary = new CodeCoverageReportSummary();

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
                if (context.testExpression("lineCoveragePercentage", targetDepth)) {
                    context.nextToken();
                    codeCoverageReportSummary.setLineCoveragePercentage(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("linesCovered", targetDepth)) {
                    context.nextToken();
                    codeCoverageReportSummary.setLinesCovered(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("linesMissed", targetDepth)) {
                    context.nextToken();
                    codeCoverageReportSummary.setLinesMissed(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("branchCoveragePercentage", targetDepth)) {
                    context.nextToken();
                    codeCoverageReportSummary.setBranchCoveragePercentage(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("branchesCovered", targetDepth)) {
                    context.nextToken();
                    codeCoverageReportSummary.setBranchesCovered(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("branchesMissed", targetDepth)) {
                    context.nextToken();
                    codeCoverageReportSummary.setBranchesMissed(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return codeCoverageReportSummary;
    }

    private static CodeCoverageReportSummaryJsonUnmarshaller instance;

    public static CodeCoverageReportSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CodeCoverageReportSummaryJsonUnmarshaller();
        return instance;
    }
}
