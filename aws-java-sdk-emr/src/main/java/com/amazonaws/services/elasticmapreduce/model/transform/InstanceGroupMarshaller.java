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
 * InstanceGroupMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstanceGroupMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> MARKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Market").build();
    private static final MarshallingInfo<String> INSTANCEGROUPTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceGroupType").build();
    private static final MarshallingInfo<String> BIDPRICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BidPrice").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceType").build();
    private static final MarshallingInfo<Integer> REQUESTEDINSTANCECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequestedInstanceCount").build();
    private static final MarshallingInfo<Integer> RUNNINGINSTANCECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RunningInstanceCount").build();
    private static final MarshallingInfo<StructuredPojo> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Status").build();
    private static final MarshallingInfo<List> CONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Configurations").build();
    private static final MarshallingInfo<Long> CONFIGURATIONSVERSION_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigurationsVersion").build();
    private static final MarshallingInfo<List> LASTSUCCESSFULLYAPPLIEDCONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastSuccessfullyAppliedConfigurations").build();
    private static final MarshallingInfo<Long> LASTSUCCESSFULLYAPPLIEDCONFIGURATIONSVERSION_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastSuccessfullyAppliedConfigurationsVersion").build();
    private static final MarshallingInfo<List> EBSBLOCKDEVICES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EbsBlockDevices").build();
    private static final MarshallingInfo<Boolean> EBSOPTIMIZED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EbsOptimized").build();
    private static final MarshallingInfo<StructuredPojo> SHRINKPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShrinkPolicy").build();
    private static final MarshallingInfo<StructuredPojo> AUTOSCALINGPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoScalingPolicy").build();

    private static final InstanceGroupMarshaller instance = new InstanceGroupMarshaller();

    public static InstanceGroupMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InstanceGroup instanceGroup, ProtocolMarshaller protocolMarshaller) {

        if (instanceGroup == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instanceGroup.getId(), ID_BINDING);
            protocolMarshaller.marshall(instanceGroup.getName(), NAME_BINDING);
            protocolMarshaller.marshall(instanceGroup.getMarket(), MARKET_BINDING);
            protocolMarshaller.marshall(instanceGroup.getInstanceGroupType(), INSTANCEGROUPTYPE_BINDING);
            protocolMarshaller.marshall(instanceGroup.getBidPrice(), BIDPRICE_BINDING);
            protocolMarshaller.marshall(instanceGroup.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(instanceGroup.getRequestedInstanceCount(), REQUESTEDINSTANCECOUNT_BINDING);
            protocolMarshaller.marshall(instanceGroup.getRunningInstanceCount(), RUNNINGINSTANCECOUNT_BINDING);
            protocolMarshaller.marshall(instanceGroup.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(instanceGroup.getConfigurations(), CONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(instanceGroup.getConfigurationsVersion(), CONFIGURATIONSVERSION_BINDING);
            protocolMarshaller.marshall(instanceGroup.getLastSuccessfullyAppliedConfigurations(), LASTSUCCESSFULLYAPPLIEDCONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(instanceGroup.getLastSuccessfullyAppliedConfigurationsVersion(), LASTSUCCESSFULLYAPPLIEDCONFIGURATIONSVERSION_BINDING);
            protocolMarshaller.marshall(instanceGroup.getEbsBlockDevices(), EBSBLOCKDEVICES_BINDING);
            protocolMarshaller.marshall(instanceGroup.getEbsOptimized(), EBSOPTIMIZED_BINDING);
            protocolMarshaller.marshall(instanceGroup.getShrinkPolicy(), SHRINKPOLICY_BINDING);
            protocolMarshaller.marshall(instanceGroup.getAutoScalingPolicy(), AUTOSCALINGPOLICY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
