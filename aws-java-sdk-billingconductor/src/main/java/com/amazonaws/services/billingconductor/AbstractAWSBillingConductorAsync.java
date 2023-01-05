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
package com.amazonaws.services.billingconductor;

import javax.annotation.Generated;

import com.amazonaws.services.billingconductor.model.*;

/**
 * Abstract implementation of {@code AWSBillingConductorAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSBillingConductorAsync extends AbstractAWSBillingConductor implements AWSBillingConductorAsync {

    protected AbstractAWSBillingConductorAsync() {
    }

    @Override
    public java.util.concurrent.Future<AssociateAccountsResult> associateAccountsAsync(AssociateAccountsRequest request) {

        return associateAccountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateAccountsResult> associateAccountsAsync(AssociateAccountsRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateAccountsRequest, AssociateAccountsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssociatePricingRulesResult> associatePricingRulesAsync(AssociatePricingRulesRequest request) {

        return associatePricingRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociatePricingRulesResult> associatePricingRulesAsync(AssociatePricingRulesRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociatePricingRulesRequest, AssociatePricingRulesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchAssociateResourcesToCustomLineItemResult> batchAssociateResourcesToCustomLineItemAsync(
            BatchAssociateResourcesToCustomLineItemRequest request) {

        return batchAssociateResourcesToCustomLineItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchAssociateResourcesToCustomLineItemResult> batchAssociateResourcesToCustomLineItemAsync(
            BatchAssociateResourcesToCustomLineItemRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchAssociateResourcesToCustomLineItemRequest, BatchAssociateResourcesToCustomLineItemResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchDisassociateResourcesFromCustomLineItemResult> batchDisassociateResourcesFromCustomLineItemAsync(
            BatchDisassociateResourcesFromCustomLineItemRequest request) {

        return batchDisassociateResourcesFromCustomLineItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDisassociateResourcesFromCustomLineItemResult> batchDisassociateResourcesFromCustomLineItemAsync(
            BatchDisassociateResourcesFromCustomLineItemRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchDisassociateResourcesFromCustomLineItemRequest, BatchDisassociateResourcesFromCustomLineItemResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateBillingGroupResult> createBillingGroupAsync(CreateBillingGroupRequest request) {

        return createBillingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBillingGroupResult> createBillingGroupAsync(CreateBillingGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateBillingGroupRequest, CreateBillingGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateCustomLineItemResult> createCustomLineItemAsync(CreateCustomLineItemRequest request) {

        return createCustomLineItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCustomLineItemResult> createCustomLineItemAsync(CreateCustomLineItemRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateCustomLineItemRequest, CreateCustomLineItemResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePricingPlanResult> createPricingPlanAsync(CreatePricingPlanRequest request) {

        return createPricingPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePricingPlanResult> createPricingPlanAsync(CreatePricingPlanRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePricingPlanRequest, CreatePricingPlanResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePricingRuleResult> createPricingRuleAsync(CreatePricingRuleRequest request) {

        return createPricingRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePricingRuleResult> createPricingRuleAsync(CreatePricingRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePricingRuleRequest, CreatePricingRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteBillingGroupResult> deleteBillingGroupAsync(DeleteBillingGroupRequest request) {

        return deleteBillingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBillingGroupResult> deleteBillingGroupAsync(DeleteBillingGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteBillingGroupRequest, DeleteBillingGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomLineItemResult> deleteCustomLineItemAsync(DeleteCustomLineItemRequest request) {

        return deleteCustomLineItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomLineItemResult> deleteCustomLineItemAsync(DeleteCustomLineItemRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteCustomLineItemRequest, DeleteCustomLineItemResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePricingPlanResult> deletePricingPlanAsync(DeletePricingPlanRequest request) {

        return deletePricingPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePricingPlanResult> deletePricingPlanAsync(DeletePricingPlanRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePricingPlanRequest, DeletePricingPlanResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePricingRuleResult> deletePricingRuleAsync(DeletePricingRuleRequest request) {

        return deletePricingRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePricingRuleResult> deletePricingRuleAsync(DeletePricingRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePricingRuleRequest, DeletePricingRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateAccountsResult> disassociateAccountsAsync(DisassociateAccountsRequest request) {

        return disassociateAccountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateAccountsResult> disassociateAccountsAsync(DisassociateAccountsRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateAccountsRequest, DisassociateAccountsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociatePricingRulesResult> disassociatePricingRulesAsync(DisassociatePricingRulesRequest request) {

        return disassociatePricingRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociatePricingRulesResult> disassociatePricingRulesAsync(DisassociatePricingRulesRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociatePricingRulesRequest, DisassociatePricingRulesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAccountAssociationsResult> listAccountAssociationsAsync(ListAccountAssociationsRequest request) {

        return listAccountAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccountAssociationsResult> listAccountAssociationsAsync(ListAccountAssociationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAccountAssociationsRequest, ListAccountAssociationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListBillingGroupCostReportsResult> listBillingGroupCostReportsAsync(ListBillingGroupCostReportsRequest request) {

        return listBillingGroupCostReportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBillingGroupCostReportsResult> listBillingGroupCostReportsAsync(ListBillingGroupCostReportsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListBillingGroupCostReportsRequest, ListBillingGroupCostReportsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListBillingGroupsResult> listBillingGroupsAsync(ListBillingGroupsRequest request) {

        return listBillingGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBillingGroupsResult> listBillingGroupsAsync(ListBillingGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListBillingGroupsRequest, ListBillingGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListCustomLineItemVersionsResult> listCustomLineItemVersionsAsync(ListCustomLineItemVersionsRequest request) {

        return listCustomLineItemVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCustomLineItemVersionsResult> listCustomLineItemVersionsAsync(ListCustomLineItemVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListCustomLineItemVersionsRequest, ListCustomLineItemVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListCustomLineItemsResult> listCustomLineItemsAsync(ListCustomLineItemsRequest request) {

        return listCustomLineItemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCustomLineItemsResult> listCustomLineItemsAsync(ListCustomLineItemsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListCustomLineItemsRequest, ListCustomLineItemsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPricingPlansResult> listPricingPlansAsync(ListPricingPlansRequest request) {

        return listPricingPlansAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPricingPlansResult> listPricingPlansAsync(ListPricingPlansRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPricingPlansRequest, ListPricingPlansResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPricingPlansAssociatedWithPricingRuleResult> listPricingPlansAssociatedWithPricingRuleAsync(
            ListPricingPlansAssociatedWithPricingRuleRequest request) {

        return listPricingPlansAssociatedWithPricingRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPricingPlansAssociatedWithPricingRuleResult> listPricingPlansAssociatedWithPricingRuleAsync(
            ListPricingPlansAssociatedWithPricingRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPricingPlansAssociatedWithPricingRuleRequest, ListPricingPlansAssociatedWithPricingRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPricingRulesResult> listPricingRulesAsync(ListPricingRulesRequest request) {

        return listPricingRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPricingRulesResult> listPricingRulesAsync(ListPricingRulesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPricingRulesRequest, ListPricingRulesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPricingRulesAssociatedToPricingPlanResult> listPricingRulesAssociatedToPricingPlanAsync(
            ListPricingRulesAssociatedToPricingPlanRequest request) {

        return listPricingRulesAssociatedToPricingPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPricingRulesAssociatedToPricingPlanResult> listPricingRulesAssociatedToPricingPlanAsync(
            ListPricingRulesAssociatedToPricingPlanRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPricingRulesAssociatedToPricingPlanRequest, ListPricingRulesAssociatedToPricingPlanResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListResourcesAssociatedToCustomLineItemResult> listResourcesAssociatedToCustomLineItemAsync(
            ListResourcesAssociatedToCustomLineItemRequest request) {

        return listResourcesAssociatedToCustomLineItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourcesAssociatedToCustomLineItemResult> listResourcesAssociatedToCustomLineItemAsync(
            ListResourcesAssociatedToCustomLineItemRequest request,
            com.amazonaws.handlers.AsyncHandler<ListResourcesAssociatedToCustomLineItemRequest, ListResourcesAssociatedToCustomLineItemResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateBillingGroupResult> updateBillingGroupAsync(UpdateBillingGroupRequest request) {

        return updateBillingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBillingGroupResult> updateBillingGroupAsync(UpdateBillingGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateBillingGroupRequest, UpdateBillingGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateCustomLineItemResult> updateCustomLineItemAsync(UpdateCustomLineItemRequest request) {

        return updateCustomLineItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCustomLineItemResult> updateCustomLineItemAsync(UpdateCustomLineItemRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateCustomLineItemRequest, UpdateCustomLineItemResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdatePricingPlanResult> updatePricingPlanAsync(UpdatePricingPlanRequest request) {

        return updatePricingPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePricingPlanResult> updatePricingPlanAsync(UpdatePricingPlanRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdatePricingPlanRequest, UpdatePricingPlanResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdatePricingRuleResult> updatePricingRuleAsync(UpdatePricingRuleRequest request) {

        return updatePricingRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePricingRuleResult> updatePricingRuleAsync(UpdatePricingRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdatePricingRuleRequest, UpdatePricingRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
