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
 * LteObjMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LteObjMarshaller {

    private static final MarshallingInfo<Integer> MCC_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Mcc").build();
    private static final MarshallingInfo<Integer> MNC_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Mnc").build();
    private static final MarshallingInfo<Integer> EUTRANCID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EutranCid").build();
    private static final MarshallingInfo<Integer> TAC_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tac").build();
    private static final MarshallingInfo<StructuredPojo> LTELOCALID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LteLocalId").build();
    private static final MarshallingInfo<Integer> LTETIMINGADVANCE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LteTimingAdvance").build();
    private static final MarshallingInfo<Integer> RSRP_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Rsrp").build();
    private static final MarshallingInfo<Float> RSRQ_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Rsrq").build();
    private static final MarshallingInfo<Boolean> NRCAPABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NrCapable").build();
    private static final MarshallingInfo<List> LTENMR_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LteNmr").build();

    private static final LteObjMarshaller instance = new LteObjMarshaller();

    public static LteObjMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LteObj lteObj, ProtocolMarshaller protocolMarshaller) {

        if (lteObj == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lteObj.getMcc(), MCC_BINDING);
            protocolMarshaller.marshall(lteObj.getMnc(), MNC_BINDING);
            protocolMarshaller.marshall(lteObj.getEutranCid(), EUTRANCID_BINDING);
            protocolMarshaller.marshall(lteObj.getTac(), TAC_BINDING);
            protocolMarshaller.marshall(lteObj.getLteLocalId(), LTELOCALID_BINDING);
            protocolMarshaller.marshall(lteObj.getLteTimingAdvance(), LTETIMINGADVANCE_BINDING);
            protocolMarshaller.marshall(lteObj.getRsrp(), RSRP_BINDING);
            protocolMarshaller.marshall(lteObj.getRsrq(), RSRQ_BINDING);
            protocolMarshaller.marshall(lteObj.getNrCapable(), NRCAPABLE_BINDING);
            protocolMarshaller.marshall(lteObj.getLteNmr(), LTENMR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
