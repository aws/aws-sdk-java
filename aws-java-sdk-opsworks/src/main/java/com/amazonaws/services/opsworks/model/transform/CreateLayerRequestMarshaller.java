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
 * CreateLayerRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateLayerRequestMarshaller {

    private static final MarshallingInfo<String> STACKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StackId").build();
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

    private static final CreateLayerRequestMarshaller instance = new CreateLayerRequestMarshaller();

    public static CreateLayerRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateLayerRequest createLayerRequest, ProtocolMarshaller protocolMarshaller) {

        if (createLayerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createLayerRequest.getStackId(), STACKID_BINDING);
            protocolMarshaller.marshall(createLayerRequest.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(createLayerRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createLayerRequest.getShortname(), SHORTNAME_BINDING);
            protocolMarshaller.marshall(createLayerRequest.getAttributes(), ATTRIBUTES_BINDING);
            protocolMarshaller.marshall(createLayerRequest.getCloudWatchLogsConfiguration(), CLOUDWATCHLOGSCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createLayerRequest.getCustomInstanceProfileArn(), CUSTOMINSTANCEPROFILEARN_BINDING);
            protocolMarshaller.marshall(createLayerRequest.getCustomJson(), CUSTOMJSON_BINDING);
            protocolMarshaller.marshall(createLayerRequest.getCustomSecurityGroupIds(), CUSTOMSECURITYGROUPIDS_BINDING);
            protocolMarshaller.marshall(createLayerRequest.getPackages(), PACKAGES_BINDING);
            protocolMarshaller.marshall(createLayerRequest.getVolumeConfigurations(), VOLUMECONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(createLayerRequest.getEnableAutoHealing(), ENABLEAUTOHEALING_BINDING);
            protocolMarshaller.marshall(createLayerRequest.getAutoAssignElasticIps(), AUTOASSIGNELASTICIPS_BINDING);
            protocolMarshaller.marshall(createLayerRequest.getAutoAssignPublicIps(), AUTOASSIGNPUBLICIPS_BINDING);
            protocolMarshaller.marshall(createLayerRequest.getCustomRecipes(), CUSTOMRECIPES_BINDING);
            protocolMarshaller.marshall(createLayerRequest.getInstallUpdatesOnBoot(), INSTALLUPDATESONBOOT_BINDING);
            protocolMarshaller.marshall(createLayerRequest.getUseEbsOptimizedInstances(), USEEBSOPTIMIZEDINSTANCES_BINDING);
            protocolMarshaller.marshall(createLayerRequest.getLifecycleEventConfiguration(), LIFECYCLEEVENTCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
