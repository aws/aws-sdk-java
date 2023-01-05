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
 * ComponentProperty JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentPropertyJsonUnmarshaller implements Unmarshaller<ComponentProperty, JsonUnmarshallerContext> {

    public ComponentProperty unmarshall(JsonUnmarshallerContext context) throws Exception {
        ComponentProperty componentProperty = new ComponentProperty();

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
                if (context.testExpression("bindingProperties", targetDepth)) {
                    context.nextToken();
                    componentProperty.setBindingProperties(ComponentPropertyBindingPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("bindings", targetDepth)) {
                    context.nextToken();
                    componentProperty.setBindings(new MapUnmarshaller<String, FormBindingElement>(context.getUnmarshaller(String.class),
                            FormBindingElementJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("collectionBindingProperties", targetDepth)) {
                    context.nextToken();
                    componentProperty.setCollectionBindingProperties(ComponentPropertyBindingPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("componentName", targetDepth)) {
                    context.nextToken();
                    componentProperty.setComponentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("concat", targetDepth)) {
                    context.nextToken();
                    componentProperty.setConcat(new ListUnmarshaller<ComponentProperty>(ComponentPropertyJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("condition", targetDepth)) {
                    context.nextToken();
                    componentProperty.setCondition(ComponentConditionPropertyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("configured", targetDepth)) {
                    context.nextToken();
                    componentProperty.setConfigured(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("defaultValue", targetDepth)) {
                    context.nextToken();
                    componentProperty.setDefaultValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("event", targetDepth)) {
                    context.nextToken();
                    componentProperty.setEvent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("importedValue", targetDepth)) {
                    context.nextToken();
                    componentProperty.setImportedValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("model", targetDepth)) {
                    context.nextToken();
                    componentProperty.setModel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("property", targetDepth)) {
                    context.nextToken();
                    componentProperty.setProperty(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    componentProperty.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("userAttribute", targetDepth)) {
                    context.nextToken();
                    componentProperty.setUserAttribute(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("value", targetDepth)) {
                    context.nextToken();
                    componentProperty.setValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return componentProperty;
    }

    private static ComponentPropertyJsonUnmarshaller instance;

    public static ComponentPropertyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ComponentPropertyJsonUnmarshaller();
        return instance;
    }
}
