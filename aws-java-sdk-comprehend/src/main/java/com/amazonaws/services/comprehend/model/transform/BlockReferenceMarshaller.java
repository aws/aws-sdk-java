/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehend.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.comprehend.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BlockReferenceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BlockReferenceMarshaller {

    private static final MarshallingInfo<String> BLOCKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BlockId").build();
    private static final MarshallingInfo<Integer> BEGINOFFSET_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BeginOffset").build();
    private static final MarshallingInfo<Integer> ENDOFFSET_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndOffset").build();
    private static final MarshallingInfo<List> CHILDBLOCKS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ChildBlocks").build();

    private static final BlockReferenceMarshaller instance = new BlockReferenceMarshaller();

    public static BlockReferenceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BlockReference blockReference, ProtocolMarshaller protocolMarshaller) {

        if (blockReference == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(blockReference.getBlockId(), BLOCKID_BINDING);
            protocolMarshaller.marshall(blockReference.getBeginOffset(), BEGINOFFSET_BINDING);
            protocolMarshaller.marshall(blockReference.getEndOffset(), ENDOFFSET_BINDING);
            protocolMarshaller.marshall(blockReference.getChildBlocks(), CHILDBLOCKS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
