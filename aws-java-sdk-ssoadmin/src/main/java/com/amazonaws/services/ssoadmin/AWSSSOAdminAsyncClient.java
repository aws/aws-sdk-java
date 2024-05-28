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
 * <p>
 * <p>
 * IAM Identity Center (successor to Single Sign-On) helps you securely create, or connect, your workforce identities
 * and manage their access centrally across Amazon Web Services accounts and applications. IAM Identity Center is the
 * recommended approach for workforce authentication and authorization in Amazon Web Services, for organizations of any
 * size and type.
 * </p>
 * <note>
 * <p>
 * IAM Identity Center uses the <code>sso</code> and <code>identitystore</code> API namespaces.
 * </p>
 * </note>
 * <p>
 * This reference guide provides information on single sign-on operations which could be used for access management of
 * Amazon Web Services accounts. For information about IAM Identity Center features, see the <a
 * href="https://docs.aws.amazon.com/singlesignon/latest/userguide/what-is.html">IAM Identity Center User Guide</a>.
 * </p>
 * <p>
 * Many operations in the IAM Identity Center APIs rely on identifiers for users and groups, known as principals. For
 * more information about how to work with principals and principal IDs in IAM Identity Center, see the <a
 * href="https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/welcome.html">Identity Store API
 * Reference</a>.
 * </p>
 * <note>
 * <p>
 * Amazon Web Services provides SDKs that consist of libraries and sample code for various programming languages and
 * platforms (Java, Ruby, .Net, iOS, Android, and more). The SDKs provide a convenient way to create programmatic access
 * to IAM Identity Center and other Amazon Web Services services. For more information about the Amazon Web Services
 * SDKs, including how to download and install them, see <a href="http://aws.amazon.com/tools/">Tools for Amazon Web
 * Services</a>.
 * </p>
 * </note>
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
    public java.util.concurrent.Future<AttachCustomerManagedPolicyReferenceToPermissionSetResult> attachCustomerManagedPolicyReferenceToPermissionSetAsync(
            AttachCustomerManagedPolicyReferenceToPermissionSetRequest request) {

        return attachCustomerManagedPolicyReferenceToPermissionSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachCustomerManagedPolicyReferenceToPermissionSetResult> attachCustomerManagedPolicyReferenceToPermissionSetAsync(
            final AttachCustomerManagedPolicyReferenceToPermissionSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachCustomerManagedPolicyReferenceToPermissionSetRequest, AttachCustomerManagedPolicyReferenceToPermissionSetResult> asyncHandler) {
        final AttachCustomerManagedPolicyReferenceToPermissionSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AttachCustomerManagedPolicyReferenceToPermissionSetResult>() {
            @Override
            public AttachCustomerManagedPolicyReferenceToPermissionSetResult call() throws Exception {
                AttachCustomerManagedPolicyReferenceToPermissionSetResult result = null;

                try {
                    result = executeAttachCustomerManagedPolicyReferenceToPermissionSet(finalRequest);
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
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest request) {

        return createApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(final CreateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler) {
        final CreateApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateApplicationResult>() {
            @Override
            public CreateApplicationResult call() throws Exception {
                CreateApplicationResult result = null;

                try {
                    result = executeCreateApplication(finalRequest);
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
    public java.util.concurrent.Future<CreateApplicationAssignmentResult> createApplicationAssignmentAsync(CreateApplicationAssignmentRequest request) {

        return createApplicationAssignmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationAssignmentResult> createApplicationAssignmentAsync(final CreateApplicationAssignmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApplicationAssignmentRequest, CreateApplicationAssignmentResult> asyncHandler) {
        final CreateApplicationAssignmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateApplicationAssignmentResult>() {
            @Override
            public CreateApplicationAssignmentResult call() throws Exception {
                CreateApplicationAssignmentResult result = null;

                try {
                    result = executeCreateApplicationAssignment(finalRequest);
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
    public java.util.concurrent.Future<CreateInstanceResult> createInstanceAsync(CreateInstanceRequest request) {

        return createInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInstanceResult> createInstanceAsync(final CreateInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInstanceRequest, CreateInstanceResult> asyncHandler) {
        final CreateInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateInstanceResult>() {
            @Override
            public CreateInstanceResult call() throws Exception {
                CreateInstanceResult result = null;

                try {
                    result = executeCreateInstance(finalRequest);
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
    public java.util.concurrent.Future<CreateTrustedTokenIssuerResult> createTrustedTokenIssuerAsync(CreateTrustedTokenIssuerRequest request) {

        return createTrustedTokenIssuerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTrustedTokenIssuerResult> createTrustedTokenIssuerAsync(final CreateTrustedTokenIssuerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTrustedTokenIssuerRequest, CreateTrustedTokenIssuerResult> asyncHandler) {
        final CreateTrustedTokenIssuerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTrustedTokenIssuerResult>() {
            @Override
            public CreateTrustedTokenIssuerResult call() throws Exception {
                CreateTrustedTokenIssuerResult result = null;

                try {
                    result = executeCreateTrustedTokenIssuer(finalRequest);
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
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest request) {

        return deleteApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(final DeleteApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler) {
        final DeleteApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationResult>() {
            @Override
            public DeleteApplicationResult call() throws Exception {
                DeleteApplicationResult result = null;

                try {
                    result = executeDeleteApplication(finalRequest);
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
    public java.util.concurrent.Future<DeleteApplicationAccessScopeResult> deleteApplicationAccessScopeAsync(DeleteApplicationAccessScopeRequest request) {

        return deleteApplicationAccessScopeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationAccessScopeResult> deleteApplicationAccessScopeAsync(final DeleteApplicationAccessScopeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationAccessScopeRequest, DeleteApplicationAccessScopeResult> asyncHandler) {
        final DeleteApplicationAccessScopeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationAccessScopeResult>() {
            @Override
            public DeleteApplicationAccessScopeResult call() throws Exception {
                DeleteApplicationAccessScopeResult result = null;

                try {
                    result = executeDeleteApplicationAccessScope(finalRequest);
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
    public java.util.concurrent.Future<DeleteApplicationAssignmentResult> deleteApplicationAssignmentAsync(DeleteApplicationAssignmentRequest request) {

        return deleteApplicationAssignmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationAssignmentResult> deleteApplicationAssignmentAsync(final DeleteApplicationAssignmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationAssignmentRequest, DeleteApplicationAssignmentResult> asyncHandler) {
        final DeleteApplicationAssignmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationAssignmentResult>() {
            @Override
            public DeleteApplicationAssignmentResult call() throws Exception {
                DeleteApplicationAssignmentResult result = null;

                try {
                    result = executeDeleteApplicationAssignment(finalRequest);
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
    public java.util.concurrent.Future<DeleteApplicationAuthenticationMethodResult> deleteApplicationAuthenticationMethodAsync(
            DeleteApplicationAuthenticationMethodRequest request) {

        return deleteApplicationAuthenticationMethodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationAuthenticationMethodResult> deleteApplicationAuthenticationMethodAsync(
            final DeleteApplicationAuthenticationMethodRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationAuthenticationMethodRequest, DeleteApplicationAuthenticationMethodResult> asyncHandler) {
        final DeleteApplicationAuthenticationMethodRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationAuthenticationMethodResult>() {
            @Override
            public DeleteApplicationAuthenticationMethodResult call() throws Exception {
                DeleteApplicationAuthenticationMethodResult result = null;

                try {
                    result = executeDeleteApplicationAuthenticationMethod(finalRequest);
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
    public java.util.concurrent.Future<DeleteApplicationGrantResult> deleteApplicationGrantAsync(DeleteApplicationGrantRequest request) {

        return deleteApplicationGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationGrantResult> deleteApplicationGrantAsync(final DeleteApplicationGrantRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationGrantRequest, DeleteApplicationGrantResult> asyncHandler) {
        final DeleteApplicationGrantRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationGrantResult>() {
            @Override
            public DeleteApplicationGrantResult call() throws Exception {
                DeleteApplicationGrantResult result = null;

                try {
                    result = executeDeleteApplicationGrant(finalRequest);
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
    public java.util.concurrent.Future<DeleteInstanceResult> deleteInstanceAsync(DeleteInstanceRequest request) {

        return deleteInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInstanceResult> deleteInstanceAsync(final DeleteInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInstanceRequest, DeleteInstanceResult> asyncHandler) {
        final DeleteInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteInstanceResult>() {
            @Override
            public DeleteInstanceResult call() throws Exception {
                DeleteInstanceResult result = null;

                try {
                    result = executeDeleteInstance(finalRequest);
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
    public java.util.concurrent.Future<DeletePermissionsBoundaryFromPermissionSetResult> deletePermissionsBoundaryFromPermissionSetAsync(
            DeletePermissionsBoundaryFromPermissionSetRequest request) {

        return deletePermissionsBoundaryFromPermissionSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePermissionsBoundaryFromPermissionSetResult> deletePermissionsBoundaryFromPermissionSetAsync(
            final DeletePermissionsBoundaryFromPermissionSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePermissionsBoundaryFromPermissionSetRequest, DeletePermissionsBoundaryFromPermissionSetResult> asyncHandler) {
        final DeletePermissionsBoundaryFromPermissionSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePermissionsBoundaryFromPermissionSetResult>() {
            @Override
            public DeletePermissionsBoundaryFromPermissionSetResult call() throws Exception {
                DeletePermissionsBoundaryFromPermissionSetResult result = null;

                try {
                    result = executeDeletePermissionsBoundaryFromPermissionSet(finalRequest);
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
    public java.util.concurrent.Future<DeleteTrustedTokenIssuerResult> deleteTrustedTokenIssuerAsync(DeleteTrustedTokenIssuerRequest request) {

        return deleteTrustedTokenIssuerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTrustedTokenIssuerResult> deleteTrustedTokenIssuerAsync(final DeleteTrustedTokenIssuerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTrustedTokenIssuerRequest, DeleteTrustedTokenIssuerResult> asyncHandler) {
        final DeleteTrustedTokenIssuerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTrustedTokenIssuerResult>() {
            @Override
            public DeleteTrustedTokenIssuerResult call() throws Exception {
                DeleteTrustedTokenIssuerResult result = null;

                try {
                    result = executeDeleteTrustedTokenIssuer(finalRequest);
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
    public java.util.concurrent.Future<DescribeApplicationResult> describeApplicationAsync(DescribeApplicationRequest request) {

        return describeApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationResult> describeApplicationAsync(final DescribeApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeApplicationRequest, DescribeApplicationResult> asyncHandler) {
        final DescribeApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeApplicationResult>() {
            @Override
            public DescribeApplicationResult call() throws Exception {
                DescribeApplicationResult result = null;

                try {
                    result = executeDescribeApplication(finalRequest);
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
    public java.util.concurrent.Future<DescribeApplicationAssignmentResult> describeApplicationAssignmentAsync(DescribeApplicationAssignmentRequest request) {

        return describeApplicationAssignmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationAssignmentResult> describeApplicationAssignmentAsync(
            final DescribeApplicationAssignmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeApplicationAssignmentRequest, DescribeApplicationAssignmentResult> asyncHandler) {
        final DescribeApplicationAssignmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeApplicationAssignmentResult>() {
            @Override
            public DescribeApplicationAssignmentResult call() throws Exception {
                DescribeApplicationAssignmentResult result = null;

                try {
                    result = executeDescribeApplicationAssignment(finalRequest);
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
    public java.util.concurrent.Future<DescribeApplicationProviderResult> describeApplicationProviderAsync(DescribeApplicationProviderRequest request) {

        return describeApplicationProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationProviderResult> describeApplicationProviderAsync(final DescribeApplicationProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeApplicationProviderRequest, DescribeApplicationProviderResult> asyncHandler) {
        final DescribeApplicationProviderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeApplicationProviderResult>() {
            @Override
            public DescribeApplicationProviderResult call() throws Exception {
                DescribeApplicationProviderResult result = null;

                try {
                    result = executeDescribeApplicationProvider(finalRequest);
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
    public java.util.concurrent.Future<DescribeInstanceResult> describeInstanceAsync(DescribeInstanceRequest request) {

        return describeInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceResult> describeInstanceAsync(final DescribeInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstanceRequest, DescribeInstanceResult> asyncHandler) {
        final DescribeInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstanceResult>() {
            @Override
            public DescribeInstanceResult call() throws Exception {
                DescribeInstanceResult result = null;

                try {
                    result = executeDescribeInstance(finalRequest);
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
    public java.util.concurrent.Future<DescribeTrustedTokenIssuerResult> describeTrustedTokenIssuerAsync(DescribeTrustedTokenIssuerRequest request) {

        return describeTrustedTokenIssuerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrustedTokenIssuerResult> describeTrustedTokenIssuerAsync(final DescribeTrustedTokenIssuerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTrustedTokenIssuerRequest, DescribeTrustedTokenIssuerResult> asyncHandler) {
        final DescribeTrustedTokenIssuerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTrustedTokenIssuerResult>() {
            @Override
            public DescribeTrustedTokenIssuerResult call() throws Exception {
                DescribeTrustedTokenIssuerResult result = null;

                try {
                    result = executeDescribeTrustedTokenIssuer(finalRequest);
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
    public java.util.concurrent.Future<DetachCustomerManagedPolicyReferenceFromPermissionSetResult> detachCustomerManagedPolicyReferenceFromPermissionSetAsync(
            DetachCustomerManagedPolicyReferenceFromPermissionSetRequest request) {

        return detachCustomerManagedPolicyReferenceFromPermissionSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachCustomerManagedPolicyReferenceFromPermissionSetResult> detachCustomerManagedPolicyReferenceFromPermissionSetAsync(
            final DetachCustomerManagedPolicyReferenceFromPermissionSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachCustomerManagedPolicyReferenceFromPermissionSetRequest, DetachCustomerManagedPolicyReferenceFromPermissionSetResult> asyncHandler) {
        final DetachCustomerManagedPolicyReferenceFromPermissionSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetachCustomerManagedPolicyReferenceFromPermissionSetResult>() {
            @Override
            public DetachCustomerManagedPolicyReferenceFromPermissionSetResult call() throws Exception {
                DetachCustomerManagedPolicyReferenceFromPermissionSetResult result = null;

                try {
                    result = executeDetachCustomerManagedPolicyReferenceFromPermissionSet(finalRequest);
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
    public java.util.concurrent.Future<GetApplicationAccessScopeResult> getApplicationAccessScopeAsync(GetApplicationAccessScopeRequest request) {

        return getApplicationAccessScopeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApplicationAccessScopeResult> getApplicationAccessScopeAsync(final GetApplicationAccessScopeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApplicationAccessScopeRequest, GetApplicationAccessScopeResult> asyncHandler) {
        final GetApplicationAccessScopeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApplicationAccessScopeResult>() {
            @Override
            public GetApplicationAccessScopeResult call() throws Exception {
                GetApplicationAccessScopeResult result = null;

                try {
                    result = executeGetApplicationAccessScope(finalRequest);
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
    public java.util.concurrent.Future<GetApplicationAssignmentConfigurationResult> getApplicationAssignmentConfigurationAsync(
            GetApplicationAssignmentConfigurationRequest request) {

        return getApplicationAssignmentConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApplicationAssignmentConfigurationResult> getApplicationAssignmentConfigurationAsync(
            final GetApplicationAssignmentConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApplicationAssignmentConfigurationRequest, GetApplicationAssignmentConfigurationResult> asyncHandler) {
        final GetApplicationAssignmentConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApplicationAssignmentConfigurationResult>() {
            @Override
            public GetApplicationAssignmentConfigurationResult call() throws Exception {
                GetApplicationAssignmentConfigurationResult result = null;

                try {
                    result = executeGetApplicationAssignmentConfiguration(finalRequest);
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
    public java.util.concurrent.Future<GetApplicationAuthenticationMethodResult> getApplicationAuthenticationMethodAsync(
            GetApplicationAuthenticationMethodRequest request) {

        return getApplicationAuthenticationMethodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApplicationAuthenticationMethodResult> getApplicationAuthenticationMethodAsync(
            final GetApplicationAuthenticationMethodRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApplicationAuthenticationMethodRequest, GetApplicationAuthenticationMethodResult> asyncHandler) {
        final GetApplicationAuthenticationMethodRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApplicationAuthenticationMethodResult>() {
            @Override
            public GetApplicationAuthenticationMethodResult call() throws Exception {
                GetApplicationAuthenticationMethodResult result = null;

                try {
                    result = executeGetApplicationAuthenticationMethod(finalRequest);
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
    public java.util.concurrent.Future<GetApplicationGrantResult> getApplicationGrantAsync(GetApplicationGrantRequest request) {

        return getApplicationGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApplicationGrantResult> getApplicationGrantAsync(final GetApplicationGrantRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApplicationGrantRequest, GetApplicationGrantResult> asyncHandler) {
        final GetApplicationGrantRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApplicationGrantResult>() {
            @Override
            public GetApplicationGrantResult call() throws Exception {
                GetApplicationGrantResult result = null;

                try {
                    result = executeGetApplicationGrant(finalRequest);
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
    public java.util.concurrent.Future<GetPermissionsBoundaryForPermissionSetResult> getPermissionsBoundaryForPermissionSetAsync(
            GetPermissionsBoundaryForPermissionSetRequest request) {

        return getPermissionsBoundaryForPermissionSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPermissionsBoundaryForPermissionSetResult> getPermissionsBoundaryForPermissionSetAsync(
            final GetPermissionsBoundaryForPermissionSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPermissionsBoundaryForPermissionSetRequest, GetPermissionsBoundaryForPermissionSetResult> asyncHandler) {
        final GetPermissionsBoundaryForPermissionSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPermissionsBoundaryForPermissionSetResult>() {
            @Override
            public GetPermissionsBoundaryForPermissionSetResult call() throws Exception {
                GetPermissionsBoundaryForPermissionSetResult result = null;

                try {
                    result = executeGetPermissionsBoundaryForPermissionSet(finalRequest);
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
    public java.util.concurrent.Future<ListAccountAssignmentsForPrincipalResult> listAccountAssignmentsForPrincipalAsync(
            ListAccountAssignmentsForPrincipalRequest request) {

        return listAccountAssignmentsForPrincipalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccountAssignmentsForPrincipalResult> listAccountAssignmentsForPrincipalAsync(
            final ListAccountAssignmentsForPrincipalRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAccountAssignmentsForPrincipalRequest, ListAccountAssignmentsForPrincipalResult> asyncHandler) {
        final ListAccountAssignmentsForPrincipalRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAccountAssignmentsForPrincipalResult>() {
            @Override
            public ListAccountAssignmentsForPrincipalResult call() throws Exception {
                ListAccountAssignmentsForPrincipalResult result = null;

                try {
                    result = executeListAccountAssignmentsForPrincipal(finalRequest);
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
    public java.util.concurrent.Future<ListApplicationAccessScopesResult> listApplicationAccessScopesAsync(ListApplicationAccessScopesRequest request) {

        return listApplicationAccessScopesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationAccessScopesResult> listApplicationAccessScopesAsync(final ListApplicationAccessScopesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationAccessScopesRequest, ListApplicationAccessScopesResult> asyncHandler) {
        final ListApplicationAccessScopesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationAccessScopesResult>() {
            @Override
            public ListApplicationAccessScopesResult call() throws Exception {
                ListApplicationAccessScopesResult result = null;

                try {
                    result = executeListApplicationAccessScopes(finalRequest);
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
    public java.util.concurrent.Future<ListApplicationAssignmentsResult> listApplicationAssignmentsAsync(ListApplicationAssignmentsRequest request) {

        return listApplicationAssignmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationAssignmentsResult> listApplicationAssignmentsAsync(final ListApplicationAssignmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationAssignmentsRequest, ListApplicationAssignmentsResult> asyncHandler) {
        final ListApplicationAssignmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationAssignmentsResult>() {
            @Override
            public ListApplicationAssignmentsResult call() throws Exception {
                ListApplicationAssignmentsResult result = null;

                try {
                    result = executeListApplicationAssignments(finalRequest);
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
    public java.util.concurrent.Future<ListApplicationAssignmentsForPrincipalResult> listApplicationAssignmentsForPrincipalAsync(
            ListApplicationAssignmentsForPrincipalRequest request) {

        return listApplicationAssignmentsForPrincipalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationAssignmentsForPrincipalResult> listApplicationAssignmentsForPrincipalAsync(
            final ListApplicationAssignmentsForPrincipalRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationAssignmentsForPrincipalRequest, ListApplicationAssignmentsForPrincipalResult> asyncHandler) {
        final ListApplicationAssignmentsForPrincipalRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationAssignmentsForPrincipalResult>() {
            @Override
            public ListApplicationAssignmentsForPrincipalResult call() throws Exception {
                ListApplicationAssignmentsForPrincipalResult result = null;

                try {
                    result = executeListApplicationAssignmentsForPrincipal(finalRequest);
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
    public java.util.concurrent.Future<ListApplicationAuthenticationMethodsResult> listApplicationAuthenticationMethodsAsync(
            ListApplicationAuthenticationMethodsRequest request) {

        return listApplicationAuthenticationMethodsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationAuthenticationMethodsResult> listApplicationAuthenticationMethodsAsync(
            final ListApplicationAuthenticationMethodsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationAuthenticationMethodsRequest, ListApplicationAuthenticationMethodsResult> asyncHandler) {
        final ListApplicationAuthenticationMethodsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationAuthenticationMethodsResult>() {
            @Override
            public ListApplicationAuthenticationMethodsResult call() throws Exception {
                ListApplicationAuthenticationMethodsResult result = null;

                try {
                    result = executeListApplicationAuthenticationMethods(finalRequest);
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
    public java.util.concurrent.Future<ListApplicationGrantsResult> listApplicationGrantsAsync(ListApplicationGrantsRequest request) {

        return listApplicationGrantsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationGrantsResult> listApplicationGrantsAsync(final ListApplicationGrantsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationGrantsRequest, ListApplicationGrantsResult> asyncHandler) {
        final ListApplicationGrantsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationGrantsResult>() {
            @Override
            public ListApplicationGrantsResult call() throws Exception {
                ListApplicationGrantsResult result = null;

                try {
                    result = executeListApplicationGrants(finalRequest);
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
    public java.util.concurrent.Future<ListApplicationProvidersResult> listApplicationProvidersAsync(ListApplicationProvidersRequest request) {

        return listApplicationProvidersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationProvidersResult> listApplicationProvidersAsync(final ListApplicationProvidersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationProvidersRequest, ListApplicationProvidersResult> asyncHandler) {
        final ListApplicationProvidersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationProvidersResult>() {
            @Override
            public ListApplicationProvidersResult call() throws Exception {
                ListApplicationProvidersResult result = null;

                try {
                    result = executeListApplicationProviders(finalRequest);
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
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest request) {

        return listApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(final ListApplicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler) {
        final ListApplicationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationsResult>() {
            @Override
            public ListApplicationsResult call() throws Exception {
                ListApplicationsResult result = null;

                try {
                    result = executeListApplications(finalRequest);
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
    public java.util.concurrent.Future<ListCustomerManagedPolicyReferencesInPermissionSetResult> listCustomerManagedPolicyReferencesInPermissionSetAsync(
            ListCustomerManagedPolicyReferencesInPermissionSetRequest request) {

        return listCustomerManagedPolicyReferencesInPermissionSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCustomerManagedPolicyReferencesInPermissionSetResult> listCustomerManagedPolicyReferencesInPermissionSetAsync(
            final ListCustomerManagedPolicyReferencesInPermissionSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCustomerManagedPolicyReferencesInPermissionSetRequest, ListCustomerManagedPolicyReferencesInPermissionSetResult> asyncHandler) {
        final ListCustomerManagedPolicyReferencesInPermissionSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCustomerManagedPolicyReferencesInPermissionSetResult>() {
            @Override
            public ListCustomerManagedPolicyReferencesInPermissionSetResult call() throws Exception {
                ListCustomerManagedPolicyReferencesInPermissionSetResult result = null;

                try {
                    result = executeListCustomerManagedPolicyReferencesInPermissionSet(finalRequest);
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
    public java.util.concurrent.Future<ListTrustedTokenIssuersResult> listTrustedTokenIssuersAsync(ListTrustedTokenIssuersRequest request) {

        return listTrustedTokenIssuersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrustedTokenIssuersResult> listTrustedTokenIssuersAsync(final ListTrustedTokenIssuersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrustedTokenIssuersRequest, ListTrustedTokenIssuersResult> asyncHandler) {
        final ListTrustedTokenIssuersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTrustedTokenIssuersResult>() {
            @Override
            public ListTrustedTokenIssuersResult call() throws Exception {
                ListTrustedTokenIssuersResult result = null;

                try {
                    result = executeListTrustedTokenIssuers(finalRequest);
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
    public java.util.concurrent.Future<PutApplicationAccessScopeResult> putApplicationAccessScopeAsync(PutApplicationAccessScopeRequest request) {

        return putApplicationAccessScopeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutApplicationAccessScopeResult> putApplicationAccessScopeAsync(final PutApplicationAccessScopeRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutApplicationAccessScopeRequest, PutApplicationAccessScopeResult> asyncHandler) {
        final PutApplicationAccessScopeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutApplicationAccessScopeResult>() {
            @Override
            public PutApplicationAccessScopeResult call() throws Exception {
                PutApplicationAccessScopeResult result = null;

                try {
                    result = executePutApplicationAccessScope(finalRequest);
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
    public java.util.concurrent.Future<PutApplicationAssignmentConfigurationResult> putApplicationAssignmentConfigurationAsync(
            PutApplicationAssignmentConfigurationRequest request) {

        return putApplicationAssignmentConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutApplicationAssignmentConfigurationResult> putApplicationAssignmentConfigurationAsync(
            final PutApplicationAssignmentConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutApplicationAssignmentConfigurationRequest, PutApplicationAssignmentConfigurationResult> asyncHandler) {
        final PutApplicationAssignmentConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutApplicationAssignmentConfigurationResult>() {
            @Override
            public PutApplicationAssignmentConfigurationResult call() throws Exception {
                PutApplicationAssignmentConfigurationResult result = null;

                try {
                    result = executePutApplicationAssignmentConfiguration(finalRequest);
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
    public java.util.concurrent.Future<PutApplicationAuthenticationMethodResult> putApplicationAuthenticationMethodAsync(
            PutApplicationAuthenticationMethodRequest request) {

        return putApplicationAuthenticationMethodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutApplicationAuthenticationMethodResult> putApplicationAuthenticationMethodAsync(
            final PutApplicationAuthenticationMethodRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutApplicationAuthenticationMethodRequest, PutApplicationAuthenticationMethodResult> asyncHandler) {
        final PutApplicationAuthenticationMethodRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutApplicationAuthenticationMethodResult>() {
            @Override
            public PutApplicationAuthenticationMethodResult call() throws Exception {
                PutApplicationAuthenticationMethodResult result = null;

                try {
                    result = executePutApplicationAuthenticationMethod(finalRequest);
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
    public java.util.concurrent.Future<PutApplicationGrantResult> putApplicationGrantAsync(PutApplicationGrantRequest request) {

        return putApplicationGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutApplicationGrantResult> putApplicationGrantAsync(final PutApplicationGrantRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutApplicationGrantRequest, PutApplicationGrantResult> asyncHandler) {
        final PutApplicationGrantRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutApplicationGrantResult>() {
            @Override
            public PutApplicationGrantResult call() throws Exception {
                PutApplicationGrantResult result = null;

                try {
                    result = executePutApplicationGrant(finalRequest);
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
    public java.util.concurrent.Future<PutPermissionsBoundaryToPermissionSetResult> putPermissionsBoundaryToPermissionSetAsync(
            PutPermissionsBoundaryToPermissionSetRequest request) {

        return putPermissionsBoundaryToPermissionSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutPermissionsBoundaryToPermissionSetResult> putPermissionsBoundaryToPermissionSetAsync(
            final PutPermissionsBoundaryToPermissionSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutPermissionsBoundaryToPermissionSetRequest, PutPermissionsBoundaryToPermissionSetResult> asyncHandler) {
        final PutPermissionsBoundaryToPermissionSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutPermissionsBoundaryToPermissionSetResult>() {
            @Override
            public PutPermissionsBoundaryToPermissionSetResult call() throws Exception {
                PutPermissionsBoundaryToPermissionSetResult result = null;

                try {
                    result = executePutPermissionsBoundaryToPermissionSet(finalRequest);
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
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest request) {

        return updateApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(final UpdateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler) {
        final UpdateApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApplicationResult>() {
            @Override
            public UpdateApplicationResult call() throws Exception {
                UpdateApplicationResult result = null;

                try {
                    result = executeUpdateApplication(finalRequest);
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
    public java.util.concurrent.Future<UpdateInstanceResult> updateInstanceAsync(UpdateInstanceRequest request) {

        return updateInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateInstanceResult> updateInstanceAsync(final UpdateInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateInstanceRequest, UpdateInstanceResult> asyncHandler) {
        final UpdateInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateInstanceResult>() {
            @Override
            public UpdateInstanceResult call() throws Exception {
                UpdateInstanceResult result = null;

                try {
                    result = executeUpdateInstance(finalRequest);
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

    @Override
    public java.util.concurrent.Future<UpdateTrustedTokenIssuerResult> updateTrustedTokenIssuerAsync(UpdateTrustedTokenIssuerRequest request) {

        return updateTrustedTokenIssuerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTrustedTokenIssuerResult> updateTrustedTokenIssuerAsync(final UpdateTrustedTokenIssuerRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTrustedTokenIssuerRequest, UpdateTrustedTokenIssuerResult> asyncHandler) {
        final UpdateTrustedTokenIssuerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTrustedTokenIssuerResult>() {
            @Override
            public UpdateTrustedTokenIssuerResult call() throws Exception {
                UpdateTrustedTokenIssuerResult result = null;

                try {
                    result = executeUpdateTrustedTokenIssuer(finalRequest);
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
