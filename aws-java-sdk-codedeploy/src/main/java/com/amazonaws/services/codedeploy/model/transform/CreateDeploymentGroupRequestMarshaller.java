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
package com.amazonaws.services.codedeploy.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codedeploy.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateDeploymentGroupRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateDeploymentGroupRequestMarshaller {

    private static final MarshallingInfo<String> APPLICATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicationName").build();
    private static final MarshallingInfo<String> DEPLOYMENTGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentGroupName").build();
    private static final MarshallingInfo<String> DEPLOYMENTCONFIGNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentConfigName").build();
    private static final MarshallingInfo<List> EC2TAGFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ec2TagFilters").build();
    private static final MarshallingInfo<List> ONPREMISESINSTANCETAGFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("onPremisesInstanceTagFilters").build();
    private static final MarshallingInfo<List> AUTOSCALINGGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoScalingGroups").build();
    private static final MarshallingInfo<String> SERVICEROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceRoleArn").build();
    private static final MarshallingInfo<List> TRIGGERCONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("triggerConfigurations").build();
    private static final MarshallingInfo<StructuredPojo> ALARMCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("alarmConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> AUTOROLLBACKCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoRollbackConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> DEPLOYMENTSTYLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentStyle").build();
    private static final MarshallingInfo<StructuredPojo> BLUEGREENDEPLOYMENTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("blueGreenDeploymentConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> LOADBALANCERINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("loadBalancerInfo").build();
    private static final MarshallingInfo<StructuredPojo> EC2TAGSET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ec2TagSet").build();
    private static final MarshallingInfo<List> ECSSERVICES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ecsServices").build();
    private static final MarshallingInfo<StructuredPojo> ONPREMISESTAGSET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("onPremisesTagSet").build();

    private static final CreateDeploymentGroupRequestMarshaller instance = new CreateDeploymentGroupRequestMarshaller();

    public static CreateDeploymentGroupRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateDeploymentGroupRequest createDeploymentGroupRequest, ProtocolMarshaller protocolMarshaller) {

        if (createDeploymentGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createDeploymentGroupRequest.getApplicationName(), APPLICATIONNAME_BINDING);
            protocolMarshaller.marshall(createDeploymentGroupRequest.getDeploymentGroupName(), DEPLOYMENTGROUPNAME_BINDING);
            protocolMarshaller.marshall(createDeploymentGroupRequest.getDeploymentConfigName(), DEPLOYMENTCONFIGNAME_BINDING);
            protocolMarshaller.marshall(createDeploymentGroupRequest.getEc2TagFilters(), EC2TAGFILTERS_BINDING);
            protocolMarshaller.marshall(createDeploymentGroupRequest.getOnPremisesInstanceTagFilters(), ONPREMISESINSTANCETAGFILTERS_BINDING);
            protocolMarshaller.marshall(createDeploymentGroupRequest.getAutoScalingGroups(), AUTOSCALINGGROUPS_BINDING);
            protocolMarshaller.marshall(createDeploymentGroupRequest.getServiceRoleArn(), SERVICEROLEARN_BINDING);
            protocolMarshaller.marshall(createDeploymentGroupRequest.getTriggerConfigurations(), TRIGGERCONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(createDeploymentGroupRequest.getAlarmConfiguration(), ALARMCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createDeploymentGroupRequest.getAutoRollbackConfiguration(), AUTOROLLBACKCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createDeploymentGroupRequest.getDeploymentStyle(), DEPLOYMENTSTYLE_BINDING);
            protocolMarshaller.marshall(createDeploymentGroupRequest.getBlueGreenDeploymentConfiguration(), BLUEGREENDEPLOYMENTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createDeploymentGroupRequest.getLoadBalancerInfo(), LOADBALANCERINFO_BINDING);
            protocolMarshaller.marshall(createDeploymentGroupRequest.getEc2TagSet(), EC2TAGSET_BINDING);
            protocolMarshaller.marshall(createDeploymentGroupRequest.getEcsServices(), ECSSERVICES_BINDING);
            protocolMarshaller.marshall(createDeploymentGroupRequest.getOnPremisesTagSet(), ONPREMISESTAGSET_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
