/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.groundstation.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.groundstation.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateMissionProfileRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateMissionProfileRequestMarshaller {

    private static final MarshallingInfo<Integer> CONTACTPOSTPASSDURATIONSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("contactPostPassDurationSeconds").build();
    private static final MarshallingInfo<Integer> CONTACTPREPASSDURATIONSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("contactPrePassDurationSeconds").build();
    private static final MarshallingInfo<List> DATAFLOWEDGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("dataflowEdges").build();
    private static final MarshallingInfo<Integer> MINIMUMVIABLECONTACTDURATIONSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minimumViableContactDurationSeconds").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> TRACKINGCONFIGARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("trackingConfigArn").build();

    private static final CreateMissionProfileRequestMarshaller instance = new CreateMissionProfileRequestMarshaller();

    public static CreateMissionProfileRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateMissionProfileRequest createMissionProfileRequest, ProtocolMarshaller protocolMarshaller) {

        if (createMissionProfileRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createMissionProfileRequest.getContactPostPassDurationSeconds(), CONTACTPOSTPASSDURATIONSECONDS_BINDING);
            protocolMarshaller.marshall(createMissionProfileRequest.getContactPrePassDurationSeconds(), CONTACTPREPASSDURATIONSECONDS_BINDING);
            protocolMarshaller.marshall(createMissionProfileRequest.getDataflowEdges(), DATAFLOWEDGES_BINDING);
            protocolMarshaller.marshall(createMissionProfileRequest.getMinimumViableContactDurationSeconds(), MINIMUMVIABLECONTACTDURATIONSECONDS_BINDING);
            protocolMarshaller.marshall(createMissionProfileRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createMissionProfileRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createMissionProfileRequest.getTrackingConfigArn(), TRACKINGCONFIGARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
