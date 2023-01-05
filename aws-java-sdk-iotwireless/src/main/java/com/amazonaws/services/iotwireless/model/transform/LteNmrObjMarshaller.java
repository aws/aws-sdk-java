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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotwireless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LteNmrObjMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LteNmrObjMarshaller {

    private static final MarshallingInfo<Integer> PCI_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Pci").build();
    private static final MarshallingInfo<Integer> EARFCN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Earfcn").build();
    private static final MarshallingInfo<Integer> EUTRANCID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EutranCid").build();
    private static final MarshallingInfo<Integer> RSRP_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Rsrp").build();
    private static final MarshallingInfo<Float> RSRQ_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Rsrq").build();

    private static final LteNmrObjMarshaller instance = new LteNmrObjMarshaller();

    public static LteNmrObjMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LteNmrObj lteNmrObj, ProtocolMarshaller protocolMarshaller) {

        if (lteNmrObj == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lteNmrObj.getPci(), PCI_BINDING);
            protocolMarshaller.marshall(lteNmrObj.getEarfcn(), EARFCN_BINDING);
            protocolMarshaller.marshall(lteNmrObj.getEutranCid(), EUTRANCID_BINDING);
            protocolMarshaller.marshall(lteNmrObj.getRsrp(), RSRP_BINDING);
            protocolMarshaller.marshall(lteNmrObj.getRsrq(), RSRQ_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
