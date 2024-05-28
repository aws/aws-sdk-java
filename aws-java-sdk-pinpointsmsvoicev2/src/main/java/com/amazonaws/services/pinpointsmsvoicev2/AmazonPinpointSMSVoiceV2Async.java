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

import com.amazonaws.services.pinpointsmsvoicev2.model.*;

/**
 * Interface for accessing Amazon Pinpoint SMS Voice V2 asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.pinpointsmsvoicev2.AbstractAmazonPinpointSMSVoiceV2Async} instead.
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
public interface AmazonPinpointSMSVoiceV2Async extends AmazonPinpointSMSVoiceV2 {

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
     * @return A Java Future containing the result of the AssociateOriginationIdentity operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2Async.AssociateOriginationIdentity
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/AssociateOriginationIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateOriginationIdentityResult> associateOriginationIdentityAsync(
            AssociateOriginationIdentityRequest associateOriginationIdentityRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateOriginationIdentity operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.AssociateOriginationIdentity
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/AssociateOriginationIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateOriginationIdentityResult> associateOriginationIdentityAsync(
            AssociateOriginationIdentityRequest associateOriginationIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateOriginationIdentityRequest, AssociateOriginationIdentityResult> asyncHandler);

    /**
     * <p>
     * Associate a protect configuration with a configuration set. This replaces the configuration sets current protect
     * configuration. A configuration set can only be associated with one protect configuration at a time. A protect
     * configuration can be associated with multiple configuration sets.
     * </p>
     * 
     * @param associateProtectConfigurationRequest
     * @return A Java Future containing the result of the AssociateProtectConfiguration operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2Async.AssociateProtectConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/AssociateProtectConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateProtectConfigurationResult> associateProtectConfigurationAsync(
            AssociateProtectConfigurationRequest associateProtectConfigurationRequest);

    /**
     * <p>
     * Associate a protect configuration with a configuration set. This replaces the configuration sets current protect
     * configuration. A configuration set can only be associated with one protect configuration at a time. A protect
     * configuration can be associated with multiple configuration sets.
     * </p>
     * 
     * @param associateProtectConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateProtectConfiguration operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.AssociateProtectConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/AssociateProtectConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateProtectConfigurationResult> associateProtectConfigurationAsync(
            AssociateProtectConfigurationRequest associateProtectConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateProtectConfigurationRequest, AssociateProtectConfigurationResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateConfigurationSet operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.CreateConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateConfigurationSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfigurationSetResult> createConfigurationSetAsync(CreateConfigurationSetRequest createConfigurationSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConfigurationSet operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.CreateConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateConfigurationSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfigurationSetResult> createConfigurationSetAsync(CreateConfigurationSetRequest createConfigurationSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConfigurationSetRequest, CreateConfigurationSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateEventDestination operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.CreateEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEventDestinationResult> createEventDestinationAsync(CreateEventDestinationRequest createEventDestinationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEventDestination operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.CreateEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEventDestinationResult> createEventDestinationAsync(CreateEventDestinationRequest createEventDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEventDestinationRequest, CreateEventDestinationResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateOptOutList operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.CreateOptOutList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateOptOutList"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateOptOutListResult> createOptOutListAsync(CreateOptOutListRequest createOptOutListRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateOptOutList operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.CreateOptOutList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateOptOutList"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateOptOutListResult> createOptOutListAsync(CreateOptOutListRequest createOptOutListRequest,
            com.amazonaws.handlers.AsyncHandler<CreateOptOutListRequest, CreateOptOutListResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreatePool operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.CreatePool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreatePool"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePoolResult> createPoolAsync(CreatePoolRequest createPoolRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePool operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.CreatePool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreatePool"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePoolResult> createPoolAsync(CreatePoolRequest createPoolRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePoolRequest, CreatePoolResult> asyncHandler);

    /**
     * <p>
     * Create a new protect configuration. By default all country rule sets for each capability are set to
     * <code>ALLOW</code>. Update the country rule sets using <code>UpdateProtectConfigurationCountryRuleSet</code>. A
     * protect configurations name is stored as a Tag with the key set to <code>Name</code> and value as the name of the
     * protect configuration.
     * </p>
     * 
     * @param createProtectConfigurationRequest
     * @return A Java Future containing the result of the CreateProtectConfiguration operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.CreateProtectConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateProtectConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateProtectConfigurationResult> createProtectConfigurationAsync(
            CreateProtectConfigurationRequest createProtectConfigurationRequest);

    /**
     * <p>
     * Create a new protect configuration. By default all country rule sets for each capability are set to
     * <code>ALLOW</code>. Update the country rule sets using <code>UpdateProtectConfigurationCountryRuleSet</code>. A
     * protect configurations name is stored as a Tag with the key set to <code>Name</code> and value as the name of the
     * protect configuration.
     * </p>
     * 
     * @param createProtectConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProtectConfiguration operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.CreateProtectConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateProtectConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateProtectConfigurationResult> createProtectConfigurationAsync(
            CreateProtectConfigurationRequest createProtectConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProtectConfigurationRequest, CreateProtectConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates a new registration based on the <b>RegistrationType</b> field.
     * </p>
     * 
     * @param createRegistrationRequest
     * @return A Java Future containing the result of the CreateRegistration operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.CreateRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRegistrationResult> createRegistrationAsync(CreateRegistrationRequest createRegistrationRequest);

    /**
     * <p>
     * Creates a new registration based on the <b>RegistrationType</b> field.
     * </p>
     * 
     * @param createRegistrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRegistration operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.CreateRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRegistrationResult> createRegistrationAsync(CreateRegistrationRequest createRegistrationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRegistrationRequest, CreateRegistrationResult> asyncHandler);

    /**
     * <p>
     * Associate the registration with an origination identity such as a phone number or sender ID.
     * </p>
     * 
     * @param createRegistrationAssociationRequest
     * @return A Java Future containing the result of the CreateRegistrationAssociation operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2Async.CreateRegistrationAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateRegistrationAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRegistrationAssociationResult> createRegistrationAssociationAsync(
            CreateRegistrationAssociationRequest createRegistrationAssociationRequest);

    /**
     * <p>
     * Associate the registration with an origination identity such as a phone number or sender ID.
     * </p>
     * 
     * @param createRegistrationAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRegistrationAssociation operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.CreateRegistrationAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateRegistrationAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRegistrationAssociationResult> createRegistrationAssociationAsync(
            CreateRegistrationAssociationRequest createRegistrationAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRegistrationAssociationRequest, CreateRegistrationAssociationResult> asyncHandler);

    /**
     * <p>
     * Create a new registration attachment to use for uploading a file or a URL to a file. The maximum file size is
     * 1MiB and valid file extensions are PDF, JPEG and PNG. For example, many sender ID registrations require a signed
     * “letter of authorization” (LOA) to be submitted.
     * </p>
     * 
     * @param createRegistrationAttachmentRequest
     * @return A Java Future containing the result of the CreateRegistrationAttachment operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2Async.CreateRegistrationAttachment
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateRegistrationAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRegistrationAttachmentResult> createRegistrationAttachmentAsync(
            CreateRegistrationAttachmentRequest createRegistrationAttachmentRequest);

    /**
     * <p>
     * Create a new registration attachment to use for uploading a file or a URL to a file. The maximum file size is
     * 1MiB and valid file extensions are PDF, JPEG and PNG. For example, many sender ID registrations require a signed
     * “letter of authorization” (LOA) to be submitted.
     * </p>
     * 
     * @param createRegistrationAttachmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRegistrationAttachment operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.CreateRegistrationAttachment
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateRegistrationAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRegistrationAttachmentResult> createRegistrationAttachmentAsync(
            CreateRegistrationAttachmentRequest createRegistrationAttachmentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRegistrationAttachmentRequest, CreateRegistrationAttachmentResult> asyncHandler);

    /**
     * <p>
     * Create a new version of the registration and increase the <b>VersionNumber</b>. The previous version of the
     * registration becomes read-only.
     * </p>
     * 
     * @param createRegistrationVersionRequest
     * @return A Java Future containing the result of the CreateRegistrationVersion operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.CreateRegistrationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateRegistrationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRegistrationVersionResult> createRegistrationVersionAsync(
            CreateRegistrationVersionRequest createRegistrationVersionRequest);

    /**
     * <p>
     * Create a new version of the registration and increase the <b>VersionNumber</b>. The previous version of the
     * registration becomes read-only.
     * </p>
     * 
     * @param createRegistrationVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRegistrationVersion operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.CreateRegistrationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateRegistrationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRegistrationVersionResult> createRegistrationVersionAsync(
            CreateRegistrationVersionRequest createRegistrationVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRegistrationVersionRequest, CreateRegistrationVersionResult> asyncHandler);

    /**
     * <p>
     * You can only send messages to verified destination numbers when your account is in the sandbox. You can add up to
     * 10 verified destination numbers.
     * </p>
     * 
     * @param createVerifiedDestinationNumberRequest
     * @return A Java Future containing the result of the CreateVerifiedDestinationNumber operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2Async.CreateVerifiedDestinationNumber
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateVerifiedDestinationNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVerifiedDestinationNumberResult> createVerifiedDestinationNumberAsync(
            CreateVerifiedDestinationNumberRequest createVerifiedDestinationNumberRequest);

    /**
     * <p>
     * You can only send messages to verified destination numbers when your account is in the sandbox. You can add up to
     * 10 verified destination numbers.
     * </p>
     * 
     * @param createVerifiedDestinationNumberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVerifiedDestinationNumber operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.CreateVerifiedDestinationNumber
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateVerifiedDestinationNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVerifiedDestinationNumberResult> createVerifiedDestinationNumberAsync(
            CreateVerifiedDestinationNumberRequest createVerifiedDestinationNumberRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVerifiedDestinationNumberRequest, CreateVerifiedDestinationNumberResult> asyncHandler);

    /**
     * <p>
     * Removes the current account default protect configuration.
     * </p>
     * 
     * @param deleteAccountDefaultProtectConfigurationRequest
     * @return A Java Future containing the result of the DeleteAccountDefaultProtectConfiguration operation returned by
     *         the service.
     * @sample AmazonPinpointSMSVoiceV2Async.DeleteAccountDefaultProtectConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteAccountDefaultProtectConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccountDefaultProtectConfigurationResult> deleteAccountDefaultProtectConfigurationAsync(
            DeleteAccountDefaultProtectConfigurationRequest deleteAccountDefaultProtectConfigurationRequest);

    /**
     * <p>
     * Removes the current account default protect configuration.
     * </p>
     * 
     * @param deleteAccountDefaultProtectConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccountDefaultProtectConfiguration operation returned by
     *         the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DeleteAccountDefaultProtectConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteAccountDefaultProtectConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccountDefaultProtectConfigurationResult> deleteAccountDefaultProtectConfigurationAsync(
            DeleteAccountDefaultProtectConfigurationRequest deleteAccountDefaultProtectConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccountDefaultProtectConfigurationRequest, DeleteAccountDefaultProtectConfigurationResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteConfigurationSet operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.DeleteConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteConfigurationSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigurationSetResult> deleteConfigurationSetAsync(DeleteConfigurationSetRequest deleteConfigurationSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConfigurationSet operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DeleteConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteConfigurationSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigurationSetResult> deleteConfigurationSetAsync(DeleteConfigurationSetRequest deleteConfigurationSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConfigurationSetRequest, DeleteConfigurationSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteDefaultMessageType operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.DeleteDefaultMessageType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteDefaultMessageType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDefaultMessageTypeResult> deleteDefaultMessageTypeAsync(DeleteDefaultMessageTypeRequest deleteDefaultMessageTypeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDefaultMessageType operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DeleteDefaultMessageType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteDefaultMessageType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDefaultMessageTypeResult> deleteDefaultMessageTypeAsync(DeleteDefaultMessageTypeRequest deleteDefaultMessageTypeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDefaultMessageTypeRequest, DeleteDefaultMessageTypeResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteDefaultSenderId operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.DeleteDefaultSenderId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteDefaultSenderId"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDefaultSenderIdResult> deleteDefaultSenderIdAsync(DeleteDefaultSenderIdRequest deleteDefaultSenderIdRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDefaultSenderId operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DeleteDefaultSenderId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteDefaultSenderId"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDefaultSenderIdResult> deleteDefaultSenderIdAsync(DeleteDefaultSenderIdRequest deleteDefaultSenderIdRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDefaultSenderIdRequest, DeleteDefaultSenderIdResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteEventDestination operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.DeleteEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventDestinationResult> deleteEventDestinationAsync(DeleteEventDestinationRequest deleteEventDestinationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEventDestination operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DeleteEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventDestinationResult> deleteEventDestinationAsync(DeleteEventDestinationRequest deleteEventDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEventDestinationRequest, DeleteEventDestinationResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteKeyword operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.DeleteKeyword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteKeyword"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteKeywordResult> deleteKeywordAsync(DeleteKeywordRequest deleteKeywordRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteKeyword operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DeleteKeyword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteKeyword"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteKeywordResult> deleteKeywordAsync(DeleteKeywordRequest deleteKeywordRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteKeywordRequest, DeleteKeywordResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteMediaMessageSpendLimitOverride operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2Async.DeleteMediaMessageSpendLimitOverride
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteMediaMessageSpendLimitOverride"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMediaMessageSpendLimitOverrideResult> deleteMediaMessageSpendLimitOverrideAsync(
            DeleteMediaMessageSpendLimitOverrideRequest deleteMediaMessageSpendLimitOverrideRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMediaMessageSpendLimitOverride operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DeleteMediaMessageSpendLimitOverride
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteMediaMessageSpendLimitOverride"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMediaMessageSpendLimitOverrideResult> deleteMediaMessageSpendLimitOverrideAsync(
            DeleteMediaMessageSpendLimitOverrideRequest deleteMediaMessageSpendLimitOverrideRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMediaMessageSpendLimitOverrideRequest, DeleteMediaMessageSpendLimitOverrideResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteOptOutList operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.DeleteOptOutList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteOptOutList"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOptOutListResult> deleteOptOutListAsync(DeleteOptOutListRequest deleteOptOutListRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteOptOutList operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DeleteOptOutList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteOptOutList"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOptOutListResult> deleteOptOutListAsync(DeleteOptOutListRequest deleteOptOutListRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteOptOutListRequest, DeleteOptOutListResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteOptedOutNumber operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.DeleteOptedOutNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteOptedOutNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOptedOutNumberResult> deleteOptedOutNumberAsync(DeleteOptedOutNumberRequest deleteOptedOutNumberRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteOptedOutNumber operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DeleteOptedOutNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteOptedOutNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOptedOutNumberResult> deleteOptedOutNumberAsync(DeleteOptedOutNumberRequest deleteOptedOutNumberRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteOptedOutNumberRequest, DeleteOptedOutNumberResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeletePool operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.DeletePool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeletePool"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePoolResult> deletePoolAsync(DeletePoolRequest deletePoolRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePool operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DeletePool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeletePool"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePoolResult> deletePoolAsync(DeletePoolRequest deletePoolRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePoolRequest, DeletePoolResult> asyncHandler);

    /**
     * <p>
     * Permanently delete the protect configuration. The protect configuration must have deletion protection disabled
     * and must not be associated as the account default protect configuration or associated with a configuration set.
     * </p>
     * 
     * @param deleteProtectConfigurationRequest
     * @return A Java Future containing the result of the DeleteProtectConfiguration operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.DeleteProtectConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteProtectConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProtectConfigurationResult> deleteProtectConfigurationAsync(
            DeleteProtectConfigurationRequest deleteProtectConfigurationRequest);

    /**
     * <p>
     * Permanently delete the protect configuration. The protect configuration must have deletion protection disabled
     * and must not be associated as the account default protect configuration or associated with a configuration set.
     * </p>
     * 
     * @param deleteProtectConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProtectConfiguration operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DeleteProtectConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteProtectConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProtectConfigurationResult> deleteProtectConfigurationAsync(
            DeleteProtectConfigurationRequest deleteProtectConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProtectConfigurationRequest, DeleteProtectConfigurationResult> asyncHandler);

    /**
     * <p>
     * Permanently delete an existing registration from your account.
     * </p>
     * 
     * @param deleteRegistrationRequest
     * @return A Java Future containing the result of the DeleteRegistration operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.DeleteRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRegistrationResult> deleteRegistrationAsync(DeleteRegistrationRequest deleteRegistrationRequest);

    /**
     * <p>
     * Permanently delete an existing registration from your account.
     * </p>
     * 
     * @param deleteRegistrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRegistration operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DeleteRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRegistrationResult> deleteRegistrationAsync(DeleteRegistrationRequest deleteRegistrationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRegistrationRequest, DeleteRegistrationResult> asyncHandler);

    /**
     * <p>
     * Permanently delete the specified registration attachment.
     * </p>
     * 
     * @param deleteRegistrationAttachmentRequest
     * @return A Java Future containing the result of the DeleteRegistrationAttachment operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2Async.DeleteRegistrationAttachment
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteRegistrationAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRegistrationAttachmentResult> deleteRegistrationAttachmentAsync(
            DeleteRegistrationAttachmentRequest deleteRegistrationAttachmentRequest);

    /**
     * <p>
     * Permanently delete the specified registration attachment.
     * </p>
     * 
     * @param deleteRegistrationAttachmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRegistrationAttachment operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DeleteRegistrationAttachment
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteRegistrationAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRegistrationAttachmentResult> deleteRegistrationAttachmentAsync(
            DeleteRegistrationAttachmentRequest deleteRegistrationAttachmentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRegistrationAttachmentRequest, DeleteRegistrationAttachmentResult> asyncHandler);

    /**
     * <p>
     * Delete the value in a registration form field.
     * </p>
     * 
     * @param deleteRegistrationFieldValueRequest
     * @return A Java Future containing the result of the DeleteRegistrationFieldValue operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2Async.DeleteRegistrationFieldValue
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteRegistrationFieldValue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRegistrationFieldValueResult> deleteRegistrationFieldValueAsync(
            DeleteRegistrationFieldValueRequest deleteRegistrationFieldValueRequest);

    /**
     * <p>
     * Delete the value in a registration form field.
     * </p>
     * 
     * @param deleteRegistrationFieldValueRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRegistrationFieldValue operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DeleteRegistrationFieldValue
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteRegistrationFieldValue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRegistrationFieldValueResult> deleteRegistrationFieldValueAsync(
            DeleteRegistrationFieldValueRequest deleteRegistrationFieldValueRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRegistrationFieldValueRequest, DeleteRegistrationFieldValueResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteTextMessageSpendLimitOverride operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2Async.DeleteTextMessageSpendLimitOverride
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteTextMessageSpendLimitOverride"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTextMessageSpendLimitOverrideResult> deleteTextMessageSpendLimitOverrideAsync(
            DeleteTextMessageSpendLimitOverrideRequest deleteTextMessageSpendLimitOverrideRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTextMessageSpendLimitOverride operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DeleteTextMessageSpendLimitOverride
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteTextMessageSpendLimitOverride"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTextMessageSpendLimitOverrideResult> deleteTextMessageSpendLimitOverrideAsync(
            DeleteTextMessageSpendLimitOverrideRequest deleteTextMessageSpendLimitOverrideRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTextMessageSpendLimitOverrideRequest, DeleteTextMessageSpendLimitOverrideResult> asyncHandler);

    /**
     * <p>
     * Delete a verified destination phone number.
     * </p>
     * 
     * @param deleteVerifiedDestinationNumberRequest
     * @return A Java Future containing the result of the DeleteVerifiedDestinationNumber operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2Async.DeleteVerifiedDestinationNumber
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteVerifiedDestinationNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVerifiedDestinationNumberResult> deleteVerifiedDestinationNumberAsync(
            DeleteVerifiedDestinationNumberRequest deleteVerifiedDestinationNumberRequest);

    /**
     * <p>
     * Delete a verified destination phone number.
     * </p>
     * 
     * @param deleteVerifiedDestinationNumberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVerifiedDestinationNumber operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DeleteVerifiedDestinationNumber
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteVerifiedDestinationNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVerifiedDestinationNumberResult> deleteVerifiedDestinationNumberAsync(
            DeleteVerifiedDestinationNumberRequest deleteVerifiedDestinationNumberRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVerifiedDestinationNumberRequest, DeleteVerifiedDestinationNumberResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteVoiceMessageSpendLimitOverride operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2Async.DeleteVoiceMessageSpendLimitOverride
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteVoiceMessageSpendLimitOverride"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceMessageSpendLimitOverrideResult> deleteVoiceMessageSpendLimitOverrideAsync(
            DeleteVoiceMessageSpendLimitOverrideRequest deleteVoiceMessageSpendLimitOverrideRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVoiceMessageSpendLimitOverride operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DeleteVoiceMessageSpendLimitOverride
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteVoiceMessageSpendLimitOverride"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceMessageSpendLimitOverrideResult> deleteVoiceMessageSpendLimitOverrideAsync(
            DeleteVoiceMessageSpendLimitOverrideRequest deleteVoiceMessageSpendLimitOverrideRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVoiceMessageSpendLimitOverrideRequest, DeleteVoiceMessageSpendLimitOverrideResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeAccountAttributes operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.DescribeAccountAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeAccountAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(
            DescribeAccountAttributesRequest describeAccountAttributesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountAttributes operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DescribeAccountAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeAccountAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(
            DescribeAccountAttributesRequest describeAccountAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountAttributesRequest, DescribeAccountAttributesResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeAccountLimits operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.DescribeAccountLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeAccountLimits"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(DescribeAccountLimitsRequest describeAccountLimitsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountLimits operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DescribeAccountLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeAccountLimits"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(DescribeAccountLimitsRequest describeAccountLimitsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeConfigurationSets operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.DescribeConfigurationSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeConfigurationSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConfigurationSetsResult> describeConfigurationSetsAsync(
            DescribeConfigurationSetsRequest describeConfigurationSetsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConfigurationSets operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DescribeConfigurationSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeConfigurationSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConfigurationSetsResult> describeConfigurationSetsAsync(
            DescribeConfigurationSetsRequest describeConfigurationSetsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationSetsRequest, DescribeConfigurationSetsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeKeywords operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.DescribeKeywords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeKeywords"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeKeywordsResult> describeKeywordsAsync(DescribeKeywordsRequest describeKeywordsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeKeywords operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DescribeKeywords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeKeywords"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeKeywordsResult> describeKeywordsAsync(DescribeKeywordsRequest describeKeywordsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeKeywordsRequest, DescribeKeywordsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeOptOutLists operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.DescribeOptOutLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeOptOutLists"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOptOutListsResult> describeOptOutListsAsync(DescribeOptOutListsRequest describeOptOutListsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOptOutLists operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DescribeOptOutLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeOptOutLists"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOptOutListsResult> describeOptOutListsAsync(DescribeOptOutListsRequest describeOptOutListsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOptOutListsRequest, DescribeOptOutListsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeOptedOutNumbers operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.DescribeOptedOutNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeOptedOutNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOptedOutNumbersResult> describeOptedOutNumbersAsync(DescribeOptedOutNumbersRequest describeOptedOutNumbersRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOptedOutNumbers operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DescribeOptedOutNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeOptedOutNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOptedOutNumbersResult> describeOptedOutNumbersAsync(DescribeOptedOutNumbersRequest describeOptedOutNumbersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOptedOutNumbersRequest, DescribeOptedOutNumbersResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribePhoneNumbers operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.DescribePhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribePhoneNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePhoneNumbersResult> describePhoneNumbersAsync(DescribePhoneNumbersRequest describePhoneNumbersRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePhoneNumbers operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DescribePhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribePhoneNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePhoneNumbersResult> describePhoneNumbersAsync(DescribePhoneNumbersRequest describePhoneNumbersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePhoneNumbersRequest, DescribePhoneNumbersResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribePools operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.DescribePools
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribePools"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePoolsResult> describePoolsAsync(DescribePoolsRequest describePoolsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePools operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DescribePools
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribePools"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePoolsResult> describePoolsAsync(DescribePoolsRequest describePoolsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePoolsRequest, DescribePoolsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the protect configurations that match any of filters. If a filter isn’t provided then all protect
     * configurations are returned.
     * </p>
     * 
     * @param describeProtectConfigurationsRequest
     * @return A Java Future containing the result of the DescribeProtectConfigurations operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2Async.DescribeProtectConfigurations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeProtectConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProtectConfigurationsResult> describeProtectConfigurationsAsync(
            DescribeProtectConfigurationsRequest describeProtectConfigurationsRequest);

    /**
     * <p>
     * Retrieves the protect configurations that match any of filters. If a filter isn’t provided then all protect
     * configurations are returned.
     * </p>
     * 
     * @param describeProtectConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProtectConfigurations operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DescribeProtectConfigurations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeProtectConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProtectConfigurationsResult> describeProtectConfigurationsAsync(
            DescribeProtectConfigurationsRequest describeProtectConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProtectConfigurationsRequest, DescribeProtectConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified registration attachments or all registration attachments associated with your Amazon Web
     * Services account.
     * </p>
     * 
     * @param describeRegistrationAttachmentsRequest
     * @return A Java Future containing the result of the DescribeRegistrationAttachments operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2Async.DescribeRegistrationAttachments
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeRegistrationAttachments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRegistrationAttachmentsResult> describeRegistrationAttachmentsAsync(
            DescribeRegistrationAttachmentsRequest describeRegistrationAttachmentsRequest);

    /**
     * <p>
     * Retrieves the specified registration attachments or all registration attachments associated with your Amazon Web
     * Services account.
     * </p>
     * 
     * @param describeRegistrationAttachmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRegistrationAttachments operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DescribeRegistrationAttachments
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeRegistrationAttachments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRegistrationAttachmentsResult> describeRegistrationAttachmentsAsync(
            DescribeRegistrationAttachmentsRequest describeRegistrationAttachmentsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRegistrationAttachmentsRequest, DescribeRegistrationAttachmentsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified registration type field definitions. You can use DescribeRegistrationFieldDefinitions to
     * view the requirements for creating, filling out, and submitting each registration type.
     * </p>
     * 
     * @param describeRegistrationFieldDefinitionsRequest
     * @return A Java Future containing the result of the DescribeRegistrationFieldDefinitions operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2Async.DescribeRegistrationFieldDefinitions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeRegistrationFieldDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRegistrationFieldDefinitionsResult> describeRegistrationFieldDefinitionsAsync(
            DescribeRegistrationFieldDefinitionsRequest describeRegistrationFieldDefinitionsRequest);

    /**
     * <p>
     * Retrieves the specified registration type field definitions. You can use DescribeRegistrationFieldDefinitions to
     * view the requirements for creating, filling out, and submitting each registration type.
     * </p>
     * 
     * @param describeRegistrationFieldDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRegistrationFieldDefinitions operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DescribeRegistrationFieldDefinitions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeRegistrationFieldDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRegistrationFieldDefinitionsResult> describeRegistrationFieldDefinitionsAsync(
            DescribeRegistrationFieldDefinitionsRequest describeRegistrationFieldDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRegistrationFieldDefinitionsRequest, DescribeRegistrationFieldDefinitionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified registration field values.
     * </p>
     * 
     * @param describeRegistrationFieldValuesRequest
     * @return A Java Future containing the result of the DescribeRegistrationFieldValues operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2Async.DescribeRegistrationFieldValues
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeRegistrationFieldValues"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRegistrationFieldValuesResult> describeRegistrationFieldValuesAsync(
            DescribeRegistrationFieldValuesRequest describeRegistrationFieldValuesRequest);

    /**
     * <p>
     * Retrieves the specified registration field values.
     * </p>
     * 
     * @param describeRegistrationFieldValuesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRegistrationFieldValues operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DescribeRegistrationFieldValues
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeRegistrationFieldValues"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRegistrationFieldValuesResult> describeRegistrationFieldValuesAsync(
            DescribeRegistrationFieldValuesRequest describeRegistrationFieldValuesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRegistrationFieldValuesRequest, DescribeRegistrationFieldValuesResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified registration section definitions. You can use DescribeRegistrationSectionDefinitions to
     * view the requirements for creating, filling out, and submitting each registration type.
     * </p>
     * 
     * @param describeRegistrationSectionDefinitionsRequest
     * @return A Java Future containing the result of the DescribeRegistrationSectionDefinitions operation returned by
     *         the service.
     * @sample AmazonPinpointSMSVoiceV2Async.DescribeRegistrationSectionDefinitions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeRegistrationSectionDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRegistrationSectionDefinitionsResult> describeRegistrationSectionDefinitionsAsync(
            DescribeRegistrationSectionDefinitionsRequest describeRegistrationSectionDefinitionsRequest);

    /**
     * <p>
     * Retrieves the specified registration section definitions. You can use DescribeRegistrationSectionDefinitions to
     * view the requirements for creating, filling out, and submitting each registration type.
     * </p>
     * 
     * @param describeRegistrationSectionDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRegistrationSectionDefinitions operation returned by
     *         the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DescribeRegistrationSectionDefinitions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeRegistrationSectionDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRegistrationSectionDefinitionsResult> describeRegistrationSectionDefinitionsAsync(
            DescribeRegistrationSectionDefinitionsRequest describeRegistrationSectionDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRegistrationSectionDefinitionsRequest, DescribeRegistrationSectionDefinitionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified registration type definitions. You can use DescribeRegistrationTypeDefinitions to view
     * the requirements for creating, filling out, and submitting each registration type.
     * </p>
     * 
     * @param describeRegistrationTypeDefinitionsRequest
     * @return A Java Future containing the result of the DescribeRegistrationTypeDefinitions operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2Async.DescribeRegistrationTypeDefinitions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeRegistrationTypeDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRegistrationTypeDefinitionsResult> describeRegistrationTypeDefinitionsAsync(
            DescribeRegistrationTypeDefinitionsRequest describeRegistrationTypeDefinitionsRequest);

    /**
     * <p>
     * Retrieves the specified registration type definitions. You can use DescribeRegistrationTypeDefinitions to view
     * the requirements for creating, filling out, and submitting each registration type.
     * </p>
     * 
     * @param describeRegistrationTypeDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRegistrationTypeDefinitions operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DescribeRegistrationTypeDefinitions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeRegistrationTypeDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRegistrationTypeDefinitionsResult> describeRegistrationTypeDefinitionsAsync(
            DescribeRegistrationTypeDefinitionsRequest describeRegistrationTypeDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRegistrationTypeDefinitionsRequest, DescribeRegistrationTypeDefinitionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified registration version.
     * </p>
     * 
     * @param describeRegistrationVersionsRequest
     * @return A Java Future containing the result of the DescribeRegistrationVersions operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2Async.DescribeRegistrationVersions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeRegistrationVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRegistrationVersionsResult> describeRegistrationVersionsAsync(
            DescribeRegistrationVersionsRequest describeRegistrationVersionsRequest);

    /**
     * <p>
     * Retrieves the specified registration version.
     * </p>
     * 
     * @param describeRegistrationVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRegistrationVersions operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DescribeRegistrationVersions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeRegistrationVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRegistrationVersionsResult> describeRegistrationVersionsAsync(
            DescribeRegistrationVersionsRequest describeRegistrationVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRegistrationVersionsRequest, DescribeRegistrationVersionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified registrations.
     * </p>
     * 
     * @param describeRegistrationsRequest
     * @return A Java Future containing the result of the DescribeRegistrations operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.DescribeRegistrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeRegistrations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRegistrationsResult> describeRegistrationsAsync(DescribeRegistrationsRequest describeRegistrationsRequest);

    /**
     * <p>
     * Retrieves the specified registrations.
     * </p>
     * 
     * @param describeRegistrationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRegistrations operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DescribeRegistrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeRegistrations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRegistrationsResult> describeRegistrationsAsync(DescribeRegistrationsRequest describeRegistrationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRegistrationsRequest, DescribeRegistrationsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeSenderIds operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.DescribeSenderIds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeSenderIds"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSenderIdsResult> describeSenderIdsAsync(DescribeSenderIdsRequest describeSenderIdsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSenderIds operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DescribeSenderIds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeSenderIds"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSenderIdsResult> describeSenderIdsAsync(DescribeSenderIdsRequest describeSenderIdsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSenderIdsRequest, DescribeSenderIdsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeSpendLimits operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.DescribeSpendLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeSpendLimits"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSpendLimitsResult> describeSpendLimitsAsync(DescribeSpendLimitsRequest describeSpendLimitsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSpendLimits operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DescribeSpendLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeSpendLimits"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSpendLimitsResult> describeSpendLimitsAsync(DescribeSpendLimitsRequest describeSpendLimitsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSpendLimitsRequest, DescribeSpendLimitsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified verified destiona numbers.
     * </p>
     * 
     * @param describeVerifiedDestinationNumbersRequest
     * @return A Java Future containing the result of the DescribeVerifiedDestinationNumbers operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2Async.DescribeVerifiedDestinationNumbers
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeVerifiedDestinationNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVerifiedDestinationNumbersResult> describeVerifiedDestinationNumbersAsync(
            DescribeVerifiedDestinationNumbersRequest describeVerifiedDestinationNumbersRequest);

    /**
     * <p>
     * Retrieves the specified verified destiona numbers.
     * </p>
     * 
     * @param describeVerifiedDestinationNumbersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVerifiedDestinationNumbers operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DescribeVerifiedDestinationNumbers
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeVerifiedDestinationNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVerifiedDestinationNumbersResult> describeVerifiedDestinationNumbersAsync(
            DescribeVerifiedDestinationNumbersRequest describeVerifiedDestinationNumbersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVerifiedDestinationNumbersRequest, DescribeVerifiedDestinationNumbersResult> asyncHandler);

    /**
     * <p>
     * Removes the specified origination identity from an existing pool.
     * </p>
     * <p>
     * If the origination identity isn't associated with the specified pool, an error is returned.
     * </p>
     * 
     * @param disassociateOriginationIdentityRequest
     * @return A Java Future containing the result of the DisassociateOriginationIdentity operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2Async.DisassociateOriginationIdentity
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DisassociateOriginationIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateOriginationIdentityResult> disassociateOriginationIdentityAsync(
            DisassociateOriginationIdentityRequest disassociateOriginationIdentityRequest);

    /**
     * <p>
     * Removes the specified origination identity from an existing pool.
     * </p>
     * <p>
     * If the origination identity isn't associated with the specified pool, an error is returned.
     * </p>
     * 
     * @param disassociateOriginationIdentityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateOriginationIdentity operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DisassociateOriginationIdentity
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DisassociateOriginationIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateOriginationIdentityResult> disassociateOriginationIdentityAsync(
            DisassociateOriginationIdentityRequest disassociateOriginationIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateOriginationIdentityRequest, DisassociateOriginationIdentityResult> asyncHandler);

    /**
     * <p>
     * Disassociate a protect configuration from a configuration set.
     * </p>
     * 
     * @param disassociateProtectConfigurationRequest
     * @return A Java Future containing the result of the DisassociateProtectConfiguration operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2Async.DisassociateProtectConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DisassociateProtectConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateProtectConfigurationResult> disassociateProtectConfigurationAsync(
            DisassociateProtectConfigurationRequest disassociateProtectConfigurationRequest);

    /**
     * <p>
     * Disassociate a protect configuration from a configuration set.
     * </p>
     * 
     * @param disassociateProtectConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateProtectConfiguration operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DisassociateProtectConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DisassociateProtectConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateProtectConfigurationResult> disassociateProtectConfigurationAsync(
            DisassociateProtectConfigurationRequest disassociateProtectConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateProtectConfigurationRequest, DisassociateProtectConfigurationResult> asyncHandler);

    /**
     * <p>
     * Discard the current version of the registration.
     * </p>
     * 
     * @param discardRegistrationVersionRequest
     * @return A Java Future containing the result of the DiscardRegistrationVersion operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.DiscardRegistrationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DiscardRegistrationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DiscardRegistrationVersionResult> discardRegistrationVersionAsync(
            DiscardRegistrationVersionRequest discardRegistrationVersionRequest);

    /**
     * <p>
     * Discard the current version of the registration.
     * </p>
     * 
     * @param discardRegistrationVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DiscardRegistrationVersion operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.DiscardRegistrationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DiscardRegistrationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DiscardRegistrationVersionResult> discardRegistrationVersionAsync(
            DiscardRegistrationVersionRequest discardRegistrationVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DiscardRegistrationVersionRequest, DiscardRegistrationVersionResult> asyncHandler);

    /**
     * <p>
     * Retrieve the CountryRuleSet for the specified NumberCapability from a protect configuration.
     * </p>
     * 
     * @param getProtectConfigurationCountryRuleSetRequest
     * @return A Java Future containing the result of the GetProtectConfigurationCountryRuleSet operation returned by
     *         the service.
     * @sample AmazonPinpointSMSVoiceV2Async.GetProtectConfigurationCountryRuleSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/GetProtectConfigurationCountryRuleSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetProtectConfigurationCountryRuleSetResult> getProtectConfigurationCountryRuleSetAsync(
            GetProtectConfigurationCountryRuleSetRequest getProtectConfigurationCountryRuleSetRequest);

    /**
     * <p>
     * Retrieve the CountryRuleSet for the specified NumberCapability from a protect configuration.
     * </p>
     * 
     * @param getProtectConfigurationCountryRuleSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProtectConfigurationCountryRuleSet operation returned by
     *         the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.GetProtectConfigurationCountryRuleSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/GetProtectConfigurationCountryRuleSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetProtectConfigurationCountryRuleSetResult> getProtectConfigurationCountryRuleSetAsync(
            GetProtectConfigurationCountryRuleSetRequest getProtectConfigurationCountryRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetProtectConfigurationCountryRuleSetRequest, GetProtectConfigurationCountryRuleSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListPoolOriginationIdentities operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2Async.ListPoolOriginationIdentities
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/ListPoolOriginationIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPoolOriginationIdentitiesResult> listPoolOriginationIdentitiesAsync(
            ListPoolOriginationIdentitiesRequest listPoolOriginationIdentitiesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPoolOriginationIdentities operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.ListPoolOriginationIdentities
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/ListPoolOriginationIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPoolOriginationIdentitiesResult> listPoolOriginationIdentitiesAsync(
            ListPoolOriginationIdentitiesRequest listPoolOriginationIdentitiesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPoolOriginationIdentitiesRequest, ListPoolOriginationIdentitiesResult> asyncHandler);

    /**
     * <p>
     * Retreive all of the origination identies that are associated with a registration.
     * </p>
     * 
     * @param listRegistrationAssociationsRequest
     * @return A Java Future containing the result of the ListRegistrationAssociations operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2Async.ListRegistrationAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/ListRegistrationAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRegistrationAssociationsResult> listRegistrationAssociationsAsync(
            ListRegistrationAssociationsRequest listRegistrationAssociationsRequest);

    /**
     * <p>
     * Retreive all of the origination identies that are associated with a registration.
     * </p>
     * 
     * @param listRegistrationAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRegistrationAssociations operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.ListRegistrationAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/ListRegistrationAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRegistrationAssociationsResult> listRegistrationAssociationsAsync(
            ListRegistrationAssociationsRequest listRegistrationAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRegistrationAssociationsRequest, ListRegistrationAssociationsResult> asyncHandler);

    /**
     * <p>
     * List all tags associated with a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * List all tags associated with a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the PutKeyword operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.PutKeyword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/PutKeyword"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutKeywordResult> putKeywordAsync(PutKeywordRequest putKeywordRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutKeyword operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.PutKeyword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/PutKeyword"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutKeywordResult> putKeywordAsync(PutKeywordRequest putKeywordRequest,
            com.amazonaws.handlers.AsyncHandler<PutKeywordRequest, PutKeywordResult> asyncHandler);

    /**
     * <p>
     * Creates an opted out destination phone number in the opt-out list.
     * </p>
     * <p>
     * If the destination phone number isn't valid or if the specified opt-out list doesn't exist, an error is returned.
     * </p>
     * 
     * @param putOptedOutNumberRequest
     * @return A Java Future containing the result of the PutOptedOutNumber operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.PutOptedOutNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/PutOptedOutNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutOptedOutNumberResult> putOptedOutNumberAsync(PutOptedOutNumberRequest putOptedOutNumberRequest);

    /**
     * <p>
     * Creates an opted out destination phone number in the opt-out list.
     * </p>
     * <p>
     * If the destination phone number isn't valid or if the specified opt-out list doesn't exist, an error is returned.
     * </p>
     * 
     * @param putOptedOutNumberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutOptedOutNumber operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.PutOptedOutNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/PutOptedOutNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutOptedOutNumberResult> putOptedOutNumberAsync(PutOptedOutNumberRequest putOptedOutNumberRequest,
            com.amazonaws.handlers.AsyncHandler<PutOptedOutNumberRequest, PutOptedOutNumberResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a field value for a registration.
     * </p>
     * 
     * @param putRegistrationFieldValueRequest
     * @return A Java Future containing the result of the PutRegistrationFieldValue operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.PutRegistrationFieldValue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/PutRegistrationFieldValue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutRegistrationFieldValueResult> putRegistrationFieldValueAsync(
            PutRegistrationFieldValueRequest putRegistrationFieldValueRequest);

    /**
     * <p>
     * Creates or updates a field value for a registration.
     * </p>
     * 
     * @param putRegistrationFieldValueRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutRegistrationFieldValue operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.PutRegistrationFieldValue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/PutRegistrationFieldValue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutRegistrationFieldValueResult> putRegistrationFieldValueAsync(
            PutRegistrationFieldValueRequest putRegistrationFieldValueRequest,
            com.amazonaws.handlers.AsyncHandler<PutRegistrationFieldValueRequest, PutRegistrationFieldValueResult> asyncHandler);

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
     * @return A Java Future containing the result of the ReleasePhoneNumber operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.ReleasePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/ReleasePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReleasePhoneNumberResult> releasePhoneNumberAsync(ReleasePhoneNumberRequest releasePhoneNumberRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReleasePhoneNumber operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.ReleasePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/ReleasePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReleasePhoneNumberResult> releasePhoneNumberAsync(ReleasePhoneNumberRequest releasePhoneNumberRequest,
            com.amazonaws.handlers.AsyncHandler<ReleasePhoneNumberRequest, ReleasePhoneNumberResult> asyncHandler);

    /**
     * <p>
     * Releases an existing sender ID in your account.
     * </p>
     * 
     * @param releaseSenderIdRequest
     * @return A Java Future containing the result of the ReleaseSenderId operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.ReleaseSenderId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/ReleaseSenderId"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReleaseSenderIdResult> releaseSenderIdAsync(ReleaseSenderIdRequest releaseSenderIdRequest);

    /**
     * <p>
     * Releases an existing sender ID in your account.
     * </p>
     * 
     * @param releaseSenderIdRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReleaseSenderId operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.ReleaseSenderId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/ReleaseSenderId"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReleaseSenderIdResult> releaseSenderIdAsync(ReleaseSenderIdRequest releaseSenderIdRequest,
            com.amazonaws.handlers.AsyncHandler<ReleaseSenderIdRequest, ReleaseSenderIdResult> asyncHandler);

    /**
     * <p>
     * Request an origination phone number for use in your account. For more information on phone number request see <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/userguide/settings-sms-request-number.html"> Requesting a
     * number </a> in the <i>Amazon Pinpoint User Guide</i>.
     * </p>
     * 
     * @param requestPhoneNumberRequest
     * @return A Java Future containing the result of the RequestPhoneNumber operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.RequestPhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/RequestPhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RequestPhoneNumberResult> requestPhoneNumberAsync(RequestPhoneNumberRequest requestPhoneNumberRequest);

    /**
     * <p>
     * Request an origination phone number for use in your account. For more information on phone number request see <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/userguide/settings-sms-request-number.html"> Requesting a
     * number </a> in the <i>Amazon Pinpoint User Guide</i>.
     * </p>
     * 
     * @param requestPhoneNumberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RequestPhoneNumber operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.RequestPhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/RequestPhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RequestPhoneNumberResult> requestPhoneNumberAsync(RequestPhoneNumberRequest requestPhoneNumberRequest,
            com.amazonaws.handlers.AsyncHandler<RequestPhoneNumberRequest, RequestPhoneNumberResult> asyncHandler);

    /**
     * <p>
     * Request a new sender ID that doesn't require registration.
     * </p>
     * 
     * @param requestSenderIdRequest
     * @return A Java Future containing the result of the RequestSenderId operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.RequestSenderId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/RequestSenderId"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RequestSenderIdResult> requestSenderIdAsync(RequestSenderIdRequest requestSenderIdRequest);

    /**
     * <p>
     * Request a new sender ID that doesn't require registration.
     * </p>
     * 
     * @param requestSenderIdRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RequestSenderId operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.RequestSenderId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/RequestSenderId"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RequestSenderIdResult> requestSenderIdAsync(RequestSenderIdRequest requestSenderIdRequest,
            com.amazonaws.handlers.AsyncHandler<RequestSenderIdRequest, RequestSenderIdResult> asyncHandler);

    /**
     * <p>
     * Before you can send test messages to a verified destination phone number you need to opt-in the verified
     * destination phone number. Creates a new text message with a verification code and send it to a verified
     * destination phone number. Once you have the verification code use <a>VerifyDestinationNumber</a> to opt-in the
     * verified destination phone number to receive messages.
     * </p>
     * 
     * @param sendDestinationNumberVerificationCodeRequest
     * @return A Java Future containing the result of the SendDestinationNumberVerificationCode operation returned by
     *         the service.
     * @sample AmazonPinpointSMSVoiceV2Async.SendDestinationNumberVerificationCode
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SendDestinationNumberVerificationCode"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendDestinationNumberVerificationCodeResult> sendDestinationNumberVerificationCodeAsync(
            SendDestinationNumberVerificationCodeRequest sendDestinationNumberVerificationCodeRequest);

    /**
     * <p>
     * Before you can send test messages to a verified destination phone number you need to opt-in the verified
     * destination phone number. Creates a new text message with a verification code and send it to a verified
     * destination phone number. Once you have the verification code use <a>VerifyDestinationNumber</a> to opt-in the
     * verified destination phone number to receive messages.
     * </p>
     * 
     * @param sendDestinationNumberVerificationCodeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendDestinationNumberVerificationCode operation returned by
     *         the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.SendDestinationNumberVerificationCode
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SendDestinationNumberVerificationCode"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendDestinationNumberVerificationCodeResult> sendDestinationNumberVerificationCodeAsync(
            SendDestinationNumberVerificationCodeRequest sendDestinationNumberVerificationCodeRequest,
            com.amazonaws.handlers.AsyncHandler<SendDestinationNumberVerificationCodeRequest, SendDestinationNumberVerificationCodeResult> asyncHandler);

    /**
     * <p>
     * Creates a new multimedia message (MMS) and sends it to a recipient's phone number.
     * </p>
     * 
     * @param sendMediaMessageRequest
     * @return A Java Future containing the result of the SendMediaMessage operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.SendMediaMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SendMediaMessage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendMediaMessageResult> sendMediaMessageAsync(SendMediaMessageRequest sendMediaMessageRequest);

    /**
     * <p>
     * Creates a new multimedia message (MMS) and sends it to a recipient's phone number.
     * </p>
     * 
     * @param sendMediaMessageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendMediaMessage operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.SendMediaMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SendMediaMessage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendMediaMessageResult> sendMediaMessageAsync(SendMediaMessageRequest sendMediaMessageRequest,
            com.amazonaws.handlers.AsyncHandler<SendMediaMessageRequest, SendMediaMessageResult> asyncHandler);

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
     * @return A Java Future containing the result of the SendTextMessage operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.SendTextMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SendTextMessage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendTextMessageResult> sendTextMessageAsync(SendTextMessageRequest sendTextMessageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendTextMessage operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.SendTextMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SendTextMessage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendTextMessageResult> sendTextMessageAsync(SendTextMessageRequest sendTextMessageRequest,
            com.amazonaws.handlers.AsyncHandler<SendTextMessageRequest, SendTextMessageResult> asyncHandler);

    /**
     * <p>
     * Allows you to send a request that sends a voice message through Amazon Pinpoint. This operation uses <a
     * href="http://aws.amazon.com/polly/">Amazon Polly</a> to convert a text script into a voice message.
     * </p>
     * 
     * @param sendVoiceMessageRequest
     * @return A Java Future containing the result of the SendVoiceMessage operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.SendVoiceMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SendVoiceMessage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendVoiceMessageResult> sendVoiceMessageAsync(SendVoiceMessageRequest sendVoiceMessageRequest);

    /**
     * <p>
     * Allows you to send a request that sends a voice message through Amazon Pinpoint. This operation uses <a
     * href="http://aws.amazon.com/polly/">Amazon Polly</a> to convert a text script into a voice message.
     * </p>
     * 
     * @param sendVoiceMessageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendVoiceMessage operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.SendVoiceMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SendVoiceMessage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendVoiceMessageResult> sendVoiceMessageAsync(SendVoiceMessageRequest sendVoiceMessageRequest,
            com.amazonaws.handlers.AsyncHandler<SendVoiceMessageRequest, SendVoiceMessageResult> asyncHandler);

    /**
     * <p>
     * Set a protect configuration as your account default. You can only have one account default protect configuration
     * at a time. The current account default protect configuration is replaced with the provided protect configuration.
     * </p>
     * 
     * @param setAccountDefaultProtectConfigurationRequest
     * @return A Java Future containing the result of the SetAccountDefaultProtectConfiguration operation returned by
     *         the service.
     * @sample AmazonPinpointSMSVoiceV2Async.SetAccountDefaultProtectConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SetAccountDefaultProtectConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetAccountDefaultProtectConfigurationResult> setAccountDefaultProtectConfigurationAsync(
            SetAccountDefaultProtectConfigurationRequest setAccountDefaultProtectConfigurationRequest);

    /**
     * <p>
     * Set a protect configuration as your account default. You can only have one account default protect configuration
     * at a time. The current account default protect configuration is replaced with the provided protect configuration.
     * </p>
     * 
     * @param setAccountDefaultProtectConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetAccountDefaultProtectConfiguration operation returned by
     *         the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.SetAccountDefaultProtectConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SetAccountDefaultProtectConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetAccountDefaultProtectConfigurationResult> setAccountDefaultProtectConfigurationAsync(
            SetAccountDefaultProtectConfigurationRequest setAccountDefaultProtectConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<SetAccountDefaultProtectConfigurationRequest, SetAccountDefaultProtectConfigurationResult> asyncHandler);

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
     * @return A Java Future containing the result of the SetDefaultMessageType operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.SetDefaultMessageType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SetDefaultMessageType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetDefaultMessageTypeResult> setDefaultMessageTypeAsync(SetDefaultMessageTypeRequest setDefaultMessageTypeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetDefaultMessageType operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.SetDefaultMessageType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SetDefaultMessageType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetDefaultMessageTypeResult> setDefaultMessageTypeAsync(SetDefaultMessageTypeRequest setDefaultMessageTypeRequest,
            com.amazonaws.handlers.AsyncHandler<SetDefaultMessageTypeRequest, SetDefaultMessageTypeResult> asyncHandler);

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
     * @return A Java Future containing the result of the SetDefaultSenderId operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.SetDefaultSenderId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SetDefaultSenderId"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetDefaultSenderIdResult> setDefaultSenderIdAsync(SetDefaultSenderIdRequest setDefaultSenderIdRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetDefaultSenderId operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.SetDefaultSenderId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SetDefaultSenderId"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetDefaultSenderIdResult> setDefaultSenderIdAsync(SetDefaultSenderIdRequest setDefaultSenderIdRequest,
            com.amazonaws.handlers.AsyncHandler<SetDefaultSenderIdRequest, SetDefaultSenderIdResult> asyncHandler);

    /**
     * <p>
     * Sets an account level monthly spend limit override for sending MMS messages. The requested spend limit must be
     * less than or equal to the <code>MaxLimit</code>, which is set by Amazon Web Services.
     * </p>
     * 
     * @param setMediaMessageSpendLimitOverrideRequest
     * @return A Java Future containing the result of the SetMediaMessageSpendLimitOverride operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2Async.SetMediaMessageSpendLimitOverride
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SetMediaMessageSpendLimitOverride"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetMediaMessageSpendLimitOverrideResult> setMediaMessageSpendLimitOverrideAsync(
            SetMediaMessageSpendLimitOverrideRequest setMediaMessageSpendLimitOverrideRequest);

    /**
     * <p>
     * Sets an account level monthly spend limit override for sending MMS messages. The requested spend limit must be
     * less than or equal to the <code>MaxLimit</code>, which is set by Amazon Web Services.
     * </p>
     * 
     * @param setMediaMessageSpendLimitOverrideRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetMediaMessageSpendLimitOverride operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.SetMediaMessageSpendLimitOverride
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SetMediaMessageSpendLimitOverride"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetMediaMessageSpendLimitOverrideResult> setMediaMessageSpendLimitOverrideAsync(
            SetMediaMessageSpendLimitOverrideRequest setMediaMessageSpendLimitOverrideRequest,
            com.amazonaws.handlers.AsyncHandler<SetMediaMessageSpendLimitOverrideRequest, SetMediaMessageSpendLimitOverrideResult> asyncHandler);

    /**
     * <p>
     * Sets an account level monthly spend limit override for sending text messages. The requested spend limit must be
     * less than or equal to the <code>MaxLimit</code>, which is set by Amazon Web Services.
     * </p>
     * 
     * @param setTextMessageSpendLimitOverrideRequest
     * @return A Java Future containing the result of the SetTextMessageSpendLimitOverride operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2Async.SetTextMessageSpendLimitOverride
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SetTextMessageSpendLimitOverride"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetTextMessageSpendLimitOverrideResult> setTextMessageSpendLimitOverrideAsync(
            SetTextMessageSpendLimitOverrideRequest setTextMessageSpendLimitOverrideRequest);

    /**
     * <p>
     * Sets an account level monthly spend limit override for sending text messages. The requested spend limit must be
     * less than or equal to the <code>MaxLimit</code>, which is set by Amazon Web Services.
     * </p>
     * 
     * @param setTextMessageSpendLimitOverrideRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetTextMessageSpendLimitOverride operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.SetTextMessageSpendLimitOverride
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SetTextMessageSpendLimitOverride"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetTextMessageSpendLimitOverrideResult> setTextMessageSpendLimitOverrideAsync(
            SetTextMessageSpendLimitOverrideRequest setTextMessageSpendLimitOverrideRequest,
            com.amazonaws.handlers.AsyncHandler<SetTextMessageSpendLimitOverrideRequest, SetTextMessageSpendLimitOverrideResult> asyncHandler);

    /**
     * <p>
     * Sets an account level monthly spend limit override for sending voice messages. The requested spend limit must be
     * less than or equal to the <code>MaxLimit</code>, which is set by Amazon Web Services.
     * </p>
     * 
     * @param setVoiceMessageSpendLimitOverrideRequest
     * @return A Java Future containing the result of the SetVoiceMessageSpendLimitOverride operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2Async.SetVoiceMessageSpendLimitOverride
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SetVoiceMessageSpendLimitOverride"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetVoiceMessageSpendLimitOverrideResult> setVoiceMessageSpendLimitOverrideAsync(
            SetVoiceMessageSpendLimitOverrideRequest setVoiceMessageSpendLimitOverrideRequest);

    /**
     * <p>
     * Sets an account level monthly spend limit override for sending voice messages. The requested spend limit must be
     * less than or equal to the <code>MaxLimit</code>, which is set by Amazon Web Services.
     * </p>
     * 
     * @param setVoiceMessageSpendLimitOverrideRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetVoiceMessageSpendLimitOverride operation returned by the
     *         service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.SetVoiceMessageSpendLimitOverride
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SetVoiceMessageSpendLimitOverride"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetVoiceMessageSpendLimitOverrideResult> setVoiceMessageSpendLimitOverrideAsync(
            SetVoiceMessageSpendLimitOverrideRequest setVoiceMessageSpendLimitOverrideRequest,
            com.amazonaws.handlers.AsyncHandler<SetVoiceMessageSpendLimitOverrideRequest, SetVoiceMessageSpendLimitOverrideResult> asyncHandler);

    /**
     * <p>
     * Submit the specified registration for review and approval.
     * </p>
     * 
     * @param submitRegistrationVersionRequest
     * @return A Java Future containing the result of the SubmitRegistrationVersion operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.SubmitRegistrationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SubmitRegistrationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SubmitRegistrationVersionResult> submitRegistrationVersionAsync(
            SubmitRegistrationVersionRequest submitRegistrationVersionRequest);

    /**
     * <p>
     * Submit the specified registration for review and approval.
     * </p>
     * 
     * @param submitRegistrationVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SubmitRegistrationVersion operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.SubmitRegistrationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SubmitRegistrationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SubmitRegistrationVersionResult> submitRegistrationVersionAsync(
            SubmitRegistrationVersionRequest submitRegistrationVersionRequest,
            com.amazonaws.handlers.AsyncHandler<SubmitRegistrationVersionRequest, SubmitRegistrationVersionResult> asyncHandler);

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
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the association of the specified tags from an Amazon Pinpoint SMS Voice V2 resource. For more information
     * on tags see <a href="https://docs.aws.amazon.com/pinpoint/latest/developerguide/tagging-resources.html"> Tagging
     * Amazon Pinpoint resources</a> in the <i>Amazon Pinpoint Developer Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the association of the specified tags from an Amazon Pinpoint SMS Voice V2 resource. For more information
     * on tags see <a href="https://docs.aws.amazon.com/pinpoint/latest/developerguide/tagging-resources.html"> Tagging
     * Amazon Pinpoint resources</a> in the <i>Amazon Pinpoint Developer Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateEventDestination operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.UpdateEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UpdateEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEventDestinationResult> updateEventDestinationAsync(UpdateEventDestinationRequest updateEventDestinationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEventDestination operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.UpdateEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UpdateEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEventDestinationResult> updateEventDestinationAsync(UpdateEventDestinationRequest updateEventDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEventDestinationRequest, UpdateEventDestinationResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdatePhoneNumber operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.UpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UpdatePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePhoneNumberResult> updatePhoneNumberAsync(UpdatePhoneNumberRequest updatePhoneNumberRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePhoneNumber operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.UpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UpdatePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePhoneNumberResult> updatePhoneNumberAsync(UpdatePhoneNumberRequest updatePhoneNumberRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePhoneNumberRequest, UpdatePhoneNumberResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration of an existing pool. You can update the opt-out list, enable or disable two-way
     * messaging, change the <code>TwoWayChannelArn</code>, enable or disable self-managed opt-outs, enable or disable
     * deletion protection, and enable or disable shared routes.
     * </p>
     * 
     * @param updatePoolRequest
     * @return A Java Future containing the result of the UpdatePool operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.UpdatePool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UpdatePool"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePoolResult> updatePoolAsync(UpdatePoolRequest updatePoolRequest);

    /**
     * <p>
     * Updates the configuration of an existing pool. You can update the opt-out list, enable or disable two-way
     * messaging, change the <code>TwoWayChannelArn</code>, enable or disable self-managed opt-outs, enable or disable
     * deletion protection, and enable or disable shared routes.
     * </p>
     * 
     * @param updatePoolRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePool operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.UpdatePool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UpdatePool"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePoolResult> updatePoolAsync(UpdatePoolRequest updatePoolRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePoolRequest, UpdatePoolResult> asyncHandler);

    /**
     * <p>
     * Update the setting for an existing protect configuration.
     * </p>
     * 
     * @param updateProtectConfigurationRequest
     * @return A Java Future containing the result of the UpdateProtectConfiguration operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.UpdateProtectConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UpdateProtectConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProtectConfigurationResult> updateProtectConfigurationAsync(
            UpdateProtectConfigurationRequest updateProtectConfigurationRequest);

    /**
     * <p>
     * Update the setting for an existing protect configuration.
     * </p>
     * 
     * @param updateProtectConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProtectConfiguration operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.UpdateProtectConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UpdateProtectConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProtectConfigurationResult> updateProtectConfigurationAsync(
            UpdateProtectConfigurationRequest updateProtectConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProtectConfigurationRequest, UpdateProtectConfigurationResult> asyncHandler);

    /**
     * <p>
     * Update a country rule set to <code>ALLOW</code> or <code>BLOCK</code> messages to be sent to the specified
     * destination counties. You can update one or multiple countries at a time. The updates are only applied to the
     * specified NumberCapability type.
     * </p>
     * 
     * @param updateProtectConfigurationCountryRuleSetRequest
     * @return A Java Future containing the result of the UpdateProtectConfigurationCountryRuleSet operation returned by
     *         the service.
     * @sample AmazonPinpointSMSVoiceV2Async.UpdateProtectConfigurationCountryRuleSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UpdateProtectConfigurationCountryRuleSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProtectConfigurationCountryRuleSetResult> updateProtectConfigurationCountryRuleSetAsync(
            UpdateProtectConfigurationCountryRuleSetRequest updateProtectConfigurationCountryRuleSetRequest);

    /**
     * <p>
     * Update a country rule set to <code>ALLOW</code> or <code>BLOCK</code> messages to be sent to the specified
     * destination counties. You can update one or multiple countries at a time. The updates are only applied to the
     * specified NumberCapability type.
     * </p>
     * 
     * @param updateProtectConfigurationCountryRuleSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProtectConfigurationCountryRuleSet operation returned by
     *         the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.UpdateProtectConfigurationCountryRuleSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UpdateProtectConfigurationCountryRuleSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProtectConfigurationCountryRuleSetResult> updateProtectConfigurationCountryRuleSetAsync(
            UpdateProtectConfigurationCountryRuleSetRequest updateProtectConfigurationCountryRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProtectConfigurationCountryRuleSetRequest, UpdateProtectConfigurationCountryRuleSetResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration of an existing sender ID.
     * </p>
     * 
     * @param updateSenderIdRequest
     * @return A Java Future containing the result of the UpdateSenderId operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.UpdateSenderId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UpdateSenderId"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSenderIdResult> updateSenderIdAsync(UpdateSenderIdRequest updateSenderIdRequest);

    /**
     * <p>
     * Updates the configuration of an existing sender ID.
     * </p>
     * 
     * @param updateSenderIdRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSenderId operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.UpdateSenderId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UpdateSenderId"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSenderIdResult> updateSenderIdAsync(UpdateSenderIdRequest updateSenderIdRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSenderIdRequest, UpdateSenderIdResult> asyncHandler);

    /**
     * <p>
     * Use the verification code that was received by the verified destination phone number to opt-in the verified
     * destination phone number to receive more messages.
     * </p>
     * 
     * @param verifyDestinationNumberRequest
     * @return A Java Future containing the result of the VerifyDestinationNumber operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2Async.VerifyDestinationNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/VerifyDestinationNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<VerifyDestinationNumberResult> verifyDestinationNumberAsync(VerifyDestinationNumberRequest verifyDestinationNumberRequest);

    /**
     * <p>
     * Use the verification code that was received by the verified destination phone number to opt-in the verified
     * destination phone number to receive more messages.
     * </p>
     * 
     * @param verifyDestinationNumberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the VerifyDestinationNumber operation returned by the service.
     * @sample AmazonPinpointSMSVoiceV2AsyncHandler.VerifyDestinationNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/VerifyDestinationNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<VerifyDestinationNumberResult> verifyDestinationNumberAsync(VerifyDestinationNumberRequest verifyDestinationNumberRequest,
            com.amazonaws.handlers.AsyncHandler<VerifyDestinationNumberRequest, VerifyDestinationNumberResult> asyncHandler);

}
