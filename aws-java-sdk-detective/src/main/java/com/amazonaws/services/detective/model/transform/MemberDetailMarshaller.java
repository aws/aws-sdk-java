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
package com.amazonaws.services.detective.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.detective.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MemberDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MemberDetailMarshaller {

    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AccountId").build();
    private static final MarshallingInfo<String> EMAILADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmailAddress").build();
    private static final MarshallingInfo<String> GRAPHARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GraphArn").build();
    private static final MarshallingInfo<String> MASTERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MasterId").build();
    private static final MarshallingInfo<String> ADMINISTRATORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdministratorId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> DISABLEDREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisabledReason").build();
    private static final MarshallingInfo<java.util.Date> INVITEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InvitedTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdatedTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<Long> VOLUMEUSAGEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VolumeUsageInBytes").build();
    private static final MarshallingInfo<java.util.Date> VOLUMEUSAGEUPDATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VolumeUsageUpdatedTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<Double> PERCENTOFGRAPHUTILIZATION_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PercentOfGraphUtilization").build();
    private static final MarshallingInfo<java.util.Date> PERCENTOFGRAPHUTILIZATIONUPDATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PercentOfGraphUtilizationUpdatedTime").timestampFormat("iso8601").build();

    private static final MemberDetailMarshaller instance = new MemberDetailMarshaller();

    public static MemberDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MemberDetail memberDetail, ProtocolMarshaller protocolMarshaller) {

        if (memberDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(memberDetail.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(memberDetail.getEmailAddress(), EMAILADDRESS_BINDING);
            protocolMarshaller.marshall(memberDetail.getGraphArn(), GRAPHARN_BINDING);
            protocolMarshaller.marshall(memberDetail.getMasterId(), MASTERID_BINDING);
            protocolMarshaller.marshall(memberDetail.getAdministratorId(), ADMINISTRATORID_BINDING);
            protocolMarshaller.marshall(memberDetail.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(memberDetail.getDisabledReason(), DISABLEDREASON_BINDING);
            protocolMarshaller.marshall(memberDetail.getInvitedTime(), INVITEDTIME_BINDING);
            protocolMarshaller.marshall(memberDetail.getUpdatedTime(), UPDATEDTIME_BINDING);
            protocolMarshaller.marshall(memberDetail.getVolumeUsageInBytes(), VOLUMEUSAGEINBYTES_BINDING);
            protocolMarshaller.marshall(memberDetail.getVolumeUsageUpdatedTime(), VOLUMEUSAGEUPDATEDTIME_BINDING);
            protocolMarshaller.marshall(memberDetail.getPercentOfGraphUtilization(), PERCENTOFGRAPHUTILIZATION_BINDING);
            protocolMarshaller.marshall(memberDetail.getPercentOfGraphUtilizationUpdatedTime(), PERCENTOFGRAPHUTILIZATIONUPDATEDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
