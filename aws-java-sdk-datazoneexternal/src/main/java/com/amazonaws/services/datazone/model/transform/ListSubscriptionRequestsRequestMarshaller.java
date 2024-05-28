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
 * ListSubscriptionRequestsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListSubscriptionRequestsRequestMarshaller {

    private static final MarshallingInfo<String> APPROVERPROJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("approverProjectId").build();
    private static final MarshallingInfo<String> DOMAINIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("domainIdentifier").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("nextToken").build();
    private static final MarshallingInfo<String> OWNINGPROJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("owningProjectId").build();
    private static final MarshallingInfo<String> SORTBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("sortBy").build();
    private static final MarshallingInfo<String> SORTORDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("sortOrder").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("status").build();
    private static final MarshallingInfo<String> SUBSCRIBEDLISTINGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("subscribedListingId").build();

    private static final ListSubscriptionRequestsRequestMarshaller instance = new ListSubscriptionRequestsRequestMarshaller();

    public static ListSubscriptionRequestsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListSubscriptionRequestsRequest listSubscriptionRequestsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listSubscriptionRequestsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listSubscriptionRequestsRequest.getApproverProjectId(), APPROVERPROJECTID_BINDING);
            protocolMarshaller.marshall(listSubscriptionRequestsRequest.getDomainIdentifier(), DOMAINIDENTIFIER_BINDING);
            protocolMarshaller.marshall(listSubscriptionRequestsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listSubscriptionRequestsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listSubscriptionRequestsRequest.getOwningProjectId(), OWNINGPROJECTID_BINDING);
            protocolMarshaller.marshall(listSubscriptionRequestsRequest.getSortBy(), SORTBY_BINDING);
            protocolMarshaller.marshall(listSubscriptionRequestsRequest.getSortOrder(), SORTORDER_BINDING);
            protocolMarshaller.marshall(listSubscriptionRequestsRequest.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(listSubscriptionRequestsRequest.getSubscribedListingId(), SUBSCRIBEDLISTINGID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
