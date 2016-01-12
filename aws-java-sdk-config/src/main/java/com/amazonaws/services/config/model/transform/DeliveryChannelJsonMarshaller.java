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

package com.amazonaws.services.config.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * DeliveryChannelMarshaller
 */
public class DeliveryChannelJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(DeliveryChannel deliveryChannel, JSONWriter jsonWriter) {
        if (deliveryChannel == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (deliveryChannel.getName() != null) {
                jsonWriter.key("name").value(deliveryChannel.getName());
            }

            if (deliveryChannel.getS3BucketName() != null) {
                jsonWriter.key("s3BucketName").value(
                        deliveryChannel.getS3BucketName());
            }

            if (deliveryChannel.getS3KeyPrefix() != null) {
                jsonWriter.key("s3KeyPrefix").value(
                        deliveryChannel.getS3KeyPrefix());
            }

            if (deliveryChannel.getSnsTopicARN() != null) {
                jsonWriter.key("snsTopicARN").value(
                        deliveryChannel.getSnsTopicARN());
            }

            if (deliveryChannel.getConfigSnapshotDeliveryProperties() != null) {
                jsonWriter.key("configSnapshotDeliveryProperties");
                ConfigSnapshotDeliveryPropertiesJsonMarshaller
                        .getInstance()
                        .marshall(
                                deliveryChannel
                                        .getConfigSnapshotDeliveryProperties(),
                                jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DeliveryChannelJsonMarshaller instance;

    public static DeliveryChannelJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeliveryChannelJsonMarshaller();
        return instance;
    }

}
