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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ClusterInstanceGroupDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ClusterInstanceGroupDetailsMarshaller {

    private static final MarshallingInfo<Integer> CURRENTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentCount").build();
    private static final MarshallingInfo<Integer> TARGETCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetCount").build();
    private static final MarshallingInfo<String> INSTANCEGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceGroupName").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceType").build();
    private static final MarshallingInfo<StructuredPojo> LIFECYCLECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LifeCycleConfig").build();
    private static final MarshallingInfo<String> EXECUTIONROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionRole").build();
    private static final MarshallingInfo<Integer> THREADSPERCORE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThreadsPerCore").build();

    private static final ClusterInstanceGroupDetailsMarshaller instance = new ClusterInstanceGroupDetailsMarshaller();

    public static ClusterInstanceGroupDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ClusterInstanceGroupDetails clusterInstanceGroupDetails, ProtocolMarshaller protocolMarshaller) {

        if (clusterInstanceGroupDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(clusterInstanceGroupDetails.getCurrentCount(), CURRENTCOUNT_BINDING);
            protocolMarshaller.marshall(clusterInstanceGroupDetails.getTargetCount(), TARGETCOUNT_BINDING);
            protocolMarshaller.marshall(clusterInstanceGroupDetails.getInstanceGroupName(), INSTANCEGROUPNAME_BINDING);
            protocolMarshaller.marshall(clusterInstanceGroupDetails.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(clusterInstanceGroupDetails.getLifeCycleConfig(), LIFECYCLECONFIG_BINDING);
            protocolMarshaller.marshall(clusterInstanceGroupDetails.getExecutionRole(), EXECUTIONROLE_BINDING);
            protocolMarshaller.marshall(clusterInstanceGroupDetails.getThreadsPerCore(), THREADSPERCORE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
