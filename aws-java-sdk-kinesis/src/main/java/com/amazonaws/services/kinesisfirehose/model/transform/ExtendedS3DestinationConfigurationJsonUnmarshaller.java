/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ExtendedS3DestinationConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExtendedS3DestinationConfigurationJsonUnmarshaller implements Unmarshaller<ExtendedS3DestinationConfiguration, JsonUnmarshallerContext> {

    public ExtendedS3DestinationConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        ExtendedS3DestinationConfiguration extendedS3DestinationConfiguration = new ExtendedS3DestinationConfiguration();

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
                if (context.testExpression("RoleARN", targetDepth)) {
                    context.nextToken();
                    extendedS3DestinationConfiguration.setRoleARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BucketARN", targetDepth)) {
                    context.nextToken();
                    extendedS3DestinationConfiguration.setBucketARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Prefix", targetDepth)) {
                    context.nextToken();
                    extendedS3DestinationConfiguration.setPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ErrorOutputPrefix", targetDepth)) {
                    context.nextToken();
                    extendedS3DestinationConfiguration.setErrorOutputPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BufferingHints", targetDepth)) {
                    context.nextToken();
                    extendedS3DestinationConfiguration.setBufferingHints(BufferingHintsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CompressionFormat", targetDepth)) {
                    context.nextToken();
                    extendedS3DestinationConfiguration.setCompressionFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EncryptionConfiguration", targetDepth)) {
                    context.nextToken();
                    extendedS3DestinationConfiguration.setEncryptionConfiguration(EncryptionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CloudWatchLoggingOptions", targetDepth)) {
                    context.nextToken();
                    extendedS3DestinationConfiguration.setCloudWatchLoggingOptions(CloudWatchLoggingOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProcessingConfiguration", targetDepth)) {
                    context.nextToken();
                    extendedS3DestinationConfiguration.setProcessingConfiguration(ProcessingConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3BackupMode", targetDepth)) {
                    context.nextToken();
                    extendedS3DestinationConfiguration.setS3BackupMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3BackupConfiguration", targetDepth)) {
                    context.nextToken();
                    extendedS3DestinationConfiguration.setS3BackupConfiguration(S3DestinationConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DataFormatConversionConfiguration", targetDepth)) {
                    context.nextToken();
                    extendedS3DestinationConfiguration.setDataFormatConversionConfiguration(DataFormatConversionConfigurationJsonUnmarshaller.getInstance()
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

        return extendedS3DestinationConfiguration;
    }

    private static ExtendedS3DestinationConfigurationJsonUnmarshaller instance;

    public static ExtendedS3DestinationConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExtendedS3DestinationConfigurationJsonUnmarshaller();
        return instance;
    }
}
