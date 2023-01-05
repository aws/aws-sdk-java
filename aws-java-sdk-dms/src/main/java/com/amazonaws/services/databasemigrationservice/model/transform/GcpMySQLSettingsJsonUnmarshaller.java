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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GcpMySQLSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GcpMySQLSettingsJsonUnmarshaller implements Unmarshaller<GcpMySQLSettings, JsonUnmarshallerContext> {

    public GcpMySQLSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        GcpMySQLSettings gcpMySQLSettings = new GcpMySQLSettings();

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
                    gcpMySQLSettings.setAfterConnectScript(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CleanSourceMetadataOnMismatch", targetDepth)) {
                    context.nextToken();
                    gcpMySQLSettings.setCleanSourceMetadataOnMismatch(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseName", targetDepth)) {
                    context.nextToken();
                    gcpMySQLSettings.setDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventsPollInterval", targetDepth)) {
                    context.nextToken();
                    gcpMySQLSettings.setEventsPollInterval(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TargetDbType", targetDepth)) {
                    context.nextToken();
                    gcpMySQLSettings.setTargetDbType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxFileSize", targetDepth)) {
                    context.nextToken();
                    gcpMySQLSettings.setMaxFileSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ParallelLoadThreads", targetDepth)) {
                    context.nextToken();
                    gcpMySQLSettings.setParallelLoadThreads(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Password", targetDepth)) {
                    context.nextToken();
                    gcpMySQLSettings.setPassword(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Port", targetDepth)) {
                    context.nextToken();
                    gcpMySQLSettings.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ServerName", targetDepth)) {
                    context.nextToken();
                    gcpMySQLSettings.setServerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerTimezone", targetDepth)) {
                    context.nextToken();
                    gcpMySQLSettings.setServerTimezone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Username", targetDepth)) {
                    context.nextToken();
                    gcpMySQLSettings.setUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretsManagerAccessRoleArn", targetDepth)) {
                    context.nextToken();
                    gcpMySQLSettings.setSecretsManagerAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretsManagerSecretId", targetDepth)) {
                    context.nextToken();
                    gcpMySQLSettings.setSecretsManagerSecretId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return gcpMySQLSettings;
    }

    private static GcpMySQLSettingsJsonUnmarshaller instance;

    public static GcpMySQLSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GcpMySQLSettingsJsonUnmarshaller();
        return instance;
    }
}
