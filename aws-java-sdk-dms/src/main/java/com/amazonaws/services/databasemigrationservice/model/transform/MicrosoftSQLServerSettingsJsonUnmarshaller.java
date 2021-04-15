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
 * MicrosoftSQLServerSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MicrosoftSQLServerSettingsJsonUnmarshaller implements Unmarshaller<MicrosoftSQLServerSettings, JsonUnmarshallerContext> {

    public MicrosoftSQLServerSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        MicrosoftSQLServerSettings microsoftSQLServerSettings = new MicrosoftSQLServerSettings();

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
                if (context.testExpression("Port", targetDepth)) {
                    context.nextToken();
                    microsoftSQLServerSettings.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("BcpPacketSize", targetDepth)) {
                    context.nextToken();
                    microsoftSQLServerSettings.setBcpPacketSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseName", targetDepth)) {
                    context.nextToken();
                    microsoftSQLServerSettings.setDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ControlTablesFileGroup", targetDepth)) {
                    context.nextToken();
                    microsoftSQLServerSettings.setControlTablesFileGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Password", targetDepth)) {
                    context.nextToken();
                    microsoftSQLServerSettings.setPassword(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuerySingleAlwaysOnNode", targetDepth)) {
                    context.nextToken();
                    microsoftSQLServerSettings.setQuerySingleAlwaysOnNode(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ReadBackupOnly", targetDepth)) {
                    context.nextToken();
                    microsoftSQLServerSettings.setReadBackupOnly(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SafeguardPolicy", targetDepth)) {
                    context.nextToken();
                    microsoftSQLServerSettings.setSafeguardPolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerName", targetDepth)) {
                    context.nextToken();
                    microsoftSQLServerSettings.setServerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Username", targetDepth)) {
                    context.nextToken();
                    microsoftSQLServerSettings.setUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UseBcpFullLoad", targetDepth)) {
                    context.nextToken();
                    microsoftSQLServerSettings.setUseBcpFullLoad(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("UseThirdPartyBackupDevice", targetDepth)) {
                    context.nextToken();
                    microsoftSQLServerSettings.setUseThirdPartyBackupDevice(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SecretsManagerAccessRoleArn", targetDepth)) {
                    context.nextToken();
                    microsoftSQLServerSettings.setSecretsManagerAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretsManagerSecretId", targetDepth)) {
                    context.nextToken();
                    microsoftSQLServerSettings.setSecretsManagerSecretId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return microsoftSQLServerSettings;
    }

    private static MicrosoftSQLServerSettingsJsonUnmarshaller instance;

    public static MicrosoftSQLServerSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MicrosoftSQLServerSettingsJsonUnmarshaller();
        return instance;
    }
}
