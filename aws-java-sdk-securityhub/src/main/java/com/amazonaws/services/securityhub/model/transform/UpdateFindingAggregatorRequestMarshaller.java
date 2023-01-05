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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateFindingAggregatorRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateFindingAggregatorRequestMarshaller {

    private static final MarshallingInfo<String> FINDINGAGGREGATORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FindingAggregatorArn").build();
    private static final MarshallingInfo<String> REGIONLINKINGMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegionLinkingMode").build();
    private static final MarshallingInfo<List> REGIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Regions").build();

    private static final UpdateFindingAggregatorRequestMarshaller instance = new UpdateFindingAggregatorRequestMarshaller();

    public static UpdateFindingAggregatorRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateFindingAggregatorRequest updateFindingAggregatorRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateFindingAggregatorRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateFindingAggregatorRequest.getFindingAggregatorArn(), FINDINGAGGREGATORARN_BINDING);
            protocolMarshaller.marshall(updateFindingAggregatorRequest.getRegionLinkingMode(), REGIONLINKINGMODE_BINDING);
            protocolMarshaller.marshall(updateFindingAggregatorRequest.getRegions(), REGIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
