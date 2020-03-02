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

import com.amazonaws.services.comprehendmedical.model.*;

/**
 * Interface for accessing ComprehendMedical asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.comprehendmedical.AbstractAWSComprehendMedicalAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Comprehend Medical extracts structured information from unstructured clinical text. Use these actions to gain
 * insight in your documents.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSComprehendMedicalAsync extends AWSComprehendMedical {

    /**
     * <p>
     * Gets the properties associated with a medical entities detection job. Use this operation to get the status of a
     * detection job.
     * </p>
     * 
     * @param describeEntitiesDetectionV2JobRequest
     * @return A Java Future containing the result of the DescribeEntitiesDetectionV2Job operation returned by the
     *         service.
     * @sample AWSComprehendMedicalAsync.DescribeEntitiesDetectionV2Job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DescribeEntitiesDetectionV2Job"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEntitiesDetectionV2JobResult> describeEntitiesDetectionV2JobAsync(
            DescribeEntitiesDetectionV2JobRequest describeEntitiesDetectionV2JobRequest);

    /**
     * <p>
     * Gets the properties associated with a medical entities detection job. Use this operation to get the status of a
     * detection job.
     * </p>
     * 
     * @param describeEntitiesDetectionV2JobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEntitiesDetectionV2Job operation returned by the
     *         service.
     * @sample AWSComprehendMedicalAsyncHandler.DescribeEntitiesDetectionV2Job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DescribeEntitiesDetectionV2Job"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEntitiesDetectionV2JobResult> describeEntitiesDetectionV2JobAsync(
            DescribeEntitiesDetectionV2JobRequest describeEntitiesDetectionV2JobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEntitiesDetectionV2JobRequest, DescribeEntitiesDetectionV2JobResult> asyncHandler);

    /**
     * <p>
     * Gets the properties associated with a protected health information (PHI) detection job. Use this operation to get
     * the status of a detection job.
     * </p>
     * 
     * @param describePHIDetectionJobRequest
     * @return A Java Future containing the result of the DescribePHIDetectionJob operation returned by the service.
     * @sample AWSComprehendMedicalAsync.DescribePHIDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DescribePHIDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePHIDetectionJobResult> describePHIDetectionJobAsync(DescribePHIDetectionJobRequest describePHIDetectionJobRequest);

    /**
     * <p>
     * Gets the properties associated with a protected health information (PHI) detection job. Use this operation to get
     * the status of a detection job.
     * </p>
     * 
     * @param describePHIDetectionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePHIDetectionJob operation returned by the service.
     * @sample AWSComprehendMedicalAsyncHandler.DescribePHIDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DescribePHIDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePHIDetectionJobResult> describePHIDetectionJobAsync(DescribePHIDetectionJobRequest describePHIDetectionJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePHIDetectionJobRequest, DescribePHIDetectionJobResult> asyncHandler);

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
     * @return A Java Future containing the result of the DetectEntities operation returned by the service.
     * @sample AWSComprehendMedicalAsync.DetectEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DetectEntities"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<DetectEntitiesResult> detectEntitiesAsync(DetectEntitiesRequest detectEntitiesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectEntities operation returned by the service.
     * @sample AWSComprehendMedicalAsyncHandler.DetectEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DetectEntities"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<DetectEntitiesResult> detectEntitiesAsync(DetectEntitiesRequest detectEntitiesRequest,
            com.amazonaws.handlers.AsyncHandler<DetectEntitiesRequest, DetectEntitiesResult> asyncHandler);

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
     * @return A Java Future containing the result of the DetectEntitiesV2 operation returned by the service.
     * @sample AWSComprehendMedicalAsync.DetectEntitiesV2
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DetectEntitiesV2"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetectEntitiesV2Result> detectEntitiesV2Async(DetectEntitiesV2Request detectEntitiesV2Request);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectEntitiesV2 operation returned by the service.
     * @sample AWSComprehendMedicalAsyncHandler.DetectEntitiesV2
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DetectEntitiesV2"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetectEntitiesV2Result> detectEntitiesV2Async(DetectEntitiesV2Request detectEntitiesV2Request,
            com.amazonaws.handlers.AsyncHandler<DetectEntitiesV2Request, DetectEntitiesV2Result> asyncHandler);

    /**
     * <p>
     * Inspects the clinical text for protected health information (PHI) entities and returns the entity category,
     * location, and confidence score for each entity. Amazon Comprehend Medical only detects entities in English
     * language texts.
     * </p>
     * 
     * @param detectPHIRequest
     * @return A Java Future containing the result of the DetectPHI operation returned by the service.
     * @sample AWSComprehendMedicalAsync.DetectPHI
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DetectPHI" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DetectPHIResult> detectPHIAsync(DetectPHIRequest detectPHIRequest);

    /**
     * <p>
     * Inspects the clinical text for protected health information (PHI) entities and returns the entity category,
     * location, and confidence score for each entity. Amazon Comprehend Medical only detects entities in English
     * language texts.
     * </p>
     * 
     * @param detectPHIRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectPHI operation returned by the service.
     * @sample AWSComprehendMedicalAsyncHandler.DetectPHI
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DetectPHI" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DetectPHIResult> detectPHIAsync(DetectPHIRequest detectPHIRequest,
            com.amazonaws.handlers.AsyncHandler<DetectPHIRequest, DetectPHIResult> asyncHandler);

    /**
     * <p>
     * InferICD10CM detects medical conditions as entities listed in a patient record and links those entities to
     * normalized concept identifiers in the ICD-10-CM knowledge base from the Centers for Disease Control. Amazon
     * Comprehend Medical only detects medical entities in English language texts.
     * </p>
     * 
     * @param inferICD10CMRequest
     * @return A Java Future containing the result of the InferICD10CM operation returned by the service.
     * @sample AWSComprehendMedicalAsync.InferICD10CM
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/InferICD10CM" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<InferICD10CMResult> inferICD10CMAsync(InferICD10CMRequest inferICD10CMRequest);

    /**
     * <p>
     * InferICD10CM detects medical conditions as entities listed in a patient record and links those entities to
     * normalized concept identifiers in the ICD-10-CM knowledge base from the Centers for Disease Control. Amazon
     * Comprehend Medical only detects medical entities in English language texts.
     * </p>
     * 
     * @param inferICD10CMRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InferICD10CM operation returned by the service.
     * @sample AWSComprehendMedicalAsyncHandler.InferICD10CM
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/InferICD10CM" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<InferICD10CMResult> inferICD10CMAsync(InferICD10CMRequest inferICD10CMRequest,
            com.amazonaws.handlers.AsyncHandler<InferICD10CMRequest, InferICD10CMResult> asyncHandler);

    /**
     * <p>
     * InferRxNorm detects medications as entities listed in a patient record and links to the normalized concept
     * identifiers in the RxNorm database from the National Library of Medicine. Amazon Comprehend Medical only detects
     * medical entities in English language texts.
     * </p>
     * 
     * @param inferRxNormRequest
     * @return A Java Future containing the result of the InferRxNorm operation returned by the service.
     * @sample AWSComprehendMedicalAsync.InferRxNorm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/InferRxNorm" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<InferRxNormResult> inferRxNormAsync(InferRxNormRequest inferRxNormRequest);

    /**
     * <p>
     * InferRxNorm detects medications as entities listed in a patient record and links to the normalized concept
     * identifiers in the RxNorm database from the National Library of Medicine. Amazon Comprehend Medical only detects
     * medical entities in English language texts.
     * </p>
     * 
     * @param inferRxNormRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InferRxNorm operation returned by the service.
     * @sample AWSComprehendMedicalAsyncHandler.InferRxNorm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/InferRxNorm" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<InferRxNormResult> inferRxNormAsync(InferRxNormRequest inferRxNormRequest,
            com.amazonaws.handlers.AsyncHandler<InferRxNormRequest, InferRxNormResult> asyncHandler);

    /**
     * <p>
     * Gets a list of medical entity detection jobs that you have submitted.
     * </p>
     * 
     * @param listEntitiesDetectionV2JobsRequest
     * @return A Java Future containing the result of the ListEntitiesDetectionV2Jobs operation returned by the service.
     * @sample AWSComprehendMedicalAsync.ListEntitiesDetectionV2Jobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/ListEntitiesDetectionV2Jobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEntitiesDetectionV2JobsResult> listEntitiesDetectionV2JobsAsync(
            ListEntitiesDetectionV2JobsRequest listEntitiesDetectionV2JobsRequest);

    /**
     * <p>
     * Gets a list of medical entity detection jobs that you have submitted.
     * </p>
     * 
     * @param listEntitiesDetectionV2JobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEntitiesDetectionV2Jobs operation returned by the service.
     * @sample AWSComprehendMedicalAsyncHandler.ListEntitiesDetectionV2Jobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/ListEntitiesDetectionV2Jobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEntitiesDetectionV2JobsResult> listEntitiesDetectionV2JobsAsync(
            ListEntitiesDetectionV2JobsRequest listEntitiesDetectionV2JobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEntitiesDetectionV2JobsRequest, ListEntitiesDetectionV2JobsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of protected health information (PHI) detection jobs that you have submitted.
     * </p>
     * 
     * @param listPHIDetectionJobsRequest
     * @return A Java Future containing the result of the ListPHIDetectionJobs operation returned by the service.
     * @sample AWSComprehendMedicalAsync.ListPHIDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/ListPHIDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPHIDetectionJobsResult> listPHIDetectionJobsAsync(ListPHIDetectionJobsRequest listPHIDetectionJobsRequest);

    /**
     * <p>
     * Gets a list of protected health information (PHI) detection jobs that you have submitted.
     * </p>
     * 
     * @param listPHIDetectionJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPHIDetectionJobs operation returned by the service.
     * @sample AWSComprehendMedicalAsyncHandler.ListPHIDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/ListPHIDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPHIDetectionJobsResult> listPHIDetectionJobsAsync(ListPHIDetectionJobsRequest listPHIDetectionJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPHIDetectionJobsRequest, ListPHIDetectionJobsResult> asyncHandler);

    /**
     * <p>
     * Starts an asynchronous medical entity detection job for a collection of documents. Use the
     * <code>DescribeEntitiesDetectionV2Job</code> operation to track the status of a job.
     * </p>
     * 
     * @param startEntitiesDetectionV2JobRequest
     * @return A Java Future containing the result of the StartEntitiesDetectionV2Job operation returned by the service.
     * @sample AWSComprehendMedicalAsync.StartEntitiesDetectionV2Job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/StartEntitiesDetectionV2Job"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartEntitiesDetectionV2JobResult> startEntitiesDetectionV2JobAsync(
            StartEntitiesDetectionV2JobRequest startEntitiesDetectionV2JobRequest);

    /**
     * <p>
     * Starts an asynchronous medical entity detection job for a collection of documents. Use the
     * <code>DescribeEntitiesDetectionV2Job</code> operation to track the status of a job.
     * </p>
     * 
     * @param startEntitiesDetectionV2JobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartEntitiesDetectionV2Job operation returned by the service.
     * @sample AWSComprehendMedicalAsyncHandler.StartEntitiesDetectionV2Job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/StartEntitiesDetectionV2Job"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartEntitiesDetectionV2JobResult> startEntitiesDetectionV2JobAsync(
            StartEntitiesDetectionV2JobRequest startEntitiesDetectionV2JobRequest,
            com.amazonaws.handlers.AsyncHandler<StartEntitiesDetectionV2JobRequest, StartEntitiesDetectionV2JobResult> asyncHandler);

    /**
     * <p>
     * Starts an asynchronous job to detect protected health information (PHI). Use the
     * <code>DescribePHIDetectionJob</code> operation to track the status of a job.
     * </p>
     * 
     * @param startPHIDetectionJobRequest
     * @return A Java Future containing the result of the StartPHIDetectionJob operation returned by the service.
     * @sample AWSComprehendMedicalAsync.StartPHIDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/StartPHIDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartPHIDetectionJobResult> startPHIDetectionJobAsync(StartPHIDetectionJobRequest startPHIDetectionJobRequest);

    /**
     * <p>
     * Starts an asynchronous job to detect protected health information (PHI). Use the
     * <code>DescribePHIDetectionJob</code> operation to track the status of a job.
     * </p>
     * 
     * @param startPHIDetectionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartPHIDetectionJob operation returned by the service.
     * @sample AWSComprehendMedicalAsyncHandler.StartPHIDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/StartPHIDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartPHIDetectionJobResult> startPHIDetectionJobAsync(StartPHIDetectionJobRequest startPHIDetectionJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartPHIDetectionJobRequest, StartPHIDetectionJobResult> asyncHandler);

    /**
     * <p>
     * Stops a medical entities detection job in progress.
     * </p>
     * 
     * @param stopEntitiesDetectionV2JobRequest
     * @return A Java Future containing the result of the StopEntitiesDetectionV2Job operation returned by the service.
     * @sample AWSComprehendMedicalAsync.StopEntitiesDetectionV2Job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/StopEntitiesDetectionV2Job"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopEntitiesDetectionV2JobResult> stopEntitiesDetectionV2JobAsync(
            StopEntitiesDetectionV2JobRequest stopEntitiesDetectionV2JobRequest);

    /**
     * <p>
     * Stops a medical entities detection job in progress.
     * </p>
     * 
     * @param stopEntitiesDetectionV2JobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopEntitiesDetectionV2Job operation returned by the service.
     * @sample AWSComprehendMedicalAsyncHandler.StopEntitiesDetectionV2Job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/StopEntitiesDetectionV2Job"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopEntitiesDetectionV2JobResult> stopEntitiesDetectionV2JobAsync(
            StopEntitiesDetectionV2JobRequest stopEntitiesDetectionV2JobRequest,
            com.amazonaws.handlers.AsyncHandler<StopEntitiesDetectionV2JobRequest, StopEntitiesDetectionV2JobResult> asyncHandler);

    /**
     * <p>
     * Stops a protected health information (PHI) detection job in progress.
     * </p>
     * 
     * @param stopPHIDetectionJobRequest
     * @return A Java Future containing the result of the StopPHIDetectionJob operation returned by the service.
     * @sample AWSComprehendMedicalAsync.StopPHIDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/StopPHIDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopPHIDetectionJobResult> stopPHIDetectionJobAsync(StopPHIDetectionJobRequest stopPHIDetectionJobRequest);

    /**
     * <p>
     * Stops a protected health information (PHI) detection job in progress.
     * </p>
     * 
     * @param stopPHIDetectionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopPHIDetectionJob operation returned by the service.
     * @sample AWSComprehendMedicalAsyncHandler.StopPHIDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/StopPHIDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopPHIDetectionJobResult> stopPHIDetectionJobAsync(StopPHIDetectionJobRequest stopPHIDetectionJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopPHIDetectionJobRequest, StopPHIDetectionJobResult> asyncHandler);

}
