/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.protocol.json.*;

/**
 * ExtendedS3DestinationConfigurationMarshaller
 */
public class ExtendedS3DestinationConfigurationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ExtendedS3DestinationConfiguration extendedS3DestinationConfiguration, StructuredJsonGenerator jsonGenerator) {

        if (extendedS3DestinationConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (extendedS3DestinationConfiguration.getRoleARN() != null) {
                jsonGenerator.writeFieldName("RoleARN").writeValue(extendedS3DestinationConfiguration.getRoleARN());
            }
            if (extendedS3DestinationConfiguration.getBucketARN() != null) {
                jsonGenerator.writeFieldName("BucketARN").writeValue(extendedS3DestinationConfiguration.getBucketARN());
            }
            if (extendedS3DestinationConfiguration.getPrefix() != null) {
                jsonGenerator.writeFieldName("Prefix").writeValue(extendedS3DestinationConfiguration.getPrefix());
            }
            if (extendedS3DestinationConfiguration.getBufferingHints() != null) {
                jsonGenerator.writeFieldName("BufferingHints");
                BufferingHintsJsonMarshaller.getInstance().marshall(extendedS3DestinationConfiguration.getBufferingHints(), jsonGenerator);
            }
            if (extendedS3DestinationConfiguration.getCompressionFormat() != null) {
                jsonGenerator.writeFieldName("CompressionFormat").writeValue(extendedS3DestinationConfiguration.getCompressionFormat());
            }
            if (extendedS3DestinationConfiguration.getEncryptionConfiguration() != null) {
                jsonGenerator.writeFieldName("EncryptionConfiguration");
                EncryptionConfigurationJsonMarshaller.getInstance().marshall(extendedS3DestinationConfiguration.getEncryptionConfiguration(), jsonGenerator);
            }
            if (extendedS3DestinationConfiguration.getCloudWatchLoggingOptions() != null) {
                jsonGenerator.writeFieldName("CloudWatchLoggingOptions");
                CloudWatchLoggingOptionsJsonMarshaller.getInstance().marshall(extendedS3DestinationConfiguration.getCloudWatchLoggingOptions(), jsonGenerator);
            }
            if (extendedS3DestinationConfiguration.getProcessingConfiguration() != null) {
                jsonGenerator.writeFieldName("ProcessingConfiguration");
                ProcessingConfigurationJsonMarshaller.getInstance().marshall(extendedS3DestinationConfiguration.getProcessingConfiguration(), jsonGenerator);
            }
            if (extendedS3DestinationConfiguration.getS3BackupMode() != null) {
                jsonGenerator.writeFieldName("S3BackupMode").writeValue(extendedS3DestinationConfiguration.getS3BackupMode());
            }
            if (extendedS3DestinationConfiguration.getS3BackupConfiguration() != null) {
                jsonGenerator.writeFieldName("S3BackupConfiguration");
                S3DestinationConfigurationJsonMarshaller.getInstance().marshall(extendedS3DestinationConfiguration.getS3BackupConfiguration(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ExtendedS3DestinationConfigurationJsonMarshaller instance;

    public static ExtendedS3DestinationConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExtendedS3DestinationConfigurationJsonMarshaller();
        return instance;
    }

}
