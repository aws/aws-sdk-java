/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotanalytics;

import javax.annotation.Generated;

import com.amazonaws.services.iotanalytics.model.*;

/**
 * Interface for accessing AWS IoT Analytics asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iotanalytics.AbstractAWSIoTAnalyticsAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS IoT Analytics allows you to collect large amounts of device data, process messages, and store them. You can then
 * query the data and run sophisticated analytics on it. AWS IoT Analytics enables advanced data exploration through
 * integration with Jupyter Notebooks and data visualization through integration with Amazon QuickSight.
 * </p>
 * <p>
 * Traditional analytics and business intelligence tools are designed to process structured data. IoT data often comes
 * from devices that record noisy processes (such as temperature, motion, or sound). As a result the data from these
 * devices can have significant gaps, corrupted messages, and false readings that must be cleaned up before analysis can
 * occur. Also, IoT data is often only meaningful in the context of other data from external sources.
 * </p>
 * <p>
 * AWS IoT Analytics automates the steps required to analyze data from IoT devices. AWS IoT Analytics filters,
 * transforms, and enriches IoT data before storing it in a time-series data store for analysis. You can set up the
 * service to collect only the data you need from your devices, apply mathematical transforms to process the data, and
 * enrich the data with device-specific metadata such as device type and location before storing it. Then, you can
 * analyze your data by running queries using the built-in SQL query engine, or perform more complex analytics and
 * machine learning inference. AWS IoT Analytics includes pre-built models for common IoT use cases so you can answer
 * questions like which devices are about to fail or which customers are at risk of abandoning their wearable devices.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIoTAnalyticsAsync extends AWSIoTAnalytics {

    /**
     * <p>
     * Sends messages to a channel.
     * </p>
     * 
     * @param batchPutMessageRequest
     * @return A Java Future containing the result of the BatchPutMessage operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.BatchPutMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/BatchPutMessage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchPutMessageResult> batchPutMessageAsync(BatchPutMessageRequest batchPutMessageRequest);

    /**
     * <p>
     * Sends messages to a channel.
     * </p>
     * 
     * @param batchPutMessageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchPutMessage operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.BatchPutMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/BatchPutMessage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchPutMessageResult> batchPutMessageAsync(BatchPutMessageRequest batchPutMessageRequest,
            com.amazonaws.handlers.AsyncHandler<BatchPutMessageRequest, BatchPutMessageResult> asyncHandler);

    /**
     * <p>
     * Cancels the reprocessing of data through the pipeline.
     * </p>
     * 
     * @param cancelPipelineReprocessingRequest
     * @return A Java Future containing the result of the CancelPipelineReprocessing operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.CancelPipelineReprocessing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CancelPipelineReprocessing"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelPipelineReprocessingResult> cancelPipelineReprocessingAsync(
            CancelPipelineReprocessingRequest cancelPipelineReprocessingRequest);

    /**
     * <p>
     * Cancels the reprocessing of data through the pipeline.
     * </p>
     * 
     * @param cancelPipelineReprocessingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelPipelineReprocessing operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.CancelPipelineReprocessing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CancelPipelineReprocessing"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelPipelineReprocessingResult> cancelPipelineReprocessingAsync(
            CancelPipelineReprocessingRequest cancelPipelineReprocessingRequest,
            com.amazonaws.handlers.AsyncHandler<CancelPipelineReprocessingRequest, CancelPipelineReprocessingResult> asyncHandler);

    /**
     * <p>
     * Creates a channel. A channel collects data from an MQTT topic and archives the raw, unprocessed messages before
     * publishing the data to a pipeline.
     * </p>
     * 
     * @param createChannelRequest
     * @return A Java Future containing the result of the CreateChannel operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CreateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelResult> createChannelAsync(CreateChannelRequest createChannelRequest);

    /**
     * <p>
     * Creates a channel. A channel collects data from an MQTT topic and archives the raw, unprocessed messages before
     * publishing the data to a pipeline.
     * </p>
     * 
     * @param createChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateChannel operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CreateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelResult> createChannelAsync(CreateChannelRequest createChannelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateChannelRequest, CreateChannelResult> asyncHandler);

    /**
     * <p>
     * Creates a data set. A data set stores data retrieved from a data store by applying a "queryAction" (a SQL query)
     * or a "containerAction" (executing a containerized application). This operation creates the skeleton of a data
     * set. The data set can be populated manually by calling "CreateDatasetContent" or automatically according to a
     * "trigger" you specify.
     * </p>
     * 
     * @param createDatasetRequest
     * @return A Java Future containing the result of the CreateDataset operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CreateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest createDatasetRequest);

    /**
     * <p>
     * Creates a data set. A data set stores data retrieved from a data store by applying a "queryAction" (a SQL query)
     * or a "containerAction" (executing a containerized application). This operation creates the skeleton of a data
     * set. The data set can be populated manually by calling "CreateDatasetContent" or automatically according to a
     * "trigger" you specify.
     * </p>
     * 
     * @param createDatasetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataset operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CreateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest createDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDatasetRequest, CreateDatasetResult> asyncHandler);

    /**
     * <p>
     * Creates the content of a data set by applying a "queryAction" (a SQL query) or a "containerAction" (executing a
     * containerized application).
     * </p>
     * 
     * @param createDatasetContentRequest
     * @return A Java Future containing the result of the CreateDatasetContent operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.CreateDatasetContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CreateDatasetContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetContentResult> createDatasetContentAsync(CreateDatasetContentRequest createDatasetContentRequest);

    /**
     * <p>
     * Creates the content of a data set by applying a "queryAction" (a SQL query) or a "containerAction" (executing a
     * containerized application).
     * </p>
     * 
     * @param createDatasetContentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDatasetContent operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.CreateDatasetContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CreateDatasetContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetContentResult> createDatasetContentAsync(CreateDatasetContentRequest createDatasetContentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDatasetContentRequest, CreateDatasetContentResult> asyncHandler);

    /**
     * <p>
     * Creates a data store, which is a repository for messages.
     * </p>
     * 
     * @param createDatastoreRequest
     * @return A Java Future containing the result of the CreateDatastore operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.CreateDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CreateDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatastoreResult> createDatastoreAsync(CreateDatastoreRequest createDatastoreRequest);

    /**
     * <p>
     * Creates a data store, which is a repository for messages.
     * </p>
     * 
     * @param createDatastoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDatastore operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.CreateDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CreateDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatastoreResult> createDatastoreAsync(CreateDatastoreRequest createDatastoreRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDatastoreRequest, CreateDatastoreResult> asyncHandler);

    /**
     * <p>
     * Creates a pipeline. A pipeline consumes messages from one or more channels and allows you to process the messages
     * before storing them in a data store. You must specify both a <code>channel</code> and a <code>datastore</code>
     * activity and, optionally, as many as 23 additional activities in the <code>pipelineActivities</code> array.
     * </p>
     * 
     * @param createPipelineRequest
     * @return A Java Future containing the result of the CreatePipeline operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.CreatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CreatePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePipelineResult> createPipelineAsync(CreatePipelineRequest createPipelineRequest);

    /**
     * <p>
     * Creates a pipeline. A pipeline consumes messages from one or more channels and allows you to process the messages
     * before storing them in a data store. You must specify both a <code>channel</code> and a <code>datastore</code>
     * activity and, optionally, as many as 23 additional activities in the <code>pipelineActivities</code> array.
     * </p>
     * 
     * @param createPipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePipeline operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.CreatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CreatePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePipelineResult> createPipelineAsync(CreatePipelineRequest createPipelineRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePipelineRequest, CreatePipelineResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified channel.
     * </p>
     * 
     * @param deleteChannelRequest
     * @return A Java Future containing the result of the DeleteChannel operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DeleteChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(DeleteChannelRequest deleteChannelRequest);

    /**
     * <p>
     * Deletes the specified channel.
     * </p>
     * 
     * @param deleteChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteChannel operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DeleteChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(DeleteChannelRequest deleteChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteChannelRequest, DeleteChannelResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified data set.
     * </p>
     * <p>
     * You do not have to delete the content of the data set before you perform this operation.
     * </p>
     * 
     * @param deleteDatasetRequest
     * @return A Java Future containing the result of the DeleteDataset operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DeleteDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest deleteDatasetRequest);

    /**
     * <p>
     * Deletes the specified data set.
     * </p>
     * <p>
     * You do not have to delete the content of the data set before you perform this operation.
     * </p>
     * 
     * @param deleteDatasetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataset operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DeleteDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest deleteDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDatasetRequest, DeleteDatasetResult> asyncHandler);

    /**
     * <p>
     * Deletes the content of the specified data set.
     * </p>
     * 
     * @param deleteDatasetContentRequest
     * @return A Java Future containing the result of the DeleteDatasetContent operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.DeleteDatasetContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DeleteDatasetContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetContentResult> deleteDatasetContentAsync(DeleteDatasetContentRequest deleteDatasetContentRequest);

    /**
     * <p>
     * Deletes the content of the specified data set.
     * </p>
     * 
     * @param deleteDatasetContentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDatasetContent operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.DeleteDatasetContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DeleteDatasetContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetContentResult> deleteDatasetContentAsync(DeleteDatasetContentRequest deleteDatasetContentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDatasetContentRequest, DeleteDatasetContentResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified data store.
     * </p>
     * 
     * @param deleteDatastoreRequest
     * @return A Java Future containing the result of the DeleteDatastore operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.DeleteDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DeleteDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatastoreResult> deleteDatastoreAsync(DeleteDatastoreRequest deleteDatastoreRequest);

    /**
     * <p>
     * Deletes the specified data store.
     * </p>
     * 
     * @param deleteDatastoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDatastore operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.DeleteDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DeleteDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatastoreResult> deleteDatastoreAsync(DeleteDatastoreRequest deleteDatastoreRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDatastoreRequest, DeleteDatastoreResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified pipeline.
     * </p>
     * 
     * @param deletePipelineRequest
     * @return A Java Future containing the result of the DeletePipeline operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.DeletePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DeletePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeletePipelineResult> deletePipelineAsync(DeletePipelineRequest deletePipelineRequest);

    /**
     * <p>
     * Deletes the specified pipeline.
     * </p>
     * 
     * @param deletePipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePipeline operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.DeletePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DeletePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeletePipelineResult> deletePipelineAsync(DeletePipelineRequest deletePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePipelineRequest, DeletePipelineResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a channel.
     * </p>
     * 
     * @param describeChannelRequest
     * @return A Java Future containing the result of the DescribeChannel operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.DescribeChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DescribeChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChannelResult> describeChannelAsync(DescribeChannelRequest describeChannelRequest);

    /**
     * <p>
     * Retrieves information about a channel.
     * </p>
     * 
     * @param describeChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeChannel operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.DescribeChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DescribeChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChannelResult> describeChannelAsync(DescribeChannelRequest describeChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeChannelRequest, DescribeChannelResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a data set.
     * </p>
     * 
     * @param describeDatasetRequest
     * @return A Java Future containing the result of the DescribeDataset operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DescribeDataset" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest describeDatasetRequest);

    /**
     * <p>
     * Retrieves information about a data set.
     * </p>
     * 
     * @param describeDatasetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDataset operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DescribeDataset" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest describeDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDatasetRequest, DescribeDatasetResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a data store.
     * </p>
     * 
     * @param describeDatastoreRequest
     * @return A Java Future containing the result of the DescribeDatastore operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.DescribeDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DescribeDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatastoreResult> describeDatastoreAsync(DescribeDatastoreRequest describeDatastoreRequest);

    /**
     * <p>
     * Retrieves information about a data store.
     * </p>
     * 
     * @param describeDatastoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDatastore operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.DescribeDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DescribeDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatastoreResult> describeDatastoreAsync(DescribeDatastoreRequest describeDatastoreRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDatastoreRequest, DescribeDatastoreResult> asyncHandler);

    /**
     * <p>
     * Retrieves the current settings of the AWS IoT Analytics logging options.
     * </p>
     * 
     * @param describeLoggingOptionsRequest
     * @return A Java Future containing the result of the DescribeLoggingOptions operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.DescribeLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DescribeLoggingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoggingOptionsResult> describeLoggingOptionsAsync(DescribeLoggingOptionsRequest describeLoggingOptionsRequest);

    /**
     * <p>
     * Retrieves the current settings of the AWS IoT Analytics logging options.
     * </p>
     * 
     * @param describeLoggingOptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLoggingOptions operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.DescribeLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DescribeLoggingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoggingOptionsResult> describeLoggingOptionsAsync(DescribeLoggingOptionsRequest describeLoggingOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLoggingOptionsRequest, DescribeLoggingOptionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a pipeline.
     * </p>
     * 
     * @param describePipelineRequest
     * @return A Java Future containing the result of the DescribePipeline operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.DescribePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DescribePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribePipelineResult> describePipelineAsync(DescribePipelineRequest describePipelineRequest);

    /**
     * <p>
     * Retrieves information about a pipeline.
     * </p>
     * 
     * @param describePipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePipeline operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.DescribePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DescribePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribePipelineResult> describePipelineAsync(DescribePipelineRequest describePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePipelineRequest, DescribePipelineResult> asyncHandler);

    /**
     * <p>
     * Retrieves the contents of a data set as pre-signed URIs.
     * </p>
     * 
     * @param getDatasetContentRequest
     * @return A Java Future containing the result of the GetDatasetContent operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.GetDatasetContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/GetDatasetContent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDatasetContentResult> getDatasetContentAsync(GetDatasetContentRequest getDatasetContentRequest);

    /**
     * <p>
     * Retrieves the contents of a data set as pre-signed URIs.
     * </p>
     * 
     * @param getDatasetContentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDatasetContent operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.GetDatasetContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/GetDatasetContent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDatasetContentResult> getDatasetContentAsync(GetDatasetContentRequest getDatasetContentRequest,
            com.amazonaws.handlers.AsyncHandler<GetDatasetContentRequest, GetDatasetContentResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of channels.
     * </p>
     * 
     * @param listChannelsRequest
     * @return A Java Future containing the result of the ListChannels operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListChannels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest listChannelsRequest);

    /**
     * <p>
     * Retrieves a list of channels.
     * </p>
     * 
     * @param listChannelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChannels operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListChannels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest listChannelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListChannelsRequest, ListChannelsResult> asyncHandler);

    /**
     * <p>
     * Lists information about data set contents that have been created.
     * </p>
     * 
     * @param listDatasetContentsRequest
     * @return A Java Future containing the result of the ListDatasetContents operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.ListDatasetContents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListDatasetContents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetContentsResult> listDatasetContentsAsync(ListDatasetContentsRequest listDatasetContentsRequest);

    /**
     * <p>
     * Lists information about data set contents that have been created.
     * </p>
     * 
     * @param listDatasetContentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDatasetContents operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.ListDatasetContents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListDatasetContents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetContentsResult> listDatasetContentsAsync(ListDatasetContentsRequest listDatasetContentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDatasetContentsRequest, ListDatasetContentsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about data sets.
     * </p>
     * 
     * @param listDatasetsRequest
     * @return A Java Future containing the result of the ListDatasets operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListDatasets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest listDatasetsRequest);

    /**
     * <p>
     * Retrieves information about data sets.
     * </p>
     * 
     * @param listDatasetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDatasets operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListDatasets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest listDatasetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDatasetsRequest, ListDatasetsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of data stores.
     * </p>
     * 
     * @param listDatastoresRequest
     * @return A Java Future containing the result of the ListDatastores operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.ListDatastores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListDatastores" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDatastoresResult> listDatastoresAsync(ListDatastoresRequest listDatastoresRequest);

    /**
     * <p>
     * Retrieves a list of data stores.
     * </p>
     * 
     * @param listDatastoresRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDatastores operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.ListDatastores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListDatastores" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDatastoresResult> listDatastoresAsync(ListDatastoresRequest listDatastoresRequest,
            com.amazonaws.handlers.AsyncHandler<ListDatastoresRequest, ListDatastoresResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of pipelines.
     * </p>
     * 
     * @param listPipelinesRequest
     * @return A Java Future containing the result of the ListPipelines operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.ListPipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListPipelines" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(ListPipelinesRequest listPipelinesRequest);

    /**
     * <p>
     * Retrieves a list of pipelines.
     * </p>
     * 
     * @param listPipelinesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPipelines operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.ListPipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListPipelines" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(ListPipelinesRequest listPipelinesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPipelinesRequest, ListPipelinesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags (metadata) which you have assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags (metadata) which you have assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Sets or updates the AWS IoT Analytics logging options.
     * </p>
     * <p>
     * Note that if you update the value of any <code>loggingOptions</code> field, it takes up to one minute for the
     * change to take effect. Also, if you change the policy attached to the role you specified in the roleArn field
     * (for example, to correct an invalid policy) it takes up to 5 minutes for that change to take effect.
     * </p>
     * 
     * @param putLoggingOptionsRequest
     * @return A Java Future containing the result of the PutLoggingOptions operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.PutLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/PutLoggingOptions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutLoggingOptionsResult> putLoggingOptionsAsync(PutLoggingOptionsRequest putLoggingOptionsRequest);

    /**
     * <p>
     * Sets or updates the AWS IoT Analytics logging options.
     * </p>
     * <p>
     * Note that if you update the value of any <code>loggingOptions</code> field, it takes up to one minute for the
     * change to take effect. Also, if you change the policy attached to the role you specified in the roleArn field
     * (for example, to correct an invalid policy) it takes up to 5 minutes for that change to take effect.
     * </p>
     * 
     * @param putLoggingOptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutLoggingOptions operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.PutLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/PutLoggingOptions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutLoggingOptionsResult> putLoggingOptionsAsync(PutLoggingOptionsRequest putLoggingOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<PutLoggingOptionsRequest, PutLoggingOptionsResult> asyncHandler);

    /**
     * <p>
     * Simulates the results of running a pipeline activity on a message payload.
     * </p>
     * 
     * @param runPipelineActivityRequest
     * @return A Java Future containing the result of the RunPipelineActivity operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.RunPipelineActivity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/RunPipelineActivity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RunPipelineActivityResult> runPipelineActivityAsync(RunPipelineActivityRequest runPipelineActivityRequest);

    /**
     * <p>
     * Simulates the results of running a pipeline activity on a message payload.
     * </p>
     * 
     * @param runPipelineActivityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RunPipelineActivity operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.RunPipelineActivity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/RunPipelineActivity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RunPipelineActivityResult> runPipelineActivityAsync(RunPipelineActivityRequest runPipelineActivityRequest,
            com.amazonaws.handlers.AsyncHandler<RunPipelineActivityRequest, RunPipelineActivityResult> asyncHandler);

    /**
     * <p>
     * Retrieves a sample of messages from the specified channel ingested during the specified timeframe. Up to 10
     * messages can be retrieved.
     * </p>
     * 
     * @param sampleChannelDataRequest
     * @return A Java Future containing the result of the SampleChannelData operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.SampleChannelData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/SampleChannelData" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SampleChannelDataResult> sampleChannelDataAsync(SampleChannelDataRequest sampleChannelDataRequest);

    /**
     * <p>
     * Retrieves a sample of messages from the specified channel ingested during the specified timeframe. Up to 10
     * messages can be retrieved.
     * </p>
     * 
     * @param sampleChannelDataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SampleChannelData operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.SampleChannelData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/SampleChannelData" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SampleChannelDataResult> sampleChannelDataAsync(SampleChannelDataRequest sampleChannelDataRequest,
            com.amazonaws.handlers.AsyncHandler<SampleChannelDataRequest, SampleChannelDataResult> asyncHandler);

    /**
     * <p>
     * Starts the reprocessing of raw message data through the pipeline.
     * </p>
     * 
     * @param startPipelineReprocessingRequest
     * @return A Java Future containing the result of the StartPipelineReprocessing operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.StartPipelineReprocessing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/StartPipelineReprocessing"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartPipelineReprocessingResult> startPipelineReprocessingAsync(
            StartPipelineReprocessingRequest startPipelineReprocessingRequest);

    /**
     * <p>
     * Starts the reprocessing of raw message data through the pipeline.
     * </p>
     * 
     * @param startPipelineReprocessingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartPipelineReprocessing operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.StartPipelineReprocessing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/StartPipelineReprocessing"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartPipelineReprocessingResult> startPipelineReprocessingAsync(
            StartPipelineReprocessingRequest startPipelineReprocessingRequest,
            com.amazonaws.handlers.AsyncHandler<StartPipelineReprocessingRequest, StartPipelineReprocessingResult> asyncHandler);

    /**
     * <p>
     * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the given tags (metadata) from the resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the given tags (metadata) from the resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the settings of a channel.
     * </p>
     * 
     * @param updateChannelRequest
     * @return A Java Future containing the result of the UpdateChannel operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/UpdateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(UpdateChannelRequest updateChannelRequest);

    /**
     * <p>
     * Updates the settings of a channel.
     * </p>
     * 
     * @param updateChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateChannel operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/UpdateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(UpdateChannelRequest updateChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateChannelRequest, UpdateChannelResult> asyncHandler);

    /**
     * <p>
     * Updates the settings of a data set.
     * </p>
     * 
     * @param updateDatasetRequest
     * @return A Java Future containing the result of the UpdateDataset operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.UpdateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/UpdateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatasetResult> updateDatasetAsync(UpdateDatasetRequest updateDatasetRequest);

    /**
     * <p>
     * Updates the settings of a data set.
     * </p>
     * 
     * @param updateDatasetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDataset operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.UpdateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/UpdateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatasetResult> updateDatasetAsync(UpdateDatasetRequest updateDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDatasetRequest, UpdateDatasetResult> asyncHandler);

    /**
     * <p>
     * Updates the settings of a data store.
     * </p>
     * 
     * @param updateDatastoreRequest
     * @return A Java Future containing the result of the UpdateDatastore operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.UpdateDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/UpdateDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatastoreResult> updateDatastoreAsync(UpdateDatastoreRequest updateDatastoreRequest);

    /**
     * <p>
     * Updates the settings of a data store.
     * </p>
     * 
     * @param updateDatastoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDatastore operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.UpdateDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/UpdateDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatastoreResult> updateDatastoreAsync(UpdateDatastoreRequest updateDatastoreRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDatastoreRequest, UpdateDatastoreResult> asyncHandler);

    /**
     * <p>
     * Updates the settings of a pipeline. You must specify both a <code>channel</code> and a <code>datastore</code>
     * activity and, optionally, as many as 23 additional activities in the <code>pipelineActivities</code> array.
     * </p>
     * 
     * @param updatePipelineRequest
     * @return A Java Future containing the result of the UpdatePipeline operation returned by the service.
     * @sample AWSIoTAnalyticsAsync.UpdatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/UpdatePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePipelineResult> updatePipelineAsync(UpdatePipelineRequest updatePipelineRequest);

    /**
     * <p>
     * Updates the settings of a pipeline. You must specify both a <code>channel</code> and a <code>datastore</code>
     * activity and, optionally, as many as 23 additional activities in the <code>pipelineActivities</code> array.
     * </p>
     * 
     * @param updatePipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePipeline operation returned by the service.
     * @sample AWSIoTAnalyticsAsyncHandler.UpdatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/UpdatePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePipelineResult> updatePipelineAsync(UpdatePipelineRequest updatePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePipelineRequest, UpdatePipelineResult> asyncHandler);

}
