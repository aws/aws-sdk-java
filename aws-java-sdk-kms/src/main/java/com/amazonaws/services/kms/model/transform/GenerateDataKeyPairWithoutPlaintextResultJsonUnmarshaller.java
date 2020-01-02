/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kms.model.transform;

import java.math.*;
import java.nio.ByteBuffer;
import javax.annotation.Generated;

import com.amazonaws.services.kms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GenerateDataKeyPairWithoutPlaintextResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerateDataKeyPairWithoutPlaintextResultJsonUnmarshaller implements
        Unmarshaller<GenerateDataKeyPairWithoutPlaintextResult, JsonUnmarshallerContext> {

    public GenerateDataKeyPairWithoutPlaintextResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GenerateDataKeyPairWithoutPlaintextResult generateDataKeyPairWithoutPlaintextResult = new GenerateDataKeyPairWithoutPlaintextResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return generateDataKeyPairWithoutPlaintextResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("PrivateKeyCiphertextBlob", targetDepth)) {
                    context.nextToken();
                    generateDataKeyPairWithoutPlaintextResult.setPrivateKeyCiphertextBlob(context.getUnmarshaller(java.nio.ByteBuffer.class)
                            .unmarshall(context));
                }
                if (context.testExpression("PublicKey", targetDepth)) {
                    context.nextToken();
                    generateDataKeyPairWithoutPlaintextResult.setPublicKey(context.getUnmarshaller(java.nio.ByteBuffer.class).unmarshall(context));
                }
                if (context.testExpression("KeyId", targetDepth)) {
                    context.nextToken();
                    generateDataKeyPairWithoutPlaintextResult.setKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyPairSpec", targetDepth)) {
                    context.nextToken();
                    generateDataKeyPairWithoutPlaintextResult.setKeyPairSpec(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return generateDataKeyPairWithoutPlaintextResult;
    }

    private static GenerateDataKeyPairWithoutPlaintextResultJsonUnmarshaller instance;

    public static GenerateDataKeyPairWithoutPlaintextResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GenerateDataKeyPairWithoutPlaintextResultJsonUnmarshaller();
        return instance;
    }
}
