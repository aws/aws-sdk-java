/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.forecast.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateForecastExportJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateForecastExportJobRequestMarshaller {

    private static final MarshallingInfo<String> FORECASTEXPORTJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForecastExportJobName").build();
    private static final MarshallingInfo<String> FORECASTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForecastArn").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Destination").build();

    private static final CreateForecastExportJobRequestMarshaller instance = new CreateForecastExportJobRequestMarshaller();

    public static CreateForecastExportJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateForecastExportJobRequest createForecastExportJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (createForecastExportJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createForecastExportJobRequest.getForecastExportJobName(), FORECASTEXPORTJOBNAME_BINDING);
            protocolMarshaller.marshall(createForecastExportJobRequest.getForecastArn(), FORECASTARN_BINDING);
            protocolMarshaller.marshall(createForecastExportJobRequest.getDestination(), DESTINATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
