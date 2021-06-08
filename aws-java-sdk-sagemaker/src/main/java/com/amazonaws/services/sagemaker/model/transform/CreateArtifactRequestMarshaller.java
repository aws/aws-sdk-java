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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateArtifactRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateArtifactRequestMarshaller {

    private static final MarshallingInfo<String> ARTIFACTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ArtifactName").build();
    private static final MarshallingInfo<StructuredPojo> SOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Source").build();
    private static final MarshallingInfo<String> ARTIFACTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ArtifactType").build();
    private static final MarshallingInfo<Map> PROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Properties").build();
    private static final MarshallingInfo<StructuredPojo> METADATAPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetadataProperties").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateArtifactRequestMarshaller instance = new CreateArtifactRequestMarshaller();

    public static CreateArtifactRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateArtifactRequest createArtifactRequest, ProtocolMarshaller protocolMarshaller) {

        if (createArtifactRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createArtifactRequest.getArtifactName(), ARTIFACTNAME_BINDING);
            protocolMarshaller.marshall(createArtifactRequest.getSource(), SOURCE_BINDING);
            protocolMarshaller.marshall(createArtifactRequest.getArtifactType(), ARTIFACTTYPE_BINDING);
            protocolMarshaller.marshall(createArtifactRequest.getProperties(), PROPERTIES_BINDING);
            protocolMarshaller.marshall(createArtifactRequest.getMetadataProperties(), METADATAPROPERTIES_BINDING);
            protocolMarshaller.marshall(createArtifactRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
