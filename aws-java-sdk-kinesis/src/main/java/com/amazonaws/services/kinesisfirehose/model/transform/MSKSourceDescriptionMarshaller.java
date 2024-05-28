/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MSKSourceDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MSKSourceDescriptionMarshaller {

    private static final MarshallingInfo<String> MSKCLUSTERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MSKClusterARN").build();
    private static final MarshallingInfo<String> TOPICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TopicName").build();
    private static final MarshallingInfo<StructuredPojo> AUTHENTICATIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthenticationConfiguration").build();
    private static final MarshallingInfo<java.util.Date> DELIVERYSTARTTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeliveryStartTimestamp").timestampFormat("unixTimestamp").build();

    private static final MSKSourceDescriptionMarshaller instance = new MSKSourceDescriptionMarshaller();

    public static MSKSourceDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MSKSourceDescription mSKSourceDescription, ProtocolMarshaller protocolMarshaller) {

        if (mSKSourceDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mSKSourceDescription.getMSKClusterARN(), MSKCLUSTERARN_BINDING);
            protocolMarshaller.marshall(mSKSourceDescription.getTopicName(), TOPICNAME_BINDING);
            protocolMarshaller.marshall(mSKSourceDescription.getAuthenticationConfiguration(), AUTHENTICATIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(mSKSourceDescription.getDeliveryStartTimestamp(), DELIVERYSTARTTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
