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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ModelQualityAppSpecification JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelQualityAppSpecificationJsonUnmarshaller implements Unmarshaller<ModelQualityAppSpecification, JsonUnmarshallerContext> {

    public ModelQualityAppSpecification unmarshall(JsonUnmarshallerContext context) throws Exception {
        ModelQualityAppSpecification modelQualityAppSpecification = new ModelQualityAppSpecification();

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
                if (context.testExpression("ImageUri", targetDepth)) {
                    context.nextToken();
                    modelQualityAppSpecification.setImageUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContainerEntrypoint", targetDepth)) {
                    context.nextToken();
                    modelQualityAppSpecification.setContainerEntrypoint(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ContainerArguments", targetDepth)) {
                    context.nextToken();
                    modelQualityAppSpecification.setContainerArguments(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("RecordPreprocessorSourceUri", targetDepth)) {
                    context.nextToken();
                    modelQualityAppSpecification.setRecordPreprocessorSourceUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PostAnalyticsProcessorSourceUri", targetDepth)) {
                    context.nextToken();
                    modelQualityAppSpecification.setPostAnalyticsProcessorSourceUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProblemType", targetDepth)) {
                    context.nextToken();
                    modelQualityAppSpecification.setProblemType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Environment", targetDepth)) {
                    context.nextToken();
                    modelQualityAppSpecification.setEnvironment(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return modelQualityAppSpecification;
    }

    private static ModelQualityAppSpecificationJsonUnmarshaller instance;

    public static ModelQualityAppSpecificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModelQualityAppSpecificationJsonUnmarshaller();
        return instance;
    }
}
