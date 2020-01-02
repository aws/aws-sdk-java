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
package com.amazonaws.services.ebs.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ebs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetSnapshotBlockRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetSnapshotBlockRequestMarshaller {

    private static final MarshallingInfo<String> SNAPSHOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("snapshotId").build();
    private static final MarshallingInfo<Integer> BLOCKINDEX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("blockIndex").build();
    private static final MarshallingInfo<String> BLOCKTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("blockToken").build();

    private static final GetSnapshotBlockRequestMarshaller instance = new GetSnapshotBlockRequestMarshaller();

    public static GetSnapshotBlockRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetSnapshotBlockRequest getSnapshotBlockRequest, ProtocolMarshaller protocolMarshaller) {

        if (getSnapshotBlockRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getSnapshotBlockRequest.getSnapshotId(), SNAPSHOTID_BINDING);
            protocolMarshaller.marshall(getSnapshotBlockRequest.getBlockIndex(), BLOCKINDEX_BINDING);
            protocolMarshaller.marshall(getSnapshotBlockRequest.getBlockToken(), BLOCKTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
