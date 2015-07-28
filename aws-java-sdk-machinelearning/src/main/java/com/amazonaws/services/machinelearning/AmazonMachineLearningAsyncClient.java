/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.machinelearning;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

import com.amazonaws.services.machinelearning.model.*;

/**
 * Asynchronous client for accessing AmazonMachineLearning.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * <p>
 * Definition of the public APIs exposed by Amazon Machine Learning
 * </p>
 */
public class AmazonMachineLearningAsyncClient extends AmazonMachineLearningClient
        implements AmazonMachineLearningAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private final ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonMachineLearning.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonMachineLearningAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonMachineLearning.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonMachineLearning
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonMachineLearningAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonMachineLearning using the specified AWS account credentials.
     * Default client settings will be used, and a fixed size thread pool will be
     * created for executing the asynchronous tasks.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonMachineLearningAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonMachineLearning using the specified AWS account credentials
     * and executor service.  Default client settings will be used.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonMachineLearningAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonMachineLearning using the specified AWS account credentials,
     * executor service, and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonMachineLearningAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonMachineLearning using the specified AWS account credentials provider.
     * Default client settings will be used, and a fixed size thread pool will be
     * created for executing the asynchronous tasks.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonMachineLearningAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonMachineLearning using the specified AWS account credentials provider
     * and executor service.  Default client settings will be used.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonMachineLearningAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonMachineLearning using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     */
    public AmazonMachineLearningAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonMachineLearning using the specified AWS account credentials
     * provider, executor service, and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonMachineLearningAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Returns the executor service used by this async client to execute
     * requests.
     *
     * @return The executor service used by this async client to execute
     *         requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call getExecutorService().shutdown() followed by
     * getExecutorService().awaitTermination() prior to calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
            
    /**
     * <p>
     * Updates the <code>EvaluationName</code> of an <code>Evaluation</code>
     * .
     * </p>
     * <p>
     * You can use the GetEvaluation operation to view the contents of the
     * updated data element.
     * </p>
     *
     * @param updateEvaluationRequest Container for the necessary parameters
     *           to execute the UpdateEvaluation operation on AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateEvaluation service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateEvaluationResult> updateEvaluationAsync(final UpdateEvaluationRequest updateEvaluationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateEvaluationResult>() {
            public UpdateEvaluationResult call() throws Exception {
                return updateEvaluation(updateEvaluationRequest);
        }
    });
    }

    /**
     * <p>
     * Updates the <code>EvaluationName</code> of an <code>Evaluation</code>
     * .
     * </p>
     * <p>
     * You can use the GetEvaluation operation to view the contents of the
     * updated data element.
     * </p>
     *
     * @param updateEvaluationRequest Container for the necessary parameters
     *           to execute the UpdateEvaluation operation on AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateEvaluation service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateEvaluationResult> updateEvaluationAsync(
            final UpdateEvaluationRequest updateEvaluationRequest,
            final AsyncHandler<UpdateEvaluationRequest, UpdateEvaluationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateEvaluationResult>() {
            public UpdateEvaluationResult call() throws Exception {
              UpdateEvaluationResult result;
                try {
                result = updateEvaluation(updateEvaluationRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateEvaluationRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates a new <code>MLModel</code> using the data files and the
     * recipe as information sources.
     * </p>
     * <p>
     * An <code>MLModel</code> is nearly immutable. Users can only update
     * the <code>MLModelName</code> and the <code>ScoreThreshold</code> in an
     * <code>MLModel</code> without creating a new <code>MLModel</code> .
     * </p>
     * <p>
     * <code>CreateMLModel</code> is an asynchronous operation. In response
     * to <code>CreateMLModel</code> , Amazon Machine Learning (Amazon ML)
     * immediately returns and sets the <code>MLModel</code> status to
     * <code>PENDING</code> . After the <code>MLModel</code> is created and
     * ready for use, Amazon ML sets the status to <code>COMPLETED</code> .
     * </p>
     * <p>
     * You can use the GetMLModel operation to check progress of the
     * <code>MLModel</code> during the creation operation.
     * </p>
     * <p>
     * CreateMLModel requires a <code>DataSource</code> with computed
     * statistics, which can be created by setting
     * <code>ComputeStatistics</code> to <code>true</code> in
     * CreateDataSourceFromRDS, CreateDataSourceFromS3, or
     * CreateDataSourceFromRedshift operations.
     * </p>
     *
     * @param createMLModelRequest Container for the necessary parameters to
     *           execute the CreateMLModel operation on AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         CreateMLModel service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateMLModelResult> createMLModelAsync(final CreateMLModelRequest createMLModelRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateMLModelResult>() {
            public CreateMLModelResult call() throws Exception {
                return createMLModel(createMLModelRequest);
        }
    });
    }

    /**
     * <p>
     * Creates a new <code>MLModel</code> using the data files and the
     * recipe as information sources.
     * </p>
     * <p>
     * An <code>MLModel</code> is nearly immutable. Users can only update
     * the <code>MLModelName</code> and the <code>ScoreThreshold</code> in an
     * <code>MLModel</code> without creating a new <code>MLModel</code> .
     * </p>
     * <p>
     * <code>CreateMLModel</code> is an asynchronous operation. In response
     * to <code>CreateMLModel</code> , Amazon Machine Learning (Amazon ML)
     * immediately returns and sets the <code>MLModel</code> status to
     * <code>PENDING</code> . After the <code>MLModel</code> is created and
     * ready for use, Amazon ML sets the status to <code>COMPLETED</code> .
     * </p>
     * <p>
     * You can use the GetMLModel operation to check progress of the
     * <code>MLModel</code> during the creation operation.
     * </p>
     * <p>
     * CreateMLModel requires a <code>DataSource</code> with computed
     * statistics, which can be created by setting
     * <code>ComputeStatistics</code> to <code>true</code> in
     * CreateDataSourceFromRDS, CreateDataSourceFromS3, or
     * CreateDataSourceFromRedshift operations.
     * </p>
     *
     * @param createMLModelRequest Container for the necessary parameters to
     *           execute the CreateMLModel operation on AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateMLModel service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateMLModelResult> createMLModelAsync(
            final CreateMLModelRequest createMLModelRequest,
            final AsyncHandler<CreateMLModelRequest, CreateMLModelResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateMLModelResult>() {
            public CreateMLModelResult call() throws Exception {
              CreateMLModelResult result;
                try {
                result = createMLModel(createMLModelRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createMLModelRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates a real-time endpoint for the <code>MLModel</code> . The
     * endpoint contains the URI of the <code>MLModel</code> ; that is, the
     * location to send real-time prediction requests for the specified
     * <code>MLModel</code> .
     * </p>
     *
     * @param createRealtimeEndpointRequest Container for the necessary
     *           parameters to execute the CreateRealtimeEndpoint operation on
     *           AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         CreateRealtimeEndpoint service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateRealtimeEndpointResult> createRealtimeEndpointAsync(final CreateRealtimeEndpointRequest createRealtimeEndpointRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateRealtimeEndpointResult>() {
            public CreateRealtimeEndpointResult call() throws Exception {
                return createRealtimeEndpoint(createRealtimeEndpointRequest);
        }
    });
    }

    /**
     * <p>
     * Creates a real-time endpoint for the <code>MLModel</code> . The
     * endpoint contains the URI of the <code>MLModel</code> ; that is, the
     * location to send real-time prediction requests for the specified
     * <code>MLModel</code> .
     * </p>
     *
     * @param createRealtimeEndpointRequest Container for the necessary
     *           parameters to execute the CreateRealtimeEndpoint operation on
     *           AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateRealtimeEndpoint service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateRealtimeEndpointResult> createRealtimeEndpointAsync(
            final CreateRealtimeEndpointRequest createRealtimeEndpointRequest,
            final AsyncHandler<CreateRealtimeEndpointRequest, CreateRealtimeEndpointResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateRealtimeEndpointResult>() {
            public CreateRealtimeEndpointResult call() throws Exception {
              CreateRealtimeEndpointResult result;
                try {
                result = createRealtimeEndpoint(createRealtimeEndpointRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createRealtimeEndpointRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates a <code>DataSource</code> object. A <code>DataSource</code>
     * references data that can be used to perform CreateMLModel,
     * CreateEvaluation, or CreateBatchPrediction operations.
     * </p>
     * <p>
     * <code>CreateDataSourceFromS3</code> is an asynchronous operation. In
     * response to <code>CreateDataSourceFromS3</code> , Amazon Machine
     * Learning (Amazon ML) immediately returns and sets the
     * <code>DataSource</code> status to <code>PENDING</code> . After the
     * <code>DataSource</code> is created and ready for use, Amazon ML sets
     * the <code>Status</code> parameter to <code>COMPLETED</code> .
     * <code>DataSource</code> in <code>COMPLETED</code> or
     * <code>PENDING</code> status can only be used to perform CreateMLModel,
     * CreateEvaluation or CreateBatchPrediction operations.
     * </p>
     * <p>
     * If Amazon ML cannot accept the input source, it sets the
     * <code>Status</code> parameter to <code>FAILED</code> and includes an
     * error message in the <code>Message</code> attribute of the
     * GetDataSource operation response.
     * </p>
     * <p>
     * The observation data used in a <code>DataSource</code> should be
     * ready to use; that is, it should have a consistent structure, and
     * missing data values should be kept to a minimum. The observation data
     * must reside in one or more CSV files in an Amazon Simple Storage
     * Service (Amazon S3) bucket, along with a schema that describes the
     * data items by name and type. The same schema must be used for all of
     * the data files referenced by the <code>DataSource</code> .
     * </p>
     * <p>
     * After the <code>DataSource</code> has been created, it's ready to use
     * in evaluations and batch predictions. If you plan to use the
     * <code>DataSource</code> to train an <code>MLModel</code> , the
     * <code>DataSource</code> requires another item: a recipe. A recipe
     * describes the observation variables that participate in training an
     * <code>MLModel</code> . A recipe describes how each input variable will
     * be used in training. Will the variable be included or excluded from
     * training? Will the variable be manipulated, for example, combined with
     * another variable, or split apart into word combinations? The recipe
     * provides answers to these questions. For more information, see the
     * <a href="http://docs.aws.amazon.com/machine-learning/latest/dg"> Amazon Machine Learning Developer Guide </a>
     * .
     * </p>
     *
     * @param createDataSourceFromS3Request Container for the necessary
     *           parameters to execute the CreateDataSourceFromS3 operation on
     *           AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDataSourceFromS3 service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDataSourceFromS3Result> createDataSourceFromS3Async(final CreateDataSourceFromS3Request createDataSourceFromS3Request) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDataSourceFromS3Result>() {
            public CreateDataSourceFromS3Result call() throws Exception {
                return createDataSourceFromS3(createDataSourceFromS3Request);
        }
    });
    }

    /**
     * <p>
     * Creates a <code>DataSource</code> object. A <code>DataSource</code>
     * references data that can be used to perform CreateMLModel,
     * CreateEvaluation, or CreateBatchPrediction operations.
     * </p>
     * <p>
     * <code>CreateDataSourceFromS3</code> is an asynchronous operation. In
     * response to <code>CreateDataSourceFromS3</code> , Amazon Machine
     * Learning (Amazon ML) immediately returns and sets the
     * <code>DataSource</code> status to <code>PENDING</code> . After the
     * <code>DataSource</code> is created and ready for use, Amazon ML sets
     * the <code>Status</code> parameter to <code>COMPLETED</code> .
     * <code>DataSource</code> in <code>COMPLETED</code> or
     * <code>PENDING</code> status can only be used to perform CreateMLModel,
     * CreateEvaluation or CreateBatchPrediction operations.
     * </p>
     * <p>
     * If Amazon ML cannot accept the input source, it sets the
     * <code>Status</code> parameter to <code>FAILED</code> and includes an
     * error message in the <code>Message</code> attribute of the
     * GetDataSource operation response.
     * </p>
     * <p>
     * The observation data used in a <code>DataSource</code> should be
     * ready to use; that is, it should have a consistent structure, and
     * missing data values should be kept to a minimum. The observation data
     * must reside in one or more CSV files in an Amazon Simple Storage
     * Service (Amazon S3) bucket, along with a schema that describes the
     * data items by name and type. The same schema must be used for all of
     * the data files referenced by the <code>DataSource</code> .
     * </p>
     * <p>
     * After the <code>DataSource</code> has been created, it's ready to use
     * in evaluations and batch predictions. If you plan to use the
     * <code>DataSource</code> to train an <code>MLModel</code> , the
     * <code>DataSource</code> requires another item: a recipe. A recipe
     * describes the observation variables that participate in training an
     * <code>MLModel</code> . A recipe describes how each input variable will
     * be used in training. Will the variable be included or excluded from
     * training? Will the variable be manipulated, for example, combined with
     * another variable, or split apart into word combinations? The recipe
     * provides answers to these questions. For more information, see the
     * <a href="http://docs.aws.amazon.com/machine-learning/latest/dg"> Amazon Machine Learning Developer Guide </a>
     * .
     * </p>
     *
     * @param createDataSourceFromS3Request Container for the necessary
     *           parameters to execute the CreateDataSourceFromS3 operation on
     *           AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDataSourceFromS3 service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDataSourceFromS3Result> createDataSourceFromS3Async(
            final CreateDataSourceFromS3Request createDataSourceFromS3Request,
            final AsyncHandler<CreateDataSourceFromS3Request, CreateDataSourceFromS3Result> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDataSourceFromS3Result>() {
            public CreateDataSourceFromS3Result call() throws Exception {
              CreateDataSourceFromS3Result result;
                try {
                result = createDataSourceFromS3(createDataSourceFromS3Request);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createDataSourceFromS3Request, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Assigns the DELETED status to an <code>MLModel</code> , rendering it
     * unusable.
     * </p>
     * <p>
     * After using the <code>DeleteMLModel</code> operation, you can use the
     * GetMLModel operation to verify that the status of the
     * <code>MLModel</code> changed to DELETED.
     * </p>
     * Caution The result of the DeleteMLModel operation is irreversible.
     *
     * @param deleteMLModelRequest Container for the necessary parameters to
     *           execute the DeleteMLModel operation on AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteMLModel service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteMLModelResult> deleteMLModelAsync(final DeleteMLModelRequest deleteMLModelRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteMLModelResult>() {
            public DeleteMLModelResult call() throws Exception {
                return deleteMLModel(deleteMLModelRequest);
        }
    });
    }

    /**
     * <p>
     * Assigns the DELETED status to an <code>MLModel</code> , rendering it
     * unusable.
     * </p>
     * <p>
     * After using the <code>DeleteMLModel</code> operation, you can use the
     * GetMLModel operation to verify that the status of the
     * <code>MLModel</code> changed to DELETED.
     * </p>
     * Caution The result of the DeleteMLModel operation is irreversible.
     *
     * @param deleteMLModelRequest Container for the necessary parameters to
     *           execute the DeleteMLModel operation on AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteMLModel service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteMLModelResult> deleteMLModelAsync(
            final DeleteMLModelRequest deleteMLModelRequest,
            final AsyncHandler<DeleteMLModelRequest, DeleteMLModelResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteMLModelResult>() {
            public DeleteMLModelResult call() throws Exception {
              DeleteMLModelResult result;
                try {
                result = deleteMLModel(deleteMLModelRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteMLModelRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Generates a prediction for the observation using the specified
     * <code>MLModel</code> .
     * </p>
     * <p>
     * <b>NOTE:</b> Note Not all response parameters will be populated
     * because this is dependent on the type of requested model.
     * </p>
     *
     * @param predictRequest Container for the necessary parameters to
     *           execute the Predict operation on AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the Predict
     *         service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PredictResult> predictAsync(final PredictRequest predictRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PredictResult>() {
            public PredictResult call() throws Exception {
                return predict(predictRequest);
        }
    });
    }

    /**
     * <p>
     * Generates a prediction for the observation using the specified
     * <code>MLModel</code> .
     * </p>
     * <p>
     * <b>NOTE:</b> Note Not all response parameters will be populated
     * because this is dependent on the type of requested model.
     * </p>
     *
     * @param predictRequest Container for the necessary parameters to
     *           execute the Predict operation on AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the Predict
     *         service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PredictResult> predictAsync(
            final PredictRequest predictRequest,
            final AsyncHandler<PredictRequest, PredictResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PredictResult>() {
            public PredictResult call() throws Exception {
              PredictResult result;
                try {
                result = predict(predictRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(predictRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Returns a list of <code>BatchPrediction</code> operations that match
     * the search criteria in the request.
     * </p>
     *
     * @param describeBatchPredictionsRequest Container for the necessary
     *           parameters to execute the DescribeBatchPredictions operation on
     *           AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeBatchPredictions service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeBatchPredictionsResult> describeBatchPredictionsAsync(final DescribeBatchPredictionsRequest describeBatchPredictionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeBatchPredictionsResult>() {
            public DescribeBatchPredictionsResult call() throws Exception {
                return describeBatchPredictions(describeBatchPredictionsRequest);
        }
    });
    }

    /**
     * <p>
     * Returns a list of <code>BatchPrediction</code> operations that match
     * the search criteria in the request.
     * </p>
     *
     * @param describeBatchPredictionsRequest Container for the necessary
     *           parameters to execute the DescribeBatchPredictions operation on
     *           AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeBatchPredictions service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeBatchPredictionsResult> describeBatchPredictionsAsync(
            final DescribeBatchPredictionsRequest describeBatchPredictionsRequest,
            final AsyncHandler<DescribeBatchPredictionsRequest, DescribeBatchPredictionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeBatchPredictionsResult>() {
            public DescribeBatchPredictionsResult call() throws Exception {
              DescribeBatchPredictionsResult result;
                try {
                result = describeBatchPredictions(describeBatchPredictionsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeBatchPredictionsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Returns an <code>Evaluation</code> that includes metadata as well as
     * the current status of the <code>Evaluation</code> .
     * </p>
     *
     * @param getEvaluationRequest Container for the necessary parameters to
     *           execute the GetEvaluation operation on AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         GetEvaluation service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetEvaluationResult> getEvaluationAsync(final GetEvaluationRequest getEvaluationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetEvaluationResult>() {
            public GetEvaluationResult call() throws Exception {
                return getEvaluation(getEvaluationRequest);
        }
    });
    }

    /**
     * <p>
     * Returns an <code>Evaluation</code> that includes metadata as well as
     * the current status of the <code>Evaluation</code> .
     * </p>
     *
     * @param getEvaluationRequest Container for the necessary parameters to
     *           execute the GetEvaluation operation on AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetEvaluation service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetEvaluationResult> getEvaluationAsync(
            final GetEvaluationRequest getEvaluationRequest,
            final AsyncHandler<GetEvaluationRequest, GetEvaluationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetEvaluationResult>() {
            public GetEvaluationResult call() throws Exception {
              GetEvaluationResult result;
                try {
                result = getEvaluation(getEvaluationRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getEvaluationRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Updates the <code>MLModelName</code> and the
     * <code>ScoreThreshold</code> of an <code>MLModel</code> .
     * </p>
     * <p>
     * You can use the GetMLModel operation to view the contents of the
     * updated data element.
     * </p>
     *
     * @param updateMLModelRequest Container for the necessary parameters to
     *           execute the UpdateMLModel operation on AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateMLModel service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateMLModelResult> updateMLModelAsync(final UpdateMLModelRequest updateMLModelRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateMLModelResult>() {
            public UpdateMLModelResult call() throws Exception {
                return updateMLModel(updateMLModelRequest);
        }
    });
    }

    /**
     * <p>
     * Updates the <code>MLModelName</code> and the
     * <code>ScoreThreshold</code> of an <code>MLModel</code> .
     * </p>
     * <p>
     * You can use the GetMLModel operation to view the contents of the
     * updated data element.
     * </p>
     *
     * @param updateMLModelRequest Container for the necessary parameters to
     *           execute the UpdateMLModel operation on AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateMLModel service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateMLModelResult> updateMLModelAsync(
            final UpdateMLModelRequest updateMLModelRequest,
            final AsyncHandler<UpdateMLModelRequest, UpdateMLModelResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateMLModelResult>() {
            public UpdateMLModelResult call() throws Exception {
              UpdateMLModelResult result;
                try {
                result = updateMLModel(updateMLModelRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateMLModelRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Returns a <code>DataSource</code> that includes metadata and data
     * file information, as well as the current status of the
     * <code>DataSource</code> .
     * </p>
     * <p>
     * <code>GetDataSource</code> provides results in normal or verbose
     * format. The verbose format adds the schema description and the list of
     * files pointed to by the DataSource to the normal format.
     * </p>
     *
     * @param getDataSourceRequest Container for the necessary parameters to
     *           execute the GetDataSource operation on AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         GetDataSource service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDataSourceResult> getDataSourceAsync(final GetDataSourceRequest getDataSourceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDataSourceResult>() {
            public GetDataSourceResult call() throws Exception {
                return getDataSource(getDataSourceRequest);
        }
    });
    }

    /**
     * <p>
     * Returns a <code>DataSource</code> that includes metadata and data
     * file information, as well as the current status of the
     * <code>DataSource</code> .
     * </p>
     * <p>
     * <code>GetDataSource</code> provides results in normal or verbose
     * format. The verbose format adds the schema description and the list of
     * files pointed to by the DataSource to the normal format.
     * </p>
     *
     * @param getDataSourceRequest Container for the necessary parameters to
     *           execute the GetDataSource operation on AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetDataSource service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDataSourceResult> getDataSourceAsync(
            final GetDataSourceRequest getDataSourceRequest,
            final AsyncHandler<GetDataSourceRequest, GetDataSourceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDataSourceResult>() {
            public GetDataSourceResult call() throws Exception {
              GetDataSourceResult result;
                try {
                result = getDataSource(getDataSourceRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getDataSourceRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Returns a list of <code>DataSource</code> that match the search
     * criteria in the request.
     * </p>
     *
     * @param describeDataSourcesRequest Container for the necessary
     *           parameters to execute the DescribeDataSources operation on
     *           AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDataSources service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDataSourcesResult> describeDataSourcesAsync(final DescribeDataSourcesRequest describeDataSourcesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDataSourcesResult>() {
            public DescribeDataSourcesResult call() throws Exception {
                return describeDataSources(describeDataSourcesRequest);
        }
    });
    }

    /**
     * <p>
     * Returns a list of <code>DataSource</code> that match the search
     * criteria in the request.
     * </p>
     *
     * @param describeDataSourcesRequest Container for the necessary
     *           parameters to execute the DescribeDataSources operation on
     *           AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDataSources service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDataSourcesResult> describeDataSourcesAsync(
            final DescribeDataSourcesRequest describeDataSourcesRequest,
            final AsyncHandler<DescribeDataSourcesRequest, DescribeDataSourcesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDataSourcesResult>() {
            public DescribeDataSourcesResult call() throws Exception {
              DescribeDataSourcesResult result;
                try {
                result = describeDataSources(describeDataSourcesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeDataSourcesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Assigns the <code>DELETED</code> status to an <code>Evaluation</code>
     * , rendering it unusable.
     * </p>
     * <p>
     * After invoking the <code>DeleteEvaluation</code> operation, you can
     * use the GetEvaluation operation to verify that the status of the
     * <code>Evaluation</code> changed to <code>DELETED</code> .
     * </p>
     * Caution The results of the DeleteEvaluation operation are
     * irreversible.
     *
     * @param deleteEvaluationRequest Container for the necessary parameters
     *           to execute the DeleteEvaluation operation on AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteEvaluation service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteEvaluationResult> deleteEvaluationAsync(final DeleteEvaluationRequest deleteEvaluationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteEvaluationResult>() {
            public DeleteEvaluationResult call() throws Exception {
                return deleteEvaluation(deleteEvaluationRequest);
        }
    });
    }

    /**
     * <p>
     * Assigns the <code>DELETED</code> status to an <code>Evaluation</code>
     * , rendering it unusable.
     * </p>
     * <p>
     * After invoking the <code>DeleteEvaluation</code> operation, you can
     * use the GetEvaluation operation to verify that the status of the
     * <code>Evaluation</code> changed to <code>DELETED</code> .
     * </p>
     * Caution The results of the DeleteEvaluation operation are
     * irreversible.
     *
     * @param deleteEvaluationRequest Container for the necessary parameters
     *           to execute the DeleteEvaluation operation on AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteEvaluation service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteEvaluationResult> deleteEvaluationAsync(
            final DeleteEvaluationRequest deleteEvaluationRequest,
            final AsyncHandler<DeleteEvaluationRequest, DeleteEvaluationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteEvaluationResult>() {
            public DeleteEvaluationResult call() throws Exception {
              DeleteEvaluationResult result;
                try {
                result = deleteEvaluation(deleteEvaluationRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteEvaluationRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Updates the <code>BatchPredictionName</code> of a
     * <code>BatchPrediction</code> .
     * </p>
     * <p>
     * You can use the GetBatchPrediction operation to view the contents of
     * the updated data element.
     * </p>
     *
     * @param updateBatchPredictionRequest Container for the necessary
     *           parameters to execute the UpdateBatchPrediction operation on
     *           AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateBatchPrediction service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateBatchPredictionResult> updateBatchPredictionAsync(final UpdateBatchPredictionRequest updateBatchPredictionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateBatchPredictionResult>() {
            public UpdateBatchPredictionResult call() throws Exception {
                return updateBatchPrediction(updateBatchPredictionRequest);
        }
    });
    }

    /**
     * <p>
     * Updates the <code>BatchPredictionName</code> of a
     * <code>BatchPrediction</code> .
     * </p>
     * <p>
     * You can use the GetBatchPrediction operation to view the contents of
     * the updated data element.
     * </p>
     *
     * @param updateBatchPredictionRequest Container for the necessary
     *           parameters to execute the UpdateBatchPrediction operation on
     *           AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateBatchPrediction service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateBatchPredictionResult> updateBatchPredictionAsync(
            final UpdateBatchPredictionRequest updateBatchPredictionRequest,
            final AsyncHandler<UpdateBatchPredictionRequest, UpdateBatchPredictionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateBatchPredictionResult>() {
            public UpdateBatchPredictionResult call() throws Exception {
              UpdateBatchPredictionResult result;
                try {
                result = updateBatchPrediction(updateBatchPredictionRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateBatchPredictionRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Generates predictions for a group of observations. The observations
     * to process exist in one or more data files referenced by a
     * <code>DataSource</code> . This operation creates a new
     * <code>BatchPrediction</code> , and uses an <code>MLModel</code> and
     * the data files referenced by the <code>DataSource</code> as
     * information sources.
     * </p>
     * <p>
     * <code>CreateBatchPrediction</code> is an asynchronous operation. In
     * response to <code>CreateBatchPrediction</code> , Amazon Machine
     * Learning (Amazon ML) immediately returns and sets the
     * <code>BatchPrediction</code> status to <code>PENDING</code> . After
     * the <code>BatchPrediction</code> completes, Amazon ML sets the status
     * to <code>COMPLETED</code> .
     * </p>
     * <p>
     * You can poll for status updates by using the GetBatchPrediction
     * operation and checking the <code>Status</code> parameter of the
     * result. After the <code>COMPLETED</code> status appears, the results
     * are available in the location specified by the <code>OutputUri</code>
     * parameter.
     * </p>
     *
     * @param createBatchPredictionRequest Container for the necessary
     *           parameters to execute the CreateBatchPrediction operation on
     *           AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         CreateBatchPrediction service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateBatchPredictionResult> createBatchPredictionAsync(final CreateBatchPredictionRequest createBatchPredictionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateBatchPredictionResult>() {
            public CreateBatchPredictionResult call() throws Exception {
                return createBatchPrediction(createBatchPredictionRequest);
        }
    });
    }

    /**
     * <p>
     * Generates predictions for a group of observations. The observations
     * to process exist in one or more data files referenced by a
     * <code>DataSource</code> . This operation creates a new
     * <code>BatchPrediction</code> , and uses an <code>MLModel</code> and
     * the data files referenced by the <code>DataSource</code> as
     * information sources.
     * </p>
     * <p>
     * <code>CreateBatchPrediction</code> is an asynchronous operation. In
     * response to <code>CreateBatchPrediction</code> , Amazon Machine
     * Learning (Amazon ML) immediately returns and sets the
     * <code>BatchPrediction</code> status to <code>PENDING</code> . After
     * the <code>BatchPrediction</code> completes, Amazon ML sets the status
     * to <code>COMPLETED</code> .
     * </p>
     * <p>
     * You can poll for status updates by using the GetBatchPrediction
     * operation and checking the <code>Status</code> parameter of the
     * result. After the <code>COMPLETED</code> status appears, the results
     * are available in the location specified by the <code>OutputUri</code>
     * parameter.
     * </p>
     *
     * @param createBatchPredictionRequest Container for the necessary
     *           parameters to execute the CreateBatchPrediction operation on
     *           AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateBatchPrediction service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateBatchPredictionResult> createBatchPredictionAsync(
            final CreateBatchPredictionRequest createBatchPredictionRequest,
            final AsyncHandler<CreateBatchPredictionRequest, CreateBatchPredictionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateBatchPredictionResult>() {
            public CreateBatchPredictionResult call() throws Exception {
              CreateBatchPredictionResult result;
                try {
                result = createBatchPrediction(createBatchPredictionRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createBatchPredictionRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Returns a list of <code>MLModel</code> that match the search criteria
     * in the request.
     * </p>
     *
     * @param describeMLModelsRequest Container for the necessary parameters
     *           to execute the DescribeMLModels operation on AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeMLModels service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeMLModelsResult> describeMLModelsAsync(final DescribeMLModelsRequest describeMLModelsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeMLModelsResult>() {
            public DescribeMLModelsResult call() throws Exception {
                return describeMLModels(describeMLModelsRequest);
        }
    });
    }

    /**
     * <p>
     * Returns a list of <code>MLModel</code> that match the search criteria
     * in the request.
     * </p>
     *
     * @param describeMLModelsRequest Container for the necessary parameters
     *           to execute the DescribeMLModels operation on AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeMLModels service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeMLModelsResult> describeMLModelsAsync(
            final DescribeMLModelsRequest describeMLModelsRequest,
            final AsyncHandler<DescribeMLModelsRequest, DescribeMLModelsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeMLModelsResult>() {
            public DescribeMLModelsResult call() throws Exception {
              DescribeMLModelsResult result;
                try {
                result = describeMLModels(describeMLModelsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeMLModelsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Assigns the DELETED status to a <code>BatchPrediction</code> ,
     * rendering it unusable.
     * </p>
     * <p>
     * After using the <code>DeleteBatchPrediction</code> operation, you can
     * use the GetBatchPrediction operation to verify that the status of the
     * <code>BatchPrediction</code> changed to DELETED.
     * </p>
     * Caution The result of the DeleteBatchPrediction operation is
     * irreversible.
     *
     * @param deleteBatchPredictionRequest Container for the necessary
     *           parameters to execute the DeleteBatchPrediction operation on
     *           AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteBatchPrediction service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteBatchPredictionResult> deleteBatchPredictionAsync(final DeleteBatchPredictionRequest deleteBatchPredictionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteBatchPredictionResult>() {
            public DeleteBatchPredictionResult call() throws Exception {
                return deleteBatchPrediction(deleteBatchPredictionRequest);
        }
    });
    }

    /**
     * <p>
     * Assigns the DELETED status to a <code>BatchPrediction</code> ,
     * rendering it unusable.
     * </p>
     * <p>
     * After using the <code>DeleteBatchPrediction</code> operation, you can
     * use the GetBatchPrediction operation to verify that the status of the
     * <code>BatchPrediction</code> changed to DELETED.
     * </p>
     * Caution The result of the DeleteBatchPrediction operation is
     * irreversible.
     *
     * @param deleteBatchPredictionRequest Container for the necessary
     *           parameters to execute the DeleteBatchPrediction operation on
     *           AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteBatchPrediction service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteBatchPredictionResult> deleteBatchPredictionAsync(
            final DeleteBatchPredictionRequest deleteBatchPredictionRequest,
            final AsyncHandler<DeleteBatchPredictionRequest, DeleteBatchPredictionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteBatchPredictionResult>() {
            public DeleteBatchPredictionResult call() throws Exception {
              DeleteBatchPredictionResult result;
                try {
                result = deleteBatchPrediction(deleteBatchPredictionRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteBatchPredictionRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Updates the <code>DataSourceName</code> of a <code>DataSource</code>
     * .
     * </p>
     * <p>
     * You can use the GetDataSource operation to view the contents of the
     * updated data element.
     * </p>
     *
     * @param updateDataSourceRequest Container for the necessary parameters
     *           to execute the UpdateDataSource operation on AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateDataSource service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateDataSourceResult> updateDataSourceAsync(final UpdateDataSourceRequest updateDataSourceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateDataSourceResult>() {
            public UpdateDataSourceResult call() throws Exception {
                return updateDataSource(updateDataSourceRequest);
        }
    });
    }

    /**
     * <p>
     * Updates the <code>DataSourceName</code> of a <code>DataSource</code>
     * .
     * </p>
     * <p>
     * You can use the GetDataSource operation to view the contents of the
     * updated data element.
     * </p>
     *
     * @param updateDataSourceRequest Container for the necessary parameters
     *           to execute the UpdateDataSource operation on AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateDataSource service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateDataSourceResult> updateDataSourceAsync(
            final UpdateDataSourceRequest updateDataSourceRequest,
            final AsyncHandler<UpdateDataSourceRequest, UpdateDataSourceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateDataSourceResult>() {
            public UpdateDataSourceResult call() throws Exception {
              UpdateDataSourceResult result;
                try {
                result = updateDataSource(updateDataSourceRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateDataSourceRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates a <code>DataSource</code> object from an
     * <a href="http://aws.amazon.com/rds/"> Amazon Relational Database Service </a>
     * (Amazon RDS). A <code>DataSource</code> references data that can be
     * used to perform CreateMLModel, CreateEvaluation, or
     * CreateBatchPrediction operations.
     * </p>
     * <p>
     * <code>CreateDataSourceFromRDS</code> is an asynchronous operation. In
     * response to <code>CreateDataSourceFromRDS</code> , Amazon Machine
     * Learning (Amazon ML) immediately returns and sets the
     * <code>DataSource</code> status to <code>PENDING</code> . After the
     * <code>DataSource</code> is created and ready for use, Amazon ML sets
     * the <code>Status</code> parameter to <code>COMPLETED</code> .
     * <code>DataSource</code> in <code>COMPLETED</code> or
     * <code>PENDING</code> status can only be used to perform CreateMLModel,
     * CreateEvaluation, or CreateBatchPrediction operations.
     * </p>
     * <p>
     * If Amazon ML cannot accept the input source, it sets the
     * <code>Status</code> parameter to <code>FAILED</code> and includes an
     * error message in the <code>Message</code> attribute of the
     * GetDataSource operation response.
     * </p>
     *
     * @param createDataSourceFromRDSRequest Container for the necessary
     *           parameters to execute the CreateDataSourceFromRDS operation on
     *           AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDataSourceFromRDS service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDataSourceFromRDSResult> createDataSourceFromRDSAsync(final CreateDataSourceFromRDSRequest createDataSourceFromRDSRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDataSourceFromRDSResult>() {
            public CreateDataSourceFromRDSResult call() throws Exception {
                return createDataSourceFromRDS(createDataSourceFromRDSRequest);
        }
    });
    }

    /**
     * <p>
     * Creates a <code>DataSource</code> object from an
     * <a href="http://aws.amazon.com/rds/"> Amazon Relational Database Service </a>
     * (Amazon RDS). A <code>DataSource</code> references data that can be
     * used to perform CreateMLModel, CreateEvaluation, or
     * CreateBatchPrediction operations.
     * </p>
     * <p>
     * <code>CreateDataSourceFromRDS</code> is an asynchronous operation. In
     * response to <code>CreateDataSourceFromRDS</code> , Amazon Machine
     * Learning (Amazon ML) immediately returns and sets the
     * <code>DataSource</code> status to <code>PENDING</code> . After the
     * <code>DataSource</code> is created and ready for use, Amazon ML sets
     * the <code>Status</code> parameter to <code>COMPLETED</code> .
     * <code>DataSource</code> in <code>COMPLETED</code> or
     * <code>PENDING</code> status can only be used to perform CreateMLModel,
     * CreateEvaluation, or CreateBatchPrediction operations.
     * </p>
     * <p>
     * If Amazon ML cannot accept the input source, it sets the
     * <code>Status</code> parameter to <code>FAILED</code> and includes an
     * error message in the <code>Message</code> attribute of the
     * GetDataSource operation response.
     * </p>
     *
     * @param createDataSourceFromRDSRequest Container for the necessary
     *           parameters to execute the CreateDataSourceFromRDS operation on
     *           AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDataSourceFromRDS service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDataSourceFromRDSResult> createDataSourceFromRDSAsync(
            final CreateDataSourceFromRDSRequest createDataSourceFromRDSRequest,
            final AsyncHandler<CreateDataSourceFromRDSRequest, CreateDataSourceFromRDSResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDataSourceFromRDSResult>() {
            public CreateDataSourceFromRDSResult call() throws Exception {
              CreateDataSourceFromRDSResult result;
                try {
                result = createDataSourceFromRDS(createDataSourceFromRDSRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createDataSourceFromRDSRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates a <code>DataSource</code> from
     * <a href="http://aws.amazon.com/redshift/"> Amazon Redshift </a>
     * . A <code>DataSource</code> references data that can be used to
     * perform either CreateMLModel, CreateEvaluation or
     * CreateBatchPrediction operations.
     * </p>
     * <p>
     * <code>CreateDataSourceFromRedshift</code> is an asynchronous
     * operation. In response to <code>CreateDataSourceFromRedshift</code> ,
     * Amazon Machine Learning (Amazon ML) immediately returns and sets the
     * <code>DataSource</code> status to <code>PENDING</code> . After the
     * <code>DataSource</code> is created and ready for use, Amazon ML sets
     * the <code>Status</code> parameter to <code>COMPLETED</code> .
     * <code>DataSource</code> in <code>COMPLETED</code> or
     * <code>PENDING</code> status can only be used to perform CreateMLModel,
     * CreateEvaluation, or CreateBatchPrediction operations.
     * </p>
     * <p>
     * If Amazon ML cannot accept the input source, it sets the
     * <code>Status</code> parameter to <code>FAILED</code> and includes an
     * error message in the <code>Message</code> attribute of the
     * GetDataSource operation response.
     * </p>
     * <p>
     * The observations should exist in the database hosted on an Amazon
     * Redshift cluster and should be specified by a
     * <code>SelectSqlQuery</code> . Amazon ML executes
     * <a href="http://docs.aws.amazon.com/redshift/latest/dg/t_Unloading_tables.html"> Unload </a>
     * command in Amazon Redshift to transfer the result set of
     * <code>SelectSqlQuery</code> to <code>S3StagingLocation.</code>
     * </p>
     * <p>
     * After the <code>DataSource</code> is created, it's ready for use in
     * evaluations and batch predictions. If you plan to use the
     * <code>DataSource</code> to train an <code>MLModel</code> , the
     * <code>DataSource</code> requires another item -- a recipe. A recipe
     * describes the observation variables that participate in training an
     * <code>MLModel</code> . A recipe describes how each input variable will
     * be used in training. Will the variable be included or excluded from
     * training? Will the variable be manipulated, for example, combined with
     * another variable or split apart into word combinations? The recipe
     * provides answers to these questions. For more information, see the
     * Amazon Machine Learning Developer Guide.
     * </p>
     *
     * @param createDataSourceFromRedshiftRequest Container for the necessary
     *           parameters to execute the CreateDataSourceFromRedshift operation on
     *           AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDataSourceFromRedshift service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDataSourceFromRedshiftResult> createDataSourceFromRedshiftAsync(final CreateDataSourceFromRedshiftRequest createDataSourceFromRedshiftRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDataSourceFromRedshiftResult>() {
            public CreateDataSourceFromRedshiftResult call() throws Exception {
                return createDataSourceFromRedshift(createDataSourceFromRedshiftRequest);
        }
    });
    }

    /**
     * <p>
     * Creates a <code>DataSource</code> from
     * <a href="http://aws.amazon.com/redshift/"> Amazon Redshift </a>
     * . A <code>DataSource</code> references data that can be used to
     * perform either CreateMLModel, CreateEvaluation or
     * CreateBatchPrediction operations.
     * </p>
     * <p>
     * <code>CreateDataSourceFromRedshift</code> is an asynchronous
     * operation. In response to <code>CreateDataSourceFromRedshift</code> ,
     * Amazon Machine Learning (Amazon ML) immediately returns and sets the
     * <code>DataSource</code> status to <code>PENDING</code> . After the
     * <code>DataSource</code> is created and ready for use, Amazon ML sets
     * the <code>Status</code> parameter to <code>COMPLETED</code> .
     * <code>DataSource</code> in <code>COMPLETED</code> or
     * <code>PENDING</code> status can only be used to perform CreateMLModel,
     * CreateEvaluation, or CreateBatchPrediction operations.
     * </p>
     * <p>
     * If Amazon ML cannot accept the input source, it sets the
     * <code>Status</code> parameter to <code>FAILED</code> and includes an
     * error message in the <code>Message</code> attribute of the
     * GetDataSource operation response.
     * </p>
     * <p>
     * The observations should exist in the database hosted on an Amazon
     * Redshift cluster and should be specified by a
     * <code>SelectSqlQuery</code> . Amazon ML executes
     * <a href="http://docs.aws.amazon.com/redshift/latest/dg/t_Unloading_tables.html"> Unload </a>
     * command in Amazon Redshift to transfer the result set of
     * <code>SelectSqlQuery</code> to <code>S3StagingLocation.</code>
     * </p>
     * <p>
     * After the <code>DataSource</code> is created, it's ready for use in
     * evaluations and batch predictions. If you plan to use the
     * <code>DataSource</code> to train an <code>MLModel</code> , the
     * <code>DataSource</code> requires another item -- a recipe. A recipe
     * describes the observation variables that participate in training an
     * <code>MLModel</code> . A recipe describes how each input variable will
     * be used in training. Will the variable be included or excluded from
     * training? Will the variable be manipulated, for example, combined with
     * another variable or split apart into word combinations? The recipe
     * provides answers to these questions. For more information, see the
     * Amazon Machine Learning Developer Guide.
     * </p>
     *
     * @param createDataSourceFromRedshiftRequest Container for the necessary
     *           parameters to execute the CreateDataSourceFromRedshift operation on
     *           AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDataSourceFromRedshift service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDataSourceFromRedshiftResult> createDataSourceFromRedshiftAsync(
            final CreateDataSourceFromRedshiftRequest createDataSourceFromRedshiftRequest,
            final AsyncHandler<CreateDataSourceFromRedshiftRequest, CreateDataSourceFromRedshiftResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDataSourceFromRedshiftResult>() {
            public CreateDataSourceFromRedshiftResult call() throws Exception {
              CreateDataSourceFromRedshiftResult result;
                try {
                result = createDataSourceFromRedshift(createDataSourceFromRedshiftRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createDataSourceFromRedshiftRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Returns a list of <code>DescribeEvaluations</code> that match the
     * search criteria in the request.
     * </p>
     *
     * @param describeEvaluationsRequest Container for the necessary
     *           parameters to execute the DescribeEvaluations operation on
     *           AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEvaluations service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeEvaluationsResult> describeEvaluationsAsync(final DescribeEvaluationsRequest describeEvaluationsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEvaluationsResult>() {
            public DescribeEvaluationsResult call() throws Exception {
                return describeEvaluations(describeEvaluationsRequest);
        }
    });
    }

    /**
     * <p>
     * Returns a list of <code>DescribeEvaluations</code> that match the
     * search criteria in the request.
     * </p>
     *
     * @param describeEvaluationsRequest Container for the necessary
     *           parameters to execute the DescribeEvaluations operation on
     *           AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEvaluations service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeEvaluationsResult> describeEvaluationsAsync(
            final DescribeEvaluationsRequest describeEvaluationsRequest,
            final AsyncHandler<DescribeEvaluationsRequest, DescribeEvaluationsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEvaluationsResult>() {
            public DescribeEvaluationsResult call() throws Exception {
              DescribeEvaluationsResult result;
                try {
                result = describeEvaluations(describeEvaluationsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeEvaluationsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Returns an <code>MLModel</code> that includes detailed metadata, and
     * data source information as well as the current status of the
     * <code>MLModel</code> .
     * </p>
     * <p>
     * <code>GetMLModel</code> provides results in normal or verbose format.
     * </p>
     *
     * @param getMLModelRequest Container for the necessary parameters to
     *           execute the GetMLModel operation on AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         GetMLModel service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetMLModelResult> getMLModelAsync(final GetMLModelRequest getMLModelRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetMLModelResult>() {
            public GetMLModelResult call() throws Exception {
                return getMLModel(getMLModelRequest);
        }
    });
    }

    /**
     * <p>
     * Returns an <code>MLModel</code> that includes detailed metadata, and
     * data source information as well as the current status of the
     * <code>MLModel</code> .
     * </p>
     * <p>
     * <code>GetMLModel</code> provides results in normal or verbose format.
     * </p>
     *
     * @param getMLModelRequest Container for the necessary parameters to
     *           execute the GetMLModel operation on AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetMLModel service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetMLModelResult> getMLModelAsync(
            final GetMLModelRequest getMLModelRequest,
            final AsyncHandler<GetMLModelRequest, GetMLModelResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetMLModelResult>() {
            public GetMLModelResult call() throws Exception {
              GetMLModelResult result;
                try {
                result = getMLModel(getMLModelRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getMLModelRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Assigns the DELETED status to a <code>DataSource</code> , rendering
     * it unusable.
     * </p>
     * <p>
     * After using the <code>DeleteDataSource</code> operation, you can use
     * the GetDataSource operation to verify that the status of the
     * <code>DataSource</code> changed to DELETED.
     * </p>
     * Caution The results of the DeleteDataSource operation are
     * irreversible.
     *
     * @param deleteDataSourceRequest Container for the necessary parameters
     *           to execute the DeleteDataSource operation on AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDataSource service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDataSourceResult> deleteDataSourceAsync(final DeleteDataSourceRequest deleteDataSourceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteDataSourceResult>() {
            public DeleteDataSourceResult call() throws Exception {
                return deleteDataSource(deleteDataSourceRequest);
        }
    });
    }

    /**
     * <p>
     * Assigns the DELETED status to a <code>DataSource</code> , rendering
     * it unusable.
     * </p>
     * <p>
     * After using the <code>DeleteDataSource</code> operation, you can use
     * the GetDataSource operation to verify that the status of the
     * <code>DataSource</code> changed to DELETED.
     * </p>
     * Caution The results of the DeleteDataSource operation are
     * irreversible.
     *
     * @param deleteDataSourceRequest Container for the necessary parameters
     *           to execute the DeleteDataSource operation on AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDataSource service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDataSourceResult> deleteDataSourceAsync(
            final DeleteDataSourceRequest deleteDataSourceRequest,
            final AsyncHandler<DeleteDataSourceRequest, DeleteDataSourceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteDataSourceResult>() {
            public DeleteDataSourceResult call() throws Exception {
              DeleteDataSourceResult result;
                try {
                result = deleteDataSource(deleteDataSourceRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteDataSourceRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Returns a <code>BatchPrediction</code> that includes detailed
     * metadata, status, and data file information for a <code>Batch
     * Prediction</code> request.
     * </p>
     *
     * @param getBatchPredictionRequest Container for the necessary
     *           parameters to execute the GetBatchPrediction operation on
     *           AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         GetBatchPrediction service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetBatchPredictionResult> getBatchPredictionAsync(final GetBatchPredictionRequest getBatchPredictionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetBatchPredictionResult>() {
            public GetBatchPredictionResult call() throws Exception {
                return getBatchPrediction(getBatchPredictionRequest);
        }
    });
    }

    /**
     * <p>
     * Returns a <code>BatchPrediction</code> that includes detailed
     * metadata, status, and data file information for a <code>Batch
     * Prediction</code> request.
     * </p>
     *
     * @param getBatchPredictionRequest Container for the necessary
     *           parameters to execute the GetBatchPrediction operation on
     *           AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetBatchPrediction service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetBatchPredictionResult> getBatchPredictionAsync(
            final GetBatchPredictionRequest getBatchPredictionRequest,
            final AsyncHandler<GetBatchPredictionRequest, GetBatchPredictionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetBatchPredictionResult>() {
            public GetBatchPredictionResult call() throws Exception {
              GetBatchPredictionResult result;
                try {
                result = getBatchPrediction(getBatchPredictionRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getBatchPredictionRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates a new <code>Evaluation</code> of an <code>MLModel</code> . An
     * <code>MLModel</code> is evaluated on a set of observations associated
     * to a <code>DataSource</code> . Like a <code>DataSource</code> for an
     * <code>MLModel</code> , the <code>DataSource</code> for an
     * <code>Evaluation</code> contains values for the Target Variable. The
     * <code>Evaluation</code> compares the predicted result for each
     * observation to the actual outcome and provides a summary so that you
     * know how effective the <code>MLModel</code> functions on the test
     * data. Evaluation generates a relevant performance metric such as
     * BinaryAUC, RegressionRMSE or MulticlassAvgFScore based on the
     * corresponding <code>MLModelType</code> : <code>BINARY</code> ,
     * <code>REGRESSION</code> or <code>MULTICLASS</code> .
     * </p>
     * <p>
     * <code>CreateEvaluation</code> is an asynchronous operation. In
     * response to <code>CreateEvaluation</code> , Amazon Machine Learning
     * (Amazon ML) immediately returns and sets the evaluation status to
     * <code>PENDING</code> . After the <code>Evaluation</code> is created
     * and ready for use, Amazon ML sets the status to <code>COMPLETED</code>
     * .
     * </p>
     * <p>
     * You can use the GetEvaluation operation to check progress of the
     * evaluation during the creation operation.
     * </p>
     *
     * @param createEvaluationRequest Container for the necessary parameters
     *           to execute the CreateEvaluation operation on AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         CreateEvaluation service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateEvaluationResult> createEvaluationAsync(final CreateEvaluationRequest createEvaluationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateEvaluationResult>() {
            public CreateEvaluationResult call() throws Exception {
                return createEvaluation(createEvaluationRequest);
        }
    });
    }

    /**
     * <p>
     * Creates a new <code>Evaluation</code> of an <code>MLModel</code> . An
     * <code>MLModel</code> is evaluated on a set of observations associated
     * to a <code>DataSource</code> . Like a <code>DataSource</code> for an
     * <code>MLModel</code> , the <code>DataSource</code> for an
     * <code>Evaluation</code> contains values for the Target Variable. The
     * <code>Evaluation</code> compares the predicted result for each
     * observation to the actual outcome and provides a summary so that you
     * know how effective the <code>MLModel</code> functions on the test
     * data. Evaluation generates a relevant performance metric such as
     * BinaryAUC, RegressionRMSE or MulticlassAvgFScore based on the
     * corresponding <code>MLModelType</code> : <code>BINARY</code> ,
     * <code>REGRESSION</code> or <code>MULTICLASS</code> .
     * </p>
     * <p>
     * <code>CreateEvaluation</code> is an asynchronous operation. In
     * response to <code>CreateEvaluation</code> , Amazon Machine Learning
     * (Amazon ML) immediately returns and sets the evaluation status to
     * <code>PENDING</code> . After the <code>Evaluation</code> is created
     * and ready for use, Amazon ML sets the status to <code>COMPLETED</code>
     * .
     * </p>
     * <p>
     * You can use the GetEvaluation operation to check progress of the
     * evaluation during the creation operation.
     * </p>
     *
     * @param createEvaluationRequest Container for the necessary parameters
     *           to execute the CreateEvaluation operation on AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateEvaluation service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateEvaluationResult> createEvaluationAsync(
            final CreateEvaluationRequest createEvaluationRequest,
            final AsyncHandler<CreateEvaluationRequest, CreateEvaluationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateEvaluationResult>() {
            public CreateEvaluationResult call() throws Exception {
              CreateEvaluationResult result;
                try {
                result = createEvaluation(createEvaluationRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createEvaluationRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes a real time endpoint of an <code>MLModel</code> .
     * </p>
     *
     * @param deleteRealtimeEndpointRequest Container for the necessary
     *           parameters to execute the DeleteRealtimeEndpoint operation on
     *           AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteRealtimeEndpoint service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteRealtimeEndpointResult> deleteRealtimeEndpointAsync(final DeleteRealtimeEndpointRequest deleteRealtimeEndpointRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteRealtimeEndpointResult>() {
            public DeleteRealtimeEndpointResult call() throws Exception {
                return deleteRealtimeEndpoint(deleteRealtimeEndpointRequest);
        }
    });
    }

    /**
     * <p>
     * Deletes a real time endpoint of an <code>MLModel</code> .
     * </p>
     *
     * @param deleteRealtimeEndpointRequest Container for the necessary
     *           parameters to execute the DeleteRealtimeEndpoint operation on
     *           AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteRealtimeEndpoint service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteRealtimeEndpointResult> deleteRealtimeEndpointAsync(
            final DeleteRealtimeEndpointRequest deleteRealtimeEndpointRequest,
            final AsyncHandler<DeleteRealtimeEndpointRequest, DeleteRealtimeEndpointResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteRealtimeEndpointResult>() {
            public DeleteRealtimeEndpointResult call() throws Exception {
              DeleteRealtimeEndpointResult result;
                try {
                result = deleteRealtimeEndpoint(deleteRealtimeEndpointRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteRealtimeEndpointRequest, result);
                 return result;
        }
    });
    }
    
}
        