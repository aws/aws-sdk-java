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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CanvasAppSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CanvasAppSettingsMarshaller {

    private static final MarshallingInfo<StructuredPojo> TIMESERIESFORECASTINGSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeSeriesForecastingSettings").build();
    private static final MarshallingInfo<StructuredPojo> MODELREGISTERSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelRegisterSettings").build();
    private static final MarshallingInfo<StructuredPojo> WORKSPACESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkspaceSettings").build();
    private static final MarshallingInfo<List> IDENTITYPROVIDEROAUTHSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentityProviderOAuthSettings").build();
    private static final MarshallingInfo<StructuredPojo> DIRECTDEPLOYSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DirectDeploySettings").build();
    private static final MarshallingInfo<StructuredPojo> KENDRASETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KendraSettings").build();
    private static final MarshallingInfo<StructuredPojo> GENERATIVEAISETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GenerativeAiSettings").build();

    private static final CanvasAppSettingsMarshaller instance = new CanvasAppSettingsMarshaller();

    public static CanvasAppSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CanvasAppSettings canvasAppSettings, ProtocolMarshaller protocolMarshaller) {

        if (canvasAppSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(canvasAppSettings.getTimeSeriesForecastingSettings(), TIMESERIESFORECASTINGSETTINGS_BINDING);
            protocolMarshaller.marshall(canvasAppSettings.getModelRegisterSettings(), MODELREGISTERSETTINGS_BINDING);
            protocolMarshaller.marshall(canvasAppSettings.getWorkspaceSettings(), WORKSPACESETTINGS_BINDING);
            protocolMarshaller.marshall(canvasAppSettings.getIdentityProviderOAuthSettings(), IDENTITYPROVIDEROAUTHSETTINGS_BINDING);
            protocolMarshaller.marshall(canvasAppSettings.getDirectDeploySettings(), DIRECTDEPLOYSETTINGS_BINDING);
            protocolMarshaller.marshall(canvasAppSettings.getKendraSettings(), KENDRASETTINGS_BINDING);
            protocolMarshaller.marshall(canvasAppSettings.getGenerativeAiSettings(), GENERATIVEAISETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
