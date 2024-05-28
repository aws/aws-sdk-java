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
package com.amazonaws.services.simpleemailv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleemailv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MessageInsightsFiltersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MessageInsightsFiltersMarshaller {

    private static final MarshallingInfo<List> FROMEMAILADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FromEmailAddress").build();
    private static final MarshallingInfo<List> DESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Destination").build();
    private static final MarshallingInfo<List> SUBJECT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Subject").build();
    private static final MarshallingInfo<List> ISP_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Isp").build();
    private static final MarshallingInfo<List> LASTDELIVERYEVENT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastDeliveryEvent").build();
    private static final MarshallingInfo<List> LASTENGAGEMENTEVENT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastEngagementEvent").build();

    private static final MessageInsightsFiltersMarshaller instance = new MessageInsightsFiltersMarshaller();

    public static MessageInsightsFiltersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MessageInsightsFilters messageInsightsFilters, ProtocolMarshaller protocolMarshaller) {

        if (messageInsightsFilters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(messageInsightsFilters.getFromEmailAddress(), FROMEMAILADDRESS_BINDING);
            protocolMarshaller.marshall(messageInsightsFilters.getDestination(), DESTINATION_BINDING);
            protocolMarshaller.marshall(messageInsightsFilters.getSubject(), SUBJECT_BINDING);
            protocolMarshaller.marshall(messageInsightsFilters.getIsp(), ISP_BINDING);
            protocolMarshaller.marshall(messageInsightsFilters.getLastDeliveryEvent(), LASTDELIVERYEVENT_BINDING);
            protocolMarshaller.marshall(messageInsightsFilters.getLastEngagementEvent(), LASTENGAGEMENTEVENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
