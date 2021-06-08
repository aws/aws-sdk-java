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
 * MySQLSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MySQLSettingsJsonUnmarshaller implements Unmarshaller<MySQLSettings, JsonUnmarshallerContext> {

    public MySQLSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        MySQLSettings mySQLSettings = new MySQLSettings();

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
                    mySQLSettings.setAfterConnectScript(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CleanSourceMetadataOnMismatch", targetDepth)) {
                    context.nextToken();
                    mySQLSettings.setCleanSourceMetadataOnMismatch(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseName", targetDepth)) {
                    context.nextToken();
                    mySQLSettings.setDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventsPollInterval", targetDepth)) {
                    context.nextToken();
                    mySQLSettings.setEventsPollInterval(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TargetDbType", targetDepth)) {
                    context.nextToken();
                    mySQLSettings.setTargetDbType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxFileSize", targetDepth)) {
                    context.nextToken();
                    mySQLSettings.setMaxFileSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ParallelLoadThreads", targetDepth)) {
                    context.nextToken();
                    mySQLSettings.setParallelLoadThreads(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Password", targetDepth)) {
                    context.nextToken();
                    mySQLSettings.setPassword(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Port", targetDepth)) {
                    context.nextToken();
                    mySQLSettings.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ServerName", targetDepth)) {
                    context.nextToken();
                    mySQLSettings.setServerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerTimezone", targetDepth)) {
                    context.nextToken();
                    mySQLSettings.setServerTimezone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Username", targetDepth)) {
                    context.nextToken();
                    mySQLSettings.setUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretsManagerAccessRoleArn", targetDepth)) {
                    context.nextToken();
                    mySQLSettings.setSecretsManagerAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretsManagerSecretId", targetDepth)) {
                    context.nextToken();
                    mySQLSettings.setSecretsManagerSecretId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return mySQLSettings;
    }

    private static MySQLSettingsJsonUnmarshaller instance;

    public static MySQLSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MySQLSettingsJsonUnmarshaller();
        return instance;
    }
}
