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
 * GetSessionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSessionResultJsonUnmarshaller implements Unmarshaller<GetSessionResult, JsonUnmarshallerContext> {

    public GetSessionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetSessionResult getSessionResult = new GetSessionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getSessionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("endedAt", targetDepth)) {
                    context.nextToken();
                    getSessionResult.setEndedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("fleetId", targetDepth)) {
                    context.nextToken();
                    getSessionResult.setFleetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hostProperties", targetDepth)) {
                    context.nextToken();
                    getSessionResult.setHostProperties(HostPropertiesResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lifecycleStatus", targetDepth)) {
                    context.nextToken();
                    getSessionResult.setLifecycleStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("log", targetDepth)) {
                    context.nextToken();
                    getSessionResult.setLog(LogConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sessionId", targetDepth)) {
                    context.nextToken();
                    getSessionResult.setSessionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startedAt", targetDepth)) {
                    context.nextToken();
                    getSessionResult.setStartedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("targetLifecycleStatus", targetDepth)) {
                    context.nextToken();
                    getSessionResult.setTargetLifecycleStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    getSessionResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("updatedBy", targetDepth)) {
                    context.nextToken();
                    getSessionResult.setUpdatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workerId", targetDepth)) {
                    context.nextToken();
                    getSessionResult.setWorkerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workerLog", targetDepth)) {
                    context.nextToken();
                    getSessionResult.setWorkerLog(LogConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getSessionResult;
    }

    private static GetSessionResultJsonUnmarshaller instance;

    public static GetSessionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetSessionResultJsonUnmarshaller();
        return instance;
    }
}
