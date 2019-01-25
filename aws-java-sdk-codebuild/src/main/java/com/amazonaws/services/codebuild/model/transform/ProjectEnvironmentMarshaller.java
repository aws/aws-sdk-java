/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codebuild.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codebuild.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProjectEnvironmentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProjectEnvironmentMarshaller {

    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<String> IMAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("image").build();
    private static final MarshallingInfo<String> COMPUTETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("computeType").build();
    private static final MarshallingInfo<List> ENVIRONMENTVARIABLES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environmentVariables").build();
    private static final MarshallingInfo<Boolean> PRIVILEGEDMODE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("privilegedMode").build();
    private static final MarshallingInfo<String> CERTIFICATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificate").build();
    private static final MarshallingInfo<StructuredPojo> REGISTRYCREDENTIAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("registryCredential").build();
    private static final MarshallingInfo<String> IMAGEPULLCREDENTIALSTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imagePullCredentialsType").build();

    private static final ProjectEnvironmentMarshaller instance = new ProjectEnvironmentMarshaller();

    public static ProjectEnvironmentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProjectEnvironment projectEnvironment, ProtocolMarshaller protocolMarshaller) {

        if (projectEnvironment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(projectEnvironment.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(projectEnvironment.getImage(), IMAGE_BINDING);
            protocolMarshaller.marshall(projectEnvironment.getComputeType(), COMPUTETYPE_BINDING);
            protocolMarshaller.marshall(projectEnvironment.getEnvironmentVariables(), ENVIRONMENTVARIABLES_BINDING);
            protocolMarshaller.marshall(projectEnvironment.getPrivilegedMode(), PRIVILEGEDMODE_BINDING);
            protocolMarshaller.marshall(projectEnvironment.getCertificate(), CERTIFICATE_BINDING);
            protocolMarshaller.marshall(projectEnvironment.getRegistryCredential(), REGISTRYCREDENTIAL_BINDING);
            protocolMarshaller.marshall(projectEnvironment.getImagePullCredentialsType(), IMAGEPULLCREDENTIALSTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
