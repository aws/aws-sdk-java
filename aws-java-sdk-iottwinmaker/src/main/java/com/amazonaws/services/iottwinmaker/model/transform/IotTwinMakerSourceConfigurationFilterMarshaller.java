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
package com.amazonaws.services.iottwinmaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iottwinmaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * IotTwinMakerSourceConfigurationFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IotTwinMakerSourceConfigurationFilterMarshaller {

    private static final MarshallingInfo<StructuredPojo> FILTERBYCOMPONENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("filterByComponentType").build();
    private static final MarshallingInfo<StructuredPojo> FILTERBYENTITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("filterByEntity").build();

    private static final IotTwinMakerSourceConfigurationFilterMarshaller instance = new IotTwinMakerSourceConfigurationFilterMarshaller();

    public static IotTwinMakerSourceConfigurationFilterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IotTwinMakerSourceConfigurationFilter iotTwinMakerSourceConfigurationFilter, ProtocolMarshaller protocolMarshaller) {

        if (iotTwinMakerSourceConfigurationFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(iotTwinMakerSourceConfigurationFilter.getFilterByComponentType(), FILTERBYCOMPONENTTYPE_BINDING);
            protocolMarshaller.marshall(iotTwinMakerSourceConfigurationFilter.getFilterByEntity(), FILTERBYENTITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
