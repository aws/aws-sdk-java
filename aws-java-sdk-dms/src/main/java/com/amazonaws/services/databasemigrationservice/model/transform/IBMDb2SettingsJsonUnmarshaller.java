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
 * IBMDb2Settings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IBMDb2SettingsJsonUnmarshaller implements Unmarshaller<IBMDb2Settings, JsonUnmarshallerContext> {

    public IBMDb2Settings unmarshall(JsonUnmarshallerContext context) throws Exception {
        IBMDb2Settings iBMDb2Settings = new IBMDb2Settings();

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
                if (context.testExpression("DatabaseName", targetDepth)) {
                    context.nextToken();
                    iBMDb2Settings.setDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Password", targetDepth)) {
                    context.nextToken();
                    iBMDb2Settings.setPassword(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Port", targetDepth)) {
                    context.nextToken();
                    iBMDb2Settings.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ServerName", targetDepth)) {
                    context.nextToken();
                    iBMDb2Settings.setServerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SetDataCaptureChanges", targetDepth)) {
                    context.nextToken();
                    iBMDb2Settings.setSetDataCaptureChanges(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CurrentLsn", targetDepth)) {
                    context.nextToken();
                    iBMDb2Settings.setCurrentLsn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxKBytesPerRead", targetDepth)) {
                    context.nextToken();
                    iBMDb2Settings.setMaxKBytesPerRead(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Username", targetDepth)) {
                    context.nextToken();
                    iBMDb2Settings.setUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretsManagerAccessRoleArn", targetDepth)) {
                    context.nextToken();
                    iBMDb2Settings.setSecretsManagerAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretsManagerSecretId", targetDepth)) {
                    context.nextToken();
                    iBMDb2Settings.setSecretsManagerSecretId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return iBMDb2Settings;
    }

    private static IBMDb2SettingsJsonUnmarshaller instance;

    public static IBMDb2SettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new IBMDb2SettingsJsonUnmarshaller();
        return instance;
    }
}
