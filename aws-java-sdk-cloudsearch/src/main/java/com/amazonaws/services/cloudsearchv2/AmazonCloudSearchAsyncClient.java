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
package com.amazonaws.services.cloudsearchv2;

import com.amazonaws.services.cloudsearchv2.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Client for accessing Amazon CloudSearch asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon CloudSearch Configuration Service</fullname>
 * <p>
 * You use the Amazon CloudSearch configuration service to create, configure, and manage search domains. Configuration
 * service requests are submitted using the AWS Query protocol. AWS Query requests are HTTP or HTTPS requests submitted
 * via HTTP GET or POST with a query parameter named Action.
 * </p>
 * <p>
 * The endpoint for configuration service requests is region-specific: cloudsearch.<i>region</i>.amazonaws.com. For
 * example, cloudsearch.us-east-1.amazonaws.com. For a current list of supported regions and endpoints, see <a
 * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#cloudsearch_region" target="_blank">Regions and
 * Endpoints</a>.
 * </p>
 */
@ThreadSafe
public class AmazonCloudSearchAsyncClient extends AmazonCloudSearchClient implements AmazonCloudSearchAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudSearch. A credentials provider
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
     */
    public AmazonCloudSearchAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudSearch. A credentials provider
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
     *        The client configuration options controlling how this client connects to Amazon CloudSearch (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonCloudSearchAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudSearch using the specified AWS
     * account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonCloudSearchAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudSearch using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonCloudSearchAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudSearch using the specified AWS
     * account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonCloudSearchAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudSearch using the specified AWS
     * account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonCloudSearchAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudSearch using the provided AWS
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
     */
    public AmazonCloudSearchAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudSearch using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonCloudSearchAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudSearch using the specified AWS
     * account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonCloudSearchAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration, java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudSearch using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonCloudSearchAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<BuildSuggestersResult> buildSuggestersAsync(BuildSuggestersRequest request) {

        return buildSuggestersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BuildSuggestersResult> buildSuggestersAsync(final BuildSuggestersRequest request,
            final com.amazonaws.handlers.AsyncHandler<BuildSuggestersRequest, BuildSuggestersResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<BuildSuggestersResult>() {
            @Override
            public BuildSuggestersResult call() throws Exception {
                BuildSuggestersResult result;

                try {
                    result = buildSuggesters(request);
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
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest request) {

        return createDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(final CreateDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateDomainResult>() {
            @Override
            public CreateDomainResult call() throws Exception {
                CreateDomainResult result;

                try {
                    result = createDomain(request);
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
    public java.util.concurrent.Future<DefineAnalysisSchemeResult> defineAnalysisSchemeAsync(DefineAnalysisSchemeRequest request) {

        return defineAnalysisSchemeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DefineAnalysisSchemeResult> defineAnalysisSchemeAsync(final DefineAnalysisSchemeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DefineAnalysisSchemeRequest, DefineAnalysisSchemeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DefineAnalysisSchemeResult>() {
            @Override
            public DefineAnalysisSchemeResult call() throws Exception {
                DefineAnalysisSchemeResult result;

                try {
                    result = defineAnalysisScheme(request);
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
    public java.util.concurrent.Future<DefineExpressionResult> defineExpressionAsync(DefineExpressionRequest request) {

        return defineExpressionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DefineExpressionResult> defineExpressionAsync(final DefineExpressionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DefineExpressionRequest, DefineExpressionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DefineExpressionResult>() {
            @Override
            public DefineExpressionResult call() throws Exception {
                DefineExpressionResult result;

                try {
                    result = defineExpression(request);
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
    public java.util.concurrent.Future<DefineIndexFieldResult> defineIndexFieldAsync(DefineIndexFieldRequest request) {

        return defineIndexFieldAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DefineIndexFieldResult> defineIndexFieldAsync(final DefineIndexFieldRequest request,
            final com.amazonaws.handlers.AsyncHandler<DefineIndexFieldRequest, DefineIndexFieldResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DefineIndexFieldResult>() {
            @Override
            public DefineIndexFieldResult call() throws Exception {
                DefineIndexFieldResult result;

                try {
                    result = defineIndexField(request);
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
    public java.util.concurrent.Future<DefineSuggesterResult> defineSuggesterAsync(DefineSuggesterRequest request) {

        return defineSuggesterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DefineSuggesterResult> defineSuggesterAsync(final DefineSuggesterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DefineSuggesterRequest, DefineSuggesterResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DefineSuggesterResult>() {
            @Override
            public DefineSuggesterResult call() throws Exception {
                DefineSuggesterResult result;

                try {
                    result = defineSuggester(request);
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
    public java.util.concurrent.Future<DeleteAnalysisSchemeResult> deleteAnalysisSchemeAsync(DeleteAnalysisSchemeRequest request) {

        return deleteAnalysisSchemeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAnalysisSchemeResult> deleteAnalysisSchemeAsync(final DeleteAnalysisSchemeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAnalysisSchemeRequest, DeleteAnalysisSchemeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteAnalysisSchemeResult>() {
            @Override
            public DeleteAnalysisSchemeResult call() throws Exception {
                DeleteAnalysisSchemeResult result;

                try {
                    result = deleteAnalysisScheme(request);
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
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest request) {

        return deleteDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(final DeleteDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteDomainResult>() {
            @Override
            public DeleteDomainResult call() throws Exception {
                DeleteDomainResult result;

                try {
                    result = deleteDomain(request);
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
    public java.util.concurrent.Future<DeleteExpressionResult> deleteExpressionAsync(DeleteExpressionRequest request) {

        return deleteExpressionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteExpressionResult> deleteExpressionAsync(final DeleteExpressionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteExpressionRequest, DeleteExpressionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteExpressionResult>() {
            @Override
            public DeleteExpressionResult call() throws Exception {
                DeleteExpressionResult result;

                try {
                    result = deleteExpression(request);
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
    public java.util.concurrent.Future<DeleteIndexFieldResult> deleteIndexFieldAsync(DeleteIndexFieldRequest request) {

        return deleteIndexFieldAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIndexFieldResult> deleteIndexFieldAsync(final DeleteIndexFieldRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIndexFieldRequest, DeleteIndexFieldResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteIndexFieldResult>() {
            @Override
            public DeleteIndexFieldResult call() throws Exception {
                DeleteIndexFieldResult result;

                try {
                    result = deleteIndexField(request);
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
    public java.util.concurrent.Future<DeleteSuggesterResult> deleteSuggesterAsync(DeleteSuggesterRequest request) {

        return deleteSuggesterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSuggesterResult> deleteSuggesterAsync(final DeleteSuggesterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSuggesterRequest, DeleteSuggesterResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteSuggesterResult>() {
            @Override
            public DeleteSuggesterResult call() throws Exception {
                DeleteSuggesterResult result;

                try {
                    result = deleteSuggester(request);
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
    public java.util.concurrent.Future<DescribeAnalysisSchemesResult> describeAnalysisSchemesAsync(DescribeAnalysisSchemesRequest request) {

        return describeAnalysisSchemesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAnalysisSchemesResult> describeAnalysisSchemesAsync(final DescribeAnalysisSchemesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAnalysisSchemesRequest, DescribeAnalysisSchemesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeAnalysisSchemesResult>() {
            @Override
            public DescribeAnalysisSchemesResult call() throws Exception {
                DescribeAnalysisSchemesResult result;

                try {
                    result = describeAnalysisSchemes(request);
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
    public java.util.concurrent.Future<DescribeAvailabilityOptionsResult> describeAvailabilityOptionsAsync(DescribeAvailabilityOptionsRequest request) {

        return describeAvailabilityOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAvailabilityOptionsResult> describeAvailabilityOptionsAsync(final DescribeAvailabilityOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAvailabilityOptionsRequest, DescribeAvailabilityOptionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeAvailabilityOptionsResult>() {
            @Override
            public DescribeAvailabilityOptionsResult call() throws Exception {
                DescribeAvailabilityOptionsResult result;

                try {
                    result = describeAvailabilityOptions(request);
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
    public java.util.concurrent.Future<DescribeDomainsResult> describeDomainsAsync(DescribeDomainsRequest request) {

        return describeDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDomainsResult> describeDomainsAsync(final DescribeDomainsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDomainsRequest, DescribeDomainsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeDomainsResult>() {
            @Override
            public DescribeDomainsResult call() throws Exception {
                DescribeDomainsResult result;

                try {
                    result = describeDomains(request);
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
     * Simplified method form for invoking the DescribeDomains operation.
     *
     * @see #describeDomainsAsync(DescribeDomainsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDomainsResult> describeDomainsAsync() {

        return describeDomainsAsync(new DescribeDomainsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDomains operation with an AsyncHandler.
     *
     * @see #describeDomainsAsync(DescribeDomainsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeDomainsResult> describeDomainsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDomainsRequest, DescribeDomainsResult> asyncHandler) {

        return describeDomainsAsync(new DescribeDomainsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeExpressionsResult> describeExpressionsAsync(DescribeExpressionsRequest request) {

        return describeExpressionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeExpressionsResult> describeExpressionsAsync(final DescribeExpressionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeExpressionsRequest, DescribeExpressionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeExpressionsResult>() {
            @Override
            public DescribeExpressionsResult call() throws Exception {
                DescribeExpressionsResult result;

                try {
                    result = describeExpressions(request);
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
    public java.util.concurrent.Future<DescribeIndexFieldsResult> describeIndexFieldsAsync(DescribeIndexFieldsRequest request) {

        return describeIndexFieldsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeIndexFieldsResult> describeIndexFieldsAsync(final DescribeIndexFieldsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeIndexFieldsRequest, DescribeIndexFieldsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeIndexFieldsResult>() {
            @Override
            public DescribeIndexFieldsResult call() throws Exception {
                DescribeIndexFieldsResult result;

                try {
                    result = describeIndexFields(request);
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
    public java.util.concurrent.Future<DescribeScalingParametersResult> describeScalingParametersAsync(DescribeScalingParametersRequest request) {

        return describeScalingParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScalingParametersResult> describeScalingParametersAsync(final DescribeScalingParametersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeScalingParametersRequest, DescribeScalingParametersResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeScalingParametersResult>() {
            @Override
            public DescribeScalingParametersResult call() throws Exception {
                DescribeScalingParametersResult result;

                try {
                    result = describeScalingParameters(request);
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
    public java.util.concurrent.Future<DescribeServiceAccessPoliciesResult> describeServiceAccessPoliciesAsync(DescribeServiceAccessPoliciesRequest request) {

        return describeServiceAccessPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeServiceAccessPoliciesResult> describeServiceAccessPoliciesAsync(
            final DescribeServiceAccessPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeServiceAccessPoliciesRequest, DescribeServiceAccessPoliciesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeServiceAccessPoliciesResult>() {
            @Override
            public DescribeServiceAccessPoliciesResult call() throws Exception {
                DescribeServiceAccessPoliciesResult result;

                try {
                    result = describeServiceAccessPolicies(request);
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
    public java.util.concurrent.Future<DescribeSuggestersResult> describeSuggestersAsync(DescribeSuggestersRequest request) {

        return describeSuggestersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSuggestersResult> describeSuggestersAsync(final DescribeSuggestersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSuggestersRequest, DescribeSuggestersResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeSuggestersResult>() {
            @Override
            public DescribeSuggestersResult call() throws Exception {
                DescribeSuggestersResult result;

                try {
                    result = describeSuggesters(request);
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
    public java.util.concurrent.Future<IndexDocumentsResult> indexDocumentsAsync(IndexDocumentsRequest request) {

        return indexDocumentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<IndexDocumentsResult> indexDocumentsAsync(final IndexDocumentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<IndexDocumentsRequest, IndexDocumentsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<IndexDocumentsResult>() {
            @Override
            public IndexDocumentsResult call() throws Exception {
                IndexDocumentsResult result;

                try {
                    result = indexDocuments(request);
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
    public java.util.concurrent.Future<ListDomainNamesResult> listDomainNamesAsync(ListDomainNamesRequest request) {

        return listDomainNamesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDomainNamesResult> listDomainNamesAsync(final ListDomainNamesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDomainNamesRequest, ListDomainNamesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListDomainNamesResult>() {
            @Override
            public ListDomainNamesResult call() throws Exception {
                ListDomainNamesResult result;

                try {
                    result = listDomainNames(request);
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
     * Simplified method form for invoking the ListDomainNames operation.
     *
     * @see #listDomainNamesAsync(ListDomainNamesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListDomainNamesResult> listDomainNamesAsync() {

        return listDomainNamesAsync(new ListDomainNamesRequest());
    }

    /**
     * Simplified method form for invoking the ListDomainNames operation with an AsyncHandler.
     *
     * @see #listDomainNamesAsync(ListDomainNamesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListDomainNamesResult> listDomainNamesAsync(
            com.amazonaws.handlers.AsyncHandler<ListDomainNamesRequest, ListDomainNamesResult> asyncHandler) {

        return listDomainNamesAsync(new ListDomainNamesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAvailabilityOptionsResult> updateAvailabilityOptionsAsync(UpdateAvailabilityOptionsRequest request) {

        return updateAvailabilityOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAvailabilityOptionsResult> updateAvailabilityOptionsAsync(final UpdateAvailabilityOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAvailabilityOptionsRequest, UpdateAvailabilityOptionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateAvailabilityOptionsResult>() {
            @Override
            public UpdateAvailabilityOptionsResult call() throws Exception {
                UpdateAvailabilityOptionsResult result;

                try {
                    result = updateAvailabilityOptions(request);
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
    public java.util.concurrent.Future<UpdateScalingParametersResult> updateScalingParametersAsync(UpdateScalingParametersRequest request) {

        return updateScalingParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateScalingParametersResult> updateScalingParametersAsync(final UpdateScalingParametersRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateScalingParametersRequest, UpdateScalingParametersResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateScalingParametersResult>() {
            @Override
            public UpdateScalingParametersResult call() throws Exception {
                UpdateScalingParametersResult result;

                try {
                    result = updateScalingParameters(request);
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
    public java.util.concurrent.Future<UpdateServiceAccessPoliciesResult> updateServiceAccessPoliciesAsync(UpdateServiceAccessPoliciesRequest request) {

        return updateServiceAccessPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceAccessPoliciesResult> updateServiceAccessPoliciesAsync(final UpdateServiceAccessPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateServiceAccessPoliciesRequest, UpdateServiceAccessPoliciesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateServiceAccessPoliciesResult>() {
            @Override
            public UpdateServiceAccessPoliciesResult call() throws Exception {
                UpdateServiceAccessPoliciesResult result;

                try {
                    result = updateServiceAccessPolicies(request);
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
