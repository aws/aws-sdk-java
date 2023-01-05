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
package com.amazonaws.services.transcribe.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.transcribe.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CategoryProperties JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CategoryPropertiesJsonUnmarshaller implements Unmarshaller<CategoryProperties, JsonUnmarshallerContext> {

    public CategoryProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        CategoryProperties categoryProperties = new CategoryProperties();

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
                if (context.testExpression("CategoryName", targetDepth)) {
                    context.nextToken();
                    categoryProperties.setCategoryName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Rules", targetDepth)) {
                    context.nextToken();
                    categoryProperties.setRules(new ListUnmarshaller<Rule>(RuleJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CreateTime", targetDepth)) {
                    context.nextToken();
                    categoryProperties.setCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdateTime", targetDepth)) {
                    context.nextToken();
                    categoryProperties.setLastUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("InputType", targetDepth)) {
                    context.nextToken();
                    categoryProperties.setInputType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return categoryProperties;
    }

    private static CategoryPropertiesJsonUnmarshaller instance;

    public static CategoryPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CategoryPropertiesJsonUnmarshaller();
        return instance;
    }
}
