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
package com.amazonaws.services.amplifyuibuilder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.amplifyuibuilder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ComponentBindingPropertiesValueProperties JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentBindingPropertiesValuePropertiesJsonUnmarshaller implements
        Unmarshaller<ComponentBindingPropertiesValueProperties, JsonUnmarshallerContext> {

    public ComponentBindingPropertiesValueProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        ComponentBindingPropertiesValueProperties componentBindingPropertiesValueProperties = new ComponentBindingPropertiesValueProperties();

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
                if (context.testExpression("bucket", targetDepth)) {
                    context.nextToken();
                    componentBindingPropertiesValueProperties.setBucket(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("defaultValue", targetDepth)) {
                    context.nextToken();
                    componentBindingPropertiesValueProperties.setDefaultValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("field", targetDepth)) {
                    context.nextToken();
                    componentBindingPropertiesValueProperties.setField(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("key", targetDepth)) {
                    context.nextToken();
                    componentBindingPropertiesValueProperties.setKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("model", targetDepth)) {
                    context.nextToken();
                    componentBindingPropertiesValueProperties.setModel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("predicates", targetDepth)) {
                    context.nextToken();
                    componentBindingPropertiesValueProperties.setPredicates(new ListUnmarshaller<Predicate>(PredicateJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("slotName", targetDepth)) {
                    context.nextToken();
                    componentBindingPropertiesValueProperties.setSlotName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("userAttribute", targetDepth)) {
                    context.nextToken();
                    componentBindingPropertiesValueProperties.setUserAttribute(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return componentBindingPropertiesValueProperties;
    }

    private static ComponentBindingPropertiesValuePropertiesJsonUnmarshaller instance;

    public static ComponentBindingPropertiesValuePropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ComponentBindingPropertiesValuePropertiesJsonUnmarshaller();
        return instance;
    }
}
