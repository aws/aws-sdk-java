/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.serverlessapplicationrepository.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.serverlessapplicationrepository.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ParameterDefinition JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterDefinitionJsonUnmarshaller implements Unmarshaller<ParameterDefinition, JsonUnmarshallerContext> {

    public ParameterDefinition unmarshall(JsonUnmarshallerContext context) throws Exception {
        ParameterDefinition parameterDefinition = new ParameterDefinition();

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
                if (context.testExpression("allowedPattern", targetDepth)) {
                    context.nextToken();
                    parameterDefinition.setAllowedPattern(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("allowedValues", targetDepth)) {
                    context.nextToken();
                    parameterDefinition.setAllowedValues(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("constraintDescription", targetDepth)) {
                    context.nextToken();
                    parameterDefinition.setConstraintDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("defaultValue", targetDepth)) {
                    context.nextToken();
                    parameterDefinition.setDefaultValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    parameterDefinition.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("maxLength", targetDepth)) {
                    context.nextToken();
                    parameterDefinition.setMaxLength(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("maxValue", targetDepth)) {
                    context.nextToken();
                    parameterDefinition.setMaxValue(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("minLength", targetDepth)) {
                    context.nextToken();
                    parameterDefinition.setMinLength(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("minValue", targetDepth)) {
                    context.nextToken();
                    parameterDefinition.setMinValue(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    parameterDefinition.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("noEcho", targetDepth)) {
                    context.nextToken();
                    parameterDefinition.setNoEcho(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("referencedByResources", targetDepth)) {
                    context.nextToken();
                    parameterDefinition.setReferencedByResources(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    parameterDefinition.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return parameterDefinition;
    }

    private static ParameterDefinitionJsonUnmarshaller instance;

    public static ParameterDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ParameterDefinitionJsonUnmarshaller();
        return instance;
    }
}
