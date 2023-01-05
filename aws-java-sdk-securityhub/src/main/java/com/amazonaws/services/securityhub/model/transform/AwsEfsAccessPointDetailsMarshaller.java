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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEfsAccessPointDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEfsAccessPointDetailsMarshaller {

    private static final MarshallingInfo<String> ACCESSPOINTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessPointId").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken").build();
    private static final MarshallingInfo<String> FILESYSTEMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileSystemId").build();
    private static final MarshallingInfo<StructuredPojo> POSIXUSER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PosixUser").build();
    private static final MarshallingInfo<StructuredPojo> ROOTDIRECTORY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RootDirectory").build();

    private static final AwsEfsAccessPointDetailsMarshaller instance = new AwsEfsAccessPointDetailsMarshaller();

    public static AwsEfsAccessPointDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEfsAccessPointDetails awsEfsAccessPointDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEfsAccessPointDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEfsAccessPointDetails.getAccessPointId(), ACCESSPOINTID_BINDING);
            protocolMarshaller.marshall(awsEfsAccessPointDetails.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(awsEfsAccessPointDetails.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(awsEfsAccessPointDetails.getFileSystemId(), FILESYSTEMID_BINDING);
            protocolMarshaller.marshall(awsEfsAccessPointDetails.getPosixUser(), POSIXUSER_BINDING);
            protocolMarshaller.marshall(awsEfsAccessPointDetails.getRootDirectory(), ROOTDIRECTORY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
