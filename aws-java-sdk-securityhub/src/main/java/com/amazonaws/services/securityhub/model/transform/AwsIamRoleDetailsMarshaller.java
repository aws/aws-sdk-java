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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsIamRoleDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsIamRoleDetailsMarshaller {

    private static final MarshallingInfo<String> ASSUMEROLEPOLICYDOCUMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssumeRolePolicyDocument").build();
    private static final MarshallingInfo<List> ATTACHEDMANAGEDPOLICIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttachedManagedPolicies").build();
    private static final MarshallingInfo<String> CREATEDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateDate").build();
    private static final MarshallingInfo<List> INSTANCEPROFILELIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceProfileList").build();
    private static final MarshallingInfo<StructuredPojo> PERMISSIONSBOUNDARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PermissionsBoundary").build();
    private static final MarshallingInfo<String> ROLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleId").build();
    private static final MarshallingInfo<String> ROLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleName").build();
    private static final MarshallingInfo<List> ROLEPOLICYLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RolePolicyList").build();
    private static final MarshallingInfo<Integer> MAXSESSIONDURATION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxSessionDuration").build();
    private static final MarshallingInfo<String> PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Path").build();

    private static final AwsIamRoleDetailsMarshaller instance = new AwsIamRoleDetailsMarshaller();

    public static AwsIamRoleDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsIamRoleDetails awsIamRoleDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsIamRoleDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsIamRoleDetails.getAssumeRolePolicyDocument(), ASSUMEROLEPOLICYDOCUMENT_BINDING);
            protocolMarshaller.marshall(awsIamRoleDetails.getAttachedManagedPolicies(), ATTACHEDMANAGEDPOLICIES_BINDING);
            protocolMarshaller.marshall(awsIamRoleDetails.getCreateDate(), CREATEDATE_BINDING);
            protocolMarshaller.marshall(awsIamRoleDetails.getInstanceProfileList(), INSTANCEPROFILELIST_BINDING);
            protocolMarshaller.marshall(awsIamRoleDetails.getPermissionsBoundary(), PERMISSIONSBOUNDARY_BINDING);
            protocolMarshaller.marshall(awsIamRoleDetails.getRoleId(), ROLEID_BINDING);
            protocolMarshaller.marshall(awsIamRoleDetails.getRoleName(), ROLENAME_BINDING);
            protocolMarshaller.marshall(awsIamRoleDetails.getRolePolicyList(), ROLEPOLICYLIST_BINDING);
            protocolMarshaller.marshall(awsIamRoleDetails.getMaxSessionDuration(), MAXSESSIONDURATION_BINDING);
            protocolMarshaller.marshall(awsIamRoleDetails.getPath(), PATH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
