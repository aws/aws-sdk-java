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
package com.amazonaws.services.sagemakergeospatial.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemakergeospatial.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InputConfigInputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InputConfigInputMarshaller {

    private static final MarshallingInfo<StructuredPojo> DATASOURCECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataSourceConfig").build();
    private static final MarshallingInfo<String> PREVIOUSEARTHOBSERVATIONJOBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreviousEarthObservationJobArn").build();
    private static final MarshallingInfo<StructuredPojo> RASTERDATACOLLECTIONQUERY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RasterDataCollectionQuery").build();

    private static final InputConfigInputMarshaller instance = new InputConfigInputMarshaller();

    public static InputConfigInputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InputConfigInput inputConfigInput, ProtocolMarshaller protocolMarshaller) {

        if (inputConfigInput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inputConfigInput.getDataSourceConfig(), DATASOURCECONFIG_BINDING);
            protocolMarshaller.marshall(inputConfigInput.getPreviousEarthObservationJobArn(), PREVIOUSEARTHOBSERVATIONJOBARN_BINDING);
            protocolMarshaller.marshall(inputConfigInput.getRasterDataCollectionQuery(), RASTERDATACOLLECTIONQUERY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
