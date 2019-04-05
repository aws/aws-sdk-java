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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JobFlowInstancesConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobFlowInstancesConfigMarshaller {

    private static final MarshallingInfo<String> MASTERINSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MasterInstanceType").build();
    private static final MarshallingInfo<String> SLAVEINSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SlaveInstanceType").build();
    private static final MarshallingInfo<Integer> INSTANCECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceCount").build();
    private static final MarshallingInfo<List> INSTANCEGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceGroups").build();
    private static final MarshallingInfo<List> INSTANCEFLEETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceFleets").build();
    private static final MarshallingInfo<String> EC2KEYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ec2KeyName").build();
    private static final MarshallingInfo<StructuredPojo> PLACEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Placement").build();
    private static final MarshallingInfo<Boolean> KEEPJOBFLOWALIVEWHENNOSTEPS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeepJobFlowAliveWhenNoSteps").build();
    private static final MarshallingInfo<Boolean> TERMINATIONPROTECTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TerminationProtected").build();
    private static final MarshallingInfo<String> HADOOPVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HadoopVersion").build();
    private static final MarshallingInfo<String> EC2SUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ec2SubnetId").build();
    private static final MarshallingInfo<List> EC2SUBNETIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Ec2SubnetIds").build();
    private static final MarshallingInfo<String> EMRMANAGEDMASTERSECURITYGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmrManagedMasterSecurityGroup").build();
    private static final MarshallingInfo<String> EMRMANAGEDSLAVESECURITYGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmrManagedSlaveSecurityGroup").build();
    private static final MarshallingInfo<String> SERVICEACCESSSECURITYGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceAccessSecurityGroup").build();
    private static final MarshallingInfo<List> ADDITIONALMASTERSECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalMasterSecurityGroups").build();
    private static final MarshallingInfo<List> ADDITIONALSLAVESECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalSlaveSecurityGroups").build();

    private static final JobFlowInstancesConfigMarshaller instance = new JobFlowInstancesConfigMarshaller();

    public static JobFlowInstancesConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobFlowInstancesConfig jobFlowInstancesConfig, ProtocolMarshaller protocolMarshaller) {

        if (jobFlowInstancesConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobFlowInstancesConfig.getMasterInstanceType(), MASTERINSTANCETYPE_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesConfig.getSlaveInstanceType(), SLAVEINSTANCETYPE_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesConfig.getInstanceCount(), INSTANCECOUNT_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesConfig.getInstanceGroups(), INSTANCEGROUPS_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesConfig.getInstanceFleets(), INSTANCEFLEETS_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesConfig.getEc2KeyName(), EC2KEYNAME_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesConfig.getPlacement(), PLACEMENT_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesConfig.getKeepJobFlowAliveWhenNoSteps(), KEEPJOBFLOWALIVEWHENNOSTEPS_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesConfig.getTerminationProtected(), TERMINATIONPROTECTED_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesConfig.getHadoopVersion(), HADOOPVERSION_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesConfig.getEc2SubnetId(), EC2SUBNETID_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesConfig.getEc2SubnetIds(), EC2SUBNETIDS_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesConfig.getEmrManagedMasterSecurityGroup(), EMRMANAGEDMASTERSECURITYGROUP_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesConfig.getEmrManagedSlaveSecurityGroup(), EMRMANAGEDSLAVESECURITYGROUP_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesConfig.getServiceAccessSecurityGroup(), SERVICEACCESSSECURITYGROUP_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesConfig.getAdditionalMasterSecurityGroups(), ADDITIONALMASTERSECURITYGROUPS_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesConfig.getAdditionalSlaveSecurityGroups(), ADDITIONALSLAVESECURITYGROUPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
