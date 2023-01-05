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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SubSlotValueElicitationSettingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SubSlotValueElicitationSettingMarshaller {

    private static final MarshallingInfo<StructuredPojo> DEFAULTVALUESPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultValueSpecification").build();
    private static final MarshallingInfo<StructuredPojo> PROMPTSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("promptSpecification").build();
    private static final MarshallingInfo<List> SAMPLEUTTERANCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sampleUtterances").build();
    private static final MarshallingInfo<StructuredPojo> WAITANDCONTINUESPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("waitAndContinueSpecification").build();

    private static final SubSlotValueElicitationSettingMarshaller instance = new SubSlotValueElicitationSettingMarshaller();

    public static SubSlotValueElicitationSettingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SubSlotValueElicitationSetting subSlotValueElicitationSetting, ProtocolMarshaller protocolMarshaller) {

        if (subSlotValueElicitationSetting == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(subSlotValueElicitationSetting.getDefaultValueSpecification(), DEFAULTVALUESPECIFICATION_BINDING);
            protocolMarshaller.marshall(subSlotValueElicitationSetting.getPromptSpecification(), PROMPTSPECIFICATION_BINDING);
            protocolMarshaller.marshall(subSlotValueElicitationSetting.getSampleUtterances(), SAMPLEUTTERANCES_BINDING);
            protocolMarshaller.marshall(subSlotValueElicitationSetting.getWaitAndContinueSpecification(), WAITANDCONTINUESPECIFICATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
