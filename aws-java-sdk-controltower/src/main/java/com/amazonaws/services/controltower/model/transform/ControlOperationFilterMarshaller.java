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
package com.amazonaws.services.controltower.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.controltower.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ControlOperationFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ControlOperationFilterMarshaller {

    private static final MarshallingInfo<List> CONTROLIDENTIFIERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("controlIdentifiers").build();
    private static final MarshallingInfo<List> CONTROLOPERATIONTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("controlOperationTypes").build();
    private static final MarshallingInfo<List> ENABLEDCONTROLIDENTIFIERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enabledControlIdentifiers").build();
    private static final MarshallingInfo<List> STATUSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("statuses").build();
    private static final MarshallingInfo<List> TARGETIDENTIFIERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetIdentifiers").build();

    private static final ControlOperationFilterMarshaller instance = new ControlOperationFilterMarshaller();

    public static ControlOperationFilterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ControlOperationFilter controlOperationFilter, ProtocolMarshaller protocolMarshaller) {

        if (controlOperationFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(controlOperationFilter.getControlIdentifiers(), CONTROLIDENTIFIERS_BINDING);
            protocolMarshaller.marshall(controlOperationFilter.getControlOperationTypes(), CONTROLOPERATIONTYPES_BINDING);
            protocolMarshaller.marshall(controlOperationFilter.getEnabledControlIdentifiers(), ENABLEDCONTROLIDENTIFIERS_BINDING);
            protocolMarshaller.marshall(controlOperationFilter.getStatuses(), STATUSES_BINDING);
            protocolMarshaller.marshall(controlOperationFilter.getTargetIdentifiers(), TARGETIDENTIFIERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
