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
package com.amazonaws.services.macie2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.macie2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * S3ObjectMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class S3ObjectMarshaller {

    private static final MarshallingInfo<String> BUCKETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bucketArn").build();
    private static final MarshallingInfo<String> ETAG_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("eTag").build();
    private static final MarshallingInfo<String> EXTENSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("extension").build();
    private static final MarshallingInfo<String> KEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("key").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModified").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("path").build();
    private static final MarshallingInfo<Boolean> PUBLICACCESS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("publicAccess").build();
    private static final MarshallingInfo<StructuredPojo> SERVERSIDEENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serverSideEncryption").build();
    private static final MarshallingInfo<Long> SIZE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("size").build();
    private static final MarshallingInfo<String> STORAGECLASS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("storageClass").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> VERSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("versionId").build();

    private static final S3ObjectMarshaller instance = new S3ObjectMarshaller();

    public static S3ObjectMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(S3Object s3Object, ProtocolMarshaller protocolMarshaller) {

        if (s3Object == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(s3Object.getBucketArn(), BUCKETARN_BINDING);
            protocolMarshaller.marshall(s3Object.getETag(), ETAG_BINDING);
            protocolMarshaller.marshall(s3Object.getExtension(), EXTENSION_BINDING);
            protocolMarshaller.marshall(s3Object.getKey(), KEY_BINDING);
            protocolMarshaller.marshall(s3Object.getLastModified(), LASTMODIFIED_BINDING);
            protocolMarshaller.marshall(s3Object.getPath(), PATH_BINDING);
            protocolMarshaller.marshall(s3Object.getPublicAccess(), PUBLICACCESS_BINDING);
            protocolMarshaller.marshall(s3Object.getServerSideEncryption(), SERVERSIDEENCRYPTION_BINDING);
            protocolMarshaller.marshall(s3Object.getSize(), SIZE_BINDING);
            protocolMarshaller.marshall(s3Object.getStorageClass(), STORAGECLASS_BINDING);
            protocolMarshaller.marshall(s3Object.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(s3Object.getVersionId(), VERSIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
