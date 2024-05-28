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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConfigurationPolicyAssociationSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConfigurationPolicyAssociationSummaryMarshaller {

    private static final MarshallingInfo<String> CONFIGURATIONPOLICYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigurationPolicyId").build();
    private static final MarshallingInfo<String> TARGETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TargetId").build();
    private static final MarshallingInfo<String> TARGETTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetType").build();
    private static final MarshallingInfo<String> ASSOCIATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationType").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdatedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> ASSOCIATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationStatus").build();
    private static final MarshallingInfo<String> ASSOCIATIONSTATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationStatusMessage").build();

    private static final ConfigurationPolicyAssociationSummaryMarshaller instance = new ConfigurationPolicyAssociationSummaryMarshaller();

    public static ConfigurationPolicyAssociationSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConfigurationPolicyAssociationSummary configurationPolicyAssociationSummary, ProtocolMarshaller protocolMarshaller) {

        if (configurationPolicyAssociationSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(configurationPolicyAssociationSummary.getConfigurationPolicyId(), CONFIGURATIONPOLICYID_BINDING);
            protocolMarshaller.marshall(configurationPolicyAssociationSummary.getTargetId(), TARGETID_BINDING);
            protocolMarshaller.marshall(configurationPolicyAssociationSummary.getTargetType(), TARGETTYPE_BINDING);
            protocolMarshaller.marshall(configurationPolicyAssociationSummary.getAssociationType(), ASSOCIATIONTYPE_BINDING);
            protocolMarshaller.marshall(configurationPolicyAssociationSummary.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(configurationPolicyAssociationSummary.getAssociationStatus(), ASSOCIATIONSTATUS_BINDING);
            protocolMarshaller.marshall(configurationPolicyAssociationSummary.getAssociationStatusMessage(), ASSOCIATIONSTATUSMESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
