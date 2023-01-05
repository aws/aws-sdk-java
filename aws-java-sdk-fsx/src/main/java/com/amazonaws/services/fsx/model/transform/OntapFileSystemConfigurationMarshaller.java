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
package com.amazonaws.services.fsx.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fsx.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OntapFileSystemConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OntapFileSystemConfigurationMarshaller {

    private static final MarshallingInfo<Integer> AUTOMATICBACKUPRETENTIONDAYS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutomaticBackupRetentionDays").build();
    private static final MarshallingInfo<String> DAILYAUTOMATICBACKUPSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DailyAutomaticBackupStartTime").build();
    private static final MarshallingInfo<String> DEPLOYMENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentType").build();
    private static final MarshallingInfo<String> ENDPOINTIPADDRESSRANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointIpAddressRange").build();
    private static final MarshallingInfo<StructuredPojo> ENDPOINTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Endpoints").build();
    private static final MarshallingInfo<StructuredPojo> DISKIOPSCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DiskIopsConfiguration").build();
    private static final MarshallingInfo<String> PREFERREDSUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreferredSubnetId").build();
    private static final MarshallingInfo<List> ROUTETABLEIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RouteTableIds").build();
    private static final MarshallingInfo<Integer> THROUGHPUTCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThroughputCapacity").build();
    private static final MarshallingInfo<String> WEEKLYMAINTENANCESTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WeeklyMaintenanceStartTime").build();

    private static final OntapFileSystemConfigurationMarshaller instance = new OntapFileSystemConfigurationMarshaller();

    public static OntapFileSystemConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OntapFileSystemConfiguration ontapFileSystemConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (ontapFileSystemConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ontapFileSystemConfiguration.getAutomaticBackupRetentionDays(), AUTOMATICBACKUPRETENTIONDAYS_BINDING);
            protocolMarshaller.marshall(ontapFileSystemConfiguration.getDailyAutomaticBackupStartTime(), DAILYAUTOMATICBACKUPSTARTTIME_BINDING);
            protocolMarshaller.marshall(ontapFileSystemConfiguration.getDeploymentType(), DEPLOYMENTTYPE_BINDING);
            protocolMarshaller.marshall(ontapFileSystemConfiguration.getEndpointIpAddressRange(), ENDPOINTIPADDRESSRANGE_BINDING);
            protocolMarshaller.marshall(ontapFileSystemConfiguration.getEndpoints(), ENDPOINTS_BINDING);
            protocolMarshaller.marshall(ontapFileSystemConfiguration.getDiskIopsConfiguration(), DISKIOPSCONFIGURATION_BINDING);
            protocolMarshaller.marshall(ontapFileSystemConfiguration.getPreferredSubnetId(), PREFERREDSUBNETID_BINDING);
            protocolMarshaller.marshall(ontapFileSystemConfiguration.getRouteTableIds(), ROUTETABLEIDS_BINDING);
            protocolMarshaller.marshall(ontapFileSystemConfiguration.getThroughputCapacity(), THROUGHPUTCAPACITY_BINDING);
            protocolMarshaller.marshall(ontapFileSystemConfiguration.getWeeklyMaintenanceStartTime(), WEEKLYMAINTENANCESTARTTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
