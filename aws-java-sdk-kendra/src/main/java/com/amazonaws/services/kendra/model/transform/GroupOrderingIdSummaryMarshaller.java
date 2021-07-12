/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kendra.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GroupOrderingIdSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GroupOrderingIdSummaryMarshaller {

    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> RECEIVEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReceivedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Long> ORDERINGID_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OrderingId").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureReason").build();

    private static final GroupOrderingIdSummaryMarshaller instance = new GroupOrderingIdSummaryMarshaller();

    public static GroupOrderingIdSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GroupOrderingIdSummary groupOrderingIdSummary, ProtocolMarshaller protocolMarshaller) {

        if (groupOrderingIdSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(groupOrderingIdSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(groupOrderingIdSummary.getLastUpdatedAt(), LASTUPDATEDAT_BINDING);
            protocolMarshaller.marshall(groupOrderingIdSummary.getReceivedAt(), RECEIVEDAT_BINDING);
            protocolMarshaller.marshall(groupOrderingIdSummary.getOrderingId(), ORDERINGID_BINDING);
            protocolMarshaller.marshall(groupOrderingIdSummary.getFailureReason(), FAILUREREASON_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
