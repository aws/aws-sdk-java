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
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonChimeSDKVoiceAsync extends AmazonChimeSDKVoice {

    /**
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
     * @param batchDeletePhoneNumberRequest
     * @return A Java Future containing the result of the BatchDeletePhoneNumber operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.BatchDeletePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/BatchDeletePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeletePhoneNumberResult> batchDeletePhoneNumberAsync(BatchDeletePhoneNumberRequest batchDeletePhoneNumberRequest);

    /**
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
     * @param batchUpdatePhoneNumberRequest
     * @return A Java Future containing the result of the BatchUpdatePhoneNumber operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.BatchUpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/BatchUpdatePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdatePhoneNumberResult> batchUpdatePhoneNumberAsync(BatchUpdatePhoneNumberRequest batchUpdatePhoneNumberRequest);

    /**
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
     * @param createPhoneNumberOrderRequest
     * @return A Java Future containing the result of the CreatePhoneNumberOrder operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.CreatePhoneNumberOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreatePhoneNumberOrder"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePhoneNumberOrderResult> createPhoneNumberOrderAsync(CreatePhoneNumberOrderRequest createPhoneNumberOrderRequest);

    /**
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
     * @param createProxySessionRequest
     * @return A Java Future containing the result of the CreateProxySession operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.CreateProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateProxySession"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateProxySessionResult> createProxySessionAsync(CreateProxySessionRequest createProxySessionRequest);

    /**
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
     * @param createSipMediaApplicationRequest
     * @return A Java Future containing the result of the CreateSipMediaApplication operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.CreateSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSipMediaApplicationResult> createSipMediaApplicationAsync(
            CreateSipMediaApplicationRequest createSipMediaApplicationRequest);

    /**
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
     * @param createSipRuleRequest
     * @return A Java Future containing the result of the CreateSipRule operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.CreateSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateSipRule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSipRuleResult> createSipRuleAsync(CreateSipRuleRequest createSipRuleRequest);

    /**
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
     * @param createVoiceConnectorRequest
     * @return A Java Future containing the result of the CreateVoiceConnector operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.CreateVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVoiceConnectorResult> createVoiceConnectorAsync(CreateVoiceConnectorRequest createVoiceConnectorRequest);

    /**
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
     * @param createVoiceConnectorGroupRequest
     * @return A Java Future containing the result of the CreateVoiceConnectorGroup operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.CreateVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVoiceConnectorGroupResult> createVoiceConnectorGroupAsync(
            CreateVoiceConnectorGroupRequest createVoiceConnectorGroupRequest);

    /**
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
     * @param deletePhoneNumberRequest
     * @return A Java Future containing the result of the DeletePhoneNumber operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.DeletePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeletePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePhoneNumberResult> deletePhoneNumberAsync(DeletePhoneNumberRequest deletePhoneNumberRequest);

    /**
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
     * @param deleteProxySessionRequest
     * @return A Java Future containing the result of the DeleteProxySession operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.DeleteProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteProxySession"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProxySessionResult> deleteProxySessionAsync(DeleteProxySessionRequest deleteProxySessionRequest);

    /**
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
     * @param deleteSipMediaApplicationRequest
     * @return A Java Future containing the result of the DeleteSipMediaApplication operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.DeleteSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSipMediaApplicationResult> deleteSipMediaApplicationAsync(
            DeleteSipMediaApplicationRequest deleteSipMediaApplicationRequest);

    /**
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
     * @param deleteSipRuleRequest
     * @return A Java Future containing the result of the DeleteSipRule operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.DeleteSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteSipRule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSipRuleResult> deleteSipRuleAsync(DeleteSipRuleRequest deleteSipRuleRequest);

    /**
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
     * @param deleteVoiceConnectorRequest
     * @return A Java Future containing the result of the DeleteVoiceConnector operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.DeleteVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorResult> deleteVoiceConnectorAsync(DeleteVoiceConnectorRequest deleteVoiceConnectorRequest);

    /**
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
     * @param deleteVoiceConnectorGroupRequest
     * @return A Java Future containing the result of the DeleteVoiceConnectorGroup operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.DeleteVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorGroupResult> deleteVoiceConnectorGroupAsync(
            DeleteVoiceConnectorGroupRequest deleteVoiceConnectorGroupRequest);

    /**
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
     * @param deleteVoiceConnectorProxyRequest
     * @return A Java Future containing the result of the DeleteVoiceConnectorProxy operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.DeleteVoiceConnectorProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorProxy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorProxyResult> deleteVoiceConnectorProxyAsync(
            DeleteVoiceConnectorProxyRequest deleteVoiceConnectorProxyRequest);

    /**
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
     * @param getGlobalSettingsRequest
     * @return A Java Future containing the result of the GetGlobalSettings operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetGlobalSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetGlobalSettingsResult> getGlobalSettingsAsync(GetGlobalSettingsRequest getGlobalSettingsRequest);

    /**
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
     * @param getPhoneNumberRequest
     * @return A Java Future containing the result of the GetPhoneNumber operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetPhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetPhoneNumber" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPhoneNumberResult> getPhoneNumberAsync(GetPhoneNumberRequest getPhoneNumberRequest);

    /**
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
     * @param getPhoneNumberOrderRequest
     * @return A Java Future containing the result of the GetPhoneNumberOrder operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetPhoneNumberOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetPhoneNumberOrder"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPhoneNumberOrderResult> getPhoneNumberOrderAsync(GetPhoneNumberOrderRequest getPhoneNumberOrderRequest);

    /**
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
     * @param getPhoneNumberSettingsRequest
     * @return A Java Future containing the result of the GetPhoneNumberSettings operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetPhoneNumberSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetPhoneNumberSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPhoneNumberSettingsResult> getPhoneNumberSettingsAsync(GetPhoneNumberSettingsRequest getPhoneNumberSettingsRequest);

    /**
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
     * @param getProxySessionRequest
     * @return A Java Future containing the result of the GetProxySession operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetProxySession"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetProxySessionResult> getProxySessionAsync(GetProxySessionRequest getProxySessionRequest);

    /**
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
     * @param getSipMediaApplicationRequest
     * @return A Java Future containing the result of the GetSipMediaApplication operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSipMediaApplicationResult> getSipMediaApplicationAsync(GetSipMediaApplicationRequest getSipMediaApplicationRequest);

    /**
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
     * @param getSipMediaApplicationAlexaSkillConfigurationRequest
     * @return A Java Future containing the result of the GetSipMediaApplicationAlexaSkillConfiguration operation
     *         returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetSipMediaApplicationAlexaSkillConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSipMediaApplicationAlexaSkillConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSipMediaApplicationAlexaSkillConfigurationResult> getSipMediaApplicationAlexaSkillConfigurationAsync(
            GetSipMediaApplicationAlexaSkillConfigurationRequest getSipMediaApplicationAlexaSkillConfigurationRequest);

    /**
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
    java.util.concurrent.Future<GetSipMediaApplicationAlexaSkillConfigurationResult> getSipMediaApplicationAlexaSkillConfigurationAsync(
            GetSipMediaApplicationAlexaSkillConfigurationRequest getSipMediaApplicationAlexaSkillConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetSipMediaApplicationAlexaSkillConfigurationRequest, GetSipMediaApplicationAlexaSkillConfigurationResult> asyncHandler);

    /**
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
     * @param getSipRuleRequest
     * @return A Java Future containing the result of the GetSipRule operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSipRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSipRuleResult> getSipRuleAsync(GetSipRuleRequest getSipRuleRequest);

    /**
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
     * @param getVoiceConnectorRequest
     * @return A Java Future containing the result of the GetVoiceConnector operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorResult> getVoiceConnectorAsync(GetVoiceConnectorRequest getVoiceConnectorRequest);

    /**
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
     * @param getVoiceConnectorGroupRequest
     * @return A Java Future containing the result of the GetVoiceConnectorGroup operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorGroupResult> getVoiceConnectorGroupAsync(GetVoiceConnectorGroupRequest getVoiceConnectorGroupRequest);

    /**
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
     * @param getVoiceConnectorProxyRequest
     * @return A Java Future containing the result of the GetVoiceConnectorProxy operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.GetVoiceConnectorProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorProxy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorProxyResult> getVoiceConnectorProxyAsync(GetVoiceConnectorProxyRequest getVoiceConnectorProxyRequest);

    /**
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
     * @param listPhoneNumberOrdersRequest
     * @return A Java Future containing the result of the ListPhoneNumberOrders operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.ListPhoneNumberOrders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListPhoneNumberOrders"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPhoneNumberOrdersResult> listPhoneNumberOrdersAsync(ListPhoneNumberOrdersRequest listPhoneNumberOrdersRequest);

    /**
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
     * @param listPhoneNumbersRequest
     * @return A Java Future containing the result of the ListPhoneNumbers operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.ListPhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListPhoneNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPhoneNumbersResult> listPhoneNumbersAsync(ListPhoneNumbersRequest listPhoneNumbersRequest);

    /**
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
     * @param listProxySessionsRequest
     * @return A Java Future containing the result of the ListProxySessions operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.ListProxySessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListProxySessions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProxySessionsResult> listProxySessionsAsync(ListProxySessionsRequest listProxySessionsRequest);

    /**
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
     * @param listSipMediaApplicationsRequest
     * @return A Java Future containing the result of the ListSipMediaApplications operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.ListSipMediaApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListSipMediaApplications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSipMediaApplicationsResult> listSipMediaApplicationsAsync(ListSipMediaApplicationsRequest listSipMediaApplicationsRequest);

    /**
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
     * @param listSipRulesRequest
     * @return A Java Future containing the result of the ListSipRules operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.ListSipRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListSipRules" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSipRulesResult> listSipRulesAsync(ListSipRulesRequest listSipRulesRequest);

    /**
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
     * @param listVoiceConnectorGroupsRequest
     * @return A Java Future containing the result of the ListVoiceConnectorGroups operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.ListVoiceConnectorGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceConnectorGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVoiceConnectorGroupsResult> listVoiceConnectorGroupsAsync(ListVoiceConnectorGroupsRequest listVoiceConnectorGroupsRequest);

    /**
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
     * @param listVoiceConnectorsRequest
     * @return A Java Future containing the result of the ListVoiceConnectors operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.ListVoiceConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceConnectors"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVoiceConnectorsResult> listVoiceConnectorsAsync(ListVoiceConnectorsRequest listVoiceConnectorsRequest);

    /**
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
     * @param putSipMediaApplicationAlexaSkillConfigurationRequest
     * @return A Java Future containing the result of the PutSipMediaApplicationAlexaSkillConfiguration operation
     *         returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.PutSipMediaApplicationAlexaSkillConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutSipMediaApplicationAlexaSkillConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutSipMediaApplicationAlexaSkillConfigurationResult> putSipMediaApplicationAlexaSkillConfigurationAsync(
            PutSipMediaApplicationAlexaSkillConfigurationRequest putSipMediaApplicationAlexaSkillConfigurationRequest);

    /**
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
    java.util.concurrent.Future<PutSipMediaApplicationAlexaSkillConfigurationResult> putSipMediaApplicationAlexaSkillConfigurationAsync(
            PutSipMediaApplicationAlexaSkillConfigurationRequest putSipMediaApplicationAlexaSkillConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutSipMediaApplicationAlexaSkillConfigurationRequest, PutSipMediaApplicationAlexaSkillConfigurationResult> asyncHandler);

    /**
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
     * @param putVoiceConnectorProxyRequest
     * @return A Java Future containing the result of the PutVoiceConnectorProxy operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.PutVoiceConnectorProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorProxy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorProxyResult> putVoiceConnectorProxyAsync(PutVoiceConnectorProxyRequest putVoiceConnectorProxyRequest);

    /**
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
     * @param restorePhoneNumberRequest
     * @return A Java Future containing the result of the RestorePhoneNumber operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.RestorePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/RestorePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RestorePhoneNumberResult> restorePhoneNumberAsync(RestorePhoneNumberRequest restorePhoneNumberRequest);

    /**
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
     * @param searchAvailablePhoneNumbersRequest
     * @return A Java Future containing the result of the SearchAvailablePhoneNumbers operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.SearchAvailablePhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/SearchAvailablePhoneNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchAvailablePhoneNumbersResult> searchAvailablePhoneNumbersAsync(
            SearchAvailablePhoneNumbersRequest searchAvailablePhoneNumbersRequest);

    /**
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
     * @param updateGlobalSettingsRequest
     * @return A Java Future containing the result of the UpdateGlobalSettings operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.UpdateGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateGlobalSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGlobalSettingsResult> updateGlobalSettingsAsync(UpdateGlobalSettingsRequest updateGlobalSettingsRequest);

    /**
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
     * @param updatePhoneNumberRequest
     * @return A Java Future containing the result of the UpdatePhoneNumber operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.UpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdatePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePhoneNumberResult> updatePhoneNumberAsync(UpdatePhoneNumberRequest updatePhoneNumberRequest);

    /**
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
     * @param updatePhoneNumberSettingsRequest
     * @return A Java Future containing the result of the UpdatePhoneNumberSettings operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.UpdatePhoneNumberSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdatePhoneNumberSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePhoneNumberSettingsResult> updatePhoneNumberSettingsAsync(
            UpdatePhoneNumberSettingsRequest updatePhoneNumberSettingsRequest);

    /**
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
     * @param updateProxySessionRequest
     * @return A Java Future containing the result of the UpdateProxySession operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.UpdateProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateProxySession"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProxySessionResult> updateProxySessionAsync(UpdateProxySessionRequest updateProxySessionRequest);

    /**
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
     * @param updateSipMediaApplicationRequest
     * @return A Java Future containing the result of the UpdateSipMediaApplication operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.UpdateSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSipMediaApplicationResult> updateSipMediaApplicationAsync(
            UpdateSipMediaApplicationRequest updateSipMediaApplicationRequest);

    /**
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
     * @param updateSipRuleRequest
     * @return A Java Future containing the result of the UpdateSipRule operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.UpdateSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateSipRule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSipRuleResult> updateSipRuleAsync(UpdateSipRuleRequest updateSipRuleRequest);

    /**
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
     * @param updateVoiceConnectorRequest
     * @return A Java Future containing the result of the UpdateVoiceConnector operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.UpdateVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVoiceConnectorResult> updateVoiceConnectorAsync(UpdateVoiceConnectorRequest updateVoiceConnectorRequest);

    /**
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
     * @param updateVoiceConnectorGroupRequest
     * @return A Java Future containing the result of the UpdateVoiceConnectorGroup operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.UpdateVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVoiceConnectorGroupResult> updateVoiceConnectorGroupAsync(
            UpdateVoiceConnectorGroupRequest updateVoiceConnectorGroupRequest);

    /**
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
     * @param validateE911AddressRequest
     * @return A Java Future containing the result of the ValidateE911Address operation returned by the service.
     * @sample AmazonChimeSDKVoiceAsync.ValidateE911Address
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ValidateE911Address"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ValidateE911AddressResult> validateE911AddressAsync(ValidateE911AddressRequest validateE911AddressRequest);

    /**
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
