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
package com.amazonaws.services.greengrassv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.greengrassv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LambdaContainerParamsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LambdaContainerParamsMarshaller {

    private static final MarshallingInfo<Integer> MEMORYSIZEINKB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("memorySizeInKB").build();
    private static final MarshallingInfo<Boolean> MOUNTROSYSFS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mountROSysfs").build();
    private static final MarshallingInfo<List> VOLUMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("volumes").build();
    private static final MarshallingInfo<List> DEVICES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("devices").build();

    private static final LambdaContainerParamsMarshaller instance = new LambdaContainerParamsMarshaller();

    public static LambdaContainerParamsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LambdaContainerParams lambdaContainerParams, ProtocolMarshaller protocolMarshaller) {

        if (lambdaContainerParams == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lambdaContainerParams.getMemorySizeInKB(), MEMORYSIZEINKB_BINDING);
            protocolMarshaller.marshall(lambdaContainerParams.getMountROSysfs(), MOUNTROSYSFS_BINDING);
            protocolMarshaller.marshall(lambdaContainerParams.getVolumes(), VOLUMES_BINDING);
            protocolMarshaller.marshall(lambdaContainerParams.getDevices(), DEVICES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
