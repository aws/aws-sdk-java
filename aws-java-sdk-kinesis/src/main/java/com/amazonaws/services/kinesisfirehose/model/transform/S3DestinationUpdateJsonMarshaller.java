/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.kinesisfirehose.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * S3DestinationUpdateMarshaller
 */
public class S3DestinationUpdateJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(S3DestinationUpdate s3DestinationUpdate,
            JSONWriter jsonWriter) {
        if (s3DestinationUpdate == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (s3DestinationUpdate.getRoleARN() != null) {
                jsonWriter.key("RoleARN").value(
                        s3DestinationUpdate.getRoleARN());
            }

            if (s3DestinationUpdate.getBucketARN() != null) {
                jsonWriter.key("BucketARN").value(
                        s3DestinationUpdate.getBucketARN());
            }

            if (s3DestinationUpdate.getPrefix() != null) {
                jsonWriter.key("Prefix").value(s3DestinationUpdate.getPrefix());
            }

            if (s3DestinationUpdate.getBufferingHints() != null) {
                jsonWriter.key("BufferingHints");
                BufferingHintsJsonMarshaller.getInstance().marshall(
                        s3DestinationUpdate.getBufferingHints(), jsonWriter);
            }

            if (s3DestinationUpdate.getCompressionFormat() != null) {
                jsonWriter.key("CompressionFormat").value(
                        s3DestinationUpdate.getCompressionFormat());
            }

            if (s3DestinationUpdate.getEncryptionConfiguration() != null) {
                jsonWriter.key("EncryptionConfiguration");
                EncryptionConfigurationJsonMarshaller.getInstance().marshall(
                        s3DestinationUpdate.getEncryptionConfiguration(),
                        jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static S3DestinationUpdateJsonMarshaller instance;

    public static S3DestinationUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3DestinationUpdateJsonMarshaller();
        return instance;
    }

}
