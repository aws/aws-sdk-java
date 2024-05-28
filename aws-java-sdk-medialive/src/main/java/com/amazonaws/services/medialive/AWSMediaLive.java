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
package com.amazonaws.services.medialive;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.services.medialive.waiters.AWSMediaLiveWaiters;

/**
 * Interface for accessing MediaLive.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.medialive.AbstractAWSMediaLive} instead.
 * </p>
 * <p>
 * API for AWS Elemental MediaLive
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMediaLive {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "medialive";

    /**
     * Accept an incoming input device transfer. The ownership of the device will transfer to your AWS account.
     * 
     * @param acceptInputDeviceTransferRequest
     *        Placeholder documentation for AcceptInputDeviceTransferRequest
     * @return Result of the AcceptInputDeviceTransfer operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         Transfer operation failed, input could not be validated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to accept input device transfers.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws NotFoundException
     *         Input device not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on transfer device calls to the input device service.
     * @throws ConflictException
     *         Input device transfer could not be accepted.
     * @sample AWSMediaLive.AcceptInputDeviceTransfer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/AcceptInputDeviceTransfer"
     *      target="_top">AWS API Documentation</a>
     */
    AcceptInputDeviceTransferResult acceptInputDeviceTransfer(AcceptInputDeviceTransferRequest acceptInputDeviceTransferRequest);

    /**
     * Starts delete of resources.
     * 
     * @param batchDeleteRequest
     *        A request to delete resources
     * @return Result of the BatchDelete operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to delete the resources.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The resources you're requesting to delete do not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on delete resources calls.
     * @throws ConflictException
     *         The resources are unable to delete.
     * @sample AWSMediaLive.BatchDelete
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchDelete" target="_top">AWS API
     *      Documentation</a>
     */
    BatchDeleteResult batchDelete(BatchDeleteRequest batchDeleteRequest);

    /**
     * Starts existing resources
     * 
     * @param batchStartRequest
     *        A request to start resources
     * @return Result of the BatchStart operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to start the resources.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The resources you're requesting to start do not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on start resources calls to resource service.
     * @throws ConflictException
     *         The resources are unable to start.
     * @sample AWSMediaLive.BatchStart
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchStart" target="_top">AWS API
     *      Documentation</a>
     */
    BatchStartResult batchStart(BatchStartRequest batchStartRequest);

    /**
     * Stops running resources
     * 
     * @param batchStopRequest
     *        A request to stop resources
     * @return Result of the BatchStop operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to stop the resources.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The resources you're requesting to stop do not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on stop resources.
     * @throws ConflictException
     *         The resources are unable to stop.
     * @sample AWSMediaLive.BatchStop
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchStop" target="_top">AWS API
     *      Documentation</a>
     */
    BatchStopResult batchStop(BatchStopRequest batchStopRequest);

    /**
     * Update a channel schedule
     * 
     * @param batchUpdateScheduleRequest
     *        List of actions to create and list of actions to delete.
     * @return Result of the BatchUpdateSchedule operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         The update schedule request failed validation.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         You do not have permission to update the channel schedule.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The specified channel id does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on update schedule calls.
     * @sample AWSMediaLive.BatchUpdateSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchUpdateSchedule" target="_top">AWS
     *      API Documentation</a>
     */
    BatchUpdateScheduleResult batchUpdateSchedule(BatchUpdateScheduleRequest batchUpdateScheduleRequest);

    /**
     * Cancel an input device transfer that you have requested.
     * 
     * @param cancelInputDeviceTransferRequest
     *        Placeholder documentation for CancelInputDeviceTransferRequest
     * @return Result of the CancelInputDeviceTransfer operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         Transfer operation failed, input could not be validated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to cancel input device transfers.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws NotFoundException
     *         Input device not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on transfer device calls to the input device service.
     * @throws ConflictException
     *         Input device transfer could not be canceled.
     * @sample AWSMediaLive.CancelInputDeviceTransfer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CancelInputDeviceTransfer"
     *      target="_top">AWS API Documentation</a>
     */
    CancelInputDeviceTransferResult cancelInputDeviceTransfer(CancelInputDeviceTransferRequest cancelInputDeviceTransferRequest);

    /**
     * Send a request to claim an AWS Elemental device that you have purchased from a third-party vendor. After the
     * request succeeds, you will own the device.
     * 
     * @param claimDeviceRequest
     *        A request to claim an AWS Elemental device that you have purchased from a third-party vendor.
     * @return Result of the ClaimDevice operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         Claim operation failed, device id could not be validated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You don't have the IAM access permissions to claim this device. You must have permission for the
     *         WriteClaim operation.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws NotFoundException
     *         Device not found or you called an unsupported region.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded. Your have sent this request too many times. There might be a bug in your API
     *         client.
     * @sample AWSMediaLive.ClaimDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ClaimDevice" target="_top">AWS API
     *      Documentation</a>
     */
    ClaimDeviceResult claimDevice(ClaimDeviceRequest claimDeviceRequest);

    /**
     * Creates a new channel
     * 
     * @param createChannelRequest
     *        A request to create a channel
     * @return Result of the CreateChannel operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         The Channel failed validation and could not be created.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         You do not have permission to create the channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on create channel calls to channel service.
     * @throws ConflictException
     *         The channel is unable to create due to an issue with channel resources.
     * @sample AWSMediaLive.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    CreateChannelResult createChannel(CreateChannelRequest createChannelRequest);

    /**
     * Creates a cloudwatch alarm template to dynamically generate cloudwatch metric alarms on targeted resource types.
     * 
     * @param createCloudWatchAlarmTemplateRequest
     *        Placeholder documentation for CreateCloudWatchAlarmTemplateRequest
     * @return Result of the CreateCloudWatchAlarmTemplate operation returned by the service.
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws ConflictException
     *         ConflictException 409 response
     * @sample AWSMediaLive.CreateCloudWatchAlarmTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateCloudWatchAlarmTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCloudWatchAlarmTemplateResult createCloudWatchAlarmTemplate(CreateCloudWatchAlarmTemplateRequest createCloudWatchAlarmTemplateRequest);

    /**
     * Creates a cloudwatch alarm template group to group your cloudwatch alarm templates and to attach to signal maps
     * for dynamically creating alarms.
     * 
     * @param createCloudWatchAlarmTemplateGroupRequest
     *        Placeholder documentation for CreateCloudWatchAlarmTemplateGroupRequest
     * @return Result of the CreateCloudWatchAlarmTemplateGroup operation returned by the service.
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws ConflictException
     *         ConflictException 409 response
     * @sample AWSMediaLive.CreateCloudWatchAlarmTemplateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateCloudWatchAlarmTemplateGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCloudWatchAlarmTemplateGroupResult createCloudWatchAlarmTemplateGroup(
            CreateCloudWatchAlarmTemplateGroupRequest createCloudWatchAlarmTemplateGroupRequest);

    /**
     * Creates an eventbridge rule template to monitor events and send notifications to your targeted resources.
     * 
     * @param createEventBridgeRuleTemplateRequest
     *        Placeholder documentation for CreateEventBridgeRuleTemplateRequest
     * @return Result of the CreateEventBridgeRuleTemplate operation returned by the service.
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws ConflictException
     *         ConflictException 409 response
     * @sample AWSMediaLive.CreateEventBridgeRuleTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateEventBridgeRuleTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    CreateEventBridgeRuleTemplateResult createEventBridgeRuleTemplate(CreateEventBridgeRuleTemplateRequest createEventBridgeRuleTemplateRequest);

    /**
     * Creates an eventbridge rule template group to group your eventbridge rule templates and to attach to signal maps
     * for dynamically creating notification rules.
     * 
     * @param createEventBridgeRuleTemplateGroupRequest
     *        Placeholder documentation for CreateEventBridgeRuleTemplateGroupRequest
     * @return Result of the CreateEventBridgeRuleTemplateGroup operation returned by the service.
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws ConflictException
     *         ConflictException 409 response
     * @sample AWSMediaLive.CreateEventBridgeRuleTemplateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateEventBridgeRuleTemplateGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateEventBridgeRuleTemplateGroupResult createEventBridgeRuleTemplateGroup(
            CreateEventBridgeRuleTemplateGroupRequest createEventBridgeRuleTemplateGroupRequest);

    /**
     * Create an input
     * 
     * @param createInputRequest
     *        The name of the input
     * @return Result of the CreateInput operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Limit exceeded
     * @sample AWSMediaLive.CreateInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateInput" target="_top">AWS API
     *      Documentation</a>
     */
    CreateInputResult createInput(CreateInputRequest createInputRequest);

    /**
     * Creates a Input Security Group
     * 
     * @param createInputSecurityGroupRequest
     *        The IPv4 CIDRs to whitelist for this Input Security Group
     * @return Result of the CreateInputSecurityGroup operation returned by the service.
     * @throws BadRequestException
     *         The request to create an Input Security Group was Invalid
     * @throws InternalServerErrorException
     *         Internal Server Error
     * @throws ForbiddenException
     *         The requester does not have permission to create an Input Security Group
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Limit Exceeded Error
     * @sample AWSMediaLive.CreateInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateInputSecurityGroupResult createInputSecurityGroup(CreateInputSecurityGroupRequest createInputSecurityGroupRequest);

    /**
     * Create a new multiplex.
     * 
     * @param createMultiplexRequest
     *        A request to create a multiplex.
     * @return Result of the CreateMultiplex operation returned by the service.
     * @throws BadRequestException
     *         MediaLive can't process your request because of a problem in the request. Please check your request form
     *         and syntax.
     * @throws UnprocessableEntityException
     *         The Multiplex failed validation and could not be created.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         You don't have permission to create the multiplex.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on create multiplex calls to multiplex service.
     * @throws ConflictException
     *         The multiplex is unable to create due to an issue with multiplex resources.
     * @sample AWSMediaLive.CreateMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateMultiplex" target="_top">AWS API
     *      Documentation</a>
     */
    CreateMultiplexResult createMultiplex(CreateMultiplexRequest createMultiplexRequest);

    /**
     * Create a new program in the multiplex.
     * 
     * @param createMultiplexProgramRequest
     *        A request to create a program in a multiplex.
     * @return Result of the CreateMultiplexProgram operation returned by the service.
     * @throws BadRequestException
     *         MediaLive can't process your request because of a problem in the request. Please check your request form
     *         and syntax.
     * @throws UnprocessableEntityException
     *         The Multiplex program failed validation and could not be created.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         You do not have permission to create a program.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on create multiplex program calls to multiplex service.
     * @throws ConflictException
     *         The multiplex program is unable to create due to an issue with multiplex resources.
     * @sample AWSMediaLive.CreateMultiplexProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateMultiplexProgram"
     *      target="_top">AWS API Documentation</a>
     */
    CreateMultiplexProgramResult createMultiplexProgram(CreateMultiplexProgramRequest createMultiplexProgramRequest);

    /**
     * Create a partner input
     * 
     * @param createPartnerInputRequest
     *        A request to create a partner input
     * @return Result of the CreatePartnerInput operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Limit exceeded
     * @sample AWSMediaLive.CreatePartnerInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreatePartnerInput" target="_top">AWS
     *      API Documentation</a>
     */
    CreatePartnerInputResult createPartnerInput(CreatePartnerInputRequest createPartnerInputRequest);

    /**
     * Initiates the creation of a new signal map. Will discover a new mediaResourceMap based on the provided
     * discoveryEntryPointArn.
     * 
     * @param createSignalMapRequest
     *        Placeholder documentation for CreateSignalMapRequest
     * @return Result of the CreateSignalMap operation returned by the service.
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws ConflictException
     *         ConflictException 409 response
     * @sample AWSMediaLive.CreateSignalMap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateSignalMap" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSignalMapResult createSignalMap(CreateSignalMapRequest createSignalMapRequest);

    /**
     * Create tags for a resource
     * 
     * @param createTagsRequest
     *        Placeholder documentation for CreateTagsRequest
     * @return Result of the CreateTags operation returned by the service.
     * @throws NotFoundException
     *         The arn was not found.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @sample AWSMediaLive.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateTags" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTagsResult createTags(CreateTagsRequest createTagsRequest);

    /**
     * Starts deletion of channel. The associated outputs are also deleted.
     * 
     * @param deleteChannelRequest
     *        Placeholder documentation for DeleteChannelRequest
     * @return Result of the DeleteChannel operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         You do not have permission to delete the channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The channel you're requesting to delete does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on delete channel calls to channel service.
     * @throws ConflictException
     *         The channel is unable to delete due to an issue with channel resources.
     * @sample AWSMediaLive.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteChannel" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteChannelResult deleteChannel(DeleteChannelRequest deleteChannelRequest);

    /**
     * Deletes a cloudwatch alarm template.
     * 
     * @param deleteCloudWatchAlarmTemplateRequest
     *        Placeholder documentation for DeleteCloudWatchAlarmTemplateRequest
     * @return Result of the DeleteCloudWatchAlarmTemplate operation returned by the service.
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws ConflictException
     *         ConflictException 409 response
     * @sample AWSMediaLive.DeleteCloudWatchAlarmTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteCloudWatchAlarmTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCloudWatchAlarmTemplateResult deleteCloudWatchAlarmTemplate(DeleteCloudWatchAlarmTemplateRequest deleteCloudWatchAlarmTemplateRequest);

    /**
     * Deletes a cloudwatch alarm template group. You must detach this group from all signal maps and ensure its
     * existing templates are moved to another group or deleted.
     * 
     * @param deleteCloudWatchAlarmTemplateGroupRequest
     *        Placeholder documentation for DeleteCloudWatchAlarmTemplateGroupRequest
     * @return Result of the DeleteCloudWatchAlarmTemplateGroup operation returned by the service.
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws ConflictException
     *         ConflictException 409 response
     * @sample AWSMediaLive.DeleteCloudWatchAlarmTemplateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteCloudWatchAlarmTemplateGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCloudWatchAlarmTemplateGroupResult deleteCloudWatchAlarmTemplateGroup(
            DeleteCloudWatchAlarmTemplateGroupRequest deleteCloudWatchAlarmTemplateGroupRequest);

    /**
     * Deletes an eventbridge rule template.
     * 
     * @param deleteEventBridgeRuleTemplateRequest
     *        Placeholder documentation for DeleteEventBridgeRuleTemplateRequest
     * @return Result of the DeleteEventBridgeRuleTemplate operation returned by the service.
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws ConflictException
     *         ConflictException 409 response
     * @sample AWSMediaLive.DeleteEventBridgeRuleTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteEventBridgeRuleTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEventBridgeRuleTemplateResult deleteEventBridgeRuleTemplate(DeleteEventBridgeRuleTemplateRequest deleteEventBridgeRuleTemplateRequest);

    /**
     * Deletes an eventbridge rule template group. You must detach this group from all signal maps and ensure its
     * existing templates are moved to another group or deleted.
     * 
     * @param deleteEventBridgeRuleTemplateGroupRequest
     *        Placeholder documentation for DeleteEventBridgeRuleTemplateGroupRequest
     * @return Result of the DeleteEventBridgeRuleTemplateGroup operation returned by the service.
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws ConflictException
     *         ConflictException 409 response
     * @sample AWSMediaLive.DeleteEventBridgeRuleTemplateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteEventBridgeRuleTemplateGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEventBridgeRuleTemplateGroupResult deleteEventBridgeRuleTemplateGroup(
            DeleteEventBridgeRuleTemplateGroupRequest deleteEventBridgeRuleTemplateGroupRequest);

    /**
     * Deletes the input end point
     * 
     * @param deleteInputRequest
     *        Placeholder documentation for DeleteInputRequest
     * @return Result of the DeleteInput operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         Input not found
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Limit exceeded
     * @throws ConflictException
     *         Resource conflict
     * @sample AWSMediaLive.DeleteInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteInput" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteInputResult deleteInput(DeleteInputRequest deleteInputRequest);

    /**
     * Deletes an Input Security Group
     * 
     * @param deleteInputSecurityGroupRequest
     *        Placeholder documentation for DeleteInputSecurityGroupRequest
     * @return Result of the DeleteInputSecurityGroup operation returned by the service.
     * @throws BadRequestException
     *         The request to delete the Input Security Group was Invalid
     * @throws InternalServerErrorException
     *         Internal Server Error
     * @throws ForbiddenException
     *         The requester does not have permission to delete this Input Security Group
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         Input Security Group not found
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Limit Exceeded Error
     * @sample AWSMediaLive.DeleteInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteInputSecurityGroupResult deleteInputSecurityGroup(DeleteInputSecurityGroupRequest deleteInputSecurityGroupRequest);

    /**
     * Delete a multiplex. The multiplex must be idle.
     * 
     * @param deleteMultiplexRequest
     *        Placeholder documentation for DeleteMultiplexRequest
     * @return Result of the DeleteMultiplex operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         You don't have permission to delete the multiplex.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The multiplex that you are trying to delete doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on delete multiplex calls to multiplex service.
     * @throws ConflictException
     *         The multiplex is unable to delete due to an issue with multiplex resources.
     * @sample AWSMediaLive.DeleteMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteMultiplex" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteMultiplexResult deleteMultiplex(DeleteMultiplexRequest deleteMultiplexRequest);

    /**
     * Delete a program from a multiplex.
     * 
     * @param deleteMultiplexProgramRequest
     *        Placeholder documentation for DeleteMultiplexProgramRequest
     * @return Result of the DeleteMultiplexProgram operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         You don't have permission to delete the multiplex program.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The program that you are trying to delete doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on delete multiplex program calls to multiplex service.
     * @throws ConflictException
     *         The multiplex program is unable to delete due to an issue with multiplex resources.
     * @sample AWSMediaLive.DeleteMultiplexProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteMultiplexProgram"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteMultiplexProgramResult deleteMultiplexProgram(DeleteMultiplexProgramRequest deleteMultiplexProgramRequest);

    /**
     * Delete an expired reservation.
     * 
     * @param deleteReservationRequest
     *        Placeholder documentation for DeleteReservationRequest
     * @return Result of the DeleteReservation operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to delete reservation
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws NotFoundException
     *         Reservation you're attempting to delete does not exist
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on delete reservation request
     * @throws ConflictException
     *         The reservation could not be deleted because it is currently active.
     * @sample AWSMediaLive.DeleteReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteReservation" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteReservationResult deleteReservation(DeleteReservationRequest deleteReservationRequest);

    /**
     * Delete all schedule actions on a channel.
     * 
     * @param deleteScheduleRequest
     *        Placeholder documentation for DeleteScheduleRequest
     * @return Result of the DeleteSchedule operation returned by the service.
     * @throws BadRequestException
     *         This request to delete the schedule on this channel was invalid.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         You do not have permission to delete the channel schedule.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The specified channel does not exist to have its schedule deleted.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on delete schedule calls.
     * @sample AWSMediaLive.DeleteSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteScheduleResult deleteSchedule(DeleteScheduleRequest deleteScheduleRequest);

    /**
     * Deletes the specified signal map.
     * 
     * @param deleteSignalMapRequest
     *        Placeholder documentation for DeleteSignalMapRequest
     * @return Result of the DeleteSignalMap operation returned by the service.
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws ConflictException
     *         ConflictException 409 response
     * @sample AWSMediaLive.DeleteSignalMap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteSignalMap" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSignalMapResult deleteSignalMap(DeleteSignalMapRequest deleteSignalMapRequest);

    /**
     * Removes tags for a resource
     * 
     * @param deleteTagsRequest
     *        Placeholder documentation for DeleteTagsRequest
     * @return Result of the DeleteTags operation returned by the service.
     * @throws NotFoundException
     *         The arn was not found.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @sample AWSMediaLive.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTagsResult deleteTags(DeleteTagsRequest deleteTagsRequest);

    /**
     * Describe account configuration
     * 
     * @param describeAccountConfigurationRequest
     *        Placeholder documentation for DescribeAccountConfigurationRequest
     * @return Result of the DescribeAccountConfiguration operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         You do not have permission to describe the account configuration.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe account configuration calls.
     * @sample AWSMediaLive.DescribeAccountConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeAccountConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAccountConfigurationResult describeAccountConfiguration(DescribeAccountConfigurationRequest describeAccountConfigurationRequest);

    /**
     * Gets details about a channel
     * 
     * @param describeChannelRequest
     *        Placeholder documentation for DescribeChannelRequest
     * @return Result of the DescribeChannel operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         You do not have permission to describe the channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The channel you're requesting to describe does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe channel calls to channel service.
     * @sample AWSMediaLive.DescribeChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeChannel" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeChannelResult describeChannel(DescribeChannelRequest describeChannelRequest);

    /**
     * Produces details about an input
     * 
     * @param describeInputRequest
     *        Placeholder documentation for DescribeInputRequest
     * @return Result of the DescribeInput operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         Input not found
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Limit exceeded
     * @sample AWSMediaLive.DescribeInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInput" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeInputResult describeInput(DescribeInputRequest describeInputRequest);

    /**
     * Gets the details for the input device
     * 
     * @param describeInputDeviceRequest
     *        Placeholder documentation for DescribeInputDeviceRequest
     * @return Result of the DescribeInputDevice operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to describe the input device.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws NotFoundException
     *         The input device you're requesting to describe does not exist. Check the ID.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe calls to the input device service.
     * @sample AWSMediaLive.DescribeInputDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInputDevice" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeInputDeviceResult describeInputDevice(DescribeInputDeviceRequest describeInputDeviceRequest);

    /**
     * Get the latest thumbnail data for the input device.
     * 
     * @param describeInputDeviceThumbnailRequest
     *        Placeholder documentation for DescribeInputDeviceThumbnailRequest
     * @return Result of the DescribeInputDeviceThumbnail operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to describe input device thumbnail.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws NotFoundException
     *         Input device not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on get thumbnail calls to the input device service.
     * @sample AWSMediaLive.DescribeInputDeviceThumbnail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInputDeviceThumbnail"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeInputDeviceThumbnailResult describeInputDeviceThumbnail(DescribeInputDeviceThumbnailRequest describeInputDeviceThumbnailRequest);

    /**
     * Produces a summary of an Input Security Group
     * 
     * @param describeInputSecurityGroupRequest
     *        Placeholder documentation for DescribeInputSecurityGroupRequest
     * @return Result of the DescribeInputSecurityGroup operation returned by the service.
     * @throws BadRequestException
     *         The request to describe an Input Security Group was Invalid
     * @throws InternalServerErrorException
     *         Internal Server Error
     * @throws ForbiddenException
     *         The requester does not have permission to describe this Input Security Group
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         Input Security Group not found
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Limit Exceeded Error
     * @sample AWSMediaLive.DescribeInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeInputSecurityGroupResult describeInputSecurityGroup(DescribeInputSecurityGroupRequest describeInputSecurityGroupRequest);

    /**
     * Gets details about a multiplex.
     * 
     * @param describeMultiplexRequest
     *        Placeholder documentation for DescribeMultiplexRequest
     * @return Result of the DescribeMultiplex operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         You don't have permission to describe the multiplex.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The multiplex that you are trying to describe doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe multiplex calls to multiplex service.
     * @sample AWSMediaLive.DescribeMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeMultiplex" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeMultiplexResult describeMultiplex(DescribeMultiplexRequest describeMultiplexRequest);

    /**
     * Get the details for a program in a multiplex.
     * 
     * @param describeMultiplexProgramRequest
     *        Placeholder documentation for DescribeMultiplexProgramRequest
     * @return Result of the DescribeMultiplexProgram operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         You don't have permission to describe the multiplex program.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         MediaLive can't describe the program. The multiplex or the program that you specified doesn’t exist.
     *         Check the IDs and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe multiplex program calls to multiplex service.
     * @sample AWSMediaLive.DescribeMultiplexProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeMultiplexProgram"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeMultiplexProgramResult describeMultiplexProgram(DescribeMultiplexProgramRequest describeMultiplexProgramRequest);

    /**
     * Get details for an offering.
     * 
     * @param describeOfferingRequest
     *        Placeholder documentation for DescribeOfferingRequest
     * @return Result of the DescribeOffering operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to describe offering
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws NotFoundException
     *         Offering you're attempting to describe does not exist
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe offering request
     * @sample AWSMediaLive.DescribeOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeOffering" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeOfferingResult describeOffering(DescribeOfferingRequest describeOfferingRequest);

    /**
     * Get details for a reservation.
     * 
     * @param describeReservationRequest
     *        Placeholder documentation for DescribeReservationRequest
     * @return Result of the DescribeReservation operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to describe reservation
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws NotFoundException
     *         Reservation you're attempting to describe does not exist
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe reservation request
     * @sample AWSMediaLive.DescribeReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeReservation" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeReservationResult describeReservation(DescribeReservationRequest describeReservationRequest);

    /**
     * Get a channel schedule
     * 
     * @param describeScheduleRequest
     *        Placeholder documentation for DescribeScheduleRequest
     * @return Result of the DescribeSchedule operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         You do not have permission to describe the channel schedule.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The channel you're requesting a schedule describe for does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe schedule calls.
     * @sample AWSMediaLive.DescribeSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeScheduleResult describeSchedule(DescribeScheduleRequest describeScheduleRequest);

    /**
     * Describe the latest thumbnails data.
     * 
     * @param describeThumbnailsRequest
     *        Placeholder documentation for DescribeThumbnailsRequest
     * @return Result of the DescribeThumbnails operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Internal service error.
     * @throws ForbiddenException
     *         You do not have permission to describe thumbnails.
     * @throws BadGatewayException
     *         Bad Gateway error.
     * @throws NotFoundException
     *         There are no thumbnails for this channel.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe thumbnails calls to channel service.
     * @throws ConflictException
     *         Service do not have permission to customer's KMS key.
     * @sample AWSMediaLive.DescribeThumbnails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeThumbnails" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeThumbnailsResult describeThumbnails(DescribeThumbnailsRequest describeThumbnailsRequest);

    /**
     * Retrieves the specified cloudwatch alarm template.
     * 
     * @param getCloudWatchAlarmTemplateRequest
     *        Placeholder documentation for GetCloudWatchAlarmTemplateRequest
     * @return Result of the GetCloudWatchAlarmTemplate operation returned by the service.
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @sample AWSMediaLive.GetCloudWatchAlarmTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/GetCloudWatchAlarmTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    GetCloudWatchAlarmTemplateResult getCloudWatchAlarmTemplate(GetCloudWatchAlarmTemplateRequest getCloudWatchAlarmTemplateRequest);

    /**
     * Retrieves the specified cloudwatch alarm template group.
     * 
     * @param getCloudWatchAlarmTemplateGroupRequest
     *        Placeholder documentation for GetCloudWatchAlarmTemplateGroupRequest
     * @return Result of the GetCloudWatchAlarmTemplateGroup operation returned by the service.
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @sample AWSMediaLive.GetCloudWatchAlarmTemplateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/GetCloudWatchAlarmTemplateGroup"
     *      target="_top">AWS API Documentation</a>
     */
    GetCloudWatchAlarmTemplateGroupResult getCloudWatchAlarmTemplateGroup(GetCloudWatchAlarmTemplateGroupRequest getCloudWatchAlarmTemplateGroupRequest);

    /**
     * Retrieves the specified eventbridge rule template.
     * 
     * @param getEventBridgeRuleTemplateRequest
     *        Placeholder documentation for GetEventBridgeRuleTemplateRequest
     * @return Result of the GetEventBridgeRuleTemplate operation returned by the service.
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @sample AWSMediaLive.GetEventBridgeRuleTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/GetEventBridgeRuleTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    GetEventBridgeRuleTemplateResult getEventBridgeRuleTemplate(GetEventBridgeRuleTemplateRequest getEventBridgeRuleTemplateRequest);

    /**
     * Retrieves the specified eventbridge rule template group.
     * 
     * @param getEventBridgeRuleTemplateGroupRequest
     *        Placeholder documentation for GetEventBridgeRuleTemplateGroupRequest
     * @return Result of the GetEventBridgeRuleTemplateGroup operation returned by the service.
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @sample AWSMediaLive.GetEventBridgeRuleTemplateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/GetEventBridgeRuleTemplateGroup"
     *      target="_top">AWS API Documentation</a>
     */
    GetEventBridgeRuleTemplateGroupResult getEventBridgeRuleTemplateGroup(GetEventBridgeRuleTemplateGroupRequest getEventBridgeRuleTemplateGroupRequest);

    /**
     * Retrieves the specified signal map.
     * 
     * @param getSignalMapRequest
     *        Placeholder documentation for GetSignalMapRequest
     * @return Result of the GetSignalMap operation returned by the service.
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @sample AWSMediaLive.GetSignalMap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/GetSignalMap" target="_top">AWS API
     *      Documentation</a>
     */
    GetSignalMapResult getSignalMap(GetSignalMapRequest getSignalMapRequest);

    /**
     * Produces list of channels that have been created
     * 
     * @param listChannelsRequest
     *        Placeholder documentation for ListChannelsRequest
     * @return Result of the ListChannels operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         You do not have permission to list channels.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on list channel calls to channel service.
     * @sample AWSMediaLive.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListChannels" target="_top">AWS API
     *      Documentation</a>
     */
    ListChannelsResult listChannels(ListChannelsRequest listChannelsRequest);

    /**
     * Lists cloudwatch alarm template groups.
     * 
     * @param listCloudWatchAlarmTemplateGroupsRequest
     *        Placeholder documentation for ListCloudWatchAlarmTemplateGroupsRequest
     * @return Result of the ListCloudWatchAlarmTemplateGroups operation returned by the service.
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @sample AWSMediaLive.ListCloudWatchAlarmTemplateGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListCloudWatchAlarmTemplateGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListCloudWatchAlarmTemplateGroupsResult listCloudWatchAlarmTemplateGroups(ListCloudWatchAlarmTemplateGroupsRequest listCloudWatchAlarmTemplateGroupsRequest);

    /**
     * Lists cloudwatch alarm templates.
     * 
     * @param listCloudWatchAlarmTemplatesRequest
     *        Placeholder documentation for ListCloudWatchAlarmTemplatesRequest
     * @return Result of the ListCloudWatchAlarmTemplates operation returned by the service.
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @sample AWSMediaLive.ListCloudWatchAlarmTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListCloudWatchAlarmTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    ListCloudWatchAlarmTemplatesResult listCloudWatchAlarmTemplates(ListCloudWatchAlarmTemplatesRequest listCloudWatchAlarmTemplatesRequest);

    /**
     * Lists eventbridge rule template groups.
     * 
     * @param listEventBridgeRuleTemplateGroupsRequest
     *        Placeholder documentation for ListEventBridgeRuleTemplateGroupsRequest
     * @return Result of the ListEventBridgeRuleTemplateGroups operation returned by the service.
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @sample AWSMediaLive.ListEventBridgeRuleTemplateGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListEventBridgeRuleTemplateGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListEventBridgeRuleTemplateGroupsResult listEventBridgeRuleTemplateGroups(ListEventBridgeRuleTemplateGroupsRequest listEventBridgeRuleTemplateGroupsRequest);

    /**
     * Lists eventbridge rule templates.
     * 
     * @param listEventBridgeRuleTemplatesRequest
     *        Placeholder documentation for ListEventBridgeRuleTemplatesRequest
     * @return Result of the ListEventBridgeRuleTemplates operation returned by the service.
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @sample AWSMediaLive.ListEventBridgeRuleTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListEventBridgeRuleTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    ListEventBridgeRuleTemplatesResult listEventBridgeRuleTemplates(ListEventBridgeRuleTemplatesRequest listEventBridgeRuleTemplatesRequest);

    /**
     * List input devices that are currently being transferred. List input devices that you are transferring from your
     * AWS account or input devices that another AWS account is transferring to you.
     * 
     * @param listInputDeviceTransfersRequest
     *        Placeholder documentation for ListInputDeviceTransfersRequest
     * @return Result of the ListInputDeviceTransfers operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         Transfer operation failed, input could not be validated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to list transferring devices.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on list devices calls to the input device service.
     * @sample AWSMediaLive.ListInputDeviceTransfers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputDeviceTransfers"
     *      target="_top">AWS API Documentation</a>
     */
    ListInputDeviceTransfersResult listInputDeviceTransfers(ListInputDeviceTransfersRequest listInputDeviceTransfersRequest);

    /**
     * List input devices
     * 
     * @param listInputDevicesRequest
     *        Placeholder documentation for ListInputDevicesRequest
     * @return Result of the ListInputDevices operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to list input devices.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on list devices calls to the input device service.
     * @sample AWSMediaLive.ListInputDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputDevices" target="_top">AWS API
     *      Documentation</a>
     */
    ListInputDevicesResult listInputDevices(ListInputDevicesRequest listInputDevicesRequest);

    /**
     * Produces a list of Input Security Groups for an account
     * 
     * @param listInputSecurityGroupsRequest
     *        Placeholder documentation for ListInputSecurityGroupsRequest
     * @return Result of the ListInputSecurityGroups operation returned by the service.
     * @throws BadRequestException
     *         The request to list Input Security Groups was invalid
     * @throws InternalServerErrorException
     *         Internal Server Error
     * @throws ForbiddenException
     *         The requester does not have permission to call ListInputSecurityGroups
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Limit Exceeded Error
     * @sample AWSMediaLive.ListInputSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListInputSecurityGroupsResult listInputSecurityGroups(ListInputSecurityGroupsRequest listInputSecurityGroupsRequest);

    /**
     * Produces list of inputs that have been created
     * 
     * @param listInputsRequest
     *        Placeholder documentation for ListInputsRequest
     * @return Result of the ListInputs operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Limit exceeded
     * @sample AWSMediaLive.ListInputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputs" target="_top">AWS API
     *      Documentation</a>
     */
    ListInputsResult listInputs(ListInputsRequest listInputsRequest);

    /**
     * List the programs that currently exist for a specific multiplex.
     * 
     * @param listMultiplexProgramsRequest
     *        Placeholder documentation for ListMultiplexProgramsRequest
     * @return Result of the ListMultiplexPrograms operation returned by the service.
     * @throws BadRequestException
     *         MediaLive can't process your request because of a problem in the request. Please check your request form
     *         and syntax.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         You do not have permission to list multiplex programs.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         MediaLive can't provide the list of programs. The multiplex that you specified doesn’t exist. Check the
     *         ID and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on list multiplex calls to multiplex service.
     * @sample AWSMediaLive.ListMultiplexPrograms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListMultiplexPrograms"
     *      target="_top">AWS API Documentation</a>
     */
    ListMultiplexProgramsResult listMultiplexPrograms(ListMultiplexProgramsRequest listMultiplexProgramsRequest);

    /**
     * Retrieve a list of the existing multiplexes.
     * 
     * @param listMultiplexesRequest
     *        Placeholder documentation for ListMultiplexesRequest
     * @return Result of the ListMultiplexes operation returned by the service.
     * @throws BadRequestException
     *         MediaLive can't process your request because of a problem in the request. Please check your request form
     *         and syntax.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         You don't have permission to list multiplexes.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on list multiplex calls to multiplex service.
     * @sample AWSMediaLive.ListMultiplexes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListMultiplexes" target="_top">AWS API
     *      Documentation</a>
     */
    ListMultiplexesResult listMultiplexes(ListMultiplexesRequest listMultiplexesRequest);

    /**
     * List offerings available for purchase.
     * 
     * @param listOfferingsRequest
     *        Placeholder documentation for ListOfferingsRequest
     * @return Result of the ListOfferings operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to list offerings
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on list offerings request
     * @sample AWSMediaLive.ListOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListOfferings" target="_top">AWS API
     *      Documentation</a>
     */
    ListOfferingsResult listOfferings(ListOfferingsRequest listOfferingsRequest);

    /**
     * List purchased reservations.
     * 
     * @param listReservationsRequest
     *        Placeholder documentation for ListReservationsRequest
     * @return Result of the ListReservations operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to list reservations
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on list reservations request
     * @sample AWSMediaLive.ListReservations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListReservations" target="_top">AWS API
     *      Documentation</a>
     */
    ListReservationsResult listReservations(ListReservationsRequest listReservationsRequest);

    /**
     * Lists signal maps.
     * 
     * @param listSignalMapsRequest
     *        Placeholder documentation for ListSignalMapsRequest
     * @return Result of the ListSignalMaps operation returned by the service.
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @sample AWSMediaLive.ListSignalMaps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListSignalMaps" target="_top">AWS API
     *      Documentation</a>
     */
    ListSignalMapsResult listSignalMaps(ListSignalMapsRequest listSignalMapsRequest);

    /**
     * Produces list of tags that have been created for a resource
     * 
     * @param listTagsForResourceRequest
     *        Placeholder documentation for ListTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws NotFoundException
     *         The arn was not found
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @sample AWSMediaLive.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * Purchase an offering and create a reservation.
     * 
     * @param purchaseOfferingRequest
     *        Placeholder documentation for PurchaseOfferingRequest
     * @return Result of the PurchaseOffering operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to purchase the offering
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws NotFoundException
     *         Offering you're attempting to purchase does not exist
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on purchase offering request
     * @throws ConflictException
     *         Offering purchase prevented by service resource issue
     * @sample AWSMediaLive.PurchaseOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/PurchaseOffering" target="_top">AWS API
     *      Documentation</a>
     */
    PurchaseOfferingResult purchaseOffering(PurchaseOfferingRequest purchaseOfferingRequest);

    /**
     * Send a reboot command to the specified input device. The device will begin rebooting within a few seconds of
     * sending the command. When the reboot is complete, the device’s connection status will change to connected.
     * 
     * @param rebootInputDeviceRequest
     *        A request to reboot an AWS Elemental device.
     * @return Result of the RebootInputDevice operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         Reboot operation failed, input could not be validated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to reboot input device.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws NotFoundException
     *         Input device not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on reboot device calls to the input device service.
     * @sample AWSMediaLive.RebootInputDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/RebootInputDevice" target="_top">AWS
     *      API Documentation</a>
     */
    RebootInputDeviceResult rebootInputDevice(RebootInputDeviceRequest rebootInputDeviceRequest);

    /**
     * Reject the transfer of the specified input device to your AWS account.
     * 
     * @param rejectInputDeviceTransferRequest
     *        Placeholder documentation for RejectInputDeviceTransferRequest
     * @return Result of the RejectInputDeviceTransfer operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         Transfer operation failed, input could not be validated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to reject input device transfers.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws NotFoundException
     *         Input device not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on transfer device calls to the input device service.
     * @throws ConflictException
     *         Input device transfer could not be rejected.
     * @sample AWSMediaLive.RejectInputDeviceTransfer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/RejectInputDeviceTransfer"
     *      target="_top">AWS API Documentation</a>
     */
    RejectInputDeviceTransferResult rejectInputDeviceTransfer(RejectInputDeviceTransferRequest rejectInputDeviceTransferRequest);

    /**
     * Restart pipelines in one channel that is currently running.
     * 
     * @param restartChannelPipelinesRequest
     *        Pipelines to restart.
     * @return Result of the RestartChannelPipelines operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Verify that the syntax is
     *         correct.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials that you sent.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The channel or pipeline you specified doesn't exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service could not complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaLive.RestartChannelPipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/RestartChannelPipelines"
     *      target="_top">AWS API Documentation</a>
     */
    RestartChannelPipelinesResult restartChannelPipelines(RestartChannelPipelinesRequest restartChannelPipelinesRequest);

    /**
     * Starts an existing channel
     * 
     * @param startChannelRequest
     *        Placeholder documentation for StartChannelRequest
     * @return Result of the StartChannel operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         You do not have permission to start the channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The channel you're requesting to start does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on start channel calls to channel service.
     * @throws ConflictException
     *         The channel is unable to start due to an issue with channel resources.
     * @sample AWSMediaLive.StartChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StartChannel" target="_top">AWS API
     *      Documentation</a>
     */
    StartChannelResult startChannel(StartChannelRequest startChannelRequest);

    /**
     * Initiates a deployment to delete the monitor of the specified signal map.
     * 
     * @param startDeleteMonitorDeploymentRequest
     *        Placeholder documentation for StartDeleteMonitorDeploymentRequest
     * @return Result of the StartDeleteMonitorDeployment operation returned by the service.
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws ConflictException
     *         ConflictException 409 response
     * @sample AWSMediaLive.StartDeleteMonitorDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StartDeleteMonitorDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    StartDeleteMonitorDeploymentResult startDeleteMonitorDeployment(StartDeleteMonitorDeploymentRequest startDeleteMonitorDeploymentRequest);

    /**
     * Start an input device that is attached to a MediaConnect flow. (There is no need to start a device that is
     * attached to a MediaLive input; MediaLive starts the device when the channel starts.)
     * 
     * @param startInputDeviceRequest
     *        Placeholder documentation for StartInputDeviceRequest
     * @return Result of the StartInputDevice operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         Start operation failed, input could not be validated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to start the input device.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws NotFoundException
     *         Input device not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on start device calls to the input device service.
     * @sample AWSMediaLive.StartInputDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StartInputDevice" target="_top">AWS API
     *      Documentation</a>
     */
    StartInputDeviceResult startInputDevice(StartInputDeviceRequest startInputDeviceRequest);

    /**
     * Start a maintenance window for the specified input device. Starting a maintenance window will give the device up
     * to two hours to install software. If the device was streaming prior to the maintenance, it will resume streaming
     * when the software is fully installed. Devices automatically install updates while they are powered on and their
     * MediaLive channels are stopped. A maintenance window allows you to update a device without having to stop
     * MediaLive channels that use the device. The device must remain powered on and connected to the internet for the
     * duration of the maintenance.
     * 
     * @param startInputDeviceMaintenanceWindowRequest
     *        Placeholder documentation for StartInputDeviceMaintenanceWindowRequest
     * @return Result of the StartInputDeviceMaintenanceWindow operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         Start maintenance window operation failed, input could not be validated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to start a maintenance window for this input device.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws NotFoundException
     *         Input device not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on start maintenance window calls to the input device service.
     * @sample AWSMediaLive.StartInputDeviceMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StartInputDeviceMaintenanceWindow"
     *      target="_top">AWS API Documentation</a>
     */
    StartInputDeviceMaintenanceWindowResult startInputDeviceMaintenanceWindow(StartInputDeviceMaintenanceWindowRequest startInputDeviceMaintenanceWindowRequest);

    /**
     * Initiates a deployment to deploy the latest monitor of the specified signal map.
     * 
     * @param startMonitorDeploymentRequest
     *        Placeholder documentation for StartMonitorDeploymentRequest
     * @return Result of the StartMonitorDeployment operation returned by the service.
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws ConflictException
     *         ConflictException 409 response
     * @sample AWSMediaLive.StartMonitorDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StartMonitorDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    StartMonitorDeploymentResult startMonitorDeployment(StartMonitorDeploymentRequest startMonitorDeploymentRequest);

    /**
     * Start (run) the multiplex. Starting the multiplex does not start the channels. You must explicitly start each
     * channel.
     * 
     * @param startMultiplexRequest
     *        Placeholder documentation for StartMultiplexRequest
     * @return Result of the StartMultiplex operation returned by the service.
     * @throws BadRequestException
     *         MediaLive can't process your request because of a problem in the request. Please check your request form
     *         and syntax.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         You don't have permission to start the multiplex.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The multiplex that you are trying to start doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on start multiplex calls to multiplex service.
     * @throws ConflictException
     *         The multiplex is unable to start due to an issue with multiplex resources.
     * @sample AWSMediaLive.StartMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StartMultiplex" target="_top">AWS API
     *      Documentation</a>
     */
    StartMultiplexResult startMultiplex(StartMultiplexRequest startMultiplexRequest);

    /**
     * Initiates an update for the specified signal map. Will discover a new signal map if a changed
     * discoveryEntryPointArn is provided.
     * 
     * @param startUpdateSignalMapRequest
     *        Placeholder documentation for StartUpdateSignalMapRequest
     * @return Result of the StartUpdateSignalMap operation returned by the service.
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws ConflictException
     *         ConflictException 409 response
     * @sample AWSMediaLive.StartUpdateSignalMap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StartUpdateSignalMap" target="_top">AWS
     *      API Documentation</a>
     */
    StartUpdateSignalMapResult startUpdateSignalMap(StartUpdateSignalMapRequest startUpdateSignalMapRequest);

    /**
     * Stops a running channel
     * 
     * @param stopChannelRequest
     *        Placeholder documentation for StopChannelRequest
     * @return Result of the StopChannel operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         You do not have permission to stop the channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The channel you're requesting to stop does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on stop channel calls to channel service.
     * @throws ConflictException
     *         The channel is unable to stop due to an issue with channel resources.
     * @sample AWSMediaLive.StopChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StopChannel" target="_top">AWS API
     *      Documentation</a>
     */
    StopChannelResult stopChannel(StopChannelRequest stopChannelRequest);

    /**
     * Stop an input device that is attached to a MediaConnect flow. (There is no need to stop a device that is attached
     * to a MediaLive input; MediaLive automatically stops the device when the channel stops.)
     * 
     * @param stopInputDeviceRequest
     *        Placeholder documentation for StopInputDeviceRequest
     * @return Result of the StopInputDevice operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         Start operation failed, input could not be validated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to stop the input device.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws NotFoundException
     *         Input device not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on stop device calls to the input device service.
     * @sample AWSMediaLive.StopInputDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StopInputDevice" target="_top">AWS API
     *      Documentation</a>
     */
    StopInputDeviceResult stopInputDevice(StopInputDeviceRequest stopInputDeviceRequest);

    /**
     * Stops a running multiplex. If the multiplex isn't running, this action has no effect.
     * 
     * @param stopMultiplexRequest
     *        Placeholder documentation for StopMultiplexRequest
     * @return Result of the StopMultiplex operation returned by the service.
     * @throws BadRequestException
     *         MediaLive can't process your request because of a problem in the request. Please check your request form
     *         and syntax.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         You don't have permission to stop the multiplex.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The multiplex that you are trying to stop doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on stop multiplex calls to multiplex service.
     * @throws ConflictException
     *         The multiplex is unable to stop due to an issue with multiplex resources.
     * @sample AWSMediaLive.StopMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StopMultiplex" target="_top">AWS API
     *      Documentation</a>
     */
    StopMultiplexResult stopMultiplex(StopMultiplexRequest stopMultiplexRequest);

    /**
     * Start an input device transfer to another AWS account. After you make the request, the other account must accept
     * or reject the transfer.
     * 
     * @param transferInputDeviceRequest
     *        A request to transfer an input device.
     * @return Result of the TransferInputDevice operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         Transfer operation failed, input could not be validated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to transfer input devices.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws NotFoundException
     *         Input device not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on transfer device calls to the input device service.
     * @throws ConflictException
     *         Input device could not be transferred.
     * @sample AWSMediaLive.TransferInputDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/TransferInputDevice" target="_top">AWS
     *      API Documentation</a>
     */
    TransferInputDeviceResult transferInputDevice(TransferInputDeviceRequest transferInputDeviceRequest);

    /**
     * Update account configuration
     * 
     * @param updateAccountConfigurationRequest
     *        List of account configuration parameters to update.
     * @return Result of the UpdateAccountConfiguration operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         The update account configuration request failed validation.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         You do not have permission to update the account's configuration.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on update account configuration calls.
     * @sample AWSMediaLive.UpdateAccountConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateAccountConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAccountConfigurationResult updateAccountConfiguration(UpdateAccountConfigurationRequest updateAccountConfigurationRequest);

    /**
     * Updates a channel.
     * 
     * @param updateChannelRequest
     *        A request to update a channel.
     * @return Result of the UpdateChannel operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         The channel configuration failed validation and could not be updated.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         You do not have permission to update the channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws ConflictException
     *         The channel is unable to update due to an issue with channel resources.
     * @sample AWSMediaLive.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateChannelResult updateChannel(UpdateChannelRequest updateChannelRequest);

    /**
     * Changes the class of the channel.
     * 
     * @param updateChannelClassRequest
     *        Channel class that the channel should be updated to.
     * @return Result of the UpdateChannelClass operation returned by the service.
     * @throws BadRequestException
     *         This request to update the channel class was invalid.
     * @throws UnprocessableEntityException
     *         The channel configuration failed validation when attempting to update the channel class.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         You do not have permission to update the class of this channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The channel you're trying to update the class on does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on update channel class calls.
     * @throws ConflictException
     *         The channel class cannot be updated due to an issue with channel resources.
     * @sample AWSMediaLive.UpdateChannelClass
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateChannelClass" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateChannelClassResult updateChannelClass(UpdateChannelClassRequest updateChannelClassRequest);

    /**
     * Updates the specified cloudwatch alarm template.
     * 
     * @param updateCloudWatchAlarmTemplateRequest
     *        Placeholder documentation for UpdateCloudWatchAlarmTemplateRequest
     * @return Result of the UpdateCloudWatchAlarmTemplate operation returned by the service.
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws ConflictException
     *         ConflictException 409 response
     * @sample AWSMediaLive.UpdateCloudWatchAlarmTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateCloudWatchAlarmTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateCloudWatchAlarmTemplateResult updateCloudWatchAlarmTemplate(UpdateCloudWatchAlarmTemplateRequest updateCloudWatchAlarmTemplateRequest);

    /**
     * Updates the specified cloudwatch alarm template group.
     * 
     * @param updateCloudWatchAlarmTemplateGroupRequest
     *        Placeholder documentation for UpdateCloudWatchAlarmTemplateGroupRequest
     * @return Result of the UpdateCloudWatchAlarmTemplateGroup operation returned by the service.
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws ConflictException
     *         ConflictException 409 response
     * @sample AWSMediaLive.UpdateCloudWatchAlarmTemplateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateCloudWatchAlarmTemplateGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateCloudWatchAlarmTemplateGroupResult updateCloudWatchAlarmTemplateGroup(
            UpdateCloudWatchAlarmTemplateGroupRequest updateCloudWatchAlarmTemplateGroupRequest);

    /**
     * Updates the specified eventbridge rule template.
     * 
     * @param updateEventBridgeRuleTemplateRequest
     *        Placeholder documentation for UpdateEventBridgeRuleTemplateRequest
     * @return Result of the UpdateEventBridgeRuleTemplate operation returned by the service.
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws ConflictException
     *         ConflictException 409 response
     * @sample AWSMediaLive.UpdateEventBridgeRuleTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateEventBridgeRuleTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateEventBridgeRuleTemplateResult updateEventBridgeRuleTemplate(UpdateEventBridgeRuleTemplateRequest updateEventBridgeRuleTemplateRequest);

    /**
     * Updates the specified eventbridge rule template group.
     * 
     * @param updateEventBridgeRuleTemplateGroupRequest
     *        Placeholder documentation for UpdateEventBridgeRuleTemplateGroupRequest
     * @return Result of the UpdateEventBridgeRuleTemplateGroup operation returned by the service.
     * @throws BadRequestException
     *         BadRequestException 400 response
     * @throws InternalServerErrorException
     *         InternalServerErrorException 500 response
     * @throws ForbiddenException
     *         ForbiddenException 403 response
     * @throws NotFoundException
     *         NotFoundException 404 response
     * @throws TooManyRequestsException
     *         TooManyRequestsException 429 response
     * @throws ConflictException
     *         ConflictException 409 response
     * @sample AWSMediaLive.UpdateEventBridgeRuleTemplateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateEventBridgeRuleTemplateGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateEventBridgeRuleTemplateGroupResult updateEventBridgeRuleTemplateGroup(
            UpdateEventBridgeRuleTemplateGroupRequest updateEventBridgeRuleTemplateGroupRequest);

    /**
     * Updates an input.
     * 
     * @param updateInputRequest
     *        A request to update an input.
     * @return Result of the UpdateInput operation returned by the service.
     * @throws BadRequestException
     *         This request to update the input was invalid.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         The requester does not have permission to update an input.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The input was not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws ConflictException
     *         The input was unable to be updated at this time due to an issue with input resources.
     * @sample AWSMediaLive.UpdateInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateInput" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateInputResult updateInput(UpdateInputRequest updateInputRequest);

    /**
     * Updates the parameters for the input device.
     * 
     * @param updateInputDeviceRequest
     *        A request to update an input device.
     * @return Result of the UpdateInputDevice operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         Input device failed validation and could not be created.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to update the input device.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws NotFoundException
     *         The input device you're requesting to does not exist. Check the ID.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded on update calls to the input device service.
     * @sample AWSMediaLive.UpdateInputDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateInputDevice" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateInputDeviceResult updateInputDevice(UpdateInputDeviceRequest updateInputDeviceRequest);

    /**
     * Update an Input Security Group's Whilelists.
     * 
     * @param updateInputSecurityGroupRequest
     *        The request to update some combination of the Input Security Group name and the IPv4 CIDRs the Input
     *        Security Group should allow.
     * @return Result of the UpdateInputSecurityGroup operation returned by the service.
     * @throws BadRequestException
     *         The request to update the Input Security Group was invalid
     * @throws InternalServerErrorException
     *         Internal Server Error
     * @throws ForbiddenException
     *         The requester does not have permission to update an Input Security Group
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The Input Security Group was not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws ConflictException
     *         The Input Security Group was unable to be updated due to an issue with input security group resources.
     * @sample AWSMediaLive.UpdateInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateInputSecurityGroupResult updateInputSecurityGroup(UpdateInputSecurityGroupRequest updateInputSecurityGroupRequest);

    /**
     * Updates a multiplex.
     * 
     * @param updateMultiplexRequest
     *        A request to update a multiplex.
     * @return Result of the UpdateMultiplex operation returned by the service.
     * @throws BadRequestException
     *         MediaLive can't process your request because of a problem in the request. Please check your request form
     *         and syntax.
     * @throws UnprocessableEntityException
     *         The multiplex configuration failed validation and could not be updated.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         You don't have permission to update the multiplex.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The multiplex that you are trying to update doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws ConflictException
     *         The multiplex is unable to update due to an issue with multiplex resources.
     * @sample AWSMediaLive.UpdateMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateMultiplex" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateMultiplexResult updateMultiplex(UpdateMultiplexRequest updateMultiplexRequest);

    /**
     * Update a program in a multiplex.
     * 
     * @param updateMultiplexProgramRequest
     *        A request to update a program in a multiplex.
     * @return Result of the UpdateMultiplexProgram operation returned by the service.
     * @throws BadRequestException
     *         MediaLive can't process your request because of a problem in the request. Please check your request form
     *         and syntax.
     * @throws UnprocessableEntityException
     *         The multiplex program failed validation and could not be updated.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         You don't have permission to update the multiplex program.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         MediaLive can't update the program. The multiplex or the program that you specified doesn’t exist. Check
     *         the IDs and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws ConflictException
     *         The multiplex program is unable to update due to an issue with multiplex resources.
     * @sample AWSMediaLive.UpdateMultiplexProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateMultiplexProgram"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateMultiplexProgramResult updateMultiplexProgram(UpdateMultiplexProgramRequest updateMultiplexProgramRequest);

    /**
     * Update reservation.
     * 
     * @param updateReservationRequest
     *        Request to update a reservation
     * @return Result of the UpdateReservation operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to update reservation
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws NotFoundException
     *         Reservation not found
     * @throws GatewayTimeoutException
     *         Gateway Timeout
     * @throws TooManyRequestsException
     *         Request limit exceeded
     * @throws ConflictException
     *         The reservation could not be updated
     * @sample AWSMediaLive.UpdateReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateReservation" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateReservationResult updateReservation(UpdateReservationRequest updateReservationRequest);

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

    AWSMediaLiveWaiters waiters();

}
