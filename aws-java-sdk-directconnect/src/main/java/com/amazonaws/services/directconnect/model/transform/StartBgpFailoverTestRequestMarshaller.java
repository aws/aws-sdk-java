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
package com.amazonaws.services.directconnect.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartBgpFailoverTestRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartBgpFailoverTestRequestMarshaller {

    private static final MarshallingInfo<String> VIRTUALINTERFACEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("virtualInterfaceId").build();
    private static final MarshallingInfo<List> BGPPEERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bgpPeers").build();
    private static final MarshallingInfo<Integer> TESTDURATIONINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("testDurationInMinutes").build();

    private static final StartBgpFailoverTestRequestMarshaller instance = new StartBgpFailoverTestRequestMarshaller();

    public static StartBgpFailoverTestRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartBgpFailoverTestRequest startBgpFailoverTestRequest, ProtocolMarshaller protocolMarshaller) {

        if (startBgpFailoverTestRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startBgpFailoverTestRequest.getVirtualInterfaceId(), VIRTUALINTERFACEID_BINDING);
            protocolMarshaller.marshall(startBgpFailoverTestRequest.getBgpPeers(), BGPPEERS_BINDING);
            protocolMarshaller.marshall(startBgpFailoverTestRequest.getTestDurationInMinutes(), TESTDURATIONINMINUTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
