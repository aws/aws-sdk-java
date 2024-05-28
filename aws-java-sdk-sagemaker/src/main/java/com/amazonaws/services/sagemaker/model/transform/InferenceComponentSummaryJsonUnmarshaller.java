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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InferenceComponentSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferenceComponentSummaryJsonUnmarshaller implements Unmarshaller<InferenceComponentSummary, JsonUnmarshallerContext> {

    public InferenceComponentSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        InferenceComponentSummary inferenceComponentSummary = new InferenceComponentSummary();

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
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    inferenceComponentSummary.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("InferenceComponentArn", targetDepth)) {
                    context.nextToken();
                    inferenceComponentSummary.setInferenceComponentArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InferenceComponentName", targetDepth)) {
                    context.nextToken();
                    inferenceComponentSummary.setInferenceComponentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointArn", targetDepth)) {
                    context.nextToken();
                    inferenceComponentSummary.setEndpointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointName", targetDepth)) {
                    context.nextToken();
                    inferenceComponentSummary.setEndpointName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VariantName", targetDepth)) {
                    context.nextToken();
                    inferenceComponentSummary.setVariantName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InferenceComponentStatus", targetDepth)) {
                    context.nextToken();
                    inferenceComponentSummary.setInferenceComponentStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    inferenceComponentSummary.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return inferenceComponentSummary;
    }

    private static InferenceComponentSummaryJsonUnmarshaller instance;

    public static InferenceComponentSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InferenceComponentSummaryJsonUnmarshaller();
        return instance;
    }
}
