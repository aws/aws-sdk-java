/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssoadmin;

import javax.annotation.Generated;

import com.amazonaws.services.ssoadmin.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing SSO Admin asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSSOAdminAsyncClient extends AWSSSOAdminClient implements AWSSSOAdminAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSSSOAdminAsyncClientBuilder asyncBuilder() {
        return AWSSSOAdminAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SSO Admin using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSSSOAdminAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SSO Admin using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSSSOAdminAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AttachManagedPolicyToPermissionSetResult> attachManagedPolicyToPermissionSetAsync(
            AttachManagedPolicyToPermissionSetRequest request) {

        return attachManagedPolicyToPermissionSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachManagedPolicyToPermissionSetResult> attachManagedPolicyToPermissionSetAsync(
            final AttachManagedPolicyToPermissionSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachManagedPolicyToPermissionSetRequest, AttachManagedPolicyToPermissionSetResult> asyncHandler) {
        final AttachManagedPolicyToPermissionSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AttachManagedPolicyToPermissionSetResult>() {
            @Override
            public AttachManagedPolicyToPermissionSetResult call() throws Exception {
                AttachManagedPolicyToPermissionSetResult result = null;

                try {
                    result = executeAttachManagedPolicyToPermissionSet(finalRequest);
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
    public java.util.concurrent.Future<CreateAccountAssignmentResult> createAccountAssignmentAsync(CreateAccountAssignmentRequest request) {

        return createAccountAssignmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAccountAssignmentResult> createAccountAssignmentAsync(final CreateAccountAssignmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAccountAssignmentRequest, CreateAccountAssignmentResult> asyncHandler) {
        final CreateAccountAssignmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAccountAssignmentResult>() {
            @Override
            public CreateAccountAssignmentResult call() throws Exception {
                CreateAccountAssignmentResult result = null;

                try {
                    result = executeCreateAccountAssignment(finalRequest);
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
    public java.util.concurrent.Future<CreateInstanceAccessControlAttributeConfigurationResult> createInstanceAccessControlAttributeConfigurationAsync(
            CreateInstanceAccessControlAttributeConfigurationRequest request) {

        return createInstanceAccessControlAttributeConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInstanceAccessControlAttributeConfigurationResult> createInstanceAccessControlAttributeConfigurationAsync(
            final CreateInstanceAccessControlAttributeConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInstanceAccessControlAttributeConfigurationRequest, CreateInstanceAccessControlAttributeConfigurationResult> asyncHandler) {
        final CreateInstanceAccessControlAttributeConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateInstanceAccessControlAttributeConfigurationResult>() {
            @Override
            public CreateInstanceAccessControlAttributeConfigurationResult call() throws Exception {
                CreateInstanceAccessControlAttributeConfigurationResult result = null;

                try {
                    result = executeCreateInstanceAccessControlAttributeConfiguration(finalRequest);
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
    public java.util.concurrent.Future<CreatePermissionSetResult> createPermissionSetAsync(CreatePermissionSetRequest request) {

        return createPermissionSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePermissionSetResult> createPermissionSetAsync(final CreatePermissionSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePermissionSetRequest, CreatePermissionSetResult> asyncHandler) {
        final CreatePermissionSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePermissionSetResult>() {
            @Override
            public CreatePermissionSetResult call() throws Exception {
                CreatePermissionSetResult result = null;

                try {
                    result = executeCreatePermissionSet(finalRequest);
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
    public java.util.concurrent.Future<DeleteAccountAssignmentResult> deleteAccountAssignmentAsync(DeleteAccountAssignmentRequest request) {

        return deleteAccountAssignmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAccountAssignmentResult> deleteAccountAssignmentAsync(final DeleteAccountAssignmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAccountAssignmentRequest, DeleteAccountAssignmentResult> asyncHandler) {
        final DeleteAccountAssignmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAccountAssignmentResult>() {
            @Override
            public DeleteAccountAssignmentResult call() throws Exception {
                DeleteAccountAssignmentResult result = null;

                try {
                    result = executeDeleteAccountAssignment(finalRequest);
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
    public java.util.concurrent.Future<DeleteInlinePolicyFromPermissionSetResult> deleteInlinePolicyFromPermissionSetAsync(
            DeleteInlinePolicyFromPermissionSetRequest request) {

        return deleteInlinePolicyFromPermissionSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInlinePolicyFromPermissionSetResult> deleteInlinePolicyFromPermissionSetAsync(
            final DeleteInlinePolicyFromPermissionSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInlinePolicyFromPermissionSetRequest, DeleteInlinePolicyFromPermissionSetResult> asyncHandler) {
        final DeleteInlinePolicyFromPermissionSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteInlinePolicyFromPermissionSetResult>() {
            @Override
            public DeleteInlinePolicyFromPermissionSetResult call() throws Exception {
                DeleteInlinePolicyFromPermissionSetResult result = null;

                try {
                    result = executeDeleteInlinePolicyFromPermissionSet(finalRequest);
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
    public java.util.concurrent.Future<DeleteInstanceAccessControlAttributeConfigurationResult> deleteInstanceAccessControlAttributeConfigurationAsync(
            DeleteInstanceAccessControlAttributeConfigurationRequest request) {

        return deleteInstanceAccessControlAttributeConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInstanceAccessControlAttributeConfigurationResult> deleteInstanceAccessControlAttributeConfigurationAsync(
            final DeleteInstanceAccessControlAttributeConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInstanceAccessControlAttributeConfigurationRequest, DeleteInstanceAccessControlAttributeConfigurationResult> asyncHandler) {
        final DeleteInstanceAccessControlAttributeConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteInstanceAccessControlAttributeConfigurationResult>() {
            @Override
            public DeleteInstanceAccessControlAttributeConfigurationResult call() throws Exception {
                DeleteInstanceAccessControlAttributeConfigurationResult result = null;

                try {
                    result = executeDeleteInstanceAccessControlAttributeConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DeletePermissionSetResult> deletePermissionSetAsync(DeletePermissionSetRequest request) {

        return deletePermissionSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePermissionSetResult> deletePermissionSetAsync(final DeletePermissionSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePermissionSetRequest, DeletePermissionSetResult> asyncHandler) {
        final DeletePermissionSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePermissionSetResult>() {
            @Override
            public DeletePermissionSetResult call() throws Exception {
                DeletePermissionSetResult result = null;

                try {
                    result = executeDeletePermissionSet(finalRequest);
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
    public java.util.concurrent.Future<DescribeAccountAssignmentCreationStatusResult> describeAccountAssignmentCreationStatusAsync(
            DescribeAccountAssignmentCreationStatusRequest request) {

        return describeAccountAssignmentCreationStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountAssignmentCreationStatusResult> describeAccountAssignmentCreationStatusAsync(
            final DescribeAccountAssignmentCreationStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAccountAssignmentCreationStatusRequest, DescribeAccountAssignmentCreationStatusResult> asyncHandler) {
        final DescribeAccountAssignmentCreationStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAccountAssignmentCreationStatusResult>() {
            @Override
            public DescribeAccountAssignmentCreationStatusResult call() throws Exception {
                DescribeAccountAssignmentCreationStatusResult result = null;

                try {
                    result = executeDescribeAccountAssignmentCreationStatus(finalRequest);
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
    public java.util.concurrent.Future<DescribeAccountAssignmentDeletionStatusResult> describeAccountAssignmentDeletionStatusAsync(
            DescribeAccountAssignmentDeletionStatusRequest request) {

        return describeAccountAssignmentDeletionStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountAssignmentDeletionStatusResult> describeAccountAssignmentDeletionStatusAsync(
            final DescribeAccountAssignmentDeletionStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAccountAssignmentDeletionStatusRequest, DescribeAccountAssignmentDeletionStatusResult> asyncHandler) {
        final DescribeAccountAssignmentDeletionStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAccountAssignmentDeletionStatusResult>() {
            @Override
            public DescribeAccountAssignmentDeletionStatusResult call() throws Exception {
                DescribeAccountAssignmentDeletionStatusResult result = null;

                try {
                    result = executeDescribeAccountAssignmentDeletionStatus(finalRequest);
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
    public java.util.concurrent.Future<DescribeInstanceAccessControlAttributeConfigurationResult> describeInstanceAccessControlAttributeConfigurationAsync(
            DescribeInstanceAccessControlAttributeConfigurationRequest request) {

        return describeInstanceAccessControlAttributeConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceAccessControlAttributeConfigurationResult> describeInstanceAccessControlAttributeConfigurationAsync(
            final DescribeInstanceAccessControlAttributeConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstanceAccessControlAttributeConfigurationRequest, DescribeInstanceAccessControlAttributeConfigurationResult> asyncHandler) {
        final DescribeInstanceAccessControlAttributeConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstanceAccessControlAttributeConfigurationResult>() {
            @Override
            public DescribeInstanceAccessControlAttributeConfigurationResult call() throws Exception {
                DescribeInstanceAccessControlAttributeConfigurationResult result = null;

                try {
                    result = executeDescribeInstanceAccessControlAttributeConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DescribePermissionSetResult> describePermissionSetAsync(DescribePermissionSetRequest request) {

        return describePermissionSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePermissionSetResult> describePermissionSetAsync(final DescribePermissionSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePermissionSetRequest, DescribePermissionSetResult> asyncHandler) {
        final DescribePermissionSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePermissionSetResult>() {
            @Override
            public DescribePermissionSetResult call() throws Exception {
                DescribePermissionSetResult result = null;

                try {
                    result = executeDescribePermissionSet(finalRequest);
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
    public java.util.concurrent.Future<DescribePermissionSetProvisioningStatusResult> describePermissionSetProvisioningStatusAsync(
            DescribePermissionSetProvisioningStatusRequest request) {

        return describePermissionSetProvisioningStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePermissionSetProvisioningStatusResult> describePermissionSetProvisioningStatusAsync(
            final DescribePermissionSetProvisioningStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePermissionSetProvisioningStatusRequest, DescribePermissionSetProvisioningStatusResult> asyncHandler) {
        final DescribePermissionSetProvisioningStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePermissionSetProvisioningStatusResult>() {
            @Override
            public DescribePermissionSetProvisioningStatusResult call() throws Exception {
                DescribePermissionSetProvisioningStatusResult result = null;

                try {
                    result = executeDescribePermissionSetProvisioningStatus(finalRequest);
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
    public java.util.concurrent.Future<DetachManagedPolicyFromPermissionSetResult> detachManagedPolicyFromPermissionSetAsync(
            DetachManagedPolicyFromPermissionSetRequest request) {

        return detachManagedPolicyFromPermissionSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachManagedPolicyFromPermissionSetResult> detachManagedPolicyFromPermissionSetAsync(
            final DetachManagedPolicyFromPermissionSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachManagedPolicyFromPermissionSetRequest, DetachManagedPolicyFromPermissionSetResult> asyncHandler) {
        final DetachManagedPolicyFromPermissionSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetachManagedPolicyFromPermissionSetResult>() {
            @Override
            public DetachManagedPolicyFromPermissionSetResult call() throws Exception {
                DetachManagedPolicyFromPermissionSetResult result = null;

                try {
                    result = executeDetachManagedPolicyFromPermissionSet(finalRequest);
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
    public java.util.concurrent.Future<GetInlinePolicyForPermissionSetResult> getInlinePolicyForPermissionSetAsync(
            GetInlinePolicyForPermissionSetRequest request) {

        return getInlinePolicyForPermissionSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInlinePolicyForPermissionSetResult> getInlinePolicyForPermissionSetAsync(
            final GetInlinePolicyForPermissionSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInlinePolicyForPermissionSetRequest, GetInlinePolicyForPermissionSetResult> asyncHandler) {
        final GetInlinePolicyForPermissionSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInlinePolicyForPermissionSetResult>() {
            @Override
            public GetInlinePolicyForPermissionSetResult call() throws Exception {
                GetInlinePolicyForPermissionSetResult result = null;

                try {
                    result = executeGetInlinePolicyForPermissionSet(finalRequest);
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
    public java.util.concurrent.Future<ListAccountAssignmentCreationStatusResult> listAccountAssignmentCreationStatusAsync(
            ListAccountAssignmentCreationStatusRequest request) {

        return listAccountAssignmentCreationStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccountAssignmentCreationStatusResult> listAccountAssignmentCreationStatusAsync(
            final ListAccountAssignmentCreationStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAccountAssignmentCreationStatusRequest, ListAccountAssignmentCreationStatusResult> asyncHandler) {
        final ListAccountAssignmentCreationStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAccountAssignmentCreationStatusResult>() {
            @Override
            public ListAccountAssignmentCreationStatusResult call() throws Exception {
                ListAccountAssignmentCreationStatusResult result = null;

                try {
                    result = executeListAccountAssignmentCreationStatus(finalRequest);
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
    public java.util.concurrent.Future<ListAccountAssignmentDeletionStatusResult> listAccountAssignmentDeletionStatusAsync(
            ListAccountAssignmentDeletionStatusRequest request) {

        return listAccountAssignmentDeletionStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccountAssignmentDeletionStatusResult> listAccountAssignmentDeletionStatusAsync(
            final ListAccountAssignmentDeletionStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAccountAssignmentDeletionStatusRequest, ListAccountAssignmentDeletionStatusResult> asyncHandler) {
        final ListAccountAssignmentDeletionStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAccountAssignmentDeletionStatusResult>() {
            @Override
            public ListAccountAssignmentDeletionStatusResult call() throws Exception {
                ListAccountAssignmentDeletionStatusResult result = null;

                try {
                    result = executeListAccountAssignmentDeletionStatus(finalRequest);
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
    public java.util.concurrent.Future<ListAccountAssignmentsResult> listAccountAssignmentsAsync(ListAccountAssignmentsRequest request) {

        return listAccountAssignmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccountAssignmentsResult> listAccountAssignmentsAsync(final ListAccountAssignmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAccountAssignmentsRequest, ListAccountAssignmentsResult> asyncHandler) {
        final ListAccountAssignmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAccountAssignmentsResult>() {
            @Override
            public ListAccountAssignmentsResult call() throws Exception {
                ListAccountAssignmentsResult result = null;

                try {
                    result = executeListAccountAssignments(finalRequest);
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
    public java.util.concurrent.Future<ListAccountsForProvisionedPermissionSetResult> listAccountsForProvisionedPermissionSetAsync(
            ListAccountsForProvisionedPermissionSetRequest request) {

        return listAccountsForProvisionedPermissionSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccountsForProvisionedPermissionSetResult> listAccountsForProvisionedPermissionSetAsync(
            final ListAccountsForProvisionedPermissionSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAccountsForProvisionedPermissionSetRequest, ListAccountsForProvisionedPermissionSetResult> asyncHandler) {
        final ListAccountsForProvisionedPermissionSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAccountsForProvisionedPermissionSetResult>() {
            @Override
            public ListAccountsForProvisionedPermissionSetResult call() throws Exception {
                ListAccountsForProvisionedPermissionSetResult result = null;

                try {
                    result = executeListAccountsForProvisionedPermissionSet(finalRequest);
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
    public java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest request) {

        return listInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(final ListInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInstancesRequest, ListInstancesResult> asyncHandler) {
        final ListInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInstancesResult>() {
            @Override
            public ListInstancesResult call() throws Exception {
                ListInstancesResult result = null;

                try {
                    result = executeListInstances(finalRequest);
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
    public java.util.concurrent.Future<ListManagedPoliciesInPermissionSetResult> listManagedPoliciesInPermissionSetAsync(
            ListManagedPoliciesInPermissionSetRequest request) {

        return listManagedPoliciesInPermissionSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListManagedPoliciesInPermissionSetResult> listManagedPoliciesInPermissionSetAsync(
            final ListManagedPoliciesInPermissionSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListManagedPoliciesInPermissionSetRequest, ListManagedPoliciesInPermissionSetResult> asyncHandler) {
        final ListManagedPoliciesInPermissionSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListManagedPoliciesInPermissionSetResult>() {
            @Override
            public ListManagedPoliciesInPermissionSetResult call() throws Exception {
                ListManagedPoliciesInPermissionSetResult result = null;

                try {
                    result = executeListManagedPoliciesInPermissionSet(finalRequest);
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
    public java.util.concurrent.Future<ListPermissionSetProvisioningStatusResult> listPermissionSetProvisioningStatusAsync(
            ListPermissionSetProvisioningStatusRequest request) {

        return listPermissionSetProvisioningStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPermissionSetProvisioningStatusResult> listPermissionSetProvisioningStatusAsync(
            final ListPermissionSetProvisioningStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPermissionSetProvisioningStatusRequest, ListPermissionSetProvisioningStatusResult> asyncHandler) {
        final ListPermissionSetProvisioningStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPermissionSetProvisioningStatusResult>() {
            @Override
            public ListPermissionSetProvisioningStatusResult call() throws Exception {
                ListPermissionSetProvisioningStatusResult result = null;

                try {
                    result = executeListPermissionSetProvisioningStatus(finalRequest);
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
    public java.util.concurrent.Future<ListPermissionSetsResult> listPermissionSetsAsync(ListPermissionSetsRequest request) {

        return listPermissionSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPermissionSetsResult> listPermissionSetsAsync(final ListPermissionSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPermissionSetsRequest, ListPermissionSetsResult> asyncHandler) {
        final ListPermissionSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPermissionSetsResult>() {
            @Override
            public ListPermissionSetsResult call() throws Exception {
                ListPermissionSetsResult result = null;

                try {
                    result = executeListPermissionSets(finalRequest);
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
    public java.util.concurrent.Future<ListPermissionSetsProvisionedToAccountResult> listPermissionSetsProvisionedToAccountAsync(
            ListPermissionSetsProvisionedToAccountRequest request) {

        return listPermissionSetsProvisionedToAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPermissionSetsProvisionedToAccountResult> listPermissionSetsProvisionedToAccountAsync(
            final ListPermissionSetsProvisionedToAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPermissionSetsProvisionedToAccountRequest, ListPermissionSetsProvisionedToAccountResult> asyncHandler) {
        final ListPermissionSetsProvisionedToAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPermissionSetsProvisionedToAccountResult>() {
            @Override
            public ListPermissionSetsProvisionedToAccountResult call() throws Exception {
                ListPermissionSetsProvisionedToAccountResult result = null;

                try {
                    result = executeListPermissionSetsProvisionedToAccount(finalRequest);
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
    public java.util.concurrent.Future<ProvisionPermissionSetResult> provisionPermissionSetAsync(ProvisionPermissionSetRequest request) {

        return provisionPermissionSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ProvisionPermissionSetResult> provisionPermissionSetAsync(final ProvisionPermissionSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<ProvisionPermissionSetRequest, ProvisionPermissionSetResult> asyncHandler) {
        final ProvisionPermissionSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ProvisionPermissionSetResult>() {
            @Override
            public ProvisionPermissionSetResult call() throws Exception {
                ProvisionPermissionSetResult result = null;

                try {
                    result = executeProvisionPermissionSet(finalRequest);
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
    public java.util.concurrent.Future<PutInlinePolicyToPermissionSetResult> putInlinePolicyToPermissionSetAsync(PutInlinePolicyToPermissionSetRequest request) {

        return putInlinePolicyToPermissionSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutInlinePolicyToPermissionSetResult> putInlinePolicyToPermissionSetAsync(
            final PutInlinePolicyToPermissionSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutInlinePolicyToPermissionSetRequest, PutInlinePolicyToPermissionSetResult> asyncHandler) {
        final PutInlinePolicyToPermissionSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutInlinePolicyToPermissionSetResult>() {
            @Override
            public PutInlinePolicyToPermissionSetResult call() throws Exception {
                PutInlinePolicyToPermissionSetResult result = null;

                try {
                    result = executePutInlinePolicyToPermissionSet(finalRequest);
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
    public java.util.concurrent.Future<UpdateInstanceAccessControlAttributeConfigurationResult> updateInstanceAccessControlAttributeConfigurationAsync(
            UpdateInstanceAccessControlAttributeConfigurationRequest request) {

        return updateInstanceAccessControlAttributeConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateInstanceAccessControlAttributeConfigurationResult> updateInstanceAccessControlAttributeConfigurationAsync(
            final UpdateInstanceAccessControlAttributeConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateInstanceAccessControlAttributeConfigurationRequest, UpdateInstanceAccessControlAttributeConfigurationResult> asyncHandler) {
        final UpdateInstanceAccessControlAttributeConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateInstanceAccessControlAttributeConfigurationResult>() {
            @Override
            public UpdateInstanceAccessControlAttributeConfigurationResult call() throws Exception {
                UpdateInstanceAccessControlAttributeConfigurationResult result = null;

                try {
                    result = executeUpdateInstanceAccessControlAttributeConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdatePermissionSetResult> updatePermissionSetAsync(UpdatePermissionSetRequest request) {

        return updatePermissionSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePermissionSetResult> updatePermissionSetAsync(final UpdatePermissionSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePermissionSetRequest, UpdatePermissionSetResult> asyncHandler) {
        final UpdatePermissionSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePermissionSetResult>() {
            @Override
            public UpdatePermissionSetResult call() throws Exception {
                UpdatePermissionSetResult result = null;

                try {
                    result = executeUpdatePermissionSet(finalRequest);
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
