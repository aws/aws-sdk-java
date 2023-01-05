/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.finspacedata.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.finspacedata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PermissionGroupMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PermissionGroupMarshaller {

    private static final MarshallingInfo<String> PERMISSIONGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("permissionGroupId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<List> APPLICATIONPERMISSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicationPermissions").build();
    private static final MarshallingInfo<Long> CREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("createTime").build();
    private static final MarshallingInfo<Long> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModifiedTime").build();
    private static final MarshallingInfo<String> MEMBERSHIPSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("membershipStatus").build();

    private static final PermissionGroupMarshaller instance = new PermissionGroupMarshaller();

    public static PermissionGroupMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PermissionGroup permissionGroup, ProtocolMarshaller protocolMarshaller) {

        if (permissionGroup == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(permissionGroup.getPermissionGroupId(), PERMISSIONGROUPID_BINDING);
            protocolMarshaller.marshall(permissionGroup.getName(), NAME_BINDING);
            protocolMarshaller.marshall(permissionGroup.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(permissionGroup.getApplicationPermissions(), APPLICATIONPERMISSIONS_BINDING);
            protocolMarshaller.marshall(permissionGroup.getCreateTime(), CREATETIME_BINDING);
            protocolMarshaller.marshall(permissionGroup.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
            protocolMarshaller.marshall(permissionGroup.getMembershipStatus(), MEMBERSHIPSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
