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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DefaultSpaceSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DefaultSpaceSettingsMarshaller {

    private static final MarshallingInfo<String> EXECUTIONROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionRole").build();
    private static final MarshallingInfo<List> SECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityGroups").build();
    private static final MarshallingInfo<StructuredPojo> JUPYTERSERVERAPPSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JupyterServerAppSettings").build();
    private static final MarshallingInfo<StructuredPojo> KERNELGATEWAYAPPSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KernelGatewayAppSettings").build();

    private static final DefaultSpaceSettingsMarshaller instance = new DefaultSpaceSettingsMarshaller();

    public static DefaultSpaceSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DefaultSpaceSettings defaultSpaceSettings, ProtocolMarshaller protocolMarshaller) {

        if (defaultSpaceSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(defaultSpaceSettings.getExecutionRole(), EXECUTIONROLE_BINDING);
            protocolMarshaller.marshall(defaultSpaceSettings.getSecurityGroups(), SECURITYGROUPS_BINDING);
            protocolMarshaller.marshall(defaultSpaceSettings.getJupyterServerAppSettings(), JUPYTERSERVERAPPSETTINGS_BINDING);
            protocolMarshaller.marshall(defaultSpaceSettings.getKernelGatewayAppSettings(), KERNELGATEWAYAPPSETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
