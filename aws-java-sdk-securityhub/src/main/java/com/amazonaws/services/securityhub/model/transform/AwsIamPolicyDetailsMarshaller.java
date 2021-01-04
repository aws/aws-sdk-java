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
 * AwsIamPolicyDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsIamPolicyDetailsMarshaller {

    private static final MarshallingInfo<Integer> ATTACHMENTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttachmentCount").build();
    private static final MarshallingInfo<String> CREATEDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateDate").build();
    private static final MarshallingInfo<String> DEFAULTVERSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultVersionId").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<Boolean> ISATTACHABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsAttachable").build();
    private static final MarshallingInfo<String> PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Path").build();
    private static final MarshallingInfo<Integer> PERMISSIONSBOUNDARYUSAGECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PermissionsBoundaryUsageCount").build();
    private static final MarshallingInfo<String> POLICYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PolicyId").build();
    private static final MarshallingInfo<String> POLICYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PolicyName").build();
    private static final MarshallingInfo<List> POLICYVERSIONLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PolicyVersionList").build();
    private static final MarshallingInfo<String> UPDATEDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateDate").build();

    private static final AwsIamPolicyDetailsMarshaller instance = new AwsIamPolicyDetailsMarshaller();

    public static AwsIamPolicyDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsIamPolicyDetails awsIamPolicyDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsIamPolicyDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsIamPolicyDetails.getAttachmentCount(), ATTACHMENTCOUNT_BINDING);
            protocolMarshaller.marshall(awsIamPolicyDetails.getCreateDate(), CREATEDATE_BINDING);
            protocolMarshaller.marshall(awsIamPolicyDetails.getDefaultVersionId(), DEFAULTVERSIONID_BINDING);
            protocolMarshaller.marshall(awsIamPolicyDetails.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(awsIamPolicyDetails.getIsAttachable(), ISATTACHABLE_BINDING);
            protocolMarshaller.marshall(awsIamPolicyDetails.getPath(), PATH_BINDING);
            protocolMarshaller.marshall(awsIamPolicyDetails.getPermissionsBoundaryUsageCount(), PERMISSIONSBOUNDARYUSAGECOUNT_BINDING);
            protocolMarshaller.marshall(awsIamPolicyDetails.getPolicyId(), POLICYID_BINDING);
            protocolMarshaller.marshall(awsIamPolicyDetails.getPolicyName(), POLICYNAME_BINDING);
            protocolMarshaller.marshall(awsIamPolicyDetails.getPolicyVersionList(), POLICYVERSIONLIST_BINDING);
            protocolMarshaller.marshall(awsIamPolicyDetails.getUpdateDate(), UPDATEDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
