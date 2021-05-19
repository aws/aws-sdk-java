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
package com.amazonaws.services.kinesisanalyticsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalyticsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CustomArtifactConfigurationDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CustomArtifactConfigurationDescriptionMarshaller {

    private static final MarshallingInfo<String> ARTIFACTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ArtifactType").build();
    private static final MarshallingInfo<StructuredPojo> S3CONTENTLOCATIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3ContentLocationDescription").build();
    private static final MarshallingInfo<StructuredPojo> MAVENREFERENCEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MavenReferenceDescription").build();

    private static final CustomArtifactConfigurationDescriptionMarshaller instance = new CustomArtifactConfigurationDescriptionMarshaller();

    public static CustomArtifactConfigurationDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CustomArtifactConfigurationDescription customArtifactConfigurationDescription, ProtocolMarshaller protocolMarshaller) {

        if (customArtifactConfigurationDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(customArtifactConfigurationDescription.getArtifactType(), ARTIFACTTYPE_BINDING);
            protocolMarshaller.marshall(customArtifactConfigurationDescription.getS3ContentLocationDescription(), S3CONTENTLOCATIONDESCRIPTION_BINDING);
            protocolMarshaller.marshall(customArtifactConfigurationDescription.getMavenReferenceDescription(), MAVENREFERENCEDESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
