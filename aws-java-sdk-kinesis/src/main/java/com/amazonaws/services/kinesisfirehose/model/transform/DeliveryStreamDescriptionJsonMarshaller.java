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
 * DeliveryStreamDescriptionMarshaller
 */
public class DeliveryStreamDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(DeliveryStreamDescription deliveryStreamDescription, StructuredJsonGenerator jsonGenerator) {

        if (deliveryStreamDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (deliveryStreamDescription.getDeliveryStreamName() != null) {
                jsonGenerator.writeFieldName("DeliveryStreamName").writeValue(deliveryStreamDescription.getDeliveryStreamName());
            }
            if (deliveryStreamDescription.getDeliveryStreamARN() != null) {
                jsonGenerator.writeFieldName("DeliveryStreamARN").writeValue(deliveryStreamDescription.getDeliveryStreamARN());
            }
            if (deliveryStreamDescription.getDeliveryStreamStatus() != null) {
                jsonGenerator.writeFieldName("DeliveryStreamStatus").writeValue(deliveryStreamDescription.getDeliveryStreamStatus());
            }
            if (deliveryStreamDescription.getVersionId() != null) {
                jsonGenerator.writeFieldName("VersionId").writeValue(deliveryStreamDescription.getVersionId());
            }
            if (deliveryStreamDescription.getCreateTimestamp() != null) {
                jsonGenerator.writeFieldName("CreateTimestamp").writeValue(deliveryStreamDescription.getCreateTimestamp());
            }
            if (deliveryStreamDescription.getLastUpdateTimestamp() != null) {
                jsonGenerator.writeFieldName("LastUpdateTimestamp").writeValue(deliveryStreamDescription.getLastUpdateTimestamp());
            }

            java.util.List<DestinationDescription> destinationsList = deliveryStreamDescription.getDestinations();
            if (destinationsList != null) {
                jsonGenerator.writeFieldName("Destinations");
                jsonGenerator.writeStartArray();
                for (DestinationDescription destinationsListValue : destinationsList) {
                    if (destinationsListValue != null) {

                        DestinationDescriptionJsonMarshaller.getInstance().marshall(destinationsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (deliveryStreamDescription.getHasMoreDestinations() != null) {
                jsonGenerator.writeFieldName("HasMoreDestinations").writeValue(deliveryStreamDescription.getHasMoreDestinations());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DeliveryStreamDescriptionJsonMarshaller instance;

    public static DeliveryStreamDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeliveryStreamDescriptionJsonMarshaller();
        return instance;
    }

}
