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
package com.amazonaws.services.detective.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.detective.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * IndicatorDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IndicatorDetailMarshaller {

    private static final MarshallingInfo<StructuredPojo> TTPSOBSERVEDDETAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TTPsObservedDetail").build();
    private static final MarshallingInfo<StructuredPojo> IMPOSSIBLETRAVELDETAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImpossibleTravelDetail").build();
    private static final MarshallingInfo<StructuredPojo> FLAGGEDIPADDRESSDETAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FlaggedIpAddressDetail").build();
    private static final MarshallingInfo<StructuredPojo> NEWGEOLOCATIONDETAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NewGeolocationDetail").build();
    private static final MarshallingInfo<StructuredPojo> NEWASODETAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NewAsoDetail").build();
    private static final MarshallingInfo<StructuredPojo> NEWUSERAGENTDETAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NewUserAgentDetail").build();
    private static final MarshallingInfo<StructuredPojo> RELATEDFINDINGDETAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RelatedFindingDetail").build();
    private static final MarshallingInfo<StructuredPojo> RELATEDFINDINGGROUPDETAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RelatedFindingGroupDetail").build();

    private static final IndicatorDetailMarshaller instance = new IndicatorDetailMarshaller();

    public static IndicatorDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IndicatorDetail indicatorDetail, ProtocolMarshaller protocolMarshaller) {

        if (indicatorDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(indicatorDetail.getTTPsObservedDetail(), TTPSOBSERVEDDETAIL_BINDING);
            protocolMarshaller.marshall(indicatorDetail.getImpossibleTravelDetail(), IMPOSSIBLETRAVELDETAIL_BINDING);
            protocolMarshaller.marshall(indicatorDetail.getFlaggedIpAddressDetail(), FLAGGEDIPADDRESSDETAIL_BINDING);
            protocolMarshaller.marshall(indicatorDetail.getNewGeolocationDetail(), NEWGEOLOCATIONDETAIL_BINDING);
            protocolMarshaller.marshall(indicatorDetail.getNewAsoDetail(), NEWASODETAIL_BINDING);
            protocolMarshaller.marshall(indicatorDetail.getNewUserAgentDetail(), NEWUSERAGENTDETAIL_BINDING);
            protocolMarshaller.marshall(indicatorDetail.getRelatedFindingDetail(), RELATEDFINDINGDETAIL_BINDING);
            protocolMarshaller.marshall(indicatorDetail.getRelatedFindingGroupDetail(), RELATEDFINDINGGROUPDETAIL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
