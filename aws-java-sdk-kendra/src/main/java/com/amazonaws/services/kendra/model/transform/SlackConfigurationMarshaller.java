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
package com.amazonaws.services.kendra.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SlackConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SlackConfigurationMarshaller {

    private static final MarshallingInfo<String> TEAMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TeamId").build();
    private static final MarshallingInfo<String> SECRETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SecretArn").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcConfiguration").build();
    private static final MarshallingInfo<List> SLACKENTITYLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SlackEntityList").build();
    private static final MarshallingInfo<Boolean> USECHANGELOG_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UseChangeLog").build();
    private static final MarshallingInfo<Boolean> CRAWLBOTMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrawlBotMessage").build();
    private static final MarshallingInfo<Boolean> EXCLUDEARCHIVED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExcludeArchived").build();
    private static final MarshallingInfo<String> SINCECRAWLDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SinceCrawlDate").build();
    private static final MarshallingInfo<Integer> LOOKBACKPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LookBackPeriod").build();
    private static final MarshallingInfo<List> PRIVATECHANNELFILTER_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrivateChannelFilter").build();
    private static final MarshallingInfo<List> PUBLICCHANNELFILTER_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PublicChannelFilter").build();
    private static final MarshallingInfo<List> INCLUSIONPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InclusionPatterns").build();
    private static final MarshallingInfo<List> EXCLUSIONPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExclusionPatterns").build();
    private static final MarshallingInfo<List> FIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FieldMappings").build();

    private static final SlackConfigurationMarshaller instance = new SlackConfigurationMarshaller();

    public static SlackConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SlackConfiguration slackConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (slackConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(slackConfiguration.getTeamId(), TEAMID_BINDING);
            protocolMarshaller.marshall(slackConfiguration.getSecretArn(), SECRETARN_BINDING);
            protocolMarshaller.marshall(slackConfiguration.getVpcConfiguration(), VPCCONFIGURATION_BINDING);
            protocolMarshaller.marshall(slackConfiguration.getSlackEntityList(), SLACKENTITYLIST_BINDING);
            protocolMarshaller.marshall(slackConfiguration.getUseChangeLog(), USECHANGELOG_BINDING);
            protocolMarshaller.marshall(slackConfiguration.getCrawlBotMessage(), CRAWLBOTMESSAGE_BINDING);
            protocolMarshaller.marshall(slackConfiguration.getExcludeArchived(), EXCLUDEARCHIVED_BINDING);
            protocolMarshaller.marshall(slackConfiguration.getSinceCrawlDate(), SINCECRAWLDATE_BINDING);
            protocolMarshaller.marshall(slackConfiguration.getLookBackPeriod(), LOOKBACKPERIOD_BINDING);
            protocolMarshaller.marshall(slackConfiguration.getPrivateChannelFilter(), PRIVATECHANNELFILTER_BINDING);
            protocolMarshaller.marshall(slackConfiguration.getPublicChannelFilter(), PUBLICCHANNELFILTER_BINDING);
            protocolMarshaller.marshall(slackConfiguration.getInclusionPatterns(), INCLUSIONPATTERNS_BINDING);
            protocolMarshaller.marshall(slackConfiguration.getExclusionPatterns(), EXCLUSIONPATTERNS_BINDING);
            protocolMarshaller.marshall(slackConfiguration.getFieldMappings(), FIELDMAPPINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
