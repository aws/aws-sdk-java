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
package com.amazonaws.services.acmpca;

import javax.annotation.Generated;

import com.amazonaws.services.acmpca.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing ACM-PCA asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * You can use the ACM PCA API to create a private certificate authority (CA). You must first call the
 * <a>CreateCertificateAuthority</a> operation. If successful, the operation returns an Amazon Resource Name (ARN) for
 * your private CA. Use this ARN as input to the <a>GetCertificateAuthorityCsr</a> operation to retrieve the certificate
 * signing request (CSR) for your private CA certificate. Sign the CSR using the root or an intermediate CA in your
 * on-premises PKI hierarchy, and call the <a>ImportCertificateAuthorityCertificate</a> to import your signed private CA
 * certificate into ACM PCA.
 * </p>
 * <p>
 * Use your private CA to issue and revoke certificates. These are private certificates that identify and secure client
 * computers, servers, applications, services, devices, and users over SSLS/TLS connections within your organization.
 * Call the <a>IssueCertificate</a> operation to issue a certificate. Call the <a>RevokeCertificate</a> operation to
 * revoke a certificate.
 * </p>
 * <note>
 * <p>
 * Certificates issued by your private CA can be trusted only within your organization, not publicly.
 * </p>
 * </note>
 * <p>
 * Your private CA can optionally create a certificate revocation list (CRL) to track the certificates you revoke. To
 * create a CRL, you must specify a <a>RevocationConfiguration</a> object when you call the
 * <a>CreateCertificateAuthority</a> operation. ACM PCA writes the CRL to an S3 bucket that you specify. You must
 * specify a bucket policy that grants ACM PCA write permission.
 * </p>
 * <p>
 * You can also call the <a>CreateCertificateAuthorityAuditReport</a> to create an optional audit report, which
 * enumerates all of the issued, valid, expired, and revoked certificates from the CA.
 * </p>
 * <note>
 * <p>
 * Each ACM PCA API operation has a throttling limit which determines the number of times the operation can be called
 * per second. For more information, see <a
 * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaLimits.html#PcaLimits-api">API Rate Limits in ACM
 * PCA</a> in the ACM PCA user guide.
 * </p>
 * </note>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSACMPCAAsyncClient extends AWSACMPCAClient implements AWSACMPCAAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSACMPCAAsyncClientBuilder asyncBuilder() {
        return AWSACMPCAAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on ACM-PCA using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSACMPCAAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateCertificateAuthorityResult> createCertificateAuthorityAsync(CreateCertificateAuthorityRequest request) {

        return createCertificateAuthorityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCertificateAuthorityResult> createCertificateAuthorityAsync(final CreateCertificateAuthorityRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCertificateAuthorityRequest, CreateCertificateAuthorityResult> asyncHandler) {
        final CreateCertificateAuthorityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCertificateAuthorityResult>() {
            @Override
            public CreateCertificateAuthorityResult call() throws Exception {
                CreateCertificateAuthorityResult result = null;

                try {
                    result = executeCreateCertificateAuthority(finalRequest);
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
    public java.util.concurrent.Future<CreateCertificateAuthorityAuditReportResult> createCertificateAuthorityAuditReportAsync(
            CreateCertificateAuthorityAuditReportRequest request) {

        return createCertificateAuthorityAuditReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCertificateAuthorityAuditReportResult> createCertificateAuthorityAuditReportAsync(
            final CreateCertificateAuthorityAuditReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCertificateAuthorityAuditReportRequest, CreateCertificateAuthorityAuditReportResult> asyncHandler) {
        final CreateCertificateAuthorityAuditReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCertificateAuthorityAuditReportResult>() {
            @Override
            public CreateCertificateAuthorityAuditReportResult call() throws Exception {
                CreateCertificateAuthorityAuditReportResult result = null;

                try {
                    result = executeCreateCertificateAuthorityAuditReport(finalRequest);
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
    public java.util.concurrent.Future<CreatePermissionResult> createPermissionAsync(CreatePermissionRequest request) {

        return createPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePermissionResult> createPermissionAsync(final CreatePermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePermissionRequest, CreatePermissionResult> asyncHandler) {
        final CreatePermissionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePermissionResult>() {
            @Override
            public CreatePermissionResult call() throws Exception {
                CreatePermissionResult result = null;

                try {
                    result = executeCreatePermission(finalRequest);
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
    public java.util.concurrent.Future<DeleteCertificateAuthorityResult> deleteCertificateAuthorityAsync(DeleteCertificateAuthorityRequest request) {

        return deleteCertificateAuthorityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCertificateAuthorityResult> deleteCertificateAuthorityAsync(final DeleteCertificateAuthorityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCertificateAuthorityRequest, DeleteCertificateAuthorityResult> asyncHandler) {
        final DeleteCertificateAuthorityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCertificateAuthorityResult>() {
            @Override
            public DeleteCertificateAuthorityResult call() throws Exception {
                DeleteCertificateAuthorityResult result = null;

                try {
                    result = executeDeleteCertificateAuthority(finalRequest);
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
    public java.util.concurrent.Future<DeletePermissionResult> deletePermissionAsync(DeletePermissionRequest request) {

        return deletePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePermissionResult> deletePermissionAsync(final DeletePermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePermissionRequest, DeletePermissionResult> asyncHandler) {
        final DeletePermissionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePermissionResult>() {
            @Override
            public DeletePermissionResult call() throws Exception {
                DeletePermissionResult result = null;

                try {
                    result = executeDeletePermission(finalRequest);
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
    public java.util.concurrent.Future<DescribeCertificateAuthorityResult> describeCertificateAuthorityAsync(DescribeCertificateAuthorityRequest request) {

        return describeCertificateAuthorityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCertificateAuthorityResult> describeCertificateAuthorityAsync(final DescribeCertificateAuthorityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCertificateAuthorityRequest, DescribeCertificateAuthorityResult> asyncHandler) {
        final DescribeCertificateAuthorityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCertificateAuthorityResult>() {
            @Override
            public DescribeCertificateAuthorityResult call() throws Exception {
                DescribeCertificateAuthorityResult result = null;

                try {
                    result = executeDescribeCertificateAuthority(finalRequest);
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
    public java.util.concurrent.Future<DescribeCertificateAuthorityAuditReportResult> describeCertificateAuthorityAuditReportAsync(
            DescribeCertificateAuthorityAuditReportRequest request) {

        return describeCertificateAuthorityAuditReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCertificateAuthorityAuditReportResult> describeCertificateAuthorityAuditReportAsync(
            final DescribeCertificateAuthorityAuditReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCertificateAuthorityAuditReportRequest, DescribeCertificateAuthorityAuditReportResult> asyncHandler) {
        final DescribeCertificateAuthorityAuditReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCertificateAuthorityAuditReportResult>() {
            @Override
            public DescribeCertificateAuthorityAuditReportResult call() throws Exception {
                DescribeCertificateAuthorityAuditReportResult result = null;

                try {
                    result = executeDescribeCertificateAuthorityAuditReport(finalRequest);
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
    public java.util.concurrent.Future<GetCertificateResult> getCertificateAsync(GetCertificateRequest request) {

        return getCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCertificateResult> getCertificateAsync(final GetCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCertificateRequest, GetCertificateResult> asyncHandler) {
        final GetCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCertificateResult>() {
            @Override
            public GetCertificateResult call() throws Exception {
                GetCertificateResult result = null;

                try {
                    result = executeGetCertificate(finalRequest);
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
    public java.util.concurrent.Future<GetCertificateAuthorityCertificateResult> getCertificateAuthorityCertificateAsync(
            GetCertificateAuthorityCertificateRequest request) {

        return getCertificateAuthorityCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCertificateAuthorityCertificateResult> getCertificateAuthorityCertificateAsync(
            final GetCertificateAuthorityCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCertificateAuthorityCertificateRequest, GetCertificateAuthorityCertificateResult> asyncHandler) {
        final GetCertificateAuthorityCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCertificateAuthorityCertificateResult>() {
            @Override
            public GetCertificateAuthorityCertificateResult call() throws Exception {
                GetCertificateAuthorityCertificateResult result = null;

                try {
                    result = executeGetCertificateAuthorityCertificate(finalRequest);
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
    public java.util.concurrent.Future<GetCertificateAuthorityCsrResult> getCertificateAuthorityCsrAsync(GetCertificateAuthorityCsrRequest request) {

        return getCertificateAuthorityCsrAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCertificateAuthorityCsrResult> getCertificateAuthorityCsrAsync(final GetCertificateAuthorityCsrRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCertificateAuthorityCsrRequest, GetCertificateAuthorityCsrResult> asyncHandler) {
        final GetCertificateAuthorityCsrRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCertificateAuthorityCsrResult>() {
            @Override
            public GetCertificateAuthorityCsrResult call() throws Exception {
                GetCertificateAuthorityCsrResult result = null;

                try {
                    result = executeGetCertificateAuthorityCsr(finalRequest);
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
    public java.util.concurrent.Future<ImportCertificateAuthorityCertificateResult> importCertificateAuthorityCertificateAsync(
            ImportCertificateAuthorityCertificateRequest request) {

        return importCertificateAuthorityCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportCertificateAuthorityCertificateResult> importCertificateAuthorityCertificateAsync(
            final ImportCertificateAuthorityCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportCertificateAuthorityCertificateRequest, ImportCertificateAuthorityCertificateResult> asyncHandler) {
        final ImportCertificateAuthorityCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportCertificateAuthorityCertificateResult>() {
            @Override
            public ImportCertificateAuthorityCertificateResult call() throws Exception {
                ImportCertificateAuthorityCertificateResult result = null;

                try {
                    result = executeImportCertificateAuthorityCertificate(finalRequest);
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
    public java.util.concurrent.Future<IssueCertificateResult> issueCertificateAsync(IssueCertificateRequest request) {

        return issueCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<IssueCertificateResult> issueCertificateAsync(final IssueCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<IssueCertificateRequest, IssueCertificateResult> asyncHandler) {
        final IssueCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<IssueCertificateResult>() {
            @Override
            public IssueCertificateResult call() throws Exception {
                IssueCertificateResult result = null;

                try {
                    result = executeIssueCertificate(finalRequest);
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
    public java.util.concurrent.Future<ListCertificateAuthoritiesResult> listCertificateAuthoritiesAsync(ListCertificateAuthoritiesRequest request) {

        return listCertificateAuthoritiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCertificateAuthoritiesResult> listCertificateAuthoritiesAsync(final ListCertificateAuthoritiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCertificateAuthoritiesRequest, ListCertificateAuthoritiesResult> asyncHandler) {
        final ListCertificateAuthoritiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCertificateAuthoritiesResult>() {
            @Override
            public ListCertificateAuthoritiesResult call() throws Exception {
                ListCertificateAuthoritiesResult result = null;

                try {
                    result = executeListCertificateAuthorities(finalRequest);
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
    public java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(ListPermissionsRequest request) {

        return listPermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(final ListPermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPermissionsRequest, ListPermissionsResult> asyncHandler) {
        final ListPermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPermissionsResult>() {
            @Override
            public ListPermissionsResult call() throws Exception {
                ListPermissionsResult result = null;

                try {
                    result = executeListPermissions(finalRequest);
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
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest request) {

        return listTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(final ListTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler) {
        final ListTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsResult>() {
            @Override
            public ListTagsResult call() throws Exception {
                ListTagsResult result = null;

                try {
                    result = executeListTags(finalRequest);
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
    public java.util.concurrent.Future<RestoreCertificateAuthorityResult> restoreCertificateAuthorityAsync(RestoreCertificateAuthorityRequest request) {

        return restoreCertificateAuthorityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreCertificateAuthorityResult> restoreCertificateAuthorityAsync(final RestoreCertificateAuthorityRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreCertificateAuthorityRequest, RestoreCertificateAuthorityResult> asyncHandler) {
        final RestoreCertificateAuthorityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RestoreCertificateAuthorityResult>() {
            @Override
            public RestoreCertificateAuthorityResult call() throws Exception {
                RestoreCertificateAuthorityResult result = null;

                try {
                    result = executeRestoreCertificateAuthority(finalRequest);
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
    public java.util.concurrent.Future<RevokeCertificateResult> revokeCertificateAsync(RevokeCertificateRequest request) {

        return revokeCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RevokeCertificateResult> revokeCertificateAsync(final RevokeCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<RevokeCertificateRequest, RevokeCertificateResult> asyncHandler) {
        final RevokeCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RevokeCertificateResult>() {
            @Override
            public RevokeCertificateResult call() throws Exception {
                RevokeCertificateResult result = null;

                try {
                    result = executeRevokeCertificate(finalRequest);
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
    public java.util.concurrent.Future<TagCertificateAuthorityResult> tagCertificateAuthorityAsync(TagCertificateAuthorityRequest request) {

        return tagCertificateAuthorityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagCertificateAuthorityResult> tagCertificateAuthorityAsync(final TagCertificateAuthorityRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagCertificateAuthorityRequest, TagCertificateAuthorityResult> asyncHandler) {
        final TagCertificateAuthorityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagCertificateAuthorityResult>() {
            @Override
            public TagCertificateAuthorityResult call() throws Exception {
                TagCertificateAuthorityResult result = null;

                try {
                    result = executeTagCertificateAuthority(finalRequest);
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
    public java.util.concurrent.Future<UntagCertificateAuthorityResult> untagCertificateAuthorityAsync(UntagCertificateAuthorityRequest request) {

        return untagCertificateAuthorityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagCertificateAuthorityResult> untagCertificateAuthorityAsync(final UntagCertificateAuthorityRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagCertificateAuthorityRequest, UntagCertificateAuthorityResult> asyncHandler) {
        final UntagCertificateAuthorityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagCertificateAuthorityResult>() {
            @Override
            public UntagCertificateAuthorityResult call() throws Exception {
                UntagCertificateAuthorityResult result = null;

                try {
                    result = executeUntagCertificateAuthority(finalRequest);
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
    public java.util.concurrent.Future<UpdateCertificateAuthorityResult> updateCertificateAuthorityAsync(UpdateCertificateAuthorityRequest request) {

        return updateCertificateAuthorityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCertificateAuthorityResult> updateCertificateAuthorityAsync(final UpdateCertificateAuthorityRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCertificateAuthorityRequest, UpdateCertificateAuthorityResult> asyncHandler) {
        final UpdateCertificateAuthorityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCertificateAuthorityResult>() {
            @Override
            public UpdateCertificateAuthorityResult call() throws Exception {
                UpdateCertificateAuthorityResult result = null;

                try {
                    result = executeUpdateCertificateAuthority(finalRequest);
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
