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
package com.amazonaws.services.resiliencehub.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.resiliencehub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RecommendationTemplateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RecommendationTemplateMarshaller {

    private static final MarshallingInfo<String> APPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("appArn").build();
    private static final MarshallingInfo<String> ASSESSMENTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assessmentArn").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> FORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("format").build();
    private static final MarshallingInfo<String> MESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("message").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<Boolean> NEEDSREPLACEMENTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("needsReplacements").build();
    private static final MarshallingInfo<List> RECOMMENDATIONIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recommendationIds").build();
    private static final MarshallingInfo<String> RECOMMENDATIONTEMPLATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recommendationTemplateArn").build();
    private static final MarshallingInfo<List> RECOMMENDATIONTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recommendationTypes").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<StructuredPojo> TEMPLATESLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("templatesLocation").build();

    private static final RecommendationTemplateMarshaller instance = new RecommendationTemplateMarshaller();

    public static RecommendationTemplateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RecommendationTemplate recommendationTemplate, ProtocolMarshaller protocolMarshaller) {

        if (recommendationTemplate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(recommendationTemplate.getAppArn(), APPARN_BINDING);
            protocolMarshaller.marshall(recommendationTemplate.getAssessmentArn(), ASSESSMENTARN_BINDING);
            protocolMarshaller.marshall(recommendationTemplate.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(recommendationTemplate.getFormat(), FORMAT_BINDING);
            protocolMarshaller.marshall(recommendationTemplate.getMessage(), MESSAGE_BINDING);
            protocolMarshaller.marshall(recommendationTemplate.getName(), NAME_BINDING);
            protocolMarshaller.marshall(recommendationTemplate.getNeedsReplacements(), NEEDSREPLACEMENTS_BINDING);
            protocolMarshaller.marshall(recommendationTemplate.getRecommendationIds(), RECOMMENDATIONIDS_BINDING);
            protocolMarshaller.marshall(recommendationTemplate.getRecommendationTemplateArn(), RECOMMENDATIONTEMPLATEARN_BINDING);
            protocolMarshaller.marshall(recommendationTemplate.getRecommendationTypes(), RECOMMENDATIONTYPES_BINDING);
            protocolMarshaller.marshall(recommendationTemplate.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(recommendationTemplate.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(recommendationTemplate.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(recommendationTemplate.getTemplatesLocation(), TEMPLATESLOCATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
