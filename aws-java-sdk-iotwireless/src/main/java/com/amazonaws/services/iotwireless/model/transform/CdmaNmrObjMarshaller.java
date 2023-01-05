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
 * CdmaNmrObjMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CdmaNmrObjMarshaller {

    private static final MarshallingInfo<Integer> PNOFFSET_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PnOffset").build();
    private static final MarshallingInfo<Integer> CDMACHANNEL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CdmaChannel").build();
    private static final MarshallingInfo<Integer> PILOTPOWER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PilotPower").build();
    private static final MarshallingInfo<Integer> BASESTATIONID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BaseStationId").build();

    private static final CdmaNmrObjMarshaller instance = new CdmaNmrObjMarshaller();

    public static CdmaNmrObjMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CdmaNmrObj cdmaNmrObj, ProtocolMarshaller protocolMarshaller) {

        if (cdmaNmrObj == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cdmaNmrObj.getPnOffset(), PNOFFSET_BINDING);
            protocolMarshaller.marshall(cdmaNmrObj.getCdmaChannel(), CDMACHANNEL_BINDING);
            protocolMarshaller.marshall(cdmaNmrObj.getPilotPower(), PILOTPOWER_BINDING);
            protocolMarshaller.marshall(cdmaNmrObj.getBaseStationId(), BASESTATIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
