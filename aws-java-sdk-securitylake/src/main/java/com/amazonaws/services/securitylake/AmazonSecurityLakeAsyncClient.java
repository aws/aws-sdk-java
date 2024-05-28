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
package com.amazonaws.services.securitylake;

import javax.annotation.Generated;

import com.amazonaws.services.securitylake.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Security Lake asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Security Lake is a fully managed security data lake service. You can use Security Lake to automatically
 * centralize security data from cloud, on-premises, and custom sources into a data lake that's stored in your Amazon
 * Web Services account. Amazon Web Services Organizations is an account management service that lets you consolidate
 * multiple Amazon Web Services accounts into an organization that you create and centrally manage. With Organizations,
 * you can create member accounts and invite existing accounts to join your organization. Security Lake helps you
 * analyze security data for a more complete understanding of your security posture across the entire organization. It
 * can also help you improve the protection of your workloads, applications, and data.
 * </p>
 * <p>
 * The data lake is backed by Amazon Simple Storage Service (Amazon S3) buckets, and you retain ownership over your
 * data.
 * </p>
 * <p>
 * Amazon Security Lake integrates with CloudTrail, a service that provides a record of actions taken by a user, role,
 * or an Amazon Web Services service. In Security Lake, CloudTrail captures API calls for Security Lake as events. The
 * calls captured include calls from the Security Lake console and code calls to the Security Lake API operations. If
 * you create a trail, you can enable continuous delivery of CloudTrail events to an Amazon S3 bucket, including events
 * for Security Lake. If you don't configure a trail, you can still view the most recent events in the CloudTrail
 * console in Event history. Using the information collected by CloudTrail you can determine the request that was made
 * to Security Lake, the IP address from which the request was made, who made the request, when it was made, and
 * additional details. To learn more about Security Lake information in CloudTrail, see the <a
 * href="https://docs.aws.amazon.com/security-lake/latest/userguide/securitylake-cloudtrail.html">Amazon Security Lake
 * User Guide</a>.
 * </p>
 * <p>
 * Security Lake automates the collection of security-related log and event data from integrated Amazon Web Services and
 * third-party services. It also helps you manage the lifecycle of data with customizable retention and replication
 * settings. Security Lake converts ingested data into Apache Parquet format and a standard open-source schema called
 * the Open Cybersecurity Schema Framework (OCSF).
 * </p>
 * <p>
 * Other Amazon Web Services and third-party services can subscribe to the data that's stored in Security Lake for
 * incident response and security data analytics.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonSecurityLakeAsyncClient extends AmazonSecurityLakeClient implements AmazonSecurityLakeAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonSecurityLakeAsyncClientBuilder asyncBuilder() {
        return AmazonSecurityLakeAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Security Lake using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonSecurityLakeAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Security Lake using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonSecurityLakeAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateAwsLogSourceResult> createAwsLogSourceAsync(CreateAwsLogSourceRequest request) {

        return createAwsLogSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAwsLogSourceResult> createAwsLogSourceAsync(final CreateAwsLogSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAwsLogSourceRequest, CreateAwsLogSourceResult> asyncHandler) {
        final CreateAwsLogSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAwsLogSourceResult>() {
            @Override
            public CreateAwsLogSourceResult call() throws Exception {
                CreateAwsLogSourceResult result = null;

                try {
                    result = executeCreateAwsLogSource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateCustomLogSourceResult> createCustomLogSourceAsync(CreateCustomLogSourceRequest request) {

        return createCustomLogSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCustomLogSourceResult> createCustomLogSourceAsync(final CreateCustomLogSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCustomLogSourceRequest, CreateCustomLogSourceResult> asyncHandler) {
        final CreateCustomLogSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCustomLogSourceResult>() {
            @Override
            public CreateCustomLogSourceResult call() throws Exception {
                CreateCustomLogSourceResult result = null;

                try {
                    result = executeCreateCustomLogSource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDataLakeResult> createDataLakeAsync(CreateDataLakeRequest request) {

        return createDataLakeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataLakeResult> createDataLakeAsync(final CreateDataLakeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDataLakeRequest, CreateDataLakeResult> asyncHandler) {
        final CreateDataLakeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDataLakeResult>() {
            @Override
            public CreateDataLakeResult call() throws Exception {
                CreateDataLakeResult result = null;

                try {
                    result = executeCreateDataLake(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDataLakeExceptionSubscriptionResult> createDataLakeExceptionSubscriptionAsync(
            CreateDataLakeExceptionSubscriptionRequest request) {

        return createDataLakeExceptionSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataLakeExceptionSubscriptionResult> createDataLakeExceptionSubscriptionAsync(
            final CreateDataLakeExceptionSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDataLakeExceptionSubscriptionRequest, CreateDataLakeExceptionSubscriptionResult> asyncHandler) {
        final CreateDataLakeExceptionSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDataLakeExceptionSubscriptionResult>() {
            @Override
            public CreateDataLakeExceptionSubscriptionResult call() throws Exception {
                CreateDataLakeExceptionSubscriptionResult result = null;

                try {
                    result = executeCreateDataLakeExceptionSubscription(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDataLakeOrganizationConfigurationResult> createDataLakeOrganizationConfigurationAsync(
            CreateDataLakeOrganizationConfigurationRequest request) {

        return createDataLakeOrganizationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataLakeOrganizationConfigurationResult> createDataLakeOrganizationConfigurationAsync(
            final CreateDataLakeOrganizationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDataLakeOrganizationConfigurationRequest, CreateDataLakeOrganizationConfigurationResult> asyncHandler) {
        final CreateDataLakeOrganizationConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDataLakeOrganizationConfigurationResult>() {
            @Override
            public CreateDataLakeOrganizationConfigurationResult call() throws Exception {
                CreateDataLakeOrganizationConfigurationResult result = null;

                try {
                    result = executeCreateDataLakeOrganizationConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateSubscriberResult> createSubscriberAsync(CreateSubscriberRequest request) {

        return createSubscriberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSubscriberResult> createSubscriberAsync(final CreateSubscriberRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSubscriberRequest, CreateSubscriberResult> asyncHandler) {
        final CreateSubscriberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSubscriberResult>() {
            @Override
            public CreateSubscriberResult call() throws Exception {
                CreateSubscriberResult result = null;

                try {
                    result = executeCreateSubscriber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateSubscriberNotificationResult> createSubscriberNotificationAsync(CreateSubscriberNotificationRequest request) {

        return createSubscriberNotificationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSubscriberNotificationResult> createSubscriberNotificationAsync(final CreateSubscriberNotificationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSubscriberNotificationRequest, CreateSubscriberNotificationResult> asyncHandler) {
        final CreateSubscriberNotificationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSubscriberNotificationResult>() {
            @Override
            public CreateSubscriberNotificationResult call() throws Exception {
                CreateSubscriberNotificationResult result = null;

                try {
                    result = executeCreateSubscriberNotification(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAwsLogSourceResult> deleteAwsLogSourceAsync(DeleteAwsLogSourceRequest request) {

        return deleteAwsLogSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAwsLogSourceResult> deleteAwsLogSourceAsync(final DeleteAwsLogSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAwsLogSourceRequest, DeleteAwsLogSourceResult> asyncHandler) {
        final DeleteAwsLogSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAwsLogSourceResult>() {
            @Override
            public DeleteAwsLogSourceResult call() throws Exception {
                DeleteAwsLogSourceResult result = null;

                try {
                    result = executeDeleteAwsLogSource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomLogSourceResult> deleteCustomLogSourceAsync(DeleteCustomLogSourceRequest request) {

        return deleteCustomLogSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomLogSourceResult> deleteCustomLogSourceAsync(final DeleteCustomLogSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCustomLogSourceRequest, DeleteCustomLogSourceResult> asyncHandler) {
        final DeleteCustomLogSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCustomLogSourceResult>() {
            @Override
            public DeleteCustomLogSourceResult call() throws Exception {
                DeleteCustomLogSourceResult result = null;

                try {
                    result = executeDeleteCustomLogSource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDataLakeResult> deleteDataLakeAsync(DeleteDataLakeRequest request) {

        return deleteDataLakeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataLakeResult> deleteDataLakeAsync(final DeleteDataLakeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDataLakeRequest, DeleteDataLakeResult> asyncHandler) {
        final DeleteDataLakeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDataLakeResult>() {
            @Override
            public DeleteDataLakeResult call() throws Exception {
                DeleteDataLakeResult result = null;

                try {
                    result = executeDeleteDataLake(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDataLakeExceptionSubscriptionResult> deleteDataLakeExceptionSubscriptionAsync(
            DeleteDataLakeExceptionSubscriptionRequest request) {

        return deleteDataLakeExceptionSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataLakeExceptionSubscriptionResult> deleteDataLakeExceptionSubscriptionAsync(
            final DeleteDataLakeExceptionSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDataLakeExceptionSubscriptionRequest, DeleteDataLakeExceptionSubscriptionResult> asyncHandler) {
        final DeleteDataLakeExceptionSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDataLakeExceptionSubscriptionResult>() {
            @Override
            public DeleteDataLakeExceptionSubscriptionResult call() throws Exception {
                DeleteDataLakeExceptionSubscriptionResult result = null;

                try {
                    result = executeDeleteDataLakeExceptionSubscription(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDataLakeOrganizationConfigurationResult> deleteDataLakeOrganizationConfigurationAsync(
            DeleteDataLakeOrganizationConfigurationRequest request) {

        return deleteDataLakeOrganizationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataLakeOrganizationConfigurationResult> deleteDataLakeOrganizationConfigurationAsync(
            final DeleteDataLakeOrganizationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDataLakeOrganizationConfigurationRequest, DeleteDataLakeOrganizationConfigurationResult> asyncHandler) {
        final DeleteDataLakeOrganizationConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDataLakeOrganizationConfigurationResult>() {
            @Override
            public DeleteDataLakeOrganizationConfigurationResult call() throws Exception {
                DeleteDataLakeOrganizationConfigurationResult result = null;

                try {
                    result = executeDeleteDataLakeOrganizationConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteSubscriberResult> deleteSubscriberAsync(DeleteSubscriberRequest request) {

        return deleteSubscriberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSubscriberResult> deleteSubscriberAsync(final DeleteSubscriberRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSubscriberRequest, DeleteSubscriberResult> asyncHandler) {
        final DeleteSubscriberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSubscriberResult>() {
            @Override
            public DeleteSubscriberResult call() throws Exception {
                DeleteSubscriberResult result = null;

                try {
                    result = executeDeleteSubscriber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteSubscriberNotificationResult> deleteSubscriberNotificationAsync(DeleteSubscriberNotificationRequest request) {

        return deleteSubscriberNotificationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSubscriberNotificationResult> deleteSubscriberNotificationAsync(final DeleteSubscriberNotificationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSubscriberNotificationRequest, DeleteSubscriberNotificationResult> asyncHandler) {
        final DeleteSubscriberNotificationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSubscriberNotificationResult>() {
            @Override
            public DeleteSubscriberNotificationResult call() throws Exception {
                DeleteSubscriberNotificationResult result = null;

                try {
                    result = executeDeleteSubscriberNotification(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeregisterDataLakeDelegatedAdministratorResult> deregisterDataLakeDelegatedAdministratorAsync(
            DeregisterDataLakeDelegatedAdministratorRequest request) {

        return deregisterDataLakeDelegatedAdministratorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterDataLakeDelegatedAdministratorResult> deregisterDataLakeDelegatedAdministratorAsync(
            final DeregisterDataLakeDelegatedAdministratorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterDataLakeDelegatedAdministratorRequest, DeregisterDataLakeDelegatedAdministratorResult> asyncHandler) {
        final DeregisterDataLakeDelegatedAdministratorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterDataLakeDelegatedAdministratorResult>() {
            @Override
            public DeregisterDataLakeDelegatedAdministratorResult call() throws Exception {
                DeregisterDataLakeDelegatedAdministratorResult result = null;

                try {
                    result = executeDeregisterDataLakeDelegatedAdministrator(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDataLakeExceptionSubscriptionResult> getDataLakeExceptionSubscriptionAsync(
            GetDataLakeExceptionSubscriptionRequest request) {

        return getDataLakeExceptionSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataLakeExceptionSubscriptionResult> getDataLakeExceptionSubscriptionAsync(
            final GetDataLakeExceptionSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDataLakeExceptionSubscriptionRequest, GetDataLakeExceptionSubscriptionResult> asyncHandler) {
        final GetDataLakeExceptionSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDataLakeExceptionSubscriptionResult>() {
            @Override
            public GetDataLakeExceptionSubscriptionResult call() throws Exception {
                GetDataLakeExceptionSubscriptionResult result = null;

                try {
                    result = executeGetDataLakeExceptionSubscription(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDataLakeOrganizationConfigurationResult> getDataLakeOrganizationConfigurationAsync(
            GetDataLakeOrganizationConfigurationRequest request) {

        return getDataLakeOrganizationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataLakeOrganizationConfigurationResult> getDataLakeOrganizationConfigurationAsync(
            final GetDataLakeOrganizationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDataLakeOrganizationConfigurationRequest, GetDataLakeOrganizationConfigurationResult> asyncHandler) {
        final GetDataLakeOrganizationConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDataLakeOrganizationConfigurationResult>() {
            @Override
            public GetDataLakeOrganizationConfigurationResult call() throws Exception {
                GetDataLakeOrganizationConfigurationResult result = null;

                try {
                    result = executeGetDataLakeOrganizationConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDataLakeSourcesResult> getDataLakeSourcesAsync(GetDataLakeSourcesRequest request) {

        return getDataLakeSourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataLakeSourcesResult> getDataLakeSourcesAsync(final GetDataLakeSourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDataLakeSourcesRequest, GetDataLakeSourcesResult> asyncHandler) {
        final GetDataLakeSourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDataLakeSourcesResult>() {
            @Override
            public GetDataLakeSourcesResult call() throws Exception {
                GetDataLakeSourcesResult result = null;

                try {
                    result = executeGetDataLakeSources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSubscriberResult> getSubscriberAsync(GetSubscriberRequest request) {

        return getSubscriberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSubscriberResult> getSubscriberAsync(final GetSubscriberRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSubscriberRequest, GetSubscriberResult> asyncHandler) {
        final GetSubscriberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSubscriberResult>() {
            @Override
            public GetSubscriberResult call() throws Exception {
                GetSubscriberResult result = null;

                try {
                    result = executeGetSubscriber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDataLakeExceptionsResult> listDataLakeExceptionsAsync(ListDataLakeExceptionsRequest request) {

        return listDataLakeExceptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataLakeExceptionsResult> listDataLakeExceptionsAsync(final ListDataLakeExceptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDataLakeExceptionsRequest, ListDataLakeExceptionsResult> asyncHandler) {
        final ListDataLakeExceptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDataLakeExceptionsResult>() {
            @Override
            public ListDataLakeExceptionsResult call() throws Exception {
                ListDataLakeExceptionsResult result = null;

                try {
                    result = executeListDataLakeExceptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDataLakesResult> listDataLakesAsync(ListDataLakesRequest request) {

        return listDataLakesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataLakesResult> listDataLakesAsync(final ListDataLakesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDataLakesRequest, ListDataLakesResult> asyncHandler) {
        final ListDataLakesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDataLakesResult>() {
            @Override
            public ListDataLakesResult call() throws Exception {
                ListDataLakesResult result = null;

                try {
                    result = executeListDataLakes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListLogSourcesResult> listLogSourcesAsync(ListLogSourcesRequest request) {

        return listLogSourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLogSourcesResult> listLogSourcesAsync(final ListLogSourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLogSourcesRequest, ListLogSourcesResult> asyncHandler) {
        final ListLogSourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLogSourcesResult>() {
            @Override
            public ListLogSourcesResult call() throws Exception {
                ListLogSourcesResult result = null;

                try {
                    result = executeListLogSources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSubscribersResult> listSubscribersAsync(ListSubscribersRequest request) {

        return listSubscribersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSubscribersResult> listSubscribersAsync(final ListSubscribersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSubscribersRequest, ListSubscribersResult> asyncHandler) {
        final ListSubscribersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSubscribersResult>() {
            @Override
            public ListSubscribersResult call() throws Exception {
                ListSubscribersResult result = null;

                try {
                    result = executeListSubscribers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<RegisterDataLakeDelegatedAdministratorResult> registerDataLakeDelegatedAdministratorAsync(
            RegisterDataLakeDelegatedAdministratorRequest request) {

        return registerDataLakeDelegatedAdministratorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterDataLakeDelegatedAdministratorResult> registerDataLakeDelegatedAdministratorAsync(
            final RegisterDataLakeDelegatedAdministratorRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterDataLakeDelegatedAdministratorRequest, RegisterDataLakeDelegatedAdministratorResult> asyncHandler) {
        final RegisterDataLakeDelegatedAdministratorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterDataLakeDelegatedAdministratorResult>() {
            @Override
            public RegisterDataLakeDelegatedAdministratorResult call() throws Exception {
                RegisterDataLakeDelegatedAdministratorResult result = null;

                try {
                    result = executeRegisterDataLakeDelegatedAdministrator(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateDataLakeResult> updateDataLakeAsync(UpdateDataLakeRequest request) {

        return updateDataLakeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataLakeResult> updateDataLakeAsync(final UpdateDataLakeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDataLakeRequest, UpdateDataLakeResult> asyncHandler) {
        final UpdateDataLakeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDataLakeResult>() {
            @Override
            public UpdateDataLakeResult call() throws Exception {
                UpdateDataLakeResult result = null;

                try {
                    result = executeUpdateDataLake(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDataLakeExceptionSubscriptionResult> updateDataLakeExceptionSubscriptionAsync(
            UpdateDataLakeExceptionSubscriptionRequest request) {

        return updateDataLakeExceptionSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataLakeExceptionSubscriptionResult> updateDataLakeExceptionSubscriptionAsync(
            final UpdateDataLakeExceptionSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDataLakeExceptionSubscriptionRequest, UpdateDataLakeExceptionSubscriptionResult> asyncHandler) {
        final UpdateDataLakeExceptionSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDataLakeExceptionSubscriptionResult>() {
            @Override
            public UpdateDataLakeExceptionSubscriptionResult call() throws Exception {
                UpdateDataLakeExceptionSubscriptionResult result = null;

                try {
                    result = executeUpdateDataLakeExceptionSubscription(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSubscriberResult> updateSubscriberAsync(UpdateSubscriberRequest request) {

        return updateSubscriberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSubscriberResult> updateSubscriberAsync(final UpdateSubscriberRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSubscriberRequest, UpdateSubscriberResult> asyncHandler) {
        final UpdateSubscriberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSubscriberResult>() {
            @Override
            public UpdateSubscriberResult call() throws Exception {
                UpdateSubscriberResult result = null;

                try {
                    result = executeUpdateSubscriber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSubscriberNotificationResult> updateSubscriberNotificationAsync(UpdateSubscriberNotificationRequest request) {

        return updateSubscriberNotificationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSubscriberNotificationResult> updateSubscriberNotificationAsync(final UpdateSubscriberNotificationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSubscriberNotificationRequest, UpdateSubscriberNotificationResult> asyncHandler) {
        final UpdateSubscriberNotificationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSubscriberNotificationResult>() {
            @Override
            public UpdateSubscriberNotificationResult call() throws Exception {
                UpdateSubscriberNotificationResult result = null;

                try {
                    result = executeUpdateSubscriberNotification(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
