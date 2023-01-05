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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.chimesdkvoice.model.*;

/**
 * Interface for accessing Amazon Chime SDK Voice.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.chimesdkvoice.AbstractAmazonChimeSDKVoice} instead.
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
     * @param associatePhoneNumbersWithVoiceConnectorRequest
     * @return Result of the AssociatePhoneNumbersWithVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws AccessDeniedException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.AssociatePhoneNumbersWithVoiceConnector
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/AssociatePhoneNumbersWithVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    AssociatePhoneNumbersWithVoiceConnectorResult associatePhoneNumbersWithVoiceConnector(
            AssociatePhoneNumbersWithVoiceConnectorRequest associatePhoneNumbersWithVoiceConnectorRequest);

    /**
     * @param associatePhoneNumbersWithVoiceConnectorGroupRequest
     * @return Result of the AssociatePhoneNumbersWithVoiceConnectorGroup operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws AccessDeniedException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.AssociatePhoneNumbersWithVoiceConnectorGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/AssociatePhoneNumbersWithVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    AssociatePhoneNumbersWithVoiceConnectorGroupResult associatePhoneNumbersWithVoiceConnectorGroup(
            AssociatePhoneNumbersWithVoiceConnectorGroupRequest associatePhoneNumbersWithVoiceConnectorGroupRequest);

    /**
     * @param batchDeletePhoneNumberRequest
     * @return Result of the BatchDeletePhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.BatchDeletePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/BatchDeletePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDeletePhoneNumberResult batchDeletePhoneNumber(BatchDeletePhoneNumberRequest batchDeletePhoneNumberRequest);

    /**
     * @param batchUpdatePhoneNumberRequest
     * @return Result of the BatchUpdatePhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.BatchUpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/BatchUpdatePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    BatchUpdatePhoneNumberResult batchUpdatePhoneNumber(BatchUpdatePhoneNumberRequest batchUpdatePhoneNumberRequest);

    /**
     * @param createPhoneNumberOrderRequest
     * @return Result of the CreatePhoneNumberOrder operation returned by the service.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws AccessDeniedException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ResourceLimitExceededException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.CreatePhoneNumberOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreatePhoneNumberOrder"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePhoneNumberOrderResult createPhoneNumberOrder(CreatePhoneNumberOrderRequest createPhoneNumberOrderRequest);

    /**
     * @param createProxySessionRequest
     * @return Result of the CreateProxySession operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.CreateProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateProxySession"
     *      target="_top">AWS API Documentation</a>
     */
    CreateProxySessionResult createProxySession(CreateProxySessionRequest createProxySessionRequest);

    /**
     * @param createSipMediaApplicationRequest
     * @return Result of the CreateSipMediaApplication operation returned by the service.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws AccessDeniedException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ResourceLimitExceededException
     * @throws ConflictException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.CreateSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSipMediaApplicationResult createSipMediaApplication(CreateSipMediaApplicationRequest createSipMediaApplicationRequest);

    /**
     * @param createSipMediaApplicationCallRequest
     * @return Result of the CreateSipMediaApplicationCall operation returned by the service.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws AccessDeniedException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.CreateSipMediaApplicationCall
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateSipMediaApplicationCall"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSipMediaApplicationCallResult createSipMediaApplicationCall(CreateSipMediaApplicationCallRequest createSipMediaApplicationCallRequest);

    /**
     * @param createSipRuleRequest
     * @return Result of the CreateSipRule operation returned by the service.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws AccessDeniedException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ResourceLimitExceededException
     * @throws ConflictException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.CreateSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateSipRule" target="_top">AWS
     *      API Documentation</a>
     */
    CreateSipRuleResult createSipRule(CreateSipRuleRequest createSipRuleRequest);

    /**
     * @param createVoiceConnectorRequest
     * @return Result of the CreateVoiceConnector operation returned by the service.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws AccessDeniedException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ResourceLimitExceededException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.CreateVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    CreateVoiceConnectorResult createVoiceConnector(CreateVoiceConnectorRequest createVoiceConnectorRequest);

    /**
     * @param createVoiceConnectorGroupRequest
     * @return Result of the CreateVoiceConnectorGroup operation returned by the service.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws AccessDeniedException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ResourceLimitExceededException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.CreateVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateVoiceConnectorGroupResult createVoiceConnectorGroup(CreateVoiceConnectorGroupRequest createVoiceConnectorGroupRequest);

    /**
     * @param deletePhoneNumberRequest
     * @return Result of the DeletePhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.DeletePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeletePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePhoneNumberResult deletePhoneNumber(DeletePhoneNumberRequest deletePhoneNumberRequest);

    /**
     * @param deleteProxySessionRequest
     * @return Result of the DeleteProxySession operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.DeleteProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteProxySession"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteProxySessionResult deleteProxySession(DeleteProxySessionRequest deleteProxySessionRequest);

    /**
     * @param deleteSipMediaApplicationRequest
     * @return Result of the DeleteSipMediaApplication operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.DeleteSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSipMediaApplicationResult deleteSipMediaApplication(DeleteSipMediaApplicationRequest deleteSipMediaApplicationRequest);

    /**
     * @param deleteSipRuleRequest
     * @return Result of the DeleteSipRule operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.DeleteSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteSipRule" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteSipRuleResult deleteSipRule(DeleteSipRuleRequest deleteSipRuleRequest);

    /**
     * @param deleteVoiceConnectorRequest
     * @return Result of the DeleteVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.DeleteVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVoiceConnectorResult deleteVoiceConnector(DeleteVoiceConnectorRequest deleteVoiceConnectorRequest);

    /**
     * @param deleteVoiceConnectorEmergencyCallingConfigurationRequest
     * @return Result of the DeleteVoiceConnectorEmergencyCallingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.DeleteVoiceConnectorEmergencyCallingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorEmergencyCallingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVoiceConnectorEmergencyCallingConfigurationResult deleteVoiceConnectorEmergencyCallingConfiguration(
            DeleteVoiceConnectorEmergencyCallingConfigurationRequest deleteVoiceConnectorEmergencyCallingConfigurationRequest);

    /**
     * @param deleteVoiceConnectorGroupRequest
     * @return Result of the DeleteVoiceConnectorGroup operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.DeleteVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVoiceConnectorGroupResult deleteVoiceConnectorGroup(DeleteVoiceConnectorGroupRequest deleteVoiceConnectorGroupRequest);

    /**
     * @param deleteVoiceConnectorOriginationRequest
     * @return Result of the DeleteVoiceConnectorOrigination operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.DeleteVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVoiceConnectorOriginationResult deleteVoiceConnectorOrigination(DeleteVoiceConnectorOriginationRequest deleteVoiceConnectorOriginationRequest);

    /**
     * @param deleteVoiceConnectorProxyRequest
     * @return Result of the DeleteVoiceConnectorProxy operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.DeleteVoiceConnectorProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorProxy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVoiceConnectorProxyResult deleteVoiceConnectorProxy(DeleteVoiceConnectorProxyRequest deleteVoiceConnectorProxyRequest);

    /**
     * @param deleteVoiceConnectorStreamingConfigurationRequest
     * @return Result of the DeleteVoiceConnectorStreamingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.DeleteVoiceConnectorStreamingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorStreamingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVoiceConnectorStreamingConfigurationResult deleteVoiceConnectorStreamingConfiguration(
            DeleteVoiceConnectorStreamingConfigurationRequest deleteVoiceConnectorStreamingConfigurationRequest);

    /**
     * @param deleteVoiceConnectorTerminationRequest
     * @return Result of the DeleteVoiceConnectorTermination operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.DeleteVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVoiceConnectorTerminationResult deleteVoiceConnectorTermination(DeleteVoiceConnectorTerminationRequest deleteVoiceConnectorTerminationRequest);

    /**
     * @param deleteVoiceConnectorTerminationCredentialsRequest
     * @return Result of the DeleteVoiceConnectorTerminationCredentials operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.DeleteVoiceConnectorTerminationCredentials
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVoiceConnectorTerminationCredentialsResult deleteVoiceConnectorTerminationCredentials(
            DeleteVoiceConnectorTerminationCredentialsRequest deleteVoiceConnectorTerminationCredentialsRequest);

    /**
     * @param disassociatePhoneNumbersFromVoiceConnectorRequest
     * @return Result of the DisassociatePhoneNumbersFromVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.DisassociatePhoneNumbersFromVoiceConnector
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DisassociatePhoneNumbersFromVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociatePhoneNumbersFromVoiceConnectorResult disassociatePhoneNumbersFromVoiceConnector(
            DisassociatePhoneNumbersFromVoiceConnectorRequest disassociatePhoneNumbersFromVoiceConnectorRequest);

    /**
     * @param disassociatePhoneNumbersFromVoiceConnectorGroupRequest
     * @return Result of the DisassociatePhoneNumbersFromVoiceConnectorGroup operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.DisassociatePhoneNumbersFromVoiceConnectorGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DisassociatePhoneNumbersFromVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociatePhoneNumbersFromVoiceConnectorGroupResult disassociatePhoneNumbersFromVoiceConnectorGroup(
            DisassociatePhoneNumbersFromVoiceConnectorGroupRequest disassociatePhoneNumbersFromVoiceConnectorGroupRequest);

    /**
     * @param getGlobalSettingsRequest
     * @return Result of the GetGlobalSettings operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.GetGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetGlobalSettings"
     *      target="_top">AWS API Documentation</a>
     */
    GetGlobalSettingsResult getGlobalSettings(GetGlobalSettingsRequest getGlobalSettingsRequest);

    /**
     * @param getPhoneNumberRequest
     * @return Result of the GetPhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.GetPhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetPhoneNumber" target="_top">AWS
     *      API Documentation</a>
     */
    GetPhoneNumberResult getPhoneNumber(GetPhoneNumberRequest getPhoneNumberRequest);

    /**
     * @param getPhoneNumberOrderRequest
     * @return Result of the GetPhoneNumberOrder operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.GetPhoneNumberOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetPhoneNumberOrder"
     *      target="_top">AWS API Documentation</a>
     */
    GetPhoneNumberOrderResult getPhoneNumberOrder(GetPhoneNumberOrderRequest getPhoneNumberOrderRequest);

    /**
     * @param getPhoneNumberSettingsRequest
     * @return Result of the GetPhoneNumberSettings operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.GetPhoneNumberSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetPhoneNumberSettings"
     *      target="_top">AWS API Documentation</a>
     */
    GetPhoneNumberSettingsResult getPhoneNumberSettings(GetPhoneNumberSettingsRequest getPhoneNumberSettingsRequest);

    /**
     * @param getProxySessionRequest
     * @return Result of the GetProxySession operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.GetProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetProxySession"
     *      target="_top">AWS API Documentation</a>
     */
    GetProxySessionResult getProxySession(GetProxySessionRequest getProxySessionRequest);

    /**
     * @param getSipMediaApplicationRequest
     * @return Result of the GetSipMediaApplication operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.GetSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    GetSipMediaApplicationResult getSipMediaApplication(GetSipMediaApplicationRequest getSipMediaApplicationRequest);

    /**
     * @param getSipMediaApplicationAlexaSkillConfigurationRequest
     * @return Result of the GetSipMediaApplicationAlexaSkillConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.GetSipMediaApplicationAlexaSkillConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSipMediaApplicationAlexaSkillConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetSipMediaApplicationAlexaSkillConfigurationResult getSipMediaApplicationAlexaSkillConfiguration(
            GetSipMediaApplicationAlexaSkillConfigurationRequest getSipMediaApplicationAlexaSkillConfigurationRequest);

    /**
     * @param getSipMediaApplicationLoggingConfigurationRequest
     * @return Result of the GetSipMediaApplicationLoggingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.GetSipMediaApplicationLoggingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSipMediaApplicationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetSipMediaApplicationLoggingConfigurationResult getSipMediaApplicationLoggingConfiguration(
            GetSipMediaApplicationLoggingConfigurationRequest getSipMediaApplicationLoggingConfigurationRequest);

    /**
     * @param getSipRuleRequest
     * @return Result of the GetSipRule operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.GetSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSipRule" target="_top">AWS API
     *      Documentation</a>
     */
    GetSipRuleResult getSipRule(GetSipRuleRequest getSipRuleRequest);

    /**
     * @param getVoiceConnectorRequest
     * @return Result of the GetVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.GetVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceConnectorResult getVoiceConnector(GetVoiceConnectorRequest getVoiceConnectorRequest);

    /**
     * @param getVoiceConnectorEmergencyCallingConfigurationRequest
     * @return Result of the GetVoiceConnectorEmergencyCallingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.GetVoiceConnectorEmergencyCallingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorEmergencyCallingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceConnectorEmergencyCallingConfigurationResult getVoiceConnectorEmergencyCallingConfiguration(
            GetVoiceConnectorEmergencyCallingConfigurationRequest getVoiceConnectorEmergencyCallingConfigurationRequest);

    /**
     * @param getVoiceConnectorGroupRequest
     * @return Result of the GetVoiceConnectorGroup operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.GetVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceConnectorGroupResult getVoiceConnectorGroup(GetVoiceConnectorGroupRequest getVoiceConnectorGroupRequest);

    /**
     * @param getVoiceConnectorLoggingConfigurationRequest
     * @return Result of the GetVoiceConnectorLoggingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.GetVoiceConnectorLoggingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceConnectorLoggingConfigurationResult getVoiceConnectorLoggingConfiguration(
            GetVoiceConnectorLoggingConfigurationRequest getVoiceConnectorLoggingConfigurationRequest);

    /**
     * @param getVoiceConnectorOriginationRequest
     * @return Result of the GetVoiceConnectorOrigination operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.GetVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceConnectorOriginationResult getVoiceConnectorOrigination(GetVoiceConnectorOriginationRequest getVoiceConnectorOriginationRequest);

    /**
     * @param getVoiceConnectorProxyRequest
     * @return Result of the GetVoiceConnectorProxy operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.GetVoiceConnectorProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorProxy"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceConnectorProxyResult getVoiceConnectorProxy(GetVoiceConnectorProxyRequest getVoiceConnectorProxyRequest);

    /**
     * @param getVoiceConnectorStreamingConfigurationRequest
     * @return Result of the GetVoiceConnectorStreamingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.GetVoiceConnectorStreamingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorStreamingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceConnectorStreamingConfigurationResult getVoiceConnectorStreamingConfiguration(
            GetVoiceConnectorStreamingConfigurationRequest getVoiceConnectorStreamingConfigurationRequest);

    /**
     * @param getVoiceConnectorTerminationRequest
     * @return Result of the GetVoiceConnectorTermination operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.GetVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceConnectorTerminationResult getVoiceConnectorTermination(GetVoiceConnectorTerminationRequest getVoiceConnectorTerminationRequest);

    /**
     * @param getVoiceConnectorTerminationHealthRequest
     * @return Result of the GetVoiceConnectorTerminationHealth operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.GetVoiceConnectorTerminationHealth
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorTerminationHealth"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceConnectorTerminationHealthResult getVoiceConnectorTerminationHealth(
            GetVoiceConnectorTerminationHealthRequest getVoiceConnectorTerminationHealthRequest);

    /**
     * @param listAvailableVoiceConnectorRegionsRequest
     * @return Result of the ListAvailableVoiceConnectorRegions operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.ListAvailableVoiceConnectorRegions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListAvailableVoiceConnectorRegions"
     *      target="_top">AWS API Documentation</a>
     */
    ListAvailableVoiceConnectorRegionsResult listAvailableVoiceConnectorRegions(
            ListAvailableVoiceConnectorRegionsRequest listAvailableVoiceConnectorRegionsRequest);

    /**
     * @param listPhoneNumberOrdersRequest
     * @return Result of the ListPhoneNumberOrders operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.ListPhoneNumberOrders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListPhoneNumberOrders"
     *      target="_top">AWS API Documentation</a>
     */
    ListPhoneNumberOrdersResult listPhoneNumberOrders(ListPhoneNumberOrdersRequest listPhoneNumberOrdersRequest);

    /**
     * @param listPhoneNumbersRequest
     * @return Result of the ListPhoneNumbers operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.ListPhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListPhoneNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    ListPhoneNumbersResult listPhoneNumbers(ListPhoneNumbersRequest listPhoneNumbersRequest);

    /**
     * @param listProxySessionsRequest
     * @return Result of the ListProxySessions operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.ListProxySessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListProxySessions"
     *      target="_top">AWS API Documentation</a>
     */
    ListProxySessionsResult listProxySessions(ListProxySessionsRequest listProxySessionsRequest);

    /**
     * @param listSipMediaApplicationsRequest
     * @return Result of the ListSipMediaApplications operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.ListSipMediaApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListSipMediaApplications"
     *      target="_top">AWS API Documentation</a>
     */
    ListSipMediaApplicationsResult listSipMediaApplications(ListSipMediaApplicationsRequest listSipMediaApplicationsRequest);

    /**
     * @param listSipRulesRequest
     * @return Result of the ListSipRules operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.ListSipRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListSipRules" target="_top">AWS
     *      API Documentation</a>
     */
    ListSipRulesResult listSipRules(ListSipRulesRequest listSipRulesRequest);

    /**
     * @param listSupportedPhoneNumberCountriesRequest
     * @return Result of the ListSupportedPhoneNumberCountries operation returned by the service.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws AccessDeniedException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.ListSupportedPhoneNumberCountries
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListSupportedPhoneNumberCountries"
     *      target="_top">AWS API Documentation</a>
     */
    ListSupportedPhoneNumberCountriesResult listSupportedPhoneNumberCountries(ListSupportedPhoneNumberCountriesRequest listSupportedPhoneNumberCountriesRequest);

    /**
     * @param listVoiceConnectorGroupsRequest
     * @return Result of the ListVoiceConnectorGroups operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.ListVoiceConnectorGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceConnectorGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListVoiceConnectorGroupsResult listVoiceConnectorGroups(ListVoiceConnectorGroupsRequest listVoiceConnectorGroupsRequest);

    /**
     * @param listVoiceConnectorTerminationCredentialsRequest
     * @return Result of the ListVoiceConnectorTerminationCredentials operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.ListVoiceConnectorTerminationCredentials
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    ListVoiceConnectorTerminationCredentialsResult listVoiceConnectorTerminationCredentials(
            ListVoiceConnectorTerminationCredentialsRequest listVoiceConnectorTerminationCredentialsRequest);

    /**
     * @param listVoiceConnectorsRequest
     * @return Result of the ListVoiceConnectors operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.ListVoiceConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceConnectors"
     *      target="_top">AWS API Documentation</a>
     */
    ListVoiceConnectorsResult listVoiceConnectors(ListVoiceConnectorsRequest listVoiceConnectorsRequest);

    /**
     * @param putSipMediaApplicationAlexaSkillConfigurationRequest
     * @return Result of the PutSipMediaApplicationAlexaSkillConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.PutSipMediaApplicationAlexaSkillConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutSipMediaApplicationAlexaSkillConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutSipMediaApplicationAlexaSkillConfigurationResult putSipMediaApplicationAlexaSkillConfiguration(
            PutSipMediaApplicationAlexaSkillConfigurationRequest putSipMediaApplicationAlexaSkillConfigurationRequest);

    /**
     * @param putSipMediaApplicationLoggingConfigurationRequest
     * @return Result of the PutSipMediaApplicationLoggingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.PutSipMediaApplicationLoggingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutSipMediaApplicationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutSipMediaApplicationLoggingConfigurationResult putSipMediaApplicationLoggingConfiguration(
            PutSipMediaApplicationLoggingConfigurationRequest putSipMediaApplicationLoggingConfigurationRequest);

    /**
     * @param putVoiceConnectorEmergencyCallingConfigurationRequest
     * @return Result of the PutVoiceConnectorEmergencyCallingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.PutVoiceConnectorEmergencyCallingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorEmergencyCallingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutVoiceConnectorEmergencyCallingConfigurationResult putVoiceConnectorEmergencyCallingConfiguration(
            PutVoiceConnectorEmergencyCallingConfigurationRequest putVoiceConnectorEmergencyCallingConfigurationRequest);

    /**
     * @param putVoiceConnectorLoggingConfigurationRequest
     * @return Result of the PutVoiceConnectorLoggingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.PutVoiceConnectorLoggingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutVoiceConnectorLoggingConfigurationResult putVoiceConnectorLoggingConfiguration(
            PutVoiceConnectorLoggingConfigurationRequest putVoiceConnectorLoggingConfigurationRequest);

    /**
     * @param putVoiceConnectorOriginationRequest
     * @return Result of the PutVoiceConnectorOrigination operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.PutVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    PutVoiceConnectorOriginationResult putVoiceConnectorOrigination(PutVoiceConnectorOriginationRequest putVoiceConnectorOriginationRequest);

    /**
     * @param putVoiceConnectorProxyRequest
     * @return Result of the PutVoiceConnectorProxy operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws AccessDeniedException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.PutVoiceConnectorProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorProxy"
     *      target="_top">AWS API Documentation</a>
     */
    PutVoiceConnectorProxyResult putVoiceConnectorProxy(PutVoiceConnectorProxyRequest putVoiceConnectorProxyRequest);

    /**
     * @param putVoiceConnectorStreamingConfigurationRequest
     * @return Result of the PutVoiceConnectorStreamingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.PutVoiceConnectorStreamingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorStreamingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutVoiceConnectorStreamingConfigurationResult putVoiceConnectorStreamingConfiguration(
            PutVoiceConnectorStreamingConfigurationRequest putVoiceConnectorStreamingConfigurationRequest);

    /**
     * @param putVoiceConnectorTerminationRequest
     * @return Result of the PutVoiceConnectorTermination operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws AccessDeniedException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.PutVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    PutVoiceConnectorTerminationResult putVoiceConnectorTermination(PutVoiceConnectorTerminationRequest putVoiceConnectorTerminationRequest);

    /**
     * @param putVoiceConnectorTerminationCredentialsRequest
     * @return Result of the PutVoiceConnectorTerminationCredentials operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.PutVoiceConnectorTerminationCredentials
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    PutVoiceConnectorTerminationCredentialsResult putVoiceConnectorTerminationCredentials(
            PutVoiceConnectorTerminationCredentialsRequest putVoiceConnectorTerminationCredentialsRequest);

    /**
     * @param restorePhoneNumberRequest
     * @return Result of the RestorePhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ResourceLimitExceededException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.RestorePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/RestorePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    RestorePhoneNumberResult restorePhoneNumber(RestorePhoneNumberRequest restorePhoneNumberRequest);

    /**
     * @param searchAvailablePhoneNumbersRequest
     * @return Result of the SearchAvailablePhoneNumbers operation returned by the service.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws AccessDeniedException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.SearchAvailablePhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/SearchAvailablePhoneNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    SearchAvailablePhoneNumbersResult searchAvailablePhoneNumbers(SearchAvailablePhoneNumbersRequest searchAvailablePhoneNumbersRequest);

    /**
     * @param updateGlobalSettingsRequest
     * @return Result of the UpdateGlobalSettings operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.UpdateGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateGlobalSettings"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateGlobalSettingsResult updateGlobalSettings(UpdateGlobalSettingsRequest updateGlobalSettingsRequest);

    /**
     * @param updatePhoneNumberRequest
     * @return Result of the UpdatePhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ConflictException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.UpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdatePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePhoneNumberResult updatePhoneNumber(UpdatePhoneNumberRequest updatePhoneNumberRequest);

    /**
     * @param updatePhoneNumberSettingsRequest
     * @return Result of the UpdatePhoneNumberSettings operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.UpdatePhoneNumberSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdatePhoneNumberSettings"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePhoneNumberSettingsResult updatePhoneNumberSettings(UpdatePhoneNumberSettingsRequest updatePhoneNumberSettingsRequest);

    /**
     * @param updateProxySessionRequest
     * @return Result of the UpdateProxySession operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.UpdateProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateProxySession"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateProxySessionResult updateProxySession(UpdateProxySessionRequest updateProxySessionRequest);

    /**
     * @param updateSipMediaApplicationRequest
     * @return Result of the UpdateSipMediaApplication operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.UpdateSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSipMediaApplicationResult updateSipMediaApplication(UpdateSipMediaApplicationRequest updateSipMediaApplicationRequest);

    /**
     * @param updateSipMediaApplicationCallRequest
     * @return Result of the UpdateSipMediaApplicationCall operation returned by the service.
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.UpdateSipMediaApplicationCall
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateSipMediaApplicationCall"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSipMediaApplicationCallResult updateSipMediaApplicationCall(UpdateSipMediaApplicationCallRequest updateSipMediaApplicationCallRequest);

    /**
     * @param updateSipRuleRequest
     * @return Result of the UpdateSipRule operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ThrottledClientException
     * @throws ResourceLimitExceededException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.UpdateSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateSipRule" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateSipRuleResult updateSipRule(UpdateSipRuleRequest updateSipRuleRequest);

    /**
     * @param updateVoiceConnectorRequest
     * @return Result of the UpdateVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.UpdateVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateVoiceConnectorResult updateVoiceConnector(UpdateVoiceConnectorRequest updateVoiceConnectorRequest);

    /**
     * @param updateVoiceConnectorGroupRequest
     * @return Result of the UpdateVoiceConnectorGroup operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @sample AmazonChimeSDKVoice.UpdateVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateVoiceConnectorGroupResult updateVoiceConnectorGroup(UpdateVoiceConnectorGroupRequest updateVoiceConnectorGroupRequest);

    /**
     * @param validateE911AddressRequest
     * @return Result of the ValidateE911Address operation returned by the service.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
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
