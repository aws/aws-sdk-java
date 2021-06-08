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
package com.amazonaws.services.licensemanager.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.licensemanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConsumptionConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConsumptionConfigurationMarshaller {

    private static final MarshallingInfo<String> RENEWTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RenewType").build();
    private static final MarshallingInfo<StructuredPojo> PROVISIONALCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionalConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> BORROWCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BorrowConfiguration").build();

    private static final ConsumptionConfigurationMarshaller instance = new ConsumptionConfigurationMarshaller();

    public static ConsumptionConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConsumptionConfiguration consumptionConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (consumptionConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(consumptionConfiguration.getRenewType(), RENEWTYPE_BINDING);
            protocolMarshaller.marshall(consumptionConfiguration.getProvisionalConfiguration(), PROVISIONALCONFIGURATION_BINDING);
            protocolMarshaller.marshall(consumptionConfiguration.getBorrowConfiguration(), BORROWCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
