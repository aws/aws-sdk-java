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
package com.amazonaws.services.mediaconvert.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconvert.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EsamSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EsamSettingsMarshaller {

    private static final MarshallingInfo<StructuredPojo> MANIFESTCONFIRMCONDITIONNOTIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("manifestConfirmConditionNotification").build();
    private static final MarshallingInfo<Integer> RESPONSESIGNALPREROLL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("responseSignalPreroll").build();
    private static final MarshallingInfo<StructuredPojo> SIGNALPROCESSINGNOTIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("signalProcessingNotification").build();

    private static final EsamSettingsMarshaller instance = new EsamSettingsMarshaller();

    public static EsamSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EsamSettings esamSettings, ProtocolMarshaller protocolMarshaller) {

        if (esamSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(esamSettings.getManifestConfirmConditionNotification(), MANIFESTCONFIRMCONDITIONNOTIFICATION_BINDING);
            protocolMarshaller.marshall(esamSettings.getResponseSignalPreroll(), RESPONSESIGNALPREROLL_BINDING);
            protocolMarshaller.marshall(esamSettings.getSignalProcessingNotification(), SIGNALPROCESSINGNOTIFICATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
