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
package com.amazonaws.services.opsworks;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing AWS OpsWorks asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS OpsWorks</fullname>
 * <p>
 * Welcome to the <i>AWS OpsWorks Stacks API Reference</i>. This guide provides descriptions, syntax, and usage examples
 * for AWS OpsWorks Stacks actions and data types, including common parameters and error codes.
 * </p>
 * <p>
 * AWS OpsWorks Stacks is an application management service that provides an integrated experience for overseeing the
 * complete application lifecycle. For information about this product, go to the <a
 * href="http://aws.amazon.com/opsworks/">AWS OpsWorks</a> details page.
 * </p>
 * <p>
 * <b>SDKs and CLI</b>
 * </p>
 * <p>
 * The most common way to use the AWS OpsWorks Stacks API is by using the AWS Command Line Interface (CLI) or by using
 * one of the AWS SDKs to implement applications in your preferred language. For more information, see:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/cli/latest/userguide/cli-chap-welcome.html">AWS CLI</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="http://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/opsworks/AWSOpsWorksClient.html">
 * AWS SDK for Java</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/sdkfornet/latest/apidocs/html/N_Amazon_OpsWorks.htm">AWS SDK for .NET</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/aws-sdk-php-2/latest/class-Aws.OpsWorks.OpsWorksClient.html">AWS SDK for PHP
 * 2</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/sdkforruby/api/">AWS SDK for Ruby</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/documentation/sdkforjavascript/">AWS SDK for Node.js</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.pythonboto.org/en/latest/ref/opsworks.html">AWS SDK for Python(Boto)</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * AWS OpsWorks Stacks supports the following endpoints, all HTTPS. You must connect to one of the following endpoints.
 * Stacks can only be accessed or managed within the endpoint in which they are created.
 * </p>
 * <ul>
 * <li>
 * <p>
 * opsworks.us-east-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.us-east-2.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.us-west-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.us-west-2.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.ca-central-1.amazonaws.com (API only; not available in the AWS console)
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.eu-west-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.eu-west-2.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.eu-west-3.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.eu-central-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.ap-northeast-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.ap-northeast-2.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.ap-south-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.ap-southeast-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.ap-southeast-2.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.sa-east-1.amazonaws.com
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Chef Versions</b>
 * </p>
 * <p>
 * When you call <a>CreateStack</a>, <a>CloneStack</a>, or <a>UpdateStack</a> we recommend you use the
 * <code>ConfigurationManager</code> parameter to specify the Chef version. The recommended and default value for Linux
 * stacks is currently 12. Windows stacks use Chef 12.2. For more information, see <a
 * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-chef11.html">Chef Versions</a>.
 * </p>
 * <note>
 * <p>
 * You can specify Chef 12, 11.10, or 11.4 for your Linux stack. We recommend migrating your existing Linux stacks to
 * Chef 12 as soon as possible.
 * </p>
 * </note>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSOpsWorksAsyncClient extends AWSOpsWorksClient implements AWSOpsWorksAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS OpsWorks. A credentials provider chain will
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
     * @deprecated use {@link AWSOpsWorksAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSOpsWorksAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS OpsWorks. A credentials provider chain will
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
     *        The client configuration options controlling how this client connects to AWS OpsWorks (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSOpsWorksAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSOpsWorksAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS OpsWorks using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSOpsWorksAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSOpsWorksAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS OpsWorks using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSOpsWorksAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSOpsWorksAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSOpsWorksAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS OpsWorks using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSOpsWorksAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSOpsWorksAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSOpsWorksAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSOpsWorksAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS OpsWorks using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSOpsWorksAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSOpsWorksAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS OpsWorks using the provided AWS account
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
     * @deprecated use {@link AWSOpsWorksAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSOpsWorksAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSOpsWorksAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS OpsWorks using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSOpsWorksAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSOpsWorksAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSOpsWorksAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS OpsWorks using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSOpsWorksAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSOpsWorksAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSOpsWorksAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSOpsWorksAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSOpsWorksAsyncClientBuilder asyncBuilder() {
        return AWSOpsWorksAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS OpsWorks using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSOpsWorksAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AssignInstanceResult> assignInstanceAsync(AssignInstanceRequest request) {

        return assignInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssignInstanceResult> assignInstanceAsync(final AssignInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssignInstanceRequest, AssignInstanceResult> asyncHandler) {
        final AssignInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssignInstanceResult>() {
            @Override
            public AssignInstanceResult call() throws Exception {
                AssignInstanceResult result = null;

                try {
                    result = executeAssignInstance(finalRequest);
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
    public java.util.concurrent.Future<AssignVolumeResult> assignVolumeAsync(AssignVolumeRequest request) {

        return assignVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssignVolumeResult> assignVolumeAsync(final AssignVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssignVolumeRequest, AssignVolumeResult> asyncHandler) {
        final AssignVolumeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssignVolumeResult>() {
            @Override
            public AssignVolumeResult call() throws Exception {
                AssignVolumeResult result = null;

                try {
                    result = executeAssignVolume(finalRequest);
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
    public java.util.concurrent.Future<AssociateElasticIpResult> associateElasticIpAsync(AssociateElasticIpRequest request) {

        return associateElasticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateElasticIpResult> associateElasticIpAsync(final AssociateElasticIpRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateElasticIpRequest, AssociateElasticIpResult> asyncHandler) {
        final AssociateElasticIpRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateElasticIpResult>() {
            @Override
            public AssociateElasticIpResult call() throws Exception {
                AssociateElasticIpResult result = null;

                try {
                    result = executeAssociateElasticIp(finalRequest);
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
    public java.util.concurrent.Future<AttachElasticLoadBalancerResult> attachElasticLoadBalancerAsync(AttachElasticLoadBalancerRequest request) {

        return attachElasticLoadBalancerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachElasticLoadBalancerResult> attachElasticLoadBalancerAsync(final AttachElasticLoadBalancerRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachElasticLoadBalancerRequest, AttachElasticLoadBalancerResult> asyncHandler) {
        final AttachElasticLoadBalancerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AttachElasticLoadBalancerResult>() {
            @Override
            public AttachElasticLoadBalancerResult call() throws Exception {
                AttachElasticLoadBalancerResult result = null;

                try {
                    result = executeAttachElasticLoadBalancer(finalRequest);
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
    public java.util.concurrent.Future<CloneStackResult> cloneStackAsync(CloneStackRequest request) {

        return cloneStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CloneStackResult> cloneStackAsync(final CloneStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<CloneStackRequest, CloneStackResult> asyncHandler) {
        final CloneStackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CloneStackResult>() {
            @Override
            public CloneStackResult call() throws Exception {
                CloneStackResult result = null;

                try {
                    result = executeCloneStack(finalRequest);
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
    public java.util.concurrent.Future<CreateAppResult> createAppAsync(CreateAppRequest request) {

        return createAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAppResult> createAppAsync(final CreateAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAppRequest, CreateAppResult> asyncHandler) {
        final CreateAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAppResult>() {
            @Override
            public CreateAppResult call() throws Exception {
                CreateAppResult result = null;

                try {
                    result = executeCreateApp(finalRequest);
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
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest request) {

        return createDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(final CreateDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler) {
        final CreateDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDeploymentResult>() {
            @Override
            public CreateDeploymentResult call() throws Exception {
                CreateDeploymentResult result = null;

                try {
                    result = executeCreateDeployment(finalRequest);
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
    public java.util.concurrent.Future<CreateInstanceResult> createInstanceAsync(CreateInstanceRequest request) {

        return createInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInstanceResult> createInstanceAsync(final CreateInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInstanceRequest, CreateInstanceResult> asyncHandler) {
        final CreateInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateInstanceResult>() {
            @Override
            public CreateInstanceResult call() throws Exception {
                CreateInstanceResult result = null;

                try {
                    result = executeCreateInstance(finalRequest);
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
    public java.util.concurrent.Future<CreateLayerResult> createLayerAsync(CreateLayerRequest request) {

        return createLayerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLayerResult> createLayerAsync(final CreateLayerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLayerRequest, CreateLayerResult> asyncHandler) {
        final CreateLayerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLayerResult>() {
            @Override
            public CreateLayerResult call() throws Exception {
                CreateLayerResult result = null;

                try {
                    result = executeCreateLayer(finalRequest);
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
    public java.util.concurrent.Future<CreateStackResult> createStackAsync(CreateStackRequest request) {

        return createStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStackResult> createStackAsync(final CreateStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStackRequest, CreateStackResult> asyncHandler) {
        final CreateStackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStackResult>() {
            @Override
            public CreateStackResult call() throws Exception {
                CreateStackResult result = null;

                try {
                    result = executeCreateStack(finalRequest);
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
    public java.util.concurrent.Future<CreateUserProfileResult> createUserProfileAsync(CreateUserProfileRequest request) {

        return createUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserProfileResult> createUserProfileAsync(final CreateUserProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserProfileRequest, CreateUserProfileResult> asyncHandler) {
        final CreateUserProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUserProfileResult>() {
            @Override
            public CreateUserProfileResult call() throws Exception {
                CreateUserProfileResult result = null;

                try {
                    result = executeCreateUserProfile(finalRequest);
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
    public java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest request) {

        return deleteAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(final DeleteAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAppRequest, DeleteAppResult> asyncHandler) {
        final DeleteAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAppResult>() {
            @Override
            public DeleteAppResult call() throws Exception {
                DeleteAppResult result = null;

                try {
                    result = executeDeleteApp(finalRequest);
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
    public java.util.concurrent.Future<DeleteInstanceResult> deleteInstanceAsync(DeleteInstanceRequest request) {

        return deleteInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInstanceResult> deleteInstanceAsync(final DeleteInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInstanceRequest, DeleteInstanceResult> asyncHandler) {
        final DeleteInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteInstanceResult>() {
            @Override
            public DeleteInstanceResult call() throws Exception {
                DeleteInstanceResult result = null;

                try {
                    result = executeDeleteInstance(finalRequest);
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
    public java.util.concurrent.Future<DeleteLayerResult> deleteLayerAsync(DeleteLayerRequest request) {

        return deleteLayerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLayerResult> deleteLayerAsync(final DeleteLayerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLayerRequest, DeleteLayerResult> asyncHandler) {
        final DeleteLayerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLayerResult>() {
            @Override
            public DeleteLayerResult call() throws Exception {
                DeleteLayerResult result = null;

                try {
                    result = executeDeleteLayer(finalRequest);
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
    public java.util.concurrent.Future<DeleteStackResult> deleteStackAsync(DeleteStackRequest request) {

        return deleteStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStackResult> deleteStackAsync(final DeleteStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStackRequest, DeleteStackResult> asyncHandler) {
        final DeleteStackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStackResult>() {
            @Override
            public DeleteStackResult call() throws Exception {
                DeleteStackResult result = null;

                try {
                    result = executeDeleteStack(finalRequest);
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
    public java.util.concurrent.Future<DeleteUserProfileResult> deleteUserProfileAsync(DeleteUserProfileRequest request) {

        return deleteUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserProfileResult> deleteUserProfileAsync(final DeleteUserProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserProfileRequest, DeleteUserProfileResult> asyncHandler) {
        final DeleteUserProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserProfileResult>() {
            @Override
            public DeleteUserProfileResult call() throws Exception {
                DeleteUserProfileResult result = null;

                try {
                    result = executeDeleteUserProfile(finalRequest);
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
    public java.util.concurrent.Future<DeregisterEcsClusterResult> deregisterEcsClusterAsync(DeregisterEcsClusterRequest request) {

        return deregisterEcsClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterEcsClusterResult> deregisterEcsClusterAsync(final DeregisterEcsClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterEcsClusterRequest, DeregisterEcsClusterResult> asyncHandler) {
        final DeregisterEcsClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterEcsClusterResult>() {
            @Override
            public DeregisterEcsClusterResult call() throws Exception {
                DeregisterEcsClusterResult result = null;

                try {
                    result = executeDeregisterEcsCluster(finalRequest);
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
    public java.util.concurrent.Future<DeregisterElasticIpResult> deregisterElasticIpAsync(DeregisterElasticIpRequest request) {

        return deregisterElasticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterElasticIpResult> deregisterElasticIpAsync(final DeregisterElasticIpRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterElasticIpRequest, DeregisterElasticIpResult> asyncHandler) {
        final DeregisterElasticIpRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterElasticIpResult>() {
            @Override
            public DeregisterElasticIpResult call() throws Exception {
                DeregisterElasticIpResult result = null;

                try {
                    result = executeDeregisterElasticIp(finalRequest);
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
    public java.util.concurrent.Future<DeregisterInstanceResult> deregisterInstanceAsync(DeregisterInstanceRequest request) {

        return deregisterInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterInstanceResult> deregisterInstanceAsync(final DeregisterInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterInstanceRequest, DeregisterInstanceResult> asyncHandler) {
        final DeregisterInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterInstanceResult>() {
            @Override
            public DeregisterInstanceResult call() throws Exception {
                DeregisterInstanceResult result = null;

                try {
                    result = executeDeregisterInstance(finalRequest);
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
    public java.util.concurrent.Future<DeregisterRdsDbInstanceResult> deregisterRdsDbInstanceAsync(DeregisterRdsDbInstanceRequest request) {

        return deregisterRdsDbInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterRdsDbInstanceResult> deregisterRdsDbInstanceAsync(final DeregisterRdsDbInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterRdsDbInstanceRequest, DeregisterRdsDbInstanceResult> asyncHandler) {
        final DeregisterRdsDbInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterRdsDbInstanceResult>() {
            @Override
            public DeregisterRdsDbInstanceResult call() throws Exception {
                DeregisterRdsDbInstanceResult result = null;

                try {
                    result = executeDeregisterRdsDbInstance(finalRequest);
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
    public java.util.concurrent.Future<DeregisterVolumeResult> deregisterVolumeAsync(DeregisterVolumeRequest request) {

        return deregisterVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterVolumeResult> deregisterVolumeAsync(final DeregisterVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterVolumeRequest, DeregisterVolumeResult> asyncHandler) {
        final DeregisterVolumeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterVolumeResult>() {
            @Override
            public DeregisterVolumeResult call() throws Exception {
                DeregisterVolumeResult result = null;

                try {
                    result = executeDeregisterVolume(finalRequest);
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
    public java.util.concurrent.Future<DescribeAgentVersionsResult> describeAgentVersionsAsync(DescribeAgentVersionsRequest request) {

        return describeAgentVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAgentVersionsResult> describeAgentVersionsAsync(final DescribeAgentVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAgentVersionsRequest, DescribeAgentVersionsResult> asyncHandler) {
        final DescribeAgentVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAgentVersionsResult>() {
            @Override
            public DescribeAgentVersionsResult call() throws Exception {
                DescribeAgentVersionsResult result = null;

                try {
                    result = executeDescribeAgentVersions(finalRequest);
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
    public java.util.concurrent.Future<DescribeAppsResult> describeAppsAsync(DescribeAppsRequest request) {

        return describeAppsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppsResult> describeAppsAsync(final DescribeAppsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAppsRequest, DescribeAppsResult> asyncHandler) {
        final DescribeAppsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAppsResult>() {
            @Override
            public DescribeAppsResult call() throws Exception {
                DescribeAppsResult result = null;

                try {
                    result = executeDescribeApps(finalRequest);
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
    public java.util.concurrent.Future<DescribeCommandsResult> describeCommandsAsync(DescribeCommandsRequest request) {

        return describeCommandsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCommandsResult> describeCommandsAsync(final DescribeCommandsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCommandsRequest, DescribeCommandsResult> asyncHandler) {
        final DescribeCommandsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCommandsResult>() {
            @Override
            public DescribeCommandsResult call() throws Exception {
                DescribeCommandsResult result = null;

                try {
                    result = executeDescribeCommands(finalRequest);
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
    public java.util.concurrent.Future<DescribeDeploymentsResult> describeDeploymentsAsync(DescribeDeploymentsRequest request) {

        return describeDeploymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeploymentsResult> describeDeploymentsAsync(final DescribeDeploymentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDeploymentsRequest, DescribeDeploymentsResult> asyncHandler) {
        final DescribeDeploymentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDeploymentsResult>() {
            @Override
            public DescribeDeploymentsResult call() throws Exception {
                DescribeDeploymentsResult result = null;

                try {
                    result = executeDescribeDeployments(finalRequest);
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
    public java.util.concurrent.Future<DescribeEcsClustersResult> describeEcsClustersAsync(DescribeEcsClustersRequest request) {

        return describeEcsClustersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEcsClustersResult> describeEcsClustersAsync(final DescribeEcsClustersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEcsClustersRequest, DescribeEcsClustersResult> asyncHandler) {
        final DescribeEcsClustersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEcsClustersResult>() {
            @Override
            public DescribeEcsClustersResult call() throws Exception {
                DescribeEcsClustersResult result = null;

                try {
                    result = executeDescribeEcsClusters(finalRequest);
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
    public java.util.concurrent.Future<DescribeElasticIpsResult> describeElasticIpsAsync(DescribeElasticIpsRequest request) {

        return describeElasticIpsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeElasticIpsResult> describeElasticIpsAsync(final DescribeElasticIpsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeElasticIpsRequest, DescribeElasticIpsResult> asyncHandler) {
        final DescribeElasticIpsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeElasticIpsResult>() {
            @Override
            public DescribeElasticIpsResult call() throws Exception {
                DescribeElasticIpsResult result = null;

                try {
                    result = executeDescribeElasticIps(finalRequest);
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
    public java.util.concurrent.Future<DescribeElasticLoadBalancersResult> describeElasticLoadBalancersAsync(DescribeElasticLoadBalancersRequest request) {

        return describeElasticLoadBalancersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeElasticLoadBalancersResult> describeElasticLoadBalancersAsync(final DescribeElasticLoadBalancersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeElasticLoadBalancersRequest, DescribeElasticLoadBalancersResult> asyncHandler) {
        final DescribeElasticLoadBalancersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeElasticLoadBalancersResult>() {
            @Override
            public DescribeElasticLoadBalancersResult call() throws Exception {
                DescribeElasticLoadBalancersResult result = null;

                try {
                    result = executeDescribeElasticLoadBalancers(finalRequest);
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
    public java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(DescribeInstancesRequest request) {

        return describeInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(final DescribeInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstancesRequest, DescribeInstancesResult> asyncHandler) {
        final DescribeInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstancesResult>() {
            @Override
            public DescribeInstancesResult call() throws Exception {
                DescribeInstancesResult result = null;

                try {
                    result = executeDescribeInstances(finalRequest);
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
    public java.util.concurrent.Future<DescribeLayersResult> describeLayersAsync(DescribeLayersRequest request) {

        return describeLayersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLayersResult> describeLayersAsync(final DescribeLayersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLayersRequest, DescribeLayersResult> asyncHandler) {
        final DescribeLayersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLayersResult>() {
            @Override
            public DescribeLayersResult call() throws Exception {
                DescribeLayersResult result = null;

                try {
                    result = executeDescribeLayers(finalRequest);
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
    public java.util.concurrent.Future<DescribeLoadBasedAutoScalingResult> describeLoadBasedAutoScalingAsync(DescribeLoadBasedAutoScalingRequest request) {

        return describeLoadBasedAutoScalingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoadBasedAutoScalingResult> describeLoadBasedAutoScalingAsync(final DescribeLoadBasedAutoScalingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLoadBasedAutoScalingRequest, DescribeLoadBasedAutoScalingResult> asyncHandler) {
        final DescribeLoadBasedAutoScalingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLoadBasedAutoScalingResult>() {
            @Override
            public DescribeLoadBasedAutoScalingResult call() throws Exception {
                DescribeLoadBasedAutoScalingResult result = null;

                try {
                    result = executeDescribeLoadBasedAutoScaling(finalRequest);
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
    public java.util.concurrent.Future<DescribeMyUserProfileResult> describeMyUserProfileAsync(DescribeMyUserProfileRequest request) {

        return describeMyUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMyUserProfileResult> describeMyUserProfileAsync(final DescribeMyUserProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMyUserProfileRequest, DescribeMyUserProfileResult> asyncHandler) {
        final DescribeMyUserProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMyUserProfileResult>() {
            @Override
            public DescribeMyUserProfileResult call() throws Exception {
                DescribeMyUserProfileResult result = null;

                try {
                    result = executeDescribeMyUserProfile(finalRequest);
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
    public java.util.concurrent.Future<DescribeOperatingSystemsResult> describeOperatingSystemsAsync(DescribeOperatingSystemsRequest request) {

        return describeOperatingSystemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOperatingSystemsResult> describeOperatingSystemsAsync(final DescribeOperatingSystemsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOperatingSystemsRequest, DescribeOperatingSystemsResult> asyncHandler) {
        final DescribeOperatingSystemsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeOperatingSystemsResult>() {
            @Override
            public DescribeOperatingSystemsResult call() throws Exception {
                DescribeOperatingSystemsResult result = null;

                try {
                    result = executeDescribeOperatingSystems(finalRequest);
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
    public java.util.concurrent.Future<DescribePermissionsResult> describePermissionsAsync(DescribePermissionsRequest request) {

        return describePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePermissionsResult> describePermissionsAsync(final DescribePermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePermissionsRequest, DescribePermissionsResult> asyncHandler) {
        final DescribePermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePermissionsResult>() {
            @Override
            public DescribePermissionsResult call() throws Exception {
                DescribePermissionsResult result = null;

                try {
                    result = executeDescribePermissions(finalRequest);
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
    public java.util.concurrent.Future<DescribeRaidArraysResult> describeRaidArraysAsync(DescribeRaidArraysRequest request) {

        return describeRaidArraysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRaidArraysResult> describeRaidArraysAsync(final DescribeRaidArraysRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRaidArraysRequest, DescribeRaidArraysResult> asyncHandler) {
        final DescribeRaidArraysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRaidArraysResult>() {
            @Override
            public DescribeRaidArraysResult call() throws Exception {
                DescribeRaidArraysResult result = null;

                try {
                    result = executeDescribeRaidArrays(finalRequest);
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
    public java.util.concurrent.Future<DescribeRdsDbInstancesResult> describeRdsDbInstancesAsync(DescribeRdsDbInstancesRequest request) {

        return describeRdsDbInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRdsDbInstancesResult> describeRdsDbInstancesAsync(final DescribeRdsDbInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRdsDbInstancesRequest, DescribeRdsDbInstancesResult> asyncHandler) {
        final DescribeRdsDbInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRdsDbInstancesResult>() {
            @Override
            public DescribeRdsDbInstancesResult call() throws Exception {
                DescribeRdsDbInstancesResult result = null;

                try {
                    result = executeDescribeRdsDbInstances(finalRequest);
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
    public java.util.concurrent.Future<DescribeServiceErrorsResult> describeServiceErrorsAsync(DescribeServiceErrorsRequest request) {

        return describeServiceErrorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeServiceErrorsResult> describeServiceErrorsAsync(final DescribeServiceErrorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeServiceErrorsRequest, DescribeServiceErrorsResult> asyncHandler) {
        final DescribeServiceErrorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeServiceErrorsResult>() {
            @Override
            public DescribeServiceErrorsResult call() throws Exception {
                DescribeServiceErrorsResult result = null;

                try {
                    result = executeDescribeServiceErrors(finalRequest);
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
    public java.util.concurrent.Future<DescribeStackProvisioningParametersResult> describeStackProvisioningParametersAsync(
            DescribeStackProvisioningParametersRequest request) {

        return describeStackProvisioningParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStackProvisioningParametersResult> describeStackProvisioningParametersAsync(
            final DescribeStackProvisioningParametersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStackProvisioningParametersRequest, DescribeStackProvisioningParametersResult> asyncHandler) {
        final DescribeStackProvisioningParametersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeStackProvisioningParametersResult>() {
            @Override
            public DescribeStackProvisioningParametersResult call() throws Exception {
                DescribeStackProvisioningParametersResult result = null;

                try {
                    result = executeDescribeStackProvisioningParameters(finalRequest);
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
    public java.util.concurrent.Future<DescribeStackSummaryResult> describeStackSummaryAsync(DescribeStackSummaryRequest request) {

        return describeStackSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStackSummaryResult> describeStackSummaryAsync(final DescribeStackSummaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStackSummaryRequest, DescribeStackSummaryResult> asyncHandler) {
        final DescribeStackSummaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeStackSummaryResult>() {
            @Override
            public DescribeStackSummaryResult call() throws Exception {
                DescribeStackSummaryResult result = null;

                try {
                    result = executeDescribeStackSummary(finalRequest);
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
    public java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(DescribeStacksRequest request) {

        return describeStacksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(final DescribeStacksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStacksRequest, DescribeStacksResult> asyncHandler) {
        final DescribeStacksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeStacksResult>() {
            @Override
            public DescribeStacksResult call() throws Exception {
                DescribeStacksResult result = null;

                try {
                    result = executeDescribeStacks(finalRequest);
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
    public java.util.concurrent.Future<DescribeTimeBasedAutoScalingResult> describeTimeBasedAutoScalingAsync(DescribeTimeBasedAutoScalingRequest request) {

        return describeTimeBasedAutoScalingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTimeBasedAutoScalingResult> describeTimeBasedAutoScalingAsync(final DescribeTimeBasedAutoScalingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTimeBasedAutoScalingRequest, DescribeTimeBasedAutoScalingResult> asyncHandler) {
        final DescribeTimeBasedAutoScalingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTimeBasedAutoScalingResult>() {
            @Override
            public DescribeTimeBasedAutoScalingResult call() throws Exception {
                DescribeTimeBasedAutoScalingResult result = null;

                try {
                    result = executeDescribeTimeBasedAutoScaling(finalRequest);
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
    public java.util.concurrent.Future<DescribeUserProfilesResult> describeUserProfilesAsync(DescribeUserProfilesRequest request) {

        return describeUserProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserProfilesResult> describeUserProfilesAsync(final DescribeUserProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUserProfilesRequest, DescribeUserProfilesResult> asyncHandler) {
        final DescribeUserProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUserProfilesResult>() {
            @Override
            public DescribeUserProfilesResult call() throws Exception {
                DescribeUserProfilesResult result = null;

                try {
                    result = executeDescribeUserProfiles(finalRequest);
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
    public java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync(DescribeVolumesRequest request) {

        return describeVolumesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync(final DescribeVolumesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVolumesRequest, DescribeVolumesResult> asyncHandler) {
        final DescribeVolumesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVolumesResult>() {
            @Override
            public DescribeVolumesResult call() throws Exception {
                DescribeVolumesResult result = null;

                try {
                    result = executeDescribeVolumes(finalRequest);
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
    public java.util.concurrent.Future<DetachElasticLoadBalancerResult> detachElasticLoadBalancerAsync(DetachElasticLoadBalancerRequest request) {

        return detachElasticLoadBalancerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachElasticLoadBalancerResult> detachElasticLoadBalancerAsync(final DetachElasticLoadBalancerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachElasticLoadBalancerRequest, DetachElasticLoadBalancerResult> asyncHandler) {
        final DetachElasticLoadBalancerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetachElasticLoadBalancerResult>() {
            @Override
            public DetachElasticLoadBalancerResult call() throws Exception {
                DetachElasticLoadBalancerResult result = null;

                try {
                    result = executeDetachElasticLoadBalancer(finalRequest);
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
    public java.util.concurrent.Future<DisassociateElasticIpResult> disassociateElasticIpAsync(DisassociateElasticIpRequest request) {

        return disassociateElasticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateElasticIpResult> disassociateElasticIpAsync(final DisassociateElasticIpRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateElasticIpRequest, DisassociateElasticIpResult> asyncHandler) {
        final DisassociateElasticIpRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateElasticIpResult>() {
            @Override
            public DisassociateElasticIpResult call() throws Exception {
                DisassociateElasticIpResult result = null;

                try {
                    result = executeDisassociateElasticIp(finalRequest);
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
    public java.util.concurrent.Future<GetHostnameSuggestionResult> getHostnameSuggestionAsync(GetHostnameSuggestionRequest request) {

        return getHostnameSuggestionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHostnameSuggestionResult> getHostnameSuggestionAsync(final GetHostnameSuggestionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetHostnameSuggestionRequest, GetHostnameSuggestionResult> asyncHandler) {
        final GetHostnameSuggestionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetHostnameSuggestionResult>() {
            @Override
            public GetHostnameSuggestionResult call() throws Exception {
                GetHostnameSuggestionResult result = null;

                try {
                    result = executeGetHostnameSuggestion(finalRequest);
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
    public java.util.concurrent.Future<GrantAccessResult> grantAccessAsync(GrantAccessRequest request) {

        return grantAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GrantAccessResult> grantAccessAsync(final GrantAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<GrantAccessRequest, GrantAccessResult> asyncHandler) {
        final GrantAccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GrantAccessResult>() {
            @Override
            public GrantAccessResult call() throws Exception {
                GrantAccessResult result = null;

                try {
                    result = executeGrantAccess(finalRequest);
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
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest request) {

        return listTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(final ListTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler) {
        final ListTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsResult>() {
            @Override
            public ListTagsResult call() throws Exception {
                ListTagsResult result = null;

                try {
                    result = executeListTags(finalRequest);
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
    public java.util.concurrent.Future<RebootInstanceResult> rebootInstanceAsync(RebootInstanceRequest request) {

        return rebootInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RebootInstanceResult> rebootInstanceAsync(final RebootInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RebootInstanceRequest, RebootInstanceResult> asyncHandler) {
        final RebootInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RebootInstanceResult>() {
            @Override
            public RebootInstanceResult call() throws Exception {
                RebootInstanceResult result = null;

                try {
                    result = executeRebootInstance(finalRequest);
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
    public java.util.concurrent.Future<RegisterEcsClusterResult> registerEcsClusterAsync(RegisterEcsClusterRequest request) {

        return registerEcsClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterEcsClusterResult> registerEcsClusterAsync(final RegisterEcsClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterEcsClusterRequest, RegisterEcsClusterResult> asyncHandler) {
        final RegisterEcsClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterEcsClusterResult>() {
            @Override
            public RegisterEcsClusterResult call() throws Exception {
                RegisterEcsClusterResult result = null;

                try {
                    result = executeRegisterEcsCluster(finalRequest);
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
    public java.util.concurrent.Future<RegisterElasticIpResult> registerElasticIpAsync(RegisterElasticIpRequest request) {

        return registerElasticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterElasticIpResult> registerElasticIpAsync(final RegisterElasticIpRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterElasticIpRequest, RegisterElasticIpResult> asyncHandler) {
        final RegisterElasticIpRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterElasticIpResult>() {
            @Override
            public RegisterElasticIpResult call() throws Exception {
                RegisterElasticIpResult result = null;

                try {
                    result = executeRegisterElasticIp(finalRequest);
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
    public java.util.concurrent.Future<RegisterInstanceResult> registerInstanceAsync(RegisterInstanceRequest request) {

        return registerInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterInstanceResult> registerInstanceAsync(final RegisterInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterInstanceRequest, RegisterInstanceResult> asyncHandler) {
        final RegisterInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterInstanceResult>() {
            @Override
            public RegisterInstanceResult call() throws Exception {
                RegisterInstanceResult result = null;

                try {
                    result = executeRegisterInstance(finalRequest);
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
    public java.util.concurrent.Future<RegisterRdsDbInstanceResult> registerRdsDbInstanceAsync(RegisterRdsDbInstanceRequest request) {

        return registerRdsDbInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterRdsDbInstanceResult> registerRdsDbInstanceAsync(final RegisterRdsDbInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterRdsDbInstanceRequest, RegisterRdsDbInstanceResult> asyncHandler) {
        final RegisterRdsDbInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterRdsDbInstanceResult>() {
            @Override
            public RegisterRdsDbInstanceResult call() throws Exception {
                RegisterRdsDbInstanceResult result = null;

                try {
                    result = executeRegisterRdsDbInstance(finalRequest);
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
    public java.util.concurrent.Future<RegisterVolumeResult> registerVolumeAsync(RegisterVolumeRequest request) {

        return registerVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterVolumeResult> registerVolumeAsync(final RegisterVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterVolumeRequest, RegisterVolumeResult> asyncHandler) {
        final RegisterVolumeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterVolumeResult>() {
            @Override
            public RegisterVolumeResult call() throws Exception {
                RegisterVolumeResult result = null;

                try {
                    result = executeRegisterVolume(finalRequest);
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
    public java.util.concurrent.Future<SetLoadBasedAutoScalingResult> setLoadBasedAutoScalingAsync(SetLoadBasedAutoScalingRequest request) {

        return setLoadBasedAutoScalingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetLoadBasedAutoScalingResult> setLoadBasedAutoScalingAsync(final SetLoadBasedAutoScalingRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetLoadBasedAutoScalingRequest, SetLoadBasedAutoScalingResult> asyncHandler) {
        final SetLoadBasedAutoScalingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetLoadBasedAutoScalingResult>() {
            @Override
            public SetLoadBasedAutoScalingResult call() throws Exception {
                SetLoadBasedAutoScalingResult result = null;

                try {
                    result = executeSetLoadBasedAutoScaling(finalRequest);
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
    public java.util.concurrent.Future<SetPermissionResult> setPermissionAsync(SetPermissionRequest request) {

        return setPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetPermissionResult> setPermissionAsync(final SetPermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetPermissionRequest, SetPermissionResult> asyncHandler) {
        final SetPermissionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetPermissionResult>() {
            @Override
            public SetPermissionResult call() throws Exception {
                SetPermissionResult result = null;

                try {
                    result = executeSetPermission(finalRequest);
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
    public java.util.concurrent.Future<SetTimeBasedAutoScalingResult> setTimeBasedAutoScalingAsync(SetTimeBasedAutoScalingRequest request) {

        return setTimeBasedAutoScalingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetTimeBasedAutoScalingResult> setTimeBasedAutoScalingAsync(final SetTimeBasedAutoScalingRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetTimeBasedAutoScalingRequest, SetTimeBasedAutoScalingResult> asyncHandler) {
        final SetTimeBasedAutoScalingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetTimeBasedAutoScalingResult>() {
            @Override
            public SetTimeBasedAutoScalingResult call() throws Exception {
                SetTimeBasedAutoScalingResult result = null;

                try {
                    result = executeSetTimeBasedAutoScaling(finalRequest);
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
    public java.util.concurrent.Future<StartInstanceResult> startInstanceAsync(StartInstanceRequest request) {

        return startInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartInstanceResult> startInstanceAsync(final StartInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartInstanceRequest, StartInstanceResult> asyncHandler) {
        final StartInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartInstanceResult>() {
            @Override
            public StartInstanceResult call() throws Exception {
                StartInstanceResult result = null;

                try {
                    result = executeStartInstance(finalRequest);
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
    public java.util.concurrent.Future<StartStackResult> startStackAsync(StartStackRequest request) {

        return startStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartStackResult> startStackAsync(final StartStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartStackRequest, StartStackResult> asyncHandler) {
        final StartStackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartStackResult>() {
            @Override
            public StartStackResult call() throws Exception {
                StartStackResult result = null;

                try {
                    result = executeStartStack(finalRequest);
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
    public java.util.concurrent.Future<StopInstanceResult> stopInstanceAsync(StopInstanceRequest request) {

        return stopInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopInstanceResult> stopInstanceAsync(final StopInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopInstanceRequest, StopInstanceResult> asyncHandler) {
        final StopInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopInstanceResult>() {
            @Override
            public StopInstanceResult call() throws Exception {
                StopInstanceResult result = null;

                try {
                    result = executeStopInstance(finalRequest);
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
    public java.util.concurrent.Future<StopStackResult> stopStackAsync(StopStackRequest request) {

        return stopStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopStackResult> stopStackAsync(final StopStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopStackRequest, StopStackResult> asyncHandler) {
        final StopStackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopStackResult>() {
            @Override
            public StopStackResult call() throws Exception {
                StopStackResult result = null;

                try {
                    result = executeStopStack(finalRequest);
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
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
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
    public java.util.concurrent.Future<UnassignInstanceResult> unassignInstanceAsync(UnassignInstanceRequest request) {

        return unassignInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnassignInstanceResult> unassignInstanceAsync(final UnassignInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnassignInstanceRequest, UnassignInstanceResult> asyncHandler) {
        final UnassignInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UnassignInstanceResult>() {
            @Override
            public UnassignInstanceResult call() throws Exception {
                UnassignInstanceResult result = null;

                try {
                    result = executeUnassignInstance(finalRequest);
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
    public java.util.concurrent.Future<UnassignVolumeResult> unassignVolumeAsync(UnassignVolumeRequest request) {

        return unassignVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnassignVolumeResult> unassignVolumeAsync(final UnassignVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnassignVolumeRequest, UnassignVolumeResult> asyncHandler) {
        final UnassignVolumeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UnassignVolumeResult>() {
            @Override
            public UnassignVolumeResult call() throws Exception {
                UnassignVolumeResult result = null;

                try {
                    result = executeUnassignVolume(finalRequest);
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
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
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
    public java.util.concurrent.Future<UpdateAppResult> updateAppAsync(UpdateAppRequest request) {

        return updateAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAppResult> updateAppAsync(final UpdateAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAppRequest, UpdateAppResult> asyncHandler) {
        final UpdateAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAppResult>() {
            @Override
            public UpdateAppResult call() throws Exception {
                UpdateAppResult result = null;

                try {
                    result = executeUpdateApp(finalRequest);
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
    public java.util.concurrent.Future<UpdateElasticIpResult> updateElasticIpAsync(UpdateElasticIpRequest request) {

        return updateElasticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateElasticIpResult> updateElasticIpAsync(final UpdateElasticIpRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateElasticIpRequest, UpdateElasticIpResult> asyncHandler) {
        final UpdateElasticIpRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateElasticIpResult>() {
            @Override
            public UpdateElasticIpResult call() throws Exception {
                UpdateElasticIpResult result = null;

                try {
                    result = executeUpdateElasticIp(finalRequest);
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
    public java.util.concurrent.Future<UpdateInstanceResult> updateInstanceAsync(UpdateInstanceRequest request) {

        return updateInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateInstanceResult> updateInstanceAsync(final UpdateInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateInstanceRequest, UpdateInstanceResult> asyncHandler) {
        final UpdateInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateInstanceResult>() {
            @Override
            public UpdateInstanceResult call() throws Exception {
                UpdateInstanceResult result = null;

                try {
                    result = executeUpdateInstance(finalRequest);
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
    public java.util.concurrent.Future<UpdateLayerResult> updateLayerAsync(UpdateLayerRequest request) {

        return updateLayerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLayerResult> updateLayerAsync(final UpdateLayerRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLayerRequest, UpdateLayerResult> asyncHandler) {
        final UpdateLayerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLayerResult>() {
            @Override
            public UpdateLayerResult call() throws Exception {
                UpdateLayerResult result = null;

                try {
                    result = executeUpdateLayer(finalRequest);
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
    public java.util.concurrent.Future<UpdateMyUserProfileResult> updateMyUserProfileAsync(UpdateMyUserProfileRequest request) {

        return updateMyUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMyUserProfileResult> updateMyUserProfileAsync(final UpdateMyUserProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMyUserProfileRequest, UpdateMyUserProfileResult> asyncHandler) {
        final UpdateMyUserProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMyUserProfileResult>() {
            @Override
            public UpdateMyUserProfileResult call() throws Exception {
                UpdateMyUserProfileResult result = null;

                try {
                    result = executeUpdateMyUserProfile(finalRequest);
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
    public java.util.concurrent.Future<UpdateRdsDbInstanceResult> updateRdsDbInstanceAsync(UpdateRdsDbInstanceRequest request) {

        return updateRdsDbInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRdsDbInstanceResult> updateRdsDbInstanceAsync(final UpdateRdsDbInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRdsDbInstanceRequest, UpdateRdsDbInstanceResult> asyncHandler) {
        final UpdateRdsDbInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRdsDbInstanceResult>() {
            @Override
            public UpdateRdsDbInstanceResult call() throws Exception {
                UpdateRdsDbInstanceResult result = null;

                try {
                    result = executeUpdateRdsDbInstance(finalRequest);
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
    public java.util.concurrent.Future<UpdateStackResult> updateStackAsync(UpdateStackRequest request) {

        return updateStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStackResult> updateStackAsync(final UpdateStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateStackRequest, UpdateStackResult> asyncHandler) {
        final UpdateStackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateStackResult>() {
            @Override
            public UpdateStackResult call() throws Exception {
                UpdateStackResult result = null;

                try {
                    result = executeUpdateStack(finalRequest);
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
    public java.util.concurrent.Future<UpdateUserProfileResult> updateUserProfileAsync(UpdateUserProfileRequest request) {

        return updateUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserProfileResult> updateUserProfileAsync(final UpdateUserProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserProfileRequest, UpdateUserProfileResult> asyncHandler) {
        final UpdateUserProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserProfileResult>() {
            @Override
            public UpdateUserProfileResult call() throws Exception {
                UpdateUserProfileResult result = null;

                try {
                    result = executeUpdateUserProfile(finalRequest);
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
    public java.util.concurrent.Future<UpdateVolumeResult> updateVolumeAsync(UpdateVolumeRequest request) {

        return updateVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVolumeResult> updateVolumeAsync(final UpdateVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateVolumeRequest, UpdateVolumeResult> asyncHandler) {
        final UpdateVolumeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateVolumeResult>() {
            @Override
            public UpdateVolumeResult call() throws Exception {
                UpdateVolumeResult result = null;

                try {
                    result = executeUpdateVolume(finalRequest);
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
