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
package com.amazonaws.services.alexaforbusiness.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.alexaforbusiness.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateProfileRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateProfileRequestMarshaller {

    private static final MarshallingInfo<String> PROFILENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProfileName").build();
    private static final MarshallingInfo<String> TIMEZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Timezone").build();
    private static final MarshallingInfo<String> ADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Address").build();
    private static final MarshallingInfo<String> DISTANCEUNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DistanceUnit").build();
    private static final MarshallingInfo<String> TEMPERATUREUNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemperatureUnit").build();
    private static final MarshallingInfo<String> WAKEWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("WakeWord").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientRequestToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<Boolean> SETUPMODEDISABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SetupModeDisabled").build();
    private static final MarshallingInfo<Integer> MAXVOLUMELIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxVolumeLimit").build();
    private static final MarshallingInfo<Boolean> PSTNENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PSTNEnabled").build();

    private static final CreateProfileRequestMarshaller instance = new CreateProfileRequestMarshaller();

    public static CreateProfileRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateProfileRequest createProfileRequest, ProtocolMarshaller protocolMarshaller) {

        if (createProfileRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createProfileRequest.getProfileName(), PROFILENAME_BINDING);
            protocolMarshaller.marshall(createProfileRequest.getTimezone(), TIMEZONE_BINDING);
            protocolMarshaller.marshall(createProfileRequest.getAddress(), ADDRESS_BINDING);
            protocolMarshaller.marshall(createProfileRequest.getDistanceUnit(), DISTANCEUNIT_BINDING);
            protocolMarshaller.marshall(createProfileRequest.getTemperatureUnit(), TEMPERATUREUNIT_BINDING);
            protocolMarshaller.marshall(createProfileRequest.getWakeWord(), WAKEWORD_BINDING);
            protocolMarshaller.marshall(createProfileRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
            protocolMarshaller.marshall(createProfileRequest.getSetupModeDisabled(), SETUPMODEDISABLED_BINDING);
            protocolMarshaller.marshall(createProfileRequest.getMaxVolumeLimit(), MAXVOLUMELIMIT_BINDING);
            protocolMarshaller.marshall(createProfileRequest.getPSTNEnabled(), PSTNENABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
