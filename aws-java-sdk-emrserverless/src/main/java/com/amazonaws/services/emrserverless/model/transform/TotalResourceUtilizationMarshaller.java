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
package com.amazonaws.services.emrserverless.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.emrserverless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TotalResourceUtilizationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TotalResourceUtilizationMarshaller {

    private static final MarshallingInfo<Double> VCPUHOUR_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("vCPUHour").build();
    private static final MarshallingInfo<Double> MEMORYGBHOUR_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("memoryGBHour").build();
    private static final MarshallingInfo<Double> STORAGEGBHOUR_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("storageGBHour").build();

    private static final TotalResourceUtilizationMarshaller instance = new TotalResourceUtilizationMarshaller();

    public static TotalResourceUtilizationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TotalResourceUtilization totalResourceUtilization, ProtocolMarshaller protocolMarshaller) {

        if (totalResourceUtilization == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(totalResourceUtilization.getVCPUHour(), VCPUHOUR_BINDING);
            protocolMarshaller.marshall(totalResourceUtilization.getMemoryGBHour(), MEMORYGBHOUR_BINDING);
            protocolMarshaller.marshall(totalResourceUtilization.getStorageGBHour(), STORAGEGBHOUR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
