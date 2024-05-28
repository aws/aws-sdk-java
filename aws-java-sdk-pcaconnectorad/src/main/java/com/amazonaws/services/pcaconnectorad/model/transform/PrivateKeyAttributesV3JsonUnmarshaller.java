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
package com.amazonaws.services.pcaconnectorad.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pcaconnectorad.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PrivateKeyAttributesV3 JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrivateKeyAttributesV3JsonUnmarshaller implements Unmarshaller<PrivateKeyAttributesV3, JsonUnmarshallerContext> {

    public PrivateKeyAttributesV3 unmarshall(JsonUnmarshallerContext context) throws Exception {
        PrivateKeyAttributesV3 privateKeyAttributesV3 = new PrivateKeyAttributesV3();

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
                if (context.testExpression("Algorithm", targetDepth)) {
                    context.nextToken();
                    privateKeyAttributesV3.setAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CryptoProviders", targetDepth)) {
                    context.nextToken();
                    privateKeyAttributesV3.setCryptoProviders(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("KeySpec", targetDepth)) {
                    context.nextToken();
                    privateKeyAttributesV3.setKeySpec(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyUsageProperty", targetDepth)) {
                    context.nextToken();
                    privateKeyAttributesV3.setKeyUsageProperty(KeyUsagePropertyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MinimalKeyLength", targetDepth)) {
                    context.nextToken();
                    privateKeyAttributesV3.setMinimalKeyLength(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return privateKeyAttributesV3;
    }

    private static PrivateKeyAttributesV3JsonUnmarshaller instance;

    public static PrivateKeyAttributesV3JsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PrivateKeyAttributesV3JsonUnmarshaller();
        return instance;
    }
}
