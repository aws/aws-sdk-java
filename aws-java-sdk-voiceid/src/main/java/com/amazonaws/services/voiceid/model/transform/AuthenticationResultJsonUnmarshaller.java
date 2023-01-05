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
package com.amazonaws.services.voiceid.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.voiceid.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AuthenticationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthenticationResultJsonUnmarshaller implements Unmarshaller<AuthenticationResult, JsonUnmarshallerContext> {

    public AuthenticationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        AuthenticationResult authenticationResult = new AuthenticationResult();

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
                if (context.testExpression("AudioAggregationEndedAt", targetDepth)) {
                    context.nextToken();
                    authenticationResult.setAudioAggregationEndedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AudioAggregationStartedAt", targetDepth)) {
                    context.nextToken();
                    authenticationResult.setAudioAggregationStartedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AuthenticationResultId", targetDepth)) {
                    context.nextToken();
                    authenticationResult.setAuthenticationResultId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Configuration", targetDepth)) {
                    context.nextToken();
                    authenticationResult.setConfiguration(AuthenticationConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CustomerSpeakerId", targetDepth)) {
                    context.nextToken();
                    authenticationResult.setCustomerSpeakerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Decision", targetDepth)) {
                    context.nextToken();
                    authenticationResult.setDecision(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GeneratedSpeakerId", targetDepth)) {
                    context.nextToken();
                    authenticationResult.setGeneratedSpeakerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Score", targetDepth)) {
                    context.nextToken();
                    authenticationResult.setScore(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return authenticationResult;
    }

    private static AuthenticationResultJsonUnmarshaller instance;

    public static AuthenticationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AuthenticationResultJsonUnmarshaller();
        return instance;
    }
}
