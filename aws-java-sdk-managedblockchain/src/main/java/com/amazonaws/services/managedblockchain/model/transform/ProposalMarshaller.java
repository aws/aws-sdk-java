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
package com.amazonaws.services.managedblockchain.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.managedblockchain.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProposalMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProposalMarshaller {

    private static final MarshallingInfo<String> PROPOSALID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProposalId").build();
    private static final MarshallingInfo<String> NETWORKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NetworkId").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<StructuredPojo> ACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Actions").build();
    private static final MarshallingInfo<String> PROPOSEDBYMEMBERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProposedByMemberId").build();
    private static final MarshallingInfo<String> PROPOSEDBYMEMBERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProposedByMemberName").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDate").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> EXPIRATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpirationDate").timestampFormat("iso8601").build();
    private static final MarshallingInfo<Integer> YESVOTECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("YesVoteCount").build();
    private static final MarshallingInfo<Integer> NOVOTECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NoVoteCount").build();
    private static final MarshallingInfo<Integer> OUTSTANDINGVOTECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutstandingVoteCount").build();

    private static final ProposalMarshaller instance = new ProposalMarshaller();

    public static ProposalMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Proposal proposal, ProtocolMarshaller protocolMarshaller) {

        if (proposal == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(proposal.getProposalId(), PROPOSALID_BINDING);
            protocolMarshaller.marshall(proposal.getNetworkId(), NETWORKID_BINDING);
            protocolMarshaller.marshall(proposal.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(proposal.getActions(), ACTIONS_BINDING);
            protocolMarshaller.marshall(proposal.getProposedByMemberId(), PROPOSEDBYMEMBERID_BINDING);
            protocolMarshaller.marshall(proposal.getProposedByMemberName(), PROPOSEDBYMEMBERNAME_BINDING);
            protocolMarshaller.marshall(proposal.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(proposal.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(proposal.getExpirationDate(), EXPIRATIONDATE_BINDING);
            protocolMarshaller.marshall(proposal.getYesVoteCount(), YESVOTECOUNT_BINDING);
            protocolMarshaller.marshall(proposal.getNoVoteCount(), NOVOTECOUNT_BINDING);
            protocolMarshaller.marshall(proposal.getOutstandingVoteCount(), OUTSTANDINGVOTECOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
