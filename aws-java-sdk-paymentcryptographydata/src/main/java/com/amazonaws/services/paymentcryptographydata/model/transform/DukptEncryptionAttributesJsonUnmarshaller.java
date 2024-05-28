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
 * DukptEncryptionAttributes JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DukptEncryptionAttributesJsonUnmarshaller implements Unmarshaller<DukptEncryptionAttributes, JsonUnmarshallerContext> {

    public DukptEncryptionAttributes unmarshall(JsonUnmarshallerContext context) throws Exception {
        DukptEncryptionAttributes dukptEncryptionAttributes = new DukptEncryptionAttributes();

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
                if (context.testExpression("DukptKeyDerivationType", targetDepth)) {
                    context.nextToken();
                    dukptEncryptionAttributes.setDukptKeyDerivationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DukptKeyVariant", targetDepth)) {
                    context.nextToken();
                    dukptEncryptionAttributes.setDukptKeyVariant(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InitializationVector", targetDepth)) {
                    context.nextToken();
                    dukptEncryptionAttributes.setInitializationVector(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeySerialNumber", targetDepth)) {
                    context.nextToken();
                    dukptEncryptionAttributes.setKeySerialNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Mode", targetDepth)) {
                    context.nextToken();
                    dukptEncryptionAttributes.setMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dukptEncryptionAttributes;
    }

    private static DukptEncryptionAttributesJsonUnmarshaller instance;

    public static DukptEncryptionAttributesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DukptEncryptionAttributesJsonUnmarshaller();
        return instance;
    }
}
