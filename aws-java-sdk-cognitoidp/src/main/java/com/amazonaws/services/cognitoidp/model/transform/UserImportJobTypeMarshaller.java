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
package com.amazonaws.services.cognitoidp.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UserImportJobTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UserImportJobTypeMarshaller {

    private static final MarshallingInfo<String> JOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobName").build();
    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobId").build();
    private static final MarshallingInfo<String> USERPOOLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserPoolId").build();
    private static final MarshallingInfo<String> PRESIGNEDURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreSignedUrl").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> STARTDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> COMPLETIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletionDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> CLOUDWATCHLOGSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchLogsRoleArn").build();
    private static final MarshallingInfo<Long> IMPORTEDUSERS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ImportedUsers").build();
    private static final MarshallingInfo<Long> SKIPPEDUSERS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SkippedUsers").build();
    private static final MarshallingInfo<Long> FAILEDUSERS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FailedUsers").build();
    private static final MarshallingInfo<String> COMPLETIONMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletionMessage").build();

    private static final UserImportJobTypeMarshaller instance = new UserImportJobTypeMarshaller();

    public static UserImportJobTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UserImportJobType userImportJobType, ProtocolMarshaller protocolMarshaller) {

        if (userImportJobType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(userImportJobType.getJobName(), JOBNAME_BINDING);
            protocolMarshaller.marshall(userImportJobType.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(userImportJobType.getUserPoolId(), USERPOOLID_BINDING);
            protocolMarshaller.marshall(userImportJobType.getPreSignedUrl(), PRESIGNEDURL_BINDING);
            protocolMarshaller.marshall(userImportJobType.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(userImportJobType.getStartDate(), STARTDATE_BINDING);
            protocolMarshaller.marshall(userImportJobType.getCompletionDate(), COMPLETIONDATE_BINDING);
            protocolMarshaller.marshall(userImportJobType.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(userImportJobType.getCloudWatchLogsRoleArn(), CLOUDWATCHLOGSROLEARN_BINDING);
            protocolMarshaller.marshall(userImportJobType.getImportedUsers(), IMPORTEDUSERS_BINDING);
            protocolMarshaller.marshall(userImportJobType.getSkippedUsers(), SKIPPEDUSERS_BINDING);
            protocolMarshaller.marshall(userImportJobType.getFailedUsers(), FAILEDUSERS_BINDING);
            protocolMarshaller.marshall(userImportJobType.getCompletionMessage(), COMPLETIONMESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
