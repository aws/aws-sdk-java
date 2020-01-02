/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateTrialComponentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateTrialComponentRequestMarshaller {

    private static final MarshallingInfo<String> TRIALCOMPONENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrialComponentName").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayName").build();
    private static final MarshallingInfo<StructuredPojo> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Status").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Map> PARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Parameters").build();
    private static final MarshallingInfo<List> PARAMETERSTOREMOVE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParametersToRemove").build();
    private static final MarshallingInfo<Map> INPUTARTIFACTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InputArtifacts").build();
    private static final MarshallingInfo<List> INPUTARTIFACTSTOREMOVE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputArtifactsToRemove").build();
    private static final MarshallingInfo<Map> OUTPUTARTIFACTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OutputArtifacts").build();
    private static final MarshallingInfo<List> OUTPUTARTIFACTSTOREMOVE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputArtifactsToRemove").build();

    private static final UpdateTrialComponentRequestMarshaller instance = new UpdateTrialComponentRequestMarshaller();

    public static UpdateTrialComponentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateTrialComponentRequest updateTrialComponentRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateTrialComponentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateTrialComponentRequest.getTrialComponentName(), TRIALCOMPONENTNAME_BINDING);
            protocolMarshaller.marshall(updateTrialComponentRequest.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(updateTrialComponentRequest.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(updateTrialComponentRequest.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(updateTrialComponentRequest.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(updateTrialComponentRequest.getParameters(), PARAMETERS_BINDING);
            protocolMarshaller.marshall(updateTrialComponentRequest.getParametersToRemove(), PARAMETERSTOREMOVE_BINDING);
            protocolMarshaller.marshall(updateTrialComponentRequest.getInputArtifacts(), INPUTARTIFACTS_BINDING);
            protocolMarshaller.marshall(updateTrialComponentRequest.getInputArtifactsToRemove(), INPUTARTIFACTSTOREMOVE_BINDING);
            protocolMarshaller.marshall(updateTrialComponentRequest.getOutputArtifacts(), OUTPUTARTIFACTS_BINDING);
            protocolMarshaller.marshall(updateTrialComponentRequest.getOutputArtifactsToRemove(), OUTPUTARTIFACTSTOREMOVE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
