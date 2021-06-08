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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsIamInstanceProfileRoleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsIamInstanceProfileRoleMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> ASSUMEROLEPOLICYDOCUMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssumeRolePolicyDocument").build();
    private static final MarshallingInfo<String> CREATEDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateDate").build();
    private static final MarshallingInfo<String> PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Path").build();
    private static final MarshallingInfo<String> ROLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleId").build();
    private static final MarshallingInfo<String> ROLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleName").build();

    private static final AwsIamInstanceProfileRoleMarshaller instance = new AwsIamInstanceProfileRoleMarshaller();

    public static AwsIamInstanceProfileRoleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsIamInstanceProfileRole awsIamInstanceProfileRole, ProtocolMarshaller protocolMarshaller) {

        if (awsIamInstanceProfileRole == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsIamInstanceProfileRole.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(awsIamInstanceProfileRole.getAssumeRolePolicyDocument(), ASSUMEROLEPOLICYDOCUMENT_BINDING);
            protocolMarshaller.marshall(awsIamInstanceProfileRole.getCreateDate(), CREATEDATE_BINDING);
            protocolMarshaller.marshall(awsIamInstanceProfileRole.getPath(), PATH_BINDING);
            protocolMarshaller.marshall(awsIamInstanceProfileRole.getRoleId(), ROLEID_BINDING);
            protocolMarshaller.marshall(awsIamInstanceProfileRole.getRoleName(), ROLENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
