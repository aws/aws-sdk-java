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
package com.amazonaws.services.migrationhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.migrationhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DisassociateCreatedArtifactRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DisassociateCreatedArtifactRequestMarshaller {

    private static final MarshallingInfo<String> PROGRESSUPDATESTREAM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProgressUpdateStream").build();
    private static final MarshallingInfo<String> MIGRATIONTASKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MigrationTaskName").build();
    private static final MarshallingInfo<String> CREATEDARTIFACTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedArtifactName").build();
    private static final MarshallingInfo<Boolean> DRYRUN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DryRun").build();

    private static final DisassociateCreatedArtifactRequestMarshaller instance = new DisassociateCreatedArtifactRequestMarshaller();

    public static DisassociateCreatedArtifactRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DisassociateCreatedArtifactRequest disassociateCreatedArtifactRequest, ProtocolMarshaller protocolMarshaller) {

        if (disassociateCreatedArtifactRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(disassociateCreatedArtifactRequest.getProgressUpdateStream(), PROGRESSUPDATESTREAM_BINDING);
            protocolMarshaller.marshall(disassociateCreatedArtifactRequest.getMigrationTaskName(), MIGRATIONTASKNAME_BINDING);
            protocolMarshaller.marshall(disassociateCreatedArtifactRequest.getCreatedArtifactName(), CREATEDARTIFACTNAME_BINDING);
            protocolMarshaller.marshall(disassociateCreatedArtifactRequest.getDryRun(), DRYRUN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
