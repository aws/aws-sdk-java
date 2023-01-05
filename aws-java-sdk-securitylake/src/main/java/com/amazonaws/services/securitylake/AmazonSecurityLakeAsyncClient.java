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
 * <note>
 * <p>
 * Amazon Security Lake is in preview release. Your use of the Security Lake preview is subject to Section 2 of the <a
 * href="http://aws.amazon.com/service-terms/">Amazon Web Services Service Terms</a>("Betas and Previews").
 * </p>
 * </note>
 * <p>
 * Amazon Security Lake is a fully managed security data lake service. You can use Security Lake to automatically
 * centralize security data from cloud, on-premises, and custom sources into a data lake that's stored in your Amazon
 * Web Servicesaccount. Amazon Web Services Organizations is an account management service that lets you consolidate
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
 * or an Amazon Web Services service in Security Lake CloudTrail captures API calls for Security Lake as events. The
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
    public java.util.concurrent.Future<CreateDatalakeResult> createDatalakeAsync(CreateDatalakeRequest request) {

        return createDatalakeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatalakeResult> createDatalakeAsync(final CreateDatalakeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDatalakeRequest, CreateDatalakeResult> asyncHandler) {
        final CreateDatalakeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDatalakeResult>() {
            @Override
            public CreateDatalakeResult call() throws Exception {
                CreateDatalakeResult result = null;

                try {
                    result = executeCreateDatalake(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDatalakeAutoEnableResult> createDatalakeAutoEnableAsync(CreateDatalakeAutoEnableRequest request) {

        return createDatalakeAutoEnableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatalakeAutoEnableResult> createDatalakeAutoEnableAsync(final CreateDatalakeAutoEnableRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDatalakeAutoEnableRequest, CreateDatalakeAutoEnableResult> asyncHandler) {
        final CreateDatalakeAutoEnableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDatalakeAutoEnableResult>() {
            @Override
            public CreateDatalakeAutoEnableResult call() throws Exception {
                CreateDatalakeAutoEnableResult result = null;

                try {
                    result = executeCreateDatalakeAutoEnable(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDatalakeDelegatedAdminResult> createDatalakeDelegatedAdminAsync(CreateDatalakeDelegatedAdminRequest request) {

        return createDatalakeDelegatedAdminAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatalakeDelegatedAdminResult> createDatalakeDelegatedAdminAsync(final CreateDatalakeDelegatedAdminRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDatalakeDelegatedAdminRequest, CreateDatalakeDelegatedAdminResult> asyncHandler) {
        final CreateDatalakeDelegatedAdminRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDatalakeDelegatedAdminResult>() {
            @Override
            public CreateDatalakeDelegatedAdminResult call() throws Exception {
                CreateDatalakeDelegatedAdminResult result = null;

                try {
                    result = executeCreateDatalakeDelegatedAdmin(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDatalakeExceptionsSubscriptionResult> createDatalakeExceptionsSubscriptionAsync(
            CreateDatalakeExceptionsSubscriptionRequest request) {

        return createDatalakeExceptionsSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatalakeExceptionsSubscriptionResult> createDatalakeExceptionsSubscriptionAsync(
            final CreateDatalakeExceptionsSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDatalakeExceptionsSubscriptionRequest, CreateDatalakeExceptionsSubscriptionResult> asyncHandler) {
        final CreateDatalakeExceptionsSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDatalakeExceptionsSubscriptionResult>() {
            @Override
            public CreateDatalakeExceptionsSubscriptionResult call() throws Exception {
                CreateDatalakeExceptionsSubscriptionResult result = null;

                try {
                    result = executeCreateDatalakeExceptionsSubscription(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<CreateSubscriptionNotificationConfigurationResult> createSubscriptionNotificationConfigurationAsync(
            CreateSubscriptionNotificationConfigurationRequest request) {

        return createSubscriptionNotificationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSubscriptionNotificationConfigurationResult> createSubscriptionNotificationConfigurationAsync(
            final CreateSubscriptionNotificationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSubscriptionNotificationConfigurationRequest, CreateSubscriptionNotificationConfigurationResult> asyncHandler) {
        final CreateSubscriptionNotificationConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSubscriptionNotificationConfigurationResult>() {
            @Override
            public CreateSubscriptionNotificationConfigurationResult call() throws Exception {
                CreateSubscriptionNotificationConfigurationResult result = null;

                try {
                    result = executeCreateSubscriptionNotificationConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteDatalakeResult> deleteDatalakeAsync(DeleteDatalakeRequest request) {

        return deleteDatalakeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatalakeResult> deleteDatalakeAsync(final DeleteDatalakeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDatalakeRequest, DeleteDatalakeResult> asyncHandler) {
        final DeleteDatalakeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDatalakeResult>() {
            @Override
            public DeleteDatalakeResult call() throws Exception {
                DeleteDatalakeResult result = null;

                try {
                    result = executeDeleteDatalake(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDatalakeAutoEnableResult> deleteDatalakeAutoEnableAsync(DeleteDatalakeAutoEnableRequest request) {

        return deleteDatalakeAutoEnableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatalakeAutoEnableResult> deleteDatalakeAutoEnableAsync(final DeleteDatalakeAutoEnableRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDatalakeAutoEnableRequest, DeleteDatalakeAutoEnableResult> asyncHandler) {
        final DeleteDatalakeAutoEnableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDatalakeAutoEnableResult>() {
            @Override
            public DeleteDatalakeAutoEnableResult call() throws Exception {
                DeleteDatalakeAutoEnableResult result = null;

                try {
                    result = executeDeleteDatalakeAutoEnable(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDatalakeDelegatedAdminResult> deleteDatalakeDelegatedAdminAsync(DeleteDatalakeDelegatedAdminRequest request) {

        return deleteDatalakeDelegatedAdminAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatalakeDelegatedAdminResult> deleteDatalakeDelegatedAdminAsync(final DeleteDatalakeDelegatedAdminRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDatalakeDelegatedAdminRequest, DeleteDatalakeDelegatedAdminResult> asyncHandler) {
        final DeleteDatalakeDelegatedAdminRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDatalakeDelegatedAdminResult>() {
            @Override
            public DeleteDatalakeDelegatedAdminResult call() throws Exception {
                DeleteDatalakeDelegatedAdminResult result = null;

                try {
                    result = executeDeleteDatalakeDelegatedAdmin(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDatalakeExceptionsSubscriptionResult> deleteDatalakeExceptionsSubscriptionAsync(
            DeleteDatalakeExceptionsSubscriptionRequest request) {

        return deleteDatalakeExceptionsSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatalakeExceptionsSubscriptionResult> deleteDatalakeExceptionsSubscriptionAsync(
            final DeleteDatalakeExceptionsSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDatalakeExceptionsSubscriptionRequest, DeleteDatalakeExceptionsSubscriptionResult> asyncHandler) {
        final DeleteDatalakeExceptionsSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDatalakeExceptionsSubscriptionResult>() {
            @Override
            public DeleteDatalakeExceptionsSubscriptionResult call() throws Exception {
                DeleteDatalakeExceptionsSubscriptionResult result = null;

                try {
                    result = executeDeleteDatalakeExceptionsSubscription(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteSubscriptionNotificationConfigurationResult> deleteSubscriptionNotificationConfigurationAsync(
            DeleteSubscriptionNotificationConfigurationRequest request) {

        return deleteSubscriptionNotificationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSubscriptionNotificationConfigurationResult> deleteSubscriptionNotificationConfigurationAsync(
            final DeleteSubscriptionNotificationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSubscriptionNotificationConfigurationRequest, DeleteSubscriptionNotificationConfigurationResult> asyncHandler) {
        final DeleteSubscriptionNotificationConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSubscriptionNotificationConfigurationResult>() {
            @Override
            public DeleteSubscriptionNotificationConfigurationResult call() throws Exception {
                DeleteSubscriptionNotificationConfigurationResult result = null;

                try {
                    result = executeDeleteSubscriptionNotificationConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDatalakeResult> getDatalakeAsync(GetDatalakeRequest request) {

        return getDatalakeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDatalakeResult> getDatalakeAsync(final GetDatalakeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDatalakeRequest, GetDatalakeResult> asyncHandler) {
        final GetDatalakeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDatalakeResult>() {
            @Override
            public GetDatalakeResult call() throws Exception {
                GetDatalakeResult result = null;

                try {
                    result = executeGetDatalake(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDatalakeAutoEnableResult> getDatalakeAutoEnableAsync(GetDatalakeAutoEnableRequest request) {

        return getDatalakeAutoEnableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDatalakeAutoEnableResult> getDatalakeAutoEnableAsync(final GetDatalakeAutoEnableRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDatalakeAutoEnableRequest, GetDatalakeAutoEnableResult> asyncHandler) {
        final GetDatalakeAutoEnableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDatalakeAutoEnableResult>() {
            @Override
            public GetDatalakeAutoEnableResult call() throws Exception {
                GetDatalakeAutoEnableResult result = null;

                try {
                    result = executeGetDatalakeAutoEnable(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDatalakeExceptionsExpiryResult> getDatalakeExceptionsExpiryAsync(GetDatalakeExceptionsExpiryRequest request) {

        return getDatalakeExceptionsExpiryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDatalakeExceptionsExpiryResult> getDatalakeExceptionsExpiryAsync(final GetDatalakeExceptionsExpiryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDatalakeExceptionsExpiryRequest, GetDatalakeExceptionsExpiryResult> asyncHandler) {
        final GetDatalakeExceptionsExpiryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDatalakeExceptionsExpiryResult>() {
            @Override
            public GetDatalakeExceptionsExpiryResult call() throws Exception {
                GetDatalakeExceptionsExpiryResult result = null;

                try {
                    result = executeGetDatalakeExceptionsExpiry(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDatalakeExceptionsSubscriptionResult> getDatalakeExceptionsSubscriptionAsync(
            GetDatalakeExceptionsSubscriptionRequest request) {

        return getDatalakeExceptionsSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDatalakeExceptionsSubscriptionResult> getDatalakeExceptionsSubscriptionAsync(
            final GetDatalakeExceptionsSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDatalakeExceptionsSubscriptionRequest, GetDatalakeExceptionsSubscriptionResult> asyncHandler) {
        final GetDatalakeExceptionsSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDatalakeExceptionsSubscriptionResult>() {
            @Override
            public GetDatalakeExceptionsSubscriptionResult call() throws Exception {
                GetDatalakeExceptionsSubscriptionResult result = null;

                try {
                    result = executeGetDatalakeExceptionsSubscription(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDatalakeStatusResult> getDatalakeStatusAsync(GetDatalakeStatusRequest request) {

        return getDatalakeStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDatalakeStatusResult> getDatalakeStatusAsync(final GetDatalakeStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDatalakeStatusRequest, GetDatalakeStatusResult> asyncHandler) {
        final GetDatalakeStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDatalakeStatusResult>() {
            @Override
            public GetDatalakeStatusResult call() throws Exception {
                GetDatalakeStatusResult result = null;

                try {
                    result = executeGetDatalakeStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListDatalakeExceptionsResult> listDatalakeExceptionsAsync(ListDatalakeExceptionsRequest request) {

        return listDatalakeExceptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatalakeExceptionsResult> listDatalakeExceptionsAsync(final ListDatalakeExceptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDatalakeExceptionsRequest, ListDatalakeExceptionsResult> asyncHandler) {
        final ListDatalakeExceptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDatalakeExceptionsResult>() {
            @Override
            public ListDatalakeExceptionsResult call() throws Exception {
                ListDatalakeExceptionsResult result = null;

                try {
                    result = executeListDatalakeExceptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateDatalakeResult> updateDatalakeAsync(UpdateDatalakeRequest request) {

        return updateDatalakeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatalakeResult> updateDatalakeAsync(final UpdateDatalakeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDatalakeRequest, UpdateDatalakeResult> asyncHandler) {
        final UpdateDatalakeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDatalakeResult>() {
            @Override
            public UpdateDatalakeResult call() throws Exception {
                UpdateDatalakeResult result = null;

                try {
                    result = executeUpdateDatalake(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDatalakeExceptionsExpiryResult> updateDatalakeExceptionsExpiryAsync(UpdateDatalakeExceptionsExpiryRequest request) {

        return updateDatalakeExceptionsExpiryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatalakeExceptionsExpiryResult> updateDatalakeExceptionsExpiryAsync(
            final UpdateDatalakeExceptionsExpiryRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDatalakeExceptionsExpiryRequest, UpdateDatalakeExceptionsExpiryResult> asyncHandler) {
        final UpdateDatalakeExceptionsExpiryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDatalakeExceptionsExpiryResult>() {
            @Override
            public UpdateDatalakeExceptionsExpiryResult call() throws Exception {
                UpdateDatalakeExceptionsExpiryResult result = null;

                try {
                    result = executeUpdateDatalakeExceptionsExpiry(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDatalakeExceptionsSubscriptionResult> updateDatalakeExceptionsSubscriptionAsync(
            UpdateDatalakeExceptionsSubscriptionRequest request) {

        return updateDatalakeExceptionsSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatalakeExceptionsSubscriptionResult> updateDatalakeExceptionsSubscriptionAsync(
            final UpdateDatalakeExceptionsSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDatalakeExceptionsSubscriptionRequest, UpdateDatalakeExceptionsSubscriptionResult> asyncHandler) {
        final UpdateDatalakeExceptionsSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDatalakeExceptionsSubscriptionResult>() {
            @Override
            public UpdateDatalakeExceptionsSubscriptionResult call() throws Exception {
                UpdateDatalakeExceptionsSubscriptionResult result = null;

                try {
                    result = executeUpdateDatalakeExceptionsSubscription(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateSubscriptionNotificationConfigurationResult> updateSubscriptionNotificationConfigurationAsync(
            UpdateSubscriptionNotificationConfigurationRequest request) {

        return updateSubscriptionNotificationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSubscriptionNotificationConfigurationResult> updateSubscriptionNotificationConfigurationAsync(
            final UpdateSubscriptionNotificationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSubscriptionNotificationConfigurationRequest, UpdateSubscriptionNotificationConfigurationResult> asyncHandler) {
        final UpdateSubscriptionNotificationConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSubscriptionNotificationConfigurationResult>() {
            @Override
            public UpdateSubscriptionNotificationConfigurationResult call() throws Exception {
                UpdateSubscriptionNotificationConfigurationResult result = null;

                try {
                    result = executeUpdateSubscriptionNotificationConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
