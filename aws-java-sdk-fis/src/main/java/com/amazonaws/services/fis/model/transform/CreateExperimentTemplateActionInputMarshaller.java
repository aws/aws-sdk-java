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
package com.amazonaws.services.fis.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fis.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateExperimentTemplateActionInputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateExperimentTemplateActionInputMarshaller {

    private static final MarshallingInfo<String> ACTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("actionId").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Map> PARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("parameters").build();
    private static final MarshallingInfo<Map> TARGETS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("targets").build();
    private static final MarshallingInfo<List> STARTAFTER_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("startAfter").build();

    private static final CreateExperimentTemplateActionInputMarshaller instance = new CreateExperimentTemplateActionInputMarshaller();

    public static CreateExperimentTemplateActionInputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateExperimentTemplateActionInput createExperimentTemplateActionInput, ProtocolMarshaller protocolMarshaller) {

        if (createExperimentTemplateActionInput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createExperimentTemplateActionInput.getActionId(), ACTIONID_BINDING);
            protocolMarshaller.marshall(createExperimentTemplateActionInput.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createExperimentTemplateActionInput.getParameters(), PARAMETERS_BINDING);
            protocolMarshaller.marshall(createExperimentTemplateActionInput.getTargets(), TARGETS_BINDING);
            protocolMarshaller.marshall(createExperimentTemplateActionInput.getStartAfter(), STARTAFTER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
