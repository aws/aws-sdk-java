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
package com.amazonaws.services.route53resolver;

import javax.annotation.Generated;

import com.amazonaws.services.route53resolver.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Route53Resolver asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Here's how you set up to query an Amazon Route 53 private hosted zone from your network:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Connect your network to a VPC using AWS Direct Connect or a VPN.
 * </p>
 * </li>
 * <li>
 * <p>
 * Run the following AWS CLI command to create a Resolver endpoint:
 * </p>
 * <p>
 * <code>create-resolver-endpoint --name [endpoint_name] --direction INBOUND --creator-request-id [unique_string] --security-group-ids [security_group_with_inbound_rules] --ip-addresses SubnetId=[subnet_id] SubnetId=[subnet_id_in_different_AZ]</code>
 * </p>
 * <p>
 * Note the resolver endpoint ID that appears in the response. You'll use it in step 3.
 * </p>
 * </li>
 * <li>
 * <p>
 * Get the IP addresses for the Resolver endpoints:
 * </p>
 * <p>
 * <code>get-resolver-endpoint --resolver-endpoint-id [resolver_endpoint_id]</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * In your network configuration, define the IP addresses that you got in step 3 as DNS servers.
 * </p>
 * <p>
 * You can now query instance names in your VPCs and the names of records in your private hosted zone.
 * </p>
 * </li>
 * </ol>
 * <p>
 * You can also perform the following operations using the AWS CLI:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>list-resolver-endpoints</code>: List all endpoints. The syntax includes options for pagination and filtering.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>update-resolver-endpoints</code>: Add IP addresses to an endpoint or remove IP addresses from an endpoint.
 * </p>
 * </li>
 * </ul>
 * <p>
 * To delete an endpoint, use the following AWS CLI command:
 * </p>
 * <p>
 * <code>delete-resolver-endpoint --resolver-endpoint-id [resolver_endpoint_id]</code>
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonRoute53ResolverAsyncClient extends AmazonRoute53ResolverClient implements AmazonRoute53ResolverAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonRoute53ResolverAsyncClientBuilder asyncBuilder() {
        return AmazonRoute53ResolverAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Route53Resolver using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonRoute53ResolverAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AssociateResolverEndpointIpAddressResult> associateResolverEndpointIpAddressAsync(
            AssociateResolverEndpointIpAddressRequest request) {

        return associateResolverEndpointIpAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateResolverEndpointIpAddressResult> associateResolverEndpointIpAddressAsync(
            final AssociateResolverEndpointIpAddressRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateResolverEndpointIpAddressRequest, AssociateResolverEndpointIpAddressResult> asyncHandler) {
        final AssociateResolverEndpointIpAddressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateResolverEndpointIpAddressResult>() {
            @Override
            public AssociateResolverEndpointIpAddressResult call() throws Exception {
                AssociateResolverEndpointIpAddressResult result = null;

                try {
                    result = executeAssociateResolverEndpointIpAddress(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateResolverRuleResult> associateResolverRuleAsync(AssociateResolverRuleRequest request) {

        return associateResolverRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateResolverRuleResult> associateResolverRuleAsync(final AssociateResolverRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateResolverRuleRequest, AssociateResolverRuleResult> asyncHandler) {
        final AssociateResolverRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateResolverRuleResult>() {
            @Override
            public AssociateResolverRuleResult call() throws Exception {
                AssociateResolverRuleResult result = null;

                try {
                    result = executeAssociateResolverRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateResolverEndpointResult> createResolverEndpointAsync(CreateResolverEndpointRequest request) {

        return createResolverEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResolverEndpointResult> createResolverEndpointAsync(final CreateResolverEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateResolverEndpointRequest, CreateResolverEndpointResult> asyncHandler) {
        final CreateResolverEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateResolverEndpointResult>() {
            @Override
            public CreateResolverEndpointResult call() throws Exception {
                CreateResolverEndpointResult result = null;

                try {
                    result = executeCreateResolverEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateResolverRuleResult> createResolverRuleAsync(CreateResolverRuleRequest request) {

        return createResolverRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResolverRuleResult> createResolverRuleAsync(final CreateResolverRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateResolverRuleRequest, CreateResolverRuleResult> asyncHandler) {
        final CreateResolverRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateResolverRuleResult>() {
            @Override
            public CreateResolverRuleResult call() throws Exception {
                CreateResolverRuleResult result = null;

                try {
                    result = executeCreateResolverRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteResolverEndpointResult> deleteResolverEndpointAsync(DeleteResolverEndpointRequest request) {

        return deleteResolverEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResolverEndpointResult> deleteResolverEndpointAsync(final DeleteResolverEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResolverEndpointRequest, DeleteResolverEndpointResult> asyncHandler) {
        final DeleteResolverEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResolverEndpointResult>() {
            @Override
            public DeleteResolverEndpointResult call() throws Exception {
                DeleteResolverEndpointResult result = null;

                try {
                    result = executeDeleteResolverEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteResolverRuleResult> deleteResolverRuleAsync(DeleteResolverRuleRequest request) {

        return deleteResolverRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResolverRuleResult> deleteResolverRuleAsync(final DeleteResolverRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResolverRuleRequest, DeleteResolverRuleResult> asyncHandler) {
        final DeleteResolverRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResolverRuleResult>() {
            @Override
            public DeleteResolverRuleResult call() throws Exception {
                DeleteResolverRuleResult result = null;

                try {
                    result = executeDeleteResolverRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateResolverEndpointIpAddressResult> disassociateResolverEndpointIpAddressAsync(
            DisassociateResolverEndpointIpAddressRequest request) {

        return disassociateResolverEndpointIpAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateResolverEndpointIpAddressResult> disassociateResolverEndpointIpAddressAsync(
            final DisassociateResolverEndpointIpAddressRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateResolverEndpointIpAddressRequest, DisassociateResolverEndpointIpAddressResult> asyncHandler) {
        final DisassociateResolverEndpointIpAddressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateResolverEndpointIpAddressResult>() {
            @Override
            public DisassociateResolverEndpointIpAddressResult call() throws Exception {
                DisassociateResolverEndpointIpAddressResult result = null;

                try {
                    result = executeDisassociateResolverEndpointIpAddress(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateResolverRuleResult> disassociateResolverRuleAsync(DisassociateResolverRuleRequest request) {

        return disassociateResolverRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateResolverRuleResult> disassociateResolverRuleAsync(final DisassociateResolverRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateResolverRuleRequest, DisassociateResolverRuleResult> asyncHandler) {
        final DisassociateResolverRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateResolverRuleResult>() {
            @Override
            public DisassociateResolverRuleResult call() throws Exception {
                DisassociateResolverRuleResult result = null;

                try {
                    result = executeDisassociateResolverRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResolverEndpointResult> getResolverEndpointAsync(GetResolverEndpointRequest request) {

        return getResolverEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResolverEndpointResult> getResolverEndpointAsync(final GetResolverEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResolverEndpointRequest, GetResolverEndpointResult> asyncHandler) {
        final GetResolverEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResolverEndpointResult>() {
            @Override
            public GetResolverEndpointResult call() throws Exception {
                GetResolverEndpointResult result = null;

                try {
                    result = executeGetResolverEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResolverRuleResult> getResolverRuleAsync(GetResolverRuleRequest request) {

        return getResolverRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResolverRuleResult> getResolverRuleAsync(final GetResolverRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResolverRuleRequest, GetResolverRuleResult> asyncHandler) {
        final GetResolverRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResolverRuleResult>() {
            @Override
            public GetResolverRuleResult call() throws Exception {
                GetResolverRuleResult result = null;

                try {
                    result = executeGetResolverRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResolverRuleAssociationResult> getResolverRuleAssociationAsync(GetResolverRuleAssociationRequest request) {

        return getResolverRuleAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResolverRuleAssociationResult> getResolverRuleAssociationAsync(final GetResolverRuleAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResolverRuleAssociationRequest, GetResolverRuleAssociationResult> asyncHandler) {
        final GetResolverRuleAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResolverRuleAssociationResult>() {
            @Override
            public GetResolverRuleAssociationResult call() throws Exception {
                GetResolverRuleAssociationResult result = null;

                try {
                    result = executeGetResolverRuleAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResolverRulePolicyResult> getResolverRulePolicyAsync(GetResolverRulePolicyRequest request) {

        return getResolverRulePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResolverRulePolicyResult> getResolverRulePolicyAsync(final GetResolverRulePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResolverRulePolicyRequest, GetResolverRulePolicyResult> asyncHandler) {
        final GetResolverRulePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResolverRulePolicyResult>() {
            @Override
            public GetResolverRulePolicyResult call() throws Exception {
                GetResolverRulePolicyResult result = null;

                try {
                    result = executeGetResolverRulePolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListResolverEndpointIpAddressesResult> listResolverEndpointIpAddressesAsync(
            ListResolverEndpointIpAddressesRequest request) {

        return listResolverEndpointIpAddressesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResolverEndpointIpAddressesResult> listResolverEndpointIpAddressesAsync(
            final ListResolverEndpointIpAddressesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResolverEndpointIpAddressesRequest, ListResolverEndpointIpAddressesResult> asyncHandler) {
        final ListResolverEndpointIpAddressesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResolverEndpointIpAddressesResult>() {
            @Override
            public ListResolverEndpointIpAddressesResult call() throws Exception {
                ListResolverEndpointIpAddressesResult result = null;

                try {
                    result = executeListResolverEndpointIpAddresses(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListResolverEndpointsResult> listResolverEndpointsAsync(ListResolverEndpointsRequest request) {

        return listResolverEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResolverEndpointsResult> listResolverEndpointsAsync(final ListResolverEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResolverEndpointsRequest, ListResolverEndpointsResult> asyncHandler) {
        final ListResolverEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResolverEndpointsResult>() {
            @Override
            public ListResolverEndpointsResult call() throws Exception {
                ListResolverEndpointsResult result = null;

                try {
                    result = executeListResolverEndpoints(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListResolverRuleAssociationsResult> listResolverRuleAssociationsAsync(ListResolverRuleAssociationsRequest request) {

        return listResolverRuleAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResolverRuleAssociationsResult> listResolverRuleAssociationsAsync(final ListResolverRuleAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResolverRuleAssociationsRequest, ListResolverRuleAssociationsResult> asyncHandler) {
        final ListResolverRuleAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResolverRuleAssociationsResult>() {
            @Override
            public ListResolverRuleAssociationsResult call() throws Exception {
                ListResolverRuleAssociationsResult result = null;

                try {
                    result = executeListResolverRuleAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListResolverRulesResult> listResolverRulesAsync(ListResolverRulesRequest request) {

        return listResolverRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResolverRulesResult> listResolverRulesAsync(final ListResolverRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResolverRulesRequest, ListResolverRulesResult> asyncHandler) {
        final ListResolverRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResolverRulesResult>() {
            @Override
            public ListResolverRulesResult call() throws Exception {
                ListResolverRulesResult result = null;

                try {
                    result = executeListResolverRules(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<PutResolverRulePolicyResult> putResolverRulePolicyAsync(PutResolverRulePolicyRequest request) {

        return putResolverRulePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutResolverRulePolicyResult> putResolverRulePolicyAsync(final PutResolverRulePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutResolverRulePolicyRequest, PutResolverRulePolicyResult> asyncHandler) {
        final PutResolverRulePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutResolverRulePolicyResult>() {
            @Override
            public PutResolverRulePolicyResult call() throws Exception {
                PutResolverRulePolicyResult result = null;

                try {
                    result = executePutResolverRulePolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateResolverEndpointResult> updateResolverEndpointAsync(UpdateResolverEndpointRequest request) {

        return updateResolverEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResolverEndpointResult> updateResolverEndpointAsync(final UpdateResolverEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateResolverEndpointRequest, UpdateResolverEndpointResult> asyncHandler) {
        final UpdateResolverEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateResolverEndpointResult>() {
            @Override
            public UpdateResolverEndpointResult call() throws Exception {
                UpdateResolverEndpointResult result = null;

                try {
                    result = executeUpdateResolverEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateResolverRuleResult> updateResolverRuleAsync(UpdateResolverRuleRequest request) {

        return updateResolverRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResolverRuleResult> updateResolverRuleAsync(final UpdateResolverRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateResolverRuleRequest, UpdateResolverRuleResult> asyncHandler) {
        final UpdateResolverRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateResolverRuleResult>() {
            @Override
            public UpdateResolverRuleResult call() throws Exception {
                UpdateResolverRuleResult result = null;

                try {
                    result = executeUpdateResolverRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
