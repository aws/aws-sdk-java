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
package com.amazonaws.services.transcribe.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.transcribe.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CallAnalyticsJobMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CallAnalyticsJobMarshaller {

    private static final MarshallingInfo<String> CALLANALYTICSJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CallAnalyticsJobName").build();
    private static final MarshallingInfo<String> CALLANALYTICSJOBSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CallAnalyticsJobStatus").build();
    private static final MarshallingInfo<StructuredPojo> CALLANALYTICSJOBDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CallAnalyticsJobDetails").build();
    private static final MarshallingInfo<String> LANGUAGECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LanguageCode").build();
    private static final MarshallingInfo<Integer> MEDIASAMPLERATEHERTZ_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediaSampleRateHertz").build();
    private static final MarshallingInfo<String> MEDIAFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediaFormat").build();
    private static final MarshallingInfo<StructuredPojo> MEDIA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Media").build();
    private static final MarshallingInfo<StructuredPojo> TRANSCRIPT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Transcript").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> COMPLETIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletionTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureReason").build();
    private static final MarshallingInfo<String> DATAACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataAccessRoleArn").build();
    private static final MarshallingInfo<Float> IDENTIFIEDLANGUAGESCORE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentifiedLanguageScore").build();
    private static final MarshallingInfo<StructuredPojo> SETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Settings").build();
    private static final MarshallingInfo<List> CHANNELDEFINITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChannelDefinitions").build();

    private static final CallAnalyticsJobMarshaller instance = new CallAnalyticsJobMarshaller();

    public static CallAnalyticsJobMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CallAnalyticsJob callAnalyticsJob, ProtocolMarshaller protocolMarshaller) {

        if (callAnalyticsJob == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(callAnalyticsJob.getCallAnalyticsJobName(), CALLANALYTICSJOBNAME_BINDING);
            protocolMarshaller.marshall(callAnalyticsJob.getCallAnalyticsJobStatus(), CALLANALYTICSJOBSTATUS_BINDING);
            protocolMarshaller.marshall(callAnalyticsJob.getCallAnalyticsJobDetails(), CALLANALYTICSJOBDETAILS_BINDING);
            protocolMarshaller.marshall(callAnalyticsJob.getLanguageCode(), LANGUAGECODE_BINDING);
            protocolMarshaller.marshall(callAnalyticsJob.getMediaSampleRateHertz(), MEDIASAMPLERATEHERTZ_BINDING);
            protocolMarshaller.marshall(callAnalyticsJob.getMediaFormat(), MEDIAFORMAT_BINDING);
            protocolMarshaller.marshall(callAnalyticsJob.getMedia(), MEDIA_BINDING);
            protocolMarshaller.marshall(callAnalyticsJob.getTranscript(), TRANSCRIPT_BINDING);
            protocolMarshaller.marshall(callAnalyticsJob.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(callAnalyticsJob.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(callAnalyticsJob.getCompletionTime(), COMPLETIONTIME_BINDING);
            protocolMarshaller.marshall(callAnalyticsJob.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(callAnalyticsJob.getDataAccessRoleArn(), DATAACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(callAnalyticsJob.getIdentifiedLanguageScore(), IDENTIFIEDLANGUAGESCORE_BINDING);
            protocolMarshaller.marshall(callAnalyticsJob.getSettings(), SETTINGS_BINDING);
            protocolMarshaller.marshall(callAnalyticsJob.getChannelDefinitions(), CHANNELDEFINITIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
