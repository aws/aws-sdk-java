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
package com.amazonaws.services.config.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DeliveryChannelMarshaller
 */
public class DeliveryChannelJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(DeliveryChannel deliveryChannel, StructuredJsonGenerator jsonGenerator) {

        if (deliveryChannel == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (deliveryChannel.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(deliveryChannel.getName());
            }
            if (deliveryChannel.getS3BucketName() != null) {
                jsonGenerator.writeFieldName("s3BucketName").writeValue(deliveryChannel.getS3BucketName());
            }
            if (deliveryChannel.getS3KeyPrefix() != null) {
                jsonGenerator.writeFieldName("s3KeyPrefix").writeValue(deliveryChannel.getS3KeyPrefix());
            }
            if (deliveryChannel.getSnsTopicARN() != null) {
                jsonGenerator.writeFieldName("snsTopicARN").writeValue(deliveryChannel.getSnsTopicARN());
            }
            if (deliveryChannel.getConfigSnapshotDeliveryProperties() != null) {
                jsonGenerator.writeFieldName("configSnapshotDeliveryProperties");
                ConfigSnapshotDeliveryPropertiesJsonMarshaller.getInstance().marshall(deliveryChannel.getConfigSnapshotDeliveryProperties(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DeliveryChannelJsonMarshaller instance;

    public static DeliveryChannelJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeliveryChannelJsonMarshaller();
        return instance;
    }

}
