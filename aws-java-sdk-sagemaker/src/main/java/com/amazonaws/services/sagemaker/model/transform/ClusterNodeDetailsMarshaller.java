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
 * ClusterNodeDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ClusterNodeDetailsMarshaller {

    private static final MarshallingInfo<String> INSTANCEGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceGroupName").build();
    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceId").build();
    private static final MarshallingInfo<StructuredPojo> INSTANCESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceStatus").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceType").build();
    private static final MarshallingInfo<java.util.Date> LAUNCHTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LaunchTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> LIFECYCLECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LifeCycleConfig").build();
    private static final MarshallingInfo<Integer> THREADSPERCORE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThreadsPerCore").build();

    private static final ClusterNodeDetailsMarshaller instance = new ClusterNodeDetailsMarshaller();

    public static ClusterNodeDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ClusterNodeDetails clusterNodeDetails, ProtocolMarshaller protocolMarshaller) {

        if (clusterNodeDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(clusterNodeDetails.getInstanceGroupName(), INSTANCEGROUPNAME_BINDING);
            protocolMarshaller.marshall(clusterNodeDetails.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(clusterNodeDetails.getInstanceStatus(), INSTANCESTATUS_BINDING);
            protocolMarshaller.marshall(clusterNodeDetails.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(clusterNodeDetails.getLaunchTime(), LAUNCHTIME_BINDING);
            protocolMarshaller.marshall(clusterNodeDetails.getLifeCycleConfig(), LIFECYCLECONFIG_BINDING);
            protocolMarshaller.marshall(clusterNodeDetails.getThreadsPerCore(), THREADSPERCORE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
