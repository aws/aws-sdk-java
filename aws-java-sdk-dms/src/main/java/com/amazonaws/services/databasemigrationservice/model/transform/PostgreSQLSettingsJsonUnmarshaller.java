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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PostgreSQLSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostgreSQLSettingsJsonUnmarshaller implements Unmarshaller<PostgreSQLSettings, JsonUnmarshallerContext> {

    public PostgreSQLSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostgreSQLSettings postgreSQLSettings = new PostgreSQLSettings();

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
                if (context.testExpression("AfterConnectScript", targetDepth)) {
                    context.nextToken();
                    postgreSQLSettings.setAfterConnectScript(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CaptureDdls", targetDepth)) {
                    context.nextToken();
                    postgreSQLSettings.setCaptureDdls(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MaxFileSize", targetDepth)) {
                    context.nextToken();
                    postgreSQLSettings.setMaxFileSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseName", targetDepth)) {
                    context.nextToken();
                    postgreSQLSettings.setDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DdlArtifactsSchema", targetDepth)) {
                    context.nextToken();
                    postgreSQLSettings.setDdlArtifactsSchema(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecuteTimeout", targetDepth)) {
                    context.nextToken();
                    postgreSQLSettings.setExecuteTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("FailTasksOnLobTruncation", targetDepth)) {
                    context.nextToken();
                    postgreSQLSettings.setFailTasksOnLobTruncation(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("HeartbeatEnable", targetDepth)) {
                    context.nextToken();
                    postgreSQLSettings.setHeartbeatEnable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("HeartbeatSchema", targetDepth)) {
                    context.nextToken();
                    postgreSQLSettings.setHeartbeatSchema(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HeartbeatFrequency", targetDepth)) {
                    context.nextToken();
                    postgreSQLSettings.setHeartbeatFrequency(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Password", targetDepth)) {
                    context.nextToken();
                    postgreSQLSettings.setPassword(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Port", targetDepth)) {
                    context.nextToken();
                    postgreSQLSettings.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ServerName", targetDepth)) {
                    context.nextToken();
                    postgreSQLSettings.setServerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Username", targetDepth)) {
                    context.nextToken();
                    postgreSQLSettings.setUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SlotName", targetDepth)) {
                    context.nextToken();
                    postgreSQLSettings.setSlotName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PluginName", targetDepth)) {
                    context.nextToken();
                    postgreSQLSettings.setPluginName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretsManagerAccessRoleArn", targetDepth)) {
                    context.nextToken();
                    postgreSQLSettings.setSecretsManagerAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretsManagerSecretId", targetDepth)) {
                    context.nextToken();
                    postgreSQLSettings.setSecretsManagerSecretId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return postgreSQLSettings;
    }

    private static PostgreSQLSettingsJsonUnmarshaller instance;

    public static PostgreSQLSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostgreSQLSettingsJsonUnmarshaller();
        return instance;
    }
}
