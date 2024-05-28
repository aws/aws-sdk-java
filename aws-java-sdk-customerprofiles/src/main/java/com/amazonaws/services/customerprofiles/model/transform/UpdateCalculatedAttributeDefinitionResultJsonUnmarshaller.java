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
package com.amazonaws.services.customerprofiles.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.customerprofiles.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateCalculatedAttributeDefinitionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCalculatedAttributeDefinitionResultJsonUnmarshaller implements
        Unmarshaller<UpdateCalculatedAttributeDefinitionResult, JsonUnmarshallerContext> {

    public UpdateCalculatedAttributeDefinitionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateCalculatedAttributeDefinitionResult updateCalculatedAttributeDefinitionResult = new UpdateCalculatedAttributeDefinitionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateCalculatedAttributeDefinitionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("CalculatedAttributeName", targetDepth)) {
                    context.nextToken();
                    updateCalculatedAttributeDefinitionResult.setCalculatedAttributeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayName", targetDepth)) {
                    context.nextToken();
                    updateCalculatedAttributeDefinitionResult.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    updateCalculatedAttributeDefinitionResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    updateCalculatedAttributeDefinitionResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    updateCalculatedAttributeDefinitionResult.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Statistic", targetDepth)) {
                    context.nextToken();
                    updateCalculatedAttributeDefinitionResult.setStatistic(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Conditions", targetDepth)) {
                    context.nextToken();
                    updateCalculatedAttributeDefinitionResult.setConditions(ConditionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AttributeDetails", targetDepth)) {
                    context.nextToken();
                    updateCalculatedAttributeDefinitionResult.setAttributeDetails(AttributeDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    updateCalculatedAttributeDefinitionResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return updateCalculatedAttributeDefinitionResult;
    }

    private static UpdateCalculatedAttributeDefinitionResultJsonUnmarshaller instance;

    public static UpdateCalculatedAttributeDefinitionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateCalculatedAttributeDefinitionResultJsonUnmarshaller();
        return instance;
    }
}
