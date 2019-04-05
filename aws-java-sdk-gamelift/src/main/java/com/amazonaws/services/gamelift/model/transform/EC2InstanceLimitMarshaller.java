/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gamelift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamelift.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EC2InstanceLimitMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EC2InstanceLimitMarshaller {

    private static final MarshallingInfo<String> EC2INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EC2InstanceType").build();
    private static final MarshallingInfo<Integer> CURRENTINSTANCES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentInstances").build();
    private static final MarshallingInfo<Integer> INSTANCELIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceLimit").build();

    private static final EC2InstanceLimitMarshaller instance = new EC2InstanceLimitMarshaller();

    public static EC2InstanceLimitMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EC2InstanceLimit eC2InstanceLimit, ProtocolMarshaller protocolMarshaller) {

        if (eC2InstanceLimit == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eC2InstanceLimit.getEC2InstanceType(), EC2INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(eC2InstanceLimit.getCurrentInstances(), CURRENTINSTANCES_BINDING);
            protocolMarshaller.marshall(eC2InstanceLimit.getInstanceLimit(), INSTANCELIMIT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
