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
 * RxNormEntity JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RxNormEntityJsonUnmarshaller implements Unmarshaller<RxNormEntity, JsonUnmarshallerContext> {

    public RxNormEntity unmarshall(JsonUnmarshallerContext context) throws Exception {
        RxNormEntity rxNormEntity = new RxNormEntity();

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
                    rxNormEntity.setId(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Text", targetDepth)) {
                    context.nextToken();
                    rxNormEntity.setText(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Category", targetDepth)) {
                    context.nextToken();
                    rxNormEntity.setCategory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    rxNormEntity.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Score", targetDepth)) {
                    context.nextToken();
                    rxNormEntity.setScore(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("BeginOffset", targetDepth)) {
                    context.nextToken();
                    rxNormEntity.setBeginOffset(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("EndOffset", targetDepth)) {
                    context.nextToken();
                    rxNormEntity.setEndOffset(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Attributes", targetDepth)) {
                    context.nextToken();
                    rxNormEntity.setAttributes(new ListUnmarshaller<RxNormAttribute>(RxNormAttributeJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Traits", targetDepth)) {
                    context.nextToken();
                    rxNormEntity.setTraits(new ListUnmarshaller<RxNormTrait>(RxNormTraitJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("RxNormConcepts", targetDepth)) {
                    context.nextToken();
                    rxNormEntity.setRxNormConcepts(new ListUnmarshaller<RxNormConcept>(RxNormConceptJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return rxNormEntity;
    }

    private static RxNormEntityJsonUnmarshaller instance;

    public static RxNormEntityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RxNormEntityJsonUnmarshaller();
        return instance;
    }
}
