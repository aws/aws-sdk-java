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
 * CodeCoverage JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeCoverageJsonUnmarshaller implements Unmarshaller<CodeCoverage, JsonUnmarshallerContext> {

    public CodeCoverage unmarshall(JsonUnmarshallerContext context) throws Exception {
        CodeCoverage codeCoverage = new CodeCoverage();

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
                    codeCoverage.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("reportARN", targetDepth)) {
                    context.nextToken();
                    codeCoverage.setReportARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("filePath", targetDepth)) {
                    context.nextToken();
                    codeCoverage.setFilePath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lineCoveragePercentage", targetDepth)) {
                    context.nextToken();
                    codeCoverage.setLineCoveragePercentage(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("linesCovered", targetDepth)) {
                    context.nextToken();
                    codeCoverage.setLinesCovered(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("linesMissed", targetDepth)) {
                    context.nextToken();
                    codeCoverage.setLinesMissed(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("branchCoveragePercentage", targetDepth)) {
                    context.nextToken();
                    codeCoverage.setBranchCoveragePercentage(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("branchesCovered", targetDepth)) {
                    context.nextToken();
                    codeCoverage.setBranchesCovered(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("branchesMissed", targetDepth)) {
                    context.nextToken();
                    codeCoverage.setBranchesMissed(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("expired", targetDepth)) {
                    context.nextToken();
                    codeCoverage.setExpired(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return codeCoverage;
    }

    private static CodeCoverageJsonUnmarshaller instance;

    public static CodeCoverageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CodeCoverageJsonUnmarshaller();
        return instance;
    }
}
