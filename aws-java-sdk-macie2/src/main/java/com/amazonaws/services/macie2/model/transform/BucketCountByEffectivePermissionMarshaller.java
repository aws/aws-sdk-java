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
 * BucketCountByEffectivePermissionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BucketCountByEffectivePermissionMarshaller {

    private static final MarshallingInfo<Long> PUBLICLYACCESSIBLE_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("publiclyAccessible").build();
    private static final MarshallingInfo<Long> PUBLICLYREADABLE_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("publiclyReadable").build();
    private static final MarshallingInfo<Long> PUBLICLYWRITABLE_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("publiclyWritable").build();
    private static final MarshallingInfo<Long> UNKNOWN_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("unknown").build();

    private static final BucketCountByEffectivePermissionMarshaller instance = new BucketCountByEffectivePermissionMarshaller();

    public static BucketCountByEffectivePermissionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BucketCountByEffectivePermission bucketCountByEffectivePermission, ProtocolMarshaller protocolMarshaller) {

        if (bucketCountByEffectivePermission == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(bucketCountByEffectivePermission.getPubliclyAccessible(), PUBLICLYACCESSIBLE_BINDING);
            protocolMarshaller.marshall(bucketCountByEffectivePermission.getPubliclyReadable(), PUBLICLYREADABLE_BINDING);
            protocolMarshaller.marshall(bucketCountByEffectivePermission.getPubliclyWritable(), PUBLICLYWRITABLE_BINDING);
            protocolMarshaller.marshall(bucketCountByEffectivePermission.getUnknown(), UNKNOWN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
