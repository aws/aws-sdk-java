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
package com.amazonaws.services.backupgateway;

import javax.annotation.Generated;

import com.amazonaws.services.backupgateway.model.*;

/**
 * Interface for accessing AWS Backup Gateway asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.backupgateway.AbstractAWSBackupGatewayAsync} instead.
 * </p>
 * <p>
 * <p>
 * <fullname>Backup gateway</fullname>
 * <p>
 * Backup gateway connects Backup to your hypervisor, so you can create, store, and restore backups of your virtual
 * machines (VMs) anywhere, whether on-premises or in the VMware Cloud (VMC) on Amazon Web Services.
 * </p>
 * <p>
 * Add on-premises resources by connecting to a hypervisor through a gateway. Backup will automatically discover the
 * resources in your hypervisor.
 * </p>
 * <p>
 * Use Backup to assign virtual or on-premises resources to a backup plan, or run on-demand backups. Once you have
 * backed up your resources, you can view them and restore them like any resource supported by Backup.
 * </p>
 * <p>
 * To download the Amazon Web Services software to get started, navigate to the Backup console, choose <b>Gateways</b>,
 * then choose <b>Create gateway</b>.
 * </p>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSBackupGatewayAsync extends AWSBackupGateway {

    /**
     * <p>
     * Associates a backup gateway with your server. After you complete the association process, you can back up and
     * restore your VMs through the gateway.
     * </p>
     * 
     * @param associateGatewayToServerRequest
     * @return A Java Future containing the result of the AssociateGatewayToServer operation returned by the service.
     * @sample AWSBackupGatewayAsync.AssociateGatewayToServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/AssociateGatewayToServer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateGatewayToServerResult> associateGatewayToServerAsync(AssociateGatewayToServerRequest associateGatewayToServerRequest);

    /**
     * <p>
     * Associates a backup gateway with your server. After you complete the association process, you can back up and
     * restore your VMs through the gateway.
     * </p>
     * 
     * @param associateGatewayToServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateGatewayToServer operation returned by the service.
     * @sample AWSBackupGatewayAsyncHandler.AssociateGatewayToServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/AssociateGatewayToServer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateGatewayToServerResult> associateGatewayToServerAsync(AssociateGatewayToServerRequest associateGatewayToServerRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateGatewayToServerRequest, AssociateGatewayToServerResult> asyncHandler);

    /**
     * <p>
     * Creates a backup gateway. After you create a gateway, you can associate it with a server using the
     * <code>AssociateGatewayToServer</code> operation.
     * </p>
     * 
     * @param createGatewayRequest
     * @return A Java Future containing the result of the CreateGateway operation returned by the service.
     * @sample AWSBackupGatewayAsync.CreateGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/CreateGateway" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateGatewayResult> createGatewayAsync(CreateGatewayRequest createGatewayRequest);

    /**
     * <p>
     * Creates a backup gateway. After you create a gateway, you can associate it with a server using the
     * <code>AssociateGatewayToServer</code> operation.
     * </p>
     * 
     * @param createGatewayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGateway operation returned by the service.
     * @sample AWSBackupGatewayAsyncHandler.CreateGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/CreateGateway" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateGatewayResult> createGatewayAsync(CreateGatewayRequest createGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGatewayRequest, CreateGatewayResult> asyncHandler);

    /**
     * <p>
     * Deletes a backup gateway.
     * </p>
     * 
     * @param deleteGatewayRequest
     * @return A Java Future containing the result of the DeleteGateway operation returned by the service.
     * @sample AWSBackupGatewayAsync.DeleteGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/DeleteGateway" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGatewayResult> deleteGatewayAsync(DeleteGatewayRequest deleteGatewayRequest);

    /**
     * <p>
     * Deletes a backup gateway.
     * </p>
     * 
     * @param deleteGatewayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGateway operation returned by the service.
     * @sample AWSBackupGatewayAsyncHandler.DeleteGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/DeleteGateway" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGatewayResult> deleteGatewayAsync(DeleteGatewayRequest deleteGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGatewayRequest, DeleteGatewayResult> asyncHandler);

    /**
     * <p>
     * Deletes a hypervisor.
     * </p>
     * 
     * @param deleteHypervisorRequest
     * @return A Java Future containing the result of the DeleteHypervisor operation returned by the service.
     * @sample AWSBackupGatewayAsync.DeleteHypervisor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/DeleteHypervisor"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteHypervisorResult> deleteHypervisorAsync(DeleteHypervisorRequest deleteHypervisorRequest);

    /**
     * <p>
     * Deletes a hypervisor.
     * </p>
     * 
     * @param deleteHypervisorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteHypervisor operation returned by the service.
     * @sample AWSBackupGatewayAsyncHandler.DeleteHypervisor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/DeleteHypervisor"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteHypervisorResult> deleteHypervisorAsync(DeleteHypervisorRequest deleteHypervisorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteHypervisorRequest, DeleteHypervisorResult> asyncHandler);

    /**
     * <p>
     * Disassociates a backup gateway from the specified server. After the disassociation process finishes, the gateway
     * can no longer access the virtual machines on the server.
     * </p>
     * 
     * @param disassociateGatewayFromServerRequest
     * @return A Java Future containing the result of the DisassociateGatewayFromServer operation returned by the
     *         service.
     * @sample AWSBackupGatewayAsync.DisassociateGatewayFromServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/DisassociateGatewayFromServer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateGatewayFromServerResult> disassociateGatewayFromServerAsync(
            DisassociateGatewayFromServerRequest disassociateGatewayFromServerRequest);

    /**
     * <p>
     * Disassociates a backup gateway from the specified server. After the disassociation process finishes, the gateway
     * can no longer access the virtual machines on the server.
     * </p>
     * 
     * @param disassociateGatewayFromServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateGatewayFromServer operation returned by the
     *         service.
     * @sample AWSBackupGatewayAsyncHandler.DisassociateGatewayFromServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/DisassociateGatewayFromServer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateGatewayFromServerResult> disassociateGatewayFromServerAsync(
            DisassociateGatewayFromServerRequest disassociateGatewayFromServerRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateGatewayFromServerRequest, DisassociateGatewayFromServerResult> asyncHandler);

    /**
     * <p>
     * Retrieves the bandwidth rate limit schedule for a specified gateway. By default, gateways do not have bandwidth
     * rate limit schedules, which means no bandwidth rate limiting is in effect. Use this to get a gateway's bandwidth
     * rate limit schedule.
     * </p>
     * 
     * @param getBandwidthRateLimitScheduleRequest
     * @return A Java Future containing the result of the GetBandwidthRateLimitSchedule operation returned by the
     *         service.
     * @sample AWSBackupGatewayAsync.GetBandwidthRateLimitSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/GetBandwidthRateLimitSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetBandwidthRateLimitScheduleResult> getBandwidthRateLimitScheduleAsync(
            GetBandwidthRateLimitScheduleRequest getBandwidthRateLimitScheduleRequest);

    /**
     * <p>
     * Retrieves the bandwidth rate limit schedule for a specified gateway. By default, gateways do not have bandwidth
     * rate limit schedules, which means no bandwidth rate limiting is in effect. Use this to get a gateway's bandwidth
     * rate limit schedule.
     * </p>
     * 
     * @param getBandwidthRateLimitScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBandwidthRateLimitSchedule operation returned by the
     *         service.
     * @sample AWSBackupGatewayAsyncHandler.GetBandwidthRateLimitSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/GetBandwidthRateLimitSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetBandwidthRateLimitScheduleResult> getBandwidthRateLimitScheduleAsync(
            GetBandwidthRateLimitScheduleRequest getBandwidthRateLimitScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<GetBandwidthRateLimitScheduleRequest, GetBandwidthRateLimitScheduleResult> asyncHandler);

    /**
     * <p>
     * By providing the ARN (Amazon Resource Name), this API returns the gateway.
     * </p>
     * 
     * @param getGatewayRequest
     * @return A Java Future containing the result of the GetGateway operation returned by the service.
     * @sample AWSBackupGatewayAsync.GetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/GetGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGatewayResult> getGatewayAsync(GetGatewayRequest getGatewayRequest);

    /**
     * <p>
     * By providing the ARN (Amazon Resource Name), this API returns the gateway.
     * </p>
     * 
     * @param getGatewayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGateway operation returned by the service.
     * @sample AWSBackupGatewayAsyncHandler.GetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/GetGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGatewayResult> getGatewayAsync(GetGatewayRequest getGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<GetGatewayRequest, GetGatewayResult> asyncHandler);

    /**
     * <p>
     * This action requests information about the specified hypervisor to which the gateway will connect. A hypervisor
     * is hardware, software, or firmware that creates and manages virtual machines, and allocates resources to them.
     * </p>
     * 
     * @param getHypervisorRequest
     * @return A Java Future containing the result of the GetHypervisor operation returned by the service.
     * @sample AWSBackupGatewayAsync.GetHypervisor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/GetHypervisor" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetHypervisorResult> getHypervisorAsync(GetHypervisorRequest getHypervisorRequest);

    /**
     * <p>
     * This action requests information about the specified hypervisor to which the gateway will connect. A hypervisor
     * is hardware, software, or firmware that creates and manages virtual machines, and allocates resources to them.
     * </p>
     * 
     * @param getHypervisorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetHypervisor operation returned by the service.
     * @sample AWSBackupGatewayAsyncHandler.GetHypervisor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/GetHypervisor" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetHypervisorResult> getHypervisorAsync(GetHypervisorRequest getHypervisorRequest,
            com.amazonaws.handlers.AsyncHandler<GetHypervisorRequest, GetHypervisorResult> asyncHandler);

    /**
     * <p>
     * This action retrieves the property mappings for the specified hypervisor. A hypervisor property mapping displays
     * the relationship of entity properties available from the on-premises hypervisor to the properties available in
     * Amazon Web Services.
     * </p>
     * 
     * @param getHypervisorPropertyMappingsRequest
     * @return A Java Future containing the result of the GetHypervisorPropertyMappings operation returned by the
     *         service.
     * @sample AWSBackupGatewayAsync.GetHypervisorPropertyMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/GetHypervisorPropertyMappings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetHypervisorPropertyMappingsResult> getHypervisorPropertyMappingsAsync(
            GetHypervisorPropertyMappingsRequest getHypervisorPropertyMappingsRequest);

    /**
     * <p>
     * This action retrieves the property mappings for the specified hypervisor. A hypervisor property mapping displays
     * the relationship of entity properties available from the on-premises hypervisor to the properties available in
     * Amazon Web Services.
     * </p>
     * 
     * @param getHypervisorPropertyMappingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetHypervisorPropertyMappings operation returned by the
     *         service.
     * @sample AWSBackupGatewayAsyncHandler.GetHypervisorPropertyMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/GetHypervisorPropertyMappings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetHypervisorPropertyMappingsResult> getHypervisorPropertyMappingsAsync(
            GetHypervisorPropertyMappingsRequest getHypervisorPropertyMappingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetHypervisorPropertyMappingsRequest, GetHypervisorPropertyMappingsResult> asyncHandler);

    /**
     * <p>
     * By providing the ARN (Amazon Resource Name), this API returns the virtual machine.
     * </p>
     * 
     * @param getVirtualMachineRequest
     * @return A Java Future containing the result of the GetVirtualMachine operation returned by the service.
     * @sample AWSBackupGatewayAsync.GetVirtualMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/GetVirtualMachine"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVirtualMachineResult> getVirtualMachineAsync(GetVirtualMachineRequest getVirtualMachineRequest);

    /**
     * <p>
     * By providing the ARN (Amazon Resource Name), this API returns the virtual machine.
     * </p>
     * 
     * @param getVirtualMachineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVirtualMachine operation returned by the service.
     * @sample AWSBackupGatewayAsyncHandler.GetVirtualMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/GetVirtualMachine"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVirtualMachineResult> getVirtualMachineAsync(GetVirtualMachineRequest getVirtualMachineRequest,
            com.amazonaws.handlers.AsyncHandler<GetVirtualMachineRequest, GetVirtualMachineResult> asyncHandler);

    /**
     * <p>
     * Connect to a hypervisor by importing its configuration.
     * </p>
     * 
     * @param importHypervisorConfigurationRequest
     * @return A Java Future containing the result of the ImportHypervisorConfiguration operation returned by the
     *         service.
     * @sample AWSBackupGatewayAsync.ImportHypervisorConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/ImportHypervisorConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ImportHypervisorConfigurationResult> importHypervisorConfigurationAsync(
            ImportHypervisorConfigurationRequest importHypervisorConfigurationRequest);

    /**
     * <p>
     * Connect to a hypervisor by importing its configuration.
     * </p>
     * 
     * @param importHypervisorConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportHypervisorConfiguration operation returned by the
     *         service.
     * @sample AWSBackupGatewayAsyncHandler.ImportHypervisorConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/ImportHypervisorConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ImportHypervisorConfigurationResult> importHypervisorConfigurationAsync(
            ImportHypervisorConfigurationRequest importHypervisorConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<ImportHypervisorConfigurationRequest, ImportHypervisorConfigurationResult> asyncHandler);

    /**
     * <p>
     * Lists backup gateways owned by an Amazon Web Services account in an Amazon Web Services Region. The returned list
     * is ordered by gateway Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listGatewaysRequest
     * @return A Java Future containing the result of the ListGateways operation returned by the service.
     * @sample AWSBackupGatewayAsync.ListGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/ListGateways" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(ListGatewaysRequest listGatewaysRequest);

    /**
     * <p>
     * Lists backup gateways owned by an Amazon Web Services account in an Amazon Web Services Region. The returned list
     * is ordered by gateway Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listGatewaysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGateways operation returned by the service.
     * @sample AWSBackupGatewayAsyncHandler.ListGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/ListGateways" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(ListGatewaysRequest listGatewaysRequest,
            com.amazonaws.handlers.AsyncHandler<ListGatewaysRequest, ListGatewaysResult> asyncHandler);

    /**
     * <p>
     * Lists your hypervisors.
     * </p>
     * 
     * @param listHypervisorsRequest
     * @return A Java Future containing the result of the ListHypervisors operation returned by the service.
     * @sample AWSBackupGatewayAsync.ListHypervisors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/ListHypervisors" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListHypervisorsResult> listHypervisorsAsync(ListHypervisorsRequest listHypervisorsRequest);

    /**
     * <p>
     * Lists your hypervisors.
     * </p>
     * 
     * @param listHypervisorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListHypervisors operation returned by the service.
     * @sample AWSBackupGatewayAsyncHandler.ListHypervisors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/ListHypervisors" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListHypervisorsResult> listHypervisorsAsync(ListHypervisorsRequest listHypervisorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListHypervisorsRequest, ListHypervisorsResult> asyncHandler);

    /**
     * <p>
     * Lists the tags applied to the resource identified by its Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSBackupGatewayAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags applied to the resource identified by its Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSBackupGatewayAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists your virtual machines.
     * </p>
     * 
     * @param listVirtualMachinesRequest
     * @return A Java Future containing the result of the ListVirtualMachines operation returned by the service.
     * @sample AWSBackupGatewayAsync.ListVirtualMachines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/ListVirtualMachines"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVirtualMachinesResult> listVirtualMachinesAsync(ListVirtualMachinesRequest listVirtualMachinesRequest);

    /**
     * <p>
     * Lists your virtual machines.
     * </p>
     * 
     * @param listVirtualMachinesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVirtualMachines operation returned by the service.
     * @sample AWSBackupGatewayAsyncHandler.ListVirtualMachines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/ListVirtualMachines"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVirtualMachinesResult> listVirtualMachinesAsync(ListVirtualMachinesRequest listVirtualMachinesRequest,
            com.amazonaws.handlers.AsyncHandler<ListVirtualMachinesRequest, ListVirtualMachinesResult> asyncHandler);

    /**
     * <p>
     * This action sets the bandwidth rate limit schedule for a specified gateway. By default, gateways do not have a
     * bandwidth rate limit schedule, which means no bandwidth rate limiting is in effect. Use this to initiate a
     * gateway's bandwidth rate limit schedule.
     * </p>
     * 
     * @param putBandwidthRateLimitScheduleRequest
     * @return A Java Future containing the result of the PutBandwidthRateLimitSchedule operation returned by the
     *         service.
     * @sample AWSBackupGatewayAsync.PutBandwidthRateLimitSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/PutBandwidthRateLimitSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutBandwidthRateLimitScheduleResult> putBandwidthRateLimitScheduleAsync(
            PutBandwidthRateLimitScheduleRequest putBandwidthRateLimitScheduleRequest);

    /**
     * <p>
     * This action sets the bandwidth rate limit schedule for a specified gateway. By default, gateways do not have a
     * bandwidth rate limit schedule, which means no bandwidth rate limiting is in effect. Use this to initiate a
     * gateway's bandwidth rate limit schedule.
     * </p>
     * 
     * @param putBandwidthRateLimitScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutBandwidthRateLimitSchedule operation returned by the
     *         service.
     * @sample AWSBackupGatewayAsyncHandler.PutBandwidthRateLimitSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/PutBandwidthRateLimitSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutBandwidthRateLimitScheduleResult> putBandwidthRateLimitScheduleAsync(
            PutBandwidthRateLimitScheduleRequest putBandwidthRateLimitScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<PutBandwidthRateLimitScheduleRequest, PutBandwidthRateLimitScheduleResult> asyncHandler);

    /**
     * <p>
     * This action sets the property mappings for the specified hypervisor. A hypervisor property mapping displays the
     * relationship of entity properties available from the on-premises hypervisor to the properties available in Amazon
     * Web Services.
     * </p>
     * 
     * @param putHypervisorPropertyMappingsRequest
     * @return A Java Future containing the result of the PutHypervisorPropertyMappings operation returned by the
     *         service.
     * @sample AWSBackupGatewayAsync.PutHypervisorPropertyMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/PutHypervisorPropertyMappings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutHypervisorPropertyMappingsResult> putHypervisorPropertyMappingsAsync(
            PutHypervisorPropertyMappingsRequest putHypervisorPropertyMappingsRequest);

    /**
     * <p>
     * This action sets the property mappings for the specified hypervisor. A hypervisor property mapping displays the
     * relationship of entity properties available from the on-premises hypervisor to the properties available in Amazon
     * Web Services.
     * </p>
     * 
     * @param putHypervisorPropertyMappingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutHypervisorPropertyMappings operation returned by the
     *         service.
     * @sample AWSBackupGatewayAsyncHandler.PutHypervisorPropertyMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/PutHypervisorPropertyMappings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutHypervisorPropertyMappingsResult> putHypervisorPropertyMappingsAsync(
            PutHypervisorPropertyMappingsRequest putHypervisorPropertyMappingsRequest,
            com.amazonaws.handlers.AsyncHandler<PutHypervisorPropertyMappingsRequest, PutHypervisorPropertyMappingsResult> asyncHandler);

    /**
     * <p>
     * Set the maintenance start time for a gateway.
     * </p>
     * 
     * @param putMaintenanceStartTimeRequest
     * @return A Java Future containing the result of the PutMaintenanceStartTime operation returned by the service.
     * @sample AWSBackupGatewayAsync.PutMaintenanceStartTime
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/PutMaintenanceStartTime"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutMaintenanceStartTimeResult> putMaintenanceStartTimeAsync(PutMaintenanceStartTimeRequest putMaintenanceStartTimeRequest);

    /**
     * <p>
     * Set the maintenance start time for a gateway.
     * </p>
     * 
     * @param putMaintenanceStartTimeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutMaintenanceStartTime operation returned by the service.
     * @sample AWSBackupGatewayAsyncHandler.PutMaintenanceStartTime
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/PutMaintenanceStartTime"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutMaintenanceStartTimeResult> putMaintenanceStartTimeAsync(PutMaintenanceStartTimeRequest putMaintenanceStartTimeRequest,
            com.amazonaws.handlers.AsyncHandler<PutMaintenanceStartTimeRequest, PutMaintenanceStartTimeResult> asyncHandler);

    /**
     * <p>
     * This action sends a request to sync metadata across the specified virtual machines.
     * </p>
     * 
     * @param startVirtualMachinesMetadataSyncRequest
     * @return A Java Future containing the result of the StartVirtualMachinesMetadataSync operation returned by the
     *         service.
     * @sample AWSBackupGatewayAsync.StartVirtualMachinesMetadataSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/StartVirtualMachinesMetadataSync"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartVirtualMachinesMetadataSyncResult> startVirtualMachinesMetadataSyncAsync(
            StartVirtualMachinesMetadataSyncRequest startVirtualMachinesMetadataSyncRequest);

    /**
     * <p>
     * This action sends a request to sync metadata across the specified virtual machines.
     * </p>
     * 
     * @param startVirtualMachinesMetadataSyncRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartVirtualMachinesMetadataSync operation returned by the
     *         service.
     * @sample AWSBackupGatewayAsyncHandler.StartVirtualMachinesMetadataSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/StartVirtualMachinesMetadataSync"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartVirtualMachinesMetadataSyncResult> startVirtualMachinesMetadataSyncAsync(
            StartVirtualMachinesMetadataSyncRequest startVirtualMachinesMetadataSyncRequest,
            com.amazonaws.handlers.AsyncHandler<StartVirtualMachinesMetadataSyncRequest, StartVirtualMachinesMetadataSyncResult> asyncHandler);

    /**
     * <p>
     * Tag the resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSBackupGatewayAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tag the resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSBackupGatewayAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Tests your hypervisor configuration to validate that backup gateway can connect with the hypervisor and its
     * resources.
     * </p>
     * 
     * @param testHypervisorConfigurationRequest
     * @return A Java Future containing the result of the TestHypervisorConfiguration operation returned by the service.
     * @sample AWSBackupGatewayAsync.TestHypervisorConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/TestHypervisorConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TestHypervisorConfigurationResult> testHypervisorConfigurationAsync(
            TestHypervisorConfigurationRequest testHypervisorConfigurationRequest);

    /**
     * <p>
     * Tests your hypervisor configuration to validate that backup gateway can connect with the hypervisor and its
     * resources.
     * </p>
     * 
     * @param testHypervisorConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestHypervisorConfiguration operation returned by the service.
     * @sample AWSBackupGatewayAsyncHandler.TestHypervisorConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/TestHypervisorConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TestHypervisorConfigurationResult> testHypervisorConfigurationAsync(
            TestHypervisorConfigurationRequest testHypervisorConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<TestHypervisorConfigurationRequest, TestHypervisorConfigurationResult> asyncHandler);

    /**
     * <p>
     * Removes tags from the resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSBackupGatewayAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from the resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSBackupGatewayAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a gateway's name. Specify which gateway to update using the Amazon Resource Name (ARN) of the gateway in
     * your request.
     * </p>
     * 
     * @param updateGatewayInformationRequest
     * @return A Java Future containing the result of the UpdateGatewayInformation operation returned by the service.
     * @sample AWSBackupGatewayAsync.UpdateGatewayInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/UpdateGatewayInformation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGatewayInformationResult> updateGatewayInformationAsync(UpdateGatewayInformationRequest updateGatewayInformationRequest);

    /**
     * <p>
     * Updates a gateway's name. Specify which gateway to update using the Amazon Resource Name (ARN) of the gateway in
     * your request.
     * </p>
     * 
     * @param updateGatewayInformationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGatewayInformation operation returned by the service.
     * @sample AWSBackupGatewayAsyncHandler.UpdateGatewayInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/UpdateGatewayInformation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGatewayInformationResult> updateGatewayInformationAsync(UpdateGatewayInformationRequest updateGatewayInformationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGatewayInformationRequest, UpdateGatewayInformationResult> asyncHandler);

    /**
     * <p>
     * Updates the gateway virtual machine (VM) software. The request immediately triggers the software update.
     * </p>
     * <note>
     * <p>
     * When you make this request, you get a <code>200 OK</code> success response immediately. However, it might take
     * some time for the update to complete.
     * </p>
     * </note>
     * 
     * @param updateGatewaySoftwareNowRequest
     * @return A Java Future containing the result of the UpdateGatewaySoftwareNow operation returned by the service.
     * @sample AWSBackupGatewayAsync.UpdateGatewaySoftwareNow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/UpdateGatewaySoftwareNow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGatewaySoftwareNowResult> updateGatewaySoftwareNowAsync(UpdateGatewaySoftwareNowRequest updateGatewaySoftwareNowRequest);

    /**
     * <p>
     * Updates the gateway virtual machine (VM) software. The request immediately triggers the software update.
     * </p>
     * <note>
     * <p>
     * When you make this request, you get a <code>200 OK</code> success response immediately. However, it might take
     * some time for the update to complete.
     * </p>
     * </note>
     * 
     * @param updateGatewaySoftwareNowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGatewaySoftwareNow operation returned by the service.
     * @sample AWSBackupGatewayAsyncHandler.UpdateGatewaySoftwareNow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/UpdateGatewaySoftwareNow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGatewaySoftwareNowResult> updateGatewaySoftwareNowAsync(UpdateGatewaySoftwareNowRequest updateGatewaySoftwareNowRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGatewaySoftwareNowRequest, UpdateGatewaySoftwareNowResult> asyncHandler);

    /**
     * <p>
     * Updates a hypervisor metadata, including its host, username, and password. Specify which hypervisor to update
     * using the Amazon Resource Name (ARN) of the hypervisor in your request.
     * </p>
     * 
     * @param updateHypervisorRequest
     * @return A Java Future containing the result of the UpdateHypervisor operation returned by the service.
     * @sample AWSBackupGatewayAsync.UpdateHypervisor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/UpdateHypervisor"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateHypervisorResult> updateHypervisorAsync(UpdateHypervisorRequest updateHypervisorRequest);

    /**
     * <p>
     * Updates a hypervisor metadata, including its host, username, and password. Specify which hypervisor to update
     * using the Amazon Resource Name (ARN) of the hypervisor in your request.
     * </p>
     * 
     * @param updateHypervisorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateHypervisor operation returned by the service.
     * @sample AWSBackupGatewayAsyncHandler.UpdateHypervisor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/UpdateHypervisor"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateHypervisorResult> updateHypervisorAsync(UpdateHypervisorRequest updateHypervisorRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateHypervisorRequest, UpdateHypervisorResult> asyncHandler);

}
