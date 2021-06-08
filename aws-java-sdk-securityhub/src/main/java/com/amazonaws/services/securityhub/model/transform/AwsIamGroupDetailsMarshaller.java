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
 * AwsIamGroupDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsIamGroupDetailsMarshaller {

    private static final MarshallingInfo<List> ATTACHEDMANAGEDPOLICIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttachedManagedPolicies").build();
    private static final MarshallingInfo<String> CREATEDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateDate").build();
    private static final MarshallingInfo<String> GROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GroupId").build();
    private static final MarshallingInfo<String> GROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GroupName").build();
    private static final MarshallingInfo<List> GROUPPOLICYLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GroupPolicyList").build();
    private static final MarshallingInfo<String> PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Path").build();

    private static final AwsIamGroupDetailsMarshaller instance = new AwsIamGroupDetailsMarshaller();

    public static AwsIamGroupDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsIamGroupDetails awsIamGroupDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsIamGroupDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsIamGroupDetails.getAttachedManagedPolicies(), ATTACHEDMANAGEDPOLICIES_BINDING);
            protocolMarshaller.marshall(awsIamGroupDetails.getCreateDate(), CREATEDATE_BINDING);
            protocolMarshaller.marshall(awsIamGroupDetails.getGroupId(), GROUPID_BINDING);
            protocolMarshaller.marshall(awsIamGroupDetails.getGroupName(), GROUPNAME_BINDING);
            protocolMarshaller.marshall(awsIamGroupDetails.getGroupPolicyList(), GROUPPOLICYLIST_BINDING);
            protocolMarshaller.marshall(awsIamGroupDetails.getPath(), PATH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
