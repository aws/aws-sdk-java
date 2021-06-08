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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.macie2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BucketCountByEncryptionTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BucketCountByEncryptionTypeMarshaller {

    private static final MarshallingInfo<Long> KMSMANAGED_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kmsManaged").build();
    private static final MarshallingInfo<Long> S3MANAGED_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("s3Managed").build();
    private static final MarshallingInfo<Long> UNENCRYPTED_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("unencrypted").build();
    private static final MarshallingInfo<Long> UNKNOWN_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("unknown").build();

    private static final BucketCountByEncryptionTypeMarshaller instance = new BucketCountByEncryptionTypeMarshaller();

    public static BucketCountByEncryptionTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BucketCountByEncryptionType bucketCountByEncryptionType, ProtocolMarshaller protocolMarshaller) {

        if (bucketCountByEncryptionType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(bucketCountByEncryptionType.getKmsManaged(), KMSMANAGED_BINDING);
            protocolMarshaller.marshall(bucketCountByEncryptionType.getS3Managed(), S3MANAGED_BINDING);
            protocolMarshaller.marshall(bucketCountByEncryptionType.getUnencrypted(), UNENCRYPTED_BINDING);
            protocolMarshaller.marshall(bucketCountByEncryptionType.getUnknown(), UNKNOWN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
