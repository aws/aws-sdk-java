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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LabelingJobForWorkteamSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LabelingJobForWorkteamSummaryMarshaller {

    private static final MarshallingInfo<String> LABELINGJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LabelingJobName").build();
    private static final MarshallingInfo<String> JOBREFERENCECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JobReferenceCode").build();
    private static final MarshallingInfo<String> WORKREQUESTERACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkRequesterAccountId").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> LABELCOUNTERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LabelCounters").build();

    private static final LabelingJobForWorkteamSummaryMarshaller instance = new LabelingJobForWorkteamSummaryMarshaller();

    public static LabelingJobForWorkteamSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LabelingJobForWorkteamSummary labelingJobForWorkteamSummary, ProtocolMarshaller protocolMarshaller) {

        if (labelingJobForWorkteamSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(labelingJobForWorkteamSummary.getLabelingJobName(), LABELINGJOBNAME_BINDING);
            protocolMarshaller.marshall(labelingJobForWorkteamSummary.getJobReferenceCode(), JOBREFERENCECODE_BINDING);
            protocolMarshaller.marshall(labelingJobForWorkteamSummary.getWorkRequesterAccountId(), WORKREQUESTERACCOUNTID_BINDING);
            protocolMarshaller.marshall(labelingJobForWorkteamSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(labelingJobForWorkteamSummary.getLabelCounters(), LABELCOUNTERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
