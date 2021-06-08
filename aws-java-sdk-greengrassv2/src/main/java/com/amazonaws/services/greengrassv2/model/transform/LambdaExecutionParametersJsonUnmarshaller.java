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
package com.amazonaws.services.greengrassv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.greengrassv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LambdaExecutionParameters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaExecutionParametersJsonUnmarshaller implements Unmarshaller<LambdaExecutionParameters, JsonUnmarshallerContext> {

    public LambdaExecutionParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        LambdaExecutionParameters lambdaExecutionParameters = new LambdaExecutionParameters();

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
                if (context.testExpression("eventSources", targetDepth)) {
                    context.nextToken();
                    lambdaExecutionParameters.setEventSources(new ListUnmarshaller<LambdaEventSource>(LambdaEventSourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("maxQueueSize", targetDepth)) {
                    context.nextToken();
                    lambdaExecutionParameters.setMaxQueueSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("maxInstancesCount", targetDepth)) {
                    context.nextToken();
                    lambdaExecutionParameters.setMaxInstancesCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("maxIdleTimeInSeconds", targetDepth)) {
                    context.nextToken();
                    lambdaExecutionParameters.setMaxIdleTimeInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("timeoutInSeconds", targetDepth)) {
                    context.nextToken();
                    lambdaExecutionParameters.setTimeoutInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("statusTimeoutInSeconds", targetDepth)) {
                    context.nextToken();
                    lambdaExecutionParameters.setStatusTimeoutInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pinned", targetDepth)) {
                    context.nextToken();
                    lambdaExecutionParameters.setPinned(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("inputPayloadEncodingType", targetDepth)) {
                    context.nextToken();
                    lambdaExecutionParameters.setInputPayloadEncodingType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("execArgs", targetDepth)) {
                    context.nextToken();
                    lambdaExecutionParameters.setExecArgs(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("environmentVariables", targetDepth)) {
                    context.nextToken();
                    lambdaExecutionParameters.setEnvironmentVariables(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("linuxProcessParams", targetDepth)) {
                    context.nextToken();
                    lambdaExecutionParameters.setLinuxProcessParams(LambdaLinuxProcessParamsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return lambdaExecutionParameters;
    }

    private static LambdaExecutionParametersJsonUnmarshaller instance;

    public static LambdaExecutionParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LambdaExecutionParametersJsonUnmarshaller();
        return instance;
    }
}
