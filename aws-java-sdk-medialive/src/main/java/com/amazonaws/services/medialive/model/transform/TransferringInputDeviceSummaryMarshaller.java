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
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TransferringInputDeviceSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TransferringInputDeviceSummaryMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> MESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("message").build();
    private static final MarshallingInfo<String> TARGETCUSTOMERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetCustomerId").build();
    private static final MarshallingInfo<String> TRANSFERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transferType").build();

    private static final TransferringInputDeviceSummaryMarshaller instance = new TransferringInputDeviceSummaryMarshaller();

    public static TransferringInputDeviceSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TransferringInputDeviceSummary transferringInputDeviceSummary, ProtocolMarshaller protocolMarshaller) {

        if (transferringInputDeviceSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(transferringInputDeviceSummary.getId(), ID_BINDING);
            protocolMarshaller.marshall(transferringInputDeviceSummary.getMessage(), MESSAGE_BINDING);
            protocolMarshaller.marshall(transferringInputDeviceSummary.getTargetCustomerId(), TARGETCUSTOMERID_BINDING);
            protocolMarshaller.marshall(transferringInputDeviceSummary.getTransferType(), TRANSFERTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
