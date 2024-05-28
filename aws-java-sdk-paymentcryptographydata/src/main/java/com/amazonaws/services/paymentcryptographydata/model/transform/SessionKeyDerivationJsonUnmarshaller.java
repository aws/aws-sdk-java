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
 * SessionKeyDerivation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionKeyDerivationJsonUnmarshaller implements Unmarshaller<SessionKeyDerivation, JsonUnmarshallerContext> {

    public SessionKeyDerivation unmarshall(JsonUnmarshallerContext context) throws Exception {
        SessionKeyDerivation sessionKeyDerivation = new SessionKeyDerivation();

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
                if (context.testExpression("Amex", targetDepth)) {
                    context.nextToken();
                    sessionKeyDerivation.setAmex(SessionKeyAmexJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Emv2000", targetDepth)) {
                    context.nextToken();
                    sessionKeyDerivation.setEmv2000(SessionKeyEmv2000JsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EmvCommon", targetDepth)) {
                    context.nextToken();
                    sessionKeyDerivation.setEmvCommon(SessionKeyEmvCommonJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Mastercard", targetDepth)) {
                    context.nextToken();
                    sessionKeyDerivation.setMastercard(SessionKeyMastercardJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Visa", targetDepth)) {
                    context.nextToken();
                    sessionKeyDerivation.setVisa(SessionKeyVisaJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return sessionKeyDerivation;
    }

    private static SessionKeyDerivationJsonUnmarshaller instance;

    public static SessionKeyDerivationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SessionKeyDerivationJsonUnmarshaller();
        return instance;
    }
}
