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
package com.amazonaws.services.workmail.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workmail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutAccessControlRuleRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutAccessControlRuleRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> EFFECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Effect").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<List> IPRANGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IpRanges").build();
    private static final MarshallingInfo<List> NOTIPRANGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NotIpRanges").build();
    private static final MarshallingInfo<List> ACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Actions").build();
    private static final MarshallingInfo<List> NOTACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NotActions").build();
    private static final MarshallingInfo<List> USERIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UserIds").build();
    private static final MarshallingInfo<List> NOTUSERIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NotUserIds").build();
    private static final MarshallingInfo<String> ORGANIZATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationId").build();

    private static final PutAccessControlRuleRequestMarshaller instance = new PutAccessControlRuleRequestMarshaller();

    public static PutAccessControlRuleRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutAccessControlRuleRequest putAccessControlRuleRequest, ProtocolMarshaller protocolMarshaller) {

        if (putAccessControlRuleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putAccessControlRuleRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(putAccessControlRuleRequest.getEffect(), EFFECT_BINDING);
            protocolMarshaller.marshall(putAccessControlRuleRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(putAccessControlRuleRequest.getIpRanges(), IPRANGES_BINDING);
            protocolMarshaller.marshall(putAccessControlRuleRequest.getNotIpRanges(), NOTIPRANGES_BINDING);
            protocolMarshaller.marshall(putAccessControlRuleRequest.getActions(), ACTIONS_BINDING);
            protocolMarshaller.marshall(putAccessControlRuleRequest.getNotActions(), NOTACTIONS_BINDING);
            protocolMarshaller.marshall(putAccessControlRuleRequest.getUserIds(), USERIDS_BINDING);
            protocolMarshaller.marshall(putAccessControlRuleRequest.getNotUserIds(), NOTUSERIDS_BINDING);
            protocolMarshaller.marshall(putAccessControlRuleRequest.getOrganizationId(), ORGANIZATIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
