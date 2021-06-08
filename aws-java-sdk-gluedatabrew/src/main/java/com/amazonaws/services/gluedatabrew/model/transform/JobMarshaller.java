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
package com.amazonaws.services.gluedatabrew.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gluedatabrew.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JobMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobMarshaller {

    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AccountId").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CreatedBy").build();
    private static final MarshallingInfo<java.util.Date> CREATEDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> DATASETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatasetName").build();
    private static final MarshallingInfo<String> ENCRYPTIONKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionKeyArn").build();
    private static final MarshallingInfo<String> ENCRYPTIONMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionMode").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<String> LASTMODIFIEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedBy").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LOGSUBSCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LogSubscription").build();
    private static final MarshallingInfo<Integer> MAXCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxCapacity").build();
    private static final MarshallingInfo<Integer> MAXRETRIES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxRetries").build();
    private static final MarshallingInfo<List> OUTPUTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Outputs").build();
    private static final MarshallingInfo<String> PROJECTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProjectName").build();
    private static final MarshallingInfo<StructuredPojo> RECIPEREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecipeReference").build();
    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceArn").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<Integer> TIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Timeout").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<StructuredPojo> JOBSAMPLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JobSample").build();

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
            protocolMarshaller.marshall(job.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(job.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(job.getCreateDate(), CREATEDATE_BINDING);
            protocolMarshaller.marshall(job.getDatasetName(), DATASETNAME_BINDING);
            protocolMarshaller.marshall(job.getEncryptionKeyArn(), ENCRYPTIONKEYARN_BINDING);
            protocolMarshaller.marshall(job.getEncryptionMode(), ENCRYPTIONMODE_BINDING);
            protocolMarshaller.marshall(job.getName(), NAME_BINDING);
            protocolMarshaller.marshall(job.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(job.getLastModifiedBy(), LASTMODIFIEDBY_BINDING);
            protocolMarshaller.marshall(job.getLastModifiedDate(), LASTMODIFIEDDATE_BINDING);
            protocolMarshaller.marshall(job.getLogSubscription(), LOGSUBSCRIPTION_BINDING);
            protocolMarshaller.marshall(job.getMaxCapacity(), MAXCAPACITY_BINDING);
            protocolMarshaller.marshall(job.getMaxRetries(), MAXRETRIES_BINDING);
            protocolMarshaller.marshall(job.getOutputs(), OUTPUTS_BINDING);
            protocolMarshaller.marshall(job.getProjectName(), PROJECTNAME_BINDING);
            protocolMarshaller.marshall(job.getRecipeReference(), RECIPEREFERENCE_BINDING);
            protocolMarshaller.marshall(job.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(job.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(job.getTimeout(), TIMEOUT_BINDING);
            protocolMarshaller.marshall(job.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(job.getJobSample(), JOBSAMPLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
