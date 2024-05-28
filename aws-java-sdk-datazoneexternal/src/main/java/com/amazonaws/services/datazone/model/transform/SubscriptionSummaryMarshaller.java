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
package com.amazonaws.services.datazone.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datazone.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SubscriptionSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SubscriptionSummaryMarshaller {

    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("createdBy").build();
    private static final MarshallingInfo<String> DOMAINID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("domainId").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<Boolean> RETAINPERMISSIONS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("retainPermissions").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<StructuredPojo> SUBSCRIBEDLISTING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subscribedListing").build();
    private static final MarshallingInfo<StructuredPojo> SUBSCRIBEDPRINCIPAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subscribedPrincipal").build();
    private static final MarshallingInfo<String> SUBSCRIPTIONREQUESTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subscriptionRequestId").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> UPDATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("updatedBy").build();

    private static final SubscriptionSummaryMarshaller instance = new SubscriptionSummaryMarshaller();

    public static SubscriptionSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SubscriptionSummary subscriptionSummary, ProtocolMarshaller protocolMarshaller) {

        if (subscriptionSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(subscriptionSummary.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(subscriptionSummary.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(subscriptionSummary.getDomainId(), DOMAINID_BINDING);
            protocolMarshaller.marshall(subscriptionSummary.getId(), ID_BINDING);
            protocolMarshaller.marshall(subscriptionSummary.getRetainPermissions(), RETAINPERMISSIONS_BINDING);
            protocolMarshaller.marshall(subscriptionSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(subscriptionSummary.getSubscribedListing(), SUBSCRIBEDLISTING_BINDING);
            protocolMarshaller.marshall(subscriptionSummary.getSubscribedPrincipal(), SUBSCRIBEDPRINCIPAL_BINDING);
            protocolMarshaller.marshall(subscriptionSummary.getSubscriptionRequestId(), SUBSCRIPTIONREQUESTID_BINDING);
            protocolMarshaller.marshall(subscriptionSummary.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(subscriptionSummary.getUpdatedBy(), UPDATEDBY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
