/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.apigateway.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateApiKeyResult JSON Unmarshaller
 */
public class CreateApiKeyResultJsonUnmarshaller implements
        Unmarshaller<CreateApiKeyResult, JsonUnmarshallerContext> {

    public CreateApiKeyResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        CreateApiKeyResult createApiKeyResult = new CreateApiKeyResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    createApiKeyResult.setId(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    createApiKeyResult.setName(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    createApiKeyResult.setDescription(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("enabled", targetDepth)) {
                    context.nextToken();
                    createApiKeyResult.setEnabled(BooleanJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("stageKeys", targetDepth)) {
                    context.nextToken();
                    createApiKeyResult
                            .setStageKeys(new ListUnmarshaller<String>(
                                    StringJsonUnmarshaller.getInstance())
                                    .unmarshall(context));
                }
                if (context.testExpression("createdDate", targetDepth)) {
                    context.nextToken();
                    createApiKeyResult.setCreatedDate(DateJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDate", targetDepth)) {
                    context.nextToken();
                    createApiKeyResult.setLastUpdatedDate(DateJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createApiKeyResult;
    }

    private static CreateApiKeyResultJsonUnmarshaller instance;

    public static CreateApiKeyResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateApiKeyResultJsonUnmarshaller();
        return instance;
    }
}
