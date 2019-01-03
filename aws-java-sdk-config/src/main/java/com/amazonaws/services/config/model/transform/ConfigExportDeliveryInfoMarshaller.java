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
 * ConfigExportDeliveryInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConfigExportDeliveryInfoMarshaller {

    private static final MarshallingInfo<String> LASTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastStatus").build();
    private static final MarshallingInfo<String> LASTERRORCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastErrorCode").build();
    private static final MarshallingInfo<String> LASTERRORMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastErrorMessage").build();
    private static final MarshallingInfo<java.util.Date> LASTATTEMPTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastAttemptTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTSUCCESSFULTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastSuccessfulTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> NEXTDELIVERYTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nextDeliveryTime").timestampFormat("unixTimestamp").build();

    private static final ConfigExportDeliveryInfoMarshaller instance = new ConfigExportDeliveryInfoMarshaller();

    public static ConfigExportDeliveryInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConfigExportDeliveryInfo configExportDeliveryInfo, ProtocolMarshaller protocolMarshaller) {

        if (configExportDeliveryInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(configExportDeliveryInfo.getLastStatus(), LASTSTATUS_BINDING);
            protocolMarshaller.marshall(configExportDeliveryInfo.getLastErrorCode(), LASTERRORCODE_BINDING);
            protocolMarshaller.marshall(configExportDeliveryInfo.getLastErrorMessage(), LASTERRORMESSAGE_BINDING);
            protocolMarshaller.marshall(configExportDeliveryInfo.getLastAttemptTime(), LASTATTEMPTTIME_BINDING);
            protocolMarshaller.marshall(configExportDeliveryInfo.getLastSuccessfulTime(), LASTSUCCESSFULTIME_BINDING);
            protocolMarshaller.marshall(configExportDeliveryInfo.getNextDeliveryTime(), NEXTDELIVERYTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
