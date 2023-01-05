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
 * GsmNmrObjMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GsmNmrObjMarshaller {

    private static final MarshallingInfo<Integer> BSIC_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Bsic").build();
    private static final MarshallingInfo<Integer> BCCH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Bcch").build();
    private static final MarshallingInfo<Integer> RXLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RxLevel").build();
    private static final MarshallingInfo<StructuredPojo> GLOBALIDENTITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GlobalIdentity").build();

    private static final GsmNmrObjMarshaller instance = new GsmNmrObjMarshaller();

    public static GsmNmrObjMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GsmNmrObj gsmNmrObj, ProtocolMarshaller protocolMarshaller) {

        if (gsmNmrObj == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(gsmNmrObj.getBsic(), BSIC_BINDING);
            protocolMarshaller.marshall(gsmNmrObj.getBcch(), BCCH_BINDING);
            protocolMarshaller.marshall(gsmNmrObj.getRxLevel(), RXLEVEL_BINDING);
            protocolMarshaller.marshall(gsmNmrObj.getGlobalIdentity(), GLOBALIDENTITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
