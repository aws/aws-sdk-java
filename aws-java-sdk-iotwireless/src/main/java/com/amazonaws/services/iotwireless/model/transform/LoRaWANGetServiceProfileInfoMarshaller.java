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
 * LoRaWANGetServiceProfileInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LoRaWANGetServiceProfileInfoMarshaller {

    private static final MarshallingInfo<Integer> ULRATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UlRate").build();
    private static final MarshallingInfo<Integer> ULBUCKETSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UlBucketSize").build();
    private static final MarshallingInfo<String> ULRATEPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UlRatePolicy").build();
    private static final MarshallingInfo<Integer> DLRATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DlRate").build();
    private static final MarshallingInfo<Integer> DLBUCKETSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DlBucketSize").build();
    private static final MarshallingInfo<String> DLRATEPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DlRatePolicy").build();
    private static final MarshallingInfo<Boolean> ADDGWMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AddGwMetadata").build();
    private static final MarshallingInfo<Integer> DEVSTATUSREQFREQ_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DevStatusReqFreq").build();
    private static final MarshallingInfo<Boolean> REPORTDEVSTATUSBATTERY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReportDevStatusBattery").build();
    private static final MarshallingInfo<Boolean> REPORTDEVSTATUSMARGIN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReportDevStatusMargin").build();
    private static final MarshallingInfo<Integer> DRMIN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DrMin").build();
    private static final MarshallingInfo<Integer> DRMAX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DrMax").build();
    private static final MarshallingInfo<String> CHANNELMASK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChannelMask").build();
    private static final MarshallingInfo<Boolean> PRALLOWED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrAllowed").build();
    private static final MarshallingInfo<Boolean> HRALLOWED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HrAllowed").build();
    private static final MarshallingInfo<Boolean> RAALLOWED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RaAllowed").build();
    private static final MarshallingInfo<Boolean> NWKGEOLOC_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NwkGeoLoc").build();
    private static final MarshallingInfo<Integer> TARGETPER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetPer").build();
    private static final MarshallingInfo<Integer> MINGWDIVERSITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinGwDiversity").build();

    private static final LoRaWANGetServiceProfileInfoMarshaller instance = new LoRaWANGetServiceProfileInfoMarshaller();

    public static LoRaWANGetServiceProfileInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LoRaWANGetServiceProfileInfo loRaWANGetServiceProfileInfo, ProtocolMarshaller protocolMarshaller) {

        if (loRaWANGetServiceProfileInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(loRaWANGetServiceProfileInfo.getUlRate(), ULRATE_BINDING);
            protocolMarshaller.marshall(loRaWANGetServiceProfileInfo.getUlBucketSize(), ULBUCKETSIZE_BINDING);
            protocolMarshaller.marshall(loRaWANGetServiceProfileInfo.getUlRatePolicy(), ULRATEPOLICY_BINDING);
            protocolMarshaller.marshall(loRaWANGetServiceProfileInfo.getDlRate(), DLRATE_BINDING);
            protocolMarshaller.marshall(loRaWANGetServiceProfileInfo.getDlBucketSize(), DLBUCKETSIZE_BINDING);
            protocolMarshaller.marshall(loRaWANGetServiceProfileInfo.getDlRatePolicy(), DLRATEPOLICY_BINDING);
            protocolMarshaller.marshall(loRaWANGetServiceProfileInfo.getAddGwMetadata(), ADDGWMETADATA_BINDING);
            protocolMarshaller.marshall(loRaWANGetServiceProfileInfo.getDevStatusReqFreq(), DEVSTATUSREQFREQ_BINDING);
            protocolMarshaller.marshall(loRaWANGetServiceProfileInfo.getReportDevStatusBattery(), REPORTDEVSTATUSBATTERY_BINDING);
            protocolMarshaller.marshall(loRaWANGetServiceProfileInfo.getReportDevStatusMargin(), REPORTDEVSTATUSMARGIN_BINDING);
            protocolMarshaller.marshall(loRaWANGetServiceProfileInfo.getDrMin(), DRMIN_BINDING);
            protocolMarshaller.marshall(loRaWANGetServiceProfileInfo.getDrMax(), DRMAX_BINDING);
            protocolMarshaller.marshall(loRaWANGetServiceProfileInfo.getChannelMask(), CHANNELMASK_BINDING);
            protocolMarshaller.marshall(loRaWANGetServiceProfileInfo.getPrAllowed(), PRALLOWED_BINDING);
            protocolMarshaller.marshall(loRaWANGetServiceProfileInfo.getHrAllowed(), HRALLOWED_BINDING);
            protocolMarshaller.marshall(loRaWANGetServiceProfileInfo.getRaAllowed(), RAALLOWED_BINDING);
            protocolMarshaller.marshall(loRaWANGetServiceProfileInfo.getNwkGeoLoc(), NWKGEOLOC_BINDING);
            protocolMarshaller.marshall(loRaWANGetServiceProfileInfo.getTargetPer(), TARGETPER_BINDING);
            protocolMarshaller.marshall(loRaWANGetServiceProfileInfo.getMinGwDiversity(), MINGWDIVERSITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
