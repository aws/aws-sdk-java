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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UserDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UserDataMarshaller {

    private static final MarshallingInfo<StructuredPojo> USER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("User").build();
    private static final MarshallingInfo<StructuredPojo> ROUTINGPROFILE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RoutingProfile").build();
    private static final MarshallingInfo<StructuredPojo> HIERARCHYPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HierarchyPath").build();
    private static final MarshallingInfo<StructuredPojo> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Status").build();
    private static final MarshallingInfo<Map> AVAILABLESLOTSBYCHANNEL_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailableSlotsByChannel").build();
    private static final MarshallingInfo<Map> MAXSLOTSBYCHANNEL_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxSlotsByChannel").build();
    private static final MarshallingInfo<Map> ACTIVESLOTSBYCHANNEL_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActiveSlotsByChannel").build();
    private static final MarshallingInfo<List> CONTACTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Contacts").build();
    private static final MarshallingInfo<String> NEXTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NextStatus").build();

    private static final UserDataMarshaller instance = new UserDataMarshaller();

    public static UserDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UserData userData, ProtocolMarshaller protocolMarshaller) {

        if (userData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(userData.getUser(), USER_BINDING);
            protocolMarshaller.marshall(userData.getRoutingProfile(), ROUTINGPROFILE_BINDING);
            protocolMarshaller.marshall(userData.getHierarchyPath(), HIERARCHYPATH_BINDING);
            protocolMarshaller.marshall(userData.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(userData.getAvailableSlotsByChannel(), AVAILABLESLOTSBYCHANNEL_BINDING);
            protocolMarshaller.marshall(userData.getMaxSlotsByChannel(), MAXSLOTSBYCHANNEL_BINDING);
            protocolMarshaller.marshall(userData.getActiveSlotsByChannel(), ACTIVESLOTSBYCHANNEL_BINDING);
            protocolMarshaller.marshall(userData.getContacts(), CONTACTS_BINDING);
            protocolMarshaller.marshall(userData.getNextStatus(), NEXTSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
