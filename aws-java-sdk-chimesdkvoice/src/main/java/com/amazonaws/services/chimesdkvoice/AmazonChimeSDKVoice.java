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
package com.amazonaws.services.chimesdkvoice;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.chimesdkvoice.model.*;

/**
 * Interface for accessing Amazon Chime SDK Voice.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.chimesdkvoice.AbstractAmazonChimeSDKVoice} instead.
 * </p>
 * <p>
 * <p>
 * The Amazon Chime SDK telephony APIs in this section enable developers to create PSTN calling solutions that use
 * Amazon Chime SDK Voice Connectors, and Amazon Chime SDK SIP media applications. Developers can also order and manage
 * phone numbers, create and manage Voice Connectors and SIP media applications, and run voice analytics.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonChimeSDKVoice {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "voice-chime";

    /**
     * <p>
     * Associates phone numbers with the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param associatePhoneNumbersWithVoiceConnectorRequest
     * @return Result of the AssociatePhoneNumbersWithVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.AssociatePhoneNumbersWithVoiceConnector
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/AssociatePhoneNumbersWithVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    AssociatePhoneNumbersWithVoiceConnectorResult associatePhoneNumbersWithVoiceConnector(
            AssociatePhoneNumbersWithVoiceConnectorRequest associatePhoneNumbersWithVoiceConnectorRequest);

    /**
     * <p>
     * Associates phone numbers with the specified Amazon Chime SDK Voice Connector group.
     * </p>
     * 
     * @param associatePhoneNumbersWithVoiceConnectorGroupRequest
     * @return Result of the AssociatePhoneNumbersWithVoiceConnectorGroup operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.AssociatePhoneNumbersWithVoiceConnectorGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/AssociatePhoneNumbersWithVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    AssociatePhoneNumbersWithVoiceConnectorGroupResult associatePhoneNumbersWithVoiceConnectorGroup(
            AssociatePhoneNumbersWithVoiceConnectorGroupRequest associatePhoneNumbersWithVoiceConnectorGroupRequest);

    /**
     * <p>
     * Moves phone numbers into the <b>Deletion queue</b>. Phone numbers must be disassociated from any users or Amazon
     * Chime SDK Voice Connectors before they can be deleted.
     * </p>
     * <p>
     * Phone numbers remain in the <b>Deletion queue</b> for 7 days before they are deleted permanently.
     * </p>
     * 
     * @param batchDeletePhoneNumberRequest
     * @return Result of the BatchDeletePhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.BatchDeletePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/BatchDeletePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDeletePhoneNumberResult batchDeletePhoneNumber(BatchDeletePhoneNumberRequest batchDeletePhoneNumberRequest);

    /**
     * <p>
     * Updates phone number product types, calling names, or phone number names. You can update one attribute at a time
     * for each <code>UpdatePhoneNumberRequestItem</code>. For example, you can update the product type, the calling
     * name, or phone name.
     * </p>
     * <note>
     * <p>
     * You cannot have a duplicate <code>phoneNumberId</code> in a request.
     * </p>
     * </note>
     * 
     * @param batchUpdatePhoneNumberRequest
     * @return Result of the BatchUpdatePhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.BatchUpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/BatchUpdatePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    BatchUpdatePhoneNumberResult batchUpdatePhoneNumber(BatchUpdatePhoneNumberRequest batchUpdatePhoneNumberRequest);

    /**
     * <p>
     * Creates an order for phone numbers to be provisioned. For numbers outside the U.S., you must use the Amazon Chime
     * SDK SIP media application dial-in product type.
     * </p>
     * 
     * @param createPhoneNumberOrderRequest
     * @return Result of the CreatePhoneNumberOrder operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.CreatePhoneNumberOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreatePhoneNumberOrder"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePhoneNumberOrderResult createPhoneNumberOrder(CreatePhoneNumberOrderRequest createPhoneNumberOrderRequest);

    /**
     * <p>
     * Creates a proxy session for the specified Amazon Chime SDK Voice Connector for the specified participant phone
     * numbers.
     * </p>
     * 
     * @param createProxySessionRequest
     * @return Result of the CreateProxySession operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.CreateProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateProxySession"
     *      target="_top">AWS API Documentation</a>
     */
    CreateProxySessionResult createProxySession(CreateProxySessionRequest createProxySessionRequest);

    /**
     * <p>
     * Creates a SIP media application. For more information about SIP media applications, see <a
     * href="https://docs.aws.amazon.com/chime-sdk/latest/ag/manage-sip-applications.html">Managing SIP media
     * applications and rules</a> in the <i>Amazon Chime SDK Administrator Guide</i>.
     * </p>
     * 
     * @param createSipMediaApplicationRequest
     * @return Result of the CreateSipMediaApplication operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.CreateSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSipMediaApplicationResult createSipMediaApplication(CreateSipMediaApplicationRequest createSipMediaApplicationRequest);

    /**
     * <p>
     * Creates an outbound call to a phone number from the phone number specified in the request, and it invokes the
     * endpoint of the specified <code>sipMediaApplicationId</code>.
     * </p>
     * 
     * @param createSipMediaApplicationCallRequest
     * @return Result of the CreateSipMediaApplicationCall operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.CreateSipMediaApplicationCall
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateSipMediaApplicationCall"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSipMediaApplicationCallResult createSipMediaApplicationCall(CreateSipMediaApplicationCallRequest createSipMediaApplicationCallRequest);

    /**
     * <p>
     * Creates a SIP rule, which can be used to run a SIP media application as a target for a specific trigger type. For
     * more information about SIP rules, see <a
     * href="https://docs.aws.amazon.com/chime-sdk/latest/ag/manage-sip-applications.html">Managing SIP media
     * applications and rules</a> in the <i>Amazon Chime SDK Administrator Guide</i>.
     * </p>
     * 
     * @param createSipRuleRequest
     * @return Result of the CreateSipRule operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.CreateSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateSipRule" target="_top">AWS
     *      API Documentation</a>
     */
    CreateSipRuleResult createSipRule(CreateSipRuleRequest createSipRuleRequest);

    /**
     * <p>
     * Creates an Amazon Chime SDK Voice Connector. For more information about Voice Connectors, see <a
     * href="https://docs.aws.amazon.com/chime-sdk/latest/ag/voice-connector-groups.html">Managing Amazon Chime SDK
     * Voice Connector groups</a> in the <i>Amazon Chime SDK Administrator Guide</i>.
     * </p>
     * 
     * @param createVoiceConnectorRequest
     * @return Result of the CreateVoiceConnector operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.CreateVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    CreateVoiceConnectorResult createVoiceConnector(CreateVoiceConnectorRequest createVoiceConnectorRequest);

    /**
     * <p>
     * Creates an Amazon Chime SDK Voice Connector group under the administrator's AWS account. You can associate Amazon
     * Chime SDK Voice Connectors with the Voice Connector group by including <code>VoiceConnectorItems</code> in the
     * request.
     * </p>
     * <p>
     * You can include Voice Connectors from different AWS Regions in your group. This creates a fault tolerant
     * mechanism for fallback in case of availability events.
     * </p>
     * 
     * @param createVoiceConnectorGroupRequest
     * @return Result of the CreateVoiceConnectorGroup operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.CreateVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateVoiceConnectorGroupResult createVoiceConnectorGroup(CreateVoiceConnectorGroupRequest createVoiceConnectorGroupRequest);

    /**
     * <p>
     * Creates a voice profile, which consists of an enrolled user and their latest voice print.
     * </p>
     * <important>
     * <p>
     * Before creating any voice profiles, you must provide all notices and obtain all consents from the speaker as
     * required under applicable privacy and biometrics laws, and as required under the <a
     * href="https://aws.amazon.com/service-terms/">AWS service terms</a> for the Amazon Chime SDK.
     * </p>
     * </important>
     * <p>
     * For more information about voice profiles and voice analytics, see <a
     * href="https://docs.aws.amazon.com/chime-sdk/latest/dg/pstn-voice-analytics.html">Using Amazon Chime SDK Voice
     * Analytics</a> in the <i>Amazon Chime SDK Developer Guide</i>.
     * </p>
     * 
     * @param createVoiceProfileRequest
     * @return Result of the CreateVoiceProfile operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws GoneException
     *         Access to the target resource is no longer available at the origin server. This condition is likely to be
     *         permanent.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.CreateVoiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateVoiceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    CreateVoiceProfileResult createVoiceProfile(CreateVoiceProfileRequest createVoiceProfileRequest);

    /**
     * <p>
     * Creates a voice profile domain, a collection of voice profiles, their voice prints, and encrypted enrollment
     * audio.
     * </p>
     * <important>
     * <p>
     * Before creating any voice profiles, you must provide all notices and obtain all consents from the speaker as
     * required under applicable privacy and biometrics laws, and as required under the <a
     * href="https://aws.amazon.com/service-terms/">AWS service terms</a> for the Amazon Chime SDK.
     * </p>
     * </important>
     * <p>
     * For more information about voice profile domains, see <a
     * href="https://docs.aws.amazon.com/chime-sdk/latest/dg/pstn-voice-analytics.html">Using Amazon Chime SDK Voice
     * Analytics</a> in the <i>Amazon Chime SDK Developer Guide</i>.
     * </p>
     * 
     * @param createVoiceProfileDomainRequest
     * @return Result of the CreateVoiceProfileDomain operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.CreateVoiceProfileDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateVoiceProfileDomain"
     *      target="_top">AWS API Documentation</a>
     */
    CreateVoiceProfileDomainResult createVoiceProfileDomain(CreateVoiceProfileDomainRequest createVoiceProfileDomainRequest);

    /**
     * <p>
     * Moves the specified phone number into the <b>Deletion queue</b>. A phone number must be disassociated from any
     * users or Amazon Chime SDK Voice Connectors before it can be deleted.
     * </p>
     * <p>
     * Deleted phone numbers remain in the <b>Deletion queue</b> queue for 7 days before they are deleted permanently.
     * </p>
     * 
     * @param deletePhoneNumberRequest
     * @return Result of the DeletePhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeletePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeletePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePhoneNumberResult deletePhoneNumber(DeletePhoneNumberRequest deletePhoneNumberRequest);

    /**
     * <p>
     * Deletes the specified proxy session from the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param deleteProxySessionRequest
     * @return Result of the DeleteProxySession operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeleteProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteProxySession"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteProxySessionResult deleteProxySession(DeleteProxySessionRequest deleteProxySessionRequest);

    /**
     * <p>
     * Deletes a SIP media application.
     * </p>
     * 
     * @param deleteSipMediaApplicationRequest
     * @return Result of the DeleteSipMediaApplication operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeleteSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSipMediaApplicationResult deleteSipMediaApplication(DeleteSipMediaApplicationRequest deleteSipMediaApplicationRequest);

    /**
     * <p>
     * Deletes a SIP rule.
     * </p>
     * 
     * @param deleteSipRuleRequest
     * @return Result of the DeleteSipRule operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeleteSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteSipRule" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteSipRuleResult deleteSipRule(DeleteSipRuleRequest deleteSipRuleRequest);

    /**
     * <p>
     * Deletes an Amazon Chime SDK Voice Connector. Any phone numbers associated with the Amazon Chime SDK Voice
     * Connector must be disassociated from it before it can be deleted.
     * </p>
     * 
     * @param deleteVoiceConnectorRequest
     * @return Result of the DeleteVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeleteVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVoiceConnectorResult deleteVoiceConnector(DeleteVoiceConnectorRequest deleteVoiceConnectorRequest);

    /**
     * <p>
     * Deletes the emergency calling details from the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorEmergencyCallingConfigurationRequest
     * @return Result of the DeleteVoiceConnectorEmergencyCallingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeleteVoiceConnectorEmergencyCallingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorEmergencyCallingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVoiceConnectorEmergencyCallingConfigurationResult deleteVoiceConnectorEmergencyCallingConfiguration(
            DeleteVoiceConnectorEmergencyCallingConfigurationRequest deleteVoiceConnectorEmergencyCallingConfigurationRequest);

    /**
     * <p>
     * Deletes an Amazon Chime SDK Voice Connector group. Any <code>VoiceConnectorItems</code> and phone numbers
     * associated with the group must be removed before it can be deleted.
     * </p>
     * 
     * @param deleteVoiceConnectorGroupRequest
     * @return Result of the DeleteVoiceConnectorGroup operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeleteVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVoiceConnectorGroupResult deleteVoiceConnectorGroup(DeleteVoiceConnectorGroupRequest deleteVoiceConnectorGroupRequest);

    /**
     * <p>
     * Deletes the origination settings for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * <note>
     * <p>
     * If emergency calling is configured for the Voice Connector, it must be deleted prior to deleting the origination
     * settings.
     * </p>
     * </note>
     * 
     * @param deleteVoiceConnectorOriginationRequest
     * @return Result of the DeleteVoiceConnectorOrigination operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeleteVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVoiceConnectorOriginationResult deleteVoiceConnectorOrigination(DeleteVoiceConnectorOriginationRequest deleteVoiceConnectorOriginationRequest);

    /**
     * <p>
     * Deletes the proxy configuration from the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorProxyRequest
     * @return Result of the DeleteVoiceConnectorProxy operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeleteVoiceConnectorProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorProxy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVoiceConnectorProxyResult deleteVoiceConnectorProxy(DeleteVoiceConnectorProxyRequest deleteVoiceConnectorProxyRequest);

    /**
     * <p>
     * Deletes a Voice Connector's streaming configuration.
     * </p>
     * 
     * @param deleteVoiceConnectorStreamingConfigurationRequest
     * @return Result of the DeleteVoiceConnectorStreamingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeleteVoiceConnectorStreamingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorStreamingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVoiceConnectorStreamingConfigurationResult deleteVoiceConnectorStreamingConfiguration(
            DeleteVoiceConnectorStreamingConfigurationRequest deleteVoiceConnectorStreamingConfigurationRequest);

    /**
     * <p>
     * Deletes the termination settings for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * <note>
     * <p>
     * If emergency calling is configured for the Voice Connector, it must be deleted prior to deleting the termination
     * settings.
     * </p>
     * </note>
     * 
     * @param deleteVoiceConnectorTerminationRequest
     * @return Result of the DeleteVoiceConnectorTermination operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeleteVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVoiceConnectorTerminationResult deleteVoiceConnectorTermination(DeleteVoiceConnectorTerminationRequest deleteVoiceConnectorTerminationRequest);

    /**
     * <p>
     * Deletes the specified SIP credentials used by your equipment to authenticate during call termination.
     * </p>
     * 
     * @param deleteVoiceConnectorTerminationCredentialsRequest
     * @return Result of the DeleteVoiceConnectorTerminationCredentials operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeleteVoiceConnectorTerminationCredentials
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVoiceConnectorTerminationCredentialsResult deleteVoiceConnectorTerminationCredentials(
            DeleteVoiceConnectorTerminationCredentialsRequest deleteVoiceConnectorTerminationCredentialsRequest);

    /**
     * <p>
     * Deletes a voice profile, including its voice print and enrollment data. WARNING: This action is not reversible.
     * </p>
     * 
     * @param deleteVoiceProfileRequest
     * @return Result of the DeleteVoiceProfile operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeleteVoiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVoiceProfileResult deleteVoiceProfile(DeleteVoiceProfileRequest deleteVoiceProfileRequest);

    /**
     * <p>
     * Deletes all voice profiles in the domain. WARNING: This action is not reversible.
     * </p>
     * 
     * @param deleteVoiceProfileDomainRequest
     * @return Result of the DeleteVoiceProfileDomain operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeleteVoiceProfileDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceProfileDomain"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVoiceProfileDomainResult deleteVoiceProfileDomain(DeleteVoiceProfileDomainRequest deleteVoiceProfileDomainRequest);

    /**
     * <p>
     * Disassociates the specified phone numbers from the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param disassociatePhoneNumbersFromVoiceConnectorRequest
     * @return Result of the DisassociatePhoneNumbersFromVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DisassociatePhoneNumbersFromVoiceConnector
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DisassociatePhoneNumbersFromVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociatePhoneNumbersFromVoiceConnectorResult disassociatePhoneNumbersFromVoiceConnector(
            DisassociatePhoneNumbersFromVoiceConnectorRequest disassociatePhoneNumbersFromVoiceConnectorRequest);

    /**
     * <p>
     * Disassociates the specified phone numbers from the specified Amazon Chime SDK Voice Connector group.
     * </p>
     * 
     * @param disassociatePhoneNumbersFromVoiceConnectorGroupRequest
     * @return Result of the DisassociatePhoneNumbersFromVoiceConnectorGroup operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DisassociatePhoneNumbersFromVoiceConnectorGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DisassociatePhoneNumbersFromVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociatePhoneNumbersFromVoiceConnectorGroupResult disassociatePhoneNumbersFromVoiceConnectorGroup(
            DisassociatePhoneNumbersFromVoiceConnectorGroupRequest disassociatePhoneNumbersFromVoiceConnectorGroupRequest);

    /**
     * <p>
     * Retrieves the global settings for the Amazon Chime SDK Voice Connectors in an AWS account.
     * </p>
     * 
     * @param getGlobalSettingsRequest
     * @return Result of the GetGlobalSettings operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetGlobalSettings"
     *      target="_top">AWS API Documentation</a>
     */
    GetGlobalSettingsResult getGlobalSettings(GetGlobalSettingsRequest getGlobalSettingsRequest);

    /**
     * <p>
     * Retrieves details for the specified phone number ID, such as associations, capabilities, and product type.
     * </p>
     * 
     * @param getPhoneNumberRequest
     * @return Result of the GetPhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetPhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetPhoneNumber" target="_top">AWS
     *      API Documentation</a>
     */
    GetPhoneNumberResult getPhoneNumber(GetPhoneNumberRequest getPhoneNumberRequest);

    /**
     * <p>
     * Retrieves details for the specified phone number order, such as the order creation timestamp, phone numbers in
     * E.164 format, product type, and order status.
     * </p>
     * 
     * @param getPhoneNumberOrderRequest
     * @return Result of the GetPhoneNumberOrder operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetPhoneNumberOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetPhoneNumberOrder"
     *      target="_top">AWS API Documentation</a>
     */
    GetPhoneNumberOrderResult getPhoneNumberOrder(GetPhoneNumberOrderRequest getPhoneNumberOrderRequest);

    /**
     * <p>
     * Retrieves the phone number settings for the administrator's AWS account, such as the default outbound calling
     * name.
     * </p>
     * 
     * @param getPhoneNumberSettingsRequest
     * @return Result of the GetPhoneNumberSettings operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetPhoneNumberSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetPhoneNumberSettings"
     *      target="_top">AWS API Documentation</a>
     */
    GetPhoneNumberSettingsResult getPhoneNumberSettings(GetPhoneNumberSettingsRequest getPhoneNumberSettingsRequest);

    /**
     * <p>
     * Retrieves the specified proxy session details for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param getProxySessionRequest
     * @return Result of the GetProxySession operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetProxySession"
     *      target="_top">AWS API Documentation</a>
     */
    GetProxySessionResult getProxySession(GetProxySessionRequest getProxySessionRequest);

    /**
     * <p>
     * Retrieves the information for a SIP media application, including name, AWS Region, and endpoints.
     * </p>
     * 
     * @param getSipMediaApplicationRequest
     * @return Result of the GetSipMediaApplication operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    GetSipMediaApplicationResult getSipMediaApplication(GetSipMediaApplicationRequest getSipMediaApplicationRequest);

    /**
     * <p>
     * Gets the Alexa Skill configuration for the SIP media application.
     * </p>
     * <important>
     * <p>
     * Due to changes made by the Amazon Alexa service, this API is no longer available for use. For more information,
     * refer to the <a href="https://developer.amazon.com/en-US/alexa/alexasmartproperties">Alexa Smart Properties</a>
     * page.
     * </p>
     * </important>
     * 
     * @param getSipMediaApplicationAlexaSkillConfigurationRequest
     * @return Result of the GetSipMediaApplicationAlexaSkillConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetSipMediaApplicationAlexaSkillConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSipMediaApplicationAlexaSkillConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    GetSipMediaApplicationAlexaSkillConfigurationResult getSipMediaApplicationAlexaSkillConfiguration(
            GetSipMediaApplicationAlexaSkillConfigurationRequest getSipMediaApplicationAlexaSkillConfigurationRequest);

    /**
     * <p>
     * Retrieves the logging configuration for the specified SIP media application.
     * </p>
     * 
     * @param getSipMediaApplicationLoggingConfigurationRequest
     * @return Result of the GetSipMediaApplicationLoggingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetSipMediaApplicationLoggingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSipMediaApplicationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetSipMediaApplicationLoggingConfigurationResult getSipMediaApplicationLoggingConfiguration(
            GetSipMediaApplicationLoggingConfigurationRequest getSipMediaApplicationLoggingConfigurationRequest);

    /**
     * <p>
     * Retrieves the details of a SIP rule, such as the rule ID, name, triggers, and target endpoints.
     * </p>
     * 
     * @param getSipRuleRequest
     * @return Result of the GetSipRule operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSipRule" target="_top">AWS API
     *      Documentation</a>
     */
    GetSipRuleResult getSipRule(GetSipRuleRequest getSipRuleRequest);

    /**
     * <p>
     * Retrieves the details of the specified speaker search task.
     * </p>
     * 
     * @param getSpeakerSearchTaskRequest
     * @return Result of the GetSpeakerSearchTask operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AmazonChimeSDKVoice.GetSpeakerSearchTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSpeakerSearchTask"
     *      target="_top">AWS API Documentation</a>
     */
    GetSpeakerSearchTaskResult getSpeakerSearchTask(GetSpeakerSearchTaskRequest getSpeakerSearchTaskRequest);

    /**
     * <p>
     * Retrieves details for the specified Amazon Chime SDK Voice Connector, such as timestamps,name, outbound host, and
     * encryption requirements.
     * </p>
     * 
     * @param getVoiceConnectorRequest
     * @return Result of the GetVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceConnectorResult getVoiceConnector(GetVoiceConnectorRequest getVoiceConnectorRequest);

    /**
     * <p>
     * Retrieves the emergency calling configuration details for the specified Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorEmergencyCallingConfigurationRequest
     * @return Result of the GetVoiceConnectorEmergencyCallingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetVoiceConnectorEmergencyCallingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorEmergencyCallingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceConnectorEmergencyCallingConfigurationResult getVoiceConnectorEmergencyCallingConfiguration(
            GetVoiceConnectorEmergencyCallingConfigurationRequest getVoiceConnectorEmergencyCallingConfigurationRequest);

    /**
     * <p>
     * Retrieves details for the specified Amazon Chime SDK Voice Connector group, such as timestamps,name, and
     * associated <code>VoiceConnectorItems</code>.
     * </p>
     * 
     * @param getVoiceConnectorGroupRequest
     * @return Result of the GetVoiceConnectorGroup operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceConnectorGroupResult getVoiceConnectorGroup(GetVoiceConnectorGroupRequest getVoiceConnectorGroupRequest);

    /**
     * <p>
     * Retrieves the logging configuration settings for the specified Voice Connector. Shows whether SIP message logs
     * are enabled for sending to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param getVoiceConnectorLoggingConfigurationRequest
     * @return Result of the GetVoiceConnectorLoggingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetVoiceConnectorLoggingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceConnectorLoggingConfigurationResult getVoiceConnectorLoggingConfiguration(
            GetVoiceConnectorLoggingConfigurationRequest getVoiceConnectorLoggingConfigurationRequest);

    /**
     * <p>
     * Retrieves the origination settings for the specified Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorOriginationRequest
     * @return Result of the GetVoiceConnectorOrigination operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceConnectorOriginationResult getVoiceConnectorOrigination(GetVoiceConnectorOriginationRequest getVoiceConnectorOriginationRequest);

    /**
     * <p>
     * Retrieves the proxy configuration details for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorProxyRequest
     * @return Result of the GetVoiceConnectorProxy operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetVoiceConnectorProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorProxy"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceConnectorProxyResult getVoiceConnectorProxy(GetVoiceConnectorProxyRequest getVoiceConnectorProxyRequest);

    /**
     * <p>
     * Retrieves the streaming configuration details for the specified Amazon Chime SDK Voice Connector. Shows whether
     * media streaming is enabled for sending to Amazon Kinesis. It also shows the retention period, in hours, for the
     * Amazon Kinesis data.
     * </p>
     * 
     * @param getVoiceConnectorStreamingConfigurationRequest
     * @return Result of the GetVoiceConnectorStreamingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetVoiceConnectorStreamingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorStreamingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceConnectorStreamingConfigurationResult getVoiceConnectorStreamingConfiguration(
            GetVoiceConnectorStreamingConfigurationRequest getVoiceConnectorStreamingConfigurationRequest);

    /**
     * <p>
     * Retrieves the termination setting details for the specified Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorTerminationRequest
     * @return Result of the GetVoiceConnectorTermination operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceConnectorTerminationResult getVoiceConnectorTermination(GetVoiceConnectorTerminationRequest getVoiceConnectorTerminationRequest);

    /**
     * <p>
     * Retrieves information about the last time a <code>SIP OPTIONS</code> ping was received from your SIP
     * infrastructure for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorTerminationHealthRequest
     * @return Result of the GetVoiceConnectorTerminationHealth operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetVoiceConnectorTerminationHealth
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorTerminationHealth"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceConnectorTerminationHealthResult getVoiceConnectorTerminationHealth(
            GetVoiceConnectorTerminationHealthRequest getVoiceConnectorTerminationHealthRequest);

    /**
     * <p>
     * Retrieves the details of the specified voice profile.
     * </p>
     * 
     * @param getVoiceProfileRequest
     * @return Result of the GetVoiceProfile operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetVoiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceProfileResult getVoiceProfile(GetVoiceProfileRequest getVoiceProfileRequest);

    /**
     * <p>
     * Retrieves the details of the specified voice profile domain.
     * </p>
     * 
     * @param getVoiceProfileDomainRequest
     * @return Result of the GetVoiceProfileDomain operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetVoiceProfileDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceProfileDomain"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceProfileDomainResult getVoiceProfileDomain(GetVoiceProfileDomainRequest getVoiceProfileDomainRequest);

    /**
     * <p>
     * Retrieves the details of a voice tone analysis task.
     * </p>
     * 
     * @param getVoiceToneAnalysisTaskRequest
     * @return Result of the GetVoiceToneAnalysisTask operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AmazonChimeSDKVoice.GetVoiceToneAnalysisTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceToneAnalysisTask"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceToneAnalysisTaskResult getVoiceToneAnalysisTask(GetVoiceToneAnalysisTaskRequest getVoiceToneAnalysisTaskRequest);

    /**
     * <p>
     * Lists the available AWS Regions in which you can create an Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param listAvailableVoiceConnectorRegionsRequest
     * @return Result of the ListAvailableVoiceConnectorRegions operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ListAvailableVoiceConnectorRegions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListAvailableVoiceConnectorRegions"
     *      target="_top">AWS API Documentation</a>
     */
    ListAvailableVoiceConnectorRegionsResult listAvailableVoiceConnectorRegions(
            ListAvailableVoiceConnectorRegionsRequest listAvailableVoiceConnectorRegionsRequest);

    /**
     * <p>
     * Lists the phone numbers for an administrator's Amazon Chime SDK account.
     * </p>
     * 
     * @param listPhoneNumberOrdersRequest
     * @return Result of the ListPhoneNumberOrders operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ListPhoneNumberOrders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListPhoneNumberOrders"
     *      target="_top">AWS API Documentation</a>
     */
    ListPhoneNumberOrdersResult listPhoneNumberOrders(ListPhoneNumberOrdersRequest listPhoneNumberOrdersRequest);

    /**
     * <p>
     * Lists the phone numbers for the specified Amazon Chime SDK account, Amazon Chime SDK user, Amazon Chime SDK Voice
     * Connector, or Amazon Chime SDK Voice Connector group.
     * </p>
     * 
     * @param listPhoneNumbersRequest
     * @return Result of the ListPhoneNumbers operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ListPhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListPhoneNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    ListPhoneNumbersResult listPhoneNumbers(ListPhoneNumbersRequest listPhoneNumbersRequest);

    /**
     * <p>
     * Lists the proxy sessions for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param listProxySessionsRequest
     * @return Result of the ListProxySessions operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ListProxySessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListProxySessions"
     *      target="_top">AWS API Documentation</a>
     */
    ListProxySessionsResult listProxySessions(ListProxySessionsRequest listProxySessionsRequest);

    /**
     * <p>
     * Lists the SIP media applications under the administrator's AWS account.
     * </p>
     * 
     * @param listSipMediaApplicationsRequest
     * @return Result of the ListSipMediaApplications operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ListSipMediaApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListSipMediaApplications"
     *      target="_top">AWS API Documentation</a>
     */
    ListSipMediaApplicationsResult listSipMediaApplications(ListSipMediaApplicationsRequest listSipMediaApplicationsRequest);

    /**
     * <p>
     * Lists the SIP rules under the administrator's AWS account.
     * </p>
     * 
     * @param listSipRulesRequest
     * @return Result of the ListSipRules operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ListSipRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListSipRules" target="_top">AWS
     *      API Documentation</a>
     */
    ListSipRulesResult listSipRules(ListSipRulesRequest listSipRulesRequest);

    /**
     * <p>
     * Lists the countries that you can order phone numbers from.
     * </p>
     * 
     * @param listSupportedPhoneNumberCountriesRequest
     * @return Result of the ListSupportedPhoneNumberCountries operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ListSupportedPhoneNumberCountries
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListSupportedPhoneNumberCountries"
     *      target="_top">AWS API Documentation</a>
     */
    ListSupportedPhoneNumberCountriesResult listSupportedPhoneNumberCountries(ListSupportedPhoneNumberCountriesRequest listSupportedPhoneNumberCountriesRequest);

    /**
     * <p>
     * Returns a list of the tags in a given resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the Amazon Chime SDK Voice Connector groups in the administrator's AWS account.
     * </p>
     * 
     * @param listVoiceConnectorGroupsRequest
     * @return Result of the ListVoiceConnectorGroups operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ListVoiceConnectorGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceConnectorGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListVoiceConnectorGroupsResult listVoiceConnectorGroups(ListVoiceConnectorGroupsRequest listVoiceConnectorGroupsRequest);

    /**
     * <p>
     * Lists the SIP credentials for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param listVoiceConnectorTerminationCredentialsRequest
     * @return Result of the ListVoiceConnectorTerminationCredentials operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ListVoiceConnectorTerminationCredentials
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    ListVoiceConnectorTerminationCredentialsResult listVoiceConnectorTerminationCredentials(
            ListVoiceConnectorTerminationCredentialsRequest listVoiceConnectorTerminationCredentialsRequest);

    /**
     * <p>
     * Lists the Amazon Chime SDK Voice Connectors in the administrators AWS account.
     * </p>
     * 
     * @param listVoiceConnectorsRequest
     * @return Result of the ListVoiceConnectors operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ListVoiceConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceConnectors"
     *      target="_top">AWS API Documentation</a>
     */
    ListVoiceConnectorsResult listVoiceConnectors(ListVoiceConnectorsRequest listVoiceConnectorsRequest);

    /**
     * <p>
     * Lists the specified voice profile domains in the administrator's AWS account.
     * </p>
     * 
     * @param listVoiceProfileDomainsRequest
     * @return Result of the ListVoiceProfileDomains operation returned by the service.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ListVoiceProfileDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceProfileDomains"
     *      target="_top">AWS API Documentation</a>
     */
    ListVoiceProfileDomainsResult listVoiceProfileDomains(ListVoiceProfileDomainsRequest listVoiceProfileDomainsRequest);

    /**
     * <p>
     * Lists the voice profiles in a voice profile domain.
     * </p>
     * 
     * @param listVoiceProfilesRequest
     * @return Result of the ListVoiceProfiles operation returned by the service.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ListVoiceProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    ListVoiceProfilesResult listVoiceProfiles(ListVoiceProfilesRequest listVoiceProfilesRequest);

    /**
     * <p>
     * Updates the Alexa Skill configuration for the SIP media application.
     * </p>
     * <important>
     * <p>
     * Due to changes made by the Amazon Alexa service, this API is no longer available for use. For more information,
     * refer to the <a href="https://developer.amazon.com/en-US/alexa/alexasmartproperties">Alexa Smart Properties</a>
     * page.
     * </p>
     * </important>
     * 
     * @param putSipMediaApplicationAlexaSkillConfigurationRequest
     * @return Result of the PutSipMediaApplicationAlexaSkillConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.PutSipMediaApplicationAlexaSkillConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutSipMediaApplicationAlexaSkillConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    PutSipMediaApplicationAlexaSkillConfigurationResult putSipMediaApplicationAlexaSkillConfiguration(
            PutSipMediaApplicationAlexaSkillConfigurationRequest putSipMediaApplicationAlexaSkillConfigurationRequest);

    /**
     * <p>
     * Updates the logging configuration for the specified SIP media application.
     * </p>
     * 
     * @param putSipMediaApplicationLoggingConfigurationRequest
     * @return Result of the PutSipMediaApplicationLoggingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.PutSipMediaApplicationLoggingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutSipMediaApplicationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutSipMediaApplicationLoggingConfigurationResult putSipMediaApplicationLoggingConfiguration(
            PutSipMediaApplicationLoggingConfigurationRequest putSipMediaApplicationLoggingConfigurationRequest);

    /**
     * <p>
     * Updates a Voice Connector's emergency calling configuration.
     * </p>
     * 
     * @param putVoiceConnectorEmergencyCallingConfigurationRequest
     * @return Result of the PutVoiceConnectorEmergencyCallingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.PutVoiceConnectorEmergencyCallingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorEmergencyCallingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutVoiceConnectorEmergencyCallingConfigurationResult putVoiceConnectorEmergencyCallingConfiguration(
            PutVoiceConnectorEmergencyCallingConfigurationRequest putVoiceConnectorEmergencyCallingConfigurationRequest);

    /**
     * <p>
     * Updates a Voice Connector's logging configuration.
     * </p>
     * 
     * @param putVoiceConnectorLoggingConfigurationRequest
     * @return Result of the PutVoiceConnectorLoggingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.PutVoiceConnectorLoggingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutVoiceConnectorLoggingConfigurationResult putVoiceConnectorLoggingConfiguration(
            PutVoiceConnectorLoggingConfigurationRequest putVoiceConnectorLoggingConfigurationRequest);

    /**
     * <p>
     * Updates a Voice Connector's origination settings.
     * </p>
     * 
     * @param putVoiceConnectorOriginationRequest
     * @return Result of the PutVoiceConnectorOrigination operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.PutVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    PutVoiceConnectorOriginationResult putVoiceConnectorOrigination(PutVoiceConnectorOriginationRequest putVoiceConnectorOriginationRequest);

    /**
     * <p>
     * Puts the specified proxy configuration to the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param putVoiceConnectorProxyRequest
     * @return Result of the PutVoiceConnectorProxy operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.PutVoiceConnectorProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorProxy"
     *      target="_top">AWS API Documentation</a>
     */
    PutVoiceConnectorProxyResult putVoiceConnectorProxy(PutVoiceConnectorProxyRequest putVoiceConnectorProxyRequest);

    /**
     * <p>
     * Updates a Voice Connector's streaming configuration settings.
     * </p>
     * 
     * @param putVoiceConnectorStreamingConfigurationRequest
     * @return Result of the PutVoiceConnectorStreamingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.PutVoiceConnectorStreamingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorStreamingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutVoiceConnectorStreamingConfigurationResult putVoiceConnectorStreamingConfiguration(
            PutVoiceConnectorStreamingConfigurationRequest putVoiceConnectorStreamingConfigurationRequest);

    /**
     * <p>
     * Updates a Voice Connector's termination settings.
     * </p>
     * 
     * @param putVoiceConnectorTerminationRequest
     * @return Result of the PutVoiceConnectorTermination operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.PutVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    PutVoiceConnectorTerminationResult putVoiceConnectorTermination(PutVoiceConnectorTerminationRequest putVoiceConnectorTerminationRequest);

    /**
     * <p>
     * Updates a Voice Connector's termination credentials.
     * </p>
     * 
     * @param putVoiceConnectorTerminationCredentialsRequest
     * @return Result of the PutVoiceConnectorTerminationCredentials operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.PutVoiceConnectorTerminationCredentials
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    PutVoiceConnectorTerminationCredentialsResult putVoiceConnectorTerminationCredentials(
            PutVoiceConnectorTerminationCredentialsRequest putVoiceConnectorTerminationCredentialsRequest);

    /**
     * <p>
     * Restores a deleted phone number.
     * </p>
     * 
     * @param restorePhoneNumberRequest
     * @return Result of the RestorePhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.RestorePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/RestorePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    RestorePhoneNumberResult restorePhoneNumber(RestorePhoneNumberRequest restorePhoneNumberRequest);

    /**
     * <p>
     * Searches the provisioned phone numbers in an organization.
     * </p>
     * 
     * @param searchAvailablePhoneNumbersRequest
     * @return Result of the SearchAvailablePhoneNumbers operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.SearchAvailablePhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/SearchAvailablePhoneNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    SearchAvailablePhoneNumbersResult searchAvailablePhoneNumbers(SearchAvailablePhoneNumbersRequest searchAvailablePhoneNumbersRequest);

    /**
     * <p>
     * Starts a speaker search task.
     * </p>
     * <important>
     * <p>
     * Before starting any speaker search tasks, you must provide all notices and obtain all consents from the speaker
     * as required under applicable privacy and biometrics laws, and as required under the <a
     * href="https://aws.amazon.com/service-terms/">AWS service terms</a> for the Amazon Chime SDK.
     * </p>
     * </important>
     * 
     * @param startSpeakerSearchTaskRequest
     * @return Result of the StartSpeakerSearchTask operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws GoneException
     *         Access to the target resource is no longer available at the origin server. This condition is likely to be
     *         permanent.
     * @throws UnprocessableEntityException
     *         A well-formed request couldn't be followed due to semantic errors.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.StartSpeakerSearchTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/StartSpeakerSearchTask"
     *      target="_top">AWS API Documentation</a>
     */
    StartSpeakerSearchTaskResult startSpeakerSearchTask(StartSpeakerSearchTaskRequest startSpeakerSearchTaskRequest);

    /**
     * <p>
     * Starts a voice tone analysis task. For more information about voice tone analysis, see <a
     * href="https://docs.aws.amazon.com/chime-sdk/latest/dg/pstn-voice-analytics.html">Using Amazon Chime SDK voice
     * analytics</a> in the <i>Amazon Chime SDK Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * Before starting any voice tone analysis tasks, you must provide all notices and obtain all consents from the
     * speaker as required under applicable privacy and biometrics laws, and as required under the <a
     * href="https://aws.amazon.com/service-terms/">AWS service terms</a> for the Amazon Chime SDK.
     * </p>
     * </important>
     * 
     * @param startVoiceToneAnalysisTaskRequest
     * @return Result of the StartVoiceToneAnalysisTask operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws GoneException
     *         Access to the target resource is no longer available at the origin server. This condition is likely to be
     *         permanent.
     * @throws UnprocessableEntityException
     *         A well-formed request couldn't be followed due to semantic errors.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.StartVoiceToneAnalysisTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/StartVoiceToneAnalysisTask"
     *      target="_top">AWS API Documentation</a>
     */
    StartVoiceToneAnalysisTaskResult startVoiceToneAnalysisTask(StartVoiceToneAnalysisTaskRequest startVoiceToneAnalysisTaskRequest);

    /**
     * <p>
     * Stops a speaker search task.
     * </p>
     * 
     * @param stopSpeakerSearchTaskRequest
     * @return Result of the StopSpeakerSearchTask operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws UnprocessableEntityException
     *         A well-formed request couldn't be followed due to semantic errors.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.StopSpeakerSearchTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/StopSpeakerSearchTask"
     *      target="_top">AWS API Documentation</a>
     */
    StopSpeakerSearchTaskResult stopSpeakerSearchTask(StopSpeakerSearchTaskRequest stopSpeakerSearchTaskRequest);

    /**
     * <p>
     * Stops a voice tone analysis task.
     * </p>
     * 
     * @param stopVoiceToneAnalysisTaskRequest
     * @return Result of the StopVoiceToneAnalysisTask operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws UnprocessableEntityException
     *         A well-formed request couldn't be followed due to semantic errors.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.StopVoiceToneAnalysisTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/StopVoiceToneAnalysisTask"
     *      target="_top">AWS API Documentation</a>
     */
    StopVoiceToneAnalysisTaskResult stopVoiceToneAnalysisTask(StopVoiceToneAnalysisTaskRequest stopVoiceToneAnalysisTaskRequest);

    /**
     * <p>
     * Adds a tag to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates global settings for the Amazon Chime SDK Voice Connectors in an AWS account.
     * </p>
     * 
     * @param updateGlobalSettingsRequest
     * @return Result of the UpdateGlobalSettings operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.UpdateGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateGlobalSettings"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateGlobalSettingsResult updateGlobalSettings(UpdateGlobalSettingsRequest updateGlobalSettingsRequest);

    /**
     * <p>
     * Updates phone number details, such as product type, calling name, or phone number name for the specified phone
     * number ID. You can update one phone number detail at a time. For example, you can update either the product type,
     * calling name, or phone number name in one action.
     * </p>
     * <p>
     * For numbers outside the U.S., you must use the Amazon Chime SDK SIP Media Application Dial-In product type.
     * </p>
     * <p>
     * Updates to outbound calling names can take 72 hours to complete. Pending updates to outbound calling names must
     * be complete before you can request another update.
     * </p>
     * 
     * @param updatePhoneNumberRequest
     * @return Result of the UpdatePhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.UpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdatePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePhoneNumberResult updatePhoneNumber(UpdatePhoneNumberRequest updatePhoneNumberRequest);

    /**
     * <p>
     * Updates the phone number settings for the administrator's AWS account, such as the default outbound calling name.
     * You can update the default outbound calling name once every seven days. Outbound calling names can take up to 72
     * hours to update.
     * </p>
     * 
     * @param updatePhoneNumberSettingsRequest
     * @return Result of the UpdatePhoneNumberSettings operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.UpdatePhoneNumberSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdatePhoneNumberSettings"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePhoneNumberSettingsResult updatePhoneNumberSettings(UpdatePhoneNumberSettingsRequest updatePhoneNumberSettingsRequest);

    /**
     * <p>
     * Updates the specified proxy session details, such as voice or SMS capabilities.
     * </p>
     * 
     * @param updateProxySessionRequest
     * @return Result of the UpdateProxySession operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.UpdateProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateProxySession"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateProxySessionResult updateProxySession(UpdateProxySessionRequest updateProxySessionRequest);

    /**
     * <p>
     * Updates the details of the specified SIP media application.
     * </p>
     * 
     * @param updateSipMediaApplicationRequest
     * @return Result of the UpdateSipMediaApplication operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.UpdateSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSipMediaApplicationResult updateSipMediaApplication(UpdateSipMediaApplicationRequest updateSipMediaApplicationRequest);

    /**
     * <p>
     * Invokes the AWS Lambda function associated with the SIP media application and transaction ID in an update
     * request. The Lambda function can then return a new set of actions.
     * </p>
     * 
     * @param updateSipMediaApplicationCallRequest
     * @return Result of the UpdateSipMediaApplicationCall operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.UpdateSipMediaApplicationCall
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateSipMediaApplicationCall"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSipMediaApplicationCallResult updateSipMediaApplicationCall(UpdateSipMediaApplicationCallRequest updateSipMediaApplicationCallRequest);

    /**
     * <p>
     * Updates the details of the specified SIP rule.
     * </p>
     * 
     * @param updateSipRuleRequest
     * @return Result of the UpdateSipRule operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.UpdateSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateSipRule" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateSipRuleResult updateSipRule(UpdateSipRuleRequest updateSipRuleRequest);

    /**
     * <p>
     * Updates the details for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param updateVoiceConnectorRequest
     * @return Result of the UpdateVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.UpdateVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateVoiceConnectorResult updateVoiceConnector(UpdateVoiceConnectorRequest updateVoiceConnectorRequest);

    /**
     * <p>
     * Updates the settings for the specified Amazon Chime SDK Voice Connector group.
     * </p>
     * 
     * @param updateVoiceConnectorGroupRequest
     * @return Result of the UpdateVoiceConnectorGroup operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.UpdateVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateVoiceConnectorGroupResult updateVoiceConnectorGroup(UpdateVoiceConnectorGroupRequest updateVoiceConnectorGroupRequest);

    /**
     * <p>
     * Updates the specified voice profile’s voice print and refreshes its expiration timestamp.
     * </p>
     * <important>
     * <p>
     * As a condition of using this feature, you acknowledge that the collection, use, storage, and retention of your
     * caller’s biometric identifiers and biometric information (“biometric data”) in the form of a digital voiceprint
     * requires the caller’s informed consent via a written release. Such consent is required under various state laws,
     * including biometrics laws in Illinois, Texas, Washington and other state privacy laws.
     * </p>
     * <p>
     * You must provide a written release to each caller through a process that clearly reflects each caller’s informed
     * consent before using Amazon Chime SDK Voice Insights service, as required under the terms of your agreement with
     * AWS governing your use of the service.
     * </p>
     * </important>
     * 
     * @param updateVoiceProfileRequest
     * @return Result of the UpdateVoiceProfile operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws GoneException
     *         Access to the target resource is no longer available at the origin server. This condition is likely to be
     *         permanent.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.UpdateVoiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateVoiceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateVoiceProfileResult updateVoiceProfile(UpdateVoiceProfileRequest updateVoiceProfileRequest);

    /**
     * <p>
     * Updates the settings for the specified voice profile domain.
     * </p>
     * 
     * @param updateVoiceProfileDomainRequest
     * @return Result of the UpdateVoiceProfileDomain operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.UpdateVoiceProfileDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateVoiceProfileDomain"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateVoiceProfileDomainResult updateVoiceProfileDomain(UpdateVoiceProfileDomainRequest updateVoiceProfileDomainRequest);

    /**
     * <p>
     * Validates an address to be used for 911 calls made with Amazon Chime SDK Voice Connectors. You can use validated
     * addresses in a Presence Information Data Format Location Object file that you include in SIP requests. That helps
     * ensure that addresses are routed to the appropriate Public Safety Answering Point.
     * </p>
     * 
     * @param validateE911AddressRequest
     * @return Result of the ValidateE911Address operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ValidateE911Address
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ValidateE911Address"
     *      target="_top">AWS API Documentation</a>
     */
    ValidateE911AddressResult validateE911Address(ValidateE911AddressRequest validateE911AddressRequest);

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
