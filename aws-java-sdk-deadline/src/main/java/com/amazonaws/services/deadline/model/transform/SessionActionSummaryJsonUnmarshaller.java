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
package com.amazonaws.services.deadline.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.deadline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SessionActionSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionActionSummaryJsonUnmarshaller implements Unmarshaller<SessionActionSummary, JsonUnmarshallerContext> {

    public SessionActionSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        SessionActionSummary sessionActionSummary = new SessionActionSummary();

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
                if (context.testExpression("definition", targetDepth)) {
                    context.nextToken();
                    sessionActionSummary.setDefinition(SessionActionDefinitionSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("endedAt", targetDepth)) {
                    context.nextToken();
                    sessionActionSummary.setEndedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("progressPercent", targetDepth)) {
                    context.nextToken();
                    sessionActionSummary.setProgressPercent(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("sessionActionId", targetDepth)) {
                    context.nextToken();
                    sessionActionSummary.setSessionActionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startedAt", targetDepth)) {
                    context.nextToken();
                    sessionActionSummary.setStartedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    sessionActionSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workerUpdatedAt", targetDepth)) {
                    context.nextToken();
                    sessionActionSummary.setWorkerUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return sessionActionSummary;
    }

    private static SessionActionSummaryJsonUnmarshaller instance;

    public static SessionActionSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SessionActionSummaryJsonUnmarshaller();
        return instance;
    }
}
