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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ViewDefinition JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ViewDefinitionJsonUnmarshaller implements Unmarshaller<ViewDefinition, JsonUnmarshallerContext> {

    public ViewDefinition unmarshall(JsonUnmarshallerContext context) throws Exception {
        ViewDefinition viewDefinition = new ViewDefinition();

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
                if (context.testExpression("IsProtected", targetDepth)) {
                    context.nextToken();
                    viewDefinition.setIsProtected(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Definer", targetDepth)) {
                    context.nextToken();
                    viewDefinition.setDefiner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubObjects", targetDepth)) {
                    context.nextToken();
                    viewDefinition.setSubObjects(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Representations", targetDepth)) {
                    context.nextToken();
                    viewDefinition.setRepresentations(new ListUnmarshaller<ViewRepresentation>(ViewRepresentationJsonUnmarshaller.getInstance())

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

        return viewDefinition;
    }

    private static ViewDefinitionJsonUnmarshaller instance;

    public static ViewDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ViewDefinitionJsonUnmarshaller();
        return instance;
    }
}
