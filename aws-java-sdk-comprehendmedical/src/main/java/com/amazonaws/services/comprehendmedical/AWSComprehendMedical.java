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
package com.amazonaws.services.comprehendmedical;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.comprehendmedical.model.*;

/**
 * Interface for accessing ComprehendMedical.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.comprehendmedical.AbstractAWSComprehendMedical} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Comprehend Medical extracts structured information from unstructured clinical text. Use these actions to gain
 * insight in your documents.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSComprehendMedical {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "comprehendmedical";

    /**
     * <p>
     * Gets the properties associated with a medical entities detection job. Use this operation to get the status of a
     * detection job.
     * </p>
     * 
     * @param describeEntitiesDetectionV2JobRequest
     * @return Result of the DescribeEntitiesDetectionV2Job operation returned by the service.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again. Contact customer support for more information about a service limit increase.
     * @throws ResourceNotFoundException
     *         The resource identified by the specified Amazon Resource Name (ARN) was not found. Check the ARN and try
     *         your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AWSComprehendMedical.DescribeEntitiesDetectionV2Job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DescribeEntitiesDetectionV2Job"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEntitiesDetectionV2JobResult describeEntitiesDetectionV2Job(DescribeEntitiesDetectionV2JobRequest describeEntitiesDetectionV2JobRequest);

    /**
     * <p>
     * Gets the properties associated with a protected health information (PHI) detection job. Use this operation to get
     * the status of a detection job.
     * </p>
     * 
     * @param describePHIDetectionJobRequest
     * @return Result of the DescribePHIDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again. Contact customer support for more information about a service limit increase.
     * @throws ResourceNotFoundException
     *         The resource identified by the specified Amazon Resource Name (ARN) was not found. Check the ARN and try
     *         your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AWSComprehendMedical.DescribePHIDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DescribePHIDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePHIDetectionJobResult describePHIDetectionJob(DescribePHIDetectionJobRequest describePHIDetectionJobRequest);

    /**
     * <p>
     * The <code>DetectEntities</code> operation is deprecated. You should use the <a>DetectEntitiesV2</a> operation
     * instead.
     * </p>
     * <p>
     * Inspects the clinical text for a variety of medical entities and returns specific information about them such as
     * entity category, location, and confidence score on that information .
     * </p>
     * 
     * @param detectEntitiesRequest
     * @return Result of the DetectEntities operation returned by the service.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ServiceUnavailableException
     *         The Amazon Comprehend Medical service is temporarily unavailable. Please wait and then retry your
     *         request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again. Contact customer support for more information about a service limit increase.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws InvalidEncodingException
     *         The input text was not in valid UTF-8 character encoding. Check your text then retry your request.
     * @throws TextSizeLimitExceededException
     *         The size of the text you submitted exceeds the size limit. Reduce the size of the text or use a smaller
     *         document and then retry your request.
     * @sample AWSComprehendMedical.DetectEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DetectEntities"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    DetectEntitiesResult detectEntities(DetectEntitiesRequest detectEntitiesRequest);

    /**
     * <p>
     * Inspects the clinical text for a variety of medical entities and returns specific information about them such as
     * entity category, location, and confidence score on that information. Amazon Comprehend Medical only detects
     * medical entities in English language texts.
     * </p>
     * <p>
     * The <code>DetectEntitiesV2</code> operation replaces the <a>DetectEntities</a> operation. This new action uses a
     * different model for determining the entities in your medical text and changes the way that some entities are
     * returned in the output. You should use the <code>DetectEntitiesV2</code> operation in all new applications.
     * </p>
     * <p>
     * The <code>DetectEntitiesV2</code> operation returns the <code>Acuity</code> and <code>Direction</code> entities
     * as attributes instead of types.
     * </p>
     * 
     * @param detectEntitiesV2Request
     * @return Result of the DetectEntitiesV2 operation returned by the service.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ServiceUnavailableException
     *         The Amazon Comprehend Medical service is temporarily unavailable. Please wait and then retry your
     *         request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again. Contact customer support for more information about a service limit increase.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws InvalidEncodingException
     *         The input text was not in valid UTF-8 character encoding. Check your text then retry your request.
     * @throws TextSizeLimitExceededException
     *         The size of the text you submitted exceeds the size limit. Reduce the size of the text or use a smaller
     *         document and then retry your request.
     * @sample AWSComprehendMedical.DetectEntitiesV2
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DetectEntitiesV2"
     *      target="_top">AWS API Documentation</a>
     */
    DetectEntitiesV2Result detectEntitiesV2(DetectEntitiesV2Request detectEntitiesV2Request);

    /**
     * <p>
     * Inspects the clinical text for protected health information (PHI) entities and returns the entity category,
     * location, and confidence score for each entity. Amazon Comprehend Medical only detects entities in English
     * language texts.
     * </p>
     * 
     * @param detectPHIRequest
     * @return Result of the DetectPHI operation returned by the service.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ServiceUnavailableException
     *         The Amazon Comprehend Medical service is temporarily unavailable. Please wait and then retry your
     *         request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again. Contact customer support for more information about a service limit increase.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws InvalidEncodingException
     *         The input text was not in valid UTF-8 character encoding. Check your text then retry your request.
     * @throws TextSizeLimitExceededException
     *         The size of the text you submitted exceeds the size limit. Reduce the size of the text or use a smaller
     *         document and then retry your request.
     * @sample AWSComprehendMedical.DetectPHI
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DetectPHI" target="_top">AWS
     *      API Documentation</a>
     */
    DetectPHIResult detectPHI(DetectPHIRequest detectPHIRequest);

    /**
     * <p>
     * InferICD10CM detects medical conditions as entities listed in a patient record and links those entities to
     * normalized concept identifiers in the ICD-10-CM knowledge base from the Centers for Disease Control. Amazon
     * Comprehend Medical only detects medical entities in English language texts.
     * </p>
     * 
     * @param inferICD10CMRequest
     * @return Result of the InferICD10CM operation returned by the service.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ServiceUnavailableException
     *         The Amazon Comprehend Medical service is temporarily unavailable. Please wait and then retry your
     *         request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again. Contact customer support for more information about a service limit increase.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws InvalidEncodingException
     *         The input text was not in valid UTF-8 character encoding. Check your text then retry your request.
     * @throws TextSizeLimitExceededException
     *         The size of the text you submitted exceeds the size limit. Reduce the size of the text or use a smaller
     *         document and then retry your request.
     * @sample AWSComprehendMedical.InferICD10CM
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/InferICD10CM" target="_top">AWS
     *      API Documentation</a>
     */
    InferICD10CMResult inferICD10CM(InferICD10CMRequest inferICD10CMRequest);

    /**
     * <p>
     * InferRxNorm detects medications as entities listed in a patient record and links to the normalized concept
     * identifiers in the RxNorm database from the National Library of Medicine. Amazon Comprehend Medical only detects
     * medical entities in English language texts.
     * </p>
     * 
     * @param inferRxNormRequest
     * @return Result of the InferRxNorm operation returned by the service.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ServiceUnavailableException
     *         The Amazon Comprehend Medical service is temporarily unavailable. Please wait and then retry your
     *         request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again. Contact customer support for more information about a service limit increase.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws InvalidEncodingException
     *         The input text was not in valid UTF-8 character encoding. Check your text then retry your request.
     * @throws TextSizeLimitExceededException
     *         The size of the text you submitted exceeds the size limit. Reduce the size of the text or use a smaller
     *         document and then retry your request.
     * @sample AWSComprehendMedical.InferRxNorm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/InferRxNorm" target="_top">AWS
     *      API Documentation</a>
     */
    InferRxNormResult inferRxNorm(InferRxNormRequest inferRxNormRequest);

    /**
     * <p>
     * Gets a list of medical entity detection jobs that you have submitted.
     * </p>
     * 
     * @param listEntitiesDetectionV2JobsRequest
     * @return Result of the ListEntitiesDetectionV2Jobs operation returned by the service.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws ValidationException
     *         The filter that you specified for the operation is invalid. Check the filter values that you entered and
     *         try your request again.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again. Contact customer support for more information about a service limit increase.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AWSComprehendMedical.ListEntitiesDetectionV2Jobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/ListEntitiesDetectionV2Jobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListEntitiesDetectionV2JobsResult listEntitiesDetectionV2Jobs(ListEntitiesDetectionV2JobsRequest listEntitiesDetectionV2JobsRequest);

    /**
     * <p>
     * Gets a list of protected health information (PHI) detection jobs that you have submitted.
     * </p>
     * 
     * @param listPHIDetectionJobsRequest
     * @return Result of the ListPHIDetectionJobs operation returned by the service.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws ValidationException
     *         The filter that you specified for the operation is invalid. Check the filter values that you entered and
     *         try your request again.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again. Contact customer support for more information about a service limit increase.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AWSComprehendMedical.ListPHIDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/ListPHIDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListPHIDetectionJobsResult listPHIDetectionJobs(ListPHIDetectionJobsRequest listPHIDetectionJobsRequest);

    /**
     * <p>
     * Starts an asynchronous medical entity detection job for a collection of documents. Use the
     * <code>DescribeEntitiesDetectionV2Job</code> operation to track the status of a job.
     * </p>
     * 
     * @param startEntitiesDetectionV2JobRequest
     * @return Result of the StartEntitiesDetectionV2Job operation returned by the service.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again. Contact customer support for more information about a service limit increase.
     * @throws ResourceNotFoundException
     *         The resource identified by the specified Amazon Resource Name (ARN) was not found. Check the ARN and try
     *         your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AWSComprehendMedical.StartEntitiesDetectionV2Job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/StartEntitiesDetectionV2Job"
     *      target="_top">AWS API Documentation</a>
     */
    StartEntitiesDetectionV2JobResult startEntitiesDetectionV2Job(StartEntitiesDetectionV2JobRequest startEntitiesDetectionV2JobRequest);

    /**
     * <p>
     * Starts an asynchronous job to detect protected health information (PHI). Use the
     * <code>DescribePHIDetectionJob</code> operation to track the status of a job.
     * </p>
     * 
     * @param startPHIDetectionJobRequest
     * @return Result of the StartPHIDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again. Contact customer support for more information about a service limit increase.
     * @throws ResourceNotFoundException
     *         The resource identified by the specified Amazon Resource Name (ARN) was not found. Check the ARN and try
     *         your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AWSComprehendMedical.StartPHIDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/StartPHIDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartPHIDetectionJobResult startPHIDetectionJob(StartPHIDetectionJobRequest startPHIDetectionJobRequest);

    /**
     * <p>
     * Stops a medical entities detection job in progress.
     * </p>
     * 
     * @param stopEntitiesDetectionV2JobRequest
     * @return Result of the StopEntitiesDetectionV2Job operation returned by the service.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws ResourceNotFoundException
     *         The resource identified by the specified Amazon Resource Name (ARN) was not found. Check the ARN and try
     *         your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AWSComprehendMedical.StopEntitiesDetectionV2Job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/StopEntitiesDetectionV2Job"
     *      target="_top">AWS API Documentation</a>
     */
    StopEntitiesDetectionV2JobResult stopEntitiesDetectionV2Job(StopEntitiesDetectionV2JobRequest stopEntitiesDetectionV2JobRequest);

    /**
     * <p>
     * Stops a protected health information (PHI) detection job in progress.
     * </p>
     * 
     * @param stopPHIDetectionJobRequest
     * @return Result of the StopPHIDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws ResourceNotFoundException
     *         The resource identified by the specified Amazon Resource Name (ARN) was not found. Check the ARN and try
     *         your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AWSComprehendMedical.StopPHIDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/StopPHIDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    StopPHIDetectionJobResult stopPHIDetectionJob(StopPHIDetectionJobRequest stopPHIDetectionJobRequest);

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
