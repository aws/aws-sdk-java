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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SessionSpecification JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionSpecificationJsonUnmarshaller implements Unmarshaller<SessionSpecification, JsonUnmarshallerContext> {

    public SessionSpecification unmarshall(JsonUnmarshallerContext context) throws Exception {
        SessionSpecification sessionSpecification = new SessionSpecification();

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
                if (context.testExpression("botAliasId", targetDepth)) {
                    context.nextToken();
                    sessionSpecification.setBotAliasId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    context.nextToken();
                    sessionSpecification.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localeId", targetDepth)) {
                    context.nextToken();
                    sessionSpecification.setLocaleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("channel", targetDepth)) {
                    context.nextToken();
                    sessionSpecification.setChannel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sessionId", targetDepth)) {
                    context.nextToken();
                    sessionSpecification.setSessionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("conversationStartTime", targetDepth)) {
                    context.nextToken();
                    sessionSpecification.setConversationStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("conversationEndTime", targetDepth)) {
                    context.nextToken();
                    sessionSpecification.setConversationEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("conversationDurationSeconds", targetDepth)) {
                    context.nextToken();
                    sessionSpecification.setConversationDurationSeconds(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("conversationEndState", targetDepth)) {
                    context.nextToken();
                    sessionSpecification.setConversationEndState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mode", targetDepth)) {
                    context.nextToken();
                    sessionSpecification.setMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("numberOfTurns", targetDepth)) {
                    context.nextToken();
                    sessionSpecification.setNumberOfTurns(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("invokedIntentSamples", targetDepth)) {
                    context.nextToken();
                    sessionSpecification.setInvokedIntentSamples(new ListUnmarshaller<InvokedIntentSample>(InvokedIntentSampleJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("originatingRequestId", targetDepth)) {
                    context.nextToken();
                    sessionSpecification.setOriginatingRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return sessionSpecification;
    }

    private static SessionSpecificationJsonUnmarshaller instance;

    public static SessionSpecificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SessionSpecificationJsonUnmarshaller();
        return instance;
    }
}
