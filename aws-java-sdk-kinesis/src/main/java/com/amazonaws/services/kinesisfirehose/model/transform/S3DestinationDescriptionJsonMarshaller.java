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
 * S3DestinationDescriptionMarshaller
 */
public class S3DestinationDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(S3DestinationDescription s3DestinationDescription, StructuredJsonGenerator jsonGenerator) {

        if (s3DestinationDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (s3DestinationDescription.getRoleARN() != null) {
                jsonGenerator.writeFieldName("RoleARN").writeValue(s3DestinationDescription.getRoleARN());
            }
            if (s3DestinationDescription.getBucketARN() != null) {
                jsonGenerator.writeFieldName("BucketARN").writeValue(s3DestinationDescription.getBucketARN());
            }
            if (s3DestinationDescription.getPrefix() != null) {
                jsonGenerator.writeFieldName("Prefix").writeValue(s3DestinationDescription.getPrefix());
            }
            if (s3DestinationDescription.getBufferingHints() != null) {
                jsonGenerator.writeFieldName("BufferingHints");
                BufferingHintsJsonMarshaller.getInstance().marshall(s3DestinationDescription.getBufferingHints(), jsonGenerator);
            }
            if (s3DestinationDescription.getCompressionFormat() != null) {
                jsonGenerator.writeFieldName("CompressionFormat").writeValue(s3DestinationDescription.getCompressionFormat());
            }
            if (s3DestinationDescription.getEncryptionConfiguration() != null) {
                jsonGenerator.writeFieldName("EncryptionConfiguration");
                EncryptionConfigurationJsonMarshaller.getInstance().marshall(s3DestinationDescription.getEncryptionConfiguration(), jsonGenerator);
            }
            if (s3DestinationDescription.getCloudWatchLoggingOptions() != null) {
                jsonGenerator.writeFieldName("CloudWatchLoggingOptions");
                CloudWatchLoggingOptionsJsonMarshaller.getInstance().marshall(s3DestinationDescription.getCloudWatchLoggingOptions(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static S3DestinationDescriptionJsonMarshaller instance;

    public static S3DestinationDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3DestinationDescriptionJsonMarshaller();
        return instance;
    }

}
