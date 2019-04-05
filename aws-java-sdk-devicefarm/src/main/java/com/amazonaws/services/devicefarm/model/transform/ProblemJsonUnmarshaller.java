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
package com.amazonaws.services.devicefarm.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Problem JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProblemJsonUnmarshaller implements Unmarshaller<Problem, JsonUnmarshallerContext> {

    public Problem unmarshall(JsonUnmarshallerContext context) throws Exception {
        Problem problem = new Problem();

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
                if (context.testExpression("run", targetDepth)) {
                    context.nextToken();
                    problem.setRun(ProblemDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("job", targetDepth)) {
                    context.nextToken();
                    problem.setJob(ProblemDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("suite", targetDepth)) {
                    context.nextToken();
                    problem.setSuite(ProblemDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("test", targetDepth)) {
                    context.nextToken();
                    problem.setTest(ProblemDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("device", targetDepth)) {
                    context.nextToken();
                    problem.setDevice(DeviceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("result", targetDepth)) {
                    context.nextToken();
                    problem.setResult(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    context.nextToken();
                    problem.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return problem;
    }

    private static ProblemJsonUnmarshaller instance;

    public static ProblemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProblemJsonUnmarshaller();
        return instance;
    }
}
