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
package com.amazonaws.services.apprunner.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apprunner.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SourceConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SourceConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> CODEREPOSITORY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CodeRepository").build();
    private static final MarshallingInfo<StructuredPojo> IMAGEREPOSITORY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImageRepository").build();
    private static final MarshallingInfo<Boolean> AUTODEPLOYMENTSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoDeploymentsEnabled").build();
    private static final MarshallingInfo<StructuredPojo> AUTHENTICATIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthenticationConfiguration").build();

    private static final SourceConfigurationMarshaller instance = new SourceConfigurationMarshaller();

    public static SourceConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SourceConfiguration sourceConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (sourceConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sourceConfiguration.getCodeRepository(), CODEREPOSITORY_BINDING);
            protocolMarshaller.marshall(sourceConfiguration.getImageRepository(), IMAGEREPOSITORY_BINDING);
            protocolMarshaller.marshall(sourceConfiguration.getAutoDeploymentsEnabled(), AUTODEPLOYMENTSENABLED_BINDING);
            protocolMarshaller.marshall(sourceConfiguration.getAuthenticationConfiguration(), AUTHENTICATIONCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
