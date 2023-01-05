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
package com.amazonaws.services.iotwireless.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotwireless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetPositionEstimateRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetPositionEstimateRequestMarshaller {

    private static final MarshallingInfo<List> WIFIACCESSPOINTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WiFiAccessPoints").build();
    private static final MarshallingInfo<StructuredPojo> CELLTOWERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CellTowers").build();
    private static final MarshallingInfo<StructuredPojo> IP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ip").build();
    private static final MarshallingInfo<StructuredPojo> GNSS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Gnss").build();
    private static final MarshallingInfo<java.util.Date> TIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Timestamp").timestampFormat("unixTimestamp").build();

    private static final GetPositionEstimateRequestMarshaller instance = new GetPositionEstimateRequestMarshaller();

    public static GetPositionEstimateRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetPositionEstimateRequest getPositionEstimateRequest, ProtocolMarshaller protocolMarshaller) {

        if (getPositionEstimateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getPositionEstimateRequest.getWiFiAccessPoints(), WIFIACCESSPOINTS_BINDING);
            protocolMarshaller.marshall(getPositionEstimateRequest.getCellTowers(), CELLTOWERS_BINDING);
            protocolMarshaller.marshall(getPositionEstimateRequest.getIp(), IP_BINDING);
            protocolMarshaller.marshall(getPositionEstimateRequest.getGnss(), GNSS_BINDING);
            protocolMarshaller.marshall(getPositionEstimateRequest.getTimestamp(), TIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
