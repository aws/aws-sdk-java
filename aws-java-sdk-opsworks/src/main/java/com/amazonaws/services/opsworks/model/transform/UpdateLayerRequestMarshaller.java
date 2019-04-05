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
 * UpdateLayerRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateLayerRequestMarshaller {

    private static final MarshallingInfo<String> LAYERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LayerId").build();
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
    private static final MarshallingInfo<StructuredPojo> CUSTOMRECIPES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomRecipes").build();
    private static final MarshallingInfo<Boolean> INSTALLUPDATESONBOOT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstallUpdatesOnBoot").build();
    private static final MarshallingInfo<Boolean> USEEBSOPTIMIZEDINSTANCES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UseEbsOptimizedInstances").build();
    private static final MarshallingInfo<StructuredPojo> LIFECYCLEEVENTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LifecycleEventConfiguration").build();

    private static final UpdateLayerRequestMarshaller instance = new UpdateLayerRequestMarshaller();

    public static UpdateLayerRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateLayerRequest updateLayerRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateLayerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateLayerRequest.getLayerId(), LAYERID_BINDING);
            protocolMarshaller.marshall(updateLayerRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateLayerRequest.getShortname(), SHORTNAME_BINDING);
            protocolMarshaller.marshall(updateLayerRequest.getAttributes(), ATTRIBUTES_BINDING);
            protocolMarshaller.marshall(updateLayerRequest.getCloudWatchLogsConfiguration(), CLOUDWATCHLOGSCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateLayerRequest.getCustomInstanceProfileArn(), CUSTOMINSTANCEPROFILEARN_BINDING);
            protocolMarshaller.marshall(updateLayerRequest.getCustomJson(), CUSTOMJSON_BINDING);
            protocolMarshaller.marshall(updateLayerRequest.getCustomSecurityGroupIds(), CUSTOMSECURITYGROUPIDS_BINDING);
            protocolMarshaller.marshall(updateLayerRequest.getPackages(), PACKAGES_BINDING);
            protocolMarshaller.marshall(updateLayerRequest.getVolumeConfigurations(), VOLUMECONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(updateLayerRequest.getEnableAutoHealing(), ENABLEAUTOHEALING_BINDING);
            protocolMarshaller.marshall(updateLayerRequest.getAutoAssignElasticIps(), AUTOASSIGNELASTICIPS_BINDING);
            protocolMarshaller.marshall(updateLayerRequest.getAutoAssignPublicIps(), AUTOASSIGNPUBLICIPS_BINDING);
            protocolMarshaller.marshall(updateLayerRequest.getCustomRecipes(), CUSTOMRECIPES_BINDING);
            protocolMarshaller.marshall(updateLayerRequest.getInstallUpdatesOnBoot(), INSTALLUPDATESONBOOT_BINDING);
            protocolMarshaller.marshall(updateLayerRequest.getUseEbsOptimizedInstances(), USEEBSOPTIMIZEDINSTANCES_BINDING);
            protocolMarshaller.marshall(updateLayerRequest.getLifecycleEventConfiguration(), LIFECYCLEEVENTCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
