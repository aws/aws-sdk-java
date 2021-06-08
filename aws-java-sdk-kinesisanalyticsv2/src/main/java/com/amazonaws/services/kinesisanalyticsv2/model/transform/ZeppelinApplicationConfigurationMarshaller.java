/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisanalyticsv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalyticsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ZeppelinApplicationConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ZeppelinApplicationConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> MONITORINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoringConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> CATALOGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CatalogConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> DEPLOYASAPPLICATIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeployAsApplicationConfiguration").build();
    private static final MarshallingInfo<List> CUSTOMARTIFACTSCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomArtifactsConfiguration").build();

    private static final ZeppelinApplicationConfigurationMarshaller instance = new ZeppelinApplicationConfigurationMarshaller();

    public static ZeppelinApplicationConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ZeppelinApplicationConfiguration zeppelinApplicationConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (zeppelinApplicationConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(zeppelinApplicationConfiguration.getMonitoringConfiguration(), MONITORINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(zeppelinApplicationConfiguration.getCatalogConfiguration(), CATALOGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(zeppelinApplicationConfiguration.getDeployAsApplicationConfiguration(), DEPLOYASAPPLICATIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(zeppelinApplicationConfiguration.getCustomArtifactsConfiguration(), CUSTOMARTIFACTSCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
