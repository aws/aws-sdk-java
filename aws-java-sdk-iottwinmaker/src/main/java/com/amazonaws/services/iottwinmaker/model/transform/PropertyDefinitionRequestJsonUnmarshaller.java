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
package com.amazonaws.services.iottwinmaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iottwinmaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PropertyDefinitionRequest JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PropertyDefinitionRequestJsonUnmarshaller implements Unmarshaller<PropertyDefinitionRequest, JsonUnmarshallerContext> {

    public PropertyDefinitionRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        PropertyDefinitionRequest propertyDefinitionRequest = new PropertyDefinitionRequest();

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
                if (context.testExpression("dataType", targetDepth)) {
                    context.nextToken();
                    propertyDefinitionRequest.setDataType(DataTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("isRequiredInEntity", targetDepth)) {
                    context.nextToken();
                    propertyDefinitionRequest.setIsRequiredInEntity(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("isExternalId", targetDepth)) {
                    context.nextToken();
                    propertyDefinitionRequest.setIsExternalId(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("isStoredExternally", targetDepth)) {
                    context.nextToken();
                    propertyDefinitionRequest.setIsStoredExternally(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("isTimeSeries", targetDepth)) {
                    context.nextToken();
                    propertyDefinitionRequest.setIsTimeSeries(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("defaultValue", targetDepth)) {
                    context.nextToken();
                    propertyDefinitionRequest.setDefaultValue(DataValueJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("configuration", targetDepth)) {
                    context.nextToken();
                    propertyDefinitionRequest.setConfiguration(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("displayName", targetDepth)) {
                    context.nextToken();
                    propertyDefinitionRequest.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return propertyDefinitionRequest;
    }

    private static PropertyDefinitionRequestJsonUnmarshaller instance;

    public static PropertyDefinitionRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PropertyDefinitionRequestJsonUnmarshaller();
        return instance;
    }
}
