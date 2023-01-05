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
package com.amazonaws.services.pinpointsmsvoicev2;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.pinpointsmsvoicev2.model.*;

/**
 * Interface for accessing Amazon Pinpoint SMS Voice V2.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.pinpointsmsvoicev2.AbstractAmazonPinpointSMSVoiceV2} instead.
 * </p>
 * <p>
 * <p>
 * Welcome to the <i>Amazon Pinpoint SMS and Voice, version 2 API Reference</i>. This guide provides information about
 * Amazon Pinpoint SMS and Voice, version 2 API resources, including supported HTTP methods, parameters, and schemas.
 * </p>
 * <p>
 * Amazon Pinpoint is an Amazon Web Services service that you can use to engage with your recipients across multiple
 * messaging channels. The Amazon Pinpoint SMS and Voice, version 2 API provides programmatic access to options that are
 * unique to the SMS and voice channels and supplements the resources provided by the Amazon Pinpoint API.
 * </p>
 * <p>
 * If you're new to Amazon Pinpoint, it's also helpful to review the <a
 * href="https://docs.aws.amazon.com/pinpoint/latest/developerguide/welcome.html"> Amazon Pinpoint Developer Guide</a>.
 * The <i>Amazon Pinpoint Developer Guide</i> provides tutorials, code samples, and procedures that demonstrate how to
 * use Amazon Pinpoint features programmatically and how to integrate Amazon Pinpoint functionality into mobile apps and
 * other types of applications. The guide also provides key information, such as Amazon Pinpoint integration with other
 * Amazon Web Services services, and the quotas that apply to use of the service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonPinpointSMSVoiceV2 {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "sms-voice";

    /**
     * <p>
     * Associates the specified origination identity with a pool.
     * </p>
     * <p>
     * If the origination identity is a phone number and is already associated with another pool, an Error is returned.
     * A sender ID can be associated with multiple pools.
     * </p>
     * <p>
     * If the origination identity configuration doesn't match the pool's configuration, an Error is returned.
     * </p>
     * 
     * @param associateOriginationIdentityRequest
     * @return Result of the AssociateOriginationIdentity operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.AssociateOriginationIdentity
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/AssociateOriginationIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateOriginationIdentityResult associateOriginationIdentity(AssociateOriginationIdentityRequest associateOriginationIdentityRequest);

    /**
     * <p>
     * Creates a new configuration set. After you create the configuration set, you can add one or more event
     * destinations to it.
     * </p>
     * <p>
     * A configuration set is a set of rules that you apply to the SMS and voice messages that you send.
     * </p>
     * <p>
     * When you send a message, you can optionally specify a single configuration set.
     * </p>
     * 
     * @param createConfigurationSetRequest
     * @return Result of the CreateConfigurationSet operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.CreateConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateConfigurationSet"
     *      target="_top">AWS API Documentation</a>
     */
    CreateConfigurationSetResult createConfigurationSet(CreateConfigurationSetRequest createConfigurationSetRequest);

    /**
     * <p>
     * Creates a new event destination in a configuration set.
     * </p>
     * <p>
     * An event destination is a location where you send message events. The event options are Amazon CloudWatch, Amazon
     * Kinesis Data Firehose, or Amazon SNS. For example, when a message is delivered successfully, you can send
     * information about that event to an event destination, or send notifications to endpoints that are subscribed to
     * an Amazon SNS topic.
     * </p>
     * <p>
     * Each configuration set can contain between 0 and 5 event destinations. Each event destination can contain a
     * reference to a single destination, such as a CloudWatch or Kinesis Data Firehose destination.
     * </p>
     * 
     * @param createEventDestinationRequest
     * @return Result of the CreateEventDestination operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.CreateEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    CreateEventDestinationResult createEventDestination(CreateEventDestinationRequest createEventDestinationRequest);

    /**
     * <p>
     * Creates a new opt-out list.
     * </p>
     * <p>
     * If the opt-out list name already exists, an Error is returned.
     * </p>
     * <p>
     * An opt-out list is a list of phone numbers that are opted out, meaning you can't send SMS or voice messages to
     * them. If end user replies with the keyword "STOP," an entry for the phone number is added to the opt-out list. In
     * addition to STOP, your recipients can use any supported opt-out keyword, such as CANCEL or OPTOUT. For a list of
     * supported opt-out keywords, see <a href=
     * "https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-manage.html#channels-sms-manage-optout"> SMS
     * opt out </a> in the <i>Amazon Pinpoint User Guide</i>.
     * </p>
     * 
     * @param createOptOutListRequest
     * @return Result of the CreateOptOutList operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.CreateOptOutList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateOptOutList"
     *      target="_top">AWS API Documentation</a>
     */
    CreateOptOutListResult createOptOutList(CreateOptOutListRequest createOptOutListRequest);

    /**
     * <p>
     * Creates a new pool and associates the specified origination identity to the pool. A pool can include one or more
     * phone numbers and SenderIds that are associated with your Amazon Web Services account.
     * </p>
     * <p>
     * The new pool inherits its configuration from the specified origination identity. This includes keywords, message
     * type, opt-out list, two-way configuration, and self-managed opt-out configuration. Deletion protection isn't
     * inherited from the origination identity and defaults to false.
     * </p>
     * <p>
     * If the origination identity is a phone number and is already associated with another pool, an Error is returned.
     * A sender ID can be associated with multiple pools.
     * </p>
     * 
     * @param createPoolRequest
     * @return Result of the CreatePool operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.CreatePool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreatePool"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePoolResult createPool(CreatePoolRequest createPoolRequest);

    /**
     * <p>
     * Deletes an existing configuration set.
     * </p>
     * <p>
     * A configuration set is a set of rules that you apply to voice and SMS messages that you send. In a configuration
     * set, you can specify a destination for specific types of events related to voice and SMS messages.
     * </p>
     * 
     * @param deleteConfigurationSetRequest
     * @return Result of the DeleteConfigurationSet operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DeleteConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteConfigurationSet"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConfigurationSetResult deleteConfigurationSet(DeleteConfigurationSetRequest deleteConfigurationSetRequest);

    /**
     * <p>
     * Deletes an existing default message type on a configuration set.
     * </p>
     * <p>
     * A message type is a type of messages that you plan to send. If you send account-related messages or
     * time-sensitive messages such as one-time passcodes, choose <b>Transactional</b>. If you plan to send messages
     * that contain marketing material or other promotional content, choose <b>Promotional</b>. This setting applies to
     * your entire Amazon Web Services account.
     * </p>
     * 
     * @param deleteDefaultMessageTypeRequest
     * @return Result of the DeleteDefaultMessageType operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DeleteDefaultMessageType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteDefaultMessageType"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDefaultMessageTypeResult deleteDefaultMessageType(DeleteDefaultMessageTypeRequest deleteDefaultMessageTypeRequest);

    /**
     * <p>
     * Deletes an existing default sender ID on a configuration set.
     * </p>
     * <p>
     * A default sender ID is the identity that appears on recipients' devices when they receive SMS messages. Support
     * for sender ID capabilities varies by country or region.
     * </p>
     * 
     * @param deleteDefaultSenderIdRequest
     * @return Result of the DeleteDefaultSenderId operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DeleteDefaultSenderId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteDefaultSenderId"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDefaultSenderIdResult deleteDefaultSenderId(DeleteDefaultSenderIdRequest deleteDefaultSenderIdRequest);

    /**
     * <p>
     * Deletes an existing event destination.
     * </p>
     * <p>
     * An event destination is a location where you send response information about the messages that you send. For
     * example, when a message is delivered successfully, you can send information about that event to an Amazon
     * CloudWatch destination, or send notifications to endpoints that are subscribed to an Amazon SNS topic.
     * </p>
     * 
     * @param deleteEventDestinationRequest
     * @return Result of the DeleteEventDestination operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DeleteEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEventDestinationResult deleteEventDestination(DeleteEventDestinationRequest deleteEventDestinationRequest);

    /**
     * <p>
     * Deletes an existing keyword from an origination phone number or pool.
     * </p>
     * <p>
     * A keyword is a word that you can search for on a particular phone number or pool. It is also a specific word or
     * phrase that an end user can send to your number to elicit a response, such as an informational message or a
     * special offer. When your number receives a message that begins with a keyword, Amazon Pinpoint responds with a
     * customizable message.
     * </p>
     * <p>
     * Keywords "HELP" and "STOP" can't be deleted or modified.
     * </p>
     * 
     * @param deleteKeywordRequest
     * @return Result of the DeleteKeyword operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DeleteKeyword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteKeyword"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteKeywordResult deleteKeyword(DeleteKeywordRequest deleteKeywordRequest);

    /**
     * <p>
     * Deletes an existing opt-out list. All opted out phone numbers in the opt-out list are deleted.
     * </p>
     * <p>
     * If the specified opt-out list name doesn't exist or is in-use by an origination phone number or pool, an Error is
     * returned.
     * </p>
     * 
     * @param deleteOptOutListRequest
     * @return Result of the DeleteOptOutList operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DeleteOptOutList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteOptOutList"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteOptOutListResult deleteOptOutList(DeleteOptOutListRequest deleteOptOutListRequest);

    /**
     * <p>
     * Deletes an existing opted out destination phone number from the specified opt-out list.
     * </p>
     * <p>
     * Each destination phone number can only be deleted once every 30 days.
     * </p>
     * <p>
     * If the specified destination phone number doesn't exist or if the opt-out list doesn't exist, an Error is
     * returned.
     * </p>
     * 
     * @param deleteOptedOutNumberRequest
     * @return Result of the DeleteOptedOutNumber operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DeleteOptedOutNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteOptedOutNumber"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteOptedOutNumberResult deleteOptedOutNumber(DeleteOptedOutNumberRequest deleteOptedOutNumberRequest);

    /**
     * <p>
     * Deletes an existing pool. Deleting a pool disassociates all origination identities from that pool.
     * </p>
     * <p>
     * If the pool status isn't active or if deletion protection is enabled, an Error is returned.
     * </p>
     * <p>
     * A pool is a collection of phone numbers and SenderIds. A pool can include one or more phone numbers and SenderIds
     * that are associated with your Amazon Web Services account.
     * </p>
     * 
     * @param deletePoolRequest
     * @return Result of the DeletePool operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DeletePool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeletePool"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePoolResult deletePool(DeletePoolRequest deletePoolRequest);

    /**
     * <p>
     * Deletes an account-level monthly spending limit override for sending text messages. Deleting a spend limit
     * override will set the <code>EnforcedLimit</code> to equal the <code>MaxLimit</code>, which is controlled by
     * Amazon Web Services. For more information on spend limits (quotas) see <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/developerguide/quotas.html">Amazon Pinpoint quotas </a> in the
     * <i>Amazon Pinpoint Developer Guide</i>.
     * </p>
     * 
     * @param deleteTextMessageSpendLimitOverrideRequest
     * @return Result of the DeleteTextMessageSpendLimitOverride operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DeleteTextMessageSpendLimitOverride
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteTextMessageSpendLimitOverride"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteTextMessageSpendLimitOverrideResult deleteTextMessageSpendLimitOverride(
            DeleteTextMessageSpendLimitOverrideRequest deleteTextMessageSpendLimitOverrideRequest);

    /**
     * <p>
     * Deletes an account level monthly spend limit override for sending voice messages. Deleting a spend limit override
     * sets the <code>EnforcedLimit</code> equal to the <code>MaxLimit</code>, which is controlled by Amazon Web
     * Services. For more information on spending limits (quotas) see <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/developerguide/quotas.html">Amazon Pinpoint quotas</a> in the
     * <i>Amazon Pinpoint Developer Guide</i>.
     * </p>
     * 
     * @param deleteVoiceMessageSpendLimitOverrideRequest
     * @return Result of the DeleteVoiceMessageSpendLimitOverride operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DeleteVoiceMessageSpendLimitOverride
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteVoiceMessageSpendLimitOverride"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVoiceMessageSpendLimitOverrideResult deleteVoiceMessageSpendLimitOverride(
            DeleteVoiceMessageSpendLimitOverrideRequest deleteVoiceMessageSpendLimitOverrideRequest);

    /**
     * <p>
     * Describes attributes of your Amazon Web Services account. The supported account attributes include account tier,
     * which indicates whether your account is in the sandbox or production environment. When you're ready to move your
     * account out of the sandbox, create an Amazon Web Services Support case for a service limit increase request.
     * </p>
     * <p>
     * New Amazon Pinpoint accounts are placed into an SMS or voice sandbox. The sandbox protects both Amazon Web
     * Services end recipients and SMS or voice recipients from fraud and abuse.
     * </p>
     * 
     * @param describeAccountAttributesRequest
     * @return Result of the DescribeAccountAttributes operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DescribeAccountAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeAccountAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAccountAttributesResult describeAccountAttributes(DescribeAccountAttributesRequest describeAccountAttributesRequest);

    /**
     * <p>
     * Describes the current Amazon Pinpoint SMS Voice V2 resource quotas for your account. The description for a quota
     * includes the quota name, current usage toward that quota, and the quota's maximum value.
     * </p>
     * <p>
     * When you establish an Amazon Web Services account, the account has initial quotas on the maximum number of
     * configuration sets, opt-out lists, phone numbers, and pools that you can create in a given Region. For more
     * information see <a href="https://docs.aws.amazon.com/pinpoint/latest/developerguide/quotas.html"> Amazon Pinpoint
     * quotas </a> in the <i>Amazon Pinpoint Developer Guide</i>.
     * </p>
     * 
     * @param describeAccountLimitsRequest
     * @return Result of the DescribeAccountLimits operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DescribeAccountLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeAccountLimits"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAccountLimitsResult describeAccountLimits(DescribeAccountLimitsRequest describeAccountLimitsRequest);

    /**
     * <p>
     * Describes the specified configuration sets or all in your account.
     * </p>
     * <p>
     * If you specify configuration set names, the output includes information for only the specified configuration
     * sets. If you specify filters, the output includes information for only those configuration sets that meet the
     * filter criteria. If you don't specify configuration set names or filters, the output includes information for all
     * configuration sets.
     * </p>
     * <p>
     * If you specify a configuration set name that isn't valid, an error is returned.
     * </p>
     * 
     * @param describeConfigurationSetsRequest
     * @return Result of the DescribeConfigurationSets operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DescribeConfigurationSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeConfigurationSets"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeConfigurationSetsResult describeConfigurationSets(DescribeConfigurationSetsRequest describeConfigurationSetsRequest);

    /**
     * <p>
     * Describes the specified keywords or all keywords on your origination phone number or pool.
     * </p>
     * <p>
     * A keyword is a word that you can search for on a particular phone number or pool. It is also a specific word or
     * phrase that an end user can send to your number to elicit a response, such as an informational message or a
     * special offer. When your number receives a message that begins with a keyword, Amazon Pinpoint responds with a
     * customizable message.
     * </p>
     * <p>
     * If you specify a keyword that isn't valid, an Error is returned.
     * </p>
     * 
     * @param describeKeywordsRequest
     * @return Result of the DescribeKeywords operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DescribeKeywords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeKeywords"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeKeywordsResult describeKeywords(DescribeKeywordsRequest describeKeywordsRequest);

    /**
     * <p>
     * Describes the specified opt-out list or all opt-out lists in your account.
     * </p>
     * <p>
     * If you specify opt-out list names, the output includes information for only the specified opt-out lists. Opt-out
     * lists include only those that meet the filter criteria. If you don't specify opt-out list names or filters, the
     * output includes information for all opt-out lists.
     * </p>
     * <p>
     * If you specify an opt-out list name that isn't valid, an Error is returned.
     * </p>
     * 
     * @param describeOptOutListsRequest
     * @return Result of the DescribeOptOutLists operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DescribeOptOutLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeOptOutLists"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeOptOutListsResult describeOptOutLists(DescribeOptOutListsRequest describeOptOutListsRequest);

    /**
     * <p>
     * Describes the specified opted out destination numbers or all opted out destination numbers in an opt-out list.
     * </p>
     * <p>
     * If you specify opted out numbers, the output includes information for only the specified opted out numbers. If
     * you specify filters, the output includes information for only those opted out numbers that meet the filter
     * criteria. If you don't specify opted out numbers or filters, the output includes information for all opted out
     * destination numbers in your opt-out list.
     * </p>
     * <p>
     * If you specify an opted out number that isn't valid, an Error is returned.
     * </p>
     * 
     * @param describeOptedOutNumbersRequest
     * @return Result of the DescribeOptedOutNumbers operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DescribeOptedOutNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeOptedOutNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeOptedOutNumbersResult describeOptedOutNumbers(DescribeOptedOutNumbersRequest describeOptedOutNumbersRequest);

    /**
     * <p>
     * Describes the specified origination phone number, or all the phone numbers in your account.
     * </p>
     * <p>
     * If you specify phone number IDs, the output includes information for only the specified phone numbers. If you
     * specify filters, the output includes information for only those phone numbers that meet the filter criteria. If
     * you don't specify phone number IDs or filters, the output includes information for all phone numbers.
     * </p>
     * <p>
     * If you specify a phone number ID that isn't valid, an Error is returned.
     * </p>
     * 
     * @param describePhoneNumbersRequest
     * @return Result of the DescribePhoneNumbers operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DescribePhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribePhoneNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePhoneNumbersResult describePhoneNumbers(DescribePhoneNumbersRequest describePhoneNumbersRequest);

    /**
     * <p>
     * Retrieves the specified pools or all pools associated with your Amazon Web Services account.
     * </p>
     * <p>
     * If you specify pool IDs, the output includes information for only the specified pools. If you specify filters,
     * the output includes information for only those pools that meet the filter criteria. If you don't specify pool IDs
     * or filters, the output includes information for all pools.
     * </p>
     * <p>
     * If you specify a pool ID that isn't valid, an Error is returned.
     * </p>
     * <p>
     * A pool is a collection of phone numbers and SenderIds. A pool can include one or more phone numbers and SenderIds
     * that are associated with your Amazon Web Services account.
     * </p>
     * 
     * @param describePoolsRequest
     * @return Result of the DescribePools operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DescribePools
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribePools"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePoolsResult describePools(DescribePoolsRequest describePoolsRequest);

    /**
     * <p>
     * Describes the specified SenderIds or all SenderIds associated with your Amazon Web Services account.
     * </p>
     * <p>
     * If you specify SenderIds, the output includes information for only the specified SenderIds. If you specify
     * filters, the output includes information for only those SenderIds that meet the filter criteria. If you don't
     * specify SenderIds or filters, the output includes information for all SenderIds.
     * </p>
     * <p>
     * f you specify a sender ID that isn't valid, an Error is returned.
     * </p>
     * 
     * @param describeSenderIdsRequest
     * @return Result of the DescribeSenderIds operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DescribeSenderIds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeSenderIds"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSenderIdsResult describeSenderIds(DescribeSenderIdsRequest describeSenderIdsRequest);

    /**
     * <p>
     * Describes the current Amazon Pinpoint monthly spend limits for sending voice and text messages.
     * </p>
     * <p>
     * When you establish an Amazon Web Services account, the account has initial monthly spend limit in a given Region.
     * For more information on increasing your monthly spend limit, see <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-awssupport-spend-threshold.html">
     * Requesting increases to your monthly SMS spending quota for Amazon Pinpoint </a> in the <i>Amazon Pinpoint User
     * Guide</i>.
     * </p>
     * 
     * @param describeSpendLimitsRequest
     * @return Result of the DescribeSpendLimits operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DescribeSpendLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeSpendLimits"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSpendLimitsResult describeSpendLimits(DescribeSpendLimitsRequest describeSpendLimitsRequest);

    /**
     * <p>
     * Removes the specified origination identity from an existing pool.
     * </p>
     * <p>
     * If the origination identity isn't associated with the specified pool, an Error is returned.
     * </p>
     * 
     * @param disassociateOriginationIdentityRequest
     * @return Result of the DisassociateOriginationIdentity operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DisassociateOriginationIdentity
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DisassociateOriginationIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateOriginationIdentityResult disassociateOriginationIdentity(DisassociateOriginationIdentityRequest disassociateOriginationIdentityRequest);

    /**
     * <p>
     * Lists all associated origination identities in your pool.
     * </p>
     * <p>
     * If you specify filters, the output includes information for only those origination identities that meet the
     * filter criteria.
     * </p>
     * 
     * @param listPoolOriginationIdentitiesRequest
     * @return Result of the ListPoolOriginationIdentities operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.ListPoolOriginationIdentities
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/ListPoolOriginationIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    ListPoolOriginationIdentitiesResult listPoolOriginationIdentities(ListPoolOriginationIdentitiesRequest listPoolOriginationIdentitiesRequest);

    /**
     * <p>
     * List all tags associated with a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Creates or updates a keyword configuration on an origination phone number or pool.
     * </p>
     * <p>
     * A keyword is a word that you can search for on a particular phone number or pool. It is also a specific word or
     * phrase that an end user can send to your number to elicit a response, such as an informational message or a
     * special offer. When your number receives a message that begins with a keyword, Amazon Pinpoint responds with a
     * customizable message.
     * </p>
     * <p>
     * If you specify a keyword that isn't valid, an Error is returned.
     * </p>
     * 
     * @param putKeywordRequest
     * @return Result of the PutKeyword operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.PutKeyword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/PutKeyword"
     *      target="_top">AWS API Documentation</a>
     */
    PutKeywordResult putKeyword(PutKeywordRequest putKeywordRequest);

    /**
     * <p>
     * Creates an opted out destination phone number in the opt-out list.
     * </p>
     * <p>
     * If the destination phone number isn't valid or if the specified opt-out list doesn't exist, an Error is returned.
     * </p>
     * 
     * @param putOptedOutNumberRequest
     * @return Result of the PutOptedOutNumber operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.PutOptedOutNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/PutOptedOutNumber"
     *      target="_top">AWS API Documentation</a>
     */
    PutOptedOutNumberResult putOptedOutNumber(PutOptedOutNumberRequest putOptedOutNumberRequest);

    /**
     * <p>
     * Releases an existing origination phone number in your account. Once released, a phone number is no longer
     * available for sending messages.
     * </p>
     * <p>
     * If the origination phone number has deletion protection enabled or is associated with a pool, an Error is
     * returned.
     * </p>
     * 
     * @param releasePhoneNumberRequest
     * @return Result of the ReleasePhoneNumber operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.ReleasePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/ReleasePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    ReleasePhoneNumberResult releasePhoneNumber(ReleasePhoneNumberRequest releasePhoneNumberRequest);

    /**
     * <p>
     * Request an origination phone number for use in your account. For more information on phone number request see <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/userguide/settings-sms-request-number.html"> Requesting a
     * number </a> in the <i>Amazon Pinpoint User Guide</i>.
     * </p>
     * 
     * @param requestPhoneNumberRequest
     * @return Result of the RequestPhoneNumber operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.RequestPhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/RequestPhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    RequestPhoneNumberResult requestPhoneNumber(RequestPhoneNumberRequest requestPhoneNumberRequest);

    /**
     * <p>
     * Creates a new text message and sends it to a recipient's phone number.
     * </p>
     * <p>
     * SMS throughput limits are measured in Message Parts per Second (MPS). Your MPS limit depends on the destination
     * country of your messages, as well as the type of phone number (origination number) that you use to send the
     * message. For more information, see <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-limitations-mps.html">Message Parts per
     * Second (MPS) limits</a> in the <i>Amazon Pinpoint User Guide</i>.
     * </p>
     * 
     * @param sendTextMessageRequest
     * @return Result of the SendTextMessage operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.SendTextMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SendTextMessage"
     *      target="_top">AWS API Documentation</a>
     */
    SendTextMessageResult sendTextMessage(SendTextMessageRequest sendTextMessageRequest);

    /**
     * <p>
     * Allows you to send a request that sends a text message through Amazon Pinpoint. This operation uses <a
     * href="http://aws.amazon.com/polly/">Amazon Polly</a> to convert a text script into a voice message.
     * </p>
     * 
     * @param sendVoiceMessageRequest
     * @return Result of the SendVoiceMessage operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.SendVoiceMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SendVoiceMessage"
     *      target="_top">AWS API Documentation</a>
     */
    SendVoiceMessageResult sendVoiceMessage(SendVoiceMessageRequest sendVoiceMessageRequest);

    /**
     * <p>
     * Sets the default message type on a configuration set.
     * </p>
     * <p>
     * Choose the category of SMS messages that you plan to send from this account. If you send account-related messages
     * or time-sensitive messages such as one-time passcodes, choose <b>Transactional</b>. If you plan to send messages
     * that contain marketing material or other promotional content, choose <b>Promotional</b>. This setting applies to
     * your entire Amazon Web Services account.
     * </p>
     * 
     * @param setDefaultMessageTypeRequest
     * @return Result of the SetDefaultMessageType operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.SetDefaultMessageType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SetDefaultMessageType"
     *      target="_top">AWS API Documentation</a>
     */
    SetDefaultMessageTypeResult setDefaultMessageType(SetDefaultMessageTypeRequest setDefaultMessageTypeRequest);

    /**
     * <p>
     * Sets default sender ID on a configuration set.
     * </p>
     * <p>
     * When sending a text message to a destination country that supports sender IDs, the default sender ID on the
     * configuration set specified will be used if no dedicated origination phone numbers or registered sender IDs are
     * available in your account.
     * </p>
     * 
     * @param setDefaultSenderIdRequest
     * @return Result of the SetDefaultSenderId operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.SetDefaultSenderId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SetDefaultSenderId"
     *      target="_top">AWS API Documentation</a>
     */
    SetDefaultSenderIdResult setDefaultSenderId(SetDefaultSenderIdRequest setDefaultSenderIdRequest);

    /**
     * <p>
     * Sets an account level monthly spend limit override for sending text messages. The requested spend limit must be
     * less than or equal to the <code>MaxLimit</code>, which is set by Amazon Web Services.
     * </p>
     * 
     * @param setTextMessageSpendLimitOverrideRequest
     * @return Result of the SetTextMessageSpendLimitOverride operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.SetTextMessageSpendLimitOverride
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SetTextMessageSpendLimitOverride"
     *      target="_top">AWS API Documentation</a>
     */
    SetTextMessageSpendLimitOverrideResult setTextMessageSpendLimitOverride(SetTextMessageSpendLimitOverrideRequest setTextMessageSpendLimitOverrideRequest);

    /**
     * <p>
     * Sets an account level monthly spend limit override for sending voice messages. The requested spend limit must be
     * less than or equal to the <code>MaxLimit</code>, which is set by Amazon Web Services.
     * </p>
     * 
     * @param setVoiceMessageSpendLimitOverrideRequest
     * @return Result of the SetVoiceMessageSpendLimitOverride operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.SetVoiceMessageSpendLimitOverride
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SetVoiceMessageSpendLimitOverride"
     *      target="_top">AWS API Documentation</a>
     */
    SetVoiceMessageSpendLimitOverrideResult setVoiceMessageSpendLimitOverride(SetVoiceMessageSpendLimitOverrideRequest setVoiceMessageSpendLimitOverrideRequest);

    /**
     * <p>
     * Adds or overwrites only the specified tags for the specified Amazon Pinpoint SMS Voice, version 2 resource. When
     * you specify an existing tag key, the value is overwritten with the new value. Each resource can have a maximum of
     * 50 tags. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more
     * information about tags, see <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/developerguide/tagging-resources.html"> Tagging Amazon Pinpoint
     * resources</a> in the <i>Amazon Pinpoint Developer Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the association of the specified tags from an Amazon Pinpoint SMS Voice V2 resource. For more information
     * on tags see <a href="https://docs.aws.amazon.com/pinpoint/latest/developerguide/tagging-resources.html"> Tagging
     * Amazon Pinpoint resources</a> in the <i>Amazon Pinpoint Developer Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an existing event destination in a configuration set. You can update the IAM role ARN for CloudWatch Logs
     * and Kinesis Data Firehose. You can also enable or disable the event destination.
     * </p>
     * <p>
     * You may want to update an event destination to change its matching event types or updating the destination
     * resource ARN. You can't change an event destination's type between CloudWatch Logs, Kinesis Data Firehose, and
     * Amazon SNS.
     * </p>
     * 
     * @param updateEventDestinationRequest
     * @return Result of the UpdateEventDestination operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.UpdateEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UpdateEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateEventDestinationResult updateEventDestination(UpdateEventDestinationRequest updateEventDestinationRequest);

    /**
     * <p>
     * Updates the configuration of an existing origination phone number. You can update the opt-out list, enable or
     * disable two-way messaging, change the TwoWayChannelArn, enable or disable self-managed opt-outs, and enable or
     * disable deletion protection.
     * </p>
     * <p>
     * If the origination phone number is associated with a pool, an Error is returned.
     * </p>
     * 
     * @param updatePhoneNumberRequest
     * @return Result of the UpdatePhoneNumber operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.UpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UpdatePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePhoneNumberResult updatePhoneNumber(UpdatePhoneNumberRequest updatePhoneNumberRequest);

    /**
     * <p>
     * Updates the configuration of an existing pool. You can update the opt-out list, enable or disable two-way
     * messaging, change the <code>TwoWayChannelArn</code>, enable or disable self-managed opt-outs, enable or disable
     * deletion protection, and enable or disable shared routes.
     * </p>
     * 
     * @param updatePoolRequest
     * @return Result of the UpdatePool operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.UpdatePool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UpdatePool"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePoolResult updatePool(UpdatePoolRequest updatePoolRequest);

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
