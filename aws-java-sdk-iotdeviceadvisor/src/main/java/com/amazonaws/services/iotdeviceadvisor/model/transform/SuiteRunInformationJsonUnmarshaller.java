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
 * SuiteRunInformation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuiteRunInformationJsonUnmarshaller implements Unmarshaller<SuiteRunInformation, JsonUnmarshallerContext> {

    public SuiteRunInformation unmarshall(JsonUnmarshallerContext context) throws Exception {
        SuiteRunInformation suiteRunInformation = new SuiteRunInformation();

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
                if (context.testExpression("suiteDefinitionId", targetDepth)) {
                    context.nextToken();
                    suiteRunInformation.setSuiteDefinitionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("suiteDefinitionVersion", targetDepth)) {
                    context.nextToken();
                    suiteRunInformation.setSuiteDefinitionVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("suiteDefinitionName", targetDepth)) {
                    context.nextToken();
                    suiteRunInformation.setSuiteDefinitionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("suiteRunId", targetDepth)) {
                    context.nextToken();
                    suiteRunInformation.setSuiteRunId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    suiteRunInformation.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("startedAt", targetDepth)) {
                    context.nextToken();
                    suiteRunInformation.setStartedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("endAt", targetDepth)) {
                    context.nextToken();
                    suiteRunInformation.setEndAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    suiteRunInformation.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("passed", targetDepth)) {
                    context.nextToken();
                    suiteRunInformation.setPassed(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("failed", targetDepth)) {
                    context.nextToken();
                    suiteRunInformation.setFailed(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return suiteRunInformation;
    }

    private static SuiteRunInformationJsonUnmarshaller instance;

    public static SuiteRunInformationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SuiteRunInformationJsonUnmarshaller();
        return instance;
    }
}
