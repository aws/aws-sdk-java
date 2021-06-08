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
package com.amazonaws.services.accessanalyzer.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.accessanalyzer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AccessPreviewFindingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AccessPreviewFindingMarshaller {

    private static final MarshallingInfo<List> ACTION_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("action").build();
    private static final MarshallingInfo<String> CHANGETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("changeType").build();
    private static final MarshallingInfo<Map> CONDITION_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("condition").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> ERROR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("error").build();
    private static final MarshallingInfo<String> EXISTINGFINDINGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("existingFindingId").build();
    private static final MarshallingInfo<String> EXISTINGFINDINGSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("existingFindingStatus").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<Boolean> ISPUBLIC_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isPublic").build();
    private static final MarshallingInfo<Map> PRINCIPAL_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("principal").build();
    private static final MarshallingInfo<String> RESOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("resource").build();
    private static final MarshallingInfo<String> RESOURCEOWNERACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceOwnerAccount").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceType").build();
    private static final MarshallingInfo<List> SOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sources").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();

    private static final AccessPreviewFindingMarshaller instance = new AccessPreviewFindingMarshaller();

    public static AccessPreviewFindingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AccessPreviewFinding accessPreviewFinding, ProtocolMarshaller protocolMarshaller) {

        if (accessPreviewFinding == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(accessPreviewFinding.getAction(), ACTION_BINDING);
            protocolMarshaller.marshall(accessPreviewFinding.getChangeType(), CHANGETYPE_BINDING);
            protocolMarshaller.marshall(accessPreviewFinding.getCondition(), CONDITION_BINDING);
            protocolMarshaller.marshall(accessPreviewFinding.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(accessPreviewFinding.getError(), ERROR_BINDING);
            protocolMarshaller.marshall(accessPreviewFinding.getExistingFindingId(), EXISTINGFINDINGID_BINDING);
            protocolMarshaller.marshall(accessPreviewFinding.getExistingFindingStatus(), EXISTINGFINDINGSTATUS_BINDING);
            protocolMarshaller.marshall(accessPreviewFinding.getId(), ID_BINDING);
            protocolMarshaller.marshall(accessPreviewFinding.getIsPublic(), ISPUBLIC_BINDING);
            protocolMarshaller.marshall(accessPreviewFinding.getPrincipal(), PRINCIPAL_BINDING);
            protocolMarshaller.marshall(accessPreviewFinding.getResource(), RESOURCE_BINDING);
            protocolMarshaller.marshall(accessPreviewFinding.getResourceOwnerAccount(), RESOURCEOWNERACCOUNT_BINDING);
            protocolMarshaller.marshall(accessPreviewFinding.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(accessPreviewFinding.getSources(), SOURCES_BINDING);
            protocolMarshaller.marshall(accessPreviewFinding.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
