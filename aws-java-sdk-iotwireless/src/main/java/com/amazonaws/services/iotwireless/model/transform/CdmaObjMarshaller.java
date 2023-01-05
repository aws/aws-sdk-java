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
 * CdmaObjMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CdmaObjMarshaller {

    private static final MarshallingInfo<Integer> SYSTEMID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SystemId").build();
    private static final MarshallingInfo<Integer> NETWORKID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkId").build();
    private static final MarshallingInfo<Integer> BASESTATIONID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BaseStationId").build();
    private static final MarshallingInfo<Integer> REGISTRATIONZONE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegistrationZone").build();
    private static final MarshallingInfo<StructuredPojo> CDMALOCALID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CdmaLocalId").build();
    private static final MarshallingInfo<Integer> PILOTPOWER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PilotPower").build();
    private static final MarshallingInfo<Float> BASELAT_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BaseLat").build();
    private static final MarshallingInfo<Float> BASELNG_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BaseLng").build();
    private static final MarshallingInfo<List> CDMANMR_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CdmaNmr").build();

    private static final CdmaObjMarshaller instance = new CdmaObjMarshaller();

    public static CdmaObjMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CdmaObj cdmaObj, ProtocolMarshaller protocolMarshaller) {

        if (cdmaObj == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cdmaObj.getSystemId(), SYSTEMID_BINDING);
            protocolMarshaller.marshall(cdmaObj.getNetworkId(), NETWORKID_BINDING);
            protocolMarshaller.marshall(cdmaObj.getBaseStationId(), BASESTATIONID_BINDING);
            protocolMarshaller.marshall(cdmaObj.getRegistrationZone(), REGISTRATIONZONE_BINDING);
            protocolMarshaller.marshall(cdmaObj.getCdmaLocalId(), CDMALOCALID_BINDING);
            protocolMarshaller.marshall(cdmaObj.getPilotPower(), PILOTPOWER_BINDING);
            protocolMarshaller.marshall(cdmaObj.getBaseLat(), BASELAT_BINDING);
            protocolMarshaller.marshall(cdmaObj.getBaseLng(), BASELNG_BINDING);
            protocolMarshaller.marshall(cdmaObj.getCdmaNmr(), CDMANMR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
