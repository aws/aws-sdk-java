/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.voiceid.model.*;

/**
 * Interface for accessing Amazon Voice ID.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.voiceid.AbstractAmazonVoiceID} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Connect Voice ID provides real-time caller authentication and fraud screening. This guide describes the APIs
 * used for this service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonVoiceID {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "voiceid";

    /**
     * <p>
     * Creates a domain that contains all Amazon Connect Voice ID data, such as speakers, fraudsters, customer audio,
     * and voiceprints.
     * </p>
     * 
     * @param createDomainRequest
     * @return Result of the CreateDomain operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request exceeded the service quota. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#voiceid-quotas"
     *         >Voice ID Service Quotas</a> and try your request again.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws ConflictException
     *         The request failed due to a conflict. Check the <code>ConflictType</code> and error message for more
     *         details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDomainResult createDomain(CreateDomainRequest createDomainRequest);

    /**
     * <p>
     * Deletes the specified domain from Voice ID.
     * </p>
     * 
     * @param deleteDomainRequest
     * @return Result of the DeleteDomain operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws ConflictException
     *         The request failed due to a conflict. Check the <code>ConflictType</code> and error message for more
     *         details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DeleteDomain" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDomainResult deleteDomain(DeleteDomainRequest deleteDomainRequest);

    /**
     * <p>
     * Deletes the specified fraudster from Voice ID.
     * </p>
     * 
     * @param deleteFraudsterRequest
     * @return Result of the DeleteFraudster operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws ConflictException
     *         The request failed due to a conflict. Check the <code>ConflictType</code> and error message for more
     *         details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.DeleteFraudster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DeleteFraudster" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFraudsterResult deleteFraudster(DeleteFraudsterRequest deleteFraudsterRequest);

    /**
     * <p>
     * Deletes the specified speaker from Voice ID.
     * </p>
     * 
     * @param deleteSpeakerRequest
     * @return Result of the DeleteSpeaker operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws ConflictException
     *         The request failed due to a conflict. Check the <code>ConflictType</code> and error message for more
     *         details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.DeleteSpeaker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DeleteSpeaker" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSpeakerResult deleteSpeaker(DeleteSpeakerRequest deleteSpeakerRequest);

    /**
     * <p>
     * Describes the specified domain.
     * </p>
     * 
     * @param describeDomainRequest
     * @return Result of the DescribeDomain operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.DescribeDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DescribeDomain" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDomainResult describeDomain(DescribeDomainRequest describeDomainRequest);

    /**
     * <p>
     * Describes the specified fraudster.
     * </p>
     * 
     * @param describeFraudsterRequest
     * @return Result of the DescribeFraudster operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.DescribeFraudster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DescribeFraudster" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeFraudsterResult describeFraudster(DescribeFraudsterRequest describeFraudsterRequest);

    /**
     * <p>
     * Describes the specified fraudster registration job.
     * </p>
     * 
     * @param describeFraudsterRegistrationJobRequest
     * @return Result of the DescribeFraudsterRegistrationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.DescribeFraudsterRegistrationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DescribeFraudsterRegistrationJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeFraudsterRegistrationJobResult describeFraudsterRegistrationJob(DescribeFraudsterRegistrationJobRequest describeFraudsterRegistrationJobRequest);

    /**
     * <p>
     * Describes the specified speaker.
     * </p>
     * 
     * @param describeSpeakerRequest
     * @return Result of the DescribeSpeaker operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.DescribeSpeaker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DescribeSpeaker" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeSpeakerResult describeSpeaker(DescribeSpeakerRequest describeSpeakerRequest);

    /**
     * <p>
     * Describes the specified speaker enrollment job.
     * </p>
     * 
     * @param describeSpeakerEnrollmentJobRequest
     * @return Result of the DescribeSpeakerEnrollmentJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.DescribeSpeakerEnrollmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DescribeSpeakerEnrollmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSpeakerEnrollmentJobResult describeSpeakerEnrollmentJob(DescribeSpeakerEnrollmentJobRequest describeSpeakerEnrollmentJobRequest);

    /**
     * <p>
     * Evaluates a specified session based on audio data accumulated during a streaming Amazon Connect Voice ID call.
     * </p>
     * 
     * @param evaluateSessionRequest
     * @return Result of the EvaluateSession operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws ConflictException
     *         The request failed due to a conflict. Check the <code>ConflictType</code> and error message for more
     *         details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.EvaluateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/EvaluateSession" target="_top">AWS API
     *      Documentation</a>
     */
    EvaluateSessionResult evaluateSession(EvaluateSessionRequest evaluateSessionRequest);

    /**
     * <p>
     * Lists all the domains in the Amazon Web Services account.
     * </p>
     * 
     * @param listDomainsRequest
     * @return Result of the ListDomains operation returned by the service.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    ListDomainsResult listDomains(ListDomainsRequest listDomainsRequest);

    /**
     * <p>
     * Lists all the fraudster registration jobs in the domain with the given <code>JobStatus</code>. If
     * <code>JobStatus</code> is not provided, this lists all fraudster registration jobs in the given domain.
     * </p>
     * 
     * @param listFraudsterRegistrationJobsRequest
     * @return Result of the ListFraudsterRegistrationJobs operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.ListFraudsterRegistrationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/ListFraudsterRegistrationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListFraudsterRegistrationJobsResult listFraudsterRegistrationJobs(ListFraudsterRegistrationJobsRequest listFraudsterRegistrationJobsRequest);

    /**
     * <p>
     * Lists all the speaker enrollment jobs in the domain with the specified <code>JobStatus</code>. If
     * <code>JobStatus</code> is not provided, this lists all jobs with all possible speaker enrollment job statuses.
     * </p>
     * 
     * @param listSpeakerEnrollmentJobsRequest
     * @return Result of the ListSpeakerEnrollmentJobs operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.ListSpeakerEnrollmentJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/ListSpeakerEnrollmentJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListSpeakerEnrollmentJobsResult listSpeakerEnrollmentJobs(ListSpeakerEnrollmentJobsRequest listSpeakerEnrollmentJobsRequest);

    /**
     * <p>
     * Lists all speakers in a specified domain.
     * </p>
     * 
     * @param listSpeakersRequest
     * @return Result of the ListSpeakers operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.ListSpeakers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/ListSpeakers" target="_top">AWS API
     *      Documentation</a>
     */
    ListSpeakersResult listSpeakers(ListSpeakersRequest listSpeakersRequest);

    /**
     * <p>
     * Lists all tags associated with a specified Voice ID resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Opts out a speaker from Voice ID. A speaker can be opted out regardless of whether or not they already exist in
     * Voice ID. If they don't yet exist, a new speaker is created in an opted out state. If they already exist, their
     * existing status is overridden and they are opted out. Enrollment and evaluation authentication requests are
     * rejected for opted out speakers, and opted out speakers have no voice embeddings stored in Voice ID.
     * </p>
     * 
     * @param optOutSpeakerRequest
     * @return Result of the OptOutSpeaker operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request exceeded the service quota. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#voiceid-quotas"
     *         >Voice ID Service Quotas</a> and try your request again.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws ConflictException
     *         The request failed due to a conflict. Check the <code>ConflictType</code> and error message for more
     *         details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.OptOutSpeaker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/OptOutSpeaker" target="_top">AWS API
     *      Documentation</a>
     */
    OptOutSpeakerResult optOutSpeaker(OptOutSpeakerRequest optOutSpeakerRequest);

    /**
     * <p>
     * Starts a new batch fraudster registration job using provided details.
     * </p>
     * 
     * @param startFraudsterRegistrationJobRequest
     * @return Result of the StartFraudsterRegistrationJob operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request exceeded the service quota. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#voiceid-quotas"
     *         >Voice ID Service Quotas</a> and try your request again.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws ConflictException
     *         The request failed due to a conflict. Check the <code>ConflictType</code> and error message for more
     *         details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.StartFraudsterRegistrationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/StartFraudsterRegistrationJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartFraudsterRegistrationJobResult startFraudsterRegistrationJob(StartFraudsterRegistrationJobRequest startFraudsterRegistrationJobRequest);

    /**
     * <p>
     * Starts a new batch speaker enrollment job using specified details.
     * </p>
     * 
     * @param startSpeakerEnrollmentJobRequest
     * @return Result of the StartSpeakerEnrollmentJob operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request exceeded the service quota. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#voiceid-quotas"
     *         >Voice ID Service Quotas</a> and try your request again.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws ConflictException
     *         The request failed due to a conflict. Check the <code>ConflictType</code> and error message for more
     *         details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.StartSpeakerEnrollmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/StartSpeakerEnrollmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartSpeakerEnrollmentJobResult startSpeakerEnrollmentJob(StartSpeakerEnrollmentJobRequest startSpeakerEnrollmentJobRequest);

    /**
     * <p>
     * Tags a Voice ID resource with the provided list of tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws ConflictException
     *         The request failed due to a conflict. Check the <code>ConflictType</code> and error message for more
     *         details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes specified tags from a specified Amazon Connect Voice ID resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws ConflictException
     *         The request failed due to a conflict. Check the <code>ConflictType</code> and error message for more
     *         details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the specified domain. This API has clobber behavior, and clears and replaces all attributes. If an
     * optional field, such as 'Description' is not provided, it is removed from the domain.
     * </p>
     * 
     * @param updateDomainRequest
     * @return Result of the UpdateDomain operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws ConflictException
     *         The request failed due to a conflict. Check the <code>ConflictType</code> and error message for more
     *         details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.UpdateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/UpdateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateDomainResult updateDomain(UpdateDomainRequest updateDomainRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
