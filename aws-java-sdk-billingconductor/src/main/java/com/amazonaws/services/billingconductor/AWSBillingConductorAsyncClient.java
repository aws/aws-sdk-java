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
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWSBillingConductor asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
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
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSBillingConductorAsyncClient extends AWSBillingConductorClient implements AWSBillingConductorAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSBillingConductorAsyncClientBuilder asyncBuilder() {
        return AWSBillingConductorAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSBillingConductor using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSBillingConductorAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSBillingConductor using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSBillingConductorAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssociateAccountsResult> associateAccountsAsync(AssociateAccountsRequest request) {

        return associateAccountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateAccountsResult> associateAccountsAsync(final AssociateAccountsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateAccountsRequest, AssociateAccountsResult> asyncHandler) {
        final AssociateAccountsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateAccountsResult>() {
            @Override
            public AssociateAccountsResult call() throws Exception {
                AssociateAccountsResult result = null;

                try {
                    result = executeAssociateAccounts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociatePricingRulesResult> associatePricingRulesAsync(AssociatePricingRulesRequest request) {

        return associatePricingRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociatePricingRulesResult> associatePricingRulesAsync(final AssociatePricingRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociatePricingRulesRequest, AssociatePricingRulesResult> asyncHandler) {
        final AssociatePricingRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociatePricingRulesResult>() {
            @Override
            public AssociatePricingRulesResult call() throws Exception {
                AssociatePricingRulesResult result = null;

                try {
                    result = executeAssociatePricingRules(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchAssociateResourcesToCustomLineItemResult> batchAssociateResourcesToCustomLineItemAsync(
            BatchAssociateResourcesToCustomLineItemRequest request) {

        return batchAssociateResourcesToCustomLineItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchAssociateResourcesToCustomLineItemResult> batchAssociateResourcesToCustomLineItemAsync(
            final BatchAssociateResourcesToCustomLineItemRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchAssociateResourcesToCustomLineItemRequest, BatchAssociateResourcesToCustomLineItemResult> asyncHandler) {
        final BatchAssociateResourcesToCustomLineItemRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchAssociateResourcesToCustomLineItemResult>() {
            @Override
            public BatchAssociateResourcesToCustomLineItemResult call() throws Exception {
                BatchAssociateResourcesToCustomLineItemResult result = null;

                try {
                    result = executeBatchAssociateResourcesToCustomLineItem(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchDisassociateResourcesFromCustomLineItemResult> batchDisassociateResourcesFromCustomLineItemAsync(
            BatchDisassociateResourcesFromCustomLineItemRequest request) {

        return batchDisassociateResourcesFromCustomLineItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDisassociateResourcesFromCustomLineItemResult> batchDisassociateResourcesFromCustomLineItemAsync(
            final BatchDisassociateResourcesFromCustomLineItemRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDisassociateResourcesFromCustomLineItemRequest, BatchDisassociateResourcesFromCustomLineItemResult> asyncHandler) {
        final BatchDisassociateResourcesFromCustomLineItemRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDisassociateResourcesFromCustomLineItemResult>() {
            @Override
            public BatchDisassociateResourcesFromCustomLineItemResult call() throws Exception {
                BatchDisassociateResourcesFromCustomLineItemResult result = null;

                try {
                    result = executeBatchDisassociateResourcesFromCustomLineItem(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateBillingGroupResult> createBillingGroupAsync(CreateBillingGroupRequest request) {

        return createBillingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBillingGroupResult> createBillingGroupAsync(final CreateBillingGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBillingGroupRequest, CreateBillingGroupResult> asyncHandler) {
        final CreateBillingGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBillingGroupResult>() {
            @Override
            public CreateBillingGroupResult call() throws Exception {
                CreateBillingGroupResult result = null;

                try {
                    result = executeCreateBillingGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateCustomLineItemResult> createCustomLineItemAsync(CreateCustomLineItemRequest request) {

        return createCustomLineItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCustomLineItemResult> createCustomLineItemAsync(final CreateCustomLineItemRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCustomLineItemRequest, CreateCustomLineItemResult> asyncHandler) {
        final CreateCustomLineItemRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCustomLineItemResult>() {
            @Override
            public CreateCustomLineItemResult call() throws Exception {
                CreateCustomLineItemResult result = null;

                try {
                    result = executeCreateCustomLineItem(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePricingPlanResult> createPricingPlanAsync(CreatePricingPlanRequest request) {

        return createPricingPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePricingPlanResult> createPricingPlanAsync(final CreatePricingPlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePricingPlanRequest, CreatePricingPlanResult> asyncHandler) {
        final CreatePricingPlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePricingPlanResult>() {
            @Override
            public CreatePricingPlanResult call() throws Exception {
                CreatePricingPlanResult result = null;

                try {
                    result = executeCreatePricingPlan(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePricingRuleResult> createPricingRuleAsync(CreatePricingRuleRequest request) {

        return createPricingRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePricingRuleResult> createPricingRuleAsync(final CreatePricingRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePricingRuleRequest, CreatePricingRuleResult> asyncHandler) {
        final CreatePricingRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePricingRuleResult>() {
            @Override
            public CreatePricingRuleResult call() throws Exception {
                CreatePricingRuleResult result = null;

                try {
                    result = executeCreatePricingRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteBillingGroupResult> deleteBillingGroupAsync(DeleteBillingGroupRequest request) {

        return deleteBillingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBillingGroupResult> deleteBillingGroupAsync(final DeleteBillingGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBillingGroupRequest, DeleteBillingGroupResult> asyncHandler) {
        final DeleteBillingGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBillingGroupResult>() {
            @Override
            public DeleteBillingGroupResult call() throws Exception {
                DeleteBillingGroupResult result = null;

                try {
                    result = executeDeleteBillingGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomLineItemResult> deleteCustomLineItemAsync(DeleteCustomLineItemRequest request) {

        return deleteCustomLineItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomLineItemResult> deleteCustomLineItemAsync(final DeleteCustomLineItemRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCustomLineItemRequest, DeleteCustomLineItemResult> asyncHandler) {
        final DeleteCustomLineItemRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCustomLineItemResult>() {
            @Override
            public DeleteCustomLineItemResult call() throws Exception {
                DeleteCustomLineItemResult result = null;

                try {
                    result = executeDeleteCustomLineItem(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePricingPlanResult> deletePricingPlanAsync(DeletePricingPlanRequest request) {

        return deletePricingPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePricingPlanResult> deletePricingPlanAsync(final DeletePricingPlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePricingPlanRequest, DeletePricingPlanResult> asyncHandler) {
        final DeletePricingPlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePricingPlanResult>() {
            @Override
            public DeletePricingPlanResult call() throws Exception {
                DeletePricingPlanResult result = null;

                try {
                    result = executeDeletePricingPlan(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePricingRuleResult> deletePricingRuleAsync(DeletePricingRuleRequest request) {

        return deletePricingRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePricingRuleResult> deletePricingRuleAsync(final DeletePricingRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePricingRuleRequest, DeletePricingRuleResult> asyncHandler) {
        final DeletePricingRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePricingRuleResult>() {
            @Override
            public DeletePricingRuleResult call() throws Exception {
                DeletePricingRuleResult result = null;

                try {
                    result = executeDeletePricingRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateAccountsResult> disassociateAccountsAsync(DisassociateAccountsRequest request) {

        return disassociateAccountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateAccountsResult> disassociateAccountsAsync(final DisassociateAccountsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateAccountsRequest, DisassociateAccountsResult> asyncHandler) {
        final DisassociateAccountsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateAccountsResult>() {
            @Override
            public DisassociateAccountsResult call() throws Exception {
                DisassociateAccountsResult result = null;

                try {
                    result = executeDisassociateAccounts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociatePricingRulesResult> disassociatePricingRulesAsync(DisassociatePricingRulesRequest request) {

        return disassociatePricingRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociatePricingRulesResult> disassociatePricingRulesAsync(final DisassociatePricingRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociatePricingRulesRequest, DisassociatePricingRulesResult> asyncHandler) {
        final DisassociatePricingRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociatePricingRulesResult>() {
            @Override
            public DisassociatePricingRulesResult call() throws Exception {
                DisassociatePricingRulesResult result = null;

                try {
                    result = executeDisassociatePricingRules(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAccountAssociationsResult> listAccountAssociationsAsync(ListAccountAssociationsRequest request) {

        return listAccountAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccountAssociationsResult> listAccountAssociationsAsync(final ListAccountAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAccountAssociationsRequest, ListAccountAssociationsResult> asyncHandler) {
        final ListAccountAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAccountAssociationsResult>() {
            @Override
            public ListAccountAssociationsResult call() throws Exception {
                ListAccountAssociationsResult result = null;

                try {
                    result = executeListAccountAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListBillingGroupCostReportsResult> listBillingGroupCostReportsAsync(ListBillingGroupCostReportsRequest request) {

        return listBillingGroupCostReportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBillingGroupCostReportsResult> listBillingGroupCostReportsAsync(final ListBillingGroupCostReportsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBillingGroupCostReportsRequest, ListBillingGroupCostReportsResult> asyncHandler) {
        final ListBillingGroupCostReportsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBillingGroupCostReportsResult>() {
            @Override
            public ListBillingGroupCostReportsResult call() throws Exception {
                ListBillingGroupCostReportsResult result = null;

                try {
                    result = executeListBillingGroupCostReports(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListBillingGroupsResult> listBillingGroupsAsync(ListBillingGroupsRequest request) {

        return listBillingGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBillingGroupsResult> listBillingGroupsAsync(final ListBillingGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBillingGroupsRequest, ListBillingGroupsResult> asyncHandler) {
        final ListBillingGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBillingGroupsResult>() {
            @Override
            public ListBillingGroupsResult call() throws Exception {
                ListBillingGroupsResult result = null;

                try {
                    result = executeListBillingGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListCustomLineItemVersionsResult> listCustomLineItemVersionsAsync(ListCustomLineItemVersionsRequest request) {

        return listCustomLineItemVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCustomLineItemVersionsResult> listCustomLineItemVersionsAsync(final ListCustomLineItemVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCustomLineItemVersionsRequest, ListCustomLineItemVersionsResult> asyncHandler) {
        final ListCustomLineItemVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCustomLineItemVersionsResult>() {
            @Override
            public ListCustomLineItemVersionsResult call() throws Exception {
                ListCustomLineItemVersionsResult result = null;

                try {
                    result = executeListCustomLineItemVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListCustomLineItemsResult> listCustomLineItemsAsync(ListCustomLineItemsRequest request) {

        return listCustomLineItemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCustomLineItemsResult> listCustomLineItemsAsync(final ListCustomLineItemsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCustomLineItemsRequest, ListCustomLineItemsResult> asyncHandler) {
        final ListCustomLineItemsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCustomLineItemsResult>() {
            @Override
            public ListCustomLineItemsResult call() throws Exception {
                ListCustomLineItemsResult result = null;

                try {
                    result = executeListCustomLineItems(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPricingPlansResult> listPricingPlansAsync(ListPricingPlansRequest request) {

        return listPricingPlansAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPricingPlansResult> listPricingPlansAsync(final ListPricingPlansRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPricingPlansRequest, ListPricingPlansResult> asyncHandler) {
        final ListPricingPlansRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPricingPlansResult>() {
            @Override
            public ListPricingPlansResult call() throws Exception {
                ListPricingPlansResult result = null;

                try {
                    result = executeListPricingPlans(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPricingPlansAssociatedWithPricingRuleResult> listPricingPlansAssociatedWithPricingRuleAsync(
            ListPricingPlansAssociatedWithPricingRuleRequest request) {

        return listPricingPlansAssociatedWithPricingRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPricingPlansAssociatedWithPricingRuleResult> listPricingPlansAssociatedWithPricingRuleAsync(
            final ListPricingPlansAssociatedWithPricingRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPricingPlansAssociatedWithPricingRuleRequest, ListPricingPlansAssociatedWithPricingRuleResult> asyncHandler) {
        final ListPricingPlansAssociatedWithPricingRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPricingPlansAssociatedWithPricingRuleResult>() {
            @Override
            public ListPricingPlansAssociatedWithPricingRuleResult call() throws Exception {
                ListPricingPlansAssociatedWithPricingRuleResult result = null;

                try {
                    result = executeListPricingPlansAssociatedWithPricingRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPricingRulesResult> listPricingRulesAsync(ListPricingRulesRequest request) {

        return listPricingRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPricingRulesResult> listPricingRulesAsync(final ListPricingRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPricingRulesRequest, ListPricingRulesResult> asyncHandler) {
        final ListPricingRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPricingRulesResult>() {
            @Override
            public ListPricingRulesResult call() throws Exception {
                ListPricingRulesResult result = null;

                try {
                    result = executeListPricingRules(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPricingRulesAssociatedToPricingPlanResult> listPricingRulesAssociatedToPricingPlanAsync(
            ListPricingRulesAssociatedToPricingPlanRequest request) {

        return listPricingRulesAssociatedToPricingPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPricingRulesAssociatedToPricingPlanResult> listPricingRulesAssociatedToPricingPlanAsync(
            final ListPricingRulesAssociatedToPricingPlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPricingRulesAssociatedToPricingPlanRequest, ListPricingRulesAssociatedToPricingPlanResult> asyncHandler) {
        final ListPricingRulesAssociatedToPricingPlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPricingRulesAssociatedToPricingPlanResult>() {
            @Override
            public ListPricingRulesAssociatedToPricingPlanResult call() throws Exception {
                ListPricingRulesAssociatedToPricingPlanResult result = null;

                try {
                    result = executeListPricingRulesAssociatedToPricingPlan(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListResourcesAssociatedToCustomLineItemResult> listResourcesAssociatedToCustomLineItemAsync(
            ListResourcesAssociatedToCustomLineItemRequest request) {

        return listResourcesAssociatedToCustomLineItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourcesAssociatedToCustomLineItemResult> listResourcesAssociatedToCustomLineItemAsync(
            final ListResourcesAssociatedToCustomLineItemRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResourcesAssociatedToCustomLineItemRequest, ListResourcesAssociatedToCustomLineItemResult> asyncHandler) {
        final ListResourcesAssociatedToCustomLineItemRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResourcesAssociatedToCustomLineItemResult>() {
            @Override
            public ListResourcesAssociatedToCustomLineItemResult call() throws Exception {
                ListResourcesAssociatedToCustomLineItemResult result = null;

                try {
                    result = executeListResourcesAssociatedToCustomLineItem(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateBillingGroupResult> updateBillingGroupAsync(UpdateBillingGroupRequest request) {

        return updateBillingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBillingGroupResult> updateBillingGroupAsync(final UpdateBillingGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBillingGroupRequest, UpdateBillingGroupResult> asyncHandler) {
        final UpdateBillingGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBillingGroupResult>() {
            @Override
            public UpdateBillingGroupResult call() throws Exception {
                UpdateBillingGroupResult result = null;

                try {
                    result = executeUpdateBillingGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateCustomLineItemResult> updateCustomLineItemAsync(UpdateCustomLineItemRequest request) {

        return updateCustomLineItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCustomLineItemResult> updateCustomLineItemAsync(final UpdateCustomLineItemRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCustomLineItemRequest, UpdateCustomLineItemResult> asyncHandler) {
        final UpdateCustomLineItemRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCustomLineItemResult>() {
            @Override
            public UpdateCustomLineItemResult call() throws Exception {
                UpdateCustomLineItemResult result = null;

                try {
                    result = executeUpdateCustomLineItem(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdatePricingPlanResult> updatePricingPlanAsync(UpdatePricingPlanRequest request) {

        return updatePricingPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePricingPlanResult> updatePricingPlanAsync(final UpdatePricingPlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePricingPlanRequest, UpdatePricingPlanResult> asyncHandler) {
        final UpdatePricingPlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePricingPlanResult>() {
            @Override
            public UpdatePricingPlanResult call() throws Exception {
                UpdatePricingPlanResult result = null;

                try {
                    result = executeUpdatePricingPlan(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdatePricingRuleResult> updatePricingRuleAsync(UpdatePricingRuleRequest request) {

        return updatePricingRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePricingRuleResult> updatePricingRuleAsync(final UpdatePricingRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePricingRuleRequest, UpdatePricingRuleResult> asyncHandler) {
        final UpdatePricingRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePricingRuleResult>() {
            @Override
            public UpdatePricingRuleResult call() throws Exception {
                UpdatePricingRuleResult result = null;

                try {
                    result = executeUpdatePricingRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
