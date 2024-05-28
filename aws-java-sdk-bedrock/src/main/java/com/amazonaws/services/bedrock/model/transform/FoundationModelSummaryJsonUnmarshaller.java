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
package com.amazonaws.services.bedrock.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.bedrock.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FoundationModelSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FoundationModelSummaryJsonUnmarshaller implements Unmarshaller<FoundationModelSummary, JsonUnmarshallerContext> {

    public FoundationModelSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        FoundationModelSummary foundationModelSummary = new FoundationModelSummary();

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
                if (context.testExpression("modelArn", targetDepth)) {
                    context.nextToken();
                    foundationModelSummary.setModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("modelId", targetDepth)) {
                    context.nextToken();
                    foundationModelSummary.setModelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("modelName", targetDepth)) {
                    context.nextToken();
                    foundationModelSummary.setModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("providerName", targetDepth)) {
                    context.nextToken();
                    foundationModelSummary.setProviderName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inputModalities", targetDepth)) {
                    context.nextToken();
                    foundationModelSummary.setInputModalities(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("outputModalities", targetDepth)) {
                    context.nextToken();
                    foundationModelSummary.setOutputModalities(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("responseStreamingSupported", targetDepth)) {
                    context.nextToken();
                    foundationModelSummary.setResponseStreamingSupported(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("customizationsSupported", targetDepth)) {
                    context.nextToken();
                    foundationModelSummary.setCustomizationsSupported(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("inferenceTypesSupported", targetDepth)) {
                    context.nextToken();
                    foundationModelSummary.setInferenceTypesSupported(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("modelLifecycle", targetDepth)) {
                    context.nextToken();
                    foundationModelSummary.setModelLifecycle(FoundationModelLifecycleJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return foundationModelSummary;
    }

    private static FoundationModelSummaryJsonUnmarshaller instance;

    public static FoundationModelSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FoundationModelSummaryJsonUnmarshaller();
        return instance;
    }
}
