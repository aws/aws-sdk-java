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
 * UpdateRoutingControlStatesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateRoutingControlStatesRequestMarshaller {

    private static final MarshallingInfo<List> UPDATEROUTINGCONTROLSTATEENTRIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateRoutingControlStateEntries").build();
    private static final MarshallingInfo<List> SAFETYRULESTOOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SafetyRulesToOverride").build();

    private static final UpdateRoutingControlStatesRequestMarshaller instance = new UpdateRoutingControlStatesRequestMarshaller();

    public static UpdateRoutingControlStatesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateRoutingControlStatesRequest updateRoutingControlStatesRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateRoutingControlStatesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateRoutingControlStatesRequest.getUpdateRoutingControlStateEntries(), UPDATEROUTINGCONTROLSTATEENTRIES_BINDING);
            protocolMarshaller.marshall(updateRoutingControlStatesRequest.getSafetyRulesToOverride(), SAFETYRULESTOOVERRIDE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
