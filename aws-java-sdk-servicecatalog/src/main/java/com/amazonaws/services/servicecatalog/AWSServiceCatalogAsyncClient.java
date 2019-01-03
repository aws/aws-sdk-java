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
package com.amazonaws.services.servicecatalog;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing AWS Service Catalog asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Service Catalog</fullname>
 * <p>
 * <a href="https://aws.amazon.com/servicecatalog/">AWS Service Catalog</a> enables organizations to create and manage
 * catalogs of IT services that are approved for use on AWS. To get the most out of this documentation, you should be
 * familiar with the terminology discussed in <a
 * href="http://docs.aws.amazon.com/servicecatalog/latest/adminguide/what-is_concepts.html">AWS Service Catalog
 * Concepts</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSServiceCatalogAsyncClient extends AWSServiceCatalogClient implements AWSServiceCatalogAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Service Catalog. A credentials provider
     * chain will be used that searches for credentials in this order:
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
     * @deprecated use {@link AWSServiceCatalogAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSServiceCatalogAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Service Catalog. A credentials provider
     * chain will be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to AWS Service Catalog (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSServiceCatalogAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSServiceCatalogAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Service Catalog using the specified AWS
     * account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSServiceCatalogAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSServiceCatalogAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Service Catalog using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSServiceCatalogAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSServiceCatalogAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSServiceCatalogAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Service Catalog using the specified AWS
     * account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSServiceCatalogAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSServiceCatalogAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSServiceCatalogAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSServiceCatalogAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Service Catalog using the specified AWS
     * account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSServiceCatalogAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSServiceCatalogAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Service Catalog using the provided AWS
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
     * @deprecated use {@link AWSServiceCatalogAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSServiceCatalogAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSServiceCatalogAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Service Catalog using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSServiceCatalogAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSServiceCatalogAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSServiceCatalogAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Service Catalog using the specified AWS
     * account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSServiceCatalogAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSServiceCatalogAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSServiceCatalogAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSServiceCatalogAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSServiceCatalogAsyncClientBuilder asyncBuilder() {
        return AWSServiceCatalogAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Service Catalog using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSServiceCatalogAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AcceptPortfolioShareResult> acceptPortfolioShareAsync(AcceptPortfolioShareRequest request) {

        return acceptPortfolioShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptPortfolioShareResult> acceptPortfolioShareAsync(final AcceptPortfolioShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptPortfolioShareRequest, AcceptPortfolioShareResult> asyncHandler) {
        final AcceptPortfolioShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcceptPortfolioShareResult>() {
            @Override
            public AcceptPortfolioShareResult call() throws Exception {
                AcceptPortfolioShareResult result = null;

                try {
                    result = executeAcceptPortfolioShare(finalRequest);
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
    public java.util.concurrent.Future<AssociatePrincipalWithPortfolioResult> associatePrincipalWithPortfolioAsync(
            AssociatePrincipalWithPortfolioRequest request) {

        return associatePrincipalWithPortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociatePrincipalWithPortfolioResult> associatePrincipalWithPortfolioAsync(
            final AssociatePrincipalWithPortfolioRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociatePrincipalWithPortfolioRequest, AssociatePrincipalWithPortfolioResult> asyncHandler) {
        final AssociatePrincipalWithPortfolioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociatePrincipalWithPortfolioResult>() {
            @Override
            public AssociatePrincipalWithPortfolioResult call() throws Exception {
                AssociatePrincipalWithPortfolioResult result = null;

                try {
                    result = executeAssociatePrincipalWithPortfolio(finalRequest);
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
    public java.util.concurrent.Future<AssociateProductWithPortfolioResult> associateProductWithPortfolioAsync(AssociateProductWithPortfolioRequest request) {

        return associateProductWithPortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateProductWithPortfolioResult> associateProductWithPortfolioAsync(
            final AssociateProductWithPortfolioRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateProductWithPortfolioRequest, AssociateProductWithPortfolioResult> asyncHandler) {
        final AssociateProductWithPortfolioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateProductWithPortfolioResult>() {
            @Override
            public AssociateProductWithPortfolioResult call() throws Exception {
                AssociateProductWithPortfolioResult result = null;

                try {
                    result = executeAssociateProductWithPortfolio(finalRequest);
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
    public java.util.concurrent.Future<AssociateServiceActionWithProvisioningArtifactResult> associateServiceActionWithProvisioningArtifactAsync(
            AssociateServiceActionWithProvisioningArtifactRequest request) {

        return associateServiceActionWithProvisioningArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateServiceActionWithProvisioningArtifactResult> associateServiceActionWithProvisioningArtifactAsync(
            final AssociateServiceActionWithProvisioningArtifactRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateServiceActionWithProvisioningArtifactRequest, AssociateServiceActionWithProvisioningArtifactResult> asyncHandler) {
        final AssociateServiceActionWithProvisioningArtifactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateServiceActionWithProvisioningArtifactResult>() {
            @Override
            public AssociateServiceActionWithProvisioningArtifactResult call() throws Exception {
                AssociateServiceActionWithProvisioningArtifactResult result = null;

                try {
                    result = executeAssociateServiceActionWithProvisioningArtifact(finalRequest);
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
    public java.util.concurrent.Future<AssociateTagOptionWithResourceResult> associateTagOptionWithResourceAsync(AssociateTagOptionWithResourceRequest request) {

        return associateTagOptionWithResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateTagOptionWithResourceResult> associateTagOptionWithResourceAsync(
            final AssociateTagOptionWithResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateTagOptionWithResourceRequest, AssociateTagOptionWithResourceResult> asyncHandler) {
        final AssociateTagOptionWithResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateTagOptionWithResourceResult>() {
            @Override
            public AssociateTagOptionWithResourceResult call() throws Exception {
                AssociateTagOptionWithResourceResult result = null;

                try {
                    result = executeAssociateTagOptionWithResource(finalRequest);
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
    public java.util.concurrent.Future<BatchAssociateServiceActionWithProvisioningArtifactResult> batchAssociateServiceActionWithProvisioningArtifactAsync(
            BatchAssociateServiceActionWithProvisioningArtifactRequest request) {

        return batchAssociateServiceActionWithProvisioningArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchAssociateServiceActionWithProvisioningArtifactResult> batchAssociateServiceActionWithProvisioningArtifactAsync(
            final BatchAssociateServiceActionWithProvisioningArtifactRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchAssociateServiceActionWithProvisioningArtifactRequest, BatchAssociateServiceActionWithProvisioningArtifactResult> asyncHandler) {
        final BatchAssociateServiceActionWithProvisioningArtifactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchAssociateServiceActionWithProvisioningArtifactResult>() {
            @Override
            public BatchAssociateServiceActionWithProvisioningArtifactResult call() throws Exception {
                BatchAssociateServiceActionWithProvisioningArtifactResult result = null;

                try {
                    result = executeBatchAssociateServiceActionWithProvisioningArtifact(finalRequest);
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
    public java.util.concurrent.Future<BatchDisassociateServiceActionFromProvisioningArtifactResult> batchDisassociateServiceActionFromProvisioningArtifactAsync(
            BatchDisassociateServiceActionFromProvisioningArtifactRequest request) {

        return batchDisassociateServiceActionFromProvisioningArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDisassociateServiceActionFromProvisioningArtifactResult> batchDisassociateServiceActionFromProvisioningArtifactAsync(
            final BatchDisassociateServiceActionFromProvisioningArtifactRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDisassociateServiceActionFromProvisioningArtifactRequest, BatchDisassociateServiceActionFromProvisioningArtifactResult> asyncHandler) {
        final BatchDisassociateServiceActionFromProvisioningArtifactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDisassociateServiceActionFromProvisioningArtifactResult>() {
            @Override
            public BatchDisassociateServiceActionFromProvisioningArtifactResult call() throws Exception {
                BatchDisassociateServiceActionFromProvisioningArtifactResult result = null;

                try {
                    result = executeBatchDisassociateServiceActionFromProvisioningArtifact(finalRequest);
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
    public java.util.concurrent.Future<CopyProductResult> copyProductAsync(CopyProductRequest request) {

        return copyProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CopyProductResult> copyProductAsync(final CopyProductRequest request,
            final com.amazonaws.handlers.AsyncHandler<CopyProductRequest, CopyProductResult> asyncHandler) {
        final CopyProductRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CopyProductResult>() {
            @Override
            public CopyProductResult call() throws Exception {
                CopyProductResult result = null;

                try {
                    result = executeCopyProduct(finalRequest);
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
    public java.util.concurrent.Future<CreateConstraintResult> createConstraintAsync(CreateConstraintRequest request) {

        return createConstraintAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConstraintResult> createConstraintAsync(final CreateConstraintRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConstraintRequest, CreateConstraintResult> asyncHandler) {
        final CreateConstraintRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConstraintResult>() {
            @Override
            public CreateConstraintResult call() throws Exception {
                CreateConstraintResult result = null;

                try {
                    result = executeCreateConstraint(finalRequest);
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
    public java.util.concurrent.Future<CreatePortfolioResult> createPortfolioAsync(CreatePortfolioRequest request) {

        return createPortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePortfolioResult> createPortfolioAsync(final CreatePortfolioRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePortfolioRequest, CreatePortfolioResult> asyncHandler) {
        final CreatePortfolioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePortfolioResult>() {
            @Override
            public CreatePortfolioResult call() throws Exception {
                CreatePortfolioResult result = null;

                try {
                    result = executeCreatePortfolio(finalRequest);
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
    public java.util.concurrent.Future<CreatePortfolioShareResult> createPortfolioShareAsync(CreatePortfolioShareRequest request) {

        return createPortfolioShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePortfolioShareResult> createPortfolioShareAsync(final CreatePortfolioShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePortfolioShareRequest, CreatePortfolioShareResult> asyncHandler) {
        final CreatePortfolioShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePortfolioShareResult>() {
            @Override
            public CreatePortfolioShareResult call() throws Exception {
                CreatePortfolioShareResult result = null;

                try {
                    result = executeCreatePortfolioShare(finalRequest);
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
    public java.util.concurrent.Future<CreateProductResult> createProductAsync(CreateProductRequest request) {

        return createProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProductResult> createProductAsync(final CreateProductRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProductRequest, CreateProductResult> asyncHandler) {
        final CreateProductRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProductResult>() {
            @Override
            public CreateProductResult call() throws Exception {
                CreateProductResult result = null;

                try {
                    result = executeCreateProduct(finalRequest);
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
    public java.util.concurrent.Future<CreateProvisionedProductPlanResult> createProvisionedProductPlanAsync(CreateProvisionedProductPlanRequest request) {

        return createProvisionedProductPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProvisionedProductPlanResult> createProvisionedProductPlanAsync(final CreateProvisionedProductPlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProvisionedProductPlanRequest, CreateProvisionedProductPlanResult> asyncHandler) {
        final CreateProvisionedProductPlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProvisionedProductPlanResult>() {
            @Override
            public CreateProvisionedProductPlanResult call() throws Exception {
                CreateProvisionedProductPlanResult result = null;

                try {
                    result = executeCreateProvisionedProductPlan(finalRequest);
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
    public java.util.concurrent.Future<CreateProvisioningArtifactResult> createProvisioningArtifactAsync(CreateProvisioningArtifactRequest request) {

        return createProvisioningArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProvisioningArtifactResult> createProvisioningArtifactAsync(final CreateProvisioningArtifactRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProvisioningArtifactRequest, CreateProvisioningArtifactResult> asyncHandler) {
        final CreateProvisioningArtifactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProvisioningArtifactResult>() {
            @Override
            public CreateProvisioningArtifactResult call() throws Exception {
                CreateProvisioningArtifactResult result = null;

                try {
                    result = executeCreateProvisioningArtifact(finalRequest);
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
    public java.util.concurrent.Future<CreateServiceActionResult> createServiceActionAsync(CreateServiceActionRequest request) {

        return createServiceActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateServiceActionResult> createServiceActionAsync(final CreateServiceActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateServiceActionRequest, CreateServiceActionResult> asyncHandler) {
        final CreateServiceActionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateServiceActionResult>() {
            @Override
            public CreateServiceActionResult call() throws Exception {
                CreateServiceActionResult result = null;

                try {
                    result = executeCreateServiceAction(finalRequest);
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
    public java.util.concurrent.Future<CreateTagOptionResult> createTagOptionAsync(CreateTagOptionRequest request) {

        return createTagOptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTagOptionResult> createTagOptionAsync(final CreateTagOptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTagOptionRequest, CreateTagOptionResult> asyncHandler) {
        final CreateTagOptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTagOptionResult>() {
            @Override
            public CreateTagOptionResult call() throws Exception {
                CreateTagOptionResult result = null;

                try {
                    result = executeCreateTagOption(finalRequest);
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
    public java.util.concurrent.Future<DeleteConstraintResult> deleteConstraintAsync(DeleteConstraintRequest request) {

        return deleteConstraintAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConstraintResult> deleteConstraintAsync(final DeleteConstraintRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConstraintRequest, DeleteConstraintResult> asyncHandler) {
        final DeleteConstraintRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConstraintResult>() {
            @Override
            public DeleteConstraintResult call() throws Exception {
                DeleteConstraintResult result = null;

                try {
                    result = executeDeleteConstraint(finalRequest);
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
    public java.util.concurrent.Future<DeletePortfolioResult> deletePortfolioAsync(DeletePortfolioRequest request) {

        return deletePortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePortfolioResult> deletePortfolioAsync(final DeletePortfolioRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePortfolioRequest, DeletePortfolioResult> asyncHandler) {
        final DeletePortfolioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePortfolioResult>() {
            @Override
            public DeletePortfolioResult call() throws Exception {
                DeletePortfolioResult result = null;

                try {
                    result = executeDeletePortfolio(finalRequest);
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
    public java.util.concurrent.Future<DeletePortfolioShareResult> deletePortfolioShareAsync(DeletePortfolioShareRequest request) {

        return deletePortfolioShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePortfolioShareResult> deletePortfolioShareAsync(final DeletePortfolioShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePortfolioShareRequest, DeletePortfolioShareResult> asyncHandler) {
        final DeletePortfolioShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePortfolioShareResult>() {
            @Override
            public DeletePortfolioShareResult call() throws Exception {
                DeletePortfolioShareResult result = null;

                try {
                    result = executeDeletePortfolioShare(finalRequest);
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
    public java.util.concurrent.Future<DeleteProductResult> deleteProductAsync(DeleteProductRequest request) {

        return deleteProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProductResult> deleteProductAsync(final DeleteProductRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProductRequest, DeleteProductResult> asyncHandler) {
        final DeleteProductRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProductResult>() {
            @Override
            public DeleteProductResult call() throws Exception {
                DeleteProductResult result = null;

                try {
                    result = executeDeleteProduct(finalRequest);
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
    public java.util.concurrent.Future<DeleteProvisionedProductPlanResult> deleteProvisionedProductPlanAsync(DeleteProvisionedProductPlanRequest request) {

        return deleteProvisionedProductPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProvisionedProductPlanResult> deleteProvisionedProductPlanAsync(final DeleteProvisionedProductPlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProvisionedProductPlanRequest, DeleteProvisionedProductPlanResult> asyncHandler) {
        final DeleteProvisionedProductPlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProvisionedProductPlanResult>() {
            @Override
            public DeleteProvisionedProductPlanResult call() throws Exception {
                DeleteProvisionedProductPlanResult result = null;

                try {
                    result = executeDeleteProvisionedProductPlan(finalRequest);
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
    public java.util.concurrent.Future<DeleteProvisioningArtifactResult> deleteProvisioningArtifactAsync(DeleteProvisioningArtifactRequest request) {

        return deleteProvisioningArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProvisioningArtifactResult> deleteProvisioningArtifactAsync(final DeleteProvisioningArtifactRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProvisioningArtifactRequest, DeleteProvisioningArtifactResult> asyncHandler) {
        final DeleteProvisioningArtifactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProvisioningArtifactResult>() {
            @Override
            public DeleteProvisioningArtifactResult call() throws Exception {
                DeleteProvisioningArtifactResult result = null;

                try {
                    result = executeDeleteProvisioningArtifact(finalRequest);
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
    public java.util.concurrent.Future<DeleteServiceActionResult> deleteServiceActionAsync(DeleteServiceActionRequest request) {

        return deleteServiceActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteServiceActionResult> deleteServiceActionAsync(final DeleteServiceActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteServiceActionRequest, DeleteServiceActionResult> asyncHandler) {
        final DeleteServiceActionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteServiceActionResult>() {
            @Override
            public DeleteServiceActionResult call() throws Exception {
                DeleteServiceActionResult result = null;

                try {
                    result = executeDeleteServiceAction(finalRequest);
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
    public java.util.concurrent.Future<DeleteTagOptionResult> deleteTagOptionAsync(DeleteTagOptionRequest request) {

        return deleteTagOptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTagOptionResult> deleteTagOptionAsync(final DeleteTagOptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTagOptionRequest, DeleteTagOptionResult> asyncHandler) {
        final DeleteTagOptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTagOptionResult>() {
            @Override
            public DeleteTagOptionResult call() throws Exception {
                DeleteTagOptionResult result = null;

                try {
                    result = executeDeleteTagOption(finalRequest);
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
    public java.util.concurrent.Future<DescribeConstraintResult> describeConstraintAsync(DescribeConstraintRequest request) {

        return describeConstraintAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConstraintResult> describeConstraintAsync(final DescribeConstraintRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConstraintRequest, DescribeConstraintResult> asyncHandler) {
        final DescribeConstraintRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConstraintResult>() {
            @Override
            public DescribeConstraintResult call() throws Exception {
                DescribeConstraintResult result = null;

                try {
                    result = executeDescribeConstraint(finalRequest);
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
    public java.util.concurrent.Future<DescribeCopyProductStatusResult> describeCopyProductStatusAsync(DescribeCopyProductStatusRequest request) {

        return describeCopyProductStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCopyProductStatusResult> describeCopyProductStatusAsync(final DescribeCopyProductStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCopyProductStatusRequest, DescribeCopyProductStatusResult> asyncHandler) {
        final DescribeCopyProductStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCopyProductStatusResult>() {
            @Override
            public DescribeCopyProductStatusResult call() throws Exception {
                DescribeCopyProductStatusResult result = null;

                try {
                    result = executeDescribeCopyProductStatus(finalRequest);
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
    public java.util.concurrent.Future<DescribePortfolioResult> describePortfolioAsync(DescribePortfolioRequest request) {

        return describePortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePortfolioResult> describePortfolioAsync(final DescribePortfolioRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePortfolioRequest, DescribePortfolioResult> asyncHandler) {
        final DescribePortfolioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePortfolioResult>() {
            @Override
            public DescribePortfolioResult call() throws Exception {
                DescribePortfolioResult result = null;

                try {
                    result = executeDescribePortfolio(finalRequest);
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
    public java.util.concurrent.Future<DescribePortfolioShareStatusResult> describePortfolioShareStatusAsync(DescribePortfolioShareStatusRequest request) {

        return describePortfolioShareStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePortfolioShareStatusResult> describePortfolioShareStatusAsync(final DescribePortfolioShareStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePortfolioShareStatusRequest, DescribePortfolioShareStatusResult> asyncHandler) {
        final DescribePortfolioShareStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePortfolioShareStatusResult>() {
            @Override
            public DescribePortfolioShareStatusResult call() throws Exception {
                DescribePortfolioShareStatusResult result = null;

                try {
                    result = executeDescribePortfolioShareStatus(finalRequest);
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
    public java.util.concurrent.Future<DescribeProductResult> describeProductAsync(DescribeProductRequest request) {

        return describeProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProductResult> describeProductAsync(final DescribeProductRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProductRequest, DescribeProductResult> asyncHandler) {
        final DescribeProductRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProductResult>() {
            @Override
            public DescribeProductResult call() throws Exception {
                DescribeProductResult result = null;

                try {
                    result = executeDescribeProduct(finalRequest);
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
    public java.util.concurrent.Future<DescribeProductAsAdminResult> describeProductAsAdminAsync(DescribeProductAsAdminRequest request) {

        return describeProductAsAdminAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProductAsAdminResult> describeProductAsAdminAsync(final DescribeProductAsAdminRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProductAsAdminRequest, DescribeProductAsAdminResult> asyncHandler) {
        final DescribeProductAsAdminRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProductAsAdminResult>() {
            @Override
            public DescribeProductAsAdminResult call() throws Exception {
                DescribeProductAsAdminResult result = null;

                try {
                    result = executeDescribeProductAsAdmin(finalRequest);
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
    public java.util.concurrent.Future<DescribeProductViewResult> describeProductViewAsync(DescribeProductViewRequest request) {

        return describeProductViewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProductViewResult> describeProductViewAsync(final DescribeProductViewRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProductViewRequest, DescribeProductViewResult> asyncHandler) {
        final DescribeProductViewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProductViewResult>() {
            @Override
            public DescribeProductViewResult call() throws Exception {
                DescribeProductViewResult result = null;

                try {
                    result = executeDescribeProductView(finalRequest);
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
    public java.util.concurrent.Future<DescribeProvisionedProductResult> describeProvisionedProductAsync(DescribeProvisionedProductRequest request) {

        return describeProvisionedProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProvisionedProductResult> describeProvisionedProductAsync(final DescribeProvisionedProductRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProvisionedProductRequest, DescribeProvisionedProductResult> asyncHandler) {
        final DescribeProvisionedProductRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProvisionedProductResult>() {
            @Override
            public DescribeProvisionedProductResult call() throws Exception {
                DescribeProvisionedProductResult result = null;

                try {
                    result = executeDescribeProvisionedProduct(finalRequest);
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
    public java.util.concurrent.Future<DescribeProvisionedProductPlanResult> describeProvisionedProductPlanAsync(DescribeProvisionedProductPlanRequest request) {

        return describeProvisionedProductPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProvisionedProductPlanResult> describeProvisionedProductPlanAsync(
            final DescribeProvisionedProductPlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProvisionedProductPlanRequest, DescribeProvisionedProductPlanResult> asyncHandler) {
        final DescribeProvisionedProductPlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProvisionedProductPlanResult>() {
            @Override
            public DescribeProvisionedProductPlanResult call() throws Exception {
                DescribeProvisionedProductPlanResult result = null;

                try {
                    result = executeDescribeProvisionedProductPlan(finalRequest);
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
    public java.util.concurrent.Future<DescribeProvisioningArtifactResult> describeProvisioningArtifactAsync(DescribeProvisioningArtifactRequest request) {

        return describeProvisioningArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProvisioningArtifactResult> describeProvisioningArtifactAsync(final DescribeProvisioningArtifactRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProvisioningArtifactRequest, DescribeProvisioningArtifactResult> asyncHandler) {
        final DescribeProvisioningArtifactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProvisioningArtifactResult>() {
            @Override
            public DescribeProvisioningArtifactResult call() throws Exception {
                DescribeProvisioningArtifactResult result = null;

                try {
                    result = executeDescribeProvisioningArtifact(finalRequest);
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
    public java.util.concurrent.Future<DescribeProvisioningParametersResult> describeProvisioningParametersAsync(DescribeProvisioningParametersRequest request) {

        return describeProvisioningParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProvisioningParametersResult> describeProvisioningParametersAsync(
            final DescribeProvisioningParametersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProvisioningParametersRequest, DescribeProvisioningParametersResult> asyncHandler) {
        final DescribeProvisioningParametersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProvisioningParametersResult>() {
            @Override
            public DescribeProvisioningParametersResult call() throws Exception {
                DescribeProvisioningParametersResult result = null;

                try {
                    result = executeDescribeProvisioningParameters(finalRequest);
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
    public java.util.concurrent.Future<DescribeRecordResult> describeRecordAsync(DescribeRecordRequest request) {

        return describeRecordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRecordResult> describeRecordAsync(final DescribeRecordRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRecordRequest, DescribeRecordResult> asyncHandler) {
        final DescribeRecordRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRecordResult>() {
            @Override
            public DescribeRecordResult call() throws Exception {
                DescribeRecordResult result = null;

                try {
                    result = executeDescribeRecord(finalRequest);
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
    public java.util.concurrent.Future<DescribeServiceActionResult> describeServiceActionAsync(DescribeServiceActionRequest request) {

        return describeServiceActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeServiceActionResult> describeServiceActionAsync(final DescribeServiceActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeServiceActionRequest, DescribeServiceActionResult> asyncHandler) {
        final DescribeServiceActionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeServiceActionResult>() {
            @Override
            public DescribeServiceActionResult call() throws Exception {
                DescribeServiceActionResult result = null;

                try {
                    result = executeDescribeServiceAction(finalRequest);
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
    public java.util.concurrent.Future<DescribeTagOptionResult> describeTagOptionAsync(DescribeTagOptionRequest request) {

        return describeTagOptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTagOptionResult> describeTagOptionAsync(final DescribeTagOptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTagOptionRequest, DescribeTagOptionResult> asyncHandler) {
        final DescribeTagOptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTagOptionResult>() {
            @Override
            public DescribeTagOptionResult call() throws Exception {
                DescribeTagOptionResult result = null;

                try {
                    result = executeDescribeTagOption(finalRequest);
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
    public java.util.concurrent.Future<DisableAWSOrganizationsAccessResult> disableAWSOrganizationsAccessAsync(DisableAWSOrganizationsAccessRequest request) {

        return disableAWSOrganizationsAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableAWSOrganizationsAccessResult> disableAWSOrganizationsAccessAsync(
            final DisableAWSOrganizationsAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableAWSOrganizationsAccessRequest, DisableAWSOrganizationsAccessResult> asyncHandler) {
        final DisableAWSOrganizationsAccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableAWSOrganizationsAccessResult>() {
            @Override
            public DisableAWSOrganizationsAccessResult call() throws Exception {
                DisableAWSOrganizationsAccessResult result = null;

                try {
                    result = executeDisableAWSOrganizationsAccess(finalRequest);
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
    public java.util.concurrent.Future<DisassociatePrincipalFromPortfolioResult> disassociatePrincipalFromPortfolioAsync(
            DisassociatePrincipalFromPortfolioRequest request) {

        return disassociatePrincipalFromPortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociatePrincipalFromPortfolioResult> disassociatePrincipalFromPortfolioAsync(
            final DisassociatePrincipalFromPortfolioRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociatePrincipalFromPortfolioRequest, DisassociatePrincipalFromPortfolioResult> asyncHandler) {
        final DisassociatePrincipalFromPortfolioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociatePrincipalFromPortfolioResult>() {
            @Override
            public DisassociatePrincipalFromPortfolioResult call() throws Exception {
                DisassociatePrincipalFromPortfolioResult result = null;

                try {
                    result = executeDisassociatePrincipalFromPortfolio(finalRequest);
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
    public java.util.concurrent.Future<DisassociateProductFromPortfolioResult> disassociateProductFromPortfolioAsync(
            DisassociateProductFromPortfolioRequest request) {

        return disassociateProductFromPortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateProductFromPortfolioResult> disassociateProductFromPortfolioAsync(
            final DisassociateProductFromPortfolioRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateProductFromPortfolioRequest, DisassociateProductFromPortfolioResult> asyncHandler) {
        final DisassociateProductFromPortfolioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateProductFromPortfolioResult>() {
            @Override
            public DisassociateProductFromPortfolioResult call() throws Exception {
                DisassociateProductFromPortfolioResult result = null;

                try {
                    result = executeDisassociateProductFromPortfolio(finalRequest);
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
    public java.util.concurrent.Future<DisassociateServiceActionFromProvisioningArtifactResult> disassociateServiceActionFromProvisioningArtifactAsync(
            DisassociateServiceActionFromProvisioningArtifactRequest request) {

        return disassociateServiceActionFromProvisioningArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateServiceActionFromProvisioningArtifactResult> disassociateServiceActionFromProvisioningArtifactAsync(
            final DisassociateServiceActionFromProvisioningArtifactRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateServiceActionFromProvisioningArtifactRequest, DisassociateServiceActionFromProvisioningArtifactResult> asyncHandler) {
        final DisassociateServiceActionFromProvisioningArtifactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateServiceActionFromProvisioningArtifactResult>() {
            @Override
            public DisassociateServiceActionFromProvisioningArtifactResult call() throws Exception {
                DisassociateServiceActionFromProvisioningArtifactResult result = null;

                try {
                    result = executeDisassociateServiceActionFromProvisioningArtifact(finalRequest);
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
    public java.util.concurrent.Future<DisassociateTagOptionFromResourceResult> disassociateTagOptionFromResourceAsync(
            DisassociateTagOptionFromResourceRequest request) {

        return disassociateTagOptionFromResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateTagOptionFromResourceResult> disassociateTagOptionFromResourceAsync(
            final DisassociateTagOptionFromResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateTagOptionFromResourceRequest, DisassociateTagOptionFromResourceResult> asyncHandler) {
        final DisassociateTagOptionFromResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateTagOptionFromResourceResult>() {
            @Override
            public DisassociateTagOptionFromResourceResult call() throws Exception {
                DisassociateTagOptionFromResourceResult result = null;

                try {
                    result = executeDisassociateTagOptionFromResource(finalRequest);
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
    public java.util.concurrent.Future<EnableAWSOrganizationsAccessResult> enableAWSOrganizationsAccessAsync(EnableAWSOrganizationsAccessRequest request) {

        return enableAWSOrganizationsAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableAWSOrganizationsAccessResult> enableAWSOrganizationsAccessAsync(final EnableAWSOrganizationsAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableAWSOrganizationsAccessRequest, EnableAWSOrganizationsAccessResult> asyncHandler) {
        final EnableAWSOrganizationsAccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableAWSOrganizationsAccessResult>() {
            @Override
            public EnableAWSOrganizationsAccessResult call() throws Exception {
                EnableAWSOrganizationsAccessResult result = null;

                try {
                    result = executeEnableAWSOrganizationsAccess(finalRequest);
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
    public java.util.concurrent.Future<ExecuteProvisionedProductPlanResult> executeProvisionedProductPlanAsync(ExecuteProvisionedProductPlanRequest request) {

        return executeProvisionedProductPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExecuteProvisionedProductPlanResult> executeProvisionedProductPlanAsync(
            final ExecuteProvisionedProductPlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExecuteProvisionedProductPlanRequest, ExecuteProvisionedProductPlanResult> asyncHandler) {
        final ExecuteProvisionedProductPlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExecuteProvisionedProductPlanResult>() {
            @Override
            public ExecuteProvisionedProductPlanResult call() throws Exception {
                ExecuteProvisionedProductPlanResult result = null;

                try {
                    result = executeExecuteProvisionedProductPlan(finalRequest);
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
    public java.util.concurrent.Future<ExecuteProvisionedProductServiceActionResult> executeProvisionedProductServiceActionAsync(
            ExecuteProvisionedProductServiceActionRequest request) {

        return executeProvisionedProductServiceActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExecuteProvisionedProductServiceActionResult> executeProvisionedProductServiceActionAsync(
            final ExecuteProvisionedProductServiceActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExecuteProvisionedProductServiceActionRequest, ExecuteProvisionedProductServiceActionResult> asyncHandler) {
        final ExecuteProvisionedProductServiceActionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExecuteProvisionedProductServiceActionResult>() {
            @Override
            public ExecuteProvisionedProductServiceActionResult call() throws Exception {
                ExecuteProvisionedProductServiceActionResult result = null;

                try {
                    result = executeExecuteProvisionedProductServiceAction(finalRequest);
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
    public java.util.concurrent.Future<GetAWSOrganizationsAccessStatusResult> getAWSOrganizationsAccessStatusAsync(
            GetAWSOrganizationsAccessStatusRequest request) {

        return getAWSOrganizationsAccessStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAWSOrganizationsAccessStatusResult> getAWSOrganizationsAccessStatusAsync(
            final GetAWSOrganizationsAccessStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAWSOrganizationsAccessStatusRequest, GetAWSOrganizationsAccessStatusResult> asyncHandler) {
        final GetAWSOrganizationsAccessStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAWSOrganizationsAccessStatusResult>() {
            @Override
            public GetAWSOrganizationsAccessStatusResult call() throws Exception {
                GetAWSOrganizationsAccessStatusResult result = null;

                try {
                    result = executeGetAWSOrganizationsAccessStatus(finalRequest);
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
    public java.util.concurrent.Future<ListAcceptedPortfolioSharesResult> listAcceptedPortfolioSharesAsync(ListAcceptedPortfolioSharesRequest request) {

        return listAcceptedPortfolioSharesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAcceptedPortfolioSharesResult> listAcceptedPortfolioSharesAsync(final ListAcceptedPortfolioSharesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAcceptedPortfolioSharesRequest, ListAcceptedPortfolioSharesResult> asyncHandler) {
        final ListAcceptedPortfolioSharesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAcceptedPortfolioSharesResult>() {
            @Override
            public ListAcceptedPortfolioSharesResult call() throws Exception {
                ListAcceptedPortfolioSharesResult result = null;

                try {
                    result = executeListAcceptedPortfolioShares(finalRequest);
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
    public java.util.concurrent.Future<ListConstraintsForPortfolioResult> listConstraintsForPortfolioAsync(ListConstraintsForPortfolioRequest request) {

        return listConstraintsForPortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConstraintsForPortfolioResult> listConstraintsForPortfolioAsync(final ListConstraintsForPortfolioRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConstraintsForPortfolioRequest, ListConstraintsForPortfolioResult> asyncHandler) {
        final ListConstraintsForPortfolioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConstraintsForPortfolioResult>() {
            @Override
            public ListConstraintsForPortfolioResult call() throws Exception {
                ListConstraintsForPortfolioResult result = null;

                try {
                    result = executeListConstraintsForPortfolio(finalRequest);
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
    public java.util.concurrent.Future<ListLaunchPathsResult> listLaunchPathsAsync(ListLaunchPathsRequest request) {

        return listLaunchPathsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLaunchPathsResult> listLaunchPathsAsync(final ListLaunchPathsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLaunchPathsRequest, ListLaunchPathsResult> asyncHandler) {
        final ListLaunchPathsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLaunchPathsResult>() {
            @Override
            public ListLaunchPathsResult call() throws Exception {
                ListLaunchPathsResult result = null;

                try {
                    result = executeListLaunchPaths(finalRequest);
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
    public java.util.concurrent.Future<ListOrganizationPortfolioAccessResult> listOrganizationPortfolioAccessAsync(
            ListOrganizationPortfolioAccessRequest request) {

        return listOrganizationPortfolioAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOrganizationPortfolioAccessResult> listOrganizationPortfolioAccessAsync(
            final ListOrganizationPortfolioAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOrganizationPortfolioAccessRequest, ListOrganizationPortfolioAccessResult> asyncHandler) {
        final ListOrganizationPortfolioAccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOrganizationPortfolioAccessResult>() {
            @Override
            public ListOrganizationPortfolioAccessResult call() throws Exception {
                ListOrganizationPortfolioAccessResult result = null;

                try {
                    result = executeListOrganizationPortfolioAccess(finalRequest);
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
    public java.util.concurrent.Future<ListPortfolioAccessResult> listPortfolioAccessAsync(ListPortfolioAccessRequest request) {

        return listPortfolioAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPortfolioAccessResult> listPortfolioAccessAsync(final ListPortfolioAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPortfolioAccessRequest, ListPortfolioAccessResult> asyncHandler) {
        final ListPortfolioAccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPortfolioAccessResult>() {
            @Override
            public ListPortfolioAccessResult call() throws Exception {
                ListPortfolioAccessResult result = null;

                try {
                    result = executeListPortfolioAccess(finalRequest);
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
    public java.util.concurrent.Future<ListPortfoliosResult> listPortfoliosAsync(ListPortfoliosRequest request) {

        return listPortfoliosAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPortfoliosResult> listPortfoliosAsync(final ListPortfoliosRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPortfoliosRequest, ListPortfoliosResult> asyncHandler) {
        final ListPortfoliosRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPortfoliosResult>() {
            @Override
            public ListPortfoliosResult call() throws Exception {
                ListPortfoliosResult result = null;

                try {
                    result = executeListPortfolios(finalRequest);
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
    public java.util.concurrent.Future<ListPortfoliosForProductResult> listPortfoliosForProductAsync(ListPortfoliosForProductRequest request) {

        return listPortfoliosForProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPortfoliosForProductResult> listPortfoliosForProductAsync(final ListPortfoliosForProductRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPortfoliosForProductRequest, ListPortfoliosForProductResult> asyncHandler) {
        final ListPortfoliosForProductRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPortfoliosForProductResult>() {
            @Override
            public ListPortfoliosForProductResult call() throws Exception {
                ListPortfoliosForProductResult result = null;

                try {
                    result = executeListPortfoliosForProduct(finalRequest);
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
    public java.util.concurrent.Future<ListPrincipalsForPortfolioResult> listPrincipalsForPortfolioAsync(ListPrincipalsForPortfolioRequest request) {

        return listPrincipalsForPortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPrincipalsForPortfolioResult> listPrincipalsForPortfolioAsync(final ListPrincipalsForPortfolioRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPrincipalsForPortfolioRequest, ListPrincipalsForPortfolioResult> asyncHandler) {
        final ListPrincipalsForPortfolioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPrincipalsForPortfolioResult>() {
            @Override
            public ListPrincipalsForPortfolioResult call() throws Exception {
                ListPrincipalsForPortfolioResult result = null;

                try {
                    result = executeListPrincipalsForPortfolio(finalRequest);
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
    public java.util.concurrent.Future<ListProvisionedProductPlansResult> listProvisionedProductPlansAsync(ListProvisionedProductPlansRequest request) {

        return listProvisionedProductPlansAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProvisionedProductPlansResult> listProvisionedProductPlansAsync(final ListProvisionedProductPlansRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProvisionedProductPlansRequest, ListProvisionedProductPlansResult> asyncHandler) {
        final ListProvisionedProductPlansRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProvisionedProductPlansResult>() {
            @Override
            public ListProvisionedProductPlansResult call() throws Exception {
                ListProvisionedProductPlansResult result = null;

                try {
                    result = executeListProvisionedProductPlans(finalRequest);
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
    public java.util.concurrent.Future<ListProvisioningArtifactsResult> listProvisioningArtifactsAsync(ListProvisioningArtifactsRequest request) {

        return listProvisioningArtifactsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProvisioningArtifactsResult> listProvisioningArtifactsAsync(final ListProvisioningArtifactsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProvisioningArtifactsRequest, ListProvisioningArtifactsResult> asyncHandler) {
        final ListProvisioningArtifactsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProvisioningArtifactsResult>() {
            @Override
            public ListProvisioningArtifactsResult call() throws Exception {
                ListProvisioningArtifactsResult result = null;

                try {
                    result = executeListProvisioningArtifacts(finalRequest);
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
    public java.util.concurrent.Future<ListProvisioningArtifactsForServiceActionResult> listProvisioningArtifactsForServiceActionAsync(
            ListProvisioningArtifactsForServiceActionRequest request) {

        return listProvisioningArtifactsForServiceActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProvisioningArtifactsForServiceActionResult> listProvisioningArtifactsForServiceActionAsync(
            final ListProvisioningArtifactsForServiceActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProvisioningArtifactsForServiceActionRequest, ListProvisioningArtifactsForServiceActionResult> asyncHandler) {
        final ListProvisioningArtifactsForServiceActionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProvisioningArtifactsForServiceActionResult>() {
            @Override
            public ListProvisioningArtifactsForServiceActionResult call() throws Exception {
                ListProvisioningArtifactsForServiceActionResult result = null;

                try {
                    result = executeListProvisioningArtifactsForServiceAction(finalRequest);
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
    public java.util.concurrent.Future<ListRecordHistoryResult> listRecordHistoryAsync(ListRecordHistoryRequest request) {

        return listRecordHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecordHistoryResult> listRecordHistoryAsync(final ListRecordHistoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRecordHistoryRequest, ListRecordHistoryResult> asyncHandler) {
        final ListRecordHistoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRecordHistoryResult>() {
            @Override
            public ListRecordHistoryResult call() throws Exception {
                ListRecordHistoryResult result = null;

                try {
                    result = executeListRecordHistory(finalRequest);
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
    public java.util.concurrent.Future<ListResourcesForTagOptionResult> listResourcesForTagOptionAsync(ListResourcesForTagOptionRequest request) {

        return listResourcesForTagOptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourcesForTagOptionResult> listResourcesForTagOptionAsync(final ListResourcesForTagOptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResourcesForTagOptionRequest, ListResourcesForTagOptionResult> asyncHandler) {
        final ListResourcesForTagOptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResourcesForTagOptionResult>() {
            @Override
            public ListResourcesForTagOptionResult call() throws Exception {
                ListResourcesForTagOptionResult result = null;

                try {
                    result = executeListResourcesForTagOption(finalRequest);
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
    public java.util.concurrent.Future<ListServiceActionsResult> listServiceActionsAsync(ListServiceActionsRequest request) {

        return listServiceActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServiceActionsResult> listServiceActionsAsync(final ListServiceActionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServiceActionsRequest, ListServiceActionsResult> asyncHandler) {
        final ListServiceActionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListServiceActionsResult>() {
            @Override
            public ListServiceActionsResult call() throws Exception {
                ListServiceActionsResult result = null;

                try {
                    result = executeListServiceActions(finalRequest);
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
    public java.util.concurrent.Future<ListServiceActionsForProvisioningArtifactResult> listServiceActionsForProvisioningArtifactAsync(
            ListServiceActionsForProvisioningArtifactRequest request) {

        return listServiceActionsForProvisioningArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServiceActionsForProvisioningArtifactResult> listServiceActionsForProvisioningArtifactAsync(
            final ListServiceActionsForProvisioningArtifactRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServiceActionsForProvisioningArtifactRequest, ListServiceActionsForProvisioningArtifactResult> asyncHandler) {
        final ListServiceActionsForProvisioningArtifactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListServiceActionsForProvisioningArtifactResult>() {
            @Override
            public ListServiceActionsForProvisioningArtifactResult call() throws Exception {
                ListServiceActionsForProvisioningArtifactResult result = null;

                try {
                    result = executeListServiceActionsForProvisioningArtifact(finalRequest);
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
    public java.util.concurrent.Future<ListTagOptionsResult> listTagOptionsAsync(ListTagOptionsRequest request) {

        return listTagOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagOptionsResult> listTagOptionsAsync(final ListTagOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagOptionsRequest, ListTagOptionsResult> asyncHandler) {
        final ListTagOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagOptionsResult>() {
            @Override
            public ListTagOptionsResult call() throws Exception {
                ListTagOptionsResult result = null;

                try {
                    result = executeListTagOptions(finalRequest);
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
    public java.util.concurrent.Future<ProvisionProductResult> provisionProductAsync(ProvisionProductRequest request) {

        return provisionProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ProvisionProductResult> provisionProductAsync(final ProvisionProductRequest request,
            final com.amazonaws.handlers.AsyncHandler<ProvisionProductRequest, ProvisionProductResult> asyncHandler) {
        final ProvisionProductRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ProvisionProductResult>() {
            @Override
            public ProvisionProductResult call() throws Exception {
                ProvisionProductResult result = null;

                try {
                    result = executeProvisionProduct(finalRequest);
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
    public java.util.concurrent.Future<RejectPortfolioShareResult> rejectPortfolioShareAsync(RejectPortfolioShareRequest request) {

        return rejectPortfolioShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectPortfolioShareResult> rejectPortfolioShareAsync(final RejectPortfolioShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<RejectPortfolioShareRequest, RejectPortfolioShareResult> asyncHandler) {
        final RejectPortfolioShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RejectPortfolioShareResult>() {
            @Override
            public RejectPortfolioShareResult call() throws Exception {
                RejectPortfolioShareResult result = null;

                try {
                    result = executeRejectPortfolioShare(finalRequest);
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
    public java.util.concurrent.Future<ScanProvisionedProductsResult> scanProvisionedProductsAsync(ScanProvisionedProductsRequest request) {

        return scanProvisionedProductsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ScanProvisionedProductsResult> scanProvisionedProductsAsync(final ScanProvisionedProductsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ScanProvisionedProductsRequest, ScanProvisionedProductsResult> asyncHandler) {
        final ScanProvisionedProductsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ScanProvisionedProductsResult>() {
            @Override
            public ScanProvisionedProductsResult call() throws Exception {
                ScanProvisionedProductsResult result = null;

                try {
                    result = executeScanProvisionedProducts(finalRequest);
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
    public java.util.concurrent.Future<SearchProductsResult> searchProductsAsync(SearchProductsRequest request) {

        return searchProductsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchProductsResult> searchProductsAsync(final SearchProductsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchProductsRequest, SearchProductsResult> asyncHandler) {
        final SearchProductsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchProductsResult>() {
            @Override
            public SearchProductsResult call() throws Exception {
                SearchProductsResult result = null;

                try {
                    result = executeSearchProducts(finalRequest);
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
    public java.util.concurrent.Future<SearchProductsAsAdminResult> searchProductsAsAdminAsync(SearchProductsAsAdminRequest request) {

        return searchProductsAsAdminAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchProductsAsAdminResult> searchProductsAsAdminAsync(final SearchProductsAsAdminRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchProductsAsAdminRequest, SearchProductsAsAdminResult> asyncHandler) {
        final SearchProductsAsAdminRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchProductsAsAdminResult>() {
            @Override
            public SearchProductsAsAdminResult call() throws Exception {
                SearchProductsAsAdminResult result = null;

                try {
                    result = executeSearchProductsAsAdmin(finalRequest);
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
    public java.util.concurrent.Future<SearchProvisionedProductsResult> searchProvisionedProductsAsync(SearchProvisionedProductsRequest request) {

        return searchProvisionedProductsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchProvisionedProductsResult> searchProvisionedProductsAsync(final SearchProvisionedProductsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchProvisionedProductsRequest, SearchProvisionedProductsResult> asyncHandler) {
        final SearchProvisionedProductsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchProvisionedProductsResult>() {
            @Override
            public SearchProvisionedProductsResult call() throws Exception {
                SearchProvisionedProductsResult result = null;

                try {
                    result = executeSearchProvisionedProducts(finalRequest);
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
    public java.util.concurrent.Future<TerminateProvisionedProductResult> terminateProvisionedProductAsync(TerminateProvisionedProductRequest request) {

        return terminateProvisionedProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateProvisionedProductResult> terminateProvisionedProductAsync(final TerminateProvisionedProductRequest request,
            final com.amazonaws.handlers.AsyncHandler<TerminateProvisionedProductRequest, TerminateProvisionedProductResult> asyncHandler) {
        final TerminateProvisionedProductRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TerminateProvisionedProductResult>() {
            @Override
            public TerminateProvisionedProductResult call() throws Exception {
                TerminateProvisionedProductResult result = null;

                try {
                    result = executeTerminateProvisionedProduct(finalRequest);
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
    public java.util.concurrent.Future<UpdateConstraintResult> updateConstraintAsync(UpdateConstraintRequest request) {

        return updateConstraintAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConstraintResult> updateConstraintAsync(final UpdateConstraintRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConstraintRequest, UpdateConstraintResult> asyncHandler) {
        final UpdateConstraintRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConstraintResult>() {
            @Override
            public UpdateConstraintResult call() throws Exception {
                UpdateConstraintResult result = null;

                try {
                    result = executeUpdateConstraint(finalRequest);
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
    public java.util.concurrent.Future<UpdatePortfolioResult> updatePortfolioAsync(UpdatePortfolioRequest request) {

        return updatePortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePortfolioResult> updatePortfolioAsync(final UpdatePortfolioRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePortfolioRequest, UpdatePortfolioResult> asyncHandler) {
        final UpdatePortfolioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePortfolioResult>() {
            @Override
            public UpdatePortfolioResult call() throws Exception {
                UpdatePortfolioResult result = null;

                try {
                    result = executeUpdatePortfolio(finalRequest);
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
    public java.util.concurrent.Future<UpdateProductResult> updateProductAsync(UpdateProductRequest request) {

        return updateProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProductResult> updateProductAsync(final UpdateProductRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateProductRequest, UpdateProductResult> asyncHandler) {
        final UpdateProductRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateProductResult>() {
            @Override
            public UpdateProductResult call() throws Exception {
                UpdateProductResult result = null;

                try {
                    result = executeUpdateProduct(finalRequest);
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
    public java.util.concurrent.Future<UpdateProvisionedProductResult> updateProvisionedProductAsync(UpdateProvisionedProductRequest request) {

        return updateProvisionedProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProvisionedProductResult> updateProvisionedProductAsync(final UpdateProvisionedProductRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateProvisionedProductRequest, UpdateProvisionedProductResult> asyncHandler) {
        final UpdateProvisionedProductRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateProvisionedProductResult>() {
            @Override
            public UpdateProvisionedProductResult call() throws Exception {
                UpdateProvisionedProductResult result = null;

                try {
                    result = executeUpdateProvisionedProduct(finalRequest);
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
    public java.util.concurrent.Future<UpdateProvisioningArtifactResult> updateProvisioningArtifactAsync(UpdateProvisioningArtifactRequest request) {

        return updateProvisioningArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProvisioningArtifactResult> updateProvisioningArtifactAsync(final UpdateProvisioningArtifactRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateProvisioningArtifactRequest, UpdateProvisioningArtifactResult> asyncHandler) {
        final UpdateProvisioningArtifactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateProvisioningArtifactResult>() {
            @Override
            public UpdateProvisioningArtifactResult call() throws Exception {
                UpdateProvisioningArtifactResult result = null;

                try {
                    result = executeUpdateProvisioningArtifact(finalRequest);
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
    public java.util.concurrent.Future<UpdateServiceActionResult> updateServiceActionAsync(UpdateServiceActionRequest request) {

        return updateServiceActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceActionResult> updateServiceActionAsync(final UpdateServiceActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateServiceActionRequest, UpdateServiceActionResult> asyncHandler) {
        final UpdateServiceActionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateServiceActionResult>() {
            @Override
            public UpdateServiceActionResult call() throws Exception {
                UpdateServiceActionResult result = null;

                try {
                    result = executeUpdateServiceAction(finalRequest);
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
    public java.util.concurrent.Future<UpdateTagOptionResult> updateTagOptionAsync(UpdateTagOptionRequest request) {

        return updateTagOptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTagOptionResult> updateTagOptionAsync(final UpdateTagOptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTagOptionRequest, UpdateTagOptionResult> asyncHandler) {
        final UpdateTagOptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTagOptionResult>() {
            @Override
            public UpdateTagOptionResult call() throws Exception {
                UpdateTagOptionResult result = null;

                try {
                    result = executeUpdateTagOption(finalRequest);
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
