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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.greengrassv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * IoTJobAbortCriteriaMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IoTJobAbortCriteriaMarshaller {

    private static final MarshallingInfo<String> FAILURETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failureType").build();
    private static final MarshallingInfo<String> ACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("action").build();
    private static final MarshallingInfo<Double> THRESHOLDPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("thresholdPercentage").build();
    private static final MarshallingInfo<Integer> MINNUMBEROFEXECUTEDTHINGS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minNumberOfExecutedThings").build();

    private static final IoTJobAbortCriteriaMarshaller instance = new IoTJobAbortCriteriaMarshaller();

    public static IoTJobAbortCriteriaMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IoTJobAbortCriteria ioTJobAbortCriteria, ProtocolMarshaller protocolMarshaller) {

        if (ioTJobAbortCriteria == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ioTJobAbortCriteria.getFailureType(), FAILURETYPE_BINDING);
            protocolMarshaller.marshall(ioTJobAbortCriteria.getAction(), ACTION_BINDING);
            protocolMarshaller.marshall(ioTJobAbortCriteria.getThresholdPercentage(), THRESHOLDPERCENTAGE_BINDING);
            protocolMarshaller.marshall(ioTJobAbortCriteria.getMinNumberOfExecutedThings(), MINNUMBEROFEXECUTEDTHINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
