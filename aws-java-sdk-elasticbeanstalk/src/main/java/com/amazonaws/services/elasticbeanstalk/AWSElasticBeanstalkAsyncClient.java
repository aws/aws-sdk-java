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
package com.amazonaws.services.elasticbeanstalk;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Elastic Beanstalk asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Elastic Beanstalk</fullname>
 * <p>
 * AWS Elastic Beanstalk makes it easy for you to create, deploy, and manage scalable, fault-tolerant applications
 * running on the Amazon Web Services cloud.
 * </p>
 * <p>
 * For more information about this product, go to the <a href="http://aws.amazon.com/elasticbeanstalk/">AWS Elastic
 * Beanstalk</a> details page. The location of the latest AWS Elastic Beanstalk WSDL is <a
 * href="http://elasticbeanstalk.s3.amazonaws.com/doc/2010-12-01/AWSElasticBeanstalk.wsdl"
 * >http://elasticbeanstalk.s3.amazonaws.com/doc/2010-12-01/AWSElasticBeanstalk.wsdl</a>. To install the Software
 * Development Kits (SDKs), Integrated Development Environment (IDE) Toolkits, and command line tools that enable you to
 * access the API, go to <a href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a>.
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * For a list of region-specific endpoints that AWS Elastic Beanstalk supports, go to <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region">Regions and Endpoints</a> in
 * the <i>Amazon Web Services Glossary</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSElasticBeanstalkAsyncClient extends AWSElasticBeanstalkClient implements AWSElasticBeanstalkAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Elastic Beanstalk. A credentials provider chain
     * will be used that searches for credentials in this order:
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
     * @deprecated use {@link AWSElasticBeanstalkAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSElasticBeanstalkAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Elastic Beanstalk. A credentials provider chain
     * will be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Elastic Beanstalk (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSElasticBeanstalkAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSElasticBeanstalkAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Elastic Beanstalk using the specified AWS
     * account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSElasticBeanstalkAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSElasticBeanstalkAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Elastic Beanstalk using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSElasticBeanstalkAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSElasticBeanstalkAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSElasticBeanstalkAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Elastic Beanstalk using the specified AWS
     * account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSElasticBeanstalkAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSElasticBeanstalkAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSElasticBeanstalkAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSElasticBeanstalkAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Elastic Beanstalk using the specified AWS
     * account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSElasticBeanstalkAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSElasticBeanstalkAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Elastic Beanstalk using the provided AWS
     * account credentials provider and client configuration options.
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
     * @deprecated use {@link AWSElasticBeanstalkAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSElasticBeanstalkAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSElasticBeanstalkAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Elastic Beanstalk using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSElasticBeanstalkAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSElasticBeanstalkAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSElasticBeanstalkAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Elastic Beanstalk using the specified AWS
     * account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSElasticBeanstalkAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSElasticBeanstalkAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSElasticBeanstalkAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSElasticBeanstalkAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSElasticBeanstalkAsyncClientBuilder asyncBuilder() {
        return AWSElasticBeanstalkAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Elastic Beanstalk using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSElasticBeanstalkAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AbortEnvironmentUpdateResult> abortEnvironmentUpdateAsync(AbortEnvironmentUpdateRequest request) {

        return abortEnvironmentUpdateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AbortEnvironmentUpdateResult> abortEnvironmentUpdateAsync(final AbortEnvironmentUpdateRequest request,
            final com.amazonaws.handlers.AsyncHandler<AbortEnvironmentUpdateRequest, AbortEnvironmentUpdateResult> asyncHandler) {
        final AbortEnvironmentUpdateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AbortEnvironmentUpdateResult>() {
            @Override
            public AbortEnvironmentUpdateResult call() throws Exception {
                AbortEnvironmentUpdateResult result = null;

                try {
                    result = executeAbortEnvironmentUpdate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the AbortEnvironmentUpdate operation.
     *
     * @see #abortEnvironmentUpdateAsync(AbortEnvironmentUpdateRequest)
     */
    @Override
    public java.util.concurrent.Future<AbortEnvironmentUpdateResult> abortEnvironmentUpdateAsync() {

        return abortEnvironmentUpdateAsync(new AbortEnvironmentUpdateRequest());
    }

    /**
     * Simplified method form for invoking the AbortEnvironmentUpdate operation with an AsyncHandler.
     *
     * @see #abortEnvironmentUpdateAsync(AbortEnvironmentUpdateRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<AbortEnvironmentUpdateResult> abortEnvironmentUpdateAsync(
            com.amazonaws.handlers.AsyncHandler<AbortEnvironmentUpdateRequest, AbortEnvironmentUpdateResult> asyncHandler) {

        return abortEnvironmentUpdateAsync(new AbortEnvironmentUpdateRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ApplyEnvironmentManagedActionResult> applyEnvironmentManagedActionAsync(ApplyEnvironmentManagedActionRequest request) {

        return applyEnvironmentManagedActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ApplyEnvironmentManagedActionResult> applyEnvironmentManagedActionAsync(
            final ApplyEnvironmentManagedActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ApplyEnvironmentManagedActionRequest, ApplyEnvironmentManagedActionResult> asyncHandler) {
        final ApplyEnvironmentManagedActionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ApplyEnvironmentManagedActionResult>() {
            @Override
            public ApplyEnvironmentManagedActionResult call() throws Exception {
                ApplyEnvironmentManagedActionResult result = null;

                try {
                    result = executeApplyEnvironmentManagedAction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CheckDNSAvailabilityResult> checkDNSAvailabilityAsync(CheckDNSAvailabilityRequest request) {

        return checkDNSAvailabilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CheckDNSAvailabilityResult> checkDNSAvailabilityAsync(final CheckDNSAvailabilityRequest request,
            final com.amazonaws.handlers.AsyncHandler<CheckDNSAvailabilityRequest, CheckDNSAvailabilityResult> asyncHandler) {
        final CheckDNSAvailabilityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CheckDNSAvailabilityResult>() {
            @Override
            public CheckDNSAvailabilityResult call() throws Exception {
                CheckDNSAvailabilityResult result = null;

                try {
                    result = executeCheckDNSAvailability(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ComposeEnvironmentsResult> composeEnvironmentsAsync(ComposeEnvironmentsRequest request) {

        return composeEnvironmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ComposeEnvironmentsResult> composeEnvironmentsAsync(final ComposeEnvironmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ComposeEnvironmentsRequest, ComposeEnvironmentsResult> asyncHandler) {
        final ComposeEnvironmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ComposeEnvironmentsResult>() {
            @Override
            public ComposeEnvironmentsResult call() throws Exception {
                ComposeEnvironmentsResult result = null;

                try {
                    result = executeComposeEnvironments(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest request) {

        return createApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(final CreateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler) {
        final CreateApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateApplicationResult>() {
            @Override
            public CreateApplicationResult call() throws Exception {
                CreateApplicationResult result = null;

                try {
                    result = executeCreateApplication(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationVersionResult> createApplicationVersionAsync(CreateApplicationVersionRequest request) {

        return createApplicationVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationVersionResult> createApplicationVersionAsync(final CreateApplicationVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApplicationVersionRequest, CreateApplicationVersionResult> asyncHandler) {
        final CreateApplicationVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateApplicationVersionResult>() {
            @Override
            public CreateApplicationVersionResult call() throws Exception {
                CreateApplicationVersionResult result = null;

                try {
                    result = executeCreateApplicationVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationTemplateResult> createConfigurationTemplateAsync(CreateConfigurationTemplateRequest request) {

        return createConfigurationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationTemplateResult> createConfigurationTemplateAsync(final CreateConfigurationTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConfigurationTemplateRequest, CreateConfigurationTemplateResult> asyncHandler) {
        final CreateConfigurationTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConfigurationTemplateResult>() {
            @Override
            public CreateConfigurationTemplateResult call() throws Exception {
                CreateConfigurationTemplateResult result = null;

                try {
                    result = executeCreateConfigurationTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(CreateEnvironmentRequest request) {

        return createEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(final CreateEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEnvironmentRequest, CreateEnvironmentResult> asyncHandler) {
        final CreateEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEnvironmentResult>() {
            @Override
            public CreateEnvironmentResult call() throws Exception {
                CreateEnvironmentResult result = null;

                try {
                    result = executeCreateEnvironment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePlatformVersionResult> createPlatformVersionAsync(CreatePlatformVersionRequest request) {

        return createPlatformVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePlatformVersionResult> createPlatformVersionAsync(final CreatePlatformVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePlatformVersionRequest, CreatePlatformVersionResult> asyncHandler) {
        final CreatePlatformVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePlatformVersionResult>() {
            @Override
            public CreatePlatformVersionResult call() throws Exception {
                CreatePlatformVersionResult result = null;

                try {
                    result = executeCreatePlatformVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateStorageLocationResult> createStorageLocationAsync(CreateStorageLocationRequest request) {

        return createStorageLocationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStorageLocationResult> createStorageLocationAsync(final CreateStorageLocationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStorageLocationRequest, CreateStorageLocationResult> asyncHandler) {
        final CreateStorageLocationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStorageLocationResult>() {
            @Override
            public CreateStorageLocationResult call() throws Exception {
                CreateStorageLocationResult result = null;

                try {
                    result = executeCreateStorageLocation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the CreateStorageLocation operation.
     *
     * @see #createStorageLocationAsync(CreateStorageLocationRequest)
     */
    @Override
    public java.util.concurrent.Future<CreateStorageLocationResult> createStorageLocationAsync() {

        return createStorageLocationAsync(new CreateStorageLocationRequest());
    }

    /**
     * Simplified method form for invoking the CreateStorageLocation operation with an AsyncHandler.
     *
     * @see #createStorageLocationAsync(CreateStorageLocationRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<CreateStorageLocationResult> createStorageLocationAsync(
            com.amazonaws.handlers.AsyncHandler<CreateStorageLocationRequest, CreateStorageLocationResult> asyncHandler) {

        return createStorageLocationAsync(new CreateStorageLocationRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest request) {

        return deleteApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(final DeleteApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler) {
        final DeleteApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationResult>() {
            @Override
            public DeleteApplicationResult call() throws Exception {
                DeleteApplicationResult result = null;

                try {
                    result = executeDeleteApplication(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationVersionResult> deleteApplicationVersionAsync(DeleteApplicationVersionRequest request) {

        return deleteApplicationVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationVersionResult> deleteApplicationVersionAsync(final DeleteApplicationVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationVersionRequest, DeleteApplicationVersionResult> asyncHandler) {
        final DeleteApplicationVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationVersionResult>() {
            @Override
            public DeleteApplicationVersionResult call() throws Exception {
                DeleteApplicationVersionResult result = null;

                try {
                    result = executeDeleteApplicationVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationTemplateResult> deleteConfigurationTemplateAsync(DeleteConfigurationTemplateRequest request) {

        return deleteConfigurationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationTemplateResult> deleteConfigurationTemplateAsync(final DeleteConfigurationTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfigurationTemplateRequest, DeleteConfigurationTemplateResult> asyncHandler) {
        final DeleteConfigurationTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConfigurationTemplateResult>() {
            @Override
            public DeleteConfigurationTemplateResult call() throws Exception {
                DeleteConfigurationTemplateResult result = null;

                try {
                    result = executeDeleteConfigurationTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteEnvironmentConfigurationResult> deleteEnvironmentConfigurationAsync(DeleteEnvironmentConfigurationRequest request) {

        return deleteEnvironmentConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEnvironmentConfigurationResult> deleteEnvironmentConfigurationAsync(
            final DeleteEnvironmentConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentConfigurationRequest, DeleteEnvironmentConfigurationResult> asyncHandler) {
        final DeleteEnvironmentConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEnvironmentConfigurationResult>() {
            @Override
            public DeleteEnvironmentConfigurationResult call() throws Exception {
                DeleteEnvironmentConfigurationResult result = null;

                try {
                    result = executeDeleteEnvironmentConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePlatformVersionResult> deletePlatformVersionAsync(DeletePlatformVersionRequest request) {

        return deletePlatformVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePlatformVersionResult> deletePlatformVersionAsync(final DeletePlatformVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePlatformVersionRequest, DeletePlatformVersionResult> asyncHandler) {
        final DeletePlatformVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePlatformVersionResult>() {
            @Override
            public DeletePlatformVersionResult call() throws Exception {
                DeletePlatformVersionResult result = null;

                try {
                    result = executeDeletePlatformVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(DescribeAccountAttributesRequest request) {

        return describeAccountAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(final DescribeAccountAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAccountAttributesRequest, DescribeAccountAttributesResult> asyncHandler) {
        final DescribeAccountAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAccountAttributesResult>() {
            @Override
            public DescribeAccountAttributesResult call() throws Exception {
                DescribeAccountAttributesResult result = null;

                try {
                    result = executeDescribeAccountAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationVersionsResult> describeApplicationVersionsAsync(DescribeApplicationVersionsRequest request) {

        return describeApplicationVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationVersionsResult> describeApplicationVersionsAsync(final DescribeApplicationVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeApplicationVersionsRequest, DescribeApplicationVersionsResult> asyncHandler) {
        final DescribeApplicationVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeApplicationVersionsResult>() {
            @Override
            public DescribeApplicationVersionsResult call() throws Exception {
                DescribeApplicationVersionsResult result = null;

                try {
                    result = executeDescribeApplicationVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the DescribeApplicationVersions operation.
     *
     * @see #describeApplicationVersionsAsync(DescribeApplicationVersionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeApplicationVersionsResult> describeApplicationVersionsAsync() {

        return describeApplicationVersionsAsync(new DescribeApplicationVersionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeApplicationVersions operation with an AsyncHandler.
     *
     * @see #describeApplicationVersionsAsync(DescribeApplicationVersionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeApplicationVersionsResult> describeApplicationVersionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeApplicationVersionsRequest, DescribeApplicationVersionsResult> asyncHandler) {

        return describeApplicationVersionsAsync(new DescribeApplicationVersionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationsResult> describeApplicationsAsync(DescribeApplicationsRequest request) {

        return describeApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationsResult> describeApplicationsAsync(final DescribeApplicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeApplicationsRequest, DescribeApplicationsResult> asyncHandler) {
        final DescribeApplicationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeApplicationsResult>() {
            @Override
            public DescribeApplicationsResult call() throws Exception {
                DescribeApplicationsResult result = null;

                try {
                    result = executeDescribeApplications(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the DescribeApplications operation.
     *
     * @see #describeApplicationsAsync(DescribeApplicationsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeApplicationsResult> describeApplicationsAsync() {

        return describeApplicationsAsync(new DescribeApplicationsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeApplications operation with an AsyncHandler.
     *
     * @see #describeApplicationsAsync(DescribeApplicationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeApplicationsResult> describeApplicationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeApplicationsRequest, DescribeApplicationsResult> asyncHandler) {

        return describeApplicationsAsync(new DescribeApplicationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationOptionsResult> describeConfigurationOptionsAsync(DescribeConfigurationOptionsRequest request) {

        return describeConfigurationOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationOptionsResult> describeConfigurationOptionsAsync(final DescribeConfigurationOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConfigurationOptionsRequest, DescribeConfigurationOptionsResult> asyncHandler) {
        final DescribeConfigurationOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConfigurationOptionsResult>() {
            @Override
            public DescribeConfigurationOptionsResult call() throws Exception {
                DescribeConfigurationOptionsResult result = null;

                try {
                    result = executeDescribeConfigurationOptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationSettingsResult> describeConfigurationSettingsAsync(DescribeConfigurationSettingsRequest request) {

        return describeConfigurationSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationSettingsResult> describeConfigurationSettingsAsync(
            final DescribeConfigurationSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConfigurationSettingsRequest, DescribeConfigurationSettingsResult> asyncHandler) {
        final DescribeConfigurationSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConfigurationSettingsResult>() {
            @Override
            public DescribeConfigurationSettingsResult call() throws Exception {
                DescribeConfigurationSettingsResult result = null;

                try {
                    result = executeDescribeConfigurationSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeEnvironmentHealthResult> describeEnvironmentHealthAsync(DescribeEnvironmentHealthRequest request) {

        return describeEnvironmentHealthAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEnvironmentHealthResult> describeEnvironmentHealthAsync(final DescribeEnvironmentHealthRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEnvironmentHealthRequest, DescribeEnvironmentHealthResult> asyncHandler) {
        final DescribeEnvironmentHealthRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEnvironmentHealthResult>() {
            @Override
            public DescribeEnvironmentHealthResult call() throws Exception {
                DescribeEnvironmentHealthResult result = null;

                try {
                    result = executeDescribeEnvironmentHealth(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeEnvironmentManagedActionHistoryResult> describeEnvironmentManagedActionHistoryAsync(
            DescribeEnvironmentManagedActionHistoryRequest request) {

        return describeEnvironmentManagedActionHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEnvironmentManagedActionHistoryResult> describeEnvironmentManagedActionHistoryAsync(
            final DescribeEnvironmentManagedActionHistoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEnvironmentManagedActionHistoryRequest, DescribeEnvironmentManagedActionHistoryResult> asyncHandler) {
        final DescribeEnvironmentManagedActionHistoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEnvironmentManagedActionHistoryResult>() {
            @Override
            public DescribeEnvironmentManagedActionHistoryResult call() throws Exception {
                DescribeEnvironmentManagedActionHistoryResult result = null;

                try {
                    result = executeDescribeEnvironmentManagedActionHistory(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeEnvironmentManagedActionsResult> describeEnvironmentManagedActionsAsync(
            DescribeEnvironmentManagedActionsRequest request) {

        return describeEnvironmentManagedActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEnvironmentManagedActionsResult> describeEnvironmentManagedActionsAsync(
            final DescribeEnvironmentManagedActionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEnvironmentManagedActionsRequest, DescribeEnvironmentManagedActionsResult> asyncHandler) {
        final DescribeEnvironmentManagedActionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEnvironmentManagedActionsResult>() {
            @Override
            public DescribeEnvironmentManagedActionsResult call() throws Exception {
                DescribeEnvironmentManagedActionsResult result = null;

                try {
                    result = executeDescribeEnvironmentManagedActions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeEnvironmentResourcesResult> describeEnvironmentResourcesAsync(DescribeEnvironmentResourcesRequest request) {

        return describeEnvironmentResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEnvironmentResourcesResult> describeEnvironmentResourcesAsync(final DescribeEnvironmentResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEnvironmentResourcesRequest, DescribeEnvironmentResourcesResult> asyncHandler) {
        final DescribeEnvironmentResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEnvironmentResourcesResult>() {
            @Override
            public DescribeEnvironmentResourcesResult call() throws Exception {
                DescribeEnvironmentResourcesResult result = null;

                try {
                    result = executeDescribeEnvironmentResources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeEnvironmentsResult> describeEnvironmentsAsync(DescribeEnvironmentsRequest request) {

        return describeEnvironmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEnvironmentsResult> describeEnvironmentsAsync(final DescribeEnvironmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEnvironmentsRequest, DescribeEnvironmentsResult> asyncHandler) {
        final DescribeEnvironmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEnvironmentsResult>() {
            @Override
            public DescribeEnvironmentsResult call() throws Exception {
                DescribeEnvironmentsResult result = null;

                try {
                    result = executeDescribeEnvironments(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the DescribeEnvironments operation.
     *
     * @see #describeEnvironmentsAsync(DescribeEnvironmentsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeEnvironmentsResult> describeEnvironmentsAsync() {

        return describeEnvironmentsAsync(new DescribeEnvironmentsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeEnvironments operation with an AsyncHandler.
     *
     * @see #describeEnvironmentsAsync(DescribeEnvironmentsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeEnvironmentsResult> describeEnvironmentsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeEnvironmentsRequest, DescribeEnvironmentsResult> asyncHandler) {

        return describeEnvironmentsAsync(new DescribeEnvironmentsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest request) {

        return describeEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(final DescribeEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler) {
        final DescribeEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEventsResult>() {
            @Override
            public DescribeEventsResult call() throws Exception {
                DescribeEventsResult result = null;

                try {
                    result = executeDescribeEvents(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the DescribeEvents operation.
     *
     * @see #describeEventsAsync(DescribeEventsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync() {

        return describeEventsAsync(new DescribeEventsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeEvents operation with an AsyncHandler.
     *
     * @see #describeEventsAsync(DescribeEventsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler) {

        return describeEventsAsync(new DescribeEventsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstancesHealthResult> describeInstancesHealthAsync(DescribeInstancesHealthRequest request) {

        return describeInstancesHealthAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstancesHealthResult> describeInstancesHealthAsync(final DescribeInstancesHealthRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstancesHealthRequest, DescribeInstancesHealthResult> asyncHandler) {
        final DescribeInstancesHealthRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstancesHealthResult>() {
            @Override
            public DescribeInstancesHealthResult call() throws Exception {
                DescribeInstancesHealthResult result = null;

                try {
                    result = executeDescribeInstancesHealth(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribePlatformVersionResult> describePlatformVersionAsync(DescribePlatformVersionRequest request) {

        return describePlatformVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePlatformVersionResult> describePlatformVersionAsync(final DescribePlatformVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePlatformVersionRequest, DescribePlatformVersionResult> asyncHandler) {
        final DescribePlatformVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePlatformVersionResult>() {
            @Override
            public DescribePlatformVersionResult call() throws Exception {
                DescribePlatformVersionResult result = null;

                try {
                    result = executeDescribePlatformVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAvailableSolutionStacksResult> listAvailableSolutionStacksAsync(ListAvailableSolutionStacksRequest request) {

        return listAvailableSolutionStacksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAvailableSolutionStacksResult> listAvailableSolutionStacksAsync(final ListAvailableSolutionStacksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAvailableSolutionStacksRequest, ListAvailableSolutionStacksResult> asyncHandler) {
        final ListAvailableSolutionStacksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAvailableSolutionStacksResult>() {
            @Override
            public ListAvailableSolutionStacksResult call() throws Exception {
                ListAvailableSolutionStacksResult result = null;

                try {
                    result = executeListAvailableSolutionStacks(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListAvailableSolutionStacks operation.
     *
     * @see #listAvailableSolutionStacksAsync(ListAvailableSolutionStacksRequest)
     */
    @Override
    public java.util.concurrent.Future<ListAvailableSolutionStacksResult> listAvailableSolutionStacksAsync() {

        return listAvailableSolutionStacksAsync(new ListAvailableSolutionStacksRequest());
    }

    /**
     * Simplified method form for invoking the ListAvailableSolutionStacks operation with an AsyncHandler.
     *
     * @see #listAvailableSolutionStacksAsync(ListAvailableSolutionStacksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListAvailableSolutionStacksResult> listAvailableSolutionStacksAsync(
            com.amazonaws.handlers.AsyncHandler<ListAvailableSolutionStacksRequest, ListAvailableSolutionStacksResult> asyncHandler) {

        return listAvailableSolutionStacksAsync(new ListAvailableSolutionStacksRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListPlatformVersionsResult> listPlatformVersionsAsync(ListPlatformVersionsRequest request) {

        return listPlatformVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPlatformVersionsResult> listPlatformVersionsAsync(final ListPlatformVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPlatformVersionsRequest, ListPlatformVersionsResult> asyncHandler) {
        final ListPlatformVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPlatformVersionsResult>() {
            @Override
            public ListPlatformVersionsResult call() throws Exception {
                ListPlatformVersionsResult result = null;

                try {
                    result = executeListPlatformVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RebuildEnvironmentResult> rebuildEnvironmentAsync(RebuildEnvironmentRequest request) {

        return rebuildEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RebuildEnvironmentResult> rebuildEnvironmentAsync(final RebuildEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<RebuildEnvironmentRequest, RebuildEnvironmentResult> asyncHandler) {
        final RebuildEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RebuildEnvironmentResult>() {
            @Override
            public RebuildEnvironmentResult call() throws Exception {
                RebuildEnvironmentResult result = null;

                try {
                    result = executeRebuildEnvironment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RequestEnvironmentInfoResult> requestEnvironmentInfoAsync(RequestEnvironmentInfoRequest request) {

        return requestEnvironmentInfoAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RequestEnvironmentInfoResult> requestEnvironmentInfoAsync(final RequestEnvironmentInfoRequest request,
            final com.amazonaws.handlers.AsyncHandler<RequestEnvironmentInfoRequest, RequestEnvironmentInfoResult> asyncHandler) {
        final RequestEnvironmentInfoRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RequestEnvironmentInfoResult>() {
            @Override
            public RequestEnvironmentInfoResult call() throws Exception {
                RequestEnvironmentInfoResult result = null;

                try {
                    result = executeRequestEnvironmentInfo(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RestartAppServerResult> restartAppServerAsync(RestartAppServerRequest request) {

        return restartAppServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestartAppServerResult> restartAppServerAsync(final RestartAppServerRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestartAppServerRequest, RestartAppServerResult> asyncHandler) {
        final RestartAppServerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RestartAppServerResult>() {
            @Override
            public RestartAppServerResult call() throws Exception {
                RestartAppServerResult result = null;

                try {
                    result = executeRestartAppServer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RetrieveEnvironmentInfoResult> retrieveEnvironmentInfoAsync(RetrieveEnvironmentInfoRequest request) {

        return retrieveEnvironmentInfoAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RetrieveEnvironmentInfoResult> retrieveEnvironmentInfoAsync(final RetrieveEnvironmentInfoRequest request,
            final com.amazonaws.handlers.AsyncHandler<RetrieveEnvironmentInfoRequest, RetrieveEnvironmentInfoResult> asyncHandler) {
        final RetrieveEnvironmentInfoRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RetrieveEnvironmentInfoResult>() {
            @Override
            public RetrieveEnvironmentInfoResult call() throws Exception {
                RetrieveEnvironmentInfoResult result = null;

                try {
                    result = executeRetrieveEnvironmentInfo(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SwapEnvironmentCNAMEsResult> swapEnvironmentCNAMEsAsync(SwapEnvironmentCNAMEsRequest request) {

        return swapEnvironmentCNAMEsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SwapEnvironmentCNAMEsResult> swapEnvironmentCNAMEsAsync(final SwapEnvironmentCNAMEsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SwapEnvironmentCNAMEsRequest, SwapEnvironmentCNAMEsResult> asyncHandler) {
        final SwapEnvironmentCNAMEsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SwapEnvironmentCNAMEsResult>() {
            @Override
            public SwapEnvironmentCNAMEsResult call() throws Exception {
                SwapEnvironmentCNAMEsResult result = null;

                try {
                    result = executeSwapEnvironmentCNAMEs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the SwapEnvironmentCNAMEs operation.
     *
     * @see #swapEnvironmentCNAMEsAsync(SwapEnvironmentCNAMEsRequest)
     */
    @Override
    public java.util.concurrent.Future<SwapEnvironmentCNAMEsResult> swapEnvironmentCNAMEsAsync() {

        return swapEnvironmentCNAMEsAsync(new SwapEnvironmentCNAMEsRequest());
    }

    /**
     * Simplified method form for invoking the SwapEnvironmentCNAMEs operation with an AsyncHandler.
     *
     * @see #swapEnvironmentCNAMEsAsync(SwapEnvironmentCNAMEsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<SwapEnvironmentCNAMEsResult> swapEnvironmentCNAMEsAsync(
            com.amazonaws.handlers.AsyncHandler<SwapEnvironmentCNAMEsRequest, SwapEnvironmentCNAMEsResult> asyncHandler) {

        return swapEnvironmentCNAMEsAsync(new SwapEnvironmentCNAMEsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<TerminateEnvironmentResult> terminateEnvironmentAsync(TerminateEnvironmentRequest request) {

        return terminateEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateEnvironmentResult> terminateEnvironmentAsync(final TerminateEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<TerminateEnvironmentRequest, TerminateEnvironmentResult> asyncHandler) {
        final TerminateEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TerminateEnvironmentResult>() {
            @Override
            public TerminateEnvironmentResult call() throws Exception {
                TerminateEnvironmentResult result = null;

                try {
                    result = executeTerminateEnvironment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest request) {

        return updateApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(final UpdateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler) {
        final UpdateApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApplicationResult>() {
            @Override
            public UpdateApplicationResult call() throws Exception {
                UpdateApplicationResult result = null;

                try {
                    result = executeUpdateApplication(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResourceLifecycleResult> updateApplicationResourceLifecycleAsync(
            UpdateApplicationResourceLifecycleRequest request) {

        return updateApplicationResourceLifecycleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResourceLifecycleResult> updateApplicationResourceLifecycleAsync(
            final UpdateApplicationResourceLifecycleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApplicationResourceLifecycleRequest, UpdateApplicationResourceLifecycleResult> asyncHandler) {
        final UpdateApplicationResourceLifecycleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApplicationResourceLifecycleResult>() {
            @Override
            public UpdateApplicationResourceLifecycleResult call() throws Exception {
                UpdateApplicationResourceLifecycleResult result = null;

                try {
                    result = executeUpdateApplicationResourceLifecycle(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationVersionResult> updateApplicationVersionAsync(UpdateApplicationVersionRequest request) {

        return updateApplicationVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationVersionResult> updateApplicationVersionAsync(final UpdateApplicationVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApplicationVersionRequest, UpdateApplicationVersionResult> asyncHandler) {
        final UpdateApplicationVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApplicationVersionResult>() {
            @Override
            public UpdateApplicationVersionResult call() throws Exception {
                UpdateApplicationVersionResult result = null;

                try {
                    result = executeUpdateApplicationVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationTemplateResult> updateConfigurationTemplateAsync(UpdateConfigurationTemplateRequest request) {

        return updateConfigurationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationTemplateResult> updateConfigurationTemplateAsync(final UpdateConfigurationTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConfigurationTemplateRequest, UpdateConfigurationTemplateResult> asyncHandler) {
        final UpdateConfigurationTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConfigurationTemplateResult>() {
            @Override
            public UpdateConfigurationTemplateResult call() throws Exception {
                UpdateConfigurationTemplateResult result = null;

                try {
                    result = executeUpdateConfigurationTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest request) {

        return updateEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(final UpdateEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentRequest, UpdateEnvironmentResult> asyncHandler) {
        final UpdateEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEnvironmentResult>() {
            @Override
            public UpdateEnvironmentResult call() throws Exception {
                UpdateEnvironmentResult result = null;

                try {
                    result = executeUpdateEnvironment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateTagsForResourceResult> updateTagsForResourceAsync(UpdateTagsForResourceRequest request) {

        return updateTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTagsForResourceResult> updateTagsForResourceAsync(final UpdateTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTagsForResourceRequest, UpdateTagsForResourceResult> asyncHandler) {
        final UpdateTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTagsForResourceResult>() {
            @Override
            public UpdateTagsForResourceResult call() throws Exception {
                UpdateTagsForResourceResult result = null;

                try {
                    result = executeUpdateTagsForResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ValidateConfigurationSettingsResult> validateConfigurationSettingsAsync(ValidateConfigurationSettingsRequest request) {

        return validateConfigurationSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ValidateConfigurationSettingsResult> validateConfigurationSettingsAsync(
            final ValidateConfigurationSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ValidateConfigurationSettingsRequest, ValidateConfigurationSettingsResult> asyncHandler) {
        final ValidateConfigurationSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ValidateConfigurationSettingsResult>() {
            @Override
            public ValidateConfigurationSettingsResult call() throws Exception {
                ValidateConfigurationSettingsResult result = null;

                try {
                    result = executeValidateConfigurationSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
