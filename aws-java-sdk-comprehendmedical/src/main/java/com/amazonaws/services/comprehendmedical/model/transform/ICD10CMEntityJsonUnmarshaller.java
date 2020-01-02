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
package com.amazonaws.services.comprehendmedical.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ICD10CMEntity JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ICD10CMEntityJsonUnmarshaller implements Unmarshaller<ICD10CMEntity, JsonUnmarshallerContext> {

    public ICD10CMEntity unmarshall(JsonUnmarshallerContext context) throws Exception {
        ICD10CMEntity iCD10CMEntity = new ICD10CMEntity();

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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    iCD10CMEntity.setId(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Text", targetDepth)) {
                    context.nextToken();
                    iCD10CMEntity.setText(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Category", targetDepth)) {
                    context.nextToken();
                    iCD10CMEntity.setCategory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    iCD10CMEntity.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Score", targetDepth)) {
                    context.nextToken();
                    iCD10CMEntity.setScore(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("BeginOffset", targetDepth)) {
                    context.nextToken();
                    iCD10CMEntity.setBeginOffset(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("EndOffset", targetDepth)) {
                    context.nextToken();
                    iCD10CMEntity.setEndOffset(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Attributes", targetDepth)) {
                    context.nextToken();
                    iCD10CMEntity.setAttributes(new ListUnmarshaller<ICD10CMAttribute>(ICD10CMAttributeJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Traits", targetDepth)) {
                    context.nextToken();
                    iCD10CMEntity.setTraits(new ListUnmarshaller<ICD10CMTrait>(ICD10CMTraitJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ICD10CMConcepts", targetDepth)) {
                    context.nextToken();
                    iCD10CMEntity.setICD10CMConcepts(new ListUnmarshaller<ICD10CMConcept>(ICD10CMConceptJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return iCD10CMEntity;
    }

    private static ICD10CMEntityJsonUnmarshaller instance;

    public static ICD10CMEntityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ICD10CMEntityJsonUnmarshaller();
        return instance;
    }
}
