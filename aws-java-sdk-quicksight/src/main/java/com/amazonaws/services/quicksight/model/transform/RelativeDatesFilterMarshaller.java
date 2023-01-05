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
 * RelativeDatesFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RelativeDatesFilterMarshaller {

    private static final MarshallingInfo<String> FILTERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FilterId").build();
    private static final MarshallingInfo<StructuredPojo> COLUMN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Column").build();
    private static final MarshallingInfo<StructuredPojo> ANCHORDATECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnchorDateConfiguration").build();
    private static final MarshallingInfo<String> MINIMUMGRANULARITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinimumGranularity").build();
    private static final MarshallingInfo<String> TIMEGRANULARITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeGranularity").build();
    private static final MarshallingInfo<String> RELATIVEDATETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RelativeDateType").build();
    private static final MarshallingInfo<Integer> RELATIVEDATEVALUE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RelativeDateValue").build();
    private static final MarshallingInfo<String> PARAMETERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParameterName").build();
    private static final MarshallingInfo<String> NULLOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NullOption").build();
    private static final MarshallingInfo<StructuredPojo> EXCLUDEPERIODCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExcludePeriodConfiguration").build();

    private static final RelativeDatesFilterMarshaller instance = new RelativeDatesFilterMarshaller();

    public static RelativeDatesFilterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RelativeDatesFilter relativeDatesFilter, ProtocolMarshaller protocolMarshaller) {

        if (relativeDatesFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(relativeDatesFilter.getFilterId(), FILTERID_BINDING);
            protocolMarshaller.marshall(relativeDatesFilter.getColumn(), COLUMN_BINDING);
            protocolMarshaller.marshall(relativeDatesFilter.getAnchorDateConfiguration(), ANCHORDATECONFIGURATION_BINDING);
            protocolMarshaller.marshall(relativeDatesFilter.getMinimumGranularity(), MINIMUMGRANULARITY_BINDING);
            protocolMarshaller.marshall(relativeDatesFilter.getTimeGranularity(), TIMEGRANULARITY_BINDING);
            protocolMarshaller.marshall(relativeDatesFilter.getRelativeDateType(), RELATIVEDATETYPE_BINDING);
            protocolMarshaller.marshall(relativeDatesFilter.getRelativeDateValue(), RELATIVEDATEVALUE_BINDING);
            protocolMarshaller.marshall(relativeDatesFilter.getParameterName(), PARAMETERNAME_BINDING);
            protocolMarshaller.marshall(relativeDatesFilter.getNullOption(), NULLOPTION_BINDING);
            protocolMarshaller.marshall(relativeDatesFilter.getExcludePeriodConfiguration(), EXCLUDEPERIODCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
