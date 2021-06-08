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
package com.amazonaws.services.storagegateway.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.storagegateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateTapePoolRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateTapePoolRequestMarshaller {

    private static final MarshallingInfo<String> POOLNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PoolName").build();
    private static final MarshallingInfo<String> STORAGECLASS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageClass").build();
    private static final MarshallingInfo<String> RETENTIONLOCKTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetentionLockType").build();
    private static final MarshallingInfo<Integer> RETENTIONLOCKTIMEINDAYS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetentionLockTimeInDays").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateTapePoolRequestMarshaller instance = new CreateTapePoolRequestMarshaller();

    public static CreateTapePoolRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateTapePoolRequest createTapePoolRequest, ProtocolMarshaller protocolMarshaller) {

        if (createTapePoolRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createTapePoolRequest.getPoolName(), POOLNAME_BINDING);
            protocolMarshaller.marshall(createTapePoolRequest.getStorageClass(), STORAGECLASS_BINDING);
            protocolMarshaller.marshall(createTapePoolRequest.getRetentionLockType(), RETENTIONLOCKTYPE_BINDING);
            protocolMarshaller.marshall(createTapePoolRequest.getRetentionLockTimeInDays(), RETENTIONLOCKTIMEINDAYS_BINDING);
            protocolMarshaller.marshall(createTapePoolRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
