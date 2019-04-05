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
package com.amazonaws.services.health.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.health.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EntityFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EntityFilterMarshaller {

    private static final MarshallingInfo<List> EVENTARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("eventArns").build();
    private static final MarshallingInfo<List> ENTITYARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("entityArns").build();
    private static final MarshallingInfo<List> ENTITYVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("entityValues").build();
    private static final MarshallingInfo<List> LASTUPDATEDTIMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedTimes").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<List> STATUSCODES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("statusCodes").build();

    private static final EntityFilterMarshaller instance = new EntityFilterMarshaller();

    public static EntityFilterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EntityFilter entityFilter, ProtocolMarshaller protocolMarshaller) {

        if (entityFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(entityFilter.getEventArns(), EVENTARNS_BINDING);
            protocolMarshaller.marshall(entityFilter.getEntityArns(), ENTITYARNS_BINDING);
            protocolMarshaller.marshall(entityFilter.getEntityValues(), ENTITYVALUES_BINDING);
            protocolMarshaller.marshall(entityFilter.getLastUpdatedTimes(), LASTUPDATEDTIMES_BINDING);
            protocolMarshaller.marshall(entityFilter.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(entityFilter.getStatusCodes(), STATUSCODES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
