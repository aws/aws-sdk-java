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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TimeSeriesForecastingJobConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TimeSeriesForecastingJobConfigMarshaller {

    private static final MarshallingInfo<String> FEATURESPECIFICATIONS3URI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FeatureSpecificationS3Uri").build();
    private static final MarshallingInfo<StructuredPojo> COMPLETIONCRITERIA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletionCriteria").build();
    private static final MarshallingInfo<String> FORECASTFREQUENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForecastFrequency").build();
    private static final MarshallingInfo<Integer> FORECASTHORIZON_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForecastHorizon").build();
    private static final MarshallingInfo<List> FORECASTQUANTILES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForecastQuantiles").build();
    private static final MarshallingInfo<StructuredPojo> TRANSFORMATIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Transformations").build();
    private static final MarshallingInfo<StructuredPojo> TIMESERIESCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeSeriesConfig").build();
    private static final MarshallingInfo<List> HOLIDAYCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("HolidayConfig").build();

    private static final TimeSeriesForecastingJobConfigMarshaller instance = new TimeSeriesForecastingJobConfigMarshaller();

    public static TimeSeriesForecastingJobConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TimeSeriesForecastingJobConfig timeSeriesForecastingJobConfig, ProtocolMarshaller protocolMarshaller) {

        if (timeSeriesForecastingJobConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(timeSeriesForecastingJobConfig.getFeatureSpecificationS3Uri(), FEATURESPECIFICATIONS3URI_BINDING);
            protocolMarshaller.marshall(timeSeriesForecastingJobConfig.getCompletionCriteria(), COMPLETIONCRITERIA_BINDING);
            protocolMarshaller.marshall(timeSeriesForecastingJobConfig.getForecastFrequency(), FORECASTFREQUENCY_BINDING);
            protocolMarshaller.marshall(timeSeriesForecastingJobConfig.getForecastHorizon(), FORECASTHORIZON_BINDING);
            protocolMarshaller.marshall(timeSeriesForecastingJobConfig.getForecastQuantiles(), FORECASTQUANTILES_BINDING);
            protocolMarshaller.marshall(timeSeriesForecastingJobConfig.getTransformations(), TRANSFORMATIONS_BINDING);
            protocolMarshaller.marshall(timeSeriesForecastingJobConfig.getTimeSeriesConfig(), TIMESERIESCONFIG_BINDING);
            protocolMarshaller.marshall(timeSeriesForecastingJobConfig.getHolidayConfig(), HOLIDAYCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
