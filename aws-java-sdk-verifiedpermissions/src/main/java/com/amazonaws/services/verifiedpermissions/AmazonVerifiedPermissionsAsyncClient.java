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
package com.amazonaws.services.verifiedpermissions;

import javax.annotation.Generated;

import com.amazonaws.services.verifiedpermissions.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Verified Permissions asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Verified Permissions is a permissions management service from Amazon Web Services. You can use Verified
 * Permissions to manage permissions for your application, and authorize user access based on those permissions. Using
 * Verified Permissions, application developers can grant access based on information about the users, resources, and
 * requested actions. You can also evaluate additional information like group membership, attributes of the resources,
 * and session context, such as time of request and IP addresses. Verified Permissions manages these permissions by
 * letting you create and store authorization policies for your applications, such as consumer-facing web sites and
 * enterprise business systems.
 * </p>
 * <p>
 * Verified Permissions uses Cedar as the policy language to express your permission requirements. Cedar supports both
 * role-based access control (RBAC) and attribute-based access control (ABAC) authorization models.
 * </p>
 * <p>
 * For more information about configuring, administering, and using Amazon Verified Permissions in your applications,
 * see the <a href="https://docs.aws.amazon.com/verifiedpermissions/latest/userguide/">Amazon Verified Permissions User
 * Guide</a>.
 * </p>
 * <p>
 * For more information about the Cedar policy language, see the <a href="https://docs.cedarpolicy.com/">Cedar Policy
 * Language Guide</a>.
 * </p>
 * <important>
 * <p>
 * When you write Cedar policies that reference principals, resources and actions, you can define the unique identifiers
 * used for each of those elements. We strongly recommend that you follow these best practices:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Use values like universally unique identifiers (UUIDs) for all principal and resource identifiers.</b>
 * </p>
 * <p>
 * For example, if user <code>jane</code> leaves the company, and you later let someone else use the name
 * <code>jane</code>, then that new user automatically gets access to everything granted by policies that still
 * reference <code>User::"jane"</code>. Cedar can’t distinguish between the new user and the old. This applies to both
 * principal and resource identifiers. Always use identifiers that are guaranteed unique and never reused to ensure that
 * you don’t unintentionally grant access because of the presence of an old identifier in a policy.
 * </p>
 * <p>
 * Where you use a UUID for an entity, we recommend that you follow it with the // comment specifier and the ‘friendly’
 * name of your entity. This helps to make your policies easier to understand. For example: principal ==
 * User::"a1b2c3d4-e5f6-a1b2-c3d4-EXAMPLE11111", // alice
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Do not include personally identifying, confidential, or sensitive information as part of the unique identifier for
 * your principals or resources.</b> These identifiers are included in log entries shared in CloudTrail trails.
 * </p>
 * </li>
 * </ul>
 * </important>
 * <p>
 * Several operations return structures that appear similar, but have different purposes. As new functionality is added
 * to the product, the structure used in a parameter of one operation might need to change in a way that wouldn't make
 * sense for the same parameter in a different operation. To help you understand the purpose of each, the following
 * naming convention is used for the structures:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Parameter type structures that end in <code>Detail</code> are used in <code>Get</code> operations.
 * </p>
 * </li>
 * <li>
 * <p>
 * Parameter type structures that end in <code>Item</code> are used in <code>List</code> operations.
 * </p>
 * </li>
 * <li>
 * <p>
 * Parameter type structures that use neither suffix are used in the mutating (create and update) operations.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonVerifiedPermissionsAsyncClient extends AmazonVerifiedPermissionsClient implements AmazonVerifiedPermissionsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonVerifiedPermissionsAsyncClientBuilder asyncBuilder() {
        return AmazonVerifiedPermissionsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Verified Permissions using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonVerifiedPermissionsAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Verified Permissions using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonVerifiedPermissionsAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchIsAuthorizedResult> batchIsAuthorizedAsync(BatchIsAuthorizedRequest request) {

        return batchIsAuthorizedAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchIsAuthorizedResult> batchIsAuthorizedAsync(final BatchIsAuthorizedRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchIsAuthorizedRequest, BatchIsAuthorizedResult> asyncHandler) {
        final BatchIsAuthorizedRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchIsAuthorizedResult>() {
            @Override
            public BatchIsAuthorizedResult call() throws Exception {
                BatchIsAuthorizedResult result = null;

                try {
                    result = executeBatchIsAuthorized(finalRequest);
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
    public java.util.concurrent.Future<BatchIsAuthorizedWithTokenResult> batchIsAuthorizedWithTokenAsync(BatchIsAuthorizedWithTokenRequest request) {

        return batchIsAuthorizedWithTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchIsAuthorizedWithTokenResult> batchIsAuthorizedWithTokenAsync(final BatchIsAuthorizedWithTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchIsAuthorizedWithTokenRequest, BatchIsAuthorizedWithTokenResult> asyncHandler) {
        final BatchIsAuthorizedWithTokenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchIsAuthorizedWithTokenResult>() {
            @Override
            public BatchIsAuthorizedWithTokenResult call() throws Exception {
                BatchIsAuthorizedWithTokenResult result = null;

                try {
                    result = executeBatchIsAuthorizedWithToken(finalRequest);
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
    public java.util.concurrent.Future<CreateIdentitySourceResult> createIdentitySourceAsync(CreateIdentitySourceRequest request) {

        return createIdentitySourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIdentitySourceResult> createIdentitySourceAsync(final CreateIdentitySourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIdentitySourceRequest, CreateIdentitySourceResult> asyncHandler) {
        final CreateIdentitySourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateIdentitySourceResult>() {
            @Override
            public CreateIdentitySourceResult call() throws Exception {
                CreateIdentitySourceResult result = null;

                try {
                    result = executeCreateIdentitySource(finalRequest);
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
    public java.util.concurrent.Future<CreatePolicyResult> createPolicyAsync(CreatePolicyRequest request) {

        return createPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyResult> createPolicyAsync(final CreatePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePolicyRequest, CreatePolicyResult> asyncHandler) {
        final CreatePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePolicyResult>() {
            @Override
            public CreatePolicyResult call() throws Exception {
                CreatePolicyResult result = null;

                try {
                    result = executeCreatePolicy(finalRequest);
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
    public java.util.concurrent.Future<CreatePolicyStoreResult> createPolicyStoreAsync(CreatePolicyStoreRequest request) {

        return createPolicyStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyStoreResult> createPolicyStoreAsync(final CreatePolicyStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePolicyStoreRequest, CreatePolicyStoreResult> asyncHandler) {
        final CreatePolicyStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePolicyStoreResult>() {
            @Override
            public CreatePolicyStoreResult call() throws Exception {
                CreatePolicyStoreResult result = null;

                try {
                    result = executeCreatePolicyStore(finalRequest);
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
    public java.util.concurrent.Future<CreatePolicyTemplateResult> createPolicyTemplateAsync(CreatePolicyTemplateRequest request) {

        return createPolicyTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyTemplateResult> createPolicyTemplateAsync(final CreatePolicyTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePolicyTemplateRequest, CreatePolicyTemplateResult> asyncHandler) {
        final CreatePolicyTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePolicyTemplateResult>() {
            @Override
            public CreatePolicyTemplateResult call() throws Exception {
                CreatePolicyTemplateResult result = null;

                try {
                    result = executeCreatePolicyTemplate(finalRequest);
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
    public java.util.concurrent.Future<DeleteIdentitySourceResult> deleteIdentitySourceAsync(DeleteIdentitySourceRequest request) {

        return deleteIdentitySourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentitySourceResult> deleteIdentitySourceAsync(final DeleteIdentitySourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIdentitySourceRequest, DeleteIdentitySourceResult> asyncHandler) {
        final DeleteIdentitySourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIdentitySourceResult>() {
            @Override
            public DeleteIdentitySourceResult call() throws Exception {
                DeleteIdentitySourceResult result = null;

                try {
                    result = executeDeleteIdentitySource(finalRequest);
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
    public java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(DeletePolicyRequest request) {

        return deletePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(final DeletePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePolicyRequest, DeletePolicyResult> asyncHandler) {
        final DeletePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePolicyResult>() {
            @Override
            public DeletePolicyResult call() throws Exception {
                DeletePolicyResult result = null;

                try {
                    result = executeDeletePolicy(finalRequest);
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
    public java.util.concurrent.Future<DeletePolicyStoreResult> deletePolicyStoreAsync(DeletePolicyStoreRequest request) {

        return deletePolicyStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyStoreResult> deletePolicyStoreAsync(final DeletePolicyStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePolicyStoreRequest, DeletePolicyStoreResult> asyncHandler) {
        final DeletePolicyStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePolicyStoreResult>() {
            @Override
            public DeletePolicyStoreResult call() throws Exception {
                DeletePolicyStoreResult result = null;

                try {
                    result = executeDeletePolicyStore(finalRequest);
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
    public java.util.concurrent.Future<DeletePolicyTemplateResult> deletePolicyTemplateAsync(DeletePolicyTemplateRequest request) {

        return deletePolicyTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyTemplateResult> deletePolicyTemplateAsync(final DeletePolicyTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePolicyTemplateRequest, DeletePolicyTemplateResult> asyncHandler) {
        final DeletePolicyTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePolicyTemplateResult>() {
            @Override
            public DeletePolicyTemplateResult call() throws Exception {
                DeletePolicyTemplateResult result = null;

                try {
                    result = executeDeletePolicyTemplate(finalRequest);
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
    public java.util.concurrent.Future<GetIdentitySourceResult> getIdentitySourceAsync(GetIdentitySourceRequest request) {

        return getIdentitySourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdentitySourceResult> getIdentitySourceAsync(final GetIdentitySourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIdentitySourceRequest, GetIdentitySourceResult> asyncHandler) {
        final GetIdentitySourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIdentitySourceResult>() {
            @Override
            public GetIdentitySourceResult call() throws Exception {
                GetIdentitySourceResult result = null;

                try {
                    result = executeGetIdentitySource(finalRequest);
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
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest request) {

        return getPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(final GetPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPolicyRequest, GetPolicyResult> asyncHandler) {
        final GetPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPolicyResult>() {
            @Override
            public GetPolicyResult call() throws Exception {
                GetPolicyResult result = null;

                try {
                    result = executeGetPolicy(finalRequest);
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
    public java.util.concurrent.Future<GetPolicyStoreResult> getPolicyStoreAsync(GetPolicyStoreRequest request) {

        return getPolicyStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPolicyStoreResult> getPolicyStoreAsync(final GetPolicyStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPolicyStoreRequest, GetPolicyStoreResult> asyncHandler) {
        final GetPolicyStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPolicyStoreResult>() {
            @Override
            public GetPolicyStoreResult call() throws Exception {
                GetPolicyStoreResult result = null;

                try {
                    result = executeGetPolicyStore(finalRequest);
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
    public java.util.concurrent.Future<GetPolicyTemplateResult> getPolicyTemplateAsync(GetPolicyTemplateRequest request) {

        return getPolicyTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPolicyTemplateResult> getPolicyTemplateAsync(final GetPolicyTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPolicyTemplateRequest, GetPolicyTemplateResult> asyncHandler) {
        final GetPolicyTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPolicyTemplateResult>() {
            @Override
            public GetPolicyTemplateResult call() throws Exception {
                GetPolicyTemplateResult result = null;

                try {
                    result = executeGetPolicyTemplate(finalRequest);
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
    public java.util.concurrent.Future<GetSchemaResult> getSchemaAsync(GetSchemaRequest request) {

        return getSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSchemaResult> getSchemaAsync(final GetSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSchemaRequest, GetSchemaResult> asyncHandler) {
        final GetSchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSchemaResult>() {
            @Override
            public GetSchemaResult call() throws Exception {
                GetSchemaResult result = null;

                try {
                    result = executeGetSchema(finalRequest);
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
    public java.util.concurrent.Future<IsAuthorizedResult> isAuthorizedAsync(IsAuthorizedRequest request) {

        return isAuthorizedAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<IsAuthorizedResult> isAuthorizedAsync(final IsAuthorizedRequest request,
            final com.amazonaws.handlers.AsyncHandler<IsAuthorizedRequest, IsAuthorizedResult> asyncHandler) {
        final IsAuthorizedRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<IsAuthorizedResult>() {
            @Override
            public IsAuthorizedResult call() throws Exception {
                IsAuthorizedResult result = null;

                try {
                    result = executeIsAuthorized(finalRequest);
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
    public java.util.concurrent.Future<IsAuthorizedWithTokenResult> isAuthorizedWithTokenAsync(IsAuthorizedWithTokenRequest request) {

        return isAuthorizedWithTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<IsAuthorizedWithTokenResult> isAuthorizedWithTokenAsync(final IsAuthorizedWithTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<IsAuthorizedWithTokenRequest, IsAuthorizedWithTokenResult> asyncHandler) {
        final IsAuthorizedWithTokenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<IsAuthorizedWithTokenResult>() {
            @Override
            public IsAuthorizedWithTokenResult call() throws Exception {
                IsAuthorizedWithTokenResult result = null;

                try {
                    result = executeIsAuthorizedWithToken(finalRequest);
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
    public java.util.concurrent.Future<ListIdentitySourcesResult> listIdentitySourcesAsync(ListIdentitySourcesRequest request) {

        return listIdentitySourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIdentitySourcesResult> listIdentitySourcesAsync(final ListIdentitySourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIdentitySourcesRequest, ListIdentitySourcesResult> asyncHandler) {
        final ListIdentitySourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIdentitySourcesResult>() {
            @Override
            public ListIdentitySourcesResult call() throws Exception {
                ListIdentitySourcesResult result = null;

                try {
                    result = executeListIdentitySources(finalRequest);
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
    public java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(ListPoliciesRequest request) {

        return listPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(final ListPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPoliciesRequest, ListPoliciesResult> asyncHandler) {
        final ListPoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPoliciesResult>() {
            @Override
            public ListPoliciesResult call() throws Exception {
                ListPoliciesResult result = null;

                try {
                    result = executeListPolicies(finalRequest);
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
    public java.util.concurrent.Future<ListPolicyStoresResult> listPolicyStoresAsync(ListPolicyStoresRequest request) {

        return listPolicyStoresAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPolicyStoresResult> listPolicyStoresAsync(final ListPolicyStoresRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPolicyStoresRequest, ListPolicyStoresResult> asyncHandler) {
        final ListPolicyStoresRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPolicyStoresResult>() {
            @Override
            public ListPolicyStoresResult call() throws Exception {
                ListPolicyStoresResult result = null;

                try {
                    result = executeListPolicyStores(finalRequest);
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
    public java.util.concurrent.Future<ListPolicyTemplatesResult> listPolicyTemplatesAsync(ListPolicyTemplatesRequest request) {

        return listPolicyTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPolicyTemplatesResult> listPolicyTemplatesAsync(final ListPolicyTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPolicyTemplatesRequest, ListPolicyTemplatesResult> asyncHandler) {
        final ListPolicyTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPolicyTemplatesResult>() {
            @Override
            public ListPolicyTemplatesResult call() throws Exception {
                ListPolicyTemplatesResult result = null;

                try {
                    result = executeListPolicyTemplates(finalRequest);
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
    public java.util.concurrent.Future<PutSchemaResult> putSchemaAsync(PutSchemaRequest request) {

        return putSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSchemaResult> putSchemaAsync(final PutSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutSchemaRequest, PutSchemaResult> asyncHandler) {
        final PutSchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutSchemaResult>() {
            @Override
            public PutSchemaResult call() throws Exception {
                PutSchemaResult result = null;

                try {
                    result = executePutSchema(finalRequest);
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
    public java.util.concurrent.Future<UpdateIdentitySourceResult> updateIdentitySourceAsync(UpdateIdentitySourceRequest request) {

        return updateIdentitySourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIdentitySourceResult> updateIdentitySourceAsync(final UpdateIdentitySourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIdentitySourceRequest, UpdateIdentitySourceResult> asyncHandler) {
        final UpdateIdentitySourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateIdentitySourceResult>() {
            @Override
            public UpdateIdentitySourceResult call() throws Exception {
                UpdateIdentitySourceResult result = null;

                try {
                    result = executeUpdateIdentitySource(finalRequest);
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
    public java.util.concurrent.Future<UpdatePolicyResult> updatePolicyAsync(UpdatePolicyRequest request) {

        return updatePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePolicyResult> updatePolicyAsync(final UpdatePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePolicyRequest, UpdatePolicyResult> asyncHandler) {
        final UpdatePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePolicyResult>() {
            @Override
            public UpdatePolicyResult call() throws Exception {
                UpdatePolicyResult result = null;

                try {
                    result = executeUpdatePolicy(finalRequest);
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
    public java.util.concurrent.Future<UpdatePolicyStoreResult> updatePolicyStoreAsync(UpdatePolicyStoreRequest request) {

        return updatePolicyStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePolicyStoreResult> updatePolicyStoreAsync(final UpdatePolicyStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePolicyStoreRequest, UpdatePolicyStoreResult> asyncHandler) {
        final UpdatePolicyStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePolicyStoreResult>() {
            @Override
            public UpdatePolicyStoreResult call() throws Exception {
                UpdatePolicyStoreResult result = null;

                try {
                    result = executeUpdatePolicyStore(finalRequest);
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
    public java.util.concurrent.Future<UpdatePolicyTemplateResult> updatePolicyTemplateAsync(UpdatePolicyTemplateRequest request) {

        return updatePolicyTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePolicyTemplateResult> updatePolicyTemplateAsync(final UpdatePolicyTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePolicyTemplateRequest, UpdatePolicyTemplateResult> asyncHandler) {
        final UpdatePolicyTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePolicyTemplateResult>() {
            @Override
            public UpdatePolicyTemplateResult call() throws Exception {
                UpdatePolicyTemplateResult result = null;

                try {
                    result = executeUpdatePolicyTemplate(finalRequest);
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
