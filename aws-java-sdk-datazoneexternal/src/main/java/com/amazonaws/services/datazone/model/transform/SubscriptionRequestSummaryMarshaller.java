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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datazone.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SubscriptionRequestSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SubscriptionRequestSummaryMarshaller {

    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("createdBy").build();
    private static final MarshallingInfo<String> DECISIONCOMMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("decisionComment").build();
    private static final MarshallingInfo<String> DOMAINID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("domainId").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> REQUESTREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requestReason").build();
    private static final MarshallingInfo<String> REVIEWERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("reviewerId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<List> SUBSCRIBEDLISTINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subscribedListings").build();
    private static final MarshallingInfo<List> SUBSCRIBEDPRINCIPALS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subscribedPrincipals").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> UPDATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("updatedBy").build();

    private static final SubscriptionRequestSummaryMarshaller instance = new SubscriptionRequestSummaryMarshaller();

    public static SubscriptionRequestSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SubscriptionRequestSummary subscriptionRequestSummary, ProtocolMarshaller protocolMarshaller) {

        if (subscriptionRequestSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(subscriptionRequestSummary.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(subscriptionRequestSummary.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(subscriptionRequestSummary.getDecisionComment(), DECISIONCOMMENT_BINDING);
            protocolMarshaller.marshall(subscriptionRequestSummary.getDomainId(), DOMAINID_BINDING);
            protocolMarshaller.marshall(subscriptionRequestSummary.getId(), ID_BINDING);
            protocolMarshaller.marshall(subscriptionRequestSummary.getRequestReason(), REQUESTREASON_BINDING);
            protocolMarshaller.marshall(subscriptionRequestSummary.getReviewerId(), REVIEWERID_BINDING);
            protocolMarshaller.marshall(subscriptionRequestSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(subscriptionRequestSummary.getSubscribedListings(), SUBSCRIBEDLISTINGS_BINDING);
            protocolMarshaller.marshall(subscriptionRequestSummary.getSubscribedPrincipals(), SUBSCRIBEDPRINCIPALS_BINDING);
            protocolMarshaller.marshall(subscriptionRequestSummary.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(subscriptionRequestSummary.getUpdatedBy(), UPDATEDBY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
