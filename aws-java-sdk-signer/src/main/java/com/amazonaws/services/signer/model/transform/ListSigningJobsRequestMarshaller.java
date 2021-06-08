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
 * ListSigningJobsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListSigningJobsRequestMarshaller {

    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("status").build();
    private static final MarshallingInfo<String> PLATFORMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("platformId").build();
    private static final MarshallingInfo<String> REQUESTEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("requestedBy").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("nextToken").build();
    private static final MarshallingInfo<Boolean> ISREVOKED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("isRevoked").build();
    private static final MarshallingInfo<java.util.Date> SIGNATUREEXPIRESBEFORE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("signatureExpiresBefore").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> SIGNATUREEXPIRESAFTER_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("signatureExpiresAfter").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> JOBINVOKER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("jobInvoker").build();

    private static final ListSigningJobsRequestMarshaller instance = new ListSigningJobsRequestMarshaller();

    public static ListSigningJobsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListSigningJobsRequest listSigningJobsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listSigningJobsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listSigningJobsRequest.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(listSigningJobsRequest.getPlatformId(), PLATFORMID_BINDING);
            protocolMarshaller.marshall(listSigningJobsRequest.getRequestedBy(), REQUESTEDBY_BINDING);
            protocolMarshaller.marshall(listSigningJobsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listSigningJobsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listSigningJobsRequest.getIsRevoked(), ISREVOKED_BINDING);
            protocolMarshaller.marshall(listSigningJobsRequest.getSignatureExpiresBefore(), SIGNATUREEXPIRESBEFORE_BINDING);
            protocolMarshaller.marshall(listSigningJobsRequest.getSignatureExpiresAfter(), SIGNATUREEXPIRESAFTER_BINDING);
            protocolMarshaller.marshall(listSigningJobsRequest.getJobInvoker(), JOBINVOKER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
