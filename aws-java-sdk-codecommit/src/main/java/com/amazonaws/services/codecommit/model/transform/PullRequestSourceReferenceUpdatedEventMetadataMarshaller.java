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
package com.amazonaws.services.codecommit.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codecommit.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PullRequestSourceReferenceUpdatedEventMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PullRequestSourceReferenceUpdatedEventMetadataMarshaller {

    private static final MarshallingInfo<String> REPOSITORYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("repositoryName").build();
    private static final MarshallingInfo<String> BEFORECOMMITID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("beforeCommitId").build();
    private static final MarshallingInfo<String> AFTERCOMMITID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("afterCommitId").build();
    private static final MarshallingInfo<String> MERGEBASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("mergeBase").build();

    private static final PullRequestSourceReferenceUpdatedEventMetadataMarshaller instance = new PullRequestSourceReferenceUpdatedEventMetadataMarshaller();

    public static PullRequestSourceReferenceUpdatedEventMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PullRequestSourceReferenceUpdatedEventMetadata pullRequestSourceReferenceUpdatedEventMetadata, ProtocolMarshaller protocolMarshaller) {

        if (pullRequestSourceReferenceUpdatedEventMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pullRequestSourceReferenceUpdatedEventMetadata.getRepositoryName(), REPOSITORYNAME_BINDING);
            protocolMarshaller.marshall(pullRequestSourceReferenceUpdatedEventMetadata.getBeforeCommitId(), BEFORECOMMITID_BINDING);
            protocolMarshaller.marshall(pullRequestSourceReferenceUpdatedEventMetadata.getAfterCommitId(), AFTERCOMMITID_BINDING);
            protocolMarshaller.marshall(pullRequestSourceReferenceUpdatedEventMetadata.getMergeBase(), MERGEBASE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
