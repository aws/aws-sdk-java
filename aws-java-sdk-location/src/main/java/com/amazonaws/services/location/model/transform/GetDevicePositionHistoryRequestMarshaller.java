/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.location.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.location.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetDevicePositionHistoryRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetDevicePositionHistoryRequestMarshaller {

    private static final MarshallingInfo<String> DEVICEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("DeviceId").build();
    private static final MarshallingInfo<java.util.Date> ENDTIMEEXCLUSIVE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTimeExclusive").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<java.util.Date> STARTTIMEINCLUSIVE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTimeInclusive").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> TRACKERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("TrackerName").build();

    private static final GetDevicePositionHistoryRequestMarshaller instance = new GetDevicePositionHistoryRequestMarshaller();

    public static GetDevicePositionHistoryRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetDevicePositionHistoryRequest getDevicePositionHistoryRequest, ProtocolMarshaller protocolMarshaller) {

        if (getDevicePositionHistoryRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getDevicePositionHistoryRequest.getDeviceId(), DEVICEID_BINDING);
            protocolMarshaller.marshall(getDevicePositionHistoryRequest.getEndTimeExclusive(), ENDTIMEEXCLUSIVE_BINDING);
            protocolMarshaller.marshall(getDevicePositionHistoryRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(getDevicePositionHistoryRequest.getStartTimeInclusive(), STARTTIMEINCLUSIVE_BINDING);
            protocolMarshaller.marshall(getDevicePositionHistoryRequest.getTrackerName(), TRACKERNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
