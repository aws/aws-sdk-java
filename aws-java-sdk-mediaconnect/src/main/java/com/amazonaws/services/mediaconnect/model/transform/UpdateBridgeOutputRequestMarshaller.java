/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconnect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateBridgeOutputRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateBridgeOutputRequestMarshaller {

    private static final MarshallingInfo<String> BRIDGEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("bridgeArn").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKOUTPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkOutput").build();
    private static final MarshallingInfo<String> OUTPUTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("outputName").build();

    private static final UpdateBridgeOutputRequestMarshaller instance = new UpdateBridgeOutputRequestMarshaller();

    public static UpdateBridgeOutputRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateBridgeOutputRequest updateBridgeOutputRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateBridgeOutputRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateBridgeOutputRequest.getBridgeArn(), BRIDGEARN_BINDING);
            protocolMarshaller.marshall(updateBridgeOutputRequest.getNetworkOutput(), NETWORKOUTPUT_BINDING);
            protocolMarshaller.marshall(updateBridgeOutputRequest.getOutputName(), OUTPUTNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
