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
package com.amazonaws.services.finspace.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.finspace.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateKxClusterCodeConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateKxClusterCodeConfigurationRequestMarshaller {

    private static final MarshallingInfo<String> ENVIRONMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("environmentId").build();
    private static final MarshallingInfo<String> CLUSTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("clusterName").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<StructuredPojo> CODE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("code").build();
    private static final MarshallingInfo<String> INITIALIZATIONSCRIPT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("initializationScript").build();
    private static final MarshallingInfo<List> COMMANDLINEARGUMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("commandLineArguments").build();
    private static final MarshallingInfo<StructuredPojo> DEPLOYMENTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentConfiguration").build();

    private static final UpdateKxClusterCodeConfigurationRequestMarshaller instance = new UpdateKxClusterCodeConfigurationRequestMarshaller();

    public static UpdateKxClusterCodeConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateKxClusterCodeConfigurationRequest updateKxClusterCodeConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateKxClusterCodeConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateKxClusterCodeConfigurationRequest.getEnvironmentId(), ENVIRONMENTID_BINDING);
            protocolMarshaller.marshall(updateKxClusterCodeConfigurationRequest.getClusterName(), CLUSTERNAME_BINDING);
            protocolMarshaller.marshall(updateKxClusterCodeConfigurationRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(updateKxClusterCodeConfigurationRequest.getCode(), CODE_BINDING);
            protocolMarshaller.marshall(updateKxClusterCodeConfigurationRequest.getInitializationScript(), INITIALIZATIONSCRIPT_BINDING);
            protocolMarshaller.marshall(updateKxClusterCodeConfigurationRequest.getCommandLineArguments(), COMMANDLINEARGUMENTS_BINDING);
            protocolMarshaller.marshall(updateKxClusterCodeConfigurationRequest.getDeploymentConfiguration(), DEPLOYMENTCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
