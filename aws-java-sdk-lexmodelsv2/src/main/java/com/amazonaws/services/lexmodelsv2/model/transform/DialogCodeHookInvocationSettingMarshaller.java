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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DialogCodeHookInvocationSettingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DialogCodeHookInvocationSettingMarshaller {

    private static final MarshallingInfo<Boolean> ENABLECODEHOOKINVOCATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enableCodeHookInvocation").build();
    private static final MarshallingInfo<Boolean> ACTIVE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("active").build();
    private static final MarshallingInfo<String> INVOCATIONLABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("invocationLabel").build();
    private static final MarshallingInfo<StructuredPojo> POSTCODEHOOKSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("postCodeHookSpecification").build();

    private static final DialogCodeHookInvocationSettingMarshaller instance = new DialogCodeHookInvocationSettingMarshaller();

    public static DialogCodeHookInvocationSettingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DialogCodeHookInvocationSetting dialogCodeHookInvocationSetting, ProtocolMarshaller protocolMarshaller) {

        if (dialogCodeHookInvocationSetting == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dialogCodeHookInvocationSetting.getEnableCodeHookInvocation(), ENABLECODEHOOKINVOCATION_BINDING);
            protocolMarshaller.marshall(dialogCodeHookInvocationSetting.getActive(), ACTIVE_BINDING);
            protocolMarshaller.marshall(dialogCodeHookInvocationSetting.getInvocationLabel(), INVOCATIONLABEL_BINDING);
            protocolMarshaller.marshall(dialogCodeHookInvocationSetting.getPostCodeHookSpecification(), POSTCODEHOOKSPECIFICATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
