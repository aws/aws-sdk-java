/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.lambda.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Upload Function Result JSON Unmarshaller
 */
public class UploadFunctionResultJsonUnmarshaller implements Unmarshaller<UploadFunctionResult, JsonUnmarshallerContext> {

    public UploadFunctionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UploadFunctionResult uploadFunctionResult = new UploadFunctionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("FunctionName", targetDepth)) {
                    context.nextToken();
                    uploadFunctionResult.setFunctionName(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FunctionARN", targetDepth)) {
                    context.nextToken();
                    uploadFunctionResult.setFunctionARN(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ConfigurationId", targetDepth)) {
                    context.nextToken();
                    uploadFunctionResult.setConfigurationId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Runtime", targetDepth)) {
                    context.nextToken();
                    uploadFunctionResult.setRuntime(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Role", targetDepth)) {
                    context.nextToken();
                    uploadFunctionResult.setRole(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Handler", targetDepth)) {
                    context.nextToken();
                    uploadFunctionResult.setHandler(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Mode", targetDepth)) {
                    context.nextToken();
                    uploadFunctionResult.setMode(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CodeSize", targetDepth)) {
                    context.nextToken();
                    uploadFunctionResult.setCodeSize(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    uploadFunctionResult.setDescription(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Timeout", targetDepth)) {
                    context.nextToken();
                    uploadFunctionResult.setTimeout(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MemorySize", targetDepth)) {
                    context.nextToken();
                    uploadFunctionResult.setMemorySize(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModified", targetDepth)) {
                    context.nextToken();
                    uploadFunctionResult.setLastModified(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }

            token = context.nextToken();
        }
        
        return uploadFunctionResult;
    }

    private static UploadFunctionResultJsonUnmarshaller instance;
    public static UploadFunctionResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new UploadFunctionResultJsonUnmarshaller();
        return instance;
    }
}
    