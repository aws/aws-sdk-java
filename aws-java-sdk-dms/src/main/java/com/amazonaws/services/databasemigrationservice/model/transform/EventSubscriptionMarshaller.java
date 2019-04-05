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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EventSubscriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EventSubscriptionMarshaller {

    private static final MarshallingInfo<String> CUSTOMERAWSID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomerAwsId").build();
    private static final MarshallingInfo<String> CUSTSUBSCRIPTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustSubscriptionId").build();
    private static final MarshallingInfo<String> SNSTOPICARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnsTopicArn").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> SUBSCRIPTIONCREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubscriptionCreationTime").build();
    private static final MarshallingInfo<String> SOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceType").build();
    private static final MarshallingInfo<List> SOURCEIDSLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SourceIdsList").build();
    private static final MarshallingInfo<List> EVENTCATEGORIESLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventCategoriesList").build();
    private static final MarshallingInfo<Boolean> ENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Enabled").build();

    private static final EventSubscriptionMarshaller instance = new EventSubscriptionMarshaller();

    public static EventSubscriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EventSubscription eventSubscription, ProtocolMarshaller protocolMarshaller) {

        if (eventSubscription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eventSubscription.getCustomerAwsId(), CUSTOMERAWSID_BINDING);
            protocolMarshaller.marshall(eventSubscription.getCustSubscriptionId(), CUSTSUBSCRIPTIONID_BINDING);
            protocolMarshaller.marshall(eventSubscription.getSnsTopicArn(), SNSTOPICARN_BINDING);
            protocolMarshaller.marshall(eventSubscription.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(eventSubscription.getSubscriptionCreationTime(), SUBSCRIPTIONCREATIONTIME_BINDING);
            protocolMarshaller.marshall(eventSubscription.getSourceType(), SOURCETYPE_BINDING);
            protocolMarshaller.marshall(eventSubscription.getSourceIdsList(), SOURCEIDSLIST_BINDING);
            protocolMarshaller.marshall(eventSubscription.getEventCategoriesList(), EVENTCATEGORIESLIST_BINDING);
            protocolMarshaller.marshall(eventSubscription.getEnabled(), ENABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
