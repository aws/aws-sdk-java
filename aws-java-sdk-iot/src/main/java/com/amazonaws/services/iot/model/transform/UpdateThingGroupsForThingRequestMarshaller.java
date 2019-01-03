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
package com.amazonaws.services.iot.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateThingGroupsForThingRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateThingGroupsForThingRequestMarshaller {

    private static final MarshallingInfo<String> THINGNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("thingName").build();
    private static final MarshallingInfo<List> THINGGROUPSTOADD_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("thingGroupsToAdd").build();
    private static final MarshallingInfo<List> THINGGROUPSTOREMOVE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("thingGroupsToRemove").build();
    private static final MarshallingInfo<Boolean> OVERRIDEDYNAMICGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("overrideDynamicGroups").build();

    private static final UpdateThingGroupsForThingRequestMarshaller instance = new UpdateThingGroupsForThingRequestMarshaller();

    public static UpdateThingGroupsForThingRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateThingGroupsForThingRequest updateThingGroupsForThingRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateThingGroupsForThingRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateThingGroupsForThingRequest.getThingName(), THINGNAME_BINDING);
            protocolMarshaller.marshall(updateThingGroupsForThingRequest.getThingGroupsToAdd(), THINGGROUPSTOADD_BINDING);
            protocolMarshaller.marshall(updateThingGroupsForThingRequest.getThingGroupsToRemove(), THINGGROUPSTOREMOVE_BINDING);
            protocolMarshaller.marshall(updateThingGroupsForThingRequest.getOverrideDynamicGroups(), OVERRIDEDYNAMICGROUPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
