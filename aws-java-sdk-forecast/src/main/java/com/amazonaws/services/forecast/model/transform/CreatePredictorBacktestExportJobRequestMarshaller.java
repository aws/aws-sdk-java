/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CreatePredictorBacktestExportJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreatePredictorBacktestExportJobRequestMarshaller {

    private static final MarshallingInfo<String> PREDICTORBACKTESTEXPORTJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PredictorBacktestExportJobName").build();
    private static final MarshallingInfo<String> PREDICTORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PredictorArn").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Destination").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreatePredictorBacktestExportJobRequestMarshaller instance = new CreatePredictorBacktestExportJobRequestMarshaller();

    public static CreatePredictorBacktestExportJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreatePredictorBacktestExportJobRequest createPredictorBacktestExportJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (createPredictorBacktestExportJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createPredictorBacktestExportJobRequest.getPredictorBacktestExportJobName(), PREDICTORBACKTESTEXPORTJOBNAME_BINDING);
            protocolMarshaller.marshall(createPredictorBacktestExportJobRequest.getPredictorArn(), PREDICTORARN_BINDING);
            protocolMarshaller.marshall(createPredictorBacktestExportJobRequest.getDestination(), DESTINATION_BINDING);
            protocolMarshaller.marshall(createPredictorBacktestExportJobRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
