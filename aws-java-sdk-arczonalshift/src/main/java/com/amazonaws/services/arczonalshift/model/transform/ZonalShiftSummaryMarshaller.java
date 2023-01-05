/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.arczonalshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.arczonalshift.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ZonalShiftSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ZonalShiftSummaryMarshaller {

    private static final MarshallingInfo<String> AWAYFROM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("awayFrom").build();
    private static final MarshallingInfo<String> COMMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("comment").build();
    private static final MarshallingInfo<java.util.Date> EXPIRYTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expiryTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> RESOURCEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceIdentifier").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> ZONALSHIFTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("zonalShiftId").build();

    private static final ZonalShiftSummaryMarshaller instance = new ZonalShiftSummaryMarshaller();

    public static ZonalShiftSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ZonalShiftSummary zonalShiftSummary, ProtocolMarshaller protocolMarshaller) {

        if (zonalShiftSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(zonalShiftSummary.getAwayFrom(), AWAYFROM_BINDING);
            protocolMarshaller.marshall(zonalShiftSummary.getComment(), COMMENT_BINDING);
            protocolMarshaller.marshall(zonalShiftSummary.getExpiryTime(), EXPIRYTIME_BINDING);
            protocolMarshaller.marshall(zonalShiftSummary.getResourceIdentifier(), RESOURCEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(zonalShiftSummary.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(zonalShiftSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(zonalShiftSummary.getZonalShiftId(), ZONALSHIFTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
