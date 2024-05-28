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
package com.amazonaws.services.amplifyuibuilder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.amplifyuibuilder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CodegenGenericDataRelationshipType JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodegenGenericDataRelationshipTypeJsonUnmarshaller implements Unmarshaller<CodegenGenericDataRelationshipType, JsonUnmarshallerContext> {

    public CodegenGenericDataRelationshipType unmarshall(JsonUnmarshallerContext context) throws Exception {
        CodegenGenericDataRelationshipType codegenGenericDataRelationshipType = new CodegenGenericDataRelationshipType();

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
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    codegenGenericDataRelationshipType.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("relatedModelName", targetDepth)) {
                    context.nextToken();
                    codegenGenericDataRelationshipType.setRelatedModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("relatedModelFields", targetDepth)) {
                    context.nextToken();
                    codegenGenericDataRelationshipType.setRelatedModelFields(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("canUnlinkAssociatedModel", targetDepth)) {
                    context.nextToken();
                    codegenGenericDataRelationshipType.setCanUnlinkAssociatedModel(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("relatedJoinFieldName", targetDepth)) {
                    context.nextToken();
                    codegenGenericDataRelationshipType.setRelatedJoinFieldName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("relatedJoinTableName", targetDepth)) {
                    context.nextToken();
                    codegenGenericDataRelationshipType.setRelatedJoinTableName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("belongsToFieldOnRelatedModel", targetDepth)) {
                    context.nextToken();
                    codegenGenericDataRelationshipType.setBelongsToFieldOnRelatedModel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("associatedFields", targetDepth)) {
                    context.nextToken();
                    codegenGenericDataRelationshipType.setAssociatedFields(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("isHasManyIndex", targetDepth)) {
                    context.nextToken();
                    codegenGenericDataRelationshipType.setIsHasManyIndex(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return codegenGenericDataRelationshipType;
    }

    private static CodegenGenericDataRelationshipTypeJsonUnmarshaller instance;

    public static CodegenGenericDataRelationshipTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CodegenGenericDataRelationshipTypeJsonUnmarshaller();
        return instance;
    }
}
