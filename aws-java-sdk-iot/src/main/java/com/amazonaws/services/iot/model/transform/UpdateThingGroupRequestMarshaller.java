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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateThingGroupRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateThingGroupRequestMarshaller {

    private static final MarshallingInfo<String> THINGGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("thingGroupName").build();
    private static final MarshallingInfo<StructuredPojo> THINGGROUPPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("thingGroupProperties").build();
    private static final MarshallingInfo<Long> EXPECTEDVERSION_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expectedVersion").build();

    private static final UpdateThingGroupRequestMarshaller instance = new UpdateThingGroupRequestMarshaller();

    public static UpdateThingGroupRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateThingGroupRequest updateThingGroupRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateThingGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateThingGroupRequest.getThingGroupName(), THINGGROUPNAME_BINDING);
            protocolMarshaller.marshall(updateThingGroupRequest.getThingGroupProperties(), THINGGROUPPROPERTIES_BINDING);
            protocolMarshaller.marshall(updateThingGroupRequest.getExpectedVersion(), EXPECTEDVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
