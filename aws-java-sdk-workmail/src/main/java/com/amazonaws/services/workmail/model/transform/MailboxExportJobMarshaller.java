/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workmail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workmail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MailboxExportJobMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MailboxExportJobMarshaller {

    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobId").build();
    private static final MarshallingInfo<String> ENTITYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EntityId").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> S3BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3BucketName").build();
    private static final MarshallingInfo<String> S3PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("S3Path").build();
    private static final MarshallingInfo<Integer> ESTIMATEDPROGRESS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedProgress").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("unixTimestamp").build();

    private static final MailboxExportJobMarshaller instance = new MailboxExportJobMarshaller();

    public static MailboxExportJobMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MailboxExportJob mailboxExportJob, ProtocolMarshaller protocolMarshaller) {

        if (mailboxExportJob == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mailboxExportJob.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(mailboxExportJob.getEntityId(), ENTITYID_BINDING);
            protocolMarshaller.marshall(mailboxExportJob.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(mailboxExportJob.getS3BucketName(), S3BUCKETNAME_BINDING);
            protocolMarshaller.marshall(mailboxExportJob.getS3Path(), S3PATH_BINDING);
            protocolMarshaller.marshall(mailboxExportJob.getEstimatedProgress(), ESTIMATEDPROGRESS_BINDING);
            protocolMarshaller.marshall(mailboxExportJob.getState(), STATE_BINDING);
            protocolMarshaller.marshall(mailboxExportJob.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(mailboxExportJob.getEndTime(), ENDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
