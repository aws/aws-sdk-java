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
package com.amazonaws.services.mediapackagev2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediapackagev2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateDashManifestConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateDashManifestConfigurationMarshaller {

    private static final MarshallingInfo<String> MANIFESTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManifestName").build();
    private static final MarshallingInfo<Integer> MANIFESTWINDOWSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManifestWindowSeconds").build();
    private static final MarshallingInfo<StructuredPojo> FILTERCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilterConfiguration").build();
    private static final MarshallingInfo<Integer> MINUPDATEPERIODSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinUpdatePeriodSeconds").build();
    private static final MarshallingInfo<Integer> MINBUFFERTIMESECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinBufferTimeSeconds").build();
    private static final MarshallingInfo<Integer> SUGGESTEDPRESENTATIONDELAYSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SuggestedPresentationDelaySeconds").build();
    private static final MarshallingInfo<String> SEGMENTTEMPLATEFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SegmentTemplateFormat").build();
    private static final MarshallingInfo<List> PERIODTRIGGERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PeriodTriggers").build();
    private static final MarshallingInfo<StructuredPojo> SCTEDASH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScteDash").build();
    private static final MarshallingInfo<String> DRMSIGNALING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DrmSignaling").build();
    private static final MarshallingInfo<StructuredPojo> UTCTIMING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UtcTiming").build();

    private static final CreateDashManifestConfigurationMarshaller instance = new CreateDashManifestConfigurationMarshaller();

    public static CreateDashManifestConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateDashManifestConfiguration createDashManifestConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (createDashManifestConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createDashManifestConfiguration.getManifestName(), MANIFESTNAME_BINDING);
            protocolMarshaller.marshall(createDashManifestConfiguration.getManifestWindowSeconds(), MANIFESTWINDOWSECONDS_BINDING);
            protocolMarshaller.marshall(createDashManifestConfiguration.getFilterConfiguration(), FILTERCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createDashManifestConfiguration.getMinUpdatePeriodSeconds(), MINUPDATEPERIODSECONDS_BINDING);
            protocolMarshaller.marshall(createDashManifestConfiguration.getMinBufferTimeSeconds(), MINBUFFERTIMESECONDS_BINDING);
            protocolMarshaller.marshall(createDashManifestConfiguration.getSuggestedPresentationDelaySeconds(), SUGGESTEDPRESENTATIONDELAYSECONDS_BINDING);
            protocolMarshaller.marshall(createDashManifestConfiguration.getSegmentTemplateFormat(), SEGMENTTEMPLATEFORMAT_BINDING);
            protocolMarshaller.marshall(createDashManifestConfiguration.getPeriodTriggers(), PERIODTRIGGERS_BINDING);
            protocolMarshaller.marshall(createDashManifestConfiguration.getScteDash(), SCTEDASH_BINDING);
            protocolMarshaller.marshall(createDashManifestConfiguration.getDrmSignaling(), DRMSIGNALING_BINDING);
            protocolMarshaller.marshall(createDashManifestConfiguration.getUtcTiming(), UTCTIMING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
