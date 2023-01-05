/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SendOTPMessageRequestParameters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendOTPMessageRequestParametersJsonUnmarshaller implements Unmarshaller<SendOTPMessageRequestParameters, JsonUnmarshallerContext> {

    public SendOTPMessageRequestParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        SendOTPMessageRequestParameters sendOTPMessageRequestParameters = new SendOTPMessageRequestParameters();

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
                if (context.testExpression("AllowedAttempts", targetDepth)) {
                    context.nextToken();
                    sendOTPMessageRequestParameters.setAllowedAttempts(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("BrandName", targetDepth)) {
                    context.nextToken();
                    sendOTPMessageRequestParameters.setBrandName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Channel", targetDepth)) {
                    context.nextToken();
                    sendOTPMessageRequestParameters.setChannel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CodeLength", targetDepth)) {
                    context.nextToken();
                    sendOTPMessageRequestParameters.setCodeLength(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DestinationIdentity", targetDepth)) {
                    context.nextToken();
                    sendOTPMessageRequestParameters.setDestinationIdentity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EntityId", targetDepth)) {
                    context.nextToken();
                    sendOTPMessageRequestParameters.setEntityId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Language", targetDepth)) {
                    context.nextToken();
                    sendOTPMessageRequestParameters.setLanguage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OriginationIdentity", targetDepth)) {
                    context.nextToken();
                    sendOTPMessageRequestParameters.setOriginationIdentity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReferenceId", targetDepth)) {
                    context.nextToken();
                    sendOTPMessageRequestParameters.setReferenceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TemplateId", targetDepth)) {
                    context.nextToken();
                    sendOTPMessageRequestParameters.setTemplateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ValidityPeriod", targetDepth)) {
                    context.nextToken();
                    sendOTPMessageRequestParameters.setValidityPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return sendOTPMessageRequestParameters;
    }

    private static SendOTPMessageRequestParametersJsonUnmarshaller instance;

    public static SendOTPMessageRequestParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SendOTPMessageRequestParametersJsonUnmarshaller();
        return instance;
    }
}
