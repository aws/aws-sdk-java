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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codebuild.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BuildArtifactsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BuildArtifactsMarshaller {

    private static final MarshallingInfo<String> LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("location").build();
    private static final MarshallingInfo<String> SHA256SUM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sha256sum").build();
    private static final MarshallingInfo<String> MD5SUM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("md5sum").build();
    private static final MarshallingInfo<Boolean> OVERRIDEARTIFACTNAME_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("overrideArtifactName").build();
    private static final MarshallingInfo<Boolean> ENCRYPTIONDISABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryptionDisabled").build();
    private static final MarshallingInfo<String> ARTIFACTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("artifactIdentifier").build();

    private static final BuildArtifactsMarshaller instance = new BuildArtifactsMarshaller();

    public static BuildArtifactsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BuildArtifacts buildArtifacts, ProtocolMarshaller protocolMarshaller) {

        if (buildArtifacts == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(buildArtifacts.getLocation(), LOCATION_BINDING);
            protocolMarshaller.marshall(buildArtifacts.getSha256sum(), SHA256SUM_BINDING);
            protocolMarshaller.marshall(buildArtifacts.getMd5sum(), MD5SUM_BINDING);
            protocolMarshaller.marshall(buildArtifacts.getOverrideArtifactName(), OVERRIDEARTIFACTNAME_BINDING);
            protocolMarshaller.marshall(buildArtifacts.getEncryptionDisabled(), ENCRYPTIONDISABLED_BINDING);
            protocolMarshaller.marshall(buildArtifacts.getArtifactIdentifier(), ARTIFACTIDENTIFIER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
