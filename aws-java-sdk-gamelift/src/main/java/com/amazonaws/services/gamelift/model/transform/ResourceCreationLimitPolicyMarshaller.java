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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamelift.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ResourceCreationLimitPolicyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResourceCreationLimitPolicyMarshaller {

    private static final MarshallingInfo<Integer> NEWGAMESESSIONSPERCREATOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NewGameSessionsPerCreator").build();
    private static final MarshallingInfo<Integer> POLICYPERIODINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PolicyPeriodInMinutes").build();

    private static final ResourceCreationLimitPolicyMarshaller instance = new ResourceCreationLimitPolicyMarshaller();

    public static ResourceCreationLimitPolicyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResourceCreationLimitPolicy resourceCreationLimitPolicy, ProtocolMarshaller protocolMarshaller) {

        if (resourceCreationLimitPolicy == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(resourceCreationLimitPolicy.getNewGameSessionsPerCreator(), NEWGAMESESSIONSPERCREATOR_BINDING);
            protocolMarshaller.marshall(resourceCreationLimitPolicy.getPolicyPeriodInMinutes(), POLICYPERIODINMINUTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
