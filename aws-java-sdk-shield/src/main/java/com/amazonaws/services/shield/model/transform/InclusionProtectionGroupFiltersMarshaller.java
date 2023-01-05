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
package com.amazonaws.services.shield.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.shield.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InclusionProtectionGroupFiltersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InclusionProtectionGroupFiltersMarshaller {

    private static final MarshallingInfo<List> PROTECTIONGROUPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProtectionGroupIds").build();
    private static final MarshallingInfo<List> PATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Patterns").build();
    private static final MarshallingInfo<List> RESOURCETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ResourceTypes").build();
    private static final MarshallingInfo<List> AGGREGATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Aggregations").build();

    private static final InclusionProtectionGroupFiltersMarshaller instance = new InclusionProtectionGroupFiltersMarshaller();

    public static InclusionProtectionGroupFiltersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InclusionProtectionGroupFilters inclusionProtectionGroupFilters, ProtocolMarshaller protocolMarshaller) {

        if (inclusionProtectionGroupFilters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inclusionProtectionGroupFilters.getProtectionGroupIds(), PROTECTIONGROUPIDS_BINDING);
            protocolMarshaller.marshall(inclusionProtectionGroupFilters.getPatterns(), PATTERNS_BINDING);
            protocolMarshaller.marshall(inclusionProtectionGroupFilters.getResourceTypes(), RESOURCETYPES_BINDING);
            protocolMarshaller.marshall(inclusionProtectionGroupFilters.getAggregations(), AGGREGATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
