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
package com.amazonaws.services.ssmcontacts;

import javax.annotation.Generated;

import com.amazonaws.services.ssmcontacts.model.*;

/**
 * Interface for accessing SSM Contacts asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ssmcontacts.AbstractAWSSSMContactsAsync} instead.
 * </p>
 * <p>
 * <p/>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSSMContactsAsync extends AWSSSMContacts {

    /**
     * <p>
     * Used to acknowledge an engagement to a contact channel during an incident.
     * </p>
     * 
     * @param acceptPageRequest
     * @return A Java Future containing the result of the AcceptPage operation returned by the service.
     * @sample AWSSSMContactsAsync.AcceptPage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/AcceptPage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AcceptPageResult> acceptPageAsync(AcceptPageRequest acceptPageRequest);

    /**
     * <p>
     * Used to acknowledge an engagement to a contact channel during an incident.
     * </p>
     * 
     * @param acceptPageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptPage operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.AcceptPage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/AcceptPage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AcceptPageResult> acceptPageAsync(AcceptPageRequest acceptPageRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptPageRequest, AcceptPageResult> asyncHandler);

    /**
     * <p>
     * Activates a contact's contact channel. Incident Manager can't engage a contact until the contact channel has been
     * activated.
     * </p>
     * 
     * @param activateContactChannelRequest
     * @return A Java Future containing the result of the ActivateContactChannel operation returned by the service.
     * @sample AWSSSMContactsAsync.ActivateContactChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ActivateContactChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ActivateContactChannelResult> activateContactChannelAsync(ActivateContactChannelRequest activateContactChannelRequest);

    /**
     * <p>
     * Activates a contact's contact channel. Incident Manager can't engage a contact until the contact channel has been
     * activated.
     * </p>
     * 
     * @param activateContactChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ActivateContactChannel operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.ActivateContactChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ActivateContactChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ActivateContactChannelResult> activateContactChannelAsync(ActivateContactChannelRequest activateContactChannelRequest,
            com.amazonaws.handlers.AsyncHandler<ActivateContactChannelRequest, ActivateContactChannelResult> asyncHandler);

    /**
     * <p>
     * Contacts are either the contacts that Incident Manager engages during an incident or the escalation plans that
     * Incident Manager uses to engage contacts in phases during an incident.
     * </p>
     * 
     * @param createContactRequest
     * @return A Java Future containing the result of the CreateContact operation returned by the service.
     * @sample AWSSSMContactsAsync.CreateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/CreateContact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateContactResult> createContactAsync(CreateContactRequest createContactRequest);

    /**
     * <p>
     * Contacts are either the contacts that Incident Manager engages during an incident or the escalation plans that
     * Incident Manager uses to engage contacts in phases during an incident.
     * </p>
     * 
     * @param createContactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateContact operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.CreateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/CreateContact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateContactResult> createContactAsync(CreateContactRequest createContactRequest,
            com.amazonaws.handlers.AsyncHandler<CreateContactRequest, CreateContactResult> asyncHandler);

    /**
     * <p>
     * A contact channel is the method that Incident Manager uses to engage your contact.
     * </p>
     * 
     * @param createContactChannelRequest
     * @return A Java Future containing the result of the CreateContactChannel operation returned by the service.
     * @sample AWSSSMContactsAsync.CreateContactChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/CreateContactChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateContactChannelResult> createContactChannelAsync(CreateContactChannelRequest createContactChannelRequest);

    /**
     * <p>
     * A contact channel is the method that Incident Manager uses to engage your contact.
     * </p>
     * 
     * @param createContactChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateContactChannel operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.CreateContactChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/CreateContactChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateContactChannelResult> createContactChannelAsync(CreateContactChannelRequest createContactChannelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateContactChannelRequest, CreateContactChannelResult> asyncHandler);

    /**
     * <p>
     * To no longer receive Incident Manager engagements to a contact channel, you can deactivate the channel.
     * </p>
     * 
     * @param deactivateContactChannelRequest
     * @return A Java Future containing the result of the DeactivateContactChannel operation returned by the service.
     * @sample AWSSSMContactsAsync.DeactivateContactChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/DeactivateContactChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeactivateContactChannelResult> deactivateContactChannelAsync(DeactivateContactChannelRequest deactivateContactChannelRequest);

    /**
     * <p>
     * To no longer receive Incident Manager engagements to a contact channel, you can deactivate the channel.
     * </p>
     * 
     * @param deactivateContactChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeactivateContactChannel operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.DeactivateContactChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/DeactivateContactChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeactivateContactChannelResult> deactivateContactChannelAsync(DeactivateContactChannelRequest deactivateContactChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeactivateContactChannelRequest, DeactivateContactChannelResult> asyncHandler);

    /**
     * <p>
     * To remove a contact from Incident Manager, you can delete the contact. Deleting a contact removes them from all
     * escalation plans and related response plans. Deleting an escalation plan removes it from all related response
     * plans. You will have to recreate the contact and its contact channels before you can use it again.
     * </p>
     * 
     * @param deleteContactRequest
     * @return A Java Future containing the result of the DeleteContact operation returned by the service.
     * @sample AWSSSMContactsAsync.DeleteContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/DeleteContact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteContactResult> deleteContactAsync(DeleteContactRequest deleteContactRequest);

    /**
     * <p>
     * To remove a contact from Incident Manager, you can delete the contact. Deleting a contact removes them from all
     * escalation plans and related response plans. Deleting an escalation plan removes it from all related response
     * plans. You will have to recreate the contact and its contact channels before you can use it again.
     * </p>
     * 
     * @param deleteContactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteContact operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.DeleteContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/DeleteContact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteContactResult> deleteContactAsync(DeleteContactRequest deleteContactRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteContactRequest, DeleteContactResult> asyncHandler);

    /**
     * <p>
     * To no longer receive engagements on a contact channel, you can delete the channel from a contact. Deleting the
     * contact channel removes it from the contact's engagement plan. If you delete the only contact channel for a
     * contact, you won't be able to engage that contact during an incident.
     * </p>
     * 
     * @param deleteContactChannelRequest
     * @return A Java Future containing the result of the DeleteContactChannel operation returned by the service.
     * @sample AWSSSMContactsAsync.DeleteContactChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/DeleteContactChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteContactChannelResult> deleteContactChannelAsync(DeleteContactChannelRequest deleteContactChannelRequest);

    /**
     * <p>
     * To no longer receive engagements on a contact channel, you can delete the channel from a contact. Deleting the
     * contact channel removes it from the contact's engagement plan. If you delete the only contact channel for a
     * contact, you won't be able to engage that contact during an incident.
     * </p>
     * 
     * @param deleteContactChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteContactChannel operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.DeleteContactChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/DeleteContactChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteContactChannelResult> deleteContactChannelAsync(DeleteContactChannelRequest deleteContactChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteContactChannelRequest, DeleteContactChannelResult> asyncHandler);

    /**
     * <p>
     * Incident Manager uses engagements to engage contacts and escalation plans during an incident. Use this command to
     * describe the engagement that occurred during an incident.
     * </p>
     * 
     * @param describeEngagementRequest
     * @return A Java Future containing the result of the DescribeEngagement operation returned by the service.
     * @sample AWSSSMContactsAsync.DescribeEngagement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/DescribeEngagement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEngagementResult> describeEngagementAsync(DescribeEngagementRequest describeEngagementRequest);

    /**
     * <p>
     * Incident Manager uses engagements to engage contacts and escalation plans during an incident. Use this command to
     * describe the engagement that occurred during an incident.
     * </p>
     * 
     * @param describeEngagementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEngagement operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.DescribeEngagement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/DescribeEngagement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEngagementResult> describeEngagementAsync(DescribeEngagementRequest describeEngagementRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEngagementRequest, DescribeEngagementResult> asyncHandler);

    /**
     * <p>
     * Lists details of the engagement to a contact channel.
     * </p>
     * 
     * @param describePageRequest
     * @return A Java Future containing the result of the DescribePage operation returned by the service.
     * @sample AWSSSMContactsAsync.DescribePage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/DescribePage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribePageResult> describePageAsync(DescribePageRequest describePageRequest);

    /**
     * <p>
     * Lists details of the engagement to a contact channel.
     * </p>
     * 
     * @param describePageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePage operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.DescribePage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/DescribePage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribePageResult> describePageAsync(DescribePageRequest describePageRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePageRequest, DescribePageResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the specified contact or escalation plan.
     * </p>
     * 
     * @param getContactRequest
     * @return A Java Future containing the result of the GetContact operation returned by the service.
     * @sample AWSSSMContactsAsync.GetContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/GetContact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetContactResult> getContactAsync(GetContactRequest getContactRequest);

    /**
     * <p>
     * Retrieves information about the specified contact or escalation plan.
     * </p>
     * 
     * @param getContactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetContact operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.GetContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/GetContact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetContactResult> getContactAsync(GetContactRequest getContactRequest,
            com.amazonaws.handlers.AsyncHandler<GetContactRequest, GetContactResult> asyncHandler);

    /**
     * <p>
     * List details about a specific contact channel.
     * </p>
     * 
     * @param getContactChannelRequest
     * @return A Java Future containing the result of the GetContactChannel operation returned by the service.
     * @sample AWSSSMContactsAsync.GetContactChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/GetContactChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetContactChannelResult> getContactChannelAsync(GetContactChannelRequest getContactChannelRequest);

    /**
     * <p>
     * List details about a specific contact channel.
     * </p>
     * 
     * @param getContactChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetContactChannel operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.GetContactChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/GetContactChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetContactChannelResult> getContactChannelAsync(GetContactChannelRequest getContactChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetContactChannelRequest, GetContactChannelResult> asyncHandler);

    /**
     * <p>
     * Retrieves the resource policies attached to the specified contact or escalation plan.
     * </p>
     * 
     * @param getContactPolicyRequest
     * @return A Java Future containing the result of the GetContactPolicy operation returned by the service.
     * @sample AWSSSMContactsAsync.GetContactPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/GetContactPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetContactPolicyResult> getContactPolicyAsync(GetContactPolicyRequest getContactPolicyRequest);

    /**
     * <p>
     * Retrieves the resource policies attached to the specified contact or escalation plan.
     * </p>
     * 
     * @param getContactPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetContactPolicy operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.GetContactPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/GetContactPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetContactPolicyResult> getContactPolicyAsync(GetContactPolicyRequest getContactPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetContactPolicyRequest, GetContactPolicyResult> asyncHandler);

    /**
     * <p>
     * Lists all contact channels for the specified contact.
     * </p>
     * 
     * @param listContactChannelsRequest
     * @return A Java Future containing the result of the ListContactChannels operation returned by the service.
     * @sample AWSSSMContactsAsync.ListContactChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListContactChannels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListContactChannelsResult> listContactChannelsAsync(ListContactChannelsRequest listContactChannelsRequest);

    /**
     * <p>
     * Lists all contact channels for the specified contact.
     * </p>
     * 
     * @param listContactChannelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListContactChannels operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.ListContactChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListContactChannels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListContactChannelsResult> listContactChannelsAsync(ListContactChannelsRequest listContactChannelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListContactChannelsRequest, ListContactChannelsResult> asyncHandler);

    /**
     * <p>
     * Lists all contacts and escalation plans in Incident Manager.
     * </p>
     * 
     * @param listContactsRequest
     * @return A Java Future containing the result of the ListContacts operation returned by the service.
     * @sample AWSSSMContactsAsync.ListContacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListContacts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListContactsResult> listContactsAsync(ListContactsRequest listContactsRequest);

    /**
     * <p>
     * Lists all contacts and escalation plans in Incident Manager.
     * </p>
     * 
     * @param listContactsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListContacts operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.ListContacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListContacts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListContactsResult> listContactsAsync(ListContactsRequest listContactsRequest,
            com.amazonaws.handlers.AsyncHandler<ListContactsRequest, ListContactsResult> asyncHandler);

    /**
     * <p>
     * Lists all engagements that have happened in an incident.
     * </p>
     * 
     * @param listEngagementsRequest
     * @return A Java Future containing the result of the ListEngagements operation returned by the service.
     * @sample AWSSSMContactsAsync.ListEngagements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListEngagements" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListEngagementsResult> listEngagementsAsync(ListEngagementsRequest listEngagementsRequest);

    /**
     * <p>
     * Lists all engagements that have happened in an incident.
     * </p>
     * 
     * @param listEngagementsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEngagements operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.ListEngagements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListEngagements" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListEngagementsResult> listEngagementsAsync(ListEngagementsRequest listEngagementsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEngagementsRequest, ListEngagementsResult> asyncHandler);

    /**
     * <p>
     * Lists all of the engagements to contact channels that have been acknowledged.
     * </p>
     * 
     * @param listPageReceiptsRequest
     * @return A Java Future containing the result of the ListPageReceipts operation returned by the service.
     * @sample AWSSSMContactsAsync.ListPageReceipts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListPageReceipts" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPageReceiptsResult> listPageReceiptsAsync(ListPageReceiptsRequest listPageReceiptsRequest);

    /**
     * <p>
     * Lists all of the engagements to contact channels that have been acknowledged.
     * </p>
     * 
     * @param listPageReceiptsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPageReceipts operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.ListPageReceipts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListPageReceipts" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPageReceiptsResult> listPageReceiptsAsync(ListPageReceiptsRequest listPageReceiptsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPageReceiptsRequest, ListPageReceiptsResult> asyncHandler);

    /**
     * <p>
     * Lists the engagements to a contact's contact channels.
     * </p>
     * 
     * @param listPagesByContactRequest
     * @return A Java Future containing the result of the ListPagesByContact operation returned by the service.
     * @sample AWSSSMContactsAsync.ListPagesByContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListPagesByContact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPagesByContactResult> listPagesByContactAsync(ListPagesByContactRequest listPagesByContactRequest);

    /**
     * <p>
     * Lists the engagements to a contact's contact channels.
     * </p>
     * 
     * @param listPagesByContactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPagesByContact operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.ListPagesByContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListPagesByContact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPagesByContactResult> listPagesByContactAsync(ListPagesByContactRequest listPagesByContactRequest,
            com.amazonaws.handlers.AsyncHandler<ListPagesByContactRequest, ListPagesByContactResult> asyncHandler);

    /**
     * <p>
     * Lists the engagements to contact channels that occurred by engaging a contact.
     * </p>
     * 
     * @param listPagesByEngagementRequest
     * @return A Java Future containing the result of the ListPagesByEngagement operation returned by the service.
     * @sample AWSSSMContactsAsync.ListPagesByEngagement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListPagesByEngagement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPagesByEngagementResult> listPagesByEngagementAsync(ListPagesByEngagementRequest listPagesByEngagementRequest);

    /**
     * <p>
     * Lists the engagements to contact channels that occurred by engaging a contact.
     * </p>
     * 
     * @param listPagesByEngagementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPagesByEngagement operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.ListPagesByEngagement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListPagesByEngagement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPagesByEngagementResult> listPagesByEngagementAsync(ListPagesByEngagementRequest listPagesByEngagementRequest,
            com.amazonaws.handlers.AsyncHandler<ListPagesByEngagementRequest, ListPagesByEngagementResult> asyncHandler);

    /**
     * <p>
     * Lists the tags of an escalation plan or contact.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSSSMContactsAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags of an escalation plan or contact.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Adds a resource to the specified contact or escalation plan.
     * </p>
     * 
     * @param putContactPolicyRequest
     * @return A Java Future containing the result of the PutContactPolicy operation returned by the service.
     * @sample AWSSSMContactsAsync.PutContactPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/PutContactPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutContactPolicyResult> putContactPolicyAsync(PutContactPolicyRequest putContactPolicyRequest);

    /**
     * <p>
     * Adds a resource to the specified contact or escalation plan.
     * </p>
     * 
     * @param putContactPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutContactPolicy operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.PutContactPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/PutContactPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutContactPolicyResult> putContactPolicyAsync(PutContactPolicyRequest putContactPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutContactPolicyRequest, PutContactPolicyResult> asyncHandler);

    /**
     * <p>
     * Sends an activation code to a contact channel. The contact can use this code to activate the contact channel in
     * the console or with the <code>ActivateChannel</code> action. Incident Manager can't engage a contact channel
     * until it has been activated.
     * </p>
     * 
     * @param sendActivationCodeRequest
     * @return A Java Future containing the result of the SendActivationCode operation returned by the service.
     * @sample AWSSSMContactsAsync.SendActivationCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/SendActivationCode"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendActivationCodeResult> sendActivationCodeAsync(SendActivationCodeRequest sendActivationCodeRequest);

    /**
     * <p>
     * Sends an activation code to a contact channel. The contact can use this code to activate the contact channel in
     * the console or with the <code>ActivateChannel</code> action. Incident Manager can't engage a contact channel
     * until it has been activated.
     * </p>
     * 
     * @param sendActivationCodeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendActivationCode operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.SendActivationCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/SendActivationCode"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendActivationCodeResult> sendActivationCodeAsync(SendActivationCodeRequest sendActivationCodeRequest,
            com.amazonaws.handlers.AsyncHandler<SendActivationCodeRequest, SendActivationCodeResult> asyncHandler);

    /**
     * <p>
     * Starts an engagement to a contact or escalation plan. The engagement engages each contact specified in the
     * incident.
     * </p>
     * 
     * @param startEngagementRequest
     * @return A Java Future containing the result of the StartEngagement operation returned by the service.
     * @sample AWSSSMContactsAsync.StartEngagement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/StartEngagement" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartEngagementResult> startEngagementAsync(StartEngagementRequest startEngagementRequest);

    /**
     * <p>
     * Starts an engagement to a contact or escalation plan. The engagement engages each contact specified in the
     * incident.
     * </p>
     * 
     * @param startEngagementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartEngagement operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.StartEngagement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/StartEngagement" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartEngagementResult> startEngagementAsync(StartEngagementRequest startEngagementRequest,
            com.amazonaws.handlers.AsyncHandler<StartEngagementRequest, StartEngagementResult> asyncHandler);

    /**
     * <p>
     * Stops an engagement before it finishes the final stage of the escalation plan or engagement plan. Further
     * contacts aren't engaged.
     * </p>
     * 
     * @param stopEngagementRequest
     * @return A Java Future containing the result of the StopEngagement operation returned by the service.
     * @sample AWSSSMContactsAsync.StopEngagement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/StopEngagement" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopEngagementResult> stopEngagementAsync(StopEngagementRequest stopEngagementRequest);

    /**
     * <p>
     * Stops an engagement before it finishes the final stage of the escalation plan or engagement plan. Further
     * contacts aren't engaged.
     * </p>
     * 
     * @param stopEngagementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopEngagement operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.StopEngagement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/StopEngagement" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopEngagementResult> stopEngagementAsync(StopEngagementRequest stopEngagementRequest,
            com.amazonaws.handlers.AsyncHandler<StopEngagementRequest, StopEngagementResult> asyncHandler);

    /**
     * <p>
     * Tags a contact or escalation plan. You can tag only contacts and escalation plans in the first region of your
     * replication set.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSSSMContactsAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tags a contact or escalation plan. You can tag only contacts and escalation plans in the first region of your
     * replication set.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSSSMContactsAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the contact or escalation plan specified.
     * </p>
     * 
     * @param updateContactRequest
     * @return A Java Future containing the result of the UpdateContact operation returned by the service.
     * @sample AWSSSMContactsAsync.UpdateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/UpdateContact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateContactResult> updateContactAsync(UpdateContactRequest updateContactRequest);

    /**
     * <p>
     * Updates the contact or escalation plan specified.
     * </p>
     * 
     * @param updateContactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateContact operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.UpdateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/UpdateContact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateContactResult> updateContactAsync(UpdateContactRequest updateContactRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateContactRequest, UpdateContactResult> asyncHandler);

    /**
     * <p>
     * Updates a contact's contact channel.
     * </p>
     * 
     * @param updateContactChannelRequest
     * @return A Java Future containing the result of the UpdateContactChannel operation returned by the service.
     * @sample AWSSSMContactsAsync.UpdateContactChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/UpdateContactChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateContactChannelResult> updateContactChannelAsync(UpdateContactChannelRequest updateContactChannelRequest);

    /**
     * <p>
     * Updates a contact's contact channel.
     * </p>
     * 
     * @param updateContactChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateContactChannel operation returned by the service.
     * @sample AWSSSMContactsAsyncHandler.UpdateContactChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/UpdateContactChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateContactChannelResult> updateContactChannelAsync(UpdateContactChannelRequest updateContactChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateContactChannelRequest, UpdateContactChannelResult> asyncHandler);

}
