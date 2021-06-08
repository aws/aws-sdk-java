/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplifybackend.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.amplifybackend.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetBackendAPIResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBackendAPIResultJsonUnmarshaller implements Unmarshaller<GetBackendAPIResult, JsonUnmarshallerContext> {

    public GetBackendAPIResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetBackendAPIResult getBackendAPIResult = new GetBackendAPIResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getBackendAPIResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("appId", targetDepth)) {
                    context.nextToken();
                    getBackendAPIResult.setAppId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("backendEnvironmentName", targetDepth)) {
                    context.nextToken();
                    getBackendAPIResult.setBackendEnvironmentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("error", targetDepth)) {
                    context.nextToken();
                    getBackendAPIResult.setError(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceConfig", targetDepth)) {
                    context.nextToken();
                    getBackendAPIResult.setResourceConfig(BackendAPIResourceConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("resourceName", targetDepth)) {
                    context.nextToken();
                    getBackendAPIResult.setResourceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getBackendAPIResult;
    }

    private static GetBackendAPIResultJsonUnmarshaller instance;

    public static GetBackendAPIResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetBackendAPIResultJsonUnmarshaller();
        return instance;
    }
}
