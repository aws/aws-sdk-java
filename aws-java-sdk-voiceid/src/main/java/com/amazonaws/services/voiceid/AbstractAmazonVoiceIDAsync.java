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

/**
 * Abstract implementation of {@code AmazonVoiceIDAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonVoiceIDAsync extends AbstractAmazonVoiceID implements AmazonVoiceIDAsync {

    protected AbstractAmazonVoiceIDAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest request) {

        return createDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest request) {

        return deleteDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteFraudsterResult> deleteFraudsterAsync(DeleteFraudsterRequest request) {

        return deleteFraudsterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFraudsterResult> deleteFraudsterAsync(DeleteFraudsterRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteFraudsterRequest, DeleteFraudsterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSpeakerResult> deleteSpeakerAsync(DeleteSpeakerRequest request) {

        return deleteSpeakerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSpeakerResult> deleteSpeakerAsync(DeleteSpeakerRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSpeakerRequest, DeleteSpeakerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(DescribeDomainRequest request) {

        return describeDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(DescribeDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDomainRequest, DescribeDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFraudsterResult> describeFraudsterAsync(DescribeFraudsterRequest request) {

        return describeFraudsterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFraudsterResult> describeFraudsterAsync(DescribeFraudsterRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFraudsterRequest, DescribeFraudsterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFraudsterRegistrationJobResult> describeFraudsterRegistrationJobAsync(
            DescribeFraudsterRegistrationJobRequest request) {

        return describeFraudsterRegistrationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFraudsterRegistrationJobResult> describeFraudsterRegistrationJobAsync(
            DescribeFraudsterRegistrationJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFraudsterRegistrationJobRequest, DescribeFraudsterRegistrationJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSpeakerResult> describeSpeakerAsync(DescribeSpeakerRequest request) {

        return describeSpeakerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpeakerResult> describeSpeakerAsync(DescribeSpeakerRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSpeakerRequest, DescribeSpeakerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSpeakerEnrollmentJobResult> describeSpeakerEnrollmentJobAsync(DescribeSpeakerEnrollmentJobRequest request) {

        return describeSpeakerEnrollmentJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpeakerEnrollmentJobResult> describeSpeakerEnrollmentJobAsync(DescribeSpeakerEnrollmentJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSpeakerEnrollmentJobRequest, DescribeSpeakerEnrollmentJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EvaluateSessionResult> evaluateSessionAsync(EvaluateSessionRequest request) {

        return evaluateSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EvaluateSessionResult> evaluateSessionAsync(EvaluateSessionRequest request,
            com.amazonaws.handlers.AsyncHandler<EvaluateSessionRequest, EvaluateSessionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest request) {

        return listDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListFraudsterRegistrationJobsResult> listFraudsterRegistrationJobsAsync(ListFraudsterRegistrationJobsRequest request) {

        return listFraudsterRegistrationJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFraudsterRegistrationJobsResult> listFraudsterRegistrationJobsAsync(ListFraudsterRegistrationJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListFraudsterRegistrationJobsRequest, ListFraudsterRegistrationJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSpeakerEnrollmentJobsResult> listSpeakerEnrollmentJobsAsync(ListSpeakerEnrollmentJobsRequest request) {

        return listSpeakerEnrollmentJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSpeakerEnrollmentJobsResult> listSpeakerEnrollmentJobsAsync(ListSpeakerEnrollmentJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSpeakerEnrollmentJobsRequest, ListSpeakerEnrollmentJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSpeakersResult> listSpeakersAsync(ListSpeakersRequest request) {

        return listSpeakersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSpeakersResult> listSpeakersAsync(ListSpeakersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSpeakersRequest, ListSpeakersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<OptOutSpeakerResult> optOutSpeakerAsync(OptOutSpeakerRequest request) {

        return optOutSpeakerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<OptOutSpeakerResult> optOutSpeakerAsync(OptOutSpeakerRequest request,
            com.amazonaws.handlers.AsyncHandler<OptOutSpeakerRequest, OptOutSpeakerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartFraudsterRegistrationJobResult> startFraudsterRegistrationJobAsync(StartFraudsterRegistrationJobRequest request) {

        return startFraudsterRegistrationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartFraudsterRegistrationJobResult> startFraudsterRegistrationJobAsync(StartFraudsterRegistrationJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartFraudsterRegistrationJobRequest, StartFraudsterRegistrationJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartSpeakerEnrollmentJobResult> startSpeakerEnrollmentJobAsync(StartSpeakerEnrollmentJobRequest request) {

        return startSpeakerEnrollmentJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartSpeakerEnrollmentJobResult> startSpeakerEnrollmentJobAsync(StartSpeakerEnrollmentJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartSpeakerEnrollmentJobRequest, StartSpeakerEnrollmentJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainResult> updateDomainAsync(UpdateDomainRequest request) {

        return updateDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainResult> updateDomainAsync(UpdateDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDomainRequest, UpdateDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
