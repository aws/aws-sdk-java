/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpointemail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DomainDeliverabilityTrackingOptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DomainDeliverabilityTrackingOptionMarshaller {

    private static final MarshallingInfo<String> DOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Domain").build();
    private static final MarshallingInfo<java.util.Date> SUBSCRIPTIONSTARTDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubscriptionStartDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> INBOXPLACEMENTTRACKINGOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InboxPlacementTrackingOption").build();

    private static final DomainDeliverabilityTrackingOptionMarshaller instance = new DomainDeliverabilityTrackingOptionMarshaller();

    public static DomainDeliverabilityTrackingOptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DomainDeliverabilityTrackingOption domainDeliverabilityTrackingOption, ProtocolMarshaller protocolMarshaller) {

        if (domainDeliverabilityTrackingOption == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(domainDeliverabilityTrackingOption.getDomain(), DOMAIN_BINDING);
            protocolMarshaller.marshall(domainDeliverabilityTrackingOption.getSubscriptionStartDate(), SUBSCRIPTIONSTARTDATE_BINDING);
            protocolMarshaller.marshall(domainDeliverabilityTrackingOption.getInboxPlacementTrackingOption(), INBOXPLACEMENTTRACKINGOPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
