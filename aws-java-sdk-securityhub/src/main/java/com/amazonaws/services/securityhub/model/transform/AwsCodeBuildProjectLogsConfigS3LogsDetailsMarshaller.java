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
 * AwsCodeBuildProjectLogsConfigS3LogsDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsCodeBuildProjectLogsConfigS3LogsDetailsMarshaller {

    private static final MarshallingInfo<Boolean> ENCRYPTIONDISABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionDisabled").build();
    private static final MarshallingInfo<String> LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Location").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();

    private static final AwsCodeBuildProjectLogsConfigS3LogsDetailsMarshaller instance = new AwsCodeBuildProjectLogsConfigS3LogsDetailsMarshaller();

    public static AwsCodeBuildProjectLogsConfigS3LogsDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsCodeBuildProjectLogsConfigS3LogsDetails awsCodeBuildProjectLogsConfigS3LogsDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsCodeBuildProjectLogsConfigS3LogsDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsCodeBuildProjectLogsConfigS3LogsDetails.getEncryptionDisabled(), ENCRYPTIONDISABLED_BINDING);
            protocolMarshaller.marshall(awsCodeBuildProjectLogsConfigS3LogsDetails.getLocation(), LOCATION_BINDING);
            protocolMarshaller.marshall(awsCodeBuildProjectLogsConfigS3LogsDetails.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
