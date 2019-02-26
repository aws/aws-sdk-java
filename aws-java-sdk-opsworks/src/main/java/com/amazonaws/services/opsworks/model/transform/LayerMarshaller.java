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
package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LayerMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LayerMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> STACKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StackId").build();
    private static final MarshallingInfo<String> LAYERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LayerId").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> SHORTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Shortname").build();
    private static final MarshallingInfo<Map> ATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Attributes").build();
    private static final MarshallingInfo<StructuredPojo> CLOUDWATCHLOGSCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchLogsConfiguration").build();
    private static final MarshallingInfo<String> CUSTOMINSTANCEPROFILEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomInstanceProfileArn").build();
    private static final MarshallingInfo<String> CUSTOMJSON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomJson").build();
    private static final MarshallingInfo<List> CUSTOMSECURITYGROUPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomSecurityGroupIds").build();
    private static final MarshallingInfo<List> DEFAULTSECURITYGROUPNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultSecurityGroupNames").build();
    private static final MarshallingInfo<List> PACKAGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Packages").build();
    private static final MarshallingInfo<List> VOLUMECONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VolumeConfigurations").build();
    private static final MarshallingInfo<Boolean> ENABLEAUTOHEALING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableAutoHealing").build();
    private static final MarshallingInfo<Boolean> AUTOASSIGNELASTICIPS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoAssignElasticIps").build();
    private static final MarshallingInfo<Boolean> AUTOASSIGNPUBLICIPS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoAssignPublicIps").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTRECIPES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultRecipes").build();
    private static final MarshallingInfo<StructuredPojo> CUSTOMRECIPES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomRecipes").build();
    private static final MarshallingInfo<String> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CreatedAt").build();
    private static final MarshallingInfo<Boolean> INSTALLUPDATESONBOOT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstallUpdatesOnBoot").build();
    private static final MarshallingInfo<Boolean> USEEBSOPTIMIZEDINSTANCES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UseEbsOptimizedInstances").build();
    private static final MarshallingInfo<StructuredPojo> LIFECYCLEEVENTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LifecycleEventConfiguration").build();

    private static final LayerMarshaller instance = new LayerMarshaller();

    public static LayerMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Layer layer, ProtocolMarshaller protocolMarshaller) {

        if (layer == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(layer.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(layer.getStackId(), STACKID_BINDING);
            protocolMarshaller.marshall(layer.getLayerId(), LAYERID_BINDING);
            protocolMarshaller.marshall(layer.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(layer.getName(), NAME_BINDING);
            protocolMarshaller.marshall(layer.getShortname(), SHORTNAME_BINDING);
            protocolMarshaller.marshall(layer.getAttributes(), ATTRIBUTES_BINDING);
            protocolMarshaller.marshall(layer.getCloudWatchLogsConfiguration(), CLOUDWATCHLOGSCONFIGURATION_BINDING);
            protocolMarshaller.marshall(layer.getCustomInstanceProfileArn(), CUSTOMINSTANCEPROFILEARN_BINDING);
            protocolMarshaller.marshall(layer.getCustomJson(), CUSTOMJSON_BINDING);
            protocolMarshaller.marshall(layer.getCustomSecurityGroupIds(), CUSTOMSECURITYGROUPIDS_BINDING);
            protocolMarshaller.marshall(layer.getDefaultSecurityGroupNames(), DEFAULTSECURITYGROUPNAMES_BINDING);
            protocolMarshaller.marshall(layer.getPackages(), PACKAGES_BINDING);
            protocolMarshaller.marshall(layer.getVolumeConfigurations(), VOLUMECONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(layer.getEnableAutoHealing(), ENABLEAUTOHEALING_BINDING);
            protocolMarshaller.marshall(layer.getAutoAssignElasticIps(), AUTOASSIGNELASTICIPS_BINDING);
            protocolMarshaller.marshall(layer.getAutoAssignPublicIps(), AUTOASSIGNPUBLICIPS_BINDING);
            protocolMarshaller.marshall(layer.getDefaultRecipes(), DEFAULTRECIPES_BINDING);
            protocolMarshaller.marshall(layer.getCustomRecipes(), CUSTOMRECIPES_BINDING);
            protocolMarshaller.marshall(layer.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(layer.getInstallUpdatesOnBoot(), INSTALLUPDATESONBOOT_BINDING);
            protocolMarshaller.marshall(layer.getUseEbsOptimizedInstances(), USEEBSOPTIMIZEDINSTANCES_BINDING);
            protocolMarshaller.marshall(layer.getLifecycleEventConfiguration(), LIFECYCLEEVENTCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
