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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CategoryFilterConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CategoryFilterConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> FILTERLISTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilterListConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> CUSTOMFILTERLISTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomFilterListConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> CUSTOMFILTERCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomFilterConfiguration").build();

    private static final CategoryFilterConfigurationMarshaller instance = new CategoryFilterConfigurationMarshaller();

    public static CategoryFilterConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CategoryFilterConfiguration categoryFilterConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (categoryFilterConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(categoryFilterConfiguration.getFilterListConfiguration(), FILTERLISTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(categoryFilterConfiguration.getCustomFilterListConfiguration(), CUSTOMFILTERLISTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(categoryFilterConfiguration.getCustomFilterConfiguration(), CUSTOMFILTERCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
