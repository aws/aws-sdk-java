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
 * SnowflakeDestinationDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnowflakeDestinationDescriptionJsonUnmarshaller implements Unmarshaller<SnowflakeDestinationDescription, JsonUnmarshallerContext> {

    public SnowflakeDestinationDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        SnowflakeDestinationDescription snowflakeDestinationDescription = new SnowflakeDestinationDescription();

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
                    snowflakeDestinationDescription.setAccountUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("User", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationDescription.setUser(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Database", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationDescription.setDatabase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Schema", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationDescription.setSchema(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Table", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationDescription.setTable(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnowflakeRoleConfiguration", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationDescription.setSnowflakeRoleConfiguration(SnowflakeRoleConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DataLoadingOption", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationDescription.setDataLoadingOption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MetaDataColumnName", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationDescription.setMetaDataColumnName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContentColumnName", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationDescription.setContentColumnName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnowflakeVpcConfiguration", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationDescription.setSnowflakeVpcConfiguration(SnowflakeVpcConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CloudWatchLoggingOptions", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationDescription.setCloudWatchLoggingOptions(CloudWatchLoggingOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProcessingConfiguration", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationDescription.setProcessingConfiguration(ProcessingConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleARN", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationDescription.setRoleARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RetryOptions", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationDescription.setRetryOptions(SnowflakeRetryOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3BackupMode", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationDescription.setS3BackupMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3DestinationDescription", targetDepth)) {
                    context.nextToken();
                    snowflakeDestinationDescription.setS3DestinationDescription(S3DestinationDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return snowflakeDestinationDescription;
    }

    private static SnowflakeDestinationDescriptionJsonUnmarshaller instance;

    public static SnowflakeDestinationDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SnowflakeDestinationDescriptionJsonUnmarshaller();
        return instance;
    }
}
