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
 * StartBulkAssociateWirelessDeviceWithMulticastGroupRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartBulkAssociateWirelessDeviceWithMulticastGroupRequestMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> QUERYSTRING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueryString").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final StartBulkAssociateWirelessDeviceWithMulticastGroupRequestMarshaller instance = new StartBulkAssociateWirelessDeviceWithMulticastGroupRequestMarshaller();

    public static StartBulkAssociateWirelessDeviceWithMulticastGroupRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartBulkAssociateWirelessDeviceWithMulticastGroupRequest startBulkAssociateWirelessDeviceWithMulticastGroupRequest,
            ProtocolMarshaller protocolMarshaller) {

        if (startBulkAssociateWirelessDeviceWithMulticastGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startBulkAssociateWirelessDeviceWithMulticastGroupRequest.getId(), ID_BINDING);
            protocolMarshaller.marshall(startBulkAssociateWirelessDeviceWithMulticastGroupRequest.getQueryString(), QUERYSTRING_BINDING);
            protocolMarshaller.marshall(startBulkAssociateWirelessDeviceWithMulticastGroupRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
