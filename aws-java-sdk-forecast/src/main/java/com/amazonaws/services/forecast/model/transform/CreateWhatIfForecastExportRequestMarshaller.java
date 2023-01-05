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
 * CreateWhatIfForecastExportRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateWhatIfForecastExportRequestMarshaller {

    private static final MarshallingInfo<String> WHATIFFORECASTEXPORTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WhatIfForecastExportName").build();
    private static final MarshallingInfo<List> WHATIFFORECASTARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WhatIfForecastArns").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Destination").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> FORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Format").build();

    private static final CreateWhatIfForecastExportRequestMarshaller instance = new CreateWhatIfForecastExportRequestMarshaller();

    public static CreateWhatIfForecastExportRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateWhatIfForecastExportRequest createWhatIfForecastExportRequest, ProtocolMarshaller protocolMarshaller) {

        if (createWhatIfForecastExportRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createWhatIfForecastExportRequest.getWhatIfForecastExportName(), WHATIFFORECASTEXPORTNAME_BINDING);
            protocolMarshaller.marshall(createWhatIfForecastExportRequest.getWhatIfForecastArns(), WHATIFFORECASTARNS_BINDING);
            protocolMarshaller.marshall(createWhatIfForecastExportRequest.getDestination(), DESTINATION_BINDING);
            protocolMarshaller.marshall(createWhatIfForecastExportRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createWhatIfForecastExportRequest.getFormat(), FORMAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
