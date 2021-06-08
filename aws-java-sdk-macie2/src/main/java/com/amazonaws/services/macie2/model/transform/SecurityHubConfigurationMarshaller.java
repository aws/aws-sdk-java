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
package com.amazonaws.services.macie2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.macie2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SecurityHubConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SecurityHubConfigurationMarshaller {

    private static final MarshallingInfo<Boolean> PUBLISHCLASSIFICATIONFINDINGS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("publishClassificationFindings").build();
    private static final MarshallingInfo<Boolean> PUBLISHPOLICYFINDINGS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("publishPolicyFindings").build();

    private static final SecurityHubConfigurationMarshaller instance = new SecurityHubConfigurationMarshaller();

    public static SecurityHubConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SecurityHubConfiguration securityHubConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (securityHubConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(securityHubConfiguration.getPublishClassificationFindings(), PUBLISHCLASSIFICATIONFINDINGS_BINDING);
            protocolMarshaller.marshall(securityHubConfiguration.getPublishPolicyFindings(), PUBLISHPOLICYFINDINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
