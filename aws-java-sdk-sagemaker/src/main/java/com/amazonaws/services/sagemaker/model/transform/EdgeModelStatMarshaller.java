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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EdgeModelStatMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EdgeModelStatMarshaller {

    private static final MarshallingInfo<String> MODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ModelName").build();
    private static final MarshallingInfo<String> MODELVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelVersion").build();
    private static final MarshallingInfo<Long> OFFLINEDEVICECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OfflineDeviceCount").build();
    private static final MarshallingInfo<Long> CONNECTEDDEVICECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectedDeviceCount").build();
    private static final MarshallingInfo<Long> ACTIVEDEVICECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActiveDeviceCount").build();
    private static final MarshallingInfo<Long> SAMPLINGDEVICECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SamplingDeviceCount").build();

    private static final EdgeModelStatMarshaller instance = new EdgeModelStatMarshaller();

    public static EdgeModelStatMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EdgeModelStat edgeModelStat, ProtocolMarshaller protocolMarshaller) {

        if (edgeModelStat == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(edgeModelStat.getModelName(), MODELNAME_BINDING);
            protocolMarshaller.marshall(edgeModelStat.getModelVersion(), MODELVERSION_BINDING);
            protocolMarshaller.marshall(edgeModelStat.getOfflineDeviceCount(), OFFLINEDEVICECOUNT_BINDING);
            protocolMarshaller.marshall(edgeModelStat.getConnectedDeviceCount(), CONNECTEDDEVICECOUNT_BINDING);
            protocolMarshaller.marshall(edgeModelStat.getActiveDeviceCount(), ACTIVEDEVICECOUNT_BINDING);
            protocolMarshaller.marshall(edgeModelStat.getSamplingDeviceCount(), SAMPLINGDEVICECOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
