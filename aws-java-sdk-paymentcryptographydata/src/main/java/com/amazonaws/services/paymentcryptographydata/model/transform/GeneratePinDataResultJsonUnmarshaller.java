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
package com.amazonaws.services.paymentcryptographydata.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.paymentcryptographydata.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GeneratePinDataResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeneratePinDataResultJsonUnmarshaller implements Unmarshaller<GeneratePinDataResult, JsonUnmarshallerContext> {

    public GeneratePinDataResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GeneratePinDataResult generatePinDataResult = new GeneratePinDataResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return generatePinDataResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("EncryptedPinBlock", targetDepth)) {
                    context.nextToken();
                    generatePinDataResult.setEncryptedPinBlock(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EncryptionKeyArn", targetDepth)) {
                    context.nextToken();
                    generatePinDataResult.setEncryptionKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EncryptionKeyCheckValue", targetDepth)) {
                    context.nextToken();
                    generatePinDataResult.setEncryptionKeyCheckValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GenerationKeyArn", targetDepth)) {
                    context.nextToken();
                    generatePinDataResult.setGenerationKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GenerationKeyCheckValue", targetDepth)) {
                    context.nextToken();
                    generatePinDataResult.setGenerationKeyCheckValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PinData", targetDepth)) {
                    context.nextToken();
                    generatePinDataResult.setPinData(PinDataJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return generatePinDataResult;
    }

    private static GeneratePinDataResultJsonUnmarshaller instance;

    public static GeneratePinDataResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GeneratePinDataResultJsonUnmarshaller();
        return instance;
    }
}
