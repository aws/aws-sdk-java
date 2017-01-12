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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisfirehose.model.*;

import com.amazonaws.protocol.json.*;

/**
 * ExtendedS3DestinationDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExtendedS3DestinationDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ExtendedS3DestinationDescription extendedS3DestinationDescription, StructuredJsonGenerator jsonGenerator) {

        if (extendedS3DestinationDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (extendedS3DestinationDescription.getRoleARN() != null) {
                jsonGenerator.writeFieldName("RoleARN").writeValue(extendedS3DestinationDescription.getRoleARN());
            }
            if (extendedS3DestinationDescription.getBucketARN() != null) {
                jsonGenerator.writeFieldName("BucketARN").writeValue(extendedS3DestinationDescription.getBucketARN());
            }
            if (extendedS3DestinationDescription.getPrefix() != null) {
                jsonGenerator.writeFieldName("Prefix").writeValue(extendedS3DestinationDescription.getPrefix());
            }
            if (extendedS3DestinationDescription.getBufferingHints() != null) {
                jsonGenerator.writeFieldName("BufferingHints");
                BufferingHintsJsonMarshaller.getInstance().marshall(extendedS3DestinationDescription.getBufferingHints(), jsonGenerator);
            }
            if (extendedS3DestinationDescription.getCompressionFormat() != null) {
                jsonGenerator.writeFieldName("CompressionFormat").writeValue(extendedS3DestinationDescription.getCompressionFormat());
            }
            if (extendedS3DestinationDescription.getEncryptionConfiguration() != null) {
                jsonGenerator.writeFieldName("EncryptionConfiguration");
                EncryptionConfigurationJsonMarshaller.getInstance().marshall(extendedS3DestinationDescription.getEncryptionConfiguration(), jsonGenerator);
            }
            if (extendedS3DestinationDescription.getCloudWatchLoggingOptions() != null) {
                jsonGenerator.writeFieldName("CloudWatchLoggingOptions");
                CloudWatchLoggingOptionsJsonMarshaller.getInstance().marshall(extendedS3DestinationDescription.getCloudWatchLoggingOptions(), jsonGenerator);
            }
            if (extendedS3DestinationDescription.getProcessingConfiguration() != null) {
                jsonGenerator.writeFieldName("ProcessingConfiguration");
                ProcessingConfigurationJsonMarshaller.getInstance().marshall(extendedS3DestinationDescription.getProcessingConfiguration(), jsonGenerator);
            }
            if (extendedS3DestinationDescription.getS3BackupMode() != null) {
                jsonGenerator.writeFieldName("S3BackupMode").writeValue(extendedS3DestinationDescription.getS3BackupMode());
            }
            if (extendedS3DestinationDescription.getS3BackupDescription() != null) {
                jsonGenerator.writeFieldName("S3BackupDescription");
                S3DestinationDescriptionJsonMarshaller.getInstance().marshall(extendedS3DestinationDescription.getS3BackupDescription(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ExtendedS3DestinationDescriptionJsonMarshaller instance;

    public static ExtendedS3DestinationDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExtendedS3DestinationDescriptionJsonMarshaller();
        return instance;
    }

}
