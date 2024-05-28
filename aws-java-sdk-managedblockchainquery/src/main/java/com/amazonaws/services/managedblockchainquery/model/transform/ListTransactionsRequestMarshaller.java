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
package com.amazonaws.services.managedblockchainquery.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.managedblockchainquery.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListTransactionsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListTransactionsRequestMarshaller {

    private static final MarshallingInfo<String> ADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("address").build();
    private static final MarshallingInfo<String> NETWORK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("network").build();
    private static final MarshallingInfo<StructuredPojo> FROMBLOCKCHAININSTANT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fromBlockchainInstant").build();
    private static final MarshallingInfo<StructuredPojo> TOBLOCKCHAININSTANT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("toBlockchainInstant").build();
    private static final MarshallingInfo<StructuredPojo> SORT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sort").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<StructuredPojo> CONFIRMATIONSTATUSFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("confirmationStatusFilter").build();

    private static final ListTransactionsRequestMarshaller instance = new ListTransactionsRequestMarshaller();

    public static ListTransactionsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListTransactionsRequest listTransactionsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listTransactionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listTransactionsRequest.getAddress(), ADDRESS_BINDING);
            protocolMarshaller.marshall(listTransactionsRequest.getNetwork(), NETWORK_BINDING);
            protocolMarshaller.marshall(listTransactionsRequest.getFromBlockchainInstant(), FROMBLOCKCHAININSTANT_BINDING);
            protocolMarshaller.marshall(listTransactionsRequest.getToBlockchainInstant(), TOBLOCKCHAININSTANT_BINDING);
            protocolMarshaller.marshall(listTransactionsRequest.getSort(), SORT_BINDING);
            protocolMarshaller.marshall(listTransactionsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listTransactionsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listTransactionsRequest.getConfirmationStatusFilter(), CONFIRMATIONSTATUSFILTER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
