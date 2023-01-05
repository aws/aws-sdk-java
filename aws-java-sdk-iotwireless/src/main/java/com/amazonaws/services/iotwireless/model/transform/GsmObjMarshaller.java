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
 * GsmObjMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GsmObjMarshaller {

    private static final MarshallingInfo<Integer> MCC_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Mcc").build();
    private static final MarshallingInfo<Integer> MNC_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Mnc").build();
    private static final MarshallingInfo<Integer> LAC_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Lac").build();
    private static final MarshallingInfo<Integer> GERANCID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GeranCid").build();
    private static final MarshallingInfo<StructuredPojo> GSMLOCALID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GsmLocalId").build();
    private static final MarshallingInfo<Integer> GSMTIMINGADVANCE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GsmTimingAdvance").build();
    private static final MarshallingInfo<Integer> RXLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RxLevel").build();
    private static final MarshallingInfo<List> GSMNMR_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GsmNmr").build();

    private static final GsmObjMarshaller instance = new GsmObjMarshaller();

    public static GsmObjMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GsmObj gsmObj, ProtocolMarshaller protocolMarshaller) {

        if (gsmObj == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(gsmObj.getMcc(), MCC_BINDING);
            protocolMarshaller.marshall(gsmObj.getMnc(), MNC_BINDING);
            protocolMarshaller.marshall(gsmObj.getLac(), LAC_BINDING);
            protocolMarshaller.marshall(gsmObj.getGeranCid(), GERANCID_BINDING);
            protocolMarshaller.marshall(gsmObj.getGsmLocalId(), GSMLOCALID_BINDING);
            protocolMarshaller.marshall(gsmObj.getGsmTimingAdvance(), GSMTIMINGADVANCE_BINDING);
            protocolMarshaller.marshall(gsmObj.getRxLevel(), RXLEVEL_BINDING);
            protocolMarshaller.marshall(gsmObj.getGsmNmr(), GSMNMR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
