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
package com.amazonaws.services.config.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RemediationConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RemediationConfigurationMarshaller {

    private static final MarshallingInfo<String> CONFIGRULENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigRuleName").build();
    private static final MarshallingInfo<String> TARGETTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetType").build();
    private static final MarshallingInfo<String> TARGETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TargetId").build();
    private static final MarshallingInfo<String> TARGETVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetVersion").build();
    private static final MarshallingInfo<Map> PARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Parameters").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceType").build();
    private static final MarshallingInfo<Boolean> AUTOMATIC_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Automatic").build();
    private static final MarshallingInfo<StructuredPojo> EXECUTIONCONTROLS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionControls").build();
    private static final MarshallingInfo<Integer> MAXIMUMAUTOMATICATTEMPTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumAutomaticAttempts").build();
    private static final MarshallingInfo<Long> RETRYATTEMPTSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetryAttemptSeconds").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> CREATEDBYSERVICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedByService").build();

    private static final RemediationConfigurationMarshaller instance = new RemediationConfigurationMarshaller();

    public static RemediationConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RemediationConfiguration remediationConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (remediationConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(remediationConfiguration.getConfigRuleName(), CONFIGRULENAME_BINDING);
            protocolMarshaller.marshall(remediationConfiguration.getTargetType(), TARGETTYPE_BINDING);
            protocolMarshaller.marshall(remediationConfiguration.getTargetId(), TARGETID_BINDING);
            protocolMarshaller.marshall(remediationConfiguration.getTargetVersion(), TARGETVERSION_BINDING);
            protocolMarshaller.marshall(remediationConfiguration.getParameters(), PARAMETERS_BINDING);
            protocolMarshaller.marshall(remediationConfiguration.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(remediationConfiguration.getAutomatic(), AUTOMATIC_BINDING);
            protocolMarshaller.marshall(remediationConfiguration.getExecutionControls(), EXECUTIONCONTROLS_BINDING);
            protocolMarshaller.marshall(remediationConfiguration.getMaximumAutomaticAttempts(), MAXIMUMAUTOMATICATTEMPTS_BINDING);
            protocolMarshaller.marshall(remediationConfiguration.getRetryAttemptSeconds(), RETRYATTEMPTSECONDS_BINDING);
            protocolMarshaller.marshall(remediationConfiguration.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(remediationConfiguration.getCreatedByService(), CREATEDBYSERVICE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
