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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemakergeospatial.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ZonalStatisticsConfigInputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ZonalStatisticsConfigInputMarshaller {

    private static final MarshallingInfo<List> STATISTICS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Statistics").build();
    private static final MarshallingInfo<List> TARGETBANDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TargetBands").build();
    private static final MarshallingInfo<String> ZONES3PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ZoneS3Path").build();

    private static final ZonalStatisticsConfigInputMarshaller instance = new ZonalStatisticsConfigInputMarshaller();

    public static ZonalStatisticsConfigInputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ZonalStatisticsConfigInput zonalStatisticsConfigInput, ProtocolMarshaller protocolMarshaller) {

        if (zonalStatisticsConfigInput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(zonalStatisticsConfigInput.getStatistics(), STATISTICS_BINDING);
            protocolMarshaller.marshall(zonalStatisticsConfigInput.getTargetBands(), TARGETBANDS_BINDING);
            protocolMarshaller.marshall(zonalStatisticsConfigInput.getZoneS3Path(), ZONES3PATH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
