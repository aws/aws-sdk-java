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
 * GetMigrationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMigrationResultJsonUnmarshaller implements Unmarshaller<GetMigrationResult, JsonUnmarshallerContext> {

    public GetMigrationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetMigrationResult getMigrationResult = new GetMigrationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getMigrationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("migrationId", targetDepth)) {
                    context.nextToken();
                    getMigrationResult.setMigrationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("v1BotName", targetDepth)) {
                    context.nextToken();
                    getMigrationResult.setV1BotName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("v1BotVersion", targetDepth)) {
                    context.nextToken();
                    getMigrationResult.setV1BotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("v1BotLocale", targetDepth)) {
                    context.nextToken();
                    getMigrationResult.setV1BotLocale(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("v2BotId", targetDepth)) {
                    context.nextToken();
                    getMigrationResult.setV2BotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("v2BotRole", targetDepth)) {
                    context.nextToken();
                    getMigrationResult.setV2BotRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("migrationStatus", targetDepth)) {
                    context.nextToken();
                    getMigrationResult.setMigrationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("migrationStrategy", targetDepth)) {
                    context.nextToken();
                    getMigrationResult.setMigrationStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("migrationTimestamp", targetDepth)) {
                    context.nextToken();
                    getMigrationResult.setMigrationTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("alerts", targetDepth)) {
                    context.nextToken();
                    getMigrationResult.setAlerts(new ListUnmarshaller<MigrationAlert>(MigrationAlertJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getMigrationResult;
    }

    private static GetMigrationResultJsonUnmarshaller instance;

    public static GetMigrationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMigrationResultJsonUnmarshaller();
        return instance;
    }
}
