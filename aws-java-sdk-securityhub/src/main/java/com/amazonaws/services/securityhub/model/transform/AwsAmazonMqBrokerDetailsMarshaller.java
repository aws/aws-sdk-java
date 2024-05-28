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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsAmazonMqBrokerDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsAmazonMqBrokerDetailsMarshaller {

    private static final MarshallingInfo<String> AUTHENTICATIONSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthenticationStrategy").build();
    private static final MarshallingInfo<Boolean> AUTOMINORVERSIONUPGRADE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoMinorVersionUpgrade").build();
    private static final MarshallingInfo<String> BROKERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BrokerArn").build();
    private static final MarshallingInfo<String> BROKERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BrokerName").build();
    private static final MarshallingInfo<String> DEPLOYMENTMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentMode").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTIONOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionOptions").build();
    private static final MarshallingInfo<String> ENGINETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineType").build();
    private static final MarshallingInfo<String> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineVersion").build();
    private static final MarshallingInfo<String> HOSTINSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HostInstanceType").build();
    private static final MarshallingInfo<String> BROKERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BrokerId").build();
    private static final MarshallingInfo<StructuredPojo> LDAPSERVERMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LdapServerMetadata").build();
    private static final MarshallingInfo<StructuredPojo> LOGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Logs").build();
    private static final MarshallingInfo<StructuredPojo> MAINTENANCEWINDOWSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaintenanceWindowStartTime").build();
    private static final MarshallingInfo<Boolean> PUBLICLYACCESSIBLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PubliclyAccessible").build();
    private static final MarshallingInfo<List> SECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityGroups").build();
    private static final MarshallingInfo<String> STORAGETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageType").build();
    private static final MarshallingInfo<List> SUBNETIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SubnetIds").build();
    private static final MarshallingInfo<List> USERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Users").build();

    private static final AwsAmazonMqBrokerDetailsMarshaller instance = new AwsAmazonMqBrokerDetailsMarshaller();

    public static AwsAmazonMqBrokerDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsAmazonMqBrokerDetails awsAmazonMqBrokerDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsAmazonMqBrokerDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsAmazonMqBrokerDetails.getAuthenticationStrategy(), AUTHENTICATIONSTRATEGY_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerDetails.getAutoMinorVersionUpgrade(), AUTOMINORVERSIONUPGRADE_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerDetails.getBrokerArn(), BROKERARN_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerDetails.getBrokerName(), BROKERNAME_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerDetails.getDeploymentMode(), DEPLOYMENTMODE_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerDetails.getEncryptionOptions(), ENCRYPTIONOPTIONS_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerDetails.getEngineType(), ENGINETYPE_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerDetails.getEngineVersion(), ENGINEVERSION_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerDetails.getHostInstanceType(), HOSTINSTANCETYPE_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerDetails.getBrokerId(), BROKERID_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerDetails.getLdapServerMetadata(), LDAPSERVERMETADATA_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerDetails.getLogs(), LOGS_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerDetails.getMaintenanceWindowStartTime(), MAINTENANCEWINDOWSTARTTIME_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerDetails.getPubliclyAccessible(), PUBLICLYACCESSIBLE_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerDetails.getSecurityGroups(), SECURITYGROUPS_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerDetails.getStorageType(), STORAGETYPE_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerDetails.getSubnetIds(), SUBNETIDS_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerDetails.getUsers(), USERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
