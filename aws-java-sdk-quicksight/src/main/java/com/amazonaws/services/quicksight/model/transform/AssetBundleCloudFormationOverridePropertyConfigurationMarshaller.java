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
package com.amazonaws.services.quicksight.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AssetBundleCloudFormationOverridePropertyConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssetBundleCloudFormationOverridePropertyConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> RESOURCEIDOVERRIDECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceIdOverrideConfiguration").build();
    private static final MarshallingInfo<List> VPCCONNECTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VPCConnections").build();
    private static final MarshallingInfo<List> REFRESHSCHEDULES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RefreshSchedules").build();
    private static final MarshallingInfo<List> DATASOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DataSources").build();
    private static final MarshallingInfo<List> DATASETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DataSets").build();
    private static final MarshallingInfo<List> THEMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Themes").build();
    private static final MarshallingInfo<List> ANALYSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Analyses").build();
    private static final MarshallingInfo<List> DASHBOARDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Dashboards").build();

    private static final AssetBundleCloudFormationOverridePropertyConfigurationMarshaller instance = new AssetBundleCloudFormationOverridePropertyConfigurationMarshaller();

    public static AssetBundleCloudFormationOverridePropertyConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssetBundleCloudFormationOverridePropertyConfiguration assetBundleCloudFormationOverridePropertyConfiguration,
            ProtocolMarshaller protocolMarshaller) {

        if (assetBundleCloudFormationOverridePropertyConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(assetBundleCloudFormationOverridePropertyConfiguration.getResourceIdOverrideConfiguration(),
                    RESOURCEIDOVERRIDECONFIGURATION_BINDING);
            protocolMarshaller.marshall(assetBundleCloudFormationOverridePropertyConfiguration.getVPCConnections(), VPCCONNECTIONS_BINDING);
            protocolMarshaller.marshall(assetBundleCloudFormationOverridePropertyConfiguration.getRefreshSchedules(), REFRESHSCHEDULES_BINDING);
            protocolMarshaller.marshall(assetBundleCloudFormationOverridePropertyConfiguration.getDataSources(), DATASOURCES_BINDING);
            protocolMarshaller.marshall(assetBundleCloudFormationOverridePropertyConfiguration.getDataSets(), DATASETS_BINDING);
            protocolMarshaller.marshall(assetBundleCloudFormationOverridePropertyConfiguration.getThemes(), THEMES_BINDING);
            protocolMarshaller.marshall(assetBundleCloudFormationOverridePropertyConfiguration.getAnalyses(), ANALYSES_BINDING);
            protocolMarshaller.marshall(assetBundleCloudFormationOverridePropertyConfiguration.getDashboards(), DASHBOARDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
