/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisfirehose.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeliveryStreamDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeliveryStreamDescriptionMarshaller {

    private static final MarshallingInfo<String> DELIVERYSTREAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeliveryStreamName").build();
    private static final MarshallingInfo<String> DELIVERYSTREAMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeliveryStreamARN").build();
    private static final MarshallingInfo<String> DELIVERYSTREAMSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeliveryStreamStatus").build();
    private static final MarshallingInfo<StructuredPojo> DELIVERYSTREAMENCRYPTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeliveryStreamEncryptionConfiguration").build();
    private static final MarshallingInfo<String> DELIVERYSTREAMTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeliveryStreamType").build();
    private static final MarshallingInfo<String> VERSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VersionId").build();
    private static final MarshallingInfo<java.util.Date> CREATETIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATETIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdateTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> SOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Source").build();
    private static final MarshallingInfo<List> DESTINATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Destinations").build();
    private static final MarshallingInfo<Boolean> HASMOREDESTINATIONS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HasMoreDestinations").build();

    private static final DeliveryStreamDescriptionMarshaller instance = new DeliveryStreamDescriptionMarshaller();

    public static DeliveryStreamDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeliveryStreamDescription deliveryStreamDescription, ProtocolMarshaller protocolMarshaller) {

        if (deliveryStreamDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deliveryStreamDescription.getDeliveryStreamName(), DELIVERYSTREAMNAME_BINDING);
            protocolMarshaller.marshall(deliveryStreamDescription.getDeliveryStreamARN(), DELIVERYSTREAMARN_BINDING);
            protocolMarshaller.marshall(deliveryStreamDescription.getDeliveryStreamStatus(), DELIVERYSTREAMSTATUS_BINDING);
            protocolMarshaller.marshall(deliveryStreamDescription.getDeliveryStreamEncryptionConfiguration(), DELIVERYSTREAMENCRYPTIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(deliveryStreamDescription.getDeliveryStreamType(), DELIVERYSTREAMTYPE_BINDING);
            protocolMarshaller.marshall(deliveryStreamDescription.getVersionId(), VERSIONID_BINDING);
            protocolMarshaller.marshall(deliveryStreamDescription.getCreateTimestamp(), CREATETIMESTAMP_BINDING);
            protocolMarshaller.marshall(deliveryStreamDescription.getLastUpdateTimestamp(), LASTUPDATETIMESTAMP_BINDING);
            protocolMarshaller.marshall(deliveryStreamDescription.getSource(), SOURCE_BINDING);
            protocolMarshaller.marshall(deliveryStreamDescription.getDestinations(), DESTINATIONS_BINDING);
            protocolMarshaller.marshall(deliveryStreamDescription.getHasMoreDestinations(), HASMOREDESTINATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
