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
package com.amazonaws.services.gamelift.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamelift.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FleetAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FleetAttributesMarshaller {

    private static final MarshallingInfo<String> FLEETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FleetId").build();
    private static final MarshallingInfo<String> FLEETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FleetArn").build();
    private static final MarshallingInfo<String> FLEETTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FleetType").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceType").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> TERMINATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TerminationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> BUILDID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BuildId").build();
    private static final MarshallingInfo<String> SCRIPTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ScriptId").build();
    private static final MarshallingInfo<String> SERVERLAUNCHPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerLaunchPath").build();
    private static final MarshallingInfo<String> SERVERLAUNCHPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerLaunchParameters").build();
    private static final MarshallingInfo<List> LOGPATHS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LogPaths").build();
    private static final MarshallingInfo<String> NEWGAMESESSIONPROTECTIONPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NewGameSessionProtectionPolicy").build();
    private static final MarshallingInfo<String> OPERATINGSYSTEM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OperatingSystem").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCECREATIONLIMITPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceCreationLimitPolicy").build();
    private static final MarshallingInfo<List> METRICGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MetricGroups").build();
    private static final MarshallingInfo<List> STOPPEDACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StoppedActions").build();
    private static final MarshallingInfo<String> INSTANCEROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceRoleArn").build();

    private static final FleetAttributesMarshaller instance = new FleetAttributesMarshaller();

    public static FleetAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FleetAttributes fleetAttributes, ProtocolMarshaller protocolMarshaller) {

        if (fleetAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fleetAttributes.getFleetId(), FLEETID_BINDING);
            protocolMarshaller.marshall(fleetAttributes.getFleetArn(), FLEETARN_BINDING);
            protocolMarshaller.marshall(fleetAttributes.getFleetType(), FLEETTYPE_BINDING);
            protocolMarshaller.marshall(fleetAttributes.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(fleetAttributes.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(fleetAttributes.getName(), NAME_BINDING);
            protocolMarshaller.marshall(fleetAttributes.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(fleetAttributes.getTerminationTime(), TERMINATIONTIME_BINDING);
            protocolMarshaller.marshall(fleetAttributes.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(fleetAttributes.getBuildId(), BUILDID_BINDING);
            protocolMarshaller.marshall(fleetAttributes.getScriptId(), SCRIPTID_BINDING);
            protocolMarshaller.marshall(fleetAttributes.getServerLaunchPath(), SERVERLAUNCHPATH_BINDING);
            protocolMarshaller.marshall(fleetAttributes.getServerLaunchParameters(), SERVERLAUNCHPARAMETERS_BINDING);
            protocolMarshaller.marshall(fleetAttributes.getLogPaths(), LOGPATHS_BINDING);
            protocolMarshaller.marshall(fleetAttributes.getNewGameSessionProtectionPolicy(), NEWGAMESESSIONPROTECTIONPOLICY_BINDING);
            protocolMarshaller.marshall(fleetAttributes.getOperatingSystem(), OPERATINGSYSTEM_BINDING);
            protocolMarshaller.marshall(fleetAttributes.getResourceCreationLimitPolicy(), RESOURCECREATIONLIMITPOLICY_BINDING);
            protocolMarshaller.marshall(fleetAttributes.getMetricGroups(), METRICGROUPS_BINDING);
            protocolMarshaller.marshall(fleetAttributes.getStoppedActions(), STOPPEDACTIONS_BINDING);
            protocolMarshaller.marshall(fleetAttributes.getInstanceRoleArn(), INSTANCEROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
