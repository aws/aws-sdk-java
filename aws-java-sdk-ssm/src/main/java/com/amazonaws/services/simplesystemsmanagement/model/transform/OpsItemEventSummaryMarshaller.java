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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OpsItemEventSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OpsItemEventSummaryMarshaller {

    private static final MarshallingInfo<String> OPSITEMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OpsItemId").build();
    private static final MarshallingInfo<String> EVENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EventId").build();
    private static final MarshallingInfo<String> SOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Source").build();
    private static final MarshallingInfo<String> DETAILTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DetailType").build();
    private static final MarshallingInfo<String> DETAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Detail").build();
    private static final MarshallingInfo<StructuredPojo> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedBy").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTime").timestampFormat("unixTimestamp").build();

    private static final OpsItemEventSummaryMarshaller instance = new OpsItemEventSummaryMarshaller();

    public static OpsItemEventSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OpsItemEventSummary opsItemEventSummary, ProtocolMarshaller protocolMarshaller) {

        if (opsItemEventSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(opsItemEventSummary.getOpsItemId(), OPSITEMID_BINDING);
            protocolMarshaller.marshall(opsItemEventSummary.getEventId(), EVENTID_BINDING);
            protocolMarshaller.marshall(opsItemEventSummary.getSource(), SOURCE_BINDING);
            protocolMarshaller.marshall(opsItemEventSummary.getDetailType(), DETAILTYPE_BINDING);
            protocolMarshaller.marshall(opsItemEventSummary.getDetail(), DETAIL_BINDING);
            protocolMarshaller.marshall(opsItemEventSummary.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(opsItemEventSummary.getCreatedTime(), CREATEDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
