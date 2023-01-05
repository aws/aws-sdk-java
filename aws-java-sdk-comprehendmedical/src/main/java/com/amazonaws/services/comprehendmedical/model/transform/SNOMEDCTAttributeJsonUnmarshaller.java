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
package com.amazonaws.services.comprehendmedical.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SNOMEDCTAttribute JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SNOMEDCTAttributeJsonUnmarshaller implements Unmarshaller<SNOMEDCTAttribute, JsonUnmarshallerContext> {

    public SNOMEDCTAttribute unmarshall(JsonUnmarshallerContext context) throws Exception {
        SNOMEDCTAttribute sNOMEDCTAttribute = new SNOMEDCTAttribute();

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
                if (context.testExpression("Category", targetDepth)) {
                    context.nextToken();
                    sNOMEDCTAttribute.setCategory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    sNOMEDCTAttribute.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Score", targetDepth)) {
                    context.nextToken();
                    sNOMEDCTAttribute.setScore(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("RelationshipScore", targetDepth)) {
                    context.nextToken();
                    sNOMEDCTAttribute.setRelationshipScore(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("RelationshipType", targetDepth)) {
                    context.nextToken();
                    sNOMEDCTAttribute.setRelationshipType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    sNOMEDCTAttribute.setId(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("BeginOffset", targetDepth)) {
                    context.nextToken();
                    sNOMEDCTAttribute.setBeginOffset(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("EndOffset", targetDepth)) {
                    context.nextToken();
                    sNOMEDCTAttribute.setEndOffset(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Text", targetDepth)) {
                    context.nextToken();
                    sNOMEDCTAttribute.setText(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Traits", targetDepth)) {
                    context.nextToken();
                    sNOMEDCTAttribute.setTraits(new ListUnmarshaller<SNOMEDCTTrait>(SNOMEDCTTraitJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("SNOMEDCTConcepts", targetDepth)) {
                    context.nextToken();
                    sNOMEDCTAttribute.setSNOMEDCTConcepts(new ListUnmarshaller<SNOMEDCTConcept>(SNOMEDCTConceptJsonUnmarshaller.getInstance())

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

        return sNOMEDCTAttribute;
    }

    private static SNOMEDCTAttributeJsonUnmarshaller instance;

    public static SNOMEDCTAttributeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SNOMEDCTAttributeJsonUnmarshaller();
        return instance;
    }
}
