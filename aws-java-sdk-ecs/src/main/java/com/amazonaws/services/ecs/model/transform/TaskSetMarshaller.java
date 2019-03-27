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
package com.amazonaws.services.ecs.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TaskSetMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TaskSetMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> TASKSETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskSetArn").build();
    private static final MarshallingInfo<String> SERVICEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceArn").build();
    private static final MarshallingInfo<String> CLUSTERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clusterArn").build();
    private static final MarshallingInfo<String> STARTEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("startedBy").build();
    private static final MarshallingInfo<String> EXTERNALID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("externalId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> TASKDEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskDefinition").build();
    private static final MarshallingInfo<Integer> COMPUTEDDESIREDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("computedDesiredCount").build();
    private static final MarshallingInfo<Integer> PENDINGCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pendingCount").build();
    private static final MarshallingInfo<Integer> RUNNINGCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("runningCount").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LAUNCHTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("launchType").build();
    private static final MarshallingInfo<String> PLATFORMVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("platformVersion").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkConfiguration").build();
    private static final MarshallingInfo<List> LOADBALANCERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("loadBalancers").build();
    private static final MarshallingInfo<List> SERVICEREGISTRIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceRegistries").build();
    private static final MarshallingInfo<StructuredPojo> SCALE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scale").build();
    private static final MarshallingInfo<String> STABILITYSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stabilityStatus").build();
    private static final MarshallingInfo<java.util.Date> STABILITYSTATUSAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stabilityStatusAt").timestampFormat("unixTimestamp").build();

    private static final TaskSetMarshaller instance = new TaskSetMarshaller();

    public static TaskSetMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TaskSet taskSet, ProtocolMarshaller protocolMarshaller) {

        if (taskSet == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(taskSet.getId(), ID_BINDING);
            protocolMarshaller.marshall(taskSet.getTaskSetArn(), TASKSETARN_BINDING);
            protocolMarshaller.marshall(taskSet.getServiceArn(), SERVICEARN_BINDING);
            protocolMarshaller.marshall(taskSet.getClusterArn(), CLUSTERARN_BINDING);
            protocolMarshaller.marshall(taskSet.getStartedBy(), STARTEDBY_BINDING);
            protocolMarshaller.marshall(taskSet.getExternalId(), EXTERNALID_BINDING);
            protocolMarshaller.marshall(taskSet.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(taskSet.getTaskDefinition(), TASKDEFINITION_BINDING);
            protocolMarshaller.marshall(taskSet.getComputedDesiredCount(), COMPUTEDDESIREDCOUNT_BINDING);
            protocolMarshaller.marshall(taskSet.getPendingCount(), PENDINGCOUNT_BINDING);
            protocolMarshaller.marshall(taskSet.getRunningCount(), RUNNINGCOUNT_BINDING);
            protocolMarshaller.marshall(taskSet.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(taskSet.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(taskSet.getLaunchType(), LAUNCHTYPE_BINDING);
            protocolMarshaller.marshall(taskSet.getPlatformVersion(), PLATFORMVERSION_BINDING);
            protocolMarshaller.marshall(taskSet.getNetworkConfiguration(), NETWORKCONFIGURATION_BINDING);
            protocolMarshaller.marshall(taskSet.getLoadBalancers(), LOADBALANCERS_BINDING);
            protocolMarshaller.marshall(taskSet.getServiceRegistries(), SERVICEREGISTRIES_BINDING);
            protocolMarshaller.marshall(taskSet.getScale(), SCALE_BINDING);
            protocolMarshaller.marshall(taskSet.getStabilityStatus(), STABILITYSTATUS_BINDING);
            protocolMarshaller.marshall(taskSet.getStabilityStatusAt(), STABILITYSTATUSAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
