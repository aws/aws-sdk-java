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
package com.amazonaws.services.route53recoverycluster.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.route53recoverycluster.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateRoutingControlStateRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateRoutingControlStateRequestMarshaller {

    private static final MarshallingInfo<String> ROUTINGCONTROLARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RoutingControlArn").build();
    private static final MarshallingInfo<String> ROUTINGCONTROLSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RoutingControlState").build();
    private static final MarshallingInfo<List> SAFETYRULESTOOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SafetyRulesToOverride").build();

    private static final UpdateRoutingControlStateRequestMarshaller instance = new UpdateRoutingControlStateRequestMarshaller();

    public static UpdateRoutingControlStateRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateRoutingControlStateRequest updateRoutingControlStateRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateRoutingControlStateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateRoutingControlStateRequest.getRoutingControlArn(), ROUTINGCONTROLARN_BINDING);
            protocolMarshaller.marshall(updateRoutingControlStateRequest.getRoutingControlState(), ROUTINGCONTROLSTATE_BINDING);
            protocolMarshaller.marshall(updateRoutingControlStateRequest.getSafetyRulesToOverride(), SAFETYRULESTOOVERRIDE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
