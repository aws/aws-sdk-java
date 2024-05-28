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
package com.amazonaws.services.inspector2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.inspector2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StopCisMessageProgress JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopCisMessageProgressJsonUnmarshaller implements Unmarshaller<StopCisMessageProgress, JsonUnmarshallerContext> {

    public StopCisMessageProgress unmarshall(JsonUnmarshallerContext context) throws Exception {
        StopCisMessageProgress stopCisMessageProgress = new StopCisMessageProgress();

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
                if (context.testExpression("errorChecks", targetDepth)) {
                    context.nextToken();
                    stopCisMessageProgress.setErrorChecks(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("failedChecks", targetDepth)) {
                    context.nextToken();
                    stopCisMessageProgress.setFailedChecks(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("informationalChecks", targetDepth)) {
                    context.nextToken();
                    stopCisMessageProgress.setInformationalChecks(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("notApplicableChecks", targetDepth)) {
                    context.nextToken();
                    stopCisMessageProgress.setNotApplicableChecks(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("notEvaluatedChecks", targetDepth)) {
                    context.nextToken();
                    stopCisMessageProgress.setNotEvaluatedChecks(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("successfulChecks", targetDepth)) {
                    context.nextToken();
                    stopCisMessageProgress.setSuccessfulChecks(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("totalChecks", targetDepth)) {
                    context.nextToken();
                    stopCisMessageProgress.setTotalChecks(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("unknownChecks", targetDepth)) {
                    context.nextToken();
                    stopCisMessageProgress.setUnknownChecks(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return stopCisMessageProgress;
    }

    private static StopCisMessageProgressJsonUnmarshaller instance;

    public static StopCisMessageProgressJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StopCisMessageProgressJsonUnmarshaller();
        return instance;
    }
}
