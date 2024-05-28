/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartUpdateSignalMapRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartUpdateSignalMapRequestMarshaller {

    private static final MarshallingInfo<List> CLOUDWATCHALARMTEMPLATEGROUPIDENTIFIERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cloudWatchAlarmTemplateGroupIdentifiers").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> DISCOVERYENTRYPOINTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("discoveryEntryPointArn").build();
    private static final MarshallingInfo<List> EVENTBRIDGERULETEMPLATEGROUPIDENTIFIERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventBridgeRuleTemplateGroupIdentifiers").build();
    private static final MarshallingInfo<Boolean> FORCEREDISCOVERY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("forceRediscovery").build();
    private static final MarshallingInfo<String> IDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("identifier").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();

    private static final StartUpdateSignalMapRequestMarshaller instance = new StartUpdateSignalMapRequestMarshaller();

    public static StartUpdateSignalMapRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartUpdateSignalMapRequest startUpdateSignalMapRequest, ProtocolMarshaller protocolMarshaller) {

        if (startUpdateSignalMapRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startUpdateSignalMapRequest.getCloudWatchAlarmTemplateGroupIdentifiers(),
                    CLOUDWATCHALARMTEMPLATEGROUPIDENTIFIERS_BINDING);
            protocolMarshaller.marshall(startUpdateSignalMapRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(startUpdateSignalMapRequest.getDiscoveryEntryPointArn(), DISCOVERYENTRYPOINTARN_BINDING);
            protocolMarshaller.marshall(startUpdateSignalMapRequest.getEventBridgeRuleTemplateGroupIdentifiers(),
                    EVENTBRIDGERULETEMPLATEGROUPIDENTIFIERS_BINDING);
            protocolMarshaller.marshall(startUpdateSignalMapRequest.getForceRediscovery(), FORCEREDISCOVERY_BINDING);
            protocolMarshaller.marshall(startUpdateSignalMapRequest.getIdentifier(), IDENTIFIER_BINDING);
            protocolMarshaller.marshall(startUpdateSignalMapRequest.getName(), NAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
