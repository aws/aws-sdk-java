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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.neptunedata.model.*;

/**
 * Interface for accessing Amazon NeptuneData.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.neptunedata.AbstractAmazonNeptunedata} instead.
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
public interface AmazonNeptunedata {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "neptune-db";

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
     * @return Result of the CancelGremlinQuery operation returned by the service.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws FailureByQueryException
     *         Raised when a request fails.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ParsingException
     *         Raised when a parsing issue is encountered.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws TimeLimitExceededException
     *         Raised when the an operation exceeds the time limit allowed for it.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws ConcurrentModificationException
     *         Raised when a request attempts to modify data that is concurrently being modified by another process.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.CancelGremlinQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelGremlinQuery" target="_top">AWS
     *      API Documentation</a>
     */
    CancelGremlinQueryResult cancelGremlinQuery(CancelGremlinQueryRequest cancelGremlinQueryRequest);

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
     * @return Result of the CancelLoaderJob operation returned by the service.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws BulkLoadIdNotFoundException
     *         Raised when a specified bulk-load job ID cannot be found.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws LoadUrlAccessDeniedException
     *         Raised when access is denied to a specified load URL.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws InternalFailureException
     *         Raised when the processing of the request failed unexpectedly.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.CancelLoaderJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelLoaderJob" target="_top">AWS
     *      API Documentation</a>
     */
    CancelLoaderJobResult cancelLoaderJob(CancelLoaderJobRequest cancelLoaderJobRequest);

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
     * @return Result of the CancelMLDataProcessingJob operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.CancelMLDataProcessingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelMLDataProcessingJob"
     *      target="_top">AWS API Documentation</a>
     */
    CancelMLDataProcessingJobResult cancelMLDataProcessingJob(CancelMLDataProcessingJobRequest cancelMLDataProcessingJobRequest);

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
     * @return Result of the CancelMLModelTrainingJob operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.CancelMLModelTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelMLModelTrainingJob"
     *      target="_top">AWS API Documentation</a>
     */
    CancelMLModelTrainingJobResult cancelMLModelTrainingJob(CancelMLModelTrainingJobRequest cancelMLModelTrainingJobRequest);

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
     * @return Result of the CancelMLModelTransformJob operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.CancelMLModelTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelMLModelTransformJob"
     *      target="_top">AWS API Documentation</a>
     */
    CancelMLModelTransformJobResult cancelMLModelTransformJob(CancelMLModelTransformJobRequest cancelMLModelTransformJobRequest);

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
     * @return Result of the CancelOpenCypherQuery operation returned by the service.
     * @throws InvalidNumericDataException
     *         Raised when invalid numerical data is encountered when servicing a request.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws FailureByQueryException
     *         Raised when a request fails.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ParsingException
     *         Raised when a parsing issue is encountered.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws TimeLimitExceededException
     *         Raised when the an operation exceeds the time limit allowed for it.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws ConcurrentModificationException
     *         Raised when a request attempts to modify data that is concurrently being modified by another process.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.CancelOpenCypherQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelOpenCypherQuery"
     *      target="_top">AWS API Documentation</a>
     */
    CancelOpenCypherQueryResult cancelOpenCypherQuery(CancelOpenCypherQueryRequest cancelOpenCypherQueryRequest);

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
     * @return Result of the CreateMLEndpoint operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.CreateMLEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CreateMLEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    CreateMLEndpointResult createMLEndpoint(CreateMLEndpointRequest createMLEndpointRequest);

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
     * @return Result of the DeleteMLEndpoint operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.DeleteMLEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/DeleteMLEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteMLEndpointResult deleteMLEndpoint(DeleteMLEndpointRequest deleteMLEndpointRequest);

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
     * @return Result of the DeletePropertygraphStatistics operation returned by the service.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws StatisticsNotAvailableException
     *         Raised when statistics needed to satisfy a request are not available.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws AccessDeniedException
     *         Raised in case of an authentication or authorization failure.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ReadOnlyViolationException
     *         Raised when a request attempts to write to a read-only resource.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.DeletePropertygraphStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/DeletePropertygraphStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePropertygraphStatisticsResult deletePropertygraphStatistics(DeletePropertygraphStatisticsRequest deletePropertygraphStatisticsRequest);

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
     * @return Result of the DeleteSparqlStatistics operation returned by the service.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws StatisticsNotAvailableException
     *         Raised when statistics needed to satisfy a request are not available.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws AccessDeniedException
     *         Raised in case of an authentication or authorization failure.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ReadOnlyViolationException
     *         Raised when a request attempts to write to a read-only resource.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.DeleteSparqlStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/DeleteSparqlStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSparqlStatisticsResult deleteSparqlStatistics(DeleteSparqlStatisticsRequest deleteSparqlStatisticsRequest);

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
     * @return Result of the ExecuteFastReset operation returned by the service.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws AccessDeniedException
     *         Raised in case of an authentication or authorization failure.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws ServerShutdownException
     *         Raised when the server shuts down while processing a request.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws MethodNotAllowedException
     *         Raised when the HTTP method used by a request is not supported by the endpoint being used.
     * @throws ReadOnlyViolationException
     *         Raised when a request attempts to write to a read-only resource.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.ExecuteFastReset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ExecuteFastReset" target="_top">AWS
     *      API Documentation</a>
     */
    ExecuteFastResetResult executeFastReset(ExecuteFastResetRequest executeFastResetRequest);

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
     * @return Result of the ExecuteGremlinExplainQuery operation returned by the service.
     * @throws QueryTooLargeException
     *         Raised when the body of a query is too large.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws QueryLimitExceededException
     *         Raised when the number of active queries exceeds what the server can process. The query in question can
     *         be retried when the system is less busy.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws QueryLimitException
     *         Raised when the size of a query exceeds the system limit.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws CancelledByUserException
     *         Raised when a user cancelled a request.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws FailureByQueryException
     *         Raised when a request fails.
     * @throws MemoryLimitExceededException
     *         Raised when a request fails because of insufficient memory resources. The request can be retried.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws MalformedQueryException
     *         Raised when a query is submitted that is syntactically incorrect or does not pass additional validation.
     * @throws ParsingException
     *         Raised when a parsing issue is encountered.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws TimeLimitExceededException
     *         Raised when the an operation exceeds the time limit allowed for it.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws ConcurrentModificationException
     *         Raised when a request attempts to modify data that is concurrently being modified by another process.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.ExecuteGremlinExplainQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ExecuteGremlinExplainQuery"
     *      target="_top">AWS API Documentation</a>
     */
    ExecuteGremlinExplainQueryResult executeGremlinExplainQuery(ExecuteGremlinExplainQueryRequest executeGremlinExplainQueryRequest);

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
     * @return Result of the ExecuteGremlinProfileQuery operation returned by the service.
     * @throws QueryTooLargeException
     *         Raised when the body of a query is too large.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws QueryLimitExceededException
     *         Raised when the number of active queries exceeds what the server can process. The query in question can
     *         be retried when the system is less busy.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws QueryLimitException
     *         Raised when the size of a query exceeds the system limit.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws CancelledByUserException
     *         Raised when a user cancelled a request.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws FailureByQueryException
     *         Raised when a request fails.
     * @throws MemoryLimitExceededException
     *         Raised when a request fails because of insufficient memory resources. The request can be retried.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws MalformedQueryException
     *         Raised when a query is submitted that is syntactically incorrect or does not pass additional validation.
     * @throws ParsingException
     *         Raised when a parsing issue is encountered.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws TimeLimitExceededException
     *         Raised when the an operation exceeds the time limit allowed for it.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws ConcurrentModificationException
     *         Raised when a request attempts to modify data that is concurrently being modified by another process.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.ExecuteGremlinProfileQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ExecuteGremlinProfileQuery"
     *      target="_top">AWS API Documentation</a>
     */
    ExecuteGremlinProfileQueryResult executeGremlinProfileQuery(ExecuteGremlinProfileQueryRequest executeGremlinProfileQueryRequest);

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
     * @return Result of the ExecuteGremlinQuery operation returned by the service.
     * @throws QueryTooLargeException
     *         Raised when the body of a query is too large.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws QueryLimitExceededException
     *         Raised when the number of active queries exceeds what the server can process. The query in question can
     *         be retried when the system is less busy.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws QueryLimitException
     *         Raised when the size of a query exceeds the system limit.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws CancelledByUserException
     *         Raised when a user cancelled a request.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws FailureByQueryException
     *         Raised when a request fails.
     * @throws MemoryLimitExceededException
     *         Raised when a request fails because of insufficient memory resources. The request can be retried.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws MalformedQueryException
     *         Raised when a query is submitted that is syntactically incorrect or does not pass additional validation.
     * @throws ParsingException
     *         Raised when a parsing issue is encountered.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws TimeLimitExceededException
     *         Raised when the an operation exceeds the time limit allowed for it.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws ConcurrentModificationException
     *         Raised when a request attempts to modify data that is concurrently being modified by another process.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.ExecuteGremlinQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ExecuteGremlinQuery"
     *      target="_top">AWS API Documentation</a>
     */
    ExecuteGremlinQueryResult executeGremlinQuery(ExecuteGremlinQueryRequest executeGremlinQueryRequest);

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
     * @return Result of the ExecuteOpenCypherExplainQuery operation returned by the service.
     * @throws QueryTooLargeException
     *         Raised when the body of a query is too large.
     * @throws InvalidNumericDataException
     *         Raised when invalid numerical data is encountered when servicing a request.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws QueryLimitExceededException
     *         Raised when the number of active queries exceeds what the server can process. The query in question can
     *         be retried when the system is less busy.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws QueryLimitException
     *         Raised when the size of a query exceeds the system limit.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws CancelledByUserException
     *         Raised when a user cancelled a request.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws FailureByQueryException
     *         Raised when a request fails.
     * @throws MemoryLimitExceededException
     *         Raised when a request fails because of insufficient memory resources. The request can be retried.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws MalformedQueryException
     *         Raised when a query is submitted that is syntactically incorrect or does not pass additional validation.
     * @throws ParsingException
     *         Raised when a parsing issue is encountered.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws TimeLimitExceededException
     *         Raised when the an operation exceeds the time limit allowed for it.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws ConcurrentModificationException
     *         Raised when a request attempts to modify data that is concurrently being modified by another process.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.ExecuteOpenCypherExplainQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ExecuteOpenCypherExplainQuery"
     *      target="_top">AWS API Documentation</a>
     */
    ExecuteOpenCypherExplainQueryResult executeOpenCypherExplainQuery(ExecuteOpenCypherExplainQueryRequest executeOpenCypherExplainQueryRequest);

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
     * @return Result of the GetEngineStatus operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws InternalFailureException
     *         Raised when the processing of the request failed unexpectedly.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.GetEngineStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetEngineStatus" target="_top">AWS
     *      API Documentation</a>
     */
    GetEngineStatusResult getEngineStatus(GetEngineStatusRequest getEngineStatusRequest);

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
     * @return Result of the GetGremlinQueryStatus operation returned by the service.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws AccessDeniedException
     *         Raised in case of an authentication or authorization failure.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws FailureByQueryException
     *         Raised when a request fails.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ParsingException
     *         Raised when a parsing issue is encountered.
     * @throws ReadOnlyViolationException
     *         Raised when a request attempts to write to a read-only resource.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws TimeLimitExceededException
     *         Raised when the an operation exceeds the time limit allowed for it.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws ConcurrentModificationException
     *         Raised when a request attempts to modify data that is concurrently being modified by another process.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.GetGremlinQueryStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetGremlinQueryStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetGremlinQueryStatusResult getGremlinQueryStatus(GetGremlinQueryStatusRequest getGremlinQueryStatusRequest);

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
     * @return Result of the GetMLDataProcessingJob operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.GetMLDataProcessingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetMLDataProcessingJob"
     *      target="_top">AWS API Documentation</a>
     */
    GetMLDataProcessingJobResult getMLDataProcessingJob(GetMLDataProcessingJobRequest getMLDataProcessingJobRequest);

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
     * @return Result of the GetMLEndpoint operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.GetMLEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetMLEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    GetMLEndpointResult getMLEndpoint(GetMLEndpointRequest getMLEndpointRequest);

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
     * @return Result of the GetMLModelTrainingJob operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.GetMLModelTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetMLModelTrainingJob"
     *      target="_top">AWS API Documentation</a>
     */
    GetMLModelTrainingJobResult getMLModelTrainingJob(GetMLModelTrainingJobRequest getMLModelTrainingJobRequest);

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
     * @return Result of the GetMLModelTransformJob operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.GetMLModelTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetMLModelTransformJob"
     *      target="_top">AWS API Documentation</a>
     */
    GetMLModelTransformJobResult getMLModelTransformJob(GetMLModelTransformJobRequest getMLModelTransformJobRequest);

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
     * @return Result of the GetOpenCypherQueryStatus operation returned by the service.
     * @throws InvalidNumericDataException
     *         Raised when invalid numerical data is encountered when servicing a request.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws AccessDeniedException
     *         Raised in case of an authentication or authorization failure.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws FailureByQueryException
     *         Raised when a request fails.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ParsingException
     *         Raised when a parsing issue is encountered.
     * @throws ReadOnlyViolationException
     *         Raised when a request attempts to write to a read-only resource.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws TimeLimitExceededException
     *         Raised when the an operation exceeds the time limit allowed for it.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws ConcurrentModificationException
     *         Raised when a request attempts to modify data that is concurrently being modified by another process.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.GetOpenCypherQueryStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetOpenCypherQueryStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetOpenCypherQueryStatusResult getOpenCypherQueryStatus(GetOpenCypherQueryStatusRequest getOpenCypherQueryStatusRequest);

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
     * @return Result of the GetPropertygraphStatistics operation returned by the service.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws StatisticsNotAvailableException
     *         Raised when statistics needed to satisfy a request are not available.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws AccessDeniedException
     *         Raised in case of an authentication or authorization failure.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ReadOnlyViolationException
     *         Raised when a request attempts to write to a read-only resource.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.GetPropertygraphStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetPropertygraphStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    GetPropertygraphStatisticsResult getPropertygraphStatistics(GetPropertygraphStatisticsRequest getPropertygraphStatisticsRequest);

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
     * @return Result of the GetPropertygraphSummary operation returned by the service.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws StatisticsNotAvailableException
     *         Raised when statistics needed to satisfy a request are not available.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws AccessDeniedException
     *         Raised in case of an authentication or authorization failure.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ReadOnlyViolationException
     *         Raised when a request attempts to write to a read-only resource.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.GetPropertygraphSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetPropertygraphSummary"
     *      target="_top">AWS API Documentation</a>
     */
    GetPropertygraphSummaryResult getPropertygraphSummary(GetPropertygraphSummaryRequest getPropertygraphSummaryRequest);

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
     * @return Result of the GetRDFGraphSummary operation returned by the service.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws StatisticsNotAvailableException
     *         Raised when statistics needed to satisfy a request are not available.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws AccessDeniedException
     *         Raised in case of an authentication or authorization failure.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ReadOnlyViolationException
     *         Raised when a request attempts to write to a read-only resource.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.GetRDFGraphSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetRDFGraphSummary" target="_top">AWS
     *      API Documentation</a>
     */
    GetRDFGraphSummaryResult getRDFGraphSummary(GetRDFGraphSummaryRequest getRDFGraphSummaryRequest);

    /**
     * <p>
     * Gets RDF statistics (SPARQL).
     * </p>
     * 
     * @param getSparqlStatisticsRequest
     * @return Result of the GetSparqlStatistics operation returned by the service.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws StatisticsNotAvailableException
     *         Raised when statistics needed to satisfy a request are not available.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws AccessDeniedException
     *         Raised in case of an authentication or authorization failure.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ReadOnlyViolationException
     *         Raised when a request attempts to write to a read-only resource.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.GetSparqlStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetSparqlStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    GetSparqlStatisticsResult getSparqlStatistics(GetSparqlStatisticsRequest getSparqlStatisticsRequest);

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
     * @return Result of the GetSparqlStream operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws ExpiredStreamException
     *         Raised when a request attempts to access an stream that has expired.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws MemoryLimitExceededException
     *         Raised when a request fails because of insufficient memory resources. The request can be retried.
     * @throws StreamRecordsNotFoundException
     *         Raised when stream records requested by a query cannot be found.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ThrottlingException
     *         Raised when the rate of requests exceeds the maximum throughput. Requests can be retried after
     *         encountering this exception.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.GetSparqlStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetSparqlStream" target="_top">AWS
     *      API Documentation</a>
     */
    GetSparqlStreamResult getSparqlStream(GetSparqlStreamRequest getSparqlStreamRequest);

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
     * @return Result of the ListGremlinQueries operation returned by the service.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws AccessDeniedException
     *         Raised in case of an authentication or authorization failure.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws FailureByQueryException
     *         Raised when a request fails.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ParsingException
     *         Raised when a parsing issue is encountered.
     * @throws ReadOnlyViolationException
     *         Raised when a request attempts to write to a read-only resource.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws TimeLimitExceededException
     *         Raised when the an operation exceeds the time limit allowed for it.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws ConcurrentModificationException
     *         Raised when a request attempts to modify data that is concurrently being modified by another process.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.ListGremlinQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListGremlinQueries" target="_top">AWS
     *      API Documentation</a>
     */
    ListGremlinQueriesResult listGremlinQueries(ListGremlinQueriesRequest listGremlinQueriesRequest);

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
     * @return Result of the ListLoaderJobs operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws BulkLoadIdNotFoundException
     *         Raised when a specified bulk-load job ID cannot be found.
     * @throws InternalFailureException
     *         Raised when the processing of the request failed unexpectedly.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws LoadUrlAccessDeniedException
     *         Raised when access is denied to a specified load URL.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.ListLoaderJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListLoaderJobs" target="_top">AWS API
     *      Documentation</a>
     */
    ListLoaderJobsResult listLoaderJobs(ListLoaderJobsRequest listLoaderJobsRequest);

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
     * @return Result of the ListMLDataProcessingJobs operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.ListMLDataProcessingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListMLDataProcessingJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListMLDataProcessingJobsResult listMLDataProcessingJobs(ListMLDataProcessingJobsRequest listMLDataProcessingJobsRequest);

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
     * @return Result of the ListMLEndpoints operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.ListMLEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListMLEndpoints" target="_top">AWS
     *      API Documentation</a>
     */
    ListMLEndpointsResult listMLEndpoints(ListMLEndpointsRequest listMLEndpointsRequest);

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
     * @return Result of the ListMLModelTrainingJobs operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.ListMLModelTrainingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListMLModelTrainingJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListMLModelTrainingJobsResult listMLModelTrainingJobs(ListMLModelTrainingJobsRequest listMLModelTrainingJobsRequest);

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
     * @return Result of the ListMLModelTransformJobs operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.ListMLModelTransformJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListMLModelTransformJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListMLModelTransformJobsResult listMLModelTransformJobs(ListMLModelTransformJobsRequest listMLModelTransformJobsRequest);

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
     * @return Result of the ListOpenCypherQueries operation returned by the service.
     * @throws InvalidNumericDataException
     *         Raised when invalid numerical data is encountered when servicing a request.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws AccessDeniedException
     *         Raised in case of an authentication or authorization failure.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws FailureByQueryException
     *         Raised when a request fails.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ParsingException
     *         Raised when a parsing issue is encountered.
     * @throws ReadOnlyViolationException
     *         Raised when a request attempts to write to a read-only resource.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws TimeLimitExceededException
     *         Raised when the an operation exceeds the time limit allowed for it.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws ConcurrentModificationException
     *         Raised when a request attempts to modify data that is concurrently being modified by another process.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.ListOpenCypherQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListOpenCypherQueries"
     *      target="_top">AWS API Documentation</a>
     */
    ListOpenCypherQueriesResult listOpenCypherQueries(ListOpenCypherQueriesRequest listOpenCypherQueriesRequest);

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
     * @return Result of the ManagePropertygraphStatistics operation returned by the service.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws StatisticsNotAvailableException
     *         Raised when statistics needed to satisfy a request are not available.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws AccessDeniedException
     *         Raised in case of an authentication or authorization failure.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ReadOnlyViolationException
     *         Raised when a request attempts to write to a read-only resource.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.ManagePropertygraphStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ManagePropertygraphStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    ManagePropertygraphStatisticsResult managePropertygraphStatistics(ManagePropertygraphStatisticsRequest managePropertygraphStatisticsRequest);

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
     * @return Result of the ManageSparqlStatistics operation returned by the service.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws StatisticsNotAvailableException
     *         Raised when statistics needed to satisfy a request are not available.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws AccessDeniedException
     *         Raised in case of an authentication or authorization failure.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ReadOnlyViolationException
     *         Raised when a request attempts to write to a read-only resource.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.ManageSparqlStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ManageSparqlStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    ManageSparqlStatisticsResult manageSparqlStatistics(ManageSparqlStatisticsRequest manageSparqlStatisticsRequest);

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
     * @return Result of the StartLoaderJob operation returned by the service.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws BulkLoadIdNotFoundException
     *         Raised when a specified bulk-load job ID cannot be found.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws LoadUrlAccessDeniedException
     *         Raised when access is denied to a specified load URL.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws InternalFailureException
     *         Raised when the processing of the request failed unexpectedly.
     * @throws S3Exception
     *         Raised when there is a problem accessing Amazon S3.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.StartLoaderJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/StartLoaderJob" target="_top">AWS API
     *      Documentation</a>
     */
    StartLoaderJobResult startLoaderJob(StartLoaderJobRequest startLoaderJobRequest);

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
     * @return Result of the StartMLDataProcessingJob operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.StartMLDataProcessingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/StartMLDataProcessingJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartMLDataProcessingJobResult startMLDataProcessingJob(StartMLDataProcessingJobRequest startMLDataProcessingJobRequest);

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
     * @return Result of the StartMLModelTrainingJob operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.StartMLModelTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/StartMLModelTrainingJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartMLModelTrainingJobResult startMLModelTrainingJob(StartMLModelTrainingJobRequest startMLModelTrainingJobRequest);

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
     * @return Result of the StartMLModelTransformJob operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.StartMLModelTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/StartMLModelTransformJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartMLModelTransformJobResult startMLModelTransformJob(StartMLModelTransformJobRequest startMLModelTransformJobRequest);

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
