/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * This is the <i>AWS Lambda API Reference</i> .
 * The AWS Lambda Developer Guide provides additional information.
 * For the service overview, go to
 * <a href="http://docs.aws.amazon.com/lambda/latest/dg/welcome.html"> What is AWS Lambda </a> , and for information about how the service works, go to <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html"> AWS Lambda: How it Works </a>
 * in the <i>AWS Lambda Developer Guide</i> .
 * </p>
 */
public class AWSLambdaAsyncClient extends AWSLambdaClient
        implements AWSLambdaAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private final ExecutorService executorService;

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
     * Using this API you can update the function version to which the alias
     * points and the alias description. For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"> Introduction to AWS Lambda Aliases </a>
     * .
     * </p>
     * <p>
     * This requires permission for the lambda:UpdateAlias action.
     * </p>
     *
     * @param updateAliasRequest Container for the necessary parameters to
     *           execute the UpdateAlias operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateAlias service method, as returned by AWSLambda.
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
    public Future<UpdateAliasResult> updateAliasAsync(final UpdateAliasRequest updateAliasRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateAliasResult>() {
            public UpdateAliasResult call() throws Exception {
                return updateAlias(updateAliasRequest);
        }
    });
    }

    /**
     * <p>
     * Using this API you can update the function version to which the alias
     * points and the alias description. For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"> Introduction to AWS Lambda Aliases </a>
     * .
     * </p>
     * <p>
     * This requires permission for the lambda:UpdateAlias action.
     * </p>
     *
     * @param updateAliasRequest Container for the necessary parameters to
     *           execute the UpdateAlias operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateAlias service method, as returned by AWSLambda.
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
    public Future<UpdateAliasResult> updateAliasAsync(
            final UpdateAliasRequest updateAliasRequest,
            final AsyncHandler<UpdateAliasRequest, UpdateAliasResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateAliasResult>() {
            public UpdateAliasResult call() throws Exception {
              UpdateAliasResult result;
                try {
                result = updateAlias(updateAliasRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateAliasRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes the specified Lambda function code and configuration.
     * </p>
     * <p>
     * If you are using the versioning feature and you don't specify a
     * function version in your <code>DeleteFunction</code> request, AWS
     * Lambda will delete the function, including all its versions, and any
     * aliases pointing to the function versions. To delete a specific
     * function version, you must provide the function version via the
     * <code>Qualifier</code> parameter. For information about function
     * versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * When you delete a function the associated resource policy is also
     * deleted. You will need to delete the event source mappings explicitly.
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
     * If you are using the versioning feature and you don't specify a
     * function version in your <code>DeleteFunction</code> request, AWS
     * Lambda will delete the function, including all its versions, and any
     * aliases pointing to the function versions. To delete a specific
     * function version, you must provide the function version via the
     * <code>Qualifier</code> parameter. For information about function
     * versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * When you delete a function the associated resource policy is also
     * deleted. You will need to delete the event source mappings explicitly.
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
     * Adds a permission to the resource policy associated with the
     * specified AWS Lambda function. You use resource policies to grant
     * permissions to event sources that use <i>push</i> model. In a
     * <i>push</i> model, event sources (such as Amazon S3 and custom
     * applications) invoke your Lambda function. Each permission you add to
     * the resource policy allows an event source, permission to invoke the
     * Lambda function.
     * </p>
     * <p>
     * For information about the push model, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html"> AWS Lambda: How it Works </a>
     * .
     * </p>
     * <p>
     * If you are using versioning, the permissions you add are specific to
     * the Lambda function version or alias you specify in the
     * <code>AddPermission</code> request via the <code>Qualifier</code>
     * parameter. For more information about versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:AddPermission</code> action.
     * </p>
     *
     * @param addPermissionRequest Container for the necessary parameters to
     *           execute the AddPermission operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         AddPermission service method, as returned by AWSLambda.
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
    public Future<AddPermissionResult> addPermissionAsync(final AddPermissionRequest addPermissionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AddPermissionResult>() {
            public AddPermissionResult call() throws Exception {
                return addPermission(addPermissionRequest);
        }
    });
    }

    /**
     * <p>
     * Adds a permission to the resource policy associated with the
     * specified AWS Lambda function. You use resource policies to grant
     * permissions to event sources that use <i>push</i> model. In a
     * <i>push</i> model, event sources (such as Amazon S3 and custom
     * applications) invoke your Lambda function. Each permission you add to
     * the resource policy allows an event source, permission to invoke the
     * Lambda function.
     * </p>
     * <p>
     * For information about the push model, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html"> AWS Lambda: How it Works </a>
     * .
     * </p>
     * <p>
     * If you are using versioning, the permissions you add are specific to
     * the Lambda function version or alias you specify in the
     * <code>AddPermission</code> request via the <code>Qualifier</code>
     * parameter. For more information about versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:AddPermission</code> action.
     * </p>
     *
     * @param addPermissionRequest Container for the necessary parameters to
     *           execute the AddPermission operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AddPermission service method, as returned by AWSLambda.
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
    public Future<AddPermissionResult> addPermissionAsync(
            final AddPermissionRequest addPermissionRequest,
            final AsyncHandler<AddPermissionRequest, AddPermissionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AddPermissionResult>() {
            public AddPermissionResult call() throws Exception {
              AddPermissionResult result;
                try {
                result = addPermission(addPermissionRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(addPermissionRequest, result);
                 return result;
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
     * <p>
     * If you are using versioning feature, the response returns list of
     * $LATEST versions of your functions. For information about the
     * versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
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
     * <p>
     * If you are using versioning feature, the response returns list of
     * $LATEST versions of your functions. For information about the
     * versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
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
     * Returns the specified alias information such as the alias ARN,
     * description, and function version it is pointing to. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"> Introduction to AWS Lambda Aliases </a>
     * .
     * </p>
     * <p>
     * This requires permission for the <code>lambda:GetAlias</code> action.
     * </p>
     *
     * @param getAliasRequest Container for the necessary parameters to
     *           execute the GetAlias operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the GetAlias
     *         service method, as returned by AWSLambda.
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
    public Future<GetAliasResult> getAliasAsync(final GetAliasRequest getAliasRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetAliasResult>() {
            public GetAliasResult call() throws Exception {
                return getAlias(getAliasRequest);
        }
    });
    }

    /**
     * <p>
     * Returns the specified alias information such as the alias ARN,
     * description, and function version it is pointing to. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"> Introduction to AWS Lambda Aliases </a>
     * .
     * </p>
     * <p>
     * This requires permission for the <code>lambda:GetAlias</code> action.
     * </p>
     *
     * @param getAliasRequest Container for the necessary parameters to
     *           execute the GetAlias operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the GetAlias
     *         service method, as returned by AWSLambda.
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
    public Future<GetAliasResult> getAliasAsync(
            final GetAliasRequest getAliasRequest,
            final AsyncHandler<GetAliasRequest, GetAliasResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetAliasResult>() {
            public GetAliasResult call() throws Exception {
              GetAliasResult result;
                try {
                result = getAlias(getAliasRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getAliasRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * You can remove individual permissions from an resource policy
     * associated with a Lambda function by providing a statement ID that you
     * provided when you added the permission.
     * </p>
     * <p>
     * If you are using versioning, the permissions you remove are specific
     * to the Lambda function version or alias you specify in the
     * <code>AddPermission</code> request via the <code>Qualifier</code>
     * parameter. For more information about versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * Note that removal of a permission will cause an active event source
     * to lose permission to the function.
     * </p>
     * <p>
     * You need permission for the <code>lambda:RemovePermission</code>
     * action.
     * </p>
     *
     * @param removePermissionRequest Container for the necessary parameters
     *           to execute the RemovePermission operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         RemovePermission service method, as returned by AWSLambda.
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
    public Future<Void> removePermissionAsync(final RemovePermissionRequest removePermissionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                removePermission(removePermissionRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * You can remove individual permissions from an resource policy
     * associated with a Lambda function by providing a statement ID that you
     * provided when you added the permission.
     * </p>
     * <p>
     * If you are using versioning, the permissions you remove are specific
     * to the Lambda function version or alias you specify in the
     * <code>AddPermission</code> request via the <code>Qualifier</code>
     * parameter. For more information about versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * Note that removal of a permission will cause an active event source
     * to lose permission to the function.
     * </p>
     * <p>
     * You need permission for the <code>lambda:RemovePermission</code>
     * action.
     * </p>
     *
     * @param removePermissionRequest Container for the necessary parameters
     *           to execute the RemovePermission operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RemovePermission service method, as returned by AWSLambda.
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
    public Future<Void> removePermissionAsync(
            final RemovePermissionRequest removePermissionRequest,
            final AsyncHandler<RemovePermissionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                removePermission(removePermissionRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(removePermissionRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Creates a new Lambda function. The function metadata is created from
     * the request parameters, and the code for the function is provided by a
     * .zip file in the request body. If the function name already exists,
     * the operation will fail. Note that the function name is
     * case-sensitive.
     * </p>
     * <p>
     * If you are using versioning, you can also publish a version of the
     * Lambda function you are creating using the <code>Publish</code>
     * parameter. For more information about versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:CreateFunction</code> action.
     * </p>
     *
     * @param createFunctionRequest Container for the necessary parameters to
     *           execute the CreateFunction operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         CreateFunction service method, as returned by AWSLambda.
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
    public Future<CreateFunctionResult> createFunctionAsync(final CreateFunctionRequest createFunctionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateFunctionResult>() {
            public CreateFunctionResult call() throws Exception {
                return createFunction(createFunctionRequest);
        }
    });
    }

    /**
     * <p>
     * Creates a new Lambda function. The function metadata is created from
     * the request parameters, and the code for the function is provided by a
     * .zip file in the request body. If the function name already exists,
     * the operation will fail. Note that the function name is
     * case-sensitive.
     * </p>
     * <p>
     * If you are using versioning, you can also publish a version of the
     * Lambda function you are creating using the <code>Publish</code>
     * parameter. For more information about versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:CreateFunction</code> action.
     * </p>
     *
     * @param createFunctionRequest Container for the necessary parameters to
     *           execute the CreateFunction operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateFunction service method, as returned by AWSLambda.
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
    public Future<CreateFunctionResult> createFunctionAsync(
            final CreateFunctionRequest createFunctionRequest,
            final AsyncHandler<CreateFunctionRequest, CreateFunctionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateFunctionResult>() {
            public CreateFunctionResult call() throws Exception {
              CreateFunctionResult result;
                try {
                result = createFunction(createFunctionRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createFunctionRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * You can update an event source mapping. This is useful if you want to
     * change the parameters of the existing mapping without losing your
     * position in the stream. You can change which function will receive the
     * stream records, but to change the stream itself, you must create a new
     * mapping.
     * </p>
     * <p>
     * If you are using the versioning feature, you can update the event
     * source mapping to map to a specific Lambda function version or alias
     * as described in the <code>FunctionName</code> parameter. For
     * information about the versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * If you disable the event source mapping, AWS Lambda stops polling. If
     * you enable again, it will resume polling from the time it had stopped
     * polling, so you don't lose processing of any records. However, if you
     * delete event source mapping and create it again, it will reset.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:UpdateEventSourceMapping</code> action.
     * </p>
     *
     * @param updateEventSourceMappingRequest Container for the necessary
     *           parameters to execute the UpdateEventSourceMapping operation on
     *           AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateEventSourceMapping service method, as returned by AWSLambda.
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
    public Future<UpdateEventSourceMappingResult> updateEventSourceMappingAsync(final UpdateEventSourceMappingRequest updateEventSourceMappingRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateEventSourceMappingResult>() {
            public UpdateEventSourceMappingResult call() throws Exception {
                return updateEventSourceMapping(updateEventSourceMappingRequest);
        }
    });
    }

    /**
     * <p>
     * You can update an event source mapping. This is useful if you want to
     * change the parameters of the existing mapping without losing your
     * position in the stream. You can change which function will receive the
     * stream records, but to change the stream itself, you must create a new
     * mapping.
     * </p>
     * <p>
     * If you are using the versioning feature, you can update the event
     * source mapping to map to a specific Lambda function version or alias
     * as described in the <code>FunctionName</code> parameter. For
     * information about the versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * If you disable the event source mapping, AWS Lambda stops polling. If
     * you enable again, it will resume polling from the time it had stopped
     * polling, so you don't lose processing of any records. However, if you
     * delete event source mapping and create it again, it will reset.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:UpdateEventSourceMapping</code> action.
     * </p>
     *
     * @param updateEventSourceMappingRequest Container for the necessary
     *           parameters to execute the UpdateEventSourceMapping operation on
     *           AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateEventSourceMapping service method, as returned by AWSLambda.
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
    public Future<UpdateEventSourceMappingResult> updateEventSourceMappingAsync(
            final UpdateEventSourceMappingRequest updateEventSourceMappingRequest,
            final AsyncHandler<UpdateEventSourceMappingRequest, UpdateEventSourceMappingResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateEventSourceMappingResult>() {
            public UpdateEventSourceMappingResult call() throws Exception {
              UpdateEventSourceMappingResult result;
                try {
                result = updateEventSourceMapping(updateEventSourceMappingRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateEventSourceMappingRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Publishes a version of your function from the current snapshot of
     * $LATEST. That is, AWS Lambda takes a snapshot of the function code and
     * configuration information from $LATEST and publishes a new version.
     * The code and configuration cannot be modified after publication. For
     * information about the versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     *
     * @param publishVersionRequest Container for the necessary parameters to
     *           execute the PublishVersion operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         PublishVersion service method, as returned by AWSLambda.
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
    public Future<PublishVersionResult> publishVersionAsync(final PublishVersionRequest publishVersionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PublishVersionResult>() {
            public PublishVersionResult call() throws Exception {
                return publishVersion(publishVersionRequest);
        }
    });
    }

    /**
     * <p>
     * Publishes a version of your function from the current snapshot of
     * $LATEST. That is, AWS Lambda takes a snapshot of the function code and
     * configuration information from $LATEST and publishes a new version.
     * The code and configuration cannot be modified after publication. For
     * information about the versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     *
     * @param publishVersionRequest Container for the necessary parameters to
     *           execute the PublishVersion operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PublishVersion service method, as returned by AWSLambda.
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
    public Future<PublishVersionResult> publishVersionAsync(
            final PublishVersionRequest publishVersionRequest,
            final AsyncHandler<PublishVersionRequest, PublishVersionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PublishVersionResult>() {
            public PublishVersionResult call() throws Exception {
              PublishVersionResult result;
                try {
                result = publishVersion(publishVersionRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(publishVersionRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * <b>IMPORTANT:</b>This API is deprecated. We recommend you use Invoke
     * API (see Invoke).
     * </p>
     * <p>
     * Submits an invocation request to AWS Lambda. Upon receiving the
     * request, Lambda executes the specified function asynchronously. To see
     * the logs generated by the Lambda function execution, see the
     * CloudWatch Logs console.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:InvokeFunction</code> action.
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
    @Deprecated
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
     * <b>IMPORTANT:</b>This API is deprecated. We recommend you use Invoke
     * API (see Invoke).
     * </p>
     * <p>
     * Submits an invocation request to AWS Lambda. Upon receiving the
     * request, Lambda executes the specified function asynchronously. To see
     * the logs generated by the Lambda function execution, see the
     * CloudWatch Logs console.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:InvokeFunction</code> action.
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
     * Updates the configuration parameters for the specified Lambda
     * function by using the values provided in the request. You provide only
     * the parameters you want to change. This operation must only be used on
     * an existing Lambda function and cannot be used to update the
     * function's code.
     * </p>
     * <p>
     * If you are using the versioning feature, note this API will always
     * update the $LATEST version of your Lambda function. For information
     * about the versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
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
     * If you are using the versioning feature, note this API will always
     * update the $LATEST version of your Lambda function. For information
     * about the versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
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
     * Invokes a specific Lambda function.
     * </p>
     * <p>
     * If you are using the versioning feature, you can invoke the specific
     * function version by providing function version or alias name that is
     * pointing to the function version using the <code>Qualifier</code>
     * parameter in the request. If you don't provide the
     * <code>Qualifier</code> parameter, the <code>$LATEST</code> version of
     * the Lambda function is invoked. For information about the versioning
     * feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:InvokeFunction</code> action.
     * </p>
     *
     * @param invokeRequest Container for the necessary parameters to execute
     *           the Invoke operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the Invoke
     *         service method, as returned by AWSLambda.
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
    public Future<InvokeResult> invokeAsync(final InvokeRequest invokeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<InvokeResult>() {
            public InvokeResult call() throws Exception {
                return invoke(invokeRequest);
        }
    });
    }

    /**
     * <p>
     * Invokes a specific Lambda function.
     * </p>
     * <p>
     * If you are using the versioning feature, you can invoke the specific
     * function version by providing function version or alias name that is
     * pointing to the function version using the <code>Qualifier</code>
     * parameter in the request. If you don't provide the
     * <code>Qualifier</code> parameter, the <code>$LATEST</code> version of
     * the Lambda function is invoked. For information about the versioning
     * feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:InvokeFunction</code> action.
     * </p>
     *
     * @param invokeRequest Container for the necessary parameters to execute
     *           the Invoke operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the Invoke
     *         service method, as returned by AWSLambda.
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
    public Future<InvokeResult> invokeAsync(
            final InvokeRequest invokeRequest,
            final AsyncHandler<InvokeRequest, InvokeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<InvokeResult>() {
            public InvokeResult call() throws Exception {
              InvokeResult result;
                try {
                result = invoke(invokeRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(invokeRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Returns the resource policy associated with the specified Lambda
     * function.
     * </p>
     * <p>
     * If you are using the versioning feature, you can get the resource
     * policy associated with the specific Lambda function version or alias
     * by specifying the version or alias name using the
     * <code>Qualifier</code> parameter. For more information about
     * versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * For information about adding permissions, see AddPermission.
     * </p>
     * <p>
     * You need permission for the <code>lambda:GetPolicy action.</code>
     * </p>
     *
     * @param getPolicyRequest Container for the necessary parameters to
     *           execute the GetPolicy operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         GetPolicy service method, as returned by AWSLambda.
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
    public Future<GetPolicyResult> getPolicyAsync(final GetPolicyRequest getPolicyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetPolicyResult>() {
            public GetPolicyResult call() throws Exception {
                return getPolicy(getPolicyRequest);
        }
    });
    }

    /**
     * <p>
     * Returns the resource policy associated with the specified Lambda
     * function.
     * </p>
     * <p>
     * If you are using the versioning feature, you can get the resource
     * policy associated with the specific Lambda function version or alias
     * by specifying the version or alias name using the
     * <code>Qualifier</code> parameter. For more information about
     * versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * For information about adding permissions, see AddPermission.
     * </p>
     * <p>
     * You need permission for the <code>lambda:GetPolicy action.</code>
     * </p>
     *
     * @param getPolicyRequest Container for the necessary parameters to
     *           execute the GetPolicy operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetPolicy service method, as returned by AWSLambda.
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
    public Future<GetPolicyResult> getPolicyAsync(
            final GetPolicyRequest getPolicyRequest,
            final AsyncHandler<GetPolicyRequest, GetPolicyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetPolicyResult>() {
            public GetPolicyResult call() throws Exception {
              GetPolicyResult result;
                try {
                result = getPolicy(getPolicyRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getPolicyRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Returns configuration information for the specified event source
     * mapping (see CreateEventSourceMapping).
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:GetEventSourceMapping</code> action.
     * </p>
     *
     * @param getEventSourceMappingRequest Container for the necessary
     *           parameters to execute the GetEventSourceMapping operation on
     *           AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         GetEventSourceMapping service method, as returned by AWSLambda.
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
    public Future<GetEventSourceMappingResult> getEventSourceMappingAsync(final GetEventSourceMappingRequest getEventSourceMappingRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetEventSourceMappingResult>() {
            public GetEventSourceMappingResult call() throws Exception {
                return getEventSourceMapping(getEventSourceMappingRequest);
        }
    });
    }

    /**
     * <p>
     * Returns configuration information for the specified event source
     * mapping (see CreateEventSourceMapping).
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:GetEventSourceMapping</code> action.
     * </p>
     *
     * @param getEventSourceMappingRequest Container for the necessary
     *           parameters to execute the GetEventSourceMapping operation on
     *           AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetEventSourceMapping service method, as returned by AWSLambda.
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
    public Future<GetEventSourceMappingResult> getEventSourceMappingAsync(
            final GetEventSourceMappingRequest getEventSourceMappingRequest,
            final AsyncHandler<GetEventSourceMappingRequest, GetEventSourceMappingResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetEventSourceMappingResult>() {
            public GetEventSourceMappingResult call() throws Exception {
              GetEventSourceMappingResult result;
                try {
                result = getEventSourceMapping(getEventSourceMappingRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getEventSourceMappingRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Returns a list of event source mappings you created using the
     * <code>CreateEventSourceMapping</code> (see CreateEventSourceMapping).
     * </p>
     * <p>
     * For each mapping, the API returns configuration information. You can
     * optionally specify filters to retrieve specific event source mappings.
     * </p>
     * <p>
     * If you are using the versioning feature, you can get list of event
     * source mappings for a specific Lambda function version or an alias as
     * described in the <code>FunctionName</code> parameter. For information
     * about the versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:ListEventSourceMappings</code> action.
     * </p>
     *
     * @param listEventSourceMappingsRequest Container for the necessary
     *           parameters to execute the ListEventSourceMappings operation on
     *           AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         ListEventSourceMappings service method, as returned by AWSLambda.
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
    public Future<ListEventSourceMappingsResult> listEventSourceMappingsAsync(final ListEventSourceMappingsRequest listEventSourceMappingsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListEventSourceMappingsResult>() {
            public ListEventSourceMappingsResult call() throws Exception {
                return listEventSourceMappings(listEventSourceMappingsRequest);
        }
    });
    }

    /**
     * <p>
     * Returns a list of event source mappings you created using the
     * <code>CreateEventSourceMapping</code> (see CreateEventSourceMapping).
     * </p>
     * <p>
     * For each mapping, the API returns configuration information. You can
     * optionally specify filters to retrieve specific event source mappings.
     * </p>
     * <p>
     * If you are using the versioning feature, you can get list of event
     * source mappings for a specific Lambda function version or an alias as
     * described in the <code>FunctionName</code> parameter. For information
     * about the versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:ListEventSourceMappings</code> action.
     * </p>
     *
     * @param listEventSourceMappingsRequest Container for the necessary
     *           parameters to execute the ListEventSourceMappings operation on
     *           AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListEventSourceMappings service method, as returned by AWSLambda.
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
    public Future<ListEventSourceMappingsResult> listEventSourceMappingsAsync(
            final ListEventSourceMappingsRequest listEventSourceMappingsRequest,
            final AsyncHandler<ListEventSourceMappingsRequest, ListEventSourceMappingsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListEventSourceMappingsResult>() {
            public ListEventSourceMappingsResult call() throws Exception {
              ListEventSourceMappingsResult result;
                try {
                result = listEventSourceMappings(listEventSourceMappingsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listEventSourceMappingsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes the specified Lambda function alias. For more information,
     * see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"> Introduction to AWS Lambda Aliases </a>
     * .
     * </p>
     * <p>
     * This requires permission for the lambda:DeleteAlias action.
     * </p>
     *
     * @param deleteAliasRequest Container for the necessary parameters to
     *           execute the DeleteAlias operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteAlias service method, as returned by AWSLambda.
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
    public Future<Void> deleteAliasAsync(final DeleteAliasRequest deleteAliasRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteAlias(deleteAliasRequest);
                return null;
        }
    });
    }

    /**
     * <p>
     * Deletes the specified Lambda function alias. For more information,
     * see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"> Introduction to AWS Lambda Aliases </a>
     * .
     * </p>
     * <p>
     * This requires permission for the lambda:DeleteAlias action.
     * </p>
     *
     * @param deleteAliasRequest Container for the necessary parameters to
     *           execute the DeleteAlias operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteAlias service method, as returned by AWSLambda.
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
    public Future<Void> deleteAliasAsync(
            final DeleteAliasRequest deleteAliasRequest,
            final AsyncHandler<DeleteAliasRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteAlias(deleteAliasRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteAliasRequest, null);
                 return null;
        }
    });
    }
    
    /**
     * <p>
     * Returns the configuration information of the Lambda function. This
     * the same information you provided as parameters when uploading the
     * function by using CreateFunction.
     * </p>
     * <p>
     * If you are using the versioning feature, you can retrieve this
     * information for a specific function version by using the optional
     * <code>Qualifier</code> parameter and specifying the function version
     * or alias that points to it. If you don't provide it, the API returns
     * information about the $LATEST version of the function. For more
     * information about versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
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
     * function by using CreateFunction.
     * </p>
     * <p>
     * If you are using the versioning feature, you can retrieve this
     * information for a specific function version by using the optional
     * <code>Qualifier</code> parameter and specifying the function version
     * or alias that points to it. If you don't provide it, the API returns
     * information about the $LATEST version of the function. For more
     * information about versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
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
     * Removes an event source mapping. This means AWS Lambda will no longer
     * invoke the function for events in the associated source.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:DeleteEventSourceMapping</code> action.
     * </p>
     *
     * @param deleteEventSourceMappingRequest Container for the necessary
     *           parameters to execute the DeleteEventSourceMapping operation on
     *           AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteEventSourceMapping service method, as returned by AWSLambda.
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
    public Future<DeleteEventSourceMappingResult> deleteEventSourceMappingAsync(final DeleteEventSourceMappingRequest deleteEventSourceMappingRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteEventSourceMappingResult>() {
            public DeleteEventSourceMappingResult call() throws Exception {
                return deleteEventSourceMapping(deleteEventSourceMappingRequest);
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
     * <code>lambda:DeleteEventSourceMapping</code> action.
     * </p>
     *
     * @param deleteEventSourceMappingRequest Container for the necessary
     *           parameters to execute the DeleteEventSourceMapping operation on
     *           AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteEventSourceMapping service method, as returned by AWSLambda.
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
    public Future<DeleteEventSourceMappingResult> deleteEventSourceMappingAsync(
            final DeleteEventSourceMappingRequest deleteEventSourceMappingRequest,
            final AsyncHandler<DeleteEventSourceMappingRequest, DeleteEventSourceMappingResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteEventSourceMappingResult>() {
            public DeleteEventSourceMappingResult call() throws Exception {
              DeleteEventSourceMappingResult result;
                try {
                result = deleteEventSourceMapping(deleteEventSourceMappingRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteEventSourceMappingRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Identifies a stream as an event source for a Lambda function. It can
     * be either an Amazon Kinesis stream or an Amazon DynamoDB stream. AWS
     * Lambda invokes the specified function when records are posted to the
     * stream.
     * </p>
     * <p>
     * This association between a stream source and a Lambda function is
     * called the event source mapping.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>This event source mapping is relevant only in the
     * AWS Lambda pull model, where AWS Lambda invokes the function. For more
     * information, go to AWS Lambda: How it Works in the AWS Lambda
     * Developer Guide.
     * </p>
     * <p>
     * You provide mapping information (for example, which stream to read
     * from and which Lambda function to invoke) in the request body.
     * </p>
     * <p>
     * Each event source, such as an Amazon Kinesis or a DynamoDB stream,
     * can be associated with multiple AWS Lambda function. A given Lambda
     * function can be associated with multiple AWS event sources.
     * </p>
     * <p>
     * <p>
     * If you are using versioning, you can specify a specific function
     * version or an alias via the function name parameter. For more
     * information about versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * 
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:CreateEventSourceMapping</code> action.
     * </p>
     *
     * @param createEventSourceMappingRequest Container for the necessary
     *           parameters to execute the CreateEventSourceMapping operation on
     *           AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         CreateEventSourceMapping service method, as returned by AWSLambda.
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
    public Future<CreateEventSourceMappingResult> createEventSourceMappingAsync(final CreateEventSourceMappingRequest createEventSourceMappingRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateEventSourceMappingResult>() {
            public CreateEventSourceMappingResult call() throws Exception {
                return createEventSourceMapping(createEventSourceMappingRequest);
        }
    });
    }

    /**
     * <p>
     * Identifies a stream as an event source for a Lambda function. It can
     * be either an Amazon Kinesis stream or an Amazon DynamoDB stream. AWS
     * Lambda invokes the specified function when records are posted to the
     * stream.
     * </p>
     * <p>
     * This association between a stream source and a Lambda function is
     * called the event source mapping.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>This event source mapping is relevant only in the
     * AWS Lambda pull model, where AWS Lambda invokes the function. For more
     * information, go to AWS Lambda: How it Works in the AWS Lambda
     * Developer Guide.
     * </p>
     * <p>
     * You provide mapping information (for example, which stream to read
     * from and which Lambda function to invoke) in the request body.
     * </p>
     * <p>
     * Each event source, such as an Amazon Kinesis or a DynamoDB stream,
     * can be associated with multiple AWS Lambda function. A given Lambda
     * function can be associated with multiple AWS event sources.
     * </p>
     * <p>
     * <p>
     * If you are using versioning, you can specify a specific function
     * version or an alias via the function name parameter. For more
     * information about versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * 
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:CreateEventSourceMapping</code> action.
     * </p>
     *
     * @param createEventSourceMappingRequest Container for the necessary
     *           parameters to execute the CreateEventSourceMapping operation on
     *           AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateEventSourceMapping service method, as returned by AWSLambda.
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
    public Future<CreateEventSourceMappingResult> createEventSourceMappingAsync(
            final CreateEventSourceMappingRequest createEventSourceMappingRequest,
            final AsyncHandler<CreateEventSourceMappingRequest, CreateEventSourceMappingResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateEventSourceMappingResult>() {
            public CreateEventSourceMappingResult call() throws Exception {
              CreateEventSourceMappingResult result;
                try {
                result = createEventSourceMapping(createEventSourceMappingRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createEventSourceMappingRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Updates the code for the specified Lambda function. This operation
     * must only be used on an existing Lambda function and cannot be used to
     * update the function configuration.
     * </p>
     * <p>
     * If you are using the versioning feature, note this API will always
     * update the $LATEST version of your Lambda function. For information
     * about the versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:UpdateFunctionCode</code> action.
     * </p>
     *
     * @param updateFunctionCodeRequest Container for the necessary
     *           parameters to execute the UpdateFunctionCode operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateFunctionCode service method, as returned by AWSLambda.
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
    public Future<UpdateFunctionCodeResult> updateFunctionCodeAsync(final UpdateFunctionCodeRequest updateFunctionCodeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateFunctionCodeResult>() {
            public UpdateFunctionCodeResult call() throws Exception {
                return updateFunctionCode(updateFunctionCodeRequest);
        }
    });
    }

    /**
     * <p>
     * Updates the code for the specified Lambda function. This operation
     * must only be used on an existing Lambda function and cannot be used to
     * update the function configuration.
     * </p>
     * <p>
     * If you are using the versioning feature, note this API will always
     * update the $LATEST version of your Lambda function. For information
     * about the versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:UpdateFunctionCode</code> action.
     * </p>
     *
     * @param updateFunctionCodeRequest Container for the necessary
     *           parameters to execute the UpdateFunctionCode operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateFunctionCode service method, as returned by AWSLambda.
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
    public Future<UpdateFunctionCodeResult> updateFunctionCodeAsync(
            final UpdateFunctionCodeRequest updateFunctionCodeRequest,
            final AsyncHandler<UpdateFunctionCodeRequest, UpdateFunctionCodeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateFunctionCodeResult>() {
            public UpdateFunctionCodeResult call() throws Exception {
              UpdateFunctionCodeResult result;
                try {
                result = updateFunctionCode(updateFunctionCodeRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateFunctionCodeRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Returns list of aliases created for a Lambda function. For each
     * alias, the response includes information such as the alias ARN,
     * description, alias name, and the function version to which it points.
     * For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"> Introduction to AWS Lambda Aliases </a>
     * .
     * </p>
     * <p>
     * This requires permission for the lambda:ListAliases action.
     * </p>
     *
     * @param listAliasesRequest Container for the necessary parameters to
     *           execute the ListAliases operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         ListAliases service method, as returned by AWSLambda.
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
    public Future<ListAliasesResult> listAliasesAsync(final ListAliasesRequest listAliasesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListAliasesResult>() {
            public ListAliasesResult call() throws Exception {
                return listAliases(listAliasesRequest);
        }
    });
    }

    /**
     * <p>
     * Returns list of aliases created for a Lambda function. For each
     * alias, the response includes information such as the alias ARN,
     * description, alias name, and the function version to which it points.
     * For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"> Introduction to AWS Lambda Aliases </a>
     * .
     * </p>
     * <p>
     * This requires permission for the lambda:ListAliases action.
     * </p>
     *
     * @param listAliasesRequest Container for the necessary parameters to
     *           execute the ListAliases operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListAliases service method, as returned by AWSLambda.
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
    public Future<ListAliasesResult> listAliasesAsync(
            final ListAliasesRequest listAliasesRequest,
            final AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListAliasesResult>() {
            public ListAliasesResult call() throws Exception {
              ListAliasesResult result;
                try {
                result = listAliases(listAliasesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listAliasesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * List all versions of a function. For information about the versioning
     * feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     *
     * @param listVersionsByFunctionRequest Container for the necessary
     *           parameters to execute the ListVersionsByFunction operation on
     *           AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         ListVersionsByFunction service method, as returned by AWSLambda.
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
    public Future<ListVersionsByFunctionResult> listVersionsByFunctionAsync(final ListVersionsByFunctionRequest listVersionsByFunctionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListVersionsByFunctionResult>() {
            public ListVersionsByFunctionResult call() throws Exception {
                return listVersionsByFunction(listVersionsByFunctionRequest);
        }
    });
    }

    /**
     * <p>
     * List all versions of a function. For information about the versioning
     * feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     *
     * @param listVersionsByFunctionRequest Container for the necessary
     *           parameters to execute the ListVersionsByFunction operation on
     *           AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListVersionsByFunction service method, as returned by AWSLambda.
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
    public Future<ListVersionsByFunctionResult> listVersionsByFunctionAsync(
            final ListVersionsByFunctionRequest listVersionsByFunctionRequest,
            final AsyncHandler<ListVersionsByFunctionRequest, ListVersionsByFunctionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListVersionsByFunctionResult>() {
            public ListVersionsByFunctionResult call() throws Exception {
              ListVersionsByFunctionResult result;
                try {
                result = listVersionsByFunction(listVersionsByFunctionRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listVersionsByFunctionRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Returns the configuration information of the Lambda function and a
     * presigned URL link to the .zip file you uploaded with CreateFunction
     * so you can download the .zip file. Note that the URL is valid for up
     * to 10 minutes. The configuration information is the same information
     * you provided as parameters when uploading the function.
     * </p>
     * <p>
     * Using the optional <code>Qualifier</code> parameter, you can specify
     * a specific function version for which you want this information. If
     * you don't specify this parameter, the API uses unqualified function
     * ARN which return information about the <code>$LATEST</code> version of
     * the Lambda function. For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
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
     * presigned URL link to the .zip file you uploaded with CreateFunction
     * so you can download the .zip file. Note that the URL is valid for up
     * to 10 minutes. The configuration information is the same information
     * you provided as parameters when uploading the function.
     * </p>
     * <p>
     * Using the optional <code>Qualifier</code> parameter, you can specify
     * a specific function version for which you want this information. If
     * you don't specify this parameter, the API uses unqualified function
     * ARN which return information about the <code>$LATEST</code> version of
     * the Lambda function. For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
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
     * Creates an alias that points to the specified Lambda function
     * version. For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"> Introduction to AWS Lambda Aliases </a>
     * .
     * </p>
     * <p>
     * Alias names are unique for a given function.
     * </p>
     * <p>
     * This requires permission for the lambda:CreateAlias action.
     * </p>
     *
     * @param createAliasRequest Container for the necessary parameters to
     *           execute the CreateAlias operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         CreateAlias service method, as returned by AWSLambda.
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
    public Future<CreateAliasResult> createAliasAsync(final CreateAliasRequest createAliasRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateAliasResult>() {
            public CreateAliasResult call() throws Exception {
                return createAlias(createAliasRequest);
        }
    });
    }

    /**
     * <p>
     * Creates an alias that points to the specified Lambda function
     * version. For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"> Introduction to AWS Lambda Aliases </a>
     * .
     * </p>
     * <p>
     * Alias names are unique for a given function.
     * </p>
     * <p>
     * This requires permission for the lambda:CreateAlias action.
     * </p>
     *
     * @param createAliasRequest Container for the necessary parameters to
     *           execute the CreateAlias operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateAlias service method, as returned by AWSLambda.
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
    public Future<CreateAliasResult> createAliasAsync(
            final CreateAliasRequest createAliasRequest,
            final AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateAliasResult>() {
            public CreateAliasResult call() throws Exception {
              CreateAliasResult result;
                try {
                result = createAlias(createAliasRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createAliasRequest, result);
                 return result;
        }
    });
    }
    
}
        