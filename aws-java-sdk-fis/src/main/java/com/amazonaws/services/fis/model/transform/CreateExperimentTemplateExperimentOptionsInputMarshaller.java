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
package com.amazonaws.services.fis.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fis.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateExperimentTemplateExperimentOptionsInputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateExperimentTemplateExperimentOptionsInputMarshaller {

    private static final MarshallingInfo<String> ACCOUNTTARGETING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accountTargeting").build();
    private static final MarshallingInfo<String> EMPTYTARGETRESOLUTIONMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("emptyTargetResolutionMode").build();

    private static final CreateExperimentTemplateExperimentOptionsInputMarshaller instance = new CreateExperimentTemplateExperimentOptionsInputMarshaller();

    public static CreateExperimentTemplateExperimentOptionsInputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateExperimentTemplateExperimentOptionsInput createExperimentTemplateExperimentOptionsInput, ProtocolMarshaller protocolMarshaller) {

        if (createExperimentTemplateExperimentOptionsInput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createExperimentTemplateExperimentOptionsInput.getAccountTargeting(), ACCOUNTTARGETING_BINDING);
            protocolMarshaller.marshall(createExperimentTemplateExperimentOptionsInput.getEmptyTargetResolutionMode(), EMPTYTARGETRESOLUTIONMODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
