/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lambda.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FunctionConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FunctionConfigurationMarshaller {

    private static final MarshallingInfo<String> FUNCTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FunctionName").build();
    private static final MarshallingInfo<String> FUNCTIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FunctionArn").build();
    private static final MarshallingInfo<String> RUNTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Runtime").build();
    private static final MarshallingInfo<String> ROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Role").build();
    private static final MarshallingInfo<String> HANDLER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Handler").build();
    private static final MarshallingInfo<Long> CODESIZE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CodeSize").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<Integer> TIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Timeout").build();
    private static final MarshallingInfo<Integer> MEMORYSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MemorySize").build();
    private static final MarshallingInfo<String> LASTMODIFIED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModified").build();
    private static final MarshallingInfo<String> CODESHA256_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CodeSha256").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Version").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcConfig").build();
    private static final MarshallingInfo<StructuredPojo> DEADLETTERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeadLetterConfig").build();
    private static final MarshallingInfo<StructuredPojo> ENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Environment").build();
    private static final MarshallingInfo<String> KMSKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KMSKeyArn").build();
    private static final MarshallingInfo<StructuredPojo> TRACINGCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TracingConfig").build();
    private static final MarshallingInfo<String> MASTERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MasterArn").build();
    private static final MarshallingInfo<String> REVISIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RevisionId").build();
    private static final MarshallingInfo<List> LAYERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Layers").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<String> STATEREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StateReason").build();
    private static final MarshallingInfo<String> STATEREASONCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StateReasonCode").build();
    private static final MarshallingInfo<String> LASTUPDATESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdateStatus").build();
    private static final MarshallingInfo<String> LASTUPDATESTATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdateStatusReason").build();
    private static final MarshallingInfo<String> LASTUPDATESTATUSREASONCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdateStatusReasonCode").build();

    private static final FunctionConfigurationMarshaller instance = new FunctionConfigurationMarshaller();

    public static FunctionConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FunctionConfiguration functionConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (functionConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(functionConfiguration.getFunctionName(), FUNCTIONNAME_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getFunctionArn(), FUNCTIONARN_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getRuntime(), RUNTIME_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getRole(), ROLE_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getHandler(), HANDLER_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getCodeSize(), CODESIZE_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getTimeout(), TIMEOUT_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getMemorySize(), MEMORYSIZE_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getLastModified(), LASTMODIFIED_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getCodeSha256(), CODESHA256_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getVpcConfig(), VPCCONFIG_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getDeadLetterConfig(), DEADLETTERCONFIG_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getEnvironment(), ENVIRONMENT_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getKMSKeyArn(), KMSKEYARN_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getTracingConfig(), TRACINGCONFIG_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getMasterArn(), MASTERARN_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getRevisionId(), REVISIONID_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getLayers(), LAYERS_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getState(), STATE_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getStateReason(), STATEREASON_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getStateReasonCode(), STATEREASONCODE_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getLastUpdateStatus(), LASTUPDATESTATUS_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getLastUpdateStatusReason(), LASTUPDATESTATUSREASON_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getLastUpdateStatusReasonCode(), LASTUPDATESTATUSREASONCODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
