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
package com.amazonaws.services.iotwireless.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotwireless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListWirelessDevicesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListWirelessDevicesRequestMarshaller {

    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("nextToken").build();
    private static final MarshallingInfo<String> DESTINATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("destinationName").build();
    private static final MarshallingInfo<String> DEVICEPROFILEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("deviceProfileId").build();
    private static final MarshallingInfo<String> SERVICEPROFILEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("serviceProfileId").build();
    private static final MarshallingInfo<String> WIRELESSDEVICETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("wirelessDeviceType").build();

    private static final ListWirelessDevicesRequestMarshaller instance = new ListWirelessDevicesRequestMarshaller();

    public static ListWirelessDevicesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListWirelessDevicesRequest listWirelessDevicesRequest, ProtocolMarshaller protocolMarshaller) {

        if (listWirelessDevicesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listWirelessDevicesRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listWirelessDevicesRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listWirelessDevicesRequest.getDestinationName(), DESTINATIONNAME_BINDING);
            protocolMarshaller.marshall(listWirelessDevicesRequest.getDeviceProfileId(), DEVICEPROFILEID_BINDING);
            protocolMarshaller.marshall(listWirelessDevicesRequest.getServiceProfileId(), SERVICEPROFILEID_BINDING);
            protocolMarshaller.marshall(listWirelessDevicesRequest.getWirelessDeviceType(), WIRELESSDEVICETYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
