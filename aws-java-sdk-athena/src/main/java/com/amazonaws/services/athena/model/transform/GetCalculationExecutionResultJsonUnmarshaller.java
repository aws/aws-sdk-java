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
package com.amazonaws.services.athena.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.athena.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetCalculationExecutionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCalculationExecutionResultJsonUnmarshaller implements Unmarshaller<GetCalculationExecutionResult, JsonUnmarshallerContext> {

    public GetCalculationExecutionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetCalculationExecutionResult getCalculationExecutionResult = new GetCalculationExecutionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getCalculationExecutionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("CalculationExecutionId", targetDepth)) {
                    context.nextToken();
                    getCalculationExecutionResult.setCalculationExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SessionId", targetDepth)) {
                    context.nextToken();
                    getCalculationExecutionResult.setSessionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    getCalculationExecutionResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WorkingDirectory", targetDepth)) {
                    context.nextToken();
                    getCalculationExecutionResult.setWorkingDirectory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    getCalculationExecutionResult.setStatus(CalculationStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Statistics", targetDepth)) {
                    context.nextToken();
                    getCalculationExecutionResult.setStatistics(CalculationStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Result", targetDepth)) {
                    context.nextToken();
                    getCalculationExecutionResult.setResult(CalculationResultJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getCalculationExecutionResult;
    }

    private static GetCalculationExecutionResultJsonUnmarshaller instance;

    public static GetCalculationExecutionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetCalculationExecutionResultJsonUnmarshaller();
        return instance;
    }
}
