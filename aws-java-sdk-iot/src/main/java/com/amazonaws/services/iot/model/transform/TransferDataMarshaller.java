/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TransferDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TransferDataMarshaller {

    private static final MarshallingInfo<String> TRANSFERMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transferMessage").build();
    private static final MarshallingInfo<String> REJECTREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rejectReason").build();
    private static final MarshallingInfo<java.util.Date> TRANSFERDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transferDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ACCEPTDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("acceptDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> REJECTDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rejectDate").timestampFormat("unixTimestamp").build();

    private static final TransferDataMarshaller instance = new TransferDataMarshaller();

    public static TransferDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TransferData transferData, ProtocolMarshaller protocolMarshaller) {

        if (transferData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(transferData.getTransferMessage(), TRANSFERMESSAGE_BINDING);
            protocolMarshaller.marshall(transferData.getRejectReason(), REJECTREASON_BINDING);
            protocolMarshaller.marshall(transferData.getTransferDate(), TRANSFERDATE_BINDING);
            protocolMarshaller.marshall(transferData.getAcceptDate(), ACCEPTDATE_BINDING);
            protocolMarshaller.marshall(transferData.getRejectDate(), REJECTDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
