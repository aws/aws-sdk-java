/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.paymentcryptography.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.paymentcryptography.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WrappedKey JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WrappedKeyJsonUnmarshaller implements Unmarshaller<WrappedKey, JsonUnmarshallerContext> {

    public WrappedKey unmarshall(JsonUnmarshallerContext context) throws Exception {
        WrappedKey wrappedKey = new WrappedKey();

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
                if (context.testExpression("WrappingKeyArn", targetDepth)) {
                    context.nextToken();
                    wrappedKey.setWrappingKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WrappedKeyMaterialFormat", targetDepth)) {
                    context.nextToken();
                    wrappedKey.setWrappedKeyMaterialFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyMaterial", targetDepth)) {
                    context.nextToken();
                    wrappedKey.setKeyMaterial(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyCheckValue", targetDepth)) {
                    context.nextToken();
                    wrappedKey.setKeyCheckValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyCheckValueAlgorithm", targetDepth)) {
                    context.nextToken();
                    wrappedKey.setKeyCheckValueAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return wrappedKey;
    }

    private static WrappedKeyJsonUnmarshaller instance;

    public static WrappedKeyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WrappedKeyJsonUnmarshaller();
        return instance;
    }
}
