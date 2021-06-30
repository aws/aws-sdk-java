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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.ssmcontacts.model.*;

/**
 * Interface for accessing SSM Contacts.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ssmcontacts.AbstractAWSSSMContacts} instead.
 * </p>
 * <p>
 * <p/>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSSMContacts {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "ssm-contacts";

    /**
     * <p>
     * Used to acknowledge an engagement to a contact channel during an incident.
     * </p>
     * 
     * @param acceptPageRequest
     * @return Result of the AcceptPage operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.AcceptPage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/AcceptPage" target="_top">AWS API
     *      Documentation</a>
     */
    AcceptPageResult acceptPage(AcceptPageRequest acceptPageRequest);

    /**
     * <p>
     * Activates a contact's contact channel. Incident Manager can't engage a contact until the contact channel has been
     * activated.
     * </p>
     * 
     * @param activateContactChannelRequest
     * @return Result of the ActivateContactChannel operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.ActivateContactChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ActivateContactChannel"
     *      target="_top">AWS API Documentation</a>
     */
    ActivateContactChannelResult activateContactChannel(ActivateContactChannelRequest activateContactChannelRequest);

    /**
     * <p>
     * Contacts are either the contacts that Incident Manager engages during an incident or the escalation plans that
     * Incident Manager uses to engage contacts in phases during an incident.
     * </p>
     * 
     * @param createContactRequest
     * @return Result of the CreateContact operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ConflictException
     *         Updating or deleting a resource causes an inconsistent state.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws DataEncryptionException
     *         The action failed to due an encryption key error.
     * @sample AWSSSMContacts.CreateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/CreateContact" target="_top">AWS API
     *      Documentation</a>
     */
    CreateContactResult createContact(CreateContactRequest createContactRequest);

    /**
     * <p>
     * A contact channel is the method that Incident Manager uses to engage your contact.
     * </p>
     * 
     * @param createContactChannelRequest
     * @return Result of the CreateContactChannel operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ConflictException
     *         Updating or deleting a resource causes an inconsistent state.
     * @throws DataEncryptionException
     *         The action failed to due an encryption key error.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.CreateContactChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/CreateContactChannel"
     *      target="_top">AWS API Documentation</a>
     */
    CreateContactChannelResult createContactChannel(CreateContactChannelRequest createContactChannelRequest);

    /**
     * <p>
     * To no longer receive Incident Manager engagements to a contact channel, you can deactivate the channel.
     * </p>
     * 
     * @param deactivateContactChannelRequest
     * @return Result of the DeactivateContactChannel operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.DeactivateContactChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/DeactivateContactChannel"
     *      target="_top">AWS API Documentation</a>
     */
    DeactivateContactChannelResult deactivateContactChannel(DeactivateContactChannelRequest deactivateContactChannelRequest);

    /**
     * <p>
     * To remove a contact from Incident Manager, you can delete the contact. Deleting a contact removes them from all
     * escalation plans and related response plans. Deleting an escalation plan removes it from all related response
     * plans. You will have to recreate the contact and its contact channels before you can use it again.
     * </p>
     * 
     * @param deleteContactRequest
     * @return Result of the DeleteContact operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.DeleteContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/DeleteContact" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteContactResult deleteContact(DeleteContactRequest deleteContactRequest);

    /**
     * <p>
     * To no longer receive engagements on a contact channel, you can delete the channel from a contact. Deleting the
     * contact channel removes it from the contact's engagement plan. If you delete the only contact channel for a
     * contact, you won't be able to engage that contact during an incident.
     * </p>
     * 
     * @param deleteContactChannelRequest
     * @return Result of the DeleteContactChannel operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.DeleteContactChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/DeleteContactChannel"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteContactChannelResult deleteContactChannel(DeleteContactChannelRequest deleteContactChannelRequest);

    /**
     * <p>
     * Incident Manager uses engagements to engage contacts and escalation plans during an incident. Use this command to
     * describe the engagement that occurred during an incident.
     * </p>
     * 
     * @param describeEngagementRequest
     * @return Result of the DescribeEngagement operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws DataEncryptionException
     *         The action failed to due an encryption key error.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.DescribeEngagement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/DescribeEngagement"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEngagementResult describeEngagement(DescribeEngagementRequest describeEngagementRequest);

    /**
     * <p>
     * Lists details of the engagement to a contact channel.
     * </p>
     * 
     * @param describePageRequest
     * @return Result of the DescribePage operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws DataEncryptionException
     *         The action failed to due an encryption key error.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.DescribePage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/DescribePage" target="_top">AWS API
     *      Documentation</a>
     */
    DescribePageResult describePage(DescribePageRequest describePageRequest);

    /**
     * <p>
     * Retrieves information about the specified contact or escalation plan.
     * </p>
     * 
     * @param getContactRequest
     * @return Result of the GetContact operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws DataEncryptionException
     *         The action failed to due an encryption key error.
     * @sample AWSSSMContacts.GetContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/GetContact" target="_top">AWS API
     *      Documentation</a>
     */
    GetContactResult getContact(GetContactRequest getContactRequest);

    /**
     * <p>
     * List details about a specific contact channel.
     * </p>
     * 
     * @param getContactChannelRequest
     * @return Result of the GetContactChannel operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws DataEncryptionException
     *         The action failed to due an encryption key error.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.GetContactChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/GetContactChannel" target="_top">AWS
     *      API Documentation</a>
     */
    GetContactChannelResult getContactChannel(GetContactChannelRequest getContactChannelRequest);

    /**
     * <p>
     * Retrieves the resource policies attached to the specified contact or escalation plan.
     * </p>
     * 
     * @param getContactPolicyRequest
     * @return Result of the GetContactPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.GetContactPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/GetContactPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    GetContactPolicyResult getContactPolicy(GetContactPolicyRequest getContactPolicyRequest);

    /**
     * <p>
     * Lists all contact channels for the specified contact.
     * </p>
     * 
     * @param listContactChannelsRequest
     * @return Result of the ListContactChannels operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws DataEncryptionException
     *         The action failed to due an encryption key error.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.ListContactChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListContactChannels"
     *      target="_top">AWS API Documentation</a>
     */
    ListContactChannelsResult listContactChannels(ListContactChannelsRequest listContactChannelsRequest);

    /**
     * <p>
     * Lists all contacts and escalation plans in Incident Manager.
     * </p>
     * 
     * @param listContactsRequest
     * @return Result of the ListContacts operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.ListContacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListContacts" target="_top">AWS API
     *      Documentation</a>
     */
    ListContactsResult listContacts(ListContactsRequest listContactsRequest);

    /**
     * <p>
     * Lists all engagements that have happened in an incident.
     * </p>
     * 
     * @param listEngagementsRequest
     * @return Result of the ListEngagements operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.ListEngagements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListEngagements" target="_top">AWS
     *      API Documentation</a>
     */
    ListEngagementsResult listEngagements(ListEngagementsRequest listEngagementsRequest);

    /**
     * <p>
     * Lists all of the engagements to contact channels that have been acknowledged.
     * </p>
     * 
     * @param listPageReceiptsRequest
     * @return Result of the ListPageReceipts operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.ListPageReceipts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListPageReceipts" target="_top">AWS
     *      API Documentation</a>
     */
    ListPageReceiptsResult listPageReceipts(ListPageReceiptsRequest listPageReceiptsRequest);

    /**
     * <p>
     * Lists the engagements to a contact's contact channels.
     * </p>
     * 
     * @param listPagesByContactRequest
     * @return Result of the ListPagesByContact operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.ListPagesByContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListPagesByContact"
     *      target="_top">AWS API Documentation</a>
     */
    ListPagesByContactResult listPagesByContact(ListPagesByContactRequest listPagesByContactRequest);

    /**
     * <p>
     * Lists the engagements to contact channels that occurred by engaging a contact.
     * </p>
     * 
     * @param listPagesByEngagementRequest
     * @return Result of the ListPagesByEngagement operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.ListPagesByEngagement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListPagesByEngagement"
     *      target="_top">AWS API Documentation</a>
     */
    ListPagesByEngagementResult listPagesByEngagement(ListPagesByEngagementRequest listPagesByEngagementRequest);

    /**
     * <p>
     * Lists the tags of an escalation plan or contact.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @sample AWSSSMContacts.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Adds a resource to the specified contact or escalation plan.
     * </p>
     * 
     * @param putContactPolicyRequest
     * @return Result of the PutContactPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ConflictException
     *         Updating or deleting a resource causes an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @sample AWSSSMContacts.PutContactPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/PutContactPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    PutContactPolicyResult putContactPolicy(PutContactPolicyRequest putContactPolicyRequest);

    /**
     * <p>
     * Sends an activation code to a contact channel. The contact can use this code to activate the contact channel in
     * the console or with the <code>ActivateChannel</code> action. Incident Manager can't engage a contact channel
     * until it has been activated.
     * </p>
     * 
     * @param sendActivationCodeRequest
     * @return Result of the SendActivationCode operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws DataEncryptionException
     *         The action failed to due an encryption key error.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.SendActivationCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/SendActivationCode"
     *      target="_top">AWS API Documentation</a>
     */
    SendActivationCodeResult sendActivationCode(SendActivationCodeRequest sendActivationCodeRequest);

    /**
     * <p>
     * Starts an engagement to a contact or escalation plan. The engagement engages each contact specified in the
     * incident.
     * </p>
     * 
     * @param startEngagementRequest
     * @return Result of the StartEngagement operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws DataEncryptionException
     *         The action failed to due an encryption key error.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.StartEngagement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/StartEngagement" target="_top">AWS
     *      API Documentation</a>
     */
    StartEngagementResult startEngagement(StartEngagementRequest startEngagementRequest);

    /**
     * <p>
     * Stops an engagement before it finishes the final stage of the escalation plan or engagement plan. Further
     * contacts aren't engaged.
     * </p>
     * 
     * @param stopEngagementRequest
     * @return Result of the StopEngagement operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @sample AWSSSMContacts.StopEngagement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/StopEngagement" target="_top">AWS
     *      API Documentation</a>
     */
    StopEngagementResult stopEngagement(StopEngagementRequest stopEngagementRequest);

    /**
     * <p>
     * Tags a contact or escalation plan. You can tag only contacts and escalation plans in the first region of your
     * replication set.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @sample AWSSSMContacts.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the contact or escalation plan specified.
     * </p>
     * 
     * @param updateContactRequest
     * @return Result of the UpdateContact operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws DataEncryptionException
     *         The action failed to due an encryption key error.
     * @sample AWSSSMContacts.UpdateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/UpdateContact" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateContactResult updateContact(UpdateContactRequest updateContactRequest);

    /**
     * <p>
     * Updates a contact's contact channel.
     * </p>
     * 
     * @param updateContactChannelRequest
     * @return Result of the UpdateContactChannel operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ConflictException
     *         Updating or deleting a resource causes an inconsistent state.
     * @throws DataEncryptionException
     *         The action failed to due an encryption key error.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.UpdateContactChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/UpdateContactChannel"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateContactChannelResult updateContactChannel(UpdateContactChannelRequest updateContactChannelRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
