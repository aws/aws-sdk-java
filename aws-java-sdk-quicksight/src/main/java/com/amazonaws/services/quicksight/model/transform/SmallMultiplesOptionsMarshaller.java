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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SmallMultiplesOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SmallMultiplesOptionsMarshaller {

    private static final MarshallingInfo<Long> MAXVISIBLEROWS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxVisibleRows").build();
    private static final MarshallingInfo<Long> MAXVISIBLECOLUMNS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxVisibleColumns").build();
    private static final MarshallingInfo<StructuredPojo> PANELCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PanelConfiguration").build();

    private static final SmallMultiplesOptionsMarshaller instance = new SmallMultiplesOptionsMarshaller();

    public static SmallMultiplesOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SmallMultiplesOptions smallMultiplesOptions, ProtocolMarshaller protocolMarshaller) {

        if (smallMultiplesOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(smallMultiplesOptions.getMaxVisibleRows(), MAXVISIBLEROWS_BINDING);
            protocolMarshaller.marshall(smallMultiplesOptions.getMaxVisibleColumns(), MAXVISIBLECOLUMNS_BINDING);
            protocolMarshaller.marshall(smallMultiplesOptions.getPanelConfiguration(), PANELCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
