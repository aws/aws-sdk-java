/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.amazonaws.services.opsworks;

import com.amazonaws.services.opsworks.model.*;

/**
 * Interface for accessing AWS OpsWorks asynchronously. Each asynchronous method
 * will return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS OpsWorks</fullname>
 * <p>
 * Welcome to the <i>AWS OpsWorks API Reference</i>. This guide provides
 * descriptions, syntax, and usage examples about AWS OpsWorks actions and data
 * types, including common parameters and error codes.
 * </p>
 * <p>
 * AWS OpsWorks is an application management service that provides an integrated
 * experience for overseeing the complete application lifecycle. For information
 * about this product, go to the <a href="http://aws.amazon.com/opsworks/">AWS
 * OpsWorks</a> details page.
 * </p>
 * <p>
 * <b>SDKs and CLI</b>
 * </p>
 * <p>
 * The most common way to use the AWS OpsWorks API is by using the AWS Command
 * Line Interface (CLI) or by using one of the AWS SDKs to implement
 * applications in your preferred language. For more information, see:
 * </p>
 * <ul>
 * <li><a href=
 * "http://docs.aws.amazon.com/cli/latest/userguide/cli-chap-welcome.html">AWS
 * CLI</a></li>
 * <li><a href=
 * "http://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/opsworks/AWSOpsWorksClient.html"
 * >AWS SDK for Java</a></li>
 * <li><a href=
 * "http://docs.aws.amazon.com/sdkfornet/latest/apidocs/html/N_Amazon_OpsWorks.htm"
 * >AWS SDK for .NET</a></li>
 * <li><a href=
 * "http://docs.aws.amazon.com/aws-sdk-php-2/latest/class-Aws.OpsWorks.OpsWorksClient.html"
 * >AWS SDK for PHP 2</a></li>
 * <li><a href=
 * "http://docs.aws.amazon.com/AWSRubySDK/latest/AWS/OpsWorks/Client.html">AWS
 * SDK for Ruby</a></li>
 * <li><a href="http://aws.amazon.com/documentation/sdkforjavascript/">AWS SDK
 * for Node.js</a></li>
 * <li><a href="http://docs.pythonboto.org/en/latest/ref/opsworks.html">AWS SDK
 * for Python(Boto)</a></li>
 * </ul>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * AWS OpsWorks supports only one endpoint, opsworks.us-east-1.amazonaws.com
 * (HTTPS), so you must connect to that endpoint. You can then use the API to
 * direct AWS OpsWorks to create stacks in any AWS Region.
 * </p>
 * <p>
 * <b>Chef Versions</b>
 * </p>
 * <p>
 * When you call <a>CreateStack</a>, <a>CloneStack</a>, or <a>UpdateStack</a> we
 * recommend you use the <code>ConfigurationManager</code> parameter to specify
 * the Chef version. The recommended value for Linux stacks, which is also the
 * default value, is currently 11.10. Windows stacks use Chef 12.2. For more
 * information, see <a href=
 * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-chef11.html"
 * >Chef Versions</a>.
 * </p>
 * <note>You can also specify Chef 11.4 or Chef 0.9 for your Linux stack.
 * However, Chef 0.9 has been deprecated. We do not recommend using Chef 0.9 for
 * new stacks, and we recommend migrating your existing Chef 0.9 stacks to Chef
 * 11.10 as soon as possible.</note>
 */
