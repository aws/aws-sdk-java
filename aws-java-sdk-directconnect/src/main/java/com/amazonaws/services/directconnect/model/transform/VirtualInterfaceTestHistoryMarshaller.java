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
 * VirtualInterfaceTestHistoryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VirtualInterfaceTestHistoryMarshaller {

    private static final MarshallingInfo<String> TESTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("testId").build();
    private static final MarshallingInfo<String> VIRTUALINTERFACEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("virtualInterfaceId").build();
    private static final MarshallingInfo<List> BGPPEERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bgpPeers").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> OWNERACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ownerAccount").build();
    private static final MarshallingInfo<Integer> TESTDURATIONINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("testDurationInMinutes").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endTime").timestampFormat("unixTimestamp").build();

    private static final VirtualInterfaceTestHistoryMarshaller instance = new VirtualInterfaceTestHistoryMarshaller();

    public static VirtualInterfaceTestHistoryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VirtualInterfaceTestHistory virtualInterfaceTestHistory, ProtocolMarshaller protocolMarshaller) {

        if (virtualInterfaceTestHistory == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(virtualInterfaceTestHistory.getTestId(), TESTID_BINDING);
            protocolMarshaller.marshall(virtualInterfaceTestHistory.getVirtualInterfaceId(), VIRTUALINTERFACEID_BINDING);
            protocolMarshaller.marshall(virtualInterfaceTestHistory.getBgpPeers(), BGPPEERS_BINDING);
            protocolMarshaller.marshall(virtualInterfaceTestHistory.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(virtualInterfaceTestHistory.getOwnerAccount(), OWNERACCOUNT_BINDING);
            protocolMarshaller.marshall(virtualInterfaceTestHistory.getTestDurationInMinutes(), TESTDURATIONINMINUTES_BINDING);
            protocolMarshaller.marshall(virtualInterfaceTestHistory.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(virtualInterfaceTestHistory.getEndTime(), ENDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
