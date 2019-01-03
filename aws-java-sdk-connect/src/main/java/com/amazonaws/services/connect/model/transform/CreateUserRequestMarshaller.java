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
package com.amazonaws.services.connect.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateUserRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateUserRequestMarshaller {

    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Username").build();
    private static final MarshallingInfo<String> PASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Password").build();
    private static final MarshallingInfo<StructuredPojo> IDENTITYINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentityInfo").build();
    private static final MarshallingInfo<StructuredPojo> PHONECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PhoneConfig").build();
    private static final MarshallingInfo<String> DIRECTORYUSERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DirectoryUserId").build();
    private static final MarshallingInfo<List> SECURITYPROFILEIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityProfileIds").build();
    private static final MarshallingInfo<String> ROUTINGPROFILEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RoutingProfileId").build();
    private static final MarshallingInfo<String> HIERARCHYGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HierarchyGroupId").build();
    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("InstanceId").build();

    private static final CreateUserRequestMarshaller instance = new CreateUserRequestMarshaller();

    public static CreateUserRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateUserRequest createUserRequest, ProtocolMarshaller protocolMarshaller) {

        if (createUserRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createUserRequest.getUsername(), USERNAME_BINDING);
            protocolMarshaller.marshall(createUserRequest.getPassword(), PASSWORD_BINDING);
            protocolMarshaller.marshall(createUserRequest.getIdentityInfo(), IDENTITYINFO_BINDING);
            protocolMarshaller.marshall(createUserRequest.getPhoneConfig(), PHONECONFIG_BINDING);
            protocolMarshaller.marshall(createUserRequest.getDirectoryUserId(), DIRECTORYUSERID_BINDING);
            protocolMarshaller.marshall(createUserRequest.getSecurityProfileIds(), SECURITYPROFILEIDS_BINDING);
            protocolMarshaller.marshall(createUserRequest.getRoutingProfileId(), ROUTINGPROFILEID_BINDING);
            protocolMarshaller.marshall(createUserRequest.getHierarchyGroupId(), HIERARCHYGROUPID_BINDING);
            protocolMarshaller.marshall(createUserRequest.getInstanceId(), INSTANCEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
