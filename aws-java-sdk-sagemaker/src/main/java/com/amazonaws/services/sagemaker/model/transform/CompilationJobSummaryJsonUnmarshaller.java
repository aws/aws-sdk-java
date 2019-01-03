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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CompilationJobSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompilationJobSummaryJsonUnmarshaller implements Unmarshaller<CompilationJobSummary, JsonUnmarshallerContext> {

    public CompilationJobSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        CompilationJobSummary compilationJobSummary = new CompilationJobSummary();

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
                if (context.testExpression("CompilationJobName", targetDepth)) {
                    context.nextToken();
                    compilationJobSummary.setCompilationJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CompilationJobArn", targetDepth)) {
                    context.nextToken();
                    compilationJobSummary.setCompilationJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    compilationJobSummary.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompilationStartTime", targetDepth)) {
                    context.nextToken();
                    compilationJobSummary.setCompilationStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompilationEndTime", targetDepth)) {
                    context.nextToken();
                    compilationJobSummary.setCompilationEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompilationTargetDevice", targetDepth)) {
                    context.nextToken();
                    compilationJobSummary.setCompilationTargetDevice(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    compilationJobSummary.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompilationJobStatus", targetDepth)) {
                    context.nextToken();
                    compilationJobSummary.setCompilationJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return compilationJobSummary;
    }

    private static CompilationJobSummaryJsonUnmarshaller instance;

    public static CompilationJobSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CompilationJobSummaryJsonUnmarshaller();
        return instance;
    }
}
