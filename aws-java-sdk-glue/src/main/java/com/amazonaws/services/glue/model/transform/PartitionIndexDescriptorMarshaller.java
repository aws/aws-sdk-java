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
package com.amazonaws.services.glue.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PartitionIndexDescriptorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PartitionIndexDescriptorMarshaller {

    private static final MarshallingInfo<String> INDEXNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IndexName").build();
    private static final MarshallingInfo<List> KEYS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Keys").build();
    private static final MarshallingInfo<String> INDEXSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IndexStatus").build();
    private static final MarshallingInfo<List> BACKFILLERRORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackfillErrors").build();

    private static final PartitionIndexDescriptorMarshaller instance = new PartitionIndexDescriptorMarshaller();

    public static PartitionIndexDescriptorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PartitionIndexDescriptor partitionIndexDescriptor, ProtocolMarshaller protocolMarshaller) {

        if (partitionIndexDescriptor == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(partitionIndexDescriptor.getIndexName(), INDEXNAME_BINDING);
            protocolMarshaller.marshall(partitionIndexDescriptor.getKeys(), KEYS_BINDING);
            protocolMarshaller.marshall(partitionIndexDescriptor.getIndexStatus(), INDEXSTATUS_BINDING);
            protocolMarshaller.marshall(partitionIndexDescriptor.getBackfillErrors(), BACKFILLERRORS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
