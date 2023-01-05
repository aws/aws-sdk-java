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
package com.amazonaws.services.snowdevicemanagement.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.snowdevicemanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribeDeviceEc2InstancesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeDeviceEc2InstancesRequestMarshaller {

    private static final MarshallingInfo<List> INSTANCEIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("instanceIds").build();
    private static final MarshallingInfo<String> MANAGEDDEVICEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("managedDeviceId").build();

    private static final DescribeDeviceEc2InstancesRequestMarshaller instance = new DescribeDeviceEc2InstancesRequestMarshaller();

    public static DescribeDeviceEc2InstancesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeDeviceEc2InstancesRequest describeDeviceEc2InstancesRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeDeviceEc2InstancesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeDeviceEc2InstancesRequest.getInstanceIds(), INSTANCEIDS_BINDING);
            protocolMarshaller.marshall(describeDeviceEc2InstancesRequest.getManagedDeviceId(), MANAGEDDEVICEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
