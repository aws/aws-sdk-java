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
package com.amazonaws.services.quicksight.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TopicFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TopicFilterMarshaller {

    private static final MarshallingInfo<String> FILTERDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilterDescription").build();
    private static final MarshallingInfo<String> FILTERCLASS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilterClass").build();
    private static final MarshallingInfo<String> FILTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilterName").build();
    private static final MarshallingInfo<List> FILTERSYNONYMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilterSynonyms").build();
    private static final MarshallingInfo<String> OPERANDFIELDNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OperandFieldName").build();
    private static final MarshallingInfo<String> FILTERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilterType").build();
    private static final MarshallingInfo<StructuredPojo> CATEGORYFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CategoryFilter").build();
    private static final MarshallingInfo<StructuredPojo> NUMERICEQUALITYFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumericEqualityFilter").build();
    private static final MarshallingInfo<StructuredPojo> NUMERICRANGEFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumericRangeFilter").build();
    private static final MarshallingInfo<StructuredPojo> DATERANGEFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DateRangeFilter").build();
    private static final MarshallingInfo<StructuredPojo> RELATIVEDATEFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RelativeDateFilter").build();

    private static final TopicFilterMarshaller instance = new TopicFilterMarshaller();

    public static TopicFilterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TopicFilter topicFilter, ProtocolMarshaller protocolMarshaller) {

        if (topicFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(topicFilter.getFilterDescription(), FILTERDESCRIPTION_BINDING);
            protocolMarshaller.marshall(topicFilter.getFilterClass(), FILTERCLASS_BINDING);
            protocolMarshaller.marshall(topicFilter.getFilterName(), FILTERNAME_BINDING);
            protocolMarshaller.marshall(topicFilter.getFilterSynonyms(), FILTERSYNONYMS_BINDING);
            protocolMarshaller.marshall(topicFilter.getOperandFieldName(), OPERANDFIELDNAME_BINDING);
            protocolMarshaller.marshall(topicFilter.getFilterType(), FILTERTYPE_BINDING);
            protocolMarshaller.marshall(topicFilter.getCategoryFilter(), CATEGORYFILTER_BINDING);
            protocolMarshaller.marshall(topicFilter.getNumericEqualityFilter(), NUMERICEQUALITYFILTER_BINDING);
            protocolMarshaller.marshall(topicFilter.getNumericRangeFilter(), NUMERICRANGEFILTER_BINDING);
            protocolMarshaller.marshall(topicFilter.getDateRangeFilter(), DATERANGEFILTER_BINDING);
            protocolMarshaller.marshall(topicFilter.getRelativeDateFilter(), RELATIVEDATEFILTER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
