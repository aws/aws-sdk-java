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
package com.amazonaws.services.codegurureviewer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codegurureviewer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CodeReviewSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeReviewSummaryJsonUnmarshaller implements Unmarshaller<CodeReviewSummary, JsonUnmarshallerContext> {

    public CodeReviewSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        CodeReviewSummary codeReviewSummary = new CodeReviewSummary();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    codeReviewSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CodeReviewArn", targetDepth)) {
                    context.nextToken();
                    codeReviewSummary.setCodeReviewArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RepositoryName", targetDepth)) {
                    context.nextToken();
                    codeReviewSummary.setRepositoryName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Owner", targetDepth)) {
                    context.nextToken();
                    codeReviewSummary.setOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProviderType", targetDepth)) {
                    context.nextToken();
                    codeReviewSummary.setProviderType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    codeReviewSummary.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTimeStamp", targetDepth)) {
                    context.nextToken();
                    codeReviewSummary.setCreatedTimeStamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTimeStamp", targetDepth)) {
                    context.nextToken();
                    codeReviewSummary.setLastUpdatedTimeStamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    codeReviewSummary.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PullRequestId", targetDepth)) {
                    context.nextToken();
                    codeReviewSummary.setPullRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MetricsSummary", targetDepth)) {
                    context.nextToken();
                    codeReviewSummary.setMetricsSummary(MetricsSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SourceCodeType", targetDepth)) {
                    context.nextToken();
                    codeReviewSummary.setSourceCodeType(SourceCodeTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return codeReviewSummary;
    }

    private static CodeReviewSummaryJsonUnmarshaller instance;

    public static CodeReviewSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CodeReviewSummaryJsonUnmarshaller();
        return instance;
    }
}
