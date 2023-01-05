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
package com.amazonaws.services.pinpoint.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InAppMessageCampaignMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InAppMessageCampaignMarshaller {

    private static final MarshallingInfo<String> CAMPAIGNID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CampaignId").build();
    private static final MarshallingInfo<Integer> DAILYCAP_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DailyCap").build();
    private static final MarshallingInfo<StructuredPojo> INAPPMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InAppMessage").build();
    private static final MarshallingInfo<Integer> PRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Priority").build();
    private static final MarshallingInfo<StructuredPojo> SCHEDULE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Schedule").build();
    private static final MarshallingInfo<Integer> SESSIONCAP_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SessionCap").build();
    private static final MarshallingInfo<Integer> TOTALCAP_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalCap").build();
    private static final MarshallingInfo<String> TREATMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TreatmentId").build();

    private static final InAppMessageCampaignMarshaller instance = new InAppMessageCampaignMarshaller();

    public static InAppMessageCampaignMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InAppMessageCampaign inAppMessageCampaign, ProtocolMarshaller protocolMarshaller) {

        if (inAppMessageCampaign == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inAppMessageCampaign.getCampaignId(), CAMPAIGNID_BINDING);
            protocolMarshaller.marshall(inAppMessageCampaign.getDailyCap(), DAILYCAP_BINDING);
            protocolMarshaller.marshall(inAppMessageCampaign.getInAppMessage(), INAPPMESSAGE_BINDING);
            protocolMarshaller.marshall(inAppMessageCampaign.getPriority(), PRIORITY_BINDING);
            protocolMarshaller.marshall(inAppMessageCampaign.getSchedule(), SCHEDULE_BINDING);
            protocolMarshaller.marshall(inAppMessageCampaign.getSessionCap(), SESSIONCAP_BINDING);
            protocolMarshaller.marshall(inAppMessageCampaign.getTotalCap(), TOTALCAP_BINDING);
            protocolMarshaller.marshall(inAppMessageCampaign.getTreatmentId(), TREATMENTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
