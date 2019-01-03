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
package com.amazonaws.services.lightsail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RelationalDatabaseParameter JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelationalDatabaseParameterJsonUnmarshaller implements Unmarshaller<RelationalDatabaseParameter, JsonUnmarshallerContext> {

    public RelationalDatabaseParameter unmarshall(JsonUnmarshallerContext context) throws Exception {
        RelationalDatabaseParameter relationalDatabaseParameter = new RelationalDatabaseParameter();

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
                if (context.testExpression("allowedValues", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseParameter.setAllowedValues(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("applyMethod", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseParameter.setApplyMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("applyType", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseParameter.setApplyType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataType", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseParameter.setDataType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseParameter.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("isModifiable", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseParameter.setIsModifiable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("parameterName", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseParameter.setParameterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parameterValue", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseParameter.setParameterValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return relationalDatabaseParameter;
    }

    private static RelationalDatabaseParameterJsonUnmarshaller instance;

    public static RelationalDatabaseParameterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RelationalDatabaseParameterJsonUnmarshaller();
        return instance;
    }
}
