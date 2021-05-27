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
package com.amazonaws.services.ioteventsdata.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ioteventsdata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CustomerActionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CustomerActionMarshaller {

    private static final MarshallingInfo<String> ACTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("actionName").build();
    private static final MarshallingInfo<StructuredPojo> SNOOZEACTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("snoozeActionConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> ENABLEACTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enableActionConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> DISABLEACTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("disableActionConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> ACKNOWLEDGEACTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("acknowledgeActionConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> RESETACTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resetActionConfiguration").build();

    private static final CustomerActionMarshaller instance = new CustomerActionMarshaller();

    public static CustomerActionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CustomerAction customerAction, ProtocolMarshaller protocolMarshaller) {

        if (customerAction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(customerAction.getActionName(), ACTIONNAME_BINDING);
            protocolMarshaller.marshall(customerAction.getSnoozeActionConfiguration(), SNOOZEACTIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(customerAction.getEnableActionConfiguration(), ENABLEACTIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(customerAction.getDisableActionConfiguration(), DISABLEACTIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(customerAction.getAcknowledgeActionConfiguration(), ACKNOWLEDGEACTIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(customerAction.getResetActionConfiguration(), RESETACTIONCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
