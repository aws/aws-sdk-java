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

/**
 * Abstract implementation of {@code AmazonRoute53ResolverAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonRoute53ResolverAsync extends AbstractAmazonRoute53Resolver implements AmazonRoute53ResolverAsync {

    protected AbstractAmazonRoute53ResolverAsync() {
    }

    @Override
    public java.util.concurrent.Future<AssociateResolverEndpointIpAddressResult> associateResolverEndpointIpAddressAsync(
            AssociateResolverEndpointIpAddressRequest request) {

        return associateResolverEndpointIpAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateResolverEndpointIpAddressResult> associateResolverEndpointIpAddressAsync(
            AssociateResolverEndpointIpAddressRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateResolverEndpointIpAddressRequest, AssociateResolverEndpointIpAddressResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssociateResolverRuleResult> associateResolverRuleAsync(AssociateResolverRuleRequest request) {

        return associateResolverRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateResolverRuleResult> associateResolverRuleAsync(AssociateResolverRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateResolverRuleRequest, AssociateResolverRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateResolverEndpointResult> createResolverEndpointAsync(CreateResolverEndpointRequest request) {

        return createResolverEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResolverEndpointResult> createResolverEndpointAsync(CreateResolverEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateResolverEndpointRequest, CreateResolverEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateResolverRuleResult> createResolverRuleAsync(CreateResolverRuleRequest request) {

        return createResolverRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResolverRuleResult> createResolverRuleAsync(CreateResolverRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateResolverRuleRequest, CreateResolverRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteResolverEndpointResult> deleteResolverEndpointAsync(DeleteResolverEndpointRequest request) {

        return deleteResolverEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResolverEndpointResult> deleteResolverEndpointAsync(DeleteResolverEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteResolverEndpointRequest, DeleteResolverEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteResolverRuleResult> deleteResolverRuleAsync(DeleteResolverRuleRequest request) {

        return deleteResolverRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResolverRuleResult> deleteResolverRuleAsync(DeleteResolverRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteResolverRuleRequest, DeleteResolverRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateResolverEndpointIpAddressResult> disassociateResolverEndpointIpAddressAsync(
            DisassociateResolverEndpointIpAddressRequest request) {

        return disassociateResolverEndpointIpAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateResolverEndpointIpAddressResult> disassociateResolverEndpointIpAddressAsync(
            DisassociateResolverEndpointIpAddressRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateResolverEndpointIpAddressRequest, DisassociateResolverEndpointIpAddressResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateResolverRuleResult> disassociateResolverRuleAsync(DisassociateResolverRuleRequest request) {

        return disassociateResolverRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateResolverRuleResult> disassociateResolverRuleAsync(DisassociateResolverRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateResolverRuleRequest, DisassociateResolverRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetResolverEndpointResult> getResolverEndpointAsync(GetResolverEndpointRequest request) {

        return getResolverEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResolverEndpointResult> getResolverEndpointAsync(GetResolverEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<GetResolverEndpointRequest, GetResolverEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetResolverRuleResult> getResolverRuleAsync(GetResolverRuleRequest request) {

        return getResolverRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResolverRuleResult> getResolverRuleAsync(GetResolverRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<GetResolverRuleRequest, GetResolverRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetResolverRuleAssociationResult> getResolverRuleAssociationAsync(GetResolverRuleAssociationRequest request) {

        return getResolverRuleAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResolverRuleAssociationResult> getResolverRuleAssociationAsync(GetResolverRuleAssociationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetResolverRuleAssociationRequest, GetResolverRuleAssociationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetResolverRulePolicyResult> getResolverRulePolicyAsync(GetResolverRulePolicyRequest request) {

        return getResolverRulePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResolverRulePolicyResult> getResolverRulePolicyAsync(GetResolverRulePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetResolverRulePolicyRequest, GetResolverRulePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListResolverEndpointIpAddressesResult> listResolverEndpointIpAddressesAsync(
            ListResolverEndpointIpAddressesRequest request) {

        return listResolverEndpointIpAddressesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResolverEndpointIpAddressesResult> listResolverEndpointIpAddressesAsync(
            ListResolverEndpointIpAddressesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListResolverEndpointIpAddressesRequest, ListResolverEndpointIpAddressesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListResolverEndpointsResult> listResolverEndpointsAsync(ListResolverEndpointsRequest request) {

        return listResolverEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResolverEndpointsResult> listResolverEndpointsAsync(ListResolverEndpointsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListResolverEndpointsRequest, ListResolverEndpointsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListResolverRuleAssociationsResult> listResolverRuleAssociationsAsync(ListResolverRuleAssociationsRequest request) {

        return listResolverRuleAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResolverRuleAssociationsResult> listResolverRuleAssociationsAsync(ListResolverRuleAssociationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListResolverRuleAssociationsRequest, ListResolverRuleAssociationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListResolverRulesResult> listResolverRulesAsync(ListResolverRulesRequest request) {

        return listResolverRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResolverRulesResult> listResolverRulesAsync(ListResolverRulesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListResolverRulesRequest, ListResolverRulesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutResolverRulePolicyResult> putResolverRulePolicyAsync(PutResolverRulePolicyRequest request) {

        return putResolverRulePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutResolverRulePolicyResult> putResolverRulePolicyAsync(PutResolverRulePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutResolverRulePolicyRequest, PutResolverRulePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateResolverEndpointResult> updateResolverEndpointAsync(UpdateResolverEndpointRequest request) {

        return updateResolverEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResolverEndpointResult> updateResolverEndpointAsync(UpdateResolverEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateResolverEndpointRequest, UpdateResolverEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateResolverRuleResult> updateResolverRuleAsync(UpdateResolverRuleRequest request) {

        return updateResolverRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResolverRuleResult> updateResolverRuleAsync(UpdateResolverRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateResolverRuleRequest, UpdateResolverRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
