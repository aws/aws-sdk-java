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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotwireless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LoRaWANDeviceProfileMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LoRaWANDeviceProfileMarshaller {

    private static final MarshallingInfo<Boolean> SUPPORTSCLASSB_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportsClassB").build();
    private static final MarshallingInfo<Integer> CLASSBTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClassBTimeout").build();
    private static final MarshallingInfo<Integer> PINGSLOTPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PingSlotPeriod").build();
    private static final MarshallingInfo<Integer> PINGSLOTDR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PingSlotDr").build();
    private static final MarshallingInfo<Integer> PINGSLOTFREQ_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PingSlotFreq").build();
    private static final MarshallingInfo<Boolean> SUPPORTSCLASSC_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportsClassC").build();
    private static final MarshallingInfo<Integer> CLASSCTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClassCTimeout").build();
    private static final MarshallingInfo<String> MACVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MacVersion").build();
    private static final MarshallingInfo<String> REGPARAMSREVISION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegParamsRevision").build();
    private static final MarshallingInfo<Integer> RXDELAY1_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RxDelay1").build();
    private static final MarshallingInfo<Integer> RXDROFFSET1_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RxDrOffset1").build();
    private static final MarshallingInfo<Integer> RXDATARATE2_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RxDataRate2").build();
    private static final MarshallingInfo<Integer> RXFREQ2_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RxFreq2").build();
    private static final MarshallingInfo<List> FACTORYPRESETFREQSLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FactoryPresetFreqsList").build();
    private static final MarshallingInfo<Integer> MAXEIRP_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaxEirp").build();
    private static final MarshallingInfo<Integer> MAXDUTYCYCLE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxDutyCycle").build();
    private static final MarshallingInfo<String> RFREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RfRegion").build();
    private static final MarshallingInfo<Boolean> SUPPORTSJOIN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportsJoin").build();
    private static final MarshallingInfo<Boolean> SUPPORTS32BITFCNT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Supports32BitFCnt").build();

    private static final LoRaWANDeviceProfileMarshaller instance = new LoRaWANDeviceProfileMarshaller();

    public static LoRaWANDeviceProfileMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LoRaWANDeviceProfile loRaWANDeviceProfile, ProtocolMarshaller protocolMarshaller) {

        if (loRaWANDeviceProfile == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(loRaWANDeviceProfile.getSupportsClassB(), SUPPORTSCLASSB_BINDING);
            protocolMarshaller.marshall(loRaWANDeviceProfile.getClassBTimeout(), CLASSBTIMEOUT_BINDING);
            protocolMarshaller.marshall(loRaWANDeviceProfile.getPingSlotPeriod(), PINGSLOTPERIOD_BINDING);
            protocolMarshaller.marshall(loRaWANDeviceProfile.getPingSlotDr(), PINGSLOTDR_BINDING);
            protocolMarshaller.marshall(loRaWANDeviceProfile.getPingSlotFreq(), PINGSLOTFREQ_BINDING);
            protocolMarshaller.marshall(loRaWANDeviceProfile.getSupportsClassC(), SUPPORTSCLASSC_BINDING);
            protocolMarshaller.marshall(loRaWANDeviceProfile.getClassCTimeout(), CLASSCTIMEOUT_BINDING);
            protocolMarshaller.marshall(loRaWANDeviceProfile.getMacVersion(), MACVERSION_BINDING);
            protocolMarshaller.marshall(loRaWANDeviceProfile.getRegParamsRevision(), REGPARAMSREVISION_BINDING);
            protocolMarshaller.marshall(loRaWANDeviceProfile.getRxDelay1(), RXDELAY1_BINDING);
            protocolMarshaller.marshall(loRaWANDeviceProfile.getRxDrOffset1(), RXDROFFSET1_BINDING);
            protocolMarshaller.marshall(loRaWANDeviceProfile.getRxDataRate2(), RXDATARATE2_BINDING);
            protocolMarshaller.marshall(loRaWANDeviceProfile.getRxFreq2(), RXFREQ2_BINDING);
            protocolMarshaller.marshall(loRaWANDeviceProfile.getFactoryPresetFreqsList(), FACTORYPRESETFREQSLIST_BINDING);
            protocolMarshaller.marshall(loRaWANDeviceProfile.getMaxEirp(), MAXEIRP_BINDING);
            protocolMarshaller.marshall(loRaWANDeviceProfile.getMaxDutyCycle(), MAXDUTYCYCLE_BINDING);
            protocolMarshaller.marshall(loRaWANDeviceProfile.getRfRegion(), RFREGION_BINDING);
            protocolMarshaller.marshall(loRaWANDeviceProfile.getSupportsJoin(), SUPPORTSJOIN_BINDING);
            protocolMarshaller.marshall(loRaWANDeviceProfile.getSupports32BitFCnt(), SUPPORTS32BITFCNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
