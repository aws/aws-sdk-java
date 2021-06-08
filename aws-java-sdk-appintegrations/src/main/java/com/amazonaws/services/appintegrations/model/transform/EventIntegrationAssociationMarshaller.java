/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appintegrations.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appintegrations.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EventIntegrationAssociationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EventIntegrationAssociationMarshaller {

    private static final MarshallingInfo<String> EVENTINTEGRATIONASSOCIATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventIntegrationAssociationArn").build();
    private static final MarshallingInfo<String> EVENTINTEGRATIONASSOCIATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventIntegrationAssociationId").build();
    private static final MarshallingInfo<String> EVENTINTEGRATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventIntegrationName").build();
    private static final MarshallingInfo<String> CLIENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ClientId").build();
    private static final MarshallingInfo<String> EVENTBRIDGERULENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventBridgeRuleName").build();
    private static final MarshallingInfo<Map> CLIENTASSOCIATIONMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientAssociationMetadata").build();

    private static final EventIntegrationAssociationMarshaller instance = new EventIntegrationAssociationMarshaller();

    public static EventIntegrationAssociationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EventIntegrationAssociation eventIntegrationAssociation, ProtocolMarshaller protocolMarshaller) {

        if (eventIntegrationAssociation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eventIntegrationAssociation.getEventIntegrationAssociationArn(), EVENTINTEGRATIONASSOCIATIONARN_BINDING);
            protocolMarshaller.marshall(eventIntegrationAssociation.getEventIntegrationAssociationId(), EVENTINTEGRATIONASSOCIATIONID_BINDING);
            protocolMarshaller.marshall(eventIntegrationAssociation.getEventIntegrationName(), EVENTINTEGRATIONNAME_BINDING);
            protocolMarshaller.marshall(eventIntegrationAssociation.getClientId(), CLIENTID_BINDING);
            protocolMarshaller.marshall(eventIntegrationAssociation.getEventBridgeRuleName(), EVENTBRIDGERULENAME_BINDING);
            protocolMarshaller.marshall(eventIntegrationAssociation.getClientAssociationMetadata(), CLIENTASSOCIATIONMETADATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