public class AWSOpsWorksAsyncClient extends AWSOpsWorksClient implements
        AWSOpsWorksAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * OpsWorks. A credentials provider chain will be used that searches for
     * credentials in this order:
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
    public AWSOpsWorksAsyncClient() {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * OpsWorks. A credentials provider chain will be used that searches for
     * credentials in this order:
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
     *        connects to AWS OpsWorks (ex: proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSOpsWorksAsyncClient(
            com.amazonaws.ClientConfiguration clientConfiguration) {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain(),
                clientConfiguration, java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * OpsWorks using the specified AWS account credentials.
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
    public AWSOpsWorksAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * OpsWorks using the specified AWS account credentials and executor
     * service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AWSOpsWorksAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * OpsWorks using the specified AWS account credentials, executor service,
     * and client configuration options.
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
    public AWSOpsWorksAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * OpsWorks using the specified AWS account credentials provider. Default
     * client settings will be used.
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
    public AWSOpsWorksAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * OpsWorks using the provided AWS account credentials provider and client
     * configuration options.
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
    public AWSOpsWorksAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration,
                java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * OpsWorks using the specified AWS account credentials provider and
     * executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AWSOpsWorksAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * OpsWorks using the specified AWS account credentials provider, executor
     * service, and client configuration options.
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
    public AWSOpsWorksAsyncClient(
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

    @Override
    public java.util.concurrent.Future<Void> assignInstanceAsync(
            AssignInstanceRequest request) {

        return assignInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> assignInstanceAsync(
            final AssignInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssignInstanceRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            assignInstance(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> assignVolumeAsync(
            AssignVolumeRequest request) {

        return assignVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> assignVolumeAsync(
            final AssignVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssignVolumeRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            assignVolume(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> associateElasticIpAsync(
            AssociateElasticIpRequest request) {

        return associateElasticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> associateElasticIpAsync(
            final AssociateElasticIpRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateElasticIpRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            associateElasticIp(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> attachElasticLoadBalancerAsync(
            AttachElasticLoadBalancerRequest request) {

        return attachElasticLoadBalancerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> attachElasticLoadBalancerAsync(
            final AttachElasticLoadBalancerRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachElasticLoadBalancerRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            attachElasticLoadBalancer(request);
                            result = null;
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
    public java.util.concurrent.Future<CloneStackResult> cloneStackAsync(
            CloneStackRequest request) {

        return cloneStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CloneStackResult> cloneStackAsync(
            final CloneStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<CloneStackRequest, CloneStackResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CloneStackResult>() {
                    @Override
                    public CloneStackResult call() throws Exception {
                        CloneStackResult result;

                        try {
                            result = cloneStack(request);
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
    public java.util.concurrent.Future<CreateAppResult> createAppAsync(
            CreateAppRequest request) {

        return createAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAppResult> createAppAsync(
            final CreateAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAppRequest, CreateAppResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateAppResult>() {
                    @Override
                    public CreateAppResult call() throws Exception {
                        CreateAppResult result;

                        try {
                            result = createApp(request);
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
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(
            CreateDeploymentRequest request) {

        return createDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(
            final CreateDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateDeploymentResult>() {
                    @Override
                    public CreateDeploymentResult call() throws Exception {
                        CreateDeploymentResult result;

                        try {
                            result = createDeployment(request);
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
    public java.util.concurrent.Future<CreateInstanceResult> createInstanceAsync(
            CreateInstanceRequest request) {

        return createInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInstanceResult> createInstanceAsync(
            final CreateInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInstanceRequest, CreateInstanceResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateInstanceResult>() {
                    @Override
                    public CreateInstanceResult call() throws Exception {
                        CreateInstanceResult result;

                        try {
                            result = createInstance(request);
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
    public java.util.concurrent.Future<CreateLayerResult> createLayerAsync(
            CreateLayerRequest request) {

        return createLayerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLayerResult> createLayerAsync(
            final CreateLayerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLayerRequest, CreateLayerResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateLayerResult>() {
                    @Override
                    public CreateLayerResult call() throws Exception {
                        CreateLayerResult result;

                        try {
                            result = createLayer(request);
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
    public java.util.concurrent.Future<CreateStackResult> createStackAsync(
            CreateStackRequest request) {

        return createStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStackResult> createStackAsync(
            final CreateStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStackRequest, CreateStackResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateStackResult>() {
                    @Override
                    public CreateStackResult call() throws Exception {
                        CreateStackResult result;

                        try {
                            result = createStack(request);
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
    public java.util.concurrent.Future<CreateUserProfileResult> createUserProfileAsync(
            CreateUserProfileRequest request) {

        return createUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserProfileResult> createUserProfileAsync(
            final CreateUserProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserProfileRequest, CreateUserProfileResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateUserProfileResult>() {
                    @Override
                    public CreateUserProfileResult call() throws Exception {
                        CreateUserProfileResult result;

                        try {
                            result = createUserProfile(request);
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
    public java.util.concurrent.Future<Void> deleteAppAsync(
            DeleteAppRequest request) {

        return deleteAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteAppAsync(
            final DeleteAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAppRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteApp(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deleteInstanceAsync(
            DeleteInstanceRequest request) {

        return deleteInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteInstanceAsync(
            final DeleteInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInstanceRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteInstance(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deleteLayerAsync(
            DeleteLayerRequest request) {

        return deleteLayerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteLayerAsync(
            final DeleteLayerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLayerRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteLayer(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deleteStackAsync(
            DeleteStackRequest request) {

        return deleteStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteStackAsync(
            final DeleteStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStackRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteStack(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deleteUserProfileAsync(
            DeleteUserProfileRequest request) {

        return deleteUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteUserProfileAsync(
            final DeleteUserProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserProfileRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteUserProfile(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deregisterEcsClusterAsync(
            DeregisterEcsClusterRequest request) {

        return deregisterEcsClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deregisterEcsClusterAsync(
            final DeregisterEcsClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterEcsClusterRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deregisterEcsCluster(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deregisterElasticIpAsync(
            DeregisterElasticIpRequest request) {

        return deregisterElasticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deregisterElasticIpAsync(
            final DeregisterElasticIpRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterElasticIpRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deregisterElasticIp(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deregisterInstanceAsync(
            DeregisterInstanceRequest request) {

        return deregisterInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deregisterInstanceAsync(
            final DeregisterInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterInstanceRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deregisterInstance(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deregisterRdsDbInstanceAsync(
            DeregisterRdsDbInstanceRequest request) {

        return deregisterRdsDbInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deregisterRdsDbInstanceAsync(
            final DeregisterRdsDbInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterRdsDbInstanceRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deregisterRdsDbInstance(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deregisterVolumeAsync(
            DeregisterVolumeRequest request) {

        return deregisterVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deregisterVolumeAsync(
            final DeregisterVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterVolumeRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deregisterVolume(request);
                            result = null;
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
    public java.util.concurrent.Future<DescribeAgentVersionsResult> describeAgentVersionsAsync(
            DescribeAgentVersionsRequest request) {

        return describeAgentVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAgentVersionsResult> describeAgentVersionsAsync(
            final DescribeAgentVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAgentVersionsRequest, DescribeAgentVersionsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeAgentVersionsResult>() {
                    @Override
                    public DescribeAgentVersionsResult call() throws Exception {
                        DescribeAgentVersionsResult result;

                        try {
                            result = describeAgentVersions(request);
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
    public java.util.concurrent.Future<DescribeAppsResult> describeAppsAsync(
            DescribeAppsRequest request) {

        return describeAppsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppsResult> describeAppsAsync(
            final DescribeAppsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAppsRequest, DescribeAppsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeAppsResult>() {
                    @Override
                    public DescribeAppsResult call() throws Exception {
                        DescribeAppsResult result;

                        try {
                            result = describeApps(request);
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
    public java.util.concurrent.Future<DescribeCommandsResult> describeCommandsAsync(
            DescribeCommandsRequest request) {

        return describeCommandsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCommandsResult> describeCommandsAsync(
            final DescribeCommandsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCommandsRequest, DescribeCommandsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeCommandsResult>() {
                    @Override
                    public DescribeCommandsResult call() throws Exception {
                        DescribeCommandsResult result;

                        try {
                            result = describeCommands(request);
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
    public java.util.concurrent.Future<DescribeDeploymentsResult> describeDeploymentsAsync(
            DescribeDeploymentsRequest request) {

        return describeDeploymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeploymentsResult> describeDeploymentsAsync(
            final DescribeDeploymentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDeploymentsRequest, DescribeDeploymentsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeDeploymentsResult>() {
                    @Override
                    public DescribeDeploymentsResult call() throws Exception {
                        DescribeDeploymentsResult result;

                        try {
                            result = describeDeployments(request);
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
    public java.util.concurrent.Future<DescribeEcsClustersResult> describeEcsClustersAsync(
            DescribeEcsClustersRequest request) {

        return describeEcsClustersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEcsClustersResult> describeEcsClustersAsync(
            final DescribeEcsClustersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEcsClustersRequest, DescribeEcsClustersResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeEcsClustersResult>() {
                    @Override
                    public DescribeEcsClustersResult call() throws Exception {
                        DescribeEcsClustersResult result;

                        try {
                            result = describeEcsClusters(request);
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
    public java.util.concurrent.Future<DescribeElasticIpsResult> describeElasticIpsAsync(
            DescribeElasticIpsRequest request) {

        return describeElasticIpsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeElasticIpsResult> describeElasticIpsAsync(
            final DescribeElasticIpsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeElasticIpsRequest, DescribeElasticIpsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeElasticIpsResult>() {
                    @Override
                    public DescribeElasticIpsResult call() throws Exception {
                        DescribeElasticIpsResult result;

                        try {
                            result = describeElasticIps(request);
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
    public java.util.concurrent.Future<DescribeElasticLoadBalancersResult> describeElasticLoadBalancersAsync(
            DescribeElasticLoadBalancersRequest request) {

        return describeElasticLoadBalancersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeElasticLoadBalancersResult> describeElasticLoadBalancersAsync(
            final DescribeElasticLoadBalancersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeElasticLoadBalancersRequest, DescribeElasticLoadBalancersResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeElasticLoadBalancersResult>() {
                    @Override
                    public DescribeElasticLoadBalancersResult call()
                            throws Exception {
                        DescribeElasticLoadBalancersResult result;

                        try {
                            result = describeElasticLoadBalancers(request);
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
    public java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(
            DescribeInstancesRequest request) {

        return describeInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(
            final DescribeInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstancesRequest, DescribeInstancesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeInstancesResult>() {
                    @Override
                    public DescribeInstancesResult call() throws Exception {
                        DescribeInstancesResult result;

                        try {
                            result = describeInstances(request);
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
    public java.util.concurrent.Future<DescribeLayersResult> describeLayersAsync(
            DescribeLayersRequest request) {

        return describeLayersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLayersResult> describeLayersAsync(
            final DescribeLayersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLayersRequest, DescribeLayersResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeLayersResult>() {
                    @Override
                    public DescribeLayersResult call() throws Exception {
                        DescribeLayersResult result;

                        try {
                            result = describeLayers(request);
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
    public java.util.concurrent.Future<DescribeLoadBasedAutoScalingResult> describeLoadBasedAutoScalingAsync(
            DescribeLoadBasedAutoScalingRequest request) {

        return describeLoadBasedAutoScalingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoadBasedAutoScalingResult> describeLoadBasedAutoScalingAsync(
            final DescribeLoadBasedAutoScalingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLoadBasedAutoScalingRequest, DescribeLoadBasedAutoScalingResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeLoadBasedAutoScalingResult>() {
                    @Override
                    public DescribeLoadBasedAutoScalingResult call()
                            throws Exception {
                        DescribeLoadBasedAutoScalingResult result;

                        try {
                            result = describeLoadBasedAutoScaling(request);
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
    public java.util.concurrent.Future<DescribeMyUserProfileResult> describeMyUserProfileAsync(
            DescribeMyUserProfileRequest request) {

        return describeMyUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMyUserProfileResult> describeMyUserProfileAsync(
            final DescribeMyUserProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMyUserProfileRequest, DescribeMyUserProfileResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeMyUserProfileResult>() {
                    @Override
                    public DescribeMyUserProfileResult call() throws Exception {
                        DescribeMyUserProfileResult result;

                        try {
                            result = describeMyUserProfile(request);
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
    public java.util.concurrent.Future<DescribePermissionsResult> describePermissionsAsync(
            DescribePermissionsRequest request) {

        return describePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePermissionsResult> describePermissionsAsync(
            final DescribePermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePermissionsRequest, DescribePermissionsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribePermissionsResult>() {
                    @Override
                    public DescribePermissionsResult call() throws Exception {
                        DescribePermissionsResult result;

                        try {
                            result = describePermissions(request);
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
    public java.util.concurrent.Future<DescribeRaidArraysResult> describeRaidArraysAsync(
            DescribeRaidArraysRequest request) {

        return describeRaidArraysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRaidArraysResult> describeRaidArraysAsync(
            final DescribeRaidArraysRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRaidArraysRequest, DescribeRaidArraysResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeRaidArraysResult>() {
                    @Override
                    public DescribeRaidArraysResult call() throws Exception {
                        DescribeRaidArraysResult result;

                        try {
                            result = describeRaidArrays(request);
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
    public java.util.concurrent.Future<DescribeRdsDbInstancesResult> describeRdsDbInstancesAsync(
            DescribeRdsDbInstancesRequest request) {

        return describeRdsDbInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRdsDbInstancesResult> describeRdsDbInstancesAsync(
            final DescribeRdsDbInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRdsDbInstancesRequest, DescribeRdsDbInstancesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeRdsDbInstancesResult>() {
                    @Override
                    public DescribeRdsDbInstancesResult call() throws Exception {
                        DescribeRdsDbInstancesResult result;

                        try {
                            result = describeRdsDbInstances(request);
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
    public java.util.concurrent.Future<DescribeServiceErrorsResult> describeServiceErrorsAsync(
            DescribeServiceErrorsRequest request) {

        return describeServiceErrorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeServiceErrorsResult> describeServiceErrorsAsync(
            final DescribeServiceErrorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeServiceErrorsRequest, DescribeServiceErrorsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeServiceErrorsResult>() {
                    @Override
                    public DescribeServiceErrorsResult call() throws Exception {
                        DescribeServiceErrorsResult result;

                        try {
                            result = describeServiceErrors(request);
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
    public java.util.concurrent.Future<DescribeStackProvisioningParametersResult> describeStackProvisioningParametersAsync(
            DescribeStackProvisioningParametersRequest request) {

        return describeStackProvisioningParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStackProvisioningParametersResult> describeStackProvisioningParametersAsync(
            final DescribeStackProvisioningParametersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStackProvisioningParametersRequest, DescribeStackProvisioningParametersResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeStackProvisioningParametersResult>() {
                    @Override
                    public DescribeStackProvisioningParametersResult call()
                            throws Exception {
                        DescribeStackProvisioningParametersResult result;

                        try {
                            result = describeStackProvisioningParameters(request);
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
    public java.util.concurrent.Future<DescribeStackSummaryResult> describeStackSummaryAsync(
            DescribeStackSummaryRequest request) {

        return describeStackSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStackSummaryResult> describeStackSummaryAsync(
            final DescribeStackSummaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStackSummaryRequest, DescribeStackSummaryResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeStackSummaryResult>() {
                    @Override
                    public DescribeStackSummaryResult call() throws Exception {
                        DescribeStackSummaryResult result;

                        try {
                            result = describeStackSummary(request);
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
    public java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(
            DescribeStacksRequest request) {

        return describeStacksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(
            final DescribeStacksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStacksRequest, DescribeStacksResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeStacksResult>() {
                    @Override
                    public DescribeStacksResult call() throws Exception {
                        DescribeStacksResult result;

                        try {
                            result = describeStacks(request);
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
    public java.util.concurrent.Future<DescribeTimeBasedAutoScalingResult> describeTimeBasedAutoScalingAsync(
            DescribeTimeBasedAutoScalingRequest request) {

        return describeTimeBasedAutoScalingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTimeBasedAutoScalingResult> describeTimeBasedAutoScalingAsync(
            final DescribeTimeBasedAutoScalingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTimeBasedAutoScalingRequest, DescribeTimeBasedAutoScalingResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeTimeBasedAutoScalingResult>() {
                    @Override
                    public DescribeTimeBasedAutoScalingResult call()
                            throws Exception {
                        DescribeTimeBasedAutoScalingResult result;

                        try {
                            result = describeTimeBasedAutoScaling(request);
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
    public java.util.concurrent.Future<DescribeUserProfilesResult> describeUserProfilesAsync(
            DescribeUserProfilesRequest request) {

        return describeUserProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserProfilesResult> describeUserProfilesAsync(
            final DescribeUserProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUserProfilesRequest, DescribeUserProfilesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeUserProfilesResult>() {
                    @Override
                    public DescribeUserProfilesResult call() throws Exception {
                        DescribeUserProfilesResult result;

                        try {
                            result = describeUserProfiles(request);
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
    public java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync(
            DescribeVolumesRequest request) {

        return describeVolumesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync(
            final DescribeVolumesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVolumesRequest, DescribeVolumesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeVolumesResult>() {
                    @Override
                    public DescribeVolumesResult call() throws Exception {
                        DescribeVolumesResult result;

                        try {
                            result = describeVolumes(request);
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
    public java.util.concurrent.Future<Void> detachElasticLoadBalancerAsync(
            DetachElasticLoadBalancerRequest request) {

        return detachElasticLoadBalancerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> detachElasticLoadBalancerAsync(
            final DetachElasticLoadBalancerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachElasticLoadBalancerRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            detachElasticLoadBalancer(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> disassociateElasticIpAsync(
            DisassociateElasticIpRequest request) {

        return disassociateElasticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> disassociateElasticIpAsync(
            final DisassociateElasticIpRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateElasticIpRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            disassociateElasticIp(request);
                            result = null;
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
    public java.util.concurrent.Future<GetHostnameSuggestionResult> getHostnameSuggestionAsync(
            GetHostnameSuggestionRequest request) {

        return getHostnameSuggestionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHostnameSuggestionResult> getHostnameSuggestionAsync(
            final GetHostnameSuggestionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetHostnameSuggestionRequest, GetHostnameSuggestionResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetHostnameSuggestionResult>() {
                    @Override
                    public GetHostnameSuggestionResult call() throws Exception {
                        GetHostnameSuggestionResult result;

                        try {
                            result = getHostnameSuggestion(request);
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
    public java.util.concurrent.Future<GrantAccessResult> grantAccessAsync(
            GrantAccessRequest request) {

        return grantAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GrantAccessResult> grantAccessAsync(
            final GrantAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<GrantAccessRequest, GrantAccessResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GrantAccessResult>() {
                    @Override
                    public GrantAccessResult call() throws Exception {
                        GrantAccessResult result;

                        try {
                            result = grantAccess(request);
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
    public java.util.concurrent.Future<Void> rebootInstanceAsync(
            RebootInstanceRequest request) {

        return rebootInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> rebootInstanceAsync(
            final RebootInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RebootInstanceRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            rebootInstance(request);
                            result = null;
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
    public java.util.concurrent.Future<RegisterEcsClusterResult> registerEcsClusterAsync(
            RegisterEcsClusterRequest request) {

        return registerEcsClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterEcsClusterResult> registerEcsClusterAsync(
            final RegisterEcsClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterEcsClusterRequest, RegisterEcsClusterResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<RegisterEcsClusterResult>() {
                    @Override
                    public RegisterEcsClusterResult call() throws Exception {
                        RegisterEcsClusterResult result;

                        try {
                            result = registerEcsCluster(request);
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
    public java.util.concurrent.Future<RegisterElasticIpResult> registerElasticIpAsync(
            RegisterElasticIpRequest request) {

        return registerElasticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterElasticIpResult> registerElasticIpAsync(
            final RegisterElasticIpRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterElasticIpRequest, RegisterElasticIpResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<RegisterElasticIpResult>() {
                    @Override
                    public RegisterElasticIpResult call() throws Exception {
                        RegisterElasticIpResult result;

                        try {
                            result = registerElasticIp(request);
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
    public java.util.concurrent.Future<RegisterInstanceResult> registerInstanceAsync(
            RegisterInstanceRequest request) {

        return registerInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterInstanceResult> registerInstanceAsync(
            final RegisterInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterInstanceRequest, RegisterInstanceResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<RegisterInstanceResult>() {
                    @Override
                    public RegisterInstanceResult call() throws Exception {
                        RegisterInstanceResult result;

                        try {
                            result = registerInstance(request);
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
    public java.util.concurrent.Future<Void> registerRdsDbInstanceAsync(
            RegisterRdsDbInstanceRequest request) {

        return registerRdsDbInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> registerRdsDbInstanceAsync(
            final RegisterRdsDbInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterRdsDbInstanceRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            registerRdsDbInstance(request);
                            result = null;
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
    public java.util.concurrent.Future<RegisterVolumeResult> registerVolumeAsync(
            RegisterVolumeRequest request) {

        return registerVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterVolumeResult> registerVolumeAsync(
            final RegisterVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterVolumeRequest, RegisterVolumeResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<RegisterVolumeResult>() {
                    @Override
                    public RegisterVolumeResult call() throws Exception {
                        RegisterVolumeResult result;

                        try {
                            result = registerVolume(request);
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
    public java.util.concurrent.Future<Void> setLoadBasedAutoScalingAsync(
            SetLoadBasedAutoScalingRequest request) {

        return setLoadBasedAutoScalingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> setLoadBasedAutoScalingAsync(
            final SetLoadBasedAutoScalingRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetLoadBasedAutoScalingRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            setLoadBasedAutoScaling(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> setPermissionAsync(
            SetPermissionRequest request) {

        return setPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> setPermissionAsync(
            final SetPermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetPermissionRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            setPermission(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> setTimeBasedAutoScalingAsync(
            SetTimeBasedAutoScalingRequest request) {

        return setTimeBasedAutoScalingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> setTimeBasedAutoScalingAsync(
            final SetTimeBasedAutoScalingRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetTimeBasedAutoScalingRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            setTimeBasedAutoScaling(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> startInstanceAsync(
            StartInstanceRequest request) {

        return startInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> startInstanceAsync(
            final StartInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartInstanceRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            startInstance(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> startStackAsync(
            StartStackRequest request) {

        return startStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> startStackAsync(
            final StartStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartStackRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            startStack(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> stopInstanceAsync(
            StopInstanceRequest request) {

        return stopInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> stopInstanceAsync(
            final StopInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopInstanceRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            stopInstance(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> stopStackAsync(
            StopStackRequest request) {

        return stopStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> stopStackAsync(
            final StopStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopStackRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            stopStack(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> unassignInstanceAsync(
            UnassignInstanceRequest request) {

        return unassignInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> unassignInstanceAsync(
            final UnassignInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnassignInstanceRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            unassignInstance(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> unassignVolumeAsync(
            UnassignVolumeRequest request) {

        return unassignVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> unassignVolumeAsync(
            final UnassignVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnassignVolumeRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            unassignVolume(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> updateAppAsync(
            UpdateAppRequest request) {

        return updateAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateAppAsync(
            final UpdateAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAppRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            updateApp(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> updateElasticIpAsync(
            UpdateElasticIpRequest request) {

        return updateElasticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateElasticIpAsync(
            final UpdateElasticIpRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateElasticIpRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            updateElasticIp(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> updateInstanceAsync(
            UpdateInstanceRequest request) {

        return updateInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateInstanceAsync(
            final UpdateInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateInstanceRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            updateInstance(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> updateLayerAsync(
            UpdateLayerRequest request) {

        return updateLayerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateLayerAsync(
            final UpdateLayerRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLayerRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            updateLayer(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> updateMyUserProfileAsync(
            UpdateMyUserProfileRequest request) {

        return updateMyUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateMyUserProfileAsync(
            final UpdateMyUserProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMyUserProfileRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            updateMyUserProfile(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> updateRdsDbInstanceAsync(
            UpdateRdsDbInstanceRequest request) {

        return updateRdsDbInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateRdsDbInstanceAsync(
            final UpdateRdsDbInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRdsDbInstanceRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            updateRdsDbInstance(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> updateStackAsync(
            UpdateStackRequest request) {

        return updateStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateStackAsync(
            final UpdateStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateStackRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            updateStack(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> updateUserProfileAsync(
            UpdateUserProfileRequest request) {

        return updateUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateUserProfileAsync(
            final UpdateUserProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserProfileRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            updateUserProfile(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> updateVolumeAsync(
            UpdateVolumeRequest request) {

        return updateVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateVolumeAsync(
            final UpdateVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateVolumeRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            updateVolume(request);
                            result = null;
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
}
