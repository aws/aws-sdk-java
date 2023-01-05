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
 * WcdmaNmrObjMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WcdmaNmrObjMarshaller {

    private static final MarshallingInfo<Integer> UARFCNDL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Uarfcndl").build();
    private static final MarshallingInfo<Integer> PSC_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Psc").build();
    private static final MarshallingInfo<Integer> UTRANCID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UtranCid").build();
    private static final MarshallingInfo<Integer> RSCP_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Rscp").build();
    private static final MarshallingInfo<Integer> PATHLOSS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PathLoss").build();

    private static final WcdmaNmrObjMarshaller instance = new WcdmaNmrObjMarshaller();

    public static WcdmaNmrObjMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WcdmaNmrObj wcdmaNmrObj, ProtocolMarshaller protocolMarshaller) {

        if (wcdmaNmrObj == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(wcdmaNmrObj.getUarfcndl(), UARFCNDL_BINDING);
            protocolMarshaller.marshall(wcdmaNmrObj.getPsc(), PSC_BINDING);
            protocolMarshaller.marshall(wcdmaNmrObj.getUtranCid(), UTRANCID_BINDING);
            protocolMarshaller.marshall(wcdmaNmrObj.getRscp(), RSCP_BINDING);
            protocolMarshaller.marshall(wcdmaNmrObj.getPathLoss(), PATHLOSS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
