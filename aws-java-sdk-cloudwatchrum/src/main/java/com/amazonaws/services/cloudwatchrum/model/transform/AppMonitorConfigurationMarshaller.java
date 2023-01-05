/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatchrum.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudwatchrum.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AppMonitorConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AppMonitorConfigurationMarshaller {

    private static final MarshallingInfo<Boolean> ALLOWCOOKIES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowCookies").build();
    private static final MarshallingInfo<Boolean> ENABLEXRAY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableXRay").build();
    private static final MarshallingInfo<List> EXCLUDEDPAGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ExcludedPages").build();
    private static final MarshallingInfo<List> FAVORITEPAGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FavoritePages").build();
    private static final MarshallingInfo<String> GUESTROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GuestRoleArn").build();
    private static final MarshallingInfo<String> IDENTITYPOOLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentityPoolId").build();
    private static final MarshallingInfo<List> INCLUDEDPAGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IncludedPages").build();
    private static final MarshallingInfo<Double> SESSIONSAMPLERATE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SessionSampleRate").build();
    private static final MarshallingInfo<List> TELEMETRIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Telemetries").build();

    private static final AppMonitorConfigurationMarshaller instance = new AppMonitorConfigurationMarshaller();

    public static AppMonitorConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AppMonitorConfiguration appMonitorConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (appMonitorConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(appMonitorConfiguration.getAllowCookies(), ALLOWCOOKIES_BINDING);
            protocolMarshaller.marshall(appMonitorConfiguration.getEnableXRay(), ENABLEXRAY_BINDING);
            protocolMarshaller.marshall(appMonitorConfiguration.getExcludedPages(), EXCLUDEDPAGES_BINDING);
            protocolMarshaller.marshall(appMonitorConfiguration.getFavoritePages(), FAVORITEPAGES_BINDING);
            protocolMarshaller.marshall(appMonitorConfiguration.getGuestRoleArn(), GUESTROLEARN_BINDING);
            protocolMarshaller.marshall(appMonitorConfiguration.getIdentityPoolId(), IDENTITYPOOLID_BINDING);
            protocolMarshaller.marshall(appMonitorConfiguration.getIncludedPages(), INCLUDEDPAGES_BINDING);
            protocolMarshaller.marshall(appMonitorConfiguration.getSessionSampleRate(), SESSIONSAMPLERATE_BINDING);
            protocolMarshaller.marshall(appMonitorConfiguration.getTelemetries(), TELEMETRIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
