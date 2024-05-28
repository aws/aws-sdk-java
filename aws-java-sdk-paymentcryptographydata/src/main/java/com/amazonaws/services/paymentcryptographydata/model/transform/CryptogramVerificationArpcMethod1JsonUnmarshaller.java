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
 * CryptogramVerificationArpcMethod1 JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CryptogramVerificationArpcMethod1JsonUnmarshaller implements Unmarshaller<CryptogramVerificationArpcMethod1, JsonUnmarshallerContext> {

    public CryptogramVerificationArpcMethod1 unmarshall(JsonUnmarshallerContext context) throws Exception {
        CryptogramVerificationArpcMethod1 cryptogramVerificationArpcMethod1 = new CryptogramVerificationArpcMethod1();

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
                if (context.testExpression("AuthResponseCode", targetDepth)) {
                    context.nextToken();
                    cryptogramVerificationArpcMethod1.setAuthResponseCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return cryptogramVerificationArpcMethod1;
    }

    private static CryptogramVerificationArpcMethod1JsonUnmarshaller instance;

    public static CryptogramVerificationArpcMethod1JsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CryptogramVerificationArpcMethod1JsonUnmarshaller();
        return instance;
    }
}
