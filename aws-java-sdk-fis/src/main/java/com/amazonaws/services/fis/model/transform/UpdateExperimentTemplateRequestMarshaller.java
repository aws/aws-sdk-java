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
 * UpdateExperimentTemplateRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateExperimentTemplateRequestMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<List> STOPCONDITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stopConditions").build();
    private static final MarshallingInfo<Map> TARGETS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("targets").build();
    private static final MarshallingInfo<Map> ACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("actions").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();

    private static final UpdateExperimentTemplateRequestMarshaller instance = new UpdateExperimentTemplateRequestMarshaller();

    public static UpdateExperimentTemplateRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateExperimentTemplateRequest updateExperimentTemplateRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateExperimentTemplateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateExperimentTemplateRequest.getId(), ID_BINDING);
            protocolMarshaller.marshall(updateExperimentTemplateRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateExperimentTemplateRequest.getStopConditions(), STOPCONDITIONS_BINDING);
            protocolMarshaller.marshall(updateExperimentTemplateRequest.getTargets(), TARGETS_BINDING);
            protocolMarshaller.marshall(updateExperimentTemplateRequest.getActions(), ACTIONS_BINDING);
            protocolMarshaller.marshall(updateExperimentTemplateRequest.getRoleArn(), ROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
