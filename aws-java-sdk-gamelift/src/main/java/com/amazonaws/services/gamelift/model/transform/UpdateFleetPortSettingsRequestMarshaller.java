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
 * UpdateFleetPortSettingsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateFleetPortSettingsRequestMarshaller {

    private static final MarshallingInfo<String> FLEETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FleetId").build();
    private static final MarshallingInfo<List> INBOUNDPERMISSIONAUTHORIZATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InboundPermissionAuthorizations").build();
    private static final MarshallingInfo<List> INBOUNDPERMISSIONREVOCATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InboundPermissionRevocations").build();

    private static final UpdateFleetPortSettingsRequestMarshaller instance = new UpdateFleetPortSettingsRequestMarshaller();

    public static UpdateFleetPortSettingsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateFleetPortSettingsRequest updateFleetPortSettingsRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateFleetPortSettingsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateFleetPortSettingsRequest.getFleetId(), FLEETID_BINDING);
            protocolMarshaller.marshall(updateFleetPortSettingsRequest.getInboundPermissionAuthorizations(), INBOUNDPERMISSIONAUTHORIZATIONS_BINDING);
            protocolMarshaller.marshall(updateFleetPortSettingsRequest.getInboundPermissionRevocations(), INBOUNDPERMISSIONREVOCATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
