/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EvaluationFormSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationFormSummaryJsonUnmarshaller implements Unmarshaller<EvaluationFormSummary, JsonUnmarshallerContext> {

    public EvaluationFormSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        EvaluationFormSummary evaluationFormSummary = new EvaluationFormSummary();

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
                if (context.testExpression("EvaluationFormId", targetDepth)) {
                    context.nextToken();
                    evaluationFormSummary.setEvaluationFormId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EvaluationFormArn", targetDepth)) {
                    context.nextToken();
                    evaluationFormSummary.setEvaluationFormArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    context.nextToken();
                    evaluationFormSummary.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    evaluationFormSummary.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    context.nextToken();
                    evaluationFormSummary.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    evaluationFormSummary.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedBy", targetDepth)) {
                    context.nextToken();
                    evaluationFormSummary.setLastModifiedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastActivatedTime", targetDepth)) {
                    context.nextToken();
                    evaluationFormSummary.setLastActivatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastActivatedBy", targetDepth)) {
                    context.nextToken();
                    evaluationFormSummary.setLastActivatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LatestVersion", targetDepth)) {
                    context.nextToken();
                    evaluationFormSummary.setLatestVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ActiveVersion", targetDepth)) {
                    context.nextToken();
                    evaluationFormSummary.setActiveVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return evaluationFormSummary;
    }

    private static EvaluationFormSummaryJsonUnmarshaller instance;

    public static EvaluationFormSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationFormSummaryJsonUnmarshaller();
        return instance;
    }
}
