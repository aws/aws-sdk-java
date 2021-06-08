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

import com.amazonaws.services.lookoutequipment.model.*;

/**
 * Interface for accessing LookoutEquipment asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lookoutequipment.AbstractAmazonLookoutEquipmentAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Lookout for Equipment is a machine learning service that uses advanced analytics to identify anomalies in
 * machines from sensor data for use in predictive maintenance.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonLookoutEquipmentAsync extends AmazonLookoutEquipment {

    /**
     * <p>
     * Creates a container for a collection of data being ingested for analysis. The dataset contains the metadata
     * describing where the data is and what the data actually looks like. In other words, it contains the location of
     * the data source, the data schema, and other information. A dataset also contains any tags associated with the
     * ingested data.
     * </p>
     * 
     * @param createDatasetRequest
     * @return A Java Future containing the result of the CreateDataset operation returned by the service.
     * @sample AmazonLookoutEquipmentAsync.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/CreateDataset" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest createDatasetRequest);

    /**
     * <p>
     * Creates a container for a collection of data being ingested for analysis. The dataset contains the metadata
     * describing where the data is and what the data actually looks like. In other words, it contains the location of
     * the data source, the data schema, and other information. A dataset also contains any tags associated with the
     * ingested data.
     * </p>
     * 
     * @param createDatasetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataset operation returned by the service.
     * @sample AmazonLookoutEquipmentAsyncHandler.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/CreateDataset" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest createDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDatasetRequest, CreateDatasetResult> asyncHandler);

    /**
     * <p>
     * Creates a scheduled inference. Scheduling an inference is setting up a continuous real-time inference plan to
     * analyze new measurement data. When setting up the schedule, you provide an S3 bucket location for the input data,
     * assign it a delimiter between separate entries in the data, set an offset delay if desired, and set the frequency
     * of inferencing. You must also provide an S3 bucket location for the output data.
     * </p>
     * 
     * @param createInferenceSchedulerRequest
     * @return A Java Future containing the result of the CreateInferenceScheduler operation returned by the service.
     * @sample AmazonLookoutEquipmentAsync.CreateInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/CreateInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateInferenceSchedulerResult> createInferenceSchedulerAsync(CreateInferenceSchedulerRequest createInferenceSchedulerRequest);

    /**
     * <p>
     * Creates a scheduled inference. Scheduling an inference is setting up a continuous real-time inference plan to
     * analyze new measurement data. When setting up the schedule, you provide an S3 bucket location for the input data,
     * assign it a delimiter between separate entries in the data, set an offset delay if desired, and set the frequency
     * of inferencing. You must also provide an S3 bucket location for the output data.
     * </p>
     * 
     * @param createInferenceSchedulerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInferenceScheduler operation returned by the service.
     * @sample AmazonLookoutEquipmentAsyncHandler.CreateInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/CreateInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateInferenceSchedulerResult> createInferenceSchedulerAsync(CreateInferenceSchedulerRequest createInferenceSchedulerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInferenceSchedulerRequest, CreateInferenceSchedulerResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateModel operation returned by the service.
     * @sample AmazonLookoutEquipmentAsync.CreateModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/CreateModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateModelResult> createModelAsync(CreateModelRequest createModelRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateModel operation returned by the service.
     * @sample AmazonLookoutEquipmentAsyncHandler.CreateModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/CreateModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateModelResult> createModelAsync(CreateModelRequest createModelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateModelRequest, CreateModelResult> asyncHandler);

    /**
     * <p>
     * Deletes a dataset and associated artifacts. The operation will check to see if any inference scheduler or data
     * ingestion job is currently using the dataset, and if there isn't, the dataset, its metadata, and any associated
     * data stored in S3 will be deleted. This does not affect any models that used this dataset for training and
     * evaluation, but does prevent it from being used in the future.
     * </p>
     * 
     * @param deleteDatasetRequest
     * @return A Java Future containing the result of the DeleteDataset operation returned by the service.
     * @sample AmazonLookoutEquipmentAsync.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DeleteDataset" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest deleteDatasetRequest);

    /**
     * <p>
     * Deletes a dataset and associated artifacts. The operation will check to see if any inference scheduler or data
     * ingestion job is currently using the dataset, and if there isn't, the dataset, its metadata, and any associated
     * data stored in S3 will be deleted. This does not affect any models that used this dataset for training and
     * evaluation, but does prevent it from being used in the future.
     * </p>
     * 
     * @param deleteDatasetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataset operation returned by the service.
     * @sample AmazonLookoutEquipmentAsyncHandler.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DeleteDataset" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest deleteDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDatasetRequest, DeleteDatasetResult> asyncHandler);

    /**
     * <p>
     * Deletes an inference scheduler that has been set up. Already processed output results are not affected.
     * </p>
     * 
     * @param deleteInferenceSchedulerRequest
     * @return A Java Future containing the result of the DeleteInferenceScheduler operation returned by the service.
     * @sample AmazonLookoutEquipmentAsync.DeleteInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DeleteInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInferenceSchedulerResult> deleteInferenceSchedulerAsync(DeleteInferenceSchedulerRequest deleteInferenceSchedulerRequest);

    /**
     * <p>
     * Deletes an inference scheduler that has been set up. Already processed output results are not affected.
     * </p>
     * 
     * @param deleteInferenceSchedulerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInferenceScheduler operation returned by the service.
     * @sample AmazonLookoutEquipmentAsyncHandler.DeleteInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DeleteInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInferenceSchedulerResult> deleteInferenceSchedulerAsync(DeleteInferenceSchedulerRequest deleteInferenceSchedulerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInferenceSchedulerRequest, DeleteInferenceSchedulerResult> asyncHandler);

    /**
     * <p>
     * Deletes an ML model currently available for Amazon Lookout for Equipment. This will prevent it from being used
     * with an inference scheduler, even one that is already set up.
     * </p>
     * 
     * @param deleteModelRequest
     * @return A Java Future containing the result of the DeleteModel operation returned by the service.
     * @sample AmazonLookoutEquipmentAsync.DeleteModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DeleteModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(DeleteModelRequest deleteModelRequest);

    /**
     * <p>
     * Deletes an ML model currently available for Amazon Lookout for Equipment. This will prevent it from being used
     * with an inference scheduler, even one that is already set up.
     * </p>
     * 
     * @param deleteModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteModel operation returned by the service.
     * @sample AmazonLookoutEquipmentAsyncHandler.DeleteModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DeleteModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(DeleteModelRequest deleteModelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteModelRequest, DeleteModelResult> asyncHandler);

    /**
     * <p>
     * Provides information on a specific data ingestion job such as creation time, dataset ARN, status, and so on.
     * </p>
     * 
     * @param describeDataIngestionJobRequest
     * @return A Java Future containing the result of the DescribeDataIngestionJob operation returned by the service.
     * @sample AmazonLookoutEquipmentAsync.DescribeDataIngestionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeDataIngestionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDataIngestionJobResult> describeDataIngestionJobAsync(DescribeDataIngestionJobRequest describeDataIngestionJobRequest);

    /**
     * <p>
     * Provides information on a specific data ingestion job such as creation time, dataset ARN, status, and so on.
     * </p>
     * 
     * @param describeDataIngestionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDataIngestionJob operation returned by the service.
     * @sample AmazonLookoutEquipmentAsyncHandler.DescribeDataIngestionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeDataIngestionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDataIngestionJobResult> describeDataIngestionJobAsync(DescribeDataIngestionJobRequest describeDataIngestionJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDataIngestionJobRequest, DescribeDataIngestionJobResult> asyncHandler);

    /**
     * <p>
     * Provides information on a specified dataset such as the schema location, status, and so on.
     * </p>
     * 
     * @param describeDatasetRequest
     * @return A Java Future containing the result of the DescribeDataset operation returned by the service.
     * @sample AmazonLookoutEquipmentAsync.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeDataset"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest describeDatasetRequest);

    /**
     * <p>
     * Provides information on a specified dataset such as the schema location, status, and so on.
     * </p>
     * 
     * @param describeDatasetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDataset operation returned by the service.
     * @sample AmazonLookoutEquipmentAsyncHandler.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeDataset"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest describeDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDatasetRequest, DescribeDatasetResult> asyncHandler);

    /**
     * <p>
     * Specifies information about the inference scheduler being used, including name, model, status, and associated
     * metadata
     * </p>
     * 
     * @param describeInferenceSchedulerRequest
     * @return A Java Future containing the result of the DescribeInferenceScheduler operation returned by the service.
     * @sample AmazonLookoutEquipmentAsync.DescribeInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInferenceSchedulerResult> describeInferenceSchedulerAsync(
            DescribeInferenceSchedulerRequest describeInferenceSchedulerRequest);

    /**
     * <p>
     * Specifies information about the inference scheduler being used, including name, model, status, and associated
     * metadata
     * </p>
     * 
     * @param describeInferenceSchedulerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInferenceScheduler operation returned by the service.
     * @sample AmazonLookoutEquipmentAsyncHandler.DescribeInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInferenceSchedulerResult> describeInferenceSchedulerAsync(
            DescribeInferenceSchedulerRequest describeInferenceSchedulerRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInferenceSchedulerRequest, DescribeInferenceSchedulerResult> asyncHandler);

    /**
     * <p>
     * Provides overall information about a specific ML model, including model name and ARN, dataset, training and
     * evaluation information, status, and so on.
     * </p>
     * 
     * @param describeModelRequest
     * @return A Java Future containing the result of the DescribeModel operation returned by the service.
     * @sample AmazonLookoutEquipmentAsync.DescribeModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeModelResult> describeModelAsync(DescribeModelRequest describeModelRequest);

    /**
     * <p>
     * Provides overall information about a specific ML model, including model name and ARN, dataset, training and
     * evaluation information, status, and so on.
     * </p>
     * 
     * @param describeModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeModel operation returned by the service.
     * @sample AmazonLookoutEquipmentAsyncHandler.DescribeModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeModelResult> describeModelAsync(DescribeModelRequest describeModelRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeModelRequest, DescribeModelResult> asyncHandler);

    /**
     * <p>
     * Provides a list of all data ingestion jobs, including dataset name and ARN, S3 location of the input data,
     * status, and so on.
     * </p>
     * 
     * @param listDataIngestionJobsRequest
     * @return A Java Future containing the result of the ListDataIngestionJobs operation returned by the service.
     * @sample AmazonLookoutEquipmentAsync.ListDataIngestionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListDataIngestionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDataIngestionJobsResult> listDataIngestionJobsAsync(ListDataIngestionJobsRequest listDataIngestionJobsRequest);

    /**
     * <p>
     * Provides a list of all data ingestion jobs, including dataset name and ARN, S3 location of the input data,
     * status, and so on.
     * </p>
     * 
     * @param listDataIngestionJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataIngestionJobs operation returned by the service.
     * @sample AmazonLookoutEquipmentAsyncHandler.ListDataIngestionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListDataIngestionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDataIngestionJobsResult> listDataIngestionJobsAsync(ListDataIngestionJobsRequest listDataIngestionJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataIngestionJobsRequest, ListDataIngestionJobsResult> asyncHandler);

    /**
     * <p>
     * Lists all datasets currently available in your account, filtering on the dataset name.
     * </p>
     * 
     * @param listDatasetsRequest
     * @return A Java Future containing the result of the ListDatasets operation returned by the service.
     * @sample AmazonLookoutEquipmentAsync.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListDatasets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest listDatasetsRequest);

    /**
     * <p>
     * Lists all datasets currently available in your account, filtering on the dataset name.
     * </p>
     * 
     * @param listDatasetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDatasets operation returned by the service.
     * @sample AmazonLookoutEquipmentAsyncHandler.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListDatasets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest listDatasetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDatasetsRequest, ListDatasetsResult> asyncHandler);

    /**
     * <p>
     * Lists all inference executions that have been performed by the specified inference scheduler.
     * </p>
     * 
     * @param listInferenceExecutionsRequest
     * @return A Java Future containing the result of the ListInferenceExecutions operation returned by the service.
     * @sample AmazonLookoutEquipmentAsync.ListInferenceExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListInferenceExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInferenceExecutionsResult> listInferenceExecutionsAsync(ListInferenceExecutionsRequest listInferenceExecutionsRequest);

    /**
     * <p>
     * Lists all inference executions that have been performed by the specified inference scheduler.
     * </p>
     * 
     * @param listInferenceExecutionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInferenceExecutions operation returned by the service.
     * @sample AmazonLookoutEquipmentAsyncHandler.ListInferenceExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListInferenceExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInferenceExecutionsResult> listInferenceExecutionsAsync(ListInferenceExecutionsRequest listInferenceExecutionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInferenceExecutionsRequest, ListInferenceExecutionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of all inference schedulers currently available for your account.
     * </p>
     * 
     * @param listInferenceSchedulersRequest
     * @return A Java Future containing the result of the ListInferenceSchedulers operation returned by the service.
     * @sample AmazonLookoutEquipmentAsync.ListInferenceSchedulers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListInferenceSchedulers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInferenceSchedulersResult> listInferenceSchedulersAsync(ListInferenceSchedulersRequest listInferenceSchedulersRequest);

    /**
     * <p>
     * Retrieves a list of all inference schedulers currently available for your account.
     * </p>
     * 
     * @param listInferenceSchedulersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInferenceSchedulers operation returned by the service.
     * @sample AmazonLookoutEquipmentAsyncHandler.ListInferenceSchedulers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListInferenceSchedulers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInferenceSchedulersResult> listInferenceSchedulersAsync(ListInferenceSchedulersRequest listInferenceSchedulersRequest,
            com.amazonaws.handlers.AsyncHandler<ListInferenceSchedulersRequest, ListInferenceSchedulersResult> asyncHandler);

    /**
     * <p>
     * Generates a list of all models in the account, including model name and ARN, dataset, and status.
     * </p>
     * 
     * @param listModelsRequest
     * @return A Java Future containing the result of the ListModels operation returned by the service.
     * @sample AmazonLookoutEquipmentAsync.ListModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListModels" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListModelsResult> listModelsAsync(ListModelsRequest listModelsRequest);

    /**
     * <p>
     * Generates a list of all models in the account, including model name and ARN, dataset, and status.
     * </p>
     * 
     * @param listModelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListModels operation returned by the service.
     * @sample AmazonLookoutEquipmentAsyncHandler.ListModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListModels" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListModelsResult> listModelsAsync(ListModelsRequest listModelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListModelsRequest, ListModelsResult> asyncHandler);

    /**
     * <p>
     * Lists all the tags for a specified resource, including key and value.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonLookoutEquipmentAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all the tags for a specified resource, including key and value.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonLookoutEquipmentAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Starts a data ingestion job. Amazon Lookout for Equipment returns the job status.
     * </p>
     * 
     * @param startDataIngestionJobRequest
     * @return A Java Future containing the result of the StartDataIngestionJob operation returned by the service.
     * @sample AmazonLookoutEquipmentAsync.StartDataIngestionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/StartDataIngestionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartDataIngestionJobResult> startDataIngestionJobAsync(StartDataIngestionJobRequest startDataIngestionJobRequest);

    /**
     * <p>
     * Starts a data ingestion job. Amazon Lookout for Equipment returns the job status.
     * </p>
     * 
     * @param startDataIngestionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartDataIngestionJob operation returned by the service.
     * @sample AmazonLookoutEquipmentAsyncHandler.StartDataIngestionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/StartDataIngestionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartDataIngestionJobResult> startDataIngestionJobAsync(StartDataIngestionJobRequest startDataIngestionJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartDataIngestionJobRequest, StartDataIngestionJobResult> asyncHandler);

    /**
     * <p>
     * Starts an inference scheduler.
     * </p>
     * 
     * @param startInferenceSchedulerRequest
     * @return A Java Future containing the result of the StartInferenceScheduler operation returned by the service.
     * @sample AmazonLookoutEquipmentAsync.StartInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/StartInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartInferenceSchedulerResult> startInferenceSchedulerAsync(StartInferenceSchedulerRequest startInferenceSchedulerRequest);

    /**
     * <p>
     * Starts an inference scheduler.
     * </p>
     * 
     * @param startInferenceSchedulerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartInferenceScheduler operation returned by the service.
     * @sample AmazonLookoutEquipmentAsyncHandler.StartInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/StartInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartInferenceSchedulerResult> startInferenceSchedulerAsync(StartInferenceSchedulerRequest startInferenceSchedulerRequest,
            com.amazonaws.handlers.AsyncHandler<StartInferenceSchedulerRequest, StartInferenceSchedulerResult> asyncHandler);

    /**
     * <p>
     * Stops an inference scheduler.
     * </p>
     * 
     * @param stopInferenceSchedulerRequest
     * @return A Java Future containing the result of the StopInferenceScheduler operation returned by the service.
     * @sample AmazonLookoutEquipmentAsync.StopInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/StopInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopInferenceSchedulerResult> stopInferenceSchedulerAsync(StopInferenceSchedulerRequest stopInferenceSchedulerRequest);

    /**
     * <p>
     * Stops an inference scheduler.
     * </p>
     * 
     * @param stopInferenceSchedulerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopInferenceScheduler operation returned by the service.
     * @sample AmazonLookoutEquipmentAsyncHandler.StopInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/StopInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopInferenceSchedulerResult> stopInferenceSchedulerAsync(StopInferenceSchedulerRequest stopInferenceSchedulerRequest,
            com.amazonaws.handlers.AsyncHandler<StopInferenceSchedulerRequest, StopInferenceSchedulerResult> asyncHandler);

    /**
     * <p>
     * Associates a given tag to a resource in your account. A tag is a key-value pair which can be added to an Amazon
     * Lookout for Equipment resource as metadata. Tags can be used for organizing your resources as well as helping you
     * to search and filter by tag. Multiple tags can be added to a resource, either when you create it, or later. Up to
     * 50 tags can be associated with each resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonLookoutEquipmentAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Associates a given tag to a resource in your account. A tag is a key-value pair which can be added to an Amazon
     * Lookout for Equipment resource as metadata. Tags can be used for organizing your resources as well as helping you
     * to search and filter by tag. Multiple tags can be added to a resource, either when you create it, or later. Up to
     * 50 tags can be associated with each resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonLookoutEquipmentAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a specific tag from a given resource. The tag is specified by its key.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonLookoutEquipmentAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a specific tag from a given resource. The tag is specified by its key.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonLookoutEquipmentAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an inference scheduler.
     * </p>
     * 
     * @param updateInferenceSchedulerRequest
     * @return A Java Future containing the result of the UpdateInferenceScheduler operation returned by the service.
     * @sample AmazonLookoutEquipmentAsync.UpdateInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/UpdateInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateInferenceSchedulerResult> updateInferenceSchedulerAsync(UpdateInferenceSchedulerRequest updateInferenceSchedulerRequest);

    /**
     * <p>
     * Updates an inference scheduler.
     * </p>
     * 
     * @param updateInferenceSchedulerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateInferenceScheduler operation returned by the service.
     * @sample AmazonLookoutEquipmentAsyncHandler.UpdateInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/UpdateInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateInferenceSchedulerResult> updateInferenceSchedulerAsync(UpdateInferenceSchedulerRequest updateInferenceSchedulerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateInferenceSchedulerRequest, UpdateInferenceSchedulerResult> asyncHandler);

}
