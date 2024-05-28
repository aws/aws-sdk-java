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
 * FoundationModelDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FoundationModelDetailsJsonUnmarshaller implements Unmarshaller<FoundationModelDetails, JsonUnmarshallerContext> {

    public FoundationModelDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        FoundationModelDetails foundationModelDetails = new FoundationModelDetails();

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
                    foundationModelDetails.setModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("modelId", targetDepth)) {
                    context.nextToken();
                    foundationModelDetails.setModelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("modelName", targetDepth)) {
                    context.nextToken();
                    foundationModelDetails.setModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("providerName", targetDepth)) {
                    context.nextToken();
                    foundationModelDetails.setProviderName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inputModalities", targetDepth)) {
                    context.nextToken();
                    foundationModelDetails.setInputModalities(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("outputModalities", targetDepth)) {
                    context.nextToken();
                    foundationModelDetails.setOutputModalities(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("responseStreamingSupported", targetDepth)) {
                    context.nextToken();
                    foundationModelDetails.setResponseStreamingSupported(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("customizationsSupported", targetDepth)) {
                    context.nextToken();
                    foundationModelDetails.setCustomizationsSupported(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("inferenceTypesSupported", targetDepth)) {
                    context.nextToken();
                    foundationModelDetails.setInferenceTypesSupported(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("modelLifecycle", targetDepth)) {
                    context.nextToken();
                    foundationModelDetails.setModelLifecycle(FoundationModelLifecycleJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return foundationModelDetails;
    }

    private static FoundationModelDetailsJsonUnmarshaller instance;

    public static FoundationModelDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FoundationModelDetailsJsonUnmarshaller();
        return instance;
    }
}
