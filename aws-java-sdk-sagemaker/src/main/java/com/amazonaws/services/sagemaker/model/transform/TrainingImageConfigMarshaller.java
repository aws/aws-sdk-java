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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TrainingImageConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TrainingImageConfigMarshaller {

    private static final MarshallingInfo<String> TRAININGREPOSITORYACCESSMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingRepositoryAccessMode").build();
    private static final MarshallingInfo<StructuredPojo> TRAININGREPOSITORYAUTHCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingRepositoryAuthConfig").build();

    private static final TrainingImageConfigMarshaller instance = new TrainingImageConfigMarshaller();

    public static TrainingImageConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TrainingImageConfig trainingImageConfig, ProtocolMarshaller protocolMarshaller) {

        if (trainingImageConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(trainingImageConfig.getTrainingRepositoryAccessMode(), TRAININGREPOSITORYACCESSMODE_BINDING);
            protocolMarshaller.marshall(trainingImageConfig.getTrainingRepositoryAuthConfig(), TRAININGREPOSITORYAUTHCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
