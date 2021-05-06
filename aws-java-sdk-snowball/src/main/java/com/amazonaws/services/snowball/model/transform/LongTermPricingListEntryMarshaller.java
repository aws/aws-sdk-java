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
package com.amazonaws.services.snowball.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.snowball.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LongTermPricingListEntryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LongTermPricingListEntryMarshaller {

    private static final MarshallingInfo<String> LONGTERMPRICINGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LongTermPricingId").build();
    private static final MarshallingInfo<java.util.Date> LONGTERMPRICINGENDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LongTermPricingEndDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LONGTERMPRICINGSTARTDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LongTermPricingStartDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LONGTERMPRICINGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LongTermPricingType").build();
    private static final MarshallingInfo<String> CURRENTACTIVEJOB_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentActiveJob").build();
    private static final MarshallingInfo<String> REPLACEMENTJOB_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplacementJob").build();
    private static final MarshallingInfo<Boolean> ISLONGTERMPRICINGAUTORENEW_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsLongTermPricingAutoRenew").build();
    private static final MarshallingInfo<String> LONGTERMPRICINGSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LongTermPricingStatus").build();
    private static final MarshallingInfo<String> SNOWBALLTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnowballType").build();
    private static final MarshallingInfo<List> JOBIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobIds").build();

    private static final LongTermPricingListEntryMarshaller instance = new LongTermPricingListEntryMarshaller();

    public static LongTermPricingListEntryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LongTermPricingListEntry longTermPricingListEntry, ProtocolMarshaller protocolMarshaller) {

        if (longTermPricingListEntry == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(longTermPricingListEntry.getLongTermPricingId(), LONGTERMPRICINGID_BINDING);
            protocolMarshaller.marshall(longTermPricingListEntry.getLongTermPricingEndDate(), LONGTERMPRICINGENDDATE_BINDING);
            protocolMarshaller.marshall(longTermPricingListEntry.getLongTermPricingStartDate(), LONGTERMPRICINGSTARTDATE_BINDING);
            protocolMarshaller.marshall(longTermPricingListEntry.getLongTermPricingType(), LONGTERMPRICINGTYPE_BINDING);
            protocolMarshaller.marshall(longTermPricingListEntry.getCurrentActiveJob(), CURRENTACTIVEJOB_BINDING);
            protocolMarshaller.marshall(longTermPricingListEntry.getReplacementJob(), REPLACEMENTJOB_BINDING);
            protocolMarshaller.marshall(longTermPricingListEntry.getIsLongTermPricingAutoRenew(), ISLONGTERMPRICINGAUTORENEW_BINDING);
            protocolMarshaller.marshall(longTermPricingListEntry.getLongTermPricingStatus(), LONGTERMPRICINGSTATUS_BINDING);
            protocolMarshaller.marshall(longTermPricingListEntry.getSnowballType(), SNOWBALLTYPE_BINDING);
            protocolMarshaller.marshall(longTermPricingListEntry.getJobIds(), JOBIDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
