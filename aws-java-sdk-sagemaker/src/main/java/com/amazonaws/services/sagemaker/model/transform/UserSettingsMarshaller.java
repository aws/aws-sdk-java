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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UserSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UserSettingsMarshaller {

    private static final MarshallingInfo<String> EXECUTIONROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionRole").build();
    private static final MarshallingInfo<List> SECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityGroups").build();
    private static final MarshallingInfo<StructuredPojo> SHARINGSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SharingSettings").build();
    private static final MarshallingInfo<StructuredPojo> JUPYTERSERVERAPPSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JupyterServerAppSettings").build();
    private static final MarshallingInfo<StructuredPojo> KERNELGATEWAYAPPSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KernelGatewayAppSettings").build();
    private static final MarshallingInfo<StructuredPojo> TENSORBOARDAPPSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TensorBoardAppSettings").build();

    private static final UserSettingsMarshaller instance = new UserSettingsMarshaller();

    public static UserSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UserSettings userSettings, ProtocolMarshaller protocolMarshaller) {

        if (userSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(userSettings.getExecutionRole(), EXECUTIONROLE_BINDING);
            protocolMarshaller.marshall(userSettings.getSecurityGroups(), SECURITYGROUPS_BINDING);
            protocolMarshaller.marshall(userSettings.getSharingSettings(), SHARINGSETTINGS_BINDING);
            protocolMarshaller.marshall(userSettings.getJupyterServerAppSettings(), JUPYTERSERVERAPPSETTINGS_BINDING);
            protocolMarshaller.marshall(userSettings.getKernelGatewayAppSettings(), KERNELGATEWAYAPPSETTINGS_BINDING);
            protocolMarshaller.marshall(userSettings.getTensorBoardAppSettings(), TENSORBOARDAPPSETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
