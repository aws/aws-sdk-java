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
 * ZeppelinApplicationConfigurationUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ZeppelinApplicationConfigurationUpdateMarshaller {

    private static final MarshallingInfo<StructuredPojo> MONITORINGCONFIGURATIONUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoringConfigurationUpdate").build();
    private static final MarshallingInfo<StructuredPojo> CATALOGCONFIGURATIONUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CatalogConfigurationUpdate").build();
    private static final MarshallingInfo<StructuredPojo> DEPLOYASAPPLICATIONCONFIGURATIONUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeployAsApplicationConfigurationUpdate").build();
    private static final MarshallingInfo<List> CUSTOMARTIFACTSCONFIGURATIONUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomArtifactsConfigurationUpdate").build();

    private static final ZeppelinApplicationConfigurationUpdateMarshaller instance = new ZeppelinApplicationConfigurationUpdateMarshaller();

    public static ZeppelinApplicationConfigurationUpdateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ZeppelinApplicationConfigurationUpdate zeppelinApplicationConfigurationUpdate, ProtocolMarshaller protocolMarshaller) {

        if (zeppelinApplicationConfigurationUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(zeppelinApplicationConfigurationUpdate.getMonitoringConfigurationUpdate(), MONITORINGCONFIGURATIONUPDATE_BINDING);
            protocolMarshaller.marshall(zeppelinApplicationConfigurationUpdate.getCatalogConfigurationUpdate(), CATALOGCONFIGURATIONUPDATE_BINDING);
            protocolMarshaller.marshall(zeppelinApplicationConfigurationUpdate.getDeployAsApplicationConfigurationUpdate(),
                    DEPLOYASAPPLICATIONCONFIGURATIONUPDATE_BINDING);
            protocolMarshaller.marshall(zeppelinApplicationConfigurationUpdate.getCustomArtifactsConfigurationUpdate(),
                    CUSTOMARTIFACTSCONFIGURATIONUPDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
