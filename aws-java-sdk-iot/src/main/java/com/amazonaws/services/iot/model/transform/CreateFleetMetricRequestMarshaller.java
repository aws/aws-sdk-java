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
package com.amazonaws.services.iot.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateFleetMetricRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateFleetMetricRequestMarshaller {

    private static final MarshallingInfo<String> METRICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("metricName").build();
    private static final MarshallingInfo<String> QUERYSTRING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("queryString").build();
    private static final MarshallingInfo<StructuredPojo> AGGREGATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("aggregationType").build();
    private static final MarshallingInfo<Integer> PERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("period").build();
    private static final MarshallingInfo<String> AGGREGATIONFIELD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("aggregationField").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> QUERYVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("queryVersion").build();
    private static final MarshallingInfo<String> INDEXNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("indexName").build();
    private static final MarshallingInfo<String> UNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("unit").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateFleetMetricRequestMarshaller instance = new CreateFleetMetricRequestMarshaller();

    public static CreateFleetMetricRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateFleetMetricRequest createFleetMetricRequest, ProtocolMarshaller protocolMarshaller) {

        if (createFleetMetricRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createFleetMetricRequest.getMetricName(), METRICNAME_BINDING);
            protocolMarshaller.marshall(createFleetMetricRequest.getQueryString(), QUERYSTRING_BINDING);
            protocolMarshaller.marshall(createFleetMetricRequest.getAggregationType(), AGGREGATIONTYPE_BINDING);
            protocolMarshaller.marshall(createFleetMetricRequest.getPeriod(), PERIOD_BINDING);
            protocolMarshaller.marshall(createFleetMetricRequest.getAggregationField(), AGGREGATIONFIELD_BINDING);
            protocolMarshaller.marshall(createFleetMetricRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createFleetMetricRequest.getQueryVersion(), QUERYVERSION_BINDING);
            protocolMarshaller.marshall(createFleetMetricRequest.getIndexName(), INDEXNAME_BINDING);
            protocolMarshaller.marshall(createFleetMetricRequest.getUnit(), UNIT_BINDING);
            protocolMarshaller.marshall(createFleetMetricRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
