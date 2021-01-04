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
package com.amazonaws.services.iotdeviceadvisor.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotdeviceadvisor.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetSuiteRunResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSuiteRunResultJsonUnmarshaller implements Unmarshaller<GetSuiteRunResult, JsonUnmarshallerContext> {

    public GetSuiteRunResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetSuiteRunResult getSuiteRunResult = new GetSuiteRunResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getSuiteRunResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("suiteDefinitionId", targetDepth)) {
                    context.nextToken();
                    getSuiteRunResult.setSuiteDefinitionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("suiteDefinitionVersion", targetDepth)) {
                    context.nextToken();
                    getSuiteRunResult.setSuiteDefinitionVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("suiteRunId", targetDepth)) {
                    context.nextToken();
                    getSuiteRunResult.setSuiteRunId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("suiteRunArn", targetDepth)) {
                    context.nextToken();
                    getSuiteRunResult.setSuiteRunArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("suiteRunConfiguration", targetDepth)) {
                    context.nextToken();
                    getSuiteRunResult.setSuiteRunConfiguration(SuiteRunConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("testResult", targetDepth)) {
                    context.nextToken();
                    getSuiteRunResult.setTestResult(TestResultJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    getSuiteRunResult.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    getSuiteRunResult.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getSuiteRunResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorReason", targetDepth)) {
                    context.nextToken();
                    getSuiteRunResult.setErrorReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    getSuiteRunResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return getSuiteRunResult;
    }

    private static GetSuiteRunResultJsonUnmarshaller instance;

    public static GetSuiteRunResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetSuiteRunResultJsonUnmarshaller();
        return instance;
    }
}
