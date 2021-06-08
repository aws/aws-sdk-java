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
 * ListArtifactsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListArtifactsRequestMarshaller {

    private static final MarshallingInfo<String> SOURCEURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SourceUri").build();
    private static final MarshallingInfo<String> ARTIFACTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ArtifactType").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAFTER_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedAfter").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> CREATEDBEFORE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedBefore").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> SORTBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SortBy").build();
    private static final MarshallingInfo<String> SORTORDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SortOrder").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();

    private static final ListArtifactsRequestMarshaller instance = new ListArtifactsRequestMarshaller();

    public static ListArtifactsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListArtifactsRequest listArtifactsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listArtifactsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listArtifactsRequest.getSourceUri(), SOURCEURI_BINDING);
            protocolMarshaller.marshall(listArtifactsRequest.getArtifactType(), ARTIFACTTYPE_BINDING);
            protocolMarshaller.marshall(listArtifactsRequest.getCreatedAfter(), CREATEDAFTER_BINDING);
            protocolMarshaller.marshall(listArtifactsRequest.getCreatedBefore(), CREATEDBEFORE_BINDING);
            protocolMarshaller.marshall(listArtifactsRequest.getSortBy(), SORTBY_BINDING);
            protocolMarshaller.marshall(listArtifactsRequest.getSortOrder(), SORTORDER_BINDING);
            protocolMarshaller.marshall(listArtifactsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listArtifactsRequest.getMaxResults(), MAXRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
