/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemailv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleemailv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DomainDeliverabilityCampaignMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DomainDeliverabilityCampaignMarshaller {

    private static final MarshallingInfo<String> CAMPAIGNID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CampaignId").build();
    private static final MarshallingInfo<String> IMAGEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ImageUrl").build();
    private static final MarshallingInfo<String> SUBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Subject").build();
    private static final MarshallingInfo<String> FROMADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FromAddress").build();
    private static final MarshallingInfo<List> SENDINGIPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SendingIps").build();
    private static final MarshallingInfo<java.util.Date> FIRSTSEENDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirstSeenDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTSEENDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastSeenDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Long> INBOXCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InboxCount").build();
    private static final MarshallingInfo<Long> SPAMCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SpamCount").build();
    private static final MarshallingInfo<Double> READRATE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ReadRate").build();
    private static final MarshallingInfo<Double> DELETERATE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeleteRate").build();
    private static final MarshallingInfo<Double> READDELETERATE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReadDeleteRate").build();
    private static final MarshallingInfo<Long> PROJECTEDVOLUME_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProjectedVolume").build();
    private static final MarshallingInfo<List> ESPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Esps").build();

    private static final DomainDeliverabilityCampaignMarshaller instance = new DomainDeliverabilityCampaignMarshaller();

    public static DomainDeliverabilityCampaignMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DomainDeliverabilityCampaign domainDeliverabilityCampaign, ProtocolMarshaller protocolMarshaller) {

        if (domainDeliverabilityCampaign == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(domainDeliverabilityCampaign.getCampaignId(), CAMPAIGNID_BINDING);
            protocolMarshaller.marshall(domainDeliverabilityCampaign.getImageUrl(), IMAGEURL_BINDING);
            protocolMarshaller.marshall(domainDeliverabilityCampaign.getSubject(), SUBJECT_BINDING);
            protocolMarshaller.marshall(domainDeliverabilityCampaign.getFromAddress(), FROMADDRESS_BINDING);
            protocolMarshaller.marshall(domainDeliverabilityCampaign.getSendingIps(), SENDINGIPS_BINDING);
            protocolMarshaller.marshall(domainDeliverabilityCampaign.getFirstSeenDateTime(), FIRSTSEENDATETIME_BINDING);
            protocolMarshaller.marshall(domainDeliverabilityCampaign.getLastSeenDateTime(), LASTSEENDATETIME_BINDING);
            protocolMarshaller.marshall(domainDeliverabilityCampaign.getInboxCount(), INBOXCOUNT_BINDING);
            protocolMarshaller.marshall(domainDeliverabilityCampaign.getSpamCount(), SPAMCOUNT_BINDING);
            protocolMarshaller.marshall(domainDeliverabilityCampaign.getReadRate(), READRATE_BINDING);
            protocolMarshaller.marshall(domainDeliverabilityCampaign.getDeleteRate(), DELETERATE_BINDING);
            protocolMarshaller.marshall(domainDeliverabilityCampaign.getReadDeleteRate(), READDELETERATE_BINDING);
            protocolMarshaller.marshall(domainDeliverabilityCampaign.getProjectedVolume(), PROJECTEDVOLUME_BINDING);
            protocolMarshaller.marshall(domainDeliverabilityCampaign.getEsps(), ESPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
