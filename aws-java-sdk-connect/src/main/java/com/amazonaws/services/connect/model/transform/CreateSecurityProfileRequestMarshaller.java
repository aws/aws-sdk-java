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
 * CreateSecurityProfileRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateSecurityProfileRequestMarshaller {

    private static final MarshallingInfo<String> SECURITYPROFILENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityProfileName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<List> PERMISSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Permissions").build();
    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("InstanceId").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
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

    private static final CreateSecurityProfileRequestMarshaller instance = new CreateSecurityProfileRequestMarshaller();

    public static CreateSecurityProfileRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateSecurityProfileRequest createSecurityProfileRequest, ProtocolMarshaller protocolMarshaller) {

        if (createSecurityProfileRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createSecurityProfileRequest.getSecurityProfileName(), SECURITYPROFILENAME_BINDING);
            protocolMarshaller.marshall(createSecurityProfileRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createSecurityProfileRequest.getPermissions(), PERMISSIONS_BINDING);
            protocolMarshaller.marshall(createSecurityProfileRequest.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(createSecurityProfileRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createSecurityProfileRequest.getAllowedAccessControlTags(), ALLOWEDACCESSCONTROLTAGS_BINDING);
            protocolMarshaller.marshall(createSecurityProfileRequest.getTagRestrictedResources(), TAGRESTRICTEDRESOURCES_BINDING);
            protocolMarshaller.marshall(createSecurityProfileRequest.getApplications(), APPLICATIONS_BINDING);
            protocolMarshaller.marshall(createSecurityProfileRequest.getHierarchyRestrictedResources(), HIERARCHYRESTRICTEDRESOURCES_BINDING);
            protocolMarshaller.marshall(createSecurityProfileRequest.getAllowedAccessControlHierarchyGroupId(), ALLOWEDACCESSCONTROLHIERARCHYGROUPID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
