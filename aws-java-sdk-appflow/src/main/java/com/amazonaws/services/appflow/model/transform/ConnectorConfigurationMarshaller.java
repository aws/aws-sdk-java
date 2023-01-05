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
package com.amazonaws.services.appflow.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConnectorConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConnectorConfigurationMarshaller {

    private static final MarshallingInfo<Boolean> CANUSEASSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("canUseAsSource").build();
    private static final MarshallingInfo<Boolean> CANUSEASDESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("canUseAsDestination").build();
    private static final MarshallingInfo<List> SUPPORTEDDESTINATIONCONNECTORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("supportedDestinationConnectors").build();
    private static final MarshallingInfo<List> SUPPORTEDSCHEDULINGFREQUENCIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("supportedSchedulingFrequencies").build();
    private static final MarshallingInfo<Boolean> ISPRIVATELINKENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isPrivateLinkEnabled").build();
    private static final MarshallingInfo<Boolean> ISPRIVATELINKENDPOINTURLREQUIRED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isPrivateLinkEndpointUrlRequired").build();
    private static final MarshallingInfo<List> SUPPORTEDTRIGGERTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("supportedTriggerTypes").build();
    private static final MarshallingInfo<StructuredPojo> CONNECTORMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorMetadata").build();
    private static final MarshallingInfo<String> CONNECTORTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorType").build();
    private static final MarshallingInfo<String> CONNECTORLABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorLabel").build();
    private static final MarshallingInfo<String> CONNECTORDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorDescription").build();
    private static final MarshallingInfo<String> CONNECTOROWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorOwner").build();
    private static final MarshallingInfo<String> CONNECTORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorName").build();
    private static final MarshallingInfo<String> CONNECTORVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorVersion").build();
    private static final MarshallingInfo<String> CONNECTORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorArn").build();
    private static final MarshallingInfo<List> CONNECTORMODES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorModes").build();
    private static final MarshallingInfo<StructuredPojo> AUTHENTICATIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authenticationConfig").build();
    private static final MarshallingInfo<List> CONNECTORRUNTIMESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorRuntimeSettings").build();
    private static final MarshallingInfo<List> SUPPORTEDAPIVERSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("supportedApiVersions").build();
    private static final MarshallingInfo<List> SUPPORTEDOPERATORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("supportedOperators").build();
    private static final MarshallingInfo<List> SUPPORTEDWRITEOPERATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("supportedWriteOperations").build();
    private static final MarshallingInfo<String> CONNECTORPROVISIONINGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorProvisioningType").build();
    private static final MarshallingInfo<StructuredPojo> CONNECTORPROVISIONINGCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorProvisioningConfig").build();
    private static final MarshallingInfo<String> LOGOURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("logoURL").build();
    private static final MarshallingInfo<java.util.Date> REGISTEREDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("registeredAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> REGISTEREDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("registeredBy").build();

    private static final ConnectorConfigurationMarshaller instance = new ConnectorConfigurationMarshaller();

    public static ConnectorConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConnectorConfiguration connectorConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (connectorConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(connectorConfiguration.getCanUseAsSource(), CANUSEASSOURCE_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getCanUseAsDestination(), CANUSEASDESTINATION_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getSupportedDestinationConnectors(), SUPPORTEDDESTINATIONCONNECTORS_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getSupportedSchedulingFrequencies(), SUPPORTEDSCHEDULINGFREQUENCIES_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getIsPrivateLinkEnabled(), ISPRIVATELINKENABLED_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getIsPrivateLinkEndpointUrlRequired(), ISPRIVATELINKENDPOINTURLREQUIRED_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getSupportedTriggerTypes(), SUPPORTEDTRIGGERTYPES_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getConnectorMetadata(), CONNECTORMETADATA_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getConnectorType(), CONNECTORTYPE_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getConnectorLabel(), CONNECTORLABEL_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getConnectorDescription(), CONNECTORDESCRIPTION_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getConnectorOwner(), CONNECTOROWNER_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getConnectorName(), CONNECTORNAME_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getConnectorVersion(), CONNECTORVERSION_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getConnectorArn(), CONNECTORARN_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getConnectorModes(), CONNECTORMODES_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getAuthenticationConfig(), AUTHENTICATIONCONFIG_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getConnectorRuntimeSettings(), CONNECTORRUNTIMESETTINGS_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getSupportedApiVersions(), SUPPORTEDAPIVERSIONS_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getSupportedOperators(), SUPPORTEDOPERATORS_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getSupportedWriteOperations(), SUPPORTEDWRITEOPERATIONS_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getConnectorProvisioningType(), CONNECTORPROVISIONINGTYPE_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getConnectorProvisioningConfig(), CONNECTORPROVISIONINGCONFIG_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getLogoURL(), LOGOURL_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getRegisteredAt(), REGISTEREDAT_BINDING);
            protocolMarshaller.marshall(connectorConfiguration.getRegisteredBy(), REGISTEREDBY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
