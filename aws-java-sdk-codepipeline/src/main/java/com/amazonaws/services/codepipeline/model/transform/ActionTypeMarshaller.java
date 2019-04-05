/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codepipeline.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codepipeline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ActionTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ActionTypeMarshaller {

    private static final MarshallingInfo<StructuredPojo> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("id").build();
    private static final MarshallingInfo<StructuredPojo> SETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("settings").build();
    private static final MarshallingInfo<List> ACTIONCONFIGURATIONPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("actionConfigurationProperties").build();
    private static final MarshallingInfo<StructuredPojo> INPUTARTIFACTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputArtifactDetails").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTARTIFACTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputArtifactDetails").build();

    private static final ActionTypeMarshaller instance = new ActionTypeMarshaller();

    public static ActionTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ActionType actionType, ProtocolMarshaller protocolMarshaller) {

        if (actionType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(actionType.getId(), ID_BINDING);
            protocolMarshaller.marshall(actionType.getSettings(), SETTINGS_BINDING);
            protocolMarshaller.marshall(actionType.getActionConfigurationProperties(), ACTIONCONFIGURATIONPROPERTIES_BINDING);
            protocolMarshaller.marshall(actionType.getInputArtifactDetails(), INPUTARTIFACTDETAILS_BINDING);
            protocolMarshaller.marshall(actionType.getOutputArtifactDetails(), OUTPUTARTIFACTDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
