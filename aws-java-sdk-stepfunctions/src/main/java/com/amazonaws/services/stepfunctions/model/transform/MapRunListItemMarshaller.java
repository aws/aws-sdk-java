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
package com.amazonaws.services.stepfunctions.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.stepfunctions.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MapRunListItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MapRunListItemMarshaller {

    private static final MarshallingInfo<String> EXECUTIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionArn").build();
    private static final MarshallingInfo<String> MAPRUNARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("mapRunArn").build();
    private static final MarshallingInfo<String> STATEMACHINEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stateMachineArn").build();
    private static final MarshallingInfo<java.util.Date> STARTDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> STOPDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stopDate").timestampFormat("unixTimestamp").build();

    private static final MapRunListItemMarshaller instance = new MapRunListItemMarshaller();

    public static MapRunListItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MapRunListItem mapRunListItem, ProtocolMarshaller protocolMarshaller) {

        if (mapRunListItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mapRunListItem.getExecutionArn(), EXECUTIONARN_BINDING);
            protocolMarshaller.marshall(mapRunListItem.getMapRunArn(), MAPRUNARN_BINDING);
            protocolMarshaller.marshall(mapRunListItem.getStateMachineArn(), STATEMACHINEARN_BINDING);
            protocolMarshaller.marshall(mapRunListItem.getStartDate(), STARTDATE_BINDING);
            protocolMarshaller.marshall(mapRunListItem.getStopDate(), STOPDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
