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
package com.amazonaws.services.codeartifact.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codeartifact.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DomainDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DomainDescriptionMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> OWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("owner").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ENCRYPTIONKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryptionKey").build();
    private static final MarshallingInfo<Integer> REPOSITORYCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("repositoryCount").build();
    private static final MarshallingInfo<Long> ASSETSIZEBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assetSizeBytes").build();
    private static final MarshallingInfo<String> S3BUCKETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3BucketArn").build();

    private static final DomainDescriptionMarshaller instance = new DomainDescriptionMarshaller();

    public static DomainDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DomainDescription domainDescription, ProtocolMarshaller protocolMarshaller) {

        if (domainDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(domainDescription.getName(), NAME_BINDING);
            protocolMarshaller.marshall(domainDescription.getOwner(), OWNER_BINDING);
            protocolMarshaller.marshall(domainDescription.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(domainDescription.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(domainDescription.getCreatedTime(), CREATEDTIME_BINDING);
            protocolMarshaller.marshall(domainDescription.getEncryptionKey(), ENCRYPTIONKEY_BINDING);
            protocolMarshaller.marshall(domainDescription.getRepositoryCount(), REPOSITORYCOUNT_BINDING);
            protocolMarshaller.marshall(domainDescription.getAssetSizeBytes(), ASSETSIZEBYTES_BINDING);
            protocolMarshaller.marshall(domainDescription.getS3BucketArn(), S3BUCKETARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
