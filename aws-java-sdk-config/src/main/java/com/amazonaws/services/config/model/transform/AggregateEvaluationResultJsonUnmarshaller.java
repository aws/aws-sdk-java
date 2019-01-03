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
package com.amazonaws.services.config.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AggregateEvaluationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AggregateEvaluationResultJsonUnmarshaller implements Unmarshaller<AggregateEvaluationResult, JsonUnmarshallerContext> {

    public AggregateEvaluationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        AggregateEvaluationResult aggregateEvaluationResult = new AggregateEvaluationResult();

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
                if (context.testExpression("EvaluationResultIdentifier", targetDepth)) {
                    context.nextToken();
                    aggregateEvaluationResult.setEvaluationResultIdentifier(EvaluationResultIdentifierJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ComplianceType", targetDepth)) {
                    context.nextToken();
                    aggregateEvaluationResult.setComplianceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResultRecordedTime", targetDepth)) {
                    context.nextToken();
                    aggregateEvaluationResult.setResultRecordedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ConfigRuleInvokedTime", targetDepth)) {
                    context.nextToken();
                    aggregateEvaluationResult.setConfigRuleInvokedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Annotation", targetDepth)) {
                    context.nextToken();
                    aggregateEvaluationResult.setAnnotation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccountId", targetDepth)) {
                    context.nextToken();
                    aggregateEvaluationResult.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AwsRegion", targetDepth)) {
                    context.nextToken();
                    aggregateEvaluationResult.setAwsRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return aggregateEvaluationResult;
    }

    private static AggregateEvaluationResultJsonUnmarshaller instance;

    public static AggregateEvaluationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AggregateEvaluationResultJsonUnmarshaller();
        return instance;
    }
}
