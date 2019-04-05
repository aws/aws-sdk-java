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
package com.amazonaws.services.pinpointemail;

import javax.annotation.Generated;

import com.amazonaws.services.pinpointemail.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Pinpoint Email asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Pinpoint Email Service</fullname>
 * <p>
 * This document contains reference information for the <a href="https://aws.amazon.com/pinpoint">Amazon Pinpoint</a>
 * Email API, version 1.0. This document is best used in conjunction with the <a
 * href="https://docs.aws.amazon.com/pinpoint/latest/developerguide/welcome.html">Amazon Pinpoint Developer Guide</a>.
 * </p>
 * <p>
 * The Amazon Pinpoint Email API is available in the US East (N. Virginia), US West (Oregon), EU (Frankfurt), and EU
 * (Ireland) Regions at the following endpoints:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>US East (N. Virginia)</b>: <code>email.us-east-1.amazonaws.com</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>US West (Oregon)</b>: <code>email.us-west-2.amazonaws.com</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>EU (Frankfurt)</b>: <code>email.eu-central-1.amazonaws.com</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>EU (Ireland)</b>: <code>email.eu-west-1.amazonaws.com</code>
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonPinpointEmailAsyncClient extends AmazonPinpointEmailClient implements AmazonPinpointEmailAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonPinpointEmailAsyncClientBuilder asyncBuilder() {
        return AmazonPinpointEmailAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Pinpoint Email using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonPinpointEmailAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateConfigurationSetResult> createConfigurationSetAsync(CreateConfigurationSetRequest request) {

        return createConfigurationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationSetResult> createConfigurationSetAsync(final CreateConfigurationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConfigurationSetRequest, CreateConfigurationSetResult> asyncHandler) {
        final CreateConfigurationSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConfigurationSetResult>() {
            @Override
            public CreateConfigurationSetResult call() throws Exception {
                CreateConfigurationSetResult result = null;

                try {
                    result = executeCreateConfigurationSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationSetEventDestinationResult> createConfigurationSetEventDestinationAsync(
            CreateConfigurationSetEventDestinationRequest request) {

        return createConfigurationSetEventDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationSetEventDestinationResult> createConfigurationSetEventDestinationAsync(
            final CreateConfigurationSetEventDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConfigurationSetEventDestinationRequest, CreateConfigurationSetEventDestinationResult> asyncHandler) {
        final CreateConfigurationSetEventDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConfigurationSetEventDestinationResult>() {
            @Override
            public CreateConfigurationSetEventDestinationResult call() throws Exception {
                CreateConfigurationSetEventDestinationResult result = null;

                try {
                    result = executeCreateConfigurationSetEventDestination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDedicatedIpPoolResult> createDedicatedIpPoolAsync(CreateDedicatedIpPoolRequest request) {

        return createDedicatedIpPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDedicatedIpPoolResult> createDedicatedIpPoolAsync(final CreateDedicatedIpPoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDedicatedIpPoolRequest, CreateDedicatedIpPoolResult> asyncHandler) {
        final CreateDedicatedIpPoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDedicatedIpPoolResult>() {
            @Override
            public CreateDedicatedIpPoolResult call() throws Exception {
                CreateDedicatedIpPoolResult result = null;

                try {
                    result = executeCreateDedicatedIpPool(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDeliverabilityTestReportResult> createDeliverabilityTestReportAsync(CreateDeliverabilityTestReportRequest request) {

        return createDeliverabilityTestReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeliverabilityTestReportResult> createDeliverabilityTestReportAsync(
            final CreateDeliverabilityTestReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeliverabilityTestReportRequest, CreateDeliverabilityTestReportResult> asyncHandler) {
        final CreateDeliverabilityTestReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDeliverabilityTestReportResult>() {
            @Override
            public CreateDeliverabilityTestReportResult call() throws Exception {
                CreateDeliverabilityTestReportResult result = null;

                try {
                    result = executeCreateDeliverabilityTestReport(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateEmailIdentityResult> createEmailIdentityAsync(CreateEmailIdentityRequest request) {

        return createEmailIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEmailIdentityResult> createEmailIdentityAsync(final CreateEmailIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEmailIdentityRequest, CreateEmailIdentityResult> asyncHandler) {
        final CreateEmailIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEmailIdentityResult>() {
            @Override
            public CreateEmailIdentityResult call() throws Exception {
                CreateEmailIdentityResult result = null;

                try {
                    result = executeCreateEmailIdentity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationSetResult> deleteConfigurationSetAsync(DeleteConfigurationSetRequest request) {

        return deleteConfigurationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationSetResult> deleteConfigurationSetAsync(final DeleteConfigurationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfigurationSetRequest, DeleteConfigurationSetResult> asyncHandler) {
        final DeleteConfigurationSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConfigurationSetResult>() {
            @Override
            public DeleteConfigurationSetResult call() throws Exception {
                DeleteConfigurationSetResult result = null;

                try {
                    result = executeDeleteConfigurationSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationSetEventDestinationResult> deleteConfigurationSetEventDestinationAsync(
            DeleteConfigurationSetEventDestinationRequest request) {

        return deleteConfigurationSetEventDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationSetEventDestinationResult> deleteConfigurationSetEventDestinationAsync(
            final DeleteConfigurationSetEventDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfigurationSetEventDestinationRequest, DeleteConfigurationSetEventDestinationResult> asyncHandler) {
        final DeleteConfigurationSetEventDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConfigurationSetEventDestinationResult>() {
            @Override
            public DeleteConfigurationSetEventDestinationResult call() throws Exception {
                DeleteConfigurationSetEventDestinationResult result = null;

                try {
                    result = executeDeleteConfigurationSetEventDestination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDedicatedIpPoolResult> deleteDedicatedIpPoolAsync(DeleteDedicatedIpPoolRequest request) {

        return deleteDedicatedIpPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDedicatedIpPoolResult> deleteDedicatedIpPoolAsync(final DeleteDedicatedIpPoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDedicatedIpPoolRequest, DeleteDedicatedIpPoolResult> asyncHandler) {
        final DeleteDedicatedIpPoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDedicatedIpPoolResult>() {
            @Override
            public DeleteDedicatedIpPoolResult call() throws Exception {
                DeleteDedicatedIpPoolResult result = null;

                try {
                    result = executeDeleteDedicatedIpPool(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteEmailIdentityResult> deleteEmailIdentityAsync(DeleteEmailIdentityRequest request) {

        return deleteEmailIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEmailIdentityResult> deleteEmailIdentityAsync(final DeleteEmailIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEmailIdentityRequest, DeleteEmailIdentityResult> asyncHandler) {
        final DeleteEmailIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEmailIdentityResult>() {
            @Override
            public DeleteEmailIdentityResult call() throws Exception {
                DeleteEmailIdentityResult result = null;

                try {
                    result = executeDeleteEmailIdentity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAccountResult> getAccountAsync(GetAccountRequest request) {

        return getAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountResult> getAccountAsync(final GetAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccountRequest, GetAccountResult> asyncHandler) {
        final GetAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAccountResult>() {
            @Override
            public GetAccountResult call() throws Exception {
                GetAccountResult result = null;

                try {
                    result = executeGetAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetBlacklistReportsResult> getBlacklistReportsAsync(GetBlacklistReportsRequest request) {

        return getBlacklistReportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBlacklistReportsResult> getBlacklistReportsAsync(final GetBlacklistReportsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBlacklistReportsRequest, GetBlacklistReportsResult> asyncHandler) {
        final GetBlacklistReportsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBlacklistReportsResult>() {
            @Override
            public GetBlacklistReportsResult call() throws Exception {
                GetBlacklistReportsResult result = null;

                try {
                    result = executeGetBlacklistReports(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetConfigurationSetResult> getConfigurationSetAsync(GetConfigurationSetRequest request) {

        return getConfigurationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConfigurationSetResult> getConfigurationSetAsync(final GetConfigurationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConfigurationSetRequest, GetConfigurationSetResult> asyncHandler) {
        final GetConfigurationSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConfigurationSetResult>() {
            @Override
            public GetConfigurationSetResult call() throws Exception {
                GetConfigurationSetResult result = null;

                try {
                    result = executeGetConfigurationSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetConfigurationSetEventDestinationsResult> getConfigurationSetEventDestinationsAsync(
            GetConfigurationSetEventDestinationsRequest request) {

        return getConfigurationSetEventDestinationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConfigurationSetEventDestinationsResult> getConfigurationSetEventDestinationsAsync(
            final GetConfigurationSetEventDestinationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConfigurationSetEventDestinationsRequest, GetConfigurationSetEventDestinationsResult> asyncHandler) {
        final GetConfigurationSetEventDestinationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConfigurationSetEventDestinationsResult>() {
            @Override
            public GetConfigurationSetEventDestinationsResult call() throws Exception {
                GetConfigurationSetEventDestinationsResult result = null;

                try {
                    result = executeGetConfigurationSetEventDestinations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDedicatedIpResult> getDedicatedIpAsync(GetDedicatedIpRequest request) {

        return getDedicatedIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDedicatedIpResult> getDedicatedIpAsync(final GetDedicatedIpRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDedicatedIpRequest, GetDedicatedIpResult> asyncHandler) {
        final GetDedicatedIpRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDedicatedIpResult>() {
            @Override
            public GetDedicatedIpResult call() throws Exception {
                GetDedicatedIpResult result = null;

                try {
                    result = executeGetDedicatedIp(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDedicatedIpsResult> getDedicatedIpsAsync(GetDedicatedIpsRequest request) {

        return getDedicatedIpsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDedicatedIpsResult> getDedicatedIpsAsync(final GetDedicatedIpsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDedicatedIpsRequest, GetDedicatedIpsResult> asyncHandler) {
        final GetDedicatedIpsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDedicatedIpsResult>() {
            @Override
            public GetDedicatedIpsResult call() throws Exception {
                GetDedicatedIpsResult result = null;

                try {
                    result = executeGetDedicatedIps(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDeliverabilityDashboardOptionsResult> getDeliverabilityDashboardOptionsAsync(
            GetDeliverabilityDashboardOptionsRequest request) {

        return getDeliverabilityDashboardOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeliverabilityDashboardOptionsResult> getDeliverabilityDashboardOptionsAsync(
            final GetDeliverabilityDashboardOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeliverabilityDashboardOptionsRequest, GetDeliverabilityDashboardOptionsResult> asyncHandler) {
        final GetDeliverabilityDashboardOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeliverabilityDashboardOptionsResult>() {
            @Override
            public GetDeliverabilityDashboardOptionsResult call() throws Exception {
                GetDeliverabilityDashboardOptionsResult result = null;

                try {
                    result = executeGetDeliverabilityDashboardOptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDeliverabilityTestReportResult> getDeliverabilityTestReportAsync(GetDeliverabilityTestReportRequest request) {

        return getDeliverabilityTestReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeliverabilityTestReportResult> getDeliverabilityTestReportAsync(final GetDeliverabilityTestReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeliverabilityTestReportRequest, GetDeliverabilityTestReportResult> asyncHandler) {
        final GetDeliverabilityTestReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeliverabilityTestReportResult>() {
            @Override
            public GetDeliverabilityTestReportResult call() throws Exception {
                GetDeliverabilityTestReportResult result = null;

                try {
                    result = executeGetDeliverabilityTestReport(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDomainStatisticsReportResult> getDomainStatisticsReportAsync(GetDomainStatisticsReportRequest request) {

        return getDomainStatisticsReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainStatisticsReportResult> getDomainStatisticsReportAsync(final GetDomainStatisticsReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDomainStatisticsReportRequest, GetDomainStatisticsReportResult> asyncHandler) {
        final GetDomainStatisticsReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDomainStatisticsReportResult>() {
            @Override
            public GetDomainStatisticsReportResult call() throws Exception {
                GetDomainStatisticsReportResult result = null;

                try {
                    result = executeGetDomainStatisticsReport(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetEmailIdentityResult> getEmailIdentityAsync(GetEmailIdentityRequest request) {

        return getEmailIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEmailIdentityResult> getEmailIdentityAsync(final GetEmailIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEmailIdentityRequest, GetEmailIdentityResult> asyncHandler) {
        final GetEmailIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEmailIdentityResult>() {
            @Override
            public GetEmailIdentityResult call() throws Exception {
                GetEmailIdentityResult result = null;

                try {
                    result = executeGetEmailIdentity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationSetsResult> listConfigurationSetsAsync(ListConfigurationSetsRequest request) {

        return listConfigurationSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationSetsResult> listConfigurationSetsAsync(final ListConfigurationSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConfigurationSetsRequest, ListConfigurationSetsResult> asyncHandler) {
        final ListConfigurationSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConfigurationSetsResult>() {
            @Override
            public ListConfigurationSetsResult call() throws Exception {
                ListConfigurationSetsResult result = null;

                try {
                    result = executeListConfigurationSets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDedicatedIpPoolsResult> listDedicatedIpPoolsAsync(ListDedicatedIpPoolsRequest request) {

        return listDedicatedIpPoolsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDedicatedIpPoolsResult> listDedicatedIpPoolsAsync(final ListDedicatedIpPoolsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDedicatedIpPoolsRequest, ListDedicatedIpPoolsResult> asyncHandler) {
        final ListDedicatedIpPoolsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDedicatedIpPoolsResult>() {
            @Override
            public ListDedicatedIpPoolsResult call() throws Exception {
                ListDedicatedIpPoolsResult result = null;

                try {
                    result = executeListDedicatedIpPools(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDeliverabilityTestReportsResult> listDeliverabilityTestReportsAsync(ListDeliverabilityTestReportsRequest request) {

        return listDeliverabilityTestReportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeliverabilityTestReportsResult> listDeliverabilityTestReportsAsync(
            final ListDeliverabilityTestReportsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeliverabilityTestReportsRequest, ListDeliverabilityTestReportsResult> asyncHandler) {
        final ListDeliverabilityTestReportsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDeliverabilityTestReportsResult>() {
            @Override
            public ListDeliverabilityTestReportsResult call() throws Exception {
                ListDeliverabilityTestReportsResult result = null;

                try {
                    result = executeListDeliverabilityTestReports(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListEmailIdentitiesResult> listEmailIdentitiesAsync(ListEmailIdentitiesRequest request) {

        return listEmailIdentitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEmailIdentitiesResult> listEmailIdentitiesAsync(final ListEmailIdentitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEmailIdentitiesRequest, ListEmailIdentitiesResult> asyncHandler) {
        final ListEmailIdentitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEmailIdentitiesResult>() {
            @Override
            public ListEmailIdentitiesResult call() throws Exception {
                ListEmailIdentitiesResult result = null;

                try {
                    result = executeListEmailIdentities(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<PutAccountDedicatedIpWarmupAttributesResult> putAccountDedicatedIpWarmupAttributesAsync(
            PutAccountDedicatedIpWarmupAttributesRequest request) {

        return putAccountDedicatedIpWarmupAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAccountDedicatedIpWarmupAttributesResult> putAccountDedicatedIpWarmupAttributesAsync(
            final PutAccountDedicatedIpWarmupAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutAccountDedicatedIpWarmupAttributesRequest, PutAccountDedicatedIpWarmupAttributesResult> asyncHandler) {
        final PutAccountDedicatedIpWarmupAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutAccountDedicatedIpWarmupAttributesResult>() {
            @Override
            public PutAccountDedicatedIpWarmupAttributesResult call() throws Exception {
                PutAccountDedicatedIpWarmupAttributesResult result = null;

                try {
                    result = executePutAccountDedicatedIpWarmupAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutAccountSendingAttributesResult> putAccountSendingAttributesAsync(PutAccountSendingAttributesRequest request) {

        return putAccountSendingAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAccountSendingAttributesResult> putAccountSendingAttributesAsync(final PutAccountSendingAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutAccountSendingAttributesRequest, PutAccountSendingAttributesResult> asyncHandler) {
        final PutAccountSendingAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutAccountSendingAttributesResult>() {
            @Override
            public PutAccountSendingAttributesResult call() throws Exception {
                PutAccountSendingAttributesResult result = null;

                try {
                    result = executePutAccountSendingAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutConfigurationSetDeliveryOptionsResult> putConfigurationSetDeliveryOptionsAsync(
            PutConfigurationSetDeliveryOptionsRequest request) {

        return putConfigurationSetDeliveryOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutConfigurationSetDeliveryOptionsResult> putConfigurationSetDeliveryOptionsAsync(
            final PutConfigurationSetDeliveryOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutConfigurationSetDeliveryOptionsRequest, PutConfigurationSetDeliveryOptionsResult> asyncHandler) {
        final PutConfigurationSetDeliveryOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutConfigurationSetDeliveryOptionsResult>() {
            @Override
            public PutConfigurationSetDeliveryOptionsResult call() throws Exception {
                PutConfigurationSetDeliveryOptionsResult result = null;

                try {
                    result = executePutConfigurationSetDeliveryOptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutConfigurationSetReputationOptionsResult> putConfigurationSetReputationOptionsAsync(
            PutConfigurationSetReputationOptionsRequest request) {

        return putConfigurationSetReputationOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutConfigurationSetReputationOptionsResult> putConfigurationSetReputationOptionsAsync(
            final PutConfigurationSetReputationOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutConfigurationSetReputationOptionsRequest, PutConfigurationSetReputationOptionsResult> asyncHandler) {
        final PutConfigurationSetReputationOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutConfigurationSetReputationOptionsResult>() {
            @Override
            public PutConfigurationSetReputationOptionsResult call() throws Exception {
                PutConfigurationSetReputationOptionsResult result = null;

                try {
                    result = executePutConfigurationSetReputationOptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutConfigurationSetSendingOptionsResult> putConfigurationSetSendingOptionsAsync(
            PutConfigurationSetSendingOptionsRequest request) {

        return putConfigurationSetSendingOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutConfigurationSetSendingOptionsResult> putConfigurationSetSendingOptionsAsync(
            final PutConfigurationSetSendingOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutConfigurationSetSendingOptionsRequest, PutConfigurationSetSendingOptionsResult> asyncHandler) {
        final PutConfigurationSetSendingOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutConfigurationSetSendingOptionsResult>() {
            @Override
            public PutConfigurationSetSendingOptionsResult call() throws Exception {
                PutConfigurationSetSendingOptionsResult result = null;

                try {
                    result = executePutConfigurationSetSendingOptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutConfigurationSetTrackingOptionsResult> putConfigurationSetTrackingOptionsAsync(
            PutConfigurationSetTrackingOptionsRequest request) {

        return putConfigurationSetTrackingOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutConfigurationSetTrackingOptionsResult> putConfigurationSetTrackingOptionsAsync(
            final PutConfigurationSetTrackingOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutConfigurationSetTrackingOptionsRequest, PutConfigurationSetTrackingOptionsResult> asyncHandler) {
        final PutConfigurationSetTrackingOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutConfigurationSetTrackingOptionsResult>() {
            @Override
            public PutConfigurationSetTrackingOptionsResult call() throws Exception {
                PutConfigurationSetTrackingOptionsResult result = null;

                try {
                    result = executePutConfigurationSetTrackingOptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutDedicatedIpInPoolResult> putDedicatedIpInPoolAsync(PutDedicatedIpInPoolRequest request) {

        return putDedicatedIpInPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDedicatedIpInPoolResult> putDedicatedIpInPoolAsync(final PutDedicatedIpInPoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutDedicatedIpInPoolRequest, PutDedicatedIpInPoolResult> asyncHandler) {
        final PutDedicatedIpInPoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutDedicatedIpInPoolResult>() {
            @Override
            public PutDedicatedIpInPoolResult call() throws Exception {
                PutDedicatedIpInPoolResult result = null;

                try {
                    result = executePutDedicatedIpInPool(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutDedicatedIpWarmupAttributesResult> putDedicatedIpWarmupAttributesAsync(PutDedicatedIpWarmupAttributesRequest request) {

        return putDedicatedIpWarmupAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDedicatedIpWarmupAttributesResult> putDedicatedIpWarmupAttributesAsync(
            final PutDedicatedIpWarmupAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutDedicatedIpWarmupAttributesRequest, PutDedicatedIpWarmupAttributesResult> asyncHandler) {
        final PutDedicatedIpWarmupAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutDedicatedIpWarmupAttributesResult>() {
            @Override
            public PutDedicatedIpWarmupAttributesResult call() throws Exception {
                PutDedicatedIpWarmupAttributesResult result = null;

                try {
                    result = executePutDedicatedIpWarmupAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutDeliverabilityDashboardOptionResult> putDeliverabilityDashboardOptionAsync(
            PutDeliverabilityDashboardOptionRequest request) {

        return putDeliverabilityDashboardOptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDeliverabilityDashboardOptionResult> putDeliverabilityDashboardOptionAsync(
            final PutDeliverabilityDashboardOptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutDeliverabilityDashboardOptionRequest, PutDeliverabilityDashboardOptionResult> asyncHandler) {
        final PutDeliverabilityDashboardOptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutDeliverabilityDashboardOptionResult>() {
            @Override
            public PutDeliverabilityDashboardOptionResult call() throws Exception {
                PutDeliverabilityDashboardOptionResult result = null;

                try {
                    result = executePutDeliverabilityDashboardOption(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutEmailIdentityDkimAttributesResult> putEmailIdentityDkimAttributesAsync(PutEmailIdentityDkimAttributesRequest request) {

        return putEmailIdentityDkimAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEmailIdentityDkimAttributesResult> putEmailIdentityDkimAttributesAsync(
            final PutEmailIdentityDkimAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutEmailIdentityDkimAttributesRequest, PutEmailIdentityDkimAttributesResult> asyncHandler) {
        final PutEmailIdentityDkimAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutEmailIdentityDkimAttributesResult>() {
            @Override
            public PutEmailIdentityDkimAttributesResult call() throws Exception {
                PutEmailIdentityDkimAttributesResult result = null;

                try {
                    result = executePutEmailIdentityDkimAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutEmailIdentityFeedbackAttributesResult> putEmailIdentityFeedbackAttributesAsync(
            PutEmailIdentityFeedbackAttributesRequest request) {

        return putEmailIdentityFeedbackAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEmailIdentityFeedbackAttributesResult> putEmailIdentityFeedbackAttributesAsync(
            final PutEmailIdentityFeedbackAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutEmailIdentityFeedbackAttributesRequest, PutEmailIdentityFeedbackAttributesResult> asyncHandler) {
        final PutEmailIdentityFeedbackAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutEmailIdentityFeedbackAttributesResult>() {
            @Override
            public PutEmailIdentityFeedbackAttributesResult call() throws Exception {
                PutEmailIdentityFeedbackAttributesResult result = null;

                try {
                    result = executePutEmailIdentityFeedbackAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutEmailIdentityMailFromAttributesResult> putEmailIdentityMailFromAttributesAsync(
            PutEmailIdentityMailFromAttributesRequest request) {

        return putEmailIdentityMailFromAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEmailIdentityMailFromAttributesResult> putEmailIdentityMailFromAttributesAsync(
            final PutEmailIdentityMailFromAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutEmailIdentityMailFromAttributesRequest, PutEmailIdentityMailFromAttributesResult> asyncHandler) {
        final PutEmailIdentityMailFromAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutEmailIdentityMailFromAttributesResult>() {
            @Override
            public PutEmailIdentityMailFromAttributesResult call() throws Exception {
                PutEmailIdentityMailFromAttributesResult result = null;

                try {
                    result = executePutEmailIdentityMailFromAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SendEmailResult> sendEmailAsync(SendEmailRequest request) {

        return sendEmailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendEmailResult> sendEmailAsync(final SendEmailRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendEmailRequest, SendEmailResult> asyncHandler) {
        final SendEmailRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendEmailResult>() {
            @Override
            public SendEmailResult call() throws Exception {
                SendEmailResult result = null;

                try {
                    result = executeSendEmail(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateConfigurationSetEventDestinationResult> updateConfigurationSetEventDestinationAsync(
            UpdateConfigurationSetEventDestinationRequest request) {

        return updateConfigurationSetEventDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationSetEventDestinationResult> updateConfigurationSetEventDestinationAsync(
            final UpdateConfigurationSetEventDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConfigurationSetEventDestinationRequest, UpdateConfigurationSetEventDestinationResult> asyncHandler) {
        final UpdateConfigurationSetEventDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConfigurationSetEventDestinationResult>() {
            @Override
            public UpdateConfigurationSetEventDestinationResult call() throws Exception {
                UpdateConfigurationSetEventDestinationResult result = null;

                try {
                    result = executeUpdateConfigurationSetEventDestination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
