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
 * UpdateArtifactRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateArtifactRequestMarshaller {

    private static final MarshallingInfo<String> ARTIFACTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ArtifactArn").build();
    private static final MarshallingInfo<String> ARTIFACTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ArtifactName").build();
    private static final MarshallingInfo<Map> PROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Properties").build();
    private static final MarshallingInfo<List> PROPERTIESTOREMOVE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PropertiesToRemove").build();

    private static final UpdateArtifactRequestMarshaller instance = new UpdateArtifactRequestMarshaller();

    public static UpdateArtifactRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateArtifactRequest updateArtifactRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateArtifactRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateArtifactRequest.getArtifactArn(), ARTIFACTARN_BINDING);
            protocolMarshaller.marshall(updateArtifactRequest.getArtifactName(), ARTIFACTNAME_BINDING);
            protocolMarshaller.marshall(updateArtifactRequest.getProperties(), PROPERTIES_BINDING);
            protocolMarshaller.marshall(updateArtifactRequest.getPropertiesToRemove(), PROPERTIESTOREMOVE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
