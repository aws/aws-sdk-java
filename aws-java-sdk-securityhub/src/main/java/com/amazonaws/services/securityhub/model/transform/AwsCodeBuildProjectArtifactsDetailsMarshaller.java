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
 * AwsCodeBuildProjectArtifactsDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsCodeBuildProjectArtifactsDetailsMarshaller {

    private static final MarshallingInfo<String> ARTIFACTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ArtifactIdentifier").build();
    private static final MarshallingInfo<Boolean> ENCRYPTIONDISABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionDisabled").build();
    private static final MarshallingInfo<String> LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Location").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> NAMESPACETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NamespaceType").build();
    private static final MarshallingInfo<Boolean> OVERRIDEARTIFACTNAME_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OverrideArtifactName").build();
    private static final MarshallingInfo<String> PACKAGING_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Packaging").build();
    private static final MarshallingInfo<String> PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Path").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();

    private static final AwsCodeBuildProjectArtifactsDetailsMarshaller instance = new AwsCodeBuildProjectArtifactsDetailsMarshaller();

    public static AwsCodeBuildProjectArtifactsDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsCodeBuildProjectArtifactsDetails awsCodeBuildProjectArtifactsDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsCodeBuildProjectArtifactsDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsCodeBuildProjectArtifactsDetails.getArtifactIdentifier(), ARTIFACTIDENTIFIER_BINDING);
            protocolMarshaller.marshall(awsCodeBuildProjectArtifactsDetails.getEncryptionDisabled(), ENCRYPTIONDISABLED_BINDING);
            protocolMarshaller.marshall(awsCodeBuildProjectArtifactsDetails.getLocation(), LOCATION_BINDING);
            protocolMarshaller.marshall(awsCodeBuildProjectArtifactsDetails.getName(), NAME_BINDING);
            protocolMarshaller.marshall(awsCodeBuildProjectArtifactsDetails.getNamespaceType(), NAMESPACETYPE_BINDING);
            protocolMarshaller.marshall(awsCodeBuildProjectArtifactsDetails.getOverrideArtifactName(), OVERRIDEARTIFACTNAME_BINDING);
            protocolMarshaller.marshall(awsCodeBuildProjectArtifactsDetails.getPackaging(), PACKAGING_BINDING);
            protocolMarshaller.marshall(awsCodeBuildProjectArtifactsDetails.getPath(), PATH_BINDING);
            protocolMarshaller.marshall(awsCodeBuildProjectArtifactsDetails.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
