/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.frauddetector.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.frauddetector.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ModelVersionDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelVersionDetailJsonUnmarshaller implements Unmarshaller<ModelVersionDetail, JsonUnmarshallerContext> {

    public ModelVersionDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        ModelVersionDetail modelVersionDetail = new ModelVersionDetail();

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
                if (context.testExpression("modelId", targetDepth)) {
                    context.nextToken();
                    modelVersionDetail.setModelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("modelType", targetDepth)) {
                    context.nextToken();
                    modelVersionDetail.setModelType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("modelVersionNumber", targetDepth)) {
                    context.nextToken();
                    modelVersionDetail.setModelVersionNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    modelVersionDetail.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("trainingDataSource", targetDepth)) {
                    context.nextToken();
                    modelVersionDetail.setTrainingDataSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("trainingDataSchema", targetDepth)) {
                    context.nextToken();
                    modelVersionDetail.setTrainingDataSchema(TrainingDataSchemaJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("externalEventsDetail", targetDepth)) {
                    context.nextToken();
                    modelVersionDetail.setExternalEventsDetail(ExternalEventsDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("trainingResult", targetDepth)) {
                    context.nextToken();
                    modelVersionDetail.setTrainingResult(TrainingResultJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lastUpdatedTime", targetDepth)) {
                    context.nextToken();
                    modelVersionDetail.setLastUpdatedTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdTime", targetDepth)) {
                    context.nextToken();
                    modelVersionDetail.setCreatedTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    modelVersionDetail.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return modelVersionDetail;
    }

    private static ModelVersionDetailJsonUnmarshaller instance;

    public static ModelVersionDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModelVersionDetailJsonUnmarshaller();
        return instance;
    }
}
