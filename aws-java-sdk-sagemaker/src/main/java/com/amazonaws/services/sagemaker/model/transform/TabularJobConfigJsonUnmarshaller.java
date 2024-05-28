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
 * TabularJobConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TabularJobConfigJsonUnmarshaller implements Unmarshaller<TabularJobConfig, JsonUnmarshallerContext> {

    public TabularJobConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        TabularJobConfig tabularJobConfig = new TabularJobConfig();

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
                if (context.testExpression("CandidateGenerationConfig", targetDepth)) {
                    context.nextToken();
                    tabularJobConfig.setCandidateGenerationConfig(CandidateGenerationConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CompletionCriteria", targetDepth)) {
                    context.nextToken();
                    tabularJobConfig.setCompletionCriteria(AutoMLJobCompletionCriteriaJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FeatureSpecificationS3Uri", targetDepth)) {
                    context.nextToken();
                    tabularJobConfig.setFeatureSpecificationS3Uri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Mode", targetDepth)) {
                    context.nextToken();
                    tabularJobConfig.setMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GenerateCandidateDefinitionsOnly", targetDepth)) {
                    context.nextToken();
                    tabularJobConfig.setGenerateCandidateDefinitionsOnly(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ProblemType", targetDepth)) {
                    context.nextToken();
                    tabularJobConfig.setProblemType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetAttributeName", targetDepth)) {
                    context.nextToken();
                    tabularJobConfig.setTargetAttributeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SampleWeightAttributeName", targetDepth)) {
                    context.nextToken();
                    tabularJobConfig.setSampleWeightAttributeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return tabularJobConfig;
    }

    private static TabularJobConfigJsonUnmarshaller instance;

    public static TabularJobConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TabularJobConfigJsonUnmarshaller();
        return instance;
    }
}
