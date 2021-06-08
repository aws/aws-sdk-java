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
package com.amazonaws.services.nimblestudio.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.nimblestudio.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StudioComponentSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StudioComponentSummaryMarshaller {

    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("createdBy").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> STUDIOCOMPONENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("studioComponentId").build();
    private static final MarshallingInfo<String> SUBTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subtype").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> UPDATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("updatedBy").build();

    private static final StudioComponentSummaryMarshaller instance = new StudioComponentSummaryMarshaller();

    public static StudioComponentSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StudioComponentSummary studioComponentSummary, ProtocolMarshaller protocolMarshaller) {

        if (studioComponentSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(studioComponentSummary.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(studioComponentSummary.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(studioComponentSummary.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(studioComponentSummary.getName(), NAME_BINDING);
            protocolMarshaller.marshall(studioComponentSummary.getStudioComponentId(), STUDIOCOMPONENTID_BINDING);
            protocolMarshaller.marshall(studioComponentSummary.getSubtype(), SUBTYPE_BINDING);
            protocolMarshaller.marshall(studioComponentSummary.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(studioComponentSummary.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(studioComponentSummary.getUpdatedBy(), UPDATEDBY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
