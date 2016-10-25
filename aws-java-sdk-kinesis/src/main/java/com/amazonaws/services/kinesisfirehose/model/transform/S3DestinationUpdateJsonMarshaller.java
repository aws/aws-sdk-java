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
 * S3DestinationUpdateMarshaller
 */
public class S3DestinationUpdateJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(S3DestinationUpdate s3DestinationUpdate, StructuredJsonGenerator jsonGenerator) {

        if (s3DestinationUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (s3DestinationUpdate.getRoleARN() != null) {
                jsonGenerator.writeFieldName("RoleARN").writeValue(s3DestinationUpdate.getRoleARN());
            }
            if (s3DestinationUpdate.getBucketARN() != null) {
                jsonGenerator.writeFieldName("BucketARN").writeValue(s3DestinationUpdate.getBucketARN());
            }
            if (s3DestinationUpdate.getPrefix() != null) {
                jsonGenerator.writeFieldName("Prefix").writeValue(s3DestinationUpdate.getPrefix());
            }
            if (s3DestinationUpdate.getBufferingHints() != null) {
                jsonGenerator.writeFieldName("BufferingHints");
                BufferingHintsJsonMarshaller.getInstance().marshall(s3DestinationUpdate.getBufferingHints(), jsonGenerator);
            }
            if (s3DestinationUpdate.getCompressionFormat() != null) {
                jsonGenerator.writeFieldName("CompressionFormat").writeValue(s3DestinationUpdate.getCompressionFormat());
            }
            if (s3DestinationUpdate.getEncryptionConfiguration() != null) {
                jsonGenerator.writeFieldName("EncryptionConfiguration");
                EncryptionConfigurationJsonMarshaller.getInstance().marshall(s3DestinationUpdate.getEncryptionConfiguration(), jsonGenerator);
            }
            if (s3DestinationUpdate.getCloudWatchLoggingOptions() != null) {
                jsonGenerator.writeFieldName("CloudWatchLoggingOptions");
                CloudWatchLoggingOptionsJsonMarshaller.getInstance().marshall(s3DestinationUpdate.getCloudWatchLoggingOptions(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static S3DestinationUpdateJsonMarshaller instance;

    public static S3DestinationUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3DestinationUpdateJsonMarshaller();
        return instance;
    }

}
