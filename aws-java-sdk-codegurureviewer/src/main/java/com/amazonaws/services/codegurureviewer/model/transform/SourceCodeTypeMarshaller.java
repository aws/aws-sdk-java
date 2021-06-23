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
package com.amazonaws.services.codegurureviewer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codegurureviewer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SourceCodeTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SourceCodeTypeMarshaller {

    private static final MarshallingInfo<StructuredPojo> COMMITDIFF_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CommitDiff").build();
    private static final MarshallingInfo<StructuredPojo> REPOSITORYHEAD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RepositoryHead").build();
    private static final MarshallingInfo<StructuredPojo> BRANCHDIFF_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BranchDiff").build();
    private static final MarshallingInfo<StructuredPojo> S3BUCKETREPOSITORY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3BucketRepository").build();
    private static final MarshallingInfo<StructuredPojo> REQUESTMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequestMetadata").build();

    private static final SourceCodeTypeMarshaller instance = new SourceCodeTypeMarshaller();

    public static SourceCodeTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SourceCodeType sourceCodeType, ProtocolMarshaller protocolMarshaller) {

        if (sourceCodeType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sourceCodeType.getCommitDiff(), COMMITDIFF_BINDING);
            protocolMarshaller.marshall(sourceCodeType.getRepositoryHead(), REPOSITORYHEAD_BINDING);
            protocolMarshaller.marshall(sourceCodeType.getBranchDiff(), BRANCHDIFF_BINDING);
            protocolMarshaller.marshall(sourceCodeType.getS3BucketRepository(), S3BUCKETREPOSITORY_BINDING);
            protocolMarshaller.marshall(sourceCodeType.getRequestMetadata(), REQUESTMETADATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
