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
package com.amazonaws.services.athena.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.athena.model.*;
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
                if (context.testExpression("SessionId", targetDepth)) {
                    context.nextToken();
                    getSessionResult.setSessionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    getSessionResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WorkGroup", targetDepth)) {
                    context.nextToken();
                    getSessionResult.setWorkGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    context.nextToken();
                    getSessionResult.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineConfiguration", targetDepth)) {
                    context.nextToken();
                    getSessionResult.setEngineConfiguration(EngineConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NotebookVersion", targetDepth)) {
                    context.nextToken();
                    getSessionResult.setNotebookVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SessionConfiguration", targetDepth)) {
                    context.nextToken();
                    getSessionResult.setSessionConfiguration(SessionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    getSessionResult.setStatus(SessionStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Statistics", targetDepth)) {
                    context.nextToken();
                    getSessionResult.setStatistics(SessionStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
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
