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
 * Interface for accessing AWSBillingConductor asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.billingconductor.AbstractAWSBillingConductorAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Web Services Billing Conductor is a fully managed service that you can use to customize a <a
 * href="https://docs.aws.amazon.com/billingconductor/latest/userguide/understanding-eb.html#eb-other-definitions">pro
 * forma</a> version of your billing data each month, to accurately show or chargeback your end customers. Amazon Web
 * Services Billing Conductor doesn't change the way you're billed by Amazon Web Services each month by design. Instead,
 * it provides you with a mechanism to configure, generate, and display rates to certain customers over a given billing
 * period. You can also analyze the difference between the rates you apply to your accounting groupings relative to your
 * actual rates from Amazon Web Services. As a result of your Amazon Web Services Billing Conductor configuration, the
 * payer account can also see the custom rate applied on the billing details page of the <a
 * href="https://console.aws.amazon.com/billing">Amazon Web Services Billing console</a>, or configure a cost and usage
 * report per billing group.
 * </p>
 * <p>
 * This documentation shows how you can configure Amazon Web Services Billing Conductor using its API. For more
 * information about using the <a href="https://console.aws.amazon.com/billingconductor/">Amazon Web Services Billing
 * Conductor</a> user interface, see the <a
 * href="https://docs.aws.amazon.com/billingconductor/latest/userguide/what-is-billingconductor.html"> Amazon Web
 * Services Billing Conductor User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSBillingConductorAsync extends AWSBillingConductor {

    /**
     * <p>
     * Connects an array of account IDs in a consolidated billing family to a predefined billing group. The account IDs
     * must be a part of the consolidated billing family during the current month, and not already associated with
     * another billing group. The maximum number of accounts that can be associated in one call is 30.
     * </p>
     * 
     * @param associateAccountsRequest
     * @return A Java Future containing the result of the AssociateAccounts operation returned by the service.
     * @sample AWSBillingConductorAsync.AssociateAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/AssociateAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateAccountsResult> associateAccountsAsync(AssociateAccountsRequest associateAccountsRequest);

    /**
     * <p>
     * Connects an array of account IDs in a consolidated billing family to a predefined billing group. The account IDs
     * must be a part of the consolidated billing family during the current month, and not already associated with
     * another billing group. The maximum number of accounts that can be associated in one call is 30.
     * </p>
     * 
     * @param associateAccountsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateAccounts operation returned by the service.
     * @sample AWSBillingConductorAsyncHandler.AssociateAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/AssociateAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateAccountsResult> associateAccountsAsync(AssociateAccountsRequest associateAccountsRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateAccountsRequest, AssociateAccountsResult> asyncHandler);

    /**
     * <p>
     * Connects an array of <code>PricingRuleArns</code> to a defined <code>PricingPlan</code>. The maximum number
     * <code>PricingRuleArn</code> that can be associated in one call is 30.
     * </p>
     * 
     * @param associatePricingRulesRequest
     * @return A Java Future containing the result of the AssociatePricingRules operation returned by the service.
     * @sample AWSBillingConductorAsync.AssociatePricingRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/AssociatePricingRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociatePricingRulesResult> associatePricingRulesAsync(AssociatePricingRulesRequest associatePricingRulesRequest);

    /**
     * <p>
     * Connects an array of <code>PricingRuleArns</code> to a defined <code>PricingPlan</code>. The maximum number
     * <code>PricingRuleArn</code> that can be associated in one call is 30.
     * </p>
     * 
     * @param associatePricingRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociatePricingRules operation returned by the service.
     * @sample AWSBillingConductorAsyncHandler.AssociatePricingRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/AssociatePricingRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociatePricingRulesResult> associatePricingRulesAsync(AssociatePricingRulesRequest associatePricingRulesRequest,
            com.amazonaws.handlers.AsyncHandler<AssociatePricingRulesRequest, AssociatePricingRulesResult> asyncHandler);

    /**
     * <p>
     * Associates a batch of resources to a percentage custom line item.
     * </p>
     * 
     * @param batchAssociateResourcesToCustomLineItemRequest
     * @return A Java Future containing the result of the BatchAssociateResourcesToCustomLineItem operation returned by
     *         the service.
     * @sample AWSBillingConductorAsync.BatchAssociateResourcesToCustomLineItem
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/BatchAssociateResourcesToCustomLineItem"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchAssociateResourcesToCustomLineItemResult> batchAssociateResourcesToCustomLineItemAsync(
            BatchAssociateResourcesToCustomLineItemRequest batchAssociateResourcesToCustomLineItemRequest);

    /**
     * <p>
     * Associates a batch of resources to a percentage custom line item.
     * </p>
     * 
     * @param batchAssociateResourcesToCustomLineItemRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchAssociateResourcesToCustomLineItem operation returned by
     *         the service.
     * @sample AWSBillingConductorAsyncHandler.BatchAssociateResourcesToCustomLineItem
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/BatchAssociateResourcesToCustomLineItem"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchAssociateResourcesToCustomLineItemResult> batchAssociateResourcesToCustomLineItemAsync(
            BatchAssociateResourcesToCustomLineItemRequest batchAssociateResourcesToCustomLineItemRequest,
            com.amazonaws.handlers.AsyncHandler<BatchAssociateResourcesToCustomLineItemRequest, BatchAssociateResourcesToCustomLineItemResult> asyncHandler);

    /**
     * <p>
     * Disassociates a batch of resources from a percentage custom line item.
     * </p>
     * 
     * @param batchDisassociateResourcesFromCustomLineItemRequest
     * @return A Java Future containing the result of the BatchDisassociateResourcesFromCustomLineItem operation
     *         returned by the service.
     * @sample AWSBillingConductorAsync.BatchDisassociateResourcesFromCustomLineItem
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/BatchDisassociateResourcesFromCustomLineItem"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDisassociateResourcesFromCustomLineItemResult> batchDisassociateResourcesFromCustomLineItemAsync(
            BatchDisassociateResourcesFromCustomLineItemRequest batchDisassociateResourcesFromCustomLineItemRequest);

    /**
     * <p>
     * Disassociates a batch of resources from a percentage custom line item.
     * </p>
     * 
     * @param batchDisassociateResourcesFromCustomLineItemRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDisassociateResourcesFromCustomLineItem operation
     *         returned by the service.
     * @sample AWSBillingConductorAsyncHandler.BatchDisassociateResourcesFromCustomLineItem
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/BatchDisassociateResourcesFromCustomLineItem"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDisassociateResourcesFromCustomLineItemResult> batchDisassociateResourcesFromCustomLineItemAsync(
            BatchDisassociateResourcesFromCustomLineItemRequest batchDisassociateResourcesFromCustomLineItemRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDisassociateResourcesFromCustomLineItemRequest, BatchDisassociateResourcesFromCustomLineItemResult> asyncHandler);

    /**
     * <p>
     * Creates a billing group that resembles a consolidated billing family that Amazon Web Services charges, based off
     * of the predefined pricing plan computation.
     * </p>
     * 
     * @param createBillingGroupRequest
     * @return A Java Future containing the result of the CreateBillingGroup operation returned by the service.
     * @sample AWSBillingConductorAsync.CreateBillingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/CreateBillingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBillingGroupResult> createBillingGroupAsync(CreateBillingGroupRequest createBillingGroupRequest);

    /**
     * <p>
     * Creates a billing group that resembles a consolidated billing family that Amazon Web Services charges, based off
     * of the predefined pricing plan computation.
     * </p>
     * 
     * @param createBillingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBillingGroup operation returned by the service.
     * @sample AWSBillingConductorAsyncHandler.CreateBillingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/CreateBillingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBillingGroupResult> createBillingGroupAsync(CreateBillingGroupRequest createBillingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBillingGroupRequest, CreateBillingGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a custom line item that can be used to create a one-time fixed charge that can be applied to a single
     * billing group for the current or previous billing period. The one-time fixed charge is either a fee or discount.
     * </p>
     * 
     * @param createCustomLineItemRequest
     * @return A Java Future containing the result of the CreateCustomLineItem operation returned by the service.
     * @sample AWSBillingConductorAsync.CreateCustomLineItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/CreateCustomLineItem"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCustomLineItemResult> createCustomLineItemAsync(CreateCustomLineItemRequest createCustomLineItemRequest);

    /**
     * <p>
     * Creates a custom line item that can be used to create a one-time fixed charge that can be applied to a single
     * billing group for the current or previous billing period. The one-time fixed charge is either a fee or discount.
     * </p>
     * 
     * @param createCustomLineItemRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCustomLineItem operation returned by the service.
     * @sample AWSBillingConductorAsyncHandler.CreateCustomLineItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/CreateCustomLineItem"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCustomLineItemResult> createCustomLineItemAsync(CreateCustomLineItemRequest createCustomLineItemRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCustomLineItemRequest, CreateCustomLineItemResult> asyncHandler);

    /**
     * <p>
     * Creates a pricing plan that is used for computing Amazon Web Services charges for billing groups.
     * </p>
     * 
     * @param createPricingPlanRequest
     * @return A Java Future containing the result of the CreatePricingPlan operation returned by the service.
     * @sample AWSBillingConductorAsync.CreatePricingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/CreatePricingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePricingPlanResult> createPricingPlanAsync(CreatePricingPlanRequest createPricingPlanRequest);

    /**
     * <p>
     * Creates a pricing plan that is used for computing Amazon Web Services charges for billing groups.
     * </p>
     * 
     * @param createPricingPlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePricingPlan operation returned by the service.
     * @sample AWSBillingConductorAsyncHandler.CreatePricingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/CreatePricingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePricingPlanResult> createPricingPlanAsync(CreatePricingPlanRequest createPricingPlanRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePricingPlanRequest, CreatePricingPlanResult> asyncHandler);

    /**
     * <p>
     * Creates a pricing rule can be associated to a pricing plan, or a set of pricing plans.
     * </p>
     * 
     * @param createPricingRuleRequest
     * @return A Java Future containing the result of the CreatePricingRule operation returned by the service.
     * @sample AWSBillingConductorAsync.CreatePricingRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/CreatePricingRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePricingRuleResult> createPricingRuleAsync(CreatePricingRuleRequest createPricingRuleRequest);

    /**
     * <p>
     * Creates a pricing rule can be associated to a pricing plan, or a set of pricing plans.
     * </p>
     * 
     * @param createPricingRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePricingRule operation returned by the service.
     * @sample AWSBillingConductorAsyncHandler.CreatePricingRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/CreatePricingRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePricingRuleResult> createPricingRuleAsync(CreatePricingRuleRequest createPricingRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePricingRuleRequest, CreatePricingRuleResult> asyncHandler);

    /**
     * <p>
     * Deletes a billing group.
     * </p>
     * 
     * @param deleteBillingGroupRequest
     * @return A Java Future containing the result of the DeleteBillingGroup operation returned by the service.
     * @sample AWSBillingConductorAsync.DeleteBillingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/DeleteBillingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBillingGroupResult> deleteBillingGroupAsync(DeleteBillingGroupRequest deleteBillingGroupRequest);

    /**
     * <p>
     * Deletes a billing group.
     * </p>
     * 
     * @param deleteBillingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBillingGroup operation returned by the service.
     * @sample AWSBillingConductorAsyncHandler.DeleteBillingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/DeleteBillingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBillingGroupResult> deleteBillingGroupAsync(DeleteBillingGroupRequest deleteBillingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBillingGroupRequest, DeleteBillingGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes the custom line item identified by the given ARN in the current, or previous billing period.
     * </p>
     * 
     * @param deleteCustomLineItemRequest
     * @return A Java Future containing the result of the DeleteCustomLineItem operation returned by the service.
     * @sample AWSBillingConductorAsync.DeleteCustomLineItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/DeleteCustomLineItem"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCustomLineItemResult> deleteCustomLineItemAsync(DeleteCustomLineItemRequest deleteCustomLineItemRequest);

    /**
     * <p>
     * Deletes the custom line item identified by the given ARN in the current, or previous billing period.
     * </p>
     * 
     * @param deleteCustomLineItemRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCustomLineItem operation returned by the service.
     * @sample AWSBillingConductorAsyncHandler.DeleteCustomLineItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/DeleteCustomLineItem"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCustomLineItemResult> deleteCustomLineItemAsync(DeleteCustomLineItemRequest deleteCustomLineItemRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCustomLineItemRequest, DeleteCustomLineItemResult> asyncHandler);

    /**
     * <p>
     * Deletes a pricing plan. The pricing plan must not be associated with any billing groups to delete successfully.
     * </p>
     * 
     * @param deletePricingPlanRequest
     * @return A Java Future containing the result of the DeletePricingPlan operation returned by the service.
     * @sample AWSBillingConductorAsync.DeletePricingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/DeletePricingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePricingPlanResult> deletePricingPlanAsync(DeletePricingPlanRequest deletePricingPlanRequest);

    /**
     * <p>
     * Deletes a pricing plan. The pricing plan must not be associated with any billing groups to delete successfully.
     * </p>
     * 
     * @param deletePricingPlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePricingPlan operation returned by the service.
     * @sample AWSBillingConductorAsyncHandler.DeletePricingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/DeletePricingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePricingPlanResult> deletePricingPlanAsync(DeletePricingPlanRequest deletePricingPlanRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePricingPlanRequest, DeletePricingPlanResult> asyncHandler);

    /**
     * <p>
     * Deletes the pricing rule that's identified by the input Amazon Resource Name (ARN).
     * </p>
     * 
     * @param deletePricingRuleRequest
     * @return A Java Future containing the result of the DeletePricingRule operation returned by the service.
     * @sample AWSBillingConductorAsync.DeletePricingRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/DeletePricingRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePricingRuleResult> deletePricingRuleAsync(DeletePricingRuleRequest deletePricingRuleRequest);

    /**
     * <p>
     * Deletes the pricing rule that's identified by the input Amazon Resource Name (ARN).
     * </p>
     * 
     * @param deletePricingRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePricingRule operation returned by the service.
     * @sample AWSBillingConductorAsyncHandler.DeletePricingRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/DeletePricingRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePricingRuleResult> deletePricingRuleAsync(DeletePricingRuleRequest deletePricingRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePricingRuleRequest, DeletePricingRuleResult> asyncHandler);

    /**
     * <p>
     * Removes the specified list of account IDs from the given billing group.
     * </p>
     * 
     * @param disassociateAccountsRequest
     * @return A Java Future containing the result of the DisassociateAccounts operation returned by the service.
     * @sample AWSBillingConductorAsync.DisassociateAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/DisassociateAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateAccountsResult> disassociateAccountsAsync(DisassociateAccountsRequest disassociateAccountsRequest);

    /**
     * <p>
     * Removes the specified list of account IDs from the given billing group.
     * </p>
     * 
     * @param disassociateAccountsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateAccounts operation returned by the service.
     * @sample AWSBillingConductorAsyncHandler.DisassociateAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/DisassociateAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateAccountsResult> disassociateAccountsAsync(DisassociateAccountsRequest disassociateAccountsRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateAccountsRequest, DisassociateAccountsResult> asyncHandler);

    /**
     * <p>
     * Disassociates a list of pricing rules from a pricing plan.
     * </p>
     * 
     * @param disassociatePricingRulesRequest
     * @return A Java Future containing the result of the DisassociatePricingRules operation returned by the service.
     * @sample AWSBillingConductorAsync.DisassociatePricingRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/DisassociatePricingRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociatePricingRulesResult> disassociatePricingRulesAsync(DisassociatePricingRulesRequest disassociatePricingRulesRequest);

    /**
     * <p>
     * Disassociates a list of pricing rules from a pricing plan.
     * </p>
     * 
     * @param disassociatePricingRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociatePricingRules operation returned by the service.
     * @sample AWSBillingConductorAsyncHandler.DisassociatePricingRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/DisassociatePricingRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociatePricingRulesResult> disassociatePricingRulesAsync(DisassociatePricingRulesRequest disassociatePricingRulesRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociatePricingRulesRequest, DisassociatePricingRulesResult> asyncHandler);

    /**
     * <p>
     * This is a paginated call to list linked accounts that are linked to the payer account for the specified time
     * period. If no information is provided, the current billing period is used. The response will optionally include
     * the billing group that's associated with the linked account.
     * </p>
     * 
     * @param listAccountAssociationsRequest
     * @return A Java Future containing the result of the ListAccountAssociations operation returned by the service.
     * @sample AWSBillingConductorAsync.ListAccountAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListAccountAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccountAssociationsResult> listAccountAssociationsAsync(ListAccountAssociationsRequest listAccountAssociationsRequest);

    /**
     * <p>
     * This is a paginated call to list linked accounts that are linked to the payer account for the specified time
     * period. If no information is provided, the current billing period is used. The response will optionally include
     * the billing group that's associated with the linked account.
     * </p>
     * 
     * @param listAccountAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccountAssociations operation returned by the service.
     * @sample AWSBillingConductorAsyncHandler.ListAccountAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListAccountAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccountAssociationsResult> listAccountAssociationsAsync(ListAccountAssociationsRequest listAccountAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccountAssociationsRequest, ListAccountAssociationsResult> asyncHandler);

    /**
     * <p>
     * A paginated call to retrieve a summary report of actual Amazon Web Services charges and the calculated Amazon Web
     * Services charges based on the associated pricing plan of a billing group.
     * </p>
     * 
     * @param listBillingGroupCostReportsRequest
     * @return A Java Future containing the result of the ListBillingGroupCostReports operation returned by the service.
     * @sample AWSBillingConductorAsync.ListBillingGroupCostReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListBillingGroupCostReports"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBillingGroupCostReportsResult> listBillingGroupCostReportsAsync(
            ListBillingGroupCostReportsRequest listBillingGroupCostReportsRequest);

    /**
     * <p>
     * A paginated call to retrieve a summary report of actual Amazon Web Services charges and the calculated Amazon Web
     * Services charges based on the associated pricing plan of a billing group.
     * </p>
     * 
     * @param listBillingGroupCostReportsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBillingGroupCostReports operation returned by the service.
     * @sample AWSBillingConductorAsyncHandler.ListBillingGroupCostReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListBillingGroupCostReports"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBillingGroupCostReportsResult> listBillingGroupCostReportsAsync(
            ListBillingGroupCostReportsRequest listBillingGroupCostReportsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBillingGroupCostReportsRequest, ListBillingGroupCostReportsResult> asyncHandler);

    /**
     * <p>
     * A paginated call to retrieve a list of billing groups for the given billing period. If you don't provide a
     * billing group, the current billing period is used.
     * </p>
     * 
     * @param listBillingGroupsRequest
     * @return A Java Future containing the result of the ListBillingGroups operation returned by the service.
     * @sample AWSBillingConductorAsync.ListBillingGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListBillingGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBillingGroupsResult> listBillingGroupsAsync(ListBillingGroupsRequest listBillingGroupsRequest);

    /**
     * <p>
     * A paginated call to retrieve a list of billing groups for the given billing period. If you don't provide a
     * billing group, the current billing period is used.
     * </p>
     * 
     * @param listBillingGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBillingGroups operation returned by the service.
     * @sample AWSBillingConductorAsyncHandler.ListBillingGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListBillingGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBillingGroupsResult> listBillingGroupsAsync(ListBillingGroupsRequest listBillingGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBillingGroupsRequest, ListBillingGroupsResult> asyncHandler);

    /**
     * <p>
     * A paginated call to get a list of all custom line item versions.
     * </p>
     * 
     * @param listCustomLineItemVersionsRequest
     * @return A Java Future containing the result of the ListCustomLineItemVersions operation returned by the service.
     * @sample AWSBillingConductorAsync.ListCustomLineItemVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListCustomLineItemVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCustomLineItemVersionsResult> listCustomLineItemVersionsAsync(
            ListCustomLineItemVersionsRequest listCustomLineItemVersionsRequest);

    /**
     * <p>
     * A paginated call to get a list of all custom line item versions.
     * </p>
     * 
     * @param listCustomLineItemVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCustomLineItemVersions operation returned by the service.
     * @sample AWSBillingConductorAsyncHandler.ListCustomLineItemVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListCustomLineItemVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCustomLineItemVersionsResult> listCustomLineItemVersionsAsync(
            ListCustomLineItemVersionsRequest listCustomLineItemVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCustomLineItemVersionsRequest, ListCustomLineItemVersionsResult> asyncHandler);

    /**
     * <p>
     * A paginated call to get a list of all custom line items (FFLIs) for the given billing period. If you don't
     * provide a billing period, the current billing period is used.
     * </p>
     * 
     * @param listCustomLineItemsRequest
     * @return A Java Future containing the result of the ListCustomLineItems operation returned by the service.
     * @sample AWSBillingConductorAsync.ListCustomLineItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListCustomLineItems"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCustomLineItemsResult> listCustomLineItemsAsync(ListCustomLineItemsRequest listCustomLineItemsRequest);

    /**
     * <p>
     * A paginated call to get a list of all custom line items (FFLIs) for the given billing period. If you don't
     * provide a billing period, the current billing period is used.
     * </p>
     * 
     * @param listCustomLineItemsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCustomLineItems operation returned by the service.
     * @sample AWSBillingConductorAsyncHandler.ListCustomLineItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListCustomLineItems"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCustomLineItemsResult> listCustomLineItemsAsync(ListCustomLineItemsRequest listCustomLineItemsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCustomLineItemsRequest, ListCustomLineItemsResult> asyncHandler);

    /**
     * <p>
     * A paginated call to get pricing plans for the given billing period. If you don't provide a billing period, the
     * current billing period is used.
     * </p>
     * 
     * @param listPricingPlansRequest
     * @return A Java Future containing the result of the ListPricingPlans operation returned by the service.
     * @sample AWSBillingConductorAsync.ListPricingPlans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListPricingPlans"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPricingPlansResult> listPricingPlansAsync(ListPricingPlansRequest listPricingPlansRequest);

    /**
     * <p>
     * A paginated call to get pricing plans for the given billing period. If you don't provide a billing period, the
     * current billing period is used.
     * </p>
     * 
     * @param listPricingPlansRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPricingPlans operation returned by the service.
     * @sample AWSBillingConductorAsyncHandler.ListPricingPlans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListPricingPlans"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPricingPlansResult> listPricingPlansAsync(ListPricingPlansRequest listPricingPlansRequest,
            com.amazonaws.handlers.AsyncHandler<ListPricingPlansRequest, ListPricingPlansResult> asyncHandler);

    /**
     * <p>
     * A list of the pricing plans that are associated with a pricing rule.
     * </p>
     * 
     * @param listPricingPlansAssociatedWithPricingRuleRequest
     * @return A Java Future containing the result of the ListPricingPlansAssociatedWithPricingRule operation returned
     *         by the service.
     * @sample AWSBillingConductorAsync.ListPricingPlansAssociatedWithPricingRule
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListPricingPlansAssociatedWithPricingRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPricingPlansAssociatedWithPricingRuleResult> listPricingPlansAssociatedWithPricingRuleAsync(
            ListPricingPlansAssociatedWithPricingRuleRequest listPricingPlansAssociatedWithPricingRuleRequest);

    /**
     * <p>
     * A list of the pricing plans that are associated with a pricing rule.
     * </p>
     * 
     * @param listPricingPlansAssociatedWithPricingRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPricingPlansAssociatedWithPricingRule operation returned
     *         by the service.
     * @sample AWSBillingConductorAsyncHandler.ListPricingPlansAssociatedWithPricingRule
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListPricingPlansAssociatedWithPricingRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPricingPlansAssociatedWithPricingRuleResult> listPricingPlansAssociatedWithPricingRuleAsync(
            ListPricingPlansAssociatedWithPricingRuleRequest listPricingPlansAssociatedWithPricingRuleRequest,
            com.amazonaws.handlers.AsyncHandler<ListPricingPlansAssociatedWithPricingRuleRequest, ListPricingPlansAssociatedWithPricingRuleResult> asyncHandler);

    /**
     * <p>
     * Describes a pricing rule that can be associated to a pricing plan, or set of pricing plans.
     * </p>
     * 
     * @param listPricingRulesRequest
     * @return A Java Future containing the result of the ListPricingRules operation returned by the service.
     * @sample AWSBillingConductorAsync.ListPricingRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListPricingRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPricingRulesResult> listPricingRulesAsync(ListPricingRulesRequest listPricingRulesRequest);

    /**
     * <p>
     * Describes a pricing rule that can be associated to a pricing plan, or set of pricing plans.
     * </p>
     * 
     * @param listPricingRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPricingRules operation returned by the service.
     * @sample AWSBillingConductorAsyncHandler.ListPricingRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListPricingRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPricingRulesResult> listPricingRulesAsync(ListPricingRulesRequest listPricingRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPricingRulesRequest, ListPricingRulesResult> asyncHandler);

    /**
     * <p>
     * Lists the pricing rules that are associated with a pricing plan.
     * </p>
     * 
     * @param listPricingRulesAssociatedToPricingPlanRequest
     * @return A Java Future containing the result of the ListPricingRulesAssociatedToPricingPlan operation returned by
     *         the service.
     * @sample AWSBillingConductorAsync.ListPricingRulesAssociatedToPricingPlan
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListPricingRulesAssociatedToPricingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPricingRulesAssociatedToPricingPlanResult> listPricingRulesAssociatedToPricingPlanAsync(
            ListPricingRulesAssociatedToPricingPlanRequest listPricingRulesAssociatedToPricingPlanRequest);

    /**
     * <p>
     * Lists the pricing rules that are associated with a pricing plan.
     * </p>
     * 
     * @param listPricingRulesAssociatedToPricingPlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPricingRulesAssociatedToPricingPlan operation returned by
     *         the service.
     * @sample AWSBillingConductorAsyncHandler.ListPricingRulesAssociatedToPricingPlan
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListPricingRulesAssociatedToPricingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPricingRulesAssociatedToPricingPlanResult> listPricingRulesAssociatedToPricingPlanAsync(
            ListPricingRulesAssociatedToPricingPlanRequest listPricingRulesAssociatedToPricingPlanRequest,
            com.amazonaws.handlers.AsyncHandler<ListPricingRulesAssociatedToPricingPlanRequest, ListPricingRulesAssociatedToPricingPlanResult> asyncHandler);

    /**
     * <p>
     * List the resources that are associated to a custom line item.
     * </p>
     * 
     * @param listResourcesAssociatedToCustomLineItemRequest
     * @return A Java Future containing the result of the ListResourcesAssociatedToCustomLineItem operation returned by
     *         the service.
     * @sample AWSBillingConductorAsync.ListResourcesAssociatedToCustomLineItem
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListResourcesAssociatedToCustomLineItem"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourcesAssociatedToCustomLineItemResult> listResourcesAssociatedToCustomLineItemAsync(
            ListResourcesAssociatedToCustomLineItemRequest listResourcesAssociatedToCustomLineItemRequest);

    /**
     * <p>
     * List the resources that are associated to a custom line item.
     * </p>
     * 
     * @param listResourcesAssociatedToCustomLineItemRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourcesAssociatedToCustomLineItem operation returned by
     *         the service.
     * @sample AWSBillingConductorAsyncHandler.ListResourcesAssociatedToCustomLineItem
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListResourcesAssociatedToCustomLineItem"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourcesAssociatedToCustomLineItemResult> listResourcesAssociatedToCustomLineItemAsync(
            ListResourcesAssociatedToCustomLineItemRequest listResourcesAssociatedToCustomLineItemRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourcesAssociatedToCustomLineItemRequest, ListResourcesAssociatedToCustomLineItemResult> asyncHandler);

    /**
     * <p>
     * A list the tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSBillingConductorAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * A list the tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSBillingConductorAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Associates the specified tags to a resource with the specified <code>resourceArn</code>. If existing tags on a
     * resource are not specified in the request parameters, they are not changed.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSBillingConductorAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Associates the specified tags to a resource with the specified <code>resourceArn</code>. If existing tags on a
     * resource are not specified in the request parameters, they are not changed.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSBillingConductorAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Deletes specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSBillingConductorAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Deletes specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSBillingConductorAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * This updates an existing billing group.
     * </p>
     * 
     * @param updateBillingGroupRequest
     * @return A Java Future containing the result of the UpdateBillingGroup operation returned by the service.
     * @sample AWSBillingConductorAsync.UpdateBillingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UpdateBillingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBillingGroupResult> updateBillingGroupAsync(UpdateBillingGroupRequest updateBillingGroupRequest);

    /**
     * <p>
     * This updates an existing billing group.
     * </p>
     * 
     * @param updateBillingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBillingGroup operation returned by the service.
     * @sample AWSBillingConductorAsyncHandler.UpdateBillingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UpdateBillingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBillingGroupResult> updateBillingGroupAsync(UpdateBillingGroupRequest updateBillingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBillingGroupRequest, UpdateBillingGroupResult> asyncHandler);

    /**
     * <p>
     * Update an existing custom line item in the current or previous billing period.
     * </p>
     * 
     * @param updateCustomLineItemRequest
     * @return A Java Future containing the result of the UpdateCustomLineItem operation returned by the service.
     * @sample AWSBillingConductorAsync.UpdateCustomLineItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UpdateCustomLineItem"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCustomLineItemResult> updateCustomLineItemAsync(UpdateCustomLineItemRequest updateCustomLineItemRequest);

    /**
     * <p>
     * Update an existing custom line item in the current or previous billing period.
     * </p>
     * 
     * @param updateCustomLineItemRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCustomLineItem operation returned by the service.
     * @sample AWSBillingConductorAsyncHandler.UpdateCustomLineItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UpdateCustomLineItem"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCustomLineItemResult> updateCustomLineItemAsync(UpdateCustomLineItemRequest updateCustomLineItemRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCustomLineItemRequest, UpdateCustomLineItemResult> asyncHandler);

    /**
     * <p>
     * This updates an existing pricing plan.
     * </p>
     * 
     * @param updatePricingPlanRequest
     * @return A Java Future containing the result of the UpdatePricingPlan operation returned by the service.
     * @sample AWSBillingConductorAsync.UpdatePricingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UpdatePricingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePricingPlanResult> updatePricingPlanAsync(UpdatePricingPlanRequest updatePricingPlanRequest);

    /**
     * <p>
     * This updates an existing pricing plan.
     * </p>
     * 
     * @param updatePricingPlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePricingPlan operation returned by the service.
     * @sample AWSBillingConductorAsyncHandler.UpdatePricingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UpdatePricingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePricingPlanResult> updatePricingPlanAsync(UpdatePricingPlanRequest updatePricingPlanRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePricingPlanRequest, UpdatePricingPlanResult> asyncHandler);

    /**
     * <p>
     * Updates an existing pricing rule.
     * </p>
     * 
     * @param updatePricingRuleRequest
     * @return A Java Future containing the result of the UpdatePricingRule operation returned by the service.
     * @sample AWSBillingConductorAsync.UpdatePricingRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UpdatePricingRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePricingRuleResult> updatePricingRuleAsync(UpdatePricingRuleRequest updatePricingRuleRequest);

    /**
     * <p>
     * Updates an existing pricing rule.
     * </p>
     * 
     * @param updatePricingRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePricingRule operation returned by the service.
     * @sample AWSBillingConductorAsyncHandler.UpdatePricingRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UpdatePricingRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePricingRuleResult> updatePricingRuleAsync(UpdatePricingRuleRequest updatePricingRuleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePricingRuleRequest, UpdatePricingRuleResult> asyncHandler);

}
