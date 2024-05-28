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
package com.amazonaws.services.neptunedata.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.neptunedata.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetEngineStatusResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEngineStatusResultJsonUnmarshaller implements Unmarshaller<GetEngineStatusResult, JsonUnmarshallerContext> {

    public GetEngineStatusResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetEngineStatusResult getEngineStatusResult = new GetEngineStatusResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getEngineStatusResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getEngineStatusResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    getEngineStatusResult.setStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dbEngineVersion", targetDepth)) {
                    context.nextToken();
                    getEngineStatusResult.setDbEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("role", targetDepth)) {
                    context.nextToken();
                    getEngineStatusResult.setRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dfeQueryEngine", targetDepth)) {
                    context.nextToken();
                    getEngineStatusResult.setDfeQueryEngine(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("gremlin", targetDepth)) {
                    context.nextToken();
                    getEngineStatusResult.setGremlin(QueryLanguageVersionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sparql", targetDepth)) {
                    context.nextToken();
                    getEngineStatusResult.setSparql(QueryLanguageVersionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("opencypher", targetDepth)) {
                    context.nextToken();
                    getEngineStatusResult.setOpencypher(QueryLanguageVersionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("labMode", targetDepth)) {
                    context.nextToken();
                    getEngineStatusResult.setLabMode(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("rollingBackTrxCount", targetDepth)) {
                    context.nextToken();
                    getEngineStatusResult.setRollingBackTrxCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("rollingBackTrxEarliestStartTime", targetDepth)) {
                    context.nextToken();
                    getEngineStatusResult.setRollingBackTrxEarliestStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("settings", targetDepth)) {
                    context.nextToken();
                    getEngineStatusResult.setSettings(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getEngineStatusResult;
    }

    private static GetEngineStatusResultJsonUnmarshaller instance;

    public static GetEngineStatusResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetEngineStatusResultJsonUnmarshaller();
        return instance;
    }
}
