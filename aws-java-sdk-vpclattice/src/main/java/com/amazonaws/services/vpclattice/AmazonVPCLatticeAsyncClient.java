/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.vpclattice;

import javax.annotation.Generated;

import com.amazonaws.services.vpclattice.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon VPC Lattice asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon VPC Lattice is a fully managed application networking service that you use to connect, secure, and monitor all
 * of your services across multiple accounts and virtual private clouds (VPCs). Amazon VPC Lattice interconnects your
 * microservices and legacy services within a logical boundary, so that you can discover and manage them more
 * efficiently. For more information, see the <a href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/">Amazon VPC
 * Lattice User Guide</a>
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonVPCLatticeAsyncClient extends AmazonVPCLatticeClient implements AmazonVPCLatticeAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonVPCLatticeAsyncClientBuilder asyncBuilder() {
        return AmazonVPCLatticeAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon VPC Lattice using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonVPCLatticeAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon VPC Lattice using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonVPCLatticeAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchUpdateRuleResult> batchUpdateRuleAsync(BatchUpdateRuleRequest request) {

        return batchUpdateRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateRuleResult> batchUpdateRuleAsync(final BatchUpdateRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchUpdateRuleRequest, BatchUpdateRuleResult> asyncHandler) {
        final BatchUpdateRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchUpdateRuleResult>() {
            @Override
            public BatchUpdateRuleResult call() throws Exception {
                BatchUpdateRuleResult result = null;

                try {
                    result = executeBatchUpdateRule(finalRequest);
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
    public java.util.concurrent.Future<CreateAccessLogSubscriptionResult> createAccessLogSubscriptionAsync(CreateAccessLogSubscriptionRequest request) {

        return createAccessLogSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAccessLogSubscriptionResult> createAccessLogSubscriptionAsync(final CreateAccessLogSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAccessLogSubscriptionRequest, CreateAccessLogSubscriptionResult> asyncHandler) {
        final CreateAccessLogSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAccessLogSubscriptionResult>() {
            @Override
            public CreateAccessLogSubscriptionResult call() throws Exception {
                CreateAccessLogSubscriptionResult result = null;

                try {
                    result = executeCreateAccessLogSubscription(finalRequest);
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
    public java.util.concurrent.Future<CreateListenerResult> createListenerAsync(CreateListenerRequest request) {

        return createListenerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateListenerResult> createListenerAsync(final CreateListenerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateListenerRequest, CreateListenerResult> asyncHandler) {
        final CreateListenerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateListenerResult>() {
            @Override
            public CreateListenerResult call() throws Exception {
                CreateListenerResult result = null;

                try {
                    result = executeCreateListener(finalRequest);
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
    public java.util.concurrent.Future<CreateRuleResult> createRuleAsync(CreateRuleRequest request) {

        return createRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRuleResult> createRuleAsync(final CreateRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRuleRequest, CreateRuleResult> asyncHandler) {
        final CreateRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRuleResult>() {
            @Override
            public CreateRuleResult call() throws Exception {
                CreateRuleResult result = null;

                try {
                    result = executeCreateRule(finalRequest);
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
    public java.util.concurrent.Future<CreateServiceResult> createServiceAsync(CreateServiceRequest request) {

        return createServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateServiceResult> createServiceAsync(final CreateServiceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateServiceRequest, CreateServiceResult> asyncHandler) {
        final CreateServiceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateServiceResult>() {
            @Override
            public CreateServiceResult call() throws Exception {
                CreateServiceResult result = null;

                try {
                    result = executeCreateService(finalRequest);
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
    public java.util.concurrent.Future<CreateServiceNetworkResult> createServiceNetworkAsync(CreateServiceNetworkRequest request) {

        return createServiceNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateServiceNetworkResult> createServiceNetworkAsync(final CreateServiceNetworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateServiceNetworkRequest, CreateServiceNetworkResult> asyncHandler) {
        final CreateServiceNetworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateServiceNetworkResult>() {
            @Override
            public CreateServiceNetworkResult call() throws Exception {
                CreateServiceNetworkResult result = null;

                try {
                    result = executeCreateServiceNetwork(finalRequest);
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
    public java.util.concurrent.Future<CreateServiceNetworkServiceAssociationResult> createServiceNetworkServiceAssociationAsync(
            CreateServiceNetworkServiceAssociationRequest request) {

        return createServiceNetworkServiceAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateServiceNetworkServiceAssociationResult> createServiceNetworkServiceAssociationAsync(
            final CreateServiceNetworkServiceAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateServiceNetworkServiceAssociationRequest, CreateServiceNetworkServiceAssociationResult> asyncHandler) {
        final CreateServiceNetworkServiceAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateServiceNetworkServiceAssociationResult>() {
            @Override
            public CreateServiceNetworkServiceAssociationResult call() throws Exception {
                CreateServiceNetworkServiceAssociationResult result = null;

                try {
                    result = executeCreateServiceNetworkServiceAssociation(finalRequest);
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
    public java.util.concurrent.Future<CreateServiceNetworkVpcAssociationResult> createServiceNetworkVpcAssociationAsync(
            CreateServiceNetworkVpcAssociationRequest request) {

        return createServiceNetworkVpcAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateServiceNetworkVpcAssociationResult> createServiceNetworkVpcAssociationAsync(
            final CreateServiceNetworkVpcAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateServiceNetworkVpcAssociationRequest, CreateServiceNetworkVpcAssociationResult> asyncHandler) {
        final CreateServiceNetworkVpcAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateServiceNetworkVpcAssociationResult>() {
            @Override
            public CreateServiceNetworkVpcAssociationResult call() throws Exception {
                CreateServiceNetworkVpcAssociationResult result = null;

                try {
                    result = executeCreateServiceNetworkVpcAssociation(finalRequest);
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
    public java.util.concurrent.Future<CreateTargetGroupResult> createTargetGroupAsync(CreateTargetGroupRequest request) {

        return createTargetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTargetGroupResult> createTargetGroupAsync(final CreateTargetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTargetGroupRequest, CreateTargetGroupResult> asyncHandler) {
        final CreateTargetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTargetGroupResult>() {
            @Override
            public CreateTargetGroupResult call() throws Exception {
                CreateTargetGroupResult result = null;

                try {
                    result = executeCreateTargetGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteAccessLogSubscriptionResult> deleteAccessLogSubscriptionAsync(DeleteAccessLogSubscriptionRequest request) {

        return deleteAccessLogSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAccessLogSubscriptionResult> deleteAccessLogSubscriptionAsync(final DeleteAccessLogSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAccessLogSubscriptionRequest, DeleteAccessLogSubscriptionResult> asyncHandler) {
        final DeleteAccessLogSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAccessLogSubscriptionResult>() {
            @Override
            public DeleteAccessLogSubscriptionResult call() throws Exception {
                DeleteAccessLogSubscriptionResult result = null;

                try {
                    result = executeDeleteAccessLogSubscription(finalRequest);
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
    public java.util.concurrent.Future<DeleteAuthPolicyResult> deleteAuthPolicyAsync(DeleteAuthPolicyRequest request) {

        return deleteAuthPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAuthPolicyResult> deleteAuthPolicyAsync(final DeleteAuthPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAuthPolicyRequest, DeleteAuthPolicyResult> asyncHandler) {
        final DeleteAuthPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAuthPolicyResult>() {
            @Override
            public DeleteAuthPolicyResult call() throws Exception {
                DeleteAuthPolicyResult result = null;

                try {
                    result = executeDeleteAuthPolicy(finalRequest);
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
    public java.util.concurrent.Future<DeleteListenerResult> deleteListenerAsync(DeleteListenerRequest request) {

        return deleteListenerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteListenerResult> deleteListenerAsync(final DeleteListenerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteListenerRequest, DeleteListenerResult> asyncHandler) {
        final DeleteListenerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteListenerResult>() {
            @Override
            public DeleteListenerResult call() throws Exception {
                DeleteListenerResult result = null;

                try {
                    result = executeDeleteListener(finalRequest);
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
    public java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest request) {

        return deleteResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(final DeleteResourcePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler) {
        final DeleteResourcePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResourcePolicyResult>() {
            @Override
            public DeleteResourcePolicyResult call() throws Exception {
                DeleteResourcePolicyResult result = null;

                try {
                    result = executeDeleteResourcePolicy(finalRequest);
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
    public java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest request) {

        return deleteRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(final DeleteRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRuleRequest, DeleteRuleResult> asyncHandler) {
        final DeleteRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRuleResult>() {
            @Override
            public DeleteRuleResult call() throws Exception {
                DeleteRuleResult result = null;

                try {
                    result = executeDeleteRule(finalRequest);
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
    public java.util.concurrent.Future<DeleteServiceResult> deleteServiceAsync(DeleteServiceRequest request) {

        return deleteServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteServiceResult> deleteServiceAsync(final DeleteServiceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteServiceRequest, DeleteServiceResult> asyncHandler) {
        final DeleteServiceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteServiceResult>() {
            @Override
            public DeleteServiceResult call() throws Exception {
                DeleteServiceResult result = null;

                try {
                    result = executeDeleteService(finalRequest);
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
    public java.util.concurrent.Future<DeleteServiceNetworkResult> deleteServiceNetworkAsync(DeleteServiceNetworkRequest request) {

        return deleteServiceNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteServiceNetworkResult> deleteServiceNetworkAsync(final DeleteServiceNetworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteServiceNetworkRequest, DeleteServiceNetworkResult> asyncHandler) {
        final DeleteServiceNetworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteServiceNetworkResult>() {
            @Override
            public DeleteServiceNetworkResult call() throws Exception {
                DeleteServiceNetworkResult result = null;

                try {
                    result = executeDeleteServiceNetwork(finalRequest);
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
    public java.util.concurrent.Future<DeleteServiceNetworkServiceAssociationResult> deleteServiceNetworkServiceAssociationAsync(
            DeleteServiceNetworkServiceAssociationRequest request) {

        return deleteServiceNetworkServiceAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteServiceNetworkServiceAssociationResult> deleteServiceNetworkServiceAssociationAsync(
            final DeleteServiceNetworkServiceAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteServiceNetworkServiceAssociationRequest, DeleteServiceNetworkServiceAssociationResult> asyncHandler) {
        final DeleteServiceNetworkServiceAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteServiceNetworkServiceAssociationResult>() {
            @Override
            public DeleteServiceNetworkServiceAssociationResult call() throws Exception {
                DeleteServiceNetworkServiceAssociationResult result = null;

                try {
                    result = executeDeleteServiceNetworkServiceAssociation(finalRequest);
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
    public java.util.concurrent.Future<DeleteServiceNetworkVpcAssociationResult> deleteServiceNetworkVpcAssociationAsync(
            DeleteServiceNetworkVpcAssociationRequest request) {

        return deleteServiceNetworkVpcAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteServiceNetworkVpcAssociationResult> deleteServiceNetworkVpcAssociationAsync(
            final DeleteServiceNetworkVpcAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteServiceNetworkVpcAssociationRequest, DeleteServiceNetworkVpcAssociationResult> asyncHandler) {
        final DeleteServiceNetworkVpcAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteServiceNetworkVpcAssociationResult>() {
            @Override
            public DeleteServiceNetworkVpcAssociationResult call() throws Exception {
                DeleteServiceNetworkVpcAssociationResult result = null;

                try {
                    result = executeDeleteServiceNetworkVpcAssociation(finalRequest);
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
    public java.util.concurrent.Future<DeleteTargetGroupResult> deleteTargetGroupAsync(DeleteTargetGroupRequest request) {

        return deleteTargetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTargetGroupResult> deleteTargetGroupAsync(final DeleteTargetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTargetGroupRequest, DeleteTargetGroupResult> asyncHandler) {
        final DeleteTargetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTargetGroupResult>() {
            @Override
            public DeleteTargetGroupResult call() throws Exception {
                DeleteTargetGroupResult result = null;

                try {
                    result = executeDeleteTargetGroup(finalRequest);
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
    public java.util.concurrent.Future<DeregisterTargetsResult> deregisterTargetsAsync(DeregisterTargetsRequest request) {

        return deregisterTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterTargetsResult> deregisterTargetsAsync(final DeregisterTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterTargetsRequest, DeregisterTargetsResult> asyncHandler) {
        final DeregisterTargetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterTargetsResult>() {
            @Override
            public DeregisterTargetsResult call() throws Exception {
                DeregisterTargetsResult result = null;

                try {
                    result = executeDeregisterTargets(finalRequest);
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
    public java.util.concurrent.Future<GetAccessLogSubscriptionResult> getAccessLogSubscriptionAsync(GetAccessLogSubscriptionRequest request) {

        return getAccessLogSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccessLogSubscriptionResult> getAccessLogSubscriptionAsync(final GetAccessLogSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccessLogSubscriptionRequest, GetAccessLogSubscriptionResult> asyncHandler) {
        final GetAccessLogSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAccessLogSubscriptionResult>() {
            @Override
            public GetAccessLogSubscriptionResult call() throws Exception {
                GetAccessLogSubscriptionResult result = null;

                try {
                    result = executeGetAccessLogSubscription(finalRequest);
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
    public java.util.concurrent.Future<GetAuthPolicyResult> getAuthPolicyAsync(GetAuthPolicyRequest request) {

        return getAuthPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAuthPolicyResult> getAuthPolicyAsync(final GetAuthPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAuthPolicyRequest, GetAuthPolicyResult> asyncHandler) {
        final GetAuthPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAuthPolicyResult>() {
            @Override
            public GetAuthPolicyResult call() throws Exception {
                GetAuthPolicyResult result = null;

                try {
                    result = executeGetAuthPolicy(finalRequest);
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
    public java.util.concurrent.Future<GetListenerResult> getListenerAsync(GetListenerRequest request) {

        return getListenerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetListenerResult> getListenerAsync(final GetListenerRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetListenerRequest, GetListenerResult> asyncHandler) {
        final GetListenerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetListenerResult>() {
            @Override
            public GetListenerResult call() throws Exception {
                GetListenerResult result = null;

                try {
                    result = executeGetListener(finalRequest);
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
    public java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest request) {

        return getResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(final GetResourcePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourcePolicyRequest, GetResourcePolicyResult> asyncHandler) {
        final GetResourcePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourcePolicyResult>() {
            @Override
            public GetResourcePolicyResult call() throws Exception {
                GetResourcePolicyResult result = null;

                try {
                    result = executeGetResourcePolicy(finalRequest);
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
    public java.util.concurrent.Future<GetRuleResult> getRuleAsync(GetRuleRequest request) {

        return getRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRuleResult> getRuleAsync(final GetRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRuleRequest, GetRuleResult> asyncHandler) {
        final GetRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRuleResult>() {
            @Override
            public GetRuleResult call() throws Exception {
                GetRuleResult result = null;

                try {
                    result = executeGetRule(finalRequest);
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
    public java.util.concurrent.Future<GetServiceResult> getServiceAsync(GetServiceRequest request) {

        return getServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceResult> getServiceAsync(final GetServiceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetServiceRequest, GetServiceResult> asyncHandler) {
        final GetServiceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetServiceResult>() {
            @Override
            public GetServiceResult call() throws Exception {
                GetServiceResult result = null;

                try {
                    result = executeGetService(finalRequest);
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
    public java.util.concurrent.Future<GetServiceNetworkResult> getServiceNetworkAsync(GetServiceNetworkRequest request) {

        return getServiceNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceNetworkResult> getServiceNetworkAsync(final GetServiceNetworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetServiceNetworkRequest, GetServiceNetworkResult> asyncHandler) {
        final GetServiceNetworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetServiceNetworkResult>() {
            @Override
            public GetServiceNetworkResult call() throws Exception {
                GetServiceNetworkResult result = null;

                try {
                    result = executeGetServiceNetwork(finalRequest);
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
    public java.util.concurrent.Future<GetServiceNetworkServiceAssociationResult> getServiceNetworkServiceAssociationAsync(
            GetServiceNetworkServiceAssociationRequest request) {

        return getServiceNetworkServiceAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceNetworkServiceAssociationResult> getServiceNetworkServiceAssociationAsync(
            final GetServiceNetworkServiceAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetServiceNetworkServiceAssociationRequest, GetServiceNetworkServiceAssociationResult> asyncHandler) {
        final GetServiceNetworkServiceAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetServiceNetworkServiceAssociationResult>() {
            @Override
            public GetServiceNetworkServiceAssociationResult call() throws Exception {
                GetServiceNetworkServiceAssociationResult result = null;

                try {
                    result = executeGetServiceNetworkServiceAssociation(finalRequest);
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
    public java.util.concurrent.Future<GetServiceNetworkVpcAssociationResult> getServiceNetworkVpcAssociationAsync(
            GetServiceNetworkVpcAssociationRequest request) {

        return getServiceNetworkVpcAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceNetworkVpcAssociationResult> getServiceNetworkVpcAssociationAsync(
            final GetServiceNetworkVpcAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetServiceNetworkVpcAssociationRequest, GetServiceNetworkVpcAssociationResult> asyncHandler) {
        final GetServiceNetworkVpcAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetServiceNetworkVpcAssociationResult>() {
            @Override
            public GetServiceNetworkVpcAssociationResult call() throws Exception {
                GetServiceNetworkVpcAssociationResult result = null;

                try {
                    result = executeGetServiceNetworkVpcAssociation(finalRequest);
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
    public java.util.concurrent.Future<GetTargetGroupResult> getTargetGroupAsync(GetTargetGroupRequest request) {

        return getTargetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTargetGroupResult> getTargetGroupAsync(final GetTargetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTargetGroupRequest, GetTargetGroupResult> asyncHandler) {
        final GetTargetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTargetGroupResult>() {
            @Override
            public GetTargetGroupResult call() throws Exception {
                GetTargetGroupResult result = null;

                try {
                    result = executeGetTargetGroup(finalRequest);
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
    public java.util.concurrent.Future<ListAccessLogSubscriptionsResult> listAccessLogSubscriptionsAsync(ListAccessLogSubscriptionsRequest request) {

        return listAccessLogSubscriptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccessLogSubscriptionsResult> listAccessLogSubscriptionsAsync(final ListAccessLogSubscriptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAccessLogSubscriptionsRequest, ListAccessLogSubscriptionsResult> asyncHandler) {
        final ListAccessLogSubscriptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAccessLogSubscriptionsResult>() {
            @Override
            public ListAccessLogSubscriptionsResult call() throws Exception {
                ListAccessLogSubscriptionsResult result = null;

                try {
                    result = executeListAccessLogSubscriptions(finalRequest);
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
    public java.util.concurrent.Future<ListListenersResult> listListenersAsync(ListListenersRequest request) {

        return listListenersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListListenersResult> listListenersAsync(final ListListenersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListListenersRequest, ListListenersResult> asyncHandler) {
        final ListListenersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListListenersResult>() {
            @Override
            public ListListenersResult call() throws Exception {
                ListListenersResult result = null;

                try {
                    result = executeListListeners(finalRequest);
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
    public java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest request) {

        return listRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRulesResult> listRulesAsync(final ListRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRulesRequest, ListRulesResult> asyncHandler) {
        final ListRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRulesResult>() {
            @Override
            public ListRulesResult call() throws Exception {
                ListRulesResult result = null;

                try {
                    result = executeListRules(finalRequest);
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
    public java.util.concurrent.Future<ListServiceNetworkServiceAssociationsResult> listServiceNetworkServiceAssociationsAsync(
            ListServiceNetworkServiceAssociationsRequest request) {

        return listServiceNetworkServiceAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServiceNetworkServiceAssociationsResult> listServiceNetworkServiceAssociationsAsync(
            final ListServiceNetworkServiceAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServiceNetworkServiceAssociationsRequest, ListServiceNetworkServiceAssociationsResult> asyncHandler) {
        final ListServiceNetworkServiceAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListServiceNetworkServiceAssociationsResult>() {
            @Override
            public ListServiceNetworkServiceAssociationsResult call() throws Exception {
                ListServiceNetworkServiceAssociationsResult result = null;

                try {
                    result = executeListServiceNetworkServiceAssociations(finalRequest);
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
    public java.util.concurrent.Future<ListServiceNetworkVpcAssociationsResult> listServiceNetworkVpcAssociationsAsync(
            ListServiceNetworkVpcAssociationsRequest request) {

        return listServiceNetworkVpcAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServiceNetworkVpcAssociationsResult> listServiceNetworkVpcAssociationsAsync(
            final ListServiceNetworkVpcAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServiceNetworkVpcAssociationsRequest, ListServiceNetworkVpcAssociationsResult> asyncHandler) {
        final ListServiceNetworkVpcAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListServiceNetworkVpcAssociationsResult>() {
            @Override
            public ListServiceNetworkVpcAssociationsResult call() throws Exception {
                ListServiceNetworkVpcAssociationsResult result = null;

                try {
                    result = executeListServiceNetworkVpcAssociations(finalRequest);
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
    public java.util.concurrent.Future<ListServiceNetworksResult> listServiceNetworksAsync(ListServiceNetworksRequest request) {

        return listServiceNetworksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServiceNetworksResult> listServiceNetworksAsync(final ListServiceNetworksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServiceNetworksRequest, ListServiceNetworksResult> asyncHandler) {
        final ListServiceNetworksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListServiceNetworksResult>() {
            @Override
            public ListServiceNetworksResult call() throws Exception {
                ListServiceNetworksResult result = null;

                try {
                    result = executeListServiceNetworks(finalRequest);
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
    public java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest request) {

        return listServicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServicesResult> listServicesAsync(final ListServicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServicesRequest, ListServicesResult> asyncHandler) {
        final ListServicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListServicesResult>() {
            @Override
            public ListServicesResult call() throws Exception {
                ListServicesResult result = null;

                try {
                    result = executeListServices(finalRequest);
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
    public java.util.concurrent.Future<ListTargetGroupsResult> listTargetGroupsAsync(ListTargetGroupsRequest request) {

        return listTargetGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTargetGroupsResult> listTargetGroupsAsync(final ListTargetGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTargetGroupsRequest, ListTargetGroupsResult> asyncHandler) {
        final ListTargetGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTargetGroupsResult>() {
            @Override
            public ListTargetGroupsResult call() throws Exception {
                ListTargetGroupsResult result = null;

                try {
                    result = executeListTargetGroups(finalRequest);
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
    public java.util.concurrent.Future<ListTargetsResult> listTargetsAsync(ListTargetsRequest request) {

        return listTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTargetsResult> listTargetsAsync(final ListTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTargetsRequest, ListTargetsResult> asyncHandler) {
        final ListTargetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTargetsResult>() {
            @Override
            public ListTargetsResult call() throws Exception {
                ListTargetsResult result = null;

                try {
                    result = executeListTargets(finalRequest);
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
    public java.util.concurrent.Future<PutAuthPolicyResult> putAuthPolicyAsync(PutAuthPolicyRequest request) {

        return putAuthPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAuthPolicyResult> putAuthPolicyAsync(final PutAuthPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutAuthPolicyRequest, PutAuthPolicyResult> asyncHandler) {
        final PutAuthPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutAuthPolicyResult>() {
            @Override
            public PutAuthPolicyResult call() throws Exception {
                PutAuthPolicyResult result = null;

                try {
                    result = executePutAuthPolicy(finalRequest);
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
    public java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest request) {

        return putResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(final PutResourcePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutResourcePolicyRequest, PutResourcePolicyResult> asyncHandler) {
        final PutResourcePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutResourcePolicyResult>() {
            @Override
            public PutResourcePolicyResult call() throws Exception {
                PutResourcePolicyResult result = null;

                try {
                    result = executePutResourcePolicy(finalRequest);
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
    public java.util.concurrent.Future<RegisterTargetsResult> registerTargetsAsync(RegisterTargetsRequest request) {

        return registerTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterTargetsResult> registerTargetsAsync(final RegisterTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterTargetsRequest, RegisterTargetsResult> asyncHandler) {
        final RegisterTargetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterTargetsResult>() {
            @Override
            public RegisterTargetsResult call() throws Exception {
                RegisterTargetsResult result = null;

                try {
                    result = executeRegisterTargets(finalRequest);
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
    public java.util.concurrent.Future<UpdateAccessLogSubscriptionResult> updateAccessLogSubscriptionAsync(UpdateAccessLogSubscriptionRequest request) {

        return updateAccessLogSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAccessLogSubscriptionResult> updateAccessLogSubscriptionAsync(final UpdateAccessLogSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAccessLogSubscriptionRequest, UpdateAccessLogSubscriptionResult> asyncHandler) {
        final UpdateAccessLogSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAccessLogSubscriptionResult>() {
            @Override
            public UpdateAccessLogSubscriptionResult call() throws Exception {
                UpdateAccessLogSubscriptionResult result = null;

                try {
                    result = executeUpdateAccessLogSubscription(finalRequest);
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
    public java.util.concurrent.Future<UpdateListenerResult> updateListenerAsync(UpdateListenerRequest request) {

        return updateListenerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateListenerResult> updateListenerAsync(final UpdateListenerRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateListenerRequest, UpdateListenerResult> asyncHandler) {
        final UpdateListenerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateListenerResult>() {
            @Override
            public UpdateListenerResult call() throws Exception {
                UpdateListenerResult result = null;

                try {
                    result = executeUpdateListener(finalRequest);
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
    public java.util.concurrent.Future<UpdateRuleResult> updateRuleAsync(UpdateRuleRequest request) {

        return updateRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRuleResult> updateRuleAsync(final UpdateRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRuleRequest, UpdateRuleResult> asyncHandler) {
        final UpdateRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRuleResult>() {
            @Override
            public UpdateRuleResult call() throws Exception {
                UpdateRuleResult result = null;

                try {
                    result = executeUpdateRule(finalRequest);
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
    public java.util.concurrent.Future<UpdateServiceResult> updateServiceAsync(UpdateServiceRequest request) {

        return updateServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceResult> updateServiceAsync(final UpdateServiceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateServiceRequest, UpdateServiceResult> asyncHandler) {
        final UpdateServiceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateServiceResult>() {
            @Override
            public UpdateServiceResult call() throws Exception {
                UpdateServiceResult result = null;

                try {
                    result = executeUpdateService(finalRequest);
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
    public java.util.concurrent.Future<UpdateServiceNetworkResult> updateServiceNetworkAsync(UpdateServiceNetworkRequest request) {

        return updateServiceNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceNetworkResult> updateServiceNetworkAsync(final UpdateServiceNetworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateServiceNetworkRequest, UpdateServiceNetworkResult> asyncHandler) {
        final UpdateServiceNetworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateServiceNetworkResult>() {
            @Override
            public UpdateServiceNetworkResult call() throws Exception {
                UpdateServiceNetworkResult result = null;

                try {
                    result = executeUpdateServiceNetwork(finalRequest);
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
    public java.util.concurrent.Future<UpdateServiceNetworkVpcAssociationResult> updateServiceNetworkVpcAssociationAsync(
            UpdateServiceNetworkVpcAssociationRequest request) {

        return updateServiceNetworkVpcAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceNetworkVpcAssociationResult> updateServiceNetworkVpcAssociationAsync(
            final UpdateServiceNetworkVpcAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateServiceNetworkVpcAssociationRequest, UpdateServiceNetworkVpcAssociationResult> asyncHandler) {
        final UpdateServiceNetworkVpcAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateServiceNetworkVpcAssociationResult>() {
            @Override
            public UpdateServiceNetworkVpcAssociationResult call() throws Exception {
                UpdateServiceNetworkVpcAssociationResult result = null;

                try {
                    result = executeUpdateServiceNetworkVpcAssociation(finalRequest);
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
    public java.util.concurrent.Future<UpdateTargetGroupResult> updateTargetGroupAsync(UpdateTargetGroupRequest request) {

        return updateTargetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTargetGroupResult> updateTargetGroupAsync(final UpdateTargetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTargetGroupRequest, UpdateTargetGroupResult> asyncHandler) {
        final UpdateTargetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTargetGroupResult>() {
            @Override
            public UpdateTargetGroupResult call() throws Exception {
                UpdateTargetGroupResult result = null;

                try {
                    result = executeUpdateTargetGroup(finalRequest);
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
