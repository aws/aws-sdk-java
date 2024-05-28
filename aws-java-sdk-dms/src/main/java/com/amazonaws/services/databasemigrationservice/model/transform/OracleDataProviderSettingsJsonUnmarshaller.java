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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * OracleDataProviderSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OracleDataProviderSettingsJsonUnmarshaller implements Unmarshaller<OracleDataProviderSettings, JsonUnmarshallerContext> {

    public OracleDataProviderSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        OracleDataProviderSettings oracleDataProviderSettings = new OracleDataProviderSettings();

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
                if (context.testExpression("ServerName", targetDepth)) {
                    context.nextToken();
                    oracleDataProviderSettings.setServerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Port", targetDepth)) {
                    context.nextToken();
                    oracleDataProviderSettings.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseName", targetDepth)) {
                    context.nextToken();
                    oracleDataProviderSettings.setDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SslMode", targetDepth)) {
                    context.nextToken();
                    oracleDataProviderSettings.setSslMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CertificateArn", targetDepth)) {
                    context.nextToken();
                    oracleDataProviderSettings.setCertificateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AsmServer", targetDepth)) {
                    context.nextToken();
                    oracleDataProviderSettings.setAsmServer(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretsManagerOracleAsmSecretId", targetDepth)) {
                    context.nextToken();
                    oracleDataProviderSettings.setSecretsManagerOracleAsmSecretId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretsManagerOracleAsmAccessRoleArn", targetDepth)) {
                    context.nextToken();
                    oracleDataProviderSettings.setSecretsManagerOracleAsmAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretsManagerSecurityDbEncryptionSecretId", targetDepth)) {
                    context.nextToken();
                    oracleDataProviderSettings.setSecretsManagerSecurityDbEncryptionSecretId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretsManagerSecurityDbEncryptionAccessRoleArn", targetDepth)) {
                    context.nextToken();
                    oracleDataProviderSettings.setSecretsManagerSecurityDbEncryptionAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return oracleDataProviderSettings;
    }

    private static OracleDataProviderSettingsJsonUnmarshaller instance;

    public static OracleDataProviderSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OracleDataProviderSettingsJsonUnmarshaller();
        return instance;
    }
}
