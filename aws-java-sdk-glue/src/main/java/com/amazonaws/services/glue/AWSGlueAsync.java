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
package com.amazonaws.services.glue;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;

/**
 * Interface for accessing AWS Glue asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.glue.AbstractAWSGlueAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS Glue</fullname>
 * <p>
 * Defines the public endpoint for the AWS Glue service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSGlueAsync extends AWSGlue {

    /**
     * <p>
     * Creates one or more partitions in a batch operation.
     * </p>
     * 
     * @param batchCreatePartitionRequest
     * @return A Java Future containing the result of the BatchCreatePartition operation returned by the service.
     * @sample AWSGlueAsync.BatchCreatePartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchCreatePartition" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchCreatePartitionResult> batchCreatePartitionAsync(BatchCreatePartitionRequest batchCreatePartitionRequest);

    /**
     * <p>
     * Creates one or more partitions in a batch operation.
     * </p>
     * 
     * @param batchCreatePartitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchCreatePartition operation returned by the service.
     * @sample AWSGlueAsyncHandler.BatchCreatePartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchCreatePartition" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchCreatePartitionResult> batchCreatePartitionAsync(BatchCreatePartitionRequest batchCreatePartitionRequest,
            com.amazonaws.handlers.AsyncHandler<BatchCreatePartitionRequest, BatchCreatePartitionResult> asyncHandler);

    /**
     * <p>
     * Deletes a list of connection definitions from the Data Catalog.
     * </p>
     * 
     * @param batchDeleteConnectionRequest
     * @return A Java Future containing the result of the BatchDeleteConnection operation returned by the service.
     * @sample AWSGlueAsync.BatchDeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchDeleteConnection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteConnectionResult> batchDeleteConnectionAsync(BatchDeleteConnectionRequest batchDeleteConnectionRequest);

    /**
     * <p>
     * Deletes a list of connection definitions from the Data Catalog.
     * </p>
     * 
     * @param batchDeleteConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDeleteConnection operation returned by the service.
     * @sample AWSGlueAsyncHandler.BatchDeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchDeleteConnection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteConnectionResult> batchDeleteConnectionAsync(BatchDeleteConnectionRequest batchDeleteConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteConnectionRequest, BatchDeleteConnectionResult> asyncHandler);

    /**
     * <p>
     * Deletes one or more partitions in a batch operation.
     * </p>
     * 
     * @param batchDeletePartitionRequest
     * @return A Java Future containing the result of the BatchDeletePartition operation returned by the service.
     * @sample AWSGlueAsync.BatchDeletePartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchDeletePartition" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchDeletePartitionResult> batchDeletePartitionAsync(BatchDeletePartitionRequest batchDeletePartitionRequest);

    /**
     * <p>
     * Deletes one or more partitions in a batch operation.
     * </p>
     * 
     * @param batchDeletePartitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDeletePartition operation returned by the service.
     * @sample AWSGlueAsyncHandler.BatchDeletePartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchDeletePartition" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchDeletePartitionResult> batchDeletePartitionAsync(BatchDeletePartitionRequest batchDeletePartitionRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDeletePartitionRequest, BatchDeletePartitionResult> asyncHandler);

    /**
     * <p>
     * Deletes multiple tables at once.
     * </p>
     * <note>
     * <p>
     * After completing this operation, you no longer have access to the table versions and partitions that belong to
     * the deleted table. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the
     * discretion of the service.
     * </p>
     * <p>
     * To ensure the immediate deletion of all related resources, before calling <code>BatchDeleteTable</code>, use
     * <code>DeleteTableVersion</code> or <code>BatchDeleteTableVersion</code>, and <code>DeletePartition</code> or
     * <code>BatchDeletePartition</code>, to delete any resources that belong to the table.
     * </p>
     * </note>
     * 
     * @param batchDeleteTableRequest
     * @return A Java Future containing the result of the BatchDeleteTable operation returned by the service.
     * @sample AWSGlueAsync.BatchDeleteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchDeleteTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteTableResult> batchDeleteTableAsync(BatchDeleteTableRequest batchDeleteTableRequest);

    /**
     * <p>
     * Deletes multiple tables at once.
     * </p>
     * <note>
     * <p>
     * After completing this operation, you no longer have access to the table versions and partitions that belong to
     * the deleted table. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the
     * discretion of the service.
     * </p>
     * <p>
     * To ensure the immediate deletion of all related resources, before calling <code>BatchDeleteTable</code>, use
     * <code>DeleteTableVersion</code> or <code>BatchDeleteTableVersion</code>, and <code>DeletePartition</code> or
     * <code>BatchDeletePartition</code>, to delete any resources that belong to the table.
     * </p>
     * </note>
     * 
     * @param batchDeleteTableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDeleteTable operation returned by the service.
     * @sample AWSGlueAsyncHandler.BatchDeleteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchDeleteTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteTableResult> batchDeleteTableAsync(BatchDeleteTableRequest batchDeleteTableRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteTableRequest, BatchDeleteTableResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified batch of versions of a table.
     * </p>
     * 
     * @param batchDeleteTableVersionRequest
     * @return A Java Future containing the result of the BatchDeleteTableVersion operation returned by the service.
     * @sample AWSGlueAsync.BatchDeleteTableVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchDeleteTableVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteTableVersionResult> batchDeleteTableVersionAsync(BatchDeleteTableVersionRequest batchDeleteTableVersionRequest);

    /**
     * <p>
     * Deletes a specified batch of versions of a table.
     * </p>
     * 
     * @param batchDeleteTableVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDeleteTableVersion operation returned by the service.
     * @sample AWSGlueAsyncHandler.BatchDeleteTableVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchDeleteTableVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteTableVersionResult> batchDeleteTableVersionAsync(BatchDeleteTableVersionRequest batchDeleteTableVersionRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteTableVersionRequest, BatchDeleteTableVersionResult> asyncHandler);

    /**
     * <p>
     * Returns a list of resource metadata for a given list of crawler names. After calling the
     * <code>ListCrawlers</code> operation, you can call this operation to access the data to which you have been
     * granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
     * </p>
     * 
     * @param batchGetCrawlersRequest
     * @return A Java Future containing the result of the BatchGetCrawlers operation returned by the service.
     * @sample AWSGlueAsync.BatchGetCrawlers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetCrawlers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetCrawlersResult> batchGetCrawlersAsync(BatchGetCrawlersRequest batchGetCrawlersRequest);

    /**
     * <p>
     * Returns a list of resource metadata for a given list of crawler names. After calling the
     * <code>ListCrawlers</code> operation, you can call this operation to access the data to which you have been
     * granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
     * </p>
     * 
     * @param batchGetCrawlersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetCrawlers operation returned by the service.
     * @sample AWSGlueAsyncHandler.BatchGetCrawlers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetCrawlers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetCrawlersResult> batchGetCrawlersAsync(BatchGetCrawlersRequest batchGetCrawlersRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetCrawlersRequest, BatchGetCrawlersResult> asyncHandler);

    /**
     * <p>
     * Returns a list of resource metadata for a given list of development endpoint names. After calling the
     * <code>ListDevEndpoints</code> operation, you can call this operation to access the data to which you have been
     * granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
     * </p>
     * 
     * @param batchGetDevEndpointsRequest
     * @return A Java Future containing the result of the BatchGetDevEndpoints operation returned by the service.
     * @sample AWSGlueAsync.BatchGetDevEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetDevEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetDevEndpointsResult> batchGetDevEndpointsAsync(BatchGetDevEndpointsRequest batchGetDevEndpointsRequest);

    /**
     * <p>
     * Returns a list of resource metadata for a given list of development endpoint names. After calling the
     * <code>ListDevEndpoints</code> operation, you can call this operation to access the data to which you have been
     * granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
     * </p>
     * 
     * @param batchGetDevEndpointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetDevEndpoints operation returned by the service.
     * @sample AWSGlueAsyncHandler.BatchGetDevEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetDevEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetDevEndpointsResult> batchGetDevEndpointsAsync(BatchGetDevEndpointsRequest batchGetDevEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetDevEndpointsRequest, BatchGetDevEndpointsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of resource metadata for a given list of job names. After calling the <code>ListJobs</code>
     * operation, you can call this operation to access the data to which you have been granted permissions. This
     * operation supports all IAM permissions, including permission conditions that uses tags.
     * </p>
     * 
     * @param batchGetJobsRequest
     * @return A Java Future containing the result of the BatchGetJobs operation returned by the service.
     * @sample AWSGlueAsync.BatchGetJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetJobsResult> batchGetJobsAsync(BatchGetJobsRequest batchGetJobsRequest);

    /**
     * <p>
     * Returns a list of resource metadata for a given list of job names. After calling the <code>ListJobs</code>
     * operation, you can call this operation to access the data to which you have been granted permissions. This
     * operation supports all IAM permissions, including permission conditions that uses tags.
     * </p>
     * 
     * @param batchGetJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetJobs operation returned by the service.
     * @sample AWSGlueAsyncHandler.BatchGetJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetJobsResult> batchGetJobsAsync(BatchGetJobsRequest batchGetJobsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetJobsRequest, BatchGetJobsResult> asyncHandler);

    /**
     * <p>
     * Retrieves partitions in a batch request.
     * </p>
     * 
     * @param batchGetPartitionRequest
     * @return A Java Future containing the result of the BatchGetPartition operation returned by the service.
     * @sample AWSGlueAsync.BatchGetPartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetPartition" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetPartitionResult> batchGetPartitionAsync(BatchGetPartitionRequest batchGetPartitionRequest);

    /**
     * <p>
     * Retrieves partitions in a batch request.
     * </p>
     * 
     * @param batchGetPartitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetPartition operation returned by the service.
     * @sample AWSGlueAsyncHandler.BatchGetPartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetPartition" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetPartitionResult> batchGetPartitionAsync(BatchGetPartitionRequest batchGetPartitionRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetPartitionRequest, BatchGetPartitionResult> asyncHandler);

    /**
     * <p>
     * Returns a list of resource metadata for a given list of trigger names. After calling the
     * <code>ListTriggers</code> operation, you can call this operation to access the data to which you have been
     * granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
     * </p>
     * 
     * @param batchGetTriggersRequest
     * @return A Java Future containing the result of the BatchGetTriggers operation returned by the service.
     * @sample AWSGlueAsync.BatchGetTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetTriggers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetTriggersResult> batchGetTriggersAsync(BatchGetTriggersRequest batchGetTriggersRequest);

    /**
     * <p>
     * Returns a list of resource metadata for a given list of trigger names. After calling the
     * <code>ListTriggers</code> operation, you can call this operation to access the data to which you have been
     * granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
     * </p>
     * 
     * @param batchGetTriggersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetTriggers operation returned by the service.
     * @sample AWSGlueAsyncHandler.BatchGetTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetTriggers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetTriggersResult> batchGetTriggersAsync(BatchGetTriggersRequest batchGetTriggersRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetTriggersRequest, BatchGetTriggersResult> asyncHandler);

    /**
     * <p>
     * Returns a list of resource metadata for a given list of workflow names. After calling the
     * <code>ListWorkflows</code> operation, you can call this operation to access the data to which you have been
     * granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
     * </p>
     * 
     * @param batchGetWorkflowsRequest
     * @return A Java Future containing the result of the BatchGetWorkflows operation returned by the service.
     * @sample AWSGlueAsync.BatchGetWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetWorkflows" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetWorkflowsResult> batchGetWorkflowsAsync(BatchGetWorkflowsRequest batchGetWorkflowsRequest);

    /**
     * <p>
     * Returns a list of resource metadata for a given list of workflow names. After calling the
     * <code>ListWorkflows</code> operation, you can call this operation to access the data to which you have been
     * granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
     * </p>
     * 
     * @param batchGetWorkflowsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetWorkflows operation returned by the service.
     * @sample AWSGlueAsyncHandler.BatchGetWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetWorkflows" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetWorkflowsResult> batchGetWorkflowsAsync(BatchGetWorkflowsRequest batchGetWorkflowsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetWorkflowsRequest, BatchGetWorkflowsResult> asyncHandler);

    /**
     * <p>
     * Stops one or more job runs for a specified job definition.
     * </p>
     * 
     * @param batchStopJobRunRequest
     * @return A Java Future containing the result of the BatchStopJobRun operation returned by the service.
     * @sample AWSGlueAsync.BatchStopJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchStopJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchStopJobRunResult> batchStopJobRunAsync(BatchStopJobRunRequest batchStopJobRunRequest);

    /**
     * <p>
     * Stops one or more job runs for a specified job definition.
     * </p>
     * 
     * @param batchStopJobRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchStopJobRun operation returned by the service.
     * @sample AWSGlueAsyncHandler.BatchStopJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchStopJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchStopJobRunResult> batchStopJobRunAsync(BatchStopJobRunRequest batchStopJobRunRequest,
            com.amazonaws.handlers.AsyncHandler<BatchStopJobRunRequest, BatchStopJobRunResult> asyncHandler);

    /**
     * <p>
     * Cancels (stops) a task run. Machine learning task runs are asynchronous tasks that AWS Glue runs on your behalf
     * as part of various machine learning workflows. You can cancel a machine learning task run at any time by calling
     * <code>CancelMLTaskRun</code> with a task run's parent transform's <code>TransformID</code> and the task run's
     * <code>TaskRunId</code>.
     * </p>
     * 
     * @param cancelMLTaskRunRequest
     * @return A Java Future containing the result of the CancelMLTaskRun operation returned by the service.
     * @sample AWSGlueAsync.CancelMLTaskRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CancelMLTaskRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelMLTaskRunResult> cancelMLTaskRunAsync(CancelMLTaskRunRequest cancelMLTaskRunRequest);

    /**
     * <p>
     * Cancels (stops) a task run. Machine learning task runs are asynchronous tasks that AWS Glue runs on your behalf
     * as part of various machine learning workflows. You can cancel a machine learning task run at any time by calling
     * <code>CancelMLTaskRun</code> with a task run's parent transform's <code>TransformID</code> and the task run's
     * <code>TaskRunId</code>.
     * </p>
     * 
     * @param cancelMLTaskRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelMLTaskRun operation returned by the service.
     * @sample AWSGlueAsyncHandler.CancelMLTaskRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CancelMLTaskRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelMLTaskRunResult> cancelMLTaskRunAsync(CancelMLTaskRunRequest cancelMLTaskRunRequest,
            com.amazonaws.handlers.AsyncHandler<CancelMLTaskRunRequest, CancelMLTaskRunResult> asyncHandler);

    /**
     * <p>
     * Creates a classifier in the user's account. This can be a <code>GrokClassifier</code>, an
     * <code>XMLClassifier</code>, a <code>JsonClassifier</code>, or a <code>CsvClassifier</code>, depending on which
     * field of the request is present.
     * </p>
     * 
     * @param createClassifierRequest
     * @return A Java Future containing the result of the CreateClassifier operation returned by the service.
     * @sample AWSGlueAsync.CreateClassifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateClassifier" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateClassifierResult> createClassifierAsync(CreateClassifierRequest createClassifierRequest);

    /**
     * <p>
     * Creates a classifier in the user's account. This can be a <code>GrokClassifier</code>, an
     * <code>XMLClassifier</code>, a <code>JsonClassifier</code>, or a <code>CsvClassifier</code>, depending on which
     * field of the request is present.
     * </p>
     * 
     * @param createClassifierRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateClassifier operation returned by the service.
     * @sample AWSGlueAsyncHandler.CreateClassifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateClassifier" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateClassifierResult> createClassifierAsync(CreateClassifierRequest createClassifierRequest,
            com.amazonaws.handlers.AsyncHandler<CreateClassifierRequest, CreateClassifierResult> asyncHandler);

    /**
     * <p>
     * Creates a connection definition in the Data Catalog.
     * </p>
     * 
     * @param createConnectionRequest
     * @return A Java Future containing the result of the CreateConnection operation returned by the service.
     * @sample AWSGlueAsync.CreateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateConnection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(CreateConnectionRequest createConnectionRequest);

    /**
     * <p>
     * Creates a connection definition in the Data Catalog.
     * </p>
     * 
     * @param createConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConnection operation returned by the service.
     * @sample AWSGlueAsyncHandler.CreateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateConnection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(CreateConnectionRequest createConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConnectionRequest, CreateConnectionResult> asyncHandler);

    /**
     * <p>
     * Creates a new crawler with specified targets, role, configuration, and optional schedule. At least one crawl
     * target must be specified, in the <code>s3Targets</code> field, the <code>jdbcTargets</code> field, or the
     * <code>DynamoDBTargets</code> field.
     * </p>
     * 
     * @param createCrawlerRequest
     * @return A Java Future containing the result of the CreateCrawler operation returned by the service.
     * @sample AWSGlueAsync.CreateCrawler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateCrawler" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateCrawlerResult> createCrawlerAsync(CreateCrawlerRequest createCrawlerRequest);

    /**
     * <p>
     * Creates a new crawler with specified targets, role, configuration, and optional schedule. At least one crawl
     * target must be specified, in the <code>s3Targets</code> field, the <code>jdbcTargets</code> field, or the
     * <code>DynamoDBTargets</code> field.
     * </p>
     * 
     * @param createCrawlerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCrawler operation returned by the service.
     * @sample AWSGlueAsyncHandler.CreateCrawler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateCrawler" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateCrawlerResult> createCrawlerAsync(CreateCrawlerRequest createCrawlerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCrawlerRequest, CreateCrawlerResult> asyncHandler);

    /**
     * <p>
     * Creates a new database in a Data Catalog.
     * </p>
     * 
     * @param createDatabaseRequest
     * @return A Java Future containing the result of the CreateDatabase operation returned by the service.
     * @sample AWSGlueAsync.CreateDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDatabaseResult> createDatabaseAsync(CreateDatabaseRequest createDatabaseRequest);

    /**
     * <p>
     * Creates a new database in a Data Catalog.
     * </p>
     * 
     * @param createDatabaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDatabase operation returned by the service.
     * @sample AWSGlueAsyncHandler.CreateDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDatabaseResult> createDatabaseAsync(CreateDatabaseRequest createDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDatabaseRequest, CreateDatabaseResult> asyncHandler);

    /**
     * <p>
     * Creates a new development endpoint.
     * </p>
     * 
     * @param createDevEndpointRequest
     * @return A Java Future containing the result of the CreateDevEndpoint operation returned by the service.
     * @sample AWSGlueAsync.CreateDevEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateDevEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDevEndpointResult> createDevEndpointAsync(CreateDevEndpointRequest createDevEndpointRequest);

    /**
     * <p>
     * Creates a new development endpoint.
     * </p>
     * 
     * @param createDevEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDevEndpoint operation returned by the service.
     * @sample AWSGlueAsyncHandler.CreateDevEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateDevEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDevEndpointResult> createDevEndpointAsync(CreateDevEndpointRequest createDevEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDevEndpointRequest, CreateDevEndpointResult> asyncHandler);

    /**
     * <p>
     * Creates a new job definition.
     * </p>
     * 
     * @param createJobRequest
     * @return A Java Future containing the result of the CreateJob operation returned by the service.
     * @sample AWSGlueAsync.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest createJobRequest);

    /**
     * <p>
     * Creates a new job definition.
     * </p>
     * 
     * @param createJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateJob operation returned by the service.
     * @sample AWSGlueAsyncHandler.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest createJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateJobRequest, CreateJobResult> asyncHandler);

    /**
     * <p>
     * Creates an AWS Glue machine learning transform. This operation creates the transform and all the necessary
     * parameters to train it.
     * </p>
     * <p>
     * Call this operation as the first step in the process of using a machine learning transform (such as the
     * <code>FindMatches</code> transform) for deduplicating data. You can provide an optional <code>Description</code>,
     * in addition to the parameters that you want to use for your algorithm.
     * </p>
     * <p>
     * You must also specify certain parameters for the tasks that AWS Glue runs on your behalf as part of learning from
     * your data and creating a high-quality machine learning transform. These parameters include <code>Role</code>, and
     * optionally, <code>AllocatedCapacity</code>, <code>Timeout</code>, and <code>MaxRetries</code>. For more
     * information, see <a href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-jobs-job.html">Jobs</a>.
     * </p>
     * 
     * @param createMLTransformRequest
     * @return A Java Future containing the result of the CreateMLTransform operation returned by the service.
     * @sample AWSGlueAsync.CreateMLTransform
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateMLTransform" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMLTransformResult> createMLTransformAsync(CreateMLTransformRequest createMLTransformRequest);

    /**
     * <p>
     * Creates an AWS Glue machine learning transform. This operation creates the transform and all the necessary
     * parameters to train it.
     * </p>
     * <p>
     * Call this operation as the first step in the process of using a machine learning transform (such as the
     * <code>FindMatches</code> transform) for deduplicating data. You can provide an optional <code>Description</code>,
     * in addition to the parameters that you want to use for your algorithm.
     * </p>
     * <p>
     * You must also specify certain parameters for the tasks that AWS Glue runs on your behalf as part of learning from
     * your data and creating a high-quality machine learning transform. These parameters include <code>Role</code>, and
     * optionally, <code>AllocatedCapacity</code>, <code>Timeout</code>, and <code>MaxRetries</code>. For more
     * information, see <a href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-jobs-job.html">Jobs</a>.
     * </p>
     * 
     * @param createMLTransformRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMLTransform operation returned by the service.
     * @sample AWSGlueAsyncHandler.CreateMLTransform
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateMLTransform" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMLTransformResult> createMLTransformAsync(CreateMLTransformRequest createMLTransformRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMLTransformRequest, CreateMLTransformResult> asyncHandler);

    /**
     * <p>
     * Creates a new partition.
     * </p>
     * 
     * @param createPartitionRequest
     * @return A Java Future containing the result of the CreatePartition operation returned by the service.
     * @sample AWSGlueAsync.CreatePartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreatePartition" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePartitionResult> createPartitionAsync(CreatePartitionRequest createPartitionRequest);

    /**
     * <p>
     * Creates a new partition.
     * </p>
     * 
     * @param createPartitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePartition operation returned by the service.
     * @sample AWSGlueAsyncHandler.CreatePartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreatePartition" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePartitionResult> createPartitionAsync(CreatePartitionRequest createPartitionRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePartitionRequest, CreatePartitionResult> asyncHandler);

    /**
     * <p>
     * Transforms a directed acyclic graph (DAG) into code.
     * </p>
     * 
     * @param createScriptRequest
     * @return A Java Future containing the result of the CreateScript operation returned by the service.
     * @sample AWSGlueAsync.CreateScript
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateScript" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateScriptResult> createScriptAsync(CreateScriptRequest createScriptRequest);

    /**
     * <p>
     * Transforms a directed acyclic graph (DAG) into code.
     * </p>
     * 
     * @param createScriptRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateScript operation returned by the service.
     * @sample AWSGlueAsyncHandler.CreateScript
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateScript" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateScriptResult> createScriptAsync(CreateScriptRequest createScriptRequest,
            com.amazonaws.handlers.AsyncHandler<CreateScriptRequest, CreateScriptResult> asyncHandler);

    /**
     * <p>
     * Creates a new security configuration. A security configuration is a set of security properties that can be used
     * by AWS Glue. You can use a security configuration to encrypt data at rest. For information about using security
     * configurations in AWS Glue, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/encryption-security-configuration.html">Encrypting Data Written
     * by Crawlers, Jobs, and Development Endpoints</a>.
     * </p>
     * 
     * @param createSecurityConfigurationRequest
     * @return A Java Future containing the result of the CreateSecurityConfiguration operation returned by the service.
     * @sample AWSGlueAsync.CreateSecurityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateSecurityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSecurityConfigurationResult> createSecurityConfigurationAsync(
            CreateSecurityConfigurationRequest createSecurityConfigurationRequest);

    /**
     * <p>
     * Creates a new security configuration. A security configuration is a set of security properties that can be used
     * by AWS Glue. You can use a security configuration to encrypt data at rest. For information about using security
     * configurations in AWS Glue, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/encryption-security-configuration.html">Encrypting Data Written
     * by Crawlers, Jobs, and Development Endpoints</a>.
     * </p>
     * 
     * @param createSecurityConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSecurityConfiguration operation returned by the service.
     * @sample AWSGlueAsyncHandler.CreateSecurityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateSecurityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSecurityConfigurationResult> createSecurityConfigurationAsync(
            CreateSecurityConfigurationRequest createSecurityConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSecurityConfigurationRequest, CreateSecurityConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates a new table definition in the Data Catalog.
     * </p>
     * 
     * @param createTableRequest
     * @return A Java Future containing the result of the CreateTable operation returned by the service.
     * @sample AWSGlueAsync.CreateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTableResult> createTableAsync(CreateTableRequest createTableRequest);

    /**
     * <p>
     * Creates a new table definition in the Data Catalog.
     * </p>
     * 
     * @param createTableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTable operation returned by the service.
     * @sample AWSGlueAsyncHandler.CreateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTableResult> createTableAsync(CreateTableRequest createTableRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTableRequest, CreateTableResult> asyncHandler);

    /**
     * <p>
     * Creates a new trigger.
     * </p>
     * 
     * @param createTriggerRequest
     * @return A Java Future containing the result of the CreateTrigger operation returned by the service.
     * @sample AWSGlueAsync.CreateTrigger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateTrigger" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTriggerResult> createTriggerAsync(CreateTriggerRequest createTriggerRequest);

    /**
     * <p>
     * Creates a new trigger.
     * </p>
     * 
     * @param createTriggerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTrigger operation returned by the service.
     * @sample AWSGlueAsyncHandler.CreateTrigger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateTrigger" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTriggerResult> createTriggerAsync(CreateTriggerRequest createTriggerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTriggerRequest, CreateTriggerResult> asyncHandler);

    /**
     * <p>
     * Creates a new function definition in the Data Catalog.
     * </p>
     * 
     * @param createUserDefinedFunctionRequest
     * @return A Java Future containing the result of the CreateUserDefinedFunction operation returned by the service.
     * @sample AWSGlueAsync.CreateUserDefinedFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateUserDefinedFunction" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateUserDefinedFunctionResult> createUserDefinedFunctionAsync(
            CreateUserDefinedFunctionRequest createUserDefinedFunctionRequest);

    /**
     * <p>
     * Creates a new function definition in the Data Catalog.
     * </p>
     * 
     * @param createUserDefinedFunctionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUserDefinedFunction operation returned by the service.
     * @sample AWSGlueAsyncHandler.CreateUserDefinedFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateUserDefinedFunction" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateUserDefinedFunctionResult> createUserDefinedFunctionAsync(
            CreateUserDefinedFunctionRequest createUserDefinedFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserDefinedFunctionRequest, CreateUserDefinedFunctionResult> asyncHandler);

    /**
     * <p>
     * Creates a new workflow.
     * </p>
     * 
     * @param createWorkflowRequest
     * @return A Java Future containing the result of the CreateWorkflow operation returned by the service.
     * @sample AWSGlueAsync.CreateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkflowResult> createWorkflowAsync(CreateWorkflowRequest createWorkflowRequest);

    /**
     * <p>
     * Creates a new workflow.
     * </p>
     * 
     * @param createWorkflowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkflow operation returned by the service.
     * @sample AWSGlueAsyncHandler.CreateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkflowResult> createWorkflowAsync(CreateWorkflowRequest createWorkflowRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkflowRequest, CreateWorkflowResult> asyncHandler);

    /**
     * <p>
     * Removes a classifier from the Data Catalog.
     * </p>
     * 
     * @param deleteClassifierRequest
     * @return A Java Future containing the result of the DeleteClassifier operation returned by the service.
     * @sample AWSGlueAsync.DeleteClassifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteClassifier" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteClassifierResult> deleteClassifierAsync(DeleteClassifierRequest deleteClassifierRequest);

    /**
     * <p>
     * Removes a classifier from the Data Catalog.
     * </p>
     * 
     * @param deleteClassifierRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteClassifier operation returned by the service.
     * @sample AWSGlueAsyncHandler.DeleteClassifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteClassifier" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteClassifierResult> deleteClassifierAsync(DeleteClassifierRequest deleteClassifierRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteClassifierRequest, DeleteClassifierResult> asyncHandler);

    /**
     * <p>
     * Deletes a connection from the Data Catalog.
     * </p>
     * 
     * @param deleteConnectionRequest
     * @return A Java Future containing the result of the DeleteConnection operation returned by the service.
     * @sample AWSGlueAsync.DeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteConnection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest deleteConnectionRequest);

    /**
     * <p>
     * Deletes a connection from the Data Catalog.
     * </p>
     * 
     * @param deleteConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConnection operation returned by the service.
     * @sample AWSGlueAsyncHandler.DeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteConnection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest deleteConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConnectionRequest, DeleteConnectionResult> asyncHandler);

    /**
     * <p>
     * Removes a specified crawler from the AWS Glue Data Catalog, unless the crawler state is <code>RUNNING</code>.
     * </p>
     * 
     * @param deleteCrawlerRequest
     * @return A Java Future containing the result of the DeleteCrawler operation returned by the service.
     * @sample AWSGlueAsync.DeleteCrawler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteCrawler" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteCrawlerResult> deleteCrawlerAsync(DeleteCrawlerRequest deleteCrawlerRequest);

    /**
     * <p>
     * Removes a specified crawler from the AWS Glue Data Catalog, unless the crawler state is <code>RUNNING</code>.
     * </p>
     * 
     * @param deleteCrawlerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCrawler operation returned by the service.
     * @sample AWSGlueAsyncHandler.DeleteCrawler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteCrawler" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteCrawlerResult> deleteCrawlerAsync(DeleteCrawlerRequest deleteCrawlerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCrawlerRequest, DeleteCrawlerResult> asyncHandler);

    /**
     * <p>
     * Removes a specified database from a Data Catalog.
     * </p>
     * <note>
     * <p>
     * After completing this operation, you no longer have access to the tables (and all table versions and partitions
     * that might belong to the tables) and the user-defined functions in the deleted database. AWS Glue deletes these
     * "orphaned" resources asynchronously in a timely manner, at the discretion of the service.
     * </p>
     * <p>
     * To ensure the immediate deletion of all related resources, before calling <code>DeleteDatabase</code>, use
     * <code>DeleteTableVersion</code> or <code>BatchDeleteTableVersion</code>, <code>DeletePartition</code> or
     * <code>BatchDeletePartition</code>, <code>DeleteUserDefinedFunction</code>, and <code>DeleteTable</code> or
     * <code>BatchDeleteTable</code>, to delete any resources that belong to the database.
     * </p>
     * </note>
     * 
     * @param deleteDatabaseRequest
     * @return A Java Future containing the result of the DeleteDatabase operation returned by the service.
     * @sample AWSGlueAsync.DeleteDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatabaseResult> deleteDatabaseAsync(DeleteDatabaseRequest deleteDatabaseRequest);

    /**
     * <p>
     * Removes a specified database from a Data Catalog.
     * </p>
     * <note>
     * <p>
     * After completing this operation, you no longer have access to the tables (and all table versions and partitions
     * that might belong to the tables) and the user-defined functions in the deleted database. AWS Glue deletes these
     * "orphaned" resources asynchronously in a timely manner, at the discretion of the service.
     * </p>
     * <p>
     * To ensure the immediate deletion of all related resources, before calling <code>DeleteDatabase</code>, use
     * <code>DeleteTableVersion</code> or <code>BatchDeleteTableVersion</code>, <code>DeletePartition</code> or
     * <code>BatchDeletePartition</code>, <code>DeleteUserDefinedFunction</code>, and <code>DeleteTable</code> or
     * <code>BatchDeleteTable</code>, to delete any resources that belong to the database.
     * </p>
     * </note>
     * 
     * @param deleteDatabaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDatabase operation returned by the service.
     * @sample AWSGlueAsyncHandler.DeleteDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatabaseResult> deleteDatabaseAsync(DeleteDatabaseRequest deleteDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDatabaseRequest, DeleteDatabaseResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified development endpoint.
     * </p>
     * 
     * @param deleteDevEndpointRequest
     * @return A Java Future containing the result of the DeleteDevEndpoint operation returned by the service.
     * @sample AWSGlueAsync.DeleteDevEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteDevEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDevEndpointResult> deleteDevEndpointAsync(DeleteDevEndpointRequest deleteDevEndpointRequest);

    /**
     * <p>
     * Deletes a specified development endpoint.
     * </p>
     * 
     * @param deleteDevEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDevEndpoint operation returned by the service.
     * @sample AWSGlueAsyncHandler.DeleteDevEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteDevEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDevEndpointResult> deleteDevEndpointAsync(DeleteDevEndpointRequest deleteDevEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDevEndpointRequest, DeleteDevEndpointResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified job definition. If the job definition is not found, no exception is thrown.
     * </p>
     * 
     * @param deleteJobRequest
     * @return A Java Future containing the result of the DeleteJob operation returned by the service.
     * @sample AWSGlueAsync.DeleteJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteJobResult> deleteJobAsync(DeleteJobRequest deleteJobRequest);

    /**
     * <p>
     * Deletes a specified job definition. If the job definition is not found, no exception is thrown.
     * </p>
     * 
     * @param deleteJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteJob operation returned by the service.
     * @sample AWSGlueAsyncHandler.DeleteJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteJobResult> deleteJobAsync(DeleteJobRequest deleteJobRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteJobRequest, DeleteJobResult> asyncHandler);

    /**
     * <p>
     * Deletes an AWS Glue machine learning transform. Machine learning transforms are a special type of transform that
     * use machine learning to learn the details of the transformation to be performed by learning from examples
     * provided by humans. These transformations are then saved by AWS Glue. If you no longer need a transform, you can
     * delete it by calling <code>DeleteMLTransforms</code>. However, any AWS Glue jobs that still reference the deleted
     * transform will no longer succeed.
     * </p>
     * 
     * @param deleteMLTransformRequest
     * @return A Java Future containing the result of the DeleteMLTransform operation returned by the service.
     * @sample AWSGlueAsync.DeleteMLTransform
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteMLTransform" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMLTransformResult> deleteMLTransformAsync(DeleteMLTransformRequest deleteMLTransformRequest);

    /**
     * <p>
     * Deletes an AWS Glue machine learning transform. Machine learning transforms are a special type of transform that
     * use machine learning to learn the details of the transformation to be performed by learning from examples
     * provided by humans. These transformations are then saved by AWS Glue. If you no longer need a transform, you can
     * delete it by calling <code>DeleteMLTransforms</code>. However, any AWS Glue jobs that still reference the deleted
     * transform will no longer succeed.
     * </p>
     * 
     * @param deleteMLTransformRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMLTransform operation returned by the service.
     * @sample AWSGlueAsyncHandler.DeleteMLTransform
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteMLTransform" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMLTransformResult> deleteMLTransformAsync(DeleteMLTransformRequest deleteMLTransformRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMLTransformRequest, DeleteMLTransformResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified partition.
     * </p>
     * 
     * @param deletePartitionRequest
     * @return A Java Future containing the result of the DeletePartition operation returned by the service.
     * @sample AWSGlueAsync.DeletePartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeletePartition" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePartitionResult> deletePartitionAsync(DeletePartitionRequest deletePartitionRequest);

    /**
     * <p>
     * Deletes a specified partition.
     * </p>
     * 
     * @param deletePartitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePartition operation returned by the service.
     * @sample AWSGlueAsyncHandler.DeletePartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeletePartition" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePartitionResult> deletePartitionAsync(DeletePartitionRequest deletePartitionRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePartitionRequest, DeletePartitionResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified policy.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return A Java Future containing the result of the DeleteResourcePolicy operation returned by the service.
     * @sample AWSGlueAsync.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteResourcePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest deleteResourcePolicyRequest);

    /**
     * <p>
     * Deletes a specified policy.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResourcePolicy operation returned by the service.
     * @sample AWSGlueAsyncHandler.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteResourcePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest deleteResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified security configuration.
     * </p>
     * 
     * @param deleteSecurityConfigurationRequest
     * @return A Java Future containing the result of the DeleteSecurityConfiguration operation returned by the service.
     * @sample AWSGlueAsync.DeleteSecurityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteSecurityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSecurityConfigurationResult> deleteSecurityConfigurationAsync(
            DeleteSecurityConfigurationRequest deleteSecurityConfigurationRequest);

    /**
     * <p>
     * Deletes a specified security configuration.
     * </p>
     * 
     * @param deleteSecurityConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSecurityConfiguration operation returned by the service.
     * @sample AWSGlueAsyncHandler.DeleteSecurityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteSecurityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSecurityConfigurationResult> deleteSecurityConfigurationAsync(
            DeleteSecurityConfigurationRequest deleteSecurityConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSecurityConfigurationRequest, DeleteSecurityConfigurationResult> asyncHandler);

    /**
     * <p>
     * Removes a table definition from the Data Catalog.
     * </p>
     * <note>
     * <p>
     * After completing this operation, you no longer have access to the table versions and partitions that belong to
     * the deleted table. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the
     * discretion of the service.
     * </p>
     * <p>
     * To ensure the immediate deletion of all related resources, before calling <code>DeleteTable</code>, use
     * <code>DeleteTableVersion</code> or <code>BatchDeleteTableVersion</code>, and <code>DeletePartition</code> or
     * <code>BatchDeletePartition</code>, to delete any resources that belong to the table.
     * </p>
     * </note>
     * 
     * @param deleteTableRequest
     * @return A Java Future containing the result of the DeleteTable operation returned by the service.
     * @sample AWSGlueAsync.DeleteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTableResult> deleteTableAsync(DeleteTableRequest deleteTableRequest);

    /**
     * <p>
     * Removes a table definition from the Data Catalog.
     * </p>
     * <note>
     * <p>
     * After completing this operation, you no longer have access to the table versions and partitions that belong to
     * the deleted table. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the
     * discretion of the service.
     * </p>
     * <p>
     * To ensure the immediate deletion of all related resources, before calling <code>DeleteTable</code>, use
     * <code>DeleteTableVersion</code> or <code>BatchDeleteTableVersion</code>, and <code>DeletePartition</code> or
     * <code>BatchDeletePartition</code>, to delete any resources that belong to the table.
     * </p>
     * </note>
     * 
     * @param deleteTableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTable operation returned by the service.
     * @sample AWSGlueAsyncHandler.DeleteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTableResult> deleteTableAsync(DeleteTableRequest deleteTableRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTableRequest, DeleteTableResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified version of a table.
     * </p>
     * 
     * @param deleteTableVersionRequest
     * @return A Java Future containing the result of the DeleteTableVersion operation returned by the service.
     * @sample AWSGlueAsync.DeleteTableVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteTableVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTableVersionResult> deleteTableVersionAsync(DeleteTableVersionRequest deleteTableVersionRequest);

    /**
     * <p>
     * Deletes a specified version of a table.
     * </p>
     * 
     * @param deleteTableVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTableVersion operation returned by the service.
     * @sample AWSGlueAsyncHandler.DeleteTableVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteTableVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTableVersionResult> deleteTableVersionAsync(DeleteTableVersionRequest deleteTableVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTableVersionRequest, DeleteTableVersionResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified trigger. If the trigger is not found, no exception is thrown.
     * </p>
     * 
     * @param deleteTriggerRequest
     * @return A Java Future containing the result of the DeleteTrigger operation returned by the service.
     * @sample AWSGlueAsync.DeleteTrigger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteTrigger" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTriggerResult> deleteTriggerAsync(DeleteTriggerRequest deleteTriggerRequest);

    /**
     * <p>
     * Deletes a specified trigger. If the trigger is not found, no exception is thrown.
     * </p>
     * 
     * @param deleteTriggerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTrigger operation returned by the service.
     * @sample AWSGlueAsyncHandler.DeleteTrigger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteTrigger" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTriggerResult> deleteTriggerAsync(DeleteTriggerRequest deleteTriggerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTriggerRequest, DeleteTriggerResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing function definition from the Data Catalog.
     * </p>
     * 
     * @param deleteUserDefinedFunctionRequest
     * @return A Java Future containing the result of the DeleteUserDefinedFunction operation returned by the service.
     * @sample AWSGlueAsync.DeleteUserDefinedFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteUserDefinedFunction" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserDefinedFunctionResult> deleteUserDefinedFunctionAsync(
            DeleteUserDefinedFunctionRequest deleteUserDefinedFunctionRequest);

    /**
     * <p>
     * Deletes an existing function definition from the Data Catalog.
     * </p>
     * 
     * @param deleteUserDefinedFunctionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUserDefinedFunction operation returned by the service.
     * @sample AWSGlueAsyncHandler.DeleteUserDefinedFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteUserDefinedFunction" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserDefinedFunctionResult> deleteUserDefinedFunctionAsync(
            DeleteUserDefinedFunctionRequest deleteUserDefinedFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserDefinedFunctionRequest, DeleteUserDefinedFunctionResult> asyncHandler);

    /**
     * <p>
     * Deletes a workflow.
     * </p>
     * 
     * @param deleteWorkflowRequest
     * @return A Java Future containing the result of the DeleteWorkflow operation returned by the service.
     * @sample AWSGlueAsync.DeleteWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkflowResult> deleteWorkflowAsync(DeleteWorkflowRequest deleteWorkflowRequest);

    /**
     * <p>
     * Deletes a workflow.
     * </p>
     * 
     * @param deleteWorkflowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWorkflow operation returned by the service.
     * @sample AWSGlueAsyncHandler.DeleteWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkflowResult> deleteWorkflowAsync(DeleteWorkflowRequest deleteWorkflowRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkflowRequest, DeleteWorkflowResult> asyncHandler);

    /**
     * <p>
     * Retrieves the status of a migration operation.
     * </p>
     * 
     * @param getCatalogImportStatusRequest
     * @return A Java Future containing the result of the GetCatalogImportStatus operation returned by the service.
     * @sample AWSGlueAsync.GetCatalogImportStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetCatalogImportStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCatalogImportStatusResult> getCatalogImportStatusAsync(GetCatalogImportStatusRequest getCatalogImportStatusRequest);

    /**
     * <p>
     * Retrieves the status of a migration operation.
     * </p>
     * 
     * @param getCatalogImportStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCatalogImportStatus operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetCatalogImportStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetCatalogImportStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCatalogImportStatusResult> getCatalogImportStatusAsync(GetCatalogImportStatusRequest getCatalogImportStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetCatalogImportStatusRequest, GetCatalogImportStatusResult> asyncHandler);

    /**
     * <p>
     * Retrieve a classifier by name.
     * </p>
     * 
     * @param getClassifierRequest
     * @return A Java Future containing the result of the GetClassifier operation returned by the service.
     * @sample AWSGlueAsync.GetClassifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetClassifier" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetClassifierResult> getClassifierAsync(GetClassifierRequest getClassifierRequest);

    /**
     * <p>
     * Retrieve a classifier by name.
     * </p>
     * 
     * @param getClassifierRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetClassifier operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetClassifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetClassifier" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetClassifierResult> getClassifierAsync(GetClassifierRequest getClassifierRequest,
            com.amazonaws.handlers.AsyncHandler<GetClassifierRequest, GetClassifierResult> asyncHandler);

    /**
     * <p>
     * Lists all classifier objects in the Data Catalog.
     * </p>
     * 
     * @param getClassifiersRequest
     * @return A Java Future containing the result of the GetClassifiers operation returned by the service.
     * @sample AWSGlueAsync.GetClassifiers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetClassifiers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetClassifiersResult> getClassifiersAsync(GetClassifiersRequest getClassifiersRequest);

    /**
     * <p>
     * Lists all classifier objects in the Data Catalog.
     * </p>
     * 
     * @param getClassifiersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetClassifiers operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetClassifiers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetClassifiers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetClassifiersResult> getClassifiersAsync(GetClassifiersRequest getClassifiersRequest,
            com.amazonaws.handlers.AsyncHandler<GetClassifiersRequest, GetClassifiersResult> asyncHandler);

    /**
     * <p>
     * Retrieves a connection definition from the Data Catalog.
     * </p>
     * 
     * @param getConnectionRequest
     * @return A Java Future containing the result of the GetConnection operation returned by the service.
     * @sample AWSGlueAsync.GetConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetConnection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetConnectionResult> getConnectionAsync(GetConnectionRequest getConnectionRequest);

    /**
     * <p>
     * Retrieves a connection definition from the Data Catalog.
     * </p>
     * 
     * @param getConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConnection operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetConnection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetConnectionResult> getConnectionAsync(GetConnectionRequest getConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<GetConnectionRequest, GetConnectionResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of connection definitions from the Data Catalog.
     * </p>
     * 
     * @param getConnectionsRequest
     * @return A Java Future containing the result of the GetConnections operation returned by the service.
     * @sample AWSGlueAsync.GetConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetConnections" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetConnectionsResult> getConnectionsAsync(GetConnectionsRequest getConnectionsRequest);

    /**
     * <p>
     * Retrieves a list of connection definitions from the Data Catalog.
     * </p>
     * 
     * @param getConnectionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConnections operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetConnections" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetConnectionsResult> getConnectionsAsync(GetConnectionsRequest getConnectionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetConnectionsRequest, GetConnectionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves metadata for a specified crawler.
     * </p>
     * 
     * @param getCrawlerRequest
     * @return A Java Future containing the result of the GetCrawler operation returned by the service.
     * @sample AWSGlueAsync.GetCrawler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetCrawler" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCrawlerResult> getCrawlerAsync(GetCrawlerRequest getCrawlerRequest);

    /**
     * <p>
     * Retrieves metadata for a specified crawler.
     * </p>
     * 
     * @param getCrawlerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCrawler operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetCrawler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetCrawler" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCrawlerResult> getCrawlerAsync(GetCrawlerRequest getCrawlerRequest,
            com.amazonaws.handlers.AsyncHandler<GetCrawlerRequest, GetCrawlerResult> asyncHandler);

    /**
     * <p>
     * Retrieves metrics about specified crawlers.
     * </p>
     * 
     * @param getCrawlerMetricsRequest
     * @return A Java Future containing the result of the GetCrawlerMetrics operation returned by the service.
     * @sample AWSGlueAsync.GetCrawlerMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetCrawlerMetrics" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCrawlerMetricsResult> getCrawlerMetricsAsync(GetCrawlerMetricsRequest getCrawlerMetricsRequest);

    /**
     * <p>
     * Retrieves metrics about specified crawlers.
     * </p>
     * 
     * @param getCrawlerMetricsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCrawlerMetrics operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetCrawlerMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetCrawlerMetrics" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCrawlerMetricsResult> getCrawlerMetricsAsync(GetCrawlerMetricsRequest getCrawlerMetricsRequest,
            com.amazonaws.handlers.AsyncHandler<GetCrawlerMetricsRequest, GetCrawlerMetricsResult> asyncHandler);

    /**
     * <p>
     * Retrieves metadata for all crawlers defined in the customer account.
     * </p>
     * 
     * @param getCrawlersRequest
     * @return A Java Future containing the result of the GetCrawlers operation returned by the service.
     * @sample AWSGlueAsync.GetCrawlers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetCrawlers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCrawlersResult> getCrawlersAsync(GetCrawlersRequest getCrawlersRequest);

    /**
     * <p>
     * Retrieves metadata for all crawlers defined in the customer account.
     * </p>
     * 
     * @param getCrawlersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCrawlers operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetCrawlers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetCrawlers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCrawlersResult> getCrawlersAsync(GetCrawlersRequest getCrawlersRequest,
            com.amazonaws.handlers.AsyncHandler<GetCrawlersRequest, GetCrawlersResult> asyncHandler);

    /**
     * <p>
     * Retrieves the security configuration for a specified catalog.
     * </p>
     * 
     * @param getDataCatalogEncryptionSettingsRequest
     * @return A Java Future containing the result of the GetDataCatalogEncryptionSettings operation returned by the
     *         service.
     * @sample AWSGlueAsync.GetDataCatalogEncryptionSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDataCatalogEncryptionSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDataCatalogEncryptionSettingsResult> getDataCatalogEncryptionSettingsAsync(
            GetDataCatalogEncryptionSettingsRequest getDataCatalogEncryptionSettingsRequest);

    /**
     * <p>
     * Retrieves the security configuration for a specified catalog.
     * </p>
     * 
     * @param getDataCatalogEncryptionSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataCatalogEncryptionSettings operation returned by the
     *         service.
     * @sample AWSGlueAsyncHandler.GetDataCatalogEncryptionSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDataCatalogEncryptionSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDataCatalogEncryptionSettingsResult> getDataCatalogEncryptionSettingsAsync(
            GetDataCatalogEncryptionSettingsRequest getDataCatalogEncryptionSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDataCatalogEncryptionSettingsRequest, GetDataCatalogEncryptionSettingsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the definition of a specified database.
     * </p>
     * 
     * @param getDatabaseRequest
     * @return A Java Future containing the result of the GetDatabase operation returned by the service.
     * @sample AWSGlueAsync.GetDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDatabaseResult> getDatabaseAsync(GetDatabaseRequest getDatabaseRequest);

    /**
     * <p>
     * Retrieves the definition of a specified database.
     * </p>
     * 
     * @param getDatabaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDatabase operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDatabaseResult> getDatabaseAsync(GetDatabaseRequest getDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<GetDatabaseRequest, GetDatabaseResult> asyncHandler);

    /**
     * <p>
     * Retrieves all databases defined in a given Data Catalog.
     * </p>
     * 
     * @param getDatabasesRequest
     * @return A Java Future containing the result of the GetDatabases operation returned by the service.
     * @sample AWSGlueAsync.GetDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDatabases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDatabasesResult> getDatabasesAsync(GetDatabasesRequest getDatabasesRequest);

    /**
     * <p>
     * Retrieves all databases defined in a given Data Catalog.
     * </p>
     * 
     * @param getDatabasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDatabases operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDatabases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDatabasesResult> getDatabasesAsync(GetDatabasesRequest getDatabasesRequest,
            com.amazonaws.handlers.AsyncHandler<GetDatabasesRequest, GetDatabasesResult> asyncHandler);

    /**
     * <p>
     * Transforms a Python script into a directed acyclic graph (DAG).
     * </p>
     * 
     * @param getDataflowGraphRequest
     * @return A Java Future containing the result of the GetDataflowGraph operation returned by the service.
     * @sample AWSGlueAsync.GetDataflowGraph
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDataflowGraph" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDataflowGraphResult> getDataflowGraphAsync(GetDataflowGraphRequest getDataflowGraphRequest);

    /**
     * <p>
     * Transforms a Python script into a directed acyclic graph (DAG).
     * </p>
     * 
     * @param getDataflowGraphRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataflowGraph operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetDataflowGraph
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDataflowGraph" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDataflowGraphResult> getDataflowGraphAsync(GetDataflowGraphRequest getDataflowGraphRequest,
            com.amazonaws.handlers.AsyncHandler<GetDataflowGraphRequest, GetDataflowGraphResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a specified development endpoint.
     * </p>
     * <note>
     * <p>
     * When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP
     * address, and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS
     * Glue returns only a public IP address.
     * </p>
     * </note>
     * 
     * @param getDevEndpointRequest
     * @return A Java Future containing the result of the GetDevEndpoint operation returned by the service.
     * @sample AWSGlueAsync.GetDevEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDevEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDevEndpointResult> getDevEndpointAsync(GetDevEndpointRequest getDevEndpointRequest);

    /**
     * <p>
     * Retrieves information about a specified development endpoint.
     * </p>
     * <note>
     * <p>
     * When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP
     * address, and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS
     * Glue returns only a public IP address.
     * </p>
     * </note>
     * 
     * @param getDevEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDevEndpoint operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetDevEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDevEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDevEndpointResult> getDevEndpointAsync(GetDevEndpointRequest getDevEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<GetDevEndpointRequest, GetDevEndpointResult> asyncHandler);

    /**
     * <p>
     * Retrieves all the development endpoints in this AWS account.
     * </p>
     * <note>
     * <p>
     * When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP
     * address and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS
     * Glue returns only a public IP address.
     * </p>
     * </note>
     * 
     * @param getDevEndpointsRequest
     * @return A Java Future containing the result of the GetDevEndpoints operation returned by the service.
     * @sample AWSGlueAsync.GetDevEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDevEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDevEndpointsResult> getDevEndpointsAsync(GetDevEndpointsRequest getDevEndpointsRequest);

    /**
     * <p>
     * Retrieves all the development endpoints in this AWS account.
     * </p>
     * <note>
     * <p>
     * When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP
     * address and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS
     * Glue returns only a public IP address.
     * </p>
     * </note>
     * 
     * @param getDevEndpointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDevEndpoints operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetDevEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDevEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDevEndpointsResult> getDevEndpointsAsync(GetDevEndpointsRequest getDevEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDevEndpointsRequest, GetDevEndpointsResult> asyncHandler);

    /**
     * <p>
     * Retrieves an existing job definition.
     * </p>
     * 
     * @param getJobRequest
     * @return A Java Future containing the result of the GetJob operation returned by the service.
     * @sample AWSGlueAsync.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobResult> getJobAsync(GetJobRequest getJobRequest);

    /**
     * <p>
     * Retrieves an existing job definition.
     * </p>
     * 
     * @param getJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetJob operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobResult> getJobAsync(GetJobRequest getJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetJobRequest, GetJobResult> asyncHandler);

    /**
     * <p>
     * Returns information on a job bookmark entry.
     * </p>
     * 
     * @param getJobBookmarkRequest
     * @return A Java Future containing the result of the GetJobBookmark operation returned by the service.
     * @sample AWSGlueAsync.GetJobBookmark
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetJobBookmark" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobBookmarkResult> getJobBookmarkAsync(GetJobBookmarkRequest getJobBookmarkRequest);

    /**
     * <p>
     * Returns information on a job bookmark entry.
     * </p>
     * 
     * @param getJobBookmarkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetJobBookmark operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetJobBookmark
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetJobBookmark" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobBookmarkResult> getJobBookmarkAsync(GetJobBookmarkRequest getJobBookmarkRequest,
            com.amazonaws.handlers.AsyncHandler<GetJobBookmarkRequest, GetJobBookmarkResult> asyncHandler);

    /**
     * <p>
     * Retrieves the metadata for a given job run.
     * </p>
     * 
     * @param getJobRunRequest
     * @return A Java Future containing the result of the GetJobRun operation returned by the service.
     * @sample AWSGlueAsync.GetJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobRunResult> getJobRunAsync(GetJobRunRequest getJobRunRequest);

    /**
     * <p>
     * Retrieves the metadata for a given job run.
     * </p>
     * 
     * @param getJobRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetJobRun operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobRunResult> getJobRunAsync(GetJobRunRequest getJobRunRequest,
            com.amazonaws.handlers.AsyncHandler<GetJobRunRequest, GetJobRunResult> asyncHandler);

    /**
     * <p>
     * Retrieves metadata for all runs of a given job definition.
     * </p>
     * 
     * @param getJobRunsRequest
     * @return A Java Future containing the result of the GetJobRuns operation returned by the service.
     * @sample AWSGlueAsync.GetJobRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetJobRuns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobRunsResult> getJobRunsAsync(GetJobRunsRequest getJobRunsRequest);

    /**
     * <p>
     * Retrieves metadata for all runs of a given job definition.
     * </p>
     * 
     * @param getJobRunsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetJobRuns operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetJobRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetJobRuns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobRunsResult> getJobRunsAsync(GetJobRunsRequest getJobRunsRequest,
            com.amazonaws.handlers.AsyncHandler<GetJobRunsRequest, GetJobRunsResult> asyncHandler);

    /**
     * <p>
     * Retrieves all current job definitions.
     * </p>
     * 
     * @param getJobsRequest
     * @return A Java Future containing the result of the GetJobs operation returned by the service.
     * @sample AWSGlueAsync.GetJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobsResult> getJobsAsync(GetJobsRequest getJobsRequest);

    /**
     * <p>
     * Retrieves all current job definitions.
     * </p>
     * 
     * @param getJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetJobs operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobsResult> getJobsAsync(GetJobsRequest getJobsRequest,
            com.amazonaws.handlers.AsyncHandler<GetJobsRequest, GetJobsResult> asyncHandler);

    /**
     * <p>
     * Gets details for a specific task run on a machine learning transform. Machine learning task runs are asynchronous
     * tasks that AWS Glue runs on your behalf as part of various machine learning workflows. You can check the stats of
     * any task run by calling <code>GetMLTaskRun</code> with the <code>TaskRunID</code> and its parent transform's
     * <code>TransformID</code>.
     * </p>
     * 
     * @param getMLTaskRunRequest
     * @return A Java Future containing the result of the GetMLTaskRun operation returned by the service.
     * @sample AWSGlueAsync.GetMLTaskRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetMLTaskRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMLTaskRunResult> getMLTaskRunAsync(GetMLTaskRunRequest getMLTaskRunRequest);

    /**
     * <p>
     * Gets details for a specific task run on a machine learning transform. Machine learning task runs are asynchronous
     * tasks that AWS Glue runs on your behalf as part of various machine learning workflows. You can check the stats of
     * any task run by calling <code>GetMLTaskRun</code> with the <code>TaskRunID</code> and its parent transform's
     * <code>TransformID</code>.
     * </p>
     * 
     * @param getMLTaskRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMLTaskRun operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetMLTaskRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetMLTaskRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMLTaskRunResult> getMLTaskRunAsync(GetMLTaskRunRequest getMLTaskRunRequest,
            com.amazonaws.handlers.AsyncHandler<GetMLTaskRunRequest, GetMLTaskRunResult> asyncHandler);

    /**
     * <p>
     * Gets a list of runs for a machine learning transform. Machine learning task runs are asynchronous tasks that AWS
     * Glue runs on your behalf as part of various machine learning workflows. You can get a sortable, filterable list
     * of machine learning task runs by calling <code>GetMLTaskRuns</code> with their parent transform's
     * <code>TransformID</code> and other optional parameters as documented in this section.
     * </p>
     * <p>
     * This operation returns a list of historic runs and must be paginated.
     * </p>
     * 
     * @param getMLTaskRunsRequest
     * @return A Java Future containing the result of the GetMLTaskRuns operation returned by the service.
     * @sample AWSGlueAsync.GetMLTaskRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetMLTaskRuns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMLTaskRunsResult> getMLTaskRunsAsync(GetMLTaskRunsRequest getMLTaskRunsRequest);

    /**
     * <p>
     * Gets a list of runs for a machine learning transform. Machine learning task runs are asynchronous tasks that AWS
     * Glue runs on your behalf as part of various machine learning workflows. You can get a sortable, filterable list
     * of machine learning task runs by calling <code>GetMLTaskRuns</code> with their parent transform's
     * <code>TransformID</code> and other optional parameters as documented in this section.
     * </p>
     * <p>
     * This operation returns a list of historic runs and must be paginated.
     * </p>
     * 
     * @param getMLTaskRunsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMLTaskRuns operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetMLTaskRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetMLTaskRuns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMLTaskRunsResult> getMLTaskRunsAsync(GetMLTaskRunsRequest getMLTaskRunsRequest,
            com.amazonaws.handlers.AsyncHandler<GetMLTaskRunsRequest, GetMLTaskRunsResult> asyncHandler);

    /**
     * <p>
     * Gets an AWS Glue machine learning transform artifact and all its corresponding metadata. Machine learning
     * transforms are a special type of transform that use machine learning to learn the details of the transformation
     * to be performed by learning from examples provided by humans. These transformations are then saved by AWS Glue.
     * You can retrieve their metadata by calling <code>GetMLTransform</code>.
     * </p>
     * 
     * @param getMLTransformRequest
     * @return A Java Future containing the result of the GetMLTransform operation returned by the service.
     * @sample AWSGlueAsync.GetMLTransform
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetMLTransform" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMLTransformResult> getMLTransformAsync(GetMLTransformRequest getMLTransformRequest);

    /**
     * <p>
     * Gets an AWS Glue machine learning transform artifact and all its corresponding metadata. Machine learning
     * transforms are a special type of transform that use machine learning to learn the details of the transformation
     * to be performed by learning from examples provided by humans. These transformations are then saved by AWS Glue.
     * You can retrieve their metadata by calling <code>GetMLTransform</code>.
     * </p>
     * 
     * @param getMLTransformRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMLTransform operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetMLTransform
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetMLTransform" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMLTransformResult> getMLTransformAsync(GetMLTransformRequest getMLTransformRequest,
            com.amazonaws.handlers.AsyncHandler<GetMLTransformRequest, GetMLTransformResult> asyncHandler);

    /**
     * <p>
     * Gets a sortable, filterable list of existing AWS Glue machine learning transforms. Machine learning transforms
     * are a special type of transform that use machine learning to learn the details of the transformation to be
     * performed by learning from examples provided by humans. These transformations are then saved by AWS Glue, and you
     * can retrieve their metadata by calling <code>GetMLTransforms</code>.
     * </p>
     * 
     * @param getMLTransformsRequest
     * @return A Java Future containing the result of the GetMLTransforms operation returned by the service.
     * @sample AWSGlueAsync.GetMLTransforms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetMLTransforms" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMLTransformsResult> getMLTransformsAsync(GetMLTransformsRequest getMLTransformsRequest);

    /**
     * <p>
     * Gets a sortable, filterable list of existing AWS Glue machine learning transforms. Machine learning transforms
     * are a special type of transform that use machine learning to learn the details of the transformation to be
     * performed by learning from examples provided by humans. These transformations are then saved by AWS Glue, and you
     * can retrieve their metadata by calling <code>GetMLTransforms</code>.
     * </p>
     * 
     * @param getMLTransformsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMLTransforms operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetMLTransforms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetMLTransforms" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMLTransformsResult> getMLTransformsAsync(GetMLTransformsRequest getMLTransformsRequest,
            com.amazonaws.handlers.AsyncHandler<GetMLTransformsRequest, GetMLTransformsResult> asyncHandler);

    /**
     * <p>
     * Creates mappings.
     * </p>
     * 
     * @param getMappingRequest
     * @return A Java Future containing the result of the GetMapping operation returned by the service.
     * @sample AWSGlueAsync.GetMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetMapping" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMappingResult> getMappingAsync(GetMappingRequest getMappingRequest);

    /**
     * <p>
     * Creates mappings.
     * </p>
     * 
     * @param getMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMapping operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetMapping" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMappingResult> getMappingAsync(GetMappingRequest getMappingRequest,
            com.amazonaws.handlers.AsyncHandler<GetMappingRequest, GetMappingResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a specified partition.
     * </p>
     * 
     * @param getPartitionRequest
     * @return A Java Future containing the result of the GetPartition operation returned by the service.
     * @sample AWSGlueAsync.GetPartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetPartition" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPartitionResult> getPartitionAsync(GetPartitionRequest getPartitionRequest);

    /**
     * <p>
     * Retrieves information about a specified partition.
     * </p>
     * 
     * @param getPartitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPartition operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetPartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetPartition" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPartitionResult> getPartitionAsync(GetPartitionRequest getPartitionRequest,
            com.amazonaws.handlers.AsyncHandler<GetPartitionRequest, GetPartitionResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the partitions in a table.
     * </p>
     * 
     * @param getPartitionsRequest
     * @return A Java Future containing the result of the GetPartitions operation returned by the service.
     * @sample AWSGlueAsync.GetPartitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetPartitions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPartitionsResult> getPartitionsAsync(GetPartitionsRequest getPartitionsRequest);

    /**
     * <p>
     * Retrieves information about the partitions in a table.
     * </p>
     * 
     * @param getPartitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPartitions operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetPartitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetPartitions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPartitionsResult> getPartitionsAsync(GetPartitionsRequest getPartitionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetPartitionsRequest, GetPartitionsResult> asyncHandler);

    /**
     * <p>
     * Gets code to perform a specified mapping.
     * </p>
     * 
     * @param getPlanRequest
     * @return A Java Future containing the result of the GetPlan operation returned by the service.
     * @sample AWSGlueAsync.GetPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetPlan" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPlanResult> getPlanAsync(GetPlanRequest getPlanRequest);

    /**
     * <p>
     * Gets code to perform a specified mapping.
     * </p>
     * 
     * @param getPlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPlan operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetPlan" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPlanResult> getPlanAsync(GetPlanRequest getPlanRequest,
            com.amazonaws.handlers.AsyncHandler<GetPlanRequest, GetPlanResult> asyncHandler);

    /**
     * <p>
     * Retrieves a specified resource policy.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return A Java Future containing the result of the GetResourcePolicy operation returned by the service.
     * @sample AWSGlueAsync.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetResourcePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest getResourcePolicyRequest);

    /**
     * <p>
     * Retrieves a specified resource policy.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourcePolicy operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetResourcePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest getResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourcePolicyRequest, GetResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves a specified security configuration.
     * </p>
     * 
     * @param getSecurityConfigurationRequest
     * @return A Java Future containing the result of the GetSecurityConfiguration operation returned by the service.
     * @sample AWSGlueAsync.GetSecurityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetSecurityConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSecurityConfigurationResult> getSecurityConfigurationAsync(GetSecurityConfigurationRequest getSecurityConfigurationRequest);

    /**
     * <p>
     * Retrieves a specified security configuration.
     * </p>
     * 
     * @param getSecurityConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSecurityConfiguration operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetSecurityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetSecurityConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSecurityConfigurationResult> getSecurityConfigurationAsync(GetSecurityConfigurationRequest getSecurityConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetSecurityConfigurationRequest, GetSecurityConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of all security configurations.
     * </p>
     * 
     * @param getSecurityConfigurationsRequest
     * @return A Java Future containing the result of the GetSecurityConfigurations operation returned by the service.
     * @sample AWSGlueAsync.GetSecurityConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetSecurityConfigurations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSecurityConfigurationsResult> getSecurityConfigurationsAsync(
            GetSecurityConfigurationsRequest getSecurityConfigurationsRequest);

    /**
     * <p>
     * Retrieves a list of all security configurations.
     * </p>
     * 
     * @param getSecurityConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSecurityConfigurations operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetSecurityConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetSecurityConfigurations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSecurityConfigurationsResult> getSecurityConfigurationsAsync(
            GetSecurityConfigurationsRequest getSecurityConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSecurityConfigurationsRequest, GetSecurityConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the <code>Table</code> definition in a Data Catalog for a specified table.
     * </p>
     * 
     * @param getTableRequest
     * @return A Java Future containing the result of the GetTable operation returned by the service.
     * @sample AWSGlueAsync.GetTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTableResult> getTableAsync(GetTableRequest getTableRequest);

    /**
     * <p>
     * Retrieves the <code>Table</code> definition in a Data Catalog for a specified table.
     * </p>
     * 
     * @param getTableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTable operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTableResult> getTableAsync(GetTableRequest getTableRequest,
            com.amazonaws.handlers.AsyncHandler<GetTableRequest, GetTableResult> asyncHandler);

    /**
     * <p>
     * Retrieves a specified version of a table.
     * </p>
     * 
     * @param getTableVersionRequest
     * @return A Java Future containing the result of the GetTableVersion operation returned by the service.
     * @sample AWSGlueAsync.GetTableVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTableVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTableVersionResult> getTableVersionAsync(GetTableVersionRequest getTableVersionRequest);

    /**
     * <p>
     * Retrieves a specified version of a table.
     * </p>
     * 
     * @param getTableVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTableVersion operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetTableVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTableVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTableVersionResult> getTableVersionAsync(GetTableVersionRequest getTableVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetTableVersionRequest, GetTableVersionResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of strings that identify available versions of a specified table.
     * </p>
     * 
     * @param getTableVersionsRequest
     * @return A Java Future containing the result of the GetTableVersions operation returned by the service.
     * @sample AWSGlueAsync.GetTableVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTableVersions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTableVersionsResult> getTableVersionsAsync(GetTableVersionsRequest getTableVersionsRequest);

    /**
     * <p>
     * Retrieves a list of strings that identify available versions of a specified table.
     * </p>
     * 
     * @param getTableVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTableVersions operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetTableVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTableVersions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTableVersionsResult> getTableVersionsAsync(GetTableVersionsRequest getTableVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetTableVersionsRequest, GetTableVersionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the definitions of some or all of the tables in a given <code>Database</code>.
     * </p>
     * 
     * @param getTablesRequest
     * @return A Java Future containing the result of the GetTables operation returned by the service.
     * @sample AWSGlueAsync.GetTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTables" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTablesResult> getTablesAsync(GetTablesRequest getTablesRequest);

    /**
     * <p>
     * Retrieves the definitions of some or all of the tables in a given <code>Database</code>.
     * </p>
     * 
     * @param getTablesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTables operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTables" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTablesResult> getTablesAsync(GetTablesRequest getTablesRequest,
            com.amazonaws.handlers.AsyncHandler<GetTablesRequest, GetTablesResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of tags associated with a resource.
     * </p>
     * 
     * @param getTagsRequest
     * @return A Java Future containing the result of the GetTags operation returned by the service.
     * @sample AWSGlueAsync.GetTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTagsResult> getTagsAsync(GetTagsRequest getTagsRequest);

    /**
     * <p>
     * Retrieves a list of tags associated with a resource.
     * </p>
     * 
     * @param getTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTags operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTagsResult> getTagsAsync(GetTagsRequest getTagsRequest,
            com.amazonaws.handlers.AsyncHandler<GetTagsRequest, GetTagsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the definition of a trigger.
     * </p>
     * 
     * @param getTriggerRequest
     * @return A Java Future containing the result of the GetTrigger operation returned by the service.
     * @sample AWSGlueAsync.GetTrigger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTrigger" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTriggerResult> getTriggerAsync(GetTriggerRequest getTriggerRequest);

    /**
     * <p>
     * Retrieves the definition of a trigger.
     * </p>
     * 
     * @param getTriggerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTrigger operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetTrigger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTrigger" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTriggerResult> getTriggerAsync(GetTriggerRequest getTriggerRequest,
            com.amazonaws.handlers.AsyncHandler<GetTriggerRequest, GetTriggerResult> asyncHandler);

    /**
     * <p>
     * Gets all the triggers associated with a job.
     * </p>
     * 
     * @param getTriggersRequest
     * @return A Java Future containing the result of the GetTriggers operation returned by the service.
     * @sample AWSGlueAsync.GetTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTriggers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTriggersResult> getTriggersAsync(GetTriggersRequest getTriggersRequest);

    /**
     * <p>
     * Gets all the triggers associated with a job.
     * </p>
     * 
     * @param getTriggersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTriggers operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTriggers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTriggersResult> getTriggersAsync(GetTriggersRequest getTriggersRequest,
            com.amazonaws.handlers.AsyncHandler<GetTriggersRequest, GetTriggersResult> asyncHandler);

    /**
     * <p>
     * Retrieves a specified function definition from the Data Catalog.
     * </p>
     * 
     * @param getUserDefinedFunctionRequest
     * @return A Java Future containing the result of the GetUserDefinedFunction operation returned by the service.
     * @sample AWSGlueAsync.GetUserDefinedFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetUserDefinedFunction" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetUserDefinedFunctionResult> getUserDefinedFunctionAsync(GetUserDefinedFunctionRequest getUserDefinedFunctionRequest);

    /**
     * <p>
     * Retrieves a specified function definition from the Data Catalog.
     * </p>
     * 
     * @param getUserDefinedFunctionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUserDefinedFunction operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetUserDefinedFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetUserDefinedFunction" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetUserDefinedFunctionResult> getUserDefinedFunctionAsync(GetUserDefinedFunctionRequest getUserDefinedFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<GetUserDefinedFunctionRequest, GetUserDefinedFunctionResult> asyncHandler);

    /**
     * <p>
     * Retrieves multiple function definitions from the Data Catalog.
     * </p>
     * 
     * @param getUserDefinedFunctionsRequest
     * @return A Java Future containing the result of the GetUserDefinedFunctions operation returned by the service.
     * @sample AWSGlueAsync.GetUserDefinedFunctions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetUserDefinedFunctions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetUserDefinedFunctionsResult> getUserDefinedFunctionsAsync(GetUserDefinedFunctionsRequest getUserDefinedFunctionsRequest);

    /**
     * <p>
     * Retrieves multiple function definitions from the Data Catalog.
     * </p>
     * 
     * @param getUserDefinedFunctionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUserDefinedFunctions operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetUserDefinedFunctions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetUserDefinedFunctions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetUserDefinedFunctionsResult> getUserDefinedFunctionsAsync(GetUserDefinedFunctionsRequest getUserDefinedFunctionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetUserDefinedFunctionsRequest, GetUserDefinedFunctionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves resource metadata for a workflow.
     * </p>
     * 
     * @param getWorkflowRequest
     * @return A Java Future containing the result of the GetWorkflow operation returned by the service.
     * @sample AWSGlueAsync.GetWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWorkflowResult> getWorkflowAsync(GetWorkflowRequest getWorkflowRequest);

    /**
     * <p>
     * Retrieves resource metadata for a workflow.
     * </p>
     * 
     * @param getWorkflowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWorkflow operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWorkflowResult> getWorkflowAsync(GetWorkflowRequest getWorkflowRequest,
            com.amazonaws.handlers.AsyncHandler<GetWorkflowRequest, GetWorkflowResult> asyncHandler);

    /**
     * <p>
     * Retrieves the metadata for a given workflow run.
     * </p>
     * 
     * @param getWorkflowRunRequest
     * @return A Java Future containing the result of the GetWorkflowRun operation returned by the service.
     * @sample AWSGlueAsync.GetWorkflowRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetWorkflowRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWorkflowRunResult> getWorkflowRunAsync(GetWorkflowRunRequest getWorkflowRunRequest);

    /**
     * <p>
     * Retrieves the metadata for a given workflow run.
     * </p>
     * 
     * @param getWorkflowRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWorkflowRun operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetWorkflowRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetWorkflowRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWorkflowRunResult> getWorkflowRunAsync(GetWorkflowRunRequest getWorkflowRunRequest,
            com.amazonaws.handlers.AsyncHandler<GetWorkflowRunRequest, GetWorkflowRunResult> asyncHandler);

    /**
     * <p>
     * Retrieves the workflow run properties which were set during the run.
     * </p>
     * 
     * @param getWorkflowRunPropertiesRequest
     * @return A Java Future containing the result of the GetWorkflowRunProperties operation returned by the service.
     * @sample AWSGlueAsync.GetWorkflowRunProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetWorkflowRunProperties" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetWorkflowRunPropertiesResult> getWorkflowRunPropertiesAsync(GetWorkflowRunPropertiesRequest getWorkflowRunPropertiesRequest);

    /**
     * <p>
     * Retrieves the workflow run properties which were set during the run.
     * </p>
     * 
     * @param getWorkflowRunPropertiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWorkflowRunProperties operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetWorkflowRunProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetWorkflowRunProperties" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetWorkflowRunPropertiesResult> getWorkflowRunPropertiesAsync(GetWorkflowRunPropertiesRequest getWorkflowRunPropertiesRequest,
            com.amazonaws.handlers.AsyncHandler<GetWorkflowRunPropertiesRequest, GetWorkflowRunPropertiesResult> asyncHandler);

    /**
     * <p>
     * Retrieves metadata for all runs of a given workflow.
     * </p>
     * 
     * @param getWorkflowRunsRequest
     * @return A Java Future containing the result of the GetWorkflowRuns operation returned by the service.
     * @sample AWSGlueAsync.GetWorkflowRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetWorkflowRuns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWorkflowRunsResult> getWorkflowRunsAsync(GetWorkflowRunsRequest getWorkflowRunsRequest);

    /**
     * <p>
     * Retrieves metadata for all runs of a given workflow.
     * </p>
     * 
     * @param getWorkflowRunsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWorkflowRuns operation returned by the service.
     * @sample AWSGlueAsyncHandler.GetWorkflowRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetWorkflowRuns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWorkflowRunsResult> getWorkflowRunsAsync(GetWorkflowRunsRequest getWorkflowRunsRequest,
            com.amazonaws.handlers.AsyncHandler<GetWorkflowRunsRequest, GetWorkflowRunsResult> asyncHandler);

    /**
     * <p>
     * Imports an existing Amazon Athena Data Catalog to AWS Glue
     * </p>
     * 
     * @param importCatalogToGlueRequest
     * @return A Java Future containing the result of the ImportCatalogToGlue operation returned by the service.
     * @sample AWSGlueAsync.ImportCatalogToGlue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ImportCatalogToGlue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportCatalogToGlueResult> importCatalogToGlueAsync(ImportCatalogToGlueRequest importCatalogToGlueRequest);

    /**
     * <p>
     * Imports an existing Amazon Athena Data Catalog to AWS Glue
     * </p>
     * 
     * @param importCatalogToGlueRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportCatalogToGlue operation returned by the service.
     * @sample AWSGlueAsyncHandler.ImportCatalogToGlue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ImportCatalogToGlue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportCatalogToGlueResult> importCatalogToGlueAsync(ImportCatalogToGlueRequest importCatalogToGlueRequest,
            com.amazonaws.handlers.AsyncHandler<ImportCatalogToGlueRequest, ImportCatalogToGlueResult> asyncHandler);

    /**
     * <p>
     * Retrieves the names of all crawler resources in this AWS account, or the resources with the specified tag. This
     * operation allows you to see which resources are available in your account, and their names.
     * </p>
     * <p>
     * This operation takes the optional <code>Tags</code> field, which you can use as a filter on the response so that
     * tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag
     * are retrieved.
     * </p>
     * 
     * @param listCrawlersRequest
     * @return A Java Future containing the result of the ListCrawlers operation returned by the service.
     * @sample AWSGlueAsync.ListCrawlers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListCrawlers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListCrawlersResult> listCrawlersAsync(ListCrawlersRequest listCrawlersRequest);

    /**
     * <p>
     * Retrieves the names of all crawler resources in this AWS account, or the resources with the specified tag. This
     * operation allows you to see which resources are available in your account, and their names.
     * </p>
     * <p>
     * This operation takes the optional <code>Tags</code> field, which you can use as a filter on the response so that
     * tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag
     * are retrieved.
     * </p>
     * 
     * @param listCrawlersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCrawlers operation returned by the service.
     * @sample AWSGlueAsyncHandler.ListCrawlers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListCrawlers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListCrawlersResult> listCrawlersAsync(ListCrawlersRequest listCrawlersRequest,
            com.amazonaws.handlers.AsyncHandler<ListCrawlersRequest, ListCrawlersResult> asyncHandler);

    /**
     * <p>
     * Retrieves the names of all <code>DevEndpoint</code> resources in this AWS account, or the resources with the
     * specified tag. This operation allows you to see which resources are available in your account, and their names.
     * </p>
     * <p>
     * This operation takes the optional <code>Tags</code> field, which you can use as a filter on the response so that
     * tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag
     * are retrieved.
     * </p>
     * 
     * @param listDevEndpointsRequest
     * @return A Java Future containing the result of the ListDevEndpoints operation returned by the service.
     * @sample AWSGlueAsync.ListDevEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListDevEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDevEndpointsResult> listDevEndpointsAsync(ListDevEndpointsRequest listDevEndpointsRequest);

    /**
     * <p>
     * Retrieves the names of all <code>DevEndpoint</code> resources in this AWS account, or the resources with the
     * specified tag. This operation allows you to see which resources are available in your account, and their names.
     * </p>
     * <p>
     * This operation takes the optional <code>Tags</code> field, which you can use as a filter on the response so that
     * tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag
     * are retrieved.
     * </p>
     * 
     * @param listDevEndpointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDevEndpoints operation returned by the service.
     * @sample AWSGlueAsyncHandler.ListDevEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListDevEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDevEndpointsResult> listDevEndpointsAsync(ListDevEndpointsRequest listDevEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDevEndpointsRequest, ListDevEndpointsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the names of all job resources in this AWS account, or the resources with the specified tag. This
     * operation allows you to see which resources are available in your account, and their names.
     * </p>
     * <p>
     * This operation takes the optional <code>Tags</code> field, which you can use as a filter on the response so that
     * tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag
     * are retrieved.
     * </p>
     * 
     * @param listJobsRequest
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AWSGlueAsync.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest);

    /**
     * <p>
     * Retrieves the names of all job resources in this AWS account, or the resources with the specified tag. This
     * operation allows you to see which resources are available in your account, and their names.
     * </p>
     * <p>
     * This operation takes the optional <code>Tags</code> field, which you can use as a filter on the response so that
     * tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag
     * are retrieved.
     * </p>
     * 
     * @param listJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AWSGlueAsyncHandler.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a sortable, filterable list of existing AWS Glue machine learning transforms in this AWS account, or
     * the resources with the specified tag. This operation takes the optional <code>Tags</code> field, which you can
     * use as a filter of the responses so that tagged resources can be retrieved as a group. If you choose to use tag
     * filtering, only resources with the tags are retrieved.
     * </p>
     * 
     * @param listMLTransformsRequest
     * @return A Java Future containing the result of the ListMLTransforms operation returned by the service.
     * @sample AWSGlueAsync.ListMLTransforms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListMLTransforms" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMLTransformsResult> listMLTransformsAsync(ListMLTransformsRequest listMLTransformsRequest);

    /**
     * <p>
     * Retrieves a sortable, filterable list of existing AWS Glue machine learning transforms in this AWS account, or
     * the resources with the specified tag. This operation takes the optional <code>Tags</code> field, which you can
     * use as a filter of the responses so that tagged resources can be retrieved as a group. If you choose to use tag
     * filtering, only resources with the tags are retrieved.
     * </p>
     * 
     * @param listMLTransformsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMLTransforms operation returned by the service.
     * @sample AWSGlueAsyncHandler.ListMLTransforms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListMLTransforms" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMLTransformsResult> listMLTransformsAsync(ListMLTransformsRequest listMLTransformsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMLTransformsRequest, ListMLTransformsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the names of all trigger resources in this AWS account, or the resources with the specified tag. This
     * operation allows you to see which resources are available in your account, and their names.
     * </p>
     * <p>
     * This operation takes the optional <code>Tags</code> field, which you can use as a filter on the response so that
     * tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag
     * are retrieved.
     * </p>
     * 
     * @param listTriggersRequest
     * @return A Java Future containing the result of the ListTriggers operation returned by the service.
     * @sample AWSGlueAsync.ListTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListTriggers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTriggersResult> listTriggersAsync(ListTriggersRequest listTriggersRequest);

    /**
     * <p>
     * Retrieves the names of all trigger resources in this AWS account, or the resources with the specified tag. This
     * operation allows you to see which resources are available in your account, and their names.
     * </p>
     * <p>
     * This operation takes the optional <code>Tags</code> field, which you can use as a filter on the response so that
     * tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag
     * are retrieved.
     * </p>
     * 
     * @param listTriggersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTriggers operation returned by the service.
     * @sample AWSGlueAsyncHandler.ListTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListTriggers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTriggersResult> listTriggersAsync(ListTriggersRequest listTriggersRequest,
            com.amazonaws.handlers.AsyncHandler<ListTriggersRequest, ListTriggersResult> asyncHandler);

    /**
     * <p>
     * Lists names of workflows created in the account.
     * </p>
     * 
     * @param listWorkflowsRequest
     * @return A Java Future containing the result of the ListWorkflows operation returned by the service.
     * @sample AWSGlueAsync.ListWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListWorkflows" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWorkflowsResult> listWorkflowsAsync(ListWorkflowsRequest listWorkflowsRequest);

    /**
     * <p>
     * Lists names of workflows created in the account.
     * </p>
     * 
     * @param listWorkflowsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWorkflows operation returned by the service.
     * @sample AWSGlueAsyncHandler.ListWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListWorkflows" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWorkflowsResult> listWorkflowsAsync(ListWorkflowsRequest listWorkflowsRequest,
            com.amazonaws.handlers.AsyncHandler<ListWorkflowsRequest, ListWorkflowsResult> asyncHandler);

    /**
     * <p>
     * Sets the security configuration for a specified catalog. After the configuration has been set, the specified
     * encryption is applied to every catalog write thereafter.
     * </p>
     * 
     * @param putDataCatalogEncryptionSettingsRequest
     * @return A Java Future containing the result of the PutDataCatalogEncryptionSettings operation returned by the
     *         service.
     * @sample AWSGlueAsync.PutDataCatalogEncryptionSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/PutDataCatalogEncryptionSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutDataCatalogEncryptionSettingsResult> putDataCatalogEncryptionSettingsAsync(
            PutDataCatalogEncryptionSettingsRequest putDataCatalogEncryptionSettingsRequest);

    /**
     * <p>
     * Sets the security configuration for a specified catalog. After the configuration has been set, the specified
     * encryption is applied to every catalog write thereafter.
     * </p>
     * 
     * @param putDataCatalogEncryptionSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutDataCatalogEncryptionSettings operation returned by the
     *         service.
     * @sample AWSGlueAsyncHandler.PutDataCatalogEncryptionSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/PutDataCatalogEncryptionSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutDataCatalogEncryptionSettingsResult> putDataCatalogEncryptionSettingsAsync(
            PutDataCatalogEncryptionSettingsRequest putDataCatalogEncryptionSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<PutDataCatalogEncryptionSettingsRequest, PutDataCatalogEncryptionSettingsResult> asyncHandler);

    /**
     * <p>
     * Sets the Data Catalog resource policy for access control.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return A Java Future containing the result of the PutResourcePolicy operation returned by the service.
     * @sample AWSGlueAsync.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/PutResourcePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest putResourcePolicyRequest);

    /**
     * <p>
     * Sets the Data Catalog resource policy for access control.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutResourcePolicy operation returned by the service.
     * @sample AWSGlueAsyncHandler.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/PutResourcePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest putResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutResourcePolicyRequest, PutResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Puts the specified workflow run properties for the given workflow run. If a property already exists for the
     * specified run, then it overrides the value otherwise adds the property to existing properties.
     * </p>
     * 
     * @param putWorkflowRunPropertiesRequest
     * @return A Java Future containing the result of the PutWorkflowRunProperties operation returned by the service.
     * @sample AWSGlueAsync.PutWorkflowRunProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/PutWorkflowRunProperties" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutWorkflowRunPropertiesResult> putWorkflowRunPropertiesAsync(PutWorkflowRunPropertiesRequest putWorkflowRunPropertiesRequest);

    /**
     * <p>
     * Puts the specified workflow run properties for the given workflow run. If a property already exists for the
     * specified run, then it overrides the value otherwise adds the property to existing properties.
     * </p>
     * 
     * @param putWorkflowRunPropertiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutWorkflowRunProperties operation returned by the service.
     * @sample AWSGlueAsyncHandler.PutWorkflowRunProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/PutWorkflowRunProperties" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutWorkflowRunPropertiesResult> putWorkflowRunPropertiesAsync(PutWorkflowRunPropertiesRequest putWorkflowRunPropertiesRequest,
            com.amazonaws.handlers.AsyncHandler<PutWorkflowRunPropertiesRequest, PutWorkflowRunPropertiesResult> asyncHandler);

    /**
     * <p>
     * Resets a bookmark entry.
     * </p>
     * 
     * @param resetJobBookmarkRequest
     * @return A Java Future containing the result of the ResetJobBookmark operation returned by the service.
     * @sample AWSGlueAsync.ResetJobBookmark
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ResetJobBookmark" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResetJobBookmarkResult> resetJobBookmarkAsync(ResetJobBookmarkRequest resetJobBookmarkRequest);

    /**
     * <p>
     * Resets a bookmark entry.
     * </p>
     * 
     * @param resetJobBookmarkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResetJobBookmark operation returned by the service.
     * @sample AWSGlueAsyncHandler.ResetJobBookmark
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ResetJobBookmark" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResetJobBookmarkResult> resetJobBookmarkAsync(ResetJobBookmarkRequest resetJobBookmarkRequest,
            com.amazonaws.handlers.AsyncHandler<ResetJobBookmarkRequest, ResetJobBookmarkResult> asyncHandler);

    /**
     * <p>
     * Searches a set of tables based on properties in the table metadata as well as on the parent database. You can
     * search against text or filter conditions.
     * </p>
     * <p>
     * You can only get tables that you have access to based on the security policies defined in Lake Formation. You
     * need at least a read-only access to the table for it to be returned. If you do not have access to all the columns
     * in the table, these columns will not be searched against when returning the list of tables back to you. If you
     * have access to the columns but not the data in the columns, those columns and the associated metadata for those
     * columns will be included in the search.
     * </p>
     * 
     * @param searchTablesRequest
     * @return A Java Future containing the result of the SearchTables operation returned by the service.
     * @sample AWSGlueAsync.SearchTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/SearchTables" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchTablesResult> searchTablesAsync(SearchTablesRequest searchTablesRequest);

    /**
     * <p>
     * Searches a set of tables based on properties in the table metadata as well as on the parent database. You can
     * search against text or filter conditions.
     * </p>
     * <p>
     * You can only get tables that you have access to based on the security policies defined in Lake Formation. You
     * need at least a read-only access to the table for it to be returned. If you do not have access to all the columns
     * in the table, these columns will not be searched against when returning the list of tables back to you. If you
     * have access to the columns but not the data in the columns, those columns and the associated metadata for those
     * columns will be included in the search.
     * </p>
     * 
     * @param searchTablesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchTables operation returned by the service.
     * @sample AWSGlueAsyncHandler.SearchTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/SearchTables" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchTablesResult> searchTablesAsync(SearchTablesRequest searchTablesRequest,
            com.amazonaws.handlers.AsyncHandler<SearchTablesRequest, SearchTablesResult> asyncHandler);

    /**
     * <p>
     * Starts a crawl using the specified crawler, regardless of what is scheduled. If the crawler is already running,
     * returns a <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-exceptions.html#aws-glue-api-exceptions-CrawlerRunningException"
     * >CrawlerRunningException</a>.
     * </p>
     * 
     * @param startCrawlerRequest
     * @return A Java Future containing the result of the StartCrawler operation returned by the service.
     * @sample AWSGlueAsync.StartCrawler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartCrawler" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartCrawlerResult> startCrawlerAsync(StartCrawlerRequest startCrawlerRequest);

    /**
     * <p>
     * Starts a crawl using the specified crawler, regardless of what is scheduled. If the crawler is already running,
     * returns a <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-exceptions.html#aws-glue-api-exceptions-CrawlerRunningException"
     * >CrawlerRunningException</a>.
     * </p>
     * 
     * @param startCrawlerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartCrawler operation returned by the service.
     * @sample AWSGlueAsyncHandler.StartCrawler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartCrawler" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartCrawlerResult> startCrawlerAsync(StartCrawlerRequest startCrawlerRequest,
            com.amazonaws.handlers.AsyncHandler<StartCrawlerRequest, StartCrawlerResult> asyncHandler);

    /**
     * <p>
     * Changes the schedule state of the specified crawler to <code>SCHEDULED</code>, unless the crawler is already
     * running or the schedule state is already <code>SCHEDULED</code>.
     * </p>
     * 
     * @param startCrawlerScheduleRequest
     * @return A Java Future containing the result of the StartCrawlerSchedule operation returned by the service.
     * @sample AWSGlueAsync.StartCrawlerSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartCrawlerSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartCrawlerScheduleResult> startCrawlerScheduleAsync(StartCrawlerScheduleRequest startCrawlerScheduleRequest);

    /**
     * <p>
     * Changes the schedule state of the specified crawler to <code>SCHEDULED</code>, unless the crawler is already
     * running or the schedule state is already <code>SCHEDULED</code>.
     * </p>
     * 
     * @param startCrawlerScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartCrawlerSchedule operation returned by the service.
     * @sample AWSGlueAsyncHandler.StartCrawlerSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartCrawlerSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartCrawlerScheduleResult> startCrawlerScheduleAsync(StartCrawlerScheduleRequest startCrawlerScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<StartCrawlerScheduleRequest, StartCrawlerScheduleResult> asyncHandler);

    /**
     * <p>
     * Begins an asynchronous task to export all labeled data for a particular transform. This task is the only
     * label-related API call that is not part of the typical active learning workflow. You typically use
     * <code>StartExportLabelsTaskRun</code> when you want to work with all of your existing labels at the same time,
     * such as when you want to remove or change labels that were previously submitted as truth. This API operation
     * accepts the <code>TransformId</code> whose labels you want to export and an Amazon Simple Storage Service (Amazon
     * S3) path to export the labels to. The operation returns a <code>TaskRunId</code>. You can check on the status of
     * your task run by calling the <code>GetMLTaskRun</code> API.
     * </p>
     * 
     * @param startExportLabelsTaskRunRequest
     * @return A Java Future containing the result of the StartExportLabelsTaskRun operation returned by the service.
     * @sample AWSGlueAsync.StartExportLabelsTaskRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartExportLabelsTaskRun" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartExportLabelsTaskRunResult> startExportLabelsTaskRunAsync(StartExportLabelsTaskRunRequest startExportLabelsTaskRunRequest);

    /**
     * <p>
     * Begins an asynchronous task to export all labeled data for a particular transform. This task is the only
     * label-related API call that is not part of the typical active learning workflow. You typically use
     * <code>StartExportLabelsTaskRun</code> when you want to work with all of your existing labels at the same time,
     * such as when you want to remove or change labels that were previously submitted as truth. This API operation
     * accepts the <code>TransformId</code> whose labels you want to export and an Amazon Simple Storage Service (Amazon
     * S3) path to export the labels to. The operation returns a <code>TaskRunId</code>. You can check on the status of
     * your task run by calling the <code>GetMLTaskRun</code> API.
     * </p>
     * 
     * @param startExportLabelsTaskRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartExportLabelsTaskRun operation returned by the service.
     * @sample AWSGlueAsyncHandler.StartExportLabelsTaskRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartExportLabelsTaskRun" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartExportLabelsTaskRunResult> startExportLabelsTaskRunAsync(StartExportLabelsTaskRunRequest startExportLabelsTaskRunRequest,
            com.amazonaws.handlers.AsyncHandler<StartExportLabelsTaskRunRequest, StartExportLabelsTaskRunResult> asyncHandler);

    /**
     * <p>
     * Enables you to provide additional labels (examples of truth) to be used to teach the machine learning transform
     * and improve its quality. This API operation is generally used as part of the active learning workflow that starts
     * with the <code>StartMLLabelingSetGenerationTaskRun</code> call and that ultimately results in improving the
     * quality of your machine learning transform.
     * </p>
     * <p>
     * After the <code>StartMLLabelingSetGenerationTaskRun</code> finishes, AWS Glue machine learning will have
     * generated a series of questions for humans to answer. (Answering these questions is often called 'labeling' in
     * the machine learning workflows). In the case of the <code>FindMatches</code> transform, these questions are of
     * the form, “What is the correct way to group these rows together into groups composed entirely of matching
     * records?” After the labeling process is finished, users upload their answers/labels with a call to
     * <code>StartImportLabelsTaskRun</code>. After <code>StartImportLabelsTaskRun</code> finishes, all future runs of
     * the machine learning transform use the new and improved labels and perform a higher-quality transformation.
     * </p>
     * <p>
     * By default, <code>StartMLLabelingSetGenerationTaskRun</code> continually learns from and combines all labels that
     * you upload unless you set <code>Replace</code> to true. If you set <code>Replace</code> to true,
     * <code>StartImportLabelsTaskRun</code> deletes and forgets all previously uploaded labels and learns only from the
     * exact set that you upload. Replacing labels can be helpful if you realize that you previously uploaded incorrect
     * labels, and you believe that they are having a negative effect on your transform quality.
     * </p>
     * <p>
     * You can check on the status of your task run by calling the <code>GetMLTaskRun</code> operation.
     * </p>
     * 
     * @param startImportLabelsTaskRunRequest
     * @return A Java Future containing the result of the StartImportLabelsTaskRun operation returned by the service.
     * @sample AWSGlueAsync.StartImportLabelsTaskRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartImportLabelsTaskRun" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartImportLabelsTaskRunResult> startImportLabelsTaskRunAsync(StartImportLabelsTaskRunRequest startImportLabelsTaskRunRequest);

    /**
     * <p>
     * Enables you to provide additional labels (examples of truth) to be used to teach the machine learning transform
     * and improve its quality. This API operation is generally used as part of the active learning workflow that starts
     * with the <code>StartMLLabelingSetGenerationTaskRun</code> call and that ultimately results in improving the
     * quality of your machine learning transform.
     * </p>
     * <p>
     * After the <code>StartMLLabelingSetGenerationTaskRun</code> finishes, AWS Glue machine learning will have
     * generated a series of questions for humans to answer. (Answering these questions is often called 'labeling' in
     * the machine learning workflows). In the case of the <code>FindMatches</code> transform, these questions are of
     * the form, “What is the correct way to group these rows together into groups composed entirely of matching
     * records?” After the labeling process is finished, users upload their answers/labels with a call to
     * <code>StartImportLabelsTaskRun</code>. After <code>StartImportLabelsTaskRun</code> finishes, all future runs of
     * the machine learning transform use the new and improved labels and perform a higher-quality transformation.
     * </p>
     * <p>
     * By default, <code>StartMLLabelingSetGenerationTaskRun</code> continually learns from and combines all labels that
     * you upload unless you set <code>Replace</code> to true. If you set <code>Replace</code> to true,
     * <code>StartImportLabelsTaskRun</code> deletes and forgets all previously uploaded labels and learns only from the
     * exact set that you upload. Replacing labels can be helpful if you realize that you previously uploaded incorrect
     * labels, and you believe that they are having a negative effect on your transform quality.
     * </p>
     * <p>
     * You can check on the status of your task run by calling the <code>GetMLTaskRun</code> operation.
     * </p>
     * 
     * @param startImportLabelsTaskRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartImportLabelsTaskRun operation returned by the service.
     * @sample AWSGlueAsyncHandler.StartImportLabelsTaskRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartImportLabelsTaskRun" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartImportLabelsTaskRunResult> startImportLabelsTaskRunAsync(StartImportLabelsTaskRunRequest startImportLabelsTaskRunRequest,
            com.amazonaws.handlers.AsyncHandler<StartImportLabelsTaskRunRequest, StartImportLabelsTaskRunResult> asyncHandler);

    /**
     * <p>
     * Starts a job run using a job definition.
     * </p>
     * 
     * @param startJobRunRequest
     * @return A Java Future containing the result of the StartJobRun operation returned by the service.
     * @sample AWSGlueAsync.StartJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartJobRunResult> startJobRunAsync(StartJobRunRequest startJobRunRequest);

    /**
     * <p>
     * Starts a job run using a job definition.
     * </p>
     * 
     * @param startJobRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartJobRun operation returned by the service.
     * @sample AWSGlueAsyncHandler.StartJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartJobRunResult> startJobRunAsync(StartJobRunRequest startJobRunRequest,
            com.amazonaws.handlers.AsyncHandler<StartJobRunRequest, StartJobRunResult> asyncHandler);

    /**
     * <p>
     * Starts a task to estimate the quality of the transform.
     * </p>
     * <p>
     * When you provide label sets as examples of truth, AWS Glue machine learning uses some of those examples to learn
     * from them. The rest of the labels are used as a test to estimate quality.
     * </p>
     * <p>
     * Returns a unique identifier for the run. You can call <code>GetMLTaskRun</code> to get more information about the
     * stats of the <code>EvaluationTaskRun</code>.
     * </p>
     * 
     * @param startMLEvaluationTaskRunRequest
     * @return A Java Future containing the result of the StartMLEvaluationTaskRun operation returned by the service.
     * @sample AWSGlueAsync.StartMLEvaluationTaskRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartMLEvaluationTaskRun" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartMLEvaluationTaskRunResult> startMLEvaluationTaskRunAsync(StartMLEvaluationTaskRunRequest startMLEvaluationTaskRunRequest);

    /**
     * <p>
     * Starts a task to estimate the quality of the transform.
     * </p>
     * <p>
     * When you provide label sets as examples of truth, AWS Glue machine learning uses some of those examples to learn
     * from them. The rest of the labels are used as a test to estimate quality.
     * </p>
     * <p>
     * Returns a unique identifier for the run. You can call <code>GetMLTaskRun</code> to get more information about the
     * stats of the <code>EvaluationTaskRun</code>.
     * </p>
     * 
     * @param startMLEvaluationTaskRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartMLEvaluationTaskRun operation returned by the service.
     * @sample AWSGlueAsyncHandler.StartMLEvaluationTaskRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartMLEvaluationTaskRun" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartMLEvaluationTaskRunResult> startMLEvaluationTaskRunAsync(StartMLEvaluationTaskRunRequest startMLEvaluationTaskRunRequest,
            com.amazonaws.handlers.AsyncHandler<StartMLEvaluationTaskRunRequest, StartMLEvaluationTaskRunResult> asyncHandler);

    /**
     * <p>
     * Starts the active learning workflow for your machine learning transform to improve the transform's quality by
     * generating label sets and adding labels.
     * </p>
     * <p>
     * When the <code>StartMLLabelingSetGenerationTaskRun</code> finishes, AWS Glue will have generated a "labeling set"
     * or a set of questions for humans to answer.
     * </p>
     * <p>
     * In the case of the <code>FindMatches</code> transform, these questions are of the form, “What is the correct way
     * to group these rows together into groups composed entirely of matching records?”
     * </p>
     * <p>
     * After the labeling process is finished, you can upload your labels with a call to
     * <code>StartImportLabelsTaskRun</code>. After <code>StartImportLabelsTaskRun</code> finishes, all future runs of
     * the machine learning transform will use the new and improved labels and perform a higher-quality transformation.
     * </p>
     * 
     * @param startMLLabelingSetGenerationTaskRunRequest
     * @return A Java Future containing the result of the StartMLLabelingSetGenerationTaskRun operation returned by the
     *         service.
     * @sample AWSGlueAsync.StartMLLabelingSetGenerationTaskRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartMLLabelingSetGenerationTaskRun"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMLLabelingSetGenerationTaskRunResult> startMLLabelingSetGenerationTaskRunAsync(
            StartMLLabelingSetGenerationTaskRunRequest startMLLabelingSetGenerationTaskRunRequest);

    /**
     * <p>
     * Starts the active learning workflow for your machine learning transform to improve the transform's quality by
     * generating label sets and adding labels.
     * </p>
     * <p>
     * When the <code>StartMLLabelingSetGenerationTaskRun</code> finishes, AWS Glue will have generated a "labeling set"
     * or a set of questions for humans to answer.
     * </p>
     * <p>
     * In the case of the <code>FindMatches</code> transform, these questions are of the form, “What is the correct way
     * to group these rows together into groups composed entirely of matching records?”
     * </p>
     * <p>
     * After the labeling process is finished, you can upload your labels with a call to
     * <code>StartImportLabelsTaskRun</code>. After <code>StartImportLabelsTaskRun</code> finishes, all future runs of
     * the machine learning transform will use the new and improved labels and perform a higher-quality transformation.
     * </p>
     * 
     * @param startMLLabelingSetGenerationTaskRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartMLLabelingSetGenerationTaskRun operation returned by the
     *         service.
     * @sample AWSGlueAsyncHandler.StartMLLabelingSetGenerationTaskRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartMLLabelingSetGenerationTaskRun"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMLLabelingSetGenerationTaskRunResult> startMLLabelingSetGenerationTaskRunAsync(
            StartMLLabelingSetGenerationTaskRunRequest startMLLabelingSetGenerationTaskRunRequest,
            com.amazonaws.handlers.AsyncHandler<StartMLLabelingSetGenerationTaskRunRequest, StartMLLabelingSetGenerationTaskRunResult> asyncHandler);

    /**
     * <p>
     * Starts an existing trigger. See <a href="https://docs.aws.amazon.com/glue/latest/dg/trigger-job.html">Triggering
     * Jobs</a> for information about how different types of trigger are started.
     * </p>
     * 
     * @param startTriggerRequest
     * @return A Java Future containing the result of the StartTrigger operation returned by the service.
     * @sample AWSGlueAsync.StartTrigger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartTrigger" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartTriggerResult> startTriggerAsync(StartTriggerRequest startTriggerRequest);

    /**
     * <p>
     * Starts an existing trigger. See <a href="https://docs.aws.amazon.com/glue/latest/dg/trigger-job.html">Triggering
     * Jobs</a> for information about how different types of trigger are started.
     * </p>
     * 
     * @param startTriggerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartTrigger operation returned by the service.
     * @sample AWSGlueAsyncHandler.StartTrigger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartTrigger" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartTriggerResult> startTriggerAsync(StartTriggerRequest startTriggerRequest,
            com.amazonaws.handlers.AsyncHandler<StartTriggerRequest, StartTriggerResult> asyncHandler);

    /**
     * <p>
     * Starts a new run of the specified workflow.
     * </p>
     * 
     * @param startWorkflowRunRequest
     * @return A Java Future containing the result of the StartWorkflowRun operation returned by the service.
     * @sample AWSGlueAsync.StartWorkflowRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartWorkflowRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartWorkflowRunResult> startWorkflowRunAsync(StartWorkflowRunRequest startWorkflowRunRequest);

    /**
     * <p>
     * Starts a new run of the specified workflow.
     * </p>
     * 
     * @param startWorkflowRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartWorkflowRun operation returned by the service.
     * @sample AWSGlueAsyncHandler.StartWorkflowRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartWorkflowRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartWorkflowRunResult> startWorkflowRunAsync(StartWorkflowRunRequest startWorkflowRunRequest,
            com.amazonaws.handlers.AsyncHandler<StartWorkflowRunRequest, StartWorkflowRunResult> asyncHandler);

    /**
     * <p>
     * If the specified crawler is running, stops the crawl.
     * </p>
     * 
     * @param stopCrawlerRequest
     * @return A Java Future containing the result of the StopCrawler operation returned by the service.
     * @sample AWSGlueAsync.StopCrawler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StopCrawler" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopCrawlerResult> stopCrawlerAsync(StopCrawlerRequest stopCrawlerRequest);

    /**
     * <p>
     * If the specified crawler is running, stops the crawl.
     * </p>
     * 
     * @param stopCrawlerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopCrawler operation returned by the service.
     * @sample AWSGlueAsyncHandler.StopCrawler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StopCrawler" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopCrawlerResult> stopCrawlerAsync(StopCrawlerRequest stopCrawlerRequest,
            com.amazonaws.handlers.AsyncHandler<StopCrawlerRequest, StopCrawlerResult> asyncHandler);

    /**
     * <p>
     * Sets the schedule state of the specified crawler to <code>NOT_SCHEDULED</code>, but does not stop the crawler if
     * it is already running.
     * </p>
     * 
     * @param stopCrawlerScheduleRequest
     * @return A Java Future containing the result of the StopCrawlerSchedule operation returned by the service.
     * @sample AWSGlueAsync.StopCrawlerSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StopCrawlerSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopCrawlerScheduleResult> stopCrawlerScheduleAsync(StopCrawlerScheduleRequest stopCrawlerScheduleRequest);

    /**
     * <p>
     * Sets the schedule state of the specified crawler to <code>NOT_SCHEDULED</code>, but does not stop the crawler if
     * it is already running.
     * </p>
     * 
     * @param stopCrawlerScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopCrawlerSchedule operation returned by the service.
     * @sample AWSGlueAsyncHandler.StopCrawlerSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StopCrawlerSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopCrawlerScheduleResult> stopCrawlerScheduleAsync(StopCrawlerScheduleRequest stopCrawlerScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<StopCrawlerScheduleRequest, StopCrawlerScheduleResult> asyncHandler);

    /**
     * <p>
     * Stops a specified trigger.
     * </p>
     * 
     * @param stopTriggerRequest
     * @return A Java Future containing the result of the StopTrigger operation returned by the service.
     * @sample AWSGlueAsync.StopTrigger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StopTrigger" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopTriggerResult> stopTriggerAsync(StopTriggerRequest stopTriggerRequest);

    /**
     * <p>
     * Stops a specified trigger.
     * </p>
     * 
     * @param stopTriggerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopTrigger operation returned by the service.
     * @sample AWSGlueAsyncHandler.StopTrigger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StopTrigger" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopTriggerResult> stopTriggerAsync(StopTriggerRequest stopTriggerRequest,
            com.amazonaws.handlers.AsyncHandler<StopTriggerRequest, StopTriggerResult> asyncHandler);

    /**
     * <p>
     * Adds tags to a resource. A tag is a label you can assign to an AWS resource. In AWS Glue, you can tag only
     * certain resources. For information about what resources you can tag, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS Glue</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSGlueAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds tags to a resource. A tag is a label you can assign to an AWS resource. In AWS Glue, you can tag only
     * certain resources. For information about what resources you can tag, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS Glue</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSGlueAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSGlueAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSGlueAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Modifies an existing classifier (a <code>GrokClassifier</code>, an <code>XMLClassifier</code>, a
     * <code>JsonClassifier</code>, or a <code>CsvClassifier</code>, depending on which field is present).
     * </p>
     * 
     * @param updateClassifierRequest
     * @return A Java Future containing the result of the UpdateClassifier operation returned by the service.
     * @sample AWSGlueAsync.UpdateClassifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateClassifier" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateClassifierResult> updateClassifierAsync(UpdateClassifierRequest updateClassifierRequest);

    /**
     * <p>
     * Modifies an existing classifier (a <code>GrokClassifier</code>, an <code>XMLClassifier</code>, a
     * <code>JsonClassifier</code>, or a <code>CsvClassifier</code>, depending on which field is present).
     * </p>
     * 
     * @param updateClassifierRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateClassifier operation returned by the service.
     * @sample AWSGlueAsyncHandler.UpdateClassifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateClassifier" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateClassifierResult> updateClassifierAsync(UpdateClassifierRequest updateClassifierRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateClassifierRequest, UpdateClassifierResult> asyncHandler);

    /**
     * <p>
     * Updates a connection definition in the Data Catalog.
     * </p>
     * 
     * @param updateConnectionRequest
     * @return A Java Future containing the result of the UpdateConnection operation returned by the service.
     * @sample AWSGlueAsync.UpdateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateConnection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateConnectionResult> updateConnectionAsync(UpdateConnectionRequest updateConnectionRequest);

    /**
     * <p>
     * Updates a connection definition in the Data Catalog.
     * </p>
     * 
     * @param updateConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConnection operation returned by the service.
     * @sample AWSGlueAsyncHandler.UpdateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateConnection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateConnectionResult> updateConnectionAsync(UpdateConnectionRequest updateConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConnectionRequest, UpdateConnectionResult> asyncHandler);

    /**
     * <p>
     * Updates a crawler. If a crawler is running, you must stop it using <code>StopCrawler</code> before updating it.
     * </p>
     * 
     * @param updateCrawlerRequest
     * @return A Java Future containing the result of the UpdateCrawler operation returned by the service.
     * @sample AWSGlueAsync.UpdateCrawler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateCrawler" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateCrawlerResult> updateCrawlerAsync(UpdateCrawlerRequest updateCrawlerRequest);

    /**
     * <p>
     * Updates a crawler. If a crawler is running, you must stop it using <code>StopCrawler</code> before updating it.
     * </p>
     * 
     * @param updateCrawlerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCrawler operation returned by the service.
     * @sample AWSGlueAsyncHandler.UpdateCrawler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateCrawler" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateCrawlerResult> updateCrawlerAsync(UpdateCrawlerRequest updateCrawlerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCrawlerRequest, UpdateCrawlerResult> asyncHandler);

    /**
     * <p>
     * Updates the schedule of a crawler using a <code>cron</code> expression.
     * </p>
     * 
     * @param updateCrawlerScheduleRequest
     * @return A Java Future containing the result of the UpdateCrawlerSchedule operation returned by the service.
     * @sample AWSGlueAsync.UpdateCrawlerSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateCrawlerSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateCrawlerScheduleResult> updateCrawlerScheduleAsync(UpdateCrawlerScheduleRequest updateCrawlerScheduleRequest);

    /**
     * <p>
     * Updates the schedule of a crawler using a <code>cron</code> expression.
     * </p>
     * 
     * @param updateCrawlerScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCrawlerSchedule operation returned by the service.
     * @sample AWSGlueAsyncHandler.UpdateCrawlerSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateCrawlerSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateCrawlerScheduleResult> updateCrawlerScheduleAsync(UpdateCrawlerScheduleRequest updateCrawlerScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCrawlerScheduleRequest, UpdateCrawlerScheduleResult> asyncHandler);

    /**
     * <p>
     * Updates an existing database definition in a Data Catalog.
     * </p>
     * 
     * @param updateDatabaseRequest
     * @return A Java Future containing the result of the UpdateDatabase operation returned by the service.
     * @sample AWSGlueAsync.UpdateDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatabaseResult> updateDatabaseAsync(UpdateDatabaseRequest updateDatabaseRequest);

    /**
     * <p>
     * Updates an existing database definition in a Data Catalog.
     * </p>
     * 
     * @param updateDatabaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDatabase operation returned by the service.
     * @sample AWSGlueAsyncHandler.UpdateDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatabaseResult> updateDatabaseAsync(UpdateDatabaseRequest updateDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDatabaseRequest, UpdateDatabaseResult> asyncHandler);

    /**
     * <p>
     * Updates a specified development endpoint.
     * </p>
     * 
     * @param updateDevEndpointRequest
     * @return A Java Future containing the result of the UpdateDevEndpoint operation returned by the service.
     * @sample AWSGlueAsync.UpdateDevEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateDevEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDevEndpointResult> updateDevEndpointAsync(UpdateDevEndpointRequest updateDevEndpointRequest);

    /**
     * <p>
     * Updates a specified development endpoint.
     * </p>
     * 
     * @param updateDevEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDevEndpoint operation returned by the service.
     * @sample AWSGlueAsyncHandler.UpdateDevEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateDevEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDevEndpointResult> updateDevEndpointAsync(UpdateDevEndpointRequest updateDevEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDevEndpointRequest, UpdateDevEndpointResult> asyncHandler);

    /**
     * <p>
     * Updates an existing job definition.
     * </p>
     * 
     * @param updateJobRequest
     * @return A Java Future containing the result of the UpdateJob operation returned by the service.
     * @sample AWSGlueAsync.UpdateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateJobResult> updateJobAsync(UpdateJobRequest updateJobRequest);

    /**
     * <p>
     * Updates an existing job definition.
     * </p>
     * 
     * @param updateJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateJob operation returned by the service.
     * @sample AWSGlueAsyncHandler.UpdateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateJobResult> updateJobAsync(UpdateJobRequest updateJobRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateJobRequest, UpdateJobResult> asyncHandler);

    /**
     * <p>
     * Updates an existing machine learning transform. Call this operation to tune the algorithm parameters to achieve
     * better results.
     * </p>
     * <p>
     * After calling this operation, you can call the <code>StartMLEvaluationTaskRun</code> operation to assess how well
     * your new parameters achieved your goals (such as improving the quality of your machine learning transform, or
     * making it more cost-effective).
     * </p>
     * 
     * @param updateMLTransformRequest
     * @return A Java Future containing the result of the UpdateMLTransform operation returned by the service.
     * @sample AWSGlueAsync.UpdateMLTransform
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateMLTransform" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateMLTransformResult> updateMLTransformAsync(UpdateMLTransformRequest updateMLTransformRequest);

    /**
     * <p>
     * Updates an existing machine learning transform. Call this operation to tune the algorithm parameters to achieve
     * better results.
     * </p>
     * <p>
     * After calling this operation, you can call the <code>StartMLEvaluationTaskRun</code> operation to assess how well
     * your new parameters achieved your goals (such as improving the quality of your machine learning transform, or
     * making it more cost-effective).
     * </p>
     * 
     * @param updateMLTransformRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMLTransform operation returned by the service.
     * @sample AWSGlueAsyncHandler.UpdateMLTransform
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateMLTransform" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateMLTransformResult> updateMLTransformAsync(UpdateMLTransformRequest updateMLTransformRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMLTransformRequest, UpdateMLTransformResult> asyncHandler);

    /**
     * <p>
     * Updates a partition.
     * </p>
     * 
     * @param updatePartitionRequest
     * @return A Java Future containing the result of the UpdatePartition operation returned by the service.
     * @sample AWSGlueAsync.UpdatePartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdatePartition" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePartitionResult> updatePartitionAsync(UpdatePartitionRequest updatePartitionRequest);

    /**
     * <p>
     * Updates a partition.
     * </p>
     * 
     * @param updatePartitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePartition operation returned by the service.
     * @sample AWSGlueAsyncHandler.UpdatePartition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdatePartition" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePartitionResult> updatePartitionAsync(UpdatePartitionRequest updatePartitionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePartitionRequest, UpdatePartitionResult> asyncHandler);

    /**
     * <p>
     * Updates a metadata table in the Data Catalog.
     * </p>
     * 
     * @param updateTableRequest
     * @return A Java Future containing the result of the UpdateTable operation returned by the service.
     * @sample AWSGlueAsync.UpdateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTableResult> updateTableAsync(UpdateTableRequest updateTableRequest);

    /**
     * <p>
     * Updates a metadata table in the Data Catalog.
     * </p>
     * 
     * @param updateTableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTable operation returned by the service.
     * @sample AWSGlueAsyncHandler.UpdateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTableResult> updateTableAsync(UpdateTableRequest updateTableRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTableRequest, UpdateTableResult> asyncHandler);

    /**
     * <p>
     * Updates a trigger definition.
     * </p>
     * 
     * @param updateTriggerRequest
     * @return A Java Future containing the result of the UpdateTrigger operation returned by the service.
     * @sample AWSGlueAsync.UpdateTrigger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateTrigger" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTriggerResult> updateTriggerAsync(UpdateTriggerRequest updateTriggerRequest);

    /**
     * <p>
     * Updates a trigger definition.
     * </p>
     * 
     * @param updateTriggerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTrigger operation returned by the service.
     * @sample AWSGlueAsyncHandler.UpdateTrigger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateTrigger" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTriggerResult> updateTriggerAsync(UpdateTriggerRequest updateTriggerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTriggerRequest, UpdateTriggerResult> asyncHandler);

    /**
     * <p>
     * Updates an existing function definition in the Data Catalog.
     * </p>
     * 
     * @param updateUserDefinedFunctionRequest
     * @return A Java Future containing the result of the UpdateUserDefinedFunction operation returned by the service.
     * @sample AWSGlueAsync.UpdateUserDefinedFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateUserDefinedFunction" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserDefinedFunctionResult> updateUserDefinedFunctionAsync(
            UpdateUserDefinedFunctionRequest updateUserDefinedFunctionRequest);

    /**
     * <p>
     * Updates an existing function definition in the Data Catalog.
     * </p>
     * 
     * @param updateUserDefinedFunctionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUserDefinedFunction operation returned by the service.
     * @sample AWSGlueAsyncHandler.UpdateUserDefinedFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateUserDefinedFunction" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserDefinedFunctionResult> updateUserDefinedFunctionAsync(
            UpdateUserDefinedFunctionRequest updateUserDefinedFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserDefinedFunctionRequest, UpdateUserDefinedFunctionResult> asyncHandler);

    /**
     * <p>
     * Updates an existing workflow.
     * </p>
     * 
     * @param updateWorkflowRequest
     * @return A Java Future containing the result of the UpdateWorkflow operation returned by the service.
     * @sample AWSGlueAsync.UpdateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkflowResult> updateWorkflowAsync(UpdateWorkflowRequest updateWorkflowRequest);

    /**
     * <p>
     * Updates an existing workflow.
     * </p>
     * 
     * @param updateWorkflowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWorkflow operation returned by the service.
     * @sample AWSGlueAsyncHandler.UpdateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkflowResult> updateWorkflowAsync(UpdateWorkflowRequest updateWorkflowRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkflowRequest, UpdateWorkflowResult> asyncHandler);

}
