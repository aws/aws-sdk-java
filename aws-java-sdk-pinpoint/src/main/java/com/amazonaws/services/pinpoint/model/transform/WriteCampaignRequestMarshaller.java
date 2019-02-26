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
package com.amazonaws.services.pinpoint.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WriteCampaignRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WriteCampaignRequestMarshaller {

    private static final MarshallingInfo<List> ADDITIONALTREATMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalTreatments").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<Integer> HOLDOUTPERCENT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HoldoutPercent").build();
    private static final MarshallingInfo<StructuredPojo> HOOK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Hook").build();
    private static final MarshallingInfo<Boolean> ISPAUSED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsPaused").build();
    private static final MarshallingInfo<StructuredPojo> LIMITS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Limits").build();
    private static final MarshallingInfo<StructuredPojo> MESSAGECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MessageConfiguration").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<StructuredPojo> SCHEDULE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Schedule").build();
    private static final MarshallingInfo<String> SEGMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SegmentId").build();
    private static final MarshallingInfo<Integer> SEGMENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SegmentVersion").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> TREATMENTDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TreatmentDescription").build();
    private static final MarshallingInfo<String> TREATMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TreatmentName").build();

    private static final WriteCampaignRequestMarshaller instance = new WriteCampaignRequestMarshaller();

    public static WriteCampaignRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WriteCampaignRequest writeCampaignRequest, ProtocolMarshaller protocolMarshaller) {

        if (writeCampaignRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(writeCampaignRequest.getAdditionalTreatments(), ADDITIONALTREATMENTS_BINDING);
            protocolMarshaller.marshall(writeCampaignRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(writeCampaignRequest.getHoldoutPercent(), HOLDOUTPERCENT_BINDING);
            protocolMarshaller.marshall(writeCampaignRequest.getHook(), HOOK_BINDING);
            protocolMarshaller.marshall(writeCampaignRequest.getIsPaused(), ISPAUSED_BINDING);
            protocolMarshaller.marshall(writeCampaignRequest.getLimits(), LIMITS_BINDING);
            protocolMarshaller.marshall(writeCampaignRequest.getMessageConfiguration(), MESSAGECONFIGURATION_BINDING);
            protocolMarshaller.marshall(writeCampaignRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(writeCampaignRequest.getSchedule(), SCHEDULE_BINDING);
            protocolMarshaller.marshall(writeCampaignRequest.getSegmentId(), SEGMENTID_BINDING);
            protocolMarshaller.marshall(writeCampaignRequest.getSegmentVersion(), SEGMENTVERSION_BINDING);
            protocolMarshaller.marshall(writeCampaignRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(writeCampaignRequest.getTreatmentDescription(), TREATMENTDESCRIPTION_BINDING);
            protocolMarshaller.marshall(writeCampaignRequest.getTreatmentName(), TREATMENTNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
