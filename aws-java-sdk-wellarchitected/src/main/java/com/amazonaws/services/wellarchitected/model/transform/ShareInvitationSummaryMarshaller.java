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
package com.amazonaws.services.wellarchitected.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wellarchitected.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ShareInvitationSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ShareInvitationSummaryMarshaller {

    private static final MarshallingInfo<String> SHAREINVITATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShareInvitationId").build();
    private static final MarshallingInfo<String> SHAREDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SharedBy").build();
    private static final MarshallingInfo<String> SHAREDWITH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SharedWith").build();
    private static final MarshallingInfo<String> PERMISSIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PermissionType").build();
    private static final MarshallingInfo<String> SHARERESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShareResourceType").build();
    private static final MarshallingInfo<String> WORKLOADNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkloadName").build();
    private static final MarshallingInfo<String> WORKLOADID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkloadId").build();
    private static final MarshallingInfo<String> LENSNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LensName").build();
    private static final MarshallingInfo<String> LENSARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LensArn").build();
    private static final MarshallingInfo<String> PROFILENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProfileName").build();
    private static final MarshallingInfo<String> PROFILEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProfileArn").build();
    private static final MarshallingInfo<String> TEMPLATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemplateName").build();
    private static final MarshallingInfo<String> TEMPLATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemplateArn").build();

    private static final ShareInvitationSummaryMarshaller instance = new ShareInvitationSummaryMarshaller();

    public static ShareInvitationSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ShareInvitationSummary shareInvitationSummary, ProtocolMarshaller protocolMarshaller) {

        if (shareInvitationSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(shareInvitationSummary.getShareInvitationId(), SHAREINVITATIONID_BINDING);
            protocolMarshaller.marshall(shareInvitationSummary.getSharedBy(), SHAREDBY_BINDING);
            protocolMarshaller.marshall(shareInvitationSummary.getSharedWith(), SHAREDWITH_BINDING);
            protocolMarshaller.marshall(shareInvitationSummary.getPermissionType(), PERMISSIONTYPE_BINDING);
            protocolMarshaller.marshall(shareInvitationSummary.getShareResourceType(), SHARERESOURCETYPE_BINDING);
            protocolMarshaller.marshall(shareInvitationSummary.getWorkloadName(), WORKLOADNAME_BINDING);
            protocolMarshaller.marshall(shareInvitationSummary.getWorkloadId(), WORKLOADID_BINDING);
            protocolMarshaller.marshall(shareInvitationSummary.getLensName(), LENSNAME_BINDING);
            protocolMarshaller.marshall(shareInvitationSummary.getLensArn(), LENSARN_BINDING);
            protocolMarshaller.marshall(shareInvitationSummary.getProfileName(), PROFILENAME_BINDING);
            protocolMarshaller.marshall(shareInvitationSummary.getProfileArn(), PROFILEARN_BINDING);
            protocolMarshaller.marshall(shareInvitationSummary.getTemplateName(), TEMPLATENAME_BINDING);
            protocolMarshaller.marshall(shareInvitationSummary.getTemplateArn(), TEMPLATEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
