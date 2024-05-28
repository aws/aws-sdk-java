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
package com.amazonaws.services.outposts.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.outposts.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CapacityTaskSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CapacityTaskSummaryMarshaller {

    private static final MarshallingInfo<String> CAPACITYTASKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CapacityTaskId").build();
    private static final MarshallingInfo<String> OUTPOSTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OutpostId").build();
    private static final MarshallingInfo<String> ORDERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OrderId").build();
    private static final MarshallingInfo<String> CAPACITYTASKSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CapacityTaskStatus").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> COMPLETIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletionDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedDate").timestampFormat("unixTimestamp").build();

    private static final CapacityTaskSummaryMarshaller instance = new CapacityTaskSummaryMarshaller();

    public static CapacityTaskSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CapacityTaskSummary capacityTaskSummary, ProtocolMarshaller protocolMarshaller) {

        if (capacityTaskSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(capacityTaskSummary.getCapacityTaskId(), CAPACITYTASKID_BINDING);
            protocolMarshaller.marshall(capacityTaskSummary.getOutpostId(), OUTPOSTID_BINDING);
            protocolMarshaller.marshall(capacityTaskSummary.getOrderId(), ORDERID_BINDING);
            protocolMarshaller.marshall(capacityTaskSummary.getCapacityTaskStatus(), CAPACITYTASKSTATUS_BINDING);
            protocolMarshaller.marshall(capacityTaskSummary.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(capacityTaskSummary.getCompletionDate(), COMPLETIONDATE_BINDING);
            protocolMarshaller.marshall(capacityTaskSummary.getLastModifiedDate(), LASTMODIFIEDDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
