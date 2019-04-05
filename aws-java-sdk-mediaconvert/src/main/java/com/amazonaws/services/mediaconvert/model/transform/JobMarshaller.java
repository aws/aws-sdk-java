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
package com.amazonaws.services.mediaconvert.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconvert.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JobMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobMarshaller {

    private static final MarshallingInfo<StructuredPojo> ACCELERATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accelerationSettings").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> BILLINGTAGSSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("billingTagsSource").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CURRENTPHASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentPhase").build();
    private static final MarshallingInfo<Integer> ERRORCODE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("errorCode").build();
    private static final MarshallingInfo<String> ERRORMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("errorMessage").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<Integer> JOBPERCENTCOMPLETE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobPercentComplete").build();
    private static final MarshallingInfo<String> JOBTEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobTemplate").build();
    private static final MarshallingInfo<List> OUTPUTGROUPDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputGroupDetails").build();
    private static final MarshallingInfo<String> QUEUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("queue").build();
    private static final MarshallingInfo<Integer> RETRYCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("retryCount").build();
    private static final MarshallingInfo<String> ROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("role").build();
    private static final MarshallingInfo<StructuredPojo> SETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("settings").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> STATUSUPDATEINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusUpdateInterval").build();
    private static final MarshallingInfo<StructuredPojo> TIMING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timing").build();
    private static final MarshallingInfo<Map> USERMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("userMetadata").build();

    private static final JobMarshaller instance = new JobMarshaller();

    public static JobMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Job job, ProtocolMarshaller protocolMarshaller) {

        if (job == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(job.getAccelerationSettings(), ACCELERATIONSETTINGS_BINDING);
            protocolMarshaller.marshall(job.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(job.getBillingTagsSource(), BILLINGTAGSSOURCE_BINDING);
            protocolMarshaller.marshall(job.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(job.getCurrentPhase(), CURRENTPHASE_BINDING);
            protocolMarshaller.marshall(job.getErrorCode(), ERRORCODE_BINDING);
            protocolMarshaller.marshall(job.getErrorMessage(), ERRORMESSAGE_BINDING);
            protocolMarshaller.marshall(job.getId(), ID_BINDING);
            protocolMarshaller.marshall(job.getJobPercentComplete(), JOBPERCENTCOMPLETE_BINDING);
            protocolMarshaller.marshall(job.getJobTemplate(), JOBTEMPLATE_BINDING);
            protocolMarshaller.marshall(job.getOutputGroupDetails(), OUTPUTGROUPDETAILS_BINDING);
            protocolMarshaller.marshall(job.getQueue(), QUEUE_BINDING);
            protocolMarshaller.marshall(job.getRetryCount(), RETRYCOUNT_BINDING);
            protocolMarshaller.marshall(job.getRole(), ROLE_BINDING);
            protocolMarshaller.marshall(job.getSettings(), SETTINGS_BINDING);
            protocolMarshaller.marshall(job.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(job.getStatusUpdateInterval(), STATUSUPDATEINTERVAL_BINDING);
            protocolMarshaller.marshall(job.getTiming(), TIMING_BINDING);
            protocolMarshaller.marshall(job.getUserMetadata(), USERMETADATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
