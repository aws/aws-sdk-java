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
package com.amazonaws.services.connectcampaign.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connectcampaign.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartInstanceOnboardingJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartInstanceOnboardingJobRequestMarshaller {

    private static final MarshallingInfo<String> CONNECTINSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("connectInstanceId").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryptionConfig").build();

    private static final StartInstanceOnboardingJobRequestMarshaller instance = new StartInstanceOnboardingJobRequestMarshaller();

    public static StartInstanceOnboardingJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartInstanceOnboardingJobRequest startInstanceOnboardingJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (startInstanceOnboardingJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startInstanceOnboardingJobRequest.getConnectInstanceId(), CONNECTINSTANCEID_BINDING);
            protocolMarshaller.marshall(startInstanceOnboardingJobRequest.getEncryptionConfig(), ENCRYPTIONCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
