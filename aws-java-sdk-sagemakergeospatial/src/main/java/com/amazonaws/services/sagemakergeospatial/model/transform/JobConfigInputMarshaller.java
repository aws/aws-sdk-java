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
 * JobConfigInputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobConfigInputMarshaller {

    private static final MarshallingInfo<StructuredPojo> BANDMATHCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BandMathConfig").build();
    private static final MarshallingInfo<StructuredPojo> CLOUDMASKINGCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudMaskingConfig").build();
    private static final MarshallingInfo<StructuredPojo> CLOUDREMOVALCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudRemovalConfig").build();
    private static final MarshallingInfo<StructuredPojo> GEOMOSAICCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GeoMosaicConfig").build();
    private static final MarshallingInfo<StructuredPojo> LANDCOVERSEGMENTATIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LandCoverSegmentationConfig").build();
    private static final MarshallingInfo<StructuredPojo> RESAMPLINGCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResamplingConfig").build();
    private static final MarshallingInfo<StructuredPojo> STACKCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StackConfig").build();
    private static final MarshallingInfo<StructuredPojo> TEMPORALSTATISTICSCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemporalStatisticsConfig").build();
    private static final MarshallingInfo<StructuredPojo> ZONALSTATISTICSCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ZonalStatisticsConfig").build();

    private static final JobConfigInputMarshaller instance = new JobConfigInputMarshaller();

    public static JobConfigInputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobConfigInput jobConfigInput, ProtocolMarshaller protocolMarshaller) {

        if (jobConfigInput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobConfigInput.getBandMathConfig(), BANDMATHCONFIG_BINDING);
            protocolMarshaller.marshall(jobConfigInput.getCloudMaskingConfig(), CLOUDMASKINGCONFIG_BINDING);
            protocolMarshaller.marshall(jobConfigInput.getCloudRemovalConfig(), CLOUDREMOVALCONFIG_BINDING);
            protocolMarshaller.marshall(jobConfigInput.getGeoMosaicConfig(), GEOMOSAICCONFIG_BINDING);
            protocolMarshaller.marshall(jobConfigInput.getLandCoverSegmentationConfig(), LANDCOVERSEGMENTATIONCONFIG_BINDING);
            protocolMarshaller.marshall(jobConfigInput.getResamplingConfig(), RESAMPLINGCONFIG_BINDING);
            protocolMarshaller.marshall(jobConfigInput.getStackConfig(), STACKCONFIG_BINDING);
            protocolMarshaller.marshall(jobConfigInput.getTemporalStatisticsConfig(), TEMPORALSTATISTICSCONFIG_BINDING);
            protocolMarshaller.marshall(jobConfigInput.getZonalStatisticsConfig(), ZONALSTATISTICSCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
