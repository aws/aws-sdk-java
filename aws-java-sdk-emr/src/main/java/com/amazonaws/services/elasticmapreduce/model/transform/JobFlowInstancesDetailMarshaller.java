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
 * JobFlowInstancesDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobFlowInstancesDetailMarshaller {

    private static final MarshallingInfo<String> MASTERINSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MasterInstanceType").build();
    private static final MarshallingInfo<String> MASTERPUBLICDNSNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MasterPublicDnsName").build();
    private static final MarshallingInfo<String> MASTERINSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MasterInstanceId").build();
    private static final MarshallingInfo<String> SLAVEINSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SlaveInstanceType").build();
    private static final MarshallingInfo<Integer> INSTANCECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceCount").build();
    private static final MarshallingInfo<List> INSTANCEGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceGroups").build();
    private static final MarshallingInfo<Integer> NORMALIZEDINSTANCEHOURS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NormalizedInstanceHours").build();
    private static final MarshallingInfo<String> EC2KEYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ec2KeyName").build();
    private static final MarshallingInfo<String> EC2SUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ec2SubnetId").build();
    private static final MarshallingInfo<StructuredPojo> PLACEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Placement").build();
    private static final MarshallingInfo<Boolean> KEEPJOBFLOWALIVEWHENNOSTEPS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeepJobFlowAliveWhenNoSteps").build();
    private static final MarshallingInfo<Boolean> TERMINATIONPROTECTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TerminationProtected").build();
    private static final MarshallingInfo<String> HADOOPVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HadoopVersion").build();

    private static final JobFlowInstancesDetailMarshaller instance = new JobFlowInstancesDetailMarshaller();

    public static JobFlowInstancesDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobFlowInstancesDetail jobFlowInstancesDetail, ProtocolMarshaller protocolMarshaller) {

        if (jobFlowInstancesDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobFlowInstancesDetail.getMasterInstanceType(), MASTERINSTANCETYPE_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesDetail.getMasterPublicDnsName(), MASTERPUBLICDNSNAME_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesDetail.getMasterInstanceId(), MASTERINSTANCEID_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesDetail.getSlaveInstanceType(), SLAVEINSTANCETYPE_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesDetail.getInstanceCount(), INSTANCECOUNT_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesDetail.getInstanceGroups(), INSTANCEGROUPS_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesDetail.getNormalizedInstanceHours(), NORMALIZEDINSTANCEHOURS_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesDetail.getEc2KeyName(), EC2KEYNAME_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesDetail.getEc2SubnetId(), EC2SUBNETID_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesDetail.getPlacement(), PLACEMENT_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesDetail.getKeepJobFlowAliveWhenNoSteps(), KEEPJOBFLOWALIVEWHENNOSTEPS_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesDetail.getTerminationProtected(), TERMINATIONPROTECTED_BINDING);
            protocolMarshaller.marshall(jobFlowInstancesDetail.getHadoopVersion(), HADOOPVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
