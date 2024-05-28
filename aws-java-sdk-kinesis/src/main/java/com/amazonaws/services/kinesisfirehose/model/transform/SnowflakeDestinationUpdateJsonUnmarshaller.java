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
package com.amazonaws.services.kinesisfirehose.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SnowflakeDestinationUpdate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnowflakeDestinationUpdateJsonUnmarshaller implements Unmarshaller<SnowflakeDestinationUpdate, JsonUnmarshallerContext> {

    public SnowflakeDestinationUpdate unmarshall(JsonUnmarshallerContext context) throws Exception {
        SnowflakeDestinationUpdate snowflakeDestinationUpdate = new SnowflakeDestinationUpdate();

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
                if (context.testExpression("AccountUrl", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationUpdate.setAccountUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrivateKey", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationUpdate.setPrivateKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyPassphrase", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationUpdate.setKeyPassphrase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("User", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationUpdate.setUser(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Database", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationUpdate.setDatabase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Schema", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationUpdate.setSchema(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Table", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationUpdate.setTable(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnowflakeRoleConfiguration", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationUpdate.setSnowflakeRoleConfiguration(SnowflakeRoleConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DataLoadingOption", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationUpdate.setDataLoadingOption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MetaDataColumnName", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationUpdate.setMetaDataColumnName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContentColumnName", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationUpdate.setContentColumnName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CloudWatchLoggingOptions", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationUpdate.setCloudWatchLoggingOptions(CloudWatchLoggingOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProcessingConfiguration", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationUpdate.setProcessingConfiguration(ProcessingConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleARN", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationUpdate.setRoleARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RetryOptions", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationUpdate.setRetryOptions(SnowflakeRetryOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3BackupMode", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationUpdate.setS3BackupMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3Update", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationUpdate.setS3Update(S3DestinationUpdateJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return snowflakeDestinationUpdate;
    }

    private static SnowflakeDestinationUpdateJsonUnmarshaller instance;

    public static SnowflakeDestinationUpdateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SnowflakeDestinationUpdateJsonUnmarshaller();
        return instance;
    }
}
