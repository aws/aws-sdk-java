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
 * UpdateSourceControlFromJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateSourceControlFromJobRequestMarshaller {

    private static final MarshallingInfo<String> JOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobName").build();
    private static final MarshallingInfo<String> PROVIDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Provider").build();
    private static final MarshallingInfo<String> REPOSITORYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RepositoryName").build();
    private static final MarshallingInfo<String> REPOSITORYOWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RepositoryOwner").build();
    private static final MarshallingInfo<String> BRANCHNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BranchName").build();
    private static final MarshallingInfo<String> FOLDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Folder").build();
    private static final MarshallingInfo<String> COMMITID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CommitId").build();
    private static final MarshallingInfo<String> AUTHSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthStrategy").build();
    private static final MarshallingInfo<String> AUTHTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AuthToken").build();

    private static final UpdateSourceControlFromJobRequestMarshaller instance = new UpdateSourceControlFromJobRequestMarshaller();

    public static UpdateSourceControlFromJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateSourceControlFromJobRequest updateSourceControlFromJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateSourceControlFromJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateSourceControlFromJobRequest.getJobName(), JOBNAME_BINDING);
            protocolMarshaller.marshall(updateSourceControlFromJobRequest.getProvider(), PROVIDER_BINDING);
            protocolMarshaller.marshall(updateSourceControlFromJobRequest.getRepositoryName(), REPOSITORYNAME_BINDING);
            protocolMarshaller.marshall(updateSourceControlFromJobRequest.getRepositoryOwner(), REPOSITORYOWNER_BINDING);
            protocolMarshaller.marshall(updateSourceControlFromJobRequest.getBranchName(), BRANCHNAME_BINDING);
            protocolMarshaller.marshall(updateSourceControlFromJobRequest.getFolder(), FOLDER_BINDING);
            protocolMarshaller.marshall(updateSourceControlFromJobRequest.getCommitId(), COMMITID_BINDING);
            protocolMarshaller.marshall(updateSourceControlFromJobRequest.getAuthStrategy(), AUTHSTRATEGY_BINDING);
            protocolMarshaller.marshall(updateSourceControlFromJobRequest.getAuthToken(), AUTHTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
