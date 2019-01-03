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
package com.amazonaws.services.config.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConfigurationRecorderStatusMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConfigurationRecorderStatusMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<java.util.Date> LASTSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTSTOPTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastStopTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Boolean> RECORDING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recording").build();
    private static final MarshallingInfo<String> LASTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastStatus").build();
    private static final MarshallingInfo<String> LASTERRORCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastErrorCode").build();
    private static final MarshallingInfo<String> LASTERRORMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastErrorMessage").build();
    private static final MarshallingInfo<java.util.Date> LASTSTATUSCHANGETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastStatusChangeTime").timestampFormat("unixTimestamp").build();

    private static final ConfigurationRecorderStatusMarshaller instance = new ConfigurationRecorderStatusMarshaller();

    public static ConfigurationRecorderStatusMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConfigurationRecorderStatus configurationRecorderStatus, ProtocolMarshaller protocolMarshaller) {

        if (configurationRecorderStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(configurationRecorderStatus.getName(), NAME_BINDING);
            protocolMarshaller.marshall(configurationRecorderStatus.getLastStartTime(), LASTSTARTTIME_BINDING);
            protocolMarshaller.marshall(configurationRecorderStatus.getLastStopTime(), LASTSTOPTIME_BINDING);
            protocolMarshaller.marshall(configurationRecorderStatus.getRecording(), RECORDING_BINDING);
            protocolMarshaller.marshall(configurationRecorderStatus.getLastStatus(), LASTSTATUS_BINDING);
            protocolMarshaller.marshall(configurationRecorderStatus.getLastErrorCode(), LASTERRORCODE_BINDING);
            protocolMarshaller.marshall(configurationRecorderStatus.getLastErrorMessage(), LASTERRORMESSAGE_BINDING);
            protocolMarshaller.marshall(configurationRecorderStatus.getLastStatusChangeTime(), LASTSTATUSCHANGETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
