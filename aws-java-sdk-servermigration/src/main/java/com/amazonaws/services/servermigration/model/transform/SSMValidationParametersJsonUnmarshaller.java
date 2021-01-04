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
 * SSMValidationParameters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SSMValidationParametersJsonUnmarshaller implements Unmarshaller<SSMValidationParameters, JsonUnmarshallerContext> {

    public SSMValidationParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        SSMValidationParameters sSMValidationParameters = new SSMValidationParameters();

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
                if (context.testExpression("source", targetDepth)) {
                    context.nextToken();
                    sSMValidationParameters.setSource(SourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("instanceId", targetDepth)) {
                    context.nextToken();
                    sSMValidationParameters.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scriptType", targetDepth)) {
                    context.nextToken();
                    sSMValidationParameters.setScriptType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("command", targetDepth)) {
                    context.nextToken();
                    sSMValidationParameters.setCommand(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("executionTimeoutSeconds", targetDepth)) {
                    context.nextToken();
                    sSMValidationParameters.setExecutionTimeoutSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("outputS3BucketName", targetDepth)) {
                    context.nextToken();
                    sSMValidationParameters.setOutputS3BucketName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return sSMValidationParameters;
    }

    private static SSMValidationParametersJsonUnmarshaller instance;

    public static SSMValidationParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SSMValidationParametersJsonUnmarshaller();
        return instance;
    }
}
