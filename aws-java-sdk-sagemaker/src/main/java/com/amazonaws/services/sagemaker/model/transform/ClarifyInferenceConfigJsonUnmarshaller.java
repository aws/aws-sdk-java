/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ClarifyInferenceConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClarifyInferenceConfigJsonUnmarshaller implements Unmarshaller<ClarifyInferenceConfig, JsonUnmarshallerContext> {

    public ClarifyInferenceConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        ClarifyInferenceConfig clarifyInferenceConfig = new ClarifyInferenceConfig();

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
                if (context.testExpression("FeaturesAttribute", targetDepth)) {
                    context.nextToken();
                    clarifyInferenceConfig.setFeaturesAttribute(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContentTemplate", targetDepth)) {
                    context.nextToken();
                    clarifyInferenceConfig.setContentTemplate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxRecordCount", targetDepth)) {
                    context.nextToken();
                    clarifyInferenceConfig.setMaxRecordCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaxPayloadInMB", targetDepth)) {
                    context.nextToken();
                    clarifyInferenceConfig.setMaxPayloadInMB(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ProbabilityIndex", targetDepth)) {
                    context.nextToken();
                    clarifyInferenceConfig.setProbabilityIndex(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("LabelIndex", targetDepth)) {
                    context.nextToken();
                    clarifyInferenceConfig.setLabelIndex(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ProbabilityAttribute", targetDepth)) {
                    context.nextToken();
                    clarifyInferenceConfig.setProbabilityAttribute(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LabelAttribute", targetDepth)) {
                    context.nextToken();
                    clarifyInferenceConfig.setLabelAttribute(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LabelHeaders", targetDepth)) {
                    context.nextToken();
                    clarifyInferenceConfig.setLabelHeaders(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("FeatureHeaders", targetDepth)) {
                    context.nextToken();
                    clarifyInferenceConfig.setFeatureHeaders(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("FeatureTypes", targetDepth)) {
                    context.nextToken();
                    clarifyInferenceConfig.setFeatureTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return clarifyInferenceConfig;
    }

    private static ClarifyInferenceConfigJsonUnmarshaller instance;

    public static ClarifyInferenceConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClarifyInferenceConfigJsonUnmarshaller();
        return instance;
    }
}
