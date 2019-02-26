/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreatePatchBaselineRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreatePatchBaselineRequestMarshaller {

    private static final MarshallingInfo<String> OPERATINGSYSTEM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OperatingSystem").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<StructuredPojo> GLOBALFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GlobalFilters").build();
    private static final MarshallingInfo<StructuredPojo> APPROVALRULES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApprovalRules").build();
    private static final MarshallingInfo<List> APPROVEDPATCHES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApprovedPatches").build();
    private static final MarshallingInfo<String> APPROVEDPATCHESCOMPLIANCELEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApprovedPatchesComplianceLevel").build();
    private static final MarshallingInfo<Boolean> APPROVEDPATCHESENABLENONSECURITY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApprovedPatchesEnableNonSecurity").build();
    private static final MarshallingInfo<List> REJECTEDPATCHES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RejectedPatches").build();
    private static final MarshallingInfo<String> REJECTEDPATCHESACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RejectedPatchesAction").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<List> SOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Sources").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreatePatchBaselineRequestMarshaller instance = new CreatePatchBaselineRequestMarshaller();

    public static CreatePatchBaselineRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreatePatchBaselineRequest createPatchBaselineRequest, ProtocolMarshaller protocolMarshaller) {

        if (createPatchBaselineRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createPatchBaselineRequest.getOperatingSystem(), OPERATINGSYSTEM_BINDING);
            protocolMarshaller.marshall(createPatchBaselineRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createPatchBaselineRequest.getGlobalFilters(), GLOBALFILTERS_BINDING);
            protocolMarshaller.marshall(createPatchBaselineRequest.getApprovalRules(), APPROVALRULES_BINDING);
            protocolMarshaller.marshall(createPatchBaselineRequest.getApprovedPatches(), APPROVEDPATCHES_BINDING);
            protocolMarshaller.marshall(createPatchBaselineRequest.getApprovedPatchesComplianceLevel(), APPROVEDPATCHESCOMPLIANCELEVEL_BINDING);
            protocolMarshaller.marshall(createPatchBaselineRequest.getApprovedPatchesEnableNonSecurity(), APPROVEDPATCHESENABLENONSECURITY_BINDING);
            protocolMarshaller.marshall(createPatchBaselineRequest.getRejectedPatches(), REJECTEDPATCHES_BINDING);
            protocolMarshaller.marshall(createPatchBaselineRequest.getRejectedPatchesAction(), REJECTEDPATCHESACTION_BINDING);
            protocolMarshaller.marshall(createPatchBaselineRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createPatchBaselineRequest.getSources(), SOURCES_BINDING);
            protocolMarshaller.marshall(createPatchBaselineRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createPatchBaselineRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
