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
 * RasterDataCollectionQueryInputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RasterDataCollectionQueryInputMarshaller {

    private static final MarshallingInfo<StructuredPojo> AREAOFINTEREST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AreaOfInterest").build();
    private static final MarshallingInfo<StructuredPojo> PROPERTYFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PropertyFilters").build();
    private static final MarshallingInfo<String> RASTERDATACOLLECTIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RasterDataCollectionArn").build();
    private static final MarshallingInfo<StructuredPojo> TIMERANGEFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeRangeFilter").build();

    private static final RasterDataCollectionQueryInputMarshaller instance = new RasterDataCollectionQueryInputMarshaller();

    public static RasterDataCollectionQueryInputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RasterDataCollectionQueryInput rasterDataCollectionQueryInput, ProtocolMarshaller protocolMarshaller) {

        if (rasterDataCollectionQueryInput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(rasterDataCollectionQueryInput.getAreaOfInterest(), AREAOFINTEREST_BINDING);
            protocolMarshaller.marshall(rasterDataCollectionQueryInput.getPropertyFilters(), PROPERTYFILTERS_BINDING);
            protocolMarshaller.marshall(rasterDataCollectionQueryInput.getRasterDataCollectionArn(), RASTERDATACOLLECTIONARN_BINDING);
            protocolMarshaller.marshall(rasterDataCollectionQueryInput.getTimeRangeFilter(), TIMERANGEFILTER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
