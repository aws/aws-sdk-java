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
 * CodeReview JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeReviewJsonUnmarshaller implements Unmarshaller<CodeReview, JsonUnmarshallerContext> {

    public CodeReview unmarshall(JsonUnmarshallerContext context) throws Exception {
        CodeReview codeReview = new CodeReview();

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
                    codeReview.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CodeReviewArn", targetDepth)) {
                    context.nextToken();
                    codeReview.setCodeReviewArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RepositoryName", targetDepth)) {
                    context.nextToken();
                    codeReview.setRepositoryName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Owner", targetDepth)) {
                    context.nextToken();
                    codeReview.setOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProviderType", targetDepth)) {
                    context.nextToken();
                    codeReview.setProviderType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    codeReview.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateReason", targetDepth)) {
                    context.nextToken();
                    codeReview.setStateReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTimeStamp", targetDepth)) {
                    context.nextToken();
                    codeReview.setCreatedTimeStamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTimeStamp", targetDepth)) {
                    context.nextToken();
                    codeReview.setLastUpdatedTimeStamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    codeReview.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PullRequestId", targetDepth)) {
                    context.nextToken();
                    codeReview.setPullRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceCodeType", targetDepth)) {
                    context.nextToken();
                    codeReview.setSourceCodeType(SourceCodeTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AssociationArn", targetDepth)) {
                    context.nextToken();
                    codeReview.setAssociationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Metrics", targetDepth)) {
                    context.nextToken();
                    codeReview.setMetrics(MetricsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AnalysisTypes", targetDepth)) {
                    context.nextToken();
                    codeReview.setAnalysisTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return codeReview;
    }

    private static CodeReviewJsonUnmarshaller instance;

    public static CodeReviewJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CodeReviewJsonUnmarshaller();
        return instance;
    }
}
