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
 * AwsIamInstanceProfileMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsIamInstanceProfileMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> CREATEDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateDate").build();
    private static final MarshallingInfo<String> INSTANCEPROFILEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceProfileId").build();
    private static final MarshallingInfo<String> INSTANCEPROFILENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceProfileName").build();
    private static final MarshallingInfo<String> PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Path").build();
    private static final MarshallingInfo<List> ROLES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Roles").build();

    private static final AwsIamInstanceProfileMarshaller instance = new AwsIamInstanceProfileMarshaller();

    public static AwsIamInstanceProfileMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsIamInstanceProfile awsIamInstanceProfile, ProtocolMarshaller protocolMarshaller) {

        if (awsIamInstanceProfile == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsIamInstanceProfile.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(awsIamInstanceProfile.getCreateDate(), CREATEDATE_BINDING);
            protocolMarshaller.marshall(awsIamInstanceProfile.getInstanceProfileId(), INSTANCEPROFILEID_BINDING);
            protocolMarshaller.marshall(awsIamInstanceProfile.getInstanceProfileName(), INSTANCEPROFILENAME_BINDING);
            protocolMarshaller.marshall(awsIamInstanceProfile.getPath(), PATH_BINDING);
            protocolMarshaller.marshall(awsIamInstanceProfile.getRoles(), ROLES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
