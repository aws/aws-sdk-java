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
package com.amazonaws.services.simpleemailv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleemailv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListDomainDeliverabilityCampaignsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListDomainDeliverabilityCampaignsRequestMarshaller {

    private static final MarshallingInfo<java.util.Date> STARTDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("StartDate").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> ENDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("EndDate").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> SUBSCRIBEDDOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("SubscribedDomain").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("NextToken").build();
    private static final MarshallingInfo<Integer> PAGESIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("PageSize").build();

    private static final ListDomainDeliverabilityCampaignsRequestMarshaller instance = new ListDomainDeliverabilityCampaignsRequestMarshaller();

    public static ListDomainDeliverabilityCampaignsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListDomainDeliverabilityCampaignsRequest listDomainDeliverabilityCampaignsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listDomainDeliverabilityCampaignsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listDomainDeliverabilityCampaignsRequest.getStartDate(), STARTDATE_BINDING);
            protocolMarshaller.marshall(listDomainDeliverabilityCampaignsRequest.getEndDate(), ENDDATE_BINDING);
            protocolMarshaller.marshall(listDomainDeliverabilityCampaignsRequest.getSubscribedDomain(), SUBSCRIBEDDOMAIN_BINDING);
            protocolMarshaller.marshall(listDomainDeliverabilityCampaignsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listDomainDeliverabilityCampaignsRequest.getPageSize(), PAGESIZE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
