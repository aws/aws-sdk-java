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
package com.amazonaws.services.customerprofiles.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.customerprofiles.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * IdentityResolutionJobMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IdentityResolutionJobMarshaller {

    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainName").build();
    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<java.util.Date> JOBSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JobStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> JOBENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JobEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> JOBSTATS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JobStats").build();
    private static final MarshallingInfo<StructuredPojo> EXPORTINGLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExportingLocation").build();
    private static final MarshallingInfo<String> MESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Message").build();

    private static final IdentityResolutionJobMarshaller instance = new IdentityResolutionJobMarshaller();

    public static IdentityResolutionJobMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IdentityResolutionJob identityResolutionJob, ProtocolMarshaller protocolMarshaller) {

        if (identityResolutionJob == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(identityResolutionJob.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(identityResolutionJob.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(identityResolutionJob.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(identityResolutionJob.getJobStartTime(), JOBSTARTTIME_BINDING);
            protocolMarshaller.marshall(identityResolutionJob.getJobEndTime(), JOBENDTIME_BINDING);
            protocolMarshaller.marshall(identityResolutionJob.getJobStats(), JOBSTATS_BINDING);
            protocolMarshaller.marshall(identityResolutionJob.getExportingLocation(), EXPORTINGLOCATION_BINDING);
            protocolMarshaller.marshall(identityResolutionJob.getMessage(), MESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
