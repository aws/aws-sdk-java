/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda;

import com.amazonaws.services.lambda.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Client for accessing AWS Lambda asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Lambda</fullname>
 * <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This is the <i>AWS Lambda API Reference</i>. The AWS Lambda Developer Guide provides additional information. For the
 * service overview, go to <a href="http://docs.aws.amazon.com/lambda/latest/dg/welcome.html">What is AWS Lambda</a>,
 * and for information about how the service works, go to <a
 * href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS Lambda: How it Works</a> in the
 * <i>AWS Lambda Developer Guide</i>.
 * </p>
 */
@ThreadSafe
public class AWSLambdaAsyncClient extends AWSLambdaClient implements AWSLambdaAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Lambda. A credentials provider chain will
     * be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSLambdaAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Lambda. A credentials provider chain will
     * be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Lambda (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSLambdaAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Lambda using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSLambdaAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Lambda using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSLambdaAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Lambda using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSLambdaAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Lambda using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSLambdaAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Lambda using the provided AWS account
     * credentials provider and client configuration options.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSLambdaAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Lambda using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSLambdaAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Lambda using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSLambdaAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Lambda using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSLambdaAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public java.util.concurrent.ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(AddPermissionRequest request) {

        return addPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(final AddPermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddPermissionRequest, AddPermissionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AddPermissionResult>() {
            @Override
            public AddPermissionResult call() throws Exception {
                AddPermissionResult result;

                try {
                    result = addPermission(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest request) {

        return createAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAliasResult> createAliasAsync(final CreateAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateAliasResult>() {
            @Override
            public CreateAliasResult call() throws Exception {
                CreateAliasResult result;

                try {
                    result = createAlias(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateEventSourceMappingResult> createEventSourceMappingAsync(CreateEventSourceMappingRequest request) {

        return createEventSourceMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEventSourceMappingResult> createEventSourceMappingAsync(final CreateEventSourceMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEventSourceMappingRequest, CreateEventSourceMappingResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateEventSourceMappingResult>() {
            @Override
            public CreateEventSourceMappingResult call() throws Exception {
                CreateEventSourceMappingResult result;

                try {
                    result = createEventSourceMapping(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateFunctionResult> createFunctionAsync(CreateFunctionRequest request) {

        return createFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFunctionResult> createFunctionAsync(final CreateFunctionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFunctionRequest, CreateFunctionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateFunctionResult>() {
            @Override
            public CreateFunctionResult call() throws Exception {
                CreateFunctionResult result;

                try {
                    result = createFunction(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest request) {

        return deleteAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(final DeleteAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAliasRequest, DeleteAliasResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteAliasResult>() {
            @Override
            public DeleteAliasResult call() throws Exception {
                DeleteAliasResult result;

                try {
                    result = deleteAlias(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteEventSourceMappingResult> deleteEventSourceMappingAsync(DeleteEventSourceMappingRequest request) {

        return deleteEventSourceMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEventSourceMappingResult> deleteEventSourceMappingAsync(final DeleteEventSourceMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEventSourceMappingRequest, DeleteEventSourceMappingResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteEventSourceMappingResult>() {
            @Override
            public DeleteEventSourceMappingResult call() throws Exception {
                DeleteEventSourceMappingResult result;

                try {
                    result = deleteEventSourceMapping(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteFunctionResult> deleteFunctionAsync(DeleteFunctionRequest request) {

        return deleteFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFunctionResult> deleteFunctionAsync(final DeleteFunctionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFunctionRequest, DeleteFunctionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteFunctionResult>() {
            @Override
            public DeleteFunctionResult call() throws Exception {
                DeleteFunctionResult result;

                try {
                    result = deleteFunction(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAliasResult> getAliasAsync(GetAliasRequest request) {

        return getAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAliasResult> getAliasAsync(final GetAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAliasRequest, GetAliasResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetAliasResult>() {
            @Override
            public GetAliasResult call() throws Exception {
                GetAliasResult result;

                try {
                    result = getAlias(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetEventSourceMappingResult> getEventSourceMappingAsync(GetEventSourceMappingRequest request) {

        return getEventSourceMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEventSourceMappingResult> getEventSourceMappingAsync(final GetEventSourceMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEventSourceMappingRequest, GetEventSourceMappingResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetEventSourceMappingResult>() {
            @Override
            public GetEventSourceMappingResult call() throws Exception {
                GetEventSourceMappingResult result;

                try {
                    result = getEventSourceMapping(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFunctionResult> getFunctionAsync(GetFunctionRequest request) {

        return getFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFunctionResult> getFunctionAsync(final GetFunctionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFunctionRequest, GetFunctionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetFunctionResult>() {
            @Override
            public GetFunctionResult call() throws Exception {
                GetFunctionResult result;

                try {
                    result = getFunction(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFunctionConfigurationResult> getFunctionConfigurationAsync(GetFunctionConfigurationRequest request) {

        return getFunctionConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFunctionConfigurationResult> getFunctionConfigurationAsync(final GetFunctionConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFunctionConfigurationRequest, GetFunctionConfigurationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetFunctionConfigurationResult>() {
            @Override
            public GetFunctionConfigurationResult call() throws Exception {
                GetFunctionConfigurationResult result;

                try {
                    result = getFunctionConfiguration(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest request) {

        return getPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(final GetPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPolicyRequest, GetPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetPolicyResult>() {
            @Override
            public GetPolicyResult call() throws Exception {
                GetPolicyResult result;

                try {
                    result = getPolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<InvokeResult> invokeAsync(InvokeRequest request) {

        return invokeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InvokeResult> invokeAsync(final InvokeRequest request,
            final com.amazonaws.handlers.AsyncHandler<InvokeRequest, InvokeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<InvokeResult>() {
            @Override
            public InvokeResult call() throws Exception {
                InvokeResult result;

                try {
                    result = invoke(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<InvokeAsyncResult> invokeAsyncAsync(InvokeAsyncRequest request) {

        return invokeAsyncAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<InvokeAsyncResult> invokeAsyncAsync(final InvokeAsyncRequest request,
            final com.amazonaws.handlers.AsyncHandler<InvokeAsyncRequest, InvokeAsyncResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<InvokeAsyncResult>() {
            @Override
            public InvokeAsyncResult call() throws Exception {
                InvokeAsyncResult result;

                try {
                    result = invokeAsync(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest request) {

        return listAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(final ListAliasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListAliasesResult>() {
            @Override
            public ListAliasesResult call() throws Exception {
                ListAliasesResult result;

                try {
                    result = listAliases(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListEventSourceMappingsResult> listEventSourceMappingsAsync(ListEventSourceMappingsRequest request) {

        return listEventSourceMappingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEventSourceMappingsResult> listEventSourceMappingsAsync(final ListEventSourceMappingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEventSourceMappingsRequest, ListEventSourceMappingsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListEventSourceMappingsResult>() {
            @Override
            public ListEventSourceMappingsResult call() throws Exception {
                ListEventSourceMappingsResult result;

                try {
                    result = listEventSourceMappings(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListEventSourceMappings operation.
     *
     * @see #listEventSourceMappingsAsync(ListEventSourceMappingsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListEventSourceMappingsResult> listEventSourceMappingsAsync() {

        return listEventSourceMappingsAsync(new ListEventSourceMappingsRequest());
    }

    /**
     * Simplified method form for invoking the ListEventSourceMappings operation with an AsyncHandler.
     *
     * @see #listEventSourceMappingsAsync(ListEventSourceMappingsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListEventSourceMappingsResult> listEventSourceMappingsAsync(
            com.amazonaws.handlers.AsyncHandler<ListEventSourceMappingsRequest, ListEventSourceMappingsResult> asyncHandler) {

        return listEventSourceMappingsAsync(new ListEventSourceMappingsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListFunctionsResult> listFunctionsAsync(ListFunctionsRequest request) {

        return listFunctionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFunctionsResult> listFunctionsAsync(final ListFunctionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFunctionsRequest, ListFunctionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListFunctionsResult>() {
            @Override
            public ListFunctionsResult call() throws Exception {
                ListFunctionsResult result;

                try {
                    result = listFunctions(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListFunctions operation.
     *
     * @see #listFunctionsAsync(ListFunctionsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListFunctionsResult> listFunctionsAsync() {

        return listFunctionsAsync(new ListFunctionsRequest());
    }

    /**
     * Simplified method form for invoking the ListFunctions operation with an AsyncHandler.
     *
     * @see #listFunctionsAsync(ListFunctionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListFunctionsResult> listFunctionsAsync(
            com.amazonaws.handlers.AsyncHandler<ListFunctionsRequest, ListFunctionsResult> asyncHandler) {

        return listFunctionsAsync(new ListFunctionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListVersionsByFunctionResult> listVersionsByFunctionAsync(ListVersionsByFunctionRequest request) {

        return listVersionsByFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVersionsByFunctionResult> listVersionsByFunctionAsync(final ListVersionsByFunctionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVersionsByFunctionRequest, ListVersionsByFunctionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListVersionsByFunctionResult>() {
            @Override
            public ListVersionsByFunctionResult call() throws Exception {
                ListVersionsByFunctionResult result;

                try {
                    result = listVersionsByFunction(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PublishVersionResult> publishVersionAsync(PublishVersionRequest request) {

        return publishVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PublishVersionResult> publishVersionAsync(final PublishVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<PublishVersionRequest, PublishVersionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PublishVersionResult>() {
            @Override
            public PublishVersionResult call() throws Exception {
                PublishVersionResult result;

                try {
                    result = publishVersion(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(RemovePermissionRequest request) {

        return removePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(final RemovePermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemovePermissionRequest, RemovePermissionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RemovePermissionResult>() {
            @Override
            public RemovePermissionResult call() throws Exception {
                RemovePermissionResult result;

                try {
                    result = removePermission(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest request) {

        return updateAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(final UpdateAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAliasRequest, UpdateAliasResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateAliasResult>() {
            @Override
            public UpdateAliasResult call() throws Exception {
                UpdateAliasResult result;

                try {
                    result = updateAlias(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateEventSourceMappingResult> updateEventSourceMappingAsync(UpdateEventSourceMappingRequest request) {

        return updateEventSourceMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEventSourceMappingResult> updateEventSourceMappingAsync(final UpdateEventSourceMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEventSourceMappingRequest, UpdateEventSourceMappingResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateEventSourceMappingResult>() {
            @Override
            public UpdateEventSourceMappingResult call() throws Exception {
                UpdateEventSourceMappingResult result;

                try {
                    result = updateEventSourceMapping(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFunctionCodeResult> updateFunctionCodeAsync(UpdateFunctionCodeRequest request) {

        return updateFunctionCodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFunctionCodeResult> updateFunctionCodeAsync(final UpdateFunctionCodeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFunctionCodeRequest, UpdateFunctionCodeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateFunctionCodeResult>() {
            @Override
            public UpdateFunctionCodeResult call() throws Exception {
                UpdateFunctionCodeResult result;

                try {
                    result = updateFunctionCode(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFunctionConfigurationResult> updateFunctionConfigurationAsync(UpdateFunctionConfigurationRequest request) {

        return updateFunctionConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFunctionConfigurationResult> updateFunctionConfigurationAsync(final UpdateFunctionConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFunctionConfigurationRequest, UpdateFunctionConfigurationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateFunctionConfigurationResult>() {
            @Override
            public UpdateFunctionConfigurationResult call() throws Exception {
                UpdateFunctionConfigurationResult result;

                try {
                    result = updateFunctionConfiguration(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
