/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CriterionAdditionalProperties JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CriterionAdditionalPropertiesJsonUnmarshaller implements Unmarshaller<CriterionAdditionalProperties, JsonUnmarshallerContext> {

    public CriterionAdditionalProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        CriterionAdditionalProperties criterionAdditionalProperties = new CriterionAdditionalProperties();

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
                if (context.testExpression("eq", targetDepth)) {
                    context.nextToken();
                    criterionAdditionalProperties.setEq(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("eqExactMatch", targetDepth)) {
                    context.nextToken();
                    criterionAdditionalProperties.setEqExactMatch(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("gt", targetDepth)) {
                    context.nextToken();
                    criterionAdditionalProperties.setGt(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("gte", targetDepth)) {
                    context.nextToken();
                    criterionAdditionalProperties.setGte(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("lt", targetDepth)) {
                    context.nextToken();
                    criterionAdditionalProperties.setLt(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("lte", targetDepth)) {
                    context.nextToken();
                    criterionAdditionalProperties.setLte(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("neq", targetDepth)) {
                    context.nextToken();
                    criterionAdditionalProperties.setNeq(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return criterionAdditionalProperties;
    }

    private static CriterionAdditionalPropertiesJsonUnmarshaller instance;

    public static CriterionAdditionalPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CriterionAdditionalPropertiesJsonUnmarshaller();
        return instance;
    }
}
