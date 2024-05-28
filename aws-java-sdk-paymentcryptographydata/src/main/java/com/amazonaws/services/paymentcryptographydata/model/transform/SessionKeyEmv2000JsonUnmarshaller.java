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
 * SessionKeyEmv2000 JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionKeyEmv2000JsonUnmarshaller implements Unmarshaller<SessionKeyEmv2000, JsonUnmarshallerContext> {

    public SessionKeyEmv2000 unmarshall(JsonUnmarshallerContext context) throws Exception {
        SessionKeyEmv2000 sessionKeyEmv2000 = new SessionKeyEmv2000();

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
                if (context.testExpression("ApplicationTransactionCounter", targetDepth)) {
                    context.nextToken();
                    sessionKeyEmv2000.setApplicationTransactionCounter(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PanSequenceNumber", targetDepth)) {
                    context.nextToken();
                    sessionKeyEmv2000.setPanSequenceNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrimaryAccountNumber", targetDepth)) {
                    context.nextToken();
                    sessionKeyEmv2000.setPrimaryAccountNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return sessionKeyEmv2000;
    }

    private static SessionKeyEmv2000JsonUnmarshaller instance;

    public static SessionKeyEmv2000JsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SessionKeyEmv2000JsonUnmarshaller();
        return instance;
    }
}
