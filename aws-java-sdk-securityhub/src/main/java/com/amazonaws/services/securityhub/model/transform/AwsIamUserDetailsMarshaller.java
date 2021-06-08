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
 * AwsIamUserDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsIamUserDetailsMarshaller {

    private static final MarshallingInfo<List> ATTACHEDMANAGEDPOLICIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttachedManagedPolicies").build();
    private static final MarshallingInfo<String> CREATEDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateDate").build();
    private static final MarshallingInfo<List> GROUPLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GroupList").build();
    private static final MarshallingInfo<String> PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Path").build();
    private static final MarshallingInfo<StructuredPojo> PERMISSIONSBOUNDARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PermissionsBoundary").build();
    private static final MarshallingInfo<String> USERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UserId").build();
    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UserName").build();
    private static final MarshallingInfo<List> USERPOLICYLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserPolicyList").build();

    private static final AwsIamUserDetailsMarshaller instance = new AwsIamUserDetailsMarshaller();

    public static AwsIamUserDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsIamUserDetails awsIamUserDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsIamUserDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsIamUserDetails.getAttachedManagedPolicies(), ATTACHEDMANAGEDPOLICIES_BINDING);
            protocolMarshaller.marshall(awsIamUserDetails.getCreateDate(), CREATEDATE_BINDING);
            protocolMarshaller.marshall(awsIamUserDetails.getGroupList(), GROUPLIST_BINDING);
            protocolMarshaller.marshall(awsIamUserDetails.getPath(), PATH_BINDING);
            protocolMarshaller.marshall(awsIamUserDetails.getPermissionsBoundary(), PERMISSIONSBOUNDARY_BINDING);
            protocolMarshaller.marshall(awsIamUserDetails.getUserId(), USERID_BINDING);
            protocolMarshaller.marshall(awsIamUserDetails.getUserName(), USERNAME_BINDING);
            protocolMarshaller.marshall(awsIamUserDetails.getUserPolicyList(), USERPOLICYLIST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
