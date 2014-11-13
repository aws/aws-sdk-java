/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda;

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

import com.amazonaws.services.lambda.model.*;

/**
 * Asynchronous client for accessing AWSLambda.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * AWS Lambda <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This is the AWS Lambda API Reference. The AWS Lambda Developer Guide
 * provides additional information. For the service overview, go to
 * <a href="http://docs.aws.amazon.com/lambda/latest/dg/welcome.html"> What is AWS Lambda </a> , and for information about how the service works, go to <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html"> AWS LambdaL How it Works </a>
 * in the AWS Lambda Developer Guide.
 * </p>
 */
public class AWSLambdaAsyncClient extends AWSLambdaClient
        implements AWSLambdaAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSLambda.  A credentials provider chain will be used
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
    public AWSLambdaAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSLambda.  A credentials provider chain will be used
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
     *                       client connects to AWSLambda
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSLambdaAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSLambda using the specified AWS account credentials.
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
    public AWSLambdaAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSLambda using the specified AWS account credentials
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
    public AWSLambdaAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSLambda using the specified AWS account credentials,
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
    public AWSLambdaAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSLambda using the specified AWS account credentials provider.
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
    public AWSLambdaAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSLambda using the specified AWS account credentials provider
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
    public AWSLambdaAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSLambda using the specified AWS account credentials
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
    public AWSLambdaAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSLambda using the specified AWS account credentials
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
    public AWSLambdaAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Returns configuration information for the specified event source
     * mapping (see AddEventSource).
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:GetEventSource</code> action.
     * </p>
     *
     * @param getEventSourceRequest Container for the necessary parameters to
     *           execute the GetEventSource operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         GetEventSource service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetEventSourceResult> getEventSourceAsync(final GetEventSourceRequest getEventSourceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetEventSourceResult>() {
            public GetEventSourceResult call() throws Exception {
                return getEventSource(getEventSourceRequest);
        }
    });
    }

    /**
     * <p>
     * Returns configuration information for the specified event source
     * mapping (see AddEventSource).
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:GetEventSource</code> action.
     * </p>
     *
     * @param getEventSourceRequest Container for the necessary parameters to
     *           execute the GetEventSource operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetEventSource service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetEventSourceResult> getEventSourceAsync(
            final GetEventSourceRequest getEventSourceRequest,
            final AsyncHandler<GetEventSourceRequest, GetEventSourceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetEventSourceResult>() {
            public GetEventSourceResult call() throws Exception {
              GetEventSourceResult result;
                try {
                result = getEventSource(getEventSourceRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getEventSourceRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes the specified Lambda function code and configuration.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:DeleteFunction</code> action.
     * </p>
     *
     * @param deleteFunctionRequest Container for the necessary parameters to
     *           execute the DeleteFunction operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteFunction service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteFunctionAsync(final DeleteFunctionRequest deleteFunctionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteFunction(deleteFunctionRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deletes the specified Lambda function code and configuration.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:DeleteFunction</code> action.
     * </p>
     *
     * @param deleteFunctionRequest Container for the necessary parameters to
     *           execute the DeleteFunction operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteFunction service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteFunctionAsync(
            final DeleteFunctionRequest deleteFunctionRequest,
            final AsyncHandler<DeleteFunctionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteFunction(deleteFunctionRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteFunctionRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Returns a list of your Lambda functions. For each function, the
     * response includes the function configuration information. You must use
     * GetFunction to retrieve the code for your function.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:ListFunctions</code> action.
     * </p>
     *
     * @param listFunctionsRequest Container for the necessary parameters to
     *           execute the ListFunctions operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         ListFunctions service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListFunctionsResult> listFunctionsAsync(final ListFunctionsRequest listFunctionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListFunctionsResult>() {
            public ListFunctionsResult call() throws Exception {
                return listFunctions(listFunctionsRequest);
        }
    });
    }

    /**
     * <p>
     * Returns a list of your Lambda functions. For each function, the
     * response includes the function configuration information. You must use
     * GetFunction to retrieve the code for your function.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:ListFunctions</code> action.
     * </p>
     *
     * @param listFunctionsRequest Container for the necessary parameters to
     *           execute the ListFunctions operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListFunctions service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListFunctionsResult> listFunctionsAsync(
            final ListFunctionsRequest listFunctionsRequest,
            final AsyncHandler<ListFunctionsRequest, ListFunctionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListFunctionsResult>() {
            public ListFunctionsResult call() throws Exception {
              ListFunctionsResult result;
                try {
                result = listFunctions(listFunctionsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listFunctionsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Identifies an Amazon Kinesis stream as the event source for an AWS
     * Lambda function. AWS Lambda invokes the specified function when
     * records are posted to the stream.
     * </p>
     * <p>
     * This is the pull model, where AWS Lambda invokes the function. For
     * more information, go to
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html"> AWS LambdaL How it Works </a>
     * in the AWS Lambda Developer Guide.
     * </p>
     * <p>
     * This association between an Amazon Kinesis stream and an AWS Lambda
     * function is called the event source mapping. You provide the
     * configuration information (for example, which stream to read from and
     * which AWS Lambda function to invoke) for the event source mapping in
     * the request body.
     * </p>
     * <p>
     * This operation requires permission for the <code>iam:PassRole</code>
     * action for the IAM role. It also requires permission for the
     * <code>lambda:AddEventSource</code> action.
     * </p>
     *
     * @param addEventSourceRequest Container for the necessary parameters to
     *           execute the AddEventSource operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         AddEventSource service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddEventSourceResult> addEventSourceAsync(final AddEventSourceRequest addEventSourceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AddEventSourceResult>() {
            public AddEventSourceResult call() throws Exception {
                return addEventSource(addEventSourceRequest);
        }
    });
    }

    /**
     * <p>
     * Identifies an Amazon Kinesis stream as the event source for an AWS
     * Lambda function. AWS Lambda invokes the specified function when
     * records are posted to the stream.
     * </p>
     * <p>
     * This is the pull model, where AWS Lambda invokes the function. For
     * more information, go to
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html"> AWS LambdaL How it Works </a>
     * in the AWS Lambda Developer Guide.
     * </p>
     * <p>
     * This association between an Amazon Kinesis stream and an AWS Lambda
     * function is called the event source mapping. You provide the
     * configuration information (for example, which stream to read from and
     * which AWS Lambda function to invoke) for the event source mapping in
     * the request body.
     * </p>
     * <p>
     * This operation requires permission for the <code>iam:PassRole</code>
     * action for the IAM role. It also requires permission for the
     * <code>lambda:AddEventSource</code> action.
     * </p>
     *
     * @param addEventSourceRequest Container for the necessary parameters to
     *           execute the AddEventSource operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AddEventSource service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddEventSourceResult> addEventSourceAsync(
            final AddEventSourceRequest addEventSourceRequest,
            final AsyncHandler<AddEventSourceRequest, AddEventSourceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AddEventSourceResult>() {
            public AddEventSourceResult call() throws Exception {
              AddEventSourceResult result;
                try {
                result = addEventSource(addEventSourceRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(addEventSourceRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates a new Lambda function or updates an existing function. The
     * function metadata is created from the request parameters, and the code
     * for the function is provided by a .zip file in the request body. If
     * the function name already exists, the existing Lambda function is
     * updated with the new code and metadata.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:UploadFunction</code> action.
     * </p>
     *
     * @param uploadFunctionRequest Container for the necessary parameters to
     *           execute the UploadFunction operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         UploadFunction service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UploadFunctionResult> uploadFunctionAsync(final UploadFunctionRequest uploadFunctionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UploadFunctionResult>() {
            public UploadFunctionResult call() throws Exception {
                return uploadFunction(uploadFunctionRequest);
        }
    });
    }

    /**
     * <p>
     * Creates a new Lambda function or updates an existing function. The
     * function metadata is created from the request parameters, and the code
     * for the function is provided by a .zip file in the request body. If
     * the function name already exists, the existing Lambda function is
     * updated with the new code and metadata.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:UploadFunction</code> action.
     * </p>
     *
     * @param uploadFunctionRequest Container for the necessary parameters to
     *           execute the UploadFunction operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UploadFunction service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UploadFunctionResult> uploadFunctionAsync(
            final UploadFunctionRequest uploadFunctionRequest,
            final AsyncHandler<UploadFunctionRequest, UploadFunctionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UploadFunctionResult>() {
            public UploadFunctionResult call() throws Exception {
              UploadFunctionResult result;
                try {
                result = uploadFunction(uploadFunctionRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(uploadFunctionRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Returns the configuration information of the Lambda function. This
     * the same information you provided as parameters when uploading the
     * function by using UploadFunction.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:GetFunctionConfiguration</code> operation.
     * </p>
     *
     * @param getFunctionConfigurationRequest Container for the necessary
     *           parameters to execute the GetFunctionConfiguration operation on
     *           AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         GetFunctionConfiguration service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetFunctionConfigurationResult> getFunctionConfigurationAsync(final GetFunctionConfigurationRequest getFunctionConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetFunctionConfigurationResult>() {
            public GetFunctionConfigurationResult call() throws Exception {
                return getFunctionConfiguration(getFunctionConfigurationRequest);
        }
    });
    }

    /**
     * <p>
     * Returns the configuration information of the Lambda function. This
     * the same information you provided as parameters when uploading the
     * function by using UploadFunction.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:GetFunctionConfiguration</code> operation.
     * </p>
     *
     * @param getFunctionConfigurationRequest Container for the necessary
     *           parameters to execute the GetFunctionConfiguration operation on
     *           AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetFunctionConfiguration service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetFunctionConfigurationResult> getFunctionConfigurationAsync(
            final GetFunctionConfigurationRequest getFunctionConfigurationRequest,
            final AsyncHandler<GetFunctionConfigurationRequest, GetFunctionConfigurationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetFunctionConfigurationResult>() {
            public GetFunctionConfigurationResult call() throws Exception {
              GetFunctionConfigurationResult result;
                try {
                result = getFunctionConfiguration(getFunctionConfigurationRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getFunctionConfigurationRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Submits an invocation request to AWS Lambda. Upon receiving the
     * request, Lambda executes the specified function asynchronously. To see
     * the logs generated by the Lambda function execution, see the
     * CloudWatch logs console.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:InvokeAsync</code> action.
     * </p>
     *
     * @param invokeAsyncRequest Container for the necessary parameters to
     *           execute the InvokeAsync operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         InvokeAsync service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<InvokeAsyncResult> invokeAsyncAsync(final InvokeAsyncRequest invokeAsyncRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<InvokeAsyncResult>() {
            public InvokeAsyncResult call() throws Exception {
                return invokeAsync(invokeAsyncRequest);
        }
    });
    }

    /**
     * <p>
     * Submits an invocation request to AWS Lambda. Upon receiving the
     * request, Lambda executes the specified function asynchronously. To see
     * the logs generated by the Lambda function execution, see the
     * CloudWatch logs console.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:InvokeAsync</code> action.
     * </p>
     *
     * @param invokeAsyncRequest Container for the necessary parameters to
     *           execute the InvokeAsync operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         InvokeAsync service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<InvokeAsyncResult> invokeAsyncAsync(
            final InvokeAsyncRequest invokeAsyncRequest,
            final AsyncHandler<InvokeAsyncRequest, InvokeAsyncResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<InvokeAsyncResult>() {
            public InvokeAsyncResult call() throws Exception {
              InvokeAsyncResult result;
                try {
                result = invokeAsync(invokeAsyncRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(invokeAsyncRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Returns a list of event source mappings. For each mapping, the API
     * returns configuration information (see AddEventSource). You can
     * optionally specify filters to retrieve specific event source mappings.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:ListEventSources</code> action.
     * </p>
     *
     * @param listEventSourcesRequest Container for the necessary parameters
     *           to execute the ListEventSources operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         ListEventSources service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListEventSourcesResult> listEventSourcesAsync(final ListEventSourcesRequest listEventSourcesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListEventSourcesResult>() {
            public ListEventSourcesResult call() throws Exception {
                return listEventSources(listEventSourcesRequest);
        }
    });
    }

    /**
     * <p>
     * Returns a list of event source mappings. For each mapping, the API
     * returns configuration information (see AddEventSource). You can
     * optionally specify filters to retrieve specific event source mappings.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:ListEventSources</code> action.
     * </p>
     *
     * @param listEventSourcesRequest Container for the necessary parameters
     *           to execute the ListEventSources operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListEventSources service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListEventSourcesResult> listEventSourcesAsync(
            final ListEventSourcesRequest listEventSourcesRequest,
            final AsyncHandler<ListEventSourcesRequest, ListEventSourcesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListEventSourcesResult>() {
            public ListEventSourcesResult call() throws Exception {
              ListEventSourcesResult result;
                try {
                result = listEventSources(listEventSourcesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listEventSourcesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Returns the configuration information of the Lambda function and a
     * presigned URL link to the .zip file you uploaded with UploadFunction
     * so you can download the .zip file. Note that the URL is valid for up
     * to 10 minutes. The configuration information is the same information
     * you provided as parameters when uploading the function.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:GetFunction</code> action.
     * </p>
     *
     * @param getFunctionRequest Container for the necessary parameters to
     *           execute the GetFunction operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         GetFunction service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetFunctionResult> getFunctionAsync(final GetFunctionRequest getFunctionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetFunctionResult>() {
            public GetFunctionResult call() throws Exception {
                return getFunction(getFunctionRequest);
        }
    });
    }

    /**
     * <p>
     * Returns the configuration information of the Lambda function and a
     * presigned URL link to the .zip file you uploaded with UploadFunction
     * so you can download the .zip file. Note that the URL is valid for up
     * to 10 minutes. The configuration information is the same information
     * you provided as parameters when uploading the function.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:GetFunction</code> action.
     * </p>
     *
     * @param getFunctionRequest Container for the necessary parameters to
     *           execute the GetFunction operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetFunction service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetFunctionResult> getFunctionAsync(
            final GetFunctionRequest getFunctionRequest,
            final AsyncHandler<GetFunctionRequest, GetFunctionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetFunctionResult>() {
            public GetFunctionResult call() throws Exception {
              GetFunctionResult result;
                try {
                result = getFunction(getFunctionRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getFunctionRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Updates the configuration parameters for the specified Lambda
     * function by using the values provided in the request. You provide only
     * the parameters you want to change. This operation must only be used on
     * an existing Lambda function and cannot be used to update the
     * function's code.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:UpdateFunctionConfiguration</code> action.
     * </p>
     *
     * @param updateFunctionConfigurationRequest Container for the necessary
     *           parameters to execute the UpdateFunctionConfiguration operation on
     *           AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateFunctionConfiguration service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateFunctionConfigurationResult> updateFunctionConfigurationAsync(final UpdateFunctionConfigurationRequest updateFunctionConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateFunctionConfigurationResult>() {
            public UpdateFunctionConfigurationResult call() throws Exception {
                return updateFunctionConfiguration(updateFunctionConfigurationRequest);
        }
    });
    }

    /**
     * <p>
     * Updates the configuration parameters for the specified Lambda
     * function by using the values provided in the request. You provide only
     * the parameters you want to change. This operation must only be used on
     * an existing Lambda function and cannot be used to update the
     * function's code.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:UpdateFunctionConfiguration</code> action.
     * </p>
     *
     * @param updateFunctionConfigurationRequest Container for the necessary
     *           parameters to execute the UpdateFunctionConfiguration operation on
     *           AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateFunctionConfiguration service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateFunctionConfigurationResult> updateFunctionConfigurationAsync(
            final UpdateFunctionConfigurationRequest updateFunctionConfigurationRequest,
            final AsyncHandler<UpdateFunctionConfigurationRequest, UpdateFunctionConfigurationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateFunctionConfigurationResult>() {
            public UpdateFunctionConfigurationResult call() throws Exception {
              UpdateFunctionConfigurationResult result;
                try {
                result = updateFunctionConfiguration(updateFunctionConfigurationRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateFunctionConfigurationRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Removes an event source mapping. This means AWS Lambda will no longer
     * invoke the function for events in the associated source.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:RemoveEventSource</code> action.
     * </p>
     *
     * @param removeEventSourceRequest Container for the necessary parameters
     *           to execute the RemoveEventSource operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         RemoveEventSource service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> removeEventSourceAsync(final RemoveEventSourceRequest removeEventSourceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                removeEventSource(removeEventSourceRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Removes an event source mapping. This means AWS Lambda will no longer
     * invoke the function for events in the associated source.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:RemoveEventSource</code> action.
     * </p>
     *
     * @param removeEventSourceRequest Container for the necessary parameters
     *           to execute the RemoveEventSource operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RemoveEventSource service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> removeEventSourceAsync(
            final RemoveEventSourceRequest removeEventSourceRequest,
            final AsyncHandler<RemoveEventSourceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                removeEventSource(removeEventSourceRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(removeEventSourceRequest, null);
                 return null;
        }
    });
    }
    
}
        