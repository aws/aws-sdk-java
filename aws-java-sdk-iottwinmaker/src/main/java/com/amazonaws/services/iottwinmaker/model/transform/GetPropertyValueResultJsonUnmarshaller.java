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

import java.util.Map;
import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iottwinmaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetPropertyValueResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPropertyValueResultJsonUnmarshaller implements Unmarshaller<GetPropertyValueResult, JsonUnmarshallerContext> {

    public GetPropertyValueResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetPropertyValueResult getPropertyValueResult = new GetPropertyValueResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getPropertyValueResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("propertyValues", targetDepth)) {
                    context.nextToken();
                    getPropertyValueResult.setPropertyValues(new MapUnmarshaller<String, PropertyLatestValue>(context.getUnmarshaller(String.class),
                            PropertyLatestValueJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("nextToken", targetDepth)) {
                    context.nextToken();
                    getPropertyValueResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tabularPropertyValues", targetDepth)) {
                    context.nextToken();
                    getPropertyValueResult.setTabularPropertyValues(new ListUnmarshaller<java.util.List<java.util.Map<String, DataValue>>>(
                            new ListUnmarshaller<java.util.Map<String, DataValue>>(new MapUnmarshaller<String, DataValue>(
                                    context.getUnmarshaller(String.class), DataValueJsonUnmarshaller.getInstance()))

                    )

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

        return getPropertyValueResult;
    }

    private static GetPropertyValueResultJsonUnmarshaller instance;

    public static GetPropertyValueResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetPropertyValueResultJsonUnmarshaller();
        return instance;
    }
}
