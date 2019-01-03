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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codecommit.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CommentsForComparedCommitMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CommentsForComparedCommitMarshaller {

    private static final MarshallingInfo<String> REPOSITORYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("repositoryName").build();
    private static final MarshallingInfo<String> BEFORECOMMITID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("beforeCommitId").build();
    private static final MarshallingInfo<String> AFTERCOMMITID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("afterCommitId").build();
    private static final MarshallingInfo<String> BEFOREBLOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("beforeBlobId").build();
    private static final MarshallingInfo<String> AFTERBLOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("afterBlobId").build();
    private static final MarshallingInfo<StructuredPojo> LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("location").build();
    private static final MarshallingInfo<List> COMMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("comments").build();

    private static final CommentsForComparedCommitMarshaller instance = new CommentsForComparedCommitMarshaller();

    public static CommentsForComparedCommitMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CommentsForComparedCommit commentsForComparedCommit, ProtocolMarshaller protocolMarshaller) {

        if (commentsForComparedCommit == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(commentsForComparedCommit.getRepositoryName(), REPOSITORYNAME_BINDING);
            protocolMarshaller.marshall(commentsForComparedCommit.getBeforeCommitId(), BEFORECOMMITID_BINDING);
            protocolMarshaller.marshall(commentsForComparedCommit.getAfterCommitId(), AFTERCOMMITID_BINDING);
            protocolMarshaller.marshall(commentsForComparedCommit.getBeforeBlobId(), BEFOREBLOBID_BINDING);
            protocolMarshaller.marshall(commentsForComparedCommit.getAfterBlobId(), AFTERBLOBID_BINDING);
            protocolMarshaller.marshall(commentsForComparedCommit.getLocation(), LOCATION_BINDING);
            protocolMarshaller.marshall(commentsForComparedCommit.getComments(), COMMENTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
