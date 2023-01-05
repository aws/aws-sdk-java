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
package com.amazonaws.services.iottwinmaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iottwinmaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EntitySummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntitySummaryJsonUnmarshaller implements Unmarshaller<EntitySummary, JsonUnmarshallerContext> {

    public EntitySummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        EntitySummary entitySummary = new EntitySummary();

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
                if (context.testExpression("entityId", targetDepth)) {
                    context.nextToken();
                    entitySummary.setEntityId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("entityName", targetDepth)) {
                    context.nextToken();
                    entitySummary.setEntityName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    entitySummary.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parentEntityId", targetDepth)) {
                    context.nextToken();
                    entitySummary.setParentEntityId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    entitySummary.setStatus(StatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    entitySummary.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hasChildEntities", targetDepth)) {
                    context.nextToken();
                    entitySummary.setHasChildEntities(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    entitySummary.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updateDateTime", targetDepth)) {
                    context.nextToken();
                    entitySummary.setUpdateDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return entitySummary;
    }

    private static EntitySummaryJsonUnmarshaller instance;

    public static EntitySummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EntitySummaryJsonUnmarshaller();
        return instance;
    }
}
