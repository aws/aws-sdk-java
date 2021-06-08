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
 * BucketCountBySharedAccessTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BucketCountBySharedAccessTypeMarshaller {

    private static final MarshallingInfo<Long> EXTERNAL_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("external").build();
    private static final MarshallingInfo<Long> INTERNAL_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("internal").build();
    private static final MarshallingInfo<Long> NOTSHARED_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("notShared").build();
    private static final MarshallingInfo<Long> UNKNOWN_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("unknown").build();

    private static final BucketCountBySharedAccessTypeMarshaller instance = new BucketCountBySharedAccessTypeMarshaller();

    public static BucketCountBySharedAccessTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BucketCountBySharedAccessType bucketCountBySharedAccessType, ProtocolMarshaller protocolMarshaller) {

        if (bucketCountBySharedAccessType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(bucketCountBySharedAccessType.getExternal(), EXTERNAL_BINDING);
            protocolMarshaller.marshall(bucketCountBySharedAccessType.getInternal(), INTERNAL_BINDING);
            protocolMarshaller.marshall(bucketCountBySharedAccessType.getNotShared(), NOTSHARED_BINDING);
            protocolMarshaller.marshall(bucketCountBySharedAccessType.getUnknown(), UNKNOWN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
