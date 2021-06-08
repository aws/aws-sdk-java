/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.acmpca.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.acmpca.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * KeyUsage JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeyUsageJsonUnmarshaller implements Unmarshaller<KeyUsage, JsonUnmarshallerContext> {

    public KeyUsage unmarshall(JsonUnmarshallerContext context) throws Exception {
        KeyUsage keyUsage = new KeyUsage();

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
                if (context.testExpression("DigitalSignature", targetDepth)) {
                    context.nextToken();
                    keyUsage.setDigitalSignature(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("NonRepudiation", targetDepth)) {
                    context.nextToken();
                    keyUsage.setNonRepudiation(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("KeyEncipherment", targetDepth)) {
                    context.nextToken();
                    keyUsage.setKeyEncipherment(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DataEncipherment", targetDepth)) {
                    context.nextToken();
                    keyUsage.setDataEncipherment(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("KeyAgreement", targetDepth)) {
                    context.nextToken();
                    keyUsage.setKeyAgreement(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("KeyCertSign", targetDepth)) {
                    context.nextToken();
                    keyUsage.setKeyCertSign(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CRLSign", targetDepth)) {
                    context.nextToken();
                    keyUsage.setCRLSign(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EncipherOnly", targetDepth)) {
                    context.nextToken();
                    keyUsage.setEncipherOnly(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DecipherOnly", targetDepth)) {
                    context.nextToken();
                    keyUsage.setDecipherOnly(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return keyUsage;
    }

    private static KeyUsageJsonUnmarshaller instance;

    public static KeyUsageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KeyUsageJsonUnmarshaller();
        return instance;
    }
}
