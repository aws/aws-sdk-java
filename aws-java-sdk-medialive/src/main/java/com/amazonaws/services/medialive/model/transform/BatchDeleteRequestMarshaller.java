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
package com.amazonaws.services.medialive.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchDeleteRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchDeleteRequestMarshaller {

    private static final MarshallingInfo<List> CHANNELIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("channelIds").build();
    private static final MarshallingInfo<List> INPUTIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("inputIds").build();
    private static final MarshallingInfo<List> INPUTSECURITYGROUPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputSecurityGroupIds").build();
    private static final MarshallingInfo<List> MULTIPLEXIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("multiplexIds").build();

    private static final BatchDeleteRequestMarshaller instance = new BatchDeleteRequestMarshaller();

    public static BatchDeleteRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchDeleteRequest batchDeleteRequest, ProtocolMarshaller protocolMarshaller) {

        if (batchDeleteRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchDeleteRequest.getChannelIds(), CHANNELIDS_BINDING);
            protocolMarshaller.marshall(batchDeleteRequest.getInputIds(), INPUTIDS_BINDING);
            protocolMarshaller.marshall(batchDeleteRequest.getInputSecurityGroupIds(), INPUTSECURITYGROUPIDS_BINDING);
            protocolMarshaller.marshall(batchDeleteRequest.getMultiplexIds(), MULTIPLEXIDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
