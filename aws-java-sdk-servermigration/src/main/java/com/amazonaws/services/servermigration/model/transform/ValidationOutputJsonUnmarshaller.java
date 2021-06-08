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
package com.amazonaws.services.servermigration.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.servermigration.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ValidationOutput JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationOutputJsonUnmarshaller implements Unmarshaller<ValidationOutput, JsonUnmarshallerContext> {

    public ValidationOutput unmarshall(JsonUnmarshallerContext context) throws Exception {
        ValidationOutput validationOutput = new ValidationOutput();

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
                if (context.testExpression("validationId", targetDepth)) {
                    context.nextToken();
                    validationOutput.setValidationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    validationOutput.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    validationOutput.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    context.nextToken();
                    validationOutput.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("latestValidationTime", targetDepth)) {
                    context.nextToken();
                    validationOutput.setLatestValidationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("appValidationOutput", targetDepth)) {
                    context.nextToken();
                    validationOutput.setAppValidationOutput(AppValidationOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("serverValidationOutput", targetDepth)) {
                    context.nextToken();
                    validationOutput.setServerValidationOutput(ServerValidationOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return validationOutput;
    }

    private static ValidationOutputJsonUnmarshaller instance;

    public static ValidationOutputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ValidationOutputJsonUnmarshaller();
        return instance;
    }
}
