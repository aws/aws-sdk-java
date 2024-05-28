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
package com.amazonaws.services.mediapackagev2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediapackagev2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FilterConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FilterConfigurationMarshaller {

    private static final MarshallingInfo<String> MANIFESTFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManifestFilter").build();
    private static final MarshallingInfo<java.util.Date> START_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Start").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> END_BINDING = MarshallingInfo.builder(MarshallingType.DATE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("End").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Integer> TIMEDELAYSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeDelaySeconds").build();

    private static final FilterConfigurationMarshaller instance = new FilterConfigurationMarshaller();

    public static FilterConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FilterConfiguration filterConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (filterConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(filterConfiguration.getManifestFilter(), MANIFESTFILTER_BINDING);
            protocolMarshaller.marshall(filterConfiguration.getStart(), START_BINDING);
            protocolMarshaller.marshall(filterConfiguration.getEnd(), END_BINDING);
            protocolMarshaller.marshall(filterConfiguration.getTimeDelaySeconds(), TIMEDELAYSECONDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
