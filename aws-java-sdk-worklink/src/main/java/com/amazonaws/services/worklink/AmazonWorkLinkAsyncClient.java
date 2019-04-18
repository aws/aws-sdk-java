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
package com.amazonaws.services.worklink;

import javax.annotation.Generated;

import com.amazonaws.services.worklink.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing WorkLink asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon WorkLink is a cloud-based service that provides secure access to internal websites and web apps from iOS
 * phones. In a single step, your users, such as employees, can access internal websites as efficiently as they access
 * any other public website. They enter a URL in their web browser, or choose a link to an internal website in an email.
 * Amazon WorkLink authenticates the user's access and securely renders authorized internal web content in a secure
 * rendering service in the AWS cloud. Amazon WorkLink doesn't download or store any internal web content on mobile
 * devices.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonWorkLinkAsyncClient extends AmazonWorkLinkClient implements AmazonWorkLinkAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonWorkLinkAsyncClientBuilder asyncBuilder() {
        return AmazonWorkLinkAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on WorkLink using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonWorkLinkAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AssociateDomainResult> associateDomainAsync(AssociateDomainRequest request) {

        return associateDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateDomainResult> associateDomainAsync(final AssociateDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateDomainRequest, AssociateDomainResult> asyncHandler) {
        final AssociateDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateDomainResult>() {
            @Override
            public AssociateDomainResult call() throws Exception {
                AssociateDomainResult result = null;

                try {
                    result = executeAssociateDomain(finalRequest);
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
    public java.util.concurrent.Future<AssociateWebsiteCertificateAuthorityResult> associateWebsiteCertificateAuthorityAsync(
            AssociateWebsiteCertificateAuthorityRequest request) {

        return associateWebsiteCertificateAuthorityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateWebsiteCertificateAuthorityResult> associateWebsiteCertificateAuthorityAsync(
            final AssociateWebsiteCertificateAuthorityRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateWebsiteCertificateAuthorityRequest, AssociateWebsiteCertificateAuthorityResult> asyncHandler) {
        final AssociateWebsiteCertificateAuthorityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateWebsiteCertificateAuthorityResult>() {
            @Override
            public AssociateWebsiteCertificateAuthorityResult call() throws Exception {
                AssociateWebsiteCertificateAuthorityResult result = null;

                try {
                    result = executeAssociateWebsiteCertificateAuthority(finalRequest);
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
    public java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest request) {

        return createFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFleetResult> createFleetAsync(final CreateFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFleetRequest, CreateFleetResult> asyncHandler) {
        final CreateFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFleetResult>() {
            @Override
            public CreateFleetResult call() throws Exception {
                CreateFleetResult result = null;

                try {
                    result = executeCreateFleet(finalRequest);
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
    public java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(DeleteFleetRequest request) {

        return deleteFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(final DeleteFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFleetRequest, DeleteFleetResult> asyncHandler) {
        final DeleteFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFleetResult>() {
            @Override
            public DeleteFleetResult call() throws Exception {
                DeleteFleetResult result = null;

                try {
                    result = executeDeleteFleet(finalRequest);
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
    public java.util.concurrent.Future<DescribeAuditStreamConfigurationResult> describeAuditStreamConfigurationAsync(
            DescribeAuditStreamConfigurationRequest request) {

        return describeAuditStreamConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAuditStreamConfigurationResult> describeAuditStreamConfigurationAsync(
            final DescribeAuditStreamConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAuditStreamConfigurationRequest, DescribeAuditStreamConfigurationResult> asyncHandler) {
        final DescribeAuditStreamConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAuditStreamConfigurationResult>() {
            @Override
            public DescribeAuditStreamConfigurationResult call() throws Exception {
                DescribeAuditStreamConfigurationResult result = null;

                try {
                    result = executeDescribeAuditStreamConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DescribeCompanyNetworkConfigurationResult> describeCompanyNetworkConfigurationAsync(
            DescribeCompanyNetworkConfigurationRequest request) {

        return describeCompanyNetworkConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCompanyNetworkConfigurationResult> describeCompanyNetworkConfigurationAsync(
            final DescribeCompanyNetworkConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCompanyNetworkConfigurationRequest, DescribeCompanyNetworkConfigurationResult> asyncHandler) {
        final DescribeCompanyNetworkConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCompanyNetworkConfigurationResult>() {
            @Override
            public DescribeCompanyNetworkConfigurationResult call() throws Exception {
                DescribeCompanyNetworkConfigurationResult result = null;

                try {
                    result = executeDescribeCompanyNetworkConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DescribeDeviceResult> describeDeviceAsync(DescribeDeviceRequest request) {

        return describeDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeviceResult> describeDeviceAsync(final DescribeDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDeviceRequest, DescribeDeviceResult> asyncHandler) {
        final DescribeDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDeviceResult>() {
            @Override
            public DescribeDeviceResult call() throws Exception {
                DescribeDeviceResult result = null;

                try {
                    result = executeDescribeDevice(finalRequest);
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
    public java.util.concurrent.Future<DescribeDevicePolicyConfigurationResult> describeDevicePolicyConfigurationAsync(
            DescribeDevicePolicyConfigurationRequest request) {

        return describeDevicePolicyConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDevicePolicyConfigurationResult> describeDevicePolicyConfigurationAsync(
            final DescribeDevicePolicyConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDevicePolicyConfigurationRequest, DescribeDevicePolicyConfigurationResult> asyncHandler) {
        final DescribeDevicePolicyConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDevicePolicyConfigurationResult>() {
            @Override
            public DescribeDevicePolicyConfigurationResult call() throws Exception {
                DescribeDevicePolicyConfigurationResult result = null;

                try {
                    result = executeDescribeDevicePolicyConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(DescribeDomainRequest request) {

        return describeDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(final DescribeDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDomainRequest, DescribeDomainResult> asyncHandler) {
        final DescribeDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDomainResult>() {
            @Override
            public DescribeDomainResult call() throws Exception {
                DescribeDomainResult result = null;

                try {
                    result = executeDescribeDomain(finalRequest);
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
    public java.util.concurrent.Future<DescribeFleetMetadataResult> describeFleetMetadataAsync(DescribeFleetMetadataRequest request) {

        return describeFleetMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetMetadataResult> describeFleetMetadataAsync(final DescribeFleetMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFleetMetadataRequest, DescribeFleetMetadataResult> asyncHandler) {
        final DescribeFleetMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFleetMetadataResult>() {
            @Override
            public DescribeFleetMetadataResult call() throws Exception {
                DescribeFleetMetadataResult result = null;

                try {
                    result = executeDescribeFleetMetadata(finalRequest);
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
    public java.util.concurrent.Future<DescribeIdentityProviderConfigurationResult> describeIdentityProviderConfigurationAsync(
            DescribeIdentityProviderConfigurationRequest request) {

        return describeIdentityProviderConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeIdentityProviderConfigurationResult> describeIdentityProviderConfigurationAsync(
            final DescribeIdentityProviderConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeIdentityProviderConfigurationRequest, DescribeIdentityProviderConfigurationResult> asyncHandler) {
        final DescribeIdentityProviderConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeIdentityProviderConfigurationResult>() {
            @Override
            public DescribeIdentityProviderConfigurationResult call() throws Exception {
                DescribeIdentityProviderConfigurationResult result = null;

                try {
                    result = executeDescribeIdentityProviderConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DescribeWebsiteCertificateAuthorityResult> describeWebsiteCertificateAuthorityAsync(
            DescribeWebsiteCertificateAuthorityRequest request) {

        return describeWebsiteCertificateAuthorityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWebsiteCertificateAuthorityResult> describeWebsiteCertificateAuthorityAsync(
            final DescribeWebsiteCertificateAuthorityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWebsiteCertificateAuthorityRequest, DescribeWebsiteCertificateAuthorityResult> asyncHandler) {
        final DescribeWebsiteCertificateAuthorityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeWebsiteCertificateAuthorityResult>() {
            @Override
            public DescribeWebsiteCertificateAuthorityResult call() throws Exception {
                DescribeWebsiteCertificateAuthorityResult result = null;

                try {
                    result = executeDescribeWebsiteCertificateAuthority(finalRequest);
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
    public java.util.concurrent.Future<DisassociateDomainResult> disassociateDomainAsync(DisassociateDomainRequest request) {

        return disassociateDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateDomainResult> disassociateDomainAsync(final DisassociateDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateDomainRequest, DisassociateDomainResult> asyncHandler) {
        final DisassociateDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateDomainResult>() {
            @Override
            public DisassociateDomainResult call() throws Exception {
                DisassociateDomainResult result = null;

                try {
                    result = executeDisassociateDomain(finalRequest);
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
    public java.util.concurrent.Future<DisassociateWebsiteCertificateAuthorityResult> disassociateWebsiteCertificateAuthorityAsync(
            DisassociateWebsiteCertificateAuthorityRequest request) {

        return disassociateWebsiteCertificateAuthorityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateWebsiteCertificateAuthorityResult> disassociateWebsiteCertificateAuthorityAsync(
            final DisassociateWebsiteCertificateAuthorityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateWebsiteCertificateAuthorityRequest, DisassociateWebsiteCertificateAuthorityResult> asyncHandler) {
        final DisassociateWebsiteCertificateAuthorityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateWebsiteCertificateAuthorityResult>() {
            @Override
            public DisassociateWebsiteCertificateAuthorityResult call() throws Exception {
                DisassociateWebsiteCertificateAuthorityResult result = null;

                try {
                    result = executeDisassociateWebsiteCertificateAuthority(finalRequest);
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
    public java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest request) {

        return listDevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(final ListDevicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDevicesRequest, ListDevicesResult> asyncHandler) {
        final ListDevicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDevicesResult>() {
            @Override
            public ListDevicesResult call() throws Exception {
                ListDevicesResult result = null;

                try {
                    result = executeListDevices(finalRequest);
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
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest request) {

        return listDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(final ListDomainsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler) {
        final ListDomainsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDomainsResult>() {
            @Override
            public ListDomainsResult call() throws Exception {
                ListDomainsResult result = null;

                try {
                    result = executeListDomains(finalRequest);
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
    public java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(ListFleetsRequest request) {

        return listFleetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(final ListFleetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFleetsRequest, ListFleetsResult> asyncHandler) {
        final ListFleetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFleetsResult>() {
            @Override
            public ListFleetsResult call() throws Exception {
                ListFleetsResult result = null;

                try {
                    result = executeListFleets(finalRequest);
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
    public java.util.concurrent.Future<ListWebsiteCertificateAuthoritiesResult> listWebsiteCertificateAuthoritiesAsync(
            ListWebsiteCertificateAuthoritiesRequest request) {

        return listWebsiteCertificateAuthoritiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWebsiteCertificateAuthoritiesResult> listWebsiteCertificateAuthoritiesAsync(
            final ListWebsiteCertificateAuthoritiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWebsiteCertificateAuthoritiesRequest, ListWebsiteCertificateAuthoritiesResult> asyncHandler) {
        final ListWebsiteCertificateAuthoritiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWebsiteCertificateAuthoritiesResult>() {
            @Override
            public ListWebsiteCertificateAuthoritiesResult call() throws Exception {
                ListWebsiteCertificateAuthoritiesResult result = null;

                try {
                    result = executeListWebsiteCertificateAuthorities(finalRequest);
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
    public java.util.concurrent.Future<RestoreDomainAccessResult> restoreDomainAccessAsync(RestoreDomainAccessRequest request) {

        return restoreDomainAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreDomainAccessResult> restoreDomainAccessAsync(final RestoreDomainAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreDomainAccessRequest, RestoreDomainAccessResult> asyncHandler) {
        final RestoreDomainAccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RestoreDomainAccessResult>() {
            @Override
            public RestoreDomainAccessResult call() throws Exception {
                RestoreDomainAccessResult result = null;

                try {
                    result = executeRestoreDomainAccess(finalRequest);
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
    public java.util.concurrent.Future<RevokeDomainAccessResult> revokeDomainAccessAsync(RevokeDomainAccessRequest request) {

        return revokeDomainAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RevokeDomainAccessResult> revokeDomainAccessAsync(final RevokeDomainAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<RevokeDomainAccessRequest, RevokeDomainAccessResult> asyncHandler) {
        final RevokeDomainAccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RevokeDomainAccessResult>() {
            @Override
            public RevokeDomainAccessResult call() throws Exception {
                RevokeDomainAccessResult result = null;

                try {
                    result = executeRevokeDomainAccess(finalRequest);
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
    public java.util.concurrent.Future<SignOutUserResult> signOutUserAsync(SignOutUserRequest request) {

        return signOutUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SignOutUserResult> signOutUserAsync(final SignOutUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<SignOutUserRequest, SignOutUserResult> asyncHandler) {
        final SignOutUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SignOutUserResult>() {
            @Override
            public SignOutUserResult call() throws Exception {
                SignOutUserResult result = null;

                try {
                    result = executeSignOutUser(finalRequest);
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
    public java.util.concurrent.Future<UpdateAuditStreamConfigurationResult> updateAuditStreamConfigurationAsync(UpdateAuditStreamConfigurationRequest request) {

        return updateAuditStreamConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAuditStreamConfigurationResult> updateAuditStreamConfigurationAsync(
            final UpdateAuditStreamConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAuditStreamConfigurationRequest, UpdateAuditStreamConfigurationResult> asyncHandler) {
        final UpdateAuditStreamConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAuditStreamConfigurationResult>() {
            @Override
            public UpdateAuditStreamConfigurationResult call() throws Exception {
                UpdateAuditStreamConfigurationResult result = null;

                try {
                    result = executeUpdateAuditStreamConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateCompanyNetworkConfigurationResult> updateCompanyNetworkConfigurationAsync(
            UpdateCompanyNetworkConfigurationRequest request) {

        return updateCompanyNetworkConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCompanyNetworkConfigurationResult> updateCompanyNetworkConfigurationAsync(
            final UpdateCompanyNetworkConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCompanyNetworkConfigurationRequest, UpdateCompanyNetworkConfigurationResult> asyncHandler) {
        final UpdateCompanyNetworkConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCompanyNetworkConfigurationResult>() {
            @Override
            public UpdateCompanyNetworkConfigurationResult call() throws Exception {
                UpdateCompanyNetworkConfigurationResult result = null;

                try {
                    result = executeUpdateCompanyNetworkConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateDevicePolicyConfigurationResult> updateDevicePolicyConfigurationAsync(
            UpdateDevicePolicyConfigurationRequest request) {

        return updateDevicePolicyConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDevicePolicyConfigurationResult> updateDevicePolicyConfigurationAsync(
            final UpdateDevicePolicyConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDevicePolicyConfigurationRequest, UpdateDevicePolicyConfigurationResult> asyncHandler) {
        final UpdateDevicePolicyConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDevicePolicyConfigurationResult>() {
            @Override
            public UpdateDevicePolicyConfigurationResult call() throws Exception {
                UpdateDevicePolicyConfigurationResult result = null;

                try {
                    result = executeUpdateDevicePolicyConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateDomainMetadataResult> updateDomainMetadataAsync(UpdateDomainMetadataRequest request) {

        return updateDomainMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainMetadataResult> updateDomainMetadataAsync(final UpdateDomainMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDomainMetadataRequest, UpdateDomainMetadataResult> asyncHandler) {
        final UpdateDomainMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDomainMetadataResult>() {
            @Override
            public UpdateDomainMetadataResult call() throws Exception {
                UpdateDomainMetadataResult result = null;

                try {
                    result = executeUpdateDomainMetadata(finalRequest);
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
    public java.util.concurrent.Future<UpdateFleetMetadataResult> updateFleetMetadataAsync(UpdateFleetMetadataRequest request) {

        return updateFleetMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFleetMetadataResult> updateFleetMetadataAsync(final UpdateFleetMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFleetMetadataRequest, UpdateFleetMetadataResult> asyncHandler) {
        final UpdateFleetMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFleetMetadataResult>() {
            @Override
            public UpdateFleetMetadataResult call() throws Exception {
                UpdateFleetMetadataResult result = null;

                try {
                    result = executeUpdateFleetMetadata(finalRequest);
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
    public java.util.concurrent.Future<UpdateIdentityProviderConfigurationResult> updateIdentityProviderConfigurationAsync(
            UpdateIdentityProviderConfigurationRequest request) {

        return updateIdentityProviderConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIdentityProviderConfigurationResult> updateIdentityProviderConfigurationAsync(
            final UpdateIdentityProviderConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIdentityProviderConfigurationRequest, UpdateIdentityProviderConfigurationResult> asyncHandler) {
        final UpdateIdentityProviderConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateIdentityProviderConfigurationResult>() {
            @Override
            public UpdateIdentityProviderConfigurationResult call() throws Exception {
                UpdateIdentityProviderConfigurationResult result = null;

                try {
                    result = executeUpdateIdentityProviderConfiguration(finalRequest);
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
