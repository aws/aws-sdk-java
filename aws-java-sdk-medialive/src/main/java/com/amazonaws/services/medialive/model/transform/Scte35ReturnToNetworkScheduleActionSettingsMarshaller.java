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
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * Scte35ReturnToNetworkScheduleActionSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Scte35ReturnToNetworkScheduleActionSettingsMarshaller {

    private static final MarshallingInfo<Long> SPLICEEVENTID_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("spliceEventId").build();

    private static final Scte35ReturnToNetworkScheduleActionSettingsMarshaller instance = new Scte35ReturnToNetworkScheduleActionSettingsMarshaller();

    public static Scte35ReturnToNetworkScheduleActionSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Scte35ReturnToNetworkScheduleActionSettings scte35ReturnToNetworkScheduleActionSettings, ProtocolMarshaller protocolMarshaller) {

        if (scte35ReturnToNetworkScheduleActionSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(scte35ReturnToNetworkScheduleActionSettings.getSpliceEventId(), SPLICEEVENTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
