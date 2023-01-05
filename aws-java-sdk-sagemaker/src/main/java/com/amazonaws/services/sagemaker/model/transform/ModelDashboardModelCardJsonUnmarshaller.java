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
 * ModelDashboardModelCard JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelDashboardModelCardJsonUnmarshaller implements Unmarshaller<ModelDashboardModelCard, JsonUnmarshallerContext> {

    public ModelDashboardModelCard unmarshall(JsonUnmarshallerContext context) throws Exception {
        ModelDashboardModelCard modelDashboardModelCard = new ModelDashboardModelCard();

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
                    modelDashboardModelCard.setModelCardArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelCardName", targetDepth)) {
                    context.nextToken();
                    modelDashboardModelCard.setModelCardName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelCardVersion", targetDepth)) {
                    context.nextToken();
                    modelDashboardModelCard.setModelCardVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ModelCardStatus", targetDepth)) {
                    context.nextToken();
                    modelDashboardModelCard.setModelCardStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityConfig", targetDepth)) {
                    context.nextToken();
                    modelDashboardModelCard.setSecurityConfig(ModelCardSecurityConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    modelDashboardModelCard.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    context.nextToken();
                    modelDashboardModelCard.setCreatedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    modelDashboardModelCard.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedBy", targetDepth)) {
                    context.nextToken();
                    modelDashboardModelCard.setLastModifiedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    modelDashboardModelCard.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ModelId", targetDepth)) {
                    context.nextToken();
                    modelDashboardModelCard.setModelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RiskRating", targetDepth)) {
                    context.nextToken();
                    modelDashboardModelCard.setRiskRating(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return modelDashboardModelCard;
    }

    private static ModelDashboardModelCardJsonUnmarshaller instance;

    public static ModelDashboardModelCardJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModelDashboardModelCardJsonUnmarshaller();
        return instance;
    }
}
