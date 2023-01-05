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
 * AwsEcsClusterDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEcsClusterDetailsMarshaller {

    private static final MarshallingInfo<String> CLUSTERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterArn").build();
    private static final MarshallingInfo<Integer> ACTIVESERVICESCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActiveServicesCount").build();
    private static final MarshallingInfo<List> CAPACITYPROVIDERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CapacityProviders").build();
    private static final MarshallingInfo<List> CLUSTERSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterSettings").build();
    private static final MarshallingInfo<StructuredPojo> CONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Configuration").build();
    private static final MarshallingInfo<List> DEFAULTCAPACITYPROVIDERSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultCapacityProviderStrategy").build();
    private static final MarshallingInfo<String> CLUSTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterName").build();
    private static final MarshallingInfo<Integer> REGISTEREDCONTAINERINSTANCESCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegisteredContainerInstancesCount").build();
    private static final MarshallingInfo<Integer> RUNNINGTASKSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RunningTasksCount").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();

    private static final AwsEcsClusterDetailsMarshaller instance = new AwsEcsClusterDetailsMarshaller();

    public static AwsEcsClusterDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEcsClusterDetails awsEcsClusterDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEcsClusterDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEcsClusterDetails.getClusterArn(), CLUSTERARN_BINDING);
            protocolMarshaller.marshall(awsEcsClusterDetails.getActiveServicesCount(), ACTIVESERVICESCOUNT_BINDING);
            protocolMarshaller.marshall(awsEcsClusterDetails.getCapacityProviders(), CAPACITYPROVIDERS_BINDING);
            protocolMarshaller.marshall(awsEcsClusterDetails.getClusterSettings(), CLUSTERSETTINGS_BINDING);
            protocolMarshaller.marshall(awsEcsClusterDetails.getConfiguration(), CONFIGURATION_BINDING);
            protocolMarshaller.marshall(awsEcsClusterDetails.getDefaultCapacityProviderStrategy(), DEFAULTCAPACITYPROVIDERSTRATEGY_BINDING);
            protocolMarshaller.marshall(awsEcsClusterDetails.getClusterName(), CLUSTERNAME_BINDING);
            protocolMarshaller.marshall(awsEcsClusterDetails.getRegisteredContainerInstancesCount(), REGISTEREDCONTAINERINSTANCESCOUNT_BINDING);
            protocolMarshaller.marshall(awsEcsClusterDetails.getRunningTasksCount(), RUNNINGTASKSCOUNT_BINDING);
            protocolMarshaller.marshall(awsEcsClusterDetails.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
