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
package com.amazonaws.services.arczonalshift.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.arczonalshift.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdatePracticeRunConfigurationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePracticeRunConfigurationResultJsonUnmarshaller implements Unmarshaller<UpdatePracticeRunConfigurationResult, JsonUnmarshallerContext> {

    public UpdatePracticeRunConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdatePracticeRunConfigurationResult updatePracticeRunConfigurationResult = new UpdatePracticeRunConfigurationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updatePracticeRunConfigurationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    updatePracticeRunConfigurationResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    updatePracticeRunConfigurationResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("practiceRunConfiguration", targetDepth)) {
                    context.nextToken();
                    updatePracticeRunConfigurationResult
                            .setPracticeRunConfiguration(PracticeRunConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("zonalAutoshiftStatus", targetDepth)) {
                    context.nextToken();
                    updatePracticeRunConfigurationResult.setZonalAutoshiftStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updatePracticeRunConfigurationResult;
    }

    private static UpdatePracticeRunConfigurationResultJsonUnmarshaller instance;

    public static UpdatePracticeRunConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdatePracticeRunConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
