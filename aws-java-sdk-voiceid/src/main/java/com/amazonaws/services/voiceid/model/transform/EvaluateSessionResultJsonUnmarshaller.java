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
 * EvaluateSessionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluateSessionResultJsonUnmarshaller implements Unmarshaller<EvaluateSessionResult, JsonUnmarshallerContext> {

    public EvaluateSessionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        EvaluateSessionResult evaluateSessionResult = new EvaluateSessionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return evaluateSessionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("AuthenticationResult", targetDepth)) {
                    context.nextToken();
                    evaluateSessionResult.setAuthenticationResult(AuthenticationResultJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DomainId", targetDepth)) {
                    context.nextToken();
                    evaluateSessionResult.setDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FraudDetectionResult", targetDepth)) {
                    context.nextToken();
                    evaluateSessionResult.setFraudDetectionResult(FraudDetectionResultJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SessionId", targetDepth)) {
                    context.nextToken();
                    evaluateSessionResult.setSessionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SessionName", targetDepth)) {
                    context.nextToken();
                    evaluateSessionResult.setSessionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StreamingStatus", targetDepth)) {
                    context.nextToken();
                    evaluateSessionResult.setStreamingStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return evaluateSessionResult;
    }

    private static EvaluateSessionResultJsonUnmarshaller instance;

    public static EvaluateSessionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EvaluateSessionResultJsonUnmarshaller();
        return instance;
    }
}
