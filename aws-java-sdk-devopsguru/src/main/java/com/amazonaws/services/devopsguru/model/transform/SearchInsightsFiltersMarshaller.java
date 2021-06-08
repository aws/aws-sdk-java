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
package com.amazonaws.services.devopsguru.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devopsguru.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SearchInsightsFiltersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SearchInsightsFiltersMarshaller {

    private static final MarshallingInfo<List> SEVERITIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Severities").build();
    private static final MarshallingInfo<List> STATUSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Statuses").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCECOLLECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceCollection").build();
    private static final MarshallingInfo<StructuredPojo> SERVICECOLLECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceCollection").build();

    private static final SearchInsightsFiltersMarshaller instance = new SearchInsightsFiltersMarshaller();

    public static SearchInsightsFiltersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SearchInsightsFilters searchInsightsFilters, ProtocolMarshaller protocolMarshaller) {

        if (searchInsightsFilters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(searchInsightsFilters.getSeverities(), SEVERITIES_BINDING);
            protocolMarshaller.marshall(searchInsightsFilters.getStatuses(), STATUSES_BINDING);
            protocolMarshaller.marshall(searchInsightsFilters.getResourceCollection(), RESOURCECOLLECTION_BINDING);
            protocolMarshaller.marshall(searchInsightsFilters.getServiceCollection(), SERVICECOLLECTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
