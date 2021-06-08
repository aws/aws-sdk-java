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
 * S3BucketMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class S3BucketMarshaller {

    private static final MarshallingInfo<String> ALLOWSUNENCRYPTEDOBJECTUPLOADS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("allowsUnencryptedObjectUploads").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTSERVERSIDEENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultServerSideEncryption").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<StructuredPojo> OWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("owner").build();
    private static final MarshallingInfo<StructuredPojo> PUBLICACCESS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("publicAccess").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final S3BucketMarshaller instance = new S3BucketMarshaller();

    public static S3BucketMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(S3Bucket s3Bucket, ProtocolMarshaller protocolMarshaller) {

        if (s3Bucket == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(s3Bucket.getAllowsUnencryptedObjectUploads(), ALLOWSUNENCRYPTEDOBJECTUPLOADS_BINDING);
            protocolMarshaller.marshall(s3Bucket.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(s3Bucket.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(s3Bucket.getDefaultServerSideEncryption(), DEFAULTSERVERSIDEENCRYPTION_BINDING);
            protocolMarshaller.marshall(s3Bucket.getName(), NAME_BINDING);
            protocolMarshaller.marshall(s3Bucket.getOwner(), OWNER_BINDING);
            protocolMarshaller.marshall(s3Bucket.getPublicAccess(), PUBLICACCESS_BINDING);
            protocolMarshaller.marshall(s3Bucket.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
