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
package com.amazonaws.services.drs.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.drs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateLaunchConfigurationTemplateRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateLaunchConfigurationTemplateRequestMarshaller {

    private static final MarshallingInfo<Boolean> COPYPRIVATEIP_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("copyPrivateIp").build();
    private static final MarshallingInfo<Boolean> COPYTAGS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("copyTags").build();
    private static final MarshallingInfo<String> EXPORTBUCKETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("exportBucketArn").build();
    private static final MarshallingInfo<String> LAUNCHDISPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("launchDisposition").build();
    private static final MarshallingInfo<Boolean> LAUNCHINTOSOURCEINSTANCE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("launchIntoSourceInstance").build();
    private static final MarshallingInfo<StructuredPojo> LICENSING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("licensing").build();
    private static final MarshallingInfo<Boolean> POSTLAUNCHENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("postLaunchEnabled").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> TARGETINSTANCETYPERIGHTSIZINGMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetInstanceTypeRightSizingMethod").build();

    private static final CreateLaunchConfigurationTemplateRequestMarshaller instance = new CreateLaunchConfigurationTemplateRequestMarshaller();

    public static CreateLaunchConfigurationTemplateRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateLaunchConfigurationTemplateRequest createLaunchConfigurationTemplateRequest, ProtocolMarshaller protocolMarshaller) {

        if (createLaunchConfigurationTemplateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createLaunchConfigurationTemplateRequest.getCopyPrivateIp(), COPYPRIVATEIP_BINDING);
            protocolMarshaller.marshall(createLaunchConfigurationTemplateRequest.getCopyTags(), COPYTAGS_BINDING);
            protocolMarshaller.marshall(createLaunchConfigurationTemplateRequest.getExportBucketArn(), EXPORTBUCKETARN_BINDING);
            protocolMarshaller.marshall(createLaunchConfigurationTemplateRequest.getLaunchDisposition(), LAUNCHDISPOSITION_BINDING);
            protocolMarshaller.marshall(createLaunchConfigurationTemplateRequest.getLaunchIntoSourceInstance(), LAUNCHINTOSOURCEINSTANCE_BINDING);
            protocolMarshaller.marshall(createLaunchConfigurationTemplateRequest.getLicensing(), LICENSING_BINDING);
            protocolMarshaller.marshall(createLaunchConfigurationTemplateRequest.getPostLaunchEnabled(), POSTLAUNCHENABLED_BINDING);
            protocolMarshaller.marshall(createLaunchConfigurationTemplateRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createLaunchConfigurationTemplateRequest.getTargetInstanceTypeRightSizingMethod(),
                    TARGETINSTANCETYPERIGHTSIZINGMETHOD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
