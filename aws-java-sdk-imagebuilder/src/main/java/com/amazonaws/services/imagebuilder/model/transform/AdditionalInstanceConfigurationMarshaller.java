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
package com.amazonaws.services.imagebuilder.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.imagebuilder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AdditionalInstanceConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AdditionalInstanceConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> SYSTEMSMANAGERAGENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("systemsManagerAgent").build();
    private static final MarshallingInfo<String> USERDATAOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userDataOverride").build();

    private static final AdditionalInstanceConfigurationMarshaller instance = new AdditionalInstanceConfigurationMarshaller();

    public static AdditionalInstanceConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AdditionalInstanceConfiguration additionalInstanceConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (additionalInstanceConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(additionalInstanceConfiguration.getSystemsManagerAgent(), SYSTEMSMANAGERAGENT_BINDING);
            protocolMarshaller.marshall(additionalInstanceConfiguration.getUserDataOverride(), USERDATAOVERRIDE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
