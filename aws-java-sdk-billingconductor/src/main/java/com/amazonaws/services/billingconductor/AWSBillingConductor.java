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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.billingconductor.model.*;

/**
 * Interface for accessing AWSBillingConductor.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.billingconductor.AbstractAWSBillingConductor} instead.
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
public interface AWSBillingConductor {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "billingconductor";

    /**
     * <p>
     * Connects an array of account IDs in a consolidated billing family to a predefined billing group. The account IDs
     * must be a part of the consolidated billing family during the current month, and not already associated with
     * another billing group. The maximum number of accounts that can be associated in one call is 30.
     * </p>
     * 
     * @param associateAccountsRequest
     * @return Result of the AssociateAccounts operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws ServiceLimitExceededException
     *         The request would cause a service limit to exceed.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.AssociateAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/AssociateAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateAccountsResult associateAccounts(AssociateAccountsRequest associateAccountsRequest);

    /**
     * <p>
     * Connects an array of <code>PricingRuleArns</code> to a defined <code>PricingPlan</code>. The maximum number
     * <code>PricingRuleArn</code> that can be associated in one call is 30.
     * </p>
     * 
     * @param associatePricingRulesRequest
     * @return Result of the AssociatePricingRules operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws ServiceLimitExceededException
     *         The request would cause a service limit to exceed.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.AssociatePricingRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/AssociatePricingRules"
     *      target="_top">AWS API Documentation</a>
     */
    AssociatePricingRulesResult associatePricingRules(AssociatePricingRulesRequest associatePricingRulesRequest);

    /**
     * <p>
     * Associates a batch of resources to a percentage custom line item.
     * </p>
     * 
     * @param batchAssociateResourcesToCustomLineItemRequest
     * @return Result of the BatchAssociateResourcesToCustomLineItem operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws ServiceLimitExceededException
     *         The request would cause a service limit to exceed.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.BatchAssociateResourcesToCustomLineItem
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/BatchAssociateResourcesToCustomLineItem"
     *      target="_top">AWS API Documentation</a>
     */
    BatchAssociateResourcesToCustomLineItemResult batchAssociateResourcesToCustomLineItem(
            BatchAssociateResourcesToCustomLineItemRequest batchAssociateResourcesToCustomLineItemRequest);

    /**
     * <p>
     * Disassociates a batch of resources from a percentage custom line item.
     * </p>
     * 
     * @param batchDisassociateResourcesFromCustomLineItemRequest
     * @return Result of the BatchDisassociateResourcesFromCustomLineItem operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.BatchDisassociateResourcesFromCustomLineItem
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/BatchDisassociateResourcesFromCustomLineItem"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDisassociateResourcesFromCustomLineItemResult batchDisassociateResourcesFromCustomLineItem(
            BatchDisassociateResourcesFromCustomLineItemRequest batchDisassociateResourcesFromCustomLineItemRequest);

    /**
     * <p>
     * Creates a billing group that resembles a consolidated billing family that Amazon Web Services charges, based off
     * of the predefined pricing plan computation.
     * </p>
     * 
     * @param createBillingGroupRequest
     * @return Result of the CreateBillingGroup operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws ServiceLimitExceededException
     *         The request would cause a service limit to exceed.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSBillingConductor.CreateBillingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/CreateBillingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateBillingGroupResult createBillingGroup(CreateBillingGroupRequest createBillingGroupRequest);

    /**
     * <p>
     * Creates a custom line item that can be used to create a one-time fixed charge that can be applied to a single
     * billing group for the current or previous billing period. The one-time fixed charge is either a fee or discount.
     * </p>
     * 
     * @param createCustomLineItemRequest
     * @return Result of the CreateCustomLineItem operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws ServiceLimitExceededException
     *         The request would cause a service limit to exceed.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSBillingConductor.CreateCustomLineItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/CreateCustomLineItem"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCustomLineItemResult createCustomLineItem(CreateCustomLineItemRequest createCustomLineItemRequest);

    /**
     * <p>
     * Creates a pricing plan that is used for computing Amazon Web Services charges for billing groups.
     * </p>
     * 
     * @param createPricingPlanRequest
     * @return Result of the CreatePricingPlan operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws ServiceLimitExceededException
     *         The request would cause a service limit to exceed.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.CreatePricingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/CreatePricingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePricingPlanResult createPricingPlan(CreatePricingPlanRequest createPricingPlanRequest);

    /**
     * <p>
     * Creates a pricing rule can be associated to a pricing plan, or a set of pricing plans.
     * </p>
     * 
     * @param createPricingRuleRequest
     * @return Result of the CreatePricingRule operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws ServiceLimitExceededException
     *         The request would cause a service limit to exceed.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSBillingConductor.CreatePricingRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/CreatePricingRule"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePricingRuleResult createPricingRule(CreatePricingRuleRequest createPricingRuleRequest);

    /**
     * <p>
     * Deletes a billing group.
     * </p>
     * 
     * @param deleteBillingGroupRequest
     * @return Result of the DeleteBillingGroup operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSBillingConductor.DeleteBillingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/DeleteBillingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteBillingGroupResult deleteBillingGroup(DeleteBillingGroupRequest deleteBillingGroupRequest);

    /**
     * <p>
     * Deletes the custom line item identified by the given ARN in the current, or previous billing period.
     * </p>
     * 
     * @param deleteCustomLineItemRequest
     * @return Result of the DeleteCustomLineItem operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSBillingConductor.DeleteCustomLineItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/DeleteCustomLineItem"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCustomLineItemResult deleteCustomLineItem(DeleteCustomLineItemRequest deleteCustomLineItemRequest);

    /**
     * <p>
     * Deletes a pricing plan. The pricing plan must not be associated with any billing groups to delete successfully.
     * </p>
     * 
     * @param deletePricingPlanRequest
     * @return Result of the DeletePricingPlan operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSBillingConductor.DeletePricingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/DeletePricingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePricingPlanResult deletePricingPlan(DeletePricingPlanRequest deletePricingPlanRequest);

    /**
     * <p>
     * Deletes the pricing rule that's identified by the input Amazon Resource Name (ARN).
     * </p>
     * 
     * @param deletePricingRuleRequest
     * @return Result of the DeletePricingRule operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSBillingConductor.DeletePricingRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/DeletePricingRule"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePricingRuleResult deletePricingRule(DeletePricingRuleRequest deletePricingRuleRequest);

    /**
     * <p>
     * Removes the specified list of account IDs from the given billing group.
     * </p>
     * 
     * @param disassociateAccountsRequest
     * @return Result of the DisassociateAccounts operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.DisassociateAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/DisassociateAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateAccountsResult disassociateAccounts(DisassociateAccountsRequest disassociateAccountsRequest);

    /**
     * <p>
     * Disassociates a list of pricing rules from a pricing plan.
     * </p>
     * 
     * @param disassociatePricingRulesRequest
     * @return Result of the DisassociatePricingRules operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.DisassociatePricingRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/DisassociatePricingRules"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociatePricingRulesResult disassociatePricingRules(DisassociatePricingRulesRequest disassociatePricingRulesRequest);

    /**
     * <p>
     * This is a paginated call to list linked accounts that are linked to the payer account for the specified time
     * period. If no information is provided, the current billing period is used. The response will optionally include
     * the billing group that's associated with the linked account.
     * </p>
     * 
     * @param listAccountAssociationsRequest
     * @return Result of the ListAccountAssociations operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.ListAccountAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListAccountAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    ListAccountAssociationsResult listAccountAssociations(ListAccountAssociationsRequest listAccountAssociationsRequest);

    /**
     * <p>
     * A paginated call to retrieve a summary report of actual Amazon Web Services charges and the calculated Amazon Web
     * Services charges based on the associated pricing plan of a billing group.
     * </p>
     * 
     * @param listBillingGroupCostReportsRequest
     * @return Result of the ListBillingGroupCostReports operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.ListBillingGroupCostReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListBillingGroupCostReports"
     *      target="_top">AWS API Documentation</a>
     */
    ListBillingGroupCostReportsResult listBillingGroupCostReports(ListBillingGroupCostReportsRequest listBillingGroupCostReportsRequest);

    /**
     * <p>
     * A paginated call to retrieve a list of billing groups for the given billing period. If you don't provide a
     * billing group, the current billing period is used.
     * </p>
     * 
     * @param listBillingGroupsRequest
     * @return Result of the ListBillingGroups operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.ListBillingGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListBillingGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListBillingGroupsResult listBillingGroups(ListBillingGroupsRequest listBillingGroupsRequest);

    /**
     * <p>
     * A paginated call to get a list of all custom line item versions.
     * </p>
     * 
     * @param listCustomLineItemVersionsRequest
     * @return Result of the ListCustomLineItemVersions operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSBillingConductor.ListCustomLineItemVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListCustomLineItemVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListCustomLineItemVersionsResult listCustomLineItemVersions(ListCustomLineItemVersionsRequest listCustomLineItemVersionsRequest);

    /**
     * <p>
     * A paginated call to get a list of all custom line items (FFLIs) for the given billing period. If you don't
     * provide a billing period, the current billing period is used.
     * </p>
     * 
     * @param listCustomLineItemsRequest
     * @return Result of the ListCustomLineItems operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.ListCustomLineItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListCustomLineItems"
     *      target="_top">AWS API Documentation</a>
     */
    ListCustomLineItemsResult listCustomLineItems(ListCustomLineItemsRequest listCustomLineItemsRequest);

    /**
     * <p>
     * A paginated call to get pricing plans for the given billing period. If you don't provide a billing period, the
     * current billing period is used.
     * </p>
     * 
     * @param listPricingPlansRequest
     * @return Result of the ListPricingPlans operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSBillingConductor.ListPricingPlans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListPricingPlans"
     *      target="_top">AWS API Documentation</a>
     */
    ListPricingPlansResult listPricingPlans(ListPricingPlansRequest listPricingPlansRequest);

    /**
     * <p>
     * A list of the pricing plans that are associated with a pricing rule.
     * </p>
     * 
     * @param listPricingPlansAssociatedWithPricingRuleRequest
     * @return Result of the ListPricingPlansAssociatedWithPricingRule operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.ListPricingPlansAssociatedWithPricingRule
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListPricingPlansAssociatedWithPricingRule"
     *      target="_top">AWS API Documentation</a>
     */
    ListPricingPlansAssociatedWithPricingRuleResult listPricingPlansAssociatedWithPricingRule(
            ListPricingPlansAssociatedWithPricingRuleRequest listPricingPlansAssociatedWithPricingRuleRequest);

    /**
     * <p>
     * Describes a pricing rule that can be associated to a pricing plan, or set of pricing plans.
     * </p>
     * 
     * @param listPricingRulesRequest
     * @return Result of the ListPricingRules operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSBillingConductor.ListPricingRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListPricingRules"
     *      target="_top">AWS API Documentation</a>
     */
    ListPricingRulesResult listPricingRules(ListPricingRulesRequest listPricingRulesRequest);

    /**
     * <p>
     * Lists the pricing rules that are associated with a pricing plan.
     * </p>
     * 
     * @param listPricingRulesAssociatedToPricingPlanRequest
     * @return Result of the ListPricingRulesAssociatedToPricingPlan operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.ListPricingRulesAssociatedToPricingPlan
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListPricingRulesAssociatedToPricingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    ListPricingRulesAssociatedToPricingPlanResult listPricingRulesAssociatedToPricingPlan(
            ListPricingRulesAssociatedToPricingPlanRequest listPricingRulesAssociatedToPricingPlanRequest);

    /**
     * <p>
     * List the resources that are associated to a custom line item.
     * </p>
     * 
     * @param listResourcesAssociatedToCustomLineItemRequest
     * @return Result of the ListResourcesAssociatedToCustomLineItem operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.ListResourcesAssociatedToCustomLineItem
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListResourcesAssociatedToCustomLineItem"
     *      target="_top">AWS API Documentation</a>
     */
    ListResourcesAssociatedToCustomLineItemResult listResourcesAssociatedToCustomLineItem(
            ListResourcesAssociatedToCustomLineItemRequest listResourcesAssociatedToCustomLineItemRequest);

    /**
     * <p>
     * A list the tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Associates the specified tags to a resource with the specified <code>resourceArn</code>. If existing tags on a
     * resource are not specified in the request parameters, they are not changed.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Deletes specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * This updates an existing billing group.
     * </p>
     * 
     * @param updateBillingGroupRequest
     * @return Result of the UpdateBillingGroup operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.UpdateBillingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UpdateBillingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateBillingGroupResult updateBillingGroup(UpdateBillingGroupRequest updateBillingGroupRequest);

    /**
     * <p>
     * Update an existing custom line item in the current or previous billing period.
     * </p>
     * 
     * @param updateCustomLineItemRequest
     * @return Result of the UpdateCustomLineItem operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.UpdateCustomLineItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UpdateCustomLineItem"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateCustomLineItemResult updateCustomLineItem(UpdateCustomLineItemRequest updateCustomLineItemRequest);

    /**
     * <p>
     * This updates an existing pricing plan.
     * </p>
     * 
     * @param updatePricingPlanRequest
     * @return Result of the UpdatePricingPlan operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.UpdatePricingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UpdatePricingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePricingPlanResult updatePricingPlan(UpdatePricingPlanRequest updatePricingPlanRequest);

    /**
     * <p>
     * Updates an existing pricing rule.
     * </p>
     * 
     * @param updatePricingRuleRequest
     * @return Result of the UpdatePricingRule operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.UpdatePricingRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UpdatePricingRule"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePricingRuleResult updatePricingRule(UpdatePricingRuleRequest updatePricingRuleRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
