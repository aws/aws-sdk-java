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
package com.amazonaws.services.lightsail.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RenewalSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RenewalSummaryMarshaller {

    private static final MarshallingInfo<List> DOMAINVALIDATIONRECORDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("domainValidationRecords").build();
    private static final MarshallingInfo<String> RENEWALSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("renewalStatus").build();
    private static final MarshallingInfo<String> RENEWALSTATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("renewalStatusReason").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("unixTimestamp").build();

    private static final RenewalSummaryMarshaller instance = new RenewalSummaryMarshaller();

    public static RenewalSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RenewalSummary renewalSummary, ProtocolMarshaller protocolMarshaller) {

        if (renewalSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(renewalSummary.getDomainValidationRecords(), DOMAINVALIDATIONRECORDS_BINDING);
            protocolMarshaller.marshall(renewalSummary.getRenewalStatus(), RENEWALSTATUS_BINDING);
            protocolMarshaller.marshall(renewalSummary.getRenewalStatusReason(), RENEWALSTATUSREASON_BINDING);
            protocolMarshaller.marshall(renewalSummary.getUpdatedAt(), UPDATEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
