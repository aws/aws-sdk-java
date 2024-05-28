/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.detective.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.detective.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TTPsObservedDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TTPsObservedDetailMarshaller {

    private static final MarshallingInfo<String> TACTIC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tactic").build();
    private static final MarshallingInfo<String> TECHNIQUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Technique").build();
    private static final MarshallingInfo<String> PROCEDURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Procedure").build();
    private static final MarshallingInfo<String> IPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IpAddress").build();
    private static final MarshallingInfo<String> APINAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("APIName").build();
    private static final MarshallingInfo<Long> APISUCCESSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("APISuccessCount").build();
    private static final MarshallingInfo<Long> APIFAILURECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("APIFailureCount").build();

    private static final TTPsObservedDetailMarshaller instance = new TTPsObservedDetailMarshaller();

    public static TTPsObservedDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TTPsObservedDetail tTPsObservedDetail, ProtocolMarshaller protocolMarshaller) {

        if (tTPsObservedDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(tTPsObservedDetail.getTactic(), TACTIC_BINDING);
            protocolMarshaller.marshall(tTPsObservedDetail.getTechnique(), TECHNIQUE_BINDING);
            protocolMarshaller.marshall(tTPsObservedDetail.getProcedure(), PROCEDURE_BINDING);
            protocolMarshaller.marshall(tTPsObservedDetail.getIpAddress(), IPADDRESS_BINDING);
            protocolMarshaller.marshall(tTPsObservedDetail.getAPIName(), APINAME_BINDING);
            protocolMarshaller.marshall(tTPsObservedDetail.getAPISuccessCount(), APISUCCESSCOUNT_BINDING);
            protocolMarshaller.marshall(tTPsObservedDetail.getAPIFailureCount(), APIFAILURECOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
