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
 * CreateFleetRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateFleetRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
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
    private static final MarshallingInfo<String> EC2INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EC2InstanceType").build();
    private static final MarshallingInfo<List> EC2INBOUNDPERMISSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EC2InboundPermissions").build();
    private static final MarshallingInfo<String> NEWGAMESESSIONPROTECTIONPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NewGameSessionProtectionPolicy").build();
    private static final MarshallingInfo<StructuredPojo> RUNTIMECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuntimeConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCECREATIONLIMITPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceCreationLimitPolicy").build();
    private static final MarshallingInfo<List> METRICGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MetricGroups").build();
    private static final MarshallingInfo<String> PEERVPCAWSACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PeerVpcAwsAccountId").build();
    private static final MarshallingInfo<String> PEERVPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PeerVpcId").build();
    private static final MarshallingInfo<String> FLEETTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FleetType").build();
    private static final MarshallingInfo<String> INSTANCEROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceRoleArn").build();

    private static final CreateFleetRequestMarshaller instance = new CreateFleetRequestMarshaller();

    public static CreateFleetRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateFleetRequest createFleetRequest, ProtocolMarshaller protocolMarshaller) {

        if (createFleetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createFleetRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getBuildId(), BUILDID_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getScriptId(), SCRIPTID_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getServerLaunchPath(), SERVERLAUNCHPATH_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getServerLaunchParameters(), SERVERLAUNCHPARAMETERS_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getLogPaths(), LOGPATHS_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getEC2InstanceType(), EC2INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getEC2InboundPermissions(), EC2INBOUNDPERMISSIONS_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getNewGameSessionProtectionPolicy(), NEWGAMESESSIONPROTECTIONPOLICY_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getRuntimeConfiguration(), RUNTIMECONFIGURATION_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getResourceCreationLimitPolicy(), RESOURCECREATIONLIMITPOLICY_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getMetricGroups(), METRICGROUPS_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getPeerVpcAwsAccountId(), PEERVPCAWSACCOUNTID_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getPeerVpcId(), PEERVPCID_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getFleetType(), FLEETTYPE_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getInstanceRoleArn(), INSTANCEROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
