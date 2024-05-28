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
package com.amazonaws.services.qbusiness.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.qbusiness.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateWebExperienceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateWebExperienceRequestMarshaller {

    private static final MarshallingInfo<String> APPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("applicationId").build();
    private static final MarshallingInfo<String> WEBEXPERIENCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("webExperienceId").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<StructuredPojo> AUTHENTICATIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authenticationConfiguration").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("title").build();
    private static final MarshallingInfo<String> SUBTITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subtitle").build();
    private static final MarshallingInfo<String> WELCOMEMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("welcomeMessage").build();
    private static final MarshallingInfo<String> SAMPLEPROMPTSCONTROLMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("samplePromptsControlMode").build();

    private static final UpdateWebExperienceRequestMarshaller instance = new UpdateWebExperienceRequestMarshaller();

    public static UpdateWebExperienceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateWebExperienceRequest updateWebExperienceRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateWebExperienceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateWebExperienceRequest.getApplicationId(), APPLICATIONID_BINDING);
            protocolMarshaller.marshall(updateWebExperienceRequest.getWebExperienceId(), WEBEXPERIENCEID_BINDING);
            protocolMarshaller.marshall(updateWebExperienceRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(updateWebExperienceRequest.getAuthenticationConfiguration(), AUTHENTICATIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateWebExperienceRequest.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(updateWebExperienceRequest.getSubtitle(), SUBTITLE_BINDING);
            protocolMarshaller.marshall(updateWebExperienceRequest.getWelcomeMessage(), WELCOMEMESSAGE_BINDING);
            protocolMarshaller.marshall(updateWebExperienceRequest.getSamplePromptsControlMode(), SAMPLEPROMPTSCONTROLMODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
