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
 * DataProviderSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataProviderSettingsJsonUnmarshaller implements Unmarshaller<DataProviderSettings, JsonUnmarshallerContext> {

    public DataProviderSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        DataProviderSettings dataProviderSettings = new DataProviderSettings();

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
                if (context.testExpression("RedshiftSettings", targetDepth)) {
                    context.nextToken();
                    dataProviderSettings.setRedshiftSettings(RedshiftDataProviderSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PostgreSqlSettings", targetDepth)) {
                    context.nextToken();
                    dataProviderSettings.setPostgreSqlSettings(PostgreSqlDataProviderSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MySqlSettings", targetDepth)) {
                    context.nextToken();
                    dataProviderSettings.setMySqlSettings(MySqlDataProviderSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OracleSettings", targetDepth)) {
                    context.nextToken();
                    dataProviderSettings.setOracleSettings(OracleDataProviderSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MicrosoftSqlServerSettings", targetDepth)) {
                    context.nextToken();
                    dataProviderSettings
                            .setMicrosoftSqlServerSettings(MicrosoftSqlServerDataProviderSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DocDbSettings", targetDepth)) {
                    context.nextToken();
                    dataProviderSettings.setDocDbSettings(DocDbDataProviderSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MariaDbSettings", targetDepth)) {
                    context.nextToken();
                    dataProviderSettings.setMariaDbSettings(MariaDbDataProviderSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MongoDbSettings", targetDepth)) {
                    context.nextToken();
                    dataProviderSettings.setMongoDbSettings(MongoDbDataProviderSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dataProviderSettings;
    }

    private static DataProviderSettingsJsonUnmarshaller instance;

    public static DataProviderSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataProviderSettingsJsonUnmarshaller();
        return instance;
    }
}
