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
package com.amazonaws.services.proton.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.proton.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ResourceSyncAttemptMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResourceSyncAttemptMarshaller {

    private static final MarshallingInfo<List> EVENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("events").build();
    private static final MarshallingInfo<StructuredPojo> INITIALREVISION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("initialRevision").build();
    private static final MarshallingInfo<java.util.Date> STARTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> TARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("target").build();
    private static final MarshallingInfo<StructuredPojo> TARGETREVISION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetRevision").build();

    private static final ResourceSyncAttemptMarshaller instance = new ResourceSyncAttemptMarshaller();

    public static ResourceSyncAttemptMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResourceSyncAttempt resourceSyncAttempt, ProtocolMarshaller protocolMarshaller) {

        if (resourceSyncAttempt == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(resourceSyncAttempt.getEvents(), EVENTS_BINDING);
            protocolMarshaller.marshall(resourceSyncAttempt.getInitialRevision(), INITIALREVISION_BINDING);
            protocolMarshaller.marshall(resourceSyncAttempt.getStartedAt(), STARTEDAT_BINDING);
            protocolMarshaller.marshall(resourceSyncAttempt.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(resourceSyncAttempt.getTarget(), TARGET_BINDING);
            protocolMarshaller.marshall(resourceSyncAttempt.getTargetRevision(), TARGETREVISION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
