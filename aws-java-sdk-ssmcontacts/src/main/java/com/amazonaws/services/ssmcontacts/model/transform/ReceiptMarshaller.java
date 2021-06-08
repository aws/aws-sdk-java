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
package com.amazonaws.services.ssmcontacts.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ssmcontacts.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReceiptMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReceiptMarshaller {

    private static final MarshallingInfo<String> CONTACTCHANNELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContactChannelArn").build();
    private static final MarshallingInfo<String> RECEIPTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReceiptType").build();
    private static final MarshallingInfo<String> RECEIPTINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReceiptInfo").build();
    private static final MarshallingInfo<java.util.Date> RECEIPTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReceiptTime").timestampFormat("unixTimestamp").build();

    private static final ReceiptMarshaller instance = new ReceiptMarshaller();

    public static ReceiptMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Receipt receipt, ProtocolMarshaller protocolMarshaller) {

        if (receipt == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(receipt.getContactChannelArn(), CONTACTCHANNELARN_BINDING);
            protocolMarshaller.marshall(receipt.getReceiptType(), RECEIPTTYPE_BINDING);
            protocolMarshaller.marshall(receipt.getReceiptInfo(), RECEIPTINFO_BINDING);
            protocolMarshaller.marshall(receipt.getReceiptTime(), RECEIPTTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
