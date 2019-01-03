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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UserDefinedFunction JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserDefinedFunctionJsonUnmarshaller implements Unmarshaller<UserDefinedFunction, JsonUnmarshallerContext> {

    public UserDefinedFunction unmarshall(JsonUnmarshallerContext context) throws Exception {
        UserDefinedFunction userDefinedFunction = new UserDefinedFunction();

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
                if (context.testExpression("FunctionName", targetDepth)) {
                    context.nextToken();
                    userDefinedFunction.setFunctionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClassName", targetDepth)) {
                    context.nextToken();
                    userDefinedFunction.setClassName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OwnerName", targetDepth)) {
                    context.nextToken();
                    userDefinedFunction.setOwnerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OwnerType", targetDepth)) {
                    context.nextToken();
                    userDefinedFunction.setOwnerType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreateTime", targetDepth)) {
                    context.nextToken();
                    userDefinedFunction.setCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ResourceUris", targetDepth)) {
                    context.nextToken();
                    userDefinedFunction.setResourceUris(new ListUnmarshaller<ResourceUri>(ResourceUriJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return userDefinedFunction;
    }

    private static UserDefinedFunctionJsonUnmarshaller instance;

    public static UserDefinedFunctionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserDefinedFunctionJsonUnmarshaller();
        return instance;
    }
}
