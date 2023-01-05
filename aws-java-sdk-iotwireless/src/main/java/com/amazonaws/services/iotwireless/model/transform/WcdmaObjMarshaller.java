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
 * WcdmaObjMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WcdmaObjMarshaller {

    private static final MarshallingInfo<Integer> MCC_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Mcc").build();
    private static final MarshallingInfo<Integer> MNC_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Mnc").build();
    private static final MarshallingInfo<Integer> LAC_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Lac").build();
    private static final MarshallingInfo<Integer> UTRANCID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UtranCid").build();
    private static final MarshallingInfo<StructuredPojo> WCDMALOCALID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WcdmaLocalId").build();
    private static final MarshallingInfo<Integer> RSCP_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Rscp").build();
    private static final MarshallingInfo<Integer> PATHLOSS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PathLoss").build();
    private static final MarshallingInfo<List> WCDMANMR_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("WcdmaNmr").build();

    private static final WcdmaObjMarshaller instance = new WcdmaObjMarshaller();

    public static WcdmaObjMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WcdmaObj wcdmaObj, ProtocolMarshaller protocolMarshaller) {

        if (wcdmaObj == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(wcdmaObj.getMcc(), MCC_BINDING);
            protocolMarshaller.marshall(wcdmaObj.getMnc(), MNC_BINDING);
            protocolMarshaller.marshall(wcdmaObj.getLac(), LAC_BINDING);
            protocolMarshaller.marshall(wcdmaObj.getUtranCid(), UTRANCID_BINDING);
            protocolMarshaller.marshall(wcdmaObj.getWcdmaLocalId(), WCDMALOCALID_BINDING);
            protocolMarshaller.marshall(wcdmaObj.getRscp(), RSCP_BINDING);
            protocolMarshaller.marshall(wcdmaObj.getPathLoss(), PATHLOSS_BINDING);
            protocolMarshaller.marshall(wcdmaObj.getWcdmaNmr(), WCDMANMR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
