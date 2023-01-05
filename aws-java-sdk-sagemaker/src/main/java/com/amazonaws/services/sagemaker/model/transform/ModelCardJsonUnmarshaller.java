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
 * ModelCard JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelCardJsonUnmarshaller implements Unmarshaller<ModelCard, JsonUnmarshallerContext> {

    public ModelCard unmarshall(JsonUnmarshallerContext context) throws Exception {
        ModelCard modelCard = new ModelCard();

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
                if (context.testExpression("ModelCardArn", targetDepth)) {
                    context.nextToken();
                    modelCard.setModelCardArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelCardName", targetDepth)) {
                    context.nextToken();
                    modelCard.setModelCardName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelCardVersion", targetDepth)) {
                    context.nextToken();
                    modelCard.setModelCardVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Content", targetDepth)) {
                    context.nextToken();
                    modelCard.setContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelCardStatus", targetDepth)) {
                    context.nextToken();
                    modelCard.setModelCardStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityConfig", targetDepth)) {
                    context.nextToken();
                    modelCard.setSecurityConfig(ModelCardSecurityConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    modelCard.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    context.nextToken();
                    modelCard.setCreatedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    modelCard.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedBy", targetDepth)) {
                    context.nextToken();
                    modelCard.setLastModifiedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    modelCard.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ModelId", targetDepth)) {
                    context.nextToken();
                    modelCard.setModelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RiskRating", targetDepth)) {
                    context.nextToken();
                    modelCard.setRiskRating(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return modelCard;
    }

    private static ModelCardJsonUnmarshaller instance;

    public static ModelCardJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModelCardJsonUnmarshaller();
        return instance;
    }
}
