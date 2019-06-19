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
 * HostKeyAttributes JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HostKeyAttributesJsonUnmarshaller implements Unmarshaller<HostKeyAttributes, JsonUnmarshallerContext> {

    public HostKeyAttributes unmarshall(JsonUnmarshallerContext context) throws Exception {
        HostKeyAttributes hostKeyAttributes = new HostKeyAttributes();

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
                if (context.testExpression("algorithm", targetDepth)) {
                    context.nextToken();
                    hostKeyAttributes.setAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("publicKey", targetDepth)) {
                    context.nextToken();
                    hostKeyAttributes.setPublicKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("witnessedAt", targetDepth)) {
                    context.nextToken();
                    hostKeyAttributes.setWitnessedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("fingerprintSHA1", targetDepth)) {
                    context.nextToken();
                    hostKeyAttributes.setFingerprintSHA1(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fingerprintSHA256", targetDepth)) {
                    context.nextToken();
                    hostKeyAttributes.setFingerprintSHA256(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("notValidBefore", targetDepth)) {
                    context.nextToken();
                    hostKeyAttributes.setNotValidBefore(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("notValidAfter", targetDepth)) {
                    context.nextToken();
                    hostKeyAttributes.setNotValidAfter(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return hostKeyAttributes;
    }

    private static HostKeyAttributesJsonUnmarshaller instance;

    public static HostKeyAttributesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HostKeyAttributesJsonUnmarshaller();
        return instance;
    }
}
