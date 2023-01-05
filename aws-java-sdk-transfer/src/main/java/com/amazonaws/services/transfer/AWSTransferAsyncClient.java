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
package com.amazonaws.services.transfer;

import javax.annotation.Generated;

import com.amazonaws.services.transfer.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Transfer asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Transfer Family is a fully managed service that enables the transfer of files over the File Transfer Protocol (FTP),
 * File Transfer Protocol over SSL (FTPS), or Secure Shell (SSH) File Transfer Protocol (SFTP) directly into and out of
 * Amazon Simple Storage Service (Amazon S3) or Amazon EFS. Additionally, you can use Applicability Statement 2 (AS2) to
 * transfer files into and out of Amazon S3. Amazon Web Services helps you seamlessly migrate your file transfer
 * workflows to Transfer Family by integrating with existing authentication systems, and providing DNS routing with
 * Amazon Route 53 so nothing changes for your customers and partners, or their applications. With your data in Amazon
 * S3, you can use it with Amazon Web Services for processing, analytics, machine learning, and archiving. Getting
 * started with Transfer Family is easy since there is no infrastructure to buy and set up.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSTransferAsyncClient extends AWSTransferClient implements AWSTransferAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSTransferAsyncClientBuilder asyncBuilder() {
        return AWSTransferAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Transfer using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSTransferAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Transfer using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSTransferAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateAccessResult> createAccessAsync(CreateAccessRequest request) {

        return createAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAccessResult> createAccessAsync(final CreateAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAccessRequest, CreateAccessResult> asyncHandler) {
        final CreateAccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAccessResult>() {
            @Override
            public CreateAccessResult call() throws Exception {
                CreateAccessResult result = null;

                try {
                    result = executeCreateAccess(finalRequest);
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
    public java.util.concurrent.Future<CreateAgreementResult> createAgreementAsync(CreateAgreementRequest request) {

        return createAgreementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAgreementResult> createAgreementAsync(final CreateAgreementRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAgreementRequest, CreateAgreementResult> asyncHandler) {
        final CreateAgreementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAgreementResult>() {
            @Override
            public CreateAgreementResult call() throws Exception {
                CreateAgreementResult result = null;

                try {
                    result = executeCreateAgreement(finalRequest);
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
    public java.util.concurrent.Future<CreateConnectorResult> createConnectorAsync(CreateConnectorRequest request) {

        return createConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConnectorResult> createConnectorAsync(final CreateConnectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConnectorRequest, CreateConnectorResult> asyncHandler) {
        final CreateConnectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConnectorResult>() {
            @Override
            public CreateConnectorResult call() throws Exception {
                CreateConnectorResult result = null;

                try {
                    result = executeCreateConnector(finalRequest);
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
    public java.util.concurrent.Future<CreateProfileResult> createProfileAsync(CreateProfileRequest request) {

        return createProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProfileResult> createProfileAsync(final CreateProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProfileRequest, CreateProfileResult> asyncHandler) {
        final CreateProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProfileResult>() {
            @Override
            public CreateProfileResult call() throws Exception {
                CreateProfileResult result = null;

                try {
                    result = executeCreateProfile(finalRequest);
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
    public java.util.concurrent.Future<CreateServerResult> createServerAsync(CreateServerRequest request) {

        return createServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateServerResult> createServerAsync(final CreateServerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateServerRequest, CreateServerResult> asyncHandler) {
        final CreateServerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateServerResult>() {
            @Override
            public CreateServerResult call() throws Exception {
                CreateServerResult result = null;

                try {
                    result = executeCreateServer(finalRequest);
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
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest request) {

        return createUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(final CreateUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler) {
        final CreateUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUserResult>() {
            @Override
            public CreateUserResult call() throws Exception {
                CreateUserResult result = null;

                try {
                    result = executeCreateUser(finalRequest);
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
    public java.util.concurrent.Future<CreateWorkflowResult> createWorkflowAsync(CreateWorkflowRequest request) {

        return createWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkflowResult> createWorkflowAsync(final CreateWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorkflowRequest, CreateWorkflowResult> asyncHandler) {
        final CreateWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorkflowResult>() {
            @Override
            public CreateWorkflowResult call() throws Exception {
                CreateWorkflowResult result = null;

                try {
                    result = executeCreateWorkflow(finalRequest);
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
    public java.util.concurrent.Future<DeleteAccessResult> deleteAccessAsync(DeleteAccessRequest request) {

        return deleteAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAccessResult> deleteAccessAsync(final DeleteAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAccessRequest, DeleteAccessResult> asyncHandler) {
        final DeleteAccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAccessResult>() {
            @Override
            public DeleteAccessResult call() throws Exception {
                DeleteAccessResult result = null;

                try {
                    result = executeDeleteAccess(finalRequest);
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
    public java.util.concurrent.Future<DeleteAgreementResult> deleteAgreementAsync(DeleteAgreementRequest request) {

        return deleteAgreementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAgreementResult> deleteAgreementAsync(final DeleteAgreementRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAgreementRequest, DeleteAgreementResult> asyncHandler) {
        final DeleteAgreementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAgreementResult>() {
            @Override
            public DeleteAgreementResult call() throws Exception {
                DeleteAgreementResult result = null;

                try {
                    result = executeDeleteAgreement(finalRequest);
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
    public java.util.concurrent.Future<DeleteCertificateResult> deleteCertificateAsync(DeleteCertificateRequest request) {

        return deleteCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCertificateResult> deleteCertificateAsync(final DeleteCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCertificateRequest, DeleteCertificateResult> asyncHandler) {
        final DeleteCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCertificateResult>() {
            @Override
            public DeleteCertificateResult call() throws Exception {
                DeleteCertificateResult result = null;

                try {
                    result = executeDeleteCertificate(finalRequest);
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
    public java.util.concurrent.Future<DeleteConnectorResult> deleteConnectorAsync(DeleteConnectorRequest request) {

        return deleteConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectorResult> deleteConnectorAsync(final DeleteConnectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConnectorRequest, DeleteConnectorResult> asyncHandler) {
        final DeleteConnectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConnectorResult>() {
            @Override
            public DeleteConnectorResult call() throws Exception {
                DeleteConnectorResult result = null;

                try {
                    result = executeDeleteConnector(finalRequest);
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
    public java.util.concurrent.Future<DeleteHostKeyResult> deleteHostKeyAsync(DeleteHostKeyRequest request) {

        return deleteHostKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHostKeyResult> deleteHostKeyAsync(final DeleteHostKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteHostKeyRequest, DeleteHostKeyResult> asyncHandler) {
        final DeleteHostKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteHostKeyResult>() {
            @Override
            public DeleteHostKeyResult call() throws Exception {
                DeleteHostKeyResult result = null;

                try {
                    result = executeDeleteHostKey(finalRequest);
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
    public java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(DeleteProfileRequest request) {

        return deleteProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(final DeleteProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProfileRequest, DeleteProfileResult> asyncHandler) {
        final DeleteProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProfileResult>() {
            @Override
            public DeleteProfileResult call() throws Exception {
                DeleteProfileResult result = null;

                try {
                    result = executeDeleteProfile(finalRequest);
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
    public java.util.concurrent.Future<DeleteServerResult> deleteServerAsync(DeleteServerRequest request) {

        return deleteServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteServerResult> deleteServerAsync(final DeleteServerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteServerRequest, DeleteServerResult> asyncHandler) {
        final DeleteServerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteServerResult>() {
            @Override
            public DeleteServerResult call() throws Exception {
                DeleteServerResult result = null;

                try {
                    result = executeDeleteServer(finalRequest);
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
    public java.util.concurrent.Future<DeleteSshPublicKeyResult> deleteSshPublicKeyAsync(DeleteSshPublicKeyRequest request) {

        return deleteSshPublicKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSshPublicKeyResult> deleteSshPublicKeyAsync(final DeleteSshPublicKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSshPublicKeyRequest, DeleteSshPublicKeyResult> asyncHandler) {
        final DeleteSshPublicKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSshPublicKeyResult>() {
            @Override
            public DeleteSshPublicKeyResult call() throws Exception {
                DeleteSshPublicKeyResult result = null;

                try {
                    result = executeDeleteSshPublicKey(finalRequest);
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
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest request) {

        return deleteUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(final DeleteUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler) {
        final DeleteUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserResult>() {
            @Override
            public DeleteUserResult call() throws Exception {
                DeleteUserResult result = null;

                try {
                    result = executeDeleteUser(finalRequest);
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
    public java.util.concurrent.Future<DeleteWorkflowResult> deleteWorkflowAsync(DeleteWorkflowRequest request) {

        return deleteWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkflowResult> deleteWorkflowAsync(final DeleteWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWorkflowRequest, DeleteWorkflowResult> asyncHandler) {
        final DeleteWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWorkflowResult>() {
            @Override
            public DeleteWorkflowResult call() throws Exception {
                DeleteWorkflowResult result = null;

                try {
                    result = executeDeleteWorkflow(finalRequest);
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
    public java.util.concurrent.Future<DescribeAccessResult> describeAccessAsync(DescribeAccessRequest request) {

        return describeAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccessResult> describeAccessAsync(final DescribeAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAccessRequest, DescribeAccessResult> asyncHandler) {
        final DescribeAccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAccessResult>() {
            @Override
            public DescribeAccessResult call() throws Exception {
                DescribeAccessResult result = null;

                try {
                    result = executeDescribeAccess(finalRequest);
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
    public java.util.concurrent.Future<DescribeAgreementResult> describeAgreementAsync(DescribeAgreementRequest request) {

        return describeAgreementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAgreementResult> describeAgreementAsync(final DescribeAgreementRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAgreementRequest, DescribeAgreementResult> asyncHandler) {
        final DescribeAgreementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAgreementResult>() {
            @Override
            public DescribeAgreementResult call() throws Exception {
                DescribeAgreementResult result = null;

                try {
                    result = executeDescribeAgreement(finalRequest);
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
    public java.util.concurrent.Future<DescribeCertificateResult> describeCertificateAsync(DescribeCertificateRequest request) {

        return describeCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCertificateResult> describeCertificateAsync(final DescribeCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCertificateRequest, DescribeCertificateResult> asyncHandler) {
        final DescribeCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCertificateResult>() {
            @Override
            public DescribeCertificateResult call() throws Exception {
                DescribeCertificateResult result = null;

                try {
                    result = executeDescribeCertificate(finalRequest);
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
    public java.util.concurrent.Future<DescribeConnectorResult> describeConnectorAsync(DescribeConnectorRequest request) {

        return describeConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectorResult> describeConnectorAsync(final DescribeConnectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConnectorRequest, DescribeConnectorResult> asyncHandler) {
        final DescribeConnectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConnectorResult>() {
            @Override
            public DescribeConnectorResult call() throws Exception {
                DescribeConnectorResult result = null;

                try {
                    result = executeDescribeConnector(finalRequest);
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
    public java.util.concurrent.Future<DescribeExecutionResult> describeExecutionAsync(DescribeExecutionRequest request) {

        return describeExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeExecutionResult> describeExecutionAsync(final DescribeExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeExecutionRequest, DescribeExecutionResult> asyncHandler) {
        final DescribeExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeExecutionResult>() {
            @Override
            public DescribeExecutionResult call() throws Exception {
                DescribeExecutionResult result = null;

                try {
                    result = executeDescribeExecution(finalRequest);
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
    public java.util.concurrent.Future<DescribeHostKeyResult> describeHostKeyAsync(DescribeHostKeyRequest request) {

        return describeHostKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHostKeyResult> describeHostKeyAsync(final DescribeHostKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeHostKeyRequest, DescribeHostKeyResult> asyncHandler) {
        final DescribeHostKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeHostKeyResult>() {
            @Override
            public DescribeHostKeyResult call() throws Exception {
                DescribeHostKeyResult result = null;

                try {
                    result = executeDescribeHostKey(finalRequest);
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
    public java.util.concurrent.Future<DescribeProfileResult> describeProfileAsync(DescribeProfileRequest request) {

        return describeProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProfileResult> describeProfileAsync(final DescribeProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProfileRequest, DescribeProfileResult> asyncHandler) {
        final DescribeProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProfileResult>() {
            @Override
            public DescribeProfileResult call() throws Exception {
                DescribeProfileResult result = null;

                try {
                    result = executeDescribeProfile(finalRequest);
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
    public java.util.concurrent.Future<DescribeSecurityPolicyResult> describeSecurityPolicyAsync(DescribeSecurityPolicyRequest request) {

        return describeSecurityPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSecurityPolicyResult> describeSecurityPolicyAsync(final DescribeSecurityPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSecurityPolicyRequest, DescribeSecurityPolicyResult> asyncHandler) {
        final DescribeSecurityPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSecurityPolicyResult>() {
            @Override
            public DescribeSecurityPolicyResult call() throws Exception {
                DescribeSecurityPolicyResult result = null;

                try {
                    result = executeDescribeSecurityPolicy(finalRequest);
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
    public java.util.concurrent.Future<DescribeServerResult> describeServerAsync(DescribeServerRequest request) {

        return describeServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeServerResult> describeServerAsync(final DescribeServerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeServerRequest, DescribeServerResult> asyncHandler) {
        final DescribeServerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeServerResult>() {
            @Override
            public DescribeServerResult call() throws Exception {
                DescribeServerResult result = null;

                try {
                    result = executeDescribeServer(finalRequest);
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
    public java.util.concurrent.Future<DescribeUserResult> describeUserAsync(DescribeUserRequest request) {

        return describeUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserResult> describeUserAsync(final DescribeUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUserRequest, DescribeUserResult> asyncHandler) {
        final DescribeUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUserResult>() {
            @Override
            public DescribeUserResult call() throws Exception {
                DescribeUserResult result = null;

                try {
                    result = executeDescribeUser(finalRequest);
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
    public java.util.concurrent.Future<DescribeWorkflowResult> describeWorkflowAsync(DescribeWorkflowRequest request) {

        return describeWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkflowResult> describeWorkflowAsync(final DescribeWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWorkflowRequest, DescribeWorkflowResult> asyncHandler) {
        final DescribeWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeWorkflowResult>() {
            @Override
            public DescribeWorkflowResult call() throws Exception {
                DescribeWorkflowResult result = null;

                try {
                    result = executeDescribeWorkflow(finalRequest);
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
    public java.util.concurrent.Future<ImportCertificateResult> importCertificateAsync(ImportCertificateRequest request) {

        return importCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportCertificateResult> importCertificateAsync(final ImportCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportCertificateRequest, ImportCertificateResult> asyncHandler) {
        final ImportCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportCertificateResult>() {
            @Override
            public ImportCertificateResult call() throws Exception {
                ImportCertificateResult result = null;

                try {
                    result = executeImportCertificate(finalRequest);
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
    public java.util.concurrent.Future<ImportHostKeyResult> importHostKeyAsync(ImportHostKeyRequest request) {

        return importHostKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportHostKeyResult> importHostKeyAsync(final ImportHostKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportHostKeyRequest, ImportHostKeyResult> asyncHandler) {
        final ImportHostKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportHostKeyResult>() {
            @Override
            public ImportHostKeyResult call() throws Exception {
                ImportHostKeyResult result = null;

                try {
                    result = executeImportHostKey(finalRequest);
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
    public java.util.concurrent.Future<ImportSshPublicKeyResult> importSshPublicKeyAsync(ImportSshPublicKeyRequest request) {

        return importSshPublicKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportSshPublicKeyResult> importSshPublicKeyAsync(final ImportSshPublicKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportSshPublicKeyRequest, ImportSshPublicKeyResult> asyncHandler) {
        final ImportSshPublicKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportSshPublicKeyResult>() {
            @Override
            public ImportSshPublicKeyResult call() throws Exception {
                ImportSshPublicKeyResult result = null;

                try {
                    result = executeImportSshPublicKey(finalRequest);
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
    public java.util.concurrent.Future<ListAccessesResult> listAccessesAsync(ListAccessesRequest request) {

        return listAccessesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccessesResult> listAccessesAsync(final ListAccessesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAccessesRequest, ListAccessesResult> asyncHandler) {
        final ListAccessesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAccessesResult>() {
            @Override
            public ListAccessesResult call() throws Exception {
                ListAccessesResult result = null;

                try {
                    result = executeListAccesses(finalRequest);
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
    public java.util.concurrent.Future<ListAgreementsResult> listAgreementsAsync(ListAgreementsRequest request) {

        return listAgreementsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAgreementsResult> listAgreementsAsync(final ListAgreementsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAgreementsRequest, ListAgreementsResult> asyncHandler) {
        final ListAgreementsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAgreementsResult>() {
            @Override
            public ListAgreementsResult call() throws Exception {
                ListAgreementsResult result = null;

                try {
                    result = executeListAgreements(finalRequest);
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
    public java.util.concurrent.Future<ListCertificatesResult> listCertificatesAsync(ListCertificatesRequest request) {

        return listCertificatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCertificatesResult> listCertificatesAsync(final ListCertificatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCertificatesRequest, ListCertificatesResult> asyncHandler) {
        final ListCertificatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCertificatesResult>() {
            @Override
            public ListCertificatesResult call() throws Exception {
                ListCertificatesResult result = null;

                try {
                    result = executeListCertificates(finalRequest);
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
    public java.util.concurrent.Future<ListConnectorsResult> listConnectorsAsync(ListConnectorsRequest request) {

        return listConnectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConnectorsResult> listConnectorsAsync(final ListConnectorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConnectorsRequest, ListConnectorsResult> asyncHandler) {
        final ListConnectorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConnectorsResult>() {
            @Override
            public ListConnectorsResult call() throws Exception {
                ListConnectorsResult result = null;

                try {
                    result = executeListConnectors(finalRequest);
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
    public java.util.concurrent.Future<ListExecutionsResult> listExecutionsAsync(ListExecutionsRequest request) {

        return listExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExecutionsResult> listExecutionsAsync(final ListExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListExecutionsRequest, ListExecutionsResult> asyncHandler) {
        final ListExecutionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListExecutionsResult>() {
            @Override
            public ListExecutionsResult call() throws Exception {
                ListExecutionsResult result = null;

                try {
                    result = executeListExecutions(finalRequest);
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
    public java.util.concurrent.Future<ListHostKeysResult> listHostKeysAsync(ListHostKeysRequest request) {

        return listHostKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHostKeysResult> listHostKeysAsync(final ListHostKeysRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListHostKeysRequest, ListHostKeysResult> asyncHandler) {
        final ListHostKeysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListHostKeysResult>() {
            @Override
            public ListHostKeysResult call() throws Exception {
                ListHostKeysResult result = null;

                try {
                    result = executeListHostKeys(finalRequest);
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
    public java.util.concurrent.Future<ListProfilesResult> listProfilesAsync(ListProfilesRequest request) {

        return listProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProfilesResult> listProfilesAsync(final ListProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProfilesRequest, ListProfilesResult> asyncHandler) {
        final ListProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProfilesResult>() {
            @Override
            public ListProfilesResult call() throws Exception {
                ListProfilesResult result = null;

                try {
                    result = executeListProfiles(finalRequest);
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
    public java.util.concurrent.Future<ListSecurityPoliciesResult> listSecurityPoliciesAsync(ListSecurityPoliciesRequest request) {

        return listSecurityPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityPoliciesResult> listSecurityPoliciesAsync(final ListSecurityPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSecurityPoliciesRequest, ListSecurityPoliciesResult> asyncHandler) {
        final ListSecurityPoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSecurityPoliciesResult>() {
            @Override
            public ListSecurityPoliciesResult call() throws Exception {
                ListSecurityPoliciesResult result = null;

                try {
                    result = executeListSecurityPolicies(finalRequest);
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
    public java.util.concurrent.Future<ListServersResult> listServersAsync(ListServersRequest request) {

        return listServersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServersResult> listServersAsync(final ListServersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServersRequest, ListServersResult> asyncHandler) {
        final ListServersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListServersResult>() {
            @Override
            public ListServersResult call() throws Exception {
                ListServersResult result = null;

                try {
                    result = executeListServers(finalRequest);
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
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest request) {

        return listUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync(final ListUsersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler) {
        final ListUsersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUsersResult>() {
            @Override
            public ListUsersResult call() throws Exception {
                ListUsersResult result = null;

                try {
                    result = executeListUsers(finalRequest);
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
    public java.util.concurrent.Future<ListWorkflowsResult> listWorkflowsAsync(ListWorkflowsRequest request) {

        return listWorkflowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkflowsResult> listWorkflowsAsync(final ListWorkflowsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkflowsRequest, ListWorkflowsResult> asyncHandler) {
        final ListWorkflowsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorkflowsResult>() {
            @Override
            public ListWorkflowsResult call() throws Exception {
                ListWorkflowsResult result = null;

                try {
                    result = executeListWorkflows(finalRequest);
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
    public java.util.concurrent.Future<SendWorkflowStepStateResult> sendWorkflowStepStateAsync(SendWorkflowStepStateRequest request) {

        return sendWorkflowStepStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendWorkflowStepStateResult> sendWorkflowStepStateAsync(final SendWorkflowStepStateRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendWorkflowStepStateRequest, SendWorkflowStepStateResult> asyncHandler) {
        final SendWorkflowStepStateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendWorkflowStepStateResult>() {
            @Override
            public SendWorkflowStepStateResult call() throws Exception {
                SendWorkflowStepStateResult result = null;

                try {
                    result = executeSendWorkflowStepState(finalRequest);
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
    public java.util.concurrent.Future<StartFileTransferResult> startFileTransferAsync(StartFileTransferRequest request) {

        return startFileTransferAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartFileTransferResult> startFileTransferAsync(final StartFileTransferRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartFileTransferRequest, StartFileTransferResult> asyncHandler) {
        final StartFileTransferRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartFileTransferResult>() {
            @Override
            public StartFileTransferResult call() throws Exception {
                StartFileTransferResult result = null;

                try {
                    result = executeStartFileTransfer(finalRequest);
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
    public java.util.concurrent.Future<StartServerResult> startServerAsync(StartServerRequest request) {

        return startServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartServerResult> startServerAsync(final StartServerRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartServerRequest, StartServerResult> asyncHandler) {
        final StartServerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartServerResult>() {
            @Override
            public StartServerResult call() throws Exception {
                StartServerResult result = null;

                try {
                    result = executeStartServer(finalRequest);
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
    public java.util.concurrent.Future<StopServerResult> stopServerAsync(StopServerRequest request) {

        return stopServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopServerResult> stopServerAsync(final StopServerRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopServerRequest, StopServerResult> asyncHandler) {
        final StopServerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopServerResult>() {
            @Override
            public StopServerResult call() throws Exception {
                StopServerResult result = null;

                try {
                    result = executeStopServer(finalRequest);
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
    public java.util.concurrent.Future<TestIdentityProviderResult> testIdentityProviderAsync(TestIdentityProviderRequest request) {

        return testIdentityProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestIdentityProviderResult> testIdentityProviderAsync(final TestIdentityProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestIdentityProviderRequest, TestIdentityProviderResult> asyncHandler) {
        final TestIdentityProviderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TestIdentityProviderResult>() {
            @Override
            public TestIdentityProviderResult call() throws Exception {
                TestIdentityProviderResult result = null;

                try {
                    result = executeTestIdentityProvider(finalRequest);
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
    public java.util.concurrent.Future<UpdateAccessResult> updateAccessAsync(UpdateAccessRequest request) {

        return updateAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAccessResult> updateAccessAsync(final UpdateAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAccessRequest, UpdateAccessResult> asyncHandler) {
        final UpdateAccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAccessResult>() {
            @Override
            public UpdateAccessResult call() throws Exception {
                UpdateAccessResult result = null;

                try {
                    result = executeUpdateAccess(finalRequest);
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
    public java.util.concurrent.Future<UpdateAgreementResult> updateAgreementAsync(UpdateAgreementRequest request) {

        return updateAgreementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAgreementResult> updateAgreementAsync(final UpdateAgreementRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAgreementRequest, UpdateAgreementResult> asyncHandler) {
        final UpdateAgreementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAgreementResult>() {
            @Override
            public UpdateAgreementResult call() throws Exception {
                UpdateAgreementResult result = null;

                try {
                    result = executeUpdateAgreement(finalRequest);
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
    public java.util.concurrent.Future<UpdateCertificateResult> updateCertificateAsync(UpdateCertificateRequest request) {

        return updateCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCertificateResult> updateCertificateAsync(final UpdateCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCertificateRequest, UpdateCertificateResult> asyncHandler) {
        final UpdateCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCertificateResult>() {
            @Override
            public UpdateCertificateResult call() throws Exception {
                UpdateCertificateResult result = null;

                try {
                    result = executeUpdateCertificate(finalRequest);
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
    public java.util.concurrent.Future<UpdateConnectorResult> updateConnectorAsync(UpdateConnectorRequest request) {

        return updateConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConnectorResult> updateConnectorAsync(final UpdateConnectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConnectorRequest, UpdateConnectorResult> asyncHandler) {
        final UpdateConnectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConnectorResult>() {
            @Override
            public UpdateConnectorResult call() throws Exception {
                UpdateConnectorResult result = null;

                try {
                    result = executeUpdateConnector(finalRequest);
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
    public java.util.concurrent.Future<UpdateHostKeyResult> updateHostKeyAsync(UpdateHostKeyRequest request) {

        return updateHostKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateHostKeyResult> updateHostKeyAsync(final UpdateHostKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateHostKeyRequest, UpdateHostKeyResult> asyncHandler) {
        final UpdateHostKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateHostKeyResult>() {
            @Override
            public UpdateHostKeyResult call() throws Exception {
                UpdateHostKeyResult result = null;

                try {
                    result = executeUpdateHostKey(finalRequest);
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
    public java.util.concurrent.Future<UpdateProfileResult> updateProfileAsync(UpdateProfileRequest request) {

        return updateProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProfileResult> updateProfileAsync(final UpdateProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateProfileRequest, UpdateProfileResult> asyncHandler) {
        final UpdateProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateProfileResult>() {
            @Override
            public UpdateProfileResult call() throws Exception {
                UpdateProfileResult result = null;

                try {
                    result = executeUpdateProfile(finalRequest);
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
    public java.util.concurrent.Future<UpdateServerResult> updateServerAsync(UpdateServerRequest request) {

        return updateServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServerResult> updateServerAsync(final UpdateServerRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateServerRequest, UpdateServerResult> asyncHandler) {
        final UpdateServerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateServerResult>() {
            @Override
            public UpdateServerResult call() throws Exception {
                UpdateServerResult result = null;

                try {
                    result = executeUpdateServer(finalRequest);
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
    public java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest request) {

        return updateUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserResult> updateUserAsync(final UpdateUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserRequest, UpdateUserResult> asyncHandler) {
        final UpdateUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserResult>() {
            @Override
            public UpdateUserResult call() throws Exception {
                UpdateUserResult result = null;

                try {
                    result = executeUpdateUser(finalRequest);
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
