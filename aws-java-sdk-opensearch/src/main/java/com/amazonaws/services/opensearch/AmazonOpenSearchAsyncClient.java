/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearch;

import javax.annotation.Generated;

import com.amazonaws.services.opensearch.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon OpenSearch Service asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Use the Amazon OpenSearch Service configuration API to create, configure, and manage OpenSearch Service domains.
 * </p>
 * <p>
 * For sample code that uses the configuration API, see the <a
 * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/opensearch-configuration-samples.html">
 * <i>Amazon OpenSearch Service Developer Guide</i> </a>. The guide also contains <a
 * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/request-signing.html">sample code</a> for
 * sending signed HTTP requests to the OpenSearch APIs. The endpoint for configuration service requests is Region
 * specific: es.<i>region</i>.amazonaws.com. For example, es.us-east-1.amazonaws.com. For a current list of supported
 * Regions and endpoints, see <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#service-regions">Amazon
 * Web Services service endpoints</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonOpenSearchAsyncClient extends AmazonOpenSearchClient implements AmazonOpenSearchAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonOpenSearchAsyncClientBuilder asyncBuilder() {
        return AmazonOpenSearchAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon OpenSearch Service using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonOpenSearchAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon OpenSearch Service using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonOpenSearchAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
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
    public java.util.concurrent.Future<AcceptInboundConnectionResult> acceptInboundConnectionAsync(AcceptInboundConnectionRequest request) {

        return acceptInboundConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptInboundConnectionResult> acceptInboundConnectionAsync(final AcceptInboundConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptInboundConnectionRequest, AcceptInboundConnectionResult> asyncHandler) {
        final AcceptInboundConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcceptInboundConnectionResult>() {
            @Override
            public AcceptInboundConnectionResult call() throws Exception {
                AcceptInboundConnectionResult result = null;

                try {
                    result = executeAcceptInboundConnection(finalRequest);
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
    public java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest request) {

        return addTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsResult> addTagsAsync(final AddTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler) {
        final AddTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddTagsResult>() {
            @Override
            public AddTagsResult call() throws Exception {
                AddTagsResult result = null;

                try {
                    result = executeAddTags(finalRequest);
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
    public java.util.concurrent.Future<AssociatePackageResult> associatePackageAsync(AssociatePackageRequest request) {

        return associatePackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociatePackageResult> associatePackageAsync(final AssociatePackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociatePackageRequest, AssociatePackageResult> asyncHandler) {
        final AssociatePackageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociatePackageResult>() {
            @Override
            public AssociatePackageResult call() throws Exception {
                AssociatePackageResult result = null;

                try {
                    result = executeAssociatePackage(finalRequest);
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
    public java.util.concurrent.Future<AuthorizeVpcEndpointAccessResult> authorizeVpcEndpointAccessAsync(AuthorizeVpcEndpointAccessRequest request) {

        return authorizeVpcEndpointAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AuthorizeVpcEndpointAccessResult> authorizeVpcEndpointAccessAsync(final AuthorizeVpcEndpointAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<AuthorizeVpcEndpointAccessRequest, AuthorizeVpcEndpointAccessResult> asyncHandler) {
        final AuthorizeVpcEndpointAccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AuthorizeVpcEndpointAccessResult>() {
            @Override
            public AuthorizeVpcEndpointAccessResult call() throws Exception {
                AuthorizeVpcEndpointAccessResult result = null;

                try {
                    result = executeAuthorizeVpcEndpointAccess(finalRequest);
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
    public java.util.concurrent.Future<CancelServiceSoftwareUpdateResult> cancelServiceSoftwareUpdateAsync(CancelServiceSoftwareUpdateRequest request) {

        return cancelServiceSoftwareUpdateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelServiceSoftwareUpdateResult> cancelServiceSoftwareUpdateAsync(final CancelServiceSoftwareUpdateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelServiceSoftwareUpdateRequest, CancelServiceSoftwareUpdateResult> asyncHandler) {
        final CancelServiceSoftwareUpdateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelServiceSoftwareUpdateResult>() {
            @Override
            public CancelServiceSoftwareUpdateResult call() throws Exception {
                CancelServiceSoftwareUpdateResult result = null;

                try {
                    result = executeCancelServiceSoftwareUpdate(finalRequest);
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
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest request) {

        return createDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(final CreateDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler) {
        final CreateDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDomainResult>() {
            @Override
            public CreateDomainResult call() throws Exception {
                CreateDomainResult result = null;

                try {
                    result = executeCreateDomain(finalRequest);
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
    public java.util.concurrent.Future<CreateOutboundConnectionResult> createOutboundConnectionAsync(CreateOutboundConnectionRequest request) {

        return createOutboundConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateOutboundConnectionResult> createOutboundConnectionAsync(final CreateOutboundConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateOutboundConnectionRequest, CreateOutboundConnectionResult> asyncHandler) {
        final CreateOutboundConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateOutboundConnectionResult>() {
            @Override
            public CreateOutboundConnectionResult call() throws Exception {
                CreateOutboundConnectionResult result = null;

                try {
                    result = executeCreateOutboundConnection(finalRequest);
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
    public java.util.concurrent.Future<CreatePackageResult> createPackageAsync(CreatePackageRequest request) {

        return createPackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePackageResult> createPackageAsync(final CreatePackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePackageRequest, CreatePackageResult> asyncHandler) {
        final CreatePackageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePackageResult>() {
            @Override
            public CreatePackageResult call() throws Exception {
                CreatePackageResult result = null;

                try {
                    result = executeCreatePackage(finalRequest);
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
    public java.util.concurrent.Future<CreateVpcEndpointResult> createVpcEndpointAsync(CreateVpcEndpointRequest request) {

        return createVpcEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpcEndpointResult> createVpcEndpointAsync(final CreateVpcEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVpcEndpointRequest, CreateVpcEndpointResult> asyncHandler) {
        final CreateVpcEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVpcEndpointResult>() {
            @Override
            public CreateVpcEndpointResult call() throws Exception {
                CreateVpcEndpointResult result = null;

                try {
                    result = executeCreateVpcEndpoint(finalRequest);
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
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest request) {

        return deleteDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(final DeleteDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler) {
        final DeleteDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDomainResult>() {
            @Override
            public DeleteDomainResult call() throws Exception {
                DeleteDomainResult result = null;

                try {
                    result = executeDeleteDomain(finalRequest);
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
    public java.util.concurrent.Future<DeleteInboundConnectionResult> deleteInboundConnectionAsync(DeleteInboundConnectionRequest request) {

        return deleteInboundConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInboundConnectionResult> deleteInboundConnectionAsync(final DeleteInboundConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInboundConnectionRequest, DeleteInboundConnectionResult> asyncHandler) {
        final DeleteInboundConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteInboundConnectionResult>() {
            @Override
            public DeleteInboundConnectionResult call() throws Exception {
                DeleteInboundConnectionResult result = null;

                try {
                    result = executeDeleteInboundConnection(finalRequest);
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
    public java.util.concurrent.Future<DeleteOutboundConnectionResult> deleteOutboundConnectionAsync(DeleteOutboundConnectionRequest request) {

        return deleteOutboundConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteOutboundConnectionResult> deleteOutboundConnectionAsync(final DeleteOutboundConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteOutboundConnectionRequest, DeleteOutboundConnectionResult> asyncHandler) {
        final DeleteOutboundConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteOutboundConnectionResult>() {
            @Override
            public DeleteOutboundConnectionResult call() throws Exception {
                DeleteOutboundConnectionResult result = null;

                try {
                    result = executeDeleteOutboundConnection(finalRequest);
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
    public java.util.concurrent.Future<DeletePackageResult> deletePackageAsync(DeletePackageRequest request) {

        return deletePackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePackageResult> deletePackageAsync(final DeletePackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePackageRequest, DeletePackageResult> asyncHandler) {
        final DeletePackageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePackageResult>() {
            @Override
            public DeletePackageResult call() throws Exception {
                DeletePackageResult result = null;

                try {
                    result = executeDeletePackage(finalRequest);
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
    public java.util.concurrent.Future<DeleteVpcEndpointResult> deleteVpcEndpointAsync(DeleteVpcEndpointRequest request) {

        return deleteVpcEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcEndpointResult> deleteVpcEndpointAsync(final DeleteVpcEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVpcEndpointRequest, DeleteVpcEndpointResult> asyncHandler) {
        final DeleteVpcEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVpcEndpointResult>() {
            @Override
            public DeleteVpcEndpointResult call() throws Exception {
                DeleteVpcEndpointResult result = null;

                try {
                    result = executeDeleteVpcEndpoint(finalRequest);
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
    public java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(DescribeDomainRequest request) {

        return describeDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(final DescribeDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDomainRequest, DescribeDomainResult> asyncHandler) {
        final DescribeDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDomainResult>() {
            @Override
            public DescribeDomainResult call() throws Exception {
                DescribeDomainResult result = null;

                try {
                    result = executeDescribeDomain(finalRequest);
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
    public java.util.concurrent.Future<DescribeDomainAutoTunesResult> describeDomainAutoTunesAsync(DescribeDomainAutoTunesRequest request) {

        return describeDomainAutoTunesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDomainAutoTunesResult> describeDomainAutoTunesAsync(final DescribeDomainAutoTunesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDomainAutoTunesRequest, DescribeDomainAutoTunesResult> asyncHandler) {
        final DescribeDomainAutoTunesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDomainAutoTunesResult>() {
            @Override
            public DescribeDomainAutoTunesResult call() throws Exception {
                DescribeDomainAutoTunesResult result = null;

                try {
                    result = executeDescribeDomainAutoTunes(finalRequest);
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
    public java.util.concurrent.Future<DescribeDomainChangeProgressResult> describeDomainChangeProgressAsync(DescribeDomainChangeProgressRequest request) {

        return describeDomainChangeProgressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDomainChangeProgressResult> describeDomainChangeProgressAsync(final DescribeDomainChangeProgressRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDomainChangeProgressRequest, DescribeDomainChangeProgressResult> asyncHandler) {
        final DescribeDomainChangeProgressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDomainChangeProgressResult>() {
            @Override
            public DescribeDomainChangeProgressResult call() throws Exception {
                DescribeDomainChangeProgressResult result = null;

                try {
                    result = executeDescribeDomainChangeProgress(finalRequest);
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
    public java.util.concurrent.Future<DescribeDomainConfigResult> describeDomainConfigAsync(DescribeDomainConfigRequest request) {

        return describeDomainConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDomainConfigResult> describeDomainConfigAsync(final DescribeDomainConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDomainConfigRequest, DescribeDomainConfigResult> asyncHandler) {
        final DescribeDomainConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDomainConfigResult>() {
            @Override
            public DescribeDomainConfigResult call() throws Exception {
                DescribeDomainConfigResult result = null;

                try {
                    result = executeDescribeDomainConfig(finalRequest);
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
    public java.util.concurrent.Future<DescribeDomainsResult> describeDomainsAsync(DescribeDomainsRequest request) {

        return describeDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDomainsResult> describeDomainsAsync(final DescribeDomainsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDomainsRequest, DescribeDomainsResult> asyncHandler) {
        final DescribeDomainsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDomainsResult>() {
            @Override
            public DescribeDomainsResult call() throws Exception {
                DescribeDomainsResult result = null;

                try {
                    result = executeDescribeDomains(finalRequest);
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
    public java.util.concurrent.Future<DescribeInboundConnectionsResult> describeInboundConnectionsAsync(DescribeInboundConnectionsRequest request) {

        return describeInboundConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInboundConnectionsResult> describeInboundConnectionsAsync(final DescribeInboundConnectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInboundConnectionsRequest, DescribeInboundConnectionsResult> asyncHandler) {
        final DescribeInboundConnectionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInboundConnectionsResult>() {
            @Override
            public DescribeInboundConnectionsResult call() throws Exception {
                DescribeInboundConnectionsResult result = null;

                try {
                    result = executeDescribeInboundConnections(finalRequest);
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
    public java.util.concurrent.Future<DescribeInstanceTypeLimitsResult> describeInstanceTypeLimitsAsync(DescribeInstanceTypeLimitsRequest request) {

        return describeInstanceTypeLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceTypeLimitsResult> describeInstanceTypeLimitsAsync(final DescribeInstanceTypeLimitsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstanceTypeLimitsRequest, DescribeInstanceTypeLimitsResult> asyncHandler) {
        final DescribeInstanceTypeLimitsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstanceTypeLimitsResult>() {
            @Override
            public DescribeInstanceTypeLimitsResult call() throws Exception {
                DescribeInstanceTypeLimitsResult result = null;

                try {
                    result = executeDescribeInstanceTypeLimits(finalRequest);
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
    public java.util.concurrent.Future<DescribeOutboundConnectionsResult> describeOutboundConnectionsAsync(DescribeOutboundConnectionsRequest request) {

        return describeOutboundConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOutboundConnectionsResult> describeOutboundConnectionsAsync(final DescribeOutboundConnectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOutboundConnectionsRequest, DescribeOutboundConnectionsResult> asyncHandler) {
        final DescribeOutboundConnectionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeOutboundConnectionsResult>() {
            @Override
            public DescribeOutboundConnectionsResult call() throws Exception {
                DescribeOutboundConnectionsResult result = null;

                try {
                    result = executeDescribeOutboundConnections(finalRequest);
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
    public java.util.concurrent.Future<DescribePackagesResult> describePackagesAsync(DescribePackagesRequest request) {

        return describePackagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePackagesResult> describePackagesAsync(final DescribePackagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePackagesRequest, DescribePackagesResult> asyncHandler) {
        final DescribePackagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePackagesResult>() {
            @Override
            public DescribePackagesResult call() throws Exception {
                DescribePackagesResult result = null;

                try {
                    result = executeDescribePackages(finalRequest);
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
    public java.util.concurrent.Future<DescribeReservedInstanceOfferingsResult> describeReservedInstanceOfferingsAsync(
            DescribeReservedInstanceOfferingsRequest request) {

        return describeReservedInstanceOfferingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedInstanceOfferingsResult> describeReservedInstanceOfferingsAsync(
            final DescribeReservedInstanceOfferingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReservedInstanceOfferingsRequest, DescribeReservedInstanceOfferingsResult> asyncHandler) {
        final DescribeReservedInstanceOfferingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReservedInstanceOfferingsResult>() {
            @Override
            public DescribeReservedInstanceOfferingsResult call() throws Exception {
                DescribeReservedInstanceOfferingsResult result = null;

                try {
                    result = executeDescribeReservedInstanceOfferings(finalRequest);
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
    public java.util.concurrent.Future<DescribeReservedInstancesResult> describeReservedInstancesAsync(DescribeReservedInstancesRequest request) {

        return describeReservedInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesResult> describeReservedInstancesAsync(final DescribeReservedInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesRequest, DescribeReservedInstancesResult> asyncHandler) {
        final DescribeReservedInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReservedInstancesResult>() {
            @Override
            public DescribeReservedInstancesResult call() throws Exception {
                DescribeReservedInstancesResult result = null;

                try {
                    result = executeDescribeReservedInstances(finalRequest);
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
    public java.util.concurrent.Future<DescribeVpcEndpointsResult> describeVpcEndpointsAsync(DescribeVpcEndpointsRequest request) {

        return describeVpcEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointsResult> describeVpcEndpointsAsync(final DescribeVpcEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointsRequest, DescribeVpcEndpointsResult> asyncHandler) {
        final DescribeVpcEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVpcEndpointsResult>() {
            @Override
            public DescribeVpcEndpointsResult call() throws Exception {
                DescribeVpcEndpointsResult result = null;

                try {
                    result = executeDescribeVpcEndpoints(finalRequest);
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
    public java.util.concurrent.Future<DissociatePackageResult> dissociatePackageAsync(DissociatePackageRequest request) {

        return dissociatePackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DissociatePackageResult> dissociatePackageAsync(final DissociatePackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DissociatePackageRequest, DissociatePackageResult> asyncHandler) {
        final DissociatePackageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DissociatePackageResult>() {
            @Override
            public DissociatePackageResult call() throws Exception {
                DissociatePackageResult result = null;

                try {
                    result = executeDissociatePackage(finalRequest);
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
    public java.util.concurrent.Future<GetCompatibleVersionsResult> getCompatibleVersionsAsync(GetCompatibleVersionsRequest request) {

        return getCompatibleVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCompatibleVersionsResult> getCompatibleVersionsAsync(final GetCompatibleVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCompatibleVersionsRequest, GetCompatibleVersionsResult> asyncHandler) {
        final GetCompatibleVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCompatibleVersionsResult>() {
            @Override
            public GetCompatibleVersionsResult call() throws Exception {
                GetCompatibleVersionsResult result = null;

                try {
                    result = executeGetCompatibleVersions(finalRequest);
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
    public java.util.concurrent.Future<GetPackageVersionHistoryResult> getPackageVersionHistoryAsync(GetPackageVersionHistoryRequest request) {

        return getPackageVersionHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPackageVersionHistoryResult> getPackageVersionHistoryAsync(final GetPackageVersionHistoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPackageVersionHistoryRequest, GetPackageVersionHistoryResult> asyncHandler) {
        final GetPackageVersionHistoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPackageVersionHistoryResult>() {
            @Override
            public GetPackageVersionHistoryResult call() throws Exception {
                GetPackageVersionHistoryResult result = null;

                try {
                    result = executeGetPackageVersionHistory(finalRequest);
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
    public java.util.concurrent.Future<GetUpgradeHistoryResult> getUpgradeHistoryAsync(GetUpgradeHistoryRequest request) {

        return getUpgradeHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUpgradeHistoryResult> getUpgradeHistoryAsync(final GetUpgradeHistoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUpgradeHistoryRequest, GetUpgradeHistoryResult> asyncHandler) {
        final GetUpgradeHistoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUpgradeHistoryResult>() {
            @Override
            public GetUpgradeHistoryResult call() throws Exception {
                GetUpgradeHistoryResult result = null;

                try {
                    result = executeGetUpgradeHistory(finalRequest);
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
    public java.util.concurrent.Future<GetUpgradeStatusResult> getUpgradeStatusAsync(GetUpgradeStatusRequest request) {

        return getUpgradeStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUpgradeStatusResult> getUpgradeStatusAsync(final GetUpgradeStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUpgradeStatusRequest, GetUpgradeStatusResult> asyncHandler) {
        final GetUpgradeStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUpgradeStatusResult>() {
            @Override
            public GetUpgradeStatusResult call() throws Exception {
                GetUpgradeStatusResult result = null;

                try {
                    result = executeGetUpgradeStatus(finalRequest);
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
    public java.util.concurrent.Future<ListDomainNamesResult> listDomainNamesAsync(ListDomainNamesRequest request) {

        return listDomainNamesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDomainNamesResult> listDomainNamesAsync(final ListDomainNamesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDomainNamesRequest, ListDomainNamesResult> asyncHandler) {
        final ListDomainNamesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDomainNamesResult>() {
            @Override
            public ListDomainNamesResult call() throws Exception {
                ListDomainNamesResult result = null;

                try {
                    result = executeListDomainNames(finalRequest);
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
    public java.util.concurrent.Future<ListDomainsForPackageResult> listDomainsForPackageAsync(ListDomainsForPackageRequest request) {

        return listDomainsForPackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDomainsForPackageResult> listDomainsForPackageAsync(final ListDomainsForPackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDomainsForPackageRequest, ListDomainsForPackageResult> asyncHandler) {
        final ListDomainsForPackageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDomainsForPackageResult>() {
            @Override
            public ListDomainsForPackageResult call() throws Exception {
                ListDomainsForPackageResult result = null;

                try {
                    result = executeListDomainsForPackage(finalRequest);
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
    public java.util.concurrent.Future<ListInstanceTypeDetailsResult> listInstanceTypeDetailsAsync(ListInstanceTypeDetailsRequest request) {

        return listInstanceTypeDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstanceTypeDetailsResult> listInstanceTypeDetailsAsync(final ListInstanceTypeDetailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInstanceTypeDetailsRequest, ListInstanceTypeDetailsResult> asyncHandler) {
        final ListInstanceTypeDetailsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInstanceTypeDetailsResult>() {
            @Override
            public ListInstanceTypeDetailsResult call() throws Exception {
                ListInstanceTypeDetailsResult result = null;

                try {
                    result = executeListInstanceTypeDetails(finalRequest);
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
    public java.util.concurrent.Future<ListPackagesForDomainResult> listPackagesForDomainAsync(ListPackagesForDomainRequest request) {

        return listPackagesForDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPackagesForDomainResult> listPackagesForDomainAsync(final ListPackagesForDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPackagesForDomainRequest, ListPackagesForDomainResult> asyncHandler) {
        final ListPackagesForDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPackagesForDomainResult>() {
            @Override
            public ListPackagesForDomainResult call() throws Exception {
                ListPackagesForDomainResult result = null;

                try {
                    result = executeListPackagesForDomain(finalRequest);
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
    public java.util.concurrent.Future<ListVersionsResult> listVersionsAsync(ListVersionsRequest request) {

        return listVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVersionsResult> listVersionsAsync(final ListVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVersionsRequest, ListVersionsResult> asyncHandler) {
        final ListVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVersionsResult>() {
            @Override
            public ListVersionsResult call() throws Exception {
                ListVersionsResult result = null;

                try {
                    result = executeListVersions(finalRequest);
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
    public java.util.concurrent.Future<ListVpcEndpointAccessResult> listVpcEndpointAccessAsync(ListVpcEndpointAccessRequest request) {

        return listVpcEndpointAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVpcEndpointAccessResult> listVpcEndpointAccessAsync(final ListVpcEndpointAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVpcEndpointAccessRequest, ListVpcEndpointAccessResult> asyncHandler) {
        final ListVpcEndpointAccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVpcEndpointAccessResult>() {
            @Override
            public ListVpcEndpointAccessResult call() throws Exception {
                ListVpcEndpointAccessResult result = null;

                try {
                    result = executeListVpcEndpointAccess(finalRequest);
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
    public java.util.concurrent.Future<ListVpcEndpointsResult> listVpcEndpointsAsync(ListVpcEndpointsRequest request) {

        return listVpcEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVpcEndpointsResult> listVpcEndpointsAsync(final ListVpcEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVpcEndpointsRequest, ListVpcEndpointsResult> asyncHandler) {
        final ListVpcEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVpcEndpointsResult>() {
            @Override
            public ListVpcEndpointsResult call() throws Exception {
                ListVpcEndpointsResult result = null;

                try {
                    result = executeListVpcEndpoints(finalRequest);
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
    public java.util.concurrent.Future<ListVpcEndpointsForDomainResult> listVpcEndpointsForDomainAsync(ListVpcEndpointsForDomainRequest request) {

        return listVpcEndpointsForDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVpcEndpointsForDomainResult> listVpcEndpointsForDomainAsync(final ListVpcEndpointsForDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVpcEndpointsForDomainRequest, ListVpcEndpointsForDomainResult> asyncHandler) {
        final ListVpcEndpointsForDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVpcEndpointsForDomainResult>() {
            @Override
            public ListVpcEndpointsForDomainResult call() throws Exception {
                ListVpcEndpointsForDomainResult result = null;

                try {
                    result = executeListVpcEndpointsForDomain(finalRequest);
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
    public java.util.concurrent.Future<PurchaseReservedInstanceOfferingResult> purchaseReservedInstanceOfferingAsync(
            PurchaseReservedInstanceOfferingRequest request) {

        return purchaseReservedInstanceOfferingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PurchaseReservedInstanceOfferingResult> purchaseReservedInstanceOfferingAsync(
            final PurchaseReservedInstanceOfferingRequest request,
            final com.amazonaws.handlers.AsyncHandler<PurchaseReservedInstanceOfferingRequest, PurchaseReservedInstanceOfferingResult> asyncHandler) {
        final PurchaseReservedInstanceOfferingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PurchaseReservedInstanceOfferingResult>() {
            @Override
            public PurchaseReservedInstanceOfferingResult call() throws Exception {
                PurchaseReservedInstanceOfferingResult result = null;

                try {
                    result = executePurchaseReservedInstanceOffering(finalRequest);
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
    public java.util.concurrent.Future<RejectInboundConnectionResult> rejectInboundConnectionAsync(RejectInboundConnectionRequest request) {

        return rejectInboundConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectInboundConnectionResult> rejectInboundConnectionAsync(final RejectInboundConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RejectInboundConnectionRequest, RejectInboundConnectionResult> asyncHandler) {
        final RejectInboundConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RejectInboundConnectionResult>() {
            @Override
            public RejectInboundConnectionResult call() throws Exception {
                RejectInboundConnectionResult result = null;

                try {
                    result = executeRejectInboundConnection(finalRequest);
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
    public java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest request) {

        return removeTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(final RemoveTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler) {
        final RemoveTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveTagsResult>() {
            @Override
            public RemoveTagsResult call() throws Exception {
                RemoveTagsResult result = null;

                try {
                    result = executeRemoveTags(finalRequest);
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
    public java.util.concurrent.Future<RevokeVpcEndpointAccessResult> revokeVpcEndpointAccessAsync(RevokeVpcEndpointAccessRequest request) {

        return revokeVpcEndpointAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RevokeVpcEndpointAccessResult> revokeVpcEndpointAccessAsync(final RevokeVpcEndpointAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<RevokeVpcEndpointAccessRequest, RevokeVpcEndpointAccessResult> asyncHandler) {
        final RevokeVpcEndpointAccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RevokeVpcEndpointAccessResult>() {
            @Override
            public RevokeVpcEndpointAccessResult call() throws Exception {
                RevokeVpcEndpointAccessResult result = null;

                try {
                    result = executeRevokeVpcEndpointAccess(finalRequest);
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
    public java.util.concurrent.Future<StartServiceSoftwareUpdateResult> startServiceSoftwareUpdateAsync(StartServiceSoftwareUpdateRequest request) {

        return startServiceSoftwareUpdateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartServiceSoftwareUpdateResult> startServiceSoftwareUpdateAsync(final StartServiceSoftwareUpdateRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartServiceSoftwareUpdateRequest, StartServiceSoftwareUpdateResult> asyncHandler) {
        final StartServiceSoftwareUpdateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartServiceSoftwareUpdateResult>() {
            @Override
            public StartServiceSoftwareUpdateResult call() throws Exception {
                StartServiceSoftwareUpdateResult result = null;

                try {
                    result = executeStartServiceSoftwareUpdate(finalRequest);
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
    public java.util.concurrent.Future<UpdateDomainConfigResult> updateDomainConfigAsync(UpdateDomainConfigRequest request) {

        return updateDomainConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainConfigResult> updateDomainConfigAsync(final UpdateDomainConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDomainConfigRequest, UpdateDomainConfigResult> asyncHandler) {
        final UpdateDomainConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDomainConfigResult>() {
            @Override
            public UpdateDomainConfigResult call() throws Exception {
                UpdateDomainConfigResult result = null;

                try {
                    result = executeUpdateDomainConfig(finalRequest);
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
    public java.util.concurrent.Future<UpdatePackageResult> updatePackageAsync(UpdatePackageRequest request) {

        return updatePackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePackageResult> updatePackageAsync(final UpdatePackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePackageRequest, UpdatePackageResult> asyncHandler) {
        final UpdatePackageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePackageResult>() {
            @Override
            public UpdatePackageResult call() throws Exception {
                UpdatePackageResult result = null;

                try {
                    result = executeUpdatePackage(finalRequest);
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
    public java.util.concurrent.Future<UpdateVpcEndpointResult> updateVpcEndpointAsync(UpdateVpcEndpointRequest request) {

        return updateVpcEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVpcEndpointResult> updateVpcEndpointAsync(final UpdateVpcEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateVpcEndpointRequest, UpdateVpcEndpointResult> asyncHandler) {
        final UpdateVpcEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateVpcEndpointResult>() {
            @Override
            public UpdateVpcEndpointResult call() throws Exception {
                UpdateVpcEndpointResult result = null;

                try {
                    result = executeUpdateVpcEndpoint(finalRequest);
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
    public java.util.concurrent.Future<UpgradeDomainResult> upgradeDomainAsync(UpgradeDomainRequest request) {

        return upgradeDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpgradeDomainResult> upgradeDomainAsync(final UpgradeDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpgradeDomainRequest, UpgradeDomainResult> asyncHandler) {
        final UpgradeDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpgradeDomainResult>() {
            @Override
            public UpgradeDomainResult call() throws Exception {
                UpgradeDomainResult result = null;

                try {
                    result = executeUpgradeDomain(finalRequest);
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
