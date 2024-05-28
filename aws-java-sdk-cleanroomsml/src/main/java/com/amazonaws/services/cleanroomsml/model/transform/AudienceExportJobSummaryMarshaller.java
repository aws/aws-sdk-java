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
package com.amazonaws.services.cleanroomsml.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cleanroomsml.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AudienceExportJobSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AudienceExportJobSummaryMarshaller {

    private static final MarshallingInfo<String> AUDIENCEGENERATIONJOBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audienceGenerationJobArn").build();
    private static final MarshallingInfo<StructuredPojo> AUDIENCESIZE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audienceSize").build();
    private static final MarshallingInfo<java.util.Date> CREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> OUTPUTLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputLocation").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<StructuredPojo> STATUSDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusDetails").build();
    private static final MarshallingInfo<java.util.Date> UPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateTime").timestampFormat("iso8601").build();

    private static final AudienceExportJobSummaryMarshaller instance = new AudienceExportJobSummaryMarshaller();

    public static AudienceExportJobSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AudienceExportJobSummary audienceExportJobSummary, ProtocolMarshaller protocolMarshaller) {

        if (audienceExportJobSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(audienceExportJobSummary.getAudienceGenerationJobArn(), AUDIENCEGENERATIONJOBARN_BINDING);
            protocolMarshaller.marshall(audienceExportJobSummary.getAudienceSize(), AUDIENCESIZE_BINDING);
            protocolMarshaller.marshall(audienceExportJobSummary.getCreateTime(), CREATETIME_BINDING);
            protocolMarshaller.marshall(audienceExportJobSummary.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(audienceExportJobSummary.getName(), NAME_BINDING);
            protocolMarshaller.marshall(audienceExportJobSummary.getOutputLocation(), OUTPUTLOCATION_BINDING);
            protocolMarshaller.marshall(audienceExportJobSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(audienceExportJobSummary.getStatusDetails(), STATUSDETAILS_BINDING);
            protocolMarshaller.marshall(audienceExportJobSummary.getUpdateTime(), UPDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
