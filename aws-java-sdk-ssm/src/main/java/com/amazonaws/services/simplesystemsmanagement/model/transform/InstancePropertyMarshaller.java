/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InstancePropertyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstancePropertyMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceId").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceType").build();
    private static final MarshallingInfo<String> INSTANCEROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceRole").build();
    private static final MarshallingInfo<String> KEYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KeyName").build();
    private static final MarshallingInfo<String> INSTANCESTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceState").build();
    private static final MarshallingInfo<String> ARCHITECTURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Architecture").build();
    private static final MarshallingInfo<String> IPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IPAddress").build();
    private static final MarshallingInfo<java.util.Date> LAUNCHTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LaunchTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> PINGSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PingStatus").build();
    private static final MarshallingInfo<java.util.Date> LASTPINGDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastPingDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> AGENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AgentVersion").build();
    private static final MarshallingInfo<String> PLATFORMTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlatformType").build();
    private static final MarshallingInfo<String> PLATFORMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlatformName").build();
    private static final MarshallingInfo<String> PLATFORMVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlatformVersion").build();
    private static final MarshallingInfo<String> ACTIVATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActivationId").build();
    private static final MarshallingInfo<String> IAMROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IamRole").build();
    private static final MarshallingInfo<java.util.Date> REGISTRATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegistrationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceType").build();
    private static final MarshallingInfo<String> COMPUTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComputerName").build();
    private static final MarshallingInfo<String> ASSOCIATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationStatus").build();
    private static final MarshallingInfo<java.util.Date> LASTASSOCIATIONEXECUTIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastAssociationExecutionDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTSUCCESSFULASSOCIATIONEXECUTIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastSuccessfulAssociationExecutionDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> ASSOCIATIONOVERVIEW_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationOverview").build();
    private static final MarshallingInfo<String> SOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SourceId").build();
    private static final MarshallingInfo<String> SOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceType").build();

    private static final InstancePropertyMarshaller instance = new InstancePropertyMarshaller();

    public static InstancePropertyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InstanceProperty instanceProperty, ProtocolMarshaller protocolMarshaller) {

        if (instanceProperty == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instanceProperty.getName(), NAME_BINDING);
            protocolMarshaller.marshall(instanceProperty.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(instanceProperty.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(instanceProperty.getInstanceRole(), INSTANCEROLE_BINDING);
            protocolMarshaller.marshall(instanceProperty.getKeyName(), KEYNAME_BINDING);
            protocolMarshaller.marshall(instanceProperty.getInstanceState(), INSTANCESTATE_BINDING);
            protocolMarshaller.marshall(instanceProperty.getArchitecture(), ARCHITECTURE_BINDING);
            protocolMarshaller.marshall(instanceProperty.getIPAddress(), IPADDRESS_BINDING);
            protocolMarshaller.marshall(instanceProperty.getLaunchTime(), LAUNCHTIME_BINDING);
            protocolMarshaller.marshall(instanceProperty.getPingStatus(), PINGSTATUS_BINDING);
            protocolMarshaller.marshall(instanceProperty.getLastPingDateTime(), LASTPINGDATETIME_BINDING);
            protocolMarshaller.marshall(instanceProperty.getAgentVersion(), AGENTVERSION_BINDING);
            protocolMarshaller.marshall(instanceProperty.getPlatformType(), PLATFORMTYPE_BINDING);
            protocolMarshaller.marshall(instanceProperty.getPlatformName(), PLATFORMNAME_BINDING);
            protocolMarshaller.marshall(instanceProperty.getPlatformVersion(), PLATFORMVERSION_BINDING);
            protocolMarshaller.marshall(instanceProperty.getActivationId(), ACTIVATIONID_BINDING);
            protocolMarshaller.marshall(instanceProperty.getIamRole(), IAMROLE_BINDING);
            protocolMarshaller.marshall(instanceProperty.getRegistrationDate(), REGISTRATIONDATE_BINDING);
            protocolMarshaller.marshall(instanceProperty.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(instanceProperty.getComputerName(), COMPUTERNAME_BINDING);
            protocolMarshaller.marshall(instanceProperty.getAssociationStatus(), ASSOCIATIONSTATUS_BINDING);
            protocolMarshaller.marshall(instanceProperty.getLastAssociationExecutionDate(), LASTASSOCIATIONEXECUTIONDATE_BINDING);
            protocolMarshaller.marshall(instanceProperty.getLastSuccessfulAssociationExecutionDate(), LASTSUCCESSFULASSOCIATIONEXECUTIONDATE_BINDING);
            protocolMarshaller.marshall(instanceProperty.getAssociationOverview(), ASSOCIATIONOVERVIEW_BINDING);
            protocolMarshaller.marshall(instanceProperty.getSourceId(), SOURCEID_BINDING);
            protocolMarshaller.marshall(instanceProperty.getSourceType(), SOURCETYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
