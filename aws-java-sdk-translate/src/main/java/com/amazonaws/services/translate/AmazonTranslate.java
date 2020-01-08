/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.translate;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.translate.model.*;

/**
 * Interface for accessing Amazon Translate.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.translate.AbstractAmazonTranslate} instead.
 * </p>
 * <p>
 * <p>
 * Provides translation between one source language and another of the same set of languages.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonTranslate {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "translate";

    /**
     * <p>
     * A synchronous action that deletes a custom terminology.
     * </p>
     * 
     * @param deleteTerminologyRequest
     * @return Result of the DeleteTerminology operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are looking for has not been found. Review the resource you're looking for and see if a
     *         different resource will accomplish your needs before retrying the revised request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonTranslate.DeleteTerminology
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/DeleteTerminology" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteTerminologyResult deleteTerminology(DeleteTerminologyRequest deleteTerminologyRequest);

    /**
     * <p>
     * Gets the properties associated with an asycnhronous batch translation job including name, ID, status, source and
     * target languages, input/output S3 buckets, and so on.
     * </p>
     * 
     * @param describeTextTranslationJobRequest
     * @return Result of the DescribeTextTranslationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are looking for has not been found. Review the resource you're looking for and see if a
     *         different resource will accomplish your needs before retrying the revised request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonTranslate.DescribeTextTranslationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/DescribeTextTranslationJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTextTranslationJobResult describeTextTranslationJob(DescribeTextTranslationJobRequest describeTextTranslationJobRequest);

    /**
     * <p>
     * Retrieves a custom terminology.
     * </p>
     * 
     * @param getTerminologyRequest
     * @return Result of the GetTerminology operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are looking for has not been found. Review the resource you're looking for and see if a
     *         different resource will accomplish your needs before retrying the revised request.
     * @throws InvalidParameterValueException
     *         The value of the parameter is invalid. Review the value of the parameter you are using to correct it, and
     *         then retry your operation.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonTranslate.GetTerminology
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/GetTerminology" target="_top">AWS API
     *      Documentation</a>
     */
    GetTerminologyResult getTerminology(GetTerminologyRequest getTerminologyRequest);

    /**
     * <p>
     * Creates or updates a custom terminology, depending on whether or not one already exists for the given terminology
     * name. Importing a terminology with the same name as an existing one will merge the terminologies based on the
     * chosen merge strategy. Currently, the only supported merge strategy is OVERWRITE, and so the imported terminology
     * will overwrite an existing terminology of the same name.
     * </p>
     * <p>
     * If you import a terminology that overwrites an existing one, the new terminology take up to 10 minutes to fully
     * propagate and be available for use in a translation due to cache policies with the DataPlane service that
     * performs the translations.
     * </p>
     * 
     * @param importTerminologyRequest
     * @return Result of the ImportTerminology operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value of the parameter is invalid. Review the value of the parameter you are using to correct it, and
     *         then retry your operation.
     * @throws LimitExceededException
     *         The specified limit has been exceeded. Review your request and retry it with a quantity below the stated
     *         limit.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonTranslate.ImportTerminology
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/ImportTerminology" target="_top">AWS
     *      API Documentation</a>
     */
    ImportTerminologyResult importTerminology(ImportTerminologyRequest importTerminologyRequest);

    /**
     * <p>
     * Provides a list of custom terminologies associated with your account.
     * </p>
     * 
     * @param listTerminologiesRequest
     * @return Result of the ListTerminologies operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value of the parameter is invalid. Review the value of the parameter you are using to correct it, and
     *         then retry your operation.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonTranslate.ListTerminologies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/ListTerminologies" target="_top">AWS
     *      API Documentation</a>
     */
    ListTerminologiesResult listTerminologies(ListTerminologiesRequest listTerminologiesRequest);

    /**
     * <p>
     * Gets a list of the batch translation jobs that you have submitted.
     * </p>
     * 
     * @param listTextTranslationJobsRequest
     * @return Result of the ListTextTranslationJobs operation returned by the service.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again.
     * @throws InvalidFilterException
     *         The filter specified for the operation is invalid. Specify a different filter.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonTranslate.ListTextTranslationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/ListTextTranslationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListTextTranslationJobsResult listTextTranslationJobs(ListTextTranslationJobsRequest listTextTranslationJobsRequest);

    /**
     * <p>
     * Starts an asynchronous batch translation job. Batch translation jobs can be used to translate large volumes of
     * text across multiple documents at once. For more information, see <a>async</a>.
     * </p>
     * <p>
     * Batch translation jobs can be described with the <a>DescribeTextTranslationJob</a> operation, listed with the
     * <a>ListTextTranslationJobs</a> operation, and stopped with the <a>StopTextTranslationJob</a> operation.
     * </p>
     * <note>
     * <p>
     * Amazon Translate does not support batch translation of multiple source languages at once.
     * </p>
     * </note>
     * 
     * @param startTextTranslationJobRequest
     * @return Result of the StartTextTranslationJob operation returned by the service.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again.
     * @throws UnsupportedLanguagePairException
     *         Amazon Translate does not support translation from the language of the source text into the requested
     *         target language. For more information, see <a>how-to-error-msg</a>.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws ResourceNotFoundException
     *         The resource you are looking for has not been found. Review the resource you're looking for and see if a
     *         different resource will accomplish your needs before retrying the revised request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonTranslate.StartTextTranslationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/StartTextTranslationJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartTextTranslationJobResult startTextTranslationJob(StartTextTranslationJobRequest startTextTranslationJobRequest);

    /**
     * <p>
     * Stops an asynchronous batch translation job that is in progress.
     * </p>
     * <p>
     * If the job's state is <code>IN_PROGRESS</code>, the job will be marked for termination and put into the
     * <code>STOP_REQUESTED</code> state. If the job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state. Otherwise, the job is put into the <code>STOPPED</code> state.
     * </p>
     * <p>
     * Asynchronous batch translation jobs are started with the <a>StartTextTranslationJob</a> operation. You can use
     * the <a>DescribeTextTranslationJob</a> or <a>ListTextTranslationJobs</a> operations to get a batch translation
     * job's <code>JobId</code>.
     * </p>
     * 
     * @param stopTextTranslationJobRequest
     * @return Result of the StopTextTranslationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are looking for has not been found. Review the resource you're looking for and see if a
     *         different resource will accomplish your needs before retrying the revised request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonTranslate.StopTextTranslationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/StopTextTranslationJob"
     *      target="_top">AWS API Documentation</a>
     */
    StopTextTranslationJobResult stopTextTranslationJob(StopTextTranslationJobRequest stopTextTranslationJobRequest);

    /**
     * <p>
     * Translates input text from the source language to the target language. For a list of available languages and
     * language codes, see <a>what-is-languages</a>.
     * </p>
     * 
     * @param translateTextRequest
     * @return Result of the TranslateText operation returned by the service.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws TextSizeLimitExceededException
     *         The size of the text you submitted exceeds the size limit. Reduce the size of the text or use a smaller
     *         document and then retry your request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again.
     * @throws UnsupportedLanguagePairException
     *         Amazon Translate does not support translation from the language of the source text into the requested
     *         target language. For more information, see <a>how-to-error-msg</a>.
     * @throws DetectedLanguageLowConfidenceException
     *         The confidence that Amazon Comprehend accurately detected the source language is low. If a low confidence
     *         level is acceptable for your application, you can use the language in the exception to call Amazon
     *         Translate again. For more information, see the <a
     *         href="https://docs.aws.amazon.com/comprehend/latest/dg/API_DetectDominantLanguage.html"
     *         >DetectDominantLanguage</a> operation in the <i>Amazon Comprehend Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The resource you are looking for has not been found. Review the resource you're looking for and see if a
     *         different resource will accomplish your needs before retrying the revised request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ServiceUnavailableException
     *         The Amazon Translate service is temporarily unavailable. Please wait a bit and then retry your request.
     * @sample AmazonTranslate.TranslateText
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/TranslateText" target="_top">AWS API
     *      Documentation</a>
     */
    TranslateTextResult translateText(TranslateTextRequest translateTextRequest);

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
