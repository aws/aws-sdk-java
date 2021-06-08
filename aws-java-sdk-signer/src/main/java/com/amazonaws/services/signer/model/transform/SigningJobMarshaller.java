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
package com.amazonaws.services.signer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.signer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SigningJobMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SigningJobMarshaller {

    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobId").build();
    private static final MarshallingInfo<StructuredPojo> SOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("source").build();
    private static final MarshallingInfo<StructuredPojo> SIGNEDOBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("signedObject").build();
    private static final MarshallingInfo<StructuredPojo> SIGNINGMATERIAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("signingMaterial").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<Boolean> ISREVOKED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isRevoked").build();
    private static final MarshallingInfo<String> PROFILENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("profileName").build();
    private static final MarshallingInfo<String> PROFILEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("profileVersion").build();
    private static final MarshallingInfo<String> PLATFORMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("platformId").build();
    private static final MarshallingInfo<String> PLATFORMDISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("platformDisplayName").build();
    private static final MarshallingInfo<java.util.Date> SIGNATUREEXPIRESAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("signatureExpiresAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> JOBOWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobOwner").build();
    private static final MarshallingInfo<String> JOBINVOKER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobInvoker").build();

    private static final SigningJobMarshaller instance = new SigningJobMarshaller();

    public static SigningJobMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SigningJob signingJob, ProtocolMarshaller protocolMarshaller) {

        if (signingJob == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(signingJob.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(signingJob.getSource(), SOURCE_BINDING);
            protocolMarshaller.marshall(signingJob.getSignedObject(), SIGNEDOBJECT_BINDING);
            protocolMarshaller.marshall(signingJob.getSigningMaterial(), SIGNINGMATERIAL_BINDING);
            protocolMarshaller.marshall(signingJob.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(signingJob.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(signingJob.getIsRevoked(), ISREVOKED_BINDING);
            protocolMarshaller.marshall(signingJob.getProfileName(), PROFILENAME_BINDING);
            protocolMarshaller.marshall(signingJob.getProfileVersion(), PROFILEVERSION_BINDING);
            protocolMarshaller.marshall(signingJob.getPlatformId(), PLATFORMID_BINDING);
            protocolMarshaller.marshall(signingJob.getPlatformDisplayName(), PLATFORMDISPLAYNAME_BINDING);
            protocolMarshaller.marshall(signingJob.getSignatureExpiresAt(), SIGNATUREEXPIRESAT_BINDING);
            protocolMarshaller.marshall(signingJob.getJobOwner(), JOBOWNER_BINDING);
            protocolMarshaller.marshall(signingJob.getJobInvoker(), JOBINVOKER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
