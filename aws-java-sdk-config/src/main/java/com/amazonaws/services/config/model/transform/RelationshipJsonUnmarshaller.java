/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Relationship JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelationshipJsonUnmarshaller implements Unmarshaller<Relationship, JsonUnmarshallerContext> {

    public Relationship unmarshall(JsonUnmarshallerContext context) throws Exception {
        Relationship relationship = new Relationship();

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
                if (context.testExpression("resourceType", targetDepth)) {
                    context.nextToken();
                    relationship.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceId", targetDepth)) {
                    context.nextToken();
                    relationship.setResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceName", targetDepth)) {
                    context.nextToken();
                    relationship.setResourceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("relationshipName", targetDepth)) {
                    context.nextToken();
                    relationship.setRelationshipName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return relationship;
    }

    private static RelationshipJsonUnmarshaller instance;

    public static RelationshipJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RelationshipJsonUnmarshaller();
        return instance;
    }
}
