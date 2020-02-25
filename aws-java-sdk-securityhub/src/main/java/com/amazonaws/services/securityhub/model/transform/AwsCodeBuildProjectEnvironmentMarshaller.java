/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AwsCodeBuildProjectEnvironmentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsCodeBuildProjectEnvironmentMarshaller {

    private static final MarshallingInfo<String> CERTIFICATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Certificate").build();
    private static final MarshallingInfo<String> IMAGEPULLCREDENTIALSTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImagePullCredentialsType").build();
    private static final MarshallingInfo<StructuredPojo> REGISTRYCREDENTIAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegistryCredential").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();

    private static final AwsCodeBuildProjectEnvironmentMarshaller instance = new AwsCodeBuildProjectEnvironmentMarshaller();

    public static AwsCodeBuildProjectEnvironmentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsCodeBuildProjectEnvironment awsCodeBuildProjectEnvironment, ProtocolMarshaller protocolMarshaller) {

        if (awsCodeBuildProjectEnvironment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsCodeBuildProjectEnvironment.getCertificate(), CERTIFICATE_BINDING);
            protocolMarshaller.marshall(awsCodeBuildProjectEnvironment.getImagePullCredentialsType(), IMAGEPULLCREDENTIALSTYPE_BINDING);
            protocolMarshaller.marshall(awsCodeBuildProjectEnvironment.getRegistryCredential(), REGISTRYCREDENTIAL_BINDING);
            protocolMarshaller.marshall(awsCodeBuildProjectEnvironment.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
