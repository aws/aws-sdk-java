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
package com.amazonaws.services.connect.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UserDataFiltersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UserDataFiltersMarshaller {

    private static final MarshallingInfo<List> QUEUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Queues").build();
    private static final MarshallingInfo<StructuredPojo> CONTACTFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContactFilter").build();
    private static final MarshallingInfo<List> ROUTINGPROFILES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RoutingProfiles").build();
    private static final MarshallingInfo<List> AGENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Agents").build();
    private static final MarshallingInfo<List> USERHIERARCHYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserHierarchyGroups").build();

    private static final UserDataFiltersMarshaller instance = new UserDataFiltersMarshaller();

    public static UserDataFiltersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UserDataFilters userDataFilters, ProtocolMarshaller protocolMarshaller) {

        if (userDataFilters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(userDataFilters.getQueues(), QUEUES_BINDING);
            protocolMarshaller.marshall(userDataFilters.getContactFilter(), CONTACTFILTER_BINDING);
            protocolMarshaller.marshall(userDataFilters.getRoutingProfiles(), ROUTINGPROFILES_BINDING);
            protocolMarshaller.marshall(userDataFilters.getAgents(), AGENTS_BINDING);
            protocolMarshaller.marshall(userDataFilters.getUserHierarchyGroups(), USERHIERARCHYGROUPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
