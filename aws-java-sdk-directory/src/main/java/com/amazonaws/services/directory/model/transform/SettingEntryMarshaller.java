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
package com.amazonaws.services.directory.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directory.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SettingEntryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SettingEntryMarshaller {

    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> ALLOWEDVALUES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowedValues").build();
    private static final MarshallingInfo<String> APPLIEDVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AppliedValue").build();
    private static final MarshallingInfo<String> REQUESTEDVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequestedValue").build();
    private static final MarshallingInfo<String> REQUESTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequestStatus").build();
    private static final MarshallingInfo<Map> REQUESTDETAILEDSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequestDetailedStatus").build();
    private static final MarshallingInfo<String> REQUESTSTATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequestStatusMessage").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdatedDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTREQUESTEDDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastRequestedDateTime").timestampFormat("unixTimestamp").build();

    private static final SettingEntryMarshaller instance = new SettingEntryMarshaller();

    public static SettingEntryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SettingEntry settingEntry, ProtocolMarshaller protocolMarshaller) {

        if (settingEntry == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(settingEntry.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(settingEntry.getName(), NAME_BINDING);
            protocolMarshaller.marshall(settingEntry.getAllowedValues(), ALLOWEDVALUES_BINDING);
            protocolMarshaller.marshall(settingEntry.getAppliedValue(), APPLIEDVALUE_BINDING);
            protocolMarshaller.marshall(settingEntry.getRequestedValue(), REQUESTEDVALUE_BINDING);
            protocolMarshaller.marshall(settingEntry.getRequestStatus(), REQUESTSTATUS_BINDING);
            protocolMarshaller.marshall(settingEntry.getRequestDetailedStatus(), REQUESTDETAILEDSTATUS_BINDING);
            protocolMarshaller.marshall(settingEntry.getRequestStatusMessage(), REQUESTSTATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(settingEntry.getLastUpdatedDateTime(), LASTUPDATEDDATETIME_BINDING);
            protocolMarshaller.marshall(settingEntry.getLastRequestedDateTime(), LASTREQUESTEDDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
