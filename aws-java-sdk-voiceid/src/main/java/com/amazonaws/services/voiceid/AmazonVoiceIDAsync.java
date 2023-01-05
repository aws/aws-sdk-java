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
 * Interface for accessing Amazon Voice ID asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.voiceid.AbstractAmazonVoiceIDAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Connect Voice ID provides real-time caller authentication and fraud screening. This guide describes the APIs
 * used for this service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonVoiceIDAsync extends AmazonVoiceID {

    /**
     * <p>
     * Creates a domain that contains all Amazon Connect Voice ID data, such as speakers, fraudsters, customer audio,
     * and voiceprints.
     * </p>
     * 
     * @param createDomainRequest
     * @return A Java Future containing the result of the CreateDomain operation returned by the service.
     * @sample AmazonVoiceIDAsync.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest);

    /**
     * <p>
     * Creates a domain that contains all Amazon Connect Voice ID data, such as speakers, fraudsters, customer audio,
     * and voiceprints.
     * </p>
     * 
     * @param createDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDomain operation returned by the service.
     * @sample AmazonVoiceIDAsyncHandler.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified domain from Voice ID.
     * </p>
     * 
     * @param deleteDomainRequest
     * @return A Java Future containing the result of the DeleteDomain operation returned by the service.
     * @sample AmazonVoiceIDAsync.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DeleteDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest);

    /**
     * <p>
     * Deletes the specified domain from Voice ID.
     * </p>
     * 
     * @param deleteDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDomain operation returned by the service.
     * @sample AmazonVoiceIDAsyncHandler.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DeleteDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified fraudster from Voice ID.
     * </p>
     * 
     * @param deleteFraudsterRequest
     * @return A Java Future containing the result of the DeleteFraudster operation returned by the service.
     * @sample AmazonVoiceIDAsync.DeleteFraudster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DeleteFraudster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFraudsterResult> deleteFraudsterAsync(DeleteFraudsterRequest deleteFraudsterRequest);

    /**
     * <p>
     * Deletes the specified fraudster from Voice ID.
     * </p>
     * 
     * @param deleteFraudsterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFraudster operation returned by the service.
     * @sample AmazonVoiceIDAsyncHandler.DeleteFraudster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DeleteFraudster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFraudsterResult> deleteFraudsterAsync(DeleteFraudsterRequest deleteFraudsterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFraudsterRequest, DeleteFraudsterResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified speaker from Voice ID.
     * </p>
     * 
     * @param deleteSpeakerRequest
     * @return A Java Future containing the result of the DeleteSpeaker operation returned by the service.
     * @sample AmazonVoiceIDAsync.DeleteSpeaker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DeleteSpeaker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSpeakerResult> deleteSpeakerAsync(DeleteSpeakerRequest deleteSpeakerRequest);

    /**
     * <p>
     * Deletes the specified speaker from Voice ID.
     * </p>
     * 
     * @param deleteSpeakerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSpeaker operation returned by the service.
     * @sample AmazonVoiceIDAsyncHandler.DeleteSpeaker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DeleteSpeaker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSpeakerResult> deleteSpeakerAsync(DeleteSpeakerRequest deleteSpeakerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSpeakerRequest, DeleteSpeakerResult> asyncHandler);

    /**
     * <p>
     * Describes the specified domain.
     * </p>
     * 
     * @param describeDomainRequest
     * @return A Java Future containing the result of the DescribeDomain operation returned by the service.
     * @sample AmazonVoiceIDAsync.DescribeDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DescribeDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(DescribeDomainRequest describeDomainRequest);

    /**
     * <p>
     * Describes the specified domain.
     * </p>
     * 
     * @param describeDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDomain operation returned by the service.
     * @sample AmazonVoiceIDAsyncHandler.DescribeDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DescribeDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(DescribeDomainRequest describeDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDomainRequest, DescribeDomainResult> asyncHandler);

    /**
     * <p>
     * Describes the specified fraudster.
     * </p>
     * 
     * @param describeFraudsterRequest
     * @return A Java Future containing the result of the DescribeFraudster operation returned by the service.
     * @sample AmazonVoiceIDAsync.DescribeFraudster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DescribeFraudster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFraudsterResult> describeFraudsterAsync(DescribeFraudsterRequest describeFraudsterRequest);

    /**
     * <p>
     * Describes the specified fraudster.
     * </p>
     * 
     * @param describeFraudsterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFraudster operation returned by the service.
     * @sample AmazonVoiceIDAsyncHandler.DescribeFraudster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DescribeFraudster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFraudsterResult> describeFraudsterAsync(DescribeFraudsterRequest describeFraudsterRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFraudsterRequest, DescribeFraudsterResult> asyncHandler);

    /**
     * <p>
     * Describes the specified fraudster registration job.
     * </p>
     * 
     * @param describeFraudsterRegistrationJobRequest
     * @return A Java Future containing the result of the DescribeFraudsterRegistrationJob operation returned by the
     *         service.
     * @sample AmazonVoiceIDAsync.DescribeFraudsterRegistrationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DescribeFraudsterRegistrationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFraudsterRegistrationJobResult> describeFraudsterRegistrationJobAsync(
            DescribeFraudsterRegistrationJobRequest describeFraudsterRegistrationJobRequest);

    /**
     * <p>
     * Describes the specified fraudster registration job.
     * </p>
     * 
     * @param describeFraudsterRegistrationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFraudsterRegistrationJob operation returned by the
     *         service.
     * @sample AmazonVoiceIDAsyncHandler.DescribeFraudsterRegistrationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DescribeFraudsterRegistrationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFraudsterRegistrationJobResult> describeFraudsterRegistrationJobAsync(
            DescribeFraudsterRegistrationJobRequest describeFraudsterRegistrationJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFraudsterRegistrationJobRequest, DescribeFraudsterRegistrationJobResult> asyncHandler);

    /**
     * <p>
     * Describes the specified speaker.
     * </p>
     * 
     * @param describeSpeakerRequest
     * @return A Java Future containing the result of the DescribeSpeaker operation returned by the service.
     * @sample AmazonVoiceIDAsync.DescribeSpeaker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DescribeSpeaker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSpeakerResult> describeSpeakerAsync(DescribeSpeakerRequest describeSpeakerRequest);

    /**
     * <p>
     * Describes the specified speaker.
     * </p>
     * 
     * @param describeSpeakerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSpeaker operation returned by the service.
     * @sample AmazonVoiceIDAsyncHandler.DescribeSpeaker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DescribeSpeaker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSpeakerResult> describeSpeakerAsync(DescribeSpeakerRequest describeSpeakerRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSpeakerRequest, DescribeSpeakerResult> asyncHandler);

    /**
     * <p>
     * Describes the specified speaker enrollment job.
     * </p>
     * 
     * @param describeSpeakerEnrollmentJobRequest
     * @return A Java Future containing the result of the DescribeSpeakerEnrollmentJob operation returned by the
     *         service.
     * @sample AmazonVoiceIDAsync.DescribeSpeakerEnrollmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DescribeSpeakerEnrollmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSpeakerEnrollmentJobResult> describeSpeakerEnrollmentJobAsync(
            DescribeSpeakerEnrollmentJobRequest describeSpeakerEnrollmentJobRequest);

    /**
     * <p>
     * Describes the specified speaker enrollment job.
     * </p>
     * 
     * @param describeSpeakerEnrollmentJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSpeakerEnrollmentJob operation returned by the
     *         service.
     * @sample AmazonVoiceIDAsyncHandler.DescribeSpeakerEnrollmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DescribeSpeakerEnrollmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSpeakerEnrollmentJobResult> describeSpeakerEnrollmentJobAsync(
            DescribeSpeakerEnrollmentJobRequest describeSpeakerEnrollmentJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSpeakerEnrollmentJobRequest, DescribeSpeakerEnrollmentJobResult> asyncHandler);

    /**
     * <p>
     * Evaluates a specified session based on audio data accumulated during a streaming Amazon Connect Voice ID call.
     * </p>
     * 
     * @param evaluateSessionRequest
     * @return A Java Future containing the result of the EvaluateSession operation returned by the service.
     * @sample AmazonVoiceIDAsync.EvaluateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/EvaluateSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EvaluateSessionResult> evaluateSessionAsync(EvaluateSessionRequest evaluateSessionRequest);

    /**
     * <p>
     * Evaluates a specified session based on audio data accumulated during a streaming Amazon Connect Voice ID call.
     * </p>
     * 
     * @param evaluateSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EvaluateSession operation returned by the service.
     * @sample AmazonVoiceIDAsyncHandler.EvaluateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/EvaluateSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EvaluateSessionResult> evaluateSessionAsync(EvaluateSessionRequest evaluateSessionRequest,
            com.amazonaws.handlers.AsyncHandler<EvaluateSessionRequest, EvaluateSessionResult> asyncHandler);

    /**
     * <p>
     * Lists all the domains in the Amazon Web Services account.
     * </p>
     * 
     * @param listDomainsRequest
     * @return A Java Future containing the result of the ListDomains operation returned by the service.
     * @sample AmazonVoiceIDAsync.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest listDomainsRequest);

    /**
     * <p>
     * Lists all the domains in the Amazon Web Services account.
     * </p>
     * 
     * @param listDomainsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDomains operation returned by the service.
     * @sample AmazonVoiceIDAsyncHandler.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest listDomainsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler);

    /**
     * <p>
     * Lists all the fraudster registration jobs in the domain with the given <code>JobStatus</code>. If
     * <code>JobStatus</code> is not provided, this lists all fraudster registration jobs in the given domain.
     * </p>
     * 
     * @param listFraudsterRegistrationJobsRequest
     * @return A Java Future containing the result of the ListFraudsterRegistrationJobs operation returned by the
     *         service.
     * @sample AmazonVoiceIDAsync.ListFraudsterRegistrationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/ListFraudsterRegistrationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFraudsterRegistrationJobsResult> listFraudsterRegistrationJobsAsync(
            ListFraudsterRegistrationJobsRequest listFraudsterRegistrationJobsRequest);

    /**
     * <p>
     * Lists all the fraudster registration jobs in the domain with the given <code>JobStatus</code>. If
     * <code>JobStatus</code> is not provided, this lists all fraudster registration jobs in the given domain.
     * </p>
     * 
     * @param listFraudsterRegistrationJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFraudsterRegistrationJobs operation returned by the
     *         service.
     * @sample AmazonVoiceIDAsyncHandler.ListFraudsterRegistrationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/ListFraudsterRegistrationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFraudsterRegistrationJobsResult> listFraudsterRegistrationJobsAsync(
            ListFraudsterRegistrationJobsRequest listFraudsterRegistrationJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFraudsterRegistrationJobsRequest, ListFraudsterRegistrationJobsResult> asyncHandler);

    /**
     * <p>
     * Lists all the speaker enrollment jobs in the domain with the specified <code>JobStatus</code>. If
     * <code>JobStatus</code> is not provided, this lists all jobs with all possible speaker enrollment job statuses.
     * </p>
     * 
     * @param listSpeakerEnrollmentJobsRequest
     * @return A Java Future containing the result of the ListSpeakerEnrollmentJobs operation returned by the service.
     * @sample AmazonVoiceIDAsync.ListSpeakerEnrollmentJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/ListSpeakerEnrollmentJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSpeakerEnrollmentJobsResult> listSpeakerEnrollmentJobsAsync(
            ListSpeakerEnrollmentJobsRequest listSpeakerEnrollmentJobsRequest);

    /**
     * <p>
     * Lists all the speaker enrollment jobs in the domain with the specified <code>JobStatus</code>. If
     * <code>JobStatus</code> is not provided, this lists all jobs with all possible speaker enrollment job statuses.
     * </p>
     * 
     * @param listSpeakerEnrollmentJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSpeakerEnrollmentJobs operation returned by the service.
     * @sample AmazonVoiceIDAsyncHandler.ListSpeakerEnrollmentJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/ListSpeakerEnrollmentJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSpeakerEnrollmentJobsResult> listSpeakerEnrollmentJobsAsync(
            ListSpeakerEnrollmentJobsRequest listSpeakerEnrollmentJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSpeakerEnrollmentJobsRequest, ListSpeakerEnrollmentJobsResult> asyncHandler);

    /**
     * <p>
     * Lists all speakers in a specified domain.
     * </p>
     * 
     * @param listSpeakersRequest
     * @return A Java Future containing the result of the ListSpeakers operation returned by the service.
     * @sample AmazonVoiceIDAsync.ListSpeakers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/ListSpeakers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSpeakersResult> listSpeakersAsync(ListSpeakersRequest listSpeakersRequest);

    /**
     * <p>
     * Lists all speakers in a specified domain.
     * </p>
     * 
     * @param listSpeakersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSpeakers operation returned by the service.
     * @sample AmazonVoiceIDAsyncHandler.ListSpeakers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/ListSpeakers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSpeakersResult> listSpeakersAsync(ListSpeakersRequest listSpeakersRequest,
            com.amazonaws.handlers.AsyncHandler<ListSpeakersRequest, ListSpeakersResult> asyncHandler);

    /**
     * <p>
     * Lists all tags associated with a specified Voice ID resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonVoiceIDAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all tags associated with a specified Voice ID resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonVoiceIDAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Opts out a speaker from Voice ID. A speaker can be opted out regardless of whether or not they already exist in
     * Voice ID. If they don't yet exist, a new speaker is created in an opted out state. If they already exist, their
     * existing status is overridden and they are opted out. Enrollment and evaluation authentication requests are
     * rejected for opted out speakers, and opted out speakers have no voice embeddings stored in Voice ID.
     * </p>
     * 
     * @param optOutSpeakerRequest
     * @return A Java Future containing the result of the OptOutSpeaker operation returned by the service.
     * @sample AmazonVoiceIDAsync.OptOutSpeaker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/OptOutSpeaker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<OptOutSpeakerResult> optOutSpeakerAsync(OptOutSpeakerRequest optOutSpeakerRequest);

    /**
     * <p>
     * Opts out a speaker from Voice ID. A speaker can be opted out regardless of whether or not they already exist in
     * Voice ID. If they don't yet exist, a new speaker is created in an opted out state. If they already exist, their
     * existing status is overridden and they are opted out. Enrollment and evaluation authentication requests are
     * rejected for opted out speakers, and opted out speakers have no voice embeddings stored in Voice ID.
     * </p>
     * 
     * @param optOutSpeakerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the OptOutSpeaker operation returned by the service.
     * @sample AmazonVoiceIDAsyncHandler.OptOutSpeaker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/OptOutSpeaker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<OptOutSpeakerResult> optOutSpeakerAsync(OptOutSpeakerRequest optOutSpeakerRequest,
            com.amazonaws.handlers.AsyncHandler<OptOutSpeakerRequest, OptOutSpeakerResult> asyncHandler);

    /**
     * <p>
     * Starts a new batch fraudster registration job using provided details.
     * </p>
     * 
     * @param startFraudsterRegistrationJobRequest
     * @return A Java Future containing the result of the StartFraudsterRegistrationJob operation returned by the
     *         service.
     * @sample AmazonVoiceIDAsync.StartFraudsterRegistrationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/StartFraudsterRegistrationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartFraudsterRegistrationJobResult> startFraudsterRegistrationJobAsync(
            StartFraudsterRegistrationJobRequest startFraudsterRegistrationJobRequest);

    /**
     * <p>
     * Starts a new batch fraudster registration job using provided details.
     * </p>
     * 
     * @param startFraudsterRegistrationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartFraudsterRegistrationJob operation returned by the
     *         service.
     * @sample AmazonVoiceIDAsyncHandler.StartFraudsterRegistrationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/StartFraudsterRegistrationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartFraudsterRegistrationJobResult> startFraudsterRegistrationJobAsync(
            StartFraudsterRegistrationJobRequest startFraudsterRegistrationJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartFraudsterRegistrationJobRequest, StartFraudsterRegistrationJobResult> asyncHandler);

    /**
     * <p>
     * Starts a new batch speaker enrollment job using specified details.
     * </p>
     * 
     * @param startSpeakerEnrollmentJobRequest
     * @return A Java Future containing the result of the StartSpeakerEnrollmentJob operation returned by the service.
     * @sample AmazonVoiceIDAsync.StartSpeakerEnrollmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/StartSpeakerEnrollmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartSpeakerEnrollmentJobResult> startSpeakerEnrollmentJobAsync(
            StartSpeakerEnrollmentJobRequest startSpeakerEnrollmentJobRequest);

    /**
     * <p>
     * Starts a new batch speaker enrollment job using specified details.
     * </p>
     * 
     * @param startSpeakerEnrollmentJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartSpeakerEnrollmentJob operation returned by the service.
     * @sample AmazonVoiceIDAsyncHandler.StartSpeakerEnrollmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/StartSpeakerEnrollmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartSpeakerEnrollmentJobResult> startSpeakerEnrollmentJobAsync(
            StartSpeakerEnrollmentJobRequest startSpeakerEnrollmentJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartSpeakerEnrollmentJobRequest, StartSpeakerEnrollmentJobResult> asyncHandler);

    /**
     * <p>
     * Tags a Voice ID resource with the provided list of tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonVoiceIDAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tags a Voice ID resource with the provided list of tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonVoiceIDAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes specified tags from a specified Amazon Connect Voice ID resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonVoiceIDAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes specified tags from a specified Amazon Connect Voice ID resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonVoiceIDAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the specified domain. This API has clobber behavior, and clears and replaces all attributes. If an
     * optional field, such as 'Description' is not provided, it is removed from the domain.
     * </p>
     * 
     * @param updateDomainRequest
     * @return A Java Future containing the result of the UpdateDomain operation returned by the service.
     * @sample AmazonVoiceIDAsync.UpdateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/UpdateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDomainResult> updateDomainAsync(UpdateDomainRequest updateDomainRequest);

    /**
     * <p>
     * Updates the specified domain. This API has clobber behavior, and clears and replaces all attributes. If an
     * optional field, such as 'Description' is not provided, it is removed from the domain.
     * </p>
     * 
     * @param updateDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDomain operation returned by the service.
     * @sample AmazonVoiceIDAsyncHandler.UpdateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/UpdateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDomainResult> updateDomainAsync(UpdateDomainRequest updateDomainRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDomainRequest, UpdateDomainResult> asyncHandler);

}
