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
 * PullRequestMergedStateChangedEventMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PullRequestMergedStateChangedEventMetadataMarshaller {

    private static final MarshallingInfo<String> REPOSITORYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("repositoryName").build();
    private static final MarshallingInfo<String> DESTINATIONREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationReference").build();
    private static final MarshallingInfo<StructuredPojo> MERGEMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mergeMetadata").build();

    private static final PullRequestMergedStateChangedEventMetadataMarshaller instance = new PullRequestMergedStateChangedEventMetadataMarshaller();

    public static PullRequestMergedStateChangedEventMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PullRequestMergedStateChangedEventMetadata pullRequestMergedStateChangedEventMetadata, ProtocolMarshaller protocolMarshaller) {

        if (pullRequestMergedStateChangedEventMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pullRequestMergedStateChangedEventMetadata.getRepositoryName(), REPOSITORYNAME_BINDING);
            protocolMarshaller.marshall(pullRequestMergedStateChangedEventMetadata.getDestinationReference(), DESTINATIONREFERENCE_BINDING);
            protocolMarshaller.marshall(pullRequestMergedStateChangedEventMetadata.getMergeMetadata(), MERGEMETADATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
