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
package com.amazonaws.services.dax.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.dax.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Parameter JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterJsonUnmarshaller implements Unmarshaller<Parameter, JsonUnmarshallerContext> {

    public Parameter unmarshall(JsonUnmarshallerContext context) throws Exception {
        Parameter parameter = new Parameter();

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
                if (context.testExpression("ParameterName", targetDepth)) {
                    context.nextToken();
                    parameter.setParameterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParameterType", targetDepth)) {
                    context.nextToken();
                    parameter.setParameterType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParameterValue", targetDepth)) {
                    context.nextToken();
                    parameter.setParameterValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NodeTypeSpecificValues", targetDepth)) {
                    context.nextToken();
                    parameter.setNodeTypeSpecificValues(new ListUnmarshaller<NodeTypeSpecificValue>(NodeTypeSpecificValueJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    parameter.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Source", targetDepth)) {
                    context.nextToken();
                    parameter.setSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataType", targetDepth)) {
                    context.nextToken();
                    parameter.setDataType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AllowedValues", targetDepth)) {
                    context.nextToken();
                    parameter.setAllowedValues(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsModifiable", targetDepth)) {
                    context.nextToken();
                    parameter.setIsModifiable(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ChangeType", targetDepth)) {
                    context.nextToken();
                    parameter.setChangeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return parameter;
    }

    private static ParameterJsonUnmarshaller instance;

    public static ParameterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ParameterJsonUnmarshaller();
        return instance;
    }
}
