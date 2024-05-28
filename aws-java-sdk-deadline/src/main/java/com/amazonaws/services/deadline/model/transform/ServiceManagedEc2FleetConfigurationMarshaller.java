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
package com.amazonaws.services.deadline.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.deadline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ServiceManagedEc2FleetConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ServiceManagedEc2FleetConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> INSTANCECAPABILITIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceCapabilities").build();
    private static final MarshallingInfo<StructuredPojo> INSTANCEMARKETOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceMarketOptions").build();

    private static final ServiceManagedEc2FleetConfigurationMarshaller instance = new ServiceManagedEc2FleetConfigurationMarshaller();

    public static ServiceManagedEc2FleetConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ServiceManagedEc2FleetConfiguration serviceManagedEc2FleetConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (serviceManagedEc2FleetConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(serviceManagedEc2FleetConfiguration.getInstanceCapabilities(), INSTANCECAPABILITIES_BINDING);
            protocolMarshaller.marshall(serviceManagedEc2FleetConfiguration.getInstanceMarketOptions(), INSTANCEMARKETOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
