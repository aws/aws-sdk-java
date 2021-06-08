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
 * IoTJobExecutionsRolloutConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IoTJobExecutionsRolloutConfigMarshaller {

    private static final MarshallingInfo<StructuredPojo> EXPONENTIALRATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("exponentialRate").build();
    private static final MarshallingInfo<Integer> MAXIMUMPERMINUTE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maximumPerMinute").build();

    private static final IoTJobExecutionsRolloutConfigMarshaller instance = new IoTJobExecutionsRolloutConfigMarshaller();

    public static IoTJobExecutionsRolloutConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IoTJobExecutionsRolloutConfig ioTJobExecutionsRolloutConfig, ProtocolMarshaller protocolMarshaller) {

        if (ioTJobExecutionsRolloutConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ioTJobExecutionsRolloutConfig.getExponentialRate(), EXPONENTIALRATE_BINDING);
            protocolMarshaller.marshall(ioTJobExecutionsRolloutConfig.getMaximumPerMinute(), MAXIMUMPERMINUTE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
