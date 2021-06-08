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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MetadataPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MetadataPropertiesMarshaller {

    private static final MarshallingInfo<String> COMMITID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CommitId").build();
    private static final MarshallingInfo<String> REPOSITORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Repository").build();
    private static final MarshallingInfo<String> GENERATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GeneratedBy").build();
    private static final MarshallingInfo<String> PROJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProjectId").build();

    private static final MetadataPropertiesMarshaller instance = new MetadataPropertiesMarshaller();

    public static MetadataPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MetadataProperties metadataProperties, ProtocolMarshaller protocolMarshaller) {

        if (metadataProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(metadataProperties.getCommitId(), COMMITID_BINDING);
            protocolMarshaller.marshall(metadataProperties.getRepository(), REPOSITORY_BINDING);
            protocolMarshaller.marshall(metadataProperties.getGeneratedBy(), GENERATEDBY_BINDING);
            protocolMarshaller.marshall(metadataProperties.getProjectId(), PROJECTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
