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
package com.amazonaws.services.lexmodelsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribeSlotTypeRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeSlotTypeRequestMarshaller {

    private static final MarshallingInfo<String> SLOTTYPEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("slotTypeId").build();
    private static final MarshallingInfo<String> BOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botId").build();
    private static final MarshallingInfo<String> BOTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botVersion").build();
    private static final MarshallingInfo<String> LOCALEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("localeId").build();

    private static final DescribeSlotTypeRequestMarshaller instance = new DescribeSlotTypeRequestMarshaller();

    public static DescribeSlotTypeRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeSlotTypeRequest describeSlotTypeRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeSlotTypeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeSlotTypeRequest.getSlotTypeId(), SLOTTYPEID_BINDING);
            protocolMarshaller.marshall(describeSlotTypeRequest.getBotId(), BOTID_BINDING);
            protocolMarshaller.marshall(describeSlotTypeRequest.getBotVersion(), BOTVERSION_BINDING);
            protocolMarshaller.marshall(describeSlotTypeRequest.getLocaleId(), LOCALEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
