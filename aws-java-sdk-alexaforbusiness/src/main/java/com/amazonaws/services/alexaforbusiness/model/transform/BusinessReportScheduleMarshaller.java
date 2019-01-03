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
package com.amazonaws.services.alexaforbusiness.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.alexaforbusiness.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BusinessReportScheduleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BusinessReportScheduleMarshaller {

    private static final MarshallingInfo<String> SCHEDULEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduleArn").build();
    private static final MarshallingInfo<String> SCHEDULENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduleName").build();
    private static final MarshallingInfo<String> S3BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3BucketName").build();
    private static final MarshallingInfo<String> S3KEYPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3KeyPrefix").build();
    private static final MarshallingInfo<String> FORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Format").build();
    private static final MarshallingInfo<StructuredPojo> CONTENTRANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContentRange").build();
    private static final MarshallingInfo<StructuredPojo> RECURRENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Recurrence").build();
    private static final MarshallingInfo<StructuredPojo> LASTBUSINESSREPORT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastBusinessReport").build();

    private static final BusinessReportScheduleMarshaller instance = new BusinessReportScheduleMarshaller();

    public static BusinessReportScheduleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BusinessReportSchedule businessReportSchedule, ProtocolMarshaller protocolMarshaller) {

        if (businessReportSchedule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(businessReportSchedule.getScheduleArn(), SCHEDULEARN_BINDING);
            protocolMarshaller.marshall(businessReportSchedule.getScheduleName(), SCHEDULENAME_BINDING);
            protocolMarshaller.marshall(businessReportSchedule.getS3BucketName(), S3BUCKETNAME_BINDING);
            protocolMarshaller.marshall(businessReportSchedule.getS3KeyPrefix(), S3KEYPREFIX_BINDING);
            protocolMarshaller.marshall(businessReportSchedule.getFormat(), FORMAT_BINDING);
            protocolMarshaller.marshall(businessReportSchedule.getContentRange(), CONTENTRANGE_BINDING);
            protocolMarshaller.marshall(businessReportSchedule.getRecurrence(), RECURRENCE_BINDING);
            protocolMarshaller.marshall(businessReportSchedule.getLastBusinessReport(), LASTBUSINESSREPORT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
