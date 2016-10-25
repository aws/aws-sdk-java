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
 * S3DestinationConfigurationMarshaller
 */
public class S3DestinationConfigurationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(S3DestinationConfiguration s3DestinationConfiguration, StructuredJsonGenerator jsonGenerator) {

        if (s3DestinationConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (s3DestinationConfiguration.getRoleARN() != null) {
                jsonGenerator.writeFieldName("RoleARN").writeValue(s3DestinationConfiguration.getRoleARN());
            }
            if (s3DestinationConfiguration.getBucketARN() != null) {
                jsonGenerator.writeFieldName("BucketARN").writeValue(s3DestinationConfiguration.getBucketARN());
            }
            if (s3DestinationConfiguration.getPrefix() != null) {
                jsonGenerator.writeFieldName("Prefix").writeValue(s3DestinationConfiguration.getPrefix());
            }
            if (s3DestinationConfiguration.getBufferingHints() != null) {
                jsonGenerator.writeFieldName("BufferingHints");
                BufferingHintsJsonMarshaller.getInstance().marshall(s3DestinationConfiguration.getBufferingHints(), jsonGenerator);
            }
            if (s3DestinationConfiguration.getCompressionFormat() != null) {
                jsonGenerator.writeFieldName("CompressionFormat").writeValue(s3DestinationConfiguration.getCompressionFormat());
            }
            if (s3DestinationConfiguration.getEncryptionConfiguration() != null) {
                jsonGenerator.writeFieldName("EncryptionConfiguration");
                EncryptionConfigurationJsonMarshaller.getInstance().marshall(s3DestinationConfiguration.getEncryptionConfiguration(), jsonGenerator);
            }
            if (s3DestinationConfiguration.getCloudWatchLoggingOptions() != null) {
                jsonGenerator.writeFieldName("CloudWatchLoggingOptions");
                CloudWatchLoggingOptionsJsonMarshaller.getInstance().marshall(s3DestinationConfiguration.getCloudWatchLoggingOptions(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static S3DestinationConfigurationJsonMarshaller instance;

    public static S3DestinationConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3DestinationConfigurationJsonMarshaller();
        return instance;
    }

}
