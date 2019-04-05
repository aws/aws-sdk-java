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
package com.amazonaws.services.pinpointemail.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpointemail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateConfigurationSetRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateConfigurationSetRequestMarshaller {

    private static final MarshallingInfo<String> CONFIGURATIONSETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigurationSetName").build();
    private static final MarshallingInfo<StructuredPojo> TRACKINGOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrackingOptions").build();
    private static final MarshallingInfo<StructuredPojo> DELIVERYOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeliveryOptions").build();
    private static final MarshallingInfo<StructuredPojo> REPUTATIONOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReputationOptions").build();
    private static final MarshallingInfo<StructuredPojo> SENDINGOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SendingOptions").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateConfigurationSetRequestMarshaller instance = new CreateConfigurationSetRequestMarshaller();

    public static CreateConfigurationSetRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateConfigurationSetRequest createConfigurationSetRequest, ProtocolMarshaller protocolMarshaller) {

        if (createConfigurationSetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createConfigurationSetRequest.getConfigurationSetName(), CONFIGURATIONSETNAME_BINDING);
            protocolMarshaller.marshall(createConfigurationSetRequest.getTrackingOptions(), TRACKINGOPTIONS_BINDING);
            protocolMarshaller.marshall(createConfigurationSetRequest.getDeliveryOptions(), DELIVERYOPTIONS_BINDING);
            protocolMarshaller.marshall(createConfigurationSetRequest.getReputationOptions(), REPUTATIONOPTIONS_BINDING);
            protocolMarshaller.marshall(createConfigurationSetRequest.getSendingOptions(), SENDINGOPTIONS_BINDING);
            protocolMarshaller.marshall(createConfigurationSetRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
