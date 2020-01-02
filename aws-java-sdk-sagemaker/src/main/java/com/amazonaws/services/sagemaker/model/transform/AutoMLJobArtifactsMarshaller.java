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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AutoMLJobArtifactsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AutoMLJobArtifactsMarshaller {

    private static final MarshallingInfo<String> CANDIDATEDEFINITIONNOTEBOOKLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CandidateDefinitionNotebookLocation").build();
    private static final MarshallingInfo<String> DATAEXPLORATIONNOTEBOOKLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataExplorationNotebookLocation").build();

    private static final AutoMLJobArtifactsMarshaller instance = new AutoMLJobArtifactsMarshaller();

    public static AutoMLJobArtifactsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AutoMLJobArtifacts autoMLJobArtifacts, ProtocolMarshaller protocolMarshaller) {

        if (autoMLJobArtifacts == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(autoMLJobArtifacts.getCandidateDefinitionNotebookLocation(), CANDIDATEDEFINITIONNOTEBOOKLOCATION_BINDING);
            protocolMarshaller.marshall(autoMLJobArtifacts.getDataExplorationNotebookLocation(), DATAEXPLORATIONNOTEBOOKLOCATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
