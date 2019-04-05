/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gamelift.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamelift.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateFleetAttributesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateFleetAttributesRequestMarshaller {

    private static final MarshallingInfo<String> FLEETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FleetId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> NEWGAMESESSIONPROTECTIONPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NewGameSessionProtectionPolicy").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCECREATIONLIMITPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceCreationLimitPolicy").build();
    private static final MarshallingInfo<List> METRICGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MetricGroups").build();

    private static final UpdateFleetAttributesRequestMarshaller instance = new UpdateFleetAttributesRequestMarshaller();

    public static UpdateFleetAttributesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateFleetAttributesRequest updateFleetAttributesRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateFleetAttributesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateFleetAttributesRequest.getFleetId(), FLEETID_BINDING);
            protocolMarshaller.marshall(updateFleetAttributesRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateFleetAttributesRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateFleetAttributesRequest.getNewGameSessionProtectionPolicy(), NEWGAMESESSIONPROTECTIONPOLICY_BINDING);
            protocolMarshaller.marshall(updateFleetAttributesRequest.getResourceCreationLimitPolicy(), RESOURCECREATIONLIMITPOLICY_BINDING);
            protocolMarshaller.marshall(updateFleetAttributesRequest.getMetricGroups(), METRICGROUPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
