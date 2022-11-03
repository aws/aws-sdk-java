/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

    private static final MarshallingInfo<String> LAUNCHCONFIGURATIONTEMPLATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("launchConfigurationTemplateID").build();
    private static final MarshallingInfo<StructuredPojo> POSTLAUNCHACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("postLaunchActions").build();

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
            protocolMarshaller.marshall(updateLaunchConfigurationTemplateRequest.getLaunchConfigurationTemplateID(), LAUNCHCONFIGURATIONTEMPLATEID_BINDING);
            protocolMarshaller.marshall(updateLaunchConfigurationTemplateRequest.getPostLaunchActions(), POSTLAUNCHACTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
