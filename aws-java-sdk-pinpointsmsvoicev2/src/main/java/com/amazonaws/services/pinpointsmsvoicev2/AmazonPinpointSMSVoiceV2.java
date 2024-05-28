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
 * unique to the SMS and voice channels. Amazon Pinpoint SMS and Voice, version 2 resources such as phone numbers,
 * sender IDs, and opt-out lists can be used by the Amazon Pinpoint API.
 * </p>
 * <p>
 * If you're new to Amazon Pinpoint SMS, it's also helpful to review the <a
 * href="https://docs.aws.amazon.com/sms-voice/latest/userguide/what-is-service.html"> Amazon Pinpoint SMS User
 * Guide</a>. The <i>Amazon Pinpoint Developer Guide</i> provides tutorials, code samples, and procedures that
 * demonstrate how to use Amazon Pinpoint SMS features programmatically and how to integrate Amazon Pinpoint
 * functionality into mobile apps and other types of applications. The guide also provides key information, such as
 * Amazon Pinpoint integration with other Amazon Web Services services, and the quotas that apply to use of the service.
 * </p>
 * <p>
 * <b>Regional availability</b>
 * </p>
 * <p>
 * The <i>Amazon Pinpoint SMS and Voice, version 2 API Reference</i> is available in several Amazon Web Services Regions
 * and it provides an endpoint for each of these Regions. For a list of all the Regions and endpoints where the API is
 * currently available, see <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#pinpoint_region">Amazon
 * Web Services Service Endpoints</a> and <a href="https://docs.aws.amazon.com/general/latest/gr/pinpoint.html">Amazon
 * Pinpoint endpoints and quotas</a> in the Amazon Web Services General Reference. To learn more about Amazon Web
 * Services Regions, see <a href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html">Managing Amazon Web
 * Services Regions</a> in the Amazon Web Services General Reference.
 * </p>
 * <p>
 * In each Region, Amazon Web Services maintains multiple Availability Zones. These Availability Zones are physically
 * isolated from each other, but are united by private, low-latency, high-throughput, and highly redundant network
 * connections. These Availability Zones enable us to provide very high levels of availability and redundancy, while
 * also minimizing latency. To learn more about the number of Availability Zones that are available in each Region, see
 * <a href="https://aws.amazon.com/about-aws/global-infrastructure/">Amazon Web Services Global Infrastructure.</a>
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
     * If the origination identity is a phone number and is already associated with another pool, an error is returned.
     * A sender ID can be associated with multiple pools.
     * </p>
     * <p>
     * If the origination identity configuration doesn't match the pool's configuration, an error is returned.
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
     * Associate a protect configuration with a configuration set. This replaces the configuration sets current protect
     * configuration. A configuration set can only be associated with one protect configuration at a time. A protect
     * configuration can be associated with multiple configuration sets.
     * </p>
     * 
     * @param associateProtectConfigurationRequest
     * @return Result of the AssociateProtectConfiguration operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.AssociateProtectConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/AssociateProtectConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateProtectConfigurationResult associateProtectConfiguration(AssociateProtectConfigurationRequest associateProtectConfigurationRequest);

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
     * If the opt-out list name already exists, an error is returned.
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
     * If the origination identity is a phone number and is already associated with another pool, an error is returned.
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
     * Create a new protect configuration. By default all country rule sets for each capability are set to
     * <code>ALLOW</code>. Update the country rule sets using <code>UpdateProtectConfigurationCountryRuleSet</code>. A
     * protect configurations name is stored as a Tag with the key set to <code>Name</code> and value as the name of the
     * protect configuration.
     * </p>
     * 
     * @param createProtectConfigurationRequest
     * @return Result of the CreateProtectConfiguration operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.CreateProtectConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateProtectConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateProtectConfigurationResult createProtectConfiguration(CreateProtectConfigurationRequest createProtectConfigurationRequest);

    /**
     * <p>
     * Creates a new registration based on the <b>RegistrationType</b> field.
     * </p>
     * 
     * @param createRegistrationRequest
     * @return Result of the CreateRegistration operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.CreateRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateRegistrationResult createRegistration(CreateRegistrationRequest createRegistrationRequest);

    /**
     * <p>
     * Associate the registration with an origination identity such as a phone number or sender ID.
     * </p>
     * 
     * @param createRegistrationAssociationRequest
     * @return Result of the CreateRegistrationAssociation operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.CreateRegistrationAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateRegistrationAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    CreateRegistrationAssociationResult createRegistrationAssociation(CreateRegistrationAssociationRequest createRegistrationAssociationRequest);

    /**
     * <p>
     * Create a new registration attachment to use for uploading a file or a URL to a file. The maximum file size is
     * 1MiB and valid file extensions are PDF, JPEG and PNG. For example, many sender ID registrations require a signed
     * “letter of authorization” (LOA) to be submitted.
     * </p>
     * 
     * @param createRegistrationAttachmentRequest
     * @return Result of the CreateRegistrationAttachment operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.CreateRegistrationAttachment
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateRegistrationAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    CreateRegistrationAttachmentResult createRegistrationAttachment(CreateRegistrationAttachmentRequest createRegistrationAttachmentRequest);

    /**
     * <p>
     * Create a new version of the registration and increase the <b>VersionNumber</b>. The previous version of the
     * registration becomes read-only.
     * </p>
     * 
     * @param createRegistrationVersionRequest
     * @return Result of the CreateRegistrationVersion operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.CreateRegistrationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateRegistrationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateRegistrationVersionResult createRegistrationVersion(CreateRegistrationVersionRequest createRegistrationVersionRequest);

    /**
     * <p>
     * You can only send messages to verified destination numbers when your account is in the sandbox. You can add up to
     * 10 verified destination numbers.
     * </p>
     * 
     * @param createVerifiedDestinationNumberRequest
     * @return Result of the CreateVerifiedDestinationNumber operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.CreateVerifiedDestinationNumber
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateVerifiedDestinationNumber"
     *      target="_top">AWS API Documentation</a>
     */
    CreateVerifiedDestinationNumberResult createVerifiedDestinationNumber(CreateVerifiedDestinationNumberRequest createVerifiedDestinationNumberRequest);

    /**
     * <p>
     * Removes the current account default protect configuration.
     * </p>
     * 
     * @param deleteAccountDefaultProtectConfigurationRequest
     * @return Result of the DeleteAccountDefaultProtectConfiguration operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.DeleteAccountDefaultProtectConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteAccountDefaultProtectConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAccountDefaultProtectConfigurationResult deleteAccountDefaultProtectConfiguration(
            DeleteAccountDefaultProtectConfigurationRequest deleteAccountDefaultProtectConfigurationRequest);

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
     * Deletes an account-level monthly spending limit override for sending multimedia messages (MMS). Deleting a spend
     * limit override will set the <code>EnforcedLimit</code> to equal the <code>MaxLimit</code>, which is controlled by
     * Amazon Web Services. For more information on spend limits (quotas) see <a
     * href="https://docs.aws.amazon.com/sms-voice/latest/userguide/quotas.html">Quotas for Server Migration Service</a>
     * in the <i>Server Migration Service User Guide</i>.
     * </p>
     * 
     * @param deleteMediaMessageSpendLimitOverrideRequest
     * @return Result of the DeleteMediaMessageSpendLimitOverride operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DeleteMediaMessageSpendLimitOverride
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteMediaMessageSpendLimitOverride"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteMediaMessageSpendLimitOverrideResult deleteMediaMessageSpendLimitOverride(
            DeleteMediaMessageSpendLimitOverrideRequest deleteMediaMessageSpendLimitOverrideRequest);

    /**
     * <p>
     * Deletes an existing opt-out list. All opted out phone numbers in the opt-out list are deleted.
     * </p>
     * <p>
     * If the specified opt-out list name doesn't exist or is in-use by an origination phone number or pool, an error is
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
     * If the specified destination phone number doesn't exist or if the opt-out list doesn't exist, an error is
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
     * If the pool status isn't active or if deletion protection is enabled, an error is returned.
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
     * Permanently delete the protect configuration. The protect configuration must have deletion protection disabled
     * and must not be associated as the account default protect configuration or associated with a configuration set.
     * </p>
     * 
     * @param deleteProtectConfigurationRequest
     * @return Result of the DeleteProtectConfiguration operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.DeleteProtectConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteProtectConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteProtectConfigurationResult deleteProtectConfiguration(DeleteProtectConfigurationRequest deleteProtectConfigurationRequest);

    /**
     * <p>
     * Permanently delete an existing registration from your account.
     * </p>
     * 
     * @param deleteRegistrationRequest
     * @return Result of the DeleteRegistration operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.DeleteRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRegistrationResult deleteRegistration(DeleteRegistrationRequest deleteRegistrationRequest);

    /**
     * <p>
     * Permanently delete the specified registration attachment.
     * </p>
     * 
     * @param deleteRegistrationAttachmentRequest
     * @return Result of the DeleteRegistrationAttachment operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.DeleteRegistrationAttachment
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteRegistrationAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRegistrationAttachmentResult deleteRegistrationAttachment(DeleteRegistrationAttachmentRequest deleteRegistrationAttachmentRequest);

    /**
     * <p>
     * Delete the value in a registration form field.
     * </p>
     * 
     * @param deleteRegistrationFieldValueRequest
     * @return Result of the DeleteRegistrationFieldValue operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.DeleteRegistrationFieldValue
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteRegistrationFieldValue"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRegistrationFieldValueResult deleteRegistrationFieldValue(DeleteRegistrationFieldValueRequest deleteRegistrationFieldValueRequest);

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
     * Delete a verified destination phone number.
     * </p>
     * 
     * @param deleteVerifiedDestinationNumberRequest
     * @return Result of the DeleteVerifiedDestinationNumber operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.DeleteVerifiedDestinationNumber
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteVerifiedDestinationNumber"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVerifiedDestinationNumberResult deleteVerifiedDestinationNumber(DeleteVerifiedDestinationNumberRequest deleteVerifiedDestinationNumberRequest);

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
     * If you specify a keyword that isn't valid, an error is returned.
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
     * If you specify an opt-out list name that isn't valid, an error is returned.
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
     * If you specify an opted out number that isn't valid, an error is returned.
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
     * If you specify a phone number ID that isn't valid, an error is returned.
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
     * If you specify a pool ID that isn't valid, an error is returned.
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
     * Retrieves the protect configurations that match any of filters. If a filter isn’t provided then all protect
     * configurations are returned.
     * </p>
     * 
     * @param describeProtectConfigurationsRequest
     * @return Result of the DescribeProtectConfigurations operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.DescribeProtectConfigurations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeProtectConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeProtectConfigurationsResult describeProtectConfigurations(DescribeProtectConfigurationsRequest describeProtectConfigurationsRequest);

    /**
     * <p>
     * Retrieves the specified registration attachments or all registration attachments associated with your Amazon Web
     * Services account.
     * </p>
     * 
     * @param describeRegistrationAttachmentsRequest
     * @return Result of the DescribeRegistrationAttachments operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.DescribeRegistrationAttachments
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeRegistrationAttachments"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRegistrationAttachmentsResult describeRegistrationAttachments(DescribeRegistrationAttachmentsRequest describeRegistrationAttachmentsRequest);

    /**
     * <p>
     * Retrieves the specified registration type field definitions. You can use DescribeRegistrationFieldDefinitions to
     * view the requirements for creating, filling out, and submitting each registration type.
     * </p>
     * 
     * @param describeRegistrationFieldDefinitionsRequest
     * @return Result of the DescribeRegistrationFieldDefinitions operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DescribeRegistrationFieldDefinitions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeRegistrationFieldDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRegistrationFieldDefinitionsResult describeRegistrationFieldDefinitions(
            DescribeRegistrationFieldDefinitionsRequest describeRegistrationFieldDefinitionsRequest);

    /**
     * <p>
     * Retrieves the specified registration field values.
     * </p>
     * 
     * @param describeRegistrationFieldValuesRequest
     * @return Result of the DescribeRegistrationFieldValues operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.DescribeRegistrationFieldValues
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeRegistrationFieldValues"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRegistrationFieldValuesResult describeRegistrationFieldValues(DescribeRegistrationFieldValuesRequest describeRegistrationFieldValuesRequest);

    /**
     * <p>
     * Retrieves the specified registration section definitions. You can use DescribeRegistrationSectionDefinitions to
     * view the requirements for creating, filling out, and submitting each registration type.
     * </p>
     * 
     * @param describeRegistrationSectionDefinitionsRequest
     * @return Result of the DescribeRegistrationSectionDefinitions operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DescribeRegistrationSectionDefinitions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeRegistrationSectionDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRegistrationSectionDefinitionsResult describeRegistrationSectionDefinitions(
            DescribeRegistrationSectionDefinitionsRequest describeRegistrationSectionDefinitionsRequest);

    /**
     * <p>
     * Retrieves the specified registration type definitions. You can use DescribeRegistrationTypeDefinitions to view
     * the requirements for creating, filling out, and submitting each registration type.
     * </p>
     * 
     * @param describeRegistrationTypeDefinitionsRequest
     * @return Result of the DescribeRegistrationTypeDefinitions operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DescribeRegistrationTypeDefinitions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeRegistrationTypeDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRegistrationTypeDefinitionsResult describeRegistrationTypeDefinitions(
            DescribeRegistrationTypeDefinitionsRequest describeRegistrationTypeDefinitionsRequest);

    /**
     * <p>
     * Retrieves the specified registration version.
     * </p>
     * 
     * @param describeRegistrationVersionsRequest
     * @return Result of the DescribeRegistrationVersions operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.DescribeRegistrationVersions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeRegistrationVersions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRegistrationVersionsResult describeRegistrationVersions(DescribeRegistrationVersionsRequest describeRegistrationVersionsRequest);

    /**
     * <p>
     * Retrieves the specified registrations.
     * </p>
     * 
     * @param describeRegistrationsRequest
     * @return Result of the DescribeRegistrations operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.DescribeRegistrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeRegistrations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRegistrationsResult describeRegistrations(DescribeRegistrationsRequest describeRegistrationsRequest);

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
     * f you specify a sender ID that isn't valid, an error is returned.
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
     * Retrieves the specified verified destiona numbers.
     * </p>
     * 
     * @param describeVerifiedDestinationNumbersRequest
     * @return Result of the DescribeVerifiedDestinationNumbers operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.DescribeVerifiedDestinationNumbers
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeVerifiedDestinationNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeVerifiedDestinationNumbersResult describeVerifiedDestinationNumbers(
            DescribeVerifiedDestinationNumbersRequest describeVerifiedDestinationNumbersRequest);

    /**
     * <p>
     * Removes the specified origination identity from an existing pool.
     * </p>
     * <p>
     * If the origination identity isn't associated with the specified pool, an error is returned.
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
     * Disassociate a protect configuration from a configuration set.
     * </p>
     * 
     * @param disassociateProtectConfigurationRequest
     * @return Result of the DisassociateProtectConfiguration operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.DisassociateProtectConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DisassociateProtectConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateProtectConfigurationResult disassociateProtectConfiguration(DisassociateProtectConfigurationRequest disassociateProtectConfigurationRequest);

    /**
     * <p>
     * Discard the current version of the registration.
     * </p>
     * 
     * @param discardRegistrationVersionRequest
     * @return Result of the DiscardRegistrationVersion operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.DiscardRegistrationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DiscardRegistrationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    DiscardRegistrationVersionResult discardRegistrationVersion(DiscardRegistrationVersionRequest discardRegistrationVersionRequest);

    /**
     * <p>
     * Retrieve the CountryRuleSet for the specified NumberCapability from a protect configuration.
     * </p>
     * 
     * @param getProtectConfigurationCountryRuleSetRequest
     * @return Result of the GetProtectConfigurationCountryRuleSet operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.GetProtectConfigurationCountryRuleSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/GetProtectConfigurationCountryRuleSet"
     *      target="_top">AWS API Documentation</a>
     */
    GetProtectConfigurationCountryRuleSetResult getProtectConfigurationCountryRuleSet(
            GetProtectConfigurationCountryRuleSetRequest getProtectConfigurationCountryRuleSetRequest);

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
     * Retreive all of the origination identies that are associated with a registration.
     * </p>
     * 
     * @param listRegistrationAssociationsRequest
     * @return Result of the ListRegistrationAssociations operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.ListRegistrationAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/ListRegistrationAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    ListRegistrationAssociationsResult listRegistrationAssociations(ListRegistrationAssociationsRequest listRegistrationAssociationsRequest);

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
     * If you specify a keyword that isn't valid, an error is returned.
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
     * If the destination phone number isn't valid or if the specified opt-out list doesn't exist, an error is returned.
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
     * Creates or updates a field value for a registration.
     * </p>
     * 
     * @param putRegistrationFieldValueRequest
     * @return Result of the PutRegistrationFieldValue operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.PutRegistrationFieldValue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/PutRegistrationFieldValue"
     *      target="_top">AWS API Documentation</a>
     */
    PutRegistrationFieldValueResult putRegistrationFieldValue(PutRegistrationFieldValueRequest putRegistrationFieldValueRequest);

    /**
     * <p>
     * Releases an existing origination phone number in your account. Once released, a phone number is no longer
     * available for sending messages.
     * </p>
     * <p>
     * If the origination phone number has deletion protection enabled or is associated with a pool, an error is
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
     * Releases an existing sender ID in your account.
     * </p>
     * 
     * @param releaseSenderIdRequest
     * @return Result of the ReleaseSenderId operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.ReleaseSenderId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/ReleaseSenderId"
     *      target="_top">AWS API Documentation</a>
     */
    ReleaseSenderIdResult releaseSenderId(ReleaseSenderIdRequest releaseSenderIdRequest);

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
     * Request a new sender ID that doesn't require registration.
     * </p>
     * 
     * @param requestSenderIdRequest
     * @return Result of the RequestSenderId operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.RequestSenderId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/RequestSenderId"
     *      target="_top">AWS API Documentation</a>
     */
    RequestSenderIdResult requestSenderId(RequestSenderIdRequest requestSenderIdRequest);

    /**
     * <p>
     * Before you can send test messages to a verified destination phone number you need to opt-in the verified
     * destination phone number. Creates a new text message with a verification code and send it to a verified
     * destination phone number. Once you have the verification code use <a>VerifyDestinationNumber</a> to opt-in the
     * verified destination phone number to receive messages.
     * </p>
     * 
     * @param sendDestinationNumberVerificationCodeRequest
     * @return Result of the SendDestinationNumberVerificationCode operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.SendDestinationNumberVerificationCode
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SendDestinationNumberVerificationCode"
     *      target="_top">AWS API Documentation</a>
     */
    SendDestinationNumberVerificationCodeResult sendDestinationNumberVerificationCode(
            SendDestinationNumberVerificationCodeRequest sendDestinationNumberVerificationCodeRequest);

    /**
     * <p>
     * Creates a new multimedia message (MMS) and sends it to a recipient's phone number.
     * </p>
     * 
     * @param sendMediaMessageRequest
     * @return Result of the SendMediaMessage operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.SendMediaMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SendMediaMessage"
     *      target="_top">AWS API Documentation</a>
     */
    SendMediaMessageResult sendMediaMessage(SendMediaMessageRequest sendMediaMessageRequest);

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
     * Allows you to send a request that sends a voice message through Amazon Pinpoint. This operation uses <a
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
     * Set a protect configuration as your account default. You can only have one account default protect configuration
     * at a time. The current account default protect configuration is replaced with the provided protect configuration.
     * </p>
     * 
     * @param setAccountDefaultProtectConfigurationRequest
     * @return Result of the SetAccountDefaultProtectConfiguration operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.SetAccountDefaultProtectConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SetAccountDefaultProtectConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    SetAccountDefaultProtectConfigurationResult setAccountDefaultProtectConfiguration(
            SetAccountDefaultProtectConfigurationRequest setAccountDefaultProtectConfigurationRequest);

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
     * Sets an account level monthly spend limit override for sending MMS messages. The requested spend limit must be
     * less than or equal to the <code>MaxLimit</code>, which is set by Amazon Web Services.
     * </p>
     * 
     * @param setMediaMessageSpendLimitOverrideRequest
     * @return Result of the SetMediaMessageSpendLimitOverride operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.SetMediaMessageSpendLimitOverride
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SetMediaMessageSpendLimitOverride"
     *      target="_top">AWS API Documentation</a>
     */
    SetMediaMessageSpendLimitOverrideResult setMediaMessageSpendLimitOverride(SetMediaMessageSpendLimitOverrideRequest setMediaMessageSpendLimitOverrideRequest);

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
     * Submit the specified registration for review and approval.
     * </p>
     * 
     * @param submitRegistrationVersionRequest
     * @return Result of the SubmitRegistrationVersion operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.SubmitRegistrationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SubmitRegistrationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    SubmitRegistrationVersionResult submitRegistrationVersion(SubmitRegistrationVersionRequest submitRegistrationVersionRequest);

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
     * If the origination phone number is associated with a pool, an error is returned.
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
     * <p>
     * Update the setting for an existing protect configuration.
     * </p>
     * 
     * @param updateProtectConfigurationRequest
     * @return Result of the UpdateProtectConfiguration operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.UpdateProtectConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UpdateProtectConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateProtectConfigurationResult updateProtectConfiguration(UpdateProtectConfigurationRequest updateProtectConfigurationRequest);

    /**
     * <p>
     * Update a country rule set to <code>ALLOW</code> or <code>BLOCK</code> messages to be sent to the specified
     * destination counties. You can update one or multiple countries at a time. The updates are only applied to the
     * specified NumberCapability type.
     * </p>
     * 
     * @param updateProtectConfigurationCountryRuleSetRequest
     * @return Result of the UpdateProtectConfigurationCountryRuleSet operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.UpdateProtectConfigurationCountryRuleSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UpdateProtectConfigurationCountryRuleSet"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateProtectConfigurationCountryRuleSetResult updateProtectConfigurationCountryRuleSet(
            UpdateProtectConfigurationCountryRuleSetRequest updateProtectConfigurationCountryRuleSetRequest);

    /**
     * <p>
     * Updates the configuration of an existing sender ID.
     * </p>
     * 
     * @param updateSenderIdRequest
     * @return Result of the UpdateSenderId operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.UpdateSenderId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UpdateSenderId"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSenderIdResult updateSenderId(UpdateSenderIdRequest updateSenderIdRequest);

    /**
     * <p>
     * Use the verification code that was received by the verified destination phone number to opt-in the verified
     * destination phone number to receive more messages.
     * </p>
     * 
     * @param verifyDestinationNumberRequest
     * @return Result of the VerifyDestinationNumber operation returned by the service.
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
     * @sample AmazonPinpointSMSVoiceV2.VerifyDestinationNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/VerifyDestinationNumber"
     *      target="_top">AWS API Documentation</a>
     */
    VerifyDestinationNumberResult verifyDestinationNumber(VerifyDestinationNumberRequest verifyDestinationNumberRequest);

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
