/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.neptunedata;

import javax.annotation.Generated;

import com.amazonaws.services.neptunedata.model.*;

/**
 * Interface for accessing Amazon NeptuneData asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.neptunedata.AbstractAmazonNeptunedataAsync} instead.
 * </p>
 * <p>
 * <p>
 * <fullname>Neptune Data API</fullname>
 * <p>
 * The Amazon Neptune data API provides SDK support for more than 40 of Neptune's data operations, including data
 * loading, query execution, data inquiry, and machine learning. It supports the Gremlin and openCypher query languages,
 * and is available in all SDK languages. It automatically signs API requests and greatly simplifies integrating Neptune
 * into your applications.
 * </p>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonNeptunedataAsync extends AmazonNeptunedata {

    /**
     * <p>
     * Cancels a Gremlin query. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/gremlin-api-status-cancel.html">Gremlin query
     * cancellation</a> for more information.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#cancelquery"
     * >neptune-db:CancelQuery</a> IAM action in that cluster.
     * </p>
     * 
     * @param cancelGremlinQueryRequest
     * @return A Java Future containing the result of the CancelGremlinQuery operation returned by the service.
     * @sample AmazonNeptunedataAsync.CancelGremlinQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelGremlinQuery" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelGremlinQueryResult> cancelGremlinQueryAsync(CancelGremlinQueryRequest cancelGremlinQueryRequest);

    /**
     * <p>
     * Cancels a Gremlin query. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/gremlin-api-status-cancel.html">Gremlin query
     * cancellation</a> for more information.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#cancelquery"
     * >neptune-db:CancelQuery</a> IAM action in that cluster.
     * </p>
     * 
     * @param cancelGremlinQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelGremlinQuery operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.CancelGremlinQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelGremlinQuery" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelGremlinQueryResult> cancelGremlinQueryAsync(CancelGremlinQueryRequest cancelGremlinQueryRequest,
            com.amazonaws.handlers.AsyncHandler<CancelGremlinQueryRequest, CancelGremlinQueryResult> asyncHandler);

    /**
     * <p>
     * Cancels a specified load job. This is an HTTP <code>DELETE</code> request. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/load-api-reference-status.htm">Neptune Loader
     * Get-Status API</a> for more information.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#cancelloaderjob"
     * >neptune-db:CancelLoaderJob</a> IAM action in that cluster..
     * </p>
     * 
     * @param cancelLoaderJobRequest
     * @return A Java Future containing the result of the CancelLoaderJob operation returned by the service.
     * @sample AmazonNeptunedataAsync.CancelLoaderJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelLoaderJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelLoaderJobResult> cancelLoaderJobAsync(CancelLoaderJobRequest cancelLoaderJobRequest);

    /**
     * <p>
     * Cancels a specified load job. This is an HTTP <code>DELETE</code> request. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/load-api-reference-status.htm">Neptune Loader
     * Get-Status API</a> for more information.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#cancelloaderjob"
     * >neptune-db:CancelLoaderJob</a> IAM action in that cluster..
     * </p>
     * 
     * @param cancelLoaderJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelLoaderJob operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.CancelLoaderJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelLoaderJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelLoaderJobResult> cancelLoaderJobAsync(CancelLoaderJobRequest cancelLoaderJobRequest,
            com.amazonaws.handlers.AsyncHandler<CancelLoaderJobRequest, CancelLoaderJobResult> asyncHandler);

    /**
     * <p>
     * Cancels a Neptune ML data processing job. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-dataprocessing.html">The
     * <code>dataprocessing</code> command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#cancelmldataprocessingjob"
     * >neptune-db:CancelMLDataProcessingJob</a> IAM action in that cluster.
     * </p>
     * 
     * @param cancelMLDataProcessingJobRequest
     * @return A Java Future containing the result of the CancelMLDataProcessingJob operation returned by the service.
     * @sample AmazonNeptunedataAsync.CancelMLDataProcessingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelMLDataProcessingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelMLDataProcessingJobResult> cancelMLDataProcessingJobAsync(
            CancelMLDataProcessingJobRequest cancelMLDataProcessingJobRequest);

    /**
     * <p>
     * Cancels a Neptune ML data processing job. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-dataprocessing.html">The
     * <code>dataprocessing</code> command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#cancelmldataprocessingjob"
     * >neptune-db:CancelMLDataProcessingJob</a> IAM action in that cluster.
     * </p>
     * 
     * @param cancelMLDataProcessingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelMLDataProcessingJob operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.CancelMLDataProcessingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelMLDataProcessingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelMLDataProcessingJobResult> cancelMLDataProcessingJobAsync(
            CancelMLDataProcessingJobRequest cancelMLDataProcessingJobRequest,
            com.amazonaws.handlers.AsyncHandler<CancelMLDataProcessingJobRequest, CancelMLDataProcessingJobResult> asyncHandler);

    /**
     * <p>
     * Cancels a Neptune ML model training job. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-modeltraining.html">Model
     * training using the <code>modeltraining</code> command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#cancelmlmodeltrainingjob"
     * >neptune-db:CancelMLModelTrainingJob</a> IAM action in that cluster.
     * </p>
     * 
     * @param cancelMLModelTrainingJobRequest
     * @return A Java Future containing the result of the CancelMLModelTrainingJob operation returned by the service.
     * @sample AmazonNeptunedataAsync.CancelMLModelTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelMLModelTrainingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelMLModelTrainingJobResult> cancelMLModelTrainingJobAsync(CancelMLModelTrainingJobRequest cancelMLModelTrainingJobRequest);

    /**
     * <p>
     * Cancels a Neptune ML model training job. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-modeltraining.html">Model
     * training using the <code>modeltraining</code> command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#cancelmlmodeltrainingjob"
     * >neptune-db:CancelMLModelTrainingJob</a> IAM action in that cluster.
     * </p>
     * 
     * @param cancelMLModelTrainingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelMLModelTrainingJob operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.CancelMLModelTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelMLModelTrainingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelMLModelTrainingJobResult> cancelMLModelTrainingJobAsync(CancelMLModelTrainingJobRequest cancelMLModelTrainingJobRequest,
            com.amazonaws.handlers.AsyncHandler<CancelMLModelTrainingJobRequest, CancelMLModelTrainingJobResult> asyncHandler);

    /**
     * <p>
     * Cancels a specified model transform job. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-model-transform.html">Use a trained
     * model to generate new model artifacts</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#cancelmlmodeltransformjob"
     * >neptune-db:CancelMLModelTransformJob</a> IAM action in that cluster.
     * </p>
     * 
     * @param cancelMLModelTransformJobRequest
     * @return A Java Future containing the result of the CancelMLModelTransformJob operation returned by the service.
     * @sample AmazonNeptunedataAsync.CancelMLModelTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelMLModelTransformJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelMLModelTransformJobResult> cancelMLModelTransformJobAsync(
            CancelMLModelTransformJobRequest cancelMLModelTransformJobRequest);

    /**
     * <p>
     * Cancels a specified model transform job. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-model-transform.html">Use a trained
     * model to generate new model artifacts</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#cancelmlmodeltransformjob"
     * >neptune-db:CancelMLModelTransformJob</a> IAM action in that cluster.
     * </p>
     * 
     * @param cancelMLModelTransformJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelMLModelTransformJob operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.CancelMLModelTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelMLModelTransformJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelMLModelTransformJobResult> cancelMLModelTransformJobAsync(
            CancelMLModelTransformJobRequest cancelMLModelTransformJobRequest,
            com.amazonaws.handlers.AsyncHandler<CancelMLModelTransformJobRequest, CancelMLModelTransformJobResult> asyncHandler);

    /**
     * <p>
     * Cancels a specified openCypher query. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/access-graph-opencypher-status.html">Neptune
     * openCypher status endpoint</a> for more information.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#cancelquery"
     * >neptune-db:CancelQuery</a> IAM action in that cluster.
     * </p>
     * 
     * @param cancelOpenCypherQueryRequest
     * @return A Java Future containing the result of the CancelOpenCypherQuery operation returned by the service.
     * @sample AmazonNeptunedataAsync.CancelOpenCypherQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelOpenCypherQuery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelOpenCypherQueryResult> cancelOpenCypherQueryAsync(CancelOpenCypherQueryRequest cancelOpenCypherQueryRequest);

    /**
     * <p>
     * Cancels a specified openCypher query. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/access-graph-opencypher-status.html">Neptune
     * openCypher status endpoint</a> for more information.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#cancelquery"
     * >neptune-db:CancelQuery</a> IAM action in that cluster.
     * </p>
     * 
     * @param cancelOpenCypherQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelOpenCypherQuery operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.CancelOpenCypherQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelOpenCypherQuery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelOpenCypherQueryResult> cancelOpenCypherQueryAsync(CancelOpenCypherQueryRequest cancelOpenCypherQueryRequest,
            com.amazonaws.handlers.AsyncHandler<CancelOpenCypherQueryRequest, CancelOpenCypherQueryResult> asyncHandler);

    /**
     * <p>
     * Creates a new Neptune ML inference endpoint that lets you query one specific model that the model-training
     * process constructed. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-endpoints.html">Managing
     * inference endpoints using the endpoints command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#createmlendpoint"
     * >neptune-db:CreateMLEndpoint</a> IAM action in that cluster.
     * </p>
     * 
     * @param createMLEndpointRequest
     * @return A Java Future containing the result of the CreateMLEndpoint operation returned by the service.
     * @sample AmazonNeptunedataAsync.CreateMLEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CreateMLEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateMLEndpointResult> createMLEndpointAsync(CreateMLEndpointRequest createMLEndpointRequest);

    /**
     * <p>
     * Creates a new Neptune ML inference endpoint that lets you query one specific model that the model-training
     * process constructed. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-endpoints.html">Managing
     * inference endpoints using the endpoints command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#createmlendpoint"
     * >neptune-db:CreateMLEndpoint</a> IAM action in that cluster.
     * </p>
     * 
     * @param createMLEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMLEndpoint operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.CreateMLEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CreateMLEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateMLEndpointResult> createMLEndpointAsync(CreateMLEndpointRequest createMLEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMLEndpointRequest, CreateMLEndpointResult> asyncHandler);

    /**
     * <p>
     * Cancels the creation of a Neptune ML inference endpoint. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-endpoints.html">Managing
     * inference endpoints using the endpoints command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#deletemlendpoint"
     * >neptune-db:DeleteMLEndpoint</a> IAM action in that cluster.
     * </p>
     * 
     * @param deleteMLEndpointRequest
     * @return A Java Future containing the result of the DeleteMLEndpoint operation returned by the service.
     * @sample AmazonNeptunedataAsync.DeleteMLEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/DeleteMLEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMLEndpointResult> deleteMLEndpointAsync(DeleteMLEndpointRequest deleteMLEndpointRequest);

    /**
     * <p>
     * Cancels the creation of a Neptune ML inference endpoint. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-endpoints.html">Managing
     * inference endpoints using the endpoints command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#deletemlendpoint"
     * >neptune-db:DeleteMLEndpoint</a> IAM action in that cluster.
     * </p>
     * 
     * @param deleteMLEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMLEndpoint operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.DeleteMLEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/DeleteMLEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMLEndpointResult> deleteMLEndpointAsync(DeleteMLEndpointRequest deleteMLEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMLEndpointRequest, DeleteMLEndpointResult> asyncHandler);

    /**
     * <p>
     * Deletes statistics for Gremlin and openCypher (property graph) data.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#deletestatistics"
     * >neptune-db:DeleteStatistics</a> IAM action in that cluster.
     * </p>
     * 
     * @param deletePropertygraphStatisticsRequest
     * @return A Java Future containing the result of the DeletePropertygraphStatistics operation returned by the
     *         service.
     * @sample AmazonNeptunedataAsync.DeletePropertygraphStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/DeletePropertygraphStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePropertygraphStatisticsResult> deletePropertygraphStatisticsAsync(
            DeletePropertygraphStatisticsRequest deletePropertygraphStatisticsRequest);

    /**
     * <p>
     * Deletes statistics for Gremlin and openCypher (property graph) data.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#deletestatistics"
     * >neptune-db:DeleteStatistics</a> IAM action in that cluster.
     * </p>
     * 
     * @param deletePropertygraphStatisticsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePropertygraphStatistics operation returned by the
     *         service.
     * @sample AmazonNeptunedataAsyncHandler.DeletePropertygraphStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/DeletePropertygraphStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePropertygraphStatisticsResult> deletePropertygraphStatisticsAsync(
            DeletePropertygraphStatisticsRequest deletePropertygraphStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePropertygraphStatisticsRequest, DeletePropertygraphStatisticsResult> asyncHandler);

    /**
     * <p>
     * Deletes SPARQL statistics
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#deletestatistics"
     * >neptune-db:DeleteStatistics</a> IAM action in that cluster.
     * </p>
     * 
     * @param deleteSparqlStatisticsRequest
     * @return A Java Future containing the result of the DeleteSparqlStatistics operation returned by the service.
     * @sample AmazonNeptunedataAsync.DeleteSparqlStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/DeleteSparqlStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSparqlStatisticsResult> deleteSparqlStatisticsAsync(DeleteSparqlStatisticsRequest deleteSparqlStatisticsRequest);

    /**
     * <p>
     * Deletes SPARQL statistics
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#deletestatistics"
     * >neptune-db:DeleteStatistics</a> IAM action in that cluster.
     * </p>
     * 
     * @param deleteSparqlStatisticsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSparqlStatistics operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.DeleteSparqlStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/DeleteSparqlStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSparqlStatisticsResult> deleteSparqlStatisticsAsync(DeleteSparqlStatisticsRequest deleteSparqlStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSparqlStatisticsRequest, DeleteSparqlStatisticsResult> asyncHandler);

    /**
     * <p>
     * The fast reset REST API lets you reset a Neptune graph quicky and easily, removing all of its data.
     * </p>
     * <p>
     * Neptune fast reset is a two-step process. First you call <code>ExecuteFastReset</code> with <code>action</code>
     * set to <code>initiateDatabaseReset</code>. This returns a UUID token which you then include when calling
     * <code>ExecuteFastReset</code> again with <code>action</code> set to <code>performDatabaseReset</code>. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/manage-console-fast-reset.html">Empty an Amazon
     * Neptune DB cluster using the fast reset API</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#resetdatabase"
     * >neptune-db:ResetDatabase</a> IAM action in that cluster.
     * </p>
     * 
     * @param executeFastResetRequest
     * @return A Java Future containing the result of the ExecuteFastReset operation returned by the service.
     * @sample AmazonNeptunedataAsync.ExecuteFastReset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ExecuteFastReset" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ExecuteFastResetResult> executeFastResetAsync(ExecuteFastResetRequest executeFastResetRequest);

    /**
     * <p>
     * The fast reset REST API lets you reset a Neptune graph quicky and easily, removing all of its data.
     * </p>
     * <p>
     * Neptune fast reset is a two-step process. First you call <code>ExecuteFastReset</code> with <code>action</code>
     * set to <code>initiateDatabaseReset</code>. This returns a UUID token which you then include when calling
     * <code>ExecuteFastReset</code> again with <code>action</code> set to <code>performDatabaseReset</code>. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/manage-console-fast-reset.html">Empty an Amazon
     * Neptune DB cluster using the fast reset API</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#resetdatabase"
     * >neptune-db:ResetDatabase</a> IAM action in that cluster.
     * </p>
     * 
     * @param executeFastResetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExecuteFastReset operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.ExecuteFastReset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ExecuteFastReset" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ExecuteFastResetResult> executeFastResetAsync(ExecuteFastResetRequest executeFastResetRequest,
            com.amazonaws.handlers.AsyncHandler<ExecuteFastResetRequest, ExecuteFastResetResult> asyncHandler);

    /**
     * <p>
     * Executes a Gremlin Explain query.
     * </p>
     * <p>
     * Amazon Neptune has added a Gremlin feature named <code>explain</code> that provides is a self-service tool for
     * understanding the execution approach being taken by the Neptune engine for the query. You invoke it by adding an
     * <code>explain</code> parameter to an HTTP call that submits a Gremlin query.
     * </p>
     * <p>
     * The explain feature provides information about the logical structure of query execution plans. You can use this
     * information to identify potential evaluation and execution bottlenecks and to tune your query, as explained in <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/gremlin-traversal-tuning.html">Tuning Gremlin
     * queries</a>. You can also use query hints to improve query execution plans.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows one of the following IAM actions in that cluster,
     * depending on the query:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#readdataviaquery">neptune-db:
     * ReadDataViaQuery</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#writedataviaquery">neptune-db:
     * WriteDataViaQuery</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#deletedataviaquery">neptune-db:
     * DeleteDataViaQuery</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:Gremlin</a> IAM condition key can be used in the policy document to restrict the use of
     * Gremlin queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param executeGremlinExplainQueryRequest
     * @return A Java Future containing the result of the ExecuteGremlinExplainQuery operation returned by the service.
     * @sample AmazonNeptunedataAsync.ExecuteGremlinExplainQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ExecuteGremlinExplainQuery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExecuteGremlinExplainQueryResult> executeGremlinExplainQueryAsync(
            ExecuteGremlinExplainQueryRequest executeGremlinExplainQueryRequest);

    /**
     * <p>
     * Executes a Gremlin Explain query.
     * </p>
     * <p>
     * Amazon Neptune has added a Gremlin feature named <code>explain</code> that provides is a self-service tool for
     * understanding the execution approach being taken by the Neptune engine for the query. You invoke it by adding an
     * <code>explain</code> parameter to an HTTP call that submits a Gremlin query.
     * </p>
     * <p>
     * The explain feature provides information about the logical structure of query execution plans. You can use this
     * information to identify potential evaluation and execution bottlenecks and to tune your query, as explained in <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/gremlin-traversal-tuning.html">Tuning Gremlin
     * queries</a>. You can also use query hints to improve query execution plans.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows one of the following IAM actions in that cluster,
     * depending on the query:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#readdataviaquery">neptune-db:
     * ReadDataViaQuery</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#writedataviaquery">neptune-db:
     * WriteDataViaQuery</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#deletedataviaquery">neptune-db:
     * DeleteDataViaQuery</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:Gremlin</a> IAM condition key can be used in the policy document to restrict the use of
     * Gremlin queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param executeGremlinExplainQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExecuteGremlinExplainQuery operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.ExecuteGremlinExplainQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ExecuteGremlinExplainQuery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExecuteGremlinExplainQueryResult> executeGremlinExplainQueryAsync(
            ExecuteGremlinExplainQueryRequest executeGremlinExplainQueryRequest,
            com.amazonaws.handlers.AsyncHandler<ExecuteGremlinExplainQueryRequest, ExecuteGremlinExplainQueryResult> asyncHandler);

    /**
     * <p>
     * Executes a Gremlin Profile query, which runs a specified traversal, collects various metrics about the run, and
     * produces a profile report as output. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/gremlin-profile-api.html">Gremlin profile API in
     * Neptune</a> for details.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#readdataviaquery"
     * >neptune-db:ReadDataViaQuery</a> IAM action in that cluster.
     * </p>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:Gremlin</a> IAM condition key can be used in the policy document to restrict the use of
     * Gremlin queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param executeGremlinProfileQueryRequest
     * @return A Java Future containing the result of the ExecuteGremlinProfileQuery operation returned by the service.
     * @sample AmazonNeptunedataAsync.ExecuteGremlinProfileQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ExecuteGremlinProfileQuery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExecuteGremlinProfileQueryResult> executeGremlinProfileQueryAsync(
            ExecuteGremlinProfileQueryRequest executeGremlinProfileQueryRequest);

    /**
     * <p>
     * Executes a Gremlin Profile query, which runs a specified traversal, collects various metrics about the run, and
     * produces a profile report as output. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/gremlin-profile-api.html">Gremlin profile API in
     * Neptune</a> for details.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#readdataviaquery"
     * >neptune-db:ReadDataViaQuery</a> IAM action in that cluster.
     * </p>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:Gremlin</a> IAM condition key can be used in the policy document to restrict the use of
     * Gremlin queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param executeGremlinProfileQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExecuteGremlinProfileQuery operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.ExecuteGremlinProfileQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ExecuteGremlinProfileQuery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExecuteGremlinProfileQueryResult> executeGremlinProfileQueryAsync(
            ExecuteGremlinProfileQueryRequest executeGremlinProfileQueryRequest,
            com.amazonaws.handlers.AsyncHandler<ExecuteGremlinProfileQueryRequest, ExecuteGremlinProfileQueryResult> asyncHandler);

    /**
     * <p>
     * This commands executes a Gremlin query. Amazon Neptune is compatible with Apache TinkerPop3 and Gremlin, so you
     * can use the Gremlin traversal language to query the graph, as described under <a
     * href="https://tinkerpop.apache.org/docs/current/reference/#graph">The Graph</a> in the Apache TinkerPop3
     * documentation. More details can also be found in <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/access-graph-gremlin.html">Accessing a Neptune graph
     * with Gremlin</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that enables one of the following IAM actions in that cluster,
     * depending on the query:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#readdataviaquery">neptune-db:
     * ReadDataViaQuery</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#writedataviaquery">neptune-db:
     * WriteDataViaQuery</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#deletedataviaquery">neptune-db:
     * DeleteDataViaQuery</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:Gremlin</a> IAM condition key can be used in the policy document to restrict the use of
     * Gremlin queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param executeGremlinQueryRequest
     * @return A Java Future containing the result of the ExecuteGremlinQuery operation returned by the service.
     * @sample AmazonNeptunedataAsync.ExecuteGremlinQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ExecuteGremlinQuery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExecuteGremlinQueryResult> executeGremlinQueryAsync(ExecuteGremlinQueryRequest executeGremlinQueryRequest);

    /**
     * <p>
     * This commands executes a Gremlin query. Amazon Neptune is compatible with Apache TinkerPop3 and Gremlin, so you
     * can use the Gremlin traversal language to query the graph, as described under <a
     * href="https://tinkerpop.apache.org/docs/current/reference/#graph">The Graph</a> in the Apache TinkerPop3
     * documentation. More details can also be found in <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/access-graph-gremlin.html">Accessing a Neptune graph
     * with Gremlin</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that enables one of the following IAM actions in that cluster,
     * depending on the query:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#readdataviaquery">neptune-db:
     * ReadDataViaQuery</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#writedataviaquery">neptune-db:
     * WriteDataViaQuery</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#deletedataviaquery">neptune-db:
     * DeleteDataViaQuery</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:Gremlin</a> IAM condition key can be used in the policy document to restrict the use of
     * Gremlin queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param executeGremlinQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExecuteGremlinQuery operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.ExecuteGremlinQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ExecuteGremlinQuery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExecuteGremlinQueryResult> executeGremlinQueryAsync(ExecuteGremlinQueryRequest executeGremlinQueryRequest,
            com.amazonaws.handlers.AsyncHandler<ExecuteGremlinQueryRequest, ExecuteGremlinQueryResult> asyncHandler);

    /**
     * <p>
     * Executes an openCypher <code>explain</code> request. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/access-graph-opencypher-explain.html">The openCypher
     * explain feature</a> for more information.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#readdataviaquery"
     * >neptune-db:ReadDataViaQuery</a> IAM action in that cluster.
     * </p>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:OpenCypher</a> IAM condition key can be used in the policy document to restrict the use
     * of openCypher queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param executeOpenCypherExplainQueryRequest
     * @return A Java Future containing the result of the ExecuteOpenCypherExplainQuery operation returned by the
     *         service.
     * @sample AmazonNeptunedataAsync.ExecuteOpenCypherExplainQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ExecuteOpenCypherExplainQuery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExecuteOpenCypherExplainQueryResult> executeOpenCypherExplainQueryAsync(
            ExecuteOpenCypherExplainQueryRequest executeOpenCypherExplainQueryRequest);

    /**
     * <p>
     * Executes an openCypher <code>explain</code> request. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/access-graph-opencypher-explain.html">The openCypher
     * explain feature</a> for more information.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#readdataviaquery"
     * >neptune-db:ReadDataViaQuery</a> IAM action in that cluster.
     * </p>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:OpenCypher</a> IAM condition key can be used in the policy document to restrict the use
     * of openCypher queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param executeOpenCypherExplainQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExecuteOpenCypherExplainQuery operation returned by the
     *         service.
     * @sample AmazonNeptunedataAsyncHandler.ExecuteOpenCypherExplainQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ExecuteOpenCypherExplainQuery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExecuteOpenCypherExplainQueryResult> executeOpenCypherExplainQueryAsync(
            ExecuteOpenCypherExplainQueryRequest executeOpenCypherExplainQueryRequest,
            com.amazonaws.handlers.AsyncHandler<ExecuteOpenCypherExplainQueryRequest, ExecuteOpenCypherExplainQueryResult> asyncHandler);

    /**
     * <p>
     * Retrieves the status of the graph database on the host.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getenginestatus"
     * >neptune-db:GetEngineStatus</a> IAM action in that cluster.
     * </p>
     * 
     * @param getEngineStatusRequest
     * @return A Java Future containing the result of the GetEngineStatus operation returned by the service.
     * @sample AmazonNeptunedataAsync.GetEngineStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetEngineStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetEngineStatusResult> getEngineStatusAsync(GetEngineStatusRequest getEngineStatusRequest);

    /**
     * <p>
     * Retrieves the status of the graph database on the host.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getenginestatus"
     * >neptune-db:GetEngineStatus</a> IAM action in that cluster.
     * </p>
     * 
     * @param getEngineStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEngineStatus operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.GetEngineStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetEngineStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetEngineStatusResult> getEngineStatusAsync(GetEngineStatusRequest getEngineStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetEngineStatusRequest, GetEngineStatusResult> asyncHandler);

    /**
     * <p>
     * Gets the status of a specified Gremlin query.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getquerystatus"
     * >neptune-db:GetQueryStatus</a> IAM action in that cluster.
     * </p>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:Gremlin</a> IAM condition key can be used in the policy document to restrict the use of
     * Gremlin queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param getGremlinQueryStatusRequest
     * @return A Java Future containing the result of the GetGremlinQueryStatus operation returned by the service.
     * @sample AmazonNeptunedataAsync.GetGremlinQueryStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetGremlinQueryStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetGremlinQueryStatusResult> getGremlinQueryStatusAsync(GetGremlinQueryStatusRequest getGremlinQueryStatusRequest);

    /**
     * <p>
     * Gets the status of a specified Gremlin query.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getquerystatus"
     * >neptune-db:GetQueryStatus</a> IAM action in that cluster.
     * </p>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:Gremlin</a> IAM condition key can be used in the policy document to restrict the use of
     * Gremlin queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param getGremlinQueryStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGremlinQueryStatus operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.GetGremlinQueryStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetGremlinQueryStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetGremlinQueryStatusResult> getGremlinQueryStatusAsync(GetGremlinQueryStatusRequest getGremlinQueryStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetGremlinQueryStatusRequest, GetGremlinQueryStatusResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a specified data processing job. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-dataprocessing.html">The
     * <code>dataprocessing</code> command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getmldataprocessingjobstatus"
     * >neptune-db:neptune-db:GetMLDataProcessingJobStatus</a> IAM action in that cluster.
     * </p>
     * 
     * @param getMLDataProcessingJobRequest
     * @return A Java Future containing the result of the GetMLDataProcessingJob operation returned by the service.
     * @sample AmazonNeptunedataAsync.GetMLDataProcessingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetMLDataProcessingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMLDataProcessingJobResult> getMLDataProcessingJobAsync(GetMLDataProcessingJobRequest getMLDataProcessingJobRequest);

    /**
     * <p>
     * Retrieves information about a specified data processing job. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-dataprocessing.html">The
     * <code>dataprocessing</code> command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getmldataprocessingjobstatus"
     * >neptune-db:neptune-db:GetMLDataProcessingJobStatus</a> IAM action in that cluster.
     * </p>
     * 
     * @param getMLDataProcessingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMLDataProcessingJob operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.GetMLDataProcessingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetMLDataProcessingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMLDataProcessingJobResult> getMLDataProcessingJobAsync(GetMLDataProcessingJobRequest getMLDataProcessingJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetMLDataProcessingJobRequest, GetMLDataProcessingJobResult> asyncHandler);

    /**
     * <p>
     * Retrieves details about an inference endpoint. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-endpoints.html">Managing
     * inference endpoints using the endpoints command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getmlendpointstatus"
     * >neptune-db:GetMLEndpointStatus</a> IAM action in that cluster.
     * </p>
     * 
     * @param getMLEndpointRequest
     * @return A Java Future containing the result of the GetMLEndpoint operation returned by the service.
     * @sample AmazonNeptunedataAsync.GetMLEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetMLEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMLEndpointResult> getMLEndpointAsync(GetMLEndpointRequest getMLEndpointRequest);

    /**
     * <p>
     * Retrieves details about an inference endpoint. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-endpoints.html">Managing
     * inference endpoints using the endpoints command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getmlendpointstatus"
     * >neptune-db:GetMLEndpointStatus</a> IAM action in that cluster.
     * </p>
     * 
     * @param getMLEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMLEndpoint operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.GetMLEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetMLEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMLEndpointResult> getMLEndpointAsync(GetMLEndpointRequest getMLEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<GetMLEndpointRequest, GetMLEndpointResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a Neptune ML model training job. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-modeltraining.html">Model
     * training using the <code>modeltraining</code> command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getmlmodeltrainingjobstatus"
     * >neptune-db:GetMLModelTrainingJobStatus</a> IAM action in that cluster.
     * </p>
     * 
     * @param getMLModelTrainingJobRequest
     * @return A Java Future containing the result of the GetMLModelTrainingJob operation returned by the service.
     * @sample AmazonNeptunedataAsync.GetMLModelTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetMLModelTrainingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMLModelTrainingJobResult> getMLModelTrainingJobAsync(GetMLModelTrainingJobRequest getMLModelTrainingJobRequest);

    /**
     * <p>
     * Retrieves information about a Neptune ML model training job. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-modeltraining.html">Model
     * training using the <code>modeltraining</code> command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getmlmodeltrainingjobstatus"
     * >neptune-db:GetMLModelTrainingJobStatus</a> IAM action in that cluster.
     * </p>
     * 
     * @param getMLModelTrainingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMLModelTrainingJob operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.GetMLModelTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetMLModelTrainingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMLModelTrainingJobResult> getMLModelTrainingJobAsync(GetMLModelTrainingJobRequest getMLModelTrainingJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetMLModelTrainingJobRequest, GetMLModelTrainingJobResult> asyncHandler);

    /**
     * <p>
     * Gets information about a specified model transform job. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-model-transform.html">Use a trained
     * model to generate new model artifacts</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getmlmodeltransformjobstatus"
     * >neptune-db:GetMLModelTransformJobStatus</a> IAM action in that cluster.
     * </p>
     * 
     * @param getMLModelTransformJobRequest
     * @return A Java Future containing the result of the GetMLModelTransformJob operation returned by the service.
     * @sample AmazonNeptunedataAsync.GetMLModelTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetMLModelTransformJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMLModelTransformJobResult> getMLModelTransformJobAsync(GetMLModelTransformJobRequest getMLModelTransformJobRequest);

    /**
     * <p>
     * Gets information about a specified model transform job. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-model-transform.html">Use a trained
     * model to generate new model artifacts</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getmlmodeltransformjobstatus"
     * >neptune-db:GetMLModelTransformJobStatus</a> IAM action in that cluster.
     * </p>
     * 
     * @param getMLModelTransformJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMLModelTransformJob operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.GetMLModelTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetMLModelTransformJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMLModelTransformJobResult> getMLModelTransformJobAsync(GetMLModelTransformJobRequest getMLModelTransformJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetMLModelTransformJobRequest, GetMLModelTransformJobResult> asyncHandler);

    /**
     * <p>
     * Retrieves the status of a specified openCypher query.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getquerystatus"
     * >neptune-db:GetQueryStatus</a> IAM action in that cluster.
     * </p>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:OpenCypher</a> IAM condition key can be used in the policy document to restrict the use
     * of openCypher queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param getOpenCypherQueryStatusRequest
     * @return A Java Future containing the result of the GetOpenCypherQueryStatus operation returned by the service.
     * @sample AmazonNeptunedataAsync.GetOpenCypherQueryStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetOpenCypherQueryStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOpenCypherQueryStatusResult> getOpenCypherQueryStatusAsync(GetOpenCypherQueryStatusRequest getOpenCypherQueryStatusRequest);

    /**
     * <p>
     * Retrieves the status of a specified openCypher query.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getquerystatus"
     * >neptune-db:GetQueryStatus</a> IAM action in that cluster.
     * </p>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:OpenCypher</a> IAM condition key can be used in the policy document to restrict the use
     * of openCypher queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param getOpenCypherQueryStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOpenCypherQueryStatus operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.GetOpenCypherQueryStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetOpenCypherQueryStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOpenCypherQueryStatusResult> getOpenCypherQueryStatusAsync(GetOpenCypherQueryStatusRequest getOpenCypherQueryStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetOpenCypherQueryStatusRequest, GetOpenCypherQueryStatusResult> asyncHandler);

    /**
     * <p>
     * Gets property graph statistics (Gremlin and openCypher).
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getstatisticsstatus"
     * >neptune-db:GetStatisticsStatus</a> IAM action in that cluster.
     * </p>
     * 
     * @param getPropertygraphStatisticsRequest
     * @return A Java Future containing the result of the GetPropertygraphStatistics operation returned by the service.
     * @sample AmazonNeptunedataAsync.GetPropertygraphStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetPropertygraphStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPropertygraphStatisticsResult> getPropertygraphStatisticsAsync(
            GetPropertygraphStatisticsRequest getPropertygraphStatisticsRequest);

    /**
     * <p>
     * Gets property graph statistics (Gremlin and openCypher).
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getstatisticsstatus"
     * >neptune-db:GetStatisticsStatus</a> IAM action in that cluster.
     * </p>
     * 
     * @param getPropertygraphStatisticsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPropertygraphStatistics operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.GetPropertygraphStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetPropertygraphStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPropertygraphStatisticsResult> getPropertygraphStatisticsAsync(
            GetPropertygraphStatisticsRequest getPropertygraphStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<GetPropertygraphStatisticsRequest, GetPropertygraphStatisticsResult> asyncHandler);

    /**
     * <p>
     * Gets a graph summary for a property graph.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getgraphsummary"
     * >neptune-db:GetGraphSummary</a> IAM action in that cluster.
     * </p>
     * 
     * @param getPropertygraphSummaryRequest
     * @return A Java Future containing the result of the GetPropertygraphSummary operation returned by the service.
     * @sample AmazonNeptunedataAsync.GetPropertygraphSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetPropertygraphSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPropertygraphSummaryResult> getPropertygraphSummaryAsync(GetPropertygraphSummaryRequest getPropertygraphSummaryRequest);

    /**
     * <p>
     * Gets a graph summary for a property graph.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getgraphsummary"
     * >neptune-db:GetGraphSummary</a> IAM action in that cluster.
     * </p>
     * 
     * @param getPropertygraphSummaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPropertygraphSummary operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.GetPropertygraphSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetPropertygraphSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPropertygraphSummaryResult> getPropertygraphSummaryAsync(GetPropertygraphSummaryRequest getPropertygraphSummaryRequest,
            com.amazonaws.handlers.AsyncHandler<GetPropertygraphSummaryRequest, GetPropertygraphSummaryResult> asyncHandler);

    /**
     * <p>
     * Gets a graph summary for an RDF graph.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getgraphsummary"
     * >neptune-db:GetGraphSummary</a> IAM action in that cluster.
     * </p>
     * 
     * @param getRDFGraphSummaryRequest
     * @return A Java Future containing the result of the GetRDFGraphSummary operation returned by the service.
     * @sample AmazonNeptunedataAsync.GetRDFGraphSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetRDFGraphSummary" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetRDFGraphSummaryResult> getRDFGraphSummaryAsync(GetRDFGraphSummaryRequest getRDFGraphSummaryRequest);

    /**
     * <p>
     * Gets a graph summary for an RDF graph.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getgraphsummary"
     * >neptune-db:GetGraphSummary</a> IAM action in that cluster.
     * </p>
     * 
     * @param getRDFGraphSummaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRDFGraphSummary operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.GetRDFGraphSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetRDFGraphSummary" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetRDFGraphSummaryResult> getRDFGraphSummaryAsync(GetRDFGraphSummaryRequest getRDFGraphSummaryRequest,
            com.amazonaws.handlers.AsyncHandler<GetRDFGraphSummaryRequest, GetRDFGraphSummaryResult> asyncHandler);

    /**
     * <p>
     * Gets RDF statistics (SPARQL).
     * </p>
     * 
     * @param getSparqlStatisticsRequest
     * @return A Java Future containing the result of the GetSparqlStatistics operation returned by the service.
     * @sample AmazonNeptunedataAsync.GetSparqlStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetSparqlStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSparqlStatisticsResult> getSparqlStatisticsAsync(GetSparqlStatisticsRequest getSparqlStatisticsRequest);

    /**
     * <p>
     * Gets RDF statistics (SPARQL).
     * </p>
     * 
     * @param getSparqlStatisticsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSparqlStatistics operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.GetSparqlStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetSparqlStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSparqlStatisticsResult> getSparqlStatisticsAsync(GetSparqlStatisticsRequest getSparqlStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSparqlStatisticsRequest, GetSparqlStatisticsResult> asyncHandler);

    /**
     * <p>
     * Gets a stream for an RDF graph.
     * </p>
     * <p>
     * With the Neptune Streams feature, you can generate a complete sequence of change-log entries that record every
     * change made to your graph data as it happens. <code>GetSparqlStream</code> lets you collect these change-log
     * entries for an RDF graph.
     * </p>
     * <p>
     * The Neptune streams feature needs to be enabled on your Neptune DBcluster. To enable streams, set the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/parameters.html#parameters-db-cluster-parameters-neptune_streams"
     * >neptune_streams</a> DB cluster parameter to <code>1</code>.
     * </p>
     * <p>
     * See <a href="https://docs.aws.amazon.com/neptune/latest/userguide/streams.html">Capturing graph changes in real
     * time using Neptune streams</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getstreamrecords"
     * >neptune-db:GetStreamRecords</a> IAM action in that cluster.
     * </p>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:Sparql</a> IAM condition key can be used in the policy document to restrict the use of
     * SPARQL queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param getSparqlStreamRequest
     * @return A Java Future containing the result of the GetSparqlStream operation returned by the service.
     * @sample AmazonNeptunedataAsync.GetSparqlStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetSparqlStream" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSparqlStreamResult> getSparqlStreamAsync(GetSparqlStreamRequest getSparqlStreamRequest);

    /**
     * <p>
     * Gets a stream for an RDF graph.
     * </p>
     * <p>
     * With the Neptune Streams feature, you can generate a complete sequence of change-log entries that record every
     * change made to your graph data as it happens. <code>GetSparqlStream</code> lets you collect these change-log
     * entries for an RDF graph.
     * </p>
     * <p>
     * The Neptune streams feature needs to be enabled on your Neptune DBcluster. To enable streams, set the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/parameters.html#parameters-db-cluster-parameters-neptune_streams"
     * >neptune_streams</a> DB cluster parameter to <code>1</code>.
     * </p>
     * <p>
     * See <a href="https://docs.aws.amazon.com/neptune/latest/userguide/streams.html">Capturing graph changes in real
     * time using Neptune streams</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getstreamrecords"
     * >neptune-db:GetStreamRecords</a> IAM action in that cluster.
     * </p>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:Sparql</a> IAM condition key can be used in the policy document to restrict the use of
     * SPARQL queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param getSparqlStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSparqlStream operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.GetSparqlStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetSparqlStream" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSparqlStreamResult> getSparqlStreamAsync(GetSparqlStreamRequest getSparqlStreamRequest,
            com.amazonaws.handlers.AsyncHandler<GetSparqlStreamRequest, GetSparqlStreamResult> asyncHandler);

    /**
     * <p>
     * Lists active Gremlin queries. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/gremlin-api-status.html">Gremlin query status API</a>
     * for details about the output.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getquerystatus"
     * >neptune-db:GetQueryStatus</a> IAM action in that cluster.
     * </p>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:Gremlin</a> IAM condition key can be used in the policy document to restrict the use of
     * Gremlin queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param listGremlinQueriesRequest
     * @return A Java Future containing the result of the ListGremlinQueries operation returned by the service.
     * @sample AmazonNeptunedataAsync.ListGremlinQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListGremlinQueries" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListGremlinQueriesResult> listGremlinQueriesAsync(ListGremlinQueriesRequest listGremlinQueriesRequest);

    /**
     * <p>
     * Lists active Gremlin queries. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/gremlin-api-status.html">Gremlin query status API</a>
     * for details about the output.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getquerystatus"
     * >neptune-db:GetQueryStatus</a> IAM action in that cluster.
     * </p>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:Gremlin</a> IAM condition key can be used in the policy document to restrict the use of
     * Gremlin queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param listGremlinQueriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGremlinQueries operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.ListGremlinQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListGremlinQueries" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListGremlinQueriesResult> listGremlinQueriesAsync(ListGremlinQueriesRequest listGremlinQueriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListGremlinQueriesRequest, ListGremlinQueriesResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of the <code>loadIds</code> for all active loader jobs.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#listloaderjobs"
     * >neptune-db:ListLoaderJobs</a> IAM action in that cluster..
     * </p>
     * 
     * @param listLoaderJobsRequest
     * @return A Java Future containing the result of the ListLoaderJobs operation returned by the service.
     * @sample AmazonNeptunedataAsync.ListLoaderJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListLoaderJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLoaderJobsResult> listLoaderJobsAsync(ListLoaderJobsRequest listLoaderJobsRequest);

    /**
     * <p>
     * Retrieves a list of the <code>loadIds</code> for all active loader jobs.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#listloaderjobs"
     * >neptune-db:ListLoaderJobs</a> IAM action in that cluster..
     * </p>
     * 
     * @param listLoaderJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLoaderJobs operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.ListLoaderJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListLoaderJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLoaderJobsResult> listLoaderJobsAsync(ListLoaderJobsRequest listLoaderJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLoaderJobsRequest, ListLoaderJobsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of Neptune ML data processing jobs. See <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-dataprocessing.html#machine-learning-api-dataprocessing-list-jobs"
     * >Listing active data-processing jobs using the Neptune ML dataprocessing command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#listmldataprocessingjobs"
     * >neptune-db:ListMLDataProcessingJobs</a> IAM action in that cluster.
     * </p>
     * 
     * @param listMLDataProcessingJobsRequest
     * @return A Java Future containing the result of the ListMLDataProcessingJobs operation returned by the service.
     * @sample AmazonNeptunedataAsync.ListMLDataProcessingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListMLDataProcessingJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMLDataProcessingJobsResult> listMLDataProcessingJobsAsync(ListMLDataProcessingJobsRequest listMLDataProcessingJobsRequest);

    /**
     * <p>
     * Returns a list of Neptune ML data processing jobs. See <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-dataprocessing.html#machine-learning-api-dataprocessing-list-jobs"
     * >Listing active data-processing jobs using the Neptune ML dataprocessing command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#listmldataprocessingjobs"
     * >neptune-db:ListMLDataProcessingJobs</a> IAM action in that cluster.
     * </p>
     * 
     * @param listMLDataProcessingJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMLDataProcessingJobs operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.ListMLDataProcessingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListMLDataProcessingJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMLDataProcessingJobsResult> listMLDataProcessingJobsAsync(ListMLDataProcessingJobsRequest listMLDataProcessingJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMLDataProcessingJobsRequest, ListMLDataProcessingJobsResult> asyncHandler);

    /**
     * <p>
     * Lists existing inference endpoints. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-endpoints.html">Managing
     * inference endpoints using the endpoints command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#listmlendpoints"
     * >neptune-db:ListMLEndpoints</a> IAM action in that cluster.
     * </p>
     * 
     * @param listMLEndpointsRequest
     * @return A Java Future containing the result of the ListMLEndpoints operation returned by the service.
     * @sample AmazonNeptunedataAsync.ListMLEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListMLEndpoints" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListMLEndpointsResult> listMLEndpointsAsync(ListMLEndpointsRequest listMLEndpointsRequest);

    /**
     * <p>
     * Lists existing inference endpoints. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-endpoints.html">Managing
     * inference endpoints using the endpoints command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#listmlendpoints"
     * >neptune-db:ListMLEndpoints</a> IAM action in that cluster.
     * </p>
     * 
     * @param listMLEndpointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMLEndpoints operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.ListMLEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListMLEndpoints" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListMLEndpointsResult> listMLEndpointsAsync(ListMLEndpointsRequest listMLEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMLEndpointsRequest, ListMLEndpointsResult> asyncHandler);

    /**
     * <p>
     * Lists Neptune ML model-training jobs. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-modeltraining.html">Model
     * training using the <code>modeltraining</code> command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#neptune-db:listmlmodeltrainingjobs"
     * >neptune-db:neptune-db:ListMLModelTrainingJobs</a> IAM action in that cluster.
     * </p>
     * 
     * @param listMLModelTrainingJobsRequest
     * @return A Java Future containing the result of the ListMLModelTrainingJobs operation returned by the service.
     * @sample AmazonNeptunedataAsync.ListMLModelTrainingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListMLModelTrainingJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMLModelTrainingJobsResult> listMLModelTrainingJobsAsync(ListMLModelTrainingJobsRequest listMLModelTrainingJobsRequest);

    /**
     * <p>
     * Lists Neptune ML model-training jobs. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-modeltraining.html">Model
     * training using the <code>modeltraining</code> command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#neptune-db:listmlmodeltrainingjobs"
     * >neptune-db:neptune-db:ListMLModelTrainingJobs</a> IAM action in that cluster.
     * </p>
     * 
     * @param listMLModelTrainingJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMLModelTrainingJobs operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.ListMLModelTrainingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListMLModelTrainingJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMLModelTrainingJobsResult> listMLModelTrainingJobsAsync(ListMLModelTrainingJobsRequest listMLModelTrainingJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMLModelTrainingJobsRequest, ListMLModelTrainingJobsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of model transform job IDs. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-model-transform.html">Use a trained
     * model to generate new model artifacts</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#listmlmodeltransformjobs"
     * >neptune-db:ListMLModelTransformJobs</a> IAM action in that cluster.
     * </p>
     * 
     * @param listMLModelTransformJobsRequest
     * @return A Java Future containing the result of the ListMLModelTransformJobs operation returned by the service.
     * @sample AmazonNeptunedataAsync.ListMLModelTransformJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListMLModelTransformJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMLModelTransformJobsResult> listMLModelTransformJobsAsync(ListMLModelTransformJobsRequest listMLModelTransformJobsRequest);

    /**
     * <p>
     * Returns a list of model transform job IDs. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-model-transform.html">Use a trained
     * model to generate new model artifacts</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#listmlmodeltransformjobs"
     * >neptune-db:ListMLModelTransformJobs</a> IAM action in that cluster.
     * </p>
     * 
     * @param listMLModelTransformJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMLModelTransformJobs operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.ListMLModelTransformJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListMLModelTransformJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMLModelTransformJobsResult> listMLModelTransformJobsAsync(ListMLModelTransformJobsRequest listMLModelTransformJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMLModelTransformJobsRequest, ListMLModelTransformJobsResult> asyncHandler);

    /**
     * <p>
     * Lists active openCypher queries. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/access-graph-opencypher-status.html">Neptune
     * openCypher status endpoint</a> for more information.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getquerystatus"
     * >neptune-db:GetQueryStatus</a> IAM action in that cluster.
     * </p>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:OpenCypher</a> IAM condition key can be used in the policy document to restrict the use
     * of openCypher queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param listOpenCypherQueriesRequest
     * @return A Java Future containing the result of the ListOpenCypherQueries operation returned by the service.
     * @sample AmazonNeptunedataAsync.ListOpenCypherQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListOpenCypherQueries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOpenCypherQueriesResult> listOpenCypherQueriesAsync(ListOpenCypherQueriesRequest listOpenCypherQueriesRequest);

    /**
     * <p>
     * Lists active openCypher queries. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/access-graph-opencypher-status.html">Neptune
     * openCypher status endpoint</a> for more information.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getquerystatus"
     * >neptune-db:GetQueryStatus</a> IAM action in that cluster.
     * </p>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:OpenCypher</a> IAM condition key can be used in the policy document to restrict the use
     * of openCypher queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param listOpenCypherQueriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOpenCypherQueries operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.ListOpenCypherQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListOpenCypherQueries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOpenCypherQueriesResult> listOpenCypherQueriesAsync(ListOpenCypherQueriesRequest listOpenCypherQueriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListOpenCypherQueriesRequest, ListOpenCypherQueriesResult> asyncHandler);

    /**
     * <p>
     * Manages the generation and use of property graph statistics.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#managestatistics"
     * >neptune-db:ManageStatistics</a> IAM action in that cluster.
     * </p>
     * 
     * @param managePropertygraphStatisticsRequest
     * @return A Java Future containing the result of the ManagePropertygraphStatistics operation returned by the
     *         service.
     * @sample AmazonNeptunedataAsync.ManagePropertygraphStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ManagePropertygraphStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ManagePropertygraphStatisticsResult> managePropertygraphStatisticsAsync(
            ManagePropertygraphStatisticsRequest managePropertygraphStatisticsRequest);

    /**
     * <p>
     * Manages the generation and use of property graph statistics.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#managestatistics"
     * >neptune-db:ManageStatistics</a> IAM action in that cluster.
     * </p>
     * 
     * @param managePropertygraphStatisticsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ManagePropertygraphStatistics operation returned by the
     *         service.
     * @sample AmazonNeptunedataAsyncHandler.ManagePropertygraphStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ManagePropertygraphStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ManagePropertygraphStatisticsResult> managePropertygraphStatisticsAsync(
            ManagePropertygraphStatisticsRequest managePropertygraphStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<ManagePropertygraphStatisticsRequest, ManagePropertygraphStatisticsResult> asyncHandler);

    /**
     * <p>
     * Manages the generation and use of RDF graph statistics.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#managestatistics"
     * >neptune-db:ManageStatistics</a> IAM action in that cluster.
     * </p>
     * 
     * @param manageSparqlStatisticsRequest
     * @return A Java Future containing the result of the ManageSparqlStatistics operation returned by the service.
     * @sample AmazonNeptunedataAsync.ManageSparqlStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ManageSparqlStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ManageSparqlStatisticsResult> manageSparqlStatisticsAsync(ManageSparqlStatisticsRequest manageSparqlStatisticsRequest);

    /**
     * <p>
     * Manages the generation and use of RDF graph statistics.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#managestatistics"
     * >neptune-db:ManageStatistics</a> IAM action in that cluster.
     * </p>
     * 
     * @param manageSparqlStatisticsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ManageSparqlStatistics operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.ManageSparqlStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ManageSparqlStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ManageSparqlStatisticsResult> manageSparqlStatisticsAsync(ManageSparqlStatisticsRequest manageSparqlStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<ManageSparqlStatisticsRequest, ManageSparqlStatisticsResult> asyncHandler);

    /**
     * <p>
     * Starts a Neptune bulk loader job to load data from an Amazon S3 bucket into a Neptune DB instance. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load.html">Using the Amazon Neptune Bulk Loader
     * to Ingest Data</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#startloaderjob"
     * >neptune-db:StartLoaderJob</a> IAM action in that cluster.
     * </p>
     * 
     * @param startLoaderJobRequest
     * @return A Java Future containing the result of the StartLoaderJob operation returned by the service.
     * @sample AmazonNeptunedataAsync.StartLoaderJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/StartLoaderJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartLoaderJobResult> startLoaderJobAsync(StartLoaderJobRequest startLoaderJobRequest);

    /**
     * <p>
     * Starts a Neptune bulk loader job to load data from an Amazon S3 bucket into a Neptune DB instance. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load.html">Using the Amazon Neptune Bulk Loader
     * to Ingest Data</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#startloaderjob"
     * >neptune-db:StartLoaderJob</a> IAM action in that cluster.
     * </p>
     * 
     * @param startLoaderJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartLoaderJob operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.StartLoaderJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/StartLoaderJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartLoaderJobResult> startLoaderJobAsync(StartLoaderJobRequest startLoaderJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartLoaderJobRequest, StartLoaderJobResult> asyncHandler);

    /**
     * <p>
     * Creates a new Neptune ML data processing job for processing the graph data exported from Neptune for training.
     * See <a href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-dataprocessing.html">The
     * <code>dataprocessing</code> command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#startmlmodeldataprocessingjob"
     * >neptune-db:StartMLModelDataProcessingJob</a> IAM action in that cluster.
     * </p>
     * 
     * @param startMLDataProcessingJobRequest
     * @return A Java Future containing the result of the StartMLDataProcessingJob operation returned by the service.
     * @sample AmazonNeptunedataAsync.StartMLDataProcessingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/StartMLDataProcessingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMLDataProcessingJobResult> startMLDataProcessingJobAsync(StartMLDataProcessingJobRequest startMLDataProcessingJobRequest);

    /**
     * <p>
     * Creates a new Neptune ML data processing job for processing the graph data exported from Neptune for training.
     * See <a href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-dataprocessing.html">The
     * <code>dataprocessing</code> command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#startmlmodeldataprocessingjob"
     * >neptune-db:StartMLModelDataProcessingJob</a> IAM action in that cluster.
     * </p>
     * 
     * @param startMLDataProcessingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartMLDataProcessingJob operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.StartMLDataProcessingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/StartMLDataProcessingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMLDataProcessingJobResult> startMLDataProcessingJobAsync(StartMLDataProcessingJobRequest startMLDataProcessingJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartMLDataProcessingJobRequest, StartMLDataProcessingJobResult> asyncHandler);

    /**
     * <p>
     * Creates a new Neptune ML model training job. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-modeltraining.html">Model
     * training using the <code>modeltraining</code> command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#startmlmodeltrainingjob"
     * >neptune-db:StartMLModelTrainingJob</a> IAM action in that cluster.
     * </p>
     * 
     * @param startMLModelTrainingJobRequest
     * @return A Java Future containing the result of the StartMLModelTrainingJob operation returned by the service.
     * @sample AmazonNeptunedataAsync.StartMLModelTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/StartMLModelTrainingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMLModelTrainingJobResult> startMLModelTrainingJobAsync(StartMLModelTrainingJobRequest startMLModelTrainingJobRequest);

    /**
     * <p>
     * Creates a new Neptune ML model training job. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-modeltraining.html">Model
     * training using the <code>modeltraining</code> command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#startmlmodeltrainingjob"
     * >neptune-db:StartMLModelTrainingJob</a> IAM action in that cluster.
     * </p>
     * 
     * @param startMLModelTrainingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartMLModelTrainingJob operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.StartMLModelTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/StartMLModelTrainingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMLModelTrainingJobResult> startMLModelTrainingJobAsync(StartMLModelTrainingJobRequest startMLModelTrainingJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartMLModelTrainingJobRequest, StartMLModelTrainingJobResult> asyncHandler);

    /**
     * <p>
     * Creates a new model transform job. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-model-transform.html">Use a trained
     * model to generate new model artifacts</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#startmlmodeltransformjob"
     * >neptune-db:StartMLModelTransformJob</a> IAM action in that cluster.
     * </p>
     * 
     * @param startMLModelTransformJobRequest
     * @return A Java Future containing the result of the StartMLModelTransformJob operation returned by the service.
     * @sample AmazonNeptunedataAsync.StartMLModelTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/StartMLModelTransformJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMLModelTransformJobResult> startMLModelTransformJobAsync(StartMLModelTransformJobRequest startMLModelTransformJobRequest);

    /**
     * <p>
     * Creates a new model transform job. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-model-transform.html">Use a trained
     * model to generate new model artifacts</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#startmlmodeltransformjob"
     * >neptune-db:StartMLModelTransformJob</a> IAM action in that cluster.
     * </p>
     * 
     * @param startMLModelTransformJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartMLModelTransformJob operation returned by the service.
     * @sample AmazonNeptunedataAsyncHandler.StartMLModelTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/StartMLModelTransformJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMLModelTransformJobResult> startMLModelTransformJobAsync(StartMLModelTransformJobRequest startMLModelTransformJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartMLModelTransformJobRequest, StartMLModelTransformJobResult> asyncHandler);

}
