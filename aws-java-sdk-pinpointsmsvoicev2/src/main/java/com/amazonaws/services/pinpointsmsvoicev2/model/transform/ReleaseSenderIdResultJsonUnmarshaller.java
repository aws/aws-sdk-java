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
package com.amazonaws.services.pinpointsmsvoicev2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpointsmsvoicev2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReleaseSenderIdResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReleaseSenderIdResultJsonUnmarshaller implements Unmarshaller<ReleaseSenderIdResult, JsonUnmarshallerContext> {

    public ReleaseSenderIdResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReleaseSenderIdResult releaseSenderIdResult = new ReleaseSenderIdResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return releaseSenderIdResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("SenderIdArn", targetDepth)) {
                    context.nextToken();
                    releaseSenderIdResult.setSenderIdArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SenderId", targetDepth)) {
                    context.nextToken();
                    releaseSenderIdResult.setSenderId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsoCountryCode", targetDepth)) {
                    context.nextToken();
                    releaseSenderIdResult.setIsoCountryCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MessageTypes", targetDepth)) {
                    context.nextToken();
                    releaseSenderIdResult.setMessageTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("MonthlyLeasingPrice", targetDepth)) {
                    context.nextToken();
                    releaseSenderIdResult.setMonthlyLeasingPrice(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Registered", targetDepth)) {
                    context.nextToken();
                    releaseSenderIdResult.setRegistered(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RegistrationId", targetDepth)) {
                    context.nextToken();
                    releaseSenderIdResult.setRegistrationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return releaseSenderIdResult;
    }

    private static ReleaseSenderIdResultJsonUnmarshaller instance;

    public static ReleaseSenderIdResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReleaseSenderIdResultJsonUnmarshaller();
        return instance;
    }
}
