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
package com.amazonaws.services.servicequotas.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servicequotas.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListRequestedServiceQuotaChangeHistoryByQuotaRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListRequestedServiceQuotaChangeHistoryByQuotaRequestMarshaller {

    private static final MarshallingInfo<String> SERVICECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceCode").build();
    private static final MarshallingInfo<String> QUOTACODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("QuotaCode").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();

    private static final ListRequestedServiceQuotaChangeHistoryByQuotaRequestMarshaller instance = new ListRequestedServiceQuotaChangeHistoryByQuotaRequestMarshaller();

    public static ListRequestedServiceQuotaChangeHistoryByQuotaRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListRequestedServiceQuotaChangeHistoryByQuotaRequest listRequestedServiceQuotaChangeHistoryByQuotaRequest,
            ProtocolMarshaller protocolMarshaller) {

        if (listRequestedServiceQuotaChangeHistoryByQuotaRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listRequestedServiceQuotaChangeHistoryByQuotaRequest.getServiceCode(), SERVICECODE_BINDING);
            protocolMarshaller.marshall(listRequestedServiceQuotaChangeHistoryByQuotaRequest.getQuotaCode(), QUOTACODE_BINDING);
            protocolMarshaller.marshall(listRequestedServiceQuotaChangeHistoryByQuotaRequest.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(listRequestedServiceQuotaChangeHistoryByQuotaRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listRequestedServiceQuotaChangeHistoryByQuotaRequest.getMaxResults(), MAXRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
