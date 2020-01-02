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
package com.amazonaws.services.health.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.health.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OrganizationEventFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OrganizationEventFilterMarshaller {

    private static final MarshallingInfo<List> EVENTTYPECODES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventTypeCodes").build();
    private static final MarshallingInfo<List> AWSACCOUNTIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("awsAccountIds").build();
    private static final MarshallingInfo<List> SERVICES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("services").build();
    private static final MarshallingInfo<List> REGIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("regions").build();
    private static final MarshallingInfo<StructuredPojo> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").build();
    private static final MarshallingInfo<StructuredPojo> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endTime").build();
    private static final MarshallingInfo<StructuredPojo> LASTUPDATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedTime").build();
    private static final MarshallingInfo<List> ENTITYARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("entityArns").build();
    private static final MarshallingInfo<List> ENTITYVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("entityValues").build();
    private static final MarshallingInfo<List> EVENTTYPECATEGORIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventTypeCategories").build();
    private static final MarshallingInfo<List> EVENTSTATUSCODES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventStatusCodes").build();

    private static final OrganizationEventFilterMarshaller instance = new OrganizationEventFilterMarshaller();

    public static OrganizationEventFilterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OrganizationEventFilter organizationEventFilter, ProtocolMarshaller protocolMarshaller) {

        if (organizationEventFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(organizationEventFilter.getEventTypeCodes(), EVENTTYPECODES_BINDING);
            protocolMarshaller.marshall(organizationEventFilter.getAwsAccountIds(), AWSACCOUNTIDS_BINDING);
            protocolMarshaller.marshall(organizationEventFilter.getServices(), SERVICES_BINDING);
            protocolMarshaller.marshall(organizationEventFilter.getRegions(), REGIONS_BINDING);
            protocolMarshaller.marshall(organizationEventFilter.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(organizationEventFilter.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(organizationEventFilter.getLastUpdatedTime(), LASTUPDATEDTIME_BINDING);
            protocolMarshaller.marshall(organizationEventFilter.getEntityArns(), ENTITYARNS_BINDING);
            protocolMarshaller.marshall(organizationEventFilter.getEntityValues(), ENTITYVALUES_BINDING);
            protocolMarshaller.marshall(organizationEventFilter.getEventTypeCategories(), EVENTTYPECATEGORIES_BINDING);
            protocolMarshaller.marshall(organizationEventFilter.getEventStatusCodes(), EVENTSTATUSCODES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
