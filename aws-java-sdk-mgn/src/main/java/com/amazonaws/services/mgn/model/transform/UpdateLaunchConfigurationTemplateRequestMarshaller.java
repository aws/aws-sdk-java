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
package com.amazonaws.services.mgn.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mgn.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateLaunchConfigurationTemplateRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateLaunchConfigurationTemplateRequestMarshaller {

    private static final MarshallingInfo<Boolean> ASSOCIATEPUBLICIPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("associatePublicIpAddress").build();
    private static final MarshallingInfo<String> BOOTMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bootMode").build();
    private static final MarshallingInfo<Boolean> COPYPRIVATEIP_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("copyPrivateIp").build();
    private static final MarshallingInfo<Boolean> COPYTAGS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("copyTags").build();
    private static final MarshallingInfo<Boolean> ENABLEMAPAUTOTAGGING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enableMapAutoTagging").build();
    private static final MarshallingInfo<StructuredPojo> LARGEVOLUMECONF_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("largeVolumeConf").build();
    private static final MarshallingInfo<String> LAUNCHCONFIGURATIONTEMPLATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("launchConfigurationTemplateID").build();
    private static final MarshallingInfo<String> LAUNCHDISPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("launchDisposition").build();
    private static final MarshallingInfo<StructuredPojo> LICENSING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("licensing").build();
    private static final MarshallingInfo<String> MAPAUTOTAGGINGMPEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mapAutoTaggingMpeID").build();
    private static final MarshallingInfo<StructuredPojo> POSTLAUNCHACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("postLaunchActions").build();
    private static final MarshallingInfo<StructuredPojo> SMALLVOLUMECONF_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("smallVolumeConf").build();
    private static final MarshallingInfo<Long> SMALLVOLUMEMAXSIZE_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("smallVolumeMaxSize").build();
    private static final MarshallingInfo<String> TARGETINSTANCETYPERIGHTSIZINGMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetInstanceTypeRightSizingMethod").build();

    private static final UpdateLaunchConfigurationTemplateRequestMarshaller instance = new UpdateLaunchConfigurationTemplateRequestMarshaller();

    public static UpdateLaunchConfigurationTemplateRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateLaunchConfigurationTemplateRequest updateLaunchConfigurationTemplateRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateLaunchConfigurationTemplateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateLaunchConfigurationTemplateRequest.getAssociatePublicIpAddress(), ASSOCIATEPUBLICIPADDRESS_BINDING);
            protocolMarshaller.marshall(updateLaunchConfigurationTemplateRequest.getBootMode(), BOOTMODE_BINDING);
            protocolMarshaller.marshall(updateLaunchConfigurationTemplateRequest.getCopyPrivateIp(), COPYPRIVATEIP_BINDING);
            protocolMarshaller.marshall(updateLaunchConfigurationTemplateRequest.getCopyTags(), COPYTAGS_BINDING);
            protocolMarshaller.marshall(updateLaunchConfigurationTemplateRequest.getEnableMapAutoTagging(), ENABLEMAPAUTOTAGGING_BINDING);
            protocolMarshaller.marshall(updateLaunchConfigurationTemplateRequest.getLargeVolumeConf(), LARGEVOLUMECONF_BINDING);
            protocolMarshaller.marshall(updateLaunchConfigurationTemplateRequest.getLaunchConfigurationTemplateID(), LAUNCHCONFIGURATIONTEMPLATEID_BINDING);
            protocolMarshaller.marshall(updateLaunchConfigurationTemplateRequest.getLaunchDisposition(), LAUNCHDISPOSITION_BINDING);
            protocolMarshaller.marshall(updateLaunchConfigurationTemplateRequest.getLicensing(), LICENSING_BINDING);
            protocolMarshaller.marshall(updateLaunchConfigurationTemplateRequest.getMapAutoTaggingMpeID(), MAPAUTOTAGGINGMPEID_BINDING);
            protocolMarshaller.marshall(updateLaunchConfigurationTemplateRequest.getPostLaunchActions(), POSTLAUNCHACTIONS_BINDING);
            protocolMarshaller.marshall(updateLaunchConfigurationTemplateRequest.getSmallVolumeConf(), SMALLVOLUMECONF_BINDING);
            protocolMarshaller.marshall(updateLaunchConfigurationTemplateRequest.getSmallVolumeMaxSize(), SMALLVOLUMEMAXSIZE_BINDING);
            protocolMarshaller.marshall(updateLaunchConfigurationTemplateRequest.getTargetInstanceTypeRightSizingMethod(),
                    TARGETINSTANCETYPERIGHTSIZINGMETHOD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
