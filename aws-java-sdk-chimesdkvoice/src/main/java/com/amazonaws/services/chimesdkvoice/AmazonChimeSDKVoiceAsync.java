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

import com.amazonaws.services.chimesdkvoice.model.*;

/**
 * Interface for accessing Amazon Chime SDK Voice asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.chimesdkvoice.AbstractAmazonChimeSDKVoiceAsync} instead.
 * </p>
 * <p>
 * <p>
 * The Amazon Chime SDK telephony APIs in this section enable developers to create PSTN calling solutions that use
 * Amazon Chime SDK Voice Connectors, and Amazon Chime SDK SIP media applications. Developers can also order and manage
 * phone numbers, create and manage Voice Connectors and SIP media applications, and run voice analytics.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonChimeSDKVoiceAsync extends AmazonChimeSDKVoice {

    /**
     * <p>
     * Associates phone numbers with the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param associatePhoneNumbersWithVoiceConnectorRequest
     * @return A Java Future containing the result of the AssociatePhoneNumbersWithVoiceConnector operation returned by
     *         the service.
     * @sample AmazonChimeSDKVoiceAsync.AssociatePhoneNumbersWithVoiceConnector
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/AssociatePhoneNumbersWithVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociatePhoneNumbersWithVoiceConnectorResult> associatePhoneNumbersWithVoiceConnectorAsync(
            AssociatePhoneNumbersWithVoiceConnectorRequest associatePhoneNumbersWithVoiceConnectorRequest);

    /**
     * <p>
     * Associates phone numbers with the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param associatePhoneNumbersWithVoiceConnectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociatePhoneNumbersWithVoiceConnector operation returned by
     *         the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.AssociatePhoneNumbersWithVoiceConnector
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/AssociatePhoneNumbersWithVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociatePhoneNumbersWithVoiceConnectorResult> associatePhoneNumbersWithVoiceConnectorAsync(
            AssociatePhoneNumbersWithVoiceConnectorRequest associatePhoneNumbersWithVoiceConnectorRequest,
            com.amazonaws.handlers.AsyncHandler<AssociatePhoneNumbersWithVoiceConnectorRequest, AssociatePhoneNumbersWithVoiceConnectorResult> asyncHandler);

    /**
     * <p>
     * Associates phone numbers with the specified Amazon Chime SDK Voice Connector group.
     * </p>
     * 
     * @param associatePhoneNumbersWithVoiceConnectorGroupRequest
     * @return A Java Future containing the result of the AssociatePhoneNumbersWithVoiceConnectorGroup operation
     *         returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.AssociatePhoneNumbersWithVoiceConnectorGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/AssociatePhoneNumbersWithVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociatePhoneNumbersWithVoiceConnectorGroupResult> associatePhoneNumbersWithVoiceConnectorGroupAsync(
            AssociatePhoneNumbersWithVoiceConnectorGroupRequest associatePhoneNumbersWithVoiceConnectorGroupRequest);

    /**
     * <p>
     * Associates phone numbers with the specified Amazon Chime SDK Voice Connector group.
     * </p>
     * 
     * @param associatePhoneNumbersWithVoiceConnectorGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociatePhoneNumbersWithVoiceConnectorGroup operation
     *         returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.AssociatePhoneNumbersWithVoiceConnectorGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/AssociatePhoneNumbersWithVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociatePhoneNumbersWithVoiceConnectorGroupResult> associatePhoneNumbersWithVoiceConnectorGroupAsync(
            AssociatePhoneNumbersWithVoiceConnectorGroupRequest associatePhoneNumbersWithVoiceConnectorGroupRequest,
            com.amazonaws.handlers.AsyncHandler<AssociatePhoneNumbersWithVoiceConnectorGroupRequest, AssociatePhoneNumbersWithVoiceConnectorGroupResult> asyncHandler);

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
     * @return A Java Future containing the result of the BatchDeletePhoneNumber operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.BatchDeletePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/BatchDeletePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeletePhoneNumberResult> batchDeletePhoneNumberAsync(BatchDeletePhoneNumberRequest batchDeletePhoneNumberRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDeletePhoneNumber operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.BatchDeletePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/BatchDeletePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeletePhoneNumberResult> batchDeletePhoneNumberAsync(BatchDeletePhoneNumberRequest batchDeletePhoneNumberRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDeletePhoneNumberRequest, BatchDeletePhoneNumberResult> asyncHandler);

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
     * @return A Java Future containing the result of the BatchUpdatePhoneNumber operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.BatchUpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/BatchUpdatePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdatePhoneNumberResult> batchUpdatePhoneNumberAsync(BatchUpdatePhoneNumberRequest batchUpdatePhoneNumberRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchUpdatePhoneNumber operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.BatchUpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/BatchUpdatePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdatePhoneNumberResult> batchUpdatePhoneNumberAsync(BatchUpdatePhoneNumberRequest batchUpdatePhoneNumberRequest,
            com.amazonaws.handlers.AsyncHandler<BatchUpdatePhoneNumberRequest, BatchUpdatePhoneNumberResult> asyncHandler);

    /**
     * <p>
     * Creates an order for phone numbers to be provisioned. For numbers outside the U.S., you must use the Amazon Chime
     * SDK SIP media application dial-in product type.
     * </p>
     * 
     * @param createPhoneNumberOrderRequest
     * @return A Java Future containing the result of the CreatePhoneNumberOrder operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.CreatePhoneNumberOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreatePhoneNumberOrder"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePhoneNumberOrderResult> createPhoneNumberOrderAsync(CreatePhoneNumberOrderRequest createPhoneNumberOrderRequest);

    /**
     * <p>
     * Creates an order for phone numbers to be provisioned. For numbers outside the U.S., you must use the Amazon Chime
     * SDK SIP media application dial-in product type.
     * </p>
     * 
     * @param createPhoneNumberOrderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePhoneNumberOrder operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.CreatePhoneNumberOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreatePhoneNumberOrder"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePhoneNumberOrderResult> createPhoneNumberOrderAsync(CreatePhoneNumberOrderRequest createPhoneNumberOrderRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePhoneNumberOrderRequest, CreatePhoneNumberOrderResult> asyncHandler);

    /**
     * <p>
     * Creates a proxy session for the specified Amazon Chime SDK Voice Connector for the specified participant phone
     * numbers.
     * </p>
     * 
     * @param createProxySessionRequest
     * @return A Java Future containing the result of the CreateProxySession operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.CreateProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateProxySession"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateProxySessionResult> createProxySessionAsync(CreateProxySessionRequest createProxySessionRequest);

    /**
     * <p>
     * Creates a proxy session for the specified Amazon Chime SDK Voice Connector for the specified participant phone
     * numbers.
     * </p>
     * 
     * @param createProxySessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProxySession operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.CreateProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateProxySession"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateProxySessionResult> createProxySessionAsync(CreateProxySessionRequest createProxySessionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProxySessionRequest, CreateProxySessionResult> asyncHandler);

    /**
     * <p>
     * Creates a SIP media application. For more information about SIP media applications, see <a
     * href="https://docs.aws.amazon.com/chime-sdk/latest/ag/manage-sip-applications.html">Managing SIP media
     * applications and rules</a> in the <i>Amazon Chime SDK Administrator Guide</i>.
     * </p>
     * 
     * @param createSipMediaApplicationRequest
     * @return A Java Future containing the result of the CreateSipMediaApplication operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.CreateSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSipMediaApplicationResult> createSipMediaApplicationAsync(
            CreateSipMediaApplicationRequest createSipMediaApplicationRequest);

    /**
     * <p>
     * Creates a SIP media application. For more information about SIP media applications, see <a
     * href="https://docs.aws.amazon.com/chime-sdk/latest/ag/manage-sip-applications.html">Managing SIP media
     * applications and rules</a> in the <i>Amazon Chime SDK Administrator Guide</i>.
     * </p>
     * 
     * @param createSipMediaApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSipMediaApplication operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.CreateSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSipMediaApplicationResult> createSipMediaApplicationAsync(
            CreateSipMediaApplicationRequest createSipMediaApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSipMediaApplicationRequest, CreateSipMediaApplicationResult> asyncHandler);

    /**
     * <p>
     * Creates an outbound call to a phone number from the phone number specified in the request, and it invokes the
     * endpoint of the specified <code>sipMediaApplicationId</code>.
     * </p>
     * 
     * @param createSipMediaApplicationCallRequest
     * @return A Java Future containing the result of the CreateSipMediaApplicationCall operation returned by the
     *         service.
     * @sample AmazonChimeSDKVoiceAsync.CreateSipMediaApplicationCall
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateSipMediaApplicationCall"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSipMediaApplicationCallResult> createSipMediaApplicationCallAsync(
            CreateSipMediaApplicationCallRequest createSipMediaApplicationCallRequest);

    /**
     * <p>
     * Creates an outbound call to a phone number from the phone number specified in the request, and it invokes the
     * endpoint of the specified <code>sipMediaApplicationId</code>.
     * </p>
     * 
     * @param createSipMediaApplicationCallRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSipMediaApplicationCall operation returned by the
     *         service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.CreateSipMediaApplicationCall
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateSipMediaApplicationCall"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSipMediaApplicationCallResult> createSipMediaApplicationCallAsync(
            CreateSipMediaApplicationCallRequest createSipMediaApplicationCallRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSipMediaApplicationCallRequest, CreateSipMediaApplicationCallResult> asyncHandler);

    /**
     * <p>
     * Creates a SIP rule, which can be used to run a SIP media application as a target for a specific trigger type. For
     * more information about SIP rules, see <a
     * href="https://docs.aws.amazon.com/chime-sdk/latest/ag/manage-sip-applications.html">Managing SIP media
     * applications and rules</a> in the <i>Amazon Chime SDK Administrator Guide</i>.
     * </p>
     * 
     * @param createSipRuleRequest
     * @return A Java Future containing the result of the CreateSipRule operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.CreateSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateSipRule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSipRuleResult> createSipRuleAsync(CreateSipRuleRequest createSipRuleRequest);

    /**
     * <p>
     * Creates a SIP rule, which can be used to run a SIP media application as a target for a specific trigger type. For
     * more information about SIP rules, see <a
     * href="https://docs.aws.amazon.com/chime-sdk/latest/ag/manage-sip-applications.html">Managing SIP media
     * applications and rules</a> in the <i>Amazon Chime SDK Administrator Guide</i>.
     * </p>
     * 
     * @param createSipRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSipRule operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.CreateSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateSipRule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSipRuleResult> createSipRuleAsync(CreateSipRuleRequest createSipRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSipRuleRequest, CreateSipRuleResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Chime SDK Voice Connector. For more information about Voice Connectors, see <a
     * href="https://docs.aws.amazon.com/chime-sdk/latest/ag/voice-connector-groups.html">Managing Amazon Chime SDK
     * Voice Connector groups</a> in the <i>Amazon Chime SDK Administrator Guide</i>.
     * </p>
     * 
     * @param createVoiceConnectorRequest
     * @return A Java Future containing the result of the CreateVoiceConnector operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.CreateVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVoiceConnectorResult> createVoiceConnectorAsync(CreateVoiceConnectorRequest createVoiceConnectorRequest);

    /**
     * <p>
     * Creates an Amazon Chime SDK Voice Connector. For more information about Voice Connectors, see <a
     * href="https://docs.aws.amazon.com/chime-sdk/latest/ag/voice-connector-groups.html">Managing Amazon Chime SDK
     * Voice Connector groups</a> in the <i>Amazon Chime SDK Administrator Guide</i>.
     * </p>
     * 
     * @param createVoiceConnectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVoiceConnector operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.CreateVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVoiceConnectorResult> createVoiceConnectorAsync(CreateVoiceConnectorRequest createVoiceConnectorRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVoiceConnectorRequest, CreateVoiceConnectorResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateVoiceConnectorGroup operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.CreateVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVoiceConnectorGroupResult> createVoiceConnectorGroupAsync(
            CreateVoiceConnectorGroupRequest createVoiceConnectorGroupRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVoiceConnectorGroup operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.CreateVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVoiceConnectorGroupResult> createVoiceConnectorGroupAsync(
            CreateVoiceConnectorGroupRequest createVoiceConnectorGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVoiceConnectorGroupRequest, CreateVoiceConnectorGroupResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateVoiceProfile operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.CreateVoiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateVoiceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVoiceProfileResult> createVoiceProfileAsync(CreateVoiceProfileRequest createVoiceProfileRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVoiceProfile operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.CreateVoiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateVoiceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVoiceProfileResult> createVoiceProfileAsync(CreateVoiceProfileRequest createVoiceProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVoiceProfileRequest, CreateVoiceProfileResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateVoiceProfileDomain operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.CreateVoiceProfileDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateVoiceProfileDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVoiceProfileDomainResult> createVoiceProfileDomainAsync(CreateVoiceProfileDomainRequest createVoiceProfileDomainRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVoiceProfileDomain operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.CreateVoiceProfileDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateVoiceProfileDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVoiceProfileDomainResult> createVoiceProfileDomainAsync(CreateVoiceProfileDomainRequest createVoiceProfileDomainRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVoiceProfileDomainRequest, CreateVoiceProfileDomainResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeletePhoneNumber operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.DeletePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeletePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePhoneNumberResult> deletePhoneNumberAsync(DeletePhoneNumberRequest deletePhoneNumberRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePhoneNumber operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.DeletePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeletePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePhoneNumberResult> deletePhoneNumberAsync(DeletePhoneNumberRequest deletePhoneNumberRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePhoneNumberRequest, DeletePhoneNumberResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified proxy session from the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param deleteProxySessionRequest
     * @return A Java Future containing the result of the DeleteProxySession operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.DeleteProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteProxySession"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProxySessionResult> deleteProxySessionAsync(DeleteProxySessionRequest deleteProxySessionRequest);

    /**
     * <p>
     * Deletes the specified proxy session from the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param deleteProxySessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProxySession operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.DeleteProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteProxySession"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProxySessionResult> deleteProxySessionAsync(DeleteProxySessionRequest deleteProxySessionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProxySessionRequest, DeleteProxySessionResult> asyncHandler);

    /**
     * <p>
     * Deletes a SIP media application.
     * </p>
     * 
     * @param deleteSipMediaApplicationRequest
     * @return A Java Future containing the result of the DeleteSipMediaApplication operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.DeleteSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSipMediaApplicationResult> deleteSipMediaApplicationAsync(
            DeleteSipMediaApplicationRequest deleteSipMediaApplicationRequest);

    /**
     * <p>
     * Deletes a SIP media application.
     * </p>
     * 
     * @param deleteSipMediaApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSipMediaApplication operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.DeleteSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSipMediaApplicationResult> deleteSipMediaApplicationAsync(
            DeleteSipMediaApplicationRequest deleteSipMediaApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSipMediaApplicationRequest, DeleteSipMediaApplicationResult> asyncHandler);

    /**
     * <p>
     * Deletes a SIP rule.
     * </p>
     * 
     * @param deleteSipRuleRequest
     * @return A Java Future containing the result of the DeleteSipRule operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.DeleteSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteSipRule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSipRuleResult> deleteSipRuleAsync(DeleteSipRuleRequest deleteSipRuleRequest);

    /**
     * <p>
     * Deletes a SIP rule.
     * </p>
     * 
     * @param deleteSipRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSipRule operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.DeleteSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteSipRule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSipRuleResult> deleteSipRuleAsync(DeleteSipRuleRequest deleteSipRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSipRuleRequest, DeleteSipRuleResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon Chime SDK Voice Connector. Any phone numbers associated with the Amazon Chime SDK Voice
     * Connector must be disassociated from it before it can be deleted.
     * </p>
     * 
     * @param deleteVoiceConnectorRequest
     * @return A Java Future containing the result of the DeleteVoiceConnector operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.DeleteVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorResult> deleteVoiceConnectorAsync(DeleteVoiceConnectorRequest deleteVoiceConnectorRequest);

    /**
     * <p>
     * Deletes an Amazon Chime SDK Voice Connector. Any phone numbers associated with the Amazon Chime SDK Voice
     * Connector must be disassociated from it before it can be deleted.
     * </p>
     * 
     * @param deleteVoiceConnectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVoiceConnector operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.DeleteVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorResult> deleteVoiceConnectorAsync(DeleteVoiceConnectorRequest deleteVoiceConnectorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorRequest, DeleteVoiceConnectorResult> asyncHandler);

    /**
     * <p>
     * Deletes the emergency calling details from the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorEmergencyCallingConfigurationRequest
     * @return A Java Future containing the result of the DeleteVoiceConnectorEmergencyCallingConfiguration operation
     *         returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.DeleteVoiceConnectorEmergencyCallingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorEmergencyCallingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorEmergencyCallingConfigurationResult> deleteVoiceConnectorEmergencyCallingConfigurationAsync(
            DeleteVoiceConnectorEmergencyCallingConfigurationRequest deleteVoiceConnectorEmergencyCallingConfigurationRequest);

    /**
     * <p>
     * Deletes the emergency calling details from the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorEmergencyCallingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVoiceConnectorEmergencyCallingConfiguration operation
     *         returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.DeleteVoiceConnectorEmergencyCallingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorEmergencyCallingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorEmergencyCallingConfigurationResult> deleteVoiceConnectorEmergencyCallingConfigurationAsync(
            DeleteVoiceConnectorEmergencyCallingConfigurationRequest deleteVoiceConnectorEmergencyCallingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorEmergencyCallingConfigurationRequest, DeleteVoiceConnectorEmergencyCallingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon Chime SDK Voice Connector group. Any <code>VoiceConnectorItems</code> and phone numbers
     * associated with the group must be removed before it can be deleted.
     * </p>
     * 
     * @param deleteVoiceConnectorGroupRequest
     * @return A Java Future containing the result of the DeleteVoiceConnectorGroup operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.DeleteVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorGroupResult> deleteVoiceConnectorGroupAsync(
            DeleteVoiceConnectorGroupRequest deleteVoiceConnectorGroupRequest);

    /**
     * <p>
     * Deletes an Amazon Chime SDK Voice Connector group. Any <code>VoiceConnectorItems</code> and phone numbers
     * associated with the group must be removed before it can be deleted.
     * </p>
     * 
     * @param deleteVoiceConnectorGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVoiceConnectorGroup operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.DeleteVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorGroupResult> deleteVoiceConnectorGroupAsync(
            DeleteVoiceConnectorGroupRequest deleteVoiceConnectorGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorGroupRequest, DeleteVoiceConnectorGroupResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteVoiceConnectorOrigination operation returned by the
     *         service.
     * @sample AmazonChimeSDKVoiceAsync.DeleteVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorOriginationResult> deleteVoiceConnectorOriginationAsync(
            DeleteVoiceConnectorOriginationRequest deleteVoiceConnectorOriginationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVoiceConnectorOrigination operation returned by the
     *         service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.DeleteVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorOriginationResult> deleteVoiceConnectorOriginationAsync(
            DeleteVoiceConnectorOriginationRequest deleteVoiceConnectorOriginationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorOriginationRequest, DeleteVoiceConnectorOriginationResult> asyncHandler);

    /**
     * <p>
     * Deletes the proxy configuration from the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorProxyRequest
     * @return A Java Future containing the result of the DeleteVoiceConnectorProxy operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.DeleteVoiceConnectorProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorProxy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorProxyResult> deleteVoiceConnectorProxyAsync(
            DeleteVoiceConnectorProxyRequest deleteVoiceConnectorProxyRequest);

    /**
     * <p>
     * Deletes the proxy configuration from the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorProxyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVoiceConnectorProxy operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.DeleteVoiceConnectorProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorProxy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorProxyResult> deleteVoiceConnectorProxyAsync(
            DeleteVoiceConnectorProxyRequest deleteVoiceConnectorProxyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorProxyRequest, DeleteVoiceConnectorProxyResult> asyncHandler);

    /**
     * <p>
     * Deletes a Voice Connector's streaming configuration.
     * </p>
     * 
     * @param deleteVoiceConnectorStreamingConfigurationRequest
     * @return A Java Future containing the result of the DeleteVoiceConnectorStreamingConfiguration operation returned
     *         by the service.
     * @sample AmazonChimeSDKVoiceAsync.DeleteVoiceConnectorStreamingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorStreamingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorStreamingConfigurationResult> deleteVoiceConnectorStreamingConfigurationAsync(
            DeleteVoiceConnectorStreamingConfigurationRequest deleteVoiceConnectorStreamingConfigurationRequest);

    /**
     * <p>
     * Deletes a Voice Connector's streaming configuration.
     * </p>
     * 
     * @param deleteVoiceConnectorStreamingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVoiceConnectorStreamingConfiguration operation returned
     *         by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.DeleteVoiceConnectorStreamingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorStreamingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorStreamingConfigurationResult> deleteVoiceConnectorStreamingConfigurationAsync(
            DeleteVoiceConnectorStreamingConfigurationRequest deleteVoiceConnectorStreamingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorStreamingConfigurationRequest, DeleteVoiceConnectorStreamingConfigurationResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteVoiceConnectorTermination operation returned by the
     *         service.
     * @sample AmazonChimeSDKVoiceAsync.DeleteVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorTerminationResult> deleteVoiceConnectorTerminationAsync(
            DeleteVoiceConnectorTerminationRequest deleteVoiceConnectorTerminationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVoiceConnectorTermination operation returned by the
     *         service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.DeleteVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorTerminationResult> deleteVoiceConnectorTerminationAsync(
            DeleteVoiceConnectorTerminationRequest deleteVoiceConnectorTerminationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorTerminationRequest, DeleteVoiceConnectorTerminationResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified SIP credentials used by your equipment to authenticate during call termination.
     * </p>
     * 
     * @param deleteVoiceConnectorTerminationCredentialsRequest
     * @return A Java Future containing the result of the DeleteVoiceConnectorTerminationCredentials operation returned
     *         by the service.
     * @sample AmazonChimeSDKVoiceAsync.DeleteVoiceConnectorTerminationCredentials
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorTerminationCredentialsResult> deleteVoiceConnectorTerminationCredentialsAsync(
            DeleteVoiceConnectorTerminationCredentialsRequest deleteVoiceConnectorTerminationCredentialsRequest);

    /**
     * <p>
     * Deletes the specified SIP credentials used by your equipment to authenticate during call termination.
     * </p>
     * 
     * @param deleteVoiceConnectorTerminationCredentialsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVoiceConnectorTerminationCredentials operation returned
     *         by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.DeleteVoiceConnectorTerminationCredentials
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorTerminationCredentialsResult> deleteVoiceConnectorTerminationCredentialsAsync(
            DeleteVoiceConnectorTerminationCredentialsRequest deleteVoiceConnectorTerminationCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorTerminationCredentialsRequest, DeleteVoiceConnectorTerminationCredentialsResult> asyncHandler);

    /**
     * <p>
     * Deletes a voice profile, including its voice print and enrollment data. WARNING: This action is not reversible.
     * </p>
     * 
     * @param deleteVoiceProfileRequest
     * @return A Java Future containing the result of the DeleteVoiceProfile operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.DeleteVoiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceProfileResult> deleteVoiceProfileAsync(DeleteVoiceProfileRequest deleteVoiceProfileRequest);

    /**
     * <p>
     * Deletes a voice profile, including its voice print and enrollment data. WARNING: This action is not reversible.
     * </p>
     * 
     * @param deleteVoiceProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVoiceProfile operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.DeleteVoiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceProfileResult> deleteVoiceProfileAsync(DeleteVoiceProfileRequest deleteVoiceProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVoiceProfileRequest, DeleteVoiceProfileResult> asyncHandler);

    /**
     * <p>
     * Deletes all voice profiles in the domain. WARNING: This action is not reversible.
     * </p>
     * 
     * @param deleteVoiceProfileDomainRequest
     * @return A Java Future containing the result of the DeleteVoiceProfileDomain operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.DeleteVoiceProfileDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceProfileDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceProfileDomainResult> deleteVoiceProfileDomainAsync(DeleteVoiceProfileDomainRequest deleteVoiceProfileDomainRequest);

    /**
     * <p>
     * Deletes all voice profiles in the domain. WARNING: This action is not reversible.
     * </p>
     * 
     * @param deleteVoiceProfileDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVoiceProfileDomain operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.DeleteVoiceProfileDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceProfileDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceProfileDomainResult> deleteVoiceProfileDomainAsync(DeleteVoiceProfileDomainRequest deleteVoiceProfileDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVoiceProfileDomainRequest, DeleteVoiceProfileDomainResult> asyncHandler);

    /**
     * <p>
     * Disassociates the specified phone numbers from the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param disassociatePhoneNumbersFromVoiceConnectorRequest
     * @return A Java Future containing the result of the DisassociatePhoneNumbersFromVoiceConnector operation returned
     *         by the service.
     * @sample AmazonChimeSDKVoiceAsync.DisassociatePhoneNumbersFromVoiceConnector
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DisassociatePhoneNumbersFromVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociatePhoneNumbersFromVoiceConnectorResult> disassociatePhoneNumbersFromVoiceConnectorAsync(
            DisassociatePhoneNumbersFromVoiceConnectorRequest disassociatePhoneNumbersFromVoiceConnectorRequest);

    /**
     * <p>
     * Disassociates the specified phone numbers from the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param disassociatePhoneNumbersFromVoiceConnectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociatePhoneNumbersFromVoiceConnector operation returned
     *         by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.DisassociatePhoneNumbersFromVoiceConnector
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DisassociatePhoneNumbersFromVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociatePhoneNumbersFromVoiceConnectorResult> disassociatePhoneNumbersFromVoiceConnectorAsync(
            DisassociatePhoneNumbersFromVoiceConnectorRequest disassociatePhoneNumbersFromVoiceConnectorRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociatePhoneNumbersFromVoiceConnectorRequest, DisassociatePhoneNumbersFromVoiceConnectorResult> asyncHandler);

    /**
     * <p>
     * Disassociates the specified phone numbers from the specified Amazon Chime SDK Voice Connector group.
     * </p>
     * 
     * @param disassociatePhoneNumbersFromVoiceConnectorGroupRequest
     * @return A Java Future containing the result of the DisassociatePhoneNumbersFromVoiceConnectorGroup operation
     *         returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.DisassociatePhoneNumbersFromVoiceConnectorGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DisassociatePhoneNumbersFromVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociatePhoneNumbersFromVoiceConnectorGroupResult> disassociatePhoneNumbersFromVoiceConnectorGroupAsync(
            DisassociatePhoneNumbersFromVoiceConnectorGroupRequest disassociatePhoneNumbersFromVoiceConnectorGroupRequest);

    /**
     * <p>
     * Disassociates the specified phone numbers from the specified Amazon Chime SDK Voice Connector group.
     * </p>
     * 
     * @param disassociatePhoneNumbersFromVoiceConnectorGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociatePhoneNumbersFromVoiceConnectorGroup operation
     *         returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.DisassociatePhoneNumbersFromVoiceConnectorGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DisassociatePhoneNumbersFromVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociatePhoneNumbersFromVoiceConnectorGroupResult> disassociatePhoneNumbersFromVoiceConnectorGroupAsync(
            DisassociatePhoneNumbersFromVoiceConnectorGroupRequest disassociatePhoneNumbersFromVoiceConnectorGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociatePhoneNumbersFromVoiceConnectorGroupRequest, DisassociatePhoneNumbersFromVoiceConnectorGroupResult> asyncHandler);

    /**
     * <p>
     * Retrieves the global settings for the Amazon Chime SDK Voice Connectors in an AWS account.
     * </p>
     * 
     * @param getGlobalSettingsRequest
     * @return A Java Future containing the result of the GetGlobalSettings operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetGlobalSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetGlobalSettingsResult> getGlobalSettingsAsync(GetGlobalSettingsRequest getGlobalSettingsRequest);

    /**
     * <p>
     * Retrieves the global settings for the Amazon Chime SDK Voice Connectors in an AWS account.
     * </p>
     * 
     * @param getGlobalSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGlobalSettings operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.GetGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetGlobalSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetGlobalSettingsResult> getGlobalSettingsAsync(GetGlobalSettingsRequest getGlobalSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetGlobalSettingsRequest, GetGlobalSettingsResult> asyncHandler);

    /**
     * <p>
     * Retrieves details for the specified phone number ID, such as associations, capabilities, and product type.
     * </p>
     * 
     * @param getPhoneNumberRequest
     * @return A Java Future containing the result of the GetPhoneNumber operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetPhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetPhoneNumber" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPhoneNumberResult> getPhoneNumberAsync(GetPhoneNumberRequest getPhoneNumberRequest);

    /**
     * <p>
     * Retrieves details for the specified phone number ID, such as associations, capabilities, and product type.
     * </p>
     * 
     * @param getPhoneNumberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPhoneNumber operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.GetPhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetPhoneNumber" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPhoneNumberResult> getPhoneNumberAsync(GetPhoneNumberRequest getPhoneNumberRequest,
            com.amazonaws.handlers.AsyncHandler<GetPhoneNumberRequest, GetPhoneNumberResult> asyncHandler);

    /**
     * <p>
     * Retrieves details for the specified phone number order, such as the order creation timestamp, phone numbers in
     * E.164 format, product type, and order status.
     * </p>
     * 
     * @param getPhoneNumberOrderRequest
     * @return A Java Future containing the result of the GetPhoneNumberOrder operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetPhoneNumberOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetPhoneNumberOrder"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPhoneNumberOrderResult> getPhoneNumberOrderAsync(GetPhoneNumberOrderRequest getPhoneNumberOrderRequest);

    /**
     * <p>
     * Retrieves details for the specified phone number order, such as the order creation timestamp, phone numbers in
     * E.164 format, product type, and order status.
     * </p>
     * 
     * @param getPhoneNumberOrderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPhoneNumberOrder operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.GetPhoneNumberOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetPhoneNumberOrder"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPhoneNumberOrderResult> getPhoneNumberOrderAsync(GetPhoneNumberOrderRequest getPhoneNumberOrderRequest,
            com.amazonaws.handlers.AsyncHandler<GetPhoneNumberOrderRequest, GetPhoneNumberOrderResult> asyncHandler);

    /**
     * <p>
     * Retrieves the phone number settings for the administrator's AWS account, such as the default outbound calling
     * name.
     * </p>
     * 
     * @param getPhoneNumberSettingsRequest
     * @return A Java Future containing the result of the GetPhoneNumberSettings operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetPhoneNumberSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetPhoneNumberSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPhoneNumberSettingsResult> getPhoneNumberSettingsAsync(GetPhoneNumberSettingsRequest getPhoneNumberSettingsRequest);

    /**
     * <p>
     * Retrieves the phone number settings for the administrator's AWS account, such as the default outbound calling
     * name.
     * </p>
     * 
     * @param getPhoneNumberSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPhoneNumberSettings operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.GetPhoneNumberSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetPhoneNumberSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPhoneNumberSettingsResult> getPhoneNumberSettingsAsync(GetPhoneNumberSettingsRequest getPhoneNumberSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetPhoneNumberSettingsRequest, GetPhoneNumberSettingsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified proxy session details for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param getProxySessionRequest
     * @return A Java Future containing the result of the GetProxySession operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetProxySession"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetProxySessionResult> getProxySessionAsync(GetProxySessionRequest getProxySessionRequest);

    /**
     * <p>
     * Retrieves the specified proxy session details for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param getProxySessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProxySession operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.GetProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetProxySession"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetProxySessionResult> getProxySessionAsync(GetProxySessionRequest getProxySessionRequest,
            com.amazonaws.handlers.AsyncHandler<GetProxySessionRequest, GetProxySessionResult> asyncHandler);

    /**
     * <p>
     * Retrieves the information for a SIP media application, including name, AWS Region, and endpoints.
     * </p>
     * 
     * @param getSipMediaApplicationRequest
     * @return A Java Future containing the result of the GetSipMediaApplication operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSipMediaApplicationResult> getSipMediaApplicationAsync(GetSipMediaApplicationRequest getSipMediaApplicationRequest);

    /**
     * <p>
     * Retrieves the information for a SIP media application, including name, AWS Region, and endpoints.
     * </p>
     * 
     * @param getSipMediaApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSipMediaApplication operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.GetSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSipMediaApplicationResult> getSipMediaApplicationAsync(GetSipMediaApplicationRequest getSipMediaApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<GetSipMediaApplicationRequest, GetSipMediaApplicationResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetSipMediaApplicationAlexaSkillConfiguration operation
     *         returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetSipMediaApplicationAlexaSkillConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSipMediaApplicationAlexaSkillConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<GetSipMediaApplicationAlexaSkillConfigurationResult> getSipMediaApplicationAlexaSkillConfigurationAsync(
            GetSipMediaApplicationAlexaSkillConfigurationRequest getSipMediaApplicationAlexaSkillConfigurationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSipMediaApplicationAlexaSkillConfiguration operation
     *         returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.GetSipMediaApplicationAlexaSkillConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSipMediaApplicationAlexaSkillConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<GetSipMediaApplicationAlexaSkillConfigurationResult> getSipMediaApplicationAlexaSkillConfigurationAsync(
            GetSipMediaApplicationAlexaSkillConfigurationRequest getSipMediaApplicationAlexaSkillConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetSipMediaApplicationAlexaSkillConfigurationRequest, GetSipMediaApplicationAlexaSkillConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves the logging configuration for the specified SIP media application.
     * </p>
     * 
     * @param getSipMediaApplicationLoggingConfigurationRequest
     * @return A Java Future containing the result of the GetSipMediaApplicationLoggingConfiguration operation returned
     *         by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetSipMediaApplicationLoggingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSipMediaApplicationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSipMediaApplicationLoggingConfigurationResult> getSipMediaApplicationLoggingConfigurationAsync(
            GetSipMediaApplicationLoggingConfigurationRequest getSipMediaApplicationLoggingConfigurationRequest);

    /**
     * <p>
     * Retrieves the logging configuration for the specified SIP media application.
     * </p>
     * 
     * @param getSipMediaApplicationLoggingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSipMediaApplicationLoggingConfiguration operation returned
     *         by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.GetSipMediaApplicationLoggingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSipMediaApplicationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSipMediaApplicationLoggingConfigurationResult> getSipMediaApplicationLoggingConfigurationAsync(
            GetSipMediaApplicationLoggingConfigurationRequest getSipMediaApplicationLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetSipMediaApplicationLoggingConfigurationRequest, GetSipMediaApplicationLoggingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details of a SIP rule, such as the rule ID, name, triggers, and target endpoints.
     * </p>
     * 
     * @param getSipRuleRequest
     * @return A Java Future containing the result of the GetSipRule operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSipRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSipRuleResult> getSipRuleAsync(GetSipRuleRequest getSipRuleRequest);

    /**
     * <p>
     * Retrieves the details of a SIP rule, such as the rule ID, name, triggers, and target endpoints.
     * </p>
     * 
     * @param getSipRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSipRule operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.GetSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSipRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSipRuleResult> getSipRuleAsync(GetSipRuleRequest getSipRuleRequest,
            com.amazonaws.handlers.AsyncHandler<GetSipRuleRequest, GetSipRuleResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details of the specified speaker search task.
     * </p>
     * 
     * @param getSpeakerSearchTaskRequest
     * @return A Java Future containing the result of the GetSpeakerSearchTask operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetSpeakerSearchTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSpeakerSearchTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSpeakerSearchTaskResult> getSpeakerSearchTaskAsync(GetSpeakerSearchTaskRequest getSpeakerSearchTaskRequest);

    /**
     * <p>
     * Retrieves the details of the specified speaker search task.
     * </p>
     * 
     * @param getSpeakerSearchTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSpeakerSearchTask operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.GetSpeakerSearchTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSpeakerSearchTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSpeakerSearchTaskResult> getSpeakerSearchTaskAsync(GetSpeakerSearchTaskRequest getSpeakerSearchTaskRequest,
            com.amazonaws.handlers.AsyncHandler<GetSpeakerSearchTaskRequest, GetSpeakerSearchTaskResult> asyncHandler);

    /**
     * <p>
     * Retrieves details for the specified Amazon Chime SDK Voice Connector, such as timestamps,name, outbound host, and
     * encryption requirements.
     * </p>
     * 
     * @param getVoiceConnectorRequest
     * @return A Java Future containing the result of the GetVoiceConnector operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorResult> getVoiceConnectorAsync(GetVoiceConnectorRequest getVoiceConnectorRequest);

    /**
     * <p>
     * Retrieves details for the specified Amazon Chime SDK Voice Connector, such as timestamps,name, outbound host, and
     * encryption requirements.
     * </p>
     * 
     * @param getVoiceConnectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVoiceConnector operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.GetVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorResult> getVoiceConnectorAsync(GetVoiceConnectorRequest getVoiceConnectorRequest,
            com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorRequest, GetVoiceConnectorResult> asyncHandler);

    /**
     * <p>
     * Retrieves the emergency calling configuration details for the specified Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorEmergencyCallingConfigurationRequest
     * @return A Java Future containing the result of the GetVoiceConnectorEmergencyCallingConfiguration operation
     *         returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetVoiceConnectorEmergencyCallingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorEmergencyCallingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorEmergencyCallingConfigurationResult> getVoiceConnectorEmergencyCallingConfigurationAsync(
            GetVoiceConnectorEmergencyCallingConfigurationRequest getVoiceConnectorEmergencyCallingConfigurationRequest);

    /**
     * <p>
     * Retrieves the emergency calling configuration details for the specified Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorEmergencyCallingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVoiceConnectorEmergencyCallingConfiguration operation
     *         returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.GetVoiceConnectorEmergencyCallingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorEmergencyCallingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorEmergencyCallingConfigurationResult> getVoiceConnectorEmergencyCallingConfigurationAsync(
            GetVoiceConnectorEmergencyCallingConfigurationRequest getVoiceConnectorEmergencyCallingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorEmergencyCallingConfigurationRequest, GetVoiceConnectorEmergencyCallingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves details for the specified Amazon Chime SDK Voice Connector group, such as timestamps,name, and
     * associated <code>VoiceConnectorItems</code>.
     * </p>
     * 
     * @param getVoiceConnectorGroupRequest
     * @return A Java Future containing the result of the GetVoiceConnectorGroup operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorGroupResult> getVoiceConnectorGroupAsync(GetVoiceConnectorGroupRequest getVoiceConnectorGroupRequest);

    /**
     * <p>
     * Retrieves details for the specified Amazon Chime SDK Voice Connector group, such as timestamps,name, and
     * associated <code>VoiceConnectorItems</code>.
     * </p>
     * 
     * @param getVoiceConnectorGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVoiceConnectorGroup operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.GetVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorGroupResult> getVoiceConnectorGroupAsync(GetVoiceConnectorGroupRequest getVoiceConnectorGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorGroupRequest, GetVoiceConnectorGroupResult> asyncHandler);

    /**
     * <p>
     * Retrieves the logging configuration settings for the specified Voice Connector. Shows whether SIP message logs
     * are enabled for sending to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param getVoiceConnectorLoggingConfigurationRequest
     * @return A Java Future containing the result of the GetVoiceConnectorLoggingConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeSDKVoiceAsync.GetVoiceConnectorLoggingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorLoggingConfigurationResult> getVoiceConnectorLoggingConfigurationAsync(
            GetVoiceConnectorLoggingConfigurationRequest getVoiceConnectorLoggingConfigurationRequest);

    /**
     * <p>
     * Retrieves the logging configuration settings for the specified Voice Connector. Shows whether SIP message logs
     * are enabled for sending to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param getVoiceConnectorLoggingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVoiceConnectorLoggingConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.GetVoiceConnectorLoggingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorLoggingConfigurationResult> getVoiceConnectorLoggingConfigurationAsync(
            GetVoiceConnectorLoggingConfigurationRequest getVoiceConnectorLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorLoggingConfigurationRequest, GetVoiceConnectorLoggingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves the origination settings for the specified Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorOriginationRequest
     * @return A Java Future containing the result of the GetVoiceConnectorOrigination operation returned by the
     *         service.
     * @sample AmazonChimeSDKVoiceAsync.GetVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorOriginationResult> getVoiceConnectorOriginationAsync(
            GetVoiceConnectorOriginationRequest getVoiceConnectorOriginationRequest);

    /**
     * <p>
     * Retrieves the origination settings for the specified Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorOriginationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVoiceConnectorOrigination operation returned by the
     *         service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.GetVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorOriginationResult> getVoiceConnectorOriginationAsync(
            GetVoiceConnectorOriginationRequest getVoiceConnectorOriginationRequest,
            com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorOriginationRequest, GetVoiceConnectorOriginationResult> asyncHandler);

    /**
     * <p>
     * Retrieves the proxy configuration details for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorProxyRequest
     * @return A Java Future containing the result of the GetVoiceConnectorProxy operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetVoiceConnectorProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorProxy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorProxyResult> getVoiceConnectorProxyAsync(GetVoiceConnectorProxyRequest getVoiceConnectorProxyRequest);

    /**
     * <p>
     * Retrieves the proxy configuration details for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorProxyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVoiceConnectorProxy operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.GetVoiceConnectorProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorProxy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorProxyResult> getVoiceConnectorProxyAsync(GetVoiceConnectorProxyRequest getVoiceConnectorProxyRequest,
            com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorProxyRequest, GetVoiceConnectorProxyResult> asyncHandler);

    /**
     * <p>
     * Retrieves the streaming configuration details for the specified Amazon Chime SDK Voice Connector. Shows whether
     * media streaming is enabled for sending to Amazon Kinesis. It also shows the retention period, in hours, for the
     * Amazon Kinesis data.
     * </p>
     * 
     * @param getVoiceConnectorStreamingConfigurationRequest
     * @return A Java Future containing the result of the GetVoiceConnectorStreamingConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeSDKVoiceAsync.GetVoiceConnectorStreamingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorStreamingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorStreamingConfigurationResult> getVoiceConnectorStreamingConfigurationAsync(
            GetVoiceConnectorStreamingConfigurationRequest getVoiceConnectorStreamingConfigurationRequest);

    /**
     * <p>
     * Retrieves the streaming configuration details for the specified Amazon Chime SDK Voice Connector. Shows whether
     * media streaming is enabled for sending to Amazon Kinesis. It also shows the retention period, in hours, for the
     * Amazon Kinesis data.
     * </p>
     * 
     * @param getVoiceConnectorStreamingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVoiceConnectorStreamingConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.GetVoiceConnectorStreamingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorStreamingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorStreamingConfigurationResult> getVoiceConnectorStreamingConfigurationAsync(
            GetVoiceConnectorStreamingConfigurationRequest getVoiceConnectorStreamingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorStreamingConfigurationRequest, GetVoiceConnectorStreamingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves the termination setting details for the specified Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorTerminationRequest
     * @return A Java Future containing the result of the GetVoiceConnectorTermination operation returned by the
     *         service.
     * @sample AmazonChimeSDKVoiceAsync.GetVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorTerminationResult> getVoiceConnectorTerminationAsync(
            GetVoiceConnectorTerminationRequest getVoiceConnectorTerminationRequest);

    /**
     * <p>
     * Retrieves the termination setting details for the specified Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorTerminationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVoiceConnectorTermination operation returned by the
     *         service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.GetVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorTerminationResult> getVoiceConnectorTerminationAsync(
            GetVoiceConnectorTerminationRequest getVoiceConnectorTerminationRequest,
            com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorTerminationRequest, GetVoiceConnectorTerminationResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the last time a <code>SIP OPTIONS</code> ping was received from your SIP
     * infrastructure for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorTerminationHealthRequest
     * @return A Java Future containing the result of the GetVoiceConnectorTerminationHealth operation returned by the
     *         service.
     * @sample AmazonChimeSDKVoiceAsync.GetVoiceConnectorTerminationHealth
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorTerminationHealth"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorTerminationHealthResult> getVoiceConnectorTerminationHealthAsync(
            GetVoiceConnectorTerminationHealthRequest getVoiceConnectorTerminationHealthRequest);

    /**
     * <p>
     * Retrieves information about the last time a <code>SIP OPTIONS</code> ping was received from your SIP
     * infrastructure for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorTerminationHealthRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVoiceConnectorTerminationHealth operation returned by the
     *         service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.GetVoiceConnectorTerminationHealth
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorTerminationHealth"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorTerminationHealthResult> getVoiceConnectorTerminationHealthAsync(
            GetVoiceConnectorTerminationHealthRequest getVoiceConnectorTerminationHealthRequest,
            com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorTerminationHealthRequest, GetVoiceConnectorTerminationHealthResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details of the specified voice profile.
     * </p>
     * 
     * @param getVoiceProfileRequest
     * @return A Java Future containing the result of the GetVoiceProfile operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetVoiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceProfileResult> getVoiceProfileAsync(GetVoiceProfileRequest getVoiceProfileRequest);

    /**
     * <p>
     * Retrieves the details of the specified voice profile.
     * </p>
     * 
     * @param getVoiceProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVoiceProfile operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.GetVoiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceProfileResult> getVoiceProfileAsync(GetVoiceProfileRequest getVoiceProfileRequest,
            com.amazonaws.handlers.AsyncHandler<GetVoiceProfileRequest, GetVoiceProfileResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details of the specified voice profile domain.
     * </p>
     * 
     * @param getVoiceProfileDomainRequest
     * @return A Java Future containing the result of the GetVoiceProfileDomain operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetVoiceProfileDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceProfileDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceProfileDomainResult> getVoiceProfileDomainAsync(GetVoiceProfileDomainRequest getVoiceProfileDomainRequest);

    /**
     * <p>
     * Retrieves the details of the specified voice profile domain.
     * </p>
     * 
     * @param getVoiceProfileDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVoiceProfileDomain operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.GetVoiceProfileDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceProfileDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceProfileDomainResult> getVoiceProfileDomainAsync(GetVoiceProfileDomainRequest getVoiceProfileDomainRequest,
            com.amazonaws.handlers.AsyncHandler<GetVoiceProfileDomainRequest, GetVoiceProfileDomainResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details of a voice tone analysis task.
     * </p>
     * 
     * @param getVoiceToneAnalysisTaskRequest
     * @return A Java Future containing the result of the GetVoiceToneAnalysisTask operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetVoiceToneAnalysisTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceToneAnalysisTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceToneAnalysisTaskResult> getVoiceToneAnalysisTaskAsync(GetVoiceToneAnalysisTaskRequest getVoiceToneAnalysisTaskRequest);

    /**
     * <p>
     * Retrieves the details of a voice tone analysis task.
     * </p>
     * 
     * @param getVoiceToneAnalysisTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVoiceToneAnalysisTask operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.GetVoiceToneAnalysisTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceToneAnalysisTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceToneAnalysisTaskResult> getVoiceToneAnalysisTaskAsync(GetVoiceToneAnalysisTaskRequest getVoiceToneAnalysisTaskRequest,
            com.amazonaws.handlers.AsyncHandler<GetVoiceToneAnalysisTaskRequest, GetVoiceToneAnalysisTaskResult> asyncHandler);

    /**
     * <p>
     * Lists the available AWS Regions in which you can create an Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param listAvailableVoiceConnectorRegionsRequest
     * @return A Java Future containing the result of the ListAvailableVoiceConnectorRegions operation returned by the
     *         service.
     * @sample AmazonChimeSDKVoiceAsync.ListAvailableVoiceConnectorRegions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListAvailableVoiceConnectorRegions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAvailableVoiceConnectorRegionsResult> listAvailableVoiceConnectorRegionsAsync(
            ListAvailableVoiceConnectorRegionsRequest listAvailableVoiceConnectorRegionsRequest);

    /**
     * <p>
     * Lists the available AWS Regions in which you can create an Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param listAvailableVoiceConnectorRegionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAvailableVoiceConnectorRegions operation returned by the
     *         service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.ListAvailableVoiceConnectorRegions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListAvailableVoiceConnectorRegions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAvailableVoiceConnectorRegionsResult> listAvailableVoiceConnectorRegionsAsync(
            ListAvailableVoiceConnectorRegionsRequest listAvailableVoiceConnectorRegionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAvailableVoiceConnectorRegionsRequest, ListAvailableVoiceConnectorRegionsResult> asyncHandler);

    /**
     * <p>
     * Lists the phone numbers for an administrator's Amazon Chime SDK account.
     * </p>
     * 
     * @param listPhoneNumberOrdersRequest
     * @return A Java Future containing the result of the ListPhoneNumberOrders operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.ListPhoneNumberOrders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListPhoneNumberOrders"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPhoneNumberOrdersResult> listPhoneNumberOrdersAsync(ListPhoneNumberOrdersRequest listPhoneNumberOrdersRequest);

    /**
     * <p>
     * Lists the phone numbers for an administrator's Amazon Chime SDK account.
     * </p>
     * 
     * @param listPhoneNumberOrdersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPhoneNumberOrders operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.ListPhoneNumberOrders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListPhoneNumberOrders"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPhoneNumberOrdersResult> listPhoneNumberOrdersAsync(ListPhoneNumberOrdersRequest listPhoneNumberOrdersRequest,
            com.amazonaws.handlers.AsyncHandler<ListPhoneNumberOrdersRequest, ListPhoneNumberOrdersResult> asyncHandler);

    /**
     * <p>
     * Lists the phone numbers for the specified Amazon Chime SDK account, Amazon Chime SDK user, Amazon Chime SDK Voice
     * Connector, or Amazon Chime SDK Voice Connector group.
     * </p>
     * 
     * @param listPhoneNumbersRequest
     * @return A Java Future containing the result of the ListPhoneNumbers operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.ListPhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListPhoneNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPhoneNumbersResult> listPhoneNumbersAsync(ListPhoneNumbersRequest listPhoneNumbersRequest);

    /**
     * <p>
     * Lists the phone numbers for the specified Amazon Chime SDK account, Amazon Chime SDK user, Amazon Chime SDK Voice
     * Connector, or Amazon Chime SDK Voice Connector group.
     * </p>
     * 
     * @param listPhoneNumbersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPhoneNumbers operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.ListPhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListPhoneNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPhoneNumbersResult> listPhoneNumbersAsync(ListPhoneNumbersRequest listPhoneNumbersRequest,
            com.amazonaws.handlers.AsyncHandler<ListPhoneNumbersRequest, ListPhoneNumbersResult> asyncHandler);

    /**
     * <p>
     * Lists the proxy sessions for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param listProxySessionsRequest
     * @return A Java Future containing the result of the ListProxySessions operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.ListProxySessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListProxySessions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProxySessionsResult> listProxySessionsAsync(ListProxySessionsRequest listProxySessionsRequest);

    /**
     * <p>
     * Lists the proxy sessions for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param listProxySessionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProxySessions operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.ListProxySessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListProxySessions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProxySessionsResult> listProxySessionsAsync(ListProxySessionsRequest listProxySessionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProxySessionsRequest, ListProxySessionsResult> asyncHandler);

    /**
     * <p>
     * Lists the SIP media applications under the administrator's AWS account.
     * </p>
     * 
     * @param listSipMediaApplicationsRequest
     * @return A Java Future containing the result of the ListSipMediaApplications operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.ListSipMediaApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListSipMediaApplications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSipMediaApplicationsResult> listSipMediaApplicationsAsync(ListSipMediaApplicationsRequest listSipMediaApplicationsRequest);

    /**
     * <p>
     * Lists the SIP media applications under the administrator's AWS account.
     * </p>
     * 
     * @param listSipMediaApplicationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSipMediaApplications operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.ListSipMediaApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListSipMediaApplications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSipMediaApplicationsResult> listSipMediaApplicationsAsync(ListSipMediaApplicationsRequest listSipMediaApplicationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSipMediaApplicationsRequest, ListSipMediaApplicationsResult> asyncHandler);

    /**
     * <p>
     * Lists the SIP rules under the administrator's AWS account.
     * </p>
     * 
     * @param listSipRulesRequest
     * @return A Java Future containing the result of the ListSipRules operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.ListSipRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListSipRules" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSipRulesResult> listSipRulesAsync(ListSipRulesRequest listSipRulesRequest);

    /**
     * <p>
     * Lists the SIP rules under the administrator's AWS account.
     * </p>
     * 
     * @param listSipRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSipRules operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.ListSipRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListSipRules" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSipRulesResult> listSipRulesAsync(ListSipRulesRequest listSipRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSipRulesRequest, ListSipRulesResult> asyncHandler);

    /**
     * <p>
     * Lists the countries that you can order phone numbers from.
     * </p>
     * 
     * @param listSupportedPhoneNumberCountriesRequest
     * @return A Java Future containing the result of the ListSupportedPhoneNumberCountries operation returned by the
     *         service.
     * @sample AmazonChimeSDKVoiceAsync.ListSupportedPhoneNumberCountries
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListSupportedPhoneNumberCountries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSupportedPhoneNumberCountriesResult> listSupportedPhoneNumberCountriesAsync(
            ListSupportedPhoneNumberCountriesRequest listSupportedPhoneNumberCountriesRequest);

    /**
     * <p>
     * Lists the countries that you can order phone numbers from.
     * </p>
     * 
     * @param listSupportedPhoneNumberCountriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSupportedPhoneNumberCountries operation returned by the
     *         service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.ListSupportedPhoneNumberCountries
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListSupportedPhoneNumberCountries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSupportedPhoneNumberCountriesResult> listSupportedPhoneNumberCountriesAsync(
            ListSupportedPhoneNumberCountriesRequest listSupportedPhoneNumberCountriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSupportedPhoneNumberCountriesRequest, ListSupportedPhoneNumberCountriesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the tags in a given resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of the tags in a given resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists the Amazon Chime SDK Voice Connector groups in the administrator's AWS account.
     * </p>
     * 
     * @param listVoiceConnectorGroupsRequest
     * @return A Java Future containing the result of the ListVoiceConnectorGroups operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.ListVoiceConnectorGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceConnectorGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVoiceConnectorGroupsResult> listVoiceConnectorGroupsAsync(ListVoiceConnectorGroupsRequest listVoiceConnectorGroupsRequest);

    /**
     * <p>
     * Lists the Amazon Chime SDK Voice Connector groups in the administrator's AWS account.
     * </p>
     * 
     * @param listVoiceConnectorGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVoiceConnectorGroups operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.ListVoiceConnectorGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceConnectorGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVoiceConnectorGroupsResult> listVoiceConnectorGroupsAsync(ListVoiceConnectorGroupsRequest listVoiceConnectorGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListVoiceConnectorGroupsRequest, ListVoiceConnectorGroupsResult> asyncHandler);

    /**
     * <p>
     * Lists the SIP credentials for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param listVoiceConnectorTerminationCredentialsRequest
     * @return A Java Future containing the result of the ListVoiceConnectorTerminationCredentials operation returned by
     *         the service.
     * @sample AmazonChimeSDKVoiceAsync.ListVoiceConnectorTerminationCredentials
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVoiceConnectorTerminationCredentialsResult> listVoiceConnectorTerminationCredentialsAsync(
            ListVoiceConnectorTerminationCredentialsRequest listVoiceConnectorTerminationCredentialsRequest);

    /**
     * <p>
     * Lists the SIP credentials for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param listVoiceConnectorTerminationCredentialsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVoiceConnectorTerminationCredentials operation returned by
     *         the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.ListVoiceConnectorTerminationCredentials
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVoiceConnectorTerminationCredentialsResult> listVoiceConnectorTerminationCredentialsAsync(
            ListVoiceConnectorTerminationCredentialsRequest listVoiceConnectorTerminationCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<ListVoiceConnectorTerminationCredentialsRequest, ListVoiceConnectorTerminationCredentialsResult> asyncHandler);

    /**
     * <p>
     * Lists the Amazon Chime SDK Voice Connectors in the administrators AWS account.
     * </p>
     * 
     * @param listVoiceConnectorsRequest
     * @return A Java Future containing the result of the ListVoiceConnectors operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.ListVoiceConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceConnectors"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVoiceConnectorsResult> listVoiceConnectorsAsync(ListVoiceConnectorsRequest listVoiceConnectorsRequest);

    /**
     * <p>
     * Lists the Amazon Chime SDK Voice Connectors in the administrators AWS account.
     * </p>
     * 
     * @param listVoiceConnectorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVoiceConnectors operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.ListVoiceConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceConnectors"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVoiceConnectorsResult> listVoiceConnectorsAsync(ListVoiceConnectorsRequest listVoiceConnectorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListVoiceConnectorsRequest, ListVoiceConnectorsResult> asyncHandler);

    /**
     * <p>
     * Lists the specified voice profile domains in the administrator's AWS account.
     * </p>
     * 
     * @param listVoiceProfileDomainsRequest
     * @return A Java Future containing the result of the ListVoiceProfileDomains operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.ListVoiceProfileDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceProfileDomains"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVoiceProfileDomainsResult> listVoiceProfileDomainsAsync(ListVoiceProfileDomainsRequest listVoiceProfileDomainsRequest);

    /**
     * <p>
     * Lists the specified voice profile domains in the administrator's AWS account.
     * </p>
     * 
     * @param listVoiceProfileDomainsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVoiceProfileDomains operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.ListVoiceProfileDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceProfileDomains"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVoiceProfileDomainsResult> listVoiceProfileDomainsAsync(ListVoiceProfileDomainsRequest listVoiceProfileDomainsRequest,
            com.amazonaws.handlers.AsyncHandler<ListVoiceProfileDomainsRequest, ListVoiceProfileDomainsResult> asyncHandler);

    /**
     * <p>
     * Lists the voice profiles in a voice profile domain.
     * </p>
     * 
     * @param listVoiceProfilesRequest
     * @return A Java Future containing the result of the ListVoiceProfiles operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.ListVoiceProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVoiceProfilesResult> listVoiceProfilesAsync(ListVoiceProfilesRequest listVoiceProfilesRequest);

    /**
     * <p>
     * Lists the voice profiles in a voice profile domain.
     * </p>
     * 
     * @param listVoiceProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVoiceProfiles operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.ListVoiceProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVoiceProfilesResult> listVoiceProfilesAsync(ListVoiceProfilesRequest listVoiceProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<ListVoiceProfilesRequest, ListVoiceProfilesResult> asyncHandler);

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
     * @return A Java Future containing the result of the PutSipMediaApplicationAlexaSkillConfiguration operation
     *         returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.PutSipMediaApplicationAlexaSkillConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutSipMediaApplicationAlexaSkillConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<PutSipMediaApplicationAlexaSkillConfigurationResult> putSipMediaApplicationAlexaSkillConfigurationAsync(
            PutSipMediaApplicationAlexaSkillConfigurationRequest putSipMediaApplicationAlexaSkillConfigurationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutSipMediaApplicationAlexaSkillConfiguration operation
     *         returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.PutSipMediaApplicationAlexaSkillConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutSipMediaApplicationAlexaSkillConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<PutSipMediaApplicationAlexaSkillConfigurationResult> putSipMediaApplicationAlexaSkillConfigurationAsync(
            PutSipMediaApplicationAlexaSkillConfigurationRequest putSipMediaApplicationAlexaSkillConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutSipMediaApplicationAlexaSkillConfigurationRequest, PutSipMediaApplicationAlexaSkillConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates the logging configuration for the specified SIP media application.
     * </p>
     * 
     * @param putSipMediaApplicationLoggingConfigurationRequest
     * @return A Java Future containing the result of the PutSipMediaApplicationLoggingConfiguration operation returned
     *         by the service.
     * @sample AmazonChimeSDKVoiceAsync.PutSipMediaApplicationLoggingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutSipMediaApplicationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutSipMediaApplicationLoggingConfigurationResult> putSipMediaApplicationLoggingConfigurationAsync(
            PutSipMediaApplicationLoggingConfigurationRequest putSipMediaApplicationLoggingConfigurationRequest);

    /**
     * <p>
     * Updates the logging configuration for the specified SIP media application.
     * </p>
     * 
     * @param putSipMediaApplicationLoggingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutSipMediaApplicationLoggingConfiguration operation returned
     *         by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.PutSipMediaApplicationLoggingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutSipMediaApplicationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutSipMediaApplicationLoggingConfigurationResult> putSipMediaApplicationLoggingConfigurationAsync(
            PutSipMediaApplicationLoggingConfigurationRequest putSipMediaApplicationLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutSipMediaApplicationLoggingConfigurationRequest, PutSipMediaApplicationLoggingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates a Voice Connector's emergency calling configuration.
     * </p>
     * 
     * @param putVoiceConnectorEmergencyCallingConfigurationRequest
     * @return A Java Future containing the result of the PutVoiceConnectorEmergencyCallingConfiguration operation
     *         returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.PutVoiceConnectorEmergencyCallingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorEmergencyCallingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorEmergencyCallingConfigurationResult> putVoiceConnectorEmergencyCallingConfigurationAsync(
            PutVoiceConnectorEmergencyCallingConfigurationRequest putVoiceConnectorEmergencyCallingConfigurationRequest);

    /**
     * <p>
     * Updates a Voice Connector's emergency calling configuration.
     * </p>
     * 
     * @param putVoiceConnectorEmergencyCallingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutVoiceConnectorEmergencyCallingConfiguration operation
     *         returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.PutVoiceConnectorEmergencyCallingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorEmergencyCallingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorEmergencyCallingConfigurationResult> putVoiceConnectorEmergencyCallingConfigurationAsync(
            PutVoiceConnectorEmergencyCallingConfigurationRequest putVoiceConnectorEmergencyCallingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutVoiceConnectorEmergencyCallingConfigurationRequest, PutVoiceConnectorEmergencyCallingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates a Voice Connector's logging configuration.
     * </p>
     * 
     * @param putVoiceConnectorLoggingConfigurationRequest
     * @return A Java Future containing the result of the PutVoiceConnectorLoggingConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeSDKVoiceAsync.PutVoiceConnectorLoggingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorLoggingConfigurationResult> putVoiceConnectorLoggingConfigurationAsync(
            PutVoiceConnectorLoggingConfigurationRequest putVoiceConnectorLoggingConfigurationRequest);

    /**
     * <p>
     * Updates a Voice Connector's logging configuration.
     * </p>
     * 
     * @param putVoiceConnectorLoggingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutVoiceConnectorLoggingConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.PutVoiceConnectorLoggingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorLoggingConfigurationResult> putVoiceConnectorLoggingConfigurationAsync(
            PutVoiceConnectorLoggingConfigurationRequest putVoiceConnectorLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutVoiceConnectorLoggingConfigurationRequest, PutVoiceConnectorLoggingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates a Voice Connector's origination settings.
     * </p>
     * 
     * @param putVoiceConnectorOriginationRequest
     * @return A Java Future containing the result of the PutVoiceConnectorOrigination operation returned by the
     *         service.
     * @sample AmazonChimeSDKVoiceAsync.PutVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorOriginationResult> putVoiceConnectorOriginationAsync(
            PutVoiceConnectorOriginationRequest putVoiceConnectorOriginationRequest);

    /**
     * <p>
     * Updates a Voice Connector's origination settings.
     * </p>
     * 
     * @param putVoiceConnectorOriginationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutVoiceConnectorOrigination operation returned by the
     *         service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.PutVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorOriginationResult> putVoiceConnectorOriginationAsync(
            PutVoiceConnectorOriginationRequest putVoiceConnectorOriginationRequest,
            com.amazonaws.handlers.AsyncHandler<PutVoiceConnectorOriginationRequest, PutVoiceConnectorOriginationResult> asyncHandler);

    /**
     * <p>
     * Puts the specified proxy configuration to the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param putVoiceConnectorProxyRequest
     * @return A Java Future containing the result of the PutVoiceConnectorProxy operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.PutVoiceConnectorProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorProxy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorProxyResult> putVoiceConnectorProxyAsync(PutVoiceConnectorProxyRequest putVoiceConnectorProxyRequest);

    /**
     * <p>
     * Puts the specified proxy configuration to the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param putVoiceConnectorProxyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutVoiceConnectorProxy operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.PutVoiceConnectorProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorProxy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorProxyResult> putVoiceConnectorProxyAsync(PutVoiceConnectorProxyRequest putVoiceConnectorProxyRequest,
            com.amazonaws.handlers.AsyncHandler<PutVoiceConnectorProxyRequest, PutVoiceConnectorProxyResult> asyncHandler);

    /**
     * <p>
     * Updates a Voice Connector's streaming configuration settings.
     * </p>
     * 
     * @param putVoiceConnectorStreamingConfigurationRequest
     * @return A Java Future containing the result of the PutVoiceConnectorStreamingConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeSDKVoiceAsync.PutVoiceConnectorStreamingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorStreamingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorStreamingConfigurationResult> putVoiceConnectorStreamingConfigurationAsync(
            PutVoiceConnectorStreamingConfigurationRequest putVoiceConnectorStreamingConfigurationRequest);

    /**
     * <p>
     * Updates a Voice Connector's streaming configuration settings.
     * </p>
     * 
     * @param putVoiceConnectorStreamingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutVoiceConnectorStreamingConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.PutVoiceConnectorStreamingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorStreamingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorStreamingConfigurationResult> putVoiceConnectorStreamingConfigurationAsync(
            PutVoiceConnectorStreamingConfigurationRequest putVoiceConnectorStreamingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutVoiceConnectorStreamingConfigurationRequest, PutVoiceConnectorStreamingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates a Voice Connector's termination settings.
     * </p>
     * 
     * @param putVoiceConnectorTerminationRequest
     * @return A Java Future containing the result of the PutVoiceConnectorTermination operation returned by the
     *         service.
     * @sample AmazonChimeSDKVoiceAsync.PutVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorTerminationResult> putVoiceConnectorTerminationAsync(
            PutVoiceConnectorTerminationRequest putVoiceConnectorTerminationRequest);

    /**
     * <p>
     * Updates a Voice Connector's termination settings.
     * </p>
     * 
     * @param putVoiceConnectorTerminationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutVoiceConnectorTermination operation returned by the
     *         service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.PutVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorTerminationResult> putVoiceConnectorTerminationAsync(
            PutVoiceConnectorTerminationRequest putVoiceConnectorTerminationRequest,
            com.amazonaws.handlers.AsyncHandler<PutVoiceConnectorTerminationRequest, PutVoiceConnectorTerminationResult> asyncHandler);

    /**
     * <p>
     * Updates a Voice Connector's termination credentials.
     * </p>
     * 
     * @param putVoiceConnectorTerminationCredentialsRequest
     * @return A Java Future containing the result of the PutVoiceConnectorTerminationCredentials operation returned by
     *         the service.
     * @sample AmazonChimeSDKVoiceAsync.PutVoiceConnectorTerminationCredentials
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorTerminationCredentialsResult> putVoiceConnectorTerminationCredentialsAsync(
            PutVoiceConnectorTerminationCredentialsRequest putVoiceConnectorTerminationCredentialsRequest);

    /**
     * <p>
     * Updates a Voice Connector's termination credentials.
     * </p>
     * 
     * @param putVoiceConnectorTerminationCredentialsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutVoiceConnectorTerminationCredentials operation returned by
     *         the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.PutVoiceConnectorTerminationCredentials
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorTerminationCredentialsResult> putVoiceConnectorTerminationCredentialsAsync(
            PutVoiceConnectorTerminationCredentialsRequest putVoiceConnectorTerminationCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<PutVoiceConnectorTerminationCredentialsRequest, PutVoiceConnectorTerminationCredentialsResult> asyncHandler);

    /**
     * <p>
     * Restores a deleted phone number.
     * </p>
     * 
     * @param restorePhoneNumberRequest
     * @return A Java Future containing the result of the RestorePhoneNumber operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.RestorePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/RestorePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RestorePhoneNumberResult> restorePhoneNumberAsync(RestorePhoneNumberRequest restorePhoneNumberRequest);

    /**
     * <p>
     * Restores a deleted phone number.
     * </p>
     * 
     * @param restorePhoneNumberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestorePhoneNumber operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.RestorePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/RestorePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RestorePhoneNumberResult> restorePhoneNumberAsync(RestorePhoneNumberRequest restorePhoneNumberRequest,
            com.amazonaws.handlers.AsyncHandler<RestorePhoneNumberRequest, RestorePhoneNumberResult> asyncHandler);

    /**
     * <p>
     * Searches the provisioned phone numbers in an organization.
     * </p>
     * 
     * @param searchAvailablePhoneNumbersRequest
     * @return A Java Future containing the result of the SearchAvailablePhoneNumbers operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.SearchAvailablePhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/SearchAvailablePhoneNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchAvailablePhoneNumbersResult> searchAvailablePhoneNumbersAsync(
            SearchAvailablePhoneNumbersRequest searchAvailablePhoneNumbersRequest);

    /**
     * <p>
     * Searches the provisioned phone numbers in an organization.
     * </p>
     * 
     * @param searchAvailablePhoneNumbersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchAvailablePhoneNumbers operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.SearchAvailablePhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/SearchAvailablePhoneNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchAvailablePhoneNumbersResult> searchAvailablePhoneNumbersAsync(
            SearchAvailablePhoneNumbersRequest searchAvailablePhoneNumbersRequest,
            com.amazonaws.handlers.AsyncHandler<SearchAvailablePhoneNumbersRequest, SearchAvailablePhoneNumbersResult> asyncHandler);

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
     * @return A Java Future containing the result of the StartSpeakerSearchTask operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.StartSpeakerSearchTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/StartSpeakerSearchTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartSpeakerSearchTaskResult> startSpeakerSearchTaskAsync(StartSpeakerSearchTaskRequest startSpeakerSearchTaskRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartSpeakerSearchTask operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.StartSpeakerSearchTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/StartSpeakerSearchTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartSpeakerSearchTaskResult> startSpeakerSearchTaskAsync(StartSpeakerSearchTaskRequest startSpeakerSearchTaskRequest,
            com.amazonaws.handlers.AsyncHandler<StartSpeakerSearchTaskRequest, StartSpeakerSearchTaskResult> asyncHandler);

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
     * @return A Java Future containing the result of the StartVoiceToneAnalysisTask operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.StartVoiceToneAnalysisTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/StartVoiceToneAnalysisTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartVoiceToneAnalysisTaskResult> startVoiceToneAnalysisTaskAsync(
            StartVoiceToneAnalysisTaskRequest startVoiceToneAnalysisTaskRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartVoiceToneAnalysisTask operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.StartVoiceToneAnalysisTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/StartVoiceToneAnalysisTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartVoiceToneAnalysisTaskResult> startVoiceToneAnalysisTaskAsync(
            StartVoiceToneAnalysisTaskRequest startVoiceToneAnalysisTaskRequest,
            com.amazonaws.handlers.AsyncHandler<StartVoiceToneAnalysisTaskRequest, StartVoiceToneAnalysisTaskResult> asyncHandler);

    /**
     * <p>
     * Stops a speaker search task.
     * </p>
     * 
     * @param stopSpeakerSearchTaskRequest
     * @return A Java Future containing the result of the StopSpeakerSearchTask operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.StopSpeakerSearchTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/StopSpeakerSearchTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopSpeakerSearchTaskResult> stopSpeakerSearchTaskAsync(StopSpeakerSearchTaskRequest stopSpeakerSearchTaskRequest);

    /**
     * <p>
     * Stops a speaker search task.
     * </p>
     * 
     * @param stopSpeakerSearchTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopSpeakerSearchTask operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.StopSpeakerSearchTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/StopSpeakerSearchTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopSpeakerSearchTaskResult> stopSpeakerSearchTaskAsync(StopSpeakerSearchTaskRequest stopSpeakerSearchTaskRequest,
            com.amazonaws.handlers.AsyncHandler<StopSpeakerSearchTaskRequest, StopSpeakerSearchTaskResult> asyncHandler);

    /**
     * <p>
     * Stops a voice tone analysis task.
     * </p>
     * 
     * @param stopVoiceToneAnalysisTaskRequest
     * @return A Java Future containing the result of the StopVoiceToneAnalysisTask operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.StopVoiceToneAnalysisTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/StopVoiceToneAnalysisTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopVoiceToneAnalysisTaskResult> stopVoiceToneAnalysisTaskAsync(
            StopVoiceToneAnalysisTaskRequest stopVoiceToneAnalysisTaskRequest);

    /**
     * <p>
     * Stops a voice tone analysis task.
     * </p>
     * 
     * @param stopVoiceToneAnalysisTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopVoiceToneAnalysisTask operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.StopVoiceToneAnalysisTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/StopVoiceToneAnalysisTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopVoiceToneAnalysisTaskResult> stopVoiceToneAnalysisTaskAsync(
            StopVoiceToneAnalysisTaskRequest stopVoiceToneAnalysisTaskRequest,
            com.amazonaws.handlers.AsyncHandler<StopVoiceToneAnalysisTaskRequest, StopVoiceToneAnalysisTaskResult> asyncHandler);

    /**
     * <p>
     * Adds a tag to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds a tag to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates global settings for the Amazon Chime SDK Voice Connectors in an AWS account.
     * </p>
     * 
     * @param updateGlobalSettingsRequest
     * @return A Java Future containing the result of the UpdateGlobalSettings operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.UpdateGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateGlobalSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGlobalSettingsResult> updateGlobalSettingsAsync(UpdateGlobalSettingsRequest updateGlobalSettingsRequest);

    /**
     * <p>
     * Updates global settings for the Amazon Chime SDK Voice Connectors in an AWS account.
     * </p>
     * 
     * @param updateGlobalSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGlobalSettings operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.UpdateGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateGlobalSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGlobalSettingsResult> updateGlobalSettingsAsync(UpdateGlobalSettingsRequest updateGlobalSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGlobalSettingsRequest, UpdateGlobalSettingsResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdatePhoneNumber operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.UpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdatePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePhoneNumberResult> updatePhoneNumberAsync(UpdatePhoneNumberRequest updatePhoneNumberRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePhoneNumber operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.UpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdatePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePhoneNumberResult> updatePhoneNumberAsync(UpdatePhoneNumberRequest updatePhoneNumberRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePhoneNumberRequest, UpdatePhoneNumberResult> asyncHandler);

    /**
     * <p>
     * Updates the phone number settings for the administrator's AWS account, such as the default outbound calling name.
     * You can update the default outbound calling name once every seven days. Outbound calling names can take up to 72
     * hours to update.
     * </p>
     * 
     * @param updatePhoneNumberSettingsRequest
     * @return A Java Future containing the result of the UpdatePhoneNumberSettings operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.UpdatePhoneNumberSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdatePhoneNumberSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePhoneNumberSettingsResult> updatePhoneNumberSettingsAsync(
            UpdatePhoneNumberSettingsRequest updatePhoneNumberSettingsRequest);

    /**
     * <p>
     * Updates the phone number settings for the administrator's AWS account, such as the default outbound calling name.
     * You can update the default outbound calling name once every seven days. Outbound calling names can take up to 72
     * hours to update.
     * </p>
     * 
     * @param updatePhoneNumberSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePhoneNumberSettings operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.UpdatePhoneNumberSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdatePhoneNumberSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePhoneNumberSettingsResult> updatePhoneNumberSettingsAsync(
            UpdatePhoneNumberSettingsRequest updatePhoneNumberSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePhoneNumberSettingsRequest, UpdatePhoneNumberSettingsResult> asyncHandler);

    /**
     * <p>
     * Updates the specified proxy session details, such as voice or SMS capabilities.
     * </p>
     * 
     * @param updateProxySessionRequest
     * @return A Java Future containing the result of the UpdateProxySession operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.UpdateProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateProxySession"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProxySessionResult> updateProxySessionAsync(UpdateProxySessionRequest updateProxySessionRequest);

    /**
     * <p>
     * Updates the specified proxy session details, such as voice or SMS capabilities.
     * </p>
     * 
     * @param updateProxySessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProxySession operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.UpdateProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateProxySession"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProxySessionResult> updateProxySessionAsync(UpdateProxySessionRequest updateProxySessionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProxySessionRequest, UpdateProxySessionResult> asyncHandler);

    /**
     * <p>
     * Updates the details of the specified SIP media application.
     * </p>
     * 
     * @param updateSipMediaApplicationRequest
     * @return A Java Future containing the result of the UpdateSipMediaApplication operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.UpdateSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSipMediaApplicationResult> updateSipMediaApplicationAsync(
            UpdateSipMediaApplicationRequest updateSipMediaApplicationRequest);

    /**
     * <p>
     * Updates the details of the specified SIP media application.
     * </p>
     * 
     * @param updateSipMediaApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSipMediaApplication operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.UpdateSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSipMediaApplicationResult> updateSipMediaApplicationAsync(
            UpdateSipMediaApplicationRequest updateSipMediaApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSipMediaApplicationRequest, UpdateSipMediaApplicationResult> asyncHandler);

    /**
     * <p>
     * Invokes the AWS Lambda function associated with the SIP media application and transaction ID in an update
     * request. The Lambda function can then return a new set of actions.
     * </p>
     * 
     * @param updateSipMediaApplicationCallRequest
     * @return A Java Future containing the result of the UpdateSipMediaApplicationCall operation returned by the
     *         service.
     * @sample AmazonChimeSDKVoiceAsync.UpdateSipMediaApplicationCall
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateSipMediaApplicationCall"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSipMediaApplicationCallResult> updateSipMediaApplicationCallAsync(
            UpdateSipMediaApplicationCallRequest updateSipMediaApplicationCallRequest);

    /**
     * <p>
     * Invokes the AWS Lambda function associated with the SIP media application and transaction ID in an update
     * request. The Lambda function can then return a new set of actions.
     * </p>
     * 
     * @param updateSipMediaApplicationCallRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSipMediaApplicationCall operation returned by the
     *         service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.UpdateSipMediaApplicationCall
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateSipMediaApplicationCall"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSipMediaApplicationCallResult> updateSipMediaApplicationCallAsync(
            UpdateSipMediaApplicationCallRequest updateSipMediaApplicationCallRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSipMediaApplicationCallRequest, UpdateSipMediaApplicationCallResult> asyncHandler);

    /**
     * <p>
     * Updates the details of the specified SIP rule.
     * </p>
     * 
     * @param updateSipRuleRequest
     * @return A Java Future containing the result of the UpdateSipRule operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.UpdateSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateSipRule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSipRuleResult> updateSipRuleAsync(UpdateSipRuleRequest updateSipRuleRequest);

    /**
     * <p>
     * Updates the details of the specified SIP rule.
     * </p>
     * 
     * @param updateSipRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSipRule operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.UpdateSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateSipRule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSipRuleResult> updateSipRuleAsync(UpdateSipRuleRequest updateSipRuleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSipRuleRequest, UpdateSipRuleResult> asyncHandler);

    /**
     * <p>
     * Updates the details for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param updateVoiceConnectorRequest
     * @return A Java Future containing the result of the UpdateVoiceConnector operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.UpdateVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVoiceConnectorResult> updateVoiceConnectorAsync(UpdateVoiceConnectorRequest updateVoiceConnectorRequest);

    /**
     * <p>
     * Updates the details for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param updateVoiceConnectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVoiceConnector operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.UpdateVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVoiceConnectorResult> updateVoiceConnectorAsync(UpdateVoiceConnectorRequest updateVoiceConnectorRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVoiceConnectorRequest, UpdateVoiceConnectorResult> asyncHandler);

    /**
     * <p>
     * Updates the settings for the specified Amazon Chime SDK Voice Connector group.
     * </p>
     * 
     * @param updateVoiceConnectorGroupRequest
     * @return A Java Future containing the result of the UpdateVoiceConnectorGroup operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.UpdateVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVoiceConnectorGroupResult> updateVoiceConnectorGroupAsync(
            UpdateVoiceConnectorGroupRequest updateVoiceConnectorGroupRequest);

    /**
     * <p>
     * Updates the settings for the specified Amazon Chime SDK Voice Connector group.
     * </p>
     * 
     * @param updateVoiceConnectorGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVoiceConnectorGroup operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.UpdateVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVoiceConnectorGroupResult> updateVoiceConnectorGroupAsync(
            UpdateVoiceConnectorGroupRequest updateVoiceConnectorGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVoiceConnectorGroupRequest, UpdateVoiceConnectorGroupResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateVoiceProfile operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.UpdateVoiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateVoiceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVoiceProfileResult> updateVoiceProfileAsync(UpdateVoiceProfileRequest updateVoiceProfileRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVoiceProfile operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.UpdateVoiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateVoiceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVoiceProfileResult> updateVoiceProfileAsync(UpdateVoiceProfileRequest updateVoiceProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVoiceProfileRequest, UpdateVoiceProfileResult> asyncHandler);

    /**
     * <p>
     * Updates the settings for the specified voice profile domain.
     * </p>
     * 
     * @param updateVoiceProfileDomainRequest
     * @return A Java Future containing the result of the UpdateVoiceProfileDomain operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.UpdateVoiceProfileDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateVoiceProfileDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVoiceProfileDomainResult> updateVoiceProfileDomainAsync(UpdateVoiceProfileDomainRequest updateVoiceProfileDomainRequest);

    /**
     * <p>
     * Updates the settings for the specified voice profile domain.
     * </p>
     * 
     * @param updateVoiceProfileDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVoiceProfileDomain operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.UpdateVoiceProfileDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateVoiceProfileDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVoiceProfileDomainResult> updateVoiceProfileDomainAsync(UpdateVoiceProfileDomainRequest updateVoiceProfileDomainRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVoiceProfileDomainRequest, UpdateVoiceProfileDomainResult> asyncHandler);

    /**
     * <p>
     * Validates an address to be used for 911 calls made with Amazon Chime SDK Voice Connectors. You can use validated
     * addresses in a Presence Information Data Format Location Object file that you include in SIP requests. That helps
     * ensure that addresses are routed to the appropriate Public Safety Answering Point.
     * </p>
     * 
     * @param validateE911AddressRequest
     * @return A Java Future containing the result of the ValidateE911Address operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.ValidateE911Address
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ValidateE911Address"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ValidateE911AddressResult> validateE911AddressAsync(ValidateE911AddressRequest validateE911AddressRequest);

    /**
     * <p>
     * Validates an address to be used for 911 calls made with Amazon Chime SDK Voice Connectors. You can use validated
     * addresses in a Presence Information Data Format Location Object file that you include in SIP requests. That helps
     * ensure that addresses are routed to the appropriate Public Safety Answering Point.
     * </p>
     * 
     * @param validateE911AddressRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ValidateE911Address operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsyncHandler.ValidateE911Address
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ValidateE911Address"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ValidateE911AddressResult> validateE911AddressAsync(ValidateE911AddressRequest validateE911AddressRequest,
            com.amazonaws.handlers.AsyncHandler<ValidateE911AddressRequest, ValidateE911AddressResult> asyncHandler);

}
