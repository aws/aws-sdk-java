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
 * UpdateSenderIdResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSenderIdResultJsonUnmarshaller implements Unmarshaller<UpdateSenderIdResult, JsonUnmarshallerContext> {

    public UpdateSenderIdResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateSenderIdResult updateSenderIdResult = new UpdateSenderIdResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateSenderIdResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("SenderIdArn", targetDepth)) {
                    context.nextToken();
                    updateSenderIdResult.setSenderIdArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SenderId", targetDepth)) {
                    context.nextToken();
                    updateSenderIdResult.setSenderId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsoCountryCode", targetDepth)) {
                    context.nextToken();
                    updateSenderIdResult.setIsoCountryCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MessageTypes", targetDepth)) {
                    context.nextToken();
                    updateSenderIdResult.setMessageTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("MonthlyLeasingPrice", targetDepth)) {
                    context.nextToken();
                    updateSenderIdResult.setMonthlyLeasingPrice(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeletionProtectionEnabled", targetDepth)) {
                    context.nextToken();
                    updateSenderIdResult.setDeletionProtectionEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Registered", targetDepth)) {
                    context.nextToken();
                    updateSenderIdResult.setRegistered(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RegistrationId", targetDepth)) {
                    context.nextToken();
                    updateSenderIdResult.setRegistrationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateSenderIdResult;
    }

    private static UpdateSenderIdResultJsonUnmarshaller instance;

    public static UpdateSenderIdResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateSenderIdResultJsonUnmarshaller();
        return instance;
    }
}
