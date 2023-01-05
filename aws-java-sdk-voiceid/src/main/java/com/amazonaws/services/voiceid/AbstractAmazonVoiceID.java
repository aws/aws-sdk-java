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
package com.amazonaws.services.voiceid;

import javax.annotation.Generated;

import com.amazonaws.services.voiceid.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonVoiceID}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonVoiceID implements AmazonVoiceID {

    protected AbstractAmazonVoiceID() {
    }

    @Override
    public CreateDomainResult createDomain(CreateDomainRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteDomainResult deleteDomain(DeleteDomainRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteFraudsterResult deleteFraudster(DeleteFraudsterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteSpeakerResult deleteSpeaker(DeleteSpeakerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDomainResult describeDomain(DescribeDomainRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeFraudsterResult describeFraudster(DescribeFraudsterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeFraudsterRegistrationJobResult describeFraudsterRegistrationJob(DescribeFraudsterRegistrationJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSpeakerResult describeSpeaker(DescribeSpeakerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSpeakerEnrollmentJobResult describeSpeakerEnrollmentJob(DescribeSpeakerEnrollmentJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EvaluateSessionResult evaluateSession(EvaluateSessionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDomainsResult listDomains(ListDomainsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListFraudsterRegistrationJobsResult listFraudsterRegistrationJobs(ListFraudsterRegistrationJobsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListSpeakerEnrollmentJobsResult listSpeakerEnrollmentJobs(ListSpeakerEnrollmentJobsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListSpeakersResult listSpeakers(ListSpeakersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public OptOutSpeakerResult optOutSpeaker(OptOutSpeakerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartFraudsterRegistrationJobResult startFraudsterRegistrationJob(StartFraudsterRegistrationJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartSpeakerEnrollmentJobResult startSpeakerEnrollmentJob(StartSpeakerEnrollmentJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateDomainResult updateDomain(UpdateDomainRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
