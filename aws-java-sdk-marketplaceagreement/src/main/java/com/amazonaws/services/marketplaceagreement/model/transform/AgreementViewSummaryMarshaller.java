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
package com.amazonaws.services.marketplaceagreement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.marketplaceagreement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AgreementViewSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AgreementViewSummaryMarshaller {

    private static final MarshallingInfo<java.util.Date> ACCEPTANCETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("acceptanceTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> ACCEPTOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("acceptor").build();
    private static final MarshallingInfo<String> AGREEMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("agreementId").build();
    private static final MarshallingInfo<String> AGREEMENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("agreementType").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> PROPOSALSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("proposalSummary").build();
    private static final MarshallingInfo<StructuredPojo> PROPOSER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("proposer").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();

    private static final AgreementViewSummaryMarshaller instance = new AgreementViewSummaryMarshaller();

    public static AgreementViewSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AgreementViewSummary agreementViewSummary, ProtocolMarshaller protocolMarshaller) {

        if (agreementViewSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(agreementViewSummary.getAcceptanceTime(), ACCEPTANCETIME_BINDING);
            protocolMarshaller.marshall(agreementViewSummary.getAcceptor(), ACCEPTOR_BINDING);
            protocolMarshaller.marshall(agreementViewSummary.getAgreementId(), AGREEMENTID_BINDING);
            protocolMarshaller.marshall(agreementViewSummary.getAgreementType(), AGREEMENTTYPE_BINDING);
            protocolMarshaller.marshall(agreementViewSummary.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(agreementViewSummary.getProposalSummary(), PROPOSALSUMMARY_BINDING);
            protocolMarshaller.marshall(agreementViewSummary.getProposer(), PROPOSER_BINDING);
            protocolMarshaller.marshall(agreementViewSummary.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(agreementViewSummary.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
