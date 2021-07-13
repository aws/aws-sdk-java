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
package com.amazonaws.services.lexmodelbuilding.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelbuilding.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StartMigrationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMigrationResultJsonUnmarshaller implements Unmarshaller<StartMigrationResult, JsonUnmarshallerContext> {

    public StartMigrationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartMigrationResult startMigrationResult = new StartMigrationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return startMigrationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("v1BotName", targetDepth)) {
                    context.nextToken();
                    startMigrationResult.setV1BotName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("v1BotVersion", targetDepth)) {
                    context.nextToken();
                    startMigrationResult.setV1BotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("v1BotLocale", targetDepth)) {
                    context.nextToken();
                    startMigrationResult.setV1BotLocale(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("v2BotId", targetDepth)) {
                    context.nextToken();
                    startMigrationResult.setV2BotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("v2BotRole", targetDepth)) {
                    context.nextToken();
                    startMigrationResult.setV2BotRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("migrationId", targetDepth)) {
                    context.nextToken();
                    startMigrationResult.setMigrationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("migrationStrategy", targetDepth)) {
                    context.nextToken();
                    startMigrationResult.setMigrationStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("migrationTimestamp", targetDepth)) {
                    context.nextToken();
                    startMigrationResult.setMigrationTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return startMigrationResult;
    }

    private static StartMigrationResultJsonUnmarshaller instance;

    public static StartMigrationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartMigrationResultJsonUnmarshaller();
        return instance;
    }
}
