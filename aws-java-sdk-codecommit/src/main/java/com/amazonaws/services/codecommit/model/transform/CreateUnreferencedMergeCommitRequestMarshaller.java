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
package com.amazonaws.services.codecommit.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codecommit.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateUnreferencedMergeCommitRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateUnreferencedMergeCommitRequestMarshaller {

    private static final MarshallingInfo<String> REPOSITORYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("repositoryName").build();
    private static final MarshallingInfo<String> SOURCECOMMITSPECIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceCommitSpecifier").build();
    private static final MarshallingInfo<String> DESTINATIONCOMMITSPECIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationCommitSpecifier").build();
    private static final MarshallingInfo<String> MERGEOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mergeOption").build();
    private static final MarshallingInfo<String> CONFLICTDETAILLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("conflictDetailLevel").build();
    private static final MarshallingInfo<String> CONFLICTRESOLUTIONSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("conflictResolutionStrategy").build();
    private static final MarshallingInfo<String> AUTHORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorName").build();
    private static final MarshallingInfo<String> EMAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("email").build();
    private static final MarshallingInfo<String> COMMITMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("commitMessage").build();
    private static final MarshallingInfo<Boolean> KEEPEMPTYFOLDERS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("keepEmptyFolders").build();
    private static final MarshallingInfo<StructuredPojo> CONFLICTRESOLUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("conflictResolution").build();

    private static final CreateUnreferencedMergeCommitRequestMarshaller instance = new CreateUnreferencedMergeCommitRequestMarshaller();

    public static CreateUnreferencedMergeCommitRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateUnreferencedMergeCommitRequest createUnreferencedMergeCommitRequest, ProtocolMarshaller protocolMarshaller) {

        if (createUnreferencedMergeCommitRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createUnreferencedMergeCommitRequest.getRepositoryName(), REPOSITORYNAME_BINDING);
            protocolMarshaller.marshall(createUnreferencedMergeCommitRequest.getSourceCommitSpecifier(), SOURCECOMMITSPECIFIER_BINDING);
            protocolMarshaller.marshall(createUnreferencedMergeCommitRequest.getDestinationCommitSpecifier(), DESTINATIONCOMMITSPECIFIER_BINDING);
            protocolMarshaller.marshall(createUnreferencedMergeCommitRequest.getMergeOption(), MERGEOPTION_BINDING);
            protocolMarshaller.marshall(createUnreferencedMergeCommitRequest.getConflictDetailLevel(), CONFLICTDETAILLEVEL_BINDING);
            protocolMarshaller.marshall(createUnreferencedMergeCommitRequest.getConflictResolutionStrategy(), CONFLICTRESOLUTIONSTRATEGY_BINDING);
            protocolMarshaller.marshall(createUnreferencedMergeCommitRequest.getAuthorName(), AUTHORNAME_BINDING);
            protocolMarshaller.marshall(createUnreferencedMergeCommitRequest.getEmail(), EMAIL_BINDING);
            protocolMarshaller.marshall(createUnreferencedMergeCommitRequest.getCommitMessage(), COMMITMESSAGE_BINDING);
            protocolMarshaller.marshall(createUnreferencedMergeCommitRequest.getKeepEmptyFolders(), KEEPEMPTYFOLDERS_BINDING);
            protocolMarshaller.marshall(createUnreferencedMergeCommitRequest.getConflictResolution(), CONFLICTRESOLUTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
