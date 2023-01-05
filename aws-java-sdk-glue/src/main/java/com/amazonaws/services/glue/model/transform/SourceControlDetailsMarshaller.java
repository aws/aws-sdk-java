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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SourceControlDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SourceControlDetailsMarshaller {

    private static final MarshallingInfo<String> PROVIDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Provider").build();
    private static final MarshallingInfo<String> REPOSITORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Repository").build();
    private static final MarshallingInfo<String> OWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Owner").build();
    private static final MarshallingInfo<String> BRANCH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Branch").build();
    private static final MarshallingInfo<String> FOLDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Folder").build();
    private static final MarshallingInfo<String> LASTCOMMITID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastCommitId").build();
    private static final MarshallingInfo<String> AUTHSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthStrategy").build();
    private static final MarshallingInfo<String> AUTHTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AuthToken").build();

    private static final SourceControlDetailsMarshaller instance = new SourceControlDetailsMarshaller();

    public static SourceControlDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SourceControlDetails sourceControlDetails, ProtocolMarshaller protocolMarshaller) {

        if (sourceControlDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sourceControlDetails.getProvider(), PROVIDER_BINDING);
            protocolMarshaller.marshall(sourceControlDetails.getRepository(), REPOSITORY_BINDING);
            protocolMarshaller.marshall(sourceControlDetails.getOwner(), OWNER_BINDING);
            protocolMarshaller.marshall(sourceControlDetails.getBranch(), BRANCH_BINDING);
            protocolMarshaller.marshall(sourceControlDetails.getFolder(), FOLDER_BINDING);
            protocolMarshaller.marshall(sourceControlDetails.getLastCommitId(), LASTCOMMITID_BINDING);
            protocolMarshaller.marshall(sourceControlDetails.getAuthStrategy(), AUTHSTRATEGY_BINDING);
            protocolMarshaller.marshall(sourceControlDetails.getAuthToken(), AUTHTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
