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
package com.amazonaws.services.lookoutequipment;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.lookoutequipment.model.*;

/**
 * Interface for accessing LookoutEquipment.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lookoutequipment.AbstractAmazonLookoutEquipment} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Lookout for Equipment is a machine learning service that uses advanced analytics to identify anomalies in
 * machines from sensor data for use in predictive maintenance.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonLookoutEquipment {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "lookoutequipment";

    /**
     * <p>
     * Creates a container for a collection of data being ingested for analysis. The dataset contains the metadata
     * describing where the data is and what the data actually looks like. In other words, it contains the location of
     * the data source, the data schema, and other information. A dataset also contains any tags associated with the
     * ingested data.
     * </p>
     * 
     * @param createDatasetRequest
     * @return Result of the CreateDataset operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         Resource limitations have been exceeded.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/CreateDataset" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDatasetResult createDataset(CreateDatasetRequest createDatasetRequest);

    /**
     * <p>
     * Creates a scheduled inference. Scheduling an inference is setting up a continuous real-time inference plan to
     * analyze new measurement data. When setting up the schedule, you provide an S3 bucket location for the input data,
     * assign it a delimiter between separate entries in the data, set an offset delay if desired, and set the frequency
     * of inferencing. You must also provide an S3 bucket location for the output data.
     * </p>
     * 
     * @param createInferenceSchedulerRequest
     * @return Result of the CreateInferenceScheduler operation returned by the service.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ServiceQuotaExceededException
     *         Resource limitations have been exceeded.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.CreateInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/CreateInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    CreateInferenceSchedulerResult createInferenceScheduler(CreateInferenceSchedulerRequest createInferenceSchedulerRequest);

    /**
     * <p>
     * Creates an ML model for data inference.
     * </p>
     * <p>
     * A machine-learning (ML) model is a mathematical model that finds patterns in your data. In Amazon Lookout for
     * Equipment, the model learns the patterns of normal behavior and detects abnormal behavior that could be potential
     * equipment failure (or maintenance events). The models are made by analyzing normal data and abnormalities in
     * machine behavior that have already occurred.
     * </p>
     * <p>
     * Your model is trained using a portion of the data from your dataset and uses that data to learn patterns of
     * normal behavior and abnormal patterns that lead to equipment failure. Another portion of the data is used to
     * evaluate the model's accuracy.
     * </p>
     * 
     * @param createModelRequest
     * @return Result of the CreateModel operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         Resource limitations have been exceeded.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @sample AmazonLookoutEquipment.CreateModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/CreateModel" target="_top">AWS
     *      API Documentation</a>
     */
    CreateModelResult createModel(CreateModelRequest createModelRequest);

    /**
     * <p>
     * Deletes a dataset and associated artifacts. The operation will check to see if any inference scheduler or data
     * ingestion job is currently using the dataset, and if there isn't, the dataset, its metadata, and any associated
     * data stored in S3 will be deleted. This does not affect any models that used this dataset for training and
     * evaluation, but does prevent it from being used in the future.
     * </p>
     * 
     * @param deleteDatasetRequest
     * @return Result of the DeleteDataset operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AmazonLookoutEquipment.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DeleteDataset" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDatasetResult deleteDataset(DeleteDatasetRequest deleteDatasetRequest);

    /**
     * <p>
     * Deletes an inference scheduler that has been set up. Already processed output results are not affected.
     * </p>
     * 
     * @param deleteInferenceSchedulerRequest
     * @return Result of the DeleteInferenceScheduler operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.DeleteInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DeleteInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteInferenceSchedulerResult deleteInferenceScheduler(DeleteInferenceSchedulerRequest deleteInferenceSchedulerRequest);

    /**
     * <p>
     * Deletes an ML model currently available for Amazon Lookout for Equipment. This will prevent it from being used
     * with an inference scheduler, even one that is already set up.
     * </p>
     * 
     * @param deleteModelRequest
     * @return Result of the DeleteModel operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @sample AmazonLookoutEquipment.DeleteModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DeleteModel" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteModelResult deleteModel(DeleteModelRequest deleteModelRequest);

    /**
     * <p>
     * Provides information on a specific data ingestion job such as creation time, dataset ARN, status, and so on.
     * </p>
     * 
     * @param describeDataIngestionJobRequest
     * @return Result of the DescribeDataIngestionJob operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.DescribeDataIngestionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeDataIngestionJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDataIngestionJobResult describeDataIngestionJob(DescribeDataIngestionJobRequest describeDataIngestionJobRequest);

    /**
     * <p>
     * Provides information on a specified dataset such as the schema location, status, and so on.
     * </p>
     * 
     * @param describeDatasetRequest
     * @return Result of the DescribeDataset operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeDataset"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDatasetResult describeDataset(DescribeDatasetRequest describeDatasetRequest);

    /**
     * <p>
     * Specifies information about the inference scheduler being used, including name, model, status, and associated
     * metadata
     * </p>
     * 
     * @param describeInferenceSchedulerRequest
     * @return Result of the DescribeInferenceScheduler operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.DescribeInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeInferenceSchedulerResult describeInferenceScheduler(DescribeInferenceSchedulerRequest describeInferenceSchedulerRequest);

    /**
     * <p>
     * Provides overall information about a specific ML model, including model name and ARN, dataset, training and
     * evaluation information, status, and so on.
     * </p>
     * 
     * @param describeModelRequest
     * @return Result of the DescribeModel operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.DescribeModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeModel" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeModelResult describeModel(DescribeModelRequest describeModelRequest);

    /**
     * <p>
     * Provides a list of all data ingestion jobs, including dataset name and ARN, S3 location of the input data,
     * status, and so on.
     * </p>
     * 
     * @param listDataIngestionJobsRequest
     * @return Result of the ListDataIngestionJobs operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.ListDataIngestionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListDataIngestionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListDataIngestionJobsResult listDataIngestionJobs(ListDataIngestionJobsRequest listDataIngestionJobsRequest);

    /**
     * <p>
     * Lists all datasets currently available in your account, filtering on the dataset name.
     * </p>
     * 
     * @param listDatasetsRequest
     * @return Result of the ListDatasets operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListDatasets" target="_top">AWS
     *      API Documentation</a>
     */
    ListDatasetsResult listDatasets(ListDatasetsRequest listDatasetsRequest);

    /**
     * <p>
     * Lists all inference executions that have been performed by the specified inference scheduler.
     * </p>
     * 
     * @param listInferenceExecutionsRequest
     * @return Result of the ListInferenceExecutions operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.ListInferenceExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListInferenceExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    ListInferenceExecutionsResult listInferenceExecutions(ListInferenceExecutionsRequest listInferenceExecutionsRequest);

    /**
     * <p>
     * Retrieves a list of all inference schedulers currently available for your account.
     * </p>
     * 
     * @param listInferenceSchedulersRequest
     * @return Result of the ListInferenceSchedulers operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.ListInferenceSchedulers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListInferenceSchedulers"
     *      target="_top">AWS API Documentation</a>
     */
    ListInferenceSchedulersResult listInferenceSchedulers(ListInferenceSchedulersRequest listInferenceSchedulersRequest);

    /**
     * <p>
     * Generates a list of all models in the account, including model name and ARN, dataset, and status.
     * </p>
     * 
     * @param listModelsRequest
     * @return Result of the ListModels operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.ListModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListModels" target="_top">AWS
     *      API Documentation</a>
     */
    ListModelsResult listModels(ListModelsRequest listModelsRequest);

    /**
     * <p>
     * Lists all the tags for a specified resource, including key and value.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Starts a data ingestion job. Amazon Lookout for Equipment returns the job status.
     * </p>
     * 
     * @param startDataIngestionJobRequest
     * @return Result of the StartDataIngestionJob operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         Resource limitations have been exceeded.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.StartDataIngestionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/StartDataIngestionJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartDataIngestionJobResult startDataIngestionJob(StartDataIngestionJobRequest startDataIngestionJobRequest);

    /**
     * <p>
     * Starts an inference scheduler.
     * </p>
     * 
     * @param startInferenceSchedulerRequest
     * @return Result of the StartInferenceScheduler operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.StartInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/StartInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    StartInferenceSchedulerResult startInferenceScheduler(StartInferenceSchedulerRequest startInferenceSchedulerRequest);

    /**
     * <p>
     * Stops an inference scheduler.
     * </p>
     * 
     * @param stopInferenceSchedulerRequest
     * @return Result of the StopInferenceScheduler operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.StopInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/StopInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    StopInferenceSchedulerResult stopInferenceScheduler(StopInferenceSchedulerRequest stopInferenceSchedulerRequest);

    /**
     * <p>
     * Associates a given tag to a resource in your account. A tag is a key-value pair which can be added to an Amazon
     * Lookout for Equipment resource as metadata. Tags can be used for organizing your resources as well as helping you
     * to search and filter by tag. Multiple tags can be added to a resource, either when you create it, or later. Up to
     * 50 tags can be associated with each resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ServiceQuotaExceededException
     *         Resource limitations have been exceeded.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a specific tag from a given resource. The tag is specified by its key.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an inference scheduler.
     * </p>
     * 
     * @param updateInferenceSchedulerRequest
     * @return Result of the UpdateInferenceScheduler operation returned by the service.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.UpdateInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/UpdateInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateInferenceSchedulerResult updateInferenceScheduler(UpdateInferenceSchedulerRequest updateInferenceSchedulerRequest);

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
