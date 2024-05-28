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
package com.amazonaws.services.mailmanager;

import javax.annotation.Generated;

import com.amazonaws.services.mailmanager.model.*;

/**
 * Interface for accessing MailManager asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mailmanager.AbstractAWSMailManagerAsync} instead.
 * </p>
 * <p>
 * <p>
 * <fullname>AWS SES Mail Manager API</fullname>
 * <p>
 * <a href="http://aws.amazon.com/ses">AWS SES Mail Manager API</a> contains operations and data types that comprise the
 * Mail Manager feature of Amazon Simple Email Service.
 * </p>
 * <p>
 * Mail Manager is a set of Amazon SES email gateway features designed to help you strengthen your organization's email
 * infrastructure, simplify email workflow management, and streamline email compliance control. To learn more, see the
 * <a href="https://docs.aws.amazon.com/ses/latest/dg/eb.html">Mail Manager chapter</a> in the Amazon SES Developer
 * Guide.
 * </p>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMailManagerAsync extends AWSMailManager {

    /**
     * <p>
     * Creates an Add On instance for the subscription indicated in the request. The resulting Amazon Resource Name
     * (ARN) can be used in a conditional statement for a rule set or traffic policy.
     * </p>
     * 
     * @param createAddonInstanceRequest
     * @return A Java Future containing the result of the CreateAddonInstance operation returned by the service.
     * @sample AWSMailManagerAsync.CreateAddonInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateAddonInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAddonInstanceResult> createAddonInstanceAsync(CreateAddonInstanceRequest createAddonInstanceRequest);

    /**
     * <p>
     * Creates an Add On instance for the subscription indicated in the request. The resulting Amazon Resource Name
     * (ARN) can be used in a conditional statement for a rule set or traffic policy.
     * </p>
     * 
     * @param createAddonInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAddonInstance operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.CreateAddonInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateAddonInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAddonInstanceResult> createAddonInstanceAsync(CreateAddonInstanceRequest createAddonInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAddonInstanceRequest, CreateAddonInstanceResult> asyncHandler);

    /**
     * <p>
     * Creates a subscription for an Add On representing the acceptance of its terms of use and additional pricing. The
     * subscription can then be used to create an instance for use in rule sets or traffic policies.
     * </p>
     * 
     * @param createAddonSubscriptionRequest
     * @return A Java Future containing the result of the CreateAddonSubscription operation returned by the service.
     * @sample AWSMailManagerAsync.CreateAddonSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateAddonSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAddonSubscriptionResult> createAddonSubscriptionAsync(CreateAddonSubscriptionRequest createAddonSubscriptionRequest);

    /**
     * <p>
     * Creates a subscription for an Add On representing the acceptance of its terms of use and additional pricing. The
     * subscription can then be used to create an instance for use in rule sets or traffic policies.
     * </p>
     * 
     * @param createAddonSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAddonSubscription operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.CreateAddonSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateAddonSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAddonSubscriptionResult> createAddonSubscriptionAsync(CreateAddonSubscriptionRequest createAddonSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAddonSubscriptionRequest, CreateAddonSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Creates a new email archive resource for storing and retaining emails.
     * </p>
     * 
     * @param createArchiveRequest
     *        The request to create a new email archive.
     * @return A Java Future containing the result of the CreateArchive operation returned by the service.
     * @sample AWSMailManagerAsync.CreateArchive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateArchive" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateArchiveResult> createArchiveAsync(CreateArchiveRequest createArchiveRequest);

    /**
     * <p>
     * Creates a new email archive resource for storing and retaining emails.
     * </p>
     * 
     * @param createArchiveRequest
     *        The request to create a new email archive.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateArchive operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.CreateArchive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateArchive" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateArchiveResult> createArchiveAsync(CreateArchiveRequest createArchiveRequest,
            com.amazonaws.handlers.AsyncHandler<CreateArchiveRequest, CreateArchiveResult> asyncHandler);

    /**
     * <p>
     * Provision a new ingress endpoint resource.
     * </p>
     * 
     * @param createIngressPointRequest
     * @return A Java Future containing the result of the CreateIngressPoint operation returned by the service.
     * @sample AWSMailManagerAsync.CreateIngressPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateIngressPoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateIngressPointResult> createIngressPointAsync(CreateIngressPointRequest createIngressPointRequest);

    /**
     * <p>
     * Provision a new ingress endpoint resource.
     * </p>
     * 
     * @param createIngressPointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateIngressPoint operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.CreateIngressPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateIngressPoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateIngressPointResult> createIngressPointAsync(CreateIngressPointRequest createIngressPointRequest,
            com.amazonaws.handlers.AsyncHandler<CreateIngressPointRequest, CreateIngressPointResult> asyncHandler);

    /**
     * <p>
     * Creates a relay resource which can be used in rules to relay incoming emails to defined relay destinations.
     * </p>
     * 
     * @param createRelayRequest
     * @return A Java Future containing the result of the CreateRelay operation returned by the service.
     * @sample AWSMailManagerAsync.CreateRelay
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateRelay" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRelayResult> createRelayAsync(CreateRelayRequest createRelayRequest);

    /**
     * <p>
     * Creates a relay resource which can be used in rules to relay incoming emails to defined relay destinations.
     * </p>
     * 
     * @param createRelayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRelay operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.CreateRelay
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateRelay" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRelayResult> createRelayAsync(CreateRelayRequest createRelayRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRelayRequest, CreateRelayResult> asyncHandler);

    /**
     * <p>
     * Provision a new rule set.
     * </p>
     * 
     * @param createRuleSetRequest
     * @return A Java Future containing the result of the CreateRuleSet operation returned by the service.
     * @sample AWSMailManagerAsync.CreateRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateRuleSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRuleSetResult> createRuleSetAsync(CreateRuleSetRequest createRuleSetRequest);

    /**
     * <p>
     * Provision a new rule set.
     * </p>
     * 
     * @param createRuleSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRuleSet operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.CreateRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateRuleSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRuleSetResult> createRuleSetAsync(CreateRuleSetRequest createRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRuleSetRequest, CreateRuleSetResult> asyncHandler);

    /**
     * <p>
     * Provision a new traffic policy resource.
     * </p>
     * 
     * @param createTrafficPolicyRequest
     * @return A Java Future containing the result of the CreateTrafficPolicy operation returned by the service.
     * @sample AWSMailManagerAsync.CreateTrafficPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateTrafficPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTrafficPolicyResult> createTrafficPolicyAsync(CreateTrafficPolicyRequest createTrafficPolicyRequest);

    /**
     * <p>
     * Provision a new traffic policy resource.
     * </p>
     * 
     * @param createTrafficPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTrafficPolicy operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.CreateTrafficPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateTrafficPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTrafficPolicyResult> createTrafficPolicyAsync(CreateTrafficPolicyRequest createTrafficPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTrafficPolicyRequest, CreateTrafficPolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes an Add On instance.
     * </p>
     * 
     * @param deleteAddonInstanceRequest
     * @return A Java Future containing the result of the DeleteAddonInstance operation returned by the service.
     * @sample AWSMailManagerAsync.DeleteAddonInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteAddonInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAddonInstanceResult> deleteAddonInstanceAsync(DeleteAddonInstanceRequest deleteAddonInstanceRequest);

    /**
     * <p>
     * Deletes an Add On instance.
     * </p>
     * 
     * @param deleteAddonInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAddonInstance operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.DeleteAddonInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteAddonInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAddonInstanceResult> deleteAddonInstanceAsync(DeleteAddonInstanceRequest deleteAddonInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAddonInstanceRequest, DeleteAddonInstanceResult> asyncHandler);

    /**
     * <p>
     * Deletes an Add On subscription.
     * </p>
     * 
     * @param deleteAddonSubscriptionRequest
     * @return A Java Future containing the result of the DeleteAddonSubscription operation returned by the service.
     * @sample AWSMailManagerAsync.DeleteAddonSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteAddonSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAddonSubscriptionResult> deleteAddonSubscriptionAsync(DeleteAddonSubscriptionRequest deleteAddonSubscriptionRequest);

    /**
     * <p>
     * Deletes an Add On subscription.
     * </p>
     * 
     * @param deleteAddonSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAddonSubscription operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.DeleteAddonSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteAddonSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAddonSubscriptionResult> deleteAddonSubscriptionAsync(DeleteAddonSubscriptionRequest deleteAddonSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAddonSubscriptionRequest, DeleteAddonSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Initiates deletion of an email archive. This changes the archive state to pending deletion. In this state, no new
     * emails can be added, and existing archived emails become inaccessible (search, export, download). The archive and
     * all of its contents will be permanently deleted 30 days after entering the pending deletion state, regardless of
     * the configured retention period.
     * </p>
     * 
     * @param deleteArchiveRequest
     *        The request to initiate deletion of an email archive.
     * @return A Java Future containing the result of the DeleteArchive operation returned by the service.
     * @sample AWSMailManagerAsync.DeleteArchive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteArchive" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteArchiveResult> deleteArchiveAsync(DeleteArchiveRequest deleteArchiveRequest);

    /**
     * <p>
     * Initiates deletion of an email archive. This changes the archive state to pending deletion. In this state, no new
     * emails can be added, and existing archived emails become inaccessible (search, export, download). The archive and
     * all of its contents will be permanently deleted 30 days after entering the pending deletion state, regardless of
     * the configured retention period.
     * </p>
     * 
     * @param deleteArchiveRequest
     *        The request to initiate deletion of an email archive.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteArchive operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.DeleteArchive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteArchive" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteArchiveResult> deleteArchiveAsync(DeleteArchiveRequest deleteArchiveRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteArchiveRequest, DeleteArchiveResult> asyncHandler);

    /**
     * <p>
     * Delete an ingress endpoint resource.
     * </p>
     * 
     * @param deleteIngressPointRequest
     * @return A Java Future containing the result of the DeleteIngressPoint operation returned by the service.
     * @sample AWSMailManagerAsync.DeleteIngressPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteIngressPoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIngressPointResult> deleteIngressPointAsync(DeleteIngressPointRequest deleteIngressPointRequest);

    /**
     * <p>
     * Delete an ingress endpoint resource.
     * </p>
     * 
     * @param deleteIngressPointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIngressPoint operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.DeleteIngressPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteIngressPoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIngressPointResult> deleteIngressPointAsync(DeleteIngressPointRequest deleteIngressPointRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIngressPointRequest, DeleteIngressPointResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing relay resource.
     * </p>
     * 
     * @param deleteRelayRequest
     * @return A Java Future containing the result of the DeleteRelay operation returned by the service.
     * @sample AWSMailManagerAsync.DeleteRelay
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteRelay" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRelayResult> deleteRelayAsync(DeleteRelayRequest deleteRelayRequest);

    /**
     * <p>
     * Deletes an existing relay resource.
     * </p>
     * 
     * @param deleteRelayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRelay operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.DeleteRelay
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteRelay" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRelayResult> deleteRelayAsync(DeleteRelayRequest deleteRelayRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRelayRequest, DeleteRelayResult> asyncHandler);

    /**
     * <p>
     * Delete a rule set.
     * </p>
     * 
     * @param deleteRuleSetRequest
     * @return A Java Future containing the result of the DeleteRuleSet operation returned by the service.
     * @sample AWSMailManagerAsync.DeleteRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteRuleSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleSetResult> deleteRuleSetAsync(DeleteRuleSetRequest deleteRuleSetRequest);

    /**
     * <p>
     * Delete a rule set.
     * </p>
     * 
     * @param deleteRuleSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRuleSet operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.DeleteRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteRuleSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleSetResult> deleteRuleSetAsync(DeleteRuleSetRequest deleteRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRuleSetRequest, DeleteRuleSetResult> asyncHandler);

    /**
     * <p>
     * Delete a traffic policy resource.
     * </p>
     * 
     * @param deleteTrafficPolicyRequest
     * @return A Java Future containing the result of the DeleteTrafficPolicy operation returned by the service.
     * @sample AWSMailManagerAsync.DeleteTrafficPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteTrafficPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTrafficPolicyResult> deleteTrafficPolicyAsync(DeleteTrafficPolicyRequest deleteTrafficPolicyRequest);

    /**
     * <p>
     * Delete a traffic policy resource.
     * </p>
     * 
     * @param deleteTrafficPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTrafficPolicy operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.DeleteTrafficPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteTrafficPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTrafficPolicyResult> deleteTrafficPolicyAsync(DeleteTrafficPolicyRequest deleteTrafficPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTrafficPolicyRequest, DeleteTrafficPolicyResult> asyncHandler);

    /**
     * <p>
     * Gets detailed information about an Add On instance.
     * </p>
     * 
     * @param getAddonInstanceRequest
     * @return A Java Future containing the result of the GetAddonInstance operation returned by the service.
     * @sample AWSMailManagerAsync.GetAddonInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetAddonInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAddonInstanceResult> getAddonInstanceAsync(GetAddonInstanceRequest getAddonInstanceRequest);

    /**
     * <p>
     * Gets detailed information about an Add On instance.
     * </p>
     * 
     * @param getAddonInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAddonInstance operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.GetAddonInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetAddonInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAddonInstanceResult> getAddonInstanceAsync(GetAddonInstanceRequest getAddonInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<GetAddonInstanceRequest, GetAddonInstanceResult> asyncHandler);

    /**
     * <p>
     * Gets detailed information about an Add On subscription.
     * </p>
     * 
     * @param getAddonSubscriptionRequest
     * @return A Java Future containing the result of the GetAddonSubscription operation returned by the service.
     * @sample AWSMailManagerAsync.GetAddonSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetAddonSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAddonSubscriptionResult> getAddonSubscriptionAsync(GetAddonSubscriptionRequest getAddonSubscriptionRequest);

    /**
     * <p>
     * Gets detailed information about an Add On subscription.
     * </p>
     * 
     * @param getAddonSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAddonSubscription operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.GetAddonSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetAddonSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAddonSubscriptionResult> getAddonSubscriptionAsync(GetAddonSubscriptionRequest getAddonSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<GetAddonSubscriptionRequest, GetAddonSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Retrieves the full details and current state of a specified email archive.
     * </p>
     * 
     * @param getArchiveRequest
     *        The request to retrieve details of an email archive.
     * @return A Java Future containing the result of the GetArchive operation returned by the service.
     * @sample AWSMailManagerAsync.GetArchive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchive" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetArchiveResult> getArchiveAsync(GetArchiveRequest getArchiveRequest);

    /**
     * <p>
     * Retrieves the full details and current state of a specified email archive.
     * </p>
     * 
     * @param getArchiveRequest
     *        The request to retrieve details of an email archive.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetArchive operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.GetArchive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchive" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetArchiveResult> getArchiveAsync(GetArchiveRequest getArchiveRequest,
            com.amazonaws.handlers.AsyncHandler<GetArchiveRequest, GetArchiveResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details and current status of a specific email archive export job.
     * </p>
     * 
     * @param getArchiveExportRequest
     *        The request to retrieve details of a specific archive export job.
     * @return A Java Future containing the result of the GetArchiveExport operation returned by the service.
     * @sample AWSMailManagerAsync.GetArchiveExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchiveExport" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetArchiveExportResult> getArchiveExportAsync(GetArchiveExportRequest getArchiveExportRequest);

    /**
     * <p>
     * Retrieves the details and current status of a specific email archive export job.
     * </p>
     * 
     * @param getArchiveExportRequest
     *        The request to retrieve details of a specific archive export job.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetArchiveExport operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.GetArchiveExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchiveExport" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetArchiveExportResult> getArchiveExportAsync(GetArchiveExportRequest getArchiveExportRequest,
            com.amazonaws.handlers.AsyncHandler<GetArchiveExportRequest, GetArchiveExportResult> asyncHandler);

    /**
     * <p>
     * Returns a pre-signed URL that provides temporary download access to the specific email message stored in the
     * archive.
     * </p>
     * 
     * @param getArchiveMessageRequest
     *        The request to get details of a specific email message stored in an archive.
     * @return A Java Future containing the result of the GetArchiveMessage operation returned by the service.
     * @sample AWSMailManagerAsync.GetArchiveMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchiveMessage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetArchiveMessageResult> getArchiveMessageAsync(GetArchiveMessageRequest getArchiveMessageRequest);

    /**
     * <p>
     * Returns a pre-signed URL that provides temporary download access to the specific email message stored in the
     * archive.
     * </p>
     * 
     * @param getArchiveMessageRequest
     *        The request to get details of a specific email message stored in an archive.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetArchiveMessage operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.GetArchiveMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchiveMessage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetArchiveMessageResult> getArchiveMessageAsync(GetArchiveMessageRequest getArchiveMessageRequest,
            com.amazonaws.handlers.AsyncHandler<GetArchiveMessageRequest, GetArchiveMessageResult> asyncHandler);

    /**
     * <p>
     * Returns the textual content of a specific email message stored in the archive. Attachments are not included.
     * </p>
     * 
     * @param getArchiveMessageContentRequest
     *        The request to get the textual content of a specific email message stored in an archive.
     * @return A Java Future containing the result of the GetArchiveMessageContent operation returned by the service.
     * @sample AWSMailManagerAsync.GetArchiveMessageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchiveMessageContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetArchiveMessageContentResult> getArchiveMessageContentAsync(GetArchiveMessageContentRequest getArchiveMessageContentRequest);

    /**
     * <p>
     * Returns the textual content of a specific email message stored in the archive. Attachments are not included.
     * </p>
     * 
     * @param getArchiveMessageContentRequest
     *        The request to get the textual content of a specific email message stored in an archive.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetArchiveMessageContent operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.GetArchiveMessageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchiveMessageContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetArchiveMessageContentResult> getArchiveMessageContentAsync(GetArchiveMessageContentRequest getArchiveMessageContentRequest,
            com.amazonaws.handlers.AsyncHandler<GetArchiveMessageContentRequest, GetArchiveMessageContentResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details and current status of a specific email archive search job.
     * </p>
     * 
     * @param getArchiveSearchRequest
     *        The request to retrieve details of a specific archive search job.
     * @return A Java Future containing the result of the GetArchiveSearch operation returned by the service.
     * @sample AWSMailManagerAsync.GetArchiveSearch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchiveSearch" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetArchiveSearchResult> getArchiveSearchAsync(GetArchiveSearchRequest getArchiveSearchRequest);

    /**
     * <p>
     * Retrieves the details and current status of a specific email archive search job.
     * </p>
     * 
     * @param getArchiveSearchRequest
     *        The request to retrieve details of a specific archive search job.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetArchiveSearch operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.GetArchiveSearch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchiveSearch" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetArchiveSearchResult> getArchiveSearchAsync(GetArchiveSearchRequest getArchiveSearchRequest,
            com.amazonaws.handlers.AsyncHandler<GetArchiveSearchRequest, GetArchiveSearchResult> asyncHandler);

    /**
     * <p>
     * Returns the results of a completed email archive search job.
     * </p>
     * 
     * @param getArchiveSearchResultsRequest
     *        The request to retrieve results from a completed archive search job.
     * @return A Java Future containing the result of the GetArchiveSearchResults operation returned by the service.
     * @sample AWSMailManagerAsync.GetArchiveSearchResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchiveSearchResults"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetArchiveSearchResultsResult> getArchiveSearchResultsAsync(GetArchiveSearchResultsRequest getArchiveSearchResultsRequest);

    /**
     * <p>
     * Returns the results of a completed email archive search job.
     * </p>
     * 
     * @param getArchiveSearchResultsRequest
     *        The request to retrieve results from a completed archive search job.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetArchiveSearchResults operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.GetArchiveSearchResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchiveSearchResults"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetArchiveSearchResultsResult> getArchiveSearchResultsAsync(GetArchiveSearchResultsRequest getArchiveSearchResultsRequest,
            com.amazonaws.handlers.AsyncHandler<GetArchiveSearchResultsRequest, GetArchiveSearchResultsResult> asyncHandler);

    /**
     * <p>
     * Fetch ingress endpoint resource attributes.
     * </p>
     * 
     * @param getIngressPointRequest
     * @return A Java Future containing the result of the GetIngressPoint operation returned by the service.
     * @sample AWSMailManagerAsync.GetIngressPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetIngressPoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetIngressPointResult> getIngressPointAsync(GetIngressPointRequest getIngressPointRequest);

    /**
     * <p>
     * Fetch ingress endpoint resource attributes.
     * </p>
     * 
     * @param getIngressPointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIngressPoint operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.GetIngressPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetIngressPoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetIngressPointResult> getIngressPointAsync(GetIngressPointRequest getIngressPointRequest,
            com.amazonaws.handlers.AsyncHandler<GetIngressPointRequest, GetIngressPointResult> asyncHandler);

    /**
     * <p>
     * Fetch the relay resource and it's attributes.
     * </p>
     * 
     * @param getRelayRequest
     * @return A Java Future containing the result of the GetRelay operation returned by the service.
     * @sample AWSMailManagerAsync.GetRelay
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetRelay" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRelayResult> getRelayAsync(GetRelayRequest getRelayRequest);

    /**
     * <p>
     * Fetch the relay resource and it's attributes.
     * </p>
     * 
     * @param getRelayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRelay operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.GetRelay
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetRelay" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRelayResult> getRelayAsync(GetRelayRequest getRelayRequest,
            com.amazonaws.handlers.AsyncHandler<GetRelayRequest, GetRelayResult> asyncHandler);

    /**
     * <p>
     * Fetch attributes of a rule set.
     * </p>
     * 
     * @param getRuleSetRequest
     * @return A Java Future containing the result of the GetRuleSet operation returned by the service.
     * @sample AWSMailManagerAsync.GetRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetRuleSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRuleSetResult> getRuleSetAsync(GetRuleSetRequest getRuleSetRequest);

    /**
     * <p>
     * Fetch attributes of a rule set.
     * </p>
     * 
     * @param getRuleSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRuleSet operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.GetRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetRuleSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRuleSetResult> getRuleSetAsync(GetRuleSetRequest getRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetRuleSetRequest, GetRuleSetResult> asyncHandler);

    /**
     * <p>
     * Fetch attributes of a traffic policy resource.
     * </p>
     * 
     * @param getTrafficPolicyRequest
     * @return A Java Future containing the result of the GetTrafficPolicy operation returned by the service.
     * @sample AWSMailManagerAsync.GetTrafficPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetTrafficPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetTrafficPolicyResult> getTrafficPolicyAsync(GetTrafficPolicyRequest getTrafficPolicyRequest);

    /**
     * <p>
     * Fetch attributes of a traffic policy resource.
     * </p>
     * 
     * @param getTrafficPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTrafficPolicy operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.GetTrafficPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetTrafficPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetTrafficPolicyResult> getTrafficPolicyAsync(GetTrafficPolicyRequest getTrafficPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetTrafficPolicyRequest, GetTrafficPolicyResult> asyncHandler);

    /**
     * <p>
     * Lists all Add On instances in your account.
     * </p>
     * 
     * @param listAddonInstancesRequest
     * @return A Java Future containing the result of the ListAddonInstances operation returned by the service.
     * @sample AWSMailManagerAsync.ListAddonInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListAddonInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAddonInstancesResult> listAddonInstancesAsync(ListAddonInstancesRequest listAddonInstancesRequest);

    /**
     * <p>
     * Lists all Add On instances in your account.
     * </p>
     * 
     * @param listAddonInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAddonInstances operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.ListAddonInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListAddonInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAddonInstancesResult> listAddonInstancesAsync(ListAddonInstancesRequest listAddonInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAddonInstancesRequest, ListAddonInstancesResult> asyncHandler);

    /**
     * <p>
     * Lists all Add On subscriptions in your account.
     * </p>
     * 
     * @param listAddonSubscriptionsRequest
     * @return A Java Future containing the result of the ListAddonSubscriptions operation returned by the service.
     * @sample AWSMailManagerAsync.ListAddonSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListAddonSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAddonSubscriptionsResult> listAddonSubscriptionsAsync(ListAddonSubscriptionsRequest listAddonSubscriptionsRequest);

    /**
     * <p>
     * Lists all Add On subscriptions in your account.
     * </p>
     * 
     * @param listAddonSubscriptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAddonSubscriptions operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.ListAddonSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListAddonSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAddonSubscriptionsResult> listAddonSubscriptionsAsync(ListAddonSubscriptionsRequest listAddonSubscriptionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAddonSubscriptionsRequest, ListAddonSubscriptionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of email archive export jobs.
     * </p>
     * 
     * @param listArchiveExportsRequest
     *        The request to list archive export jobs in your account.
     * @return A Java Future containing the result of the ListArchiveExports operation returned by the service.
     * @sample AWSMailManagerAsync.ListArchiveExports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListArchiveExports" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListArchiveExportsResult> listArchiveExportsAsync(ListArchiveExportsRequest listArchiveExportsRequest);

    /**
     * <p>
     * Returns a list of email archive export jobs.
     * </p>
     * 
     * @param listArchiveExportsRequest
     *        The request to list archive export jobs in your account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListArchiveExports operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.ListArchiveExports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListArchiveExports" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListArchiveExportsResult> listArchiveExportsAsync(ListArchiveExportsRequest listArchiveExportsRequest,
            com.amazonaws.handlers.AsyncHandler<ListArchiveExportsRequest, ListArchiveExportsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of email archive search jobs.
     * </p>
     * 
     * @param listArchiveSearchesRequest
     *        The request to list archive search jobs in your account.
     * @return A Java Future containing the result of the ListArchiveSearches operation returned by the service.
     * @sample AWSMailManagerAsync.ListArchiveSearches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListArchiveSearches"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListArchiveSearchesResult> listArchiveSearchesAsync(ListArchiveSearchesRequest listArchiveSearchesRequest);

    /**
     * <p>
     * Returns a list of email archive search jobs.
     * </p>
     * 
     * @param listArchiveSearchesRequest
     *        The request to list archive search jobs in your account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListArchiveSearches operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.ListArchiveSearches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListArchiveSearches"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListArchiveSearchesResult> listArchiveSearchesAsync(ListArchiveSearchesRequest listArchiveSearchesRequest,
            com.amazonaws.handlers.AsyncHandler<ListArchiveSearchesRequest, ListArchiveSearchesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all email archives in your account.
     * </p>
     * 
     * @param listArchivesRequest
     *        The request to list email archives in your account.
     * @return A Java Future containing the result of the ListArchives operation returned by the service.
     * @sample AWSMailManagerAsync.ListArchives
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListArchives" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListArchivesResult> listArchivesAsync(ListArchivesRequest listArchivesRequest);

    /**
     * <p>
     * Returns a list of all email archives in your account.
     * </p>
     * 
     * @param listArchivesRequest
     *        The request to list email archives in your account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListArchives operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.ListArchives
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListArchives" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListArchivesResult> listArchivesAsync(ListArchivesRequest listArchivesRequest,
            com.amazonaws.handlers.AsyncHandler<ListArchivesRequest, ListArchivesResult> asyncHandler);

    /**
     * <p>
     * List all ingress endpoint resources.
     * </p>
     * 
     * @param listIngressPointsRequest
     * @return A Java Future containing the result of the ListIngressPoints operation returned by the service.
     * @sample AWSMailManagerAsync.ListIngressPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListIngressPoints" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListIngressPointsResult> listIngressPointsAsync(ListIngressPointsRequest listIngressPointsRequest);

    /**
     * <p>
     * List all ingress endpoint resources.
     * </p>
     * 
     * @param listIngressPointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIngressPoints operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.ListIngressPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListIngressPoints" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListIngressPointsResult> listIngressPointsAsync(ListIngressPointsRequest listIngressPointsRequest,
            com.amazonaws.handlers.AsyncHandler<ListIngressPointsRequest, ListIngressPointsResult> asyncHandler);

    /**
     * <p>
     * Lists all the existing relay resources.
     * </p>
     * 
     * @param listRelaysRequest
     * @return A Java Future containing the result of the ListRelays operation returned by the service.
     * @sample AWSMailManagerAsync.ListRelays
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListRelays" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRelaysResult> listRelaysAsync(ListRelaysRequest listRelaysRequest);

    /**
     * <p>
     * Lists all the existing relay resources.
     * </p>
     * 
     * @param listRelaysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRelays operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.ListRelays
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListRelays" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRelaysResult> listRelaysAsync(ListRelaysRequest listRelaysRequest,
            com.amazonaws.handlers.AsyncHandler<ListRelaysRequest, ListRelaysResult> asyncHandler);

    /**
     * <p>
     * List rule sets for this account.
     * </p>
     * 
     * @param listRuleSetsRequest
     * @return A Java Future containing the result of the ListRuleSets operation returned by the service.
     * @sample AWSMailManagerAsync.ListRuleSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListRuleSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRuleSetsResult> listRuleSetsAsync(ListRuleSetsRequest listRuleSetsRequest);

    /**
     * <p>
     * List rule sets for this account.
     * </p>
     * 
     * @param listRuleSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRuleSets operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.ListRuleSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListRuleSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRuleSetsResult> listRuleSetsAsync(ListRuleSetsRequest listRuleSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRuleSetsRequest, ListRuleSetsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the list of tags (keys and values) assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSMailManagerAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Retrieves the list of tags (keys and values) assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * List traffic policy resources.
     * </p>
     * 
     * @param listTrafficPoliciesRequest
     * @return A Java Future containing the result of the ListTrafficPolicies operation returned by the service.
     * @sample AWSMailManagerAsync.ListTrafficPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListTrafficPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTrafficPoliciesResult> listTrafficPoliciesAsync(ListTrafficPoliciesRequest listTrafficPoliciesRequest);

    /**
     * <p>
     * List traffic policy resources.
     * </p>
     * 
     * @param listTrafficPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTrafficPolicies operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.ListTrafficPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListTrafficPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTrafficPoliciesResult> listTrafficPoliciesAsync(ListTrafficPoliciesRequest listTrafficPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrafficPoliciesRequest, ListTrafficPoliciesResult> asyncHandler);

    /**
     * <p>
     * Initiates an export of emails from the specified archive.
     * </p>
     * 
     * @param startArchiveExportRequest
     *        The request to initiate an export of emails from an archive.
     * @return A Java Future containing the result of the StartArchiveExport operation returned by the service.
     * @sample AWSMailManagerAsync.StartArchiveExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/StartArchiveExport" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartArchiveExportResult> startArchiveExportAsync(StartArchiveExportRequest startArchiveExportRequest);

    /**
     * <p>
     * Initiates an export of emails from the specified archive.
     * </p>
     * 
     * @param startArchiveExportRequest
     *        The request to initiate an export of emails from an archive.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartArchiveExport operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.StartArchiveExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/StartArchiveExport" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartArchiveExportResult> startArchiveExportAsync(StartArchiveExportRequest startArchiveExportRequest,
            com.amazonaws.handlers.AsyncHandler<StartArchiveExportRequest, StartArchiveExportResult> asyncHandler);

    /**
     * <p>
     * Initiates a search across emails in the specified archive.
     * </p>
     * 
     * @param startArchiveSearchRequest
     *        The request to initiate a search across emails in an archive.
     * @return A Java Future containing the result of the StartArchiveSearch operation returned by the service.
     * @sample AWSMailManagerAsync.StartArchiveSearch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/StartArchiveSearch" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartArchiveSearchResult> startArchiveSearchAsync(StartArchiveSearchRequest startArchiveSearchRequest);

    /**
     * <p>
     * Initiates a search across emails in the specified archive.
     * </p>
     * 
     * @param startArchiveSearchRequest
     *        The request to initiate a search across emails in an archive.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartArchiveSearch operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.StartArchiveSearch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/StartArchiveSearch" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartArchiveSearchResult> startArchiveSearchAsync(StartArchiveSearchRequest startArchiveSearchRequest,
            com.amazonaws.handlers.AsyncHandler<StartArchiveSearchRequest, StartArchiveSearchResult> asyncHandler);

    /**
     * <p>
     * Stops an in-progress export of emails from an archive.
     * </p>
     * 
     * @param stopArchiveExportRequest
     *        The request to stop an in-progress archive export job.
     * @return A Java Future containing the result of the StopArchiveExport operation returned by the service.
     * @sample AWSMailManagerAsync.StopArchiveExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/StopArchiveExport" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopArchiveExportResult> stopArchiveExportAsync(StopArchiveExportRequest stopArchiveExportRequest);

    /**
     * <p>
     * Stops an in-progress export of emails from an archive.
     * </p>
     * 
     * @param stopArchiveExportRequest
     *        The request to stop an in-progress archive export job.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopArchiveExport operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.StopArchiveExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/StopArchiveExport" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopArchiveExportResult> stopArchiveExportAsync(StopArchiveExportRequest stopArchiveExportRequest,
            com.amazonaws.handlers.AsyncHandler<StopArchiveExportRequest, StopArchiveExportResult> asyncHandler);

    /**
     * <p>
     * Stops an in-progress archive search job.
     * </p>
     * 
     * @param stopArchiveSearchRequest
     *        The request to stop an in-progress archive search job.
     * @return A Java Future containing the result of the StopArchiveSearch operation returned by the service.
     * @sample AWSMailManagerAsync.StopArchiveSearch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/StopArchiveSearch" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopArchiveSearchResult> stopArchiveSearchAsync(StopArchiveSearchRequest stopArchiveSearchRequest);

    /**
     * <p>
     * Stops an in-progress archive search job.
     * </p>
     * 
     * @param stopArchiveSearchRequest
     *        The request to stop an in-progress archive search job.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopArchiveSearch operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.StopArchiveSearch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/StopArchiveSearch" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopArchiveSearchResult> stopArchiveSearchAsync(StopArchiveSearchRequest stopArchiveSearchRequest,
            com.amazonaws.handlers.AsyncHandler<StopArchiveSearchRequest, StopArchiveSearchResult> asyncHandler);

    /**
     * <p>
     * Adds one or more tags (keys and values) to a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSMailManagerAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds one or more tags (keys and values) to a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Remove one or more tags (keys and values) from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSMailManagerAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Remove one or more tags (keys and values) from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the attributes of an existing email archive.
     * </p>
     * 
     * @param updateArchiveRequest
     *        The request to update properties of an existing email archive.
     * @return A Java Future containing the result of the UpdateArchive operation returned by the service.
     * @sample AWSMailManagerAsync.UpdateArchive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UpdateArchive" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateArchiveResult> updateArchiveAsync(UpdateArchiveRequest updateArchiveRequest);

    /**
     * <p>
     * Updates the attributes of an existing email archive.
     * </p>
     * 
     * @param updateArchiveRequest
     *        The request to update properties of an existing email archive.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateArchive operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.UpdateArchive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UpdateArchive" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateArchiveResult> updateArchiveAsync(UpdateArchiveRequest updateArchiveRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateArchiveRequest, UpdateArchiveResult> asyncHandler);

    /**
     * <p>
     * Update attributes of a provisioned ingress endpoint resource.
     * </p>
     * 
     * @param updateIngressPointRequest
     * @return A Java Future containing the result of the UpdateIngressPoint operation returned by the service.
     * @sample AWSMailManagerAsync.UpdateIngressPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UpdateIngressPoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIngressPointResult> updateIngressPointAsync(UpdateIngressPointRequest updateIngressPointRequest);

    /**
     * <p>
     * Update attributes of a provisioned ingress endpoint resource.
     * </p>
     * 
     * @param updateIngressPointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIngressPoint operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.UpdateIngressPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UpdateIngressPoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIngressPointResult> updateIngressPointAsync(UpdateIngressPointRequest updateIngressPointRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIngressPointRequest, UpdateIngressPointResult> asyncHandler);

    /**
     * <p>
     * Updates the attributes of an existing relay resource.
     * </p>
     * 
     * @param updateRelayRequest
     * @return A Java Future containing the result of the UpdateRelay operation returned by the service.
     * @sample AWSMailManagerAsync.UpdateRelay
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UpdateRelay" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRelayResult> updateRelayAsync(UpdateRelayRequest updateRelayRequest);

    /**
     * <p>
     * Updates the attributes of an existing relay resource.
     * </p>
     * 
     * @param updateRelayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRelay operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.UpdateRelay
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UpdateRelay" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRelayResult> updateRelayAsync(UpdateRelayRequest updateRelayRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRelayRequest, UpdateRelayResult> asyncHandler);

    /**
     * <p>
     * &gt;Update attributes of an already provisioned rule set.
     * </p>
     * 
     * @param updateRuleSetRequest
     * @return A Java Future containing the result of the UpdateRuleSet operation returned by the service.
     * @sample AWSMailManagerAsync.UpdateRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UpdateRuleSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuleSetResult> updateRuleSetAsync(UpdateRuleSetRequest updateRuleSetRequest);

    /**
     * <p>
     * &gt;Update attributes of an already provisioned rule set.
     * </p>
     * 
     * @param updateRuleSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRuleSet operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.UpdateRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UpdateRuleSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuleSetResult> updateRuleSetAsync(UpdateRuleSetRequest updateRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRuleSetRequest, UpdateRuleSetResult> asyncHandler);

    /**
     * <p>
     * Update attributes of an already provisioned traffic policy resource.
     * </p>
     * 
     * @param updateTrafficPolicyRequest
     * @return A Java Future containing the result of the UpdateTrafficPolicy operation returned by the service.
     * @sample AWSMailManagerAsync.UpdateTrafficPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UpdateTrafficPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTrafficPolicyResult> updateTrafficPolicyAsync(UpdateTrafficPolicyRequest updateTrafficPolicyRequest);

    /**
     * <p>
     * Update attributes of an already provisioned traffic policy resource.
     * </p>
     * 
     * @param updateTrafficPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTrafficPolicy operation returned by the service.
     * @sample AWSMailManagerAsyncHandler.UpdateTrafficPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UpdateTrafficPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTrafficPolicyResult> updateTrafficPolicyAsync(UpdateTrafficPolicyRequest updateTrafficPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTrafficPolicyRequest, UpdateTrafficPolicyResult> asyncHandler);

}
