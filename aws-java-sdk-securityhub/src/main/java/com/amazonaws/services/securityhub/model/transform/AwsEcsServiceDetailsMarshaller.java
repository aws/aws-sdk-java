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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEcsServiceDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEcsServiceDetailsMarshaller {

    private static final MarshallingInfo<List> CAPACITYPROVIDERSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CapacityProviderStrategy").build();
    private static final MarshallingInfo<String> CLUSTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Cluster").build();
    private static final MarshallingInfo<StructuredPojo> DEPLOYMENTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> DEPLOYMENTCONTROLLER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentController").build();
    private static final MarshallingInfo<Integer> DESIREDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DesiredCount").build();
    private static final MarshallingInfo<Boolean> ENABLEECSMANAGEDTAGS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableEcsManagedTags").build();
    private static final MarshallingInfo<Boolean> ENABLEEXECUTECOMMAND_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableExecuteCommand").build();
    private static final MarshallingInfo<Integer> HEALTHCHECKGRACEPERIODSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HealthCheckGracePeriodSeconds").build();
    private static final MarshallingInfo<String> LAUNCHTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LaunchType").build();
    private static final MarshallingInfo<List> LOADBALANCERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LoadBalancers").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkConfiguration").build();
    private static final MarshallingInfo<List> PLACEMENTCONSTRAINTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlacementConstraints").build();
    private static final MarshallingInfo<List> PLACEMENTSTRATEGIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlacementStrategies").build();
    private static final MarshallingInfo<String> PLATFORMVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlatformVersion").build();
    private static final MarshallingInfo<String> PROPAGATETAGS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PropagateTags").build();
    private static final MarshallingInfo<String> ROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Role").build();
    private static final MarshallingInfo<String> SCHEDULINGSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SchedulingStrategy").build();
    private static final MarshallingInfo<String> SERVICEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceArn").build();
    private static final MarshallingInfo<String> SERVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceName").build();
    private static final MarshallingInfo<List> SERVICEREGISTRIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceRegistries").build();
    private static final MarshallingInfo<String> TASKDEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TaskDefinition").build();

    private static final AwsEcsServiceDetailsMarshaller instance = new AwsEcsServiceDetailsMarshaller();

    public static AwsEcsServiceDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEcsServiceDetails awsEcsServiceDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEcsServiceDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEcsServiceDetails.getCapacityProviderStrategy(), CAPACITYPROVIDERSTRATEGY_BINDING);
            protocolMarshaller.marshall(awsEcsServiceDetails.getCluster(), CLUSTER_BINDING);
            protocolMarshaller.marshall(awsEcsServiceDetails.getDeploymentConfiguration(), DEPLOYMENTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(awsEcsServiceDetails.getDeploymentController(), DEPLOYMENTCONTROLLER_BINDING);
            protocolMarshaller.marshall(awsEcsServiceDetails.getDesiredCount(), DESIREDCOUNT_BINDING);
            protocolMarshaller.marshall(awsEcsServiceDetails.getEnableEcsManagedTags(), ENABLEECSMANAGEDTAGS_BINDING);
            protocolMarshaller.marshall(awsEcsServiceDetails.getEnableExecuteCommand(), ENABLEEXECUTECOMMAND_BINDING);
            protocolMarshaller.marshall(awsEcsServiceDetails.getHealthCheckGracePeriodSeconds(), HEALTHCHECKGRACEPERIODSECONDS_BINDING);
            protocolMarshaller.marshall(awsEcsServiceDetails.getLaunchType(), LAUNCHTYPE_BINDING);
            protocolMarshaller.marshall(awsEcsServiceDetails.getLoadBalancers(), LOADBALANCERS_BINDING);
            protocolMarshaller.marshall(awsEcsServiceDetails.getName(), NAME_BINDING);
            protocolMarshaller.marshall(awsEcsServiceDetails.getNetworkConfiguration(), NETWORKCONFIGURATION_BINDING);
            protocolMarshaller.marshall(awsEcsServiceDetails.getPlacementConstraints(), PLACEMENTCONSTRAINTS_BINDING);
            protocolMarshaller.marshall(awsEcsServiceDetails.getPlacementStrategies(), PLACEMENTSTRATEGIES_BINDING);
            protocolMarshaller.marshall(awsEcsServiceDetails.getPlatformVersion(), PLATFORMVERSION_BINDING);
            protocolMarshaller.marshall(awsEcsServiceDetails.getPropagateTags(), PROPAGATETAGS_BINDING);
            protocolMarshaller.marshall(awsEcsServiceDetails.getRole(), ROLE_BINDING);
            protocolMarshaller.marshall(awsEcsServiceDetails.getSchedulingStrategy(), SCHEDULINGSTRATEGY_BINDING);
            protocolMarshaller.marshall(awsEcsServiceDetails.getServiceArn(), SERVICEARN_BINDING);
            protocolMarshaller.marshall(awsEcsServiceDetails.getServiceName(), SERVICENAME_BINDING);
            protocolMarshaller.marshall(awsEcsServiceDetails.getServiceRegistries(), SERVICEREGISTRIES_BINDING);
            protocolMarshaller.marshall(awsEcsServiceDetails.getTaskDefinition(), TASKDEFINITION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
