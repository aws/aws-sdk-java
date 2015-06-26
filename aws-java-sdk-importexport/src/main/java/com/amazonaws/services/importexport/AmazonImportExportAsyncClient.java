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
package com.amazonaws.services.importexport;

import com.amazonaws.services.importexport.model.*;

/**
 * Interface for accessing AWS Import/Export asynchronously. Each asynchronous
 * method will return a Java Future object representing the asynchronous
 * operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Import/Export Service</fullname> AWS Import/Export accelerates
 * transferring large amounts of data between the AWS cloud and portable storage
 * devices that you mail to us. AWS Import/Export transfers data directly onto
 * and off of your storage devices using Amazon's high-speed internal network
 * and bypassing the Internet. For large data sets, AWS Import/Export is often
 * faster than Internet transfer and more cost effective than upgrading your
 * connectivity.
 */
public class AmazonImportExportAsyncClient extends AmazonImportExportClient
        implements AmazonImportExportAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Import/Export. A credentials provider chain will be used that searches
     * for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials)
     * shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonImportExportAsyncClient() {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Import/Export. A credentials provider chain will be used that searches
     * for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials)
     * shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * a number of threads equal to the maximum number of concurrent connections
     * configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to AWS Import/Export (ex: proxy settings, retry counts,
     *        etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonImportExportAsyncClient(
            com.amazonaws.ClientConfiguration clientConfiguration) {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain(),
                clientConfiguration, java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Import/Export using the specified AWS account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonImportExportAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Import/Export using the specified AWS account credentials and executor
     * service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonImportExportAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Import/Export using the specified AWS account credentials, executor
     * service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonImportExportAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Import/Export using the specified AWS account credentials provider.
     * Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonImportExportAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Import/Export using the provided AWS account credentials provider and
     * client configuration options.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * a number of threads equal to the maximum number of concurrent connections
     * configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonImportExportAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration,
                java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Import/Export using the specified AWS account credentials provider and
     * executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonImportExportAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Import/Export using the specified AWS account credentials provider,
     * executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonImportExportAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Returns the executor service used by this client to execute async
     * requests.
     *
     * @return The executor service used by this client to execute async
     *         requests.
     */
    public java.util.concurrent.ExecutorService getExecutorService() {
        return executorService;
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by
     * {@code getExecutorService().awaitTermination()} prior to calling this
     * method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }

    @Override
    public java.util.concurrent.Future<CancelJobResult> cancelJobAsync(
            final CancelJobRequest cancelJobRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<CancelJobResult>() {
                    @Override
                    public CancelJobResult call() {
                        return cancelJob(cancelJobRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<CancelJobResult> cancelJobAsync(
            final CancelJobRequest cancelJobRequest,
            final com.amazonaws.handlers.AsyncHandler<CancelJobRequest, CancelJobResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CancelJobResult>() {
                    @Override
                    public CancelJobResult call() throws Exception {
                        CancelJobResult result;
                        try {
                            result = cancelJob(cancelJobRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(cancelJobRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<CreateJobResult> createJobAsync(
            final CreateJobRequest createJobRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateJobResult>() {
                    @Override
                    public CreateJobResult call() {
                        return createJob(createJobRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<CreateJobResult> createJobAsync(
            final CreateJobRequest createJobRequest,
            final com.amazonaws.handlers.AsyncHandler<CreateJobRequest, CreateJobResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateJobResult>() {
                    @Override
                    public CreateJobResult call() throws Exception {
                        CreateJobResult result;
                        try {
                            result = createJob(createJobRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(createJobRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetShippingLabelResult> getShippingLabelAsync(
            final GetShippingLabelRequest getShippingLabelRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetShippingLabelResult>() {
                    @Override
                    public GetShippingLabelResult call() {
                        return getShippingLabel(getShippingLabelRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetShippingLabelResult> getShippingLabelAsync(
            final GetShippingLabelRequest getShippingLabelRequest,
            final com.amazonaws.handlers.AsyncHandler<GetShippingLabelRequest, GetShippingLabelResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetShippingLabelResult>() {
                    @Override
                    public GetShippingLabelResult call() throws Exception {
                        GetShippingLabelResult result;
                        try {
                            result = getShippingLabel(getShippingLabelRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(getShippingLabelRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetStatusResult> getStatusAsync(
            final GetStatusRequest getStatusRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetStatusResult>() {
                    @Override
                    public GetStatusResult call() {
                        return getStatus(getStatusRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetStatusResult> getStatusAsync(
            final GetStatusRequest getStatusRequest,
            final com.amazonaws.handlers.AsyncHandler<GetStatusRequest, GetStatusResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetStatusResult>() {
                    @Override
                    public GetStatusResult call() throws Exception {
                        GetStatusResult result;
                        try {
                            result = getStatus(getStatusRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(getStatusRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(
            final ListJobsRequest listJobsRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListJobsResult>() {
                    @Override
                    public ListJobsResult call() {
                        return listJobs(listJobsRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(
            final ListJobsRequest listJobsRequest,
            final com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListJobsResult>() {
                    @Override
                    public ListJobsResult call() throws Exception {
                        ListJobsResult result;
                        try {
                            result = listJobs(listJobsRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(listJobsRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync() {

        return listJobsAsync(new ListJobsRequest());
    }

    /**
     * Simplified method form for invoking the ListJobs operation with an
     * AsyncHandler.
     *
     * @see #listJobsAsync(ListJobsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(
            com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler) {

        return listJobsAsync(new ListJobsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<UpdateJobResult> updateJobAsync(
            final UpdateJobRequest updateJobRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<UpdateJobResult>() {
                    @Override
                    public UpdateJobResult call() {
                        return updateJob(updateJobRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<UpdateJobResult> updateJobAsync(
            final UpdateJobRequest updateJobRequest,
            final com.amazonaws.handlers.AsyncHandler<UpdateJobRequest, UpdateJobResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<UpdateJobResult>() {
                    @Override
                    public UpdateJobResult call() throws Exception {
                        UpdateJobResult result;
                        try {
                            result = updateJob(updateJobRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(updateJobRequest, result);
                        return result;
                    }
                });
    }
}
