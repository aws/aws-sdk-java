/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ExtendedS3DestinationUpdateMarshaller
 */
public class ExtendedS3DestinationUpdateJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ExtendedS3DestinationUpdate extendedS3DestinationUpdate, StructuredJsonGenerator jsonGenerator) {

        if (extendedS3DestinationUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (extendedS3DestinationUpdate.getRoleARN() != null) {
                jsonGenerator.writeFieldName("RoleARN").writeValue(extendedS3DestinationUpdate.getRoleARN());
            }
            if (extendedS3DestinationUpdate.getBucketARN() != null) {
                jsonGenerator.writeFieldName("BucketARN").writeValue(extendedS3DestinationUpdate.getBucketARN());
            }
            if (extendedS3DestinationUpdate.getPrefix() != null) {
                jsonGenerator.writeFieldName("Prefix").writeValue(extendedS3DestinationUpdate.getPrefix());
            }
            if (extendedS3DestinationUpdate.getBufferingHints() != null) {
                jsonGenerator.writeFieldName("BufferingHints");
                BufferingHintsJsonMarshaller.getInstance().marshall(extendedS3DestinationUpdate.getBufferingHints(), jsonGenerator);
            }
            if (extendedS3DestinationUpdate.getCompressionFormat() != null) {
                jsonGenerator.writeFieldName("CompressionFormat").writeValue(extendedS3DestinationUpdate.getCompressionFormat());
            }
            if (extendedS3DestinationUpdate.getEncryptionConfiguration() != null) {
                jsonGenerator.writeFieldName("EncryptionConfiguration");
                EncryptionConfigurationJsonMarshaller.getInstance().marshall(extendedS3DestinationUpdate.getEncryptionConfiguration(), jsonGenerator);
            }
            if (extendedS3DestinationUpdate.getCloudWatchLoggingOptions() != null) {
                jsonGenerator.writeFieldName("CloudWatchLoggingOptions");
                CloudWatchLoggingOptionsJsonMarshaller.getInstance().marshall(extendedS3DestinationUpdate.getCloudWatchLoggingOptions(), jsonGenerator);
            }
            if (extendedS3DestinationUpdate.getProcessingConfiguration() != null) {
                jsonGenerator.writeFieldName("ProcessingConfiguration");
                ProcessingConfigurationJsonMarshaller.getInstance().marshall(extendedS3DestinationUpdate.getProcessingConfiguration(), jsonGenerator);
            }
            if (extendedS3DestinationUpdate.getS3BackupMode() != null) {
                jsonGenerator.writeFieldName("S3BackupMode").writeValue(extendedS3DestinationUpdate.getS3BackupMode());
            }
            if (extendedS3DestinationUpdate.getS3BackupUpdate() != null) {
                jsonGenerator.writeFieldName("S3BackupUpdate");
                S3DestinationUpdateJsonMarshaller.getInstance().marshall(extendedS3DestinationUpdate.getS3BackupUpdate(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ExtendedS3DestinationUpdateJsonMarshaller instance;

    public static ExtendedS3DestinationUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExtendedS3DestinationUpdateJsonMarshaller();
        return instance;
    }

}
