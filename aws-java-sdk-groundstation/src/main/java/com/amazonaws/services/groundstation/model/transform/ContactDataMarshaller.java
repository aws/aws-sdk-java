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
package com.amazonaws.services.groundstation.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.groundstation.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ContactDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContactDataMarshaller {

    private static final MarshallingInfo<String> CONTACTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("contactId").build();
    private static final MarshallingInfo<String> CONTACTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("contactStatus").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ERRORMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("errorMessage").build();
    private static final MarshallingInfo<String> GROUNDSTATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("groundStation").build();
    private static final MarshallingInfo<StructuredPojo> MAXIMUMELEVATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maximumElevation").build();
    private static final MarshallingInfo<String> MISSIONPROFILEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("missionProfileArn").build();
    private static final MarshallingInfo<java.util.Date> POSTPASSENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("postPassEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> PREPASSSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("prePassStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("region").build();
    private static final MarshallingInfo<String> SATELLITEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("satelliteArn").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final ContactDataMarshaller instance = new ContactDataMarshaller();

    public static ContactDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ContactData contactData, ProtocolMarshaller protocolMarshaller) {

        if (contactData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(contactData.getContactId(), CONTACTID_BINDING);
            protocolMarshaller.marshall(contactData.getContactStatus(), CONTACTSTATUS_BINDING);
            protocolMarshaller.marshall(contactData.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(contactData.getErrorMessage(), ERRORMESSAGE_BINDING);
            protocolMarshaller.marshall(contactData.getGroundStation(), GROUNDSTATION_BINDING);
            protocolMarshaller.marshall(contactData.getMaximumElevation(), MAXIMUMELEVATION_BINDING);
            protocolMarshaller.marshall(contactData.getMissionProfileArn(), MISSIONPROFILEARN_BINDING);
            protocolMarshaller.marshall(contactData.getPostPassEndTime(), POSTPASSENDTIME_BINDING);
            protocolMarshaller.marshall(contactData.getPrePassStartTime(), PREPASSSTARTTIME_BINDING);
            protocolMarshaller.marshall(contactData.getRegion(), REGION_BINDING);
            protocolMarshaller.marshall(contactData.getSatelliteArn(), SATELLITEARN_BINDING);
            protocolMarshaller.marshall(contactData.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(contactData.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
