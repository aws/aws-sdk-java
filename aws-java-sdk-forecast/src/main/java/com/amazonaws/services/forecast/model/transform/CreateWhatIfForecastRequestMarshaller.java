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
package com.amazonaws.services.forecast.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.forecast.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateWhatIfForecastRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateWhatIfForecastRequestMarshaller {

    private static final MarshallingInfo<String> WHATIFFORECASTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WhatIfForecastName").build();
    private static final MarshallingInfo<String> WHATIFANALYSISARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WhatIfAnalysisArn").build();
    private static final MarshallingInfo<List> TIMESERIESTRANSFORMATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeSeriesTransformations").build();
    private static final MarshallingInfo<StructuredPojo> TIMESERIESREPLACEMENTSDATASOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeSeriesReplacementsDataSource").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateWhatIfForecastRequestMarshaller instance = new CreateWhatIfForecastRequestMarshaller();

    public static CreateWhatIfForecastRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateWhatIfForecastRequest createWhatIfForecastRequest, ProtocolMarshaller protocolMarshaller) {

        if (createWhatIfForecastRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createWhatIfForecastRequest.getWhatIfForecastName(), WHATIFFORECASTNAME_BINDING);
            protocolMarshaller.marshall(createWhatIfForecastRequest.getWhatIfAnalysisArn(), WHATIFANALYSISARN_BINDING);
            protocolMarshaller.marshall(createWhatIfForecastRequest.getTimeSeriesTransformations(), TIMESERIESTRANSFORMATIONS_BINDING);
            protocolMarshaller.marshall(createWhatIfForecastRequest.getTimeSeriesReplacementsDataSource(), TIMESERIESREPLACEMENTSDATASOURCE_BINDING);
            protocolMarshaller.marshall(createWhatIfForecastRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
