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
package com.amazonaws.services.connect.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateSecurityProfileRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateSecurityProfileRequestMarshaller {

    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<List> PERMISSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Permissions").build();
    private static final MarshallingInfo<String> SECURITYPROFILEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("SecurityProfileId").build();
    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("InstanceId").build();
    private static final MarshallingInfo<Map> ALLOWEDACCESSCONTROLTAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowedAccessControlTags").build();
    private static final MarshallingInfo<List> TAGRESTRICTEDRESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TagRestrictedResources").build();
    private static final MarshallingInfo<List> APPLICATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Applications").build();
    private static final MarshallingInfo<List> HIERARCHYRESTRICTEDRESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HierarchyRestrictedResources").build();
    private static final MarshallingInfo<String> ALLOWEDACCESSCONTROLHIERARCHYGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowedAccessControlHierarchyGroupId").build();

    private static final UpdateSecurityProfileRequestMarshaller instance = new UpdateSecurityProfileRequestMarshaller();

    public static UpdateSecurityProfileRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateSecurityProfileRequest updateSecurityProfileRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateSecurityProfileRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateSecurityProfileRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateSecurityProfileRequest.getPermissions(), PERMISSIONS_BINDING);
            protocolMarshaller.marshall(updateSecurityProfileRequest.getSecurityProfileId(), SECURITYPROFILEID_BINDING);
            protocolMarshaller.marshall(updateSecurityProfileRequest.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(updateSecurityProfileRequest.getAllowedAccessControlTags(), ALLOWEDACCESSCONTROLTAGS_BINDING);
            protocolMarshaller.marshall(updateSecurityProfileRequest.getTagRestrictedResources(), TAGRESTRICTEDRESOURCES_BINDING);
            protocolMarshaller.marshall(updateSecurityProfileRequest.getApplications(), APPLICATIONS_BINDING);
            protocolMarshaller.marshall(updateSecurityProfileRequest.getHierarchyRestrictedResources(), HIERARCHYRESTRICTEDRESOURCES_BINDING);
            protocolMarshaller.marshall(updateSecurityProfileRequest.getAllowedAccessControlHierarchyGroupId(), ALLOWEDACCESSCONTROLHIERARCHYGROUPID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
