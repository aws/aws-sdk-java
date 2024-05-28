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
package com.amazonaws.services.neptunedata.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.neptunedata.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetMLModelTrainingJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMLModelTrainingJobResultJsonUnmarshaller implements Unmarshaller<GetMLModelTrainingJobResult, JsonUnmarshallerContext> {

    public GetMLModelTrainingJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetMLModelTrainingJobResult getMLModelTrainingJobResult = new GetMLModelTrainingJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getMLModelTrainingJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getMLModelTrainingJobResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    getMLModelTrainingJobResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("processingJob", targetDepth)) {
                    context.nextToken();
                    getMLModelTrainingJobResult.setProcessingJob(MlResourceDefinitionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("hpoJob", targetDepth)) {
                    context.nextToken();
                    getMLModelTrainingJobResult.setHpoJob(MlResourceDefinitionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("modelTransformJob", targetDepth)) {
                    context.nextToken();
                    getMLModelTrainingJobResult.setModelTransformJob(MlResourceDefinitionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("mlModels", targetDepth)) {
                    context.nextToken();
                    getMLModelTrainingJobResult.setMlModels(new ListUnmarshaller<MlConfigDefinition>(MlConfigDefinitionJsonUnmarshaller.getInstance())

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

        return getMLModelTrainingJobResult;
    }

    private static GetMLModelTrainingJobResultJsonUnmarshaller instance;

    public static GetMLModelTrainingJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMLModelTrainingJobResultJsonUnmarshaller();
        return instance;
    }
}
